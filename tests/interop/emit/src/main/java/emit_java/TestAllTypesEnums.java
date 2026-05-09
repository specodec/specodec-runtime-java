package emit_java;

import specodec.*;
import all_types_enums.*;

public class TestAllTypesEnums {
    static String vecDir;
    static String outDir;
    static int passed = 0;
    static int failed = 0;

    public static int[] run(String vd, String od) {
        vecDir = vd;
        outDir = od;
        passed = 0;
        failed = 0;
        testModelEnumHolder();
        testModelOptEnumHolder();
        testModelEnumArrayHolder();
        testModelEnumMixedHolder();

        return new int[] { passed, failed };
    }

    static void testModelEnumHolder() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EnumHolder.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesEnumsTypes.EnumHolderCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesEnumsTypes.EnumHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EnumHolder.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EnumHolder mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EnumHolder.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEnumsTypes.EnumHolderCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEnumsTypes.EnumHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EnumHolder.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EnumHolder json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EnumHolder.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEnumsTypes.EnumHolderCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEnumsTypes.EnumHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EnumHolder.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EnumHolder unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EnumHolder.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesEnumsTypes.EnumHolderCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesEnumsTypes.EnumHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EnumHolder.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EnumHolder gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptEnumHolder() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptEnumHolder.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesEnumsTypes.OptEnumHolderCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesEnumsTypes.OptEnumHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptEnumHolder.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptEnumHolder mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptEnumHolder.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEnumsTypes.OptEnumHolderCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEnumsTypes.OptEnumHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptEnumHolder.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptEnumHolder json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptEnumHolder.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEnumsTypes.OptEnumHolderCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEnumsTypes.OptEnumHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptEnumHolder.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptEnumHolder unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptEnumHolder.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesEnumsTypes.OptEnumHolderCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesEnumsTypes.OptEnumHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptEnumHolder.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptEnumHolder gron: " + e.getMessage()); failed++; }
    }

    static void testModelEnumArrayHolder() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EnumArrayHolder.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesEnumsTypes.EnumArrayHolderCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesEnumsTypes.EnumArrayHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EnumArrayHolder.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EnumArrayHolder mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EnumArrayHolder.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEnumsTypes.EnumArrayHolderCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEnumsTypes.EnumArrayHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EnumArrayHolder.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EnumArrayHolder json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EnumArrayHolder.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEnumsTypes.EnumArrayHolderCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEnumsTypes.EnumArrayHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EnumArrayHolder.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EnumArrayHolder unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EnumArrayHolder.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesEnumsTypes.EnumArrayHolderCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesEnumsTypes.EnumArrayHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EnumArrayHolder.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EnumArrayHolder gron: " + e.getMessage()); failed++; }
    }

    static void testModelEnumMixedHolder() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EnumMixedHolder.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesEnumsTypes.EnumMixedHolderCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesEnumsTypes.EnumMixedHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EnumMixedHolder.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EnumMixedHolder mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EnumMixedHolder.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEnumsTypes.EnumMixedHolderCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEnumsTypes.EnumMixedHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EnumMixedHolder.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EnumMixedHolder json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EnumMixedHolder.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEnumsTypes.EnumMixedHolderCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEnumsTypes.EnumMixedHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EnumMixedHolder.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EnumMixedHolder unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EnumMixedHolder.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesEnumsTypes.EnumMixedHolderCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesEnumsTypes.EnumMixedHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EnumMixedHolder.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EnumMixedHolder gron: " + e.getMessage()); failed++; }
    }

}
