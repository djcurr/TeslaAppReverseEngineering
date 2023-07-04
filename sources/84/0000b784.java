package u60;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    static final a f53349a = new g(BigInteger.valueOf(2));

    /* renamed from: b  reason: collision with root package name */
    static final a f53350b = new g(BigInteger.valueOf(3));

    public static f a(int[] iArr) {
        if (iArr[0] == 0) {
            for (int i11 = 1; i11 < iArr.length; i11++) {
                if (iArr[i11] <= iArr[i11 - 1]) {
                    throw new IllegalArgumentException("Polynomial exponents must be monotonically increasing");
                }
            }
            return new d(f53349a, new c(iArr));
        }
        throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
    }

    public static a b(BigInteger bigInteger) {
        int bitLength = bigInteger.bitLength();
        if (bigInteger.signum() <= 0 || bitLength < 2) {
            throw new IllegalArgumentException("'characteristic' must be >= 2");
        }
        if (bitLength < 3) {
            int intValue = bigInteger.intValue();
            if (intValue == 2) {
                return f53349a;
            }
            if (intValue == 3) {
                return f53350b;
            }
        }
        return new g(bigInteger);
    }
}