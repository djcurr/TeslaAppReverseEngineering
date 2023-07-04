package nq;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public class d {
    public static byte[] a(BigInteger bigInteger) {
        int bitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i11 = 1;
        if (bigInteger.bitLength() % 8 == 0 || (bigInteger.bitLength() / 8) + 1 != bitLength / 8) {
            int length = byteArray.length;
            if (bigInteger.bitLength() % 8 == 0) {
                length--;
            } else {
                i11 = 0;
            }
            int i12 = bitLength / 8;
            int i13 = i12 - length;
            byte[] bArr = new byte[i12];
            System.arraycopy(byteArray, i11, bArr, i13, length);
            return bArr;
        }
        return byteArray;
    }
}