package specodec.ryu;

public final class RyuF32 {
    static final int FLOAT_MANTISSA_BITS = 23;
    static final int FLOAT_BIAS = 127;
    static final int FLOAT_POW5_INV_BITCOUNT = 59;
    static final int FLOAT_POW5_BITCOUNT = 61;

    public static String float32ToString(float f) {
        int bits = Float.floatToRawIntBits(f);

        boolean sign = (bits >> 31) != 0;
        int ieeeMantissa = bits & 0x7FFFFF;
        int ieeeExponent = (bits >> 23) & 0xFF;

        if (ieeeExponent == 0xFF) {
            if (ieeeMantissa == 0) {
                return sign ? "-Infinity" : "Infinity";
            }
            return "NaN";
        }
        if (ieeeExponent == 0 && ieeeMantissa == 0) {
            return sign ? "-0E0" : "0E0";
        }

        int e2;
        long m2;
        if (ieeeExponent == 0) {
            e2 = 1 - FLOAT_BIAS - FLOAT_MANTISSA_BITS - 2;
            m2 = ieeeMantissa & 0xFFFFFFFFL;
        } else {
            e2 = ieeeExponent - FLOAT_BIAS - FLOAT_MANTISSA_BITS - 2;
            m2 = ((1L << FLOAT_MANTISSA_BITS) | (ieeeMantissa & 0x7FFFFFL));
        }

        boolean even = (m2 & 1L) == 0L;
        boolean acceptBounds = even;

        long mv = m2 * 4L;
        long mp = mv + 2L;
        int mmShift = 0;
        if (ieeeMantissa != 0 || ieeeExponent <= 1) {
            mmShift = 1;
        }
        long mm = mv - 1L - (long) mmShift;

        boolean vrIsTrailingZeros = false;
        boolean vmIsTrailingZeros = false;
        long lastDigit = 0L;
        int e10;
        long vr;
        long vp;
        long vm;

        if (e2 >= 0) {
            int q = RyuMath.log10Pow2(e2);
            e10 = q;
            int k = FLOAT_POW5_INV_BITCOUNT + RyuMath.pow5bits(q) - 1;
            int i = -e2 + q + k;

            vr = RyuMath.mulShift32(mv, TablesF32.FLOAT_POW5_INV_SPLIT[q] + 1L, i);
            vp = RyuMath.mulShift32(mp, TablesF32.FLOAT_POW5_INV_SPLIT[q] + 1L, i);
            vm = RyuMath.mulShift32(mm, TablesF32.FLOAT_POW5_INV_SPLIT[q] + 1L, i);

            if (q != 0 && Long.divideUnsigned(vp - 1L, 10L) <= Long.divideUnsigned(vm, 10L)) {
                int l = FLOAT_POW5_INV_BITCOUNT + RyuMath.pow5bits(q - 1) - 1;
                lastDigit = RyuMath.mulShift32(mv, TablesF32.FLOAT_POW5_INV_SPLIT[q - 1] + 1L, -e2 + q - 1 + l) % 10L;
            }

            if (q <= 9) {
                if (mv % 5L == 0L) {
                    vrIsTrailingZeros = RyuMath.multipleOfPowerOf5_32((int) (mv & 0xFFFFFFFFL), q);
                } else if (acceptBounds) {
                    vmIsTrailingZeros = RyuMath.multipleOfPowerOf5_32((int) (mm & 0xFFFFFFFFL), q);
                } else if (RyuMath.multipleOfPowerOf5_32((int) (mp & 0xFFFFFFFFL), q)) {
                    vp--;
                }
            }
        } else {
            int q = RyuMath.log10Pow5(-e2);
            e10 = q + e2;
            int i = -e2 - q;
            int k = RyuMath.pow5bits(i) - FLOAT_POW5_BITCOUNT;
            int j = q - k;

            vr = RyuMath.mulShift32(mv, TablesF32.FLOAT_POW5_SPLIT[i], j);
            vp = RyuMath.mulShift32(mp, TablesF32.FLOAT_POW5_SPLIT[i], j);
            vm = RyuMath.mulShift32(mm, TablesF32.FLOAT_POW5_SPLIT[i], j);

            if (q != 0 && Long.divideUnsigned(vp - 1L, 10L) <= Long.divideUnsigned(vm, 10L)) {
                int j2 = q - 1 - (RyuMath.pow5bits(i + 1) - FLOAT_POW5_BITCOUNT);
                lastDigit = RyuMath.mulShift32(mv, TablesF32.FLOAT_POW5_SPLIT[i + 1], j2) % 10L;
            }

            if (q <= 1) {
                vrIsTrailingZeros = true;
                if (acceptBounds) {
                    vmIsTrailingZeros = mmShift == 1;
                } else {
                    vp--;
                }
            } else if (q < 31) {
                vrIsTrailingZeros = RyuMath.multipleOfPowerOf2_32((int) (mv & 0xFFFFFFFFL), q - 1);
                if (acceptBounds) {
                    vmIsTrailingZeros = RyuMath.multipleOfPowerOf5_32((int) (mm & 0xFFFFFFFFL), q);
                } else {
                    if (RyuMath.multipleOfPowerOf5_32((int) (mp & 0xFFFFFFFFL), q)) {
                        vp--;
                    }
                }
            }
        }

        int removed = 0;
        long vr2 = vr;
        long vp2 = vp;
        long vm2 = vm;

        if (vmIsTrailingZeros || vrIsTrailingZeros) {
            while (Long.divideUnsigned(vp2, 10L) > Long.divideUnsigned(vm2, 10L)) {
                vmIsTrailingZeros = vmIsTrailingZeros && (vm2 % 10L == 0L);
                vrIsTrailingZeros = vrIsTrailingZeros && (lastDigit == 0L);
                lastDigit = vr2 % 10L;
                vr2 /= 10L;
                vp2 /= 10L;
                vm2 /= 10L;
                removed++;
            }

            if (vmIsTrailingZeros) {
                while (vm2 % 10L == 0L) {
                    vrIsTrailingZeros = vrIsTrailingZeros && (lastDigit == 0L);
                    lastDigit = vr2 % 10L;
                    vr2 /= 10L;
                    vp2 /= 10L;
                    vm2 /= 10L;
                    removed++;
                }
            }

            if (vrIsTrailingZeros && lastDigit == 5L && (vr2 & 1L) == 0L) {
                lastDigit = 4L;
            }

            boolean roundUp = (vr2 == vm2 && (!acceptBounds || !vmIsTrailingZeros)) || lastDigit >= 5L;
            long output = vr2;
            if (roundUp) {
                output++;
            }
            int exp = e10 + removed;
            int olength = RyuMath.decimalLength9((int) (output & 0xFFFFFFFFL));

            StringBuilder result = new StringBuilder();
            if (sign) result.append('-');
            String digits = Long.toUnsignedString(output);
            if (olength == 1) {
                result.append(digits);
            } else {
                result.append(digits.substring(0, 1)).append('.').append(digits.substring(1));
            }
            result.append('E').append(exp + olength - 1);
            return result.toString();
        } else {
            while (Long.divideUnsigned(vp2, 10L) > Long.divideUnsigned(vm2, 10L)) {
                lastDigit = vr2 % 10L;
                vr2 /= 10L;
                vp2 /= 10L;
                vm2 /= 10L;
                removed++;
            }

            long output = vr2;
            if (vr2 == vm2 || lastDigit >= 5L) {
                output++;
            }
            int exp = e10 + removed;
            int olength = RyuMath.decimalLength9((int) (output & 0xFFFFFFFFL));

            StringBuilder result = new StringBuilder();
            if (sign) result.append('-');
            String digits = Long.toUnsignedString(output);
            if (olength == 1) {
                result.append(digits);
            } else {
                result.append(digits.substring(0, 1)).append('.').append(digits.substring(1));
            }
            result.append('E').append(exp + olength - 1);
            return result.toString();
        }
    }
}
