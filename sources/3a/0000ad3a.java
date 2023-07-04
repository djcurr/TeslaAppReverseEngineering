package q60;

import java.math.BigInteger;
import n60.f;

/* loaded from: classes5.dex */
public class f2 extends f.a {

    /* renamed from: g  reason: collision with root package name */
    protected long[] f47843g;

    public f2() {
        this.f47843g = v60.i.c();
    }

    public f2(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        this.f47843g = e2.e(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public f2(long[] jArr) {
        this.f47843g = jArr;
    }

    @Override // n60.f
    public n60.f a(n60.f fVar) {
        long[] c11 = v60.i.c();
        e2.a(this.f47843g, ((f2) fVar).f47843g, c11);
        return new f2(c11);
    }

    @Override // n60.f
    public n60.f b() {
        long[] c11 = v60.i.c();
        e2.c(this.f47843g, c11);
        return new f2(c11);
    }

    @Override // n60.f
    public n60.f d(n60.f fVar) {
        return j(fVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2) {
            return v60.i.e(this.f47843g, ((f2) obj).f47843g);
        }
        return false;
    }

    @Override // n60.f
    public int f() {
        return 283;
    }

    @Override // n60.f
    public n60.f g() {
        long[] c11 = v60.i.c();
        e2.l(this.f47843g, c11);
        return new f2(c11);
    }

    @Override // n60.f
    public boolean h() {
        return v60.i.f(this.f47843g);
    }

    public int hashCode() {
        return org.bouncycastle.util.a.K(this.f47843g, 0, 5) ^ 2831275;
    }

    @Override // n60.f
    public boolean i() {
        return v60.i.g(this.f47843g);
    }

    @Override // n60.f
    public n60.f j(n60.f fVar) {
        long[] c11 = v60.i.c();
        e2.m(this.f47843g, ((f2) fVar).f47843g, c11);
        return new f2(c11);
    }

    @Override // n60.f
    public n60.f k(n60.f fVar, n60.f fVar2, n60.f fVar3) {
        return l(fVar, fVar2, fVar3);
    }

    @Override // n60.f
    public n60.f l(n60.f fVar, n60.f fVar2, n60.f fVar3) {
        long[] jArr = this.f47843g;
        long[] jArr2 = ((f2) fVar).f47843g;
        long[] jArr3 = ((f2) fVar2).f47843g;
        long[] jArr4 = ((f2) fVar3).f47843g;
        long[] l11 = v60.n.l(9);
        e2.n(jArr, jArr2, l11);
        e2.n(jArr3, jArr4, l11);
        long[] c11 = v60.i.c();
        e2.o(l11, c11);
        return new f2(c11);
    }

    @Override // n60.f
    public n60.f m() {
        return this;
    }

    @Override // n60.f
    public n60.f n() {
        long[] c11 = v60.i.c();
        e2.p(this.f47843g, c11);
        return new f2(c11);
    }

    @Override // n60.f
    public n60.f o() {
        long[] c11 = v60.i.c();
        e2.q(this.f47843g, c11);
        return new f2(c11);
    }

    @Override // n60.f
    public n60.f p(n60.f fVar, n60.f fVar2) {
        long[] jArr = this.f47843g;
        long[] jArr2 = ((f2) fVar).f47843g;
        long[] jArr3 = ((f2) fVar2).f47843g;
        long[] l11 = v60.n.l(9);
        e2.r(jArr, l11);
        e2.n(jArr2, jArr3, l11);
        long[] c11 = v60.i.c();
        e2.o(l11, c11);
        return new f2(c11);
    }

    @Override // n60.f
    public n60.f q(int i11) {
        if (i11 < 1) {
            return this;
        }
        long[] c11 = v60.i.c();
        e2.s(this.f47843g, i11, c11);
        return new f2(c11);
    }

    @Override // n60.f
    public n60.f r(n60.f fVar) {
        return a(fVar);
    }

    @Override // n60.f
    public boolean s() {
        return (this.f47843g[0] & 1) != 0;
    }

    @Override // n60.f
    public BigInteger t() {
        return v60.i.h(this.f47843g);
    }

    @Override // n60.f.a
    public n60.f u() {
        long[] c11 = v60.i.c();
        e2.f(this.f47843g, c11);
        return new f2(c11);
    }

    @Override // n60.f.a
    public boolean v() {
        return true;
    }

    @Override // n60.f.a
    public int w() {
        return e2.t(this.f47843g);
    }
}