package q60;

import java.math.BigInteger;
import n60.f;

/* loaded from: classes5.dex */
public class r2 extends f.a {

    /* renamed from: g  reason: collision with root package name */
    protected long[] f47952g;

    public r2() {
        this.f47952g = v60.m.c();
    }

    public r2(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        }
        this.f47952g = q2.h(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public r2(long[] jArr) {
        this.f47952g = jArr;
    }

    @Override // n60.f
    public n60.f a(n60.f fVar) {
        long[] c11 = v60.m.c();
        q2.b(this.f47952g, ((r2) fVar).f47952g, c11);
        return new r2(c11);
    }

    @Override // n60.f
    public n60.f b() {
        long[] c11 = v60.m.c();
        q2.f(this.f47952g, c11);
        return new r2(c11);
    }

    @Override // n60.f
    public n60.f d(n60.f fVar) {
        return j(fVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r2) {
            return v60.m.e(this.f47952g, ((r2) obj).f47952g);
        }
        return false;
    }

    @Override // n60.f
    public int f() {
        return 571;
    }

    @Override // n60.f
    public n60.f g() {
        long[] c11 = v60.m.c();
        q2.n(this.f47952g, c11);
        return new r2(c11);
    }

    @Override // n60.f
    public boolean h() {
        return v60.m.f(this.f47952g);
    }

    public int hashCode() {
        return org.bouncycastle.util.a.K(this.f47952g, 0, 9) ^ 5711052;
    }

    @Override // n60.f
    public boolean i() {
        return v60.m.g(this.f47952g);
    }

    @Override // n60.f
    public n60.f j(n60.f fVar) {
        long[] c11 = v60.m.c();
        q2.o(this.f47952g, ((r2) fVar).f47952g, c11);
        return new r2(c11);
    }

    @Override // n60.f
    public n60.f k(n60.f fVar, n60.f fVar2, n60.f fVar3) {
        return l(fVar, fVar2, fVar3);
    }

    @Override // n60.f
    public n60.f l(n60.f fVar, n60.f fVar2, n60.f fVar3) {
        long[] jArr = this.f47952g;
        long[] jArr2 = ((r2) fVar).f47952g;
        long[] jArr3 = ((r2) fVar2).f47952g;
        long[] jArr4 = ((r2) fVar3).f47952g;
        long[] d11 = v60.m.d();
        q2.p(jArr, jArr2, d11);
        q2.p(jArr3, jArr4, d11);
        long[] c11 = v60.m.c();
        q2.t(d11, c11);
        return new r2(c11);
    }

    @Override // n60.f
    public n60.f m() {
        return this;
    }

    @Override // n60.f
    public n60.f n() {
        long[] c11 = v60.m.c();
        q2.v(this.f47952g, c11);
        return new r2(c11);
    }

    @Override // n60.f
    public n60.f o() {
        long[] c11 = v60.m.c();
        q2.w(this.f47952g, c11);
        return new r2(c11);
    }

    @Override // n60.f
    public n60.f p(n60.f fVar, n60.f fVar2) {
        long[] jArr = this.f47952g;
        long[] jArr2 = ((r2) fVar).f47952g;
        long[] jArr3 = ((r2) fVar2).f47952g;
        long[] d11 = v60.m.d();
        q2.x(jArr, d11);
        q2.p(jArr2, jArr3, d11);
        long[] c11 = v60.m.c();
        q2.t(d11, c11);
        return new r2(c11);
    }

    @Override // n60.f
    public n60.f q(int i11) {
        if (i11 < 1) {
            return this;
        }
        long[] c11 = v60.m.c();
        q2.y(this.f47952g, i11, c11);
        return new r2(c11);
    }

    @Override // n60.f
    public n60.f r(n60.f fVar) {
        return a(fVar);
    }

    @Override // n60.f
    public boolean s() {
        return (this.f47952g[0] & 1) != 0;
    }

    @Override // n60.f
    public BigInteger t() {
        return v60.m.h(this.f47952g);
    }

    @Override // n60.f.a
    public n60.f u() {
        long[] c11 = v60.m.c();
        q2.i(this.f47952g, c11);
        return new r2(c11);
    }

    @Override // n60.f.a
    public boolean v() {
        return true;
    }

    @Override // n60.f.a
    public int w() {
        return q2.z(this.f47952g);
    }
}