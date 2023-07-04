package y50;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class q implements b {

    /* renamed from: c  reason: collision with root package name */
    private static final BigInteger f59198c = BigInteger.valueOf(0);

    /* renamed from: a  reason: collision with root package name */
    private BigInteger f59199a;

    /* renamed from: b  reason: collision with root package name */
    private SecureRandom f59200b;

    @Override // y50.b
    public void init(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        throw new IllegalStateException("Operation not supported");
    }

    @Override // y50.b
    public void init(BigInteger bigInteger, SecureRandom secureRandom) {
        this.f59199a = bigInteger;
        this.f59200b = secureRandom;
    }

    @Override // y50.b
    public boolean isDeterministic() {
        return false;
    }

    @Override // y50.b
    public BigInteger nextK() {
        int bitLength = this.f59199a.bitLength();
        while (true) {
            BigInteger e11 = r70.a.e(bitLength, this.f59200b);
            if (!e11.equals(f59198c) && e11.compareTo(this.f59199a) < 0) {
                return e11;
            }
        }
    }
}