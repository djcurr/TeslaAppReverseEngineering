package q60;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    static final int[] f47971a = {-1, -1, -2, -1, -1, -1};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f47972b = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f47973c = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.f.a(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && v60.f.r(iArr3, f47971a))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (v60.n.w(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && v60.f.r(iArr2, f47971a))) {
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
        long j14 = j12 + (4294967295L & iArr[2]) + 1;
        iArr[2] = (int) j14;
        if ((j14 >> 32) != 0) {
            v60.n.x(6, iArr, 3);
        }
    }

    public static int[] d(BigInteger bigInteger) {
        int[] o11 = v60.f.o(bigInteger);
        if (o11[5] == -1) {
            int[] iArr = f47971a;
            if (v60.f.r(o11, iArr)) {
                v60.f.G(iArr, o11);
            }
        }
        return o11;
    }

    public static void e(int[] iArr, int[] iArr2) {
        v60.c.b(f47971a, iArr, iArr2);
    }

    public static int f(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] j11 = v60.f.j();
        v60.f.x(iArr, iArr2, j11);
        l(j11, iArr3);
    }

    public static void h(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.f.B(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && v60.n.u(12, iArr3, f47972b))) {
            int[] iArr4 = f47973c;
            if (v60.n.e(iArr4.length, iArr4, iArr3) != 0) {
                v60.n.x(12, iArr3, iArr4.length);
            }
        }
    }

    public static void i(int[] iArr, int[] iArr2) {
        if (f(iArr) == 0) {
            v60.f.F(f47971a, iArr, iArr2);
            return;
        }
        int[] iArr3 = f47971a;
        v60.f.F(iArr3, iArr3, iArr2);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[24];
        do {
            secureRandom.nextBytes(bArr);
            r70.i.n(bArr, 0, iArr, 0, 6);
        } while (v60.n.B(6, iArr, f47971a) == 0);
    }

    public static void k(SecureRandom secureRandom, int[] iArr) {
        do {
            j(secureRandom, iArr);
        } while (f(iArr) != 0);
    }

    public static void l(int[] iArr, int[] iArr2) {
        long j11 = iArr[6] & 4294967295L;
        long j12 = iArr[7] & 4294967295L;
        long j13 = (iArr[10] & 4294967295L) + j11;
        long j14 = (iArr[11] & 4294967295L) + j12;
        long j15 = (iArr[0] & 4294967295L) + j13 + 0;
        int i11 = (int) j15;
        long j16 = (j15 >> 32) + (iArr[1] & 4294967295L) + j14;
        iArr2[1] = (int) j16;
        long j17 = j13 + (iArr[8] & 4294967295L);
        long j18 = j14 + (iArr[9] & 4294967295L);
        long j19 = (j16 >> 32) + (iArr[2] & 4294967295L) + j17;
        long j21 = j19 & 4294967295L;
        long j22 = (j19 >> 32) + (iArr[3] & 4294967295L) + j18;
        iArr2[3] = (int) j22;
        long j23 = (j22 >> 32) + (iArr[4] & 4294967295L) + (j17 - j11);
        iArr2[4] = (int) j23;
        long j24 = (j23 >> 32) + (iArr[5] & 4294967295L) + (j18 - j12);
        iArr2[5] = (int) j24;
        long j25 = j24 >> 32;
        long j26 = j21 + j25;
        long j27 = j25 + (i11 & 4294967295L);
        iArr2[0] = (int) j27;
        long j28 = j27 >> 32;
        if (j28 != 0) {
            long j29 = j28 + (4294967295L & iArr2[1]);
            iArr2[1] = (int) j29;
            j26 += j29 >> 32;
        }
        iArr2[2] = (int) j26;
        if (((j26 >> 32) == 0 || v60.n.x(6, iArr2, 3) == 0) && !(iArr2[5] == -1 && v60.f.r(iArr2, f47971a))) {
            return;
        }
        c(iArr2);
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
            long j16 = j14 + (4294967295L & iArr[2]) + j12;
            iArr[2] = (int) j16;
            j11 = j16 >> 32;
        } else {
            j11 = 0;
        }
        if ((j11 == 0 || v60.n.x(6, iArr, 3) == 0) && !(iArr[5] == -1 && v60.f.r(iArr, f47971a))) {
            return;
        }
        c(iArr);
    }

    public static void n(int[] iArr, int[] iArr2) {
        int[] j11 = v60.f.j();
        v60.f.D(iArr, j11);
        l(j11, iArr2);
    }

    public static void o(int[] iArr, int i11, int[] iArr2) {
        int[] j11 = v60.f.j();
        v60.f.D(iArr, j11);
        while (true) {
            l(j11, iArr2);
            i11--;
            if (i11 <= 0) {
                return;
            }
            v60.f.D(iArr2, j11);
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
        long j14 = j12 + ((4294967295L & iArr[2]) - 1);
        iArr[2] = (int) j14;
        if ((j14 >> 32) != 0) {
            v60.n.n(6, iArr, 3);
        }
    }

    public static void q(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.f.F(iArr, iArr2, iArr3) != 0) {
            p(iArr3);
        }
    }

    public static void r(int[] iArr, int[] iArr2) {
        if (v60.n.K(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && v60.f.r(iArr2, f47971a))) {
            c(iArr2);
        }
    }
}