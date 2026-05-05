import fs from "fs";
import path from "path";
import { fileURLToPath } from "url";

const __dir = path.dirname(fileURLToPath(import.meta.url));
const EMIT_GEN = path.join(__dir, 'emit_gen');
const VEC_DIR = process.env.VEC_DIR || path.join(__dir, ".tests-cache", "vectors");

const manifestPath = path.join(VEC_DIR, "manifest.json");
const manifest = JSON.parse(fs.readFileSync(manifestPath, "utf-8"));

const models = manifest.testModels || [];
const scalars = manifest.scalars || {};

function toPascalCase(name) {
  let result = name.replace(/\./g, '_').replace(/-/g, '_');
  return result.charAt(0).toUpperCase() + result.slice(1);
}

function toPascalCaseSnake(sn) {
  return sn.split('_').map(w => w.charAt(0).toUpperCase() + w.slice(1)).join('');
}

function getReadMethod(type) {
  const map = { "int32":"readInt32","int64":"readInt64","uint32":"readUint32","uint64":"readUint64","float32":"readFloat32","float64":"readFloat64","string":"readString","bytes":"readBytes","bool":"readBool" };
  return map[type] || "readInt32";
}

function getWriteMethod(type) {
  const map = { "int32":"writeInt32","int64":"writeInt64","uint32":"writeUint32","uint64":"writeUint64","float32":"writeFloat32","float64":"writeFloat64","string":"writeString","bytes":"writeBytes","bool":"writeBool" };
  return map[type] || "writeInt32";
}

function nsSnake(ns) {
  return ns.replace(/\./g, '_').replace(/([A-Z])/g, (m,c,off)=>(off>0?'_':'')+c.toLowerCase());
}

// Scan generated java files to build model → outerClass mapping and model → package mapping
const javaFiles = fs.readdirSync(EMIT_GEN).filter(f => f.endsWith('.java'));
const packages = javaFiles.map(f => {
  const content = fs.readFileSync(path.join(EMIT_GEN, f), 'utf-8');
  const m = content.match(/package ([\w.]+);/);
  return m ? m[1] : null;
}).filter(Boolean);

const modelClass = {};
const modelPackage = {};
for (const f of javaFiles) {
  const content = fs.readFileSync(path.join(EMIT_GEN, f), 'utf-8');
  const classMatch = content.match(/public class (\w+Types) \{/);
  if (!classMatch) continue;
  const outerClass = classMatch[1];
  const pkgMatch = content.match(/package ([\w.]+);/);
  const pkg = pkgMatch ? pkgMatch[1] : null;
  const codecRe = /public static final SpecCodec<(\w+)> (\w+Codec)/g;
  let m;
  while ((m = codecRe.exec(content)) !== null) {
    modelClass[m[1]] = outerClass;
    if (pkg) modelPackage[m[1]] = pkg;
  }
}

// --- Scalar test functions ---
let scalarFuncs = '';
let scalarCalls = '';

for (const [name, info] of Object.entries(scalars)) {
  const pascal = toPascalCase(name);
  scalarFuncs += `
    static void testScalar${pascal}() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/${name}.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.${getReadMethod(info.type)}();
            MsgPackWriter w = new MsgPackWriter();
            w.${getWriteMethod(info.type)}(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/${name}.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ${name} mp: " + e.getMessage()); failed++; }
    }
`;
  scalarCalls += `        testScalar${pascal}();\n`;
}

// --- Group models by namespace ---
const modelNamespaces = manifest.modelNamespaces || {};
const nsGroups = {};
for (const model of models) {
  const ns = modelNamespaces[model] || "AllTypes";
  if (!nsGroups[ns]) nsGroups[ns] = [];
  nsGroups[ns].push(model);
}

// --- Generate test file per namespace ---
const baseOutDir = path.join(__dir, "emit", "src", "main", "java");
fs.mkdirSync(baseOutDir, { recursive: true });

const nsOrder = Object.keys(nsGroups);

for (const [ns, nsModels] of Object.entries(nsGroups)) {
  const sn = nsSnake(ns);
  const className = toPascalCaseSnake(sn);
  const testClassName = "Test" + className;

  // Collect the packages needed for this namespace's models
  const nsPackages = new Set();
  for (const model of nsModels) {
    const pkg = modelPackage[model];
    if (pkg) nsPackages.add(pkg);
  }
  const importStmts = ['specodec', ...nsPackages].map(p => `import ${p}.*;`).join('\n');

  let modelFuncs = '';
  let modelCalls = '';

  for (const model of nsModels) {
    const outerClass = modelClass[model] || 'AllTypesTypes';
    modelFuncs += `
    static void testModel${model}() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "${model}.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = ${outerClass}.${model}Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            ${outerClass}.${model}Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "${model}.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ${model} mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "${model}.json"));
            JsonReader r = new JsonReader(data);
            var obj = ${outerClass}.${model}Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            ${outerClass}.${model}Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "${model}.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ${model} json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "${model}.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = ${outerClass}.${model}Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            ${outerClass}.${model}Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "${model}.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ${model} unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "${model}.gron"));
            GronReader r = new GronReader(data);
            var obj = ${outerClass}.${model}Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            ${outerClass}.${model}Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "${model}.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ${model} gron: " + e.getMessage()); failed++; }
    }
`;
    modelCalls += `        testModel${model}();\n`;
  }

  const testCode = `package emit_java;

${importStmts}

public class ${testClassName} {
    static String vecDir;
    static String outDir;
    static int passed = 0;
    static int failed = 0;

    public static int[] run(String vd, String od) {
        vecDir = vd;
        outDir = od;
        passed = 0;
        failed = 0;
${modelCalls}
        return new int[] { passed, failed };
    }
${modelFuncs}
}
`;
  fs.writeFileSync(path.join(baseOutDir, `${testClassName}.java`), testCode);
  console.log(`  ${testClassName}.java: ${nsModels.length} models`);
}

// --- Generate main Main.java ---
const allImports = [...new Set(['specodec', ...packages])].map(pkg => `import ${pkg}.*;`).join('\n');

let mainCalls = '';
for (const ns of nsOrder) {
  const sn = nsSnake(ns);
  const className = toPascalCaseSnake(sn);
  mainCalls += `        int[] r_${sn} = Test${className}.run(vecDir, outDir); passed += r_${sn}[0]; failed += r_${sn}[1];\n`;
}

const mainCode = `package emit_java;

${allImports}

public class Main {
    static String vecDir = System.getenv("VEC_DIR");
    static String outDir = System.getenv("OUT_DIR");
    static int passed = 0;
    static int failed = 0;
${scalarFuncs}

    public static void main(String[] args) {
${scalarCalls}
${mainCalls}
        System.out.println("emit-java: " + passed + " passed, " + failed + " failed");
        if (failed > 0) System.exit(1);
    }
}
`;

fs.writeFileSync(path.join(baseOutDir, "Main.java"), mainCode);
console.log(`Generated emit/src/main/java/Main.java + ${nsOrder.length} namespace test files (${models.length} models + ${Object.keys(scalars).length} scalars)`);
