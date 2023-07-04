package o60;

import java.math.BigInteger;
import java.security.SecureRandom;
import r70.i;
import v60.h;
import v60.n;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    static final int[] f42298a = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f42299b = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        h.a(iArr, iArr2, iArr3);
        if (h.s(iArr3, f42298a)) {
            q(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        n.w(8, iArr, iArr2);
        if (h.s(iArr2, f42298a)) {
            q(iArr2);
        }
    }

    private static int c(int[] iArr) {
        long j11 = (iArr[0] & 4294967295L) - 19;
        iArr[0] = (int) j11;
        long j12 = j11 >> 32;
        if (j12 != 0) {
            j12 = n.n(7, iArr, 1);
        }
        long j13 = j12 + (4294967295L & iArr[7]) + 2147483648L;
        iArr[7] = (int) j13;
        return (int) (j13 >> 32);
    }

    public static int[] d(BigInteger bigInteger) {
        int[] p11 = h.p(bigInteger);
        while (true) {
            int[] iArr = f42298a;
            if (!h.s(p11, iArr)) {
                return p11;
            }
            h.I(iArr, p11);
        }
    }

    public static void e(int[] iArr, int[] iArr2) {
        v60.c.b(f42298a, iArr, iArr2);
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
        h.C(iArr, iArr2, iArr3);
        if (n.u(16, iArr3, f42299b)) {
            p(iArr3);
        }
    }

    public static void i(int[] iArr, int[] iArr2) {
        if (f(iArr) == 0) {
            h.H(f42298a, iArr, iArr2);
            return;
        }
        int[] iArr3 = f42298a;
        h.H(iArr3, iArr3, iArr2);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[32];
        do {
            secureRandom.nextBytes(bArr);
            i.n(bArr, 0, iArr, 0, 8);
            iArr[7] = iArr[7] & Integer.MAX_VALUE;
        } while (n.B(8, iArr, f42298a) == 0);
    }

    public static void k(SecureRandom secureRandom, int[] iArr) {
        do {
            j(secureRandom, iArr);
        } while (f(iArr) != 0);
    }

    public static void l(int[] iArr, int[] iArr2) {
        int i11 = iArr[7];
        n.J(8, iArr, 8, i11, iArr2, 0);
        int i12 = iArr2[7];
        iArr2[7] = (i12 & Integer.MAX_VALUE) + n.g(7, ((h.D(19, iArr, iArr2) << 1) + ((i12 >>> 31) - (i11 >>> 31))) * 19, iArr2);
        if (h.s(iArr2, f42298a)) {
            q(iArr2);
        }
    }

    public static void m(int i11, int[] iArr) {
        int i12 = iArr[7];
        iArr[7] = (i12 & Integer.MAX_VALUE) + n.g(7, ((i11 << 1) | (i12 >>> 31)) * 19, iArr);
        if (h.s(iArr, f42298a)) {
            q(iArr);
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

    private static int p(int[] iArr) {
        int[] iArr2 = f42299b;
        long j11 = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr[0] = (int) j11;
        long j12 = j11 >> 32;
        if (j12 != 0) {
            j12 = n.n(8, iArr, 1);
        }
        long j13 = j12 + (iArr[8] & 4294967295L) + 19;
        iArr[8] = (int) j13;
        long j14 = j13 >> 32;
        if (j14 != 0) {
            j14 = n.x(15, iArr, 9);
        }
        long j15 = j14 + ((iArr[15] & 4294967295L) - (4294967295L & (iArr2[15] + 1)));
        iArr[15] = (int) j15;
        return (int) (j15 >> 32);
    }

    private static int q(int[] iArr) {
        long j11 = (iArr[0] & 4294967295L) + 19;
        iArr[0] = (int) j11;
        long j12 = j11 >> 32;
        if (j12 != 0) {
            j12 = n.x(7, iArr, 1);
        }
        long j13 = j12 + ((4294967295L & iArr[7]) - 2147483648L);
        iArr[7] = (int) j13;
        return (int) (j13 >> 32);
    }

    public static void r(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h.H(iArr, iArr2, iArr3) != 0) {
            c(iArr3);
        }
    }

    public static void s(int[] iArr, int[] iArr2) {
        n.K(8, iArr, 0, iArr2);
        if (h.s(iArr2, f42298a)) {
            q(iArr2);
        }
    }
}