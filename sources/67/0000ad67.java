package q60;

import java.math.BigInteger;
import n60.f;

/* loaded from: classes5.dex */
public class o0 extends f.b {

    /* renamed from: h  reason: collision with root package name */
    public static final BigInteger f47926h = new BigInteger(1, org.bouncycastle.util.encoders.b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF"));

    /* renamed from: g  reason: collision with root package name */
    protected int[] f47927g;

    public o0() {
        this.f47927g = v60.n.k(12);
    }

    public o0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f47926h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        this.f47927g = n0.e(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public o0(int[] iArr) {
        this.f47927g = iArr;
    }

    @Override // n60.f
    public n60.f a(n60.f fVar) {
        int[] k11 = v60.n.k(12);
        n0.a(this.f47927g, ((o0) fVar).f47927g, k11);
        return new o0(k11);
    }

    @Override // n60.f
    public n60.f b() {
        int[] k11 = v60.n.k(12);
        n0.c(this.f47927g, k11);
        return new o0(k11);
    }

    @Override // n60.f
    public n60.f d(n60.f fVar) {
        int[] k11 = v60.n.k(12);
        n0.f(((o0) fVar).f47927g, k11);
        n0.h(k11, this.f47927g, k11);
        return new o0(k11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0) {
            return v60.n.o(12, this.f47927g, ((o0) obj).f47927g);
        }
        return false;
    }

    @Override // n60.f
    public int f() {
        return f47926h.bitLength();
    }

    @Override // n60.f
    public n60.f g() {
        int[] k11 = v60.n.k(12);
        n0.f(this.f47927g, k11);
        return new o0(k11);
    }

    @Override // n60.f
    public boolean h() {
        return v60.n.z(12, this.f47927g);
    }

    public int hashCode() {
        return f47926h.hashCode() ^ org.bouncycastle.util.a.J(this.f47927g, 0, 12);
    }

    @Override // n60.f
    public boolean i() {
        return v60.n.A(12, this.f47927g);
    }

    @Override // n60.f
    public n60.f j(n60.f fVar) {
        int[] k11 = v60.n.k(12);
        n0.h(this.f47927g, ((o0) fVar).f47927g, k11);
        return new o0(k11);
    }

    @Override // n60.f
    public n60.f m() {
        int[] k11 = v60.n.k(12);
        n0.i(this.f47927g, k11);
        return new o0(k11);
    }

    @Override // n60.f
    public n60.f n() {
        int[] iArr = this.f47927g;
        if (v60.n.A(12, iArr) || v60.n.z(12, iArr)) {
            return this;
        }
        int[] k11 = v60.n.k(12);
        int[] k12 = v60.n.k(12);
        int[] k13 = v60.n.k(12);
        int[] k14 = v60.n.k(12);
        n0.n(iArr, k11);
        n0.h(k11, iArr, k11);
        n0.o(k11, 2, k12);
        n0.h(k12, k11, k12);
        n0.n(k12, k12);
        n0.h(k12, iArr, k12);
        n0.o(k12, 5, k13);
        n0.h(k13, k12, k13);
        n0.o(k13, 5, k14);
        n0.h(k14, k12, k14);
        n0.o(k14, 15, k12);
        n0.h(k12, k14, k12);
        n0.o(k12, 2, k13);
        n0.h(k11, k13, k11);
        n0.o(k13, 28, k13);
        n0.h(k12, k13, k12);
        n0.o(k12, 60, k13);
        n0.h(k13, k12, k13);
        n0.o(k13, 120, k12);
        n0.h(k12, k13, k12);
        n0.o(k12, 15, k12);
        n0.h(k12, k14, k12);
        n0.o(k12, 33, k12);
        n0.h(k12, k11, k12);
        n0.o(k12, 64, k12);
        n0.h(k12, iArr, k12);
        n0.o(k12, 30, k11);
        n0.n(k11, k12);
        if (v60.n.o(12, iArr, k12)) {
            return new o0(k11);
        }
        return null;
    }

    @Override // n60.f
    public n60.f o() {
        int[] k11 = v60.n.k(12);
        n0.n(this.f47927g, k11);
        return new o0(k11);
    }

    @Override // n60.f
    public n60.f r(n60.f fVar) {
        int[] k11 = v60.n.k(12);
        n0.q(this.f47927g, ((o0) fVar).f47927g, k11);
        return new o0(k11);
    }

    @Override // n60.f
    public boolean s() {
        return v60.n.t(this.f47927g, 0) == 1;
    }

    @Override // n60.f
    public BigInteger t() {
        return v60.n.V(12, this.f47927g);
    }
}