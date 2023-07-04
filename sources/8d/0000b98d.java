package v60;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class d {
    public static int a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j11 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + 0;
        iArr3[0] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L);
        iArr3[1] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L);
        iArr3[2] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L);
        iArr3[3] = (int) j14;
        return (int) (j14 >>> 32);
    }

    public static int b(int[] iArr, int[] iArr2, int[] iArr3) {
        long j11 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L) + 0;
        iArr3[0] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L);
        iArr3[1] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L);
        iArr3[2] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L);
        iArr3[3] = (int) j14;
        return (int) (j14 >>> 32);
    }

    public static void c(int[] iArr, int i11, int[] iArr2, int i12) {
        iArr2[i12 + 0] = iArr[i11 + 0];
        iArr2[i12 + 1] = iArr[i11 + 1];
        iArr2[i12 + 2] = iArr[i11 + 2];
        iArr2[i12 + 3] = iArr[i11 + 3];
    }

    public static void d(long[] jArr, int i11, long[] jArr2, int i12) {
        jArr2[i12 + 0] = jArr[i11 + 0];
        jArr2[i12 + 1] = jArr[i11 + 1];
    }

    public static void e(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static int[] f() {
        return new int[4];
    }

    public static long[] g() {
        return new long[2];
    }

    public static int[] h() {
        return new int[8];
    }

    public static long[] i() {
        return new long[4];
    }

    public static boolean j(int[] iArr, int[] iArr2) {
        for (int i11 = 3; i11 >= 0; i11--) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(long[] jArr, long[] jArr2) {
        for (int i11 = 1; i11 >= 0; i11--) {
            if (jArr[i11] != jArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static int[] l(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        int[] f11 = f();
        for (int i11 = 0; i11 < 4; i11++) {
            f11[i11] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return f11;
    }

    public static int m(int[] iArr, int i11) {
        int i12;
        if (i11 == 0) {
            i12 = iArr[0];
        } else {
            int i13 = i11 >> 5;
            if (i13 < 0 || i13 >= 4) {
                return 0;
            }
            i12 = iArr[i13] >>> (i11 & 31);
        }
        return i12 & 1;
    }

    public static boolean n(int[] iArr, int[] iArr2) {
        for (int i11 = 3; i11 >= 0; i11--) {
            int i12 = iArr[i11] ^ Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE ^ iArr2[i11];
            if (i12 < i13) {
                return false;
            }
            if (i12 > i13) {
                return true;
            }
        }
        return true;
    }

    public static boolean o(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i11 = 1; i11 < 4; i11++) {
            if (iArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean p(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i11 = 1; i11 < 2; i11++) {
            if (jArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean q(int[] iArr) {
        for (int i11 = 0; i11 < 4; i11++) {
            if (iArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean r(long[] jArr) {
        for (int i11 = 0; i11 < 2; i11++) {
            if (jArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void s(int[] iArr, int[] iArr2, int[] iArr3) {
        long j11 = iArr2[0] & 4294967295L;
        int i11 = 1;
        long j12 = iArr2[1] & 4294967295L;
        long j13 = iArr2[2] & 4294967295L;
        long j14 = iArr2[3] & 4294967295L;
        long j15 = iArr[0] & 4294967295L;
        long j16 = (j15 * j11) + 0;
        iArr3[0] = (int) j16;
        char c11 = ' ';
        long j17 = (j16 >>> 32) + (j15 * j12);
        iArr3[1] = (int) j17;
        long j18 = (j17 >>> 32) + (j15 * j13);
        iArr3[2] = (int) j18;
        long j19 = (j18 >>> 32) + (j15 * j14);
        iArr3[3] = (int) j19;
        iArr3[4] = (int) (j19 >>> 32);
        for (int i12 = 4; i11 < i12; i12 = 4) {
            long j21 = iArr[i11] & 4294967295L;
            int i13 = i11 + 0;
            int i14 = i11;
            long j22 = (j21 * j11) + (iArr3[i13] & 4294967295L) + 0;
            iArr3[i13] = (int) j22;
            int i15 = i14 + 1;
            long j23 = j11;
            long j24 = (j22 >>> c11) + (j21 * j12) + (iArr3[i15] & 4294967295L);
            iArr3[i15] = (int) j24;
            int i16 = i14 + 2;
            long j25 = (j24 >>> 32) + (j21 * j13) + (iArr3[i16] & 4294967295L);
            iArr3[i16] = (int) j25;
            c11 = ' ';
            int i17 = i14 + 3;
            long j26 = (j25 >>> 32) + (j21 * j14) + (iArr3[i17] & 4294967295L);
            iArr3[i17] = (int) j26;
            iArr3[i14 + 4] = (int) (j26 >>> 32);
            i11 = i15;
            j11 = j23;
            j12 = j12;
        }
    }

    public static int t(int[] iArr, int[] iArr2, int[] iArr3) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        long j11 = 4294967295L;
        long j12 = iArr2[0] & 4294967295L;
        long j13 = iArr2[1] & 4294967295L;
        long j14 = iArr2[2] & 4294967295L;
        long j15 = iArr2[3] & 4294967295L;
        long j16 = 0;
        while (i15 < 4) {
            long j17 = iArr[i15] & j11;
            long j18 = (j17 * j12) + (iArr3[i11] & j11) + 0;
            iArr3[i15 + 0] = (int) j18;
            int i16 = i15 + 1;
            long j19 = (j18 >>> 32) + (j17 * j13) + (iArr3[i16] & 4294967295L);
            iArr3[i16] = (int) j19;
            long j21 = (j19 >>> 32) + (j17 * j14) + (iArr3[i12] & 4294967295L);
            iArr3[i15 + 2] = (int) j21;
            long j22 = (j21 >>> 32) + (j17 * j15) + (iArr3[i13] & 4294967295L);
            iArr3[i15 + 3] = (int) j22;
            long j23 = j16 + (j22 >>> 32) + (iArr3[i14] & 4294967295L);
            iArr3[i15 + 4] = (int) j23;
            j16 = j23 >>> 32;
            i15 = i16;
            j11 = 4294967295L;
            j12 = j12;
            j13 = j13;
        }
        return (int) j16;
    }

    public static void u(int[] iArr, int[] iArr2) {
        long j11 = 4294967295L;
        long j12 = iArr[0] & 4294967295L;
        char c11 = 3;
        int i11 = 8;
        int i12 = 0;
        int i13 = 3;
        while (true) {
            int i14 = i13 - 1;
            long j13 = iArr[i13] & j11;
            long j14 = j13 * j13;
            int i15 = i11 - 1;
            iArr2[i15] = (i12 << 31) | ((int) (j14 >>> 33));
            i11 = i15 - 1;
            iArr2[i11] = (int) (j14 >>> 1);
            int i16 = (int) j14;
            if (i14 <= 0) {
                long j15 = j12 * j12;
                long j16 = ((i16 << 31) & j11) | (j15 >>> 33);
                iArr2[0] = (int) j15;
                long j17 = iArr[1] & j11;
                long j18 = j16 + (j17 * j12);
                int i17 = (int) j18;
                iArr2[1] = (i17 << 1) | (((int) (j15 >>> 32)) & 1);
                long j19 = (iArr2[2] & j11) + (j18 >>> 32);
                long j21 = iArr[2] & j11;
                long j22 = iArr2[c11] & j11;
                long j23 = iArr2[4] & j11;
                long j24 = j19 + (j21 * j12);
                int i18 = (int) j24;
                iArr2[2] = (i18 << 1) | (i17 >>> 31);
                long j25 = j22 + (j24 >>> 32) + (j21 * j17);
                long j26 = j23 + (j25 >>> 32);
                long j27 = iArr[3] & 4294967295L;
                long j28 = (iArr2[5] & 4294967295L) + (j26 >>> 32);
                long j29 = (j25 & 4294967295L) + (j12 * j27);
                int i19 = (int) j29;
                iArr2[3] = (i19 << 1) | (i18 >>> 31);
                long j31 = (j26 & 4294967295L) + (j29 >>> 32) + (j17 * j27);
                long j32 = (j28 & 4294967295L) + (j31 >>> 32) + (j27 * j21);
                long j33 = (iArr2[6] & 4294967295L) + (j28 >>> 32) + (j32 >>> 32);
                int i21 = (int) j31;
                iArr2[4] = (i19 >>> 31) | (i21 << 1);
                int i22 = (int) (4294967295L & j32);
                iArr2[5] = (i21 >>> 31) | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) j33;
                iArr2[6] = i23 | (i24 << 1);
                iArr2[7] = (i24 >>> 31) | ((iArr2[7] + ((int) (j33 >>> 32))) << 1);
                return;
            }
            i13 = i14;
            i12 = i16;
            c11 = c11;
            j11 = j11;
        }
    }

    public static int v(int[] iArr, int[] iArr2, int[] iArr3) {
        long j11 = ((iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L)) + 0;
        iArr3[0] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L));
        iArr3[1] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L));
        iArr3[2] = (int) j13;
        long j14 = (j13 >> 32) + ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L));
        iArr3[3] = (int) j14;
        return (int) (j14 >> 32);
    }

    public static int w(int[] iArr, int[] iArr2) {
        long j11 = ((iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L)) + 0;
        iArr2[0] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L));
        iArr2[1] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L));
        iArr2[2] = (int) j13;
        long j14 = (j13 >> 32) + ((iArr2[3] & 4294967295L) - (4294967295L & iArr[3]));
        iArr2[3] = (int) j14;
        return (int) (j14 >> 32);
    }

    public static BigInteger x(int[] iArr) {
        byte[] bArr = new byte[16];
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = iArr[i11];
            if (i12 != 0) {
                r70.i.f(i12, bArr, (3 - i11) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger y(long[] jArr) {
        byte[] bArr = new byte[16];
        for (int i11 = 0; i11 < 2; i11++) {
            long j11 = jArr[i11];
            if (j11 != 0) {
                r70.i.s(j11, bArr, (1 - i11) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }
}