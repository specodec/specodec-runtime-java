package emit_java;

import specodec.*;
import all_types_nests.*;

public class TestAllTypesNests {
    static String vecDir;
    static String outDir;
    static int passed = 0;
    static int failed = 0;

    public static int[] run(String vd, String od) {
        vecDir = vd;
        outDir = od;
        passed = 0;
        failed = 0;
        testModelNestInner();
        testModelNestCoord();
        testModelNestIdVal();
        testModelNestLabel();
        testModelNestMoney();
        testModelNestRange32();
        testModelNestAddr();
        testModelNestPoint3();
        testModelOptNestInner();
        testModelOptNestCoord();
        testModelOptNestIdVal();
        testModelOptNestLabel();
        testModelOptNestMoney();
        testModelOptNestRange32();
        testModelOptNestAddr();
        testModelOptNestPoint3();

        return new int[] { passed, failed };
    }

    static void testModelNestInner() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestInner.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesNestsTypes.NestInnerCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesNestsTypes.NestInnerCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestInner.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestInner mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestInner.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.NestInnerCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.NestInnerCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestInner.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestInner json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestInner.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.NestInnerCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.NestInnerCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestInner.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestInner unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestInner.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesNestsTypes.NestInnerCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesNestsTypes.NestInnerCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestInner.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestInner gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestCoord() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestCoord.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesNestsTypes.NestCoordCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesNestsTypes.NestCoordCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestCoord.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestCoord mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestCoord.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.NestCoordCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.NestCoordCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestCoord.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestCoord json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestCoord.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.NestCoordCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.NestCoordCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestCoord.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestCoord unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestCoord.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesNestsTypes.NestCoordCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesNestsTypes.NestCoordCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestCoord.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestCoord gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestIdVal() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestIdVal.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesNestsTypes.NestIdValCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesNestsTypes.NestIdValCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestIdVal.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestIdVal mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestIdVal.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.NestIdValCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.NestIdValCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestIdVal.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestIdVal json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestIdVal.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.NestIdValCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.NestIdValCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestIdVal.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestIdVal unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestIdVal.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesNestsTypes.NestIdValCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesNestsTypes.NestIdValCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestIdVal.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestIdVal gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestLabel() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestLabel.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesNestsTypes.NestLabelCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesNestsTypes.NestLabelCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestLabel.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestLabel mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestLabel.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.NestLabelCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.NestLabelCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestLabel.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestLabel json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestLabel.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.NestLabelCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.NestLabelCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestLabel.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestLabel unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestLabel.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesNestsTypes.NestLabelCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesNestsTypes.NestLabelCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestLabel.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestLabel gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestMoney() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestMoney.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesNestsTypes.NestMoneyCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesNestsTypes.NestMoneyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestMoney.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestMoney mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestMoney.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.NestMoneyCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.NestMoneyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestMoney.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestMoney json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestMoney.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.NestMoneyCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.NestMoneyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestMoney.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestMoney unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestMoney.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesNestsTypes.NestMoneyCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesNestsTypes.NestMoneyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestMoney.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestMoney gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestRange32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestRange32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesNestsTypes.NestRange32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesNestsTypes.NestRange32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestRange32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestRange32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestRange32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.NestRange32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.NestRange32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestRange32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestRange32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestRange32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.NestRange32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.NestRange32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestRange32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestRange32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestRange32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesNestsTypes.NestRange32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesNestsTypes.NestRange32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestRange32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestRange32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestAddr() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestAddr.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesNestsTypes.NestAddrCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesNestsTypes.NestAddrCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestAddr.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestAddr mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestAddr.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.NestAddrCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.NestAddrCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestAddr.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestAddr json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestAddr.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.NestAddrCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.NestAddrCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestAddr.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestAddr unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestAddr.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesNestsTypes.NestAddrCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesNestsTypes.NestAddrCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestAddr.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestAddr gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestPoint3() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestPoint3.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesNestsTypes.NestPoint3Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesNestsTypes.NestPoint3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestPoint3.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestPoint3 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestPoint3.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.NestPoint3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.NestPoint3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestPoint3.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestPoint3 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestPoint3.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.NestPoint3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.NestPoint3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestPoint3.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestPoint3 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestPoint3.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesNestsTypes.NestPoint3Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesNestsTypes.NestPoint3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestPoint3.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestPoint3 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptNestInner() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestInner.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesNestsTypes.OptNestInnerCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesNestsTypes.OptNestInnerCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestInner.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestInner mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestInner.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.OptNestInnerCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.OptNestInnerCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestInner.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestInner json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestInner.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.OptNestInnerCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.OptNestInnerCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestInner.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestInner unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestInner.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesNestsTypes.OptNestInnerCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesNestsTypes.OptNestInnerCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestInner.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestInner gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptNestCoord() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestCoord.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesNestsTypes.OptNestCoordCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesNestsTypes.OptNestCoordCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestCoord.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestCoord mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestCoord.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.OptNestCoordCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.OptNestCoordCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestCoord.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestCoord json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestCoord.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.OptNestCoordCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.OptNestCoordCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestCoord.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestCoord unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestCoord.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesNestsTypes.OptNestCoordCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesNestsTypes.OptNestCoordCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestCoord.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestCoord gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptNestIdVal() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestIdVal.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesNestsTypes.OptNestIdValCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesNestsTypes.OptNestIdValCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestIdVal.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestIdVal mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestIdVal.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.OptNestIdValCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.OptNestIdValCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestIdVal.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestIdVal json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestIdVal.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.OptNestIdValCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.OptNestIdValCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestIdVal.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestIdVal unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestIdVal.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesNestsTypes.OptNestIdValCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesNestsTypes.OptNestIdValCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestIdVal.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestIdVal gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptNestLabel() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestLabel.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesNestsTypes.OptNestLabelCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesNestsTypes.OptNestLabelCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestLabel.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestLabel mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestLabel.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.OptNestLabelCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.OptNestLabelCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestLabel.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestLabel json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestLabel.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.OptNestLabelCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.OptNestLabelCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestLabel.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestLabel unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestLabel.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesNestsTypes.OptNestLabelCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesNestsTypes.OptNestLabelCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestLabel.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestLabel gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptNestMoney() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestMoney.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesNestsTypes.OptNestMoneyCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesNestsTypes.OptNestMoneyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestMoney.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestMoney mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestMoney.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.OptNestMoneyCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.OptNestMoneyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestMoney.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestMoney json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestMoney.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.OptNestMoneyCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.OptNestMoneyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestMoney.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestMoney unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestMoney.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesNestsTypes.OptNestMoneyCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesNestsTypes.OptNestMoneyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestMoney.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestMoney gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptNestRange32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestRange32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesNestsTypes.OptNestRange32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesNestsTypes.OptNestRange32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestRange32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestRange32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestRange32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.OptNestRange32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.OptNestRange32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestRange32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestRange32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestRange32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.OptNestRange32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.OptNestRange32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestRange32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestRange32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestRange32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesNestsTypes.OptNestRange32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesNestsTypes.OptNestRange32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestRange32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestRange32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptNestAddr() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestAddr.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesNestsTypes.OptNestAddrCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesNestsTypes.OptNestAddrCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestAddr.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestAddr mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestAddr.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.OptNestAddrCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.OptNestAddrCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestAddr.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestAddr json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestAddr.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.OptNestAddrCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.OptNestAddrCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestAddr.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestAddr unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestAddr.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesNestsTypes.OptNestAddrCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesNestsTypes.OptNestAddrCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestAddr.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestAddr gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptNestPoint3() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestPoint3.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesNestsTypes.OptNestPoint3Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesNestsTypes.OptNestPoint3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestPoint3.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestPoint3 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestPoint3.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.OptNestPoint3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.OptNestPoint3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestPoint3.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestPoint3 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestPoint3.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesNestsTypes.OptNestPoint3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesNestsTypes.OptNestPoint3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestPoint3.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestPoint3 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestPoint3.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesNestsTypes.OptNestPoint3Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesNestsTypes.OptNestPoint3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestPoint3.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestPoint3 gron: " + e.getMessage()); failed++; }
    }

}
