package specodec.ryu;

public final class RyuF64 {
    static final int DOUBLE_MANTISSA_BITS = 52;
    static final int DOUBLE_BIAS = 1023;
    static final int DOUBLE_POW5_INV_BITCOUNT = 125;
    static final int DOUBLE_POW5_BITCOUNT = 125;

    public static String float64ToString(double d) {
        long bits = Double.doubleToRawLongBits(d);

        boolean sign = (bits >> 63) != 0;
        long ieeeMantissa = bits & 0xFFFFFFFFFFFFFL;
        int ieeeExponent = (int) ((bits >> 52) & 0x7FFL);

        if (ieeeExponent == 2047) {
            if (ieeeMantissa == 0L) {
                return sign ? "-Infinity" : "Infinity";
            }
            return "NaN";
        }
        if (ieeeExponent == 0 && ieeeMantissa == 0L) {
            return sign ? "-0E0" : "0E0";
        }

        int e2;
        long m2;
        if (ieeeExponent == 0) {
            e2 = 1 - DOUBLE_BIAS - DOUBLE_MANTISSA_BITS - 2;
            m2 = ieeeMantissa;
        } else {
            e2 = ieeeExponent - DOUBLE_BIAS - DOUBLE_MANTISSA_BITS - 2;
            m2 = (1L << DOUBLE_MANTISSA_BITS) | ieeeMantissa;
        }

        boolean even = (m2 & 1L) == 0L;
        boolean acceptBounds = even;

        long mv = m2 * 4L;
        long mp = mv + 2L;
        long mmShift = 0L;
        if (ieeeMantissa != 0L || ieeeExponent <= 1) {
            mmShift = 1L;
        }
        long mm = mv - 1L - mmShift;

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
            int k = DOUBLE_POW5_INV_BITCOUNT + RyuMath.pow5bits(q) - 1;
            int i = -e2 + q + k;

            vr = RyuMath.mulShift64(mv, TablesF64.DOUBLE_POW5_INV_SPLIT[q], i);
            vp = RyuMath.mulShift64(mp, TablesF64.DOUBLE_POW5_INV_SPLIT[q], i);
            vm = RyuMath.mulShift64(mm, TablesF64.DOUBLE_POW5_INV_SPLIT[q], i);

            if (q != 0 && Long.divideUnsigned(vp - 1L, 10L) <= Long.divideUnsigned(vm, 10L)) {
                int l = DOUBLE_POW5_INV_BITCOUNT + RyuMath.pow5bits(q - 1) - 1;
                lastDigit = RyuMath.mulShift64(mv, TablesF64.DOUBLE_POW5_INV_SPLIT[q - 1], -e2 + q - 1 + l) % 10L;
            }

            if (q <= 21) {
                if (mv % 5L == 0L) {
                    vrIsTrailingZeros = RyuMath.multipleOfPowerOf5_64(mv, q);
                } else if (acceptBounds) {
                    vmIsTrailingZeros = RyuMath.multipleOfPowerOf5_64(mm, q);
                } else {
                    if (RyuMath.multipleOfPowerOf5_64(mp, q)) {
                        vp--;
                    }
                }
            }
        } else {
            int q = RyuMath.log10Pow5(-e2);
            e10 = q + e2;
            int i = -e2 - q;
            int k = RyuMath.pow5bits(i) - DOUBLE_POW5_BITCOUNT;
            int j = q - k;

            vr = RyuMath.mulShift64(mv, TablesF64.DOUBLE_POW5_SPLIT[i], j);
            vp = RyuMath.mulShift64(mp, TablesF64.DOUBLE_POW5_SPLIT[i], j);
            vm = RyuMath.mulShift64(mm, TablesF64.DOUBLE_POW5_SPLIT[i], j);

            if (q != 0 && Long.divideUnsigned(vp - 1L, 10L) <= Long.divideUnsigned(vm, 10L)) {
                int j2 = q - 1 - (RyuMath.pow5bits(i + 1) - DOUBLE_POW5_BITCOUNT);
                lastDigit = RyuMath.mulShift64(mv, TablesF64.DOUBLE_POW5_SPLIT[i + 1], j2) % 10L;
            }

            if (q <= 1) {
                vrIsTrailingZeros = true;
                if (acceptBounds) {
                    vmIsTrailingZeros = mmShift == 1L;
                } else {
                    vp--;
                }
            } else if (q < 63) {
                vrIsTrailingZeros = RyuMath.multipleOfPowerOf2_64(mv, q - 1);
                if (acceptBounds) {
                    vmIsTrailingZeros = RyuMath.multipleOfPowerOf5_64(mm, q);
                } else {
                    if (RyuMath.multipleOfPowerOf5_64(mp, q)) {
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
            int olength = RyuMath.decimalLength17(output);

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
            int olength = RyuMath.decimalLength17(output);

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
