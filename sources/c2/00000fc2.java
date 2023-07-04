package c70;

import java.lang.reflect.Array;

/* loaded from: classes5.dex */
public class a {
    public static byte[] a(short[] sArr) {
        byte[] bArr = new byte[sArr.length];
        for (int i11 = 0; i11 < sArr.length; i11++) {
            bArr[i11] = (byte) sArr[i11];
        }
        return bArr;
    }

    public static short[] b(byte[] bArr) {
        short[] sArr = new short[bArr.length];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            sArr[i11] = (short) (bArr[i11] & 255);
        }
        return sArr;
    }

    public static byte[][] c(short[][] sArr) {
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, sArr.length, sArr[0].length);
        for (int i11 = 0; i11 < sArr.length; i11++) {
            for (int i12 = 0; i12 < sArr[0].length; i12++) {
                bArr[i11][i12] = (byte) sArr[i11][i12];
            }
        }
        return bArr;
    }

    public static short[][] d(byte[][] bArr) {
        short[][] sArr = (short[][]) Array.newInstance(short.class, bArr.length, bArr[0].length);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            for (int i12 = 0; i12 < bArr[0].length; i12++) {
                sArr[i11][i12] = (short) (bArr[i11][i12] & 255);
            }
        }
        return sArr;
    }

    public static byte[][][] e(short[][][] sArr) {
        byte[][][] bArr = (byte[][][]) Array.newInstance(byte.class, sArr.length, sArr[0].length, sArr[0][0].length);
        for (int i11 = 0; i11 < sArr.length; i11++) {
            for (int i12 = 0; i12 < sArr[0].length; i12++) {
                for (int i13 = 0; i13 < sArr[0][0].length; i13++) {
                    bArr[i11][i12][i13] = (byte) sArr[i11][i12][i13];
                }
            }
        }
        return bArr;
    }

    public static short[][][] f(byte[][][] bArr) {
        short[][][] sArr = (short[][][]) Array.newInstance(short.class, bArr.length, bArr[0].length, bArr[0][0].length);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            for (int i12 = 0; i12 < bArr[0].length; i12++) {
                for (int i13 = 0; i13 < bArr[0][0].length; i13++) {
                    sArr[i11][i12][i13] = (short) (bArr[i11][i12][i13] & 255);
                }
            }
        }
        return sArr;
    }

    public static int[] g(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        return iArr;
    }

    public static byte[] h(int[] iArr) {
        byte[] bArr = new byte[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            bArr[i11] = (byte) iArr[i11];
        }
        return bArr;
    }

    public static boolean i(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z11 = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z11 &= sArr[length] == sArr2[length];
        }
        return z11;
    }

    public static boolean j(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z11 = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z11 &= i(sArr[length], sArr2[length]);
        }
        return z11;
    }

    public static boolean k(short[][][] sArr, short[][][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z11 = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z11 &= j(sArr[length], sArr2[length]);
        }
        return z11;
    }
}