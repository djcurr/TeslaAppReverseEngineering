package q60;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class a1 {

    /* renamed from: a  reason: collision with root package name */
    private static final long[] f47799a = {2791191049453778211L, 2791191049453778402L, 6};

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
        jArr3[4] = jArr2[4] ^ jArr[4];
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
        return v60.n.s(com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE, bigInteger);
    }

    public static void f(long[] jArr, long[] jArr2) {
        long[] l11 = v60.n.l(5);
        v60.f.g(jArr, jArr2);
        for (int i11 = 1; i11 < 131; i11 += 2) {
            j(jArr2, l11);
            n(l11, jArr2);
            j(jArr2, l11);
            n(l11, jArr2);
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
        jArr[0] = j11 ^ (j12 << 44);
        jArr[1] = (j12 >>> 20) ^ (j13 << 24);
        jArr[2] = ((j13 >>> 40) ^ (j14 << 4)) ^ (j15 << 48);
        jArr[3] = ((j14 >>> 60) ^ (j16 << 28)) ^ (j15 >>> 16);
        jArr[4] = j16 >>> 36;
        jArr[5] = 0;
    }

    protected static void h(long[] jArr, long[] jArr2, long[] jArr3) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = ((jArr[2] << 40) ^ (j12 >>> 24)) & 17592186044415L;
        long j14 = ((j12 << 20) ^ (j11 >>> 44)) & 17592186044415L;
        long j15 = j11 & 17592186044415L;
        long j16 = jArr2[0];
        long j17 = jArr2[1];
        long j18 = ((j17 >>> 24) ^ (jArr2[2] << 40)) & 17592186044415L;
        long j19 = ((j17 << 20) ^ (j16 >>> 44)) & 17592186044415L;
        long j21 = j16 & 17592186044415L;
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
        long j35 = (((j32 ^ j29) ^ (jArr4[3] << 4)) ^ (jArr4[3] << 1)) ^ (j34 >>> 44);
        long j36 = (j33 ^ j27) ^ (j35 >>> 44);
        long j37 = j35 & 17592186044415L;
        long j38 = ((j34 & 17592186044415L) >>> 1) ^ ((j37 & 1) << 43);
        long j39 = j38 ^ (j38 << 1);
        long j41 = j39 ^ (j39 << 2);
        long j42 = j41 ^ (j41 << 4);
        long j43 = j42 ^ (j42 << 8);
        long j44 = j43 ^ (j43 << 16);
        long j45 = (j44 ^ (j44 << 32)) & 17592186044415L;
        long j46 = ((j37 >>> 1) ^ ((j36 & 1) << 43)) ^ (j45 >>> 43);
        long j47 = j46 ^ (j46 << 1);
        long j48 = j47 ^ (j47 << 2);
        long j49 = j48 ^ (j48 << 4);
        long j51 = j49 ^ (j49 << 8);
        long j52 = j51 ^ (j51 << 16);
        long j53 = (j52 ^ (j52 << 32)) & 17592186044415L;
        long j54 = (j36 >>> 1) ^ (j53 >>> 43);
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
        int i12 = (int) j11;
        long j13 = (((jArr[i12 & 7] ^ (jArr[(i12 >>> 3) & 7] << 3)) ^ (jArr[(i12 >>> 6) & 7] << 6)) ^ (jArr[(i12 >>> 9) & 7] << 9)) ^ (jArr[(i12 >>> 12) & 7] << 12);
        long j14 = 0;
        int i13 = 30;
        do {
            int i14 = (int) (j11 >>> i13);
            long j15 = (((jArr[i14 & 7] ^ (jArr[(i14 >>> 3) & 7] << 3)) ^ (jArr[(i14 >>> 6) & 7] << 6)) ^ (jArr[(i14 >>> 9) & 7] << 9)) ^ (jArr[(i14 >>> 12) & 7] << 12);
            j13 ^= j15 << i13;
            j14 ^= j15 >>> (-i13);
            i13 -= 15;
        } while (i13 > 0);
        jArr2[i11] = 17592186044415L & j13;
        jArr2[i11 + 1] = (j13 >>> 44) ^ (j14 << 20);
    }

    protected static void j(long[] jArr, long[] jArr2) {
        v60.b.c(jArr, 0, 2, jArr2, 0);
        jArr2[4] = v60.b.e((int) jArr[2]) & 4294967295L;
    }

    public static void k(long[] jArr, long[] jArr2) {
        if (v60.f.v(jArr)) {
            throw new IllegalStateException();
        }
        long[] i11 = v60.f.i();
        long[] i12 = v60.f.i();
        p(jArr, i11);
        l(i11, jArr, i11);
        r(i11, 2, i12);
        l(i12, i11, i12);
        r(i12, 4, i11);
        l(i11, i12, i11);
        r(i11, 8, i12);
        l(i12, i11, i12);
        r(i12, 16, i11);
        l(i11, i12, i11);
        r(i11, 32, i12);
        l(i12, i11, i12);
        p(i12, i12);
        l(i12, jArr, i12);
        r(i12, 65, i11);
        l(i11, i12, i11);
        p(i11, jArr2);
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
        long j16 = j14 ^ (j15 >>> 59);
        long j17 = j11 ^ ((j16 << 61) ^ (j16 << 63));
        long j18 = (j12 ^ ((j15 << 61) ^ (j15 << 63))) ^ ((((j16 >>> 3) ^ (j16 >>> 1)) ^ j16) ^ (j16 << 5));
        long j19 = (j13 ^ ((((j15 >>> 3) ^ (j15 >>> 1)) ^ j15) ^ (j15 << 5))) ^ (j16 >>> 59);
        long j21 = j19 >>> 3;
        jArr2[0] = (((j17 ^ j21) ^ (j21 << 2)) ^ (j21 << 3)) ^ (j21 << 8);
        jArr2[1] = (j21 >>> 56) ^ j18;
        jArr2[2] = 7 & j19;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] i11 = v60.f.i();
        long g11 = v60.b.g(jArr[0]);
        long g12 = v60.b.g(jArr[1]);
        i11[0] = (g11 >>> 32) | (g12 & (-4294967296L));
        long g13 = v60.b.g(jArr[2]);
        long j11 = g13 & 4294967295L;
        i11[1] = g13 >>> 32;
        l(i11, f47799a, jArr2);
        jArr2[0] = jArr2[0] ^ ((g11 & 4294967295L) | (g12 << 32));
        jArr2[1] = jArr2[1] ^ j11;
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] l11 = v60.n.l(5);
        j(jArr, l11);
        n(l11, jArr2);
    }

    public static void q(long[] jArr, long[] jArr2) {
        long[] l11 = v60.n.l(5);
        j(jArr, l11);
        b(jArr2, l11, jArr2);
    }

    public static void r(long[] jArr, int i11, long[] jArr2) {
        long[] l11 = v60.n.l(5);
        j(jArr, l11);
        while (true) {
            n(l11, jArr2);
            i11--;
            if (i11 <= 0) {
                return;
            }
            j(jArr2, l11);
        }
    }

    public static int s(long[] jArr) {
        return ((int) ((jArr[0] ^ (jArr[1] >>> 59)) ^ (jArr[2] >>> 1))) & 1;
    }
}