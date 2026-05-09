package emit_java;

import specodec.*;
import all_types_scalars.*;

public class TestAllTypesScalars {
    static String vecDir;
    static String outDir;
    static int passed = 0;
    static int failed = 0;

    public static int[] run(String vd, String od) {
        vecDir = vd;
        outDir = od;
        passed = 0;
        failed = 0;
        testModelSingleString();
        testModelSingleBoolean();
        testModelSingleInt8();
        testModelSingleInt16();
        testModelSingleInt32();
        testModelSingleInt64();
        testModelSingleUint8();
        testModelSingleUint16();
        testModelSingleUint32();
        testModelSingleUint64();
        testModelSingleFloat32();
        testModelSingleFloat64();
        testModelSingleBytes();

        return new int[] { passed, failed };
    }

    static void testModelSingleString() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleString.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesScalarsTypes.SingleStringCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesScalarsTypes.SingleStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleString.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleString mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleString.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleStringCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleString.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleString json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleString.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleStringCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleString.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleString unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleString.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesScalarsTypes.SingleStringCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesScalarsTypes.SingleStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleString.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleString gron: " + e.getMessage()); failed++; }
    }

    static void testModelSingleBoolean() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleBoolean.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesScalarsTypes.SingleBooleanCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesScalarsTypes.SingleBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleBoolean.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleBoolean mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleBoolean.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleBooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleBoolean.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleBoolean json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleBoolean.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleBooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleBoolean.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleBoolean unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleBoolean.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesScalarsTypes.SingleBooleanCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesScalarsTypes.SingleBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleBoolean.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleBoolean gron: " + e.getMessage()); failed++; }
    }

    static void testModelSingleInt8() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt8.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesScalarsTypes.SingleInt8Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesScalarsTypes.SingleInt8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt8.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt8 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt8.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleInt8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleInt8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt8.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt8 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt8.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleInt8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleInt8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt8.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt8 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt8.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesScalarsTypes.SingleInt8Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesScalarsTypes.SingleInt8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt8.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt8 gron: " + e.getMessage()); failed++; }
    }

    static void testModelSingleInt16() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt16.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesScalarsTypes.SingleInt16Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesScalarsTypes.SingleInt16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt16.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt16 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt16.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleInt16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleInt16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt16.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt16 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt16.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleInt16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleInt16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt16.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt16 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt16.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesScalarsTypes.SingleInt16Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesScalarsTypes.SingleInt16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt16.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt16 gron: " + e.getMessage()); failed++; }
    }

    static void testModelSingleInt32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesScalarsTypes.SingleInt32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesScalarsTypes.SingleInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleInt32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleInt32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesScalarsTypes.SingleInt32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesScalarsTypes.SingleInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelSingleInt64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesScalarsTypes.SingleInt64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesScalarsTypes.SingleInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleInt64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleInt64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesScalarsTypes.SingleInt64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesScalarsTypes.SingleInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelSingleUint8() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint8.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesScalarsTypes.SingleUint8Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesScalarsTypes.SingleUint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint8.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint8 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint8.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleUint8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleUint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint8.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint8 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint8.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleUint8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleUint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint8.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint8 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint8.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesScalarsTypes.SingleUint8Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesScalarsTypes.SingleUint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint8.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint8 gron: " + e.getMessage()); failed++; }
    }

    static void testModelSingleUint16() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint16.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesScalarsTypes.SingleUint16Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesScalarsTypes.SingleUint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint16.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint16 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint16.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleUint16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleUint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint16.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint16 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint16.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleUint16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleUint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint16.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint16 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint16.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesScalarsTypes.SingleUint16Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesScalarsTypes.SingleUint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint16.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint16 gron: " + e.getMessage()); failed++; }
    }

    static void testModelSingleUint32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesScalarsTypes.SingleUint32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesScalarsTypes.SingleUint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleUint32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleUint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleUint32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleUint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesScalarsTypes.SingleUint32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesScalarsTypes.SingleUint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelSingleUint64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesScalarsTypes.SingleUint64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesScalarsTypes.SingleUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleUint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleUint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesScalarsTypes.SingleUint64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesScalarsTypes.SingleUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelSingleFloat32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleFloat32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesScalarsTypes.SingleFloat32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesScalarsTypes.SingleFloat32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleFloat32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleFloat32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleFloat32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleFloat32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleFloat32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleFloat32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleFloat32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleFloat32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleFloat32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleFloat32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleFloat32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleFloat32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleFloat32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesScalarsTypes.SingleFloat32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesScalarsTypes.SingleFloat32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleFloat32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleFloat32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelSingleFloat64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleFloat64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesScalarsTypes.SingleFloat64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesScalarsTypes.SingleFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleFloat64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleFloat64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleFloat64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleFloat64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleFloat64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleFloat64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleFloat64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleFloat64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleFloat64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleFloat64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleFloat64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesScalarsTypes.SingleFloat64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesScalarsTypes.SingleFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleFloat64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleFloat64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelSingleBytes() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleBytes.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesScalarsTypes.SingleBytesCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesScalarsTypes.SingleBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleBytes.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleBytes mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleBytes.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleBytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleBytes.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleBytes json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleBytes.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesScalarsTypes.SingleBytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesScalarsTypes.SingleBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleBytes.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleBytes unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleBytes.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesScalarsTypes.SingleBytesCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesScalarsTypes.SingleBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleBytes.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleBytes gron: " + e.getMessage()); failed++; }
    }

}
