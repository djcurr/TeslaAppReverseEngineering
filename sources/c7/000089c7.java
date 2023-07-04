package n50;

import java.math.BigInteger;
import java.security.SecureRandom;
import u50.n0;

/* loaded from: classes5.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private int f40561a;

    /* renamed from: b  reason: collision with root package name */
    private int f40562b;

    /* renamed from: c  reason: collision with root package name */
    private SecureRandom f40563c;

    public n0 a() {
        BigInteger[] a11 = h.a(this.f40561a, this.f40562b, this.f40563c);
        BigInteger bigInteger = a11[0];
        return new n0(bigInteger, h.b(bigInteger, a11[1], this.f40563c));
    }

    public void b(int i11, int i12, SecureRandom secureRandom) {
        this.f40561a = i11;
        this.f40562b = i12;
        this.f40563c = secureRandom;
    }
}