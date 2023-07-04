package p60;

import java.math.BigInteger;
import n60.f;
import v60.h;

/* loaded from: classes5.dex */
public class c extends f.b {

    /* renamed from: h  reason: collision with root package name */
    public static final BigInteger f46375h = new BigInteger(1, org.bouncycastle.util.encoders.b.b("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"));

    /* renamed from: g  reason: collision with root package name */
    protected int[] f46376g;

    public c() {
        this.f46376g = h.i();
    }

    public c(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f46375h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SM2P256V1FieldElement");
        }
        this.f46376g = b.d(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(int[] iArr) {
        this.f46376g = iArr;
    }

    @Override // n60.f
    public f a(f fVar) {
        int[] i11 = h.i();
        b.a(this.f46376g, ((c) fVar).f46376g, i11);
        return new c(i11);
    }

    @Override // n60.f
    public f b() {
        int[] i11 = h.i();
        b.b(this.f46376g, i11);
        return new c(i11);
    }

    @Override // n60.f
    public f d(f fVar) {
        int[] i11 = h.i();
        b.e(((c) fVar).f46376g, i11);
        b.g(i11, this.f46376g, i11);
        return new c(i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return h.n(this.f46376g, ((c) obj).f46376g);
        }
        return false;
    }

    @Override // n60.f
    public int f() {
        return f46375h.bitLength();
    }

    @Override // n60.f
    public f g() {
        int[] i11 = h.i();
        b.e(this.f46376g, i11);
        return new c(i11);
    }

    @Override // n60.f
    public boolean h() {
        return h.t(this.f46376g);
    }

    public int hashCode() {
        return f46375h.hashCode() ^ org.bouncycastle.util.a.J(this.f46376g, 0, 8);
    }

    @Override // n60.f
    public boolean i() {
        return h.v(this.f46376g);
    }

    @Override // n60.f
    public f j(f fVar) {
        int[] i11 = h.i();
        b.g(this.f46376g, ((c) fVar).f46376g, i11);
        return new c(i11);
    }

    @Override // n60.f
    public f m() {
        int[] i11 = h.i();
        b.i(this.f46376g, i11);
        return new c(i11);
    }

    @Override // n60.f
    public f n() {
        int[] iArr = this.f46376g;
        if (h.v(iArr) || h.t(iArr)) {
            return this;
        }
        int[] i11 = h.i();
        b.n(iArr, i11);
        b.g(i11, iArr, i11);
        int[] i12 = h.i();
        b.o(i11, 2, i12);
        b.g(i12, i11, i12);
        int[] i13 = h.i();
        b.o(i12, 2, i13);
        b.g(i13, i11, i13);
        b.o(i13, 6, i11);
        b.g(i11, i13, i11);
        int[] i14 = h.i();
        b.o(i11, 12, i14);
        b.g(i14, i11, i14);
        b.o(i14, 6, i11);
        b.g(i11, i13, i11);
        b.n(i11, i13);
        b.g(i13, iArr, i13);
        b.o(i13, 31, i14);
        b.g(i14, i13, i11);
        b.o(i14, 32, i14);
        b.g(i14, i11, i14);
        b.o(i14, 62, i14);
        b.g(i14, i11, i14);
        b.o(i14, 4, i14);
        b.g(i14, i12, i14);
        b.o(i14, 32, i14);
        b.g(i14, iArr, i14);
        b.o(i14, 62, i14);
        b.n(i14, i12);
        if (h.n(iArr, i12)) {
            return new c(i14);
        }
        return null;
    }

    @Override // n60.f
    public f o() {
        int[] i11 = h.i();
        b.n(this.f46376g, i11);
        return new c(i11);
    }

    @Override // n60.f
    public f r(f fVar) {
        int[] i11 = h.i();
        b.q(this.f46376g, ((c) fVar).f46376g, i11);
        return new c(i11);
    }

    @Override // n60.f
    public boolean s() {
        return h.q(this.f46376g, 0) == 1;
    }

    @Override // n60.f
    public BigInteger t() {
        return h.J(this.f46376g);
    }
}