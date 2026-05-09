package emit_java;

import specodec.*;
import all_types_nested_deep.*;

public class TestAllTypesNestedDeep {
    static String vecDir;
    static String outDir;
    static int passed = 0;
    static int failed = 0;

    public static int[] run(String vd, String od) {
        vecDir = vd;
        outDir = od;
        passed = 0;
        failed = 0;
        testModelDeepModel();

        return new int[] { passed, failed };
    }

    static void testModelDeepModel() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepModel.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesNestedDeepTypes.DeepModelCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesNestedDeepTypes.DeepModelCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepModel.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepModel mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepModel.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestedDeepTypes.DeepModelCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestedDeepTypes.DeepModelCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepModel.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepModel json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepModel.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestedDeepTypes.DeepModelCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestedDeepTypes.DeepModelCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepModel.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepModel unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepModel.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesNestedDeepTypes.DeepModelCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesNestedDeepTypes.DeepModelCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepModel.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepModel gron: " + e.getMessage()); failed++; }
    }

}
