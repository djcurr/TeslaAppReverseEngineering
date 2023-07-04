package s60;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: s60.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1116a {

        /* renamed from: a  reason: collision with root package name */
        private static final C1116a f50299a = new C1116a();

        private C1116a() {
        }
    }

    public static boolean a(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13) {
        g(bArr, i11, bArr2, i12, bArr3, i13);
        return !org.bouncycastle.util.a.a(bArr3, i13, 32);
    }

    private static int b(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        return (bArr[i13 + 1] << 24) | (bArr[i11] & 255) | ((bArr[i12] & 255) << 8) | ((bArr[i13] & 255) << 16);
    }

    private static void c(byte[] bArr, int i11, int[] iArr) {
        for (int i12 = 0; i12 < 8; i12++) {
            iArr[i12] = b(bArr, (i12 * 4) + i11);
        }
        iArr[0] = iArr[0] & (-8);
        iArr[7] = iArr[7] & Integer.MAX_VALUE;
        iArr[7] = iArr[7] | 1073741824;
    }

    public static void d(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 248);
        bArr[31] = (byte) (bArr[31] & Byte.MAX_VALUE);
        bArr[31] = (byte) (bArr[31] | 64);
    }

    public static void e(byte[] bArr, int i11, byte[] bArr2, int i12) {
        h(bArr, i11, bArr2, i12);
    }

    private static void f(int[] iArr, int[] iArr2) {
        int[] h11 = b.h();
        int[] h12 = b.h();
        b.c(iArr, iArr2, h11, h12);
        b.G(h11, h11);
        b.G(h12, h12);
        b.z(h11, h12, iArr);
        b.I(h11, h12, h11);
        b.y(h11, 121666, iArr2);
        b.a(iArr2, h12, iArr2);
        b.z(iArr2, h11, iArr2);
    }

    public static void g(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13) {
        int[] iArr = new int[8];
        c(bArr, i11, iArr);
        int[] h11 = b.h();
        b.k(bArr2, i12, h11);
        int[] h12 = b.h();
        b.g(h11, 0, h12, 0);
        int[] h13 = b.h();
        h13[0] = 1;
        int[] h14 = b.h();
        h14[0] = 1;
        int[] h15 = b.h();
        int[] h16 = b.h();
        int[] h17 = b.h();
        int i14 = 254;
        int i15 = 1;
        while (true) {
            b.c(h14, h15, h16, h14);
            b.c(h12, h13, h15, h12);
            b.z(h16, h12, h16);
            b.z(h14, h15, h14);
            b.G(h15, h15);
            b.G(h12, h12);
            b.I(h15, h12, h17);
            b.y(h17, 121666, h13);
            b.a(h13, h12, h13);
            b.z(h13, h17, h13);
            b.z(h12, h15, h12);
            b.c(h16, h14, h14, h15);
            b.G(h14, h14);
            b.G(h15, h15);
            b.z(h15, h11, h15);
            i14--;
            int i16 = (iArr[i14 >>> 5] >>> (i14 & 31)) & 1;
            int i17 = i15 ^ i16;
            b.j(i17, h12, h14);
            b.j(i17, h13, h15);
            if (i14 < 3) {
                break;
            }
            i15 = i16;
        }
        for (int i18 = 0; i18 < 3; i18++) {
            f(h12, h13);
        }
        b.u(h13, h13);
        b.z(h12, h13, h12);
        b.B(h12);
        b.p(h12, bArr3, i13);
    }

    public static void h(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int[] h11 = b.h();
        int[] h12 = b.h();
        t60.a.R(C1116a.f50299a, bArr, i11, h11, h12);
        b.c(h12, h11, h11, h12);
        b.u(h12, h12);
        b.z(h11, h12, h11);
        b.B(h11);
        b.p(h11, bArr2, i12);
    }
}