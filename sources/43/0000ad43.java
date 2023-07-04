package q60;

import java.math.BigInteger;
import n60.f;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes5.dex */
public class h1 extends f.a {

    /* renamed from: g  reason: collision with root package name */
    protected long[] f47861g;

    public h1() {
        this.f47861g = v60.f.i();
    }

    public h1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        this.f47861g = g1.e(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public h1(long[] jArr) {
        this.f47861g = jArr;
    }

    @Override // n60.f
    public n60.f a(n60.f fVar) {
        long[] i11 = v60.f.i();
        g1.a(this.f47861g, ((h1) fVar).f47861g, i11);
        return new h1(i11);
    }

    @Override // n60.f
    public n60.f b() {
        long[] i11 = v60.f.i();
        g1.c(this.f47861g, i11);
        return new h1(i11);
    }

    @Override // n60.f
    public n60.f d(n60.f fVar) {
        return j(fVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            return v60.f.n(this.f47861g, ((h1) obj).f47861g);
        }
        return false;
    }

    @Override // n60.f
    public int f() {
        return CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384;
    }

    @Override // n60.f
    public n60.f g() {
        long[] i11 = v60.f.i();
        g1.k(this.f47861g, i11);
        return new h1(i11);
    }

    @Override // n60.f
    public boolean h() {
        return v60.f.t(this.f47861g);
    }

    public int hashCode() {
        return org.bouncycastle.util.a.K(this.f47861g, 0, 3) ^ 163763;
    }

    @Override // n60.f
    public boolean i() {
        return v60.f.v(this.f47861g);
    }

    @Override // n60.f
    public n60.f j(n60.f fVar) {
        long[] i11 = v60.f.i();
        g1.l(this.f47861g, ((h1) fVar).f47861g, i11);
        return new h1(i11);
    }

    @Override // n60.f
    public n60.f k(n60.f fVar, n60.f fVar2, n60.f fVar3) {
        return l(fVar, fVar2, fVar3);
    }

    @Override // n60.f
    public n60.f l(n60.f fVar, n60.f fVar2, n60.f fVar3) {
        long[] jArr = this.f47861g;
        long[] jArr2 = ((h1) fVar).f47861g;
        long[] jArr3 = ((h1) fVar2).f47861g;
        long[] jArr4 = ((h1) fVar3).f47861g;
        long[] k11 = v60.f.k();
        g1.m(jArr, jArr2, k11);
        g1.m(jArr3, jArr4, k11);
        long[] i11 = v60.f.i();
        g1.n(k11, i11);
        return new h1(i11);
    }

    @Override // n60.f
    public n60.f m() {
        return this;
    }

    @Override // n60.f
    public n60.f n() {
        long[] i11 = v60.f.i();
        g1.o(this.f47861g, i11);
        return new h1(i11);
    }

    @Override // n60.f
    public n60.f o() {
        long[] i11 = v60.f.i();
        g1.p(this.f47861g, i11);
        return new h1(i11);
    }

    @Override // n60.f
    public n60.f p(n60.f fVar, n60.f fVar2) {
        long[] jArr = this.f47861g;
        long[] jArr2 = ((h1) fVar).f47861g;
        long[] jArr3 = ((h1) fVar2).f47861g;
        long[] k11 = v60.f.k();
        g1.q(jArr, k11);
        g1.m(jArr2, jArr3, k11);
        long[] i11 = v60.f.i();
        g1.n(k11, i11);
        return new h1(i11);
    }

    @Override // n60.f
    public n60.f q(int i11) {
        if (i11 < 1) {
            return this;
        }
        long[] i12 = v60.f.i();
        g1.r(this.f47861g, i11, i12);
        return new h1(i12);
    }

    @Override // n60.f
    public n60.f r(n60.f fVar) {
        return a(fVar);
    }

    @Override // n60.f
    public boolean s() {
        return (this.f47861g[0] & 1) != 0;
    }

    @Override // n60.f
    public BigInteger t() {
        return v60.f.I(this.f47861g);
    }

    @Override // n60.f.a
    public n60.f u() {
        long[] i11 = v60.f.i();
        g1.f(this.f47861g, i11);
        return new h1(i11);
    }

    @Override // n60.f.a
    public boolean v() {
        return true;
    }

    @Override // n60.f.a
    public int w() {
        return g1.s(this.f47861g);
    }
}