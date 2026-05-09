package emit_java;

import specodec.*;
import all_types_pairs.*;

public class TestAllTypesPairs {
    static String vecDir;
    static String outDir;
    static int passed = 0;
    static int failed = 0;

    public static int[] run(String vd, String od) {
        vecDir = vd;
        outDir = od;
        passed = 0;
        failed = 0;
        testModelPairString();
        testModelPairBoolean();
        testModelPairInt8();
        testModelPairInt16();
        testModelPairInt32();
        testModelPairInt64();
        testModelPairUint8();
        testModelPairUint16();
        testModelPairUint32();
        testModelPairUint64();
        testModelPairFloat32();
        testModelPairFloat64();
        testModelPairBytes();
        testModelDualStringInt32();
        testModelDualStringBoolean();
        testModelDualStringFloat64();
        testModelDualStringBytes();
        testModelDualInt32Boolean();
        testModelDualInt32Float64();
        testModelDualInt32Int64();
        testModelDualInt32Uint32();
        testModelDualInt64Uint64();
        testModelDualFloat32Float64();
        testModelDualFloat64Boolean();
        testModelDualFloat64Bytes();
        testModelDualUint32Uint64();
        testModelDualBooleanBytes();
        testModelDualInt8Uint8();
        testModelDualInt16Uint16();
        testModelDualStringInt64();
        testModelDualStringUint64();
        testModelDualInt32Bytes();
        testModelDualFloat64Int32();
        testModelDualBooleanInt32();
        testModelDualBytesInt64();
        testModelDualInt8Float32();
        testModelDualUint8Int16();
        testModelDualInt64Float64();
        testModelDualUint64String();
        testModelTriple01();
        testModelTriple02();
        testModelTriple03();
        testModelTriple04();
        testModelTriple05();
        testModelTriple06();
        testModelTriple07();
        testModelTriple08();
        testModelTriple09();
        testModelTriple10();
        testModelTriple11();
        testModelTriple12();
        testModelTriple13();
        testModelTriple14();
        testModelTriple15();

        return new int[] { passed, failed };
    }

    static void testModelPairString() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairString.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.PairStringCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.PairStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairString.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairString mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairString.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairStringCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairString.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairString json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairString.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairStringCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairString.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairString unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairString.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.PairStringCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.PairStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairString.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairString gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairBoolean() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairBoolean.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.PairBooleanCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.PairBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairBoolean.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairBoolean mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairBoolean.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairBooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairBoolean.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairBoolean json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairBoolean.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairBooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairBoolean.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairBoolean unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairBoolean.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.PairBooleanCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.PairBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairBoolean.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairBoolean gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairInt8() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt8.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.PairInt8Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.PairInt8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt8.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt8 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt8.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairInt8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairInt8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt8.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt8 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt8.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairInt8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairInt8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt8.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt8 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt8.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.PairInt8Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.PairInt8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt8.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt8 gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairInt16() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt16.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.PairInt16Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.PairInt16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt16.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt16 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt16.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairInt16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairInt16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt16.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt16 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt16.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairInt16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairInt16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt16.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt16 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt16.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.PairInt16Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.PairInt16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt16.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt16 gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairInt32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.PairInt32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.PairInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairInt32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairInt32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.PairInt32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.PairInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairInt64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.PairInt64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.PairInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairInt64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairInt64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.PairInt64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.PairInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairUint8() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint8.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.PairUint8Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.PairUint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint8.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint8 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint8.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairUint8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairUint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint8.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint8 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint8.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairUint8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairUint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint8.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint8 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint8.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.PairUint8Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.PairUint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint8.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint8 gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairUint16() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint16.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.PairUint16Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.PairUint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint16.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint16 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint16.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairUint16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairUint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint16.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint16 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint16.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairUint16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairUint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint16.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint16 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint16.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.PairUint16Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.PairUint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint16.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint16 gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairUint32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.PairUint32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.PairUint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairUint32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairUint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairUint32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairUint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.PairUint32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.PairUint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairUint64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.PairUint64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.PairUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairUint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairUint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.PairUint64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.PairUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairFloat32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairFloat32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.PairFloat32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.PairFloat32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairFloat32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairFloat32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairFloat32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairFloat32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairFloat32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairFloat32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairFloat32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairFloat32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairFloat32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairFloat32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairFloat32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairFloat32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairFloat32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.PairFloat32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.PairFloat32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairFloat32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairFloat32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairFloat64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairFloat64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.PairFloat64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.PairFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairFloat64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairFloat64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairFloat64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairFloat64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairFloat64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairFloat64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairFloat64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairFloat64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairFloat64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairFloat64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairFloat64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.PairFloat64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.PairFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairFloat64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairFloat64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairBytes() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairBytes.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.PairBytesCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.PairBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairBytes.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairBytes mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairBytes.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairBytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairBytes.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairBytes json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairBytes.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.PairBytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.PairBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairBytes.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairBytes unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairBytes.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.PairBytesCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.PairBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairBytes.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairBytes gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualStringInt32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringInt32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualStringInt32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualStringInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringInt32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringInt32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringInt32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualStringInt32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualStringInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringInt32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringInt32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringInt32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualStringInt32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualStringInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringInt32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringInt32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringInt32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualStringInt32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualStringInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringInt32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringInt32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualStringBoolean() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringBoolean.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualStringBooleanCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualStringBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringBoolean.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringBoolean mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringBoolean.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualStringBooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualStringBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringBoolean.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringBoolean json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringBoolean.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualStringBooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualStringBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringBoolean.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringBoolean unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringBoolean.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualStringBooleanCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualStringBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringBoolean.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringBoolean gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualStringFloat64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringFloat64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualStringFloat64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualStringFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringFloat64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringFloat64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringFloat64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualStringFloat64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualStringFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringFloat64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringFloat64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringFloat64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualStringFloat64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualStringFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringFloat64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringFloat64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringFloat64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualStringFloat64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualStringFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringFloat64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringFloat64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualStringBytes() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringBytes.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualStringBytesCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualStringBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringBytes.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringBytes mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringBytes.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualStringBytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualStringBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringBytes.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringBytes json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringBytes.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualStringBytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualStringBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringBytes.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringBytes unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringBytes.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualStringBytesCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualStringBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringBytes.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringBytes gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualInt32Boolean() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Boolean.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualInt32BooleanCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualInt32BooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Boolean.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Boolean mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Boolean.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualInt32BooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualInt32BooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Boolean.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Boolean json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Boolean.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualInt32BooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualInt32BooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Boolean.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Boolean unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Boolean.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualInt32BooleanCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualInt32BooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Boolean.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Boolean gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualInt32Float64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Float64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualInt32Float64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualInt32Float64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Float64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Float64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Float64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualInt32Float64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualInt32Float64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Float64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Float64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Float64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualInt32Float64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualInt32Float64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Float64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Float64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Float64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualInt32Float64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualInt32Float64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Float64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Float64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualInt32Int64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Int64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualInt32Int64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualInt32Int64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Int64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Int64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Int64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualInt32Int64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualInt32Int64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Int64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Int64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Int64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualInt32Int64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualInt32Int64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Int64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Int64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Int64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualInt32Int64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualInt32Int64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Int64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Int64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualInt32Uint32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Uint32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualInt32Uint32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualInt32Uint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Uint32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Uint32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Uint32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualInt32Uint32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualInt32Uint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Uint32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Uint32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Uint32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualInt32Uint32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualInt32Uint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Uint32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Uint32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Uint32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualInt32Uint32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualInt32Uint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Uint32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Uint32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualInt64Uint64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt64Uint64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualInt64Uint64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualInt64Uint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt64Uint64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt64Uint64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt64Uint64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualInt64Uint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualInt64Uint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt64Uint64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt64Uint64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt64Uint64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualInt64Uint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualInt64Uint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt64Uint64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt64Uint64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt64Uint64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualInt64Uint64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualInt64Uint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt64Uint64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt64Uint64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualFloat32Float64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat32Float64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualFloat32Float64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualFloat32Float64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat32Float64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat32Float64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat32Float64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualFloat32Float64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualFloat32Float64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat32Float64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat32Float64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat32Float64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualFloat32Float64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualFloat32Float64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat32Float64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat32Float64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat32Float64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualFloat32Float64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualFloat32Float64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat32Float64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat32Float64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualFloat64Boolean() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat64Boolean.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualFloat64BooleanCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualFloat64BooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat64Boolean.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat64Boolean mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat64Boolean.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualFloat64BooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualFloat64BooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat64Boolean.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat64Boolean json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat64Boolean.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualFloat64BooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualFloat64BooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat64Boolean.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat64Boolean unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat64Boolean.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualFloat64BooleanCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualFloat64BooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat64Boolean.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat64Boolean gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualFloat64Bytes() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat64Bytes.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualFloat64BytesCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualFloat64BytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat64Bytes.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat64Bytes mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat64Bytes.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualFloat64BytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualFloat64BytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat64Bytes.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat64Bytes json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat64Bytes.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualFloat64BytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualFloat64BytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat64Bytes.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat64Bytes unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat64Bytes.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualFloat64BytesCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualFloat64BytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat64Bytes.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat64Bytes gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualUint32Uint64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualUint32Uint64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualUint32Uint64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualUint32Uint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualUint32Uint64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualUint32Uint64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualUint32Uint64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualUint32Uint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualUint32Uint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualUint32Uint64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualUint32Uint64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualUint32Uint64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualUint32Uint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualUint32Uint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualUint32Uint64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualUint32Uint64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualUint32Uint64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualUint32Uint64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualUint32Uint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualUint32Uint64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualUint32Uint64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualBooleanBytes() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualBooleanBytes.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualBooleanBytesCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualBooleanBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualBooleanBytes.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualBooleanBytes mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualBooleanBytes.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualBooleanBytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualBooleanBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualBooleanBytes.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualBooleanBytes json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualBooleanBytes.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualBooleanBytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualBooleanBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualBooleanBytes.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualBooleanBytes unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualBooleanBytes.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualBooleanBytesCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualBooleanBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualBooleanBytes.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualBooleanBytes gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualInt8Uint8() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt8Uint8.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualInt8Uint8Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualInt8Uint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt8Uint8.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt8Uint8 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt8Uint8.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualInt8Uint8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualInt8Uint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt8Uint8.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt8Uint8 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt8Uint8.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualInt8Uint8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualInt8Uint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt8Uint8.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt8Uint8 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt8Uint8.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualInt8Uint8Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualInt8Uint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt8Uint8.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt8Uint8 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualInt16Uint16() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt16Uint16.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualInt16Uint16Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualInt16Uint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt16Uint16.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt16Uint16 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt16Uint16.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualInt16Uint16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualInt16Uint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt16Uint16.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt16Uint16 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt16Uint16.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualInt16Uint16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualInt16Uint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt16Uint16.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt16Uint16 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt16Uint16.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualInt16Uint16Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualInt16Uint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt16Uint16.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt16Uint16 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualStringInt64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringInt64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualStringInt64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualStringInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringInt64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringInt64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringInt64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualStringInt64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualStringInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringInt64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringInt64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringInt64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualStringInt64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualStringInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringInt64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringInt64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringInt64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualStringInt64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualStringInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringInt64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringInt64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualStringUint64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringUint64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualStringUint64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualStringUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringUint64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringUint64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringUint64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualStringUint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualStringUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringUint64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringUint64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringUint64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualStringUint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualStringUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringUint64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringUint64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringUint64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualStringUint64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualStringUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringUint64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringUint64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualInt32Bytes() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Bytes.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualInt32BytesCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualInt32BytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Bytes.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Bytes mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Bytes.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualInt32BytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualInt32BytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Bytes.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Bytes json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Bytes.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualInt32BytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualInt32BytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Bytes.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Bytes unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Bytes.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualInt32BytesCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualInt32BytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Bytes.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Bytes gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualFloat64Int32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat64Int32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualFloat64Int32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualFloat64Int32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat64Int32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat64Int32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat64Int32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualFloat64Int32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualFloat64Int32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat64Int32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat64Int32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat64Int32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualFloat64Int32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualFloat64Int32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat64Int32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat64Int32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat64Int32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualFloat64Int32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualFloat64Int32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat64Int32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat64Int32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualBooleanInt32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualBooleanInt32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualBooleanInt32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualBooleanInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualBooleanInt32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualBooleanInt32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualBooleanInt32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualBooleanInt32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualBooleanInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualBooleanInt32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualBooleanInt32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualBooleanInt32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualBooleanInt32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualBooleanInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualBooleanInt32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualBooleanInt32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualBooleanInt32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualBooleanInt32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualBooleanInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualBooleanInt32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualBooleanInt32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualBytesInt64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualBytesInt64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualBytesInt64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualBytesInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualBytesInt64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualBytesInt64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualBytesInt64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualBytesInt64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualBytesInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualBytesInt64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualBytesInt64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualBytesInt64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualBytesInt64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualBytesInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualBytesInt64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualBytesInt64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualBytesInt64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualBytesInt64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualBytesInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualBytesInt64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualBytesInt64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualInt8Float32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt8Float32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualInt8Float32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualInt8Float32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt8Float32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt8Float32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt8Float32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualInt8Float32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualInt8Float32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt8Float32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt8Float32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt8Float32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualInt8Float32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualInt8Float32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt8Float32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt8Float32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt8Float32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualInt8Float32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualInt8Float32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt8Float32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt8Float32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualUint8Int16() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualUint8Int16.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualUint8Int16Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualUint8Int16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualUint8Int16.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualUint8Int16 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualUint8Int16.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualUint8Int16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualUint8Int16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualUint8Int16.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualUint8Int16 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualUint8Int16.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualUint8Int16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualUint8Int16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualUint8Int16.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualUint8Int16 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualUint8Int16.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualUint8Int16Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualUint8Int16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualUint8Int16.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualUint8Int16 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualInt64Float64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt64Float64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualInt64Float64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualInt64Float64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt64Float64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt64Float64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt64Float64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualInt64Float64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualInt64Float64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt64Float64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt64Float64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt64Float64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualInt64Float64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualInt64Float64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt64Float64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt64Float64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt64Float64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualInt64Float64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualInt64Float64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt64Float64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt64Float64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualUint64String() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualUint64String.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.DualUint64StringCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.DualUint64StringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualUint64String.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualUint64String mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualUint64String.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualUint64StringCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualUint64StringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualUint64String.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualUint64String json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualUint64String.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.DualUint64StringCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.DualUint64StringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualUint64String.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualUint64String unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualUint64String.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.DualUint64StringCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.DualUint64StringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualUint64String.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualUint64String gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple01() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple01.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.Triple01Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.Triple01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple01.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple01 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple01.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple01Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple01.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple01 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple01.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple01Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple01.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple01 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple01.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.Triple01Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.Triple01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple01.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple01 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple02() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple02.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.Triple02Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.Triple02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple02.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple02 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple02.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple02Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple02.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple02 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple02.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple02Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple02.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple02 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple02.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.Triple02Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.Triple02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple02.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple02 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple03() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple03.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.Triple03Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.Triple03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple03.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple03 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple03.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple03Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple03.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple03 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple03.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple03Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple03.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple03 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple03.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.Triple03Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.Triple03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple03.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple03 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple04() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple04.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.Triple04Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.Triple04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple04.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple04 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple04.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple04Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple04.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple04 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple04.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple04Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple04.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple04 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple04.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.Triple04Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.Triple04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple04.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple04 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple05() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple05.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.Triple05Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.Triple05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple05.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple05 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple05.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple05Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple05.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple05 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple05.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple05Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple05.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple05 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple05.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.Triple05Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.Triple05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple05.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple05 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple06() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple06.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.Triple06Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.Triple06Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple06.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple06 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple06.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple06Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple06Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple06.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple06 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple06.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple06Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple06Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple06.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple06 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple06.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.Triple06Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.Triple06Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple06.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple06 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple07() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple07.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.Triple07Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.Triple07Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple07.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple07 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple07.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple07Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple07Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple07.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple07 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple07.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple07Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple07Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple07.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple07 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple07.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.Triple07Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.Triple07Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple07.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple07 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple08() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple08.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.Triple08Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.Triple08Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple08.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple08 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple08.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple08Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple08Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple08.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple08 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple08.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple08Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple08Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple08.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple08 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple08.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.Triple08Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.Triple08Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple08.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple08 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple09() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple09.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.Triple09Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.Triple09Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple09.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple09 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple09.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple09Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple09Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple09.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple09 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple09.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple09Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple09Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple09.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple09 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple09.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.Triple09Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.Triple09Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple09.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple09 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple10() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple10.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.Triple10Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.Triple10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple10.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple10 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple10.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple10Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple10.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple10 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple10.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple10Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple10.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple10 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple10.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.Triple10Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.Triple10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple10.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple10 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple11() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple11.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.Triple11Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.Triple11Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple11.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple11 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple11.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple11Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple11Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple11.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple11 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple11.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple11Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple11Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple11.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple11 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple11.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.Triple11Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.Triple11Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple11.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple11 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple12() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple12.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.Triple12Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.Triple12Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple12.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple12 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple12.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple12Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple12Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple12.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple12 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple12.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple12Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple12Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple12.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple12 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple12.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.Triple12Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.Triple12Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple12.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple12 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple13() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple13.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.Triple13Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.Triple13Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple13.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple13 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple13.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple13Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple13Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple13.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple13 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple13.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple13Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple13Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple13.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple13 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple13.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.Triple13Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.Triple13Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple13.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple13 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple14() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple14.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.Triple14Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.Triple14Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple14.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple14 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple14.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple14Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple14Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple14.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple14 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple14.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple14Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple14Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple14.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple14 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple14.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.Triple14Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.Triple14Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple14.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple14 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple15() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple15.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesPairsTypes.Triple15Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesPairsTypes.Triple15Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple15.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple15 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple15.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple15Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple15Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple15.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple15 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple15.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesPairsTypes.Triple15Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesPairsTypes.Triple15Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple15.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple15 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple15.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesPairsTypes.Triple15Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesPairsTypes.Triple15Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple15.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple15 gron: " + e.getMessage()); failed++; }
    }

}
