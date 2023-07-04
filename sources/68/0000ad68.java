package q60;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class o1 {
    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    private static void d(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
    }

    public static long[] e(BigInteger bigInteger) {
        return v60.n.s(193, bigInteger);
    }

    public static void f(long[] jArr, long[] jArr2) {
        long[] l11 = v60.h.l();
        v60.h.h(jArr, jArr2);
        for (int i11 = 1; i11 < 193; i11 += 2) {
            k(jArr2, l11);
            o(l11, jArr2);
            k(jArr2, l11);
            o(l11, jArr2);
            d(jArr, jArr2);
        }
    }

    protected static void g(long[] jArr) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = jArr[6];
        long j18 = jArr[7];
        jArr[0] = j11 ^ (j12 << 49);
        jArr[1] = (j12 >>> 15) ^ (j13 << 34);
        jArr[2] = (j13 >>> 30) ^ (j14 << 19);
        jArr[3] = ((j14 >>> 45) ^ (j15 << 4)) ^ (j16 << 53);
        jArr[4] = ((j15 >>> 60) ^ (j17 << 38)) ^ (j16 >>> 11);
        jArr[5] = (j17 >>> 26) ^ (j18 << 23);
        jArr[6] = j18 >>> 41;
        jArr[7] = 0;
    }

    protected static void h(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        jArr2[0] = j11 & 562949953421311L;
        jArr2[1] = ((j11 >>> 49) ^ (j12 << 15)) & 562949953421311L;
        jArr2[2] = ((j12 >>> 34) ^ (j13 << 30)) & 562949953421311L;
        jArr2[3] = (j13 >>> 19) ^ (j14 << 45);
    }

    protected static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        h(jArr, jArr4);
        h(jArr2, jArr5);
        long[] jArr6 = new long[8];
        j(jArr6, jArr4[0], jArr5[0], jArr3, 0);
        j(jArr6, jArr4[1], jArr5[1], jArr3, 1);
        j(jArr6, jArr4[2], jArr5[2], jArr3, 2);
        j(jArr6, jArr4[3], jArr5[3], jArr3, 3);
        for (int i11 = 5; i11 > 0; i11--) {
            jArr3[i11] = jArr3[i11] ^ jArr3[i11 - 1];
        }
        j(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        j(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i12 = 7; i12 > 1; i12--) {
            jArr3[i12] = jArr3[i12] ^ jArr3[i12 - 2];
        }
        long j11 = jArr4[0] ^ jArr4[2];
        long j12 = jArr4[1] ^ jArr4[3];
        long j13 = jArr5[0] ^ jArr5[2];
        long j14 = jArr5[1] ^ jArr5[3];
        j(jArr6, j11 ^ j12, j13 ^ j14, jArr3, 3);
        long[] jArr7 = new long[3];
        j(jArr6, j11, j13, jArr7, 0);
        j(jArr6, j12, j14, jArr7, 1);
        long j15 = jArr7[0];
        long j16 = jArr7[1];
        long j17 = jArr7[2];
        jArr3[2] = jArr3[2] ^ j15;
        jArr3[3] = (j15 ^ j16) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j17 ^ j16);
        jArr3[5] = jArr3[5] ^ j17;
        g(jArr3);
    }

    protected static void j(long[] jArr, long j11, long j12, long[] jArr2, int i11) {
        jArr[1] = j12;
        jArr[2] = jArr[1] << 1;
        jArr[3] = jArr[2] ^ j12;
        jArr[4] = jArr[2] << 1;
        jArr[5] = jArr[4] ^ j12;
        jArr[6] = jArr[3] << 1;
        jArr[7] = jArr[6] ^ j12;
        int i12 = (int) j11;
        long j13 = (jArr[(i12 >>> 3) & 7] << 3) ^ jArr[i12 & 7];
        long j14 = 0;
        int i13 = 36;
        do {
            int i14 = (int) (j11 >>> i13);
            long j15 = (((jArr[i14 & 7] ^ (jArr[(i14 >>> 3) & 7] << 3)) ^ (jArr[(i14 >>> 6) & 7] << 6)) ^ (jArr[(i14 >>> 9) & 7] << 9)) ^ (jArr[(i14 >>> 12) & 7] << 12);
            j13 ^= j15 << i13;
            j14 ^= j15 >>> (-i13);
            i13 -= 15;
        } while (i13 > 0);
        jArr2[i11] = jArr2[i11] ^ (562949953421311L & j13);
        int i15 = i11 + 1;
        jArr2[i15] = jArr2[i15] ^ ((j13 >>> 49) ^ (j14 << 15));
    }

    protected static void k(long[] jArr, long[] jArr2) {
        v60.b.c(jArr, 0, 3, jArr2, 0);
        jArr2[6] = jArr[3] & 1;
    }

    public static void l(long[] jArr, long[] jArr2) {
        if (v60.h.w(jArr)) {
            throw new IllegalStateException();
        }
        long[] j11 = v60.h.j();
        long[] j12 = v60.h.j();
        q(jArr, j11);
        s(j11, 1, j12);
        m(j11, j12, j11);
        s(j12, 1, j12);
        m(j11, j12, j11);
        s(j11, 3, j12);
        m(j11, j12, j11);
        s(j11, 6, j12);
        m(j11, j12, j11);
        s(j11, 12, j12);
        m(j11, j12, j11);
        s(j11, 24, j12);
        m(j11, j12, j11);
        s(j11, 48, j12);
        m(j11, j12, j11);
        s(j11, 96, j12);
        m(j11, j12, jArr2);
    }

    public static void m(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] l11 = v60.h.l();
        i(jArr, jArr2, l11);
        o(l11, jArr3);
    }

    public static void n(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] l11 = v60.h.l();
        i(jArr, jArr2, l11);
        b(jArr3, l11, jArr3);
    }

    public static void o(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = jArr[6];
        long j18 = j15 ^ (j17 >>> 50);
        long j19 = (j14 ^ ((j17 >>> 1) ^ (j17 << 14))) ^ (j16 >>> 50);
        long j21 = j11 ^ (j18 << 63);
        long j22 = (j12 ^ (j16 << 63)) ^ ((j18 >>> 1) ^ (j18 << 14));
        long j23 = ((j13 ^ (j17 << 63)) ^ ((j16 >>> 1) ^ (j16 << 14))) ^ (j18 >>> 50);
        long j24 = j19 >>> 1;
        jArr2[0] = (j21 ^ j24) ^ (j24 << 15);
        jArr2[1] = (j24 >>> 49) ^ j22;
        jArr2[2] = j23;
        jArr2[3] = 1 & j19;
    }

    public static void p(long[] jArr, long[] jArr2) {
        long g11 = v60.b.g(jArr[0]);
        long g12 = v60.b.g(jArr[1]);
        long j11 = (g11 & 4294967295L) | (g12 << 32);
        long j12 = (g11 >>> 32) | (g12 & (-4294967296L));
        long g13 = v60.b.g(jArr[2]);
        long j13 = (g13 & 4294967295L) ^ (jArr[3] << 32);
        long j14 = g13 >>> 32;
        jArr2[0] = j11 ^ (j12 << 8);
        jArr2[1] = ((j13 ^ (j14 << 8)) ^ (j12 >>> 56)) ^ (j12 << 33);
        jArr2[2] = (j12 >>> 31) ^ ((j14 >>> 56) ^ (j14 << 33));
        jArr2[3] = j14 >>> 31;
    }

    public static void q(long[] jArr, long[] jArr2) {
        long[] l11 = v60.h.l();
        k(jArr, l11);
        o(l11, jArr2);
    }

    public static void r(long[] jArr, long[] jArr2) {
        long[] l11 = v60.h.l();
        k(jArr, l11);
        b(jArr2, l11, jArr2);
    }

    public static void s(long[] jArr, int i11, long[] jArr2) {
        long[] l11 = v60.h.l();
        k(jArr, l11);
        while (true) {
            o(l11, jArr2);
            i11--;
            if (i11 <= 0) {
                return;
            }
            k(jArr2, l11);
        }
    }

    public static int t(long[] jArr) {
        return ((int) jArr[0]) & 1;
    }
}