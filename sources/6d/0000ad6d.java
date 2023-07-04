package q60;

import java.math.BigInteger;
import n60.f;

/* loaded from: classes5.dex */
public class p1 extends f.a {

    /* renamed from: g  reason: collision with root package name */
    protected long[] f47936g;

    public p1() {
        this.f47936g = v60.h.j();
    }

    public p1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
        }
        this.f47936g = o1.e(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public p1(long[] jArr) {
        this.f47936g = jArr;
    }

    @Override // n60.f
    public n60.f a(n60.f fVar) {
        long[] j11 = v60.h.j();
        o1.a(this.f47936g, ((p1) fVar).f47936g, j11);
        return new p1(j11);
    }

    @Override // n60.f
    public n60.f b() {
        long[] j11 = v60.h.j();
        o1.c(this.f47936g, j11);
        return new p1(j11);
    }

    @Override // n60.f
    public n60.f d(n60.f fVar) {
        return j(fVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            return v60.h.o(this.f47936g, ((p1) obj).f47936g);
        }
        return false;
    }

    @Override // n60.f
    public int f() {
        return 193;
    }

    @Override // n60.f
    public n60.f g() {
        long[] j11 = v60.h.j();
        o1.l(this.f47936g, j11);
        return new p1(j11);
    }

    @Override // n60.f
    public boolean h() {
        return v60.h.u(this.f47936g);
    }

    public int hashCode() {
        return org.bouncycastle.util.a.K(this.f47936g, 0, 4) ^ 1930015;
    }

    @Override // n60.f
    public boolean i() {
        return v60.h.w(this.f47936g);
    }

    @Override // n60.f
    public n60.f j(n60.f fVar) {
        long[] j11 = v60.h.j();
        o1.m(this.f47936g, ((p1) fVar).f47936g, j11);
        return new p1(j11);
    }

    @Override // n60.f
    public n60.f k(n60.f fVar, n60.f fVar2, n60.f fVar3) {
        return l(fVar, fVar2, fVar3);
    }

    @Override // n60.f
    public n60.f l(n60.f fVar, n60.f fVar2, n60.f fVar3) {
        long[] jArr = this.f47936g;
        long[] jArr2 = ((p1) fVar).f47936g;
        long[] jArr3 = ((p1) fVar2).f47936g;
        long[] jArr4 = ((p1) fVar3).f47936g;
        long[] l11 = v60.h.l();
        o1.n(jArr, jArr2, l11);
        o1.n(jArr3, jArr4, l11);
        long[] j11 = v60.h.j();
        o1.o(l11, j11);
        return new p1(j11);
    }

    @Override // n60.f
    public n60.f m() {
        return this;
    }

    @Override // n60.f
    public n60.f n() {
        long[] j11 = v60.h.j();
        o1.p(this.f47936g, j11);
        return new p1(j11);
    }

    @Override // n60.f
    public n60.f o() {
        long[] j11 = v60.h.j();
        o1.q(this.f47936g, j11);
        return new p1(j11);
    }

    @Override // n60.f
    public n60.f p(n60.f fVar, n60.f fVar2) {
        long[] jArr = this.f47936g;
        long[] jArr2 = ((p1) fVar).f47936g;
        long[] jArr3 = ((p1) fVar2).f47936g;
        long[] l11 = v60.h.l();
        o1.r(jArr, l11);
        o1.n(jArr2, jArr3, l11);
        long[] j11 = v60.h.j();
        o1.o(l11, j11);
        return new p1(j11);
    }

    @Override // n60.f
    public n60.f q(int i11) {
        if (i11 < 1) {
            return this;
        }
        long[] j11 = v60.h.j();
        o1.s(this.f47936g, i11, j11);
        return new p1(j11);
    }

    @Override // n60.f
    public n60.f r(n60.f fVar) {
        return a(fVar);
    }

    @Override // n60.f
    public boolean s() {
        return (this.f47936g[0] & 1) != 0;
    }

    @Override // n60.f
    public BigInteger t() {
        return v60.h.K(this.f47936g);
    }

    @Override // n60.f.a
    public n60.f u() {
        long[] j11 = v60.h.j();
        o1.f(this.f47936g, j11);
        return new p1(j11);
    }

    @Override // n60.f.a
    public boolean v() {
        return true;
    }

    @Override // n60.f.a
    public int w() {
        return o1.t(this.f47936g);
    }
}