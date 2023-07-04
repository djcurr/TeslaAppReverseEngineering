package q60;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class n0 {

    /* renamed from: a  reason: collision with root package name */
    static final int[] f47917a = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f47918b = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f47919c = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.n.a(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && v60.n.u(12, iArr3, f47917a))) {
            d(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.n.a(24, iArr, iArr2, iArr3) != 0 || (iArr3[23] == -1 && v60.n.u(24, iArr3, f47918b))) {
            int[] iArr4 = f47919c;
            if (v60.n.e(iArr4.length, iArr4, iArr3) != 0) {
                v60.n.x(24, iArr3, iArr4.length);
            }
        }
    }

    public static void c(int[] iArr, int[] iArr2) {
        if (v60.n.w(12, iArr, iArr2) != 0 || (iArr2[11] == -1 && v60.n.u(12, iArr2, f47917a))) {
            d(iArr2);
        }
    }

    private static void d(int[] iArr) {
        long j11 = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr[1] & 4294967295L) - 1);
        iArr[1] = (int) j12;
        long j13 = j12 >> 32;
        if (j13 != 0) {
            long j14 = j13 + (iArr[2] & 4294967295L);
            iArr[2] = (int) j14;
            j13 = j14 >> 32;
        }
        long j15 = j13 + (iArr[3] & 4294967295L) + 1;
        iArr[3] = (int) j15;
        long j16 = (j15 >> 32) + (4294967295L & iArr[4]) + 1;
        iArr[4] = (int) j16;
        if ((j16 >> 32) != 0) {
            v60.n.x(12, iArr, 5);
        }
    }

    public static int[] e(BigInteger bigInteger) {
        int[] r11 = v60.n.r(384, bigInteger);
        if (r11[11] == -1) {
            int[] iArr = f47917a;
            if (v60.n.u(12, r11, iArr)) {
                v60.n.T(12, iArr, r11);
            }
        }
        return r11;
    }

    public static void f(int[] iArr, int[] iArr2) {
        v60.c.b(f47917a, iArr, iArr2);
    }

    public static int g(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 12; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static void h(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] k11 = v60.n.k(24);
        v60.j.a(iArr, iArr2, k11);
        l(k11, iArr3);
    }

    public static void i(int[] iArr, int[] iArr2) {
        if (g(iArr) == 0) {
            v60.n.Q(12, f47917a, iArr, iArr2);
            return;
        }
        int[] iArr3 = f47917a;
        v60.n.Q(12, iArr3, iArr3, iArr2);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[48];
        do {
            secureRandom.nextBytes(bArr);
            r70.i.n(bArr, 0, iArr, 0, 12);
        } while (v60.n.B(12, iArr, f47917a) == 0);
    }

    public static void k(SecureRandom secureRandom, int[] iArr) {
        do {
            j(secureRandom, iArr);
        } while (g(iArr) != 0);
    }

    public static void l(int[] iArr, int[] iArr2) {
        long j11 = iArr[16] & 4294967295L;
        long j12 = iArr[17] & 4294967295L;
        long j13 = iArr[18] & 4294967295L;
        long j14 = iArr[19] & 4294967295L;
        long j15 = iArr[20] & 4294967295L;
        long j16 = iArr[21] & 4294967295L;
        long j17 = iArr[22] & 4294967295L;
        long j18 = iArr[23] & 4294967295L;
        long j19 = ((iArr[12] & 4294967295L) + j15) - 1;
        long j21 = (iArr[13] & 4294967295L) + j17;
        long j22 = (iArr[14] & 4294967295L) + j17 + j18;
        long j23 = (iArr[15] & 4294967295L) + j18;
        long j24 = j12 + j16;
        long j25 = j16 - j18;
        long j26 = j17 - j18;
        long j27 = j19 + j25;
        long j28 = (iArr[0] & 4294967295L) + j27 + 0;
        iArr2[0] = (int) j28;
        long j29 = (j28 >> 32) + (((iArr[1] & 4294967295L) + j18) - j19) + j21;
        iArr2[1] = (int) j29;
        long j31 = (j29 >> 32) + (((iArr[2] & 4294967295L) - j16) - j21) + j22;
        iArr2[2] = (int) j31;
        long j32 = (j31 >> 32) + ((iArr[3] & 4294967295L) - j22) + j23 + j27;
        iArr2[3] = (int) j32;
        long j33 = (j32 >> 32) + (((((iArr[4] & 4294967295L) + j11) + j16) + j21) - j23) + j27;
        iArr2[4] = (int) j33;
        long j34 = (j33 >> 32) + ((iArr[5] & 4294967295L) - j11) + j21 + j22 + j24;
        iArr2[5] = (int) j34;
        long j35 = (j34 >> 32) + (((iArr[6] & 4294967295L) + j13) - j12) + j22 + j23;
        iArr2[6] = (int) j35;
        long j36 = (j35 >> 32) + ((((iArr[7] & 4294967295L) + j11) + j14) - j13) + j23;
        iArr2[7] = (int) j36;
        long j37 = (j36 >> 32) + (((((iArr[8] & 4294967295L) + j11) + j12) + j15) - j14);
        iArr2[8] = (int) j37;
        long j38 = (j37 >> 32) + (((iArr[9] & 4294967295L) + j13) - j15) + j24;
        iArr2[9] = (int) j38;
        long j39 = (j38 >> 32) + ((((iArr[10] & 4294967295L) + j13) + j14) - j25) + j26;
        iArr2[10] = (int) j39;
        long j41 = (j39 >> 32) + ((((iArr[11] & 4294967295L) + j14) + j15) - j26);
        iArr2[11] = (int) j41;
        m((int) ((j41 >> 32) + 1), iArr2);
    }

    public static void m(int i11, int[] iArr) {
        long j11;
        if (i11 != 0) {
            long j12 = i11 & 4294967295L;
            long j13 = (iArr[0] & 4294967295L) + j12 + 0;
            iArr[0] = (int) j13;
            long j14 = (j13 >> 32) + ((iArr[1] & 4294967295L) - j12);
            iArr[1] = (int) j14;
            long j15 = j14 >> 32;
            if (j15 != 0) {
                long j16 = j15 + (iArr[2] & 4294967295L);
                iArr[2] = (int) j16;
                j15 = j16 >> 32;
            }
            long j17 = j15 + (iArr[3] & 4294967295L) + j12;
            iArr[3] = (int) j17;
            long j18 = (j17 >> 32) + (4294967295L & iArr[4]) + j12;
            iArr[4] = (int) j18;
            j11 = j18 >> 32;
        } else {
            j11 = 0;
        }
        if ((j11 == 0 || v60.n.x(12, iArr, 5) == 0) && !(iArr[11] == -1 && v60.n.u(12, iArr, f47917a))) {
            return;
        }
        d(iArr);
    }

    public static void n(int[] iArr, int[] iArr2) {
        int[] k11 = v60.n.k(24);
        v60.j.b(iArr, k11);
        l(k11, iArr2);
    }

    public static void o(int[] iArr, int i11, int[] iArr2) {
        int[] k11 = v60.n.k(24);
        v60.j.b(iArr, k11);
        while (true) {
            l(k11, iArr2);
            i11--;
            if (i11 <= 0) {
                return;
            }
            v60.j.b(iArr2, k11);
        }
    }

    private static void p(int[] iArr) {
        long j11 = (iArr[0] & 4294967295L) - 1;
        iArr[0] = (int) j11;
        long j12 = (j11 >> 32) + (iArr[1] & 4294967295L) + 1;
        iArr[1] = (int) j12;
        long j13 = j12 >> 32;
        if (j13 != 0) {
            long j14 = j13 + (iArr[2] & 4294967295L);
            iArr[2] = (int) j14;
            j13 = j14 >> 32;
        }
        long j15 = j13 + ((iArr[3] & 4294967295L) - 1);
        iArr[3] = (int) j15;
        long j16 = (j15 >> 32) + ((4294967295L & iArr[4]) - 1);
        iArr[4] = (int) j16;
        if ((j16 >> 32) != 0) {
            v60.n.n(12, iArr, 5);
        }
    }

    public static void q(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.n.Q(12, iArr, iArr2, iArr3) != 0) {
            p(iArr3);
        }
    }

    public static void r(int[] iArr, int[] iArr2) {
        if (v60.n.K(12, iArr, 0, iArr2) != 0 || (iArr2[11] == -1 && v60.n.u(12, iArr2, f47917a))) {
            d(iArr2);
        }
    }
}