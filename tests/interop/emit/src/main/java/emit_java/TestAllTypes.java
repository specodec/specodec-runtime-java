package emit_java;

import specodec.*;
import all_types.*;
import all_types_unions.*;

public class TestAllTypes {
    static String vecDir;
    static String outDir;
    static int passed = 0;
    static int failed = 0;

    public static int[] run(String vd, String od) {
        vecDir = vd;
        outDir = od;
        passed = 0;
        failed = 0;
        testModelOptInner();
        testModelShape_circle();
        testModelShape_rect();
        testModelIdent_name();
        testModelIdent_number();
        testModelResultMsg_ok();
        testModelResultMsg_err();
        testModelTagged_tag();
        testModelTagged_score();
        testModelTagged_active();
        testModelOptUnionHolder_shape();
        testModelOptUnionHolder_id();
        testModelMixedUnion_point();
        testModelMixedUnion_label();
        testModelMixedUnion_count();
        testModelNestedUnion_result();
        testModelNestedUnion_shape();
        testModelScalarUnion_s();
        testModelScalarUnion_i();
        testModelScalarUnion_f();
        testModelScalarUnion_b();

        return new int[] { passed, failed };
    }

    static void testModelOptInner() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptInner.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptInnerCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptInnerCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptInner.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptInner mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptInner.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptInnerCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptInnerCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptInner.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptInner json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptInner.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptInnerCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptInnerCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptInner.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptInner unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptInner.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptInnerCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptInnerCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptInner.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptInner gron: " + e.getMessage()); failed++; }
    }

    static void testModelShape_circle() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Shape_circle.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.ShapeCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.ShapeCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Shape_circle.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Shape_circle mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Shape_circle.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.ShapeCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.ShapeCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Shape_circle.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Shape_circle json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Shape_circle.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.ShapeCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.ShapeCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Shape_circle.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Shape_circle unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Shape_circle.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.ShapeCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.ShapeCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Shape_circle.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Shape_circle gron: " + e.getMessage()); failed++; }
    }

    static void testModelShape_rect() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Shape_rect.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.ShapeCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.ShapeCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Shape_rect.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Shape_rect mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Shape_rect.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.ShapeCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.ShapeCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Shape_rect.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Shape_rect json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Shape_rect.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.ShapeCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.ShapeCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Shape_rect.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Shape_rect unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Shape_rect.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.ShapeCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.ShapeCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Shape_rect.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Shape_rect gron: " + e.getMessage()); failed++; }
    }

    static void testModelIdent_name() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ident_name.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.IdentCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.IdentCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ident_name.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ident_name mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ident_name.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.IdentCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.IdentCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ident_name.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ident_name json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ident_name.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.IdentCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.IdentCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ident_name.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ident_name unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ident_name.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.IdentCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.IdentCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ident_name.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ident_name gron: " + e.getMessage()); failed++; }
    }

    static void testModelIdent_number() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ident_number.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.IdentCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.IdentCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ident_number.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ident_number mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ident_number.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.IdentCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.IdentCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ident_number.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ident_number json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ident_number.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.IdentCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.IdentCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ident_number.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ident_number unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ident_number.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.IdentCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.IdentCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ident_number.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ident_number gron: " + e.getMessage()); failed++; }
    }

    static void testModelResultMsg_ok() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ResultMsg_ok.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.ResultMsgCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.ResultMsgCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ResultMsg_ok.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ResultMsg_ok mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ResultMsg_ok.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.ResultMsgCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.ResultMsgCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ResultMsg_ok.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ResultMsg_ok json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ResultMsg_ok.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.ResultMsgCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.ResultMsgCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ResultMsg_ok.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ResultMsg_ok unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ResultMsg_ok.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.ResultMsgCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.ResultMsgCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ResultMsg_ok.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ResultMsg_ok gron: " + e.getMessage()); failed++; }
    }

    static void testModelResultMsg_err() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ResultMsg_err.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.ResultMsgCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.ResultMsgCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ResultMsg_err.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ResultMsg_err mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ResultMsg_err.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.ResultMsgCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.ResultMsgCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ResultMsg_err.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ResultMsg_err json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ResultMsg_err.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.ResultMsgCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.ResultMsgCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ResultMsg_err.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ResultMsg_err unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ResultMsg_err.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.ResultMsgCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.ResultMsgCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ResultMsg_err.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ResultMsg_err gron: " + e.getMessage()); failed++; }
    }

    static void testModelTagged_tag() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Tagged_tag.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.TaggedCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.TaggedCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Tagged_tag.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Tagged_tag mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Tagged_tag.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.TaggedCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.TaggedCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Tagged_tag.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Tagged_tag json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Tagged_tag.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.TaggedCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.TaggedCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Tagged_tag.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Tagged_tag unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Tagged_tag.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.TaggedCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.TaggedCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Tagged_tag.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Tagged_tag gron: " + e.getMessage()); failed++; }
    }

    static void testModelTagged_score() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Tagged_score.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.TaggedCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.TaggedCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Tagged_score.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Tagged_score mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Tagged_score.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.TaggedCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.TaggedCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Tagged_score.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Tagged_score json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Tagged_score.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.TaggedCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.TaggedCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Tagged_score.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Tagged_score unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Tagged_score.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.TaggedCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.TaggedCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Tagged_score.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Tagged_score gron: " + e.getMessage()); failed++; }
    }

    static void testModelTagged_active() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Tagged_active.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.TaggedCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.TaggedCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Tagged_active.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Tagged_active mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Tagged_active.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.TaggedCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.TaggedCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Tagged_active.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Tagged_active json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Tagged_active.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.TaggedCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.TaggedCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Tagged_active.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Tagged_active unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Tagged_active.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.TaggedCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.TaggedCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Tagged_active.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Tagged_active gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptUnionHolder_shape() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptUnionHolder_shape.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.OptUnionHolderCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.OptUnionHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptUnionHolder_shape.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptUnionHolder_shape mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptUnionHolder_shape.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.OptUnionHolderCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.OptUnionHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptUnionHolder_shape.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptUnionHolder_shape json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptUnionHolder_shape.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.OptUnionHolderCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.OptUnionHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptUnionHolder_shape.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptUnionHolder_shape unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptUnionHolder_shape.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.OptUnionHolderCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.OptUnionHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptUnionHolder_shape.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptUnionHolder_shape gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptUnionHolder_id() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptUnionHolder_id.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.OptUnionHolderCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.OptUnionHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptUnionHolder_id.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptUnionHolder_id mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptUnionHolder_id.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.OptUnionHolderCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.OptUnionHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptUnionHolder_id.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptUnionHolder_id json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptUnionHolder_id.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.OptUnionHolderCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.OptUnionHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptUnionHolder_id.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptUnionHolder_id unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptUnionHolder_id.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.OptUnionHolderCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.OptUnionHolderCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptUnionHolder_id.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptUnionHolder_id gron: " + e.getMessage()); failed++; }
    }

    static void testModelMixedUnion_point() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MixedUnion_point.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.MixedUnionCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.MixedUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MixedUnion_point.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MixedUnion_point mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MixedUnion_point.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.MixedUnionCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.MixedUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MixedUnion_point.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MixedUnion_point json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MixedUnion_point.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.MixedUnionCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.MixedUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MixedUnion_point.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MixedUnion_point unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MixedUnion_point.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.MixedUnionCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.MixedUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MixedUnion_point.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MixedUnion_point gron: " + e.getMessage()); failed++; }
    }

    static void testModelMixedUnion_label() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MixedUnion_label.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.MixedUnionCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.MixedUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MixedUnion_label.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MixedUnion_label mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MixedUnion_label.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.MixedUnionCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.MixedUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MixedUnion_label.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MixedUnion_label json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MixedUnion_label.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.MixedUnionCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.MixedUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MixedUnion_label.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MixedUnion_label unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MixedUnion_label.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.MixedUnionCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.MixedUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MixedUnion_label.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MixedUnion_label gron: " + e.getMessage()); failed++; }
    }

    static void testModelMixedUnion_count() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MixedUnion_count.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.MixedUnionCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.MixedUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MixedUnion_count.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MixedUnion_count mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MixedUnion_count.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.MixedUnionCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.MixedUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MixedUnion_count.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MixedUnion_count json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MixedUnion_count.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.MixedUnionCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.MixedUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MixedUnion_count.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MixedUnion_count unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MixedUnion_count.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.MixedUnionCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.MixedUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MixedUnion_count.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MixedUnion_count gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestedUnion_result() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestedUnion_result.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.NestedUnionCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.NestedUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestedUnion_result.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestedUnion_result mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestedUnion_result.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.NestedUnionCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.NestedUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestedUnion_result.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestedUnion_result json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestedUnion_result.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.NestedUnionCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.NestedUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestedUnion_result.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestedUnion_result unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestedUnion_result.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.NestedUnionCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.NestedUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestedUnion_result.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestedUnion_result gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestedUnion_shape() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestedUnion_shape.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.NestedUnionCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.NestedUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestedUnion_shape.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestedUnion_shape mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestedUnion_shape.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.NestedUnionCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.NestedUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestedUnion_shape.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestedUnion_shape json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestedUnion_shape.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.NestedUnionCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.NestedUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestedUnion_shape.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestedUnion_shape unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestedUnion_shape.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.NestedUnionCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.NestedUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestedUnion_shape.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestedUnion_shape gron: " + e.getMessage()); failed++; }
    }

    static void testModelScalarUnion_s() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ScalarUnion_s.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.ScalarUnionCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.ScalarUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ScalarUnion_s.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ScalarUnion_s mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ScalarUnion_s.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.ScalarUnionCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.ScalarUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ScalarUnion_s.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ScalarUnion_s json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ScalarUnion_s.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.ScalarUnionCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.ScalarUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ScalarUnion_s.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ScalarUnion_s unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ScalarUnion_s.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.ScalarUnionCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.ScalarUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ScalarUnion_s.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ScalarUnion_s gron: " + e.getMessage()); failed++; }
    }

    static void testModelScalarUnion_i() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ScalarUnion_i.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.ScalarUnionCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.ScalarUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ScalarUnion_i.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ScalarUnion_i mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ScalarUnion_i.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.ScalarUnionCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.ScalarUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ScalarUnion_i.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ScalarUnion_i json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ScalarUnion_i.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.ScalarUnionCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.ScalarUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ScalarUnion_i.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ScalarUnion_i unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ScalarUnion_i.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.ScalarUnionCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.ScalarUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ScalarUnion_i.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ScalarUnion_i gron: " + e.getMessage()); failed++; }
    }

    static void testModelScalarUnion_f() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ScalarUnion_f.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.ScalarUnionCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.ScalarUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ScalarUnion_f.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ScalarUnion_f mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ScalarUnion_f.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.ScalarUnionCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.ScalarUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ScalarUnion_f.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ScalarUnion_f json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ScalarUnion_f.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.ScalarUnionCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.ScalarUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ScalarUnion_f.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ScalarUnion_f unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ScalarUnion_f.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.ScalarUnionCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.ScalarUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ScalarUnion_f.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ScalarUnion_f gron: " + e.getMessage()); failed++; }
    }

    static void testModelScalarUnion_b() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ScalarUnion_b.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesUnionsTypes.ScalarUnionCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesUnionsTypes.ScalarUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ScalarUnion_b.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ScalarUnion_b mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ScalarUnion_b.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.ScalarUnionCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.ScalarUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ScalarUnion_b.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ScalarUnion_b json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ScalarUnion_b.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesUnionsTypes.ScalarUnionCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesUnionsTypes.ScalarUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ScalarUnion_b.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ScalarUnion_b unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ScalarUnion_b.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesUnionsTypes.ScalarUnionCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesUnionsTypes.ScalarUnionCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ScalarUnion_b.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ScalarUnion_b gron: " + e.getMessage()); failed++; }
    }

}
