package emit_java;

import specodec.*;
import all_types_many.*;

public class TestAllTypesMany {
    static String vecDir;
    static String outDir;
    static int passed = 0;
    static int failed = 0;

    public static int[] run(String vd, String od) {
        vecDir = vd;
        outDir = od;
        passed = 0;
        failed = 0;
        testModelFive01();
        testModelFive02();
        testModelFive03();
        testModelFive04();
        testModelFive05();
        testModelFive06();
        testModelFive07();
        testModelFive08();
        testModelFive09();
        testModelFive10();
        testModelTen01();
        testModelTen02();
        testModelTen03();
        testModelTen04();
        testModelTen05();

        return new int[] { passed, failed };
    }

    static void testModelFive01() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five01.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesManyTypes.Five01Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesManyTypes.Five01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five01.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five01 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five01.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Five01Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Five01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five01.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five01 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five01.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Five01Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Five01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five01.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five01 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five01.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesManyTypes.Five01Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesManyTypes.Five01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five01.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five01 gron: " + e.getMessage()); failed++; }
    }

    static void testModelFive02() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five02.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesManyTypes.Five02Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesManyTypes.Five02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five02.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five02 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five02.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Five02Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Five02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five02.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five02 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five02.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Five02Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Five02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five02.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five02 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five02.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesManyTypes.Five02Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesManyTypes.Five02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five02.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five02 gron: " + e.getMessage()); failed++; }
    }

    static void testModelFive03() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five03.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesManyTypes.Five03Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesManyTypes.Five03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five03.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five03 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five03.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Five03Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Five03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five03.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five03 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five03.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Five03Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Five03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five03.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five03 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five03.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesManyTypes.Five03Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesManyTypes.Five03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five03.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five03 gron: " + e.getMessage()); failed++; }
    }

    static void testModelFive04() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five04.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesManyTypes.Five04Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesManyTypes.Five04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five04.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five04 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five04.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Five04Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Five04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five04.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five04 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five04.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Five04Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Five04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five04.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five04 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five04.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesManyTypes.Five04Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesManyTypes.Five04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five04.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five04 gron: " + e.getMessage()); failed++; }
    }

    static void testModelFive05() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five05.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesManyTypes.Five05Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesManyTypes.Five05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five05.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five05 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five05.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Five05Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Five05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five05.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five05 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five05.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Five05Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Five05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five05.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five05 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five05.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesManyTypes.Five05Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesManyTypes.Five05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five05.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five05 gron: " + e.getMessage()); failed++; }
    }

    static void testModelFive06() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five06.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesManyTypes.Five06Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesManyTypes.Five06Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five06.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five06 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five06.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Five06Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Five06Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five06.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five06 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five06.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Five06Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Five06Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five06.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five06 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five06.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesManyTypes.Five06Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesManyTypes.Five06Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five06.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five06 gron: " + e.getMessage()); failed++; }
    }

    static void testModelFive07() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five07.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesManyTypes.Five07Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesManyTypes.Five07Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five07.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five07 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five07.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Five07Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Five07Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five07.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five07 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five07.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Five07Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Five07Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five07.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five07 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five07.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesManyTypes.Five07Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesManyTypes.Five07Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five07.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five07 gron: " + e.getMessage()); failed++; }
    }

    static void testModelFive08() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five08.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesManyTypes.Five08Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesManyTypes.Five08Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five08.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five08 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five08.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Five08Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Five08Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five08.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five08 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five08.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Five08Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Five08Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five08.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five08 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five08.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesManyTypes.Five08Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesManyTypes.Five08Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five08.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five08 gron: " + e.getMessage()); failed++; }
    }

    static void testModelFive09() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five09.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesManyTypes.Five09Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesManyTypes.Five09Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five09.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five09 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five09.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Five09Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Five09Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five09.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five09 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five09.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Five09Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Five09Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five09.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five09 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five09.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesManyTypes.Five09Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesManyTypes.Five09Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five09.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five09 gron: " + e.getMessage()); failed++; }
    }

    static void testModelFive10() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five10.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesManyTypes.Five10Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesManyTypes.Five10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five10.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five10 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five10.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Five10Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Five10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five10.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five10 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five10.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Five10Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Five10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five10.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five10 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five10.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesManyTypes.Five10Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesManyTypes.Five10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five10.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five10 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTen01() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten01.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesManyTypes.Ten01Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesManyTypes.Ten01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten01.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten01 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten01.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Ten01Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Ten01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten01.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten01 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten01.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Ten01Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Ten01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten01.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten01 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten01.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesManyTypes.Ten01Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesManyTypes.Ten01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten01.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten01 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTen02() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten02.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesManyTypes.Ten02Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesManyTypes.Ten02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten02.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten02 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten02.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Ten02Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Ten02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten02.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten02 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten02.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Ten02Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Ten02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten02.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten02 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten02.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesManyTypes.Ten02Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesManyTypes.Ten02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten02.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten02 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTen03() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten03.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesManyTypes.Ten03Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesManyTypes.Ten03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten03.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten03 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten03.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Ten03Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Ten03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten03.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten03 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten03.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Ten03Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Ten03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten03.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten03 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten03.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesManyTypes.Ten03Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesManyTypes.Ten03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten03.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten03 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTen04() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten04.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesManyTypes.Ten04Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesManyTypes.Ten04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten04.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten04 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten04.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Ten04Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Ten04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten04.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten04 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten04.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Ten04Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Ten04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten04.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten04 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten04.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesManyTypes.Ten04Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesManyTypes.Ten04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten04.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten04 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTen05() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten05.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesManyTypes.Ten05Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesManyTypes.Ten05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten05.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten05 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten05.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Ten05Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Ten05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten05.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten05 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten05.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesManyTypes.Ten05Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesManyTypes.Ten05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten05.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten05 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten05.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesManyTypes.Ten05Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesManyTypes.Ten05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten05.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten05 gron: " + e.getMessage()); failed++; }
    }

}
