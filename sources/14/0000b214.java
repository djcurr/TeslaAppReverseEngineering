package s50;

/* loaded from: classes5.dex */
public class c {
    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void b(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static boolean c(long[] jArr, long[] jArr2) {
        return ((jArr2[3] ^ jArr[3]) | ((((jArr[0] ^ jArr2[0]) | 0) | (jArr[1] ^ jArr2[1])) | (jArr[2] ^ jArr2[2]))) == 0;
    }

    public static void d(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        jArr2[0] = ((j14 >> 63) & 1061) ^ (j11 << 1);
        jArr2[1] = (j11 >>> 63) | (j12 << 1);
        jArr2[2] = (j13 << 1) | (j12 >>> 63);
        jArr2[3] = (j14 << 1) | (j13 >>> 63);
    }

    public static void e(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = j14 >>> 56;
        jArr2[0] = ((((j11 << 8) ^ j15) ^ (j15 << 2)) ^ (j15 << 5)) ^ (j15 << 10);
        jArr2[1] = (j11 >>> 56) | (j12 << 8);
        jArr2[2] = (j13 << 8) | (j12 >>> 56);
        jArr2[3] = (j14 << 8) | (j13 >>> 56);
    }
}