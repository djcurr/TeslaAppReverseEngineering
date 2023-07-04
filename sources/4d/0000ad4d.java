package q60;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class j0 {

    /* renamed from: a  reason: collision with root package name */
    static final int[] f47880a = {-1, -1, -1, 0, 0, 0, 1, -1};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f47881b = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.h.a(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && v60.h.s(iArr3, f47880a))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (v60.n.w(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && v60.h.s(iArr2, f47880a))) {
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
            long j14 = (j13 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j14;
            j12 = j14 >> 32;
        }
        long j15 = j12 + ((iArr[3] & 4294967295L) - 1);
        iArr[3] = (int) j15;
        long j16 = j15 >> 32;
        if (j16 != 0) {
            long j17 = j16 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j17;
            long j18 = (j17 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j18;
            j16 = j18 >> 32;
        }
        long j19 = j16 + ((iArr[6] & 4294967295L) - 1);
        iArr[6] = (int) j19;
        iArr[7] = (int) ((j19 >> 32) + (4294967295L & iArr[7]) + 1);
    }

    public static int[] d(BigInteger bigInteger) {
        int[] p11 = v60.h.p(bigInteger);
        if (p11[7] == -1) {
            int[] iArr = f47880a;
            if (v60.h.s(p11, iArr)) {
                v60.h.I(iArr, p11);
            }
        }
        return p11;
    }

    public static void e(int[] iArr, int[] iArr2) {
        v60.c.b(f47880a, iArr, iArr2);
    }

    public static int f(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 8; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] k11 = v60.h.k();
        v60.h.y(iArr, iArr2, k11);
        l(k11, iArr3);
    }

    public static void h(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.h.C(iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && v60.n.u(16, iArr3, f47881b))) {
            v60.n.T(16, f47881b, iArr3);
        }
    }

    public static void i(int[] iArr, int[] iArr2) {
        if (f(iArr) == 0) {
            v60.h.H(f47880a, iArr, iArr2);
            return;
        }
        int[] iArr3 = f47880a;
        v60.h.H(iArr3, iArr3, iArr2);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[32];
        do {
            secureRandom.nextBytes(bArr);
            r70.i.n(bArr, 0, iArr, 0, 8);
        } while (v60.n.B(8, iArr, f47880a) == 0);
    }

    public static void k(SecureRandom secureRandom, int[] iArr) {
        do {
            j(secureRandom, iArr);
        } while (f(iArr) != 0);
    }

    public static void l(int[] iArr, int[] iArr2) {
        long j11 = iArr[9] & 4294967295L;
        long j12 = iArr[10] & 4294967295L;
        long j13 = iArr[11] & 4294967295L;
        long j14 = iArr[12] & 4294967295L;
        long j15 = iArr[13] & 4294967295L;
        long j16 = iArr[14] & 4294967295L;
        long j17 = iArr[15] & 4294967295L;
        long j18 = (iArr[8] & 4294967295L) - 6;
        long j19 = j18 + j11;
        long j21 = j11 + j12;
        long j22 = (j12 + j13) - j17;
        long j23 = j13 + j14;
        long j24 = j14 + j15;
        long j25 = j15 + j16;
        long j26 = j16 + j17;
        long j27 = j25 - j19;
        long j28 = (((iArr[0] & 4294967295L) - j23) - j27) + 0;
        iArr2[0] = (int) j28;
        long j29 = (j28 >> 32) + ((((iArr[1] & 4294967295L) + j21) - j24) - j26);
        iArr2[1] = (int) j29;
        long j31 = (j29 >> 32) + (((iArr[2] & 4294967295L) + j22) - j25);
        iArr2[2] = (int) j31;
        long j32 = (j31 >> 32) + ((((iArr[3] & 4294967295L) + (j23 << 1)) + j27) - j26);
        iArr2[3] = (int) j32;
        long j33 = (j32 >> 32) + ((((iArr[4] & 4294967295L) + (j24 << 1)) + j16) - j21);
        iArr2[4] = (int) j33;
        long j34 = (j33 >> 32) + (((iArr[5] & 4294967295L) + (j25 << 1)) - j22);
        iArr2[5] = (int) j34;
        long j35 = (j34 >> 32) + (iArr[6] & 4294967295L) + (j26 << 1) + j27;
        iArr2[6] = (int) j35;
        long j36 = (j35 >> 32) + (((((iArr[7] & 4294967295L) + (j17 << 1)) + j18) - j22) - j24);
        iArr2[7] = (int) j36;
        m((int) ((j36 >> 32) + 6), iArr2);
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
                long j16 = (j15 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j16;
                j14 = j16 >> 32;
            }
            long j17 = j14 + ((iArr[3] & 4294967295L) - j12);
            iArr[3] = (int) j17;
            long j18 = j17 >> 32;
            if (j18 != 0) {
                long j19 = j18 + (iArr[4] & 4294967295L);
                iArr[4] = (int) j19;
                long j21 = (j19 >> 32) + (iArr[5] & 4294967295L);
                iArr[5] = (int) j21;
                j18 = j21 >> 32;
            }
            long j22 = j18 + ((iArr[6] & 4294967295L) - j12);
            iArr[6] = (int) j22;
            long j23 = (j22 >> 32) + (4294967295L & iArr[7]) + j12;
            iArr[7] = (int) j23;
            j11 = j23 >> 32;
        } else {
            j11 = 0;
        }
        if (j11 != 0 || (iArr[7] == -1 && v60.h.s(iArr, f47880a))) {
            c(iArr);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        int[] k11 = v60.h.k();
        v60.h.F(iArr, k11);
        l(k11, iArr2);
    }

    public static void o(int[] iArr, int i11, int[] iArr2) {
        int[] k11 = v60.h.k();
        v60.h.F(iArr, k11);
        while (true) {
            l(k11, iArr2);
            i11--;
            if (i11 <= 0) {
                return;
            }
            v60.h.F(iArr2, k11);
        }
    }

    private static void p(int[] iArr) {
        long j11 = (iArr[0] & 4294967295L) - 1;
        iArr[0] = (int) j11;
        long j12 = j11 >> 32;
        if (j12 != 0) {
            long j13 = j12 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j13;
            long j14 = (j13 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j14;
            j12 = j14 >> 32;
        }
        long j15 = j12 + (iArr[3] & 4294967295L) + 1;
        iArr[3] = (int) j15;
        long j16 = j15 >> 32;
        if (j16 != 0) {
            long j17 = j16 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j17;
            long j18 = (j17 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j18;
            j16 = j18 >> 32;
        }
        long j19 = j16 + (iArr[6] & 4294967295L) + 1;
        iArr[6] = (int) j19;
        iArr[7] = (int) ((j19 >> 32) + ((4294967295L & iArr[7]) - 1));
    }

    public static void q(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.h.H(iArr, iArr2, iArr3) != 0) {
            p(iArr3);
        }
    }

    public static void r(int[] iArr, int[] iArr2) {
        if (v60.n.K(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && v60.h.s(iArr2, f47880a))) {
            c(iArr2);
        }
    }
}