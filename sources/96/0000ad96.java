package q60;

import java.math.BigInteger;
import n60.f;

/* loaded from: classes5.dex */
public class y extends f.b {

    /* renamed from: h  reason: collision with root package name */
    public static final BigInteger f48004h = new BigInteger(1, org.bouncycastle.util.encoders.b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"));

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f48005i = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};

    /* renamed from: g  reason: collision with root package name */
    protected int[] f48006g;

    public y() {
        this.f48006g = v60.g.e();
    }

    public y(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f48004h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        this.f48006g = x.c(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public y(int[] iArr) {
        this.f48006g = iArr;
    }

    @Override // n60.f
    public n60.f a(n60.f fVar) {
        int[] e11 = v60.g.e();
        x.a(this.f48006g, ((y) fVar).f48006g, e11);
        return new y(e11);
    }

    @Override // n60.f
    public n60.f b() {
        int[] e11 = v60.g.e();
        x.b(this.f48006g, e11);
        return new y(e11);
    }

    @Override // n60.f
    public n60.f d(n60.f fVar) {
        int[] e11 = v60.g.e();
        x.d(((y) fVar).f48006g, e11);
        x.f(e11, this.f48006g, e11);
        return new y(e11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            return v60.g.g(this.f48006g, ((y) obj).f48006g);
        }
        return false;
    }

    @Override // n60.f
    public int f() {
        return f48004h.bitLength();
    }

    @Override // n60.f
    public n60.f g() {
        int[] e11 = v60.g.e();
        x.d(this.f48006g, e11);
        return new y(e11);
    }

    @Override // n60.f
    public boolean h() {
        return v60.g.k(this.f48006g);
    }

    public int hashCode() {
        return f48004h.hashCode() ^ org.bouncycastle.util.a.J(this.f48006g, 0, 7);
    }

    @Override // n60.f
    public boolean i() {
        return v60.g.l(this.f48006g);
    }

    @Override // n60.f
    public n60.f j(n60.f fVar) {
        int[] e11 = v60.g.e();
        x.f(this.f48006g, ((y) fVar).f48006g, e11);
        return new y(e11);
    }

    @Override // n60.f
    public n60.f m() {
        int[] e11 = v60.g.e();
        x.h(this.f48006g, e11);
        return new y(e11);
    }

    @Override // n60.f
    public n60.f n() {
        int[] iArr = this.f48006g;
        if (v60.g.l(iArr) || v60.g.k(iArr)) {
            return this;
        }
        int[] e11 = v60.g.e();
        x.m(iArr, e11);
        x.f(e11, iArr, e11);
        x.m(e11, e11);
        x.f(e11, iArr, e11);
        int[] e12 = v60.g.e();
        x.m(e11, e12);
        x.f(e12, iArr, e12);
        int[] e13 = v60.g.e();
        x.n(e12, 4, e13);
        x.f(e13, e12, e13);
        int[] e14 = v60.g.e();
        x.n(e13, 3, e14);
        x.f(e14, e11, e14);
        x.n(e14, 8, e14);
        x.f(e14, e13, e14);
        x.n(e14, 4, e13);
        x.f(e13, e12, e13);
        x.n(e13, 19, e12);
        x.f(e12, e14, e12);
        int[] e15 = v60.g.e();
        x.n(e12, 42, e15);
        x.f(e15, e12, e15);
        x.n(e15, 23, e12);
        x.f(e12, e13, e12);
        x.n(e12, 84, e13);
        x.f(e13, e15, e13);
        x.n(e13, 20, e13);
        x.f(e13, e14, e13);
        x.n(e13, 3, e13);
        x.f(e13, iArr, e13);
        x.n(e13, 2, e13);
        x.f(e13, iArr, e13);
        x.n(e13, 4, e13);
        x.f(e13, e11, e13);
        x.m(e13, e13);
        x.m(e13, e15);
        if (v60.g.g(iArr, e15)) {
            return new y(e13);
        }
        x.f(e13, f48005i, e13);
        x.m(e13, e15);
        if (v60.g.g(iArr, e15)) {
            return new y(e13);
        }
        return null;
    }

    @Override // n60.f
    public n60.f o() {
        int[] e11 = v60.g.e();
        x.m(this.f48006g, e11);
        return new y(e11);
    }

    @Override // n60.f
    public n60.f r(n60.f fVar) {
        int[] e11 = v60.g.e();
        x.o(this.f48006g, ((y) fVar).f48006g, e11);
        return new y(e11);
    }

    @Override // n60.f
    public boolean s() {
        return v60.g.i(this.f48006g, 0) == 1;
    }

    @Override // n60.f
    public BigInteger t() {
        return v60.g.u(this.f48006g);
    }
}