package q60;

import java.math.BigInteger;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes5.dex */
public class q2 {

    /* renamed from: a  reason: collision with root package name */
    private static final long[] f47950a = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    private static void a(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13) {
        for (int i14 = 0; i14 < 9; i14++) {
            jArr3[i13 + i14] = jArr[i11 + i14] ^ jArr2[i12 + i14];
        }
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 0; i11 < 9; i11++) {
            jArr3[i11] = jArr[i11] ^ jArr2[i11];
        }
    }

    private static void c(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13) {
        for (int i14 = 0; i14 < 9; i14++) {
            int i15 = i13 + i14;
            jArr3[i15] = jArr3[i15] ^ (jArr[i11 + i14] ^ jArr2[i12 + i14]);
        }
    }

    public static void d(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 0; i11 < 9; i11++) {
            jArr3[i11] = jArr3[i11] ^ (jArr[i11] ^ jArr2[i11]);
        }
    }

    public static void e(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 0; i11 < 18; i11++) {
            jArr3[i11] = jArr[i11] ^ jArr2[i11];
        }
    }

    public static void f(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        for (int i11 = 1; i11 < 9; i11++) {
            jArr2[i11] = jArr[i11];
        }
    }

    private static void g(long[] jArr, long[] jArr2) {
        for (int i11 = 0; i11 < 9; i11++) {
            jArr2[i11] = jArr2[i11] ^ jArr[i11];
        }
    }

    public static long[] h(BigInteger bigInteger) {
        return v60.n.s(571, bigInteger);
    }

    public static void i(long[] jArr, long[] jArr2) {
        long[] d11 = v60.m.d();
        v60.m.b(jArr, jArr2);
        for (int i11 = 1; i11 < 571; i11 += 2) {
            m(jArr2, d11);
            t(d11, jArr2);
            m(jArr2, d11);
            t(d11, jArr2);
            g(jArr, jArr2);
        }
    }

    protected static void j(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[16];
        for (int i11 = 0; i11 < 9; i11++) {
            l(jArr4, jArr[i11], jArr2[i11], jArr3, i11 << 1);
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
        long j25 = j23 ^ jArr3[13];
        long j26 = j24 ^ jArr3[14];
        jArr3[7] = j26 ^ j25;
        long j27 = j25 ^ jArr3[15];
        long j28 = j26 ^ jArr3[16];
        jArr3[8] = j28 ^ j27;
        long j29 = j28 ^ (j27 ^ jArr3[17]);
        jArr3[9] = jArr3[0] ^ j29;
        jArr3[10] = jArr3[1] ^ j29;
        jArr3[11] = jArr3[2] ^ j29;
        jArr3[12] = jArr3[3] ^ j29;
        jArr3[13] = jArr3[4] ^ j29;
        jArr3[14] = jArr3[5] ^ j29;
        jArr3[15] = jArr3[6] ^ j29;
        jArr3[16] = jArr3[7] ^ j29;
        jArr3[17] = jArr3[8] ^ j29;
        l(jArr4, jArr[0] ^ jArr[1], jArr2[0] ^ jArr2[1], jArr3, 1);
        l(jArr4, jArr[0] ^ jArr[2], jArr2[0] ^ jArr2[2], jArr3, 2);
        l(jArr4, jArr[0] ^ jArr[3], jArr2[0] ^ jArr2[3], jArr3, 3);
        l(jArr4, jArr[1] ^ jArr[2], jArr2[1] ^ jArr2[2], jArr3, 3);
        l(jArr4, jArr[0] ^ jArr[4], jArr2[0] ^ jArr2[4], jArr3, 4);
        l(jArr4, jArr[1] ^ jArr[3], jArr2[1] ^ jArr2[3], jArr3, 4);
        l(jArr4, jArr[0] ^ jArr[5], jArr2[0] ^ jArr2[5], jArr3, 5);
        l(jArr4, jArr[1] ^ jArr[4], jArr2[1] ^ jArr2[4], jArr3, 5);
        l(jArr4, jArr[2] ^ jArr[3], jArr2[2] ^ jArr2[3], jArr3, 5);
        l(jArr4, jArr[0] ^ jArr[6], jArr2[0] ^ jArr2[6], jArr3, 6);
        l(jArr4, jArr[1] ^ jArr[5], jArr2[1] ^ jArr2[5], jArr3, 6);
        l(jArr4, jArr[2] ^ jArr[4], jArr2[2] ^ jArr2[4], jArr3, 6);
        l(jArr4, jArr[0] ^ jArr[7], jArr2[0] ^ jArr2[7], jArr3, 7);
        l(jArr4, jArr[1] ^ jArr[6], jArr2[1] ^ jArr2[6], jArr3, 7);
        l(jArr4, jArr[2] ^ jArr[5], jArr2[2] ^ jArr2[5], jArr3, 7);
        l(jArr4, jArr[3] ^ jArr[4], jArr2[3] ^ jArr2[4], jArr3, 7);
        l(jArr4, jArr[0] ^ jArr[8], jArr2[0] ^ jArr2[8], jArr3, 8);
        l(jArr4, jArr[1] ^ jArr[7], jArr2[1] ^ jArr2[7], jArr3, 8);
        l(jArr4, jArr[2] ^ jArr[6], jArr2[2] ^ jArr2[6], jArr3, 8);
        l(jArr4, jArr[3] ^ jArr[5], jArr2[3] ^ jArr2[5], jArr3, 8);
        l(jArr4, jArr[1] ^ jArr[8], jArr2[1] ^ jArr2[8], jArr3, 9);
        l(jArr4, jArr[2] ^ jArr[7], jArr2[2] ^ jArr2[7], jArr3, 9);
        l(jArr4, jArr[3] ^ jArr[6], jArr2[3] ^ jArr2[6], jArr3, 9);
        l(jArr4, jArr[4] ^ jArr[5], jArr2[4] ^ jArr2[5], jArr3, 9);
        l(jArr4, jArr[2] ^ jArr[8], jArr2[2] ^ jArr2[8], jArr3, 10);
        l(jArr4, jArr[3] ^ jArr[7], jArr2[3] ^ jArr2[7], jArr3, 10);
        l(jArr4, jArr[4] ^ jArr[6], jArr2[4] ^ jArr2[6], jArr3, 10);
        l(jArr4, jArr[3] ^ jArr[8], jArr2[3] ^ jArr2[8], jArr3, 11);
        l(jArr4, jArr[4] ^ jArr[7], jArr2[4] ^ jArr2[7], jArr3, 11);
        l(jArr4, jArr[5] ^ jArr[6], jArr2[5] ^ jArr2[6], jArr3, 11);
        l(jArr4, jArr[4] ^ jArr[8], jArr2[4] ^ jArr2[8], jArr3, 12);
        l(jArr4, jArr[5] ^ jArr[7], jArr2[5] ^ jArr2[7], jArr3, 12);
        l(jArr4, jArr[5] ^ jArr[8], jArr2[5] ^ jArr2[8], jArr3, 13);
        l(jArr4, jArr[6] ^ jArr[7], jArr2[6] ^ jArr2[7], jArr3, 13);
        l(jArr4, jArr[6] ^ jArr[8], jArr2[6] ^ jArr2[8], jArr3, 14);
        l(jArr4, jArr[7] ^ jArr[8], jArr2[7] ^ jArr2[8], jArr3, 15);
    }

    protected static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 56; i11 >= 0; i11 -= 8) {
            for (int i12 = 1; i12 < 9; i12 += 2) {
                int i13 = (int) (jArr[i12] >>> i11);
                c(jArr2, (i13 & 15) * 9, jArr2, (((i13 >>> 4) & 15) + 16) * 9, jArr3, i12 - 1);
            }
            v60.n.O(16, jArr3, 0, 8, 0L);
        }
        for (int i14 = 56; i14 >= 0; i14 -= 8) {
            for (int i15 = 0; i15 < 9; i15 += 2) {
                int i16 = (int) (jArr[i15] >>> i14);
                c(jArr2, (i16 & 15) * 9, jArr2, (((i16 >>> 4) & 15) + 16) * 9, jArr3, i15);
            }
            if (i14 > 0) {
                v60.n.O(18, jArr3, 0, 8, 0L);
            }
        }
    }

    protected static void l(long[] jArr, long j11, long j12, long[] jArr2, int i11) {
        long j13 = j11;
        jArr[1] = j12;
        for (int i12 = 2; i12 < 16; i12 += 2) {
            jArr[i12] = jArr[i12 >>> 1] << 1;
            jArr[i12 + 1] = jArr[i12] ^ j12;
        }
        int i13 = (int) j13;
        long j14 = 0;
        long j15 = jArr[i13 & 15] ^ (jArr[(i13 >>> 4) & 15] << 4);
        int i14 = 56;
        do {
            int i15 = (int) (j13 >>> i14);
            long j16 = jArr[i15 & 15] ^ (jArr[(i15 >>> 4) & 15] << 4);
            j15 ^= j16 << i14;
            j14 ^= j16 >>> (-i14);
            i14 -= 8;
        } while (i14 > 0);
        for (int i16 = 0; i16 < 7; i16++) {
            j13 = (j13 & (-72340172838076674L)) >>> 1;
            j14 ^= ((j12 << i16) >> 63) & j13;
        }
        jArr2[i11] = jArr2[i11] ^ j15;
        int i17 = i11 + 1;
        jArr2[i17] = jArr2[i17] ^ j14;
    }

    protected static void m(long[] jArr, long[] jArr2) {
        v60.b.c(jArr, 0, 9, jArr2, 0);
    }

    public static void n(long[] jArr, long[] jArr2) {
        if (v60.m.g(jArr)) {
            throw new IllegalStateException();
        }
        long[] c11 = v60.m.c();
        long[] c12 = v60.m.c();
        long[] c13 = v60.m.c();
        w(jArr, c13);
        w(c13, c11);
        w(c11, c12);
        o(c11, c12, c11);
        y(c11, 2, c12);
        o(c11, c12, c11);
        o(c11, c13, c11);
        y(c11, 5, c12);
        o(c11, c12, c11);
        y(c12, 5, c12);
        o(c11, c12, c11);
        y(c11, 15, c12);
        o(c11, c12, c13);
        y(c13, 30, c11);
        y(c11, 30, c12);
        o(c11, c12, c11);
        y(c11, 60, c12);
        o(c11, c12, c11);
        y(c12, 60, c12);
        o(c11, c12, c11);
        y(c11, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256, c12);
        o(c11, c12, c11);
        y(c12, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256, c12);
        o(c11, c12, c11);
        o(c11, c13, jArr2);
    }

    public static void o(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d11 = v60.m.d();
        j(jArr, jArr2, d11);
        t(d11, jArr3);
    }

    public static void p(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d11 = v60.m.d();
        j(jArr, jArr2, d11);
        e(jArr3, d11, jArr3);
    }

    public static void q(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d11 = v60.m.d();
        k(jArr, jArr2, d11);
        t(d11, jArr3);
    }

    public static void r(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d11 = v60.m.d();
        k(jArr, jArr2, d11);
        e(jArr3, d11, jArr3);
    }

    public static long[] s(long[] jArr) {
        long[] jArr2 = new long[288];
        int i11 = 0;
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i12 = 7;
        while (i12 > 0) {
            int i13 = i11 + 18;
            v60.n.L(9, jArr2, i13 >>> 1, 0L, jArr2, i13);
            u(jArr2, i13);
            a(jArr2, 9, jArr2, i13, jArr2, i13 + 9);
            i12--;
            i11 = i13;
        }
        v60.n.P(144, jArr2, 0, 4, 0L, jArr2, 144);
        return jArr2;
    }

    public static void t(long[] jArr, long[] jArr2) {
        long j11 = jArr[9];
        long j12 = jArr[17];
        long j13 = (((j11 ^ (j12 >>> 59)) ^ (j12 >>> 57)) ^ (j12 >>> 54)) ^ (j12 >>> 49);
        long j14 = (j12 << 15) ^ (((jArr[8] ^ (j12 << 5)) ^ (j12 << 7)) ^ (j12 << 10));
        for (int i11 = 16; i11 >= 10; i11--) {
            long j15 = jArr[i11];
            jArr2[i11 - 8] = (((j14 ^ (j15 >>> 59)) ^ (j15 >>> 57)) ^ (j15 >>> 54)) ^ (j15 >>> 49);
            j14 = (((jArr[i11 - 9] ^ (j15 << 5)) ^ (j15 << 7)) ^ (j15 << 10)) ^ (j15 << 15);
        }
        jArr2[1] = (((j14 ^ (j13 >>> 59)) ^ (j13 >>> 57)) ^ (j13 >>> 54)) ^ (j13 >>> 49);
        long j16 = (j13 << 15) ^ (((jArr[0] ^ (j13 << 5)) ^ (j13 << 7)) ^ (j13 << 10));
        long j17 = jArr2[8];
        long j18 = j17 >>> 59;
        jArr2[0] = (((j16 ^ j18) ^ (j18 << 2)) ^ (j18 << 5)) ^ (j18 << 10);
        jArr2[8] = 576460752303423487L & j17;
    }

    public static void u(long[] jArr, int i11) {
        int i12 = i11 + 8;
        long j11 = jArr[i12];
        long j12 = j11 >>> 59;
        jArr[i11] = ((j12 << 10) ^ (((j12 << 2) ^ j12) ^ (j12 << 5))) ^ jArr[i11];
        jArr[i12] = j11 & 576460752303423487L;
    }

    public static void v(long[] jArr, long[] jArr2) {
        long[] c11 = v60.m.c();
        long[] c12 = v60.m.c();
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = i11 + 1;
            long g11 = v60.b.g(jArr[i11]);
            i11 = i13 + 1;
            long g12 = v60.b.g(jArr[i13]);
            c11[i12] = (4294967295L & g11) | (g12 << 32);
            c12[i12] = (g11 >>> 32) | ((-4294967296L) & g12);
        }
        long g13 = v60.b.g(jArr[i11]);
        c11[4] = 4294967295L & g13;
        c12[4] = g13 >>> 32;
        o(c12, f47950a, jArr2);
        b(jArr2, c11, jArr2);
    }

    public static void w(long[] jArr, long[] jArr2) {
        long[] d11 = v60.m.d();
        m(jArr, d11);
        t(d11, jArr2);
    }

    public static void x(long[] jArr, long[] jArr2) {
        long[] d11 = v60.m.d();
        m(jArr, d11);
        e(jArr2, d11, jArr2);
    }

    public static void y(long[] jArr, int i11, long[] jArr2) {
        long[] d11 = v60.m.d();
        m(jArr, d11);
        while (true) {
            t(d11, jArr2);
            i11--;
            if (i11 <= 0) {
                return;
            }
            m(jArr2, d11);
        }
    }

    public static int z(long[] jArr) {
        return ((int) ((jArr[0] ^ (jArr[8] >>> 49)) ^ (jArr[8] >>> 57))) & 1;
    }
}