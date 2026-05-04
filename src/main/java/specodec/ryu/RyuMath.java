package specodec.ryu;

public final class RyuMath {
    public static int pow5bits(int e) { return e * 1217359 / 524288 + 1; }

    public static int log10Pow2(int e) { return e * 78913 / 262144; }

    public static int log10Pow5(int e) { return e * 732923 / 1048576; }

    public static int decimalLength17(long v) {
        if (Long.compareUnsigned(v, 10000000000000000L) >= 0) return 17;
        if (Long.compareUnsigned(v, 1000000000000000L) >= 0) return 16;
        if (Long.compareUnsigned(v, 100000000000000L) >= 0) return 15;
        if (Long.compareUnsigned(v, 10000000000000L) >= 0) return 14;
        if (Long.compareUnsigned(v, 1000000000000L) >= 0) return 13;
        if (Long.compareUnsigned(v, 100000000000L) >= 0) return 12;
        if (Long.compareUnsigned(v, 10000000000L) >= 0) return 11;
        if (Long.compareUnsigned(v, 1000000000L) >= 0) return 10;
        if (Long.compareUnsigned(v, 100000000L) >= 0) return 9;
        if (Long.compareUnsigned(v, 10000000L) >= 0) return 8;
        if (Long.compareUnsigned(v, 1000000L) >= 0) return 7;
        if (Long.compareUnsigned(v, 100000L) >= 0) return 6;
        if (Long.compareUnsigned(v, 10000L) >= 0) return 5;
        if (Long.compareUnsigned(v, 1000L) >= 0) return 4;
        if (Long.compareUnsigned(v, 100L) >= 0) return 3;
        if (Long.compareUnsigned(v, 10L) >= 0) return 2;
        return 1;
    }

    public static int decimalLength9(int v) {
        long uv = v & 0xFFFFFFFFL;
        if (uv >= 100000000L) return 9;
        if (uv >= 10000000L) return 8;
        if (uv >= 1000000L) return 7;
        if (uv >= 100000L) return 6;
        if (uv >= 10000L) return 5;
        if (uv >= 1000L) return 4;
        if (uv >= 100L) return 3;
        if (uv >= 10L) return 2;
        return 1;
    }

    public static long mulShift32(long m, long factor, int shift) {
        long factorLo = factor & 0xFFFFFFFFL;
        long factorHi = factor >>> 32;
        long bits0 = m * factorLo;
        long bits1 = m * factorHi;
        long sumVal = (bits0 >>> 32) + bits1;
        return (sumVal >>> (shift - 32)) & 0xFFFFFFFFL;
    }

    public static long mulShift64(long m, long[] mul, int shift) {
        long[] r0 = umul128(m, mul[0]);
        long hi0 = r0[0];
        long[] r1 = umul128(m, mul[1]);
        long hi2 = r1[0], lo2 = r1[1];

        long sumLo = lo2 + hi0;
        long carry = (Long.compareUnsigned(sumLo, lo2) < 0) ? 1L : 0L;
        long sumHi = hi2 + carry;

        int shiftAmount = shift - 64;
        if (shiftAmount >= 128) return 0L;
        if (shiftAmount >= 64) return sumHi >>> (shiftAmount - 64);
        if (shiftAmount == 0) return sumLo;
        return (sumHi << (64 - shiftAmount)) | (sumLo >>> shiftAmount);
    }

    public static long[] umul128(long a, long b) {
        long aLo = a & 0xFFFFFFFFL;
        long aHi = a >>> 32;
        long bLo = b & 0xFFFFFFFFL;
        long bHi = b >>> 32;

        long ll = aLo * bLo;
        long lh = aLo * bHi;
        long hl = aHi * bLo;
        long hh = aHi * bHi;

        long mid = lh + hl;
        long overflow = (Long.compareUnsigned(mid, lh) < 0) ? 1L : 0L;

        long hi = hh + (mid >>> 32) + overflow;
        long lo = ll + ((mid & 0xFFFFFFFFL) << 32);
        if (Long.compareUnsigned(lo, ll) < 0) hi++;

        return new long[]{hi, lo};
    }

    public static boolean multipleOfPowerOf5_64(long value, int q) {
        if (q == 0) return true;
        if (q >= 64) return value == 0L;
        long pow5 = 5;
        for (int i = 1; i < q; i++) pow5 *= 5;
        return Long.remainderUnsigned(value, pow5) == 0L;
    }

    public static boolean multipleOfPowerOf2_64(long value, int q) {
        if (q == 0) return true;
        if (q >= 64) return value == 0L;
        return (value & ((1L << q) - 1L)) == 0L;
    }

    public static boolean multipleOfPowerOf5_32(int value, int q) {
        if (q == 0) return true;
        if (q >= 32) return (value & 0xFFFFFFFFL) == 0L;
        long pow5 = 5;
        for (int i = 1; i < q; i++) pow5 *= 5;
        long uvalue = value & 0xFFFFFFFFL;
        return (uvalue % pow5) == 0;
    }

    public static boolean multipleOfPowerOf2_32(int value, int q) {
        if (q == 0) return true;
        if (q >= 32) return (value & 0xFFFFFFFFL) == 0L;
        long mask = (1L << q) - 1;
        return (value & mask) == 0;
    }
}
