package s50;

/* loaded from: classes5.dex */
public class b {
    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    public static void b(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static boolean c(long[] jArr, long[] jArr2) {
        return ((jArr2[1] ^ jArr[1]) | ((jArr[0] ^ jArr2[0]) | 0)) == 0;
    }

    public static void d(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        jArr2[0] = ((j12 >> 63) & 135) ^ (j11 << 1);
        jArr2[1] = (j11 >>> 63) | (j12 << 1);
    }

    public static void e(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = j12 >>> 56;
        jArr2[0] = (j13 << 7) ^ ((((j11 << 8) ^ j13) ^ (j13 << 1)) ^ (j13 << 2));
        jArr2[1] = (j11 >>> 56) | (j12 << 8);
    }
}