package q60;

import java.math.BigInteger;
import n60.f;

/* loaded from: classes5.dex */
public class g0 extends f.b {

    /* renamed from: h  reason: collision with root package name */
    public static final BigInteger f47850h = new BigInteger(1, org.bouncycastle.util.encoders.b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"));

    /* renamed from: g  reason: collision with root package name */
    protected int[] f47851g;

    public g0() {
        this.f47851g = v60.h.i();
    }

    public g0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f47850h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        this.f47851g = f0.c(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g0(int[] iArr) {
        this.f47851g = iArr;
    }

    @Override // n60.f
    public n60.f a(n60.f fVar) {
        int[] i11 = v60.h.i();
        f0.a(this.f47851g, ((g0) fVar).f47851g, i11);
        return new g0(i11);
    }

    @Override // n60.f
    public n60.f b() {
        int[] i11 = v60.h.i();
        f0.b(this.f47851g, i11);
        return new g0(i11);
    }

    @Override // n60.f
    public n60.f d(n60.f fVar) {
        int[] i11 = v60.h.i();
        f0.d(((g0) fVar).f47851g, i11);
        f0.f(i11, this.f47851g, i11);
        return new g0(i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            return v60.h.n(this.f47851g, ((g0) obj).f47851g);
        }
        return false;
    }

    @Override // n60.f
    public int f() {
        return f47850h.bitLength();
    }

    @Override // n60.f
    public n60.f g() {
        int[] i11 = v60.h.i();
        f0.d(this.f47851g, i11);
        return new g0(i11);
    }

    @Override // n60.f
    public boolean h() {
        return v60.h.t(this.f47851g);
    }

    public int hashCode() {
        return f47850h.hashCode() ^ org.bouncycastle.util.a.J(this.f47851g, 0, 8);
    }

    @Override // n60.f
    public boolean i() {
        return v60.h.v(this.f47851g);
    }

    @Override // n60.f
    public n60.f j(n60.f fVar) {
        int[] i11 = v60.h.i();
        f0.f(this.f47851g, ((g0) fVar).f47851g, i11);
        return new g0(i11);
    }

    @Override // n60.f
    public n60.f m() {
        int[] i11 = v60.h.i();
        f0.h(this.f47851g, i11);
        return new g0(i11);
    }

    @Override // n60.f
    public n60.f n() {
        int[] iArr = this.f47851g;
        if (v60.h.v(iArr) || v60.h.t(iArr)) {
            return this;
        }
        int[] i11 = v60.h.i();
        f0.m(iArr, i11);
        f0.f(i11, iArr, i11);
        int[] i12 = v60.h.i();
        f0.m(i11, i12);
        f0.f(i12, iArr, i12);
        int[] i13 = v60.h.i();
        f0.n(i12, 3, i13);
        f0.f(i13, i12, i13);
        f0.n(i13, 3, i13);
        f0.f(i13, i12, i13);
        f0.n(i13, 2, i13);
        f0.f(i13, i11, i13);
        int[] i14 = v60.h.i();
        f0.n(i13, 11, i14);
        f0.f(i14, i13, i14);
        f0.n(i14, 22, i13);
        f0.f(i13, i14, i13);
        int[] i15 = v60.h.i();
        f0.n(i13, 44, i15);
        f0.f(i15, i13, i15);
        int[] i16 = v60.h.i();
        f0.n(i15, 88, i16);
        f0.f(i16, i15, i16);
        f0.n(i16, 44, i15);
        f0.f(i15, i13, i15);
        f0.n(i15, 3, i13);
        f0.f(i13, i12, i13);
        f0.n(i13, 23, i13);
        f0.f(i13, i14, i13);
        f0.n(i13, 6, i13);
        f0.f(i13, i11, i13);
        f0.n(i13, 2, i13);
        f0.m(i13, i11);
        if (v60.h.n(iArr, i11)) {
            return new g0(i13);
        }
        return null;
    }

    @Override // n60.f
    public n60.f o() {
        int[] i11 = v60.h.i();
        f0.m(this.f47851g, i11);
        return new g0(i11);
    }

    @Override // n60.f
    public n60.f r(n60.f fVar) {
        int[] i11 = v60.h.i();
        f0.o(this.f47851g, ((g0) fVar).f47851g, i11);
        return new g0(i11);
    }

    @Override // n60.f
    public boolean s() {
        return v60.h.q(this.f47851g, 0) == 1;
    }

    @Override // n60.f
    public BigInteger t() {
        return v60.h.J(this.f47851g);
    }
}