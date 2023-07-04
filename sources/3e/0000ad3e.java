package q60;

import java.math.BigInteger;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes5.dex */
public class g1 {

    /* renamed from: a  reason: collision with root package name */
    private static final long[] f47852a = {-5270498306774157648L, 5270498306774195053L, 19634136210L};

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr2[2] ^ jArr[2];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    private static void d(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
    }

    public static long[] e(BigInteger bigInteger) {
        return v60.n.s(CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, bigInteger);
    }

    public static void f(long[] jArr, long[] jArr2) {
        long[] k11 = v60.f.k();
        v60.f.g(jArr, jArr2);
        for (int i11 = 1; i11 < 163; i11 += 2) {
            j(jArr2, k11);
            n(k11, jArr2);
            j(jArr2, k11);
            n(k11, jArr2);
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
        jArr[0] = j11 ^ (j12 << 55);
        jArr[1] = (j12 >>> 9) ^ (j13 << 46);
        jArr[2] = (j13 >>> 18) ^ (j14 << 37);
        jArr[3] = (j14 >>> 27) ^ (j15 << 28);
        jArr[4] = (j15 >>> 36) ^ (j16 << 19);
        jArr[5] = j16 >>> 45;
    }

    protected static void h(long[] jArr, long[] jArr2, long[] jArr3) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = (j12 >>> 46) ^ (jArr[2] << 18);
        long j14 = ((j12 << 9) ^ (j11 >>> 55)) & 36028797018963967L;
        long j15 = j11 & 36028797018963967L;
        long j16 = jArr2[0];
        long j17 = jArr2[1];
        long j18 = (j17 >>> 46) ^ (jArr2[2] << 18);
        long j19 = ((j17 << 9) ^ (j16 >>> 55)) & 36028797018963967L;
        long j21 = j16 & 36028797018963967L;
        long[] jArr4 = new long[10];
        i(jArr3, j15, j21, jArr4, 0);
        i(jArr3, j13, j18, jArr4, 2);
        long j22 = (j15 ^ j14) ^ j13;
        long j23 = (j21 ^ j19) ^ j18;
        i(jArr3, j22, j23, jArr4, 4);
        long j24 = (j14 << 1) ^ (j13 << 2);
        long j25 = (j19 << 1) ^ (j18 << 2);
        i(jArr3, j15 ^ j24, j21 ^ j25, jArr4, 6);
        i(jArr3, j22 ^ j24, j23 ^ j25, jArr4, 8);
        long j26 = jArr4[6] ^ jArr4[8];
        long j27 = jArr4[7] ^ jArr4[9];
        long j28 = (j26 << 1) ^ jArr4[6];
        long j29 = (j26 ^ (j27 << 1)) ^ jArr4[7];
        long j31 = jArr4[0];
        long j32 = (jArr4[1] ^ jArr4[0]) ^ jArr4[4];
        long j33 = jArr4[1] ^ jArr4[5];
        long j34 = ((j31 ^ j28) ^ (jArr4[2] << 4)) ^ (jArr4[2] << 1);
        long j35 = (((j32 ^ j29) ^ (jArr4[3] << 4)) ^ (jArr4[3] << 1)) ^ (j34 >>> 55);
        long j36 = (j33 ^ j27) ^ (j35 >>> 55);
        long j37 = j35 & 36028797018963967L;
        long j38 = ((j34 & 36028797018963967L) >>> 1) ^ ((j37 & 1) << 54);
        long j39 = j38 ^ (j38 << 1);
        long j41 = j39 ^ (j39 << 2);
        long j42 = j41 ^ (j41 << 4);
        long j43 = j42 ^ (j42 << 8);
        long j44 = j43 ^ (j43 << 16);
        long j45 = (j44 ^ (j44 << 32)) & 36028797018963967L;
        long j46 = ((j37 >>> 1) ^ ((j36 & 1) << 54)) ^ (j45 >>> 54);
        long j47 = j46 ^ (j46 << 1);
        long j48 = j47 ^ (j47 << 2);
        long j49 = j48 ^ (j48 << 4);
        long j51 = j49 ^ (j49 << 8);
        long j52 = j51 ^ (j51 << 16);
        long j53 = (j52 ^ (j52 << 32)) & 36028797018963967L;
        long j54 = (j36 >>> 1) ^ (j53 >>> 54);
        long j55 = j54 ^ (j54 << 1);
        long j56 = j55 ^ (j55 << 2);
        long j57 = j56 ^ (j56 << 4);
        long j58 = j57 ^ (j57 << 8);
        long j59 = j58 ^ (j58 << 16);
        long j61 = j59 ^ (j59 << 32);
        jArr3[0] = j31;
        jArr3[1] = (j32 ^ j45) ^ jArr4[2];
        jArr3[2] = ((j33 ^ j53) ^ j45) ^ jArr4[3];
        jArr3[3] = j53 ^ j61;
        jArr3[4] = jArr4[2] ^ j61;
        jArr3[5] = jArr4[3];
        g(jArr3);
    }

    protected static void i(long[] jArr, long j11, long j12, long[] jArr2, int i11) {
        jArr[1] = j12;
        jArr[2] = jArr[1] << 1;
        jArr[3] = jArr[2] ^ j12;
        jArr[4] = jArr[2] << 1;
        jArr[5] = jArr[4] ^ j12;
        jArr[6] = jArr[3] << 1;
        jArr[7] = jArr[6] ^ j12;
        long j13 = jArr[((int) j11) & 3];
        long j14 = 0;
        int i12 = 47;
        do {
            int i13 = (int) (j11 >>> i12);
            long j15 = (jArr[i13 & 7] ^ (jArr[(i13 >>> 3) & 7] << 3)) ^ (jArr[(i13 >>> 6) & 7] << 6);
            j13 ^= j15 << i12;
            j14 ^= j15 >>> (-i12);
            i12 -= 9;
        } while (i12 > 0);
        jArr2[i11] = 36028797018963967L & j13;
        jArr2[i11 + 1] = (j13 >>> 55) ^ (j14 << 9);
    }

    protected static void j(long[] jArr, long[] jArr2) {
        v60.b.c(jArr, 0, 3, jArr2, 0);
    }

    public static void k(long[] jArr, long[] jArr2) {
        if (v60.f.v(jArr)) {
            throw new IllegalStateException();
        }
        long[] i11 = v60.f.i();
        long[] i12 = v60.f.i();
        p(jArr, i11);
        r(i11, 1, i12);
        l(i11, i12, i11);
        r(i12, 1, i12);
        l(i11, i12, i11);
        r(i11, 3, i12);
        l(i11, i12, i11);
        r(i12, 3, i12);
        l(i11, i12, i11);
        r(i11, 9, i12);
        l(i11, i12, i11);
        r(i12, 9, i12);
        l(i11, i12, i11);
        r(i11, 27, i12);
        l(i11, i12, i11);
        r(i12, 27, i12);
        l(i11, i12, i11);
        r(i11, 81, i12);
        l(i11, i12, jArr2);
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        h(jArr, jArr2, jArr4);
        n(jArr4, jArr3);
    }

    public static void m(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        h(jArr, jArr2, jArr4);
        b(jArr3, jArr4, jArr3);
    }

    public static void n(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = j14 ^ ((((j16 >>> 35) ^ (j16 >>> 32)) ^ (j16 >>> 29)) ^ (j16 >>> 28));
        long j18 = j12 ^ ((((j15 << 29) ^ (j15 << 32)) ^ (j15 << 35)) ^ (j15 << 36));
        long j19 = (j13 ^ ((((j16 << 29) ^ (j16 << 32)) ^ (j16 << 35)) ^ (j16 << 36))) ^ ((j15 >>> 28) ^ (((j15 >>> 35) ^ (j15 >>> 32)) ^ (j15 >>> 29)));
        long j21 = j11 ^ ((((j17 << 29) ^ (j17 << 32)) ^ (j17 << 35)) ^ (j17 << 36));
        long j22 = j18 ^ ((j17 >>> 28) ^ (((j17 >>> 35) ^ (j17 >>> 32)) ^ (j17 >>> 29)));
        long j23 = j19 >>> 35;
        jArr2[0] = (((j21 ^ j23) ^ (j23 << 3)) ^ (j23 << 6)) ^ (j23 << 7);
        jArr2[1] = j22;
        jArr2[2] = 34359738367L & j19;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] i11 = v60.f.i();
        long g11 = v60.b.g(jArr[0]);
        long g12 = v60.b.g(jArr[1]);
        i11[0] = (g11 >>> 32) | (g12 & (-4294967296L));
        long g13 = v60.b.g(jArr[2]);
        long j11 = g13 & 4294967295L;
        i11[1] = g13 >>> 32;
        l(i11, f47852a, jArr2);
        jArr2[0] = jArr2[0] ^ ((g11 & 4294967295L) | (g12 << 32));
        jArr2[1] = jArr2[1] ^ j11;
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] k11 = v60.f.k();
        j(jArr, k11);
        n(k11, jArr2);
    }

    public static void q(long[] jArr, long[] jArr2) {
        long[] k11 = v60.f.k();
        j(jArr, k11);
        b(jArr2, k11, jArr2);
    }

    public static void r(long[] jArr, int i11, long[] jArr2) {
        long[] k11 = v60.f.k();
        j(jArr, k11);
        while (true) {
            n(k11, jArr2);
            i11--;
            if (i11 <= 0) {
                return;
            }
            j(jArr2, k11);
        }
    }

    public static int s(long[] jArr) {
        return ((int) (jArr[0] ^ (jArr[2] >>> 29))) & 1;
    }
}