package q60;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class f0 {

    /* renamed from: a  reason: collision with root package name */
    static final int[] f47840a = {-977, -2, -1, -1, -1, -1, -1, -1};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f47841b = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f47842c = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.h.a(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && v60.h.s(iArr3, f47840a))) {
            v60.n.b(8, 977, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (v60.n.w(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && v60.h.s(iArr2, f47840a))) {
            v60.n.b(8, 977, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] p11 = v60.h.p(bigInteger);
        if (p11[7] == -1) {
            int[] iArr = f47840a;
            if (v60.h.s(p11, iArr)) {
                v60.h.I(iArr, p11);
            }
        }
        return p11;
    }

    public static void d(int[] iArr, int[] iArr2) {
        v60.c.b(f47840a, iArr, iArr2);
    }

    public static int e(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 8; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] k11 = v60.h.k();
        v60.h.y(iArr, iArr2, k11);
        k(k11, iArr3);
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.h.C(iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && v60.n.u(16, iArr3, f47841b))) {
            int[] iArr4 = f47842c;
            if (v60.n.e(iArr4.length, iArr4, iArr3) != 0) {
                v60.n.x(16, iArr3, iArr4.length);
            }
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        if (e(iArr) == 0) {
            v60.h.H(f47840a, iArr, iArr2);
            return;
        }
        int[] iArr3 = f47840a;
        v60.h.H(iArr3, iArr3, iArr2);
    }

    public static void i(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[32];
        do {
            secureRandom.nextBytes(bArr);
            r70.i.n(bArr, 0, iArr, 0, 8);
        } while (v60.n.B(8, iArr, f47840a) == 0);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        do {
            i(secureRandom, iArr);
        } while (e(iArr) != 0);
    }

    public static void k(int[] iArr, int[] iArr2) {
        if (v60.h.A(977, v60.h.z(977, iArr, 8, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[7] == -1 && v60.h.s(iArr2, f47840a))) {
            v60.n.b(8, 977, iArr2);
        }
    }

    public static void l(int i11, int[] iArr) {
        if ((i11 == 0 || v60.h.B(977, i11, iArr, 0) == 0) && !(iArr[7] == -1 && v60.h.s(iArr, f47840a))) {
            return;
        }
        v60.n.b(8, 977, iArr);
    }

    public static void m(int[] iArr, int[] iArr2) {
        int[] k11 = v60.h.k();
        v60.h.F(iArr, k11);
        k(k11, iArr2);
    }

    public static void n(int[] iArr, int i11, int[] iArr2) {
        int[] k11 = v60.h.k();
        v60.h.F(iArr, k11);
        while (true) {
            k(k11, iArr2);
            i11--;
            if (i11 <= 0) {
                return;
            }
            v60.h.F(iArr2, k11);
        }
    }

    public static void o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.h.H(iArr, iArr2, iArr3) != 0) {
            v60.n.R(8, 977, iArr3);
        }
    }

    public static void p(int[] iArr, int[] iArr2) {
        if (v60.n.K(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && v60.h.s(iArr2, f47840a))) {
            v60.n.b(8, 977, iArr2);
        }
    }
}