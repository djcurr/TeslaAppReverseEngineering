package r70;

/* loaded from: classes5.dex */
public abstract class i {
    public static void A(short s11, byte[] bArr, int i11) {
        bArr[i11] = (byte) (s11 >>> 8);
        bArr[i11 + 1] = (byte) s11;
    }

    public static void B(short s11, byte[] bArr, int i11) {
        bArr[i11] = (byte) s11;
        bArr[i11 + 1] = (byte) (s11 >>> 8);
    }

    public static int a(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        return (bArr[i13 + 1] & 255) | (bArr[i11] << 24) | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 8);
    }

    public static void b(byte[] bArr, int i11, int[] iArr, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            iArr[i12 + i14] = a(bArr, i11);
            i11 += 4;
        }
    }

    public static long c(byte[] bArr, int i11) {
        int a11 = a(bArr, i11);
        return (a(bArr, i11 + 4) & 4294967295L) | ((a11 & 4294967295L) << 32);
    }

    public static void d(byte[] bArr, int i11, long[] jArr, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            jArr[i12 + i14] = c(bArr, i11);
            i11 += 8;
        }
    }

    public static short e(byte[] bArr, int i11) {
        return (short) ((bArr[i11 + 1] & 255) | ((bArr[i11] & 255) << 8));
    }

    public static void f(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) (i11 >>> 24);
        int i13 = i12 + 1;
        bArr[i13] = (byte) (i11 >>> 16);
        int i14 = i13 + 1;
        bArr[i14] = (byte) (i11 >>> 8);
        bArr[i14 + 1] = (byte) i11;
    }

    public static void g(int[] iArr, byte[] bArr, int i11) {
        for (int i12 : iArr) {
            f(i12, bArr, i11);
            i11 += 4;
        }
    }

    public static byte[] h(int i11) {
        byte[] bArr = new byte[4];
        f(i11, bArr, 0);
        return bArr;
    }

    public static void i(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        int i13 = i12 + 1;
        bArr[i13] = (byte) (i11 >>> 8);
        int i14 = i13 + 1;
        bArr[i14] = (byte) (i11 >>> 16);
        bArr[i14 + 1] = (byte) (i11 >>> 24);
    }

    public static void j(int[] iArr, byte[] bArr, int i11) {
        for (int i12 : iArr) {
            i(i12, bArr, i11);
            i11 += 4;
        }
    }

    public static byte[] k(int i11) {
        byte[] bArr = new byte[4];
        i(i11, bArr, 0);
        return bArr;
    }

    public static int l(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        return (bArr[i13 + 1] << 24) | (bArr[i11] & 255) | ((bArr[i12] & 255) << 8) | ((bArr[i13] & 255) << 16);
    }

    public static void m(byte[] bArr, int i11, int[] iArr) {
        for (int i12 = 0; i12 < iArr.length; i12++) {
            iArr[i12] = l(bArr, i11);
            i11 += 4;
        }
    }

    public static void n(byte[] bArr, int i11, int[] iArr, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            iArr[i12 + i14] = l(bArr, i11);
            i11 += 4;
        }
    }

    public static int[] o(byte[] bArr, int i11, int i12) {
        int[] iArr = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            iArr[i13] = l(bArr, i11);
            i11 += 4;
        }
        return iArr;
    }

    public static long p(byte[] bArr, int i11) {
        return ((l(bArr, i11 + 4) & 4294967295L) << 32) | (l(bArr, i11) & 4294967295L);
    }

    public static void q(byte[] bArr, int i11, long[] jArr) {
        for (int i12 = 0; i12 < jArr.length; i12++) {
            jArr[i12] = p(bArr, i11);
            i11 += 8;
        }
    }

    public static short r(byte[] bArr, int i11) {
        return (short) (((bArr[i11 + 1] & 255) << 8) | (bArr[i11] & 255));
    }

    public static void s(long j11, byte[] bArr, int i11) {
        f((int) (j11 >>> 32), bArr, i11);
        f((int) (j11 & 4294967295L), bArr, i11 + 4);
    }

    public static void t(long[] jArr, int i11, int i12, byte[] bArr, int i13) {
        for (int i14 = 0; i14 < i12; i14++) {
            s(jArr[i11 + i14], bArr, i13);
            i13 += 8;
        }
    }

    public static byte[] u(long j11) {
        byte[] bArr = new byte[8];
        s(j11, bArr, 0);
        return bArr;
    }

    public static void v(long j11, byte[] bArr, int i11) {
        i((int) (4294967295L & j11), bArr, i11);
        i((int) (j11 >>> 32), bArr, i11 + 4);
    }

    public static void w(long[] jArr, int i11, int i12, byte[] bArr, int i13) {
        for (int i14 = 0; i14 < i12; i14++) {
            v(jArr[i11 + i14], bArr, i13);
            i13 += 8;
        }
    }

    public static void x(long[] jArr, byte[] bArr, int i11) {
        for (long j11 : jArr) {
            v(j11, bArr, i11);
            i11 += 8;
        }
    }

    public static byte[] y(long j11) {
        byte[] bArr = new byte[8];
        v(j11, bArr, 0);
        return bArr;
    }

    public static byte[] z(long[] jArr) {
        byte[] bArr = new byte[jArr.length * 8];
        x(jArr, bArr, 0);
        return bArr;
    }
}