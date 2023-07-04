package q60;

import java.math.BigInteger;
import n60.f;

/* loaded from: classes5.dex */
public class c0 extends f.b {

    /* renamed from: h  reason: collision with root package name */
    public static final BigInteger f47810h = new BigInteger(1, org.bouncycastle.util.encoders.b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"));

    /* renamed from: g  reason: collision with root package name */
    protected int[] f47811g;

    public c0() {
        this.f47811g = v60.g.e();
    }

    public c0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f47810h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        this.f47811g = b0.d(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c0(int[] iArr) {
        this.f47811g = iArr;
    }

    private static void u(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7) {
        b0.g(iArr5, iArr3, iArr7);
        b0.g(iArr7, iArr, iArr7);
        b0.g(iArr4, iArr2, iArr6);
        b0.a(iArr6, iArr7, iArr6);
        b0.g(iArr4, iArr3, iArr7);
        v60.g.d(iArr6, iArr4);
        b0.g(iArr5, iArr2, iArr5);
        b0.a(iArr5, iArr7, iArr5);
        b0.n(iArr5, iArr6);
        b0.g(iArr6, iArr, iArr6);
    }

    private static void v(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        v60.g.d(iArr, iArr4);
        int[] e11 = v60.g.e();
        int[] e12 = v60.g.e();
        for (int i11 = 0; i11 < 7; i11++) {
            v60.g.d(iArr2, e11);
            v60.g.d(iArr3, e12);
            int i12 = 1 << i11;
            while (true) {
                i12--;
                if (i12 >= 0) {
                    w(iArr2, iArr3, iArr4, iArr5);
                }
            }
            u(iArr, e11, e12, iArr2, iArr3, iArr4, iArr5);
        }
    }

    private static void w(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        b0.g(iArr2, iArr, iArr2);
        b0.r(iArr2, iArr2);
        b0.n(iArr, iArr4);
        b0.a(iArr3, iArr4, iArr);
        b0.g(iArr3, iArr4, iArr3);
        b0.m(v60.n.M(7, iArr3, 2, 0), iArr3);
    }

    private static boolean x(int[] iArr) {
        int[] e11 = v60.g.e();
        int[] e12 = v60.g.e();
        v60.g.d(iArr, e11);
        for (int i11 = 0; i11 < 7; i11++) {
            v60.g.d(e11, e12);
            b0.o(e11, 1 << i11, e11);
            b0.g(e11, e12, e11);
        }
        b0.o(e11, 95, e11);
        return v60.g.k(e11);
    }

    private static boolean y(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] e11 = v60.g.e();
        v60.g.d(iArr2, e11);
        int[] e12 = v60.g.e();
        e12[0] = 1;
        int[] e13 = v60.g.e();
        v(iArr, e11, e12, e13, iArr3);
        int[] e14 = v60.g.e();
        int[] e15 = v60.g.e();
        for (int i11 = 1; i11 < 96; i11++) {
            v60.g.d(e11, e14);
            v60.g.d(e12, e15);
            w(e11, e12, e13, iArr3);
            if (v60.g.l(e11)) {
                b0.e(e15, iArr3);
                b0.g(iArr3, e14, iArr3);
                return true;
            }
        }
        return false;
    }

    @Override // n60.f
    public n60.f a(n60.f fVar) {
        int[] e11 = v60.g.e();
        b0.a(this.f47811g, ((c0) fVar).f47811g, e11);
        return new c0(e11);
    }

    @Override // n60.f
    public n60.f b() {
        int[] e11 = v60.g.e();
        b0.b(this.f47811g, e11);
        return new c0(e11);
    }

    @Override // n60.f
    public n60.f d(n60.f fVar) {
        int[] e11 = v60.g.e();
        b0.e(((c0) fVar).f47811g, e11);
        b0.g(e11, this.f47811g, e11);
        return new c0(e11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            return v60.g.g(this.f47811g, ((c0) obj).f47811g);
        }
        return false;
    }

    @Override // n60.f
    public int f() {
        return f47810h.bitLength();
    }

    @Override // n60.f
    public n60.f g() {
        int[] e11 = v60.g.e();
        b0.e(this.f47811g, e11);
        return new c0(e11);
    }

    @Override // n60.f
    public boolean h() {
        return v60.g.k(this.f47811g);
    }

    public int hashCode() {
        return f47810h.hashCode() ^ org.bouncycastle.util.a.J(this.f47811g, 0, 7);
    }

    @Override // n60.f
    public boolean i() {
        return v60.g.l(this.f47811g);
    }

    @Override // n60.f
    public n60.f j(n60.f fVar) {
        int[] e11 = v60.g.e();
        b0.g(this.f47811g, ((c0) fVar).f47811g, e11);
        return new c0(e11);
    }

    @Override // n60.f
    public n60.f m() {
        int[] e11 = v60.g.e();
        b0.i(this.f47811g, e11);
        return new c0(e11);
    }

    @Override // n60.f
    public n60.f n() {
        int[] iArr = this.f47811g;
        if (v60.g.l(iArr) || v60.g.k(iArr)) {
            return this;
        }
        int[] e11 = v60.g.e();
        b0.i(iArr, e11);
        int[] n11 = v60.c.n(b0.f47803a);
        int[] e12 = v60.g.e();
        if (x(iArr)) {
            while (!y(e11, n11, e12)) {
                b0.b(n11, n11);
            }
            b0.n(e12, n11);
            if (v60.g.g(iArr, n11)) {
                return new c0(e12);
            }
            return null;
        }
        return null;
    }

    @Override // n60.f
    public n60.f o() {
        int[] e11 = v60.g.e();
        b0.n(this.f47811g, e11);
        return new c0(e11);
    }

    @Override // n60.f
    public n60.f r(n60.f fVar) {
        int[] e11 = v60.g.e();
        b0.q(this.f47811g, ((c0) fVar).f47811g, e11);
        return new c0(e11);
    }

    @Override // n60.f
    public boolean s() {
        return v60.g.i(this.f47811g, 0) == 1;
    }

    @Override // n60.f
    public BigInteger t() {
        return v60.g.u(this.f47811g);
    }
}