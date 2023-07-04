package q60;

import com.google.android.gms.wallet.WalletConstants;
import java.math.BigInteger;
import n60.f;

/* loaded from: classes5.dex */
public class l2 extends f.a {

    /* renamed from: g  reason: collision with root package name */
    protected long[] f47898g;

    public l2() {
        this.f47898g = v60.k.c();
    }

    public l2(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        this.f47898g = k2.e(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public l2(long[] jArr) {
        this.f47898g = jArr;
    }

    @Override // n60.f
    public n60.f a(n60.f fVar) {
        long[] c11 = v60.k.c();
        k2.a(this.f47898g, ((l2) fVar).f47898g, c11);
        return new l2(c11);
    }

    @Override // n60.f
    public n60.f b() {
        long[] c11 = v60.k.c();
        k2.c(this.f47898g, c11);
        return new l2(c11);
    }

    @Override // n60.f
    public n60.f d(n60.f fVar) {
        return j(fVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l2) {
            return v60.k.e(this.f47898g, ((l2) obj).f47898g);
        }
        return false;
    }

    @Override // n60.f
    public int f() {
        return WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR;
    }

    @Override // n60.f
    public n60.f g() {
        long[] c11 = v60.k.c();
        k2.l(this.f47898g, c11);
        return new l2(c11);
    }

    @Override // n60.f
    public boolean h() {
        return v60.k.f(this.f47898g);
    }

    public int hashCode() {
        return org.bouncycastle.util.a.K(this.f47898g, 0, 7) ^ 4090087;
    }

    @Override // n60.f
    public boolean i() {
        return v60.k.g(this.f47898g);
    }

    @Override // n60.f
    public n60.f j(n60.f fVar) {
        long[] c11 = v60.k.c();
        k2.m(this.f47898g, ((l2) fVar).f47898g, c11);
        return new l2(c11);
    }

    @Override // n60.f
    public n60.f k(n60.f fVar, n60.f fVar2, n60.f fVar3) {
        return l(fVar, fVar2, fVar3);
    }

    @Override // n60.f
    public n60.f l(n60.f fVar, n60.f fVar2, n60.f fVar3) {
        long[] jArr = this.f47898g;
        long[] jArr2 = ((l2) fVar).f47898g;
        long[] jArr3 = ((l2) fVar2).f47898g;
        long[] jArr4 = ((l2) fVar3).f47898g;
        long[] l11 = v60.n.l(13);
        k2.n(jArr, jArr2, l11);
        k2.n(jArr3, jArr4, l11);
        long[] c11 = v60.k.c();
        k2.o(l11, c11);
        return new l2(c11);
    }

    @Override // n60.f
    public n60.f m() {
        return this;
    }

    @Override // n60.f
    public n60.f n() {
        long[] c11 = v60.k.c();
        k2.p(this.f47898g, c11);
        return new l2(c11);
    }

    @Override // n60.f
    public n60.f o() {
        long[] c11 = v60.k.c();
        k2.q(this.f47898g, c11);
        return new l2(c11);
    }

    @Override // n60.f
    public n60.f p(n60.f fVar, n60.f fVar2) {
        long[] jArr = this.f47898g;
        long[] jArr2 = ((l2) fVar).f47898g;
        long[] jArr3 = ((l2) fVar2).f47898g;
        long[] l11 = v60.n.l(13);
        k2.r(jArr, l11);
        k2.n(jArr2, jArr3, l11);
        long[] c11 = v60.k.c();
        k2.o(l11, c11);
        return new l2(c11);
    }

    @Override // n60.f
    public n60.f q(int i11) {
        if (i11 < 1) {
            return this;
        }
        long[] c11 = v60.k.c();
        k2.s(this.f47898g, i11, c11);
        return new l2(c11);
    }

    @Override // n60.f
    public n60.f r(n60.f fVar) {
        return a(fVar);
    }

    @Override // n60.f
    public boolean s() {
        return (this.f47898g[0] & 1) != 0;
    }

    @Override // n60.f
    public BigInteger t() {
        return v60.k.h(this.f47898g);
    }

    @Override // n60.f.a
    public n60.f u() {
        long[] c11 = v60.k.c();
        k2.f(this.f47898g, c11);
        return new l2(c11);
    }

    @Override // n60.f.a
    public boolean v() {
        return true;
    }

    @Override // n60.f.a
    public int w() {
        return k2.t(this.f47898g);
    }
}