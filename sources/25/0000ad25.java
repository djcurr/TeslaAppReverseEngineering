package q60;

import java.math.BigInteger;
import n60.f;

/* loaded from: classes5.dex */
public class b2 extends f.a {

    /* renamed from: g  reason: collision with root package name */
    protected long[] f47807g;

    public b2() {
        this.f47807g = v60.h.j();
    }

    public b2(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 239) {
            throw new IllegalArgumentException("x value invalid for SecT239FieldElement");
        }
        this.f47807g = a2.e(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b2(long[] jArr) {
        this.f47807g = jArr;
    }

    @Override // n60.f
    public n60.f a(n60.f fVar) {
        long[] j11 = v60.h.j();
        a2.a(this.f47807g, ((b2) fVar).f47807g, j11);
        return new b2(j11);
    }

    @Override // n60.f
    public n60.f b() {
        long[] j11 = v60.h.j();
        a2.c(this.f47807g, j11);
        return new b2(j11);
    }

    @Override // n60.f
    public n60.f d(n60.f fVar) {
        return j(fVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            return v60.h.o(this.f47807g, ((b2) obj).f47807g);
        }
        return false;
    }

    @Override // n60.f
    public int f() {
        return 239;
    }

    @Override // n60.f
    public n60.f g() {
        long[] j11 = v60.h.j();
        a2.l(this.f47807g, j11);
        return new b2(j11);
    }

    @Override // n60.f
    public boolean h() {
        return v60.h.u(this.f47807g);
    }

    public int hashCode() {
        return org.bouncycastle.util.a.K(this.f47807g, 0, 4) ^ 23900158;
    }

    @Override // n60.f
    public boolean i() {
        return v60.h.w(this.f47807g);
    }

    @Override // n60.f
    public n60.f j(n60.f fVar) {
        long[] j11 = v60.h.j();
        a2.m(this.f47807g, ((b2) fVar).f47807g, j11);
        return new b2(j11);
    }

    @Override // n60.f
    public n60.f k(n60.f fVar, n60.f fVar2, n60.f fVar3) {
        return l(fVar, fVar2, fVar3);
    }

    @Override // n60.f
    public n60.f l(n60.f fVar, n60.f fVar2, n60.f fVar3) {
        long[] jArr = this.f47807g;
        long[] jArr2 = ((b2) fVar).f47807g;
        long[] jArr3 = ((b2) fVar2).f47807g;
        long[] jArr4 = ((b2) fVar3).f47807g;
        long[] l11 = v60.h.l();
        a2.n(jArr, jArr2, l11);
        a2.n(jArr3, jArr4, l11);
        long[] j11 = v60.h.j();
        a2.o(l11, j11);
        return new b2(j11);
    }

    @Override // n60.f
    public n60.f m() {
        return this;
    }

    @Override // n60.f
    public n60.f n() {
        long[] j11 = v60.h.j();
        a2.p(this.f47807g, j11);
        return new b2(j11);
    }

    @Override // n60.f
    public n60.f o() {
        long[] j11 = v60.h.j();
        a2.q(this.f47807g, j11);
        return new b2(j11);
    }

    @Override // n60.f
    public n60.f p(n60.f fVar, n60.f fVar2) {
        long[] jArr = this.f47807g;
        long[] jArr2 = ((b2) fVar).f47807g;
        long[] jArr3 = ((b2) fVar2).f47807g;
        long[] l11 = v60.h.l();
        a2.r(jArr, l11);
        a2.n(jArr2, jArr3, l11);
        long[] j11 = v60.h.j();
        a2.o(l11, j11);
        return new b2(j11);
    }

    @Override // n60.f
    public n60.f q(int i11) {
        if (i11 < 1) {
            return this;
        }
        long[] j11 = v60.h.j();
        a2.s(this.f47807g, i11, j11);
        return new b2(j11);
    }

    @Override // n60.f
    public n60.f r(n60.f fVar) {
        return a(fVar);
    }

    @Override // n60.f
    public boolean s() {
        return (this.f47807g[0] & 1) != 0;
    }

    @Override // n60.f
    public BigInteger t() {
        return v60.h.K(this.f47807g);
    }

    @Override // n60.f.a
    public n60.f u() {
        long[] j11 = v60.h.j();
        a2.f(this.f47807g, j11);
        return new b2(j11);
    }

    @Override // n60.f.a
    public boolean v() {
        return true;
    }

    @Override // n60.f.a
    public int w() {
        return a2.t(this.f47807g);
    }
}