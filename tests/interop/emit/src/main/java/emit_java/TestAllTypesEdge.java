package emit_java;

import specodec.*;
import all_types_edge.*;

public class TestAllTypesEdge {
    static String vecDir;
    static String outDir;
    static int passed = 0;
    static int failed = 0;

    public static int[] run(String vd, String od) {
        vecDir = vd;
        outDir = od;
        passed = 0;
        failed = 0;
        testModelEdgeEmpty();
        testModelEdgeOneOpt();
        testModelEdgeBigNums();
        testModelEdgeZeroVals();
        testModelEdgeNullable();
        testModelEdgeNegZero();
        testModelEdgeNullByte();
        testModelEdgeBoundary();
        testModelEdgeStrLen();
        testModelEdgeBytesLen();
        testModelEdgeArrEmpty();
        testModelEdgeArrBoundary();

        return new int[] { passed, failed };
    }

    static void testModelEdgeEmpty() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeEmpty.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesEdgeTypes.EdgeEmptyCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesEdgeTypes.EdgeEmptyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeEmpty.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeEmpty mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeEmpty.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEdgeTypes.EdgeEmptyCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEdgeTypes.EdgeEmptyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeEmpty.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeEmpty json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeEmpty.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEdgeTypes.EdgeEmptyCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEdgeTypes.EdgeEmptyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeEmpty.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeEmpty unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeEmpty.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesEdgeTypes.EdgeEmptyCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesEdgeTypes.EdgeEmptyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeEmpty.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeEmpty gron: " + e.getMessage()); failed++; }
    }

    static void testModelEdgeOneOpt() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeOneOpt.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesEdgeTypes.EdgeOneOptCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesEdgeTypes.EdgeOneOptCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeOneOpt.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeOneOpt mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeOneOpt.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEdgeTypes.EdgeOneOptCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEdgeTypes.EdgeOneOptCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeOneOpt.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeOneOpt json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeOneOpt.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEdgeTypes.EdgeOneOptCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEdgeTypes.EdgeOneOptCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeOneOpt.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeOneOpt unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeOneOpt.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesEdgeTypes.EdgeOneOptCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesEdgeTypes.EdgeOneOptCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeOneOpt.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeOneOpt gron: " + e.getMessage()); failed++; }
    }

    static void testModelEdgeBigNums() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeBigNums.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesEdgeTypes.EdgeBigNumsCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesEdgeTypes.EdgeBigNumsCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeBigNums.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeBigNums mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeBigNums.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEdgeTypes.EdgeBigNumsCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEdgeTypes.EdgeBigNumsCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeBigNums.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeBigNums json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeBigNums.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEdgeTypes.EdgeBigNumsCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEdgeTypes.EdgeBigNumsCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeBigNums.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeBigNums unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeBigNums.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesEdgeTypes.EdgeBigNumsCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesEdgeTypes.EdgeBigNumsCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeBigNums.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeBigNums gron: " + e.getMessage()); failed++; }
    }

    static void testModelEdgeZeroVals() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeZeroVals.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesEdgeTypes.EdgeZeroValsCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesEdgeTypes.EdgeZeroValsCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeZeroVals.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeZeroVals mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeZeroVals.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEdgeTypes.EdgeZeroValsCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEdgeTypes.EdgeZeroValsCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeZeroVals.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeZeroVals json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeZeroVals.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEdgeTypes.EdgeZeroValsCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEdgeTypes.EdgeZeroValsCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeZeroVals.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeZeroVals unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeZeroVals.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesEdgeTypes.EdgeZeroValsCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesEdgeTypes.EdgeZeroValsCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeZeroVals.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeZeroVals gron: " + e.getMessage()); failed++; }
    }

    static void testModelEdgeNullable() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeNullable.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesEdgeTypes.EdgeNullableCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesEdgeTypes.EdgeNullableCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeNullable.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeNullable mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeNullable.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEdgeTypes.EdgeNullableCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEdgeTypes.EdgeNullableCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeNullable.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeNullable json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeNullable.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEdgeTypes.EdgeNullableCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEdgeTypes.EdgeNullableCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeNullable.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeNullable unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeNullable.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesEdgeTypes.EdgeNullableCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesEdgeTypes.EdgeNullableCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeNullable.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeNullable gron: " + e.getMessage()); failed++; }
    }

    static void testModelEdgeNegZero() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeNegZero.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesEdgeTypes.EdgeNegZeroCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesEdgeTypes.EdgeNegZeroCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeNegZero.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeNegZero mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeNegZero.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEdgeTypes.EdgeNegZeroCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEdgeTypes.EdgeNegZeroCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeNegZero.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeNegZero json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeNegZero.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEdgeTypes.EdgeNegZeroCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEdgeTypes.EdgeNegZeroCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeNegZero.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeNegZero unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeNegZero.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesEdgeTypes.EdgeNegZeroCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesEdgeTypes.EdgeNegZeroCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeNegZero.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeNegZero gron: " + e.getMessage()); failed++; }
    }

    static void testModelEdgeNullByte() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeNullByte.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesEdgeTypes.EdgeNullByteCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesEdgeTypes.EdgeNullByteCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeNullByte.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeNullByte mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeNullByte.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEdgeTypes.EdgeNullByteCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEdgeTypes.EdgeNullByteCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeNullByte.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeNullByte json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeNullByte.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEdgeTypes.EdgeNullByteCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEdgeTypes.EdgeNullByteCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeNullByte.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeNullByte unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeNullByte.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesEdgeTypes.EdgeNullByteCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesEdgeTypes.EdgeNullByteCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeNullByte.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeNullByte gron: " + e.getMessage()); failed++; }
    }

    static void testModelEdgeBoundary() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeBoundary.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesEdgeTypes.EdgeBoundaryCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesEdgeTypes.EdgeBoundaryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeBoundary.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeBoundary mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeBoundary.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEdgeTypes.EdgeBoundaryCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEdgeTypes.EdgeBoundaryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeBoundary.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeBoundary json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeBoundary.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEdgeTypes.EdgeBoundaryCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEdgeTypes.EdgeBoundaryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeBoundary.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeBoundary unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeBoundary.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesEdgeTypes.EdgeBoundaryCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesEdgeTypes.EdgeBoundaryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeBoundary.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeBoundary gron: " + e.getMessage()); failed++; }
    }

    static void testModelEdgeStrLen() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeStrLen.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesEdgeTypes.EdgeStrLenCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesEdgeTypes.EdgeStrLenCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeStrLen.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeStrLen mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeStrLen.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEdgeTypes.EdgeStrLenCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEdgeTypes.EdgeStrLenCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeStrLen.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeStrLen json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeStrLen.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEdgeTypes.EdgeStrLenCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEdgeTypes.EdgeStrLenCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeStrLen.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeStrLen unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeStrLen.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesEdgeTypes.EdgeStrLenCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesEdgeTypes.EdgeStrLenCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeStrLen.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeStrLen gron: " + e.getMessage()); failed++; }
    }

    static void testModelEdgeBytesLen() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeBytesLen.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesEdgeTypes.EdgeBytesLenCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesEdgeTypes.EdgeBytesLenCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeBytesLen.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeBytesLen mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeBytesLen.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEdgeTypes.EdgeBytesLenCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEdgeTypes.EdgeBytesLenCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeBytesLen.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeBytesLen json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeBytesLen.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEdgeTypes.EdgeBytesLenCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEdgeTypes.EdgeBytesLenCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeBytesLen.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeBytesLen unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeBytesLen.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesEdgeTypes.EdgeBytesLenCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesEdgeTypes.EdgeBytesLenCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeBytesLen.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeBytesLen gron: " + e.getMessage()); failed++; }
    }

    static void testModelEdgeArrEmpty() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeArrEmpty.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesEdgeTypes.EdgeArrEmptyCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesEdgeTypes.EdgeArrEmptyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeArrEmpty.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeArrEmpty mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeArrEmpty.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEdgeTypes.EdgeArrEmptyCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEdgeTypes.EdgeArrEmptyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeArrEmpty.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeArrEmpty json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeArrEmpty.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEdgeTypes.EdgeArrEmptyCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEdgeTypes.EdgeArrEmptyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeArrEmpty.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeArrEmpty unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeArrEmpty.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesEdgeTypes.EdgeArrEmptyCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesEdgeTypes.EdgeArrEmptyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeArrEmpty.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeArrEmpty gron: " + e.getMessage()); failed++; }
    }

    static void testModelEdgeArrBoundary() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeArrBoundary.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesEdgeTypes.EdgeArrBoundaryCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesEdgeTypes.EdgeArrBoundaryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeArrBoundary.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeArrBoundary mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeArrBoundary.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEdgeTypes.EdgeArrBoundaryCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEdgeTypes.EdgeArrBoundaryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeArrBoundary.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeArrBoundary json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeArrBoundary.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesEdgeTypes.EdgeArrBoundaryCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesEdgeTypes.EdgeArrBoundaryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeArrBoundary.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeArrBoundary unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeArrBoundary.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesEdgeTypes.EdgeArrBoundaryCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesEdgeTypes.EdgeArrBoundaryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeArrBoundary.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeArrBoundary gron: " + e.getMessage()); failed++; }
    }

}
