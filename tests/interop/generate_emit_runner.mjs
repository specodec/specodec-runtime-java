import fs from "fs";
import path from "path";
import { fileURLToPath } from "url";

const __dir = path.dirname(fileURLToPath(import.meta.url));
const VEC_DIR = process.env.VEC_DIR || path.join(__dir, ".tests-cache", "vectors");

const manifestPath = path.join(VEC_DIR, "manifest.json");
const manifest = JSON.parse(fs.readFileSync(manifestPath, "utf-8"));

const models = manifest.testModels || [];
const scalars = manifest.scalars || {};

function toPascalCase(name) {
  let result = name.replace(/\./g, '_').replace(/-/g, '_');
  return result.charAt(0).toUpperCase() + result.slice(1);
}

function getReadMethod(type) {
  const map = { "int32":"readInt32","int64":"readInt64","uint32":"readUint32","uint64":"readUint64","float32":"readFloat32","float64":"readFloat64","string":"readString","bytes":"readBytes","bool":"readBool" };
  return map[type] || "readInt32";
}

function getWriteMethod(type) {
  const map = { "int32":"writeInt32","int64":"writeInt64","uint32":"writeUint32","uint64":"writeUint64","float32":"writeFloat32","float64":"writeFloat64","string":"writeString","bytes":"writeBytes","bool":"writeBool" };
  return map[type] || "writeInt32";
}

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

let modelFuncs = '';
let modelCalls = '';
for (const model of models) {
  modelFuncs += `
    static void testModel${model}() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "${model}.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.${model}Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.${model}Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "${model}.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ${model} mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "${model}.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.${model}Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.${model}Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "${model}.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ${model} json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "${model}.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.${model}Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.${model}Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "${model}.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ${model} unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "${model}.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.${model}Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.${model}Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "${model}.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ${model} gron: " + e.getMessage()); failed++; }
    }
`;
  modelCalls += `        testModel${model}();\n`;
}

const code = `package emit_java;

import specodec.*;
import alltypes.*;

public class Main {
    static String vecDir = System.getenv("VEC_DIR");
    static String outDir = System.getenv("OUT_DIR");
    static int passed = 0;
    static int failed = 0;
${scalarFuncs}
${modelFuncs}

    public static void main(String[] args) {
${scalarCalls}
${modelCalls}
        System.out.println("emit-java: " + passed + " passed, " + failed + " failed");
        if (failed > 0) System.exit(1);
    }
}
`;

const outDirPath = path.join(__dir, "emit", "src", "main", "java");
fs.mkdirSync(outDirPath, { recursive: true });
const outFile = path.join(outDirPath, "Main.java");
fs.writeFileSync(outFile, code);
console.log(`Generated emit/src/main/java/Main.java with ${models.length} models + ${Object.keys(scalars).length} scalars`);
