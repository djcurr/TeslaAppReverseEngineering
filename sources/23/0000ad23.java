package q60;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class b0 {

    /* renamed from: a  reason: collision with root package name */
    static final int[] f47803a = {1, 0, 0, -1, -1, -1, -1};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f47804b = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f47805c = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.g.a(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && v60.g.j(iArr3, f47803a))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (v60.n.w(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && v60.g.j(iArr2, f47803a))) {
            c(iArr2);
        }
    }

    private static void c(int[] iArr) {
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
        long j15 = j12 + (4294967295L & iArr[3]) + 1;
        iArr[3] = (int) j15;
        if ((j15 >> 32) != 0) {
            v60.n.x(7, iArr, 4);
        }
    }

    public static int[] d(BigInteger bigInteger) {
        int[] h11 = v60.g.h(bigInteger);
        if (h11[6] == -1) {
            int[] iArr = f47803a;
            if (v60.g.j(h11, iArr)) {
                v60.g.t(iArr, h11);
            }
        }
        return h11;
    }

    public static void e(int[] iArr, int[] iArr2) {
        v60.c.b(f47803a, iArr, iArr2);
    }

    public static int f(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 7; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] f11 = v60.g.f();
        v60.g.m(iArr, iArr2, f11);
        l(f11, iArr3);
    }

    public static void h(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.g.q(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && v60.n.u(14, iArr3, f47804b))) {
            int[] iArr4 = f47805c;
            if (v60.n.e(iArr4.length, iArr4, iArr3) != 0) {
                v60.n.x(14, iArr3, iArr4.length);
            }
        }
    }

    public static void i(int[] iArr, int[] iArr2) {
        if (f(iArr) == 0) {
            v60.g.s(f47803a, iArr, iArr2);
            return;
        }
        int[] iArr3 = f47803a;
        v60.g.s(iArr3, iArr3, iArr2);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[28];
        do {
            secureRandom.nextBytes(bArr);
            r70.i.n(bArr, 0, iArr, 0, 7);
        } while (v60.n.B(7, iArr, f47803a) == 0);
    }

    public static void k(SecureRandom secureRandom, int[] iArr) {
        do {
            j(secureRandom, iArr);
        } while (f(iArr) != 0);
    }

    public static void l(int[] iArr, int[] iArr2) {
        long j11 = iArr[10] & 4294967295L;
        long j12 = iArr[11] & 4294967295L;
        long j13 = iArr[12] & 4294967295L;
        long j14 = iArr[13] & 4294967295L;
        long j15 = ((iArr[7] & 4294967295L) + j12) - 1;
        long j16 = (iArr[8] & 4294967295L) + j13;
        long j17 = (iArr[9] & 4294967295L) + j14;
        long j18 = ((iArr[0] & 4294967295L) - j15) + 0;
        long j19 = j18 & 4294967295L;
        long j21 = (j18 >> 32) + ((iArr[1] & 4294967295L) - j16);
        iArr2[1] = (int) j21;
        long j22 = (j21 >> 32) + ((iArr[2] & 4294967295L) - j17);
        iArr2[2] = (int) j22;
        long j23 = (j22 >> 32) + (((iArr[3] & 4294967295L) + j15) - j11);
        long j24 = j23 & 4294967295L;
        long j25 = (j23 >> 32) + (((iArr[4] & 4294967295L) + j16) - j12);
        iArr2[4] = (int) j25;
        long j26 = (j25 >> 32) + (((iArr[5] & 4294967295L) + j17) - j13);
        iArr2[5] = (int) j26;
        long j27 = (j26 >> 32) + (((iArr[6] & 4294967295L) + j11) - j14);
        iArr2[6] = (int) j27;
        long j28 = (j27 >> 32) + 1;
        long j29 = j24 + j28;
        long j31 = j19 - j28;
        iArr2[0] = (int) j31;
        long j32 = j31 >> 32;
        if (j32 != 0) {
            long j33 = j32 + (iArr2[1] & 4294967295L);
            iArr2[1] = (int) j33;
            long j34 = (j33 >> 32) + (4294967295L & iArr2[2]);
            iArr2[2] = (int) j34;
            j29 += j34 >> 32;
        }
        iArr2[3] = (int) j29;
        if (((j29 >> 32) == 0 || v60.n.x(7, iArr2, 4) == 0) && !(iArr2[6] == -1 && v60.g.j(iArr2, f47803a))) {
            return;
        }
        c(iArr2);
    }

    public static void m(int i11, int[] iArr) {
        long j11;
        if (i11 != 0) {
            long j12 = i11 & 4294967295L;
            long j13 = ((iArr[0] & 4294967295L) - j12) + 0;
            iArr[0] = (int) j13;
            long j14 = j13 >> 32;
            if (j14 != 0) {
                long j15 = j14 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j15;
                long j16 = (j15 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j16;
                j14 = j16 >> 32;
            }
            long j17 = j14 + (4294967295L & iArr[3]) + j12;
            iArr[3] = (int) j17;
            j11 = j17 >> 32;
        } else {
            j11 = 0;
        }
        if ((j11 == 0 || v60.n.x(7, iArr, 4) == 0) && !(iArr[6] == -1 && v60.g.j(iArr, f47803a))) {
            return;
        }
        c(iArr);
    }

    public static void n(int[] iArr, int[] iArr2) {
        int[] f11 = v60.g.f();
        v60.g.r(iArr, f11);
        l(f11, iArr2);
    }

    public static void o(int[] iArr, int i11, int[] iArr2) {
        int[] f11 = v60.g.f();
        v60.g.r(iArr, f11);
        while (true) {
            l(f11, iArr2);
            i11--;
            if (i11 <= 0) {
                return;
            }
            v60.g.r(iArr2, f11);
        }
    }

    private static void p(int[] iArr) {
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
        long j15 = j12 + ((4294967295L & iArr[3]) - 1);
        iArr[3] = (int) j15;
        if ((j15 >> 32) != 0) {
            v60.n.n(7, iArr, 4);
        }
    }

    public static void q(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.g.s(iArr, iArr2, iArr3) != 0) {
            p(iArr3);
        }
    }

    public static void r(int[] iArr, int[] iArr2) {
        if (v60.n.K(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && v60.g.j(iArr2, f47803a))) {
            c(iArr2);
        }
    }
}