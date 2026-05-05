package emit_java;

import specodec.*;
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

    static void testModelSingleString() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleString.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.SingleStringCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.SingleStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleString.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleString mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleString.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleStringCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleString.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleString json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleString.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleStringCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleString.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleString unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleString.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.SingleStringCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.SingleStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleString.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleString gron: " + e.getMessage()); failed++; }
    }

    static void testModelSingleBoolean() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleBoolean.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.SingleBooleanCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.SingleBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleBoolean.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleBoolean mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleBoolean.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleBooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleBoolean.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleBoolean json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleBoolean.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleBooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleBoolean.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleBoolean unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleBoolean.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.SingleBooleanCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.SingleBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleBoolean.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleBoolean gron: " + e.getMessage()); failed++; }
    }

    static void testModelSingleInt8() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt8.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.SingleInt8Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.SingleInt8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt8.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt8 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt8.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleInt8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleInt8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt8.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt8 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt8.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleInt8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleInt8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt8.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt8 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt8.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.SingleInt8Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.SingleInt8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt8.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt8 gron: " + e.getMessage()); failed++; }
    }

    static void testModelSingleInt16() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt16.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.SingleInt16Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.SingleInt16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt16.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt16 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt16.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleInt16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleInt16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt16.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt16 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt16.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleInt16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleInt16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt16.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt16 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt16.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.SingleInt16Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.SingleInt16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt16.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt16 gron: " + e.getMessage()); failed++; }
    }

    static void testModelSingleInt32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.SingleInt32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.SingleInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleInt32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleInt32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.SingleInt32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.SingleInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelSingleInt64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.SingleInt64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.SingleInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleInt64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleInt64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleInt64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.SingleInt64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.SingleInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleInt64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleInt64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelSingleUint8() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint8.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.SingleUint8Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.SingleUint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint8.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint8 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint8.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleUint8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleUint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint8.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint8 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint8.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleUint8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleUint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint8.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint8 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint8.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.SingleUint8Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.SingleUint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint8.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint8 gron: " + e.getMessage()); failed++; }
    }

    static void testModelSingleUint16() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint16.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.SingleUint16Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.SingleUint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint16.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint16 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint16.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleUint16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleUint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint16.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint16 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint16.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleUint16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleUint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint16.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint16 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint16.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.SingleUint16Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.SingleUint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint16.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint16 gron: " + e.getMessage()); failed++; }
    }

    static void testModelSingleUint32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.SingleUint32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.SingleUint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleUint32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleUint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleUint32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleUint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.SingleUint32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.SingleUint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelSingleUint64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.SingleUint64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.SingleUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleUint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleUint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleUint64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.SingleUint64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.SingleUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleUint64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleUint64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelSingleFloat32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleFloat32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.SingleFloat32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.SingleFloat32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleFloat32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleFloat32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleFloat32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleFloat32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleFloat32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleFloat32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleFloat32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleFloat32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleFloat32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleFloat32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleFloat32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleFloat32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleFloat32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.SingleFloat32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.SingleFloat32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleFloat32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleFloat32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelSingleFloat64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleFloat64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.SingleFloat64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.SingleFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleFloat64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleFloat64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleFloat64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleFloat64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleFloat64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleFloat64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleFloat64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleFloat64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleFloat64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleFloat64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleFloat64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.SingleFloat64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.SingleFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleFloat64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleFloat64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelSingleBytes() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleBytes.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.SingleBytesCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.SingleBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleBytes.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleBytes mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleBytes.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleBytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleBytes.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleBytes json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleBytes.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.SingleBytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.SingleBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleBytes.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleBytes unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "SingleBytes.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.SingleBytesCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.SingleBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "SingleBytes.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL SingleBytes gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleString() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleString.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptSingleStringCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptSingleStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleString.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleString mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleString.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleStringCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleString.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleString json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleString.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleStringCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleString.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleString unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleString.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptSingleStringCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptSingleStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleString.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleString gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleBoolean() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleBoolean.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptSingleBooleanCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptSingleBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleBoolean.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleBoolean mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleBoolean.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleBooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleBoolean.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleBoolean json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleBoolean.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleBooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleBoolean.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleBoolean unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleBoolean.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptSingleBooleanCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptSingleBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleBoolean.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleBoolean gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleInt8() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt8.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptSingleInt8Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptSingleInt8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt8.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt8 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt8.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleInt8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleInt8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt8.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt8 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt8.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleInt8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleInt8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt8.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt8 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt8.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptSingleInt8Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptSingleInt8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt8.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt8 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleInt16() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt16.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptSingleInt16Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptSingleInt16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt16.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt16 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt16.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleInt16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleInt16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt16.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt16 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt16.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleInt16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleInt16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt16.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt16 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt16.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptSingleInt16Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptSingleInt16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt16.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt16 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleInt32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptSingleInt32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptSingleInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleInt32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleInt32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptSingleInt32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptSingleInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleInt64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptSingleInt64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptSingleInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleInt64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleInt64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleInt64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptSingleInt64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptSingleInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleInt64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleInt64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleUint8() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint8.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptSingleUint8Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptSingleUint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint8.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint8 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint8.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleUint8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleUint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint8.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint8 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint8.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleUint8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleUint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint8.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint8 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint8.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptSingleUint8Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptSingleUint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint8.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint8 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleUint16() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint16.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptSingleUint16Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptSingleUint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint16.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint16 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint16.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleUint16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleUint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint16.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint16 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint16.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleUint16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleUint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint16.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint16 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint16.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptSingleUint16Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptSingleUint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint16.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint16 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleUint32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptSingleUint32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptSingleUint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleUint32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleUint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleUint32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleUint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptSingleUint32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptSingleUint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleUint64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptSingleUint64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptSingleUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleUint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleUint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleUint64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptSingleUint64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptSingleUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleUint64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleUint64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleFloat32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleFloat32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptSingleFloat32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptSingleFloat32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleFloat32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleFloat32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleFloat32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleFloat32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleFloat32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleFloat32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleFloat32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleFloat32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleFloat32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleFloat32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleFloat32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleFloat32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleFloat32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptSingleFloat32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptSingleFloat32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleFloat32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleFloat32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleFloat64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleFloat64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptSingleFloat64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptSingleFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleFloat64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleFloat64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleFloat64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleFloat64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleFloat64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleFloat64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleFloat64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleFloat64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleFloat64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleFloat64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleFloat64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptSingleFloat64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptSingleFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleFloat64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleFloat64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptSingleBytes() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleBytes.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptSingleBytesCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptSingleBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleBytes.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleBytes mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleBytes.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleBytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleBytes.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleBytes json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleBytes.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptSingleBytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptSingleBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleBytes.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleBytes unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptSingleBytes.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptSingleBytesCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptSingleBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptSingleBytes.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptSingleBytes gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairString() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairString.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.PairStringCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.PairStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairString.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairString mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairString.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairStringCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairString.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairString json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairString.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairStringCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairString.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairString unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairString.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.PairStringCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.PairStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairString.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairString gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairBoolean() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairBoolean.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.PairBooleanCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.PairBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairBoolean.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairBoolean mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairBoolean.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairBooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairBoolean.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairBoolean json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairBoolean.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairBooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairBoolean.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairBoolean unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairBoolean.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.PairBooleanCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.PairBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairBoolean.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairBoolean gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairInt8() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt8.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.PairInt8Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.PairInt8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt8.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt8 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt8.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairInt8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairInt8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt8.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt8 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt8.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairInt8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairInt8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt8.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt8 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt8.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.PairInt8Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.PairInt8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt8.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt8 gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairInt16() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt16.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.PairInt16Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.PairInt16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt16.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt16 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt16.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairInt16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairInt16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt16.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt16 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt16.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairInt16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairInt16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt16.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt16 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt16.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.PairInt16Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.PairInt16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt16.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt16 gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairInt32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.PairInt32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.PairInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairInt32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairInt32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.PairInt32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.PairInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairInt64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.PairInt64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.PairInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairInt64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairInt64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairInt64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.PairInt64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.PairInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairInt64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairInt64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairUint8() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint8.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.PairUint8Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.PairUint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint8.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint8 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint8.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairUint8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairUint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint8.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint8 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint8.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairUint8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairUint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint8.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint8 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint8.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.PairUint8Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.PairUint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint8.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint8 gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairUint16() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint16.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.PairUint16Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.PairUint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint16.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint16 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint16.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairUint16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairUint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint16.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint16 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint16.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairUint16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairUint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint16.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint16 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint16.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.PairUint16Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.PairUint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint16.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint16 gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairUint32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.PairUint32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.PairUint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairUint32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairUint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairUint32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairUint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.PairUint32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.PairUint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairUint64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.PairUint64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.PairUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairUint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairUint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairUint64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.PairUint64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.PairUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairUint64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairUint64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairFloat32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairFloat32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.PairFloat32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.PairFloat32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairFloat32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairFloat32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairFloat32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairFloat32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairFloat32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairFloat32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairFloat32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairFloat32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairFloat32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairFloat32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairFloat32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairFloat32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairFloat32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.PairFloat32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.PairFloat32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairFloat32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairFloat32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairFloat64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairFloat64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.PairFloat64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.PairFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairFloat64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairFloat64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairFloat64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairFloat64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairFloat64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairFloat64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairFloat64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairFloat64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairFloat64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairFloat64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairFloat64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.PairFloat64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.PairFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairFloat64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairFloat64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelPairBytes() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairBytes.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.PairBytesCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.PairBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairBytes.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairBytes mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairBytes.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairBytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairBytes.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairBytes json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairBytes.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.PairBytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.PairBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairBytes.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairBytes unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "PairBytes.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.PairBytesCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.PairBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "PairBytes.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL PairBytes gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualStringInt32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringInt32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualStringInt32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualStringInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringInt32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringInt32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringInt32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualStringInt32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualStringInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringInt32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringInt32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringInt32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualStringInt32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualStringInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringInt32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringInt32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringInt32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualStringInt32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualStringInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringInt32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringInt32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualStringBoolean() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringBoolean.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualStringBooleanCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualStringBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringBoolean.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringBoolean mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringBoolean.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualStringBooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualStringBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringBoolean.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringBoolean json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringBoolean.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualStringBooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualStringBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringBoolean.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringBoolean unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringBoolean.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualStringBooleanCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualStringBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringBoolean.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringBoolean gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualStringFloat64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringFloat64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualStringFloat64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualStringFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringFloat64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringFloat64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringFloat64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualStringFloat64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualStringFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringFloat64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringFloat64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringFloat64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualStringFloat64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualStringFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringFloat64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringFloat64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringFloat64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualStringFloat64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualStringFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringFloat64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringFloat64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualStringBytes() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringBytes.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualStringBytesCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualStringBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringBytes.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringBytes mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringBytes.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualStringBytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualStringBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringBytes.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringBytes json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringBytes.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualStringBytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualStringBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringBytes.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringBytes unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringBytes.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualStringBytesCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualStringBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringBytes.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringBytes gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualInt32Boolean() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Boolean.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualInt32BooleanCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualInt32BooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Boolean.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Boolean mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Boolean.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualInt32BooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualInt32BooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Boolean.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Boolean json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Boolean.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualInt32BooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualInt32BooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Boolean.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Boolean unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Boolean.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualInt32BooleanCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualInt32BooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Boolean.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Boolean gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualInt32Float64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Float64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualInt32Float64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualInt32Float64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Float64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Float64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Float64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualInt32Float64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualInt32Float64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Float64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Float64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Float64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualInt32Float64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualInt32Float64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Float64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Float64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Float64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualInt32Float64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualInt32Float64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Float64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Float64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualInt32Int64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Int64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualInt32Int64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualInt32Int64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Int64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Int64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Int64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualInt32Int64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualInt32Int64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Int64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Int64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Int64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualInt32Int64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualInt32Int64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Int64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Int64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Int64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualInt32Int64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualInt32Int64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Int64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Int64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualInt32Uint32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Uint32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualInt32Uint32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualInt32Uint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Uint32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Uint32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Uint32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualInt32Uint32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualInt32Uint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Uint32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Uint32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Uint32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualInt32Uint32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualInt32Uint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Uint32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Uint32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Uint32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualInt32Uint32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualInt32Uint32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Uint32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Uint32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualInt64Uint64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt64Uint64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualInt64Uint64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualInt64Uint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt64Uint64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt64Uint64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt64Uint64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualInt64Uint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualInt64Uint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt64Uint64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt64Uint64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt64Uint64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualInt64Uint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualInt64Uint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt64Uint64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt64Uint64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt64Uint64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualInt64Uint64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualInt64Uint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt64Uint64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt64Uint64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualFloat32Float64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat32Float64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualFloat32Float64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualFloat32Float64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat32Float64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat32Float64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat32Float64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualFloat32Float64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualFloat32Float64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat32Float64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat32Float64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat32Float64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualFloat32Float64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualFloat32Float64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat32Float64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat32Float64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat32Float64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualFloat32Float64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualFloat32Float64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat32Float64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat32Float64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualFloat64Boolean() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat64Boolean.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualFloat64BooleanCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualFloat64BooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat64Boolean.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat64Boolean mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat64Boolean.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualFloat64BooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualFloat64BooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat64Boolean.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat64Boolean json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat64Boolean.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualFloat64BooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualFloat64BooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat64Boolean.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat64Boolean unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat64Boolean.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualFloat64BooleanCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualFloat64BooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat64Boolean.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat64Boolean gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualFloat64Bytes() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat64Bytes.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualFloat64BytesCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualFloat64BytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat64Bytes.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat64Bytes mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat64Bytes.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualFloat64BytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualFloat64BytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat64Bytes.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat64Bytes json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat64Bytes.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualFloat64BytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualFloat64BytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat64Bytes.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat64Bytes unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat64Bytes.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualFloat64BytesCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualFloat64BytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat64Bytes.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat64Bytes gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualUint32Uint64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualUint32Uint64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualUint32Uint64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualUint32Uint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualUint32Uint64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualUint32Uint64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualUint32Uint64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualUint32Uint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualUint32Uint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualUint32Uint64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualUint32Uint64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualUint32Uint64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualUint32Uint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualUint32Uint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualUint32Uint64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualUint32Uint64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualUint32Uint64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualUint32Uint64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualUint32Uint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualUint32Uint64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualUint32Uint64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualBooleanBytes() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualBooleanBytes.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualBooleanBytesCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualBooleanBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualBooleanBytes.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualBooleanBytes mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualBooleanBytes.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualBooleanBytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualBooleanBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualBooleanBytes.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualBooleanBytes json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualBooleanBytes.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualBooleanBytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualBooleanBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualBooleanBytes.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualBooleanBytes unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualBooleanBytes.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualBooleanBytesCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualBooleanBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualBooleanBytes.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualBooleanBytes gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualInt8Uint8() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt8Uint8.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualInt8Uint8Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualInt8Uint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt8Uint8.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt8Uint8 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt8Uint8.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualInt8Uint8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualInt8Uint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt8Uint8.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt8Uint8 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt8Uint8.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualInt8Uint8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualInt8Uint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt8Uint8.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt8Uint8 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt8Uint8.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualInt8Uint8Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualInt8Uint8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt8Uint8.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt8Uint8 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualInt16Uint16() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt16Uint16.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualInt16Uint16Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualInt16Uint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt16Uint16.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt16Uint16 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt16Uint16.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualInt16Uint16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualInt16Uint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt16Uint16.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt16Uint16 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt16Uint16.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualInt16Uint16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualInt16Uint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt16Uint16.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt16Uint16 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt16Uint16.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualInt16Uint16Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualInt16Uint16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt16Uint16.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt16Uint16 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualStringInt64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringInt64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualStringInt64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualStringInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringInt64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringInt64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringInt64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualStringInt64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualStringInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringInt64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringInt64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringInt64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualStringInt64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualStringInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringInt64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringInt64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringInt64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualStringInt64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualStringInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringInt64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringInt64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualStringUint64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringUint64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualStringUint64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualStringUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringUint64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringUint64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringUint64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualStringUint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualStringUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringUint64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringUint64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringUint64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualStringUint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualStringUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringUint64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringUint64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualStringUint64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualStringUint64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualStringUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualStringUint64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualStringUint64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualInt32Bytes() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Bytes.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualInt32BytesCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualInt32BytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Bytes.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Bytes mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Bytes.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualInt32BytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualInt32BytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Bytes.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Bytes json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Bytes.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualInt32BytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualInt32BytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Bytes.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Bytes unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt32Bytes.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualInt32BytesCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualInt32BytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt32Bytes.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt32Bytes gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualFloat64Int32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat64Int32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualFloat64Int32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualFloat64Int32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat64Int32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat64Int32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat64Int32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualFloat64Int32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualFloat64Int32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat64Int32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat64Int32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat64Int32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualFloat64Int32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualFloat64Int32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat64Int32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat64Int32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualFloat64Int32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualFloat64Int32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualFloat64Int32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualFloat64Int32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualFloat64Int32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualBooleanInt32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualBooleanInt32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualBooleanInt32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualBooleanInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualBooleanInt32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualBooleanInt32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualBooleanInt32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualBooleanInt32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualBooleanInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualBooleanInt32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualBooleanInt32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualBooleanInt32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualBooleanInt32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualBooleanInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualBooleanInt32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualBooleanInt32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualBooleanInt32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualBooleanInt32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualBooleanInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualBooleanInt32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualBooleanInt32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualBytesInt64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualBytesInt64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualBytesInt64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualBytesInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualBytesInt64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualBytesInt64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualBytesInt64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualBytesInt64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualBytesInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualBytesInt64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualBytesInt64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualBytesInt64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualBytesInt64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualBytesInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualBytesInt64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualBytesInt64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualBytesInt64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualBytesInt64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualBytesInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualBytesInt64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualBytesInt64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualInt8Float32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt8Float32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualInt8Float32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualInt8Float32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt8Float32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt8Float32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt8Float32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualInt8Float32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualInt8Float32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt8Float32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt8Float32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt8Float32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualInt8Float32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualInt8Float32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt8Float32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt8Float32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt8Float32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualInt8Float32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualInt8Float32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt8Float32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt8Float32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualUint8Int16() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualUint8Int16.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualUint8Int16Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualUint8Int16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualUint8Int16.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualUint8Int16 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualUint8Int16.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualUint8Int16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualUint8Int16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualUint8Int16.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualUint8Int16 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualUint8Int16.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualUint8Int16Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualUint8Int16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualUint8Int16.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualUint8Int16 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualUint8Int16.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualUint8Int16Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualUint8Int16Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualUint8Int16.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualUint8Int16 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualInt64Float64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt64Float64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualInt64Float64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualInt64Float64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt64Float64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt64Float64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt64Float64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualInt64Float64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualInt64Float64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt64Float64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt64Float64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt64Float64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualInt64Float64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualInt64Float64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt64Float64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt64Float64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualInt64Float64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualInt64Float64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualInt64Float64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualInt64Float64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualInt64Float64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDualUint64String() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualUint64String.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DualUint64StringCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DualUint64StringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualUint64String.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualUint64String mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualUint64String.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualUint64StringCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualUint64StringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualUint64String.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualUint64String json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualUint64String.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DualUint64StringCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DualUint64StringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualUint64String.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualUint64String unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DualUint64String.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DualUint64StringCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DualUint64StringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DualUint64String.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DualUint64String gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple01() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple01.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Triple01Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Triple01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple01.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple01 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple01.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple01Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple01.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple01 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple01.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple01Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple01.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple01 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple01.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Triple01Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Triple01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple01.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple01 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple02() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple02.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Triple02Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Triple02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple02.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple02 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple02.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple02Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple02.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple02 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple02.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple02Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple02.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple02 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple02.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Triple02Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Triple02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple02.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple02 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple03() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple03.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Triple03Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Triple03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple03.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple03 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple03.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple03Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple03.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple03 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple03.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple03Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple03.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple03 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple03.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Triple03Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Triple03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple03.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple03 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple04() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple04.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Triple04Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Triple04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple04.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple04 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple04.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple04Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple04.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple04 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple04.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple04Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple04.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple04 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple04.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Triple04Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Triple04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple04.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple04 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple05() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple05.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Triple05Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Triple05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple05.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple05 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple05.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple05Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple05.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple05 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple05.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple05Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple05.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple05 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple05.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Triple05Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Triple05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple05.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple05 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple06() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple06.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Triple06Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Triple06Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple06.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple06 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple06.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple06Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple06Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple06.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple06 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple06.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple06Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple06Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple06.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple06 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple06.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Triple06Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Triple06Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple06.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple06 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple07() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple07.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Triple07Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Triple07Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple07.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple07 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple07.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple07Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple07Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple07.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple07 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple07.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple07Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple07Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple07.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple07 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple07.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Triple07Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Triple07Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple07.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple07 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple08() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple08.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Triple08Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Triple08Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple08.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple08 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple08.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple08Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple08Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple08.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple08 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple08.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple08Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple08Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple08.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple08 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple08.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Triple08Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Triple08Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple08.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple08 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple09() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple09.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Triple09Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Triple09Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple09.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple09 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple09.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple09Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple09Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple09.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple09 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple09.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple09Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple09Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple09.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple09 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple09.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Triple09Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Triple09Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple09.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple09 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple10() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple10.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Triple10Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Triple10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple10.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple10 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple10.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple10Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple10.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple10 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple10.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple10Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple10.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple10 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple10.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Triple10Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Triple10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple10.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple10 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple11() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple11.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Triple11Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Triple11Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple11.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple11 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple11.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple11Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple11Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple11.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple11 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple11.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple11Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple11Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple11.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple11 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple11.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Triple11Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Triple11Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple11.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple11 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple12() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple12.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Triple12Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Triple12Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple12.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple12 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple12.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple12Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple12Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple12.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple12 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple12.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple12Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple12Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple12.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple12 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple12.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Triple12Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Triple12Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple12.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple12 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple13() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple13.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Triple13Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Triple13Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple13.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple13 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple13.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple13Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple13Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple13.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple13 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple13.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple13Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple13Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple13.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple13 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple13.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Triple13Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Triple13Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple13.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple13 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple14() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple14.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Triple14Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Triple14Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple14.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple14 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple14.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple14Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple14Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple14.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple14 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple14.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple14Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple14Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple14.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple14 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple14.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Triple14Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Triple14Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple14.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple14 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTriple15() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple15.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Triple15Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Triple15Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple15.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple15 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple15.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple15Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple15Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple15.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple15 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple15.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Triple15Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Triple15Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple15.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple15 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Triple15.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Triple15Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Triple15Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Triple15.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Triple15 gron: " + e.getMessage()); failed++; }
    }

    static void testModelFive01() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five01.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Five01Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Five01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five01.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five01 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five01.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Five01Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Five01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five01.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five01 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five01.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Five01Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Five01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five01.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five01 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five01.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Five01Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Five01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five01.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five01 gron: " + e.getMessage()); failed++; }
    }

    static void testModelFive02() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five02.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Five02Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Five02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five02.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five02 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five02.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Five02Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Five02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five02.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five02 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five02.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Five02Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Five02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five02.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five02 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five02.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Five02Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Five02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five02.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five02 gron: " + e.getMessage()); failed++; }
    }

    static void testModelFive03() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five03.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Five03Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Five03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five03.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five03 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five03.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Five03Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Five03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five03.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five03 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five03.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Five03Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Five03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five03.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five03 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five03.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Five03Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Five03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five03.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five03 gron: " + e.getMessage()); failed++; }
    }

    static void testModelFive04() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five04.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Five04Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Five04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five04.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five04 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five04.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Five04Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Five04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five04.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five04 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five04.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Five04Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Five04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five04.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five04 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five04.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Five04Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Five04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five04.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five04 gron: " + e.getMessage()); failed++; }
    }

    static void testModelFive05() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five05.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Five05Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Five05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five05.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five05 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five05.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Five05Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Five05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five05.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five05 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five05.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Five05Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Five05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five05.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five05 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five05.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Five05Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Five05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five05.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five05 gron: " + e.getMessage()); failed++; }
    }

    static void testModelFive06() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five06.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Five06Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Five06Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five06.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five06 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five06.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Five06Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Five06Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five06.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five06 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five06.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Five06Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Five06Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five06.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five06 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five06.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Five06Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Five06Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five06.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five06 gron: " + e.getMessage()); failed++; }
    }

    static void testModelFive07() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five07.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Five07Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Five07Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five07.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five07 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five07.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Five07Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Five07Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five07.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five07 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five07.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Five07Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Five07Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five07.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five07 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five07.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Five07Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Five07Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five07.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five07 gron: " + e.getMessage()); failed++; }
    }

    static void testModelFive08() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five08.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Five08Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Five08Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five08.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five08 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five08.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Five08Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Five08Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five08.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five08 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five08.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Five08Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Five08Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five08.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five08 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five08.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Five08Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Five08Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five08.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five08 gron: " + e.getMessage()); failed++; }
    }

    static void testModelFive09() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five09.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Five09Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Five09Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five09.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five09 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five09.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Five09Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Five09Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five09.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five09 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five09.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Five09Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Five09Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five09.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five09 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five09.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Five09Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Five09Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five09.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five09 gron: " + e.getMessage()); failed++; }
    }

    static void testModelFive10() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five10.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Five10Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Five10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five10.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five10 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five10.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Five10Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Five10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five10.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five10 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five10.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Five10Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Five10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five10.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five10 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Five10.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Five10Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Five10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Five10.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Five10 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTen01() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten01.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Ten01Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Ten01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten01.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten01 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten01.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Ten01Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Ten01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten01.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten01 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten01.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Ten01Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Ten01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten01.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten01 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten01.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Ten01Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Ten01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten01.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten01 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTen02() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten02.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Ten02Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Ten02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten02.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten02 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten02.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Ten02Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Ten02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten02.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten02 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten02.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Ten02Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Ten02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten02.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten02 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten02.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Ten02Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Ten02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten02.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten02 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTen03() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten03.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Ten03Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Ten03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten03.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten03 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten03.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Ten03Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Ten03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten03.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten03 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten03.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Ten03Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Ten03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten03.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten03 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten03.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Ten03Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Ten03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten03.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten03 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTen04() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten04.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Ten04Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Ten04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten04.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten04 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten04.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Ten04Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Ten04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten04.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten04 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten04.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Ten04Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Ten04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten04.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten04 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten04.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Ten04Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Ten04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten04.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten04 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTen05() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten05.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Ten05Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Ten05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten05.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten05 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten05.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Ten05Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Ten05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten05.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten05 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten05.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Ten05Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Ten05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten05.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten05 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Ten05.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Ten05Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Ten05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Ten05.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Ten05 gron: " + e.getMessage()); failed++; }
    }

    static void testModelArrString() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrString.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.ArrStringCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.ArrStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrString.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrString mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrString.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ArrStringCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ArrStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrString.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrString json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrString.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ArrStringCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ArrStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrString.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrString unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrString.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.ArrStringCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.ArrStringCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrString.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrString gron: " + e.getMessage()); failed++; }
    }

    static void testModelArrInt32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrInt32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.ArrInt32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.ArrInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrInt32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrInt32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrInt32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ArrInt32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ArrInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrInt32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrInt32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrInt32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ArrInt32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ArrInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrInt32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrInt32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrInt32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.ArrInt32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.ArrInt32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrInt32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrInt32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelArrBoolean() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrBoolean.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.ArrBooleanCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.ArrBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrBoolean.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrBoolean mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrBoolean.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ArrBooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ArrBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrBoolean.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrBoolean json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrBoolean.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ArrBooleanCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ArrBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrBoolean.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrBoolean unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrBoolean.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.ArrBooleanCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.ArrBooleanCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrBoolean.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrBoolean gron: " + e.getMessage()); failed++; }
    }

    static void testModelArrFloat64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrFloat64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.ArrFloat64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.ArrFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrFloat64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrFloat64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrFloat64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ArrFloat64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ArrFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrFloat64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrFloat64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrFloat64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ArrFloat64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ArrFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrFloat64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrFloat64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrFloat64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.ArrFloat64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.ArrFloat64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrFloat64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrFloat64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelArrBytes() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrBytes.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.ArrBytesCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.ArrBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrBytes.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrBytes mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrBytes.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ArrBytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ArrBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrBytes.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrBytes json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrBytes.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ArrBytesCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ArrBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrBytes.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrBytes unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrBytes.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.ArrBytesCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.ArrBytesCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrBytes.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrBytes gron: " + e.getMessage()); failed++; }
    }

    static void testModelArrInt64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrInt64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.ArrInt64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.ArrInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrInt64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrInt64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrInt64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ArrInt64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ArrInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrInt64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrInt64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrInt64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ArrInt64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ArrInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrInt64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrInt64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrInt64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.ArrInt64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.ArrInt64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrInt64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrInt64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelArrUint64() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrUint64.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.ArrUint64Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.ArrUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrUint64.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrUint64 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrUint64.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ArrUint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ArrUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrUint64.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrUint64 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrUint64.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ArrUint64Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ArrUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrUint64.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrUint64 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ArrUint64.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.ArrUint64Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.ArrUint64Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ArrUint64.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ArrUint64 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMultiArr1() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr1.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.MultiArr1Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.MultiArr1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr1.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr1 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr1.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.MultiArr1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.MultiArr1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr1.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr1 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr1.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.MultiArr1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.MultiArr1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr1.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr1 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr1.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.MultiArr1Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.MultiArr1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr1.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr1 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMultiArr2() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr2.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.MultiArr2Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.MultiArr2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr2.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr2 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr2.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.MultiArr2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.MultiArr2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr2.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr2 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr2.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.MultiArr2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.MultiArr2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr2.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr2 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr2.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.MultiArr2Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.MultiArr2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr2.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr2 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMultiArr3() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr3.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.MultiArr3Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.MultiArr3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr3.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr3 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr3.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.MultiArr3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.MultiArr3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr3.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr3 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr3.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.MultiArr3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.MultiArr3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr3.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr3 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr3.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.MultiArr3Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.MultiArr3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr3.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr3 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMultiArr4() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr4.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.MultiArr4Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.MultiArr4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr4.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr4 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr4.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.MultiArr4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.MultiArr4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr4.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr4 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr4.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.MultiArr4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.MultiArr4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr4.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr4 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr4.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.MultiArr4Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.MultiArr4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr4.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr4 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMultiArr5() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr5.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.MultiArr5Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.MultiArr5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr5.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr5 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr5.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.MultiArr5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.MultiArr5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr5.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr5 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr5.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.MultiArr5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.MultiArr5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr5.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr5 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "MultiArr5.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.MultiArr5Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.MultiArr5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "MultiArr5.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL MultiArr5 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptCombo1() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo1.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptCombo1Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptCombo1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo1.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo1 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo1.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptCombo1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptCombo1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo1.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo1 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo1.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptCombo1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptCombo1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo1.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo1 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo1.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptCombo1Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptCombo1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo1.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo1 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptCombo2() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo2.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptCombo2Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptCombo2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo2.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo2 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo2.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptCombo2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptCombo2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo2.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo2 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo2.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptCombo2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptCombo2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo2.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo2 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo2.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptCombo2Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptCombo2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo2.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo2 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptCombo3() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo3.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptCombo3Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptCombo3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo3.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo3 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo3.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptCombo3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptCombo3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo3.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo3 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo3.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptCombo3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptCombo3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo3.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo3 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo3.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptCombo3Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptCombo3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo3.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo3 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptCombo4() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo4.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptCombo4Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptCombo4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo4.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo4 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo4.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptCombo4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptCombo4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo4.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo4 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo4.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptCombo4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptCombo4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo4.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo4 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo4.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptCombo4Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptCombo4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo4.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo4 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptCombo5() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo5.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptCombo5Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptCombo5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo5.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo5 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo5.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptCombo5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptCombo5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo5.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo5 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo5.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptCombo5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptCombo5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo5.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo5 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo5.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptCombo5Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptCombo5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo5.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo5 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptCombo6() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo6.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptCombo6Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptCombo6Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo6.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo6 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo6.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptCombo6Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptCombo6Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo6.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo6 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo6.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptCombo6Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptCombo6Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo6.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo6 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo6.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptCombo6Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptCombo6Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo6.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo6 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptCombo7() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo7.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptCombo7Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptCombo7Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo7.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo7 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo7.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptCombo7Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptCombo7Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo7.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo7 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo7.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptCombo7Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptCombo7Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo7.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo7 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo7.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptCombo7Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptCombo7Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo7.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo7 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptCombo8() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo8.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptCombo8Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptCombo8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo8.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo8 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo8.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptCombo8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptCombo8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo8.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo8 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo8.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptCombo8Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptCombo8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo8.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo8 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo8.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptCombo8Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptCombo8Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo8.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo8 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptCombo9() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo9.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptCombo9Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptCombo9Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo9.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo9 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo9.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptCombo9Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptCombo9Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo9.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo9 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo9.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptCombo9Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptCombo9Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo9.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo9 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo9.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptCombo9Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptCombo9Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo9.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo9 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptCombo10() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo10.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptCombo10Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptCombo10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo10.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo10 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo10.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptCombo10Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptCombo10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo10.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo10 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo10.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptCombo10Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptCombo10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo10.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo10 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptCombo10.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptCombo10Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptCombo10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptCombo10.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptCombo10 gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestInner() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestInner.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.NestInnerCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.NestInnerCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestInner.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestInner mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestInner.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestInnerCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestInnerCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestInner.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestInner json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestInner.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestInnerCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestInnerCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestInner.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestInner unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestInner.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.NestInnerCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.NestInnerCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestInner.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestInner gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestCoord() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestCoord.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.NestCoordCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.NestCoordCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestCoord.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestCoord mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestCoord.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestCoordCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestCoordCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestCoord.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestCoord json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestCoord.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestCoordCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestCoordCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestCoord.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestCoord unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestCoord.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.NestCoordCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.NestCoordCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestCoord.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestCoord gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestIdVal() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestIdVal.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.NestIdValCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.NestIdValCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestIdVal.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestIdVal mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestIdVal.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestIdValCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestIdValCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestIdVal.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestIdVal json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestIdVal.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestIdValCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestIdValCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestIdVal.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestIdVal unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestIdVal.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.NestIdValCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.NestIdValCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestIdVal.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestIdVal gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestLabel() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestLabel.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.NestLabelCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.NestLabelCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestLabel.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestLabel mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestLabel.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestLabelCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestLabelCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestLabel.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestLabel json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestLabel.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestLabelCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestLabelCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestLabel.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestLabel unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestLabel.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.NestLabelCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.NestLabelCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestLabel.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestLabel gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestMoney() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestMoney.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.NestMoneyCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.NestMoneyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestMoney.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestMoney mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestMoney.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestMoneyCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestMoneyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestMoney.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestMoney json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestMoney.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestMoneyCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestMoneyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestMoney.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestMoney unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestMoney.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.NestMoneyCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.NestMoneyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestMoney.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestMoney gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestRange32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestRange32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.NestRange32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.NestRange32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestRange32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestRange32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestRange32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestRange32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestRange32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestRange32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestRange32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestRange32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestRange32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestRange32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestRange32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestRange32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestRange32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.NestRange32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.NestRange32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestRange32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestRange32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestAddr() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestAddr.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.NestAddrCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.NestAddrCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestAddr.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestAddr mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestAddr.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestAddrCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestAddrCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestAddr.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestAddr json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestAddr.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestAddrCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestAddrCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestAddr.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestAddr unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestAddr.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.NestAddrCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.NestAddrCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestAddr.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestAddr gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestPoint3() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestPoint3.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.NestPoint3Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.NestPoint3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestPoint3.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestPoint3 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestPoint3.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestPoint3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestPoint3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestPoint3.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestPoint3 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestPoint3.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestPoint3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestPoint3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestPoint3.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestPoint3 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestPoint3.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.NestPoint3Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.NestPoint3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestPoint3.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestPoint3 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptNestInner() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestInner.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptNestInnerCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptNestInnerCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestInner.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestInner mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestInner.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptNestInnerCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptNestInnerCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestInner.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestInner json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestInner.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptNestInnerCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptNestInnerCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestInner.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestInner unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestInner.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptNestInnerCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptNestInnerCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestInner.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestInner gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptNestCoord() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestCoord.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptNestCoordCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptNestCoordCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestCoord.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestCoord mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestCoord.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptNestCoordCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptNestCoordCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestCoord.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestCoord json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestCoord.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptNestCoordCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptNestCoordCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestCoord.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestCoord unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestCoord.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptNestCoordCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptNestCoordCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestCoord.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestCoord gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptNestIdVal() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestIdVal.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptNestIdValCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptNestIdValCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestIdVal.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestIdVal mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestIdVal.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptNestIdValCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptNestIdValCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestIdVal.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestIdVal json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestIdVal.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptNestIdValCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptNestIdValCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestIdVal.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestIdVal unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestIdVal.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptNestIdValCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptNestIdValCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestIdVal.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestIdVal gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptNestLabel() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestLabel.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptNestLabelCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptNestLabelCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestLabel.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestLabel mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestLabel.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptNestLabelCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptNestLabelCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestLabel.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestLabel json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestLabel.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptNestLabelCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptNestLabelCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestLabel.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestLabel unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestLabel.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptNestLabelCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptNestLabelCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestLabel.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestLabel gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptNestMoney() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestMoney.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptNestMoneyCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptNestMoneyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestMoney.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestMoney mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestMoney.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptNestMoneyCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptNestMoneyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestMoney.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestMoney json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestMoney.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptNestMoneyCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptNestMoneyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestMoney.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestMoney unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestMoney.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptNestMoneyCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptNestMoneyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestMoney.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestMoney gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptNestRange32() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestRange32.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptNestRange32Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptNestRange32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestRange32.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestRange32 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestRange32.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptNestRange32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptNestRange32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestRange32.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestRange32 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestRange32.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptNestRange32Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptNestRange32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestRange32.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestRange32 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestRange32.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptNestRange32Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptNestRange32Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestRange32.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestRange32 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptNestAddr() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestAddr.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptNestAddrCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptNestAddrCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestAddr.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestAddr mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestAddr.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptNestAddrCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptNestAddrCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestAddr.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestAddr json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestAddr.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptNestAddrCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptNestAddrCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestAddr.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestAddr unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestAddr.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptNestAddrCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptNestAddrCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestAddr.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestAddr gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptNestPoint3() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestPoint3.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptNestPoint3Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptNestPoint3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestPoint3.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestPoint3 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestPoint3.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptNestPoint3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptNestPoint3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestPoint3.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestPoint3 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestPoint3.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptNestPoint3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptNestPoint3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestPoint3.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestPoint3 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptNestPoint3.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptNestPoint3Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptNestPoint3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptNestPoint3.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptNestPoint3 gron: " + e.getMessage()); failed++; }
    }

    static void testModelModelArr1() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr1.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.ModelArr1Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.ModelArr1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr1.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr1 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr1.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ModelArr1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ModelArr1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr1.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr1 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr1.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ModelArr1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ModelArr1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr1.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr1 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr1.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.ModelArr1Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.ModelArr1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr1.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr1 gron: " + e.getMessage()); failed++; }
    }

    static void testModelModelArr2() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr2.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.ModelArr2Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.ModelArr2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr2.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr2 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr2.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ModelArr2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ModelArr2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr2.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr2 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr2.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ModelArr2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ModelArr2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr2.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr2 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr2.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.ModelArr2Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.ModelArr2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr2.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr2 gron: " + e.getMessage()); failed++; }
    }

    static void testModelModelArr3() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr3.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.ModelArr3Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.ModelArr3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr3.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr3 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr3.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ModelArr3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ModelArr3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr3.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr3 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr3.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ModelArr3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ModelArr3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr3.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr3 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr3.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.ModelArr3Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.ModelArr3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr3.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr3 gron: " + e.getMessage()); failed++; }
    }

    static void testModelModelArr4() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr4.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.ModelArr4Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.ModelArr4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr4.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr4 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr4.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ModelArr4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ModelArr4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr4.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr4 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr4.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ModelArr4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ModelArr4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr4.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr4 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr4.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.ModelArr4Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.ModelArr4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr4.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr4 gron: " + e.getMessage()); failed++; }
    }

    static void testModelModelArr5() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr5.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.ModelArr5Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.ModelArr5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr5.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr5 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr5.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ModelArr5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ModelArr5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr5.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr5 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr5.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ModelArr5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ModelArr5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr5.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr5 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ModelArr5.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.ModelArr5Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.ModelArr5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ModelArr5.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ModelArr5 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix01() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix01.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Mix01Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Mix01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix01.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix01 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix01.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix01Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix01.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix01 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix01.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix01Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix01.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix01 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix01.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Mix01Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Mix01Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix01.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix01 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix02() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix02.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Mix02Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Mix02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix02.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix02 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix02.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix02Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix02.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix02 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix02.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix02Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix02.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix02 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix02.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Mix02Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Mix02Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix02.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix02 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix03() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix03.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Mix03Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Mix03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix03.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix03 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix03.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix03Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix03.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix03 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix03.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix03Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix03.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix03 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix03.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Mix03Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Mix03Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix03.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix03 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix04() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix04.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Mix04Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Mix04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix04.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix04 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix04.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix04Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix04.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix04 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix04.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix04Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix04.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix04 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix04.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Mix04Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Mix04Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix04.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix04 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix05() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix05.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Mix05Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Mix05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix05.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix05 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix05.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix05Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix05.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix05 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix05.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix05Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix05.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix05 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix05.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Mix05Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Mix05Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix05.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix05 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix06() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix06.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Mix06Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Mix06Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix06.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix06 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix06.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix06Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix06Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix06.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix06 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix06.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix06Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix06Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix06.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix06 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix06.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Mix06Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Mix06Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix06.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix06 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix07() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix07.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Mix07Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Mix07Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix07.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix07 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix07.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix07Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix07Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix07.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix07 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix07.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix07Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix07Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix07.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix07 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix07.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Mix07Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Mix07Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix07.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix07 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix08() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix08.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Mix08Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Mix08Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix08.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix08 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix08.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix08Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix08Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix08.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix08 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix08.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix08Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix08Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix08.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix08 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix08.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Mix08Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Mix08Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix08.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix08 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix09() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix09.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Mix09Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Mix09Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix09.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix09 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix09.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix09Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix09Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix09.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix09 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix09.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix09Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix09Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix09.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix09 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix09.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Mix09Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Mix09Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix09.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix09 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix10() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix10.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Mix10Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Mix10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix10.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix10 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix10.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix10Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix10.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix10 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix10.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix10Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix10.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix10 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix10.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Mix10Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Mix10Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix10.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix10 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix11() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix11.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Mix11Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Mix11Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix11.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix11 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix11.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix11Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix11Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix11.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix11 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix11.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix11Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix11Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix11.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix11 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix11.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Mix11Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Mix11Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix11.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix11 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix12() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix12.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Mix12Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Mix12Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix12.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix12 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix12.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix12Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix12Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix12.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix12 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix12.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix12Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix12Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix12.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix12 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix12.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Mix12Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Mix12Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix12.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix12 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix13() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix13.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Mix13Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Mix13Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix13.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix13 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix13.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix13Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix13Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix13.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix13 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix13.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix13Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix13Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix13.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix13 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix13.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Mix13Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Mix13Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix13.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix13 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix14() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix14.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Mix14Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Mix14Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix14.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix14 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix14.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix14Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix14Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix14.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix14 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix14.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix14Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix14Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix14.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix14 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix14.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Mix14Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Mix14Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix14.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix14 gron: " + e.getMessage()); failed++; }
    }

    static void testModelMix15() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix15.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Mix15Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Mix15Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix15.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix15 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix15.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix15Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix15Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix15.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix15 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix15.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Mix15Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Mix15Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix15.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix15 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Mix15.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Mix15Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Mix15Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Mix15.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Mix15 gron: " + e.getMessage()); failed++; }
    }

    static void testModelAllOpt1() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt1.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.AllOpt1Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.AllOpt1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt1.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt1 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt1.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.AllOpt1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.AllOpt1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt1.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt1 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt1.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.AllOpt1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.AllOpt1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt1.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt1 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt1.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.AllOpt1Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.AllOpt1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt1.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt1 gron: " + e.getMessage()); failed++; }
    }

    static void testModelAllOpt2() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt2.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.AllOpt2Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.AllOpt2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt2.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt2 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt2.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.AllOpt2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.AllOpt2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt2.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt2 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt2.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.AllOpt2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.AllOpt2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt2.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt2 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt2.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.AllOpt2Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.AllOpt2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt2.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt2 gron: " + e.getMessage()); failed++; }
    }

    static void testModelAllOpt3() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt3.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.AllOpt3Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.AllOpt3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt3.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt3 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt3.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.AllOpt3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.AllOpt3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt3.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt3 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt3.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.AllOpt3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.AllOpt3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt3.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt3 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt3.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.AllOpt3Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.AllOpt3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt3.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt3 gron: " + e.getMessage()); failed++; }
    }

    static void testModelAllOpt4() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt4.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.AllOpt4Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.AllOpt4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt4.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt4 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt4.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.AllOpt4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.AllOpt4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt4.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt4 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt4.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.AllOpt4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.AllOpt4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt4.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt4 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt4.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.AllOpt4Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.AllOpt4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt4.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt4 gron: " + e.getMessage()); failed++; }
    }

    static void testModelAllOpt5() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt5.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.AllOpt5Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.AllOpt5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt5.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt5 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt5.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.AllOpt5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.AllOpt5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt5.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt5 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt5.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.AllOpt5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.AllOpt5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt5.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt5 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "AllOpt5.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.AllOpt5Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.AllOpt5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "AllOpt5.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL AllOpt5 gron: " + e.getMessage()); failed++; }
    }

    static void testModelRecList() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecList.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.RecListCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.RecListCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecList.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecList mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecList.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.RecListCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.RecListCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecList.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecList json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecList.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.RecListCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.RecListCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecList.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecList unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecList.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.RecListCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.RecListCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecList.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecList gron: " + e.getMessage()); failed++; }
    }

    static void testModelRecTree() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecTree.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.RecTreeCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.RecTreeCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecTree.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecTree mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecTree.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.RecTreeCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.RecTreeCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecTree.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecTree json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecTree.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.RecTreeCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.RecTreeCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecTree.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecTree unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecTree.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.RecTreeCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.RecTreeCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecTree.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecTree gron: " + e.getMessage()); failed++; }
    }

    static void testModelRecChain() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecChain.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.RecChainCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.RecChainCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecChain.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecChain mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecChain.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.RecChainCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.RecChainCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecChain.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecChain json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecChain.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.RecChainCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.RecChainCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecChain.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecChain unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecChain.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.RecChainCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.RecChainCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecChain.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecChain gron: " + e.getMessage()); failed++; }
    }

    static void testModelRecWrap() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecWrap.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.RecWrapCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.RecWrapCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecWrap.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecWrap mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecWrap.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.RecWrapCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.RecWrapCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecWrap.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecWrap json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecWrap.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.RecWrapCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.RecWrapCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecWrap.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecWrap unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecWrap.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.RecWrapCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.RecWrapCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecWrap.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecWrap gron: " + e.getMessage()); failed++; }
    }

    static void testModelRecWide() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecWide.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.RecWideCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.RecWideCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecWide.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecWide mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecWide.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.RecWideCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.RecWideCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecWide.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecWide json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecWide.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.RecWideCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.RecWideCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecWide.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecWide unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "RecWide.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.RecWideCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.RecWideCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "RecWide.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL RecWide gron: " + e.getMessage()); failed++; }
    }

    static void testModelWide20() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide20.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Wide20Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Wide20Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide20.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide20 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide20.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Wide20Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Wide20Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide20.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide20 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide20.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Wide20Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Wide20Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide20.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide20 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide20.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Wide20Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Wide20Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide20.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide20 gron: " + e.getMessage()); failed++; }
    }

    static void testModelWide25() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide25.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Wide25Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Wide25Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide25.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide25 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide25.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Wide25Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Wide25Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide25.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide25 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide25.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Wide25Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Wide25Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide25.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide25 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide25.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Wide25Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Wide25Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide25.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide25 gron: " + e.getMessage()); failed++; }
    }

    static void testModelWide30() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide30.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Wide30Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Wide30Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide30.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide30 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide30.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Wide30Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Wide30Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide30.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide30 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide30.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Wide30Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Wide30Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide30.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide30 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide30.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Wide30Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Wide30Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide30.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide30 gron: " + e.getMessage()); failed++; }
    }

    static void testModelWide35() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide35.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Wide35Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Wide35Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide35.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide35 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide35.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Wide35Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Wide35Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide35.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide35 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide35.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Wide35Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Wide35Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide35.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide35 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide35.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Wide35Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Wide35Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide35.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide35 gron: " + e.getMessage()); failed++; }
    }

    static void testModelWide40() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide40.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.Wide40Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.Wide40Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide40.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide40 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide40.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Wide40Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Wide40Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide40.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide40 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide40.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.Wide40Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.Wide40Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide40.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide40 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "Wide40.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.Wide40Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.Wide40Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "Wide40.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL Wide40 gron: " + e.getMessage()); failed++; }
    }

    static void testModelEdgeEmpty() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeEmpty.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.EdgeEmptyCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.EdgeEmptyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeEmpty.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeEmpty mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeEmpty.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.EdgeEmptyCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.EdgeEmptyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeEmpty.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeEmpty json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeEmpty.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.EdgeEmptyCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.EdgeEmptyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeEmpty.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeEmpty unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeEmpty.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.EdgeEmptyCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.EdgeEmptyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeEmpty.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeEmpty gron: " + e.getMessage()); failed++; }
    }

    static void testModelEdgeOneOpt() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeOneOpt.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.EdgeOneOptCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.EdgeOneOptCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeOneOpt.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeOneOpt mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeOneOpt.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.EdgeOneOptCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.EdgeOneOptCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeOneOpt.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeOneOpt json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeOneOpt.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.EdgeOneOptCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.EdgeOneOptCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeOneOpt.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeOneOpt unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeOneOpt.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.EdgeOneOptCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.EdgeOneOptCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeOneOpt.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeOneOpt gron: " + e.getMessage()); failed++; }
    }

    static void testModelEdgeBigNums() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeBigNums.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.EdgeBigNumsCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.EdgeBigNumsCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeBigNums.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeBigNums mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeBigNums.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.EdgeBigNumsCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.EdgeBigNumsCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeBigNums.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeBigNums json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeBigNums.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.EdgeBigNumsCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.EdgeBigNumsCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeBigNums.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeBigNums unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeBigNums.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.EdgeBigNumsCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.EdgeBigNumsCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeBigNums.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeBigNums gron: " + e.getMessage()); failed++; }
    }

    static void testModelEdgeZeroVals() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeZeroVals.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.EdgeZeroValsCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.EdgeZeroValsCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeZeroVals.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeZeroVals mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeZeroVals.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.EdgeZeroValsCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.EdgeZeroValsCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeZeroVals.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeZeroVals json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeZeroVals.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.EdgeZeroValsCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.EdgeZeroValsCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeZeroVals.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeZeroVals unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeZeroVals.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.EdgeZeroValsCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.EdgeZeroValsCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeZeroVals.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeZeroVals gron: " + e.getMessage()); failed++; }
    }

    static void testModelEdgeNullable() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeNullable.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.EdgeNullableCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.EdgeNullableCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeNullable.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeNullable mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeNullable.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.EdgeNullableCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.EdgeNullableCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeNullable.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeNullable json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeNullable.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.EdgeNullableCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.EdgeNullableCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeNullable.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeNullable unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeNullable.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.EdgeNullableCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.EdgeNullableCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeNullable.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeNullable gron: " + e.getMessage()); failed++; }
    }

    static void testModelEdgeNegZero() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeNegZero.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.EdgeNegZeroCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.EdgeNegZeroCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeNegZero.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeNegZero mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeNegZero.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.EdgeNegZeroCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.EdgeNegZeroCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeNegZero.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeNegZero json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeNegZero.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.EdgeNegZeroCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.EdgeNegZeroCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeNegZero.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeNegZero unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeNegZero.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.EdgeNegZeroCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.EdgeNegZeroCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeNegZero.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeNegZero gron: " + e.getMessage()); failed++; }
    }

    static void testModelEdgeNullByte() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeNullByte.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.EdgeNullByteCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.EdgeNullByteCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeNullByte.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeNullByte mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeNullByte.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.EdgeNullByteCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.EdgeNullByteCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeNullByte.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeNullByte json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeNullByte.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.EdgeNullByteCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.EdgeNullByteCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeNullByte.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeNullByte unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeNullByte.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.EdgeNullByteCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.EdgeNullByteCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeNullByte.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeNullByte gron: " + e.getMessage()); failed++; }
    }

    static void testModelEdgeBoundary() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeBoundary.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.EdgeBoundaryCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.EdgeBoundaryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeBoundary.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeBoundary mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeBoundary.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.EdgeBoundaryCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.EdgeBoundaryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeBoundary.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeBoundary json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeBoundary.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.EdgeBoundaryCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.EdgeBoundaryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeBoundary.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeBoundary unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeBoundary.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.EdgeBoundaryCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.EdgeBoundaryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeBoundary.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeBoundary gron: " + e.getMessage()); failed++; }
    }

    static void testModelEdgeStrLen() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeStrLen.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.EdgeStrLenCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.EdgeStrLenCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeStrLen.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeStrLen mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeStrLen.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.EdgeStrLenCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.EdgeStrLenCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeStrLen.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeStrLen json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeStrLen.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.EdgeStrLenCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.EdgeStrLenCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeStrLen.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeStrLen unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeStrLen.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.EdgeStrLenCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.EdgeStrLenCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeStrLen.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeStrLen gron: " + e.getMessage()); failed++; }
    }

    static void testModelEdgeBytesLen() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeBytesLen.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.EdgeBytesLenCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.EdgeBytesLenCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeBytesLen.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeBytesLen mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeBytesLen.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.EdgeBytesLenCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.EdgeBytesLenCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeBytesLen.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeBytesLen json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeBytesLen.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.EdgeBytesLenCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.EdgeBytesLenCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeBytesLen.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeBytesLen unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeBytesLen.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.EdgeBytesLenCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.EdgeBytesLenCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeBytesLen.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeBytesLen gron: " + e.getMessage()); failed++; }
    }

    static void testModelEdgeArrEmpty() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeArrEmpty.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.EdgeArrEmptyCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.EdgeArrEmptyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeArrEmpty.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeArrEmpty mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeArrEmpty.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.EdgeArrEmptyCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.EdgeArrEmptyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeArrEmpty.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeArrEmpty json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeArrEmpty.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.EdgeArrEmptyCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.EdgeArrEmptyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeArrEmpty.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeArrEmpty unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeArrEmpty.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.EdgeArrEmptyCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.EdgeArrEmptyCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeArrEmpty.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeArrEmpty gron: " + e.getMessage()); failed++; }
    }

    static void testModelEdgeArrBoundary() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeArrBoundary.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.EdgeArrBoundaryCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.EdgeArrBoundaryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeArrBoundary.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeArrBoundary mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeArrBoundary.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.EdgeArrBoundaryCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.EdgeArrBoundaryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeArrBoundary.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeArrBoundary json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeArrBoundary.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.EdgeArrBoundaryCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.EdgeArrBoundaryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeArrBoundary.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeArrBoundary unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "EdgeArrBoundary.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.EdgeArrBoundaryCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.EdgeArrBoundaryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "EdgeArrBoundary.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL EdgeArrBoundary gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptArr1() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr1.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptArr1Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptArr1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr1.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr1 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr1.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptArr1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptArr1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr1.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr1 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr1.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptArr1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptArr1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr1.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr1 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr1.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptArr1Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptArr1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr1.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr1 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptArr2() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr2.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptArr2Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptArr2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr2.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr2 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr2.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptArr2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptArr2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr2.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr2 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr2.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptArr2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptArr2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr2.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr2 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr2.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptArr2Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptArr2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr2.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr2 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptArr3() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr3.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptArr3Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptArr3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr3.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr3 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr3.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptArr3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptArr3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr3.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr3 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr3.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptArr3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptArr3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr3.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr3 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr3.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptArr3Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptArr3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr3.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr3 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptArr4() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr4.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptArr4Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptArr4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr4.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr4 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr4.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptArr4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptArr4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr4.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr4 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr4.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptArr4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptArr4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr4.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr4 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr4.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptArr4Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptArr4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr4.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr4 gron: " + e.getMessage()); failed++; }
    }

    static void testModelOptArr5() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr5.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.OptArr5Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.OptArr5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr5.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr5 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr5.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptArr5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptArr5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr5.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr5 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr5.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.OptArr5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.OptArr5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr5.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr5 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "OptArr5.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.OptArr5Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.OptArr5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "OptArr5.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL OptArr5 gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestOpt1() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt1.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.NestOpt1Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.NestOpt1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt1.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt1 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt1.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestOpt1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestOpt1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt1.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt1 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt1.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestOpt1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestOpt1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt1.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt1 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt1.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.NestOpt1Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.NestOpt1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt1.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt1 gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestOpt2() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt2.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.NestOpt2Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.NestOpt2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt2.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt2 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt2.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestOpt2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestOpt2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt2.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt2 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt2.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestOpt2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestOpt2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt2.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt2 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt2.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.NestOpt2Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.NestOpt2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt2.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt2 gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestOpt3() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt3.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.NestOpt3Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.NestOpt3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt3.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt3 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt3.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestOpt3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestOpt3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt3.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt3 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt3.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestOpt3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestOpt3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt3.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt3 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt3.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.NestOpt3Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.NestOpt3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt3.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt3 gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestOpt4() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt4.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.NestOpt4Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.NestOpt4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt4.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt4 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt4.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestOpt4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestOpt4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt4.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt4 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt4.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestOpt4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestOpt4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt4.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt4 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt4.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.NestOpt4Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.NestOpt4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt4.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt4 gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestOpt5() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt5.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.NestOpt5Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.NestOpt5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt5.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt5 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt5.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestOpt5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestOpt5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt5.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt5 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt5.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestOpt5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestOpt5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt5.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt5 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOpt5.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.NestOpt5Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.NestOpt5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOpt5.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOpt5 gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestOptInner1() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOptInner1.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.NestOptInner1Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.NestOptInner1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOptInner1.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOptInner1 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOptInner1.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestOptInner1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestOptInner1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOptInner1.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOptInner1 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOptInner1.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestOptInner1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestOptInner1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOptInner1.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOptInner1 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOptInner1.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.NestOptInner1Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.NestOptInner1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOptInner1.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOptInner1 gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestOptInner2() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOptInner2.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.NestOptInner2Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.NestOptInner2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOptInner2.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOptInner2 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOptInner2.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestOptInner2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestOptInner2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOptInner2.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOptInner2 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOptInner2.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestOptInner2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestOptInner2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOptInner2.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOptInner2 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOptInner2.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.NestOptInner2Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.NestOptInner2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOptInner2.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOptInner2 gron: " + e.getMessage()); failed++; }
    }

    static void testModelNestOptInner3() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOptInner3.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.NestOptInner3Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.NestOptInner3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOptInner3.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOptInner3 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOptInner3.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestOptInner3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestOptInner3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOptInner3.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOptInner3 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOptInner3.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.NestOptInner3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.NestOptInner3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOptInner3.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOptInner3 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "NestOptInner3.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.NestOptInner3Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.NestOptInner3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "NestOptInner3.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL NestOptInner3 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDeepNest1() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest1.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DeepNest1Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DeepNest1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest1.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest1 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest1.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DeepNest1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DeepNest1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest1.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest1 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest1.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DeepNest1Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DeepNest1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest1.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest1 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest1.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DeepNest1Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DeepNest1Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest1.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest1 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDeepNest2() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest2.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DeepNest2Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DeepNest2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest2.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest2 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest2.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DeepNest2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DeepNest2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest2.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest2 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest2.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DeepNest2Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DeepNest2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest2.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest2 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest2.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DeepNest2Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DeepNest2Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest2.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest2 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDeepNest3() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest3.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DeepNest3Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DeepNest3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest3.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest3 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest3.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DeepNest3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DeepNest3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest3.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest3 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest3.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DeepNest3Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DeepNest3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest3.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest3 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest3.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DeepNest3Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DeepNest3Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest3.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest3 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDeepNest4() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest4.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DeepNest4Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DeepNest4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest4.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest4 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest4.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DeepNest4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DeepNest4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest4.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest4 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest4.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DeepNest4Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DeepNest4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest4.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest4 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest4.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DeepNest4Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DeepNest4Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest4.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest4 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDeepNest5() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest5.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DeepNest5Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DeepNest5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest5.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest5 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest5.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DeepNest5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DeepNest5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest5.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest5 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest5.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DeepNest5Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DeepNest5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest5.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest5 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest5.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DeepNest5Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DeepNest5Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest5.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest5 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDeepNest6() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest6.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DeepNest6Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DeepNest6Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest6.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest6 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest6.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DeepNest6Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DeepNest6Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest6.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest6 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest6.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DeepNest6Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DeepNest6Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest6.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest6 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest6.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DeepNest6Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DeepNest6Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest6.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest6 gron: " + e.getMessage()); failed++; }
    }

    static void testModelDeepNest7() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest7.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.DeepNest7Codec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.DeepNest7Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest7.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest7 mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest7.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DeepNest7Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DeepNest7Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest7.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest7 json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest7.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.DeepNest7Codec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.DeepNest7Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest7.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest7 unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "DeepNest7.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.DeepNest7Codec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.DeepNest7Codec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "DeepNest7.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL DeepNest7 gron: " + e.getMessage()); failed++; }
    }

    static void testModelTimestampEntry() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "TimestampEntry.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.TimestampEntryCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.TimestampEntryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "TimestampEntry.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL TimestampEntry mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "TimestampEntry.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.TimestampEntryCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.TimestampEntryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "TimestampEntry.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL TimestampEntry json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "TimestampEntry.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.TimestampEntryCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.TimestampEntryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "TimestampEntry.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL TimestampEntry unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "TimestampEntry.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.TimestampEntryCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.TimestampEntryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "TimestampEntry.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL TimestampEntry gron: " + e.getMessage()); failed++; }
    }

    static void testModelConfigEntry() {
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ConfigEntry.msgpack"));
            MsgPackReader r = new MsgPackReader(data);
            var obj = AllTypesTypes.ConfigEntryCodec.decode().decode(r);
            MsgPackWriter w = new MsgPackWriter();
            AllTypesTypes.ConfigEntryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ConfigEntry.msgpack"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ConfigEntry mp: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ConfigEntry.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ConfigEntryCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ConfigEntryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ConfigEntry.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ConfigEntry json: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ConfigEntry.unformatted.json"));
            JsonReader r = new JsonReader(data);
            var obj = AllTypesTypes.ConfigEntryCodec.decode().decode(r);
            JsonWriter w = new JsonWriter();
            AllTypesTypes.ConfigEntryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ConfigEntry.unformatted.json"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ConfigEntry unformatted: " + e.getMessage()); failed++; }
        try {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(vecDir, "ConfigEntry.gron"));
            GronReader r = new GronReader(data);
            var obj = AllTypesTypes.ConfigEntryCodec.decode().decode(r);
            GronWriter w = new GronWriter();
            AllTypesTypes.ConfigEntryCodec.encode().encode(w, obj);
            java.nio.file.Files.createDirectories(java.nio.file.Path.of(outDir));
            java.nio.file.Files.write(java.nio.file.Path.of(outDir, "ConfigEntry.gron"), w.toBytes());
            passed++;
        } catch (Exception e) { System.out.println("FAIL ConfigEntry gron: " + e.getMessage()); failed++; }
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

        testModelOptInner();
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
        testModelFive01();
        testModelFive02();
        testModelFive03();
        testModelFive04();
        testModelFive05();
        testModelFive06();
        testModelFive07();
        testModelFive08();
        testModelFive09();
        testModelFive10();
        testModelTen01();
        testModelTen02();
        testModelTen03();
        testModelTen04();
        testModelTen05();
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
        testModelModelArr1();
        testModelModelArr2();
        testModelModelArr3();
        testModelModelArr4();
        testModelModelArr5();
        testModelMix01();
        testModelMix02();
        testModelMix03();
        testModelMix04();
        testModelMix05();
        testModelMix06();
        testModelMix07();
        testModelMix08();
        testModelMix09();
        testModelMix10();
        testModelMix11();
        testModelMix12();
        testModelMix13();
        testModelMix14();
        testModelMix15();
        testModelAllOpt1();
        testModelAllOpt2();
        testModelAllOpt3();
        testModelAllOpt4();
        testModelAllOpt5();
        testModelRecList();
        testModelRecTree();
        testModelRecChain();
        testModelRecWrap();
        testModelRecWide();
        testModelWide20();
        testModelWide25();
        testModelWide30();
        testModelWide35();
        testModelWide40();
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

        System.out.println("emit-java: " + passed + " passed, " + failed + " failed");
        if (failed > 0) System.exit(1);
    }
}
