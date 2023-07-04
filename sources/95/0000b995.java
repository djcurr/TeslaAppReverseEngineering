package v60;

/* loaded from: classes5.dex */
public abstract class l {
    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        h.y(iArr, iArr2, iArr3);
        h.x(iArr, 8, iArr2, 8, iArr3, 16);
        int e11 = h.e(iArr3, 8, iArr3, 16);
        int c11 = e11 + h.c(iArr3, 24, iArr3, 16, h.c(iArr3, 0, iArr3, 8, 0) + e11);
        int[] i11 = h.i();
        int[] i12 = h.i();
        boolean z11 = h.m(iArr, 8, iArr, 0, i11, 0) != h.m(iArr2, 8, iArr2, 0, i12, 0);
        int[] k11 = h.k();
        h.y(i11, i12, k11);
        n.f(32, c11 + (z11 ? n.d(16, k11, 0, iArr3, 8) : n.S(16, k11, 0, iArr3, 8)), iArr3, 24);
    }

    public static void b(int[] iArr, int[] iArr2) {
        h.F(iArr, iArr2);
        h.E(iArr, 8, iArr2, 16);
        int e11 = h.e(iArr2, 8, iArr2, 16);
        int c11 = e11 + h.c(iArr2, 24, iArr2, 16, h.c(iArr2, 0, iArr2, 8, 0) + e11);
        int[] i11 = h.i();
        h.m(iArr, 8, iArr, 0, i11, 0);
        int[] k11 = h.k();
        h.F(i11, k11);
        n.f(32, c11 + n.S(16, k11, 0, iArr2, 8), iArr2, 24);
    }
}