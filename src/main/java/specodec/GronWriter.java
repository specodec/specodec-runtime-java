package specodec;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class GronWriter implements SpecWriter {
    private final ArrayList<String> lines = new ArrayList<>();
    private final ArrayList<String> segments;
    private final ArrayList<NestInfo> nesting = new ArrayList<>();

    private static class NestInfo {
        final int depth;
        int arrayIndex;

        NestInfo(int depth, int arrayIndex) {
            this.depth = depth;
            this.arrayIndex = arrayIndex;
        }
    }

    public GronWriter() {
        segments = new ArrayList<>();
        segments.add("json");
    }

    private String buildPath() {
        StringBuilder r = new StringBuilder(segments.get(0));
        for (int i = 1; i < segments.size(); i++) {
            if (segments.get(i).startsWith("[")) r.append(segments.get(i));
            else r.append(".").append(segments.get(i));
        }
        return r.toString();
    }

    private String escape(String s) {
        StringBuilder sb = new StringBuilder();
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
        return sb.toString();
    }

    private String b64(byte[] buf) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < buf.length) {
            int b0 = buf[i] & 0xFF;
            int b1 = (i + 1 < buf.length) ? (buf[i + 1] & 0xFF) : 0;
            int b2 = (i + 2 < buf.length) ? (buf[i + 2] & 0xFF) : 0;
            sb.append(chars.charAt(b0 >> 2));
            sb.append(chars.charAt(((b0 & 3) << 4) | (b1 >> 4)));
            sb.append((i + 1 < buf.length) ? chars.charAt(((b1 & 0xF) << 2) | (b2 >> 6)) : '=');
            sb.append((i + 2 < buf.length) ? chars.charAt(b2 & 0x3F) : '=');
            i += 3;
        }
        return sb.toString();
    }

    private void emit(String raw) {
        lines.add(buildPath() + " = " + raw + ";");
    }

    @Override
    public void writeString(String value) { emit("\"" + escape(value) + "\""); }

    @Override
    public void writeBool(boolean value) { emit(value ? "true" : "false"); }

    @Override
    public void writeInt32(int value) { emit(Integer.toString(value)); }

    @Override
    public void writeInt64(long value) { emit("\"" + value + "\""); }

    @Override
    public void writeUint32(int value) { emit(Long.toString(value & 0xFFFFFFFFL)); }

    @Override
    public void writeUint64(long value) { emit("\"" + Long.toUnsignedString(value) + "\""); }

    @Override
    public void writeFloat32(float value) {
        if (Float.isNaN(value)) {
            emit("\"NaN\"");
        } else if (Float.isInfinite(value)) {
            emit(value > 0 ? "\"Infinity\"" : "\"-Infinity\"");
        } else {
            emit(FloatFmt.formatFloat32(value));
        }
    }

    @Override
    public void writeFloat64(double value) {
        if (Double.isNaN(value)) {
            emit("\"NaN\"");
        } else if (Double.isInfinite(value)) {
            emit(value > 0 ? "\"Infinity\"" : "\"-Infinity\"");
        } else {
            emit(FloatFmt.formatFloat64(value));
        }
    }

    @Override
    public void writeNull() { emit("null"); }

    @Override
    public void writeBytes(byte[] value) { emit("\"" + b64(value) + "\""); }

    @Override
    public void beginObject(int fieldCount) {
        lines.add(buildPath() + " = {};");
        nesting.add(new NestInfo(segments.size(), -1));
    }

    @Override
    public void writeField(String name) {
        NestInfo top = nesting.get(nesting.size() - 1);
        if (segments.size() > top.depth) segments.set(segments.size() - 1, name);
        else segments.add(name);
    }

    @Override
    public void endObject() {
        NestInfo info = nesting.remove(nesting.size() - 1);
        while (segments.size() > info.depth) segments.remove(segments.size() - 1);
    }

    @Override
    public void beginArray(int elementCount) {
        lines.add(buildPath() + " = [];");
        nesting.add(new NestInfo(segments.size(), -1));
    }

    @Override
    public void nextElement() {
        NestInfo info = nesting.get(nesting.size() - 1);
        info.arrayIndex++;
        String seg = "[" + info.arrayIndex + "]";
        if (segments.size() > info.depth) segments.set(segments.size() - 1, seg);
        else segments.add(seg);
    }

    @Override
    public void endArray() {
        NestInfo info = nesting.remove(nesting.size() - 1);
        while (segments.size() > info.depth) segments.remove(segments.size() - 1);
    }

    @Override
    public void writeEnum(String value) { emit("\"" + escape(value) + "\""); }

    @Override
    public byte[] toBytes() {
        return String.join("\n", lines).concat("\n").getBytes(StandardCharsets.UTF_8);
    }
}
