package q60;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    static final int[] f47895a = {-21389, -2, -1, -1, -1};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f47896b = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f47897c = {-457489321, -42779, -2, -1, -1, 42777, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.e.a(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && v60.e.i(iArr3, f47895a))) {
            v60.n.b(5, 21389, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (v60.n.w(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && v60.e.i(iArr2, f47895a))) {
            v60.n.b(5, 21389, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] g11 = v60.e.g(bigInteger);
        if (g11[4] == -1) {
            int[] iArr = f47895a;
            if (v60.e.i(g11, iArr)) {
                v60.e.t(iArr, g11);
            }
        }
        return g11;
    }

    public static void d(int[] iArr, int[] iArr2) {
        v60.c.b(f47895a, iArr, iArr2);
    }

    public static int e(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 5; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] e11 = v60.e.e();
        v60.e.l(iArr, iArr2, e11);
        k(e11, iArr3);
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.e.p(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && v60.n.u(10, iArr3, f47896b))) {
            int[] iArr4 = f47897c;
            if (v60.n.e(iArr4.length, iArr4, iArr3) != 0) {
                v60.n.x(10, iArr3, iArr4.length);
            }
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        if (e(iArr) == 0) {
            v60.e.s(f47895a, iArr, iArr2);
            return;
        }
        int[] iArr3 = f47895a;
        v60.e.s(iArr3, iArr3, iArr2);
    }

    public static void i(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[20];
        do {
            secureRandom.nextBytes(bArr);
            r70.i.n(bArr, 0, iArr, 0, 5);
        } while (v60.n.B(5, iArr, f47895a) == 0);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        do {
            i(secureRandom, iArr);
        } while (e(iArr) != 0);
    }

    public static void k(int[] iArr, int[] iArr2) {
        if (v60.e.n(21389, v60.e.m(21389, iArr, 5, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[4] == -1 && v60.e.i(iArr2, f47895a))) {
            v60.n.b(5, 21389, iArr2);
        }
    }

    public static void l(int i11, int[] iArr) {
        if ((i11 == 0 || v60.e.o(21389, i11, iArr, 0) == 0) && !(iArr[4] == -1 && v60.e.i(iArr, f47895a))) {
            return;
        }
        v60.n.b(5, 21389, iArr);
    }

    public static void m(int[] iArr, int[] iArr2) {
        int[] e11 = v60.e.e();
        v60.e.r(iArr, e11);
        k(e11, iArr2);
    }

    public static void n(int[] iArr, int i11, int[] iArr2) {
        int[] e11 = v60.e.e();
        v60.e.r(iArr, e11);
        while (true) {
            k(e11, iArr2);
            i11--;
            if (i11 <= 0) {
                return;
            }
            v60.e.r(iArr2, e11);
        }
    }

    public static void o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.e.s(iArr, iArr2, iArr3) != 0) {
            v60.n.R(5, 21389, iArr3);
        }
    }

    public static void p(int[] iArr, int[] iArr2) {
        if (v60.n.K(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && v60.e.i(iArr2, f47895a))) {
            v60.n.b(5, 21389, iArr2);
        }
    }
}