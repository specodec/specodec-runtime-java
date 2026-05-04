package specodec;

public interface SpecWriter {
    void writeString(String value);
    void writeBool(boolean value);
    void writeInt32(int value);
    void writeInt64(long value);
    void writeUint32(int value);
    void writeUint64(long value);
    void writeFloat32(float value);
    void writeFloat64(double value);
    void writeNull();
    void writeBytes(byte[] value);
    void writeEnum(String value);
    void beginObject(int fieldCount);
    void writeField(String name);
    void endObject();
    void beginArray(int elementCount);
    void nextElement();
    void endArray();
    byte[] toBytes();

    @FunctionalInterface
    interface EncodeFn<T> {
        void encode(SpecWriter w, T obj);
    }
}
