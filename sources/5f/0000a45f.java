package org.spongycastle.pqc.math.linearalgebra;

/* loaded from: classes4.dex */
public final class BigEndianConversions {
    private BigEndianConversions() {
    }

    public static byte[] I2OSP(int i11) {
        return new byte[]{(byte) (i11 >>> 24), (byte) (i11 >>> 16), (byte) (i11 >>> 8), (byte) i11};
    }

    public static byte[] I2OSP(int i11, int i12) {
        if (i11 < 0) {
            return null;
        }
        int ceilLog256 = IntegerFunctions.ceilLog256(i11);
        if (ceilLog256 <= i12) {
            byte[] bArr = new byte[i12];
            int i13 = i12 - 1;
            for (int i14 = i13; i14 >= i12 - ceilLog256; i14--) {
                bArr[i14] = (byte) (i11 >>> ((i13 - i14) * 8));
            }
            return bArr;
        }
        throw new ArithmeticException("Cannot encode given integer into specified number of octets.");
    }

    public static byte[] I2OSP(long j11) {
        return new byte[]{(byte) (j11 >>> 56), (byte) (j11 >>> 48), (byte) (j11 >>> 40), (byte) (j11 >>> 32), (byte) (j11 >>> 24), (byte) (j11 >>> 16), (byte) (j11 >>> 8), (byte) j11};
    }

    public static int OS2IP(byte[] bArr) {
        if (bArr.length <= 4) {
            if (bArr.length == 0) {
                return 0;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < bArr.length; i12++) {
                i11 |= (bArr[i12] & 255) << (((bArr.length - 1) - i12) * 8);
            }
            return i11;
        }
        throw new ArithmeticException("invalid input length");
    }

    public static long OS2LIP(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        int i14 = i13 + 1;
        int i15 = i14 + 1;
        int i16 = i15 + 1;
        int i17 = i16 + 1;
        long j11 = ((bArr[i11] & 255) << 56) | ((bArr[i12] & 255) << 48) | ((bArr[i13] & 255) << 40) | ((bArr[i14] & 255) << 32) | ((255 & bArr[i15]) << 24) | ((bArr[i16] & 255) << 16);
        return (bArr[i17 + 1] & 255) | j11 | ((bArr[i17] & 255) << 8);
    }

    public static byte[] toByteArray(int[] iArr) {
        byte[] bArr = new byte[iArr.length << 2];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            I2OSP(iArr[i11], bArr, i11 << 2);
        }
        return bArr;
    }

    public static int[] toIntArray(byte[] bArr) {
        int length = (bArr.length + 3) / 4;
        int length2 = bArr.length & 3;
        int[] iArr = new int[length];
        int i11 = 0;
        int i12 = 0;
        while (i11 <= length - 2) {
            iArr[i11] = OS2IP(bArr, i12);
            i11++;
            i12 += 4;
        }
        if (length2 != 0) {
            iArr[length - 1] = OS2IP(bArr, i12, length2);
        } else {
            iArr[length - 1] = OS2IP(bArr, i12);
        }
        return iArr;
    }

    public static byte[] toByteArray(int[] iArr, int i11) {
        int length = iArr.length;
        byte[] bArr = new byte[i11];
        int i12 = 0;
        int i13 = 0;
        while (i12 <= length - 2) {
            I2OSP(iArr[i12], bArr, i13);
            i12++;
            i13 += 4;
        }
        I2OSP(iArr[length - 1], bArr, i13, i11 - i13);
        return bArr;
    }

    public static void I2OSP(int i11, byte[] bArr, int i12) {
        int i13 = i12 + 1;
        bArr[i12] = (byte) (i11 >>> 24);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (i11 >>> 16);
        bArr[i14] = (byte) (i11 >>> 8);
        bArr[i14 + 1] = (byte) i11;
    }

    public static int OS2IP(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i11] & 255) << 24) | ((bArr[i12] & 255) << 16);
        return (bArr[i13 + 1] & 255) | i14 | ((bArr[i13] & 255) << 8);
    }

    public static void I2OSP(long j11, byte[] bArr, int i11) {
        int i12 = i11 + 1;
        bArr[i11] = (byte) (j11 >>> 56);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (j11 >>> 48);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (j11 >>> 40);
        int i15 = i14 + 1;
        bArr[i14] = (byte) (j11 >>> 32);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (j11 >>> 24);
        int i17 = i16 + 1;
        bArr[i16] = (byte) (j11 >>> 16);
        bArr[i17] = (byte) (j11 >>> 8);
        bArr[i17 + 1] = (byte) j11;
    }

    public static int OS2IP(byte[] bArr, int i11, int i12) {
        if (bArr.length == 0 || bArr.length < (i11 + i12) - 1) {
            return 0;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            i13 |= (bArr[i11 + i14] & 255) << (((i12 - i14) - 1) * 8);
        }
        return i13;
    }

    public static void I2OSP(int i11, byte[] bArr, int i12, int i13) {
        int i14 = i13 - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            bArr[i12 + i15] = (byte) (i11 >>> ((i14 - i15) * 8));
        }
    }
}