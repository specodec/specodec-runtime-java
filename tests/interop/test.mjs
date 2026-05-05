import { execSync } from 'child_process';
import { readFileSync, existsSync, mkdirSync, rmSync, readdirSync, writeFileSync } from 'fs';
import { join, dirname } from 'path';
import { fileURLToPath } from 'url';

const __dir = dirname(fileURLToPath(import.meta.url));
const CACHE = join(__dir, '.tests-cache');
const EMIT_GEN = join(__dir, 'emit_gen');
const OUT_DIR = join(__dir, 'output');

function run(cmd) {
  console.log('  >', cmd);
  execSync(cmd, { stdio: 'inherit' });
}
function sh(cmd) {
  return execSync(cmd, { encoding: 'utf8' }).trim();
}

console.log('\n=== Step 1: Install dependencies ===');
run(`npm install`);

console.log('\n=== Step 2: Using cached .tests-cache ===');

console.log('\n=== Step 3: Generate vectors ===');
run(`cd ${CACHE} && npm install --silent && node gen_types.mjs`);
const VEC_DIR = join(CACHE, 'vectors');

console.log('\n=== Step 4: Generate emit code ===');
if (existsSync(EMIT_GEN)) rmSync(EMIT_GEN, { recursive: true });
mkdirSync(EMIT_GEN, { recursive: true });
run(`npx tsp compile ${CACHE}/alltypes.tsp --emit=@specodec/typespec-emitter-java --option @specodec/typespec-emitter-java.emitter-output-dir=${EMIT_GEN}`);

const javaFiles = readdirSync(EMIT_GEN, { recursive: true }).filter(f => f.endsWith('.java'));
console.log(`  Generated ${javaFiles.length} Java files`);

console.log('\n=== Step 5: Generate test runner ===');
const srcDir = join(__dir, 'emit', 'src', 'main', 'java');
if (!existsSync(srcDir)) mkdirSync(srcDir, { recursive: true });
run(`VEC_DIR=${VEC_DIR} node generate_emit_runner.mjs`);

console.log('\n=== Step 6: Build runtime jar ===');
const javaDir = join(__dir, '..', '..');
run(`cd ${javaDir} && gradle jar --no-daemon -q`);
const jar = `${javaDir}/build/libs/specodec-java-0.0.1.jar`;
const emitDir = join(__dir, 'emit');
mkdirSync(emitDir, { recursive: true });
execSync(`cp ${jar} ${emitDir}/runtime.jar`, { stdio: 'inherit' });

const alltypesDir = join(emitDir, 'src', 'main', 'java', 'all_types');
if (existsSync(alltypesDir)) rmSync(alltypesDir, { recursive: true });
execSync(`cp -r ${EMIT_GEN} ${alltypesDir}`, { stdio: 'inherit' });

writeFileSync(join(emitDir, 'build.gradle'), `plugins { id 'java'; id 'application' }
group = "io.specodec"; version = "0.0.1"
repositories { mavenCentral() }
dependencies { implementation(files("runtime.jar")) }
application { mainClass = "emit_java.Main" }
java { sourceCompatibility = JavaVersion.VERSION_21; targetCompatibility = JavaVersion.VERSION_21 }
`);
writeFileSync(join(emitDir, 'settings.gradle'), 'rootProject.name = "emit_java"');

console.log('\n=== Step 7: Run tests ===');
if (existsSync(OUT_DIR)) rmSync(OUT_DIR, { recursive: true });
mkdirSync(OUT_DIR, { recursive: true });
try { run(`cd ${emitDir} && VEC_DIR=${VEC_DIR} OUT_DIR=${OUT_DIR} gradle run --no-daemon -q`); } catch (e) { console.log("Java tests completed (some failures expected)"); }

console.log('\n=== Step 8: Compare output ===');
const manifest = JSON.parse(readFileSync(join(VEC_DIR, 'manifest.json'), 'utf-8'));
let match = 0, mismatch = 0;

for (const [name] of Object.entries(manifest.scalars || {})) {
  const expected = join(VEC_DIR, 'scalars', `${name}.mp`);
  const actual = join(OUT_DIR, 'scalars', `${name}.mp`);
  if (!existsSync(actual)) { mismatch++; console.log(`MISSING: ${name}.mp`); continue; }
  if (readFileSync(expected).equals(readFileSync(actual))) match++;
  else { mismatch++; console.log(`MISMATCH: ${name}.mp`); }
}
for (const model of manifest.testModels || []) {
  for (const [outExt, vecExt] of [['msgpack','msgpack'], ['json','json'], ['unformatted.json','json'], ['gron','gron']]) {
    const expected = join(VEC_DIR, `${model}.${vecExt}`);
    const actual = join(OUT_DIR, `${model}.${outExt}`);
    if (!existsSync(expected)) continue;
    if (!existsSync(actual)) { mismatch++; console.log(`MISSING: ${model}.${outExt}`); continue; }
    if (readFileSync(expected).equals(readFileSync(actual))) match++;
    else { mismatch++; console.log(`MISMATCH: ${model}.${outExt}`); }
  }
}
const total = match + mismatch;
console.log(`${match}/${total} match, ${mismatch} mismatch`);
if (mismatch > 0) process.exit(1);

console.log('\n=== ALL PASSED ===');
