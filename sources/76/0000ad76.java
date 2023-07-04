package q60;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class r0 {

    /* renamed from: a  reason: collision with root package name */
    static final int[] f47951a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        int a11 = v60.n.a(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (a11 > 511 || (a11 == 511 && v60.n.o(16, iArr3, f47951a))) {
            a11 = (a11 + v60.n.v(16, iArr3)) & 511;
        }
        iArr3[16] = a11;
    }

    public static void b(int[] iArr, int[] iArr2) {
        int w11 = v60.n.w(16, iArr, iArr2) + iArr[16];
        if (w11 > 511 || (w11 == 511 && v60.n.o(16, iArr2, f47951a))) {
            w11 = (w11 + v60.n.v(16, iArr2)) & 511;
        }
        iArr2[16] = w11;
    }

    public static int[] c(BigInteger bigInteger) {
        int[] r11 = v60.n.r(521, bigInteger);
        if (v60.n.o(17, r11, f47951a)) {
            v60.n.W(17, r11);
        }
        return r11;
    }

    protected static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        v60.l.a(iArr, iArr2, iArr3);
        int i11 = iArr[16];
        int i12 = iArr2[16];
        iArr3[32] = v60.n.C(16, i11, iArr2, i12, iArr, iArr3, 16) + (i11 * i12);
    }

    protected static void e(int[] iArr, int[] iArr2) {
        v60.l.b(iArr, iArr2);
        int i11 = iArr[16];
        iArr2[32] = v60.n.E(16, i11 << 1, iArr, 0, iArr2, 16) + (i11 * i11);
    }

    public static void f(int[] iArr, int[] iArr2) {
        v60.c.b(f47951a, iArr, iArr2);
    }

    public static int g(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 17; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static void h(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] k11 = v60.n.k(33);
        d(iArr, iArr2, k11);
        l(k11, iArr3);
    }

    public static void i(int[] iArr, int[] iArr2) {
        if (g(iArr) == 0) {
            v60.n.Q(17, f47951a, iArr, iArr2);
            return;
        }
        int[] iArr3 = f47951a;
        v60.n.Q(17, iArr3, iArr3, iArr2);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[68];
        do {
            secureRandom.nextBytes(bArr);
            r70.i.n(bArr, 0, iArr, 0, 17);
            iArr[16] = iArr[16] & 511;
        } while (v60.n.B(17, iArr, f47951a) == 0);
    }

    public static void k(SecureRandom secureRandom, int[] iArr) {
        do {
            j(secureRandom, iArr);
        } while (g(iArr) != 0);
    }

    public static void l(int[] iArr, int[] iArr2) {
        int i11 = iArr[32];
        int H = (v60.n.H(16, iArr, 16, 9, i11, iArr2, 0) >>> 23) + (i11 >>> 9) + v60.n.e(16, iArr, iArr2);
        if (H > 511 || (H == 511 && v60.n.o(16, iArr2, f47951a))) {
            H = (H + v60.n.v(16, iArr2)) & 511;
        }
        iArr2[16] = H;
    }

    public static void m(int[] iArr) {
        int i11 = iArr[16];
        int g11 = v60.n.g(16, i11 >>> 9, iArr) + (i11 & 511);
        if (g11 > 511 || (g11 == 511 && v60.n.o(16, iArr, f47951a))) {
            g11 = (g11 + v60.n.v(16, iArr)) & 511;
        }
        iArr[16] = g11;
    }

    public static void n(int[] iArr, int[] iArr2) {
        int[] k11 = v60.n.k(33);
        e(iArr, k11);
        l(k11, iArr2);
    }

    public static void o(int[] iArr, int i11, int[] iArr2) {
        int[] k11 = v60.n.k(33);
        e(iArr, k11);
        while (true) {
            l(k11, iArr2);
            i11--;
            if (i11 <= 0) {
                return;
            }
            e(iArr2, k11);
        }
    }

    public static void p(int[] iArr, int[] iArr2, int[] iArr3) {
        int Q = (v60.n.Q(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (Q < 0) {
            Q = (Q + v60.n.m(16, iArr3)) & 511;
        }
        iArr3[16] = Q;
    }

    public static void q(int[] iArr, int[] iArr2) {
        int i11 = iArr[16];
        iArr2[16] = (v60.n.K(16, iArr, i11 << 23, iArr2) | (i11 << 1)) & 511;
    }
}