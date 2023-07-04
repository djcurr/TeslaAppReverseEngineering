package n50;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
class h {

    /* renamed from: a  reason: collision with root package name */
    private static final BigInteger f40543a = BigInteger.valueOf(1);

    /* renamed from: b  reason: collision with root package name */
    private static final BigInteger f40544b = BigInteger.valueOf(2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BigInteger[] a(int i11, int i12, SecureRandom secureRandom) {
        int i13 = i11 - 1;
        int i14 = i11 >>> 2;
        while (true) {
            BigInteger g11 = r70.a.g(i13, 2, secureRandom);
            BigInteger add = g11.shiftLeft(1).add(f40543a);
            if (add.isProbablePrime(i12) && (i12 <= 2 || g11.isProbablePrime(i12 - 2))) {
                if (n60.x.h(add) >= i14) {
                    return new BigInteger[]{add, g11};
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BigInteger b(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger modPow;
        BigInteger subtract = bigInteger.subtract(f40544b);
        do {
            BigInteger bigInteger3 = f40544b;
            modPow = r70.a.f(bigInteger3, subtract, secureRandom).modPow(bigInteger3, bigInteger);
        } while (modPow.equals(f40543a));
        return modPow;
    }
}