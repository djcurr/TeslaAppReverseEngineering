package q60;

import java.math.BigInteger;
import n60.f;

/* loaded from: classes5.dex */
public class q extends f.b {

    /* renamed from: h  reason: collision with root package name */
    public static final BigInteger f47937h = new BigInteger(1, org.bouncycastle.util.encoders.b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"));

    /* renamed from: g  reason: collision with root package name */
    protected int[] f47938g;

    public q() {
        this.f47938g = v60.f.h();
    }

    public q(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f47937h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        this.f47938g = p.c(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public q(int[] iArr) {
        this.f47938g = iArr;
    }

    @Override // n60.f
    public n60.f a(n60.f fVar) {
        int[] h11 = v60.f.h();
        p.a(this.f47938g, ((q) fVar).f47938g, h11);
        return new q(h11);
    }

    @Override // n60.f
    public n60.f b() {
        int[] h11 = v60.f.h();
        p.b(this.f47938g, h11);
        return new q(h11);
    }

    @Override // n60.f
    public n60.f d(n60.f fVar) {
        int[] h11 = v60.f.h();
        p.d(((q) fVar).f47938g, h11);
        p.f(h11, this.f47938g, h11);
        return new q(h11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            return v60.f.m(this.f47938g, ((q) obj).f47938g);
        }
        return false;
    }

    @Override // n60.f
    public int f() {
        return f47937h.bitLength();
    }

    @Override // n60.f
    public n60.f g() {
        int[] h11 = v60.f.h();
        p.d(this.f47938g, h11);
        return new q(h11);
    }

    @Override // n60.f
    public boolean h() {
        return v60.f.s(this.f47938g);
    }

    public int hashCode() {
        return f47937h.hashCode() ^ org.bouncycastle.util.a.J(this.f47938g, 0, 6);
    }

    @Override // n60.f
    public boolean i() {
        return v60.f.u(this.f47938g);
    }

    @Override // n60.f
    public n60.f j(n60.f fVar) {
        int[] h11 = v60.f.h();
        p.f(this.f47938g, ((q) fVar).f47938g, h11);
        return new q(h11);
    }

    @Override // n60.f
    public n60.f m() {
        int[] h11 = v60.f.h();
        p.h(this.f47938g, h11);
        return new q(h11);
    }

    @Override // n60.f
    public n60.f n() {
        int[] iArr = this.f47938g;
        if (v60.f.u(iArr) || v60.f.s(iArr)) {
            return this;
        }
        int[] h11 = v60.f.h();
        p.m(iArr, h11);
        p.f(h11, iArr, h11);
        int[] h12 = v60.f.h();
        p.m(h11, h12);
        p.f(h12, iArr, h12);
        int[] h13 = v60.f.h();
        p.n(h12, 3, h13);
        p.f(h13, h12, h13);
        p.n(h13, 2, h13);
        p.f(h13, h11, h13);
        p.n(h13, 8, h11);
        p.f(h11, h13, h11);
        p.n(h11, 3, h13);
        p.f(h13, h12, h13);
        int[] h14 = v60.f.h();
        p.n(h13, 16, h14);
        p.f(h14, h11, h14);
        p.n(h14, 35, h11);
        p.f(h11, h14, h11);
        p.n(h11, 70, h14);
        p.f(h14, h11, h14);
        p.n(h14, 19, h11);
        p.f(h11, h13, h11);
        p.n(h11, 20, h11);
        p.f(h11, h13, h11);
        p.n(h11, 4, h11);
        p.f(h11, h12, h11);
        p.n(h11, 6, h11);
        p.f(h11, h12, h11);
        p.m(h11, h11);
        p.m(h11, h12);
        if (v60.f.m(iArr, h12)) {
            return new q(h11);
        }
        return null;
    }

    @Override // n60.f
    public n60.f o() {
        int[] h11 = v60.f.h();
        p.m(this.f47938g, h11);
        return new q(h11);
    }

    @Override // n60.f
    public n60.f r(n60.f fVar) {
        int[] h11 = v60.f.h();
        p.o(this.f47938g, ((q) fVar).f47938g, h11);
        return new q(h11);
    }

    @Override // n60.f
    public boolean s() {
        return v60.f.p(this.f47938g, 0) == 1;
    }

    @Override // n60.f
    public BigInteger t() {
        return v60.f.H(this.f47938g);
    }
}