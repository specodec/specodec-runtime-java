package specodec;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class GronReader implements SpecReader {
    private final ArrayList<String[]> lines = new ArrayList<>();
    private int cursor = 0;
    private final ArrayList<CtxInfo> ctx = new ArrayList<>();

    private static class CtxInfo {
        final String prefix;
        final String type;
        int index;

        CtxInfo(String prefix, String type, int index) {
            this.prefix = prefix;
            this.type = type;
            this.index = index;
        }
    }

    public GronReader(byte[] data) {
        String text = new String(data, StandardCharsets.UTF_8);
        for (String raw : text.split("\n")) {
            String line = raw.trim();
            if (line.isEmpty()) continue;
            int eq = line.indexOf(" = ");
            if (eq < 0) continue;
            String path = line.substring(0, eq);
            String value = line.substring(eq + 3);
            if (value.endsWith(";")) value = value.substring(0, value.length() - 1);
            lines.add(new String[]{path, value});
        }
    }

    private String unescape(String s) {
        if (s.length() < 2 || s.charAt(0) != '"' || s.charAt(s.length() - 1) != '"')
            throw new SCodecError("internal", "gron: expected quoted string");
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (i < s.length() - 1) {
            if (s.charAt(i) == '\\') {
                i++;
                switch (s.charAt(i)) {
                    case '"' -> sb.append('"');
                    case '\\' -> sb.append('\\');
                    case '/' -> sb.append('/');
                    case 'b' -> sb.append('\b');
                    case 'f' -> sb.append('\f');
                    case 'n' -> sb.append('\n');
                    case 'r' -> sb.append('\r');
                    case 't' -> sb.append('\t');
                    case 'u' -> {
                        sb.append((char) Integer.parseInt(s.substring(i + 1, i + 5), 16));
                        i += 4;
                    }
                }
            } else {
                sb.append(s.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }

    private byte[] b64(String s) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        int padCount = 0;
        for (int i2 = s.length() - 1; i2 >= 0 && s.charAt(i2) == '='; i2--) padCount++;
        ArrayList<Byte> result = new ArrayList<>();
        int i = 0;
        while (i < s.length() && s.charAt(i) != '=') {
            int b0 = chars.indexOf(s.charAt(i)); i++;
            int b1 = (i < s.length() && s.charAt(i) != '=') ? chars.indexOf(s.charAt(i++)) : 0;
            int b2 = (i < s.length() && s.charAt(i) != '=') ? chars.indexOf(s.charAt(i++)) : 0;
            int b3 = (i < s.length() && s.charAt(i) != '=') ? chars.indexOf(s.charAt(i++)) : 0;
            result.add((byte) ((b0 << 2) | (b1 >> 4)));
            result.add((byte) (((b1 & 0xF) << 4) | (b2 >> 2)));
            result.add((byte) (((b2 & 3) << 6) | b3));
        }
        byte[] out = new byte[result.size() - padCount];
        for (int j = 0; j < out.length; j++) out[j] = result.get(j);
        return out;
    }

    @Override
    public String readString() { return unescape(lines.get(cursor++)[1]); }

    @Override
    public boolean readBool() { return lines.get(cursor++)[1].equals("true"); }

    @Override
    public int readInt32() { return Integer.parseInt(lines.get(cursor++)[1]); }

    @Override
    public long readInt64() { return Long.parseLong(unescape(lines.get(cursor++)[1])); }

    @Override
    public int readUint32() { return (int) Long.parseLong(lines.get(cursor++)[1]); }

    @Override
    public long readUint64() { return Long.parseUnsignedLong(unescape(lines.get(cursor++)[1])); }

    @Override
    public float readFloat32() {
        String v = lines.get(cursor++)[1];
        if (v.equals("\"NaN\"") || v.equals("NaN")) return Float.NaN;
        if (v.equals("\"Infinity\"") || v.equals("Infinity")) return Float.POSITIVE_INFINITY;
        if (v.equals("\"-Infinity\"") || v.equals("-Infinity")) return Float.NEGATIVE_INFINITY;
        return Float.parseFloat(v);
    }

    @Override
    public double readFloat64() {
        String v = lines.get(cursor++)[1];
        if (v.equals("\"NaN\"") || v.equals("NaN")) return Double.NaN;
        if (v.equals("\"Infinity\"") || v.equals("Infinity")) return Double.POSITIVE_INFINITY;
        if (v.equals("\"-Infinity\"") || v.equals("-Infinity")) return Double.NEGATIVE_INFINITY;
        return Double.parseDouble(v);
    }

    @Override
    public void readNull() {
        if (!lines.get(cursor++)[1].equals("null")) throw new SCodecError("internal", "gron: expected null");
    }

    @Override
    public byte[] readBytes() { return b64(unescape(lines.get(cursor++)[1])); }

    @Override
    public String readEnum() { return unescape(lines.get(cursor++)[1]); }

    @Override
    public void beginObject() {
        String[] line = lines.get(cursor++);
        ctx.add(new CtxInfo(line[0], "object", -1));
    }

    @Override
    public boolean hasNextField() {
        if (cursor >= lines.size()) return false;
        String pfx = ctx.get(ctx.size() - 1).prefix + ".";
        String p = lines.get(cursor)[0];
        if (!p.startsWith(pfx)) return false;
        String rem = p.substring(pfx.length());
        return !rem.contains(".") && !rem.contains("[");
    }

    @Override
    public String readFieldName() {
        String pfx = ctx.get(ctx.size() - 1).prefix + ".";
        return lines.get(cursor)[0].substring(pfx.length());
    }

    @Override
    public void endObject() { ctx.remove(ctx.size() - 1); }

    @Override
    public void beginArray() {
        String[] line = lines.get(cursor++);
        ctx.add(new CtxInfo(line[0], "array", -1));
    }

    @Override
    public boolean hasNextElement() {
        if (cursor >= lines.size()) return false;
        CtxInfo arr = ctx.get(ctx.size() - 1);
        int ni = arr.index + 1;
        String exp = arr.prefix + "[" + ni + "]";
        String p = lines.get(cursor)[0];
        boolean hasNext = p.equals(exp) || p.startsWith(exp + ".") || p.startsWith(exp + "[");
        if (hasNext) arr.index = ni;
        return hasNext;
    }

    @Override
    public void endArray() { ctx.remove(ctx.size() - 1); }

    @Override
    public boolean isNull() { return cursor < lines.size() && lines.get(cursor)[1].equals("null"); }

    @Override
    public void skip() {
        String sp = lines.get(cursor++)[0];
        while (cursor < lines.size()) {
            String np = lines.get(cursor)[0];
            if (np.length() > sp.length() && (np.startsWith(sp + ".") || np.startsWith(sp + "["))) cursor++;
            else break;
        }
    }
}
