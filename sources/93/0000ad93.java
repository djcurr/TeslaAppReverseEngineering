package q60;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    static final int[] f48001a = {-6803, -2, -1, -1, -1, -1, -1};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f48002b = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f48003c = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.g.a(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && v60.g.j(iArr3, f48001a))) {
            v60.n.b(7, 6803, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (v60.n.w(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && v60.g.j(iArr2, f48001a))) {
            v60.n.b(7, 6803, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] h11 = v60.g.h(bigInteger);
        if (h11[6] == -1 && v60.g.j(h11, f48001a)) {
            v60.n.b(7, 6803, h11);
        }
        return h11;
    }

    public static void d(int[] iArr, int[] iArr2) {
        v60.c.b(f48001a, iArr, iArr2);
    }

    public static int e(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 7; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] f11 = v60.g.f();
        v60.g.m(iArr, iArr2, f11);
        k(f11, iArr3);
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.g.q(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && v60.n.u(14, iArr3, f48002b))) {
            int[] iArr4 = f48003c;
            if (v60.n.e(iArr4.length, iArr4, iArr3) != 0) {
                v60.n.x(14, iArr3, iArr4.length);
            }
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        if (e(iArr) == 0) {
            v60.g.s(f48001a, iArr, iArr2);
            return;
        }
        int[] iArr3 = f48001a;
        v60.g.s(iArr3, iArr3, iArr2);
    }

    public static void i(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[28];
        do {
            secureRandom.nextBytes(bArr);
            r70.i.n(bArr, 0, iArr, 0, 7);
        } while (v60.n.B(7, iArr, f48001a) == 0);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        do {
            i(secureRandom, iArr);
        } while (e(iArr) != 0);
    }

    public static void k(int[] iArr, int[] iArr2) {
        if (v60.g.o(6803, v60.g.n(6803, iArr, 7, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[6] == -1 && v60.g.j(iArr2, f48001a))) {
            v60.n.b(7, 6803, iArr2);
        }
    }

    public static void l(int i11, int[] iArr) {
        if ((i11 == 0 || v60.g.p(6803, i11, iArr, 0) == 0) && !(iArr[6] == -1 && v60.g.j(iArr, f48001a))) {
            return;
        }
        v60.n.b(7, 6803, iArr);
    }

    public static void m(int[] iArr, int[] iArr2) {
        int[] f11 = v60.g.f();
        v60.g.r(iArr, f11);
        k(f11, iArr2);
    }

    public static void n(int[] iArr, int i11, int[] iArr2) {
        int[] f11 = v60.g.f();
        v60.g.r(iArr, f11);
        while (true) {
            k(f11, iArr2);
            i11--;
            if (i11 <= 0) {
                return;
            }
            v60.g.r(iArr2, f11);
        }
    }

    public static void o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v60.g.s(iArr, iArr2, iArr3) != 0) {
            v60.n.R(7, 6803, iArr3);
        }
    }

    public static void p(int[] iArr, int[] iArr2) {
        if (v60.n.K(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && v60.g.j(iArr2, f48001a))) {
            v60.n.b(7, 6803, iArr2);
        }
    }
}