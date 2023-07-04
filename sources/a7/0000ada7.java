package q70;

/* loaded from: classes5.dex */
public final class f {
    public static void a(int i11, byte[] bArr, int i12) {
        int i13 = i12 + 1;
        bArr[i12] = (byte) i11;
        int i14 = i13 + 1;
        bArr[i13] = (byte) (i11 >>> 8);
        bArr[i14] = (byte) (i11 >>> 16);
        bArr[i14 + 1] = (byte) (i11 >>> 24);
    }

    public static void b(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = i13 - 1; i14 >= 0; i14--) {
            bArr[i12 + i14] = (byte) (i11 >>> (i14 * 8));
        }
    }

    public static byte[] c(int i11) {
        return new byte[]{(byte) i11, (byte) (i11 >>> 8), (byte) (i11 >>> 16), (byte) (i11 >>> 24)};
    }

    public static int d(byte[] bArr) {
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    public static int e(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        int i14 = (bArr[i11] & 255) | ((bArr[i12] & 255) << 8);
        return ((bArr[i13 + 1] & 255) << 24) | i14 | ((bArr[i13] & 255) << 16);
    }

    public static int f(byte[] bArr, int i11, int i12) {
        int i13 = 0;
        for (int i14 = i12 - 1; i14 >= 0; i14--) {
            i13 |= (bArr[i11 + i14] & 255) << (i14 * 8);
        }
        return i13;
    }
}