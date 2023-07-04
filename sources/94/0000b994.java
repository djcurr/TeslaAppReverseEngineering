package v60;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class k {
    public static void a(long[] jArr, int i11, long[] jArr2, int i12) {
        jArr2[i12 + 0] = jArr[i11 + 0];
        jArr2[i12 + 1] = jArr[i11 + 1];
        jArr2[i12 + 2] = jArr[i11 + 2];
        jArr2[i12 + 3] = jArr[i11 + 3];
        jArr2[i12 + 4] = jArr[i11 + 4];
        jArr2[i12 + 5] = jArr[i11 + 5];
        jArr2[i12 + 6] = jArr[i11 + 6];
    }

    public static void b(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
    }

    public static long[] c() {
        return new long[7];
    }

    public static long[] d() {
        return new long[14];
    }

    public static boolean e(long[] jArr, long[] jArr2) {
        for (int i11 = 6; i11 >= 0; i11--) {
            if (jArr[i11] != jArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i11 = 1; i11 < 7; i11++) {
            if (jArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean g(long[] jArr) {
        for (int i11 = 0; i11 < 7; i11++) {
            if (jArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static BigInteger h(long[] jArr) {
        byte[] bArr = new byte[56];
        for (int i11 = 0; i11 < 7; i11++) {
            long j11 = jArr[i11];
            if (j11 != 0) {
                r70.i.s(j11, bArr, (6 - i11) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }
}