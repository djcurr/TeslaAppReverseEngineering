package n50;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
class e {

    /* renamed from: a  reason: collision with root package name */
    static final e f40535a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final BigInteger f40536b = BigInteger.valueOf(1);

    /* renamed from: c  reason: collision with root package name */
    private static final BigInteger f40537c = BigInteger.valueOf(2);

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BigInteger a(u50.i iVar, SecureRandom secureRandom) {
        BigInteger f11;
        BigInteger bit;
        int d11 = iVar.d();
        if (d11 != 0) {
            int i11 = d11 >>> 2;
            do {
                bit = r70.a.e(d11, secureRandom).setBit(d11 - 1);
            } while (n60.x.h(bit) < i11);
            return bit;
        }
        BigInteger bigInteger = f40537c;
        int e11 = iVar.e();
        BigInteger shiftLeft = e11 != 0 ? f40536b.shiftLeft(e11 - 1) : bigInteger;
        BigInteger g11 = iVar.g();
        if (g11 == null) {
            g11 = iVar.f();
        }
        BigInteger subtract = g11.subtract(bigInteger);
        int bitLength = subtract.bitLength() >>> 2;
        do {
            f11 = r70.a.f(shiftLeft, subtract, secureRandom);
        } while (n60.x.h(f11) < bitLength);
        return f11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BigInteger b(u50.i iVar, BigInteger bigInteger) {
        return iVar.b().modPow(bigInteger, iVar.f());
    }
}