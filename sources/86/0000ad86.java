package q60;

import java.math.BigInteger;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes5.dex */
public class u1 {
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
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
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
        return v60.n.s(233, bigInteger);
    }

    public static void f(long[] jArr, long[] jArr2) {
        long[] l11 = v60.h.l();
        v60.h.h(jArr, jArr2);
        for (int i11 = 1; i11 < 233; i11 += 2) {
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
        jArr[0] = j11 ^ (j12 << 59);
        jArr[1] = (j12 >>> 5) ^ (j13 << 54);
        jArr[2] = (j13 >>> 10) ^ (j14 << 49);
        jArr[3] = (j14 >>> 15) ^ (j15 << 44);
        jArr[4] = (j15 >>> 20) ^ (j16 << 39);
        jArr[5] = (j16 >>> 25) ^ (j17 << 34);
        jArr[6] = (j17 >>> 30) ^ (j18 << 29);
        jArr[7] = j18 >>> 35;
    }

    protected static void h(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        jArr2[0] = j11 & 576460752303423487L;
        jArr2[1] = ((j11 >>> 59) ^ (j12 << 5)) & 576460752303423487L;
        jArr2[2] = ((j12 >>> 54) ^ (j13 << 10)) & 576460752303423487L;
        jArr2[3] = (j13 >>> 49) ^ (j14 << 15);
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
        v60.b.c(jArr, 0, 4, jArr2, 0);
    }

    public static void l(long[] jArr, long[] jArr2) {
        if (v60.h.w(jArr)) {
            throw new IllegalStateException();
        }
        long[] j11 = v60.h.j();
        long[] j12 = v60.h.j();
        q(jArr, j11);
        m(j11, jArr, j11);
        q(j11, j11);
        m(j11, jArr, j11);
        s(j11, 3, j12);
        m(j12, j11, j12);
        q(j12, j12);
        m(j12, jArr, j12);
        s(j12, 7, j11);
        m(j11, j12, j11);
        s(j11, 14, j12);
        m(j12, j11, j12);
        q(j12, j12);
        m(j12, jArr, j12);
        s(j12, 29, j11);
        m(j11, j12, j11);
        s(j11, 58, j12);
        m(j12, j11, j12);
        s(j12, 116, j11);
        m(j11, j12, j11);
        q(j11, jArr2);
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
        long j18 = jArr[7];
        long j19 = j16 ^ (j18 >>> 31);
        long j21 = (j15 ^ ((j18 >>> 41) ^ (j18 << 33))) ^ (j17 >>> 31);
        long j22 = ((j14 ^ (j18 << 23)) ^ ((j17 >>> 41) ^ (j17 << 33))) ^ (j19 >>> 31);
        long j23 = j11 ^ (j21 << 23);
        long j24 = ((j13 ^ (j17 << 23)) ^ ((j19 >>> 41) ^ (j19 << 33))) ^ (j21 >>> 31);
        long j25 = j22 >>> 41;
        jArr2[0] = j23 ^ j25;
        long j26 = j25 << 10;
        jArr2[1] = j26 ^ ((j12 ^ (j19 << 23)) ^ ((j21 >>> 41) ^ (j21 << 33)));
        jArr2[2] = j24;
        jArr2[3] = 2199023255551L & j22;
    }

    public static void p(long[] jArr, long[] jArr2) {
        long g11 = v60.b.g(jArr[0]);
        long g12 = v60.b.g(jArr[1]);
        long j11 = (g11 & 4294967295L) | (g12 << 32);
        long j12 = (g11 >>> 32) | (g12 & (-4294967296L));
        long g13 = v60.b.g(jArr[2]);
        long g14 = v60.b.g(jArr[3]);
        long j13 = (4294967295L & g13) | (g14 << 32);
        long j14 = (g13 >>> 32) | (g14 & (-4294967296L));
        long j15 = j14 >>> 27;
        long j16 = j14 ^ ((j12 >>> 27) | (j14 << 37));
        long j17 = j12 ^ (j12 << 37);
        long[] l11 = v60.h.l();
        int[] iArr = {32, 117, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256};
        int i11 = 0;
        for (int i12 = 3; i11 < i12; i12 = 3) {
            int i13 = iArr[i11] >>> 6;
            int i14 = iArr[i11] & 63;
            l11[i13] = l11[i13] ^ (j17 << i14);
            int i15 = i13 + 1;
            int i16 = -i14;
            l11[i15] = l11[i15] ^ ((j16 << i14) | (j17 >>> i16));
            int i17 = i13 + 2;
            l11[i17] = l11[i17] ^ ((j15 << i14) | (j16 >>> i16));
            int i18 = i13 + 3;
            l11[i18] = l11[i18] ^ (j15 >>> i16);
            i11++;
        }
        o(l11, jArr2);
        jArr2[0] = jArr2[0] ^ j11;
        jArr2[1] = jArr2[1] ^ j13;
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
        return ((int) (jArr[0] ^ (jArr[2] >>> 31))) & 1;
    }
}