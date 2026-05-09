package emit_java;

import specodec.*;
import all_types_recursive.*;

public class TestAllTypesRecursive {
    static String vecDir;
    static String outDir;
    static int passed = 0;
    static int failed = 0;

    public static int[] run(String vd, String od) {
        vecDir = vd;
        outDir = od;
        passed = 0;
        failed = 0;
        testModelRecList();
        testModelRecTree();
        testModelRecChain();
        testModelRecWrap();
        testModelRecWide();

        return new int[] { passed, failed };
    }

    static void testModelRecList() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecList.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesRecursiveTypes.RecListCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesRecursiveTypes.RecListCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecList.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecList mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecList.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesRecursiveTypes.RecListCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesRecursiveTypes.RecListCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecList.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecList json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecList.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesRecursiveTypes.RecListCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesRecursiveTypes.RecListCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecList.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecList unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecList.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesRecursiveTypes.RecListCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesRecursiveTypes.RecListCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecList.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecList gron: " + e.getMessage()); failed++; }
    }

    static void testModelRecTree() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecTree.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesRecursiveTypes.RecTreeCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesRecursiveTypes.RecTreeCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecTree.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecTree mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecTree.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesRecursiveTypes.RecTreeCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesRecursiveTypes.RecTreeCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecTree.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecTree json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecTree.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesRecursiveTypes.RecTreeCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesRecursiveTypes.RecTreeCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecTree.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecTree unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecTree.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesRecursiveTypes.RecTreeCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesRecursiveTypes.RecTreeCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecTree.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecTree gron: " + e.getMessage()); failed++; }
    }

    static void testModelRecChain() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecChain.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesRecursiveTypes.RecChainCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesRecursiveTypes.RecChainCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecChain.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecChain mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecChain.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesRecursiveTypes.RecChainCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesRecursiveTypes.RecChainCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecChain.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecChain json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecChain.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesRecursiveTypes.RecChainCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesRecursiveTypes.RecChainCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecChain.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecChain unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecChain.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesRecursiveTypes.RecChainCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesRecursiveTypes.RecChainCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecChain.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecChain gron: " + e.getMessage()); failed++; }
    }

    static void testModelRecWrap() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecWrap.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesRecursiveTypes.RecWrapCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesRecursiveTypes.RecWrapCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecWrap.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecWrap mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecWrap.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesRecursiveTypes.RecWrapCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesRecursiveTypes.RecWrapCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecWrap.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecWrap json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecWrap.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesRecursiveTypes.RecWrapCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesRecursiveTypes.RecWrapCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecWrap.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecWrap unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecWrap.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesRecursiveTypes.RecWrapCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesRecursiveTypes.RecWrapCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecWrap.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecWrap gron: " + e.getMessage()); failed++; }
    }

    static void testModelRecWide() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecWide.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesRecursiveTypes.RecWideCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesRecursiveTypes.RecWideCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecWide.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecWide mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecWide.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesRecursiveTypes.RecWideCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesRecursiveTypes.RecWideCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecWide.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecWide json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecWide.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesRecursiveTypes.RecWideCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesRecursiveTypes.RecWideCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecWide.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecWide unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecWide.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesRecursiveTypes.RecWideCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesRecursiveTypes.RecWideCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecWide.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecWide gron: " + e.getMessage()); failed++; }
    }

}
