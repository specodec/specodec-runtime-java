package specodec;

import java.util.ArrayList;

public class MsgPackWriter implements SpecWriter {
    private final ArrayList<Byte> buf = new ArrayList<>();

    private void writeByte(int b) { buf.add((byte) b); }

    private void writeU16(int v) {
        buf.add((byte) (v >> 8));
        buf.add((byte) v);
    }

    private void writeU32(int v) {
        buf.add((byte) (v >> 24));
        buf.add((byte) (v >> 16));
        buf.add((byte) (v >> 8));
        buf.add((byte) v);
    }

    private void writeU64(long v) {
        writeU32((int) (v >> 32));
        writeU32((int) v);
    }

    @Override
    public void writeString(String value) {
        byte[] bytes = value.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        int len = bytes.length;
        if (len <= 0x1F) {
            writeByte(0xA0 | len);
        } else if (len <= 0xFF) {
            writeByte(0xD9);
            writeByte(len);
        } else if (len <= 0xFFFF) {
            writeByte(0xDA);
            writeU16(len);
        } else {
            writeByte(0xDB);
            writeU32(len);
        }
        for (byte b : bytes) buf.add(b);
    }

    @Override
    public void writeBool(boolean value) { writeByte(value ? 0xC3 : 0xC2); }

    @Override
    public void writeInt32(int value) {
        if (value >= 0 && value <= 0x7F) {
            writeByte(value);
        } else if (value >= -0x20 && value <= -1) {
            writeByte(value);
        } else if (value >= 0 && value <= 0xFF) {
            writeByte(0xCC);
            writeByte(value);
        } else if (value >= 0 && value <= 0xFFFF) {
            writeByte(0xCD);
            writeU16(value);
        } else if (value >= 0) {
            writeByte(0xCE);
            writeU32(value);
        } else if (value >= -0x80) {
            writeByte(0xD0);
            writeByte(value);
        } else if (value >= -0x8000) {
            writeByte(0xD1);
            writeU16(value & 0xFFFF);
        } else {
            writeByte(0xD2);
            writeU32(value);
        }
    }

    @Override
    public void writeInt64(long value) {
        if (value >= 0 && value <= 0x7F) {
            writeByte((int) value);
        } else if (value >= -0x20L && value <= -1L) {
            writeByte((int) value);
        } else if (value >= 0 && value <= 0xFF) {
            writeByte(0xCC);
            writeByte((int) value);
        } else if (value >= 0 && value <= 0xFFFF) {
            writeByte(0xCD);
            writeU16((int) value);
        } else if (value >= 0 && value <= 0xFFFFFFFFL) {
            writeByte(0xCE);
            writeU32((int) value);
        } else if (value >= 0) {
            writeByte(0xCF);
            writeU64(value);
        } else if (value >= -0x80L) {
            writeByte(0xD0);
            writeByte((int) value);
        } else if (value >= -0x8000L) {
            writeByte(0xD1);
            writeU16((int) value & 0xFFFF);
        } else if (value >= -0x80000000L) {
            writeByte(0xD2);
            writeU32((int) value);
        } else {
            writeByte(0xD3);
            writeU64(value);
        }
    }

    @Override
    public void writeUint32(int value) {
        long v = value & 0xFFFFFFFFL;
        if (v <= 0x7F) {
            writeByte((int) v);
        } else if (v <= 0xFF) {
            writeByte(0xCC);
            writeByte((int) v);
        } else if (v <= 0xFFFF) {
            writeByte(0xCD);
            writeU16((int) v);
        } else {
            writeByte(0xCE);
            writeU32((int) v);
        }
    }

    @Override
    public void writeUint64(long value) {
        if (Long.compareUnsigned(value, 0x7FL) <= 0) {
            writeByte((int) value);
        } else if (Long.compareUnsigned(value, 0xFFL) <= 0) {
            writeByte(0xCC);
            writeByte((int) value);
        } else if (Long.compareUnsigned(value, 0xFFFFL) <= 0) {
            writeByte(0xCD);
            writeU16((int) value);
        } else if (Long.compareUnsigned(value, 0xFFFFFFFFL) <= 0) {
            writeByte(0xCE);
            writeU32((int) value);
        } else {
            writeByte(0xCF);
            writeU64(value);
        }
    }

    @Override
    public void writeFloat32(float value) {
        writeByte(0xCA);
        writeU32(Float.floatToRawIntBits(value));
    }

    @Override
    public void writeFloat64(double value) {
        writeByte(0xCB);
        long bits = Double.doubleToRawLongBits(value);
        writeU32((int) (bits >>> 32));
        writeU32((int) bits);
    }

    @Override
    public void writeNull() { writeByte(0xC0); }

    @Override
    public void writeBytes(byte[] value) {
        int len = value.length;
        if (len <= 0xFF) {
            writeByte(0xC4);
            writeByte(len);
        } else if (len <= 0xFFFF) {
            writeByte(0xC5);
            writeU16(len);
        } else {
            writeByte(0xC6);
            writeU32(len);
        }
        for (byte b : value) buf.add(b);
    }

    @Override
    public void beginObject(int fieldCount) {
        if (fieldCount <= 0x0F) {
            writeByte(0x80 | fieldCount);
        } else if (fieldCount <= 0xFFFF) {
            writeByte(0xDE);
            writeU16(fieldCount);
        } else {
            writeByte(0xDF);
            writeU32(fieldCount);
        }
    }

    @Override
    public void writeField(String name) { writeString(name); }

    @Override
    public void endObject() {}

    @Override
    public void beginArray(int elementCount) {
        if (elementCount <= 0x0F) {
            writeByte(0x90 | elementCount);
        } else if (elementCount <= 0xFFFF) {
            writeByte(0xDC);
            writeU16(elementCount);
        } else {
            writeByte(0xDD);
            writeU32(elementCount);
        }
    }

    @Override
    public void nextElement() {}

    @Override
    public void endArray() {}

    @Override
    public void writeEnum(String value) { writeString(value); }

    @Override
    public byte[] toBytes() {
        byte[] result = new byte[buf.size()];
        for (int i = 0; i < buf.size(); i++) result[i] = buf.get(i);
        return result;
    }
}
