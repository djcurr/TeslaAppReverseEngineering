package n50;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class g {

    /* renamed from: d  reason: collision with root package name */
    private static final BigInteger f40539d = BigInteger.valueOf(2);

    /* renamed from: a  reason: collision with root package name */
    private int f40540a;

    /* renamed from: b  reason: collision with root package name */
    private int f40541b;

    /* renamed from: c  reason: collision with root package name */
    private SecureRandom f40542c;

    public u50.i a() {
        BigInteger[] a11 = h.a(this.f40540a, this.f40541b, this.f40542c);
        BigInteger bigInteger = a11[0];
        BigInteger bigInteger2 = a11[1];
        return new u50.i(bigInteger, h.b(bigInteger, bigInteger2, this.f40542c), bigInteger2, f40539d, null);
    }

    public void b(int i11, int i12, SecureRandom secureRandom) {
        this.f40540a = i11;
        this.f40541b = i12;
        this.f40542c = secureRandom;
    }
}