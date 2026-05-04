package specodec;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class JsonWriter implements SpecWriter {
    private final StringBuilder sb = new StringBuilder();
    private final ArrayList<Boolean> firstItem = new ArrayList<>();

    private void escape(String s) {
        for (int i = 0; i < s.length(); i++) {
            int code = s.charAt(i);
            switch (code) {
                case 0x22 -> sb.append("\\\"");
                case 0x5C -> sb.append("\\\\");
                case 0x08 -> sb.append("\\b");
                case 0x0C -> sb.append("\\f");
                case 0x0A -> sb.append("\\n");
                case 0x0D -> sb.append("\\r");
                case 0x09 -> sb.append("\\t");
                default -> {
                    if (code >= 0 && code <= 0x1F)
                        sb.append("\\u").append(String.format("%04x", code));
                    else
                        sb.append((char) code);
                }
            }
        }
    }

    private String b64(byte[] buf) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        StringBuilder s = new StringBuilder();
        int i = 0;
        while (i < buf.length) {
            int b0 = buf[i] & 0xFF;
            int b1 = (i + 1 < buf.length) ? (buf[i + 1] & 0xFF) : 0;
            int b2 = (i + 2 < buf.length) ? (buf[i + 2] & 0xFF) : 0;
            s.append(chars.charAt(b0 >> 2));
            s.append(chars.charAt(((b0 & 3) << 4) | (b1 >> 4)));
            s.append((i + 1 < buf.length) ? chars.charAt(((b1 & 0xF) << 2) | (b2 >> 6)) : '=');
            s.append((i + 2 < buf.length) ? chars.charAt(b2 & 0x3F) : '=');
            i += 3;
        }
        return s.toString();
    }

    @Override
    public void writeString(String value) {
        sb.append('"');
        escape(value);
        sb.append('"');
    }

    @Override
    public void writeBool(boolean value) {
        sb.append(value ? "true" : "false");
    }

    @Override
    public void writeInt32(int value) {
        sb.append(value);
    }

    @Override
    public void writeInt64(long value) {
        sb.append('"');
        sb.append(value);
        sb.append('"');
    }

    @Override
    public void writeUint32(int value) {
        sb.append(value & 0xFFFFFFFFL);
    }

    @Override
    public void writeUint64(long value) {
        sb.append('"');
        sb.append(Long.toUnsignedString(value));
        sb.append('"');
    }

    @Override
    public void writeFloat32(float value) {
        if (Float.isNaN(value)) {
            sb.append("\"NaN\"");
        } else if (Float.isInfinite(value)) {
            sb.append(value > 0 ? "\"Infinity\"" : "\"-Infinity\"");
        } else {
            sb.append(FloatFmt.formatFloat32(value));
        }
    }

    @Override
    public void writeFloat64(double value) {
        if (Double.isNaN(value)) {
            sb.append("\"NaN\"");
        } else if (Double.isInfinite(value)) {
            sb.append(value > 0 ? "\"Infinity\"" : "\"-Infinity\"");
        } else {
            sb.append(FloatFmt.formatFloat64(value));
        }
    }

    @Override
    public void writeNull() {
        sb.append("null");
    }

    @Override
    public void writeBytes(byte[] value) {
        sb.append('"');
        sb.append(b64(value));
        sb.append('"');
    }

    @Override
    public void writeEnum(String value) {
        sb.append('"');
        escape(value);
        sb.append('"');
    }

    @Override
    public void beginObject(int fieldCount) {
        sb.append('{');
        firstItem.add(true);
    }

    @Override
    public void writeField(String name) {
        int top = firstItem.size() - 1;
        if (!firstItem.get(top)) sb.append(',');
        firstItem.set(top, false);
        sb.append('"');
        escape(name);
        sb.append('"');
        sb.append(':');
    }

    @Override
    public void endObject() {
        firstItem.remove(firstItem.size() - 1);
        sb.append('}');
    }

    @Override
    public void beginArray(int elementCount) {
        sb.append('[');
        firstItem.add(true);
    }

    @Override
    public void nextElement() {
        int top = firstItem.size() - 1;
        if (!firstItem.get(top)) sb.append(',');
        firstItem.set(top, false);
    }

    @Override
    public void endArray() {
        firstItem.remove(firstItem.size() - 1);
        sb.append(']');
    }

    @Override
    public byte[] toBytes() {
        return sb.toString().getBytes(StandardCharsets.UTF_8);
    }
}
