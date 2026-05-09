package emit_java;

import specodec.*;
import all_types_wide.*;

public class TestAllTypesWide {
    static String vecDir;
    static String outDir;
    static int passed = 0;
    static int failed = 0;

    public static int[] run(String vd, String od) {
        vecDir = vd;
        outDir = od;
        passed = 0;
        failed = 0;
        testModelWide20();
        testModelWide25();
        testModelWide30();
        testModelWide35();
        testModelWide40();

        return new int[] { passed, failed };
    }

    static void testModelWide20() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide20.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesWideTypes.Wide20Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesWideTypes.Wide20Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide20.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide20 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide20.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesWideTypes.Wide20Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesWideTypes.Wide20Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide20.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide20 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide20.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesWideTypes.Wide20Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesWideTypes.Wide20Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide20.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide20 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide20.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesWideTypes.Wide20Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesWideTypes.Wide20Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide20.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide20 gron: " + e.getMessage()); failed++; }
    }

    static void testModelWide25() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide25.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesWideTypes.Wide25Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesWideTypes.Wide25Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide25.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide25 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide25.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesWideTypes.Wide25Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesWideTypes.Wide25Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide25.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide25 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide25.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesWideTypes.Wide25Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesWideTypes.Wide25Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide25.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide25 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide25.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesWideTypes.Wide25Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesWideTypes.Wide25Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide25.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide25 gron: " + e.getMessage()); failed++; }
    }

    static void testModelWide30() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide30.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesWideTypes.Wide30Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesWideTypes.Wide30Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide30.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide30 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide30.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesWideTypes.Wide30Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesWideTypes.Wide30Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide30.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide30 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide30.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesWideTypes.Wide30Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesWideTypes.Wide30Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide30.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide30 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide30.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesWideTypes.Wide30Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesWideTypes.Wide30Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide30.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide30 gron: " + e.getMessage()); failed++; }
    }

    static void testModelWide35() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide35.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesWideTypes.Wide35Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesWideTypes.Wide35Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide35.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide35 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide35.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesWideTypes.Wide35Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesWideTypes.Wide35Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide35.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide35 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide35.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesWideTypes.Wide35Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesWideTypes.Wide35Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide35.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide35 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide35.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesWideTypes.Wide35Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesWideTypes.Wide35Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide35.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide35 gron: " + e.getMessage()); failed++; }
    }

    static void testModelWide40() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide40.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesWideTypes.Wide40Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesWideTypes.Wide40Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide40.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide40 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide40.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesWideTypes.Wide40Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesWideTypes.Wide40Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide40.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide40 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide40.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesWideTypes.Wide40Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesWideTypes.Wide40Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide40.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide40 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide40.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesWideTypes.Wide40Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesWideTypes.Wide40Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide40.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide40 gron: " + e.getMessage()); failed++; }
    }

}
