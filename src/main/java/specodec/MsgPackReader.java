package specodec;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class MsgPackReader implements SpecReader {
    private final byte[] data;
    private int pos;
    ArrayList<Integer> containerCount = new ArrayList<>();

    public MsgPackReader(byte[] data) {
        this.data = data;
        this.pos = 0;
    }

    public int pos() { return pos; }

    private int readByte() {
        if (pos >= data.length) throw new SCodecError("internal", "msgpack: unexpected end of data");
        return data[pos++] & 0xFF;
    }

    private int readU16() {
        int v = ((data[pos] & 0xFF) << 8) | (data[pos + 1] & 0xFF);
        pos += 2;
        return v;
    }

    private int readU32() {
        int v = ((data[pos] & 0xFF) << 24) |
                ((data[pos + 1] & 0xFF) << 16) |
                ((data[pos + 2] & 0xFF) << 8) |
                (data[pos + 3] & 0xFF);
        pos += 4;
        return v;
    }

    private int readI16() {
        int v = readU16();
        return (v > 0x7FFF) ? v - 0x10000 : v;
    }

    private int readI32() {
        long v = readU32() & 0xFFFFFFFFL;
        return (int) ((v > 0x7FFFFFFFL) ? v - 0x100000000L : v);
    }

    private float readF32() {
        int bits = readU32();
        return Float.intBitsToFloat(bits);
    }

    private double readF64() {
        long bits = ((readU32() & 0xFFFFFFFFL) << 32) | (readU32() & 0xFFFFFFFFL);
        return Double.longBitsToDouble(bits);
    }

    public int readMapHeader() {
        int b = readByte();
        if ((b & 0xF0) == 0x80) return b & 0x0F;
        if (b == 0xDE) return readU16();
        if (b == 0xDF) return readU32();
        throw new SCodecError("internal", "msgpack: expected map, got 0x" + Integer.toHexString(b));
    }

    public int readArrayHeader() {
        int b = readByte();
        if ((b & 0xF0) == 0x90) return b & 0x0F;
        if (b == 0xDC) return readU16();
        if (b == 0xDD) return readU32();
        throw new SCodecError("internal", "msgpack: expected array, got 0x" + Integer.toHexString(b));
    }

    @Override
    public String readString() {
        int b = readByte();
        int len;
        if ((b & 0xE0) == 0xA0) {
            len = b & 0x1F;
        } else if (b == 0xD9) {
            len = readByte();
        } else if (b == 0xDA) {
            len = readU16();
        } else if (b == 0xDB) {
            len = readU32();
        } else {
            throw new SCodecError("internal", "msgpack: expected string, got 0x" + Integer.toHexString(b));
        }
        String s = new String(data, pos, len, StandardCharsets.UTF_8);
        pos += len;
        return s;
    }

    public long readInt() {
        int b = readByte();
        if (b <= 0x7F) return (long) b;
        if (b >= 0xE0) return (long) (b - 0x100);
        if (b == 0xCC) return (long) readByte();
        if (b == 0xCD) return (long) readU16();
        if (b == 0xCE) return readU32() & 0xFFFFFFFFL;
        if (b == 0xD0) return (long) (byte) readByte();
        if (b == 0xD1) return (long) readI16();
        if (b == 0xD2) return (long) readI32();
        if (b == 0xD3) return ((readU32() & 0xFFFFFFFFL) << 32) | (readU32() & 0xFFFFFFFFL);
        if (b == 0xCF) return ((readU32() & 0xFFFFFFFFL) << 32) | (readU32() & 0xFFFFFFFFL);
        throw new SCodecError("internal", "msgpack: expected int, got 0x" + Integer.toHexString(b));
    }

    public double readFloat() {
        int b = readByte();
        if (b == 0xCA) return (double) readF32();
        if (b == 0xCB) return readF64();
        if (b <= 0x7F) return (double) b;
        if (b >= 0xE0) return (double) (b - 0x100);
        if (b == 0xCC) return (double) readByte();
        if (b == 0xCD) return (double) readU16();
        if (b == 0xCE) return (double) (readU32() & 0xFFFFFFFFL);
        if (b == 0xCF) {
            long hi = readU32() & 0xFFFFFFFFL;
            long lo = readU32() & 0xFFFFFFFFL;
            return Double.longBitsToDouble((hi << 32) | lo);
        }
        if (b == 0xD0) return (double) (byte) readByte();
        if (b == 0xD1) return (double) readI16();
        if (b == 0xD2) return (double) readI32();
        if (b == 0xD3) {
            long hi = readU32() & 0xFFFFFFFFL;
            long lo = readU32() & 0xFFFFFFFFL;
            return Double.longBitsToDouble((hi << 32) | lo);
        }
        throw new SCodecError("internal", "msgpack: expected float, got 0x" + Integer.toHexString(b));
    }

    @Override
    public boolean readBool() {
        int b = readByte();
        if (b == 0xC3) return true;
        if (b == 0xC2) return false;
        throw new SCodecError("internal", "msgpack: expected bool, got 0x" + Integer.toHexString(b));
    }

    @Override
    public void readNull() {
        int b = readByte();
        if (b != 0xC0) throw new SCodecError("internal", "msgpack: expected null, got 0x" + Integer.toHexString(b));
    }

    @Override
    public int readInt32() { return (int) readInt(); }

    @Override
    public int readUint32() { return (int) (readInt() & 0xFFFFFFFFL); }

    @Override
    public long readUint64() { return readInt(); }

    @Override
    public long readInt64() { return readInt(); }

    @Override
    public float readFloat32() { return (float) readFloat(); }

    @Override
    public double readFloat64() { return readFloat(); }

    @Override
    public byte[] readBytes() {
        int b = readByte();
        int len = switch (b) {
            case 0xC4 -> readByte();
            case 0xC5 -> readU16();
            case 0xC6 -> readU32();
            default -> throw new SCodecError("internal", "msgpack: expected bin, got 0x" + Integer.toHexString(b));
        };
        byte[] v = new byte[len];
        System.arraycopy(data, pos, v, 0, len);
        pos += len;
        return v;
    }

    @Override
    public String readEnum() { return readString(); }

    @Override
    public boolean isNull() { return pos < data.length && data[pos] == (byte) 0xC0; }

    @Override
    public void skip() {
        int b = readByte();
        if (b <= 0x7F || b >= 0xE0) return;
        if ((b & 0xF0) == 0x80) {
            int n = b & 0x0F;
            for (int i = 0; i < n; i++) { skip(); skip(); }
            return;
        }
        if ((b & 0xF0) == 0x90) {
            int n = b & 0x0F;
            for (int i = 0; i < n; i++) skip();
            return;
        }
        if ((b & 0xE0) == 0xA0) { pos += b & 0x1F; return; }
        switch (b) {
            case 0xC0, 0xC2, 0xC3 -> {}
            case 0xCC, 0xD0 -> pos += 1;
            case 0xCD, 0xD1 -> pos += 2;
            case 0xCE, 0xD2, 0xCA -> pos += 4;
            case 0xCF, 0xD3, 0xCB -> pos += 8;
            case 0xD9 -> pos += readByte();
            case 0xDA -> pos += readU16();
            case 0xDB -> pos += readU32();
            case 0xC4 -> pos += readByte();
            case 0xC5 -> pos += readU16();
            case 0xC6 -> pos += readU32();
            case 0xD4 -> pos += 2;
            case 0xD5 -> pos += 3;
            case 0xD6 -> pos += 5;
            case 0xD7 -> pos += 9;
            case 0xD8 -> pos += 17;
            case 0xC7 -> pos += 1 + readByte();
            case 0xC8 -> pos += 1 + readU16();
            case 0xC9 -> pos += 1 + readU32();
            case 0xDC -> { int n = readU16(); for (int i = 0; i < n; i++) skip(); }
            case 0xDD -> { int n = readU32(); for (int i = 0; i < n; i++) skip(); }
            case 0xDE -> { int n = readU16(); for (int i = 0; i < n; i++) { skip(); skip(); } }
            case 0xDF -> { int n = readU32(); for (int i = 0; i < n; i++) { skip(); skip(); } }
            default -> throw new SCodecError("internal", "msgpack: unknown format 0x" + Integer.toHexString(b));
        }
    }

    @Override
    public void beginObject() {
        int n = readMapHeader();
        containerCount.add(n);
    }

    @Override
    public boolean hasNextField() {
        int top = containerCount.size() - 1;
        if (containerCount.get(top) > 0) {
            containerCount.set(top, containerCount.get(top) - 1);
            return true;
        }
        containerCount.remove(top);
        return false;
    }

    @Override
    public String readFieldName() { return readString(); }

    @Override
    public void endObject() {}

    @Override
    public void beginArray() {
        int n = readArrayHeader();
        containerCount.add(n);
    }

    @Override
    public boolean hasNextElement() {
        int top = containerCount.size() - 1;
        if (containerCount.get(top) > 0) {
            containerCount.set(top, containerCount.get(top) - 1);
            return true;
        }
        containerCount.remove(top);
        return false;
    }

    @Override
    public void endArray() {}
}
