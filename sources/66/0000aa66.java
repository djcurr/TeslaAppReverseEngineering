package p60;

import java.math.BigInteger;
import java.security.SecureRandom;
import r70.i;
import v60.h;
import v60.n;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    static final int[] f46373a = {-1, -1, 0, -1, -1, -1, -1, -2};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f46374b = {1, 0, -2, 1, 1, -2, 0, 2, -2, -3, 3, -2, -1, -1, 0, -2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h.a(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= Integer.MAX_VALUE && h.s(iArr3, f46373a))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (n.w(8, iArr, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && h.s(iArr2, f46373a))) {
            c(iArr2);
        }
    }

    private static void c(int[] iArr) {
        long j11 = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j11;
        long j12 = j11 >> 32;
        if (j12 != 0) {
            long j13 = j12 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j13;
            j12 = j13 >> 32;
        }
        long j14 = j12 + ((iArr[2] & 4294967295L) - 1);
        iArr[2] = (int) j14;
        long j15 = (j14 >> 32) + (iArr[3] & 4294967295L) + 1;
        iArr[3] = (int) j15;
        long j16 = j15 >> 32;
        if (j16 != 0) {
            long j17 = j16 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j17;
            long j18 = (j17 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j18;
            long j19 = (j18 >> 32) + (iArr[6] & 4294967295L);
            iArr[6] = (int) j19;
            j16 = j19 >> 32;
        }
        iArr[7] = (int) (j16 + (4294967295L & iArr[7]) + 1);
    }

    public static int[] d(BigInteger bigInteger) {
        int[] p11 = h.p(bigInteger);
        if ((p11[7] >>> 1) >= Integer.MAX_VALUE) {
            int[] iArr = f46373a;
            if (h.s(p11, iArr)) {
                h.I(iArr, p11);
            }
        }
        return p11;
    }

    public static void e(int[] iArr, int[] iArr2) {
        v60.c.b(f46373a, iArr, iArr2);
    }

    public static int f(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 8; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] k11 = h.k();
        h.y(iArr, iArr2, k11);
        l(k11, iArr3);
    }

    public static void h(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h.C(iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && n.u(16, iArr3, f46374b))) {
            n.T(16, f46374b, iArr3);
        }
    }

    public static void i(int[] iArr, int[] iArr2) {
        if (f(iArr) == 0) {
            h.H(f46373a, iArr, iArr2);
            return;
        }
        int[] iArr3 = f46373a;
        h.H(iArr3, iArr3, iArr2);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[32];
        do {
            secureRandom.nextBytes(bArr);
            i.n(bArr, 0, iArr, 0, 8);
        } while (n.B(8, iArr, f46373a) == 0);
    }

    public static void k(SecureRandom secureRandom, int[] iArr) {
        do {
            j(secureRandom, iArr);
        } while (f(iArr) != 0);
    }

    public static void l(int[] iArr, int[] iArr2) {
        long j11 = iArr[8] & 4294967295L;
        long j12 = iArr[9] & 4294967295L;
        long j13 = iArr[10] & 4294967295L;
        long j14 = iArr[11] & 4294967295L;
        long j15 = iArr[12] & 4294967295L;
        long j16 = iArr[13] & 4294967295L;
        long j17 = iArr[14] & 4294967295L;
        long j18 = iArr[15] & 4294967295L;
        long j19 = j13 + j14;
        long j21 = j16 + j17;
        long j22 = j21 + (j18 << 1);
        long j23 = j11 + j12 + j21;
        long j24 = j19 + j15 + j18 + j23;
        long j25 = (iArr[0] & 4294967295L) + j24 + j16 + j17 + j18 + 0;
        iArr2[0] = (int) j25;
        long j26 = (j25 >> 32) + (((iArr[1] & 4294967295L) + j24) - j11) + j17 + j18;
        iArr2[1] = (int) j26;
        long j27 = (j26 >> 32) + ((iArr[2] & 4294967295L) - j23);
        iArr2[2] = (int) j27;
        long j28 = (j27 >> 32) + ((((iArr[3] & 4294967295L) + j24) - j12) - j13) + j16;
        iArr2[3] = (int) j28;
        long j29 = (j28 >> 32) + ((((iArr[4] & 4294967295L) + j24) - j19) - j11) + j17;
        iArr2[4] = (int) j29;
        long j31 = (j29 >> 32) + (iArr[5] & 4294967295L) + j22 + j13;
        iArr2[5] = (int) j31;
        long j32 = (j31 >> 32) + (iArr[6] & 4294967295L) + j14 + j17 + j18;
        iArr2[6] = (int) j32;
        long j33 = (j32 >> 32) + (4294967295L & iArr[7]) + j24 + j22 + j15;
        iArr2[7] = (int) j33;
        m((int) (j33 >> 32), iArr2);
    }

    public static void m(int i11, int[] iArr) {
        long j11;
        if (i11 != 0) {
            long j12 = i11 & 4294967295L;
            long j13 = (iArr[0] & 4294967295L) + j12 + 0;
            iArr[0] = (int) j13;
            long j14 = j13 >> 32;
            if (j14 != 0) {
                long j15 = j14 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j15;
                j14 = j15 >> 32;
            }
            long j16 = j14 + ((iArr[2] & 4294967295L) - j12);
            iArr[2] = (int) j16;
            long j17 = (j16 >> 32) + (iArr[3] & 4294967295L) + j12;
            iArr[3] = (int) j17;
            long j18 = j17 >> 32;
            if (j18 != 0) {
                long j19 = j18 + (iArr[4] & 4294967295L);
                iArr[4] = (int) j19;
                long j21 = (j19 >> 32) + (iArr[5] & 4294967295L);
                iArr[5] = (int) j21;
                long j22 = (j21 >> 32) + (iArr[6] & 4294967295L);
                iArr[6] = (int) j22;
                j18 = j22 >> 32;
            }
            long j23 = j18 + (4294967295L & iArr[7]) + j12;
            iArr[7] = (int) j23;
            j11 = j23 >> 32;
        } else {
            j11 = 0;
        }
        if (j11 != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && h.s(iArr, f46373a))) {
            c(iArr);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        int[] k11 = h.k();
        h.F(iArr, k11);
        l(k11, iArr2);
    }

    public static void o(int[] iArr, int i11, int[] iArr2) {
        int[] k11 = h.k();
        h.F(iArr, k11);
        while (true) {
            l(k11, iArr2);
            i11--;
            if (i11 <= 0) {
                return;
            }
            h.F(iArr2, k11);
        }
    }

    private static void p(int[] iArr) {
        long j11 = (iArr[0] & 4294967295L) - 1;
        iArr[0] = (int) j11;
        long j12 = j11 >> 32;
        if (j12 != 0) {
            long j13 = j12 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j13;
            j12 = j13 >> 32;
        }
        long j14 = j12 + (iArr[2] & 4294967295L) + 1;
        iArr[2] = (int) j14;
        long j15 = (j14 >> 32) + ((iArr[3] & 4294967295L) - 1);
        iArr[3] = (int) j15;
        long j16 = j15 >> 32;
        if (j16 != 0) {
            long j17 = j16 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j17;
            long j18 = (j17 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j18;
            long j19 = (j18 >> 32) + (iArr[6] & 4294967295L);
            iArr[6] = (int) j19;
            j16 = j19 >> 32;
        }
        iArr[7] = (int) (j16 + ((4294967295L & iArr[7]) - 1));
    }

    public static void q(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h.H(iArr, iArr2, iArr3) != 0) {
            p(iArr3);
        }
    }

    public static void r(int[] iArr, int[] iArr2) {
        if (n.K(8, iArr, 0, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && h.s(iArr2, f46373a))) {
            c(iArr2);
        }
    }
}