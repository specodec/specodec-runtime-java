package emit_java;

import specodec.*;
import all_types_opt.*;

public class TestAllTypesOpt {
    static String vecDir;
    static String outDir;
    static int passed = 0;
    static int failed = 0;

    public static int[] run(String vd, String od) {
        vecDir = vd;
        outDir = od;
        passed = 0;
        failed = 0;
        testModelOptSingleString();
        testModelOptSingleBoolean();
        testModelOptSingleInt8();
        testModelOptSingleInt16();
        testModelOptSingleInt32();
        testModelOptSingleInt64();
        testModelOptSingleUint8();
        testModelOptSingleUint16();
        testModelOptSingleUint32();
        testModelOptSingleUint64();
        testModelOptSingleFloat32();
        testModelOptSingleFloat64();
        testModelOptSingleBytes();

        return new int[] { passed, failed };
    }

    static void testModelOptSingleString() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleString.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesOptTypes.OptSingleStringCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesOptTypes.OptSingleStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleString.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleString mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleString.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleStringCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleString.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleString json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleString.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleStringCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleString.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleString unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleString.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesOptTypes.OptSingleStringCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesOptTypes.OptSingleStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleString.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleString gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleBoolean() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleBoolean.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesOptTypes.OptSingleBooleanCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesOptTypes.OptSingleBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleBoolean.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleBoolean mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleBoolean.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleBooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleBoolean.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleBoolean json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleBoolean.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleBooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleBoolean.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleBoolean unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleBoolean.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesOptTypes.OptSingleBooleanCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesOptTypes.OptSingleBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleBoolean.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleBoolean gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleInt8() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt8.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesOptTypes.OptSingleInt8Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesOptTypes.OptSingleInt8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt8.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt8 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt8.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleInt8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleInt8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt8.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt8 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt8.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleInt8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleInt8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt8.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt8 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt8.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesOptTypes.OptSingleInt8Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesOptTypes.OptSingleInt8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt8.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt8 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleInt16() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt16.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesOptTypes.OptSingleInt16Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesOptTypes.OptSingleInt16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt16.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt16 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt16.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleInt16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleInt16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt16.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt16 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt16.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleInt16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleInt16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt16.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt16 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt16.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesOptTypes.OptSingleInt16Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesOptTypes.OptSingleInt16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt16.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt16 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleInt32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesOptTypes.OptSingleInt32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesOptTypes.OptSingleInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleInt32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleInt32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesOptTypes.OptSingleInt32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesOptTypes.OptSingleInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleInt64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesOptTypes.OptSingleInt64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesOptTypes.OptSingleInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleInt64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleInt64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesOptTypes.OptSingleInt64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesOptTypes.OptSingleInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleUint8() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint8.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesOptTypes.OptSingleUint8Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesOptTypes.OptSingleUint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint8.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint8 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint8.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleUint8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleUint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint8.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint8 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint8.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleUint8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleUint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint8.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint8 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint8.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesOptTypes.OptSingleUint8Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesOptTypes.OptSingleUint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint8.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint8 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleUint16() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint16.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesOptTypes.OptSingleUint16Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesOptTypes.OptSingleUint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint16.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint16 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint16.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleUint16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleUint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint16.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint16 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint16.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleUint16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleUint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint16.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint16 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint16.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesOptTypes.OptSingleUint16Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesOptTypes.OptSingleUint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint16.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint16 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleUint32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesOptTypes.OptSingleUint32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesOptTypes.OptSingleUint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleUint32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleUint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleUint32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleUint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesOptTypes.OptSingleUint32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesOptTypes.OptSingleUint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleUint64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesOptTypes.OptSingleUint64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesOptTypes.OptSingleUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleUint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleUint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesOptTypes.OptSingleUint64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesOptTypes.OptSingleUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleFloat32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleFloat32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesOptTypes.OptSingleFloat32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesOptTypes.OptSingleFloat32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleFloat32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleFloat32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleFloat32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleFloat32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleFloat32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleFloat32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleFloat32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleFloat32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleFloat32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleFloat32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleFloat32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleFloat32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleFloat32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesOptTypes.OptSingleFloat32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesOptTypes.OptSingleFloat32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleFloat32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleFloat32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleFloat64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleFloat64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesOptTypes.OptSingleFloat64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesOptTypes.OptSingleFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleFloat64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleFloat64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleFloat64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleFloat64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleFloat64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleFloat64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleFloat64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleFloat64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleFloat64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleFloat64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleFloat64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesOptTypes.OptSingleFloat64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesOptTypes.OptSingleFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleFloat64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleFloat64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleBytes() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleBytes.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesOptTypes.OptSingleBytesCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesOptTypes.OptSingleBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleBytes.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleBytes mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleBytes.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleBytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleBytes.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleBytes json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleBytes.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesOptTypes.OptSingleBytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesOptTypes.OptSingleBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleBytes.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleBytes unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleBytes.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesOptTypes.OptSingleBytesCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesOptTypes.OptSingleBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleBytes.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleBytes gron: " + e.getMessage()); failed++; }
    }

}
