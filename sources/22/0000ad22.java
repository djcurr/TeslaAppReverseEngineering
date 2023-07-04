package q60;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    static final int[] f47800a = {-1, -1, -1, -3};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f47801b = {1, 0, 0, 4, -2, -1, 3, -4};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f47802c = {-1, -1, -1, -5, 1, 0, -4, 3};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.d.a(iArr, iArr2, iArr3) != 0 || ((iArr3[3] >>> 1) >= 2147483646 && v60.d.n(iArr3, f47800a))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (v60.n.w(4, iArr, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && v60.d.n(iArr2, f47800a))) {
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
        iArr[3] = (int) (j12 + (4294967295L & iArr[3]) + 2);
    }

    public static int[] d(BigInteger bigInteger) {
        int[] l11 = v60.d.l(bigInteger);
        if ((l11[3] >>> 1) >= 2147483646) {
            int[] iArr = f47800a;
            if (v60.d.n(l11, iArr)) {
                v60.d.w(iArr, l11);
            }
        }
        return l11;
    }

    public static void e(int[] iArr, int[] iArr2) {
        v60.c.b(f47800a, iArr, iArr2);
    }

    public static int f(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] h11 = v60.d.h();
        v60.d.s(iArr, iArr2, h11);
        l(h11, iArr3);
    }

    public static void h(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.d.t(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= 2147483646 && v60.h.s(iArr3, f47801b))) {
            int[] iArr4 = f47802c;
            v60.n.e(iArr4.length, iArr4, iArr3);
        }
    }

    public static void i(int[] iArr, int[] iArr2) {
        if (f(iArr) == 0) {
            v60.d.v(f47800a, iArr, iArr2);
            return;
        }
        int[] iArr3 = f47800a;
        v60.d.v(iArr3, iArr3, iArr2);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[16];
        do {
            secureRandom.nextBytes(bArr);
            r70.i.n(bArr, 0, iArr, 0, 4);
        } while (v60.n.B(4, iArr, f47800a) == 0);
    }

    public static void k(SecureRandom secureRandom, int[] iArr) {
        do {
            j(secureRandom, iArr);
        } while (f(iArr) != 0);
    }

    public static void l(int[] iArr, int[] iArr2) {
        long j11 = iArr[7] & 4294967295L;
        long j12 = (iArr[3] & 4294967295L) + j11;
        long j13 = (iArr[6] & 4294967295L) + (j11 << 1);
        long j14 = (iArr[2] & 4294967295L) + j13;
        long j15 = (iArr[5] & 4294967295L) + (j13 << 1);
        long j16 = (iArr[1] & 4294967295L) + j15;
        long j17 = (iArr[4] & 4294967295L) + (j15 << 1);
        long j18 = (iArr[0] & 4294967295L) + j17;
        iArr2[0] = (int) j18;
        long j19 = j16 + (j18 >>> 32);
        iArr2[1] = (int) j19;
        long j21 = j14 + (j19 >>> 32);
        iArr2[2] = (int) j21;
        long j22 = j12 + (j17 << 1) + (j21 >>> 32);
        iArr2[3] = (int) j22;
        m((int) (j22 >>> 32), iArr2);
    }

    public static void m(int i11, int[] iArr) {
        while (i11 != 0) {
            long j11 = i11 & 4294967295L;
            long j12 = (iArr[0] & 4294967295L) + j11;
            iArr[0] = (int) j12;
            long j13 = j12 >> 32;
            if (j13 != 0) {
                long j14 = j13 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j14;
                long j15 = (j14 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j15;
                j13 = j15 >> 32;
            }
            long j16 = j13 + (4294967295L & iArr[3]) + (j11 << 1);
            iArr[3] = (int) j16;
            i11 = (int) (j16 >> 32);
        }
        if ((iArr[3] >>> 1) < 2147483646 || !v60.d.n(iArr, f47800a)) {
            return;
        }
        c(iArr);
    }

    public static void n(int[] iArr, int[] iArr2) {
        int[] h11 = v60.d.h();
        v60.d.u(iArr, h11);
        l(h11, iArr2);
    }

    public static void o(int[] iArr, int i11, int[] iArr2) {
        int[] h11 = v60.d.h();
        v60.d.u(iArr, h11);
        while (true) {
            l(h11, iArr2);
            i11--;
            if (i11 <= 0) {
                return;
            }
            v60.d.u(iArr2, h11);
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
        iArr[3] = (int) (j12 + ((4294967295L & iArr[3]) - 2));
    }

    public static void q(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.d.v(iArr, iArr2, iArr3) != 0) {
            p(iArr3);
        }
    }

    public static void r(int[] iArr, int[] iArr2) {
        if (v60.n.K(4, iArr, 0, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && v60.d.n(iArr2, f47800a))) {
            c(iArr2);
        }
    }
}