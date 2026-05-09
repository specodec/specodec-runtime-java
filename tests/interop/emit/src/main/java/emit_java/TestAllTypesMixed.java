package emit_java;

import specodec.*;
import all_types_mixed.*;

public class TestAllTypesMixed {
    static String vecDir;
    static String outDir;
    static int passed = 0;
    static int failed = 0;

    public static int[] run(String vd, String od) {
        vecDir = vd;
        outDir = od;
        passed = 0;
        failed = 0;
        testModelModelArr1();
        testModelModelArr2();
        testModelModelArr3();
        testModelModelArr4();
        testModelModelArr5();
        testModelMix01();
        testModelMix02();
        testModelMix03();
        testModelMix04();
        testModelMix05();
        testModelMix06();
        testModelMix07();
        testModelMix08();
        testModelMix09();
        testModelMix10();
        testModelMix11();
        testModelMix12();
        testModelMix13();
        testModelMix14();
        testModelMix15();
        testModelAllOpt1();
        testModelAllOpt2();
        testModelAllOpt3();
        testModelAllOpt4();
        testModelAllOpt5();

        return new int[] { passed, failed };
    }

    static void testModelModelArr1() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr1.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.ModelArr1Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.ModelArr1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr1.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr1 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr1.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.ModelArr1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.ModelArr1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr1.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr1 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr1.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.ModelArr1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.ModelArr1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr1.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr1 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr1.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.ModelArr1Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.ModelArr1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr1.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr1 gron: " + e.getMessage()); failed++; }
    }

    static void testModelModelArr2() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr2.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.ModelArr2Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.ModelArr2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr2.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr2 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr2.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.ModelArr2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.ModelArr2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr2.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr2 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr2.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.ModelArr2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.ModelArr2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr2.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr2 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr2.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.ModelArr2Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.ModelArr2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr2.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr2 gron: " + e.getMessage()); failed++; }
    }

    static void testModelModelArr3() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr3.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.ModelArr3Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.ModelArr3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr3.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr3 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr3.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.ModelArr3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.ModelArr3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr3.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr3 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr3.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.ModelArr3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.ModelArr3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr3.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr3 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr3.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.ModelArr3Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.ModelArr3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr3.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr3 gron: " + e.getMessage()); failed++; }
    }

    static void testModelModelArr4() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr4.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.ModelArr4Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.ModelArr4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr4.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr4 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr4.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.ModelArr4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.ModelArr4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr4.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr4 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr4.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.ModelArr4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.ModelArr4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr4.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr4 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr4.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.ModelArr4Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.ModelArr4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr4.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr4 gron: " + e.getMessage()); failed++; }
    }

    static void testModelModelArr5() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr5.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.ModelArr5Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.ModelArr5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr5.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr5 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr5.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.ModelArr5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.ModelArr5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr5.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr5 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr5.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.ModelArr5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.ModelArr5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr5.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr5 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr5.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.ModelArr5Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.ModelArr5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr5.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr5 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix01() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix01.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.Mix01Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.Mix01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix01.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix01 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix01.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix01Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix01.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix01 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix01.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix01Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix01.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix01 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix01.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.Mix01Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.Mix01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix01.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix01 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix02() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix02.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.Mix02Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.Mix02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix02.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix02 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix02.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix02Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix02.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix02 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix02.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix02Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix02.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix02 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix02.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.Mix02Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.Mix02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix02.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix02 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix03() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix03.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.Mix03Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.Mix03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix03.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix03 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix03.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix03Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix03.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix03 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix03.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix03Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix03.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix03 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix03.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.Mix03Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.Mix03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix03.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix03 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix04() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix04.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.Mix04Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.Mix04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix04.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix04 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix04.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix04Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix04.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix04 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix04.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix04Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix04.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix04 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix04.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.Mix04Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.Mix04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix04.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix04 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix05() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix05.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.Mix05Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.Mix05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix05.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix05 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix05.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix05Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix05.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix05 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix05.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix05Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix05.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix05 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix05.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.Mix05Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.Mix05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix05.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix05 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix06() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix06.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.Mix06Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.Mix06Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix06.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix06 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix06.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix06Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix06Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix06.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix06 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix06.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix06Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix06Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix06.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix06 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix06.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.Mix06Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.Mix06Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix06.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix06 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix07() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix07.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.Mix07Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.Mix07Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix07.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix07 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix07.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix07Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix07Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix07.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix07 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix07.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix07Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix07Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix07.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix07 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix07.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.Mix07Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.Mix07Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix07.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix07 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix08() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix08.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.Mix08Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.Mix08Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix08.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix08 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix08.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix08Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix08Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix08.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix08 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix08.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix08Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix08Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix08.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix08 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix08.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.Mix08Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.Mix08Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix08.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix08 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix09() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix09.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.Mix09Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.Mix09Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix09.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix09 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix09.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix09Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix09Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix09.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix09 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix09.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix09Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix09Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix09.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix09 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix09.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.Mix09Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.Mix09Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix09.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix09 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix10() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix10.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.Mix10Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.Mix10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix10.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix10 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix10.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix10Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix10.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix10 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix10.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix10Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix10.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix10 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix10.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.Mix10Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.Mix10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix10.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix10 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix11() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix11.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.Mix11Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.Mix11Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix11.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix11 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix11.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix11Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix11Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix11.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix11 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix11.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix11Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix11Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix11.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix11 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix11.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.Mix11Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.Mix11Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix11.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix11 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix12() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix12.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.Mix12Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.Mix12Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix12.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix12 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix12.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix12Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix12Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix12.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix12 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix12.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix12Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix12Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix12.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix12 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix12.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.Mix12Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.Mix12Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix12.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix12 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix13() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix13.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.Mix13Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.Mix13Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix13.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix13 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix13.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix13Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix13Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix13.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix13 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix13.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix13Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix13Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix13.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix13 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix13.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.Mix13Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.Mix13Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix13.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix13 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix14() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix14.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.Mix14Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.Mix14Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix14.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix14 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix14.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix14Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix14Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix14.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix14 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix14.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix14Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix14Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix14.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix14 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix14.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.Mix14Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.Mix14Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix14.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix14 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix15() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix15.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.Mix15Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.Mix15Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix15.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix15 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix15.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix15Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix15Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix15.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix15 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix15.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.Mix15Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.Mix15Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix15.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix15 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix15.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.Mix15Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.Mix15Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix15.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix15 gron: " + e.getMessage()); failed++; }
    }

    static void testModelAllOpt1() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt1.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.AllOpt1Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.AllOpt1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt1.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt1 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt1.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.AllOpt1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.AllOpt1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt1.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt1 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt1.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.AllOpt1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.AllOpt1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt1.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt1 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt1.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.AllOpt1Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.AllOpt1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt1.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt1 gron: " + e.getMessage()); failed++; }
    }

    static void testModelAllOpt2() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt2.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.AllOpt2Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.AllOpt2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt2.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt2 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt2.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.AllOpt2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.AllOpt2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt2.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt2 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt2.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.AllOpt2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.AllOpt2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt2.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt2 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt2.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.AllOpt2Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.AllOpt2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt2.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt2 gron: " + e.getMessage()); failed++; }
    }

    static void testModelAllOpt3() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt3.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.AllOpt3Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.AllOpt3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt3.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt3 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt3.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.AllOpt3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.AllOpt3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt3.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt3 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt3.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.AllOpt3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.AllOpt3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt3.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt3 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt3.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.AllOpt3Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.AllOpt3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt3.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt3 gron: " + e.getMessage()); failed++; }
    }

    static void testModelAllOpt4() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt4.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.AllOpt4Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.AllOpt4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt4.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt4 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt4.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.AllOpt4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.AllOpt4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt4.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt4 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt4.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.AllOpt4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.AllOpt4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt4.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt4 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt4.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.AllOpt4Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.AllOpt4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt4.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt4 gron: " + e.getMessage()); failed++; }
    }

    static void testModelAllOpt5() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt5.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesMixedTypes.AllOpt5Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesMixedTypes.AllOpt5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt5.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt5 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt5.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.AllOpt5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.AllOpt5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt5.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt5 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt5.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesMixedTypes.AllOpt5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesMixedTypes.AllOpt5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt5.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt5 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt5.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesMixedTypes.AllOpt5Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesMixedTypes.AllOpt5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt5.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt5 gron: " + e.getMessage()); failed++; }
    }

}
