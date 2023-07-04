package v60;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class e {
    public static int a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j11 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + 0;
        iArr3[0] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L);
        iArr3[1] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L);
        iArr3[2] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L);
        iArr3[3] = (int) j14;
        long j15 = (j14 >>> 32) + (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L);
        iArr3[4] = (int) j15;
        return (int) (j15 >>> 32);
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
        long j15 = (j14 >>> 32) + (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L);
        iArr3[4] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static void c(int[] iArr, int i11, int[] iArr2, int i12) {
        iArr2[i12 + 0] = iArr[i11 + 0];
        iArr2[i12 + 1] = iArr[i11 + 1];
        iArr2[i12 + 2] = iArr[i11 + 2];
        iArr2[i12 + 3] = iArr[i11 + 3];
        iArr2[i12 + 4] = iArr[i11 + 4];
    }

    public static int[] d() {
        return new int[5];
    }

    public static int[] e() {
        return new int[10];
    }

    public static boolean f(int[] iArr, int[] iArr2) {
        for (int i11 = 4; i11 >= 0; i11--) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static int[] g(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 160) {
            throw new IllegalArgumentException();
        }
        int[] d11 = d();
        for (int i11 = 0; i11 < 5; i11++) {
            d11[i11] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return d11;
    }

    public static int h(int[] iArr, int i11) {
        int i12;
        if (i11 == 0) {
            i12 = iArr[0];
        } else {
            int i13 = i11 >> 5;
            if (i13 < 0 || i13 >= 5) {
                return 0;
            }
            i12 = iArr[i13] >>> (i11 & 31);
        }
        return i12 & 1;
    }

    public static boolean i(int[] iArr, int[] iArr2) {
        for (int i11 = 4; i11 >= 0; i11--) {
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

    public static boolean j(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i11 = 1; i11 < 5; i11++) {
            if (iArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(int[] iArr) {
        for (int i11 = 0; i11 < 5; i11++) {
            if (iArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void l(int[] iArr, int[] iArr2, int[] iArr3) {
        long j11 = iArr2[0] & 4294967295L;
        int i11 = 1;
        long j12 = iArr2[1] & 4294967295L;
        long j13 = iArr2[2] & 4294967295L;
        long j14 = iArr2[3] & 4294967295L;
        long j15 = iArr2[4] & 4294967295L;
        long j16 = iArr[0] & 4294967295L;
        long j17 = (j16 * j11) + 0;
        iArr3[0] = (int) j17;
        long j18 = (j17 >>> 32) + (j16 * j12);
        iArr3[1] = (int) j18;
        long j19 = (j18 >>> 32) + (j16 * j13);
        iArr3[2] = (int) j19;
        long j21 = (j19 >>> 32) + (j16 * j14);
        iArr3[3] = (int) j21;
        long j22 = (j21 >>> 32) + (j16 * j15);
        iArr3[4] = (int) j22;
        iArr3[5] = (int) (j22 >>> 32);
        for (int i12 = 5; i11 < i12; i12 = 5) {
            long j23 = iArr[i11] & 4294967295L;
            int i13 = i11 + 0;
            long j24 = (j23 * j11) + (iArr3[i13] & 4294967295L) + 0;
            iArr3[i13] = (int) j24;
            int i14 = i11 + 1;
            long j25 = j12;
            long j26 = (j24 >>> 32) + (j23 * j12) + (iArr3[i14] & 4294967295L);
            iArr3[i14] = (int) j26;
            int i15 = i11 + 2;
            long j27 = j15;
            long j28 = (j26 >>> 32) + (j23 * j13) + (iArr3[i15] & 4294967295L);
            iArr3[i15] = (int) j28;
            int i16 = i11 + 3;
            long j29 = (j28 >>> 32) + (j23 * j14) + (iArr3[i16] & 4294967295L);
            iArr3[i16] = (int) j29;
            int i17 = i11 + 4;
            long j31 = (j29 >>> 32) + (j23 * j27) + (iArr3[i17] & 4294967295L);
            iArr3[i17] = (int) j31;
            iArr3[i11 + 5] = (int) (j31 >>> 32);
            i11 = i14;
            j15 = j27;
            j11 = j11;
            j12 = j25;
        }
    }

    public static long m(int i11, int[] iArr, int i12, int[] iArr2, int i13, int[] iArr3, int i14) {
        long j11 = i11 & 4294967295L;
        long j12 = iArr[i12 + 0] & 4294967295L;
        long j13 = (j11 * j12) + (iArr2[i13 + 0] & 4294967295L) + 0;
        iArr3[i14 + 0] = (int) j13;
        long j14 = iArr[i12 + 1] & 4294967295L;
        long j15 = (j13 >>> 32) + (j11 * j14) + j12 + (iArr2[i13 + 1] & 4294967295L);
        iArr3[i14 + 1] = (int) j15;
        long j16 = j15 >>> 32;
        long j17 = iArr[i12 + 2] & 4294967295L;
        long j18 = j16 + (j11 * j17) + j14 + (iArr2[i13 + 2] & 4294967295L);
        iArr3[i14 + 2] = (int) j18;
        long j19 = iArr[i12 + 3] & 4294967295L;
        long j21 = (j18 >>> 32) + (j11 * j19) + j17 + (iArr2[i13 + 3] & 4294967295L);
        iArr3[i14 + 3] = (int) j21;
        long j22 = iArr[i12 + 4] & 4294967295L;
        long j23 = (j21 >>> 32) + (j11 * j22) + j19 + (4294967295L & iArr2[i13 + 4]);
        iArr3[i14 + 4] = (int) j23;
        return (j23 >>> 32) + j22;
    }

    public static int n(int i11, long j11, int[] iArr, int i12) {
        long j12 = i11 & 4294967295L;
        long j13 = j11 & 4294967295L;
        int i13 = i12 + 0;
        long j14 = (j12 * j13) + (iArr[i13] & 4294967295L) + 0;
        iArr[i13] = (int) j14;
        long j15 = j11 >>> 32;
        long j16 = (j12 * j15) + j13;
        int i14 = i12 + 1;
        long j17 = (j14 >>> 32) + j16 + (iArr[i14] & 4294967295L);
        iArr[i14] = (int) j17;
        int i15 = i12 + 2;
        long j18 = (j17 >>> 32) + j15 + (iArr[i15] & 4294967295L);
        iArr[i15] = (int) j18;
        int i16 = i12 + 3;
        long j19 = (j18 >>> 32) + (4294967295L & iArr[i16]);
        iArr[i16] = (int) j19;
        if ((j19 >>> 32) == 0) {
            return 0;
        }
        return n.y(5, iArr, i12, 4);
    }

    public static int o(int i11, int i12, int[] iArr, int i13) {
        long j11 = i12 & 4294967295L;
        int i14 = i13 + 0;
        long j12 = ((i11 & 4294967295L) * j11) + (iArr[i14] & 4294967295L) + 0;
        iArr[i14] = (int) j12;
        int i15 = i13 + 1;
        long j13 = (j12 >>> 32) + j11 + (iArr[i15] & 4294967295L);
        iArr[i15] = (int) j13;
        long j14 = j13 >>> 32;
        int i16 = i13 + 2;
        long j15 = j14 + (iArr[i16] & 4294967295L);
        iArr[i16] = (int) j15;
        if ((j15 >>> 32) == 0) {
            return 0;
        }
        return n.y(5, iArr, i13, 3);
    }

    public static int p(int[] iArr, int[] iArr2, int[] iArr3) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 0;
        long j11 = 4294967295L;
        long j12 = iArr2[0] & 4294967295L;
        long j13 = iArr2[1] & 4294967295L;
        long j14 = iArr2[2] & 4294967295L;
        long j15 = iArr2[3] & 4294967295L;
        long j16 = iArr2[4] & 4294967295L;
        long j17 = 0;
        while (i16 < 5) {
            long j18 = iArr[i16] & j11;
            long j19 = (j18 * j12) + (iArr3[i11] & j11) + 0;
            iArr3[i16 + 0] = (int) j19;
            int i17 = i16 + 1;
            long j21 = j13;
            long j22 = (j19 >>> 32) + (j18 * j13) + (iArr3[i17] & 4294967295L);
            iArr3[i17] = (int) j22;
            long j23 = j14;
            long j24 = (j22 >>> 32) + (j18 * j14) + (iArr3[i12] & 4294967295L);
            iArr3[i16 + 2] = (int) j24;
            long j25 = (j24 >>> 32) + (j18 * j15) + (iArr3[i13] & 4294967295L);
            iArr3[i16 + 3] = (int) j25;
            long j26 = (j25 >>> 32) + (j18 * j16) + (iArr3[i14] & 4294967295L);
            iArr3[i16 + 4] = (int) j26;
            long j27 = (j26 >>> 32) + (iArr3[i15] & 4294967295L) + j17;
            iArr3[i16 + 5] = (int) j27;
            j17 = j27 >>> 32;
            i16 = i17;
            j11 = 4294967295L;
            j12 = j12;
            j14 = j23;
            j13 = j21;
        }
        return (int) j17;
    }

    public static int q(int i11, int i12, int[] iArr, int i13) {
        int i14 = i13 + 0;
        long j11 = ((i12 & 4294967295L) * (i11 & 4294967295L)) + (iArr[i14] & 4294967295L) + 0;
        iArr[i14] = (int) j11;
        int i15 = i13 + 1;
        long j12 = (j11 >>> 32) + (4294967295L & iArr[i15]);
        iArr[i15] = (int) j12;
        if ((j12 >>> 32) == 0) {
            return 0;
        }
        return n.y(5, iArr, i13, 2);
    }

    public static void r(int[] iArr, int[] iArr2) {
        long j11 = iArr[0] & 4294967295L;
        int i11 = 10;
        int i12 = 0;
        int i13 = 4;
        while (true) {
            int i14 = i13 - 1;
            long j12 = iArr[i13] & 4294967295L;
            long j13 = j12 * j12;
            int i15 = i11 - 1;
            iArr2[i15] = (i12 << 31) | ((int) (j13 >>> 33));
            i11 = i15 - 1;
            iArr2[i11] = (int) (j13 >>> 1);
            int i16 = (int) j13;
            if (i14 <= 0) {
                long j14 = j11 * j11;
                long j15 = ((i16 << 31) & 4294967295L) | (j14 >>> 33);
                iArr2[0] = (int) j14;
                long j16 = iArr[1] & 4294967295L;
                long j17 = j15 + (j16 * j11);
                int i17 = (int) j17;
                iArr2[1] = (i17 << 1) | (((int) (j14 >>> 32)) & 1);
                long j18 = (iArr2[2] & 4294967295L) + (j17 >>> 32);
                long j19 = iArr[2] & 4294967295L;
                long j21 = j18 + (j19 * j11);
                int i18 = (int) j21;
                iArr2[2] = (i18 << 1) | (i17 >>> 31);
                int i19 = i18 >>> 31;
                long j22 = (iArr2[3] & 4294967295L) + (j21 >>> 32) + (j19 * j16);
                long j23 = (iArr2[4] & 4294967295L) + (j22 >>> 32);
                long j24 = iArr[3] & 4294967295L;
                long j25 = (iArr2[5] & 4294967295L) + (j23 >>> 32);
                long j26 = (iArr2[6] & 4294967295L) + (j25 >>> 32);
                long j27 = (j22 & 4294967295L) + (j24 * j11);
                int i21 = (int) j27;
                iArr2[3] = (i21 << 1) | i19;
                int i22 = i21 >>> 31;
                long j28 = (j23 & 4294967295L) + (j27 >>> 32) + (j24 * j16);
                long j29 = (j25 & 4294967295L) + (j28 >>> 32) + (j24 * j19);
                long j31 = j26 + (j29 >>> 32);
                long j32 = iArr[4] & 4294967295L;
                long j33 = (iArr2[7] & 4294967295L) + (j31 >>> 32);
                long j34 = (j28 & 4294967295L) + (j11 * j32);
                int i23 = (int) j34;
                iArr2[4] = (i23 << 1) | i22;
                long j35 = (j29 & 4294967295L) + (j34 >>> 32) + (j32 * j16);
                long j36 = (j31 & 4294967295L) + (j35 >>> 32) + (j32 * j19);
                long j37 = (4294967295L & j33) + (j36 >>> 32) + (j32 * j24);
                long j38 = (iArr2[8] & 4294967295L) + (j33 >>> 32) + (j37 >>> 32);
                int i24 = (int) j35;
                iArr2[5] = (i23 >>> 31) | (i24 << 1);
                int i25 = (int) j36;
                iArr2[6] = (i24 >>> 31) | (i25 << 1);
                int i26 = i25 >>> 31;
                int i27 = (int) j37;
                iArr2[7] = i26 | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) j38;
                iArr2[8] = i28 | (i29 << 1);
                iArr2[9] = (i29 >>> 31) | ((iArr2[9] + ((int) (j38 >>> 32))) << 1);
                return;
            }
            i13 = i14;
            i12 = i16;
        }
    }

    public static int s(int[] iArr, int[] iArr2, int[] iArr3) {
        long j11 = ((iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L)) + 0;
        iArr3[0] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L));
        iArr3[1] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L));
        iArr3[2] = (int) j13;
        long j14 = (j13 >> 32) + ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L));
        iArr3[3] = (int) j14;
        long j15 = (j14 >> 32) + ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L));
        iArr3[4] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static int t(int[] iArr, int[] iArr2) {
        long j11 = ((iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L)) + 0;
        iArr2[0] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L));
        iArr2[1] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L));
        iArr2[2] = (int) j13;
        long j14 = (j13 >> 32) + ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L));
        iArr2[3] = (int) j14;
        long j15 = (j14 >> 32) + ((iArr2[4] & 4294967295L) - (4294967295L & iArr[4]));
        iArr2[4] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static BigInteger u(int[] iArr) {
        byte[] bArr = new byte[20];
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 != 0) {
                r70.i.f(i12, bArr, (4 - i11) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }
}