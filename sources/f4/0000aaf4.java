package pl;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
class q {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            int i11 = 0;
            long c11 = c(bArr, 0, 0) & 67108863;
            int i12 = 3;
            long c12 = c(bArr, 3, 2) & 67108611;
            long c13 = c(bArr, 6, 4) & 67092735;
            long c14 = c(bArr, 9, 6) & 66076671;
            long c15 = c(bArr, 12, 8) & 1048575;
            long j11 = c12 * 5;
            long j12 = c13 * 5;
            long j13 = c14 * 5;
            long j14 = c15 * 5;
            byte[] bArr3 = new byte[17];
            long j15 = 0;
            int i13 = 0;
            long j16 = 0;
            long j17 = 0;
            long j18 = 0;
            long j19 = 0;
            while (i13 < bArr2.length) {
                b(bArr3, bArr2, i13);
                long c16 = j19 + c(bArr3, i11, i11);
                long c17 = j15 + c(bArr3, i12, 2);
                long c18 = j16 + c(bArr3, 6, 4);
                long c19 = j17 + c(bArr3, 9, 6);
                long c21 = j18 + (c(bArr3, 12, 8) | (bArr3[16] << 24));
                long j21 = (c16 * c11) + (c17 * j14) + (c18 * j13) + (c19 * j12) + (c21 * j11);
                long j22 = (c16 * c12) + (c17 * c11) + (c18 * j14) + (c19 * j13) + (c21 * j12) + (j21 >> 26);
                long j23 = (c16 * c13) + (c17 * c12) + (c18 * c11) + (c19 * j14) + (c21 * j13) + (j22 >> 26);
                long j24 = (c16 * c14) + (c17 * c13) + (c18 * c12) + (c19 * c11) + (c21 * j14) + (j23 >> 26);
                long j25 = (c16 * c15) + (c17 * c14) + (c18 * c13) + (c19 * c12) + (c21 * c11) + (j24 >> 26);
                long j26 = (j21 & 67108863) + ((j25 >> 26) * 5);
                j15 = (j22 & 67108863) + (j26 >> 26);
                i13 += 16;
                j16 = j23 & 67108863;
                j17 = j24 & 67108863;
                j18 = j25 & 67108863;
                i12 = 3;
                j19 = j26 & 67108863;
                i11 = 0;
            }
            long j27 = j16 + (j15 >> 26);
            long j28 = j27 & 67108863;
            long j29 = j17 + (j27 >> 26);
            long j31 = j29 & 67108863;
            long j32 = j18 + (j29 >> 26);
            long j33 = j32 & 67108863;
            long j34 = j19 + ((j32 >> 26) * 5);
            long j35 = j34 & 67108863;
            long j36 = (j15 & 67108863) + (j34 >> 26);
            long j37 = j35 + 5;
            long j38 = j37 & 67108863;
            long j39 = (j37 >> 26) + j36;
            long j41 = j28 + (j39 >> 26);
            long j42 = j31 + (j41 >> 26);
            long j43 = (j33 + (j42 >> 26)) - 67108864;
            long j44 = j43 >> 63;
            long j45 = j35 & j44;
            long j46 = j36 & j44;
            long j47 = j28 & j44;
            long j48 = j31 & j44;
            long j49 = j33 & j44;
            long j51 = ~j44;
            long j52 = (j39 & 67108863 & j51) | j46;
            long j53 = (j41 & 67108863 & j51) | j47;
            long j54 = (j42 & 67108863 & j51) | j48;
            long d11 = ((j45 | (j38 & j51) | (j52 << 26)) & 4294967295L) + d(bArr, 16);
            long j55 = d11 & 4294967295L;
            long d12 = (((j52 >> 6) | (j53 << 20)) & 4294967295L) + d(bArr, 20) + (d11 >> 32);
            long d13 = (((j53 >> 12) | (j54 << 14)) & 4294967295L) + d(bArr, 24) + (d12 >> 32);
            byte[] bArr4 = new byte[16];
            e(bArr4, j55, 0);
            e(bArr4, d12 & 4294967295L, 4);
            e(bArr4, d13 & 4294967295L, 8);
            e(bArr4, ((((j54 >> 18) | (((j43 & j51) | j49) << 8)) & 4294967295L) + d(bArr, 28) + (d13 >> 32)) & 4294967295L, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }

    private static void b(byte[] bArr, byte[] bArr2, int i11) {
        int min = Math.min(16, bArr2.length - i11);
        System.arraycopy(bArr2, i11, bArr, 0, min);
        bArr[min] = 1;
        if (min != 16) {
            Arrays.fill(bArr, min + 1, bArr.length, (byte) 0);
        }
    }

    private static long c(byte[] bArr, int i11, int i12) {
        return (d(bArr, i11) >> i12) & 67108863;
    }

    private static long d(byte[] bArr, int i11) {
        return (((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16)) & 4294967295L;
    }

    private static void e(byte[] bArr, long j11, int i11) {
        int i12 = 0;
        while (i12 < 4) {
            bArr[i11 + i12] = (byte) (255 & j11);
            i12++;
            j11 >>= 8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!g.b(a(bArr, bArr2), bArr3)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}