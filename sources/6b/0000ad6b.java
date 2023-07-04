package q60;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    static final int[] f47933a = {-4553, -2, -1, -1, -1, -1};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f47934b = {20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f47935c = {-20729809, -9107, -2, -1, -1, -1, 9105, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.f.a(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && v60.f.r(iArr3, f47933a))) {
            v60.n.b(6, 4553, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (v60.n.w(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && v60.f.r(iArr2, f47933a))) {
            v60.n.b(6, 4553, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] o11 = v60.f.o(bigInteger);
        if (o11[5] == -1) {
            int[] iArr = f47933a;
            if (v60.f.r(o11, iArr)) {
                v60.f.G(iArr, o11);
            }
        }
        return o11;
    }

    public static void d(int[] iArr, int[] iArr2) {
        v60.c.b(f47933a, iArr, iArr2);
    }

    public static int e(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] j11 = v60.f.j();
        v60.f.x(iArr, iArr2, j11);
        k(j11, iArr3);
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.f.B(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && v60.n.u(12, iArr3, f47934b))) {
            int[] iArr4 = f47935c;
            if (v60.n.e(iArr4.length, iArr4, iArr3) != 0) {
                v60.n.x(12, iArr3, iArr4.length);
            }
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        if (e(iArr) == 0) {
            v60.f.F(f47933a, iArr, iArr2);
            return;
        }
        int[] iArr3 = f47933a;
        v60.f.F(iArr3, iArr3, iArr2);
    }

    public static void i(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[24];
        do {
            secureRandom.nextBytes(bArr);
            r70.i.n(bArr, 0, iArr, 0, 6);
        } while (v60.n.B(6, iArr, f47933a) == 0);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        do {
            i(secureRandom, iArr);
        } while (e(iArr) != 0);
    }

    public static void k(int[] iArr, int[] iArr2) {
        if (v60.f.z(4553, v60.f.y(4553, iArr, 6, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[5] == -1 && v60.f.r(iArr2, f47933a))) {
            v60.n.b(6, 4553, iArr2);
        }
    }

    public static void l(int i11, int[] iArr) {
        if ((i11 == 0 || v60.f.A(4553, i11, iArr, 0) == 0) && !(iArr[5] == -1 && v60.f.r(iArr, f47933a))) {
            return;
        }
        v60.n.b(6, 4553, iArr);
    }

    public static void m(int[] iArr, int[] iArr2) {
        int[] j11 = v60.f.j();
        v60.f.D(iArr, j11);
        k(j11, iArr2);
    }

    public static void n(int[] iArr, int i11, int[] iArr2) {
        int[] j11 = v60.f.j();
        v60.f.D(iArr, j11);
        while (true) {
            k(j11, iArr2);
            i11--;
            if (i11 <= 0) {
                return;
            }
            v60.f.D(iArr2, j11);
        }
    }

    public static void o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.f.F(iArr, iArr2, iArr3) != 0) {
            v60.n.R(6, 4553, iArr3);
        }
    }

    public static void p(int[] iArr, int[] iArr2) {
        if (v60.n.K(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && v60.f.r(iArr2, f47933a))) {
            v60.n.b(6, 4553, iArr2);
        }
    }
}