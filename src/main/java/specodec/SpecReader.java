package specodec;

public interface SpecReader {
    void beginObject();
    boolean hasNextField();
    String readFieldName();
    void endObject();
    void beginArray();
    boolean hasNextElement();
    void endArray();
    String readString();
    boolean readBool();
    int readInt32();
    long readInt64();
    int readUint32();
    long readUint64();
    float readFloat32();
    double readFloat64();
    void readNull();
    byte[] readBytes();
    String readEnum();
    boolean isNull();
    void skip();

    @FunctionalInterface
    interface DecodeFn<T> {
        T decode(SpecReader r);
    }
}
