package u50;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class m1 extends org.bouncycastle.crypto.t {

    /* renamed from: c  reason: collision with root package name */
    private BigInteger f53246c;

    /* renamed from: d  reason: collision with root package name */
    private int f53247d;

    public m1(BigInteger bigInteger, SecureRandom secureRandom, int i11, int i12) {
        super(secureRandom, i11);
        if (i11 < 12) {
            throw new IllegalArgumentException("key strength too small");
        }
        if (!bigInteger.testBit(0)) {
            throw new IllegalArgumentException("public exponent cannot be even");
        }
        this.f53246c = bigInteger;
        this.f53247d = i12;
    }

    public int c() {
        return this.f53247d;
    }

    public BigInteger d() {
        return this.f53246c;
    }
}