package q60;

import com.google.android.gms.wallet.WalletConstants;
import java.math.BigInteger;

/* loaded from: classes5.dex */
public class k2 {
    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 0; i11 < 13; i11++) {
            jArr3[i11] = jArr[i11] ^ jArr2[i11];
        }
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
    }

    private static void d(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
        jArr2[4] = jArr2[4] ^ jArr[4];
        jArr2[5] = jArr2[5] ^ jArr[5];
        jArr2[6] = jArr2[6] ^ jArr[6];
    }

    public static long[] e(BigInteger bigInteger) {
        return v60.n.s(WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR, bigInteger);
    }

    public static void f(long[] jArr, long[] jArr2) {
        long[] l11 = v60.n.l(13);
        v60.k.b(jArr, jArr2);
        for (int i11 = 1; i11 < 409; i11 += 2) {
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
        long j22 = jArr[10];
        long j23 = jArr[11];
        long j24 = jArr[12];
        long j25 = jArr[13];
        jArr[0] = j11 ^ (j12 << 59);
        jArr[1] = (j12 >>> 5) ^ (j13 << 54);
        jArr[2] = (j13 >>> 10) ^ (j14 << 49);
        jArr[3] = (j14 >>> 15) ^ (j15 << 44);
        jArr[4] = (j15 >>> 20) ^ (j16 << 39);
        jArr[5] = (j16 >>> 25) ^ (j17 << 34);
        jArr[6] = (j17 >>> 30) ^ (j18 << 29);
        jArr[7] = (j18 >>> 35) ^ (j19 << 24);
        jArr[8] = (j19 >>> 40) ^ (j21 << 19);
        jArr[9] = (j21 >>> 45) ^ (j22 << 14);
        jArr[10] = (j22 >>> 50) ^ (j23 << 9);
        jArr[11] = ((j23 >>> 55) ^ (j24 << 4)) ^ (j25 << 63);
        jArr[12] = j25 >>> 1;
    }

    protected static void h(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = jArr[6];
        jArr2[0] = j11 & 576460752303423487L;
        jArr2[1] = ((j11 >>> 59) ^ (j12 << 5)) & 576460752303423487L;
        jArr2[2] = ((j12 >>> 54) ^ (j13 << 10)) & 576460752303423487L;
        jArr2[3] = ((j13 >>> 49) ^ (j14 << 15)) & 576460752303423487L;
        jArr2[4] = ((j14 >>> 44) ^ (j15 << 20)) & 576460752303423487L;
        jArr2[5] = ((j15 >>> 39) ^ (j16 << 25)) & 576460752303423487L;
        jArr2[6] = (j16 >>> 34) ^ (j17 << 30);
    }

    protected static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        h(jArr, jArr4);
        h(jArr2, jArr5);
        long[] jArr6 = new long[8];
        for (int i11 = 0; i11 < 7; i11++) {
            j(jArr6, jArr4[i11], jArr5[i11], jArr3, i11 << 1);
        }
        long j11 = jArr3[0];
        long j12 = jArr3[1];
        long j13 = j11 ^ jArr3[2];
        jArr3[1] = j13 ^ j12;
        long j14 = j12 ^ jArr3[3];
        long j15 = j13 ^ jArr3[4];
        jArr3[2] = j15 ^ j14;
        long j16 = j14 ^ jArr3[5];
        long j17 = j15 ^ jArr3[6];
        jArr3[3] = j17 ^ j16;
        long j18 = j16 ^ jArr3[7];
        long j19 = j17 ^ jArr3[8];
        jArr3[4] = j19 ^ j18;
        long j21 = j18 ^ jArr3[9];
        long j22 = j19 ^ jArr3[10];
        jArr3[5] = j22 ^ j21;
        long j23 = j21 ^ jArr3[11];
        long j24 = j22 ^ jArr3[12];
        jArr3[6] = j24 ^ j23;
        long j25 = j24 ^ (j23 ^ jArr3[13]);
        jArr3[7] = jArr3[0] ^ j25;
        jArr3[8] = jArr3[1] ^ j25;
        jArr3[9] = jArr3[2] ^ j25;
        jArr3[10] = jArr3[3] ^ j25;
        jArr3[11] = jArr3[4] ^ j25;
        jArr3[12] = jArr3[5] ^ j25;
        jArr3[13] = j25 ^ jArr3[6];
        j(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        j(jArr6, jArr4[0] ^ jArr4[2], jArr5[0] ^ jArr5[2], jArr3, 2);
        j(jArr6, jArr4[0] ^ jArr4[3], jArr5[0] ^ jArr5[3], jArr3, 3);
        j(jArr6, jArr4[1] ^ jArr4[2], jArr5[1] ^ jArr5[2], jArr3, 3);
        j(jArr6, jArr4[0] ^ jArr4[4], jArr5[0] ^ jArr5[4], jArr3, 4);
        j(jArr6, jArr4[1] ^ jArr4[3], jArr5[1] ^ jArr5[3], jArr3, 4);
        j(jArr6, jArr4[0] ^ jArr4[5], jArr5[0] ^ jArr5[5], jArr3, 5);
        j(jArr6, jArr4[1] ^ jArr4[4], jArr5[1] ^ jArr5[4], jArr3, 5);
        j(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 5);
        j(jArr6, jArr4[0] ^ jArr4[6], jArr5[0] ^ jArr5[6], jArr3, 6);
        j(jArr6, jArr4[1] ^ jArr4[5], jArr5[1] ^ jArr5[5], jArr3, 6);
        j(jArr6, jArr4[2] ^ jArr4[4], jArr5[2] ^ jArr5[4], jArr3, 6);
        j(jArr6, jArr4[1] ^ jArr4[6], jArr5[1] ^ jArr5[6], jArr3, 7);
        j(jArr6, jArr4[2] ^ jArr4[5], jArr5[2] ^ jArr5[5], jArr3, 7);
        j(jArr6, jArr4[3] ^ jArr4[4], jArr5[3] ^ jArr5[4], jArr3, 7);
        j(jArr6, jArr4[2] ^ jArr4[6], jArr5[2] ^ jArr5[6], jArr3, 8);
        j(jArr6, jArr4[3] ^ jArr4[5], jArr5[3] ^ jArr5[5], jArr3, 8);
        j(jArr6, jArr4[3] ^ jArr4[6], jArr5[3] ^ jArr5[6], jArr3, 9);
        j(jArr6, jArr4[4] ^ jArr4[5], jArr5[4] ^ jArr5[5], jArr3, 9);
        j(jArr6, jArr4[4] ^ jArr4[6], jArr5[4] ^ jArr5[6], jArr3, 10);
        j(jArr6, jArr4[5] ^ jArr4[6], jArr5[5] ^ jArr5[6], jArr3, 11);
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
        int i13 = 54;
        do {
            int i14 = (int) (j11 >>> i13);
            long j15 = jArr[i14 & 7] ^ (jArr[(i14 >>> 3) & 7] << 3);
            j13 ^= j15 << i13;
            j14 ^= j15 >>> (-i13);
            i13 -= 6;
        } while (i13 > 0);
        jArr2[i11] = jArr2[i11] ^ (576460752303423487L & j13);
        int i15 = i11 + 1;
        jArr2[i15] = jArr2[i15] ^ ((j13 >>> 59) ^ (j14 << 5));
    }

    protected static void k(long[] jArr, long[] jArr2) {
        v60.b.c(jArr, 0, 6, jArr2, 0);
        jArr2[12] = v60.b.a((int) jArr[6]);
    }

    public static void l(long[] jArr, long[] jArr2) {
        if (v60.k.g(jArr)) {
            throw new IllegalStateException();
        }
        long[] c11 = v60.k.c();
        long[] c12 = v60.k.c();
        long[] c13 = v60.k.c();
        q(jArr, c11);
        s(c11, 1, c12);
        m(c11, c12, c11);
        s(c12, 1, c12);
        m(c11, c12, c11);
        s(c11, 3, c12);
        m(c11, c12, c11);
        s(c11, 6, c12);
        m(c11, c12, c11);
        s(c11, 12, c12);
        m(c11, c12, c13);
        s(c13, 24, c11);
        s(c11, 24, c12);
        m(c11, c12, c11);
        s(c11, 48, c12);
        m(c11, c12, c11);
        s(c11, 96, c12);
        m(c11, c12, c11);
        s(c11, 192, c12);
        m(c11, c12, c11);
        m(c11, c13, jArr2);
    }

    public static void m(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d11 = v60.k.d();
        i(jArr, jArr2, d11);
        o(d11, jArr3);
    }

    public static void n(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d11 = v60.k.d();
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
        long j19 = jArr[12];
        long j21 = j17 ^ ((j19 >>> 25) ^ (j19 << 62));
        long j22 = j18 ^ (j19 >>> 2);
        long j23 = jArr[11];
        long j24 = j15 ^ (j23 << 39);
        long j25 = (j16 ^ (j19 << 39)) ^ ((j23 >>> 25) ^ (j23 << 62));
        long j26 = j21 ^ (j23 >>> 2);
        long j27 = jArr[10];
        long j28 = j14 ^ (j27 << 39);
        long j29 = j24 ^ ((j27 >>> 25) ^ (j27 << 62));
        long j31 = j25 ^ (j27 >>> 2);
        long j32 = jArr[9];
        long j33 = j13 ^ (j32 << 39);
        long j34 = j28 ^ ((j32 >>> 25) ^ (j32 << 62));
        long j35 = j29 ^ (j32 >>> 2);
        long j36 = jArr[8];
        long j37 = j11 ^ (j22 << 39);
        long j38 = (j33 ^ ((j36 >>> 25) ^ (j36 << 62))) ^ (j22 >>> 2);
        long j39 = j26 >>> 25;
        jArr2[0] = j37 ^ j39;
        long j41 = j39 << 23;
        jArr2[1] = j41 ^ ((j12 ^ (j36 << 39)) ^ ((j22 >>> 25) ^ (j22 << 62)));
        jArr2[2] = j38;
        jArr2[3] = j34 ^ (j36 >>> 2);
        jArr2[4] = j35;
        jArr2[5] = j31;
        jArr2[6] = j26 & 33554431;
    }

    public static void p(long[] jArr, long[] jArr2) {
        long g11 = v60.b.g(jArr[0]);
        long g12 = v60.b.g(jArr[1]);
        long j11 = (g11 & 4294967295L) | (g12 << 32);
        long j12 = (g11 >>> 32) | (g12 & (-4294967296L));
        long g13 = v60.b.g(jArr[2]);
        long g14 = v60.b.g(jArr[3]);
        long j13 = (g13 & 4294967295L) | (g14 << 32);
        long j14 = (g13 >>> 32) | (g14 & (-4294967296L));
        long g15 = v60.b.g(jArr[4]);
        long g16 = v60.b.g(jArr[5]);
        long j15 = (g15 >>> 32) | (g16 & (-4294967296L));
        long g17 = v60.b.g(jArr[6]);
        long j16 = g17 & 4294967295L;
        long j17 = g17 >>> 32;
        jArr2[0] = j11 ^ (j12 << 44);
        jArr2[1] = (j13 ^ (j14 << 44)) ^ (j12 >>> 20);
        jArr2[2] = (((g15 & 4294967295L) | (g16 << 32)) ^ (j15 << 44)) ^ (j14 >>> 20);
        jArr2[3] = (((j17 << 44) ^ j16) ^ (j15 >>> 20)) ^ (j12 << 13);
        jArr2[4] = (j12 >>> 51) ^ ((j17 >>> 20) ^ (j14 << 13));
        jArr2[5] = (j15 << 13) ^ (j14 >>> 51);
        jArr2[6] = (j17 << 13) ^ (j15 >>> 51);
    }

    public static void q(long[] jArr, long[] jArr2) {
        long[] l11 = v60.n.l(13);
        k(jArr, l11);
        o(l11, jArr2);
    }

    public static void r(long[] jArr, long[] jArr2) {
        long[] l11 = v60.n.l(13);
        k(jArr, l11);
        b(jArr2, l11, jArr2);
    }

    public static void s(long[] jArr, int i11, long[] jArr2) {
        long[] l11 = v60.n.l(13);
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