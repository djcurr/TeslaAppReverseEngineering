package s60;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public abstract class c {

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final a f50302a = new a();

        private a() {
        }
    }

    public static boolean a(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13) {
        g(bArr, i11, bArr2, i12, bArr3, i13);
        return !org.bouncycastle.util.a.a(bArr3, i13, 56);
    }

    private static int b(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        return (bArr[i13 + 1] << 24) | (bArr[i11] & 255) | ((bArr[i12] & 255) << 8) | ((bArr[i13] & 255) << 16);
    }

    private static void c(byte[] bArr, int i11, int[] iArr) {
        for (int i12 = 0; i12 < 14; i12++) {
            iArr[i12] = b(bArr, (i12 * 4) + i11);
        }
        iArr[0] = iArr[0] & (-4);
        iArr[13] = iArr[13] | Integer.MIN_VALUE;
    }

    public static void d(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 252);
        bArr[55] = (byte) (bArr[55] | 128);
    }

    public static void e(byte[] bArr, int i11, byte[] bArr2, int i12) {
        h(bArr, i11, bArr2, i12);
    }

    private static void f(int[] iArr, int[] iArr2) {
        int[] g11 = d.g();
        int[] g12 = d.g();
        d.a(iArr, iArr2, g11);
        d.J(iArr, iArr2, g12);
        d.H(g11, g11);
        d.H(g12, g12);
        d.A(g11, g12, iArr);
        d.J(g11, g12, g11);
        d.z(g11, 39082, iArr2);
        d.a(iArr2, g12, iArr2);
        d.A(iArr2, g11, iArr2);
    }

    public static void g(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13) {
        int[] iArr = new int[14];
        c(bArr, i11, iArr);
        int[] g11 = d.g();
        d.j(bArr2, i12, g11);
        int[] g12 = d.g();
        d.f(g11, 0, g12, 0);
        int[] g13 = d.g();
        g13[0] = 1;
        int[] g14 = d.g();
        g14[0] = 1;
        int[] g15 = d.g();
        int[] g16 = d.g();
        int[] g17 = d.g();
        int i14 = 447;
        int i15 = 1;
        while (true) {
            d.a(g14, g15, g16);
            d.J(g14, g15, g14);
            d.a(g12, g13, g15);
            d.J(g12, g13, g12);
            d.A(g16, g12, g16);
            d.A(g14, g15, g14);
            d.H(g15, g15);
            d.H(g12, g12);
            d.J(g15, g12, g17);
            d.z(g17, 39082, g13);
            d.a(g13, g12, g13);
            d.A(g13, g17, g13);
            d.A(g12, g15, g12);
            d.J(g16, g14, g15);
            d.a(g16, g14, g14);
            d.H(g14, g14);
            d.H(g15, g15);
            d.A(g15, g11, g15);
            i14--;
            int i16 = (iArr[i14 >>> 5] >>> (i14 & 31)) & 1;
            int i17 = i15 ^ i16;
            d.i(i17, g12, g14);
            d.i(i17, g13, g15);
            if (i14 < 2) {
                break;
            }
            i15 = i16;
        }
        for (int i18 = 0; i18 < 2; i18++) {
            f(g12, g13);
        }
        d.v(g13, g13);
        d.A(g12, g13, g12);
        d.C(g12);
        d.p(g12, bArr3, i13);
    }

    public static void h(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int[] g11 = d.g();
        int[] g12 = d.g();
        t60.b.N(a.f50302a, bArr, i11, g11, g12);
        d.v(g11, g11);
        d.A(g11, g12, g11);
        d.H(g11, g11);
        d.C(g11);
        d.p(g11, bArr2, i12);
    }
}