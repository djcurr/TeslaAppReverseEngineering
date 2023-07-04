package org.spongycastle.pqc.math.ntru.util;

import java.io.InputStream;
import java.math.BigInteger;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class ArrayEncoder {
    private static final int[] COEFF1_TABLE = {0, 0, 0, 1, 1, 1, -1, -1};
    private static final int[] COEFF2_TABLE = {0, 1, -1, 0, 1, -1, 0, 1};
    private static final int[] BIT1_TABLE = {1, 1, 1, 0, 0, 0, 1, 0, 1};
    private static final int[] BIT2_TABLE = {1, 1, 1, 1, 0, 0, 0, 1, 0};
    private static final int[] BIT3_TABLE = {1, 0, 1, 0, 0, 1, 1, 1, 0};

    public static int[] decodeMod3Sves(byte[] bArr, int i11) {
        int[] iArr = new int[i11];
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length * 8) {
            int i14 = i12 + 1;
            int i15 = i14 + 1;
            int i16 = i15 + 1;
            int bit = (getBit(bArr, i12) * 4) + (getBit(bArr, i14) * 2) + getBit(bArr, i15);
            int i17 = i13 + 1;
            iArr[i13] = COEFF1_TABLE[bit];
            i13 = i17 + 1;
            iArr[i17] = COEFF2_TABLE[bit];
            if (i13 > i11 - 2) {
                break;
            }
            i12 = i16;
        }
        return iArr;
    }

    public static int[] decodeMod3Tight(byte[] bArr, int i11) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i12] = bigInteger.mod(BigInteger.valueOf(3L)).intValue() - 1;
            if (iArr[i12] > 1) {
                iArr[i12] = iArr[i12] - 3;
            }
            bigInteger = bigInteger.divide(BigInteger.valueOf(3L));
        }
        return iArr;
    }

    public static int[] decodeModQ(byte[] bArr, int i11, int i12) {
        int[] iArr = new int[i11];
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i12);
        int i13 = i11 * numberOfLeadingZeros;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            if (i15 > 0 && i15 % numberOfLeadingZeros == 0) {
                i14++;
            }
            iArr[i14] = iArr[i14] + (getBit(bArr, i15) << (i15 % numberOfLeadingZeros));
        }
        return iArr;
    }

    public static byte[] encodeMod3Sves(int[] iArr) {
        byte[] bArr = new byte[((((iArr.length * 3) + 1) / 2) + 7) / 8];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < (iArr.length / 2) * 2) {
            int i14 = i11 + 1;
            int i15 = iArr[i11] + 1;
            int i16 = i14 + 1;
            int i17 = iArr[i14] + 1;
            if (i15 == 0 && i17 == 0) {
                throw new IllegalStateException("Illegal encoding!");
            }
            int i18 = (i15 * 3) + i17;
            int[] iArr2 = {BIT1_TABLE[i18], BIT2_TABLE[i18], BIT3_TABLE[i18]};
            for (int i19 = 0; i19 < 3; i19++) {
                bArr[i13] = (byte) (bArr[i13] | (iArr2[i19] << i12));
                if (i12 == 7) {
                    i13++;
                    i12 = 0;
                } else {
                    i12++;
                }
            }
            i11 = i16;
        }
        return bArr;
    }

    public static byte[] encodeMod3Tight(int[] iArr) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int length = iArr.length - 1; length >= 0; length--) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(3L)).add(BigInteger.valueOf(iArr[length] + 1));
        }
        int bitLength = (BigInteger.valueOf(3L).pow(iArr.length).bitLength() + 7) / 8;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length >= bitLength) {
            return byteArray.length > bitLength ? Arrays.copyOfRange(byteArray, 1, byteArray.length) : byteArray;
        }
        byte[] bArr = new byte[bitLength];
        System.arraycopy(byteArray, 0, bArr, bitLength - byteArray.length, byteArray.length);
        return bArr;
    }

    public static byte[] encodeModQ(int[] iArr, int i11) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i11);
        byte[] bArr = new byte[((iArr.length * numberOfLeadingZeros) + 7) / 8];
        int i12 = 0;
        int i13 = 0;
        for (int i14 : iArr) {
            for (int i15 = 0; i15 < numberOfLeadingZeros; i15++) {
                bArr[i13] = (byte) ((((i14 >> i15) & 1) << i12) | bArr[i13]);
                if (i12 == 7) {
                    i13++;
                    i12 = 0;
                } else {
                    i12++;
                }
            }
        }
        return bArr;
    }

    private static int getBit(byte[] bArr, int i11) {
        return ((bArr[i11 / 8] & 255) >> (i11 % 8)) & 1;
    }

    public static int[] decodeModQ(InputStream inputStream, int i11, int i12) {
        return decodeModQ(Util.readFullLength(inputStream, (((31 - Integer.numberOfLeadingZeros(i12)) * i11) + 7) / 8), i11, i12);
    }

    public static int[] decodeMod3Tight(InputStream inputStream, int i11) {
        return decodeMod3Tight(Util.readFullLength(inputStream, (int) Math.ceil(((i11 * Math.log(3.0d)) / Math.log(2.0d)) / 8.0d)), i11);
    }
}