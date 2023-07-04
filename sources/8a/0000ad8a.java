package q60;

import java.math.BigInteger;
import n60.f;

/* loaded from: classes5.dex */
public class v0 extends f.a {

    /* renamed from: g  reason: collision with root package name */
    protected long[] f47983g;

    public v0() {
        this.f47983g = v60.d.g();
    }

    public v0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        this.f47983g = u0.e(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public v0(long[] jArr) {
        this.f47983g = jArr;
    }

    @Override // n60.f
    public n60.f a(n60.f fVar) {
        long[] g11 = v60.d.g();
        u0.a(this.f47983g, ((v0) fVar).f47983g, g11);
        return new v0(g11);
    }

    @Override // n60.f
    public n60.f b() {
        long[] g11 = v60.d.g();
        u0.c(this.f47983g, g11);
        return new v0(g11);
    }

    @Override // n60.f
    public n60.f d(n60.f fVar) {
        return j(fVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v0) {
            return v60.d.k(this.f47983g, ((v0) obj).f47983g);
        }
        return false;
    }

    @Override // n60.f
    public int f() {
        return 113;
    }

    @Override // n60.f
    public n60.f g() {
        long[] g11 = v60.d.g();
        u0.j(this.f47983g, g11);
        return new v0(g11);
    }

    @Override // n60.f
    public boolean h() {
        return v60.d.p(this.f47983g);
    }

    public int hashCode() {
        return org.bouncycastle.util.a.K(this.f47983g, 0, 2) ^ 113009;
    }

    @Override // n60.f
    public boolean i() {
        return v60.d.r(this.f47983g);
    }

    @Override // n60.f
    public n60.f j(n60.f fVar) {
        long[] g11 = v60.d.g();
        u0.k(this.f47983g, ((v0) fVar).f47983g, g11);
        return new v0(g11);
    }

    @Override // n60.f
    public n60.f k(n60.f fVar, n60.f fVar2, n60.f fVar3) {
        return l(fVar, fVar2, fVar3);
    }

    @Override // n60.f
    public n60.f l(n60.f fVar, n60.f fVar2, n60.f fVar3) {
        long[] jArr = this.f47983g;
        long[] jArr2 = ((v0) fVar).f47983g;
        long[] jArr3 = ((v0) fVar2).f47983g;
        long[] jArr4 = ((v0) fVar3).f47983g;
        long[] i11 = v60.d.i();
        u0.l(jArr, jArr2, i11);
        u0.l(jArr3, jArr4, i11);
        long[] g11 = v60.d.g();
        u0.m(i11, g11);
        return new v0(g11);
    }

    @Override // n60.f
    public n60.f m() {
        return this;
    }

    @Override // n60.f
    public n60.f n() {
        long[] g11 = v60.d.g();
        u0.n(this.f47983g, g11);
        return new v0(g11);
    }

    @Override // n60.f
    public n60.f o() {
        long[] g11 = v60.d.g();
        u0.o(this.f47983g, g11);
        return new v0(g11);
    }

    @Override // n60.f
    public n60.f p(n60.f fVar, n60.f fVar2) {
        long[] jArr = this.f47983g;
        long[] jArr2 = ((v0) fVar).f47983g;
        long[] jArr3 = ((v0) fVar2).f47983g;
        long[] i11 = v60.d.i();
        u0.p(jArr, i11);
        u0.l(jArr2, jArr3, i11);
        long[] g11 = v60.d.g();
        u0.m(i11, g11);
        return new v0(g11);
    }

    @Override // n60.f
    public n60.f q(int i11) {
        if (i11 < 1) {
            return this;
        }
        long[] g11 = v60.d.g();
        u0.q(this.f47983g, i11, g11);
        return new v0(g11);
    }

    @Override // n60.f
    public n60.f r(n60.f fVar) {
        return a(fVar);
    }

    @Override // n60.f
    public boolean s() {
        return (this.f47983g[0] & 1) != 0;
    }

    @Override // n60.f
    public BigInteger t() {
        return v60.d.y(this.f47983g);
    }

    @Override // n60.f.a
    public n60.f u() {
        long[] g11 = v60.d.g();
        u0.f(this.f47983g, g11);
        return new v0(g11);
    }

    @Override // n60.f.a
    public boolean v() {
        return true;
    }

    @Override // n60.f.a
    public int w() {
        return u0.r(this.f47983g);
    }
}