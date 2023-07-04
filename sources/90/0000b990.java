package v60;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class g {
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
        long j16 = (j15 >>> 32) + (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L);
        iArr3[5] = (int) j16;
        long j17 = (j16 >>> 32) + (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L);
        iArr3[6] = (int) j17;
        return (int) (j17 >>> 32);
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
        long j16 = (j15 >>> 32) + (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L);
        iArr3[5] = (int) j16;
        long j17 = (j16 >>> 32) + (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (iArr3[6] & 4294967295L);
        iArr3[6] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static void c(int[] iArr, int i11, int[] iArr2, int i12) {
        iArr2[i12 + 0] = iArr[i11 + 0];
        iArr2[i12 + 1] = iArr[i11 + 1];
        iArr2[i12 + 2] = iArr[i11 + 2];
        iArr2[i12 + 3] = iArr[i11 + 3];
        iArr2[i12 + 4] = iArr[i11 + 4];
        iArr2[i12 + 5] = iArr[i11 + 5];
        iArr2[i12 + 6] = iArr[i11 + 6];
    }

    public static void d(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static int[] e() {
        return new int[7];
    }

    public static int[] f() {
        return new int[14];
    }

    public static boolean g(int[] iArr, int[] iArr2) {
        for (int i11 = 6; i11 >= 0; i11--) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static int[] h(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            throw new IllegalArgumentException();
        }
        int[] e11 = e();
        for (int i11 = 0; i11 < 7; i11++) {
            e11[i11] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return e11;
    }

    public static int i(int[] iArr, int i11) {
        int i12;
        if (i11 == 0) {
            i12 = iArr[0];
        } else {
            int i13 = i11 >> 5;
            if (i13 < 0 || i13 >= 7) {
                return 0;
            }
            i12 = iArr[i13] >>> (i11 & 31);
        }
        return i12 & 1;
    }

    public static boolean j(int[] iArr, int[] iArr2) {
        for (int i11 = 6; i11 >= 0; i11--) {
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

    public static boolean k(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i11 = 1; i11 < 7; i11++) {
            if (iArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean l(int[] iArr) {
        for (int i11 = 0; i11 < 7; i11++) {
            if (iArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j11 = iArr2[0] & 4294967295L;
        long j12 = iArr2[1] & 4294967295L;
        long j13 = iArr2[2] & 4294967295L;
        long j14 = iArr2[3] & 4294967295L;
        long j15 = iArr2[4] & 4294967295L;
        long j16 = iArr2[5] & 4294967295L;
        long j17 = iArr2[6] & 4294967295L;
        long j18 = iArr[0] & 4294967295L;
        long j19 = (j18 * j11) + 0;
        iArr3[0] = (int) j19;
        long j21 = (j19 >>> 32) + (j18 * j12);
        iArr3[1] = (int) j21;
        long j22 = (j21 >>> 32) + (j18 * j13);
        iArr3[2] = (int) j22;
        long j23 = (j22 >>> 32) + (j18 * j14);
        iArr3[3] = (int) j23;
        long j24 = (j23 >>> 32) + (j18 * j15);
        iArr3[4] = (int) j24;
        long j25 = (j24 >>> 32) + (j18 * j16);
        iArr3[5] = (int) j25;
        long j26 = (j25 >>> 32) + (j18 * j17);
        iArr3[6] = (int) j26;
        iArr3[7] = (int) (j26 >>> 32);
        int i17 = 1;
        for (int i18 = 7; i17 < i18; i18 = 7) {
            long j27 = iArr[i17] & 4294967295L;
            long j28 = (j27 * j11) + (iArr3[i11] & 4294967295L) + 0;
            iArr3[i17 + 0] = (int) j28;
            int i19 = i17 + 1;
            long j29 = j12;
            long j31 = (j28 >>> 32) + (j27 * j12) + (iArr3[i19] & 4294967295L);
            iArr3[i19] = (int) j31;
            long j32 = j16;
            long j33 = (j31 >>> 32) + (j27 * j13) + (iArr3[i12] & 4294967295L);
            iArr3[i17 + 2] = (int) j33;
            long j34 = (j33 >>> 32) + (j27 * j14) + (iArr3[i13] & 4294967295L);
            iArr3[i17 + 3] = (int) j34;
            long j35 = (j34 >>> 32) + (j27 * j15) + (iArr3[i14] & 4294967295L);
            iArr3[i17 + 4] = (int) j35;
            long j36 = (j35 >>> 32) + (j27 * j32) + (iArr3[i15] & 4294967295L);
            iArr3[i17 + 5] = (int) j36;
            long j37 = (j36 >>> 32) + (j27 * j17) + (iArr3[i16] & 4294967295L);
            iArr3[i17 + 6] = (int) j37;
            iArr3[i17 + 7] = (int) (j37 >>> 32);
            i17 = i19;
            j11 = j11;
            j12 = j29;
            j16 = j32;
        }
    }

    public static long n(int i11, int[] iArr, int i12, int[] iArr2, int i13, int[] iArr3, int i14) {
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
        long j23 = (j21 >>> 32) + (j11 * j22) + j19 + (iArr2[i13 + 4] & 4294967295L);
        iArr3[i14 + 4] = (int) j23;
        long j24 = iArr[i12 + 5] & 4294967295L;
        long j25 = (j23 >>> 32) + (j11 * j24) + j22 + (iArr2[i13 + 5] & 4294967295L);
        iArr3[i14 + 5] = (int) j25;
        long j26 = iArr[i12 + 6] & 4294967295L;
        long j27 = (j25 >>> 32) + (j11 * j26) + j24 + (4294967295L & iArr2[i13 + 6]);
        iArr3[i14 + 6] = (int) j27;
        return (j27 >>> 32) + j26;
    }

    public static int o(int i11, long j11, int[] iArr, int i12) {
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
        return n.y(7, iArr, i12, 4);
    }

    public static int p(int i11, int i12, int[] iArr, int i13) {
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
        return n.y(7, iArr, i13, 3);
    }

    public static int q(int[] iArr, int[] iArr2, int[] iArr3) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j11 = iArr2[0] & 4294967295L;
        long j12 = iArr2[1] & 4294967295L;
        long j13 = iArr2[2] & 4294967295L;
        long j14 = iArr2[3] & 4294967295L;
        long j15 = iArr2[4] & 4294967295L;
        long j16 = iArr2[5] & 4294967295L;
        long j17 = iArr2[6] & 4294967295L;
        long j18 = 0;
        int i18 = 0;
        while (i18 < 7) {
            long j19 = j17;
            long j21 = iArr[i18] & 4294967295L;
            long j22 = j16;
            long j23 = (j21 * j11) + (iArr3[i11] & 4294967295L) + 0;
            iArr3[i18 + 0] = (int) j23;
            int i19 = i18 + 1;
            long j24 = j12;
            long j25 = (j23 >>> 32) + (j21 * j12) + (iArr3[i19] & 4294967295L);
            iArr3[i19] = (int) j25;
            long j26 = (j25 >>> 32) + (j21 * j13) + (iArr3[i12] & 4294967295L);
            iArr3[i18 + 2] = (int) j26;
            long j27 = (j26 >>> 32) + (j21 * j14) + (iArr3[i13] & 4294967295L);
            iArr3[i18 + 3] = (int) j27;
            long j28 = (j27 >>> 32) + (j21 * j15) + (iArr3[i14] & 4294967295L);
            iArr3[i18 + 4] = (int) j28;
            long j29 = (j28 >>> 32) + (j21 * j22) + (iArr3[i15] & 4294967295L);
            iArr3[i18 + 5] = (int) j29;
            long j31 = (j29 >>> 32) + (j21 * j19) + (iArr3[i16] & 4294967295L);
            iArr3[i18 + 6] = (int) j31;
            long j32 = (j31 >>> 32) + (iArr3[i17] & 4294967295L) + j18;
            iArr3[i18 + 7] = (int) j32;
            j18 = j32 >>> 32;
            i18 = i19;
            j17 = j19;
            j16 = j22;
            j12 = j24;
        }
        return (int) j18;
    }

    public static void r(int[] iArr, int[] iArr2) {
        long j11 = iArr[0] & 4294967295L;
        int i11 = 14;
        int i12 = 0;
        int i13 = 6;
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
                long j22 = (iArr2[3] & 4294967295L) + (j21 >>> 32) + (j19 * j16);
                long j23 = (iArr2[4] & 4294967295L) + (j22 >>> 32);
                long j24 = iArr[3] & 4294967295L;
                long j25 = (iArr2[5] & 4294967295L) + (j23 >>> 32);
                long j26 = j23 & 4294967295L;
                long j27 = (iArr2[6] & 4294967295L) + (j25 >>> 32);
                long j28 = (j22 & 4294967295L) + (j24 * j11);
                int i19 = (int) j28;
                iArr2[3] = (i19 << 1) | (i18 >>> 31);
                long j29 = j26 + (j28 >>> 32) + (j24 * j16);
                long j31 = (j25 & 4294967295L) + (j29 >>> 32) + (j24 * j19);
                long j32 = j27 + (j31 >>> 32);
                long j33 = j31 & 4294967295L;
                long j34 = iArr[4] & 4294967295L;
                long j35 = (iArr2[7] & 4294967295L) + (j32 >>> 32);
                long j36 = j32 & 4294967295L;
                long j37 = (iArr2[8] & 4294967295L) + (j35 >>> 32);
                long j38 = (j29 & 4294967295L) + (j34 * j11);
                int i21 = (int) j38;
                iArr2[4] = (i19 >>> 31) | (i21 << 1);
                long j39 = j33 + (j38 >>> 32) + (j34 * j16);
                long j41 = j36 + (j39 >>> 32) + (j34 * j19);
                long j42 = (j35 & 4294967295L) + (j41 >>> 32) + (j34 * j24);
                long j43 = j37 + (j42 >>> 32);
                long j44 = iArr[5] & 4294967295L;
                long j45 = (iArr2[9] & 4294967295L) + (j43 >>> 32);
                long j46 = j43 & 4294967295L;
                long j47 = (iArr2[10] & 4294967295L) + (j45 >>> 32);
                long j48 = (j39 & 4294967295L) + (j44 * j11);
                int i22 = (int) j48;
                iArr2[5] = (i22 << 1) | (i21 >>> 31);
                long j49 = (j41 & 4294967295L) + (j48 >>> 32) + (j44 * j16);
                long j51 = (j42 & 4294967295L) + (j49 >>> 32) + (j44 * j19);
                long j52 = j46 + (j51 >>> 32) + (j44 * j24);
                long j53 = (j45 & 4294967295L) + (j52 >>> 32) + (j44 * j34);
                long j54 = j47 + (j53 >>> 32);
                long j55 = j53 & 4294967295L;
                long j56 = iArr[6] & 4294967295L;
                long j57 = (iArr2[11] & 4294967295L) + (j54 >>> 32);
                long j58 = (j49 & 4294967295L) + (j11 * j56);
                int i23 = (int) j58;
                iArr2[6] = (i22 >>> 31) | (i23 << 1);
                int i24 = i23 >>> 31;
                long j59 = (j51 & 4294967295L) + (j58 >>> 32) + (j16 * j56);
                long j61 = (j52 & 4294967295L) + (j59 >>> 32) + (j56 * j19);
                long j62 = j55 + (j61 >>> 32) + (j56 * j24);
                long j63 = (j54 & 4294967295L) + (j62 >>> 32) + (j56 * j34);
                long j64 = (j57 & 4294967295L) + (j63 >>> 32) + (j56 * j44);
                long j65 = (iArr2[12] & 4294967295L) + (j57 >>> 32) + (j64 >>> 32);
                int i25 = (int) j59;
                iArr2[7] = i24 | (i25 << 1);
                int i26 = (int) j61;
                iArr2[8] = (i25 >>> 31) | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) j62;
                iArr2[9] = i27 | (i28 << 1);
                int i29 = i28 >>> 31;
                int i31 = (int) j63;
                iArr2[10] = i29 | (i31 << 1);
                int i32 = i31 >>> 31;
                int i33 = (int) j64;
                iArr2[11] = i32 | (i33 << 1);
                int i34 = i33 >>> 31;
                int i35 = (int) j65;
                iArr2[12] = i34 | (i35 << 1);
                iArr2[13] = (i35 >>> 31) | ((iArr2[13] + ((int) (j65 >>> 32))) << 1);
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
        long j16 = (j15 >> 32) + ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L));
        iArr3[5] = (int) j16;
        long j17 = (j16 >> 32) + ((iArr[6] & 4294967295L) - (iArr2[6] & 4294967295L));
        iArr3[6] = (int) j17;
        return (int) (j17 >> 32);
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
        long j15 = (j14 >> 32) + ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L));
        iArr2[4] = (int) j15;
        long j16 = (j15 >> 32) + ((iArr2[5] & 4294967295L) - (iArr[5] & 4294967295L));
        iArr2[5] = (int) j16;
        long j17 = (j16 >> 32) + ((iArr2[6] & 4294967295L) - (4294967295L & iArr[6]));
        iArr2[6] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static BigInteger u(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i11 = 0; i11 < 7; i11++) {
            int i12 = iArr[i11];
            if (i12 != 0) {
                r70.i.f(i12, bArr, (6 - i11) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }
}