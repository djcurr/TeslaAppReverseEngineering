package v60;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class f {
    public static int A(int i11, int i12, int[] iArr, int i13) {
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
        return n.y(6, iArr, i13, 3);
    }

    public static int B(int[] iArr, int[] iArr2, int[] iArr3) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 0;
        long j11 = 4294967295L;
        long j12 = iArr2[0] & 4294967295L;
        long j13 = iArr2[1] & 4294967295L;
        long j14 = iArr2[2] & 4294967295L;
        long j15 = iArr2[3] & 4294967295L;
        long j16 = iArr2[4] & 4294967295L;
        long j17 = iArr2[5] & 4294967295L;
        long j18 = 0;
        while (i17 < 6) {
            long j19 = j17;
            long j21 = iArr[i17] & j11;
            long j22 = j12;
            long j23 = (j21 * j12) + (iArr3[i11] & j11) + 0;
            iArr3[i17 + 0] = (int) j23;
            int i18 = i17 + 1;
            long j24 = (j23 >>> 32) + (j21 * j13) + (iArr3[i18] & 4294967295L);
            iArr3[i18] = (int) j24;
            long j25 = (j24 >>> 32) + (j21 * j14) + (iArr3[i12] & 4294967295L);
            iArr3[i17 + 2] = (int) j25;
            long j26 = (j25 >>> 32) + (j21 * j15) + (iArr3[i13] & 4294967295L);
            iArr3[i17 + 3] = (int) j26;
            long j27 = (j26 >>> 32) + (j21 * j16) + (iArr3[i14] & 4294967295L);
            iArr3[i17 + 4] = (int) j27;
            long j28 = (j27 >>> 32) + (j21 * j19) + (iArr3[i15] & 4294967295L);
            iArr3[i17 + 5] = (int) j28;
            long j29 = (j28 >>> 32) + (iArr3[i16] & 4294967295L) + j18;
            iArr3[i17 + 6] = (int) j29;
            j18 = j29 >>> 32;
            i17 = i18;
            j11 = 4294967295L;
            j17 = j19;
            j12 = j22;
            j13 = j13;
            j14 = j14;
        }
        return (int) j18;
    }

    public static void C(int[] iArr, int i11, int[] iArr2, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        long j11 = iArr[i11 + 0] & 4294967295L;
        int i23 = 0;
        int i24 = 12;
        int i25 = 5;
        while (true) {
            int i26 = i25 - 1;
            long j12 = iArr[i11 + i25] & 4294967295L;
            long j13 = j12 * j12;
            int i27 = i24 - 1;
            iArr2[i12 + i27] = (i23 << 31) | ((int) (j13 >>> 33));
            i24 = i27 - 1;
            iArr2[i12 + i24] = (int) (j13 >>> 1);
            i23 = (int) j13;
            if (i26 <= 0) {
                long j14 = j11 * j11;
                iArr2[i12 + 0] = (int) j14;
                long j15 = iArr[i11 + 1] & 4294967295L;
                long j16 = (((i23 << 31) & 4294967295L) | (j14 >>> 33)) + (j15 * j11);
                int i28 = (int) j16;
                iArr2[i12 + 1] = (i28 << 1) | (((int) (j14 >>> 32)) & 1);
                int i29 = i28 >>> 31;
                long j17 = (iArr2[i13] & 4294967295L) + (j16 >>> 32);
                long j18 = iArr[i11 + 2] & 4294967295L;
                long j19 = j17 + (j18 * j11);
                int i31 = (int) j19;
                iArr2[i12 + 2] = (i31 << 1) | i29;
                int i32 = i31 >>> 31;
                long j21 = (iArr2[i14] & 4294967295L) + (j19 >>> 32) + (j18 * j15);
                long j22 = (iArr2[i15] & 4294967295L) + (j21 >>> 32);
                long j23 = iArr[i11 + 3] & 4294967295L;
                long j24 = (iArr2[i16] & 4294967295L) + (j22 >>> 32);
                long j25 = (iArr2[i17] & 4294967295L) + (j24 >>> 32);
                long j26 = (j21 & 4294967295L) + (j23 * j11);
                int i33 = (int) j26;
                iArr2[i12 + 3] = (i33 << 1) | i32;
                long j27 = (j22 & 4294967295L) + (j26 >>> 32) + (j23 * j15);
                long j28 = (j24 & 4294967295L) + (j27 >>> 32) + (j23 * j18);
                long j29 = j25 + (j28 >>> 32);
                long j31 = j28 & 4294967295L;
                long j32 = iArr[i11 + 4] & 4294967295L;
                long j33 = (iArr2[i18] & 4294967295L) + (j29 >>> 32);
                long j34 = j29 & 4294967295L;
                long j35 = (j27 & 4294967295L) + (j32 * j11);
                int i34 = (int) j35;
                iArr2[i12 + 4] = (i33 >>> 31) | (i34 << 1);
                int i35 = i34 >>> 31;
                long j36 = j31 + (j35 >>> 32) + (j32 * j15);
                long j37 = j34 + (j36 >>> 32) + (j32 * j18);
                long j38 = (j33 & 4294967295L) + (j37 >>> 32) + (j32 * j23);
                long j39 = (iArr2[i19] & 4294967295L) + (j33 >>> 32) + (j38 >>> 32);
                long j41 = j38 & 4294967295L;
                long j42 = iArr[i11 + 5] & 4294967295L;
                long j43 = (iArr2[i21] & 4294967295L) + (j39 >>> 32);
                long j44 = (j36 & 4294967295L) + (j11 * j42);
                int i36 = (int) j44;
                iArr2[i12 + 5] = (i36 << 1) | i35;
                long j45 = (j37 & 4294967295L) + (j44 >>> 32) + (j42 * j15);
                long j46 = j41 + (j45 >>> 32) + (j42 * j18);
                long j47 = (j39 & 4294967295L) + (j46 >>> 32) + (j42 * j23);
                long j48 = (j43 & 4294967295L) + (j47 >>> 32) + (j42 * j32);
                long j49 = (iArr2[i22] & 4294967295L) + (j43 >>> 32) + (j48 >>> 32);
                int i37 = (int) j45;
                iArr2[i12 + 6] = (i36 >>> 31) | (i37 << 1);
                int i38 = (int) j46;
                iArr2[i12 + 7] = (i37 >>> 31) | (i38 << 1);
                int i39 = i38 >>> 31;
                int i41 = (int) j47;
                iArr2[i12 + 8] = i39 | (i41 << 1);
                int i42 = i41 >>> 31;
                int i43 = (int) j48;
                iArr2[i12 + 9] = i42 | (i43 << 1);
                int i44 = i43 >>> 31;
                int i45 = (int) j49;
                iArr2[i12 + 10] = i44 | (i45 << 1);
                int i46 = i45 >>> 31;
                int i47 = i12 + 11;
                iArr2[i47] = i46 | ((iArr2[i47] + ((int) (j49 >>> 32))) << 1);
                return;
            }
            i25 = i26;
        }
    }

    public static void D(int[] iArr, int[] iArr2) {
        long j11 = iArr[0] & 4294967295L;
        int i11 = 12;
        int i12 = 0;
        int i13 = 5;
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
                long j36 = (j29 & 4294967295L) + (j34 * j11);
                int i21 = (int) j36;
                iArr2[4] = (i19 >>> 31) | (i21 << 1);
                long j37 = j33 + (j36 >>> 32) + (j34 * j16);
                long j38 = (j32 & 4294967295L) + (j37 >>> 32) + (j34 * j19);
                long j39 = (j35 & 4294967295L) + (j38 >>> 32) + (j34 * j24);
                long j41 = (iArr2[8] & 4294967295L) + (j35 >>> 32) + (j39 >>> 32);
                long j42 = iArr[5] & 4294967295L;
                long j43 = (iArr2[9] & 4294967295L) + (j41 >>> 32);
                long j44 = (j37 & 4294967295L) + (j11 * j42);
                int i22 = (int) j44;
                iArr2[5] = (i21 >>> 31) | (i22 << 1);
                int i23 = i22 >>> 31;
                long j45 = (j38 & 4294967295L) + (j44 >>> 32) + (j16 * j42);
                long j46 = (j39 & 4294967295L) + (j45 >>> 32) + (j42 * j19);
                long j47 = (j41 & 4294967295L) + (j46 >>> 32) + (j42 * j24);
                long j48 = (j43 & 4294967295L) + (j47 >>> 32) + (j42 * j34);
                long j49 = (iArr2[10] & 4294967295L) + (j43 >>> 32) + (j48 >>> 32);
                int i24 = (int) j45;
                iArr2[6] = i23 | (i24 << 1);
                int i25 = (int) j46;
                iArr2[7] = (i24 >>> 31) | (i25 << 1);
                int i26 = i25 >>> 31;
                int i27 = (int) j47;
                iArr2[8] = i26 | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) j48;
                iArr2[9] = i28 | (i29 << 1);
                int i31 = i29 >>> 31;
                int i32 = (int) j49;
                iArr2[10] = i31 | (i32 << 1);
                iArr2[11] = (i32 >>> 31) | ((iArr2[11] + ((int) (j49 >>> 32))) << 1);
                return;
            }
            i13 = i14;
            i12 = i16;
        }
    }

    public static int E(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j11 = ((iArr[i11 + 0] & 4294967295L) - (iArr2[i12 + 0] & 4294967295L)) + 0;
        iArr3[i13 + 0] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr[i11 + 1] & 4294967295L) - (iArr2[i12 + 1] & 4294967295L));
        iArr3[i13 + 1] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr[i11 + 2] & 4294967295L) - (iArr2[i12 + 2] & 4294967295L));
        iArr3[i13 + 2] = (int) j13;
        long j14 = (j13 >> 32) + ((iArr[i11 + 3] & 4294967295L) - (iArr2[i12 + 3] & 4294967295L));
        iArr3[i13 + 3] = (int) j14;
        long j15 = (j14 >> 32) + ((iArr[i11 + 4] & 4294967295L) - (iArr2[i12 + 4] & 4294967295L));
        iArr3[i13 + 4] = (int) j15;
        long j16 = (j15 >> 32) + ((iArr[i11 + 5] & 4294967295L) - (iArr2[i12 + 5] & 4294967295L));
        iArr3[i13 + 5] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static int F(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j16 >> 32);
    }

    public static int G(int[] iArr, int[] iArr2) {
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
        long j16 = (j15 >> 32) + ((iArr2[5] & 4294967295L) - (4294967295L & iArr[5]));
        iArr2[5] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static BigInteger H(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i11 = 0; i11 < 6; i11++) {
            int i12 = iArr[i11];
            if (i12 != 0) {
                r70.i.f(i12, bArr, (5 - i11) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger I(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i11 = 0; i11 < 3; i11++) {
            long j11 = jArr[i11];
            if (j11 != 0) {
                r70.i.s(j11, bArr, (2 - i11) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

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
        return (int) (j16 >>> 32);
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
        return (int) (j16 >>> 32);
    }

    public static int c(int[] iArr, int i11, int[] iArr2, int i12, int i13) {
        int i14 = i12 + 0;
        long j11 = (i13 & 4294967295L) + (iArr[i11 + 0] & 4294967295L) + (iArr2[i14] & 4294967295L);
        iArr2[i14] = (int) j11;
        int i15 = i12 + 1;
        long j12 = (j11 >>> 32) + (iArr[i11 + 1] & 4294967295L) + (iArr2[i15] & 4294967295L);
        iArr2[i15] = (int) j12;
        int i16 = i12 + 2;
        long j13 = (j12 >>> 32) + (iArr[i11 + 2] & 4294967295L) + (iArr2[i16] & 4294967295L);
        iArr2[i16] = (int) j13;
        int i17 = i12 + 3;
        long j14 = (j13 >>> 32) + (iArr[i11 + 3] & 4294967295L) + (iArr2[i17] & 4294967295L);
        iArr2[i17] = (int) j14;
        int i18 = i12 + 4;
        long j15 = (j14 >>> 32) + (iArr[i11 + 4] & 4294967295L) + (iArr2[i18] & 4294967295L);
        iArr2[i18] = (int) j15;
        int i19 = i12 + 5;
        long j16 = (j15 >>> 32) + (iArr[i11 + 5] & 4294967295L) + (4294967295L & iArr2[i19]);
        iArr2[i19] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int d(int[] iArr, int i11, int[] iArr2, int i12) {
        int i13 = i11 + 0;
        int i14 = i12 + 0;
        long j11 = (iArr[i13] & 4294967295L) + (iArr2[i14] & 4294967295L) + 0;
        int i15 = (int) j11;
        iArr[i13] = i15;
        iArr2[i14] = i15;
        int i16 = i11 + 1;
        int i17 = i12 + 1;
        long j12 = (j11 >>> 32) + (iArr[i16] & 4294967295L) + (iArr2[i17] & 4294967295L);
        int i18 = (int) j12;
        iArr[i16] = i18;
        iArr2[i17] = i18;
        int i19 = i11 + 2;
        int i21 = i12 + 2;
        long j13 = (j12 >>> 32) + (iArr[i19] & 4294967295L) + (iArr2[i21] & 4294967295L);
        int i22 = (int) j13;
        iArr[i19] = i22;
        iArr2[i21] = i22;
        int i23 = i11 + 3;
        int i24 = i12 + 3;
        long j14 = (j13 >>> 32) + (iArr[i23] & 4294967295L) + (iArr2[i24] & 4294967295L);
        int i25 = (int) j14;
        iArr[i23] = i25;
        iArr2[i24] = i25;
        int i26 = i11 + 4;
        int i27 = i12 + 4;
        long j15 = (j14 >>> 32) + (iArr[i26] & 4294967295L) + (iArr2[i27] & 4294967295L);
        int i28 = (int) j15;
        iArr[i26] = i28;
        iArr2[i27] = i28;
        int i29 = i11 + 5;
        int i31 = i12 + 5;
        long j16 = (j15 >>> 32) + (iArr[i29] & 4294967295L) + (4294967295L & iArr2[i31]);
        int i32 = (int) j16;
        iArr[i29] = i32;
        iArr2[i31] = i32;
        return (int) (j16 >>> 32);
    }

    public static void e(int[] iArr, int i11, int[] iArr2, int i12) {
        iArr2[i12 + 0] = iArr[i11 + 0];
        iArr2[i12 + 1] = iArr[i11 + 1];
        iArr2[i12 + 2] = iArr[i11 + 2];
        iArr2[i12 + 3] = iArr[i11 + 3];
        iArr2[i12 + 4] = iArr[i11 + 4];
        iArr2[i12 + 5] = iArr[i11 + 5];
    }

    public static void f(long[] jArr, int i11, long[] jArr2, int i12) {
        jArr2[i12 + 0] = jArr[i11 + 0];
        jArr2[i12 + 1] = jArr[i11 + 1];
        jArr2[i12 + 2] = jArr[i11 + 2];
    }

    public static void g(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static int[] h() {
        return new int[6];
    }

    public static long[] i() {
        return new long[3];
    }

    public static int[] j() {
        return new int[12];
    }

    public static long[] k() {
        return new long[6];
    }

    public static boolean l(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        boolean q11 = q(iArr, i11, iArr2, i12);
        if (q11) {
            E(iArr, i11, iArr2, i12, iArr3, i13);
        } else {
            E(iArr2, i12, iArr, i11, iArr3, i13);
        }
        return q11;
    }

    public static boolean m(int[] iArr, int[] iArr2) {
        for (int i11 = 5; i11 >= 0; i11--) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static boolean n(long[] jArr, long[] jArr2) {
        for (int i11 = 2; i11 >= 0; i11--) {
            if (jArr[i11] != jArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static int[] o(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] h11 = h();
        for (int i11 = 0; i11 < 6; i11++) {
            h11[i11] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return h11;
    }

    public static int p(int[] iArr, int i11) {
        int i12;
        if (i11 == 0) {
            i12 = iArr[0];
        } else {
            int i13 = i11 >> 5;
            if (i13 < 0 || i13 >= 6) {
                return 0;
            }
            i12 = iArr[i13] >>> (i11 & 31);
        }
        return i12 & 1;
    }

    public static boolean q(int[] iArr, int i11, int[] iArr2, int i12) {
        for (int i13 = 5; i13 >= 0; i13--) {
            int i14 = iArr[i11 + i13] ^ Integer.MIN_VALUE;
            int i15 = Integer.MIN_VALUE ^ iArr2[i12 + i13];
            if (i14 < i15) {
                return false;
            }
            if (i14 > i15) {
                return true;
            }
        }
        return true;
    }

    public static boolean r(int[] iArr, int[] iArr2) {
        for (int i11 = 5; i11 >= 0; i11--) {
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

    public static boolean s(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i11 = 1; i11 < 6; i11++) {
            if (iArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean t(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i11 = 1; i11 < 3; i11++) {
            if (jArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean u(int[] iArr) {
        for (int i11 = 0; i11 < 6; i11++) {
            if (iArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean v(long[] jArr) {
        for (int i11 = 0; i11 < 3; i11++) {
            if (jArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void w(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        long j11 = iArr2[i12 + 0] & 4294967295L;
        long j12 = iArr2[i12 + 1] & 4294967295L;
        long j13 = iArr2[i12 + 2] & 4294967295L;
        long j14 = iArr2[i12 + 3] & 4294967295L;
        long j15 = iArr2[i12 + 4] & 4294967295L;
        long j16 = iArr2[i12 + 5] & 4294967295L;
        long j17 = iArr[i11 + 0] & 4294967295L;
        long j18 = (j17 * j11) + 0;
        iArr3[i13 + 0] = (int) j18;
        long j19 = (j18 >>> 32) + (j17 * j12);
        iArr3[i13 + 1] = (int) j19;
        long j21 = (j19 >>> 32) + (j17 * j13);
        iArr3[i13 + 2] = (int) j21;
        long j22 = (j21 >>> 32) + (j17 * j14);
        iArr3[i13 + 3] = (int) j22;
        long j23 = (j22 >>> 32) + (j17 * j15);
        iArr3[i13 + 4] = (int) j23;
        long j24 = (j23 >>> 32) + (j17 * j16);
        iArr3[i13 + 5] = (int) j24;
        iArr3[i13 + 6] = (int) (j24 >>> 32);
        int i21 = 1;
        int i22 = i13;
        int i23 = 1;
        while (i23 < 6) {
            i22 += i21;
            long j25 = iArr[i11 + i23] & 4294967295L;
            long j26 = (j25 * j11) + (iArr3[i14] & 4294967295L) + 0;
            iArr3[i22 + 0] = (int) j26;
            long j27 = j16;
            long j28 = (j26 >>> 32) + (j25 * j12) + (iArr3[i15] & 4294967295L);
            iArr3[i22 + 1] = (int) j28;
            long j29 = (j28 >>> 32) + (j25 * j13) + (iArr3[i16] & 4294967295L);
            iArr3[i22 + 2] = (int) j29;
            long j31 = (j29 >>> 32) + (j25 * j14) + (iArr3[i17] & 4294967295L);
            iArr3[i22 + 3] = (int) j31;
            long j32 = (j31 >>> 32) + (j25 * j15) + (iArr3[i18] & 4294967295L);
            iArr3[i22 + 4] = (int) j32;
            long j33 = (j32 >>> 32) + (j25 * j27) + (iArr3[i19] & 4294967295L);
            iArr3[i22 + 5] = (int) j33;
            iArr3[i22 + 6] = (int) (j33 >>> 32);
            i23++;
            j13 = j13;
            j16 = j27;
            i21 = 1;
        }
    }

    public static void x(int[] iArr, int[] iArr2, int[] iArr3) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j11 = iArr2[0] & 4294967295L;
        long j12 = iArr2[1] & 4294967295L;
        long j13 = iArr2[2] & 4294967295L;
        long j14 = iArr2[3] & 4294967295L;
        long j15 = iArr2[4] & 4294967295L;
        long j16 = iArr2[5] & 4294967295L;
        long j17 = iArr[0] & 4294967295L;
        long j18 = (j17 * j11) + 0;
        iArr3[0] = (int) j18;
        long j19 = (j18 >>> 32) + (j17 * j12);
        iArr3[1] = (int) j19;
        long j21 = (j19 >>> 32) + (j17 * j13);
        iArr3[2] = (int) j21;
        long j22 = (j21 >>> 32) + (j17 * j14);
        iArr3[3] = (int) j22;
        long j23 = (j22 >>> 32) + (j17 * j15);
        iArr3[4] = (int) j23;
        long j24 = (j23 >>> 32) + (j17 * j16);
        iArr3[5] = (int) j24;
        iArr3[6] = (int) (j24 >>> 32);
        int i16 = 1;
        for (int i17 = 6; i16 < i17; i17 = 6) {
            long j25 = iArr[i16] & 4294967295L;
            long j26 = (j25 * j11) + (iArr3[i11] & 4294967295L) + 0;
            iArr3[i16 + 0] = (int) j26;
            int i18 = i16 + 1;
            long j27 = j12;
            long j28 = (j26 >>> 32) + (j25 * j12) + (iArr3[i18] & 4294967295L);
            iArr3[i18] = (int) j28;
            long j29 = j16;
            long j31 = (j28 >>> 32) + (j25 * j13) + (iArr3[i12] & 4294967295L);
            iArr3[i16 + 2] = (int) j31;
            long j32 = (j31 >>> 32) + (j25 * j14) + (iArr3[i13] & 4294967295L);
            iArr3[i16 + 3] = (int) j32;
            long j33 = (j32 >>> 32) + (j25 * j15) + (iArr3[i14] & 4294967295L);
            iArr3[i16 + 4] = (int) j33;
            long j34 = (j33 >>> 32) + (j25 * j29) + (iArr3[i15] & 4294967295L);
            iArr3[i16 + 5] = (int) j34;
            iArr3[i16 + 6] = (int) (j34 >>> 32);
            i16 = i18;
            j11 = j11;
            j12 = j27;
            j16 = j29;
        }
    }

    public static long y(int i11, int[] iArr, int i12, int[] iArr2, int i13, int[] iArr3, int i14) {
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
        long j25 = (j23 >>> 32) + (j11 * j24) + j22 + (4294967295L & iArr2[i13 + 5]);
        iArr3[i14 + 5] = (int) j25;
        return (j25 >>> 32) + j24;
    }

    public static int z(int i11, long j11, int[] iArr, int i12) {
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
        return n.y(6, iArr, i12, 4);
    }
}