package v60;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class h {
    public static int A(int i11, long j11, int[] iArr, int i12) {
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
        return n.y(8, iArr, i12, 4);
    }

    public static int B(int i11, int i12, int[] iArr, int i13) {
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
        return n.y(8, iArr, i13, 3);
    }

    public static int C(int[] iArr, int[] iArr2, int[] iArr3) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j11 = iArr2[0] & 4294967295L;
        long j12 = iArr2[1] & 4294967295L;
        long j13 = iArr2[2] & 4294967295L;
        long j14 = iArr2[3] & 4294967295L;
        long j15 = iArr2[4] & 4294967295L;
        long j16 = iArr2[5] & 4294967295L;
        long j17 = iArr2[6] & 4294967295L;
        long j18 = iArr2[7] & 4294967295L;
        long j19 = 0;
        int i19 = 0;
        while (i19 < 8) {
            long j21 = j18;
            long j22 = iArr[i19] & 4294967295L;
            long j23 = j16;
            long j24 = (j22 * j11) + (iArr3[i11] & 4294967295L) + 0;
            iArr3[i19 + 0] = (int) j24;
            int i21 = i19 + 1;
            long j25 = j12;
            long j26 = (j24 >>> 32) + (j22 * j12) + (iArr3[i21] & 4294967295L);
            iArr3[i21] = (int) j26;
            long j27 = (j26 >>> 32) + (j22 * j13) + (iArr3[i12] & 4294967295L);
            iArr3[i19 + 2] = (int) j27;
            long j28 = (j27 >>> 32) + (j22 * j14) + (iArr3[i13] & 4294967295L);
            iArr3[i19 + 3] = (int) j28;
            long j29 = (j28 >>> 32) + (j22 * j15) + (iArr3[i14] & 4294967295L);
            iArr3[i19 + 4] = (int) j29;
            long j31 = (j29 >>> 32) + (j22 * j23) + (iArr3[i15] & 4294967295L);
            iArr3[i19 + 5] = (int) j31;
            long j32 = (j31 >>> 32) + (j22 * j17) + (iArr3[i16] & 4294967295L);
            iArr3[i19 + 6] = (int) j32;
            long j33 = (j32 >>> 32) + (j22 * j21) + (iArr3[i17] & 4294967295L);
            iArr3[i19 + 7] = (int) j33;
            long j34 = (j33 >>> 32) + (iArr3[i18] & 4294967295L) + j19;
            iArr3[i19 + 8] = (int) j34;
            j19 = j34 >>> 32;
            i19 = i21;
            j18 = j21;
            j16 = j23;
            j12 = j25;
        }
        return (int) j19;
    }

    public static int D(int i11, int[] iArr, int[] iArr2) {
        long j11 = i11 & 4294967295L;
        long j12 = ((iArr2[0] & 4294967295L) * j11) + (iArr[0] & 4294967295L) + 0;
        iArr2[0] = (int) j12;
        long j13 = (j12 >>> 32) + ((iArr2[1] & 4294967295L) * j11) + (iArr[1] & 4294967295L);
        iArr2[1] = (int) j13;
        long j14 = (j13 >>> 32) + ((iArr2[2] & 4294967295L) * j11) + (iArr[2] & 4294967295L);
        iArr2[2] = (int) j14;
        long j15 = (j14 >>> 32) + ((iArr2[3] & 4294967295L) * j11) + (iArr[3] & 4294967295L);
        iArr2[3] = (int) j15;
        long j16 = (j15 >>> 32) + ((iArr2[4] & 4294967295L) * j11) + (iArr[4] & 4294967295L);
        iArr2[4] = (int) j16;
        long j17 = (j16 >>> 32) + ((iArr2[5] & 4294967295L) * j11) + (iArr[5] & 4294967295L);
        iArr2[5] = (int) j17;
        long j18 = (j17 >>> 32) + ((iArr2[6] & 4294967295L) * j11) + (iArr[6] & 4294967295L);
        iArr2[6] = (int) j18;
        long j19 = (j18 >>> 32) + (j11 * (iArr2[7] & 4294967295L)) + (4294967295L & iArr[7]);
        iArr2[7] = (int) j19;
        return (int) (j19 >>> 32);
    }

    public static void E(int[] iArr, int i11, int[] iArr2, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        long j11 = iArr[i11 + 0] & 4294967295L;
        int i27 = 0;
        int i28 = 16;
        int i29 = 7;
        while (true) {
            int i31 = i29 - 1;
            long j12 = iArr[i11 + i29] & 4294967295L;
            long j13 = j12 * j12;
            int i32 = i28 - 1;
            iArr2[i12 + i32] = (i27 << 31) | ((int) (j13 >>> 33));
            i28 = i32 - 1;
            iArr2[i12 + i28] = (int) (j13 >>> 1);
            i27 = (int) j13;
            if (i31 <= 0) {
                long j14 = j11 * j11;
                iArr2[i12 + 0] = (int) j14;
                long j15 = iArr[i11 + 1] & 4294967295L;
                long j16 = (((i27 << 31) & 4294967295L) | (j14 >>> 33)) + (j15 * j11);
                int i33 = (int) j16;
                iArr2[i12 + 1] = (i33 << 1) | (((int) (j14 >>> 32)) & 1);
                int i34 = i33 >>> 31;
                long j17 = (iArr2[i13] & 4294967295L) + (j16 >>> 32);
                long j18 = iArr[i11 + 2] & 4294967295L;
                long j19 = j17 + (j18 * j11);
                int i35 = (int) j19;
                iArr2[i12 + 2] = (i35 << 1) | i34;
                int i36 = i35 >>> 31;
                long j21 = (iArr2[i14] & 4294967295L) + (j19 >>> 32) + (j18 * j15);
                long j22 = (iArr2[i15] & 4294967295L) + (j21 >>> 32);
                long j23 = iArr[i11 + 3] & 4294967295L;
                long j24 = (iArr2[i16] & 4294967295L) + (j22 >>> 32);
                long j25 = (iArr2[i17] & 4294967295L) + (j24 >>> 32);
                long j26 = (j21 & 4294967295L) + (j23 * j11);
                int i37 = (int) j26;
                iArr2[i12 + 3] = (i37 << 1) | i36;
                long j27 = (j22 & 4294967295L) + (j26 >>> 32) + (j23 * j15);
                long j28 = (j24 & 4294967295L) + (j27 >>> 32) + (j23 * j18);
                long j29 = j25 + (j28 >>> 32);
                long j31 = j28 & 4294967295L;
                long j32 = iArr[i11 + 4] & 4294967295L;
                long j33 = (iArr2[i18] & 4294967295L) + (j29 >>> 32);
                long j34 = j29 & 4294967295L;
                long j35 = (j27 & 4294967295L) + (j32 * j11);
                int i38 = (int) j35;
                iArr2[i12 + 4] = (i37 >>> 31) | (i38 << 1);
                int i39 = i38 >>> 31;
                long j36 = j31 + (j35 >>> 32) + (j32 * j15);
                long j37 = j34 + (j36 >>> 32) + (j32 * j18);
                long j38 = (j33 & 4294967295L) + (j37 >>> 32) + (j32 * j23);
                long j39 = (iArr2[i19] & 4294967295L) + (j33 >>> 32) + (j38 >>> 32);
                long j41 = j38 & 4294967295L;
                long j42 = iArr[i11 + 5] & 4294967295L;
                long j43 = (iArr2[i21] & 4294967295L) + (j39 >>> 32);
                long j44 = (j36 & 4294967295L) + (j42 * j11);
                int i41 = (int) j44;
                iArr2[i12 + 5] = i39 | (i41 << 1);
                int i42 = i41 >>> 31;
                long j45 = (j37 & 4294967295L) + (j44 >>> 32) + (j42 * j15);
                long j46 = j41 + (j45 >>> 32) + (j42 * j18);
                long j47 = (j39 & 4294967295L) + (j46 >>> 32) + (j42 * j23);
                long j48 = (j43 & 4294967295L) + (j47 >>> 32) + (j42 * j32);
                long j49 = j47 & 4294967295L;
                long j51 = (iArr2[i22] & 4294967295L) + (j43 >>> 32) + (j48 >>> 32);
                long j52 = j48 & 4294967295L;
                long j53 = iArr[i11 + 6] & 4294967295L;
                long j54 = (iArr2[i23] & 4294967295L) + (j51 >>> 32);
                long j55 = j51 & 4294967295L;
                long j56 = (iArr2[i24] & 4294967295L) + (j54 >>> 32);
                long j57 = (j45 & 4294967295L) + (j53 * j11);
                int i43 = (int) j57;
                iArr2[i12 + 6] = i42 | (i43 << 1);
                int i44 = i43 >>> 31;
                long j58 = (j46 & 4294967295L) + (j57 >>> 32) + (j53 * j15);
                long j59 = j49 + (j58 >>> 32) + (j53 * j18);
                long j61 = j52 + (j59 >>> 32) + (j53 * j23);
                long j62 = j59 & 4294967295L;
                long j63 = j55 + (j61 >>> 32) + (j53 * j32);
                long j64 = (j54 & 4294967295L) + (j63 >>> 32) + (j53 * j42);
                long j65 = j56 + (j64 >>> 32);
                long j66 = j64 & 4294967295L;
                long j67 = iArr[i11 + 7] & 4294967295L;
                long j68 = (iArr2[i25] & 4294967295L) + (j65 >>> 32);
                long j69 = (j58 & 4294967295L) + (j11 * j67);
                int i45 = (int) j69;
                iArr2[i12 + 7] = (i45 << 1) | i44;
                long j71 = j62 + (j69 >>> 32) + (j67 * j15);
                long j72 = (j61 & 4294967295L) + (j71 >>> 32) + (j67 * j18);
                long j73 = (j63 & 4294967295L) + (j72 >>> 32) + (j67 * j23);
                long j74 = j66 + (j73 >>> 32) + (j67 * j32);
                long j75 = (j65 & 4294967295L) + (j74 >>> 32) + (j67 * j42);
                long j76 = (j68 & 4294967295L) + (j75 >>> 32) + (j67 * j53);
                long j77 = (iArr2[i26] & 4294967295L) + (j68 >>> 32) + (j76 >>> 32);
                int i46 = (int) j71;
                iArr2[i12 + 8] = (i45 >>> 31) | (i46 << 1);
                int i47 = i46 >>> 31;
                int i48 = (int) j72;
                iArr2[i12 + 9] = i47 | (i48 << 1);
                int i49 = i48 >>> 31;
                int i51 = (int) j73;
                iArr2[i12 + 10] = i49 | (i51 << 1);
                int i52 = i51 >>> 31;
                int i53 = (int) j74;
                iArr2[i12 + 11] = i52 | (i53 << 1);
                int i54 = i53 >>> 31;
                int i55 = (int) j75;
                iArr2[i12 + 12] = i54 | (i55 << 1);
                int i56 = i55 >>> 31;
                int i57 = (int) j76;
                iArr2[i12 + 13] = i56 | (i57 << 1);
                int i58 = i57 >>> 31;
                int i59 = (int) j77;
                iArr2[i12 + 14] = i58 | (i59 << 1);
                int i61 = i59 >>> 31;
                int i62 = i12 + 15;
                iArr2[i62] = i61 | ((iArr2[i62] + ((int) (j77 >>> 32))) << 1);
                return;
            }
            i29 = i31;
        }
    }

    public static void F(int[] iArr, int[] iArr2) {
        long j11 = iArr[0] & 4294967295L;
        int i11 = 16;
        int i12 = 0;
        int i13 = 7;
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
                int i22 = i21 >>> 31;
                long j37 = j33 + (j36 >>> 32) + (j34 * j16);
                long j38 = (j32 & 4294967295L) + (j37 >>> 32) + (j34 * j19);
                long j39 = (j35 & 4294967295L) + (j38 >>> 32) + (j34 * j24);
                long j41 = (iArr2[8] & 4294967295L) + (j35 >>> 32) + (j39 >>> 32);
                long j42 = j39 & 4294967295L;
                long j43 = iArr[5] & 4294967295L;
                long j44 = (iArr2[9] & 4294967295L) + (j41 >>> 32);
                long j45 = j41 & 4294967295L;
                long j46 = (iArr2[10] & 4294967295L) + (j44 >>> 32);
                long j47 = (j37 & 4294967295L) + (j43 * j11);
                int i23 = (int) j47;
                iArr2[5] = (i23 << 1) | i22;
                long j48 = (j38 & 4294967295L) + (j47 >>> 32) + (j43 * j16);
                long j49 = j42 + (j48 >>> 32) + (j43 * j19);
                long j51 = j45 + (j49 >>> 32) + (j43 * j24);
                long j52 = (j44 & 4294967295L) + (j51 >>> 32) + (j43 * j34);
                long j53 = j46 + (j52 >>> 32);
                long j54 = iArr[6] & 4294967295L;
                long j55 = (iArr2[11] & 4294967295L) + (j53 >>> 32);
                long j56 = j53 & 4294967295L;
                long j57 = (iArr2[12] & 4294967295L) + (j55 >>> 32);
                long j58 = (j48 & 4294967295L) + (j54 * j11);
                int i24 = (int) j58;
                iArr2[6] = (i24 << 1) | (i23 >>> 31);
                long j59 = (j49 & 4294967295L) + (j58 >>> 32) + (j54 * j16);
                long j61 = (j51 & 4294967295L) + (j59 >>> 32) + (j54 * j19);
                long j62 = (j52 & 4294967295L) + (j61 >>> 32) + (j54 * j24);
                long j63 = j56 + (j62 >>> 32) + (j54 * j34);
                long j64 = (j55 & 4294967295L) + (j63 >>> 32) + (j54 * j43);
                long j65 = j57 + (j64 >>> 32);
                long j66 = j64 & 4294967295L;
                long j67 = iArr[7] & 4294967295L;
                long j68 = (iArr2[13] & 4294967295L) + (j65 >>> 32);
                long j69 = (j59 & 4294967295L) + (j11 * j67);
                int i25 = (int) j69;
                iArr2[7] = (i24 >>> 31) | (i25 << 1);
                int i26 = i25 >>> 31;
                long j71 = (j61 & 4294967295L) + (j69 >>> 32) + (j16 * j67);
                long j72 = (j62 & 4294967295L) + (j71 >>> 32) + (j67 * j19);
                long j73 = (j63 & 4294967295L) + (j72 >>> 32) + (j67 * j24);
                long j74 = j66 + (j73 >>> 32) + (j67 * j34);
                long j75 = (j65 & 4294967295L) + (j74 >>> 32) + (j67 * j43);
                long j76 = (j68 & 4294967295L) + (j75 >>> 32) + (j67 * j54);
                long j77 = (iArr2[14] & 4294967295L) + (j68 >>> 32) + (j76 >>> 32);
                int i27 = (int) j71;
                iArr2[8] = i26 | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) j72;
                iArr2[9] = i28 | (i29 << 1);
                int i31 = i29 >>> 31;
                int i32 = (int) j73;
                iArr2[10] = i31 | (i32 << 1);
                int i33 = i32 >>> 31;
                int i34 = (int) j74;
                iArr2[11] = i33 | (i34 << 1);
                int i35 = i34 >>> 31;
                int i36 = (int) j75;
                iArr2[12] = i35 | (i36 << 1);
                int i37 = i36 >>> 31;
                int i38 = (int) j76;
                iArr2[13] = i37 | (i38 << 1);
                int i39 = i38 >>> 31;
                int i41 = (int) j77;
                iArr2[14] = i39 | (i41 << 1);
                iArr2[15] = (i41 >>> 31) | ((iArr2[15] + ((int) (j77 >>> 32))) << 1);
                return;
            }
            i13 = i14;
            i12 = i16;
        }
    }

    public static int G(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
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
        long j17 = (j16 >> 32) + ((iArr[i11 + 6] & 4294967295L) - (iArr2[i12 + 6] & 4294967295L));
        iArr3[i13 + 6] = (int) j17;
        long j18 = (j17 >> 32) + ((iArr[i11 + 7] & 4294967295L) - (iArr2[i12 + 7] & 4294967295L));
        iArr3[i13 + 7] = (int) j18;
        return (int) (j18 >> 32);
    }

    public static int H(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j18 = (j17 >> 32) + ((iArr[7] & 4294967295L) - (iArr2[7] & 4294967295L));
        iArr3[7] = (int) j18;
        return (int) (j18 >> 32);
    }

    public static int I(int[] iArr, int[] iArr2) {
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
        long j17 = (j16 >> 32) + ((iArr2[6] & 4294967295L) - (iArr[6] & 4294967295L));
        iArr2[6] = (int) j17;
        long j18 = (j17 >> 32) + ((iArr2[7] & 4294967295L) - (4294967295L & iArr[7]));
        iArr2[7] = (int) j18;
        return (int) (j18 >> 32);
    }

    public static BigInteger J(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = iArr[i11];
            if (i12 != 0) {
                r70.i.f(i12, bArr, (7 - i11) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger K(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i11 = 0; i11 < 4; i11++) {
            long j11 = jArr[i11];
            if (j11 != 0) {
                r70.i.s(j11, bArr, (3 - i11) << 3);
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
        long j17 = (j16 >>> 32) + (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L);
        iArr3[6] = (int) j17;
        long j18 = (j17 >>> 32) + (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L);
        iArr3[7] = (int) j18;
        return (int) (j18 >>> 32);
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
        long j18 = (j17 >>> 32) + (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L) + (iArr3[7] & 4294967295L);
        iArr3[7] = (int) j18;
        return (int) (j18 >>> 32);
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
        long j16 = (j15 >>> 32) + (iArr[i11 + 5] & 4294967295L) + (iArr2[i19] & 4294967295L);
        iArr2[i19] = (int) j16;
        int i21 = i12 + 6;
        long j17 = (j16 >>> 32) + (iArr[i11 + 6] & 4294967295L) + (iArr2[i21] & 4294967295L);
        iArr2[i21] = (int) j17;
        int i22 = i12 + 7;
        long j18 = (j17 >>> 32) + (iArr[i11 + 7] & 4294967295L) + (4294967295L & iArr2[i22]);
        iArr2[i22] = (int) j18;
        return (int) (j18 >>> 32);
    }

    public static int d(int[] iArr, int[] iArr2) {
        long j11 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + 0;
        iArr2[0] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L);
        iArr2[1] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L);
        iArr2[2] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L);
        iArr2[3] = (int) j14;
        long j15 = (j14 >>> 32) + (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L);
        iArr2[4] = (int) j15;
        long j16 = (j15 >>> 32) + (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L);
        iArr2[5] = (int) j16;
        long j17 = (j16 >>> 32) + (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L);
        iArr2[6] = (int) j17;
        long j18 = (j17 >>> 32) + (iArr[7] & 4294967295L) + (4294967295L & iArr2[7]);
        iArr2[7] = (int) j18;
        return (int) (j18 >>> 32);
    }

    public static int e(int[] iArr, int i11, int[] iArr2, int i12) {
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
        long j16 = (j15 >>> 32) + (iArr[i29] & 4294967295L) + (iArr2[i31] & 4294967295L);
        int i32 = (int) j16;
        iArr[i29] = i32;
        iArr2[i31] = i32;
        int i33 = i11 + 6;
        int i34 = i12 + 6;
        long j17 = (j16 >>> 32) + (iArr[i33] & 4294967295L) + (iArr2[i34] & 4294967295L);
        int i35 = (int) j17;
        iArr[i33] = i35;
        iArr2[i34] = i35;
        int i36 = i11 + 7;
        int i37 = i12 + 7;
        long j18 = (j17 >>> 32) + (iArr[i36] & 4294967295L) + (4294967295L & iArr2[i37]);
        int i38 = (int) j18;
        iArr[i36] = i38;
        iArr2[i37] = i38;
        return (int) (j18 >>> 32);
    }

    public static void f(int[] iArr, int i11, int[] iArr2, int i12) {
        iArr2[i12 + 0] = iArr[i11 + 0];
        iArr2[i12 + 1] = iArr[i11 + 1];
        iArr2[i12 + 2] = iArr[i11 + 2];
        iArr2[i12 + 3] = iArr[i11 + 3];
        iArr2[i12 + 4] = iArr[i11 + 4];
        iArr2[i12 + 5] = iArr[i11 + 5];
        iArr2[i12 + 6] = iArr[i11 + 6];
        iArr2[i12 + 7] = iArr[i11 + 7];
    }

    public static void g(long[] jArr, int i11, long[] jArr2, int i12) {
        jArr2[i12 + 0] = jArr[i11 + 0];
        jArr2[i12 + 1] = jArr[i11 + 1];
        jArr2[i12 + 2] = jArr[i11 + 2];
        jArr2[i12 + 3] = jArr[i11 + 3];
    }

    public static void h(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static int[] i() {
        return new int[8];
    }

    public static long[] j() {
        return new long[4];
    }

    public static int[] k() {
        return new int[16];
    }

    public static long[] l() {
        return new long[8];
    }

    public static boolean m(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        boolean r11 = r(iArr, i11, iArr2, i12);
        if (r11) {
            G(iArr, i11, iArr2, i12, iArr3, i13);
        } else {
            G(iArr2, i12, iArr, i11, iArr3, i13);
        }
        return r11;
    }

    public static boolean n(int[] iArr, int[] iArr2) {
        for (int i11 = 7; i11 >= 0; i11--) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static boolean o(long[] jArr, long[] jArr2) {
        for (int i11 = 3; i11 >= 0; i11--) {
            if (jArr[i11] != jArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static int[] p(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] i11 = i();
        for (int i12 = 0; i12 < 8; i12++) {
            i11[i12] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return i11;
    }

    public static int q(int[] iArr, int i11) {
        int i12;
        if (i11 == 0) {
            i12 = iArr[0];
        } else if ((i11 & 255) != i11) {
            return 0;
        } else {
            i12 = iArr[i11 >>> 5] >>> (i11 & 31);
        }
        return i12 & 1;
    }

    public static boolean r(int[] iArr, int i11, int[] iArr2, int i12) {
        for (int i13 = 7; i13 >= 0; i13--) {
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

    public static boolean s(int[] iArr, int[] iArr2) {
        for (int i11 = 7; i11 >= 0; i11--) {
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

    public static boolean t(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i11 = 1; i11 < 8; i11++) {
            if (iArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean u(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i11 = 1; i11 < 4; i11++) {
            if (jArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean v(int[] iArr) {
        for (int i11 = 0; i11 < 8; i11++) {
            if (iArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean w(long[] jArr) {
        for (int i11 = 0; i11 < 4; i11++) {
            if (jArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void x(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        long j11 = iArr2[i12 + 0] & 4294967295L;
        long j12 = iArr2[i12 + 1] & 4294967295L;
        long j13 = iArr2[i12 + 2] & 4294967295L;
        long j14 = iArr2[i12 + 3] & 4294967295L;
        long j15 = iArr2[i12 + 4] & 4294967295L;
        long j16 = iArr2[i12 + 5] & 4294967295L;
        long j17 = iArr2[i12 + 6] & 4294967295L;
        long j18 = iArr[i11 + 0] & 4294967295L;
        long j19 = (j18 * j11) + 0;
        iArr3[i13 + 0] = (int) j19;
        long j21 = (j19 >>> 32) + (j18 * j12);
        iArr3[i13 + 1] = (int) j21;
        long j22 = (j21 >>> 32) + (j18 * j13);
        iArr3[i13 + 2] = (int) j22;
        long j23 = (j22 >>> 32) + (j18 * j14);
        iArr3[i13 + 3] = (int) j23;
        long j24 = (j23 >>> 32) + (j18 * j15);
        iArr3[i13 + 4] = (int) j24;
        long j25 = (j24 >>> 32) + (j18 * j16);
        iArr3[i13 + 5] = (int) j25;
        long j26 = (j25 >>> 32) + (j18 * j17);
        iArr3[i13 + 6] = (int) j26;
        long j27 = iArr2[i12 + 7] & 4294967295L;
        long j28 = (j26 >>> 32) + (j18 * j27);
        iArr3[i13 + 7] = (int) j28;
        iArr3[i13 + 8] = (int) (j28 >>> 32);
        int i23 = 1;
        int i24 = i13;
        int i25 = 1;
        while (i25 < 8) {
            i24 += i23;
            long j29 = iArr[i11 + i25] & 4294967295L;
            long j31 = (j29 * j11) + (iArr3[i14] & 4294967295L) + 0;
            iArr3[i24 + 0] = (int) j31;
            long j32 = j27;
            long j33 = (j31 >>> 32) + (j29 * j12) + (iArr3[i15] & 4294967295L);
            iArr3[i24 + 1] = (int) j33;
            long j34 = j13;
            long j35 = (j33 >>> 32) + (j29 * j13) + (iArr3[i16] & 4294967295L);
            iArr3[i24 + 2] = (int) j35;
            long j36 = (j35 >>> 32) + (j29 * j14) + (iArr3[i17] & 4294967295L);
            iArr3[i24 + 3] = (int) j36;
            long j37 = (j36 >>> 32) + (j29 * j15) + (iArr3[i18] & 4294967295L);
            iArr3[i24 + 4] = (int) j37;
            long j38 = (j37 >>> 32) + (j29 * j16) + (iArr3[i19] & 4294967295L);
            iArr3[i24 + 5] = (int) j38;
            long j39 = (j38 >>> 32) + (j29 * j17) + (iArr3[i21] & 4294967295L);
            iArr3[i24 + 6] = (int) j39;
            long j41 = (j39 >>> 32) + (j29 * j32) + (iArr3[i22] & 4294967295L);
            iArr3[i24 + 7] = (int) j41;
            iArr3[i24 + 8] = (int) (j41 >>> 32);
            i25++;
            j13 = j34;
            j27 = j32;
            j14 = j14;
            i23 = 1;
        }
    }

    public static void y(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j18 = iArr2[7] & 4294967295L;
        long j19 = iArr[0] & 4294967295L;
        long j21 = (j19 * j11) + 0;
        iArr3[0] = (int) j21;
        long j22 = (j21 >>> 32) + (j19 * j12);
        iArr3[1] = (int) j22;
        long j23 = (j22 >>> 32) + (j19 * j13);
        iArr3[2] = (int) j23;
        long j24 = (j23 >>> 32) + (j19 * j14);
        iArr3[3] = (int) j24;
        long j25 = (j24 >>> 32) + (j19 * j15);
        iArr3[4] = (int) j25;
        long j26 = (j25 >>> 32) + (j19 * j16);
        iArr3[5] = (int) j26;
        long j27 = (j26 >>> 32) + (j19 * j17);
        iArr3[6] = (int) j27;
        long j28 = (j27 >>> 32) + (j19 * j18);
        iArr3[7] = (int) j28;
        iArr3[8] = (int) (j28 >>> 32);
        int i18 = 1;
        for (int i19 = 8; i18 < i19; i19 = 8) {
            long j29 = iArr[i18] & 4294967295L;
            long j31 = (j29 * j11) + (iArr3[i11] & 4294967295L) + 0;
            iArr3[i18 + 0] = (int) j31;
            int i21 = i18 + 1;
            long j32 = j12;
            long j33 = (j31 >>> 32) + (j29 * j12) + (iArr3[i21] & 4294967295L);
            iArr3[i21] = (int) j33;
            long j34 = j16;
            long j35 = (j33 >>> 32) + (j29 * j13) + (iArr3[i12] & 4294967295L);
            iArr3[i18 + 2] = (int) j35;
            long j36 = (j35 >>> 32) + (j29 * j14) + (iArr3[i13] & 4294967295L);
            iArr3[i18 + 3] = (int) j36;
            long j37 = (j36 >>> 32) + (j29 * j15) + (iArr3[i14] & 4294967295L);
            iArr3[i18 + 4] = (int) j37;
            long j38 = (j37 >>> 32) + (j29 * j34) + (iArr3[i15] & 4294967295L);
            iArr3[i18 + 5] = (int) j38;
            long j39 = (j38 >>> 32) + (j29 * j17) + (iArr3[i16] & 4294967295L);
            iArr3[i18 + 6] = (int) j39;
            long j41 = (j39 >>> 32) + (j29 * j18) + (iArr3[i17] & 4294967295L);
            iArr3[i18 + 7] = (int) j41;
            iArr3[i18 + 8] = (int) (j41 >>> 32);
            i18 = i21;
            j11 = j11;
            j12 = j32;
            j16 = j34;
        }
    }

    public static long z(int i11, int[] iArr, int i12, int[] iArr2, int i13, int[] iArr3, int i14) {
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
        long j27 = (j25 >>> 32) + (j11 * j26) + j24 + (iArr2[i13 + 6] & 4294967295L);
        iArr3[i14 + 6] = (int) j27;
        long j28 = iArr[i12 + 7] & 4294967295L;
        long j29 = (j27 >>> 32) + (j11 * j28) + j26 + (4294967295L & iArr2[i13 + 7]);
        iArr3[i14 + 7] = (int) j29;
        return (j29 >>> 32) + j28;
    }
}