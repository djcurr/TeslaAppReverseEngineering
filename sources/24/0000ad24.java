package q60;

import java.math.BigInteger;
import n60.f;

/* loaded from: classes5.dex */
public class b1 extends f.a {

    /* renamed from: g  reason: collision with root package name */
    protected long[] f47806g;

    public b1() {
        this.f47806g = v60.f.i();
    }

    public b1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            throw new IllegalArgumentException("x value invalid for SecT131FieldElement");
        }
        this.f47806g = a1.e(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b1(long[] jArr) {
        this.f47806g = jArr;
    }

    @Override // n60.f
    public n60.f a(n60.f fVar) {
        long[] i11 = v60.f.i();
        a1.a(this.f47806g, ((b1) fVar).f47806g, i11);
        return new b1(i11);
    }

    @Override // n60.f
    public n60.f b() {
        long[] i11 = v60.f.i();
        a1.c(this.f47806g, i11);
        return new b1(i11);
    }

    @Override // n60.f
    public n60.f d(n60.f fVar) {
        return j(fVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            return v60.f.n(this.f47806g, ((b1) obj).f47806g);
        }
        return false;
    }

    @Override // n60.f
    public int f() {
        return com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE;
    }

    @Override // n60.f
    public n60.f g() {
        long[] i11 = v60.f.i();
        a1.k(this.f47806g, i11);
        return new b1(i11);
    }

    @Override // n60.f
    public boolean h() {
        return v60.f.t(this.f47806g);
    }

    public int hashCode() {
        return org.bouncycastle.util.a.K(this.f47806g, 0, 3) ^ 131832;
    }

    @Override // n60.f
    public boolean i() {
        return v60.f.v(this.f47806g);
    }

    @Override // n60.f
    public n60.f j(n60.f fVar) {
        long[] i11 = v60.f.i();
        a1.l(this.f47806g, ((b1) fVar).f47806g, i11);
        return new b1(i11);
    }

    @Override // n60.f
    public n60.f k(n60.f fVar, n60.f fVar2, n60.f fVar3) {
        return l(fVar, fVar2, fVar3);
    }

    @Override // n60.f
    public n60.f l(n60.f fVar, n60.f fVar2, n60.f fVar3) {
        long[] jArr = this.f47806g;
        long[] jArr2 = ((b1) fVar).f47806g;
        long[] jArr3 = ((b1) fVar2).f47806g;
        long[] jArr4 = ((b1) fVar3).f47806g;
        long[] l11 = v60.n.l(5);
        a1.m(jArr, jArr2, l11);
        a1.m(jArr3, jArr4, l11);
        long[] i11 = v60.f.i();
        a1.n(l11, i11);
        return new b1(i11);
    }

    @Override // n60.f
    public n60.f m() {
        return this;
    }

    @Override // n60.f
    public n60.f n() {
        long[] i11 = v60.f.i();
        a1.o(this.f47806g, i11);
        return new b1(i11);
    }

    @Override // n60.f
    public n60.f o() {
        long[] i11 = v60.f.i();
        a1.p(this.f47806g, i11);
        return new b1(i11);
    }

    @Override // n60.f
    public n60.f p(n60.f fVar, n60.f fVar2) {
        long[] jArr = this.f47806g;
        long[] jArr2 = ((b1) fVar).f47806g;
        long[] jArr3 = ((b1) fVar2).f47806g;
        long[] l11 = v60.n.l(5);
        a1.q(jArr, l11);
        a1.m(jArr2, jArr3, l11);
        long[] i11 = v60.f.i();
        a1.n(l11, i11);
        return new b1(i11);
    }

    @Override // n60.f
    public n60.f q(int i11) {
        if (i11 < 1) {
            return this;
        }
        long[] i12 = v60.f.i();
        a1.r(this.f47806g, i11, i12);
        return new b1(i12);
    }

    @Override // n60.f
    public n60.f r(n60.f fVar) {
        return a(fVar);
    }

    @Override // n60.f
    public boolean s() {
        return (this.f47806g[0] & 1) != 0;
    }

    @Override // n60.f
    public BigInteger t() {
        return v60.f.I(this.f47806g);
    }

    @Override // n60.f.a
    public n60.f u() {
        long[] i11 = v60.f.i();
        a1.f(this.f47806g, i11);
        return new b1(i11);
    }

    @Override // n60.f.a
    public boolean v() {
        return true;
    }

    @Override // n60.f.a
    public int w() {
        return a1.s(this.f47806g);
    }
}