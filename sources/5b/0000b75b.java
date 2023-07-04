package u50;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class n1 extends b {

    /* renamed from: d  reason: collision with root package name */
    private static final BigInteger f53253d = new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);

    /* renamed from: e  reason: collision with root package name */
    private static final BigInteger f53254e = BigInteger.valueOf(1);

    /* renamed from: b  reason: collision with root package name */
    private BigInteger f53255b;

    /* renamed from: c  reason: collision with root package name */
    private BigInteger f53256c;

    public n1(boolean z11, BigInteger bigInteger, BigInteger bigInteger2) {
        super(z11);
        if (!z11 && (bigInteger2.intValue() & 1) == 0) {
            throw new IllegalArgumentException("RSA publicExponent is even");
        }
        this.f53255b = d(bigInteger);
        this.f53256c = bigInteger2;
    }

    private BigInteger d(BigInteger bigInteger) {
        if ((bigInteger.intValue() & 1) != 0) {
            if (r70.j.c("org.bouncycastle.rsa.allow_unsafe_mod") || bigInteger.gcd(f53253d).equals(f53254e)) {
                return bigInteger;
            }
            throw new IllegalArgumentException("RSA modulus has a small prime factor");
        }
        throw new IllegalArgumentException("RSA modulus is even");
    }

    public BigInteger b() {
        return this.f53256c;
    }

    public BigInteger c() {
        return this.f53255b;
    }
}