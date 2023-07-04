package org.spongycastle.math.raw;

/* loaded from: classes4.dex */
public abstract class Mont256 {
    private static final long M = 4294967295L;

    public static int inverse32(int i11) {
        int i12 = (2 - (i11 * i11)) * i11;
        int i13 = i12 * (2 - (i11 * i12));
        int i14 = i13 * (2 - (i11 * i13));
        return i14 * (2 - (i11 * i14));
    }

    public static void multAdd(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i11) {
        char c11 = 0;
        long j11 = iArr2[0] & M;
        int i12 = 0;
        int i13 = 0;
        while (i12 < 8) {
            long j12 = iArr3[c11] & M;
            long j13 = iArr[i12] & M;
            long j14 = j13 * j11;
            long j15 = (j14 & M) + j12;
            long j16 = j11;
            long j17 = (((int) j15) * i11) & M;
            int i14 = i12;
            int i15 = i13;
            long j18 = (iArr4[c11] & M) * j17;
            char c12 = ' ';
            long j19 = ((j15 + (j18 & M)) >>> 32) + (j14 >>> 32) + (j18 >>> 32);
            int i16 = 1;
            while (i16 < 8) {
                long j21 = (iArr2[i16] & M) * j13;
                long j22 = (iArr4[i16] & M) * j17;
                long j23 = j19 + (j21 & M) + (j22 & M) + (iArr3[i16] & M);
                iArr3[i16 - 1] = (int) j23;
                j19 = (j23 >>> 32) + (j21 >>> 32) + (j22 >>> 32);
                i16++;
                c12 = ' ';
                j17 = j17;
            }
            long j24 = j19 + (i15 & M);
            iArr3[7] = (int) j24;
            i13 = (int) (j24 >>> c12);
            i12 = i14 + 1;
            j11 = j16;
            c11 = 0;
        }
        if (i13 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void multAddXF(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        char c11 = 0;
        long j11 = iArr2[0] & M;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= 8) {
                break;
            }
            long j12 = iArr[i11] & M;
            long j13 = (j12 * j11) + (iArr3[c11] & M);
            long j14 = j13 & M;
            long j15 = (j13 >>> 32) + j14;
            int i13 = 1;
            for (int i14 = 8; i13 < i14; i14 = 8) {
                long j16 = j11;
                long j17 = (iArr2[i13] & M) * j12;
                long j18 = (iArr4[i13] & M) * j14;
                long j19 = j15 + (j17 & M) + (j18 & M) + (iArr3[i13] & M);
                iArr3[i13 - 1] = (int) j19;
                j15 = (j19 >>> 32) + (j17 >>> 32) + (j18 >>> 32);
                i13++;
                j11 = j16;
                j12 = j12;
                j14 = j14;
            }
            long j21 = j15 + (i12 & M);
            iArr3[7] = (int) j21;
            i12 = (int) (j21 >>> 32);
            i11++;
            j11 = j11;
            c11 = 0;
        }
        if (i12 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2, int i11) {
        char c11 = 0;
        int i12 = 0;
        while (i12 < 8) {
            int i13 = iArr[c11];
            long j11 = (i13 * i11) & M;
            long j12 = (((iArr2[c11] & M) * j11) + (i13 & M)) >>> 32;
            int i14 = 1;
            while (i14 < 8) {
                long j13 = j12 + ((iArr2[i14] & M) * j11) + (iArr[i14] & M);
                iArr[i14 - 1] = (int) j13;
                j12 = j13 >>> 32;
                i14++;
                i12 = i12;
            }
            iArr[7] = (int) j12;
            i12++;
            c11 = 0;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }

    public static void reduceXF(int[] iArr, int[] iArr2) {
        for (int i11 = 0; i11 < 8; i11++) {
            long j11 = iArr[0] & M;
            long j12 = j11;
            for (int i12 = 1; i12 < 8; i12++) {
                long j13 = j12 + ((iArr2[i12] & M) * j11) + (iArr[i12] & M);
                iArr[i12 - 1] = (int) j13;
                j12 = j13 >>> 32;
            }
            iArr[7] = (int) j12;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }
}