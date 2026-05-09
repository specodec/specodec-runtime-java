package emit_java;

import specodec.*;
import all_types_unions.*;

public class TestAllTypesUnions {
    static String vecDir;
    static String outDir;
    static int passed = 0;
    static int failed = 0;

    public static int[] run(String vd, String od) {
        vecDir = vd;
        outDir = od;
        passed = 0;
        failed = 0;
        testModelUnionFieldHolder();
        testModelOptUnionFieldHolder();
        testModelUnionArrayHolder();
        testModelUnionMixedHolder();
        testModelUnionScalarHolder();

        return new int[] { passed, failed };
    }

    static void testModelUnionFieldHolder() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "UnionFieldHolder.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.UnionFieldHolderCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.UnionFieldHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "UnionFieldHolder.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL UnionFieldHolder mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "UnionFieldHolder.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.UnionFieldHolderCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.UnionFieldHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "UnionFieldHolder.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL UnionFieldHolder json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "UnionFieldHolder.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.UnionFieldHolderCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.UnionFieldHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "UnionFieldHolder.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL UnionFieldHolder unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "UnionFieldHolder.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.UnionFieldHolderCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.UnionFieldHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "UnionFieldHolder.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL UnionFieldHolder gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptUnionFieldHolder() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptUnionFieldHolder.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.OptUnionFieldHolderCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.OptUnionFieldHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptUnionFieldHolder.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptUnionFieldHolder mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptUnionFieldHolder.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.OptUnionFieldHolderCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.OptUnionFieldHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptUnionFieldHolder.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptUnionFieldHolder json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptUnionFieldHolder.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.OptUnionFieldHolderCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.OptUnionFieldHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptUnionFieldHolder.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptUnionFieldHolder unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptUnionFieldHolder.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.OptUnionFieldHolderCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.OptUnionFieldHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptUnionFieldHolder.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptUnionFieldHolder gron: " + e.getMessage()); failed++; }
    }

    static void testModelUnionArrayHolder() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "UnionArrayHolder.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.UnionArrayHolderCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.UnionArrayHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "UnionArrayHolder.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL UnionArrayHolder mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "UnionArrayHolder.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.UnionArrayHolderCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.UnionArrayHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "UnionArrayHolder.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL UnionArrayHolder json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "UnionArrayHolder.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.UnionArrayHolderCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.UnionArrayHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "UnionArrayHolder.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL UnionArrayHolder unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "UnionArrayHolder.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.UnionArrayHolderCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.UnionArrayHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "UnionArrayHolder.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL UnionArrayHolder gron: " + e.getMessage()); failed++; }
    }

    static void testModelUnionMixedHolder() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "UnionMixedHolder.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.UnionMixedHolderCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.UnionMixedHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "UnionMixedHolder.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL UnionMixedHolder mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "UnionMixedHolder.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.UnionMixedHolderCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.UnionMixedHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "UnionMixedHolder.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL UnionMixedHolder json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "UnionMixedHolder.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.UnionMixedHolderCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.UnionMixedHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "UnionMixedHolder.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL UnionMixedHolder unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "UnionMixedHolder.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.UnionMixedHolderCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.UnionMixedHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "UnionMixedHolder.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL UnionMixedHolder gron: " + e.getMessage()); failed++; }
    }

    static void testModelUnionScalarHolder() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "UnionScalarHolder.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.UnionScalarHolderCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.UnionScalarHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "UnionScalarHolder.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL UnionScalarHolder mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "UnionScalarHolder.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.UnionScalarHolderCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.UnionScalarHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "UnionScalarHolder.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL UnionScalarHolder json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "UnionScalarHolder.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.UnionScalarHolderCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.UnionScalarHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "UnionScalarHolder.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL UnionScalarHolder unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "UnionScalarHolder.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.UnionScalarHolderCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.UnionScalarHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "UnionScalarHolder.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL UnionScalarHolder gron: " + e.getMessage()); failed++; }
    }

}
