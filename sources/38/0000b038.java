package r50;

import r70.g;
import r70.i;

/* loaded from: classes5.dex */
public abstract class d {
    public static byte a(byte[] bArr, byte[] bArr2) {
        int i11 = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            i11 |= bArr[i12] ^ bArr2[i12];
        }
        return (byte) ((((i11 >>> 1) | (i11 & 1)) - 1) >> 31);
    }

    public static void b(long[] jArr, byte[] bArr) {
        i.t(jArr, 0, 2, bArr, 0);
    }

    public static void c(byte[] bArr, long[] jArr) {
        i.d(bArr, 0, jArr, 0, 2);
    }

    public static long[] d(byte[] bArr) {
        long[] jArr = new long[2];
        i.d(bArr, 0, jArr, 0, 2);
        return jArr;
    }

    public static void e(byte[] bArr, byte[] bArr2) {
        for (int i11 = 0; i11 < 16; i11++) {
            bArr2[i11] = bArr[i11];
        }
    }

    public static void f(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static void g(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = j11 >> 63;
        jArr2[0] = ((j11 ^ ((-2233785415175766016L) & j13)) << 1) | (j12 >>> 63);
        jArr2[1] = (j12 << 1) | (-j13);
    }

    private static long h(long j11, long j12) {
        long j13 = j11 & 1229782938247303441L;
        long j14 = j11 & 2459565876494606882L;
        long j15 = j11 & 4919131752989213764L;
        long j16 = j11 & (-8608480567731124088L);
        long j17 = j12 & 1229782938247303441L;
        long j18 = j12 & 2459565876494606882L;
        long j19 = j12 & 4919131752989213764L;
        long j21 = j12 & (-8608480567731124088L);
        return (((((j13 * j17) ^ (j14 * j21)) ^ (j15 * j19)) ^ (j16 * j18)) & 1229782938247303441L) | (((((j13 * j18) ^ (j14 * j17)) ^ (j15 * j21)) ^ (j16 * j19)) & 2459565876494606882L) | (((((j13 * j19) ^ (j14 * j18)) ^ (j15 * j17)) ^ (j16 * j21)) & 4919131752989213764L) | (((((j13 * j21) ^ (j14 * j19)) ^ (j15 * j18)) ^ (j16 * j17)) & (-8608480567731124088L));
    }

    public static void i(byte[] bArr, byte[] bArr2) {
        long[] d11 = d(bArr);
        j(d11, d(bArr2));
        b(d11, bArr);
    }

    public static void j(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr2[0];
        long j14 = jArr2[1];
        long a11 = g.a(j11);
        long a12 = g.a(j12);
        long a13 = g.a(j13);
        long a14 = g.a(j14);
        long a15 = g.a(h(a11, a13));
        long h11 = h(j11, j13) << 1;
        long a16 = g.a(h(a12, a14));
        long h12 = h(j12, j14) << 1;
        long h13 = ((h(j11 ^ j12, j13 ^ j14) << 1) ^ ((a16 ^ h11) ^ h12)) ^ ((h12 << 62) ^ (h12 << 57));
        long j15 = h13 >>> 7;
        long j16 = (h13 << 57) ^ ((h13 << 63) ^ (h13 << 62));
        jArr[0] = a15 ^ (j15 ^ ((h13 ^ (h13 >>> 1)) ^ (h13 >>> 2)));
        jArr[1] = j16 ^ ((g.a(h(a11 ^ a12, a13 ^ a14)) ^ ((h11 ^ a15) ^ a16)) ^ (((h12 ^ (h12 >>> 1)) ^ (h12 >>> 2)) ^ (h12 >>> 7)));
    }

    public static void k(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = j12 << 57;
        jArr2[0] = (j13 >>> 7) ^ ((((j11 >>> 7) ^ j13) ^ (j13 >>> 1)) ^ (j13 >>> 2));
        jArr2[1] = (j11 << 57) | (j12 >>> 7);
    }

    public static long[] l() {
        return new long[]{Long.MIN_VALUE};
    }

    public static void m(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        v60.b.d(jArr[0], jArr3, 0);
        v60.b.d(jArr[1], jArr3, 2);
        long j11 = jArr3[0];
        long j12 = jArr3[1];
        long j13 = jArr3[2];
        long j14 = jArr3[3];
        long j15 = j13 ^ ((j14 << 57) ^ ((j14 << 63) ^ (j14 << 62)));
        long j16 = j11 ^ ((((j15 >>> 1) ^ j15) ^ (j15 >>> 2)) ^ (j15 >>> 7));
        jArr2[0] = j16;
        jArr2[1] = (j12 ^ ((((j14 >>> 1) ^ j14) ^ (j14 >>> 2)) ^ (j14 >>> 7))) ^ ((j15 << 57) ^ ((j15 << 63) ^ (j15 << 62)));
    }

    public static void n(byte[] bArr, int i11, byte[] bArr2, int i12, int i13) {
        while (true) {
            i13--;
            if (i13 < 0) {
                return;
            }
            int i14 = i11 + i13;
            bArr[i14] = (byte) (bArr[i14] ^ bArr2[i12 + i13]);
        }
    }

    public static void o(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13) {
        int i14 = 0;
        do {
            bArr3[i13 + i14] = (byte) (bArr[i11 + i14] ^ bArr2[i12 + i14]);
            int i15 = i14 + 1;
            bArr3[i13 + i15] = (byte) (bArr[i11 + i15] ^ bArr2[i12 + i15]);
            int i16 = i15 + 1;
            bArr3[i13 + i16] = (byte) (bArr[i11 + i16] ^ bArr2[i12 + i16]);
            int i17 = i16 + 1;
            bArr3[i13 + i17] = (byte) (bArr[i11 + i17] ^ bArr2[i12 + i17]);
            i14 = i17 + 1;
        } while (i14 < 16);
    }

    public static void p(byte[] bArr, byte[] bArr2) {
        int i11 = 0;
        do {
            bArr[i11] = (byte) (bArr[i11] ^ bArr2[i11]);
            int i12 = i11 + 1;
            bArr[i12] = (byte) (bArr[i12] ^ bArr2[i12]);
            int i13 = i12 + 1;
            bArr[i13] = (byte) (bArr[i13] ^ bArr2[i13]);
            int i14 = i13 + 1;
            bArr[i14] = (byte) (bArr[i14] ^ bArr2[i14]);
            i11 = i14 + 1;
        } while (i11 < 16);
    }

    public static void q(byte[] bArr, byte[] bArr2, int i11) {
        int i12 = 0;
        do {
            bArr[i12] = (byte) (bArr[i12] ^ bArr2[i11 + i12]);
            int i13 = i12 + 1;
            bArr[i13] = (byte) (bArr[i13] ^ bArr2[i11 + i13]);
            int i14 = i13 + 1;
            bArr[i14] = (byte) (bArr[i14] ^ bArr2[i11 + i14]);
            int i15 = i14 + 1;
            bArr[i15] = (byte) (bArr[i15] ^ bArr2[i11 + i15]);
            i12 = i15 + 1;
        } while (i12 < 16);
    }

    public static void r(byte[] bArr, byte[] bArr2, int i11, int i12) {
        while (true) {
            i12--;
            if (i12 < 0) {
                return;
            }
            bArr[i12] = (byte) (bArr[i12] ^ bArr2[i11 + i12]);
        }
    }

    public static void s(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }
}