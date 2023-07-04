package q60;

import java.math.BigInteger;
import n60.f;

/* loaded from: classes5.dex */
public class s0 extends f.b {

    /* renamed from: h  reason: collision with root package name */
    public static final BigInteger f47959h = new BigInteger(1, org.bouncycastle.util.encoders.b.b("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: g  reason: collision with root package name */
    protected int[] f47960g;

    public s0() {
        this.f47960g = v60.n.k(17);
    }

    public s0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f47959h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        this.f47960g = r0.c(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public s0(int[] iArr) {
        this.f47960g = iArr;
    }

    @Override // n60.f
    public n60.f a(n60.f fVar) {
        int[] k11 = v60.n.k(17);
        r0.a(this.f47960g, ((s0) fVar).f47960g, k11);
        return new s0(k11);
    }

    @Override // n60.f
    public n60.f b() {
        int[] k11 = v60.n.k(17);
        r0.b(this.f47960g, k11);
        return new s0(k11);
    }

    @Override // n60.f
    public n60.f d(n60.f fVar) {
        int[] k11 = v60.n.k(17);
        r0.f(((s0) fVar).f47960g, k11);
        r0.h(k11, this.f47960g, k11);
        return new s0(k11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s0) {
            return v60.n.o(17, this.f47960g, ((s0) obj).f47960g);
        }
        return false;
    }

    @Override // n60.f
    public int f() {
        return f47959h.bitLength();
    }

    @Override // n60.f
    public n60.f g() {
        int[] k11 = v60.n.k(17);
        r0.f(this.f47960g, k11);
        return new s0(k11);
    }

    @Override // n60.f
    public boolean h() {
        return v60.n.z(17, this.f47960g);
    }

    public int hashCode() {
        return f47959h.hashCode() ^ org.bouncycastle.util.a.J(this.f47960g, 0, 17);
    }

    @Override // n60.f
    public boolean i() {
        return v60.n.A(17, this.f47960g);
    }

    @Override // n60.f
    public n60.f j(n60.f fVar) {
        int[] k11 = v60.n.k(17);
        r0.h(this.f47960g, ((s0) fVar).f47960g, k11);
        return new s0(k11);
    }

    @Override // n60.f
    public n60.f m() {
        int[] k11 = v60.n.k(17);
        r0.i(this.f47960g, k11);
        return new s0(k11);
    }

    @Override // n60.f
    public n60.f n() {
        int[] iArr = this.f47960g;
        if (v60.n.A(17, iArr) || v60.n.z(17, iArr)) {
            return this;
        }
        int[] k11 = v60.n.k(17);
        int[] k12 = v60.n.k(17);
        r0.o(iArr, 519, k11);
        r0.n(k11, k12);
        if (v60.n.o(17, iArr, k12)) {
            return new s0(k11);
        }
        return null;
    }

    @Override // n60.f
    public n60.f o() {
        int[] k11 = v60.n.k(17);
        r0.n(this.f47960g, k11);
        return new s0(k11);
    }

    @Override // n60.f
    public n60.f r(n60.f fVar) {
        int[] k11 = v60.n.k(17);
        r0.p(this.f47960g, ((s0) fVar).f47960g, k11);
        return new s0(k11);
    }

    @Override // n60.f
    public boolean s() {
        return v60.n.t(this.f47960g, 0) == 1;
    }

    @Override // n60.f
    public BigInteger t() {
        return v60.n.V(17, this.f47960g);
    }
}