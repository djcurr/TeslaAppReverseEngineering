package q60;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    static final int[] f47858a = {Integer.MAX_VALUE, -1, -1, -1, -1};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f47859b = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f47860c = {-1, -1073741826, -1, -1, -1, 1, 1};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.e.a(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && v60.e.i(iArr3, f47858a))) {
            v60.n.g(5, -2147483647, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (v60.n.w(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && v60.e.i(iArr2, f47858a))) {
            v60.n.g(5, -2147483647, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] g11 = v60.e.g(bigInteger);
        if (g11[4] == -1) {
            int[] iArr = f47858a;
            if (v60.e.i(g11, iArr)) {
                v60.e.t(iArr, g11);
            }
        }
        return g11;
    }

    public static void d(int[] iArr, int[] iArr2) {
        v60.c.b(f47858a, iArr, iArr2);
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
        if (v60.e.p(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && v60.n.u(10, iArr3, f47859b))) {
            int[] iArr4 = f47860c;
            if (v60.n.e(iArr4.length, iArr4, iArr3) != 0) {
                v60.n.x(10, iArr3, iArr4.length);
            }
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        if (e(iArr) == 0) {
            v60.e.s(f47858a, iArr, iArr2);
            return;
        }
        int[] iArr3 = f47858a;
        v60.e.s(iArr3, iArr3, iArr2);
    }

    public static void i(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[20];
        do {
            secureRandom.nextBytes(bArr);
            r70.i.n(bArr, 0, iArr, 0, 5);
        } while (v60.n.B(5, iArr, f47858a) == 0);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        do {
            i(secureRandom, iArr);
        } while (e(iArr) != 0);
    }

    public static void k(int[] iArr, int[] iArr2) {
        long j11 = iArr[5] & 4294967295L;
        long j12 = iArr[6] & 4294967295L;
        long j13 = iArr[7] & 4294967295L;
        long j14 = iArr[8] & 4294967295L;
        long j15 = iArr[9] & 4294967295L;
        long j16 = (iArr[0] & 4294967295L) + j11 + (j11 << 31) + 0;
        iArr2[0] = (int) j16;
        long j17 = (j16 >>> 32) + (iArr[1] & 4294967295L) + j12 + (j12 << 31);
        iArr2[1] = (int) j17;
        long j18 = (j17 >>> 32) + (iArr[2] & 4294967295L) + j13 + (j13 << 31);
        iArr2[2] = (int) j18;
        long j19 = (j18 >>> 32) + (iArr[3] & 4294967295L) + j14 + (j14 << 31);
        iArr2[3] = (int) j19;
        long j21 = (j19 >>> 32) + (4294967295L & iArr[4]) + j15 + (j15 << 31);
        iArr2[4] = (int) j21;
        l((int) (j21 >>> 32), iArr2);
    }

    public static void l(int i11, int[] iArr) {
        if ((i11 == 0 || v60.e.q(-2147483647, i11, iArr, 0) == 0) && !(iArr[4] == -1 && v60.e.i(iArr, f47858a))) {
            return;
        }
        v60.n.g(5, -2147483647, iArr);
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
            v60.n.U(5, -2147483647, iArr3);
        }
    }

    public static void p(int[] iArr, int[] iArr2) {
        if (v60.n.K(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && v60.e.i(iArr2, f47858a))) {
            v60.n.g(5, -2147483647, iArr2);
        }
    }
}