package q60;

import java.math.BigInteger;
import n60.f;

/* loaded from: classes5.dex */
public class m extends f.b {

    /* renamed from: h  reason: collision with root package name */
    public static final BigInteger f47899h = new BigInteger(1, org.bouncycastle.util.encoders.b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"));

    /* renamed from: g  reason: collision with root package name */
    protected int[] f47900g;

    public m() {
        this.f47900g = v60.e.d();
    }

    public m(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f47899h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        this.f47900g = l.c(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public m(int[] iArr) {
        this.f47900g = iArr;
    }

    @Override // n60.f
    public n60.f a(n60.f fVar) {
        int[] d11 = v60.e.d();
        l.a(this.f47900g, ((m) fVar).f47900g, d11);
        return new m(d11);
    }

    @Override // n60.f
    public n60.f b() {
        int[] d11 = v60.e.d();
        l.b(this.f47900g, d11);
        return new m(d11);
    }

    @Override // n60.f
    public n60.f d(n60.f fVar) {
        int[] d11 = v60.e.d();
        l.d(((m) fVar).f47900g, d11);
        l.f(d11, this.f47900g, d11);
        return new m(d11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            return v60.e.f(this.f47900g, ((m) obj).f47900g);
        }
        return false;
    }

    @Override // n60.f
    public int f() {
        return f47899h.bitLength();
    }

    @Override // n60.f
    public n60.f g() {
        int[] d11 = v60.e.d();
        l.d(this.f47900g, d11);
        return new m(d11);
    }

    @Override // n60.f
    public boolean h() {
        return v60.e.j(this.f47900g);
    }

    public int hashCode() {
        return f47899h.hashCode() ^ org.bouncycastle.util.a.J(this.f47900g, 0, 5);
    }

    @Override // n60.f
    public boolean i() {
        return v60.e.k(this.f47900g);
    }

    @Override // n60.f
    public n60.f j(n60.f fVar) {
        int[] d11 = v60.e.d();
        l.f(this.f47900g, ((m) fVar).f47900g, d11);
        return new m(d11);
    }

    @Override // n60.f
    public n60.f m() {
        int[] d11 = v60.e.d();
        l.h(this.f47900g, d11);
        return new m(d11);
    }

    @Override // n60.f
    public n60.f n() {
        int[] iArr = this.f47900g;
        if (v60.e.k(iArr) || v60.e.j(iArr)) {
            return this;
        }
        int[] d11 = v60.e.d();
        l.m(iArr, d11);
        l.f(d11, iArr, d11);
        int[] d12 = v60.e.d();
        l.m(d11, d12);
        l.f(d12, iArr, d12);
        int[] d13 = v60.e.d();
        l.m(d12, d13);
        l.f(d13, iArr, d13);
        int[] d14 = v60.e.d();
        l.n(d13, 3, d14);
        l.f(d14, d12, d14);
        l.n(d14, 7, d13);
        l.f(d13, d14, d13);
        l.n(d13, 3, d14);
        l.f(d14, d12, d14);
        int[] d15 = v60.e.d();
        l.n(d14, 14, d15);
        l.f(d15, d13, d15);
        l.n(d15, 31, d13);
        l.f(d13, d15, d13);
        l.n(d13, 62, d15);
        l.f(d15, d13, d15);
        l.n(d15, 3, d13);
        l.f(d13, d12, d13);
        l.n(d13, 18, d13);
        l.f(d13, d14, d13);
        l.n(d13, 2, d13);
        l.f(d13, iArr, d13);
        l.n(d13, 3, d13);
        l.f(d13, d11, d13);
        l.n(d13, 6, d13);
        l.f(d13, d12, d13);
        l.n(d13, 2, d13);
        l.f(d13, iArr, d13);
        l.m(d13, d11);
        if (v60.e.f(iArr, d11)) {
            return new m(d13);
        }
        return null;
    }

    @Override // n60.f
    public n60.f o() {
        int[] d11 = v60.e.d();
        l.m(this.f47900g, d11);
        return new m(d11);
    }

    @Override // n60.f
    public n60.f r(n60.f fVar) {
        int[] d11 = v60.e.d();
        l.o(this.f47900g, ((m) fVar).f47900g, d11);
        return new m(d11);
    }

    @Override // n60.f
    public boolean s() {
        return v60.e.h(this.f47900g, 0) == 1;
    }

    @Override // n60.f
    public BigInteger t() {
        return v60.e.u(this.f47900g);
    }
}