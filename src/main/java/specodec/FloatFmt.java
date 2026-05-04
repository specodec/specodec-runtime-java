package specodec;

import specodec.ryu.*;

public final class FloatFmt {
    public static String formatFloat32(float value) {
        return RyuF32.float32ToString(value);
    }

    public static String formatFloat64(double value) {
        return RyuF64.float64ToString(value);
    }
}
