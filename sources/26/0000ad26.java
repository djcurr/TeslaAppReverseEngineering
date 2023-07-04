package q60;

import java.math.BigInteger;
import n60.f;

/* loaded from: classes5.dex */
public class c extends f.b {

    /* renamed from: h  reason: collision with root package name */
    public static final BigInteger f47808h = new BigInteger(1, org.bouncycastle.util.encoders.b.b("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: g  reason: collision with root package name */
    protected int[] f47809g;

    public c() {
        this.f47809g = v60.d.f();
    }

    public c(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f47808h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        this.f47809g = b.d(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(int[] iArr) {
        this.f47809g = iArr;
    }

    @Override // n60.f
    public n60.f a(n60.f fVar) {
        int[] f11 = v60.d.f();
        b.a(this.f47809g, ((c) fVar).f47809g, f11);
        return new c(f11);
    }

    @Override // n60.f
    public n60.f b() {
        int[] f11 = v60.d.f();
        b.b(this.f47809g, f11);
        return new c(f11);
    }

    @Override // n60.f
    public n60.f d(n60.f fVar) {
        int[] f11 = v60.d.f();
        b.e(((c) fVar).f47809g, f11);
        b.g(f11, this.f47809g, f11);
        return new c(f11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return v60.d.j(this.f47809g, ((c) obj).f47809g);
        }
        return false;
    }

    @Override // n60.f
    public int f() {
        return f47808h.bitLength();
    }

    @Override // n60.f
    public n60.f g() {
        int[] f11 = v60.d.f();
        b.e(this.f47809g, f11);
        return new c(f11);
    }

    @Override // n60.f
    public boolean h() {
        return v60.d.o(this.f47809g);
    }

    public int hashCode() {
        return f47808h.hashCode() ^ org.bouncycastle.util.a.J(this.f47809g, 0, 4);
    }

    @Override // n60.f
    public boolean i() {
        return v60.d.q(this.f47809g);
    }

    @Override // n60.f
    public n60.f j(n60.f fVar) {
        int[] f11 = v60.d.f();
        b.g(this.f47809g, ((c) fVar).f47809g, f11);
        return new c(f11);
    }

    @Override // n60.f
    public n60.f m() {
        int[] f11 = v60.d.f();
        b.i(this.f47809g, f11);
        return new c(f11);
    }

    @Override // n60.f
    public n60.f n() {
        int[] iArr = this.f47809g;
        if (v60.d.q(iArr) || v60.d.o(iArr)) {
            return this;
        }
        int[] f11 = v60.d.f();
        b.n(iArr, f11);
        b.g(f11, iArr, f11);
        int[] f12 = v60.d.f();
        b.o(f11, 2, f12);
        b.g(f12, f11, f12);
        int[] f13 = v60.d.f();
        b.o(f12, 4, f13);
        b.g(f13, f12, f13);
        b.o(f13, 2, f12);
        b.g(f12, f11, f12);
        b.o(f12, 10, f11);
        b.g(f11, f12, f11);
        b.o(f11, 10, f13);
        b.g(f13, f12, f13);
        b.n(f13, f12);
        b.g(f12, iArr, f12);
        b.o(f12, 95, f12);
        b.n(f12, f13);
        if (v60.d.j(iArr, f13)) {
            return new c(f12);
        }
        return null;
    }

    @Override // n60.f
    public n60.f o() {
        int[] f11 = v60.d.f();
        b.n(this.f47809g, f11);
        return new c(f11);
    }

    @Override // n60.f
    public n60.f r(n60.f fVar) {
        int[] f11 = v60.d.f();
        b.q(this.f47809g, ((c) fVar).f47809g, f11);
        return new c(f11);
    }

    @Override // n60.f
    public boolean s() {
        return v60.d.m(this.f47809g, 0) == 1;
    }

    @Override // n60.f
    public BigInteger t() {
        return v60.d.x(this.f47809g);
    }
}