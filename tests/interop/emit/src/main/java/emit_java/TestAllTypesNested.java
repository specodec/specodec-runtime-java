package emit_java;

import specodec.*;
import all_types_nested.*;

public class TestAllTypesNested {
    static String vecDir;
    static String outDir;
    static int passed = 0;
    static int failed = 0;

    public static int[] run(String vd, String od) {
        vecDir = vd;
        outDir = od;
        passed = 0;
        failed = 0;
        testModelNestedSimple();

        return new int[] { passed, failed };
    }

    static void testModelNestedSimple() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestedSimple.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesNestedTypes.NestedSimpleCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesNestedTypes.NestedSimpleCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestedSimple.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestedSimple mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestedSimple.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestedTypes.NestedSimpleCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestedTypes.NestedSimpleCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestedSimple.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestedSimple json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestedSimple.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestedTypes.NestedSimpleCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestedTypes.NestedSimpleCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestedSimple.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestedSimple unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestedSimple.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesNestedTypes.NestedSimpleCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesNestedTypes.NestedSimpleCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestedSimple.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestedSimple gron: " + e.getMessage()); failed++; }
    }

}
