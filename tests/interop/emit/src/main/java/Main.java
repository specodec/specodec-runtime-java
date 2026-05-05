package emit_java;

import specodec.*;
import all_types_nested_deep.*;
import all_types_nested.*;
import all_types.*;

public class Main {
    static String vecDir = System.getenv("VEC_DIR");
    static String outDir = System.getenv("OUT_DIR");
    static int passed = 0;
    static int failed = 0;

    static void testScalarInt8_min() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/int8_min.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readInt32();
            MsgPackWriter w = new MsgPackWriter();
            w.writeInt32(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/int8_min.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL int8_min mp: " + e.getMessage()); failed++; }
    }

    static void testScalarInt8_max() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/int8_max.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readInt32();
            MsgPackWriter w = new MsgPackWriter();
            w.writeInt32(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/int8_max.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL int8_max mp: " + e.getMessage()); failed++; }
    }

    static void testScalarInt16_min() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/int16_min.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readInt32();
            MsgPackWriter w = new MsgPackWriter();
            w.writeInt32(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/int16_min.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL int16_min mp: " + e.getMessage()); failed++; }
    }

    static void testScalarInt16_max() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/int16_max.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readInt32();
            MsgPackWriter w = new MsgPackWriter();
            w.writeInt32(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/int16_max.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL int16_max mp: " + e.getMessage()); failed++; }
    }

    static void testScalarInt32_min() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/int32_min.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readInt32();
            MsgPackWriter w = new MsgPackWriter();
            w.writeInt32(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/int32_min.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL int32_min mp: " + e.getMessage()); failed++; }
    }

    static void testScalarInt32_max() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/int32_max.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readInt32();
            MsgPackWriter w = new MsgPackWriter();
            w.writeInt32(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/int32_max.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL int32_max mp: " + e.getMessage()); failed++; }
    }

    static void testScalarInt64_min() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/int64_min.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readInt64();
            MsgPackWriter w = new MsgPackWriter();
            w.writeInt64(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/int64_min.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL int64_min mp: " + e.getMessage()); failed++; }
    }

    static void testScalarInt64_max() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/int64_max.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readInt64();
            MsgPackWriter w = new MsgPackWriter();
            w.writeInt64(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/int64_max.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL int64_max mp: " + e.getMessage()); failed++; }
    }

    static void testScalarUint8_max() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/uint8_max.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readUint32();
            MsgPackWriter w = new MsgPackWriter();
            w.writeUint32(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/uint8_max.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL uint8_max mp: " + e.getMessage()); failed++; }
    }

    static void testScalarUint16_max() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/uint16_max.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readUint32();
            MsgPackWriter w = new MsgPackWriter();
            w.writeUint32(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/uint16_max.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL uint16_max mp: " + e.getMessage()); failed++; }
    }

    static void testScalarUint32_max() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/uint32_max.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readUint32();
            MsgPackWriter w = new MsgPackWriter();
            w.writeUint32(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/uint32_max.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL uint32_max mp: " + e.getMessage()); failed++; }
    }

    static void testScalarUint64_max() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/uint64_max.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readUint64();
            MsgPackWriter w = new MsgPackWriter();
            w.writeUint64(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/uint64_max.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL uint64_max mp: " + e.getMessage()); failed++; }
    }

    static void testScalarFloat32_1_5() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/float32_1.5.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readFloat32();
            MsgPackWriter w = new MsgPackWriter();
            w.writeFloat32(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/float32_1.5.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL float32_1.5 mp: " + e.getMessage()); failed++; }
    }

    static void testScalarFloat32_neg_zero() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/float32_neg_zero.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readFloat32();
            MsgPackWriter w = new MsgPackWriter();
            w.writeFloat32(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/float32_neg_zero.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL float32_neg_zero mp: " + e.getMessage()); failed++; }
    }

    static void testScalarFloat32_inf() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/float32_inf.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readFloat32();
            MsgPackWriter w = new MsgPackWriter();
            w.writeFloat32(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/float32_inf.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL float32_inf mp: " + e.getMessage()); failed++; }
    }

    static void testScalarFloat32_neg_inf() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/float32_neg_inf.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readFloat32();
            MsgPackWriter w = new MsgPackWriter();
            w.writeFloat32(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/float32_neg_inf.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL float32_neg_inf mp: " + e.getMessage()); failed++; }
    }

    static void testScalarFloat32_nan() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/float32_nan.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readFloat32();
            MsgPackWriter w = new MsgPackWriter();
            w.writeFloat32(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/float32_nan.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL float32_nan mp: " + e.getMessage()); failed++; }
    }

    static void testScalarFloat64_pi() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/float64_pi.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readFloat64();
            MsgPackWriter w = new MsgPackWriter();
            w.writeFloat64(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/float64_pi.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL float64_pi mp: " + e.getMessage()); failed++; }
    }

    static void testScalarFloat64_neg_zero() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/float64_neg_zero.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readFloat64();
            MsgPackWriter w = new MsgPackWriter();
            w.writeFloat64(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/float64_neg_zero.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL float64_neg_zero mp: " + e.getMessage()); failed++; }
    }

    static void testScalarFloat64_inf() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/float64_inf.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readFloat64();
            MsgPackWriter w = new MsgPackWriter();
            w.writeFloat64(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/float64_inf.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL float64_inf mp: " + e.getMessage()); failed++; }
    }

    static void testScalarFloat64_neg_inf() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/float64_neg_inf.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readFloat64();
            MsgPackWriter w = new MsgPackWriter();
            w.writeFloat64(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/float64_neg_inf.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL float64_neg_inf mp: " + e.getMessage()); failed++; }
    }

    static void testScalarFloat64_nan() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/float64_nan.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readFloat64();
            MsgPackWriter w = new MsgPackWriter();
            w.writeFloat64(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/float64_nan.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL float64_nan mp: " + e.getMessage()); failed++; }
    }

    static void testScalarStr_empty() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/str_empty.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readString();
            MsgPackWriter w = new MsgPackWriter();
            w.writeString(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/str_empty.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL str_empty mp: " + e.getMessage()); failed++; }
    }

    static void testScalarStr_ascii() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/str_ascii.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readString();
            MsgPackWriter w = new MsgPackWriter();
            w.writeString(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/str_ascii.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL str_ascii mp: " + e.getMessage()); failed++; }
    }

    static void testScalarStr_null_byte() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/str_null_byte.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readString();
            MsgPackWriter w = new MsgPackWriter();
            w.writeString(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/str_null_byte.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL str_null_byte mp: " + e.getMessage()); failed++; }
    }

    static void testScalarStr_escape() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/str_escape.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readString();
            MsgPackWriter w = new MsgPackWriter();
            w.writeString(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/str_escape.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL str_escape mp: " + e.getMessage()); failed++; }
    }

    static void testScalarStr_unicode() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/str_unicode.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readString();
            MsgPackWriter w = new MsgPackWriter();
            w.writeString(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/str_unicode.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL str_unicode mp: " + e.getMessage()); failed++; }
    }

    static void testScalarStr_31() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/str_31.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readString();
            MsgPackWriter w = new MsgPackWriter();
            w.writeString(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/str_31.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL str_31 mp: " + e.getMessage()); failed++; }
    }

    static void testScalarStr_32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/str_32.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readString();
            MsgPackWriter w = new MsgPackWriter();
            w.writeString(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/str_32.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL str_32 mp: " + e.getMessage()); failed++; }
    }

    static void testScalarStr_255() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/str_255.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readString();
            MsgPackWriter w = new MsgPackWriter();
            w.writeString(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/str_255.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL str_255 mp: " + e.getMessage()); failed++; }
    }

    static void testScalarStr_256() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/str_256.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readString();
            MsgPackWriter w = new MsgPackWriter();
            w.writeString(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/str_256.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL str_256 mp: " + e.getMessage()); failed++; }
    }

    static void testScalarBytes_empty() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/bytes_empty.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readBytes();
            MsgPackWriter w = new MsgPackWriter();
            w.writeBytes(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/bytes_empty.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL bytes_empty mp: " + e.getMessage()); failed++; }
    }

    static void testScalarBytes_small() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/bytes_small.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readBytes();
            MsgPackWriter w = new MsgPackWriter();
            w.writeBytes(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/bytes_small.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL bytes_small mp: " + e.getMessage()); failed++; }
    }

    static void testScalarBytes_31() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/bytes_31.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readBytes();
            MsgPackWriter w = new MsgPackWriter();
            w.writeBytes(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/bytes_31.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL bytes_31 mp: " + e.getMessage()); failed++; }
    }

    static void testScalarBytes_32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/bytes_32.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readBytes();
            MsgPackWriter w = new MsgPackWriter();
            w.writeBytes(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/bytes_32.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL bytes_32 mp: " + e.getMessage()); failed++; }
    }

    static void testScalarBytes_255() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/bytes_255.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readBytes();
            MsgPackWriter w = new MsgPackWriter();
            w.writeBytes(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/bytes_255.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL bytes_255 mp: " + e.getMessage()); failed++; }
    }

    static void testScalarBytes_256() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/bytes_256.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readBytes();
            MsgPackWriter w = new MsgPackWriter();
            w.writeBytes(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/bytes_256.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL bytes_256 mp: " + e.getMessage()); failed++; }
    }

    static void testScalarBytes_zeros() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/bytes_zeros.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readBytes();
            MsgPackWriter w = new MsgPackWriter();
            w.writeBytes(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/bytes_zeros.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL bytes_zeros mp: " + e.getMessage()); failed++; }
    }

    static void testScalarBytes_ff() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/bytes_ff.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readBytes();
            MsgPackWriter w = new MsgPackWriter();
            w.writeBytes(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/bytes_ff.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL bytes_ff mp: " + e.getMessage()); failed++; }
    }

    static void testScalarBool_true() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/bool_true.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readBool();
            MsgPackWriter w = new MsgPackWriter();
            w.writeBool(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/bool_true.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL bool_true mp: " + e.getMessage()); failed++; }
    }

    static void testScalarBool_false() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "scalars/bool_false.mp"));
            MsgPackReader r = new MsgPackReader(data);
            var value = r.readBool();
            MsgPackWriter w = new MsgPackWriter();
            w.writeBool(value);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir, "scalars"));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "scalars/bool_false.mp"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL bool_false mp: " + e.getMessage()); failed++; }
    }


    public static void main(String[] args) {
        testScalarInt8_min();
        testScalarInt8_max();
        testScalarInt16_min();
        testScalarInt16_max();
        testScalarInt32_min();
        testScalarInt32_max();
        testScalarInt64_min();
        testScalarInt64_max();
        testScalarUint8_max();
        testScalarUint16_max();
        testScalarUint32_max();
        testScalarUint64_max();
        testScalarFloat32_1_5();
        testScalarFloat32_neg_zero();
        testScalarFloat32_inf();
        testScalarFloat32_neg_inf();
        testScalarFloat32_nan();
        testScalarFloat64_pi();
        testScalarFloat64_neg_zero();
        testScalarFloat64_inf();
        testScalarFloat64_neg_inf();
        testScalarFloat64_nan();
        testScalarStr_empty();
        testScalarStr_ascii();
        testScalarStr_null_byte();
        testScalarStr_escape();
        testScalarStr_unicode();
        testScalarStr_31();
        testScalarStr_32();
        testScalarStr_255();
        testScalarStr_256();
        testScalarBytes_empty();
        testScalarBytes_small();
        testScalarBytes_31();
        testScalarBytes_32();
        testScalarBytes_255();
        testScalarBytes_256();
        testScalarBytes_zeros();
        testScalarBytes_ff();
        testScalarBool_true();
        testScalarBool_false();

        int[] r_all_types = TestAllTypes.run(vecDir, outDir); passed += r_all_types[0]; failed += r_all_types[1];
        int[] r_all_types_nested = TestAllTypesNested.run(vecDir, outDir); passed += r_all_types_nested[0]; failed += r_all_types_nested[1];
        int[] r_all_types_nested_deep = TestAllTypesNestedDeep.run(vecDir, outDir); passed += r_all_types_nested_deep[0]; failed += r_all_types_nested_deep[1];

        System.out.println("emit-java: " + passed + " passed, " + failed + " failed");
        if (failed > 0) System.exit(1);
    }
}
