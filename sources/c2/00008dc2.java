package o60;

import java.math.BigInteger;
import n60.f;
import v60.h;

/* loaded from: classes5.dex */
public class c extends f.b {

    /* renamed from: h  reason: collision with root package name */
    public static final BigInteger f42300h = h.J(b.f42298a);

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f42301i = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};

    /* renamed from: g  reason: collision with root package name */
    protected int[] f42302g;

    public c() {
        this.f42302g = h.i();
    }

    public c(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f42300h) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        this.f42302g = b.d(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(int[] iArr) {
        this.f42302g = iArr;
    }

    @Override // n60.f
    public f a(f fVar) {
        int[] i11 = h.i();
        b.a(this.f42302g, ((c) fVar).f42302g, i11);
        return new c(i11);
    }

    @Override // n60.f
    public f b() {
        int[] i11 = h.i();
        b.b(this.f42302g, i11);
        return new c(i11);
    }

    @Override // n60.f
    public f d(f fVar) {
        int[] i11 = h.i();
        b.e(((c) fVar).f42302g, i11);
        b.g(i11, this.f42302g, i11);
        return new c(i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return h.n(this.f42302g, ((c) obj).f42302g);
        }
        return false;
    }

    @Override // n60.f
    public int f() {
        return f42300h.bitLength();
    }

    @Override // n60.f
    public f g() {
        int[] i11 = h.i();
        b.e(this.f42302g, i11);
        return new c(i11);
    }

    @Override // n60.f
    public boolean h() {
        return h.t(this.f42302g);
    }

    public int hashCode() {
        return f42300h.hashCode() ^ org.bouncycastle.util.a.J(this.f42302g, 0, 8);
    }

    @Override // n60.f
    public boolean i() {
        return h.v(this.f42302g);
    }

    @Override // n60.f
    public f j(f fVar) {
        int[] i11 = h.i();
        b.g(this.f42302g, ((c) fVar).f42302g, i11);
        return new c(i11);
    }

    @Override // n60.f
    public f m() {
        int[] i11 = h.i();
        b.i(this.f42302g, i11);
        return new c(i11);
    }

    @Override // n60.f
    public f n() {
        int[] iArr = this.f42302g;
        if (h.v(iArr) || h.t(iArr)) {
            return this;
        }
        int[] i11 = h.i();
        b.n(iArr, i11);
        b.g(i11, iArr, i11);
        b.n(i11, i11);
        b.g(i11, iArr, i11);
        int[] i12 = h.i();
        b.n(i11, i12);
        b.g(i12, iArr, i12);
        int[] i13 = h.i();
        b.o(i12, 3, i13);
        b.g(i13, i11, i13);
        b.o(i13, 4, i11);
        b.g(i11, i12, i11);
        b.o(i11, 4, i13);
        b.g(i13, i12, i13);
        b.o(i13, 15, i12);
        b.g(i12, i13, i12);
        b.o(i12, 30, i13);
        b.g(i13, i12, i13);
        b.o(i13, 60, i12);
        b.g(i12, i13, i12);
        b.o(i12, 11, i13);
        b.g(i13, i11, i13);
        b.o(i13, 120, i11);
        b.g(i11, i12, i11);
        b.n(i11, i11);
        b.n(i11, i12);
        if (h.n(iArr, i12)) {
            return new c(i11);
        }
        b.g(i11, f42301i, i11);
        b.n(i11, i12);
        if (h.n(iArr, i12)) {
            return new c(i11);
        }
        return null;
    }

    @Override // n60.f
    public f o() {
        int[] i11 = h.i();
        b.n(this.f42302g, i11);
        return new c(i11);
    }

    @Override // n60.f
    public f r(f fVar) {
        int[] i11 = h.i();
        b.r(this.f42302g, ((c) fVar).f42302g, i11);
        return new c(i11);
    }

    @Override // n60.f
    public boolean s() {
        return h.q(this.f42302g, 0) == 1;
    }

    @Override // n60.f
    public BigInteger t() {
        return h.J(this.f42302g);
    }
}