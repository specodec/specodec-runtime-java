package specodec;

public class SCodecError extends RuntimeException {
    public final String code;

    public SCodecError(String code, String message) {
        super(message);
        this.code = code;
    }
}
