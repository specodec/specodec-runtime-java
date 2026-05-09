package emit_java;

import specodec.*;
import all_types_arrays.*;

public class TestAllTypesArrays {
    static String vecDir;
    static String outDir;
    static int passed = 0;
    static int failed = 0;

    public static int[] run(String vd, String od) {
        vecDir = vd;
        outDir = od;
        passed = 0;
        failed = 0;
        testModelArrString();
        testModelArrInt32();
        testModelArrBoolean();
        testModelArrFloat64();
        testModelArrBytes();
        testModelArrInt64();
        testModelArrUint64();
        testModelMultiArr1();
        testModelMultiArr2();
        testModelMultiArr3();
        testModelMultiArr4();
        testModelMultiArr5();
        testModelOptCombo1();
        testModelOptCombo2();
        testModelOptCombo3();
        testModelOptCombo4();
        testModelOptCombo5();
        testModelOptCombo6();
        testModelOptCombo7();
        testModelOptCombo8();
        testModelOptCombo9();
        testModelOptCombo10();

        return new int[] { passed, failed };
    }

    static void testModelArrString() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrString.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesArraysTypes.ArrStringCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesArraysTypes.ArrStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrString.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrString mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrString.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.ArrStringCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.ArrStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrString.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrString json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrString.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.ArrStringCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.ArrStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrString.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrString unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrString.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesArraysTypes.ArrStringCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesArraysTypes.ArrStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrString.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrString gron: " + e.getMessage()); failed++; }
    }

    static void testModelArrInt32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrInt32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesArraysTypes.ArrInt32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesArraysTypes.ArrInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrInt32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrInt32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrInt32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.ArrInt32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.ArrInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrInt32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrInt32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrInt32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.ArrInt32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.ArrInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrInt32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrInt32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrInt32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesArraysTypes.ArrInt32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesArraysTypes.ArrInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrInt32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrInt32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelArrBoolean() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrBoolean.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesArraysTypes.ArrBooleanCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesArraysTypes.ArrBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrBoolean.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrBoolean mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrBoolean.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.ArrBooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.ArrBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrBoolean.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrBoolean json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrBoolean.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.ArrBooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.ArrBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrBoolean.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrBoolean unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrBoolean.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesArraysTypes.ArrBooleanCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesArraysTypes.ArrBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrBoolean.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrBoolean gron: " + e.getMessage()); failed++; }
    }

    static void testModelArrFloat64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrFloat64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesArraysTypes.ArrFloat64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesArraysTypes.ArrFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrFloat64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrFloat64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrFloat64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.ArrFloat64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.ArrFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrFloat64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrFloat64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrFloat64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.ArrFloat64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.ArrFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrFloat64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrFloat64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrFloat64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesArraysTypes.ArrFloat64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesArraysTypes.ArrFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrFloat64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrFloat64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelArrBytes() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrBytes.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesArraysTypes.ArrBytesCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesArraysTypes.ArrBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrBytes.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrBytes mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrBytes.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.ArrBytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.ArrBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrBytes.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrBytes json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrBytes.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.ArrBytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.ArrBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrBytes.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrBytes unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrBytes.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesArraysTypes.ArrBytesCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesArraysTypes.ArrBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrBytes.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrBytes gron: " + e.getMessage()); failed++; }
    }

    static void testModelArrInt64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrInt64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesArraysTypes.ArrInt64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesArraysTypes.ArrInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrInt64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrInt64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrInt64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.ArrInt64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.ArrInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrInt64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrInt64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrInt64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.ArrInt64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.ArrInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrInt64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrInt64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrInt64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesArraysTypes.ArrInt64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesArraysTypes.ArrInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrInt64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrInt64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelArrUint64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrUint64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesArraysTypes.ArrUint64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesArraysTypes.ArrUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrUint64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrUint64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrUint64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.ArrUint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.ArrUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrUint64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrUint64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrUint64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.ArrUint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.ArrUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrUint64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrUint64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrUint64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesArraysTypes.ArrUint64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesArraysTypes.ArrUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrUint64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrUint64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMultiArr1() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr1.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesArraysTypes.MultiArr1Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesArraysTypes.MultiArr1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr1.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr1 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr1.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.MultiArr1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.MultiArr1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr1.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr1 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr1.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.MultiArr1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.MultiArr1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr1.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr1 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr1.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesArraysTypes.MultiArr1Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesArraysTypes.MultiArr1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr1.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr1 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMultiArr2() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr2.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesArraysTypes.MultiArr2Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesArraysTypes.MultiArr2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr2.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr2 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr2.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.MultiArr2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.MultiArr2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr2.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr2 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr2.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.MultiArr2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.MultiArr2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr2.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr2 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr2.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesArraysTypes.MultiArr2Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesArraysTypes.MultiArr2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr2.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr2 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMultiArr3() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr3.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesArraysTypes.MultiArr3Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesArraysTypes.MultiArr3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr3.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr3 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr3.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.MultiArr3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.MultiArr3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr3.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr3 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr3.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.MultiArr3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.MultiArr3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr3.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr3 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr3.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesArraysTypes.MultiArr3Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesArraysTypes.MultiArr3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr3.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr3 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMultiArr4() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr4.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesArraysTypes.MultiArr4Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesArraysTypes.MultiArr4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr4.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr4 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr4.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.MultiArr4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.MultiArr4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr4.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr4 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr4.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.MultiArr4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.MultiArr4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr4.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr4 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr4.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesArraysTypes.MultiArr4Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesArraysTypes.MultiArr4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr4.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr4 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMultiArr5() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr5.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesArraysTypes.MultiArr5Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesArraysTypes.MultiArr5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr5.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr5 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr5.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.MultiArr5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.MultiArr5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr5.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr5 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr5.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.MultiArr5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.MultiArr5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr5.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr5 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr5.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesArraysTypes.MultiArr5Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesArraysTypes.MultiArr5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr5.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr5 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptCombo1() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo1.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesArraysTypes.OptCombo1Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesArraysTypes.OptCombo1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo1.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo1 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo1.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.OptCombo1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.OptCombo1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo1.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo1 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo1.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.OptCombo1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.OptCombo1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo1.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo1 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo1.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesArraysTypes.OptCombo1Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesArraysTypes.OptCombo1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo1.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo1 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptCombo2() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo2.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesArraysTypes.OptCombo2Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesArraysTypes.OptCombo2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo2.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo2 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo2.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.OptCombo2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.OptCombo2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo2.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo2 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo2.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.OptCombo2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.OptCombo2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo2.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo2 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo2.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesArraysTypes.OptCombo2Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesArraysTypes.OptCombo2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo2.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo2 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptCombo3() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo3.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesArraysTypes.OptCombo3Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesArraysTypes.OptCombo3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo3.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo3 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo3.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.OptCombo3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.OptCombo3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo3.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo3 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo3.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.OptCombo3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.OptCombo3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo3.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo3 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo3.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesArraysTypes.OptCombo3Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesArraysTypes.OptCombo3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo3.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo3 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptCombo4() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo4.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesArraysTypes.OptCombo4Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesArraysTypes.OptCombo4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo4.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo4 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo4.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.OptCombo4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.OptCombo4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo4.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo4 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo4.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.OptCombo4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.OptCombo4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo4.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo4 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo4.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesArraysTypes.OptCombo4Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesArraysTypes.OptCombo4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo4.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo4 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptCombo5() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo5.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesArraysTypes.OptCombo5Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesArraysTypes.OptCombo5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo5.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo5 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo5.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.OptCombo5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.OptCombo5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo5.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo5 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo5.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.OptCombo5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.OptCombo5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo5.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo5 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo5.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesArraysTypes.OptCombo5Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesArraysTypes.OptCombo5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo5.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo5 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptCombo6() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo6.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesArraysTypes.OptCombo6Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesArraysTypes.OptCombo6Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo6.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo6 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo6.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.OptCombo6Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.OptCombo6Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo6.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo6 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo6.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.OptCombo6Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.OptCombo6Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo6.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo6 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo6.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesArraysTypes.OptCombo6Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesArraysTypes.OptCombo6Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo6.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo6 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptCombo7() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo7.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesArraysTypes.OptCombo7Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesArraysTypes.OptCombo7Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo7.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo7 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo7.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.OptCombo7Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.OptCombo7Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo7.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo7 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo7.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.OptCombo7Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.OptCombo7Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo7.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo7 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo7.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesArraysTypes.OptCombo7Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesArraysTypes.OptCombo7Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo7.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo7 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptCombo8() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo8.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesArraysTypes.OptCombo8Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesArraysTypes.OptCombo8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo8.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo8 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo8.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.OptCombo8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.OptCombo8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo8.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo8 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo8.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.OptCombo8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.OptCombo8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo8.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo8 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo8.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesArraysTypes.OptCombo8Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesArraysTypes.OptCombo8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo8.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo8 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptCombo9() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo9.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesArraysTypes.OptCombo9Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesArraysTypes.OptCombo9Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo9.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo9 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo9.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.OptCombo9Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.OptCombo9Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo9.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo9 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo9.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.OptCombo9Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.OptCombo9Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo9.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo9 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo9.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesArraysTypes.OptCombo9Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesArraysTypes.OptCombo9Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo9.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo9 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptCombo10() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo10.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesArraysTypes.OptCombo10Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesArraysTypes.OptCombo10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo10.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo10 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo10.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.OptCombo10Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.OptCombo10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo10.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo10 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo10.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesArraysTypes.OptCombo10Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesArraysTypes.OptCombo10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo10.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo10 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo10.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesArraysTypes.OptCombo10Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesArraysTypes.OptCombo10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo10.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo10 gron: " + e.getMessage()); failed++; }
    }

}
