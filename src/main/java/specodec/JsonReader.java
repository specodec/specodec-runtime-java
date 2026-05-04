package specodec;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class JsonReader implements SpecReader {
    private final String src;
    private int pos;
    private final ArrayList<Boolean> _firstField = new ArrayList<>();
    private final ArrayList<Boolean> _firstElem = new ArrayList<>();

    public JsonReader(byte[] data) {
        this.src = new String(data, StandardCharsets.UTF_8);
        this.pos = 0;
    }

    public int pos() { return pos; }

    private void ws() {
        while (pos < src.length()) {
            int c = src.charAt(pos);
            if (c == 0x20 || c == 0x09 || c == 0x0A || c == 0x0D) pos++;
            else break;
        }
    }

    private char peek() {
        ws();
        if (pos >= src.length()) throw new SCodecError("internal", "json: unexpected end of input");
        return src.charAt(pos);
    }

    private char read() {
        ws();
        if (pos >= src.length()) throw new SCodecError("internal", "json: unexpected end of input");
        return src.charAt(pos++);
    }

    private void expect(char ch) {
        char got = read();
        if (got != ch) throw new SCodecError("internal", "json: expected '" + ch + "', got '" + got + "' at " + (pos - 1));
    }

    private String parseString() {
        expect('"');
        StringBuilder parts = new StringBuilder();
        while (pos < src.length()) {
            char c = src.charAt(pos);
            int code = c;
            if (code == 0x22) { pos++; return parts.toString(); }
            if (code == 0x5C) {
                pos++;
                if (pos >= src.length()) throw new SCodecError("internal", "json: unexpected end of string escape");
                int esc = src.charAt(pos);
                switch (esc) {
                    case 0x22 -> { parts.append('"'); pos++; }
                    case 0x5C -> { parts.append('\\'); pos++; }
                    case 0x2F -> { parts.append('/'); pos++; }
                    case 0x62 -> { parts.append('\b'); pos++; }
                    case 0x66 -> { parts.append('\f'); pos++; }
                    case 0x6E -> { parts.append('\n'); pos++; }
                    case 0x72 -> { parts.append('\r'); pos++; }
                    case 0x74 -> { parts.append('\t'); pos++; }
                    case 0x75 -> {
                        pos++;
                        if (pos + 4 > src.length()) throw new SCodecError("internal", "json: incomplete unicode escape");
                        String hex = src.substring(pos, pos + 4);
                        int cp = Integer.parseInt(hex, 16);
                        pos += 4;
                        if (cp >= 0xD800 && cp <= 0xDBFF) {
                            if (pos + 6 <= src.length() && src.charAt(pos) == '\\' && src.charAt(pos + 1) == 'u') {
                                pos += 2;
                                String hex2 = src.substring(pos, pos + 4);
                                int low = Integer.parseInt(hex2, 16);
                                pos += 4;
                                if (low >= 0xDC00 && low <= 0xDFFF) {
                                    cp = 0x10000 + (cp - 0xD800) * 0x400 + (low - 0xDC00);
                                } else {
                                    throw new SCodecError("internal", "json: expected low surrogate");
                                }
                            } else {
                                throw new SCodecError("internal", "json: expected low surrogate");
                            }
                        }
                        parts.append((char) cp);
                    }
                    default -> throw new SCodecError("internal", "json: invalid escape '\\" + (char) esc + "'");
                }
            } else if (code < 0x20) {
                throw new SCodecError("internal", "json: unescaped control char U+" + String.format("%04x", code));
            } else {
                parts.append(c); pos++;
            }
        }
        throw new SCodecError("internal", "json: unterminated string");
    }

    private String parseNumberRaw() {
        ws();
        int start = pos;
        if (pos < src.length() && src.charAt(pos) == '-') pos++;
        if (pos >= src.length()) throw new SCodecError("internal", "json: unexpected end of number");
        if (src.charAt(pos) == '0') { pos++; }
        else if (src.charAt(pos) >= '1' && src.charAt(pos) <= '9') {
            pos++;
            while (pos < src.length() && src.charAt(pos) >= '0' && src.charAt(pos) <= '9') pos++;
        } else throw new SCodecError("internal", "json: invalid number");
        if (pos < src.length() && src.charAt(pos) == '.') {
            pos++;
            if (pos >= src.length() || src.charAt(pos) < '0' || src.charAt(pos) > '9')
                throw new SCodecError("internal", "json: invalid fraction");
            while (pos < src.length() && src.charAt(pos) >= '0' && src.charAt(pos) <= '9') pos++;
        }
        if (pos < src.length() && (src.charAt(pos) == 'e' || src.charAt(pos) == 'E')) {
            pos++;
            if (pos < src.length() && (src.charAt(pos) == '+' || src.charAt(pos) == '-')) pos++;
            if (pos >= src.length() || src.charAt(pos) < '0' || src.charAt(pos) > '9')
                throw new SCodecError("internal", "json: invalid exponent");
            while (pos < src.length() && src.charAt(pos) >= '0' && src.charAt(pos) <= '9') pos++;
        }
        return src.substring(start, pos);
    }

    @Override
    public String readString() { return parseString(); }

    @Override
    public boolean readBool() {
        char ch = peek();
        if (ch == 't') { for (char c : "true".toCharArray()) if (read() != c) throw new SCodecError("internal", "json: expected true"); return true; }
        if (ch == 'f') { for (char c : "false".toCharArray()) if (read() != c) throw new SCodecError("internal", "json: expected false"); return false; }
        throw new SCodecError("internal", "json: expected bool, got '" + ch + "'");
    }

    @Override
    public int readInt32() {
        String raw = parseNumberRaw();
        try { return Integer.parseInt(raw); }
        catch (NumberFormatException e) { throw new SCodecError("internal", "json: invalid int32: " + raw); }
    }

    @Override
    public long readInt64() {
        if (peek() == '"') {
            String s = parseString();
            try { return Long.parseLong(s); }
            catch (NumberFormatException e) { throw new SCodecError("internal", "json: invalid int64: " + s); }
        }
        String raw = parseNumberRaw();
        try { return Long.parseLong(raw); }
        catch (NumberFormatException e) { throw new SCodecError("internal", "json: invalid int64: " + raw); }
    }

    @Override
    public int readUint32() {
        String raw = parseNumberRaw();
        try { return (int) Long.parseLong(raw); }
        catch (NumberFormatException e) { throw new SCodecError("internal", "json: invalid uint32: " + raw); }
    }

    @Override
    public long readUint64() {
        if (peek() == '"') {
            String s = parseString();
            try { return Long.parseUnsignedLong(s); }
            catch (NumberFormatException e) { throw new SCodecError("internal", "json: invalid uint64: " + s); }
        }
        String raw = parseNumberRaw();
        try { return Long.parseUnsignedLong(raw); }
        catch (NumberFormatException e) { throw new SCodecError("internal", "json: invalid uint64: " + raw); }
    }

    @Override
    public float readFloat32() {
        if (peek() == '"') {
            String s = parseString();
            if (s.equals("NaN")) return Float.NaN;
            if (s.equals("Infinity")) return Float.POSITIVE_INFINITY;
            if (s.equals("-Infinity")) return Float.NEGATIVE_INFINITY;
            try { return Float.parseFloat(s); }
            catch (NumberFormatException e) { throw new SCodecError("internal", "json: invalid float32: " + s); }
        }
        String raw = parseNumberRaw();
        try { return Float.parseFloat(raw); }
        catch (NumberFormatException e) { throw new SCodecError("internal", "json: invalid float32: " + raw); }
    }

    @Override
    public double readFloat64() {
        if (peek() == '"') {
            String s = parseString();
            if (s.equals("NaN")) return Double.NaN;
            if (s.equals("Infinity")) return Double.POSITIVE_INFINITY;
            if (s.equals("-Infinity")) return Double.NEGATIVE_INFINITY;
            try { return Double.parseDouble(s); }
            catch (NumberFormatException e) { throw new SCodecError("internal", "json: invalid float64: " + s); }
        }
        String raw = parseNumberRaw();
        try { return Double.parseDouble(raw); }
        catch (NumberFormatException e) { throw new SCodecError("internal", "json: invalid float64: " + raw); }
    }

    @Override
    public void readNull() {
        for (char c : "null".toCharArray()) if (read() != c) throw new SCodecError("internal", "json: expected null");
    }

    @Override
    public byte[] readBytes() {
        String s = parseString();
        int[] lookup = new int[128];
        Arrays.fill(lookup, -1);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        for (int i = 0; i < alphabet.length(); i++) lookup[alphabet.charAt(i)] = i;
        ArrayList<Byte> out = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int a = lookup[s.charAt(i)];
            int b = lookup[s.charAt(i + 1)];
            int c = (s.charAt(i + 2) == '=') ? -1 : lookup[s.charAt(i + 2)];
            int d = (s.charAt(i + 3) == '=') ? -1 : lookup[s.charAt(i + 3)];
            if (a < 0 || b < 0) throw new SCodecError("internal", "json: invalid base64");
            out.add((byte) ((a << 2) | (b >> 4)));
            if (c >= 0) {
                out.add((byte) (((b & 0xF) << 4) | (c >> 2)));
                if (d >= 0) out.add((byte) (((c & 0x3) << 6) | d));
            }
            i += 4;
        }
        byte[] result = new byte[out.size()];
        for (int j = 0; j < out.size(); j++) result[j] = out.get(j);
        return result;
    }

    @Override
    public String readEnum() { return parseString(); }

    @Override
    public void beginObject() {
        expect('{');
        _firstField.add(true);
    }

    @Override
    public boolean hasNextField() {
        char ch = peek();
        if (ch == '}') {
            _firstField.remove(_firstField.size() - 1);
            return false;
        }
        int top = _firstField.size() - 1;
        if (!_firstField.get(top)) {
            if (ch != ',') throw new SCodecError("internal", "json: expected ',' or '}', got '" + ch + "'");
            pos++;
        } else {
            _firstField.set(top, false);
        }
        return true;
    }

    @Override
    public String readFieldName() {
        String key = parseString();
        ws();
        if (pos < src.length() && src.charAt(pos) == ':') {
            pos++;
        } else {
            throw new SCodecError("internal", "json: expected ':' after field name '" + key + "'");
        }
        return key;
    }

    @Override
    public void endObject() { expect('}'); }

    @Override
    public void beginArray() {
        expect('[');
        _firstElem.add(true);
    }

    @Override
    public boolean hasNextElement() {
        char ch = peek();
        if (ch == ']') {
            _firstElem.remove(_firstElem.size() - 1);
            return false;
        }
        int top = _firstElem.size() - 1;
        if (!_firstElem.get(top)) {
            if (ch != ',') throw new SCodecError("internal", "json: expected ',' or ']', got '" + ch + "'");
            pos++;
        } else {
            _firstElem.set(top, false);
        }
        return true;
    }

    @Override
    public void endArray() { expect(']'); }

    @Override
    public boolean isNull() { return peek() == 'n'; }

    @Override
    public void skip() {
        ws();
        if (pos >= src.length()) throw new SCodecError("internal", "json: unexpected end of input");
        char ch = src.charAt(pos);
        if (ch == '"') {
            pos++;
            while (pos < src.length()) {
                if (src.charAt(pos) == '\\') pos += 2;
                else if (src.charAt(pos) == '"') { pos++; return; }
                else pos++;
            }
            throw new SCodecError("internal", "json: unterminated string in skip");
        } else if (ch == '{') {
            beginObject();
            while (hasNextField()) { readFieldName(); skip(); }
            endObject();
        } else if (ch == '[') {
            beginArray();
            while (hasNextElement()) { skip(); }
            endArray();
        } else if (ch == 't') {
            for (char c : "true".toCharArray()) if (read() != c) throw new SCodecError("internal", "json: skip expected true");
        } else if (ch == 'f') {
            for (char c : "false".toCharArray()) if (read() != c) throw new SCodecError("internal", "json: skip expected false");
        } else if (ch == 'n') {
            for (char c : "null".toCharArray()) if (read() != c) throw new SCodecError("internal", "json: skip expected null");
        } else if ((ch >= '0' && ch <= '9') || ch == '-') {
            parseNumberRaw();
        } else {
            throw new SCodecError("internal", "json: unexpected '" + ch + "' in skip");
        }
    }
}
