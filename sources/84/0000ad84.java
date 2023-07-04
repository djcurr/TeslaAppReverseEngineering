package q60;

import java.math.BigInteger;
import n60.f;

/* loaded from: classes5.dex */
public class u extends f.b {

    /* renamed from: h  reason: collision with root package name */
    public static final BigInteger f47974h = new BigInteger(1, org.bouncycastle.util.encoders.b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"));

    /* renamed from: g  reason: collision with root package name */
    protected int[] f47975g;

    public u() {
        this.f47975g = v60.f.h();
    }

    public u(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f47974h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        this.f47975g = t.d(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public u(int[] iArr) {
        this.f47975g = iArr;
    }

    @Override // n60.f
    public n60.f a(n60.f fVar) {
        int[] h11 = v60.f.h();
        t.a(this.f47975g, ((u) fVar).f47975g, h11);
        return new u(h11);
    }

    @Override // n60.f
    public n60.f b() {
        int[] h11 = v60.f.h();
        t.b(this.f47975g, h11);
        return new u(h11);
    }

    @Override // n60.f
    public n60.f d(n60.f fVar) {
        int[] h11 = v60.f.h();
        t.e(((u) fVar).f47975g, h11);
        t.g(h11, this.f47975g, h11);
        return new u(h11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            return v60.f.m(this.f47975g, ((u) obj).f47975g);
        }
        return false;
    }

    @Override // n60.f
    public int f() {
        return f47974h.bitLength();
    }

    @Override // n60.f
    public n60.f g() {
        int[] h11 = v60.f.h();
        t.e(this.f47975g, h11);
        return new u(h11);
    }

    @Override // n60.f
    public boolean h() {
        return v60.f.s(this.f47975g);
    }

    public int hashCode() {
        return f47974h.hashCode() ^ org.bouncycastle.util.a.J(this.f47975g, 0, 6);
    }

    @Override // n60.f
    public boolean i() {
        return v60.f.u(this.f47975g);
    }

    @Override // n60.f
    public n60.f j(n60.f fVar) {
        int[] h11 = v60.f.h();
        t.g(this.f47975g, ((u) fVar).f47975g, h11);
        return new u(h11);
    }

    @Override // n60.f
    public n60.f m() {
        int[] h11 = v60.f.h();
        t.i(this.f47975g, h11);
        return new u(h11);
    }

    @Override // n60.f
    public n60.f n() {
        int[] iArr = this.f47975g;
        if (v60.f.u(iArr) || v60.f.s(iArr)) {
            return this;
        }
        int[] h11 = v60.f.h();
        int[] h12 = v60.f.h();
        t.n(iArr, h11);
        t.g(h11, iArr, h11);
        t.o(h11, 2, h12);
        t.g(h12, h11, h12);
        t.o(h12, 4, h11);
        t.g(h11, h12, h11);
        t.o(h11, 8, h12);
        t.g(h12, h11, h12);
        t.o(h12, 16, h11);
        t.g(h11, h12, h11);
        t.o(h11, 32, h12);
        t.g(h12, h11, h12);
        t.o(h12, 64, h11);
        t.g(h11, h12, h11);
        t.o(h11, 62, h11);
        t.n(h11, h12);
        if (v60.f.m(iArr, h12)) {
            return new u(h11);
        }
        return null;
    }

    @Override // n60.f
    public n60.f o() {
        int[] h11 = v60.f.h();
        t.n(this.f47975g, h11);
        return new u(h11);
    }

    @Override // n60.f
    public n60.f r(n60.f fVar) {
        int[] h11 = v60.f.h();
        t.q(this.f47975g, ((u) fVar).f47975g, h11);
        return new u(h11);
    }

    @Override // n60.f
    public boolean s() {
        return v60.f.p(this.f47975g, 0) == 1;
    }

    @Override // n60.f
    public BigInteger t() {
        return v60.f.H(this.f47975g);
    }
}