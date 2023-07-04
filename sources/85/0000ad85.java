package q60;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class u0 {
    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
    }

    private static void d(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
    }

    public static long[] e(BigInteger bigInteger) {
        return v60.n.s(113, bigInteger);
    }

    public static void f(long[] jArr, long[] jArr2) {
        long[] i11 = v60.d.i();
        v60.d.e(jArr, jArr2);
        for (int i12 = 1; i12 < 113; i12 += 2) {
            i(jArr2, i11);
            m(i11, jArr2);
            i(jArr2, i11);
            m(i11, jArr2);
            d(jArr, jArr2);
        }
    }

    protected static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        long j11 = jArr[0];
        long j12 = ((jArr[1] << 7) ^ (j11 >>> 57)) & 144115188075855871L;
        long j13 = j11 & 144115188075855871L;
        long j14 = jArr2[0];
        long j15 = ((jArr2[1] << 7) ^ (j14 >>> 57)) & 144115188075855871L;
        long j16 = j14 & 144115188075855871L;
        long[] jArr4 = new long[6];
        h(jArr3, j13, j16, jArr4, 0);
        h(jArr3, j12, j15, jArr4, 2);
        h(jArr3, j13 ^ j12, j16 ^ j15, jArr4, 4);
        long j17 = jArr4[1] ^ jArr4[2];
        long j18 = jArr4[0];
        long j19 = jArr4[3];
        long j21 = (jArr4[4] ^ j18) ^ j17;
        long j22 = j17 ^ (jArr4[5] ^ j19);
        jArr3[0] = j18 ^ (j21 << 57);
        jArr3[1] = (j21 >>> 7) ^ (j22 << 50);
        jArr3[2] = (j22 >>> 14) ^ (j19 << 43);
        jArr3[3] = j19 >>> 21;
    }

    protected static void h(long[] jArr, long j11, long j12, long[] jArr2, int i11) {
        jArr[1] = j12;
        jArr[2] = jArr[1] << 1;
        jArr[3] = jArr[2] ^ j12;
        jArr[4] = jArr[2] << 1;
        jArr[5] = jArr[4] ^ j12;
        jArr[6] = jArr[3] << 1;
        jArr[7] = jArr[6] ^ j12;
        long j13 = jArr[((int) j11) & 7];
        long j14 = 0;
        int i12 = 48;
        do {
            int i13 = (int) (j11 >>> i12);
            long j15 = (jArr[i13 & 7] ^ (jArr[(i13 >>> 3) & 7] << 3)) ^ (jArr[(i13 >>> 6) & 7] << 6);
            j13 ^= j15 << i12;
            j14 ^= j15 >>> (-i12);
            i12 -= 9;
        } while (i12 > 0);
        jArr2[i11] = 144115188075855871L & j13;
        jArr2[i11 + 1] = (((((j11 & 72198606942111744L) & ((j12 << 7) >> 63)) >>> 8) ^ j14) << 7) ^ (j13 >>> 57);
    }

    protected static void i(long[] jArr, long[] jArr2) {
        v60.b.c(jArr, 0, 2, jArr2, 0);
    }

    public static void j(long[] jArr, long[] jArr2) {
        if (v60.d.r(jArr)) {
            throw new IllegalStateException();
        }
        long[] g11 = v60.d.g();
        long[] g12 = v60.d.g();
        o(jArr, g11);
        k(g11, jArr, g11);
        o(g11, g11);
        k(g11, jArr, g11);
        q(g11, 3, g12);
        k(g12, g11, g12);
        o(g12, g12);
        k(g12, jArr, g12);
        q(g12, 7, g11);
        k(g11, g12, g11);
        q(g11, 14, g12);
        k(g12, g11, g12);
        q(g12, 28, g11);
        k(g11, g12, g11);
        q(g11, 56, g12);
        k(g12, g11, g12);
        o(g12, jArr2);
    }

    public static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        g(jArr, jArr2, jArr4);
        m(jArr4, jArr3);
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        g(jArr, jArr2, jArr4);
        b(jArr3, jArr4, jArr3);
    }

    public static void m(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = j13 ^ ((j14 >>> 40) ^ (j14 >>> 49));
        long j16 = j11 ^ ((j15 << 15) ^ (j15 << 24));
        long j17 = (j12 ^ ((j14 << 15) ^ (j14 << 24))) ^ ((j15 >>> 40) ^ (j15 >>> 49));
        long j18 = j17 >>> 49;
        jArr2[0] = (j16 ^ j18) ^ (j18 << 9);
        jArr2[1] = 562949953421311L & j17;
    }

    public static void n(long[] jArr, long[] jArr2) {
        long g11 = v60.b.g(jArr[0]);
        long g12 = v60.b.g(jArr[1]);
        long j11 = (g11 >>> 32) | (g12 & (-4294967296L));
        jArr2[0] = ((j11 << 57) ^ ((4294967295L & g11) | (g12 << 32))) ^ (j11 << 5);
        jArr2[1] = (j11 >>> 59) ^ (j11 >>> 7);
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] i11 = v60.d.i();
        i(jArr, i11);
        m(i11, jArr2);
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] i11 = v60.d.i();
        i(jArr, i11);
        b(jArr2, i11, jArr2);
    }

    public static void q(long[] jArr, int i11, long[] jArr2) {
        long[] i12 = v60.d.i();
        i(jArr, i12);
        while (true) {
            m(i12, jArr2);
            i11--;
            if (i11 <= 0) {
                return;
            }
            i(jArr2, i12);
        }
    }

    public static int r(long[] jArr) {
        return ((int) jArr[0]) & 1;
    }
}