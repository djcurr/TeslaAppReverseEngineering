package q60;

import java.math.BigInteger;
import n60.f;

/* loaded from: classes5.dex */
public class i extends f.b {

    /* renamed from: h  reason: collision with root package name */
    public static final BigInteger f47862h = new BigInteger(1, org.bouncycastle.util.encoders.b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF"));

    /* renamed from: g  reason: collision with root package name */
    protected int[] f47863g;

    public i() {
        this.f47863g = v60.e.d();
    }

    public i(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f47862h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        this.f47863g = h.c(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i(int[] iArr) {
        this.f47863g = iArr;
    }

    @Override // n60.f
    public n60.f a(n60.f fVar) {
        int[] d11 = v60.e.d();
        h.a(this.f47863g, ((i) fVar).f47863g, d11);
        return new i(d11);
    }

    @Override // n60.f
    public n60.f b() {
        int[] d11 = v60.e.d();
        h.b(this.f47863g, d11);
        return new i(d11);
    }

    @Override // n60.f
    public n60.f d(n60.f fVar) {
        int[] d11 = v60.e.d();
        h.d(((i) fVar).f47863g, d11);
        h.f(d11, this.f47863g, d11);
        return new i(d11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return v60.e.f(this.f47863g, ((i) obj).f47863g);
        }
        return false;
    }

    @Override // n60.f
    public int f() {
        return f47862h.bitLength();
    }

    @Override // n60.f
    public n60.f g() {
        int[] d11 = v60.e.d();
        h.d(this.f47863g, d11);
        return new i(d11);
    }

    @Override // n60.f
    public boolean h() {
        return v60.e.j(this.f47863g);
    }

    public int hashCode() {
        return f47862h.hashCode() ^ org.bouncycastle.util.a.J(this.f47863g, 0, 5);
    }

    @Override // n60.f
    public boolean i() {
        return v60.e.k(this.f47863g);
    }

    @Override // n60.f
    public n60.f j(n60.f fVar) {
        int[] d11 = v60.e.d();
        h.f(this.f47863g, ((i) fVar).f47863g, d11);
        return new i(d11);
    }

    @Override // n60.f
    public n60.f m() {
        int[] d11 = v60.e.d();
        h.h(this.f47863g, d11);
        return new i(d11);
    }

    @Override // n60.f
    public n60.f n() {
        int[] iArr = this.f47863g;
        if (v60.e.k(iArr) || v60.e.j(iArr)) {
            return this;
        }
        int[] d11 = v60.e.d();
        h.m(iArr, d11);
        h.f(d11, iArr, d11);
        int[] d12 = v60.e.d();
        h.n(d11, 2, d12);
        h.f(d12, d11, d12);
        h.n(d12, 4, d11);
        h.f(d11, d12, d11);
        h.n(d11, 8, d12);
        h.f(d12, d11, d12);
        h.n(d12, 16, d11);
        h.f(d11, d12, d11);
        h.n(d11, 32, d12);
        h.f(d12, d11, d12);
        h.n(d12, 64, d11);
        h.f(d11, d12, d11);
        h.m(d11, d12);
        h.f(d12, iArr, d12);
        h.n(d12, 29, d12);
        h.m(d12, d11);
        if (v60.e.f(iArr, d11)) {
            return new i(d12);
        }
        return null;
    }

    @Override // n60.f
    public n60.f o() {
        int[] d11 = v60.e.d();
        h.m(this.f47863g, d11);
        return new i(d11);
    }

    @Override // n60.f
    public n60.f r(n60.f fVar) {
        int[] d11 = v60.e.d();
        h.o(this.f47863g, ((i) fVar).f47863g, d11);
        return new i(d11);
    }

    @Override // n60.f
    public boolean s() {
        return v60.e.h(this.f47863g, 0) == 1;
    }

    @Override // n60.f
    public BigInteger t() {
        return v60.e.u(this.f47863g);
    }
}