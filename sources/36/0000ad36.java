package q60;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class e2 {

    /* renamed from: a  reason: collision with root package name */
    private static final long[] f47839a = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr2[8] ^ jArr[8];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
    }

    private static void d(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
        jArr2[4] = jArr2[4] ^ jArr[4];
    }

    public static long[] e(BigInteger bigInteger) {
        return v60.n.s(283, bigInteger);
    }

    public static void f(long[] jArr, long[] jArr2) {
        long[] l11 = v60.n.l(9);
        v60.i.b(jArr, jArr2);
        for (int i11 = 1; i11 < 283; i11 += 2) {
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
        long j19 = jArr[8];
        long j21 = jArr[9];
        jArr[0] = j11 ^ (j12 << 57);
        jArr[1] = (j12 >>> 7) ^ (j13 << 50);
        jArr[2] = (j13 >>> 14) ^ (j14 << 43);
        jArr[3] = (j14 >>> 21) ^ (j15 << 36);
        jArr[4] = (j15 >>> 28) ^ (j16 << 29);
        jArr[5] = (j16 >>> 35) ^ (j17 << 22);
        jArr[6] = (j17 >>> 42) ^ (j18 << 15);
        jArr[7] = (j18 >>> 49) ^ (j19 << 8);
        jArr[8] = (j19 >>> 56) ^ (j21 << 1);
        jArr[9] = j21 >>> 63;
    }

    protected static void h(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        jArr2[0] = j11 & 144115188075855871L;
        jArr2[1] = ((j11 >>> 57) ^ (j12 << 7)) & 144115188075855871L;
        jArr2[2] = ((j12 >>> 50) ^ (j13 << 14)) & 144115188075855871L;
        jArr2[3] = ((j13 >>> 43) ^ (j14 << 21)) & 144115188075855871L;
        jArr2[4] = (j14 >>> 36) ^ (j15 << 28);
    }

    protected static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        h(jArr, jArr4);
        h(jArr2, jArr5);
        long[] jArr6 = new long[26];
        j(jArr3, jArr4[0], jArr5[0], jArr6, 0);
        j(jArr3, jArr4[1], jArr5[1], jArr6, 2);
        j(jArr3, jArr4[2], jArr5[2], jArr6, 4);
        j(jArr3, jArr4[3], jArr5[3], jArr6, 6);
        j(jArr3, jArr4[4], jArr5[4], jArr6, 8);
        long j11 = jArr4[0] ^ jArr4[1];
        long j12 = jArr5[0] ^ jArr5[1];
        long j13 = jArr4[0] ^ jArr4[2];
        long j14 = jArr5[0] ^ jArr5[2];
        long j15 = jArr4[2] ^ jArr4[4];
        long j16 = jArr5[2] ^ jArr5[4];
        long j17 = jArr4[3] ^ jArr4[4];
        long j18 = jArr5[3] ^ jArr5[4];
        j(jArr3, j13 ^ jArr4[3], j14 ^ jArr5[3], jArr6, 18);
        j(jArr3, j15 ^ jArr4[1], j16 ^ jArr5[1], jArr6, 20);
        long j19 = j11 ^ j17;
        long j21 = j12 ^ j18;
        j(jArr3, j19, j21, jArr6, 22);
        j(jArr3, j19 ^ jArr4[2], j21 ^ jArr5[2], jArr6, 24);
        j(jArr3, j11, j12, jArr6, 10);
        j(jArr3, j13, j14, jArr6, 12);
        j(jArr3, j15, j16, jArr6, 14);
        j(jArr3, j17, j18, jArr6, 16);
        jArr3[0] = jArr6[0];
        jArr3[9] = jArr6[9];
        long j22 = jArr6[0] ^ jArr6[1];
        long j23 = jArr6[2] ^ j22;
        long j24 = jArr6[10] ^ j23;
        jArr3[1] = j24;
        long j25 = jArr6[3] ^ jArr6[4];
        long j26 = j23 ^ (j25 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j26;
        long j27 = j22 ^ j25;
        long j28 = jArr6[5] ^ jArr6[6];
        long j29 = (j27 ^ j28) ^ jArr6[8];
        long j31 = jArr6[13] ^ jArr6[14];
        jArr3[3] = (j29 ^ j31) ^ ((jArr6[18] ^ jArr6[22]) ^ jArr6[24]);
        long j32 = (jArr6[7] ^ jArr6[8]) ^ jArr6[9];
        long j33 = j32 ^ jArr6[17];
        jArr3[8] = j33;
        long j34 = (j32 ^ j28) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j34;
        long j35 = j24 ^ j34;
        long j36 = (jArr6[19] ^ jArr6[20]) ^ (jArr6[25] ^ jArr6[24]);
        jArr3[4] = (j36 ^ (jArr6[18] ^ jArr6[23])) ^ j35;
        jArr3[5] = ((j26 ^ j33) ^ j36) ^ (jArr6[21] ^ jArr6[22]);
        jArr3[6] = (((((j29 ^ jArr6[0]) ^ jArr6[9]) ^ j31) ^ jArr6[21]) ^ jArr6[23]) ^ jArr6[25];
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

    protected static void k(long[] jArr, long[] jArr2) {
        v60.b.c(jArr, 0, 4, jArr2, 0);
        jArr2[8] = v60.b.a((int) jArr[4]);
    }

    public static void l(long[] jArr, long[] jArr2) {
        if (v60.i.g(jArr)) {
            throw new IllegalStateException();
        }
        long[] c11 = v60.i.c();
        long[] c12 = v60.i.c();
        q(jArr, c11);
        m(c11, jArr, c11);
        s(c11, 2, c12);
        m(c12, c11, c12);
        s(c12, 4, c11);
        m(c11, c12, c11);
        s(c11, 8, c12);
        m(c12, c11, c12);
        q(c12, c12);
        m(c12, jArr, c12);
        s(c12, 17, c11);
        m(c11, c12, c11);
        q(c11, c11);
        m(c11, jArr, c11);
        s(c11, 35, c12);
        m(c12, c11, c12);
        s(c12, 70, c11);
        m(c11, c12, c11);
        q(c11, c11);
        m(c11, jArr, c11);
        s(c11, 141, c12);
        m(c12, c11, c12);
        q(c12, jArr2);
    }

    public static void m(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d11 = v60.i.d();
        i(jArr, jArr2, d11);
        o(d11, jArr3);
    }

    public static void n(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d11 = v60.i.d();
        i(jArr, jArr2, d11);
        b(jArr3, d11, jArr3);
    }

    public static void o(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = jArr[6];
        long j18 = jArr[7];
        long j19 = jArr[8];
        long j21 = j15 ^ ((((j19 >>> 27) ^ (j19 >>> 22)) ^ (j19 >>> 20)) ^ (j19 >>> 15));
        long j22 = j11 ^ ((((j16 << 37) ^ (j16 << 42)) ^ (j16 << 44)) ^ (j16 << 49));
        long j23 = (j12 ^ ((((j17 << 37) ^ (j17 << 42)) ^ (j17 << 44)) ^ (j17 << 49))) ^ ((((j16 >>> 27) ^ (j16 >>> 22)) ^ (j16 >>> 20)) ^ (j16 >>> 15));
        long j24 = j21 >>> 27;
        jArr2[0] = (((j22 ^ j24) ^ (j24 << 5)) ^ (j24 << 7)) ^ (j24 << 12);
        jArr2[1] = j23;
        jArr2[2] = (j13 ^ ((((j18 << 37) ^ (j18 << 42)) ^ (j18 << 44)) ^ (j18 << 49))) ^ ((((j17 >>> 27) ^ (j17 >>> 22)) ^ (j17 >>> 20)) ^ (j17 >>> 15));
        jArr2[3] = (j14 ^ ((((j19 << 37) ^ (j19 << 42)) ^ (j19 << 44)) ^ (j19 << 49))) ^ ((((j18 >>> 27) ^ (j18 >>> 22)) ^ (j18 >>> 20)) ^ (j18 >>> 15));
        jArr2[4] = 134217727 & j21;
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] c11 = v60.i.c();
        long g11 = v60.b.g(jArr[0]);
        long g12 = v60.b.g(jArr[1]);
        long j11 = (g11 & 4294967295L) | (g12 << 32);
        c11[0] = (g11 >>> 32) | (g12 & (-4294967296L));
        long g13 = v60.b.g(jArr[2]);
        long g14 = v60.b.g(jArr[3]);
        c11[1] = (g13 >>> 32) | ((-4294967296L) & g14);
        long g15 = v60.b.g(jArr[4]);
        c11[2] = g15 >>> 32;
        m(c11, f47839a, jArr2);
        jArr2[0] = jArr2[0] ^ j11;
        jArr2[1] = jArr2[1] ^ ((g13 & 4294967295L) | (g14 << 32));
        jArr2[2] = jArr2[2] ^ (4294967295L & g15);
    }

    public static void q(long[] jArr, long[] jArr2) {
        long[] l11 = v60.n.l(9);
        k(jArr, l11);
        o(l11, jArr2);
    }

    public static void r(long[] jArr, long[] jArr2) {
        long[] l11 = v60.n.l(9);
        k(jArr, l11);
        b(jArr2, l11, jArr2);
    }

    public static void s(long[] jArr, int i11, long[] jArr2) {
        long[] l11 = v60.n.l(9);
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
        return ((int) (jArr[0] ^ (jArr[4] >>> 15))) & 1;
    }
}