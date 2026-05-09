package emit_java;

import specodec.*;
import all_types_extra.*;

public class TestAllTypesExtra {
    static String vecDir;
    static String outDir;
    static int passed = 0;
    static int failed = 0;

    public static int[] run(String vd, String od) {
        vecDir = vd;
        outDir = od;
        passed = 0;
        failed = 0;
        testModelOptArr1();
        testModelOptArr2();
        testModelOptArr3();
        testModelOptArr4();
        testModelOptArr5();
        testModelNestOpt1();
        testModelNestOpt2();
        testModelNestOpt3();
        testModelNestOpt4();
        testModelNestOpt5();
        testModelNestOptInner1();
        testModelNestOptInner2();
        testModelNestOptInner3();
        testModelDeepNest1();
        testModelDeepNest2();
        testModelDeepNest3();
        testModelDeepNest4();
        testModelDeepNest5();
        testModelDeepNest6();
        testModelDeepNest7();
        testModelTimestampEntry();
        testModelConfigEntry();

        return new int[] { passed, failed };
    }

    static void testModelOptArr1() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr1.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesExtraTypes.OptArr1Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesExtraTypes.OptArr1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr1.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr1 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr1.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.OptArr1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.OptArr1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr1.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr1 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr1.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.OptArr1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.OptArr1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr1.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr1 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr1.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesExtraTypes.OptArr1Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesExtraTypes.OptArr1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr1.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr1 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptArr2() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr2.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesExtraTypes.OptArr2Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesExtraTypes.OptArr2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr2.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr2 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr2.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.OptArr2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.OptArr2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr2.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr2 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr2.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.OptArr2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.OptArr2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr2.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr2 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr2.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesExtraTypes.OptArr2Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesExtraTypes.OptArr2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr2.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr2 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptArr3() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr3.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesExtraTypes.OptArr3Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesExtraTypes.OptArr3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr3.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr3 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr3.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.OptArr3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.OptArr3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr3.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr3 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr3.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.OptArr3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.OptArr3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr3.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr3 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr3.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesExtraTypes.OptArr3Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesExtraTypes.OptArr3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr3.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr3 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptArr4() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr4.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesExtraTypes.OptArr4Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesExtraTypes.OptArr4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr4.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr4 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr4.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.OptArr4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.OptArr4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr4.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr4 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr4.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.OptArr4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.OptArr4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr4.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr4 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr4.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesExtraTypes.OptArr4Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesExtraTypes.OptArr4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr4.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr4 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptArr5() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr5.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesExtraTypes.OptArr5Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesExtraTypes.OptArr5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr5.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr5 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr5.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.OptArr5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.OptArr5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr5.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr5 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr5.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.OptArr5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.OptArr5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr5.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr5 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr5.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesExtraTypes.OptArr5Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesExtraTypes.OptArr5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr5.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr5 gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestOpt1() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt1.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesExtraTypes.NestOpt1Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesExtraTypes.NestOpt1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt1.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt1 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt1.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.NestOpt1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.NestOpt1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt1.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt1 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt1.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.NestOpt1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.NestOpt1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt1.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt1 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt1.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesExtraTypes.NestOpt1Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesExtraTypes.NestOpt1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt1.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt1 gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestOpt2() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt2.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesExtraTypes.NestOpt2Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesExtraTypes.NestOpt2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt2.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt2 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt2.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.NestOpt2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.NestOpt2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt2.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt2 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt2.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.NestOpt2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.NestOpt2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt2.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt2 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt2.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesExtraTypes.NestOpt2Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesExtraTypes.NestOpt2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt2.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt2 gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestOpt3() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt3.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesExtraTypes.NestOpt3Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesExtraTypes.NestOpt3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt3.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt3 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt3.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.NestOpt3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.NestOpt3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt3.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt3 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt3.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.NestOpt3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.NestOpt3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt3.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt3 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt3.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesExtraTypes.NestOpt3Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesExtraTypes.NestOpt3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt3.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt3 gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestOpt4() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt4.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesExtraTypes.NestOpt4Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesExtraTypes.NestOpt4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt4.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt4 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt4.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.NestOpt4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.NestOpt4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt4.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt4 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt4.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.NestOpt4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.NestOpt4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt4.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt4 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt4.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesExtraTypes.NestOpt4Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesExtraTypes.NestOpt4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt4.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt4 gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestOpt5() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt5.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesExtraTypes.NestOpt5Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesExtraTypes.NestOpt5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt5.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt5 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt5.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.NestOpt5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.NestOpt5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt5.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt5 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt5.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.NestOpt5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.NestOpt5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt5.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt5 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt5.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesExtraTypes.NestOpt5Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesExtraTypes.NestOpt5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt5.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt5 gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestOptInner1() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOptInner1.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesExtraTypes.NestOptInner1Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesExtraTypes.NestOptInner1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOptInner1.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOptInner1 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOptInner1.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.NestOptInner1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.NestOptInner1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOptInner1.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOptInner1 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOptInner1.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.NestOptInner1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.NestOptInner1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOptInner1.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOptInner1 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOptInner1.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesExtraTypes.NestOptInner1Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesExtraTypes.NestOptInner1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOptInner1.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOptInner1 gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestOptInner2() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOptInner2.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesExtraTypes.NestOptInner2Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesExtraTypes.NestOptInner2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOptInner2.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOptInner2 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOptInner2.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.NestOptInner2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.NestOptInner2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOptInner2.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOptInner2 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOptInner2.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.NestOptInner2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.NestOptInner2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOptInner2.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOptInner2 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOptInner2.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesExtraTypes.NestOptInner2Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesExtraTypes.NestOptInner2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOptInner2.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOptInner2 gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestOptInner3() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOptInner3.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesExtraTypes.NestOptInner3Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesExtraTypes.NestOptInner3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOptInner3.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOptInner3 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOptInner3.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.NestOptInner3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.NestOptInner3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOptInner3.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOptInner3 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOptInner3.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.NestOptInner3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.NestOptInner3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOptInner3.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOptInner3 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOptInner3.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesExtraTypes.NestOptInner3Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesExtraTypes.NestOptInner3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOptInner3.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOptInner3 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDeepNest1() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest1.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesExtraTypes.DeepNest1Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesExtraTypes.DeepNest1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest1.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest1 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest1.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.DeepNest1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.DeepNest1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest1.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest1 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest1.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.DeepNest1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.DeepNest1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest1.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest1 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest1.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesExtraTypes.DeepNest1Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesExtraTypes.DeepNest1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest1.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest1 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDeepNest2() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest2.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesExtraTypes.DeepNest2Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesExtraTypes.DeepNest2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest2.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest2 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest2.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.DeepNest2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.DeepNest2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest2.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest2 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest2.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.DeepNest2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.DeepNest2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest2.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest2 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest2.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesExtraTypes.DeepNest2Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesExtraTypes.DeepNest2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest2.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest2 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDeepNest3() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest3.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesExtraTypes.DeepNest3Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesExtraTypes.DeepNest3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest3.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest3 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest3.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.DeepNest3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.DeepNest3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest3.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest3 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest3.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.DeepNest3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.DeepNest3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest3.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest3 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest3.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesExtraTypes.DeepNest3Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesExtraTypes.DeepNest3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest3.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest3 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDeepNest4() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest4.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesExtraTypes.DeepNest4Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesExtraTypes.DeepNest4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest4.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest4 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest4.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.DeepNest4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.DeepNest4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest4.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest4 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest4.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.DeepNest4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.DeepNest4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest4.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest4 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest4.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesExtraTypes.DeepNest4Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesExtraTypes.DeepNest4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest4.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest4 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDeepNest5() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest5.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesExtraTypes.DeepNest5Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesExtraTypes.DeepNest5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest5.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest5 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest5.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.DeepNest5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.DeepNest5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest5.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest5 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest5.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.DeepNest5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.DeepNest5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest5.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest5 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest5.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesExtraTypes.DeepNest5Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesExtraTypes.DeepNest5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest5.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest5 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDeepNest6() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest6.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesExtraTypes.DeepNest6Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesExtraTypes.DeepNest6Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest6.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest6 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest6.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.DeepNest6Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.DeepNest6Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest6.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest6 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest6.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.DeepNest6Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.DeepNest6Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest6.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest6 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest6.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesExtraTypes.DeepNest6Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesExtraTypes.DeepNest6Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest6.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest6 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDeepNest7() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest7.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesExtraTypes.DeepNest7Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesExtraTypes.DeepNest7Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest7.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest7 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest7.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.DeepNest7Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.DeepNest7Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest7.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest7 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest7.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.DeepNest7Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.DeepNest7Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest7.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest7 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest7.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesExtraTypes.DeepNest7Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesExtraTypes.DeepNest7Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest7.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest7 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTimestampEntry() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "TimestampEntry.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesExtraTypes.TimestampEntryCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesExtraTypes.TimestampEntryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "TimestampEntry.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL TimestampEntry mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "TimestampEntry.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.TimestampEntryCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.TimestampEntryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "TimestampEntry.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL TimestampEntry json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "TimestampEntry.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.TimestampEntryCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.TimestampEntryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "TimestampEntry.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL TimestampEntry unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "TimestampEntry.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesExtraTypes.TimestampEntryCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesExtraTypes.TimestampEntryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "TimestampEntry.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL TimestampEntry gron: " + e.getMessage()); failed++; }
    }

    static void testModelConfigEntry() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ConfigEntry.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesExtraTypes.ConfigEntryCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesExtraTypes.ConfigEntryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ConfigEntry.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ConfigEntry mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ConfigEntry.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.ConfigEntryCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.ConfigEntryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ConfigEntry.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ConfigEntry json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ConfigEntry.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesExtraTypes.ConfigEntryCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesExtraTypes.ConfigEntryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ConfigEntry.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ConfigEntry unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ConfigEntry.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesExtraTypes.ConfigEntryCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesExtraTypes.ConfigEntryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ConfigEntry.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ConfigEntry gron: " + e.getMessage()); failed++; }
    }

}
