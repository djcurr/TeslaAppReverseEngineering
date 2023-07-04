package q60;

import java.math.BigInteger;
import n60.f;

/* loaded from: classes5.dex */
public class k0 extends f.b {

    /* renamed from: h  reason: collision with root package name */
    public static final BigInteger f47888h = new BigInteger(1, org.bouncycastle.util.encoders.b.b("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: g  reason: collision with root package name */
    protected int[] f47889g;

    public k0() {
        this.f47889g = v60.h.i();
    }

    public k0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f47888h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        this.f47889g = j0.d(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public k0(int[] iArr) {
        this.f47889g = iArr;
    }

    @Override // n60.f
    public n60.f a(n60.f fVar) {
        int[] i11 = v60.h.i();
        j0.a(this.f47889g, ((k0) fVar).f47889g, i11);
        return new k0(i11);
    }

    @Override // n60.f
    public n60.f b() {
        int[] i11 = v60.h.i();
        j0.b(this.f47889g, i11);
        return new k0(i11);
    }

    @Override // n60.f
    public n60.f d(n60.f fVar) {
        int[] i11 = v60.h.i();
        j0.e(((k0) fVar).f47889g, i11);
        j0.g(i11, this.f47889g, i11);
        return new k0(i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k0) {
            return v60.h.n(this.f47889g, ((k0) obj).f47889g);
        }
        return false;
    }

    @Override // n60.f
    public int f() {
        return f47888h.bitLength();
    }

    @Override // n60.f
    public n60.f g() {
        int[] i11 = v60.h.i();
        j0.e(this.f47889g, i11);
        return new k0(i11);
    }

    @Override // n60.f
    public boolean h() {
        return v60.h.t(this.f47889g);
    }

    public int hashCode() {
        return f47888h.hashCode() ^ org.bouncycastle.util.a.J(this.f47889g, 0, 8);
    }

    @Override // n60.f
    public boolean i() {
        return v60.h.v(this.f47889g);
    }

    @Override // n60.f
    public n60.f j(n60.f fVar) {
        int[] i11 = v60.h.i();
        j0.g(this.f47889g, ((k0) fVar).f47889g, i11);
        return new k0(i11);
    }

    @Override // n60.f
    public n60.f m() {
        int[] i11 = v60.h.i();
        j0.i(this.f47889g, i11);
        return new k0(i11);
    }

    @Override // n60.f
    public n60.f n() {
        int[] iArr = this.f47889g;
        if (v60.h.v(iArr) || v60.h.t(iArr)) {
            return this;
        }
        int[] i11 = v60.h.i();
        int[] i12 = v60.h.i();
        j0.n(iArr, i11);
        j0.g(i11, iArr, i11);
        j0.o(i11, 2, i12);
        j0.g(i12, i11, i12);
        j0.o(i12, 4, i11);
        j0.g(i11, i12, i11);
        j0.o(i11, 8, i12);
        j0.g(i12, i11, i12);
        j0.o(i12, 16, i11);
        j0.g(i11, i12, i11);
        j0.o(i11, 32, i11);
        j0.g(i11, iArr, i11);
        j0.o(i11, 96, i11);
        j0.g(i11, iArr, i11);
        j0.o(i11, 94, i11);
        j0.n(i11, i12);
        if (v60.h.n(iArr, i12)) {
            return new k0(i11);
        }
        return null;
    }

    @Override // n60.f
    public n60.f o() {
        int[] i11 = v60.h.i();
        j0.n(this.f47889g, i11);
        return new k0(i11);
    }

    @Override // n60.f
    public n60.f r(n60.f fVar) {
        int[] i11 = v60.h.i();
        j0.q(this.f47889g, ((k0) fVar).f47889g, i11);
        return new k0(i11);
    }

    @Override // n60.f
    public boolean s() {
        return v60.h.q(this.f47889g, 0) == 1;
    }

    @Override // n60.f
    public BigInteger t() {
        return v60.h.J(this.f47889g);
    }
}