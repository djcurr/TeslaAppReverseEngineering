package s50;

/* loaded from: classes5.dex */
public class d {
    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void b(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
        jArr2[7] = jArr[7];
    }

    public static boolean c(long[] jArr, long[] jArr2) {
        return ((jArr2[7] ^ jArr[7]) | ((((((((jArr[0] ^ jArr2[0]) | 0) | (jArr[1] ^ jArr2[1])) | (jArr[2] ^ jArr2[2])) | (jArr[3] ^ jArr2[3])) | (jArr[4] ^ jArr2[4])) | (jArr[5] ^ jArr2[5])) | (jArr[6] ^ jArr2[6]))) == 0;
    }

    public static void d(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = jArr[6];
        long j18 = jArr[7];
        jArr2[0] = (j11 << 1) ^ ((j18 >> 63) & 293);
        jArr2[1] = (j12 << 1) | (j11 >>> 63);
        jArr2[2] = (j13 << 1) | (j12 >>> 63);
        jArr2[3] = (j14 << 1) | (j13 >>> 63);
        jArr2[4] = (j15 << 1) | (j14 >>> 63);
        jArr2[5] = (j16 << 1) | (j15 >>> 63);
        jArr2[6] = (j17 << 1) | (j16 >>> 63);
        jArr2[7] = (j18 << 1) | (j17 >>> 63);
    }

    public static void e(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = jArr[6];
        long j18 = jArr[7];
        long j19 = j18 >>> 56;
        jArr2[0] = ((((j11 << 8) ^ j19) ^ (j19 << 2)) ^ (j19 << 5)) ^ (j19 << 8);
        jArr2[1] = (j12 << 8) | (j11 >>> 56);
        jArr2[2] = (j13 << 8) | (j12 >>> 56);
        jArr2[3] = (j14 << 8) | (j13 >>> 56);
        jArr2[4] = (j15 << 8) | (j14 >>> 56);
        jArr2[5] = (j16 << 8) | (j15 >>> 56);
        jArr2[6] = (j17 << 8) | (j16 >>> 56);
        jArr2[7] = (j18 << 8) | (j17 >>> 56);
    }
}