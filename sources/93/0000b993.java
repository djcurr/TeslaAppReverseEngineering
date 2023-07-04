package v60;

/* loaded from: classes5.dex */
public abstract class j {
    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        f.x(iArr, iArr2, iArr3);
        f.w(iArr, 6, iArr2, 6, iArr3, 12);
        int d11 = f.d(iArr3, 6, iArr3, 12);
        int c11 = d11 + f.c(iArr3, 18, iArr3, 12, f.c(iArr3, 0, iArr3, 6, 0) + d11);
        int[] h11 = f.h();
        int[] h12 = f.h();
        boolean z11 = f.l(iArr, 6, iArr, 0, h11, 0) != f.l(iArr2, 6, iArr2, 0, h12, 0);
        int[] j11 = f.j();
        f.x(h11, h12, j11);
        n.f(24, c11 + (z11 ? n.d(12, j11, 0, iArr3, 6) : n.S(12, j11, 0, iArr3, 6)), iArr3, 18);
    }

    public static void b(int[] iArr, int[] iArr2) {
        f.D(iArr, iArr2);
        f.C(iArr, 6, iArr2, 12);
        int d11 = f.d(iArr2, 6, iArr2, 12);
        int c11 = d11 + f.c(iArr2, 18, iArr2, 12, f.c(iArr2, 0, iArr2, 6, 0) + d11);
        int[] h11 = f.h();
        f.l(iArr, 6, iArr, 0, h11, 0);
        int[] j11 = f.j();
        f.D(h11, j11);
        n.f(24, c11 + n.S(12, j11, 0, iArr2, 6), iArr2, 18);
    }
}