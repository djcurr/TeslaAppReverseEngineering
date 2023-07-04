package org.spongycastle.math.raw;

import java.math.BigInteger;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public abstract class Nat192 {
    private static final long M = 4294967295L;

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j11 = (iArr[0] & M) + (iArr2[0] & M) + 0;
        iArr3[0] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[1] & M) + (iArr2[1] & M);
        iArr3[1] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[2] & M) + (iArr2[2] & M);
        iArr3[2] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[3] & M) + (iArr2[3] & M);
        iArr3[3] = (int) j14;
        long j15 = (j14 >>> 32) + (iArr[4] & M) + (iArr2[4] & M);
        iArr3[4] = (int) j15;
        long j16 = (j15 >>> 32) + (iArr[5] & M) + (iArr2[5] & M);
        iArr3[5] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j11 = (iArr[0] & M) + (iArr2[0] & M) + (iArr3[0] & M) + 0;
        iArr3[0] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[1] & M) + (iArr2[1] & M) + (iArr3[1] & M);
        iArr3[1] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[2] & M) + (iArr2[2] & M) + (iArr3[2] & M);
        iArr3[2] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[3] & M) + (iArr2[3] & M) + (iArr3[3] & M);
        iArr3[3] = (int) j14;
        long j15 = (j14 >>> 32) + (iArr[4] & M) + (iArr2[4] & M) + (iArr3[4] & M);
        iArr3[4] = (int) j15;
        long j16 = (j15 >>> 32) + (iArr[5] & M) + (iArr2[5] & M) + (iArr3[5] & M);
        iArr3[5] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j11 = (iArr[0] & M) + (iArr2[0] & M) + 0;
        iArr2[0] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[1] & M) + (iArr2[1] & M);
        iArr2[1] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[2] & M) + (iArr2[2] & M);
        iArr2[2] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[3] & M) + (iArr2[3] & M);
        iArr2[3] = (int) j14;
        long j15 = (j14 >>> 32) + (iArr[4] & M) + (iArr2[4] & M);
        iArr2[4] = (int) j15;
        long j16 = (j15 >>> 32) + (iArr[5] & M) + (M & iArr2[5]);
        iArr2[5] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i11, int[] iArr2, int i12) {
        int i13 = i11 + 0;
        int i14 = i12 + 0;
        long j11 = (iArr[i13] & M) + (iArr2[i14] & M) + 0;
        int i15 = (int) j11;
        iArr[i13] = i15;
        iArr2[i14] = i15;
        int i16 = i11 + 1;
        int i17 = i12 + 1;
        long j12 = (j11 >>> 32) + (iArr[i16] & M) + (iArr2[i17] & M);
        int i18 = (int) j12;
        iArr[i16] = i18;
        iArr2[i17] = i18;
        int i19 = i11 + 2;
        int i21 = i12 + 2;
        long j13 = (j12 >>> 32) + (iArr[i19] & M) + (iArr2[i21] & M);
        int i22 = (int) j13;
        iArr[i19] = i22;
        iArr2[i21] = i22;
        int i23 = i11 + 3;
        int i24 = i12 + 3;
        long j14 = (j13 >>> 32) + (iArr[i23] & M) + (iArr2[i24] & M);
        int i25 = (int) j14;
        iArr[i23] = i25;
        iArr2[i24] = i25;
        int i26 = i11 + 4;
        int i27 = i12 + 4;
        long j15 = (j14 >>> 32) + (iArr[i26] & M) + (iArr2[i27] & M);
        int i28 = (int) j15;
        iArr[i26] = i28;
        iArr2[i27] = i28;
        int i29 = i11 + 5;
        int i31 = i12 + 5;
        long j16 = (j15 >>> 32) + (iArr[i29] & M) + (M & iArr2[i31]);
        int i32 = (int) j16;
        iArr[i29] = i32;
        iArr2[i31] = i32;
        return (int) (j16 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static int[] create() {
        return new int[6];
    }

    public static long[] create64() {
        return new long[3];
    }

    public static int[] createExt() {
        return new int[12];
    }

    public static long[] createExt64() {
        return new long[6];
    }

    public static boolean diff(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        boolean gte = gte(iArr, i11, iArr2, i12);
        if (gte) {
            sub(iArr, i11, iArr2, i12, iArr3, i13);
        } else {
            sub(iArr2, i12, iArr, i11, iArr3, i13);
        }
        return gte;
    }

    public static boolean eq(int[] iArr, int[] iArr2) {
        for (int i11 = 5; i11 >= 0; i11--) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i11 = 2; i11 >= 0; i11--) {
            if (jArr[i11] != jArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= 192) {
            int[] create = create();
            int i11 = 0;
            while (bigInteger.signum() != 0) {
                create[i11] = bigInteger.intValue();
                bigInteger = bigInteger.shiftRight(32);
                i11++;
            }
            return create;
        }
        throw new IllegalArgumentException();
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= 192) {
            long[] create64 = create64();
            int i11 = 0;
            while (bigInteger.signum() != 0) {
                create64[i11] = bigInteger.longValue();
                bigInteger = bigInteger.shiftRight(64);
                i11++;
            }
            return create64;
        }
        throw new IllegalArgumentException();
    }

    public static int getBit(int[] iArr, int i11) {
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

    public static boolean gte(int[] iArr, int[] iArr2) {
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

    public static boolean isOne(int[] iArr) {
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

    public static boolean isOne64(long[] jArr) {
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

    public static boolean isZero(int[] iArr) {
        for (int i11 = 0; i11 < 6; i11++) {
            if (iArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i11 = 0; i11 < 3; i11++) {
            if (jArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j11 = iArr2[0] & M;
        long j12 = iArr2[1] & M;
        long j13 = iArr2[2] & M;
        long j14 = iArr2[3] & M;
        long j15 = iArr2[4] & M;
        long j16 = iArr2[5] & M;
        long j17 = iArr[0] & M;
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
            long j25 = iArr[i16] & M;
            long j26 = (j25 * j11) + (iArr3[i11] & M) + 0;
            iArr3[i16 + 0] = (int) j26;
            int i18 = i16 + 1;
            long j27 = j12;
            long j28 = (j26 >>> 32) + (j25 * j12) + (iArr3[i18] & M);
            iArr3[i18] = (int) j28;
            long j29 = j16;
            long j31 = (j28 >>> 32) + (j25 * j13) + (iArr3[i12] & M);
            iArr3[i16 + 2] = (int) j31;
            long j32 = (j31 >>> 32) + (j25 * j14) + (iArr3[i13] & M);
            iArr3[i16 + 3] = (int) j32;
            long j33 = (j32 >>> 32) + (j25 * j15) + (iArr3[i14] & M);
            iArr3[i16 + 4] = (int) j33;
            long j34 = (j33 >>> 32) + (j25 * j29) + (iArr3[i15] & M);
            iArr3[i16 + 5] = (int) j34;
            iArr3[i16 + 6] = (int) (j34 >>> 32);
            i16 = i18;
            j11 = j11;
            j12 = j27;
            j16 = j29;
        }
    }

    public static long mul33Add(int i11, int[] iArr, int i12, int[] iArr2, int i13, int[] iArr3, int i14) {
        long j11 = i11 & M;
        long j12 = iArr[i12 + 0] & M;
        long j13 = (j11 * j12) + (iArr2[i13 + 0] & M) + 0;
        iArr3[i14 + 0] = (int) j13;
        long j14 = iArr[i12 + 1] & M;
        long j15 = (j13 >>> 32) + (j11 * j14) + j12 + (iArr2[i13 + 1] & M);
        iArr3[i14 + 1] = (int) j15;
        long j16 = j15 >>> 32;
        long j17 = iArr[i12 + 2] & M;
        long j18 = j16 + (j11 * j17) + j14 + (iArr2[i13 + 2] & M);
        iArr3[i14 + 2] = (int) j18;
        long j19 = iArr[i12 + 3] & M;
        long j21 = (j18 >>> 32) + (j11 * j19) + j17 + (iArr2[i13 + 3] & M);
        iArr3[i14 + 3] = (int) j21;
        long j22 = iArr[i12 + 4] & M;
        long j23 = (j21 >>> 32) + (j11 * j22) + j19 + (iArr2[i13 + 4] & M);
        iArr3[i14 + 4] = (int) j23;
        long j24 = iArr[i12 + 5] & M;
        long j25 = (j23 >>> 32) + (j11 * j24) + j22 + (M & iArr2[i13 + 5]);
        iArr3[i14 + 5] = (int) j25;
        return (j25 >>> 32) + j24;
    }

    public static int mul33DWordAdd(int i11, long j11, int[] iArr, int i12) {
        long j12 = i11 & M;
        long j13 = j11 & M;
        int i13 = i12 + 0;
        long j14 = (j12 * j13) + (iArr[i13] & M) + 0;
        iArr[i13] = (int) j14;
        long j15 = j11 >>> 32;
        long j16 = (j12 * j15) + j13;
        int i14 = i12 + 1;
        long j17 = (j14 >>> 32) + j16 + (iArr[i14] & M);
        iArr[i14] = (int) j17;
        int i15 = i12 + 2;
        long j18 = (j17 >>> 32) + j15 + (iArr[i15] & M);
        iArr[i15] = (int) j18;
        int i16 = i12 + 3;
        long j19 = (j18 >>> 32) + (M & iArr[i16]);
        iArr[i16] = (int) j19;
        if ((j19 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i12, 4);
    }

    public static int mul33WordAdd(int i11, int i12, int[] iArr, int i13) {
        long j11 = i11 & M;
        long j12 = i12 & M;
        int i14 = i13 + 0;
        long j13 = (j11 * j12) + (iArr[i14] & M) + 0;
        iArr[i14] = (int) j13;
        int i15 = i13 + 1;
        long j14 = (j13 >>> 32) + j12 + (iArr[i15] & M);
        iArr[i15] = (int) j14;
        long j15 = j14 >>> 32;
        int i16 = i13 + 2;
        long j16 = j15 + (iArr[i16] & M);
        iArr[i16] = (int) j16;
        if ((j16 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i13, 3);
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 0;
        long j11 = M;
        long j12 = iArr2[0] & M;
        long j13 = iArr2[1] & M;
        long j14 = iArr2[2] & M;
        long j15 = iArr2[3] & M;
        long j16 = iArr2[4] & M;
        long j17 = iArr2[5] & M;
        long j18 = 0;
        while (i17 < 6) {
            long j19 = j17;
            long j21 = iArr[i17] & j11;
            long j22 = j12;
            long j23 = (j21 * j12) + (iArr3[i11] & j11) + 0;
            iArr3[i17 + 0] = (int) j23;
            int i18 = i17 + 1;
            long j24 = (j23 >>> 32) + (j21 * j13) + (iArr3[i18] & M);
            iArr3[i18] = (int) j24;
            long j25 = (j24 >>> 32) + (j21 * j14) + (iArr3[i12] & M);
            iArr3[i17 + 2] = (int) j25;
            long j26 = (j25 >>> 32) + (j21 * j15) + (iArr3[i13] & M);
            iArr3[i17 + 3] = (int) j26;
            long j27 = (j26 >>> 32) + (j21 * j16) + (iArr3[i14] & M);
            iArr3[i17 + 4] = (int) j27;
            long j28 = (j27 >>> 32) + (j21 * j19) + (iArr3[i15] & M);
            iArr3[i17 + 5] = (int) j28;
            long j29 = (j28 >>> 32) + j18 + (iArr3[i16] & M);
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

    public static int mulWord(int i11, int[] iArr, int[] iArr2, int i12) {
        long j11 = i11 & M;
        long j12 = 0;
        int i13 = 0;
        do {
            long j13 = j12 + ((iArr[i13] & M) * j11);
            iArr2[i12 + i13] = (int) j13;
            j12 = j13 >>> 32;
            i13++;
        } while (i13 < 6);
        return (int) j12;
    }

    public static int mulWordAddExt(int i11, int[] iArr, int i12, int[] iArr2, int i13) {
        long j11 = i11 & M;
        int i14 = i13 + 0;
        long j12 = ((iArr[i12 + 0] & M) * j11) + (iArr2[i14] & M) + 0;
        iArr2[i14] = (int) j12;
        int i15 = i13 + 1;
        long j13 = (j12 >>> 32) + ((iArr[i12 + 1] & M) * j11) + (iArr2[i15] & M);
        iArr2[i15] = (int) j13;
        int i16 = i13 + 2;
        long j14 = (j13 >>> 32) + ((iArr[i12 + 2] & M) * j11) + (iArr2[i16] & M);
        iArr2[i16] = (int) j14;
        int i17 = i13 + 3;
        long j15 = (j14 >>> 32) + ((iArr[i12 + 3] & M) * j11) + (iArr2[i17] & M);
        iArr2[i17] = (int) j15;
        int i18 = i13 + 4;
        long j16 = (j15 >>> 32) + ((iArr[i12 + 4] & M) * j11) + (iArr2[i18] & M);
        iArr2[i18] = (int) j16;
        int i19 = i13 + 5;
        long j17 = (j16 >>> 32) + (j11 * (iArr[i12 + 5] & M)) + (iArr2[i19] & M);
        iArr2[i19] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int mulWordDwordAdd(int i11, long j11, int[] iArr, int i12) {
        long j12 = i11 & M;
        int i13 = i12 + 0;
        long j13 = ((j11 & M) * j12) + (iArr[i13] & M) + 0;
        iArr[i13] = (int) j13;
        long j14 = j12 * (j11 >>> 32);
        int i14 = i12 + 1;
        long j15 = (j13 >>> 32) + j14 + (iArr[i14] & M);
        iArr[i14] = (int) j15;
        int i15 = i12 + 2;
        long j16 = (j15 >>> 32) + (iArr[i15] & M);
        iArr[i15] = (int) j16;
        if ((j16 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i12, 3);
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j11 = iArr[0] & M;
        int i11 = 12;
        int i12 = 0;
        int i13 = 5;
        while (true) {
            int i14 = i13 - 1;
            long j12 = iArr[i13] & M;
            long j13 = j12 * j12;
            int i15 = i11 - 1;
            iArr2[i15] = (i12 << 31) | ((int) (j13 >>> 33));
            i11 = i15 - 1;
            iArr2[i11] = (int) (j13 >>> 1);
            int i16 = (int) j13;
            if (i14 <= 0) {
                long j14 = j11 * j11;
                long j15 = ((i16 << 31) & M) | (j14 >>> 33);
                iArr2[0] = (int) j14;
                long j16 = iArr[1] & M;
                long j17 = iArr2[2] & M;
                long j18 = j15 + (j16 * j11);
                int i17 = (int) j18;
                iArr2[1] = (i17 << 1) | (((int) (j14 >>> 32)) & 1);
                long j19 = j17 + (j18 >>> 32);
                long j21 = iArr[2] & M;
                long j22 = iArr2[3] & M;
                long j23 = iArr2[4] & M;
                long j24 = j19 + (j21 * j11);
                int i18 = (int) j24;
                iArr2[2] = (i18 << 1) | (i17 >>> 31);
                long j25 = j22 + (j24 >>> 32) + (j21 * j16);
                long j26 = j23 + (j25 >>> 32);
                long j27 = j25 & M;
                long j28 = iArr[3] & M;
                long j29 = (iArr2[5] & M) + (j26 >>> 32);
                long j31 = j26 & M;
                long j32 = (iArr2[6] & M) + (j29 >>> 32);
                long j33 = j29 & M;
                long j34 = j27 + (j28 * j11);
                int i19 = (int) j34;
                iArr2[3] = (i19 << 1) | (i18 >>> 31);
                long j35 = j31 + (j34 >>> 32) + (j28 * j16);
                long j36 = j33 + (j35 >>> 32) + (j28 * j21);
                long j37 = j35 & M;
                long j38 = j32 + (j36 >>> 32);
                long j39 = j36 & M;
                long j41 = iArr[4] & M;
                long j42 = (iArr2[7] & M) + (j38 >>> 32);
                long j43 = j38 & M;
                long j44 = j42 & M;
                long j45 = j37 + (j41 * j11);
                int i21 = (int) j45;
                iArr2[4] = (i19 >>> 31) | (i21 << 1);
                long j46 = j39 + (j45 >>> 32) + (j41 * j16);
                long j47 = j43 + (j46 >>> 32) + (j41 * j21);
                long j48 = j46 & M;
                long j49 = j44 + (j47 >>> 32) + (j41 * j28);
                long j51 = j47 & M;
                long j52 = (iArr2[8] & M) + (j42 >>> 32) + (j49 >>> 32);
                long j53 = j49 & M;
                long j54 = iArr[5] & M;
                long j55 = (iArr2[9] & M) + (j52 >>> 32);
                long j56 = j52 & M;
                long j57 = j55 & M;
                long j58 = j48 + (j11 * j54);
                int i22 = (int) j58;
                iArr2[5] = (i21 >>> 31) | (i22 << 1);
                int i23 = i22 >>> 31;
                long j59 = j51 + (j58 >>> 32) + (j16 * j54);
                long j61 = j53 + (j59 >>> 32) + (j54 * j21);
                long j62 = j56 + (j61 >>> 32) + (j54 * j28);
                long j63 = j57 + (j62 >>> 32) + (j54 * j41);
                long j64 = (iArr2[10] & M) + (j55 >>> 32) + (j63 >>> 32);
                int i24 = (int) j59;
                iArr2[6] = i23 | (i24 << 1);
                int i25 = (int) j61;
                iArr2[7] = (i24 >>> 31) | (i25 << 1);
                int i26 = i25 >>> 31;
                int i27 = (int) j62;
                iArr2[8] = i26 | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) j63;
                iArr2[9] = i28 | (i29 << 1);
                int i31 = i29 >>> 31;
                int i32 = (int) j64;
                iArr2[10] = i31 | (i32 << 1);
                iArr2[11] = (i32 >>> 31) | ((iArr2[11] + ((int) (j64 >>> 32))) << 1);
                return;
            }
            i13 = i14;
            i12 = i16;
        }
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j11 = ((iArr[0] & M) - (iArr2[0] & M)) + 0;
        iArr3[0] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr[1] & M) - (iArr2[1] & M));
        iArr3[1] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr[2] & M) - (iArr2[2] & M));
        iArr3[2] = (int) j13;
        long j14 = (j13 >> 32) + ((iArr[3] & M) - (iArr2[3] & M));
        iArr3[3] = (int) j14;
        long j15 = (j14 >> 32) + ((iArr[4] & M) - (iArr2[4] & M));
        iArr3[4] = (int) j15;
        long j16 = (j15 >> 32) + ((iArr[5] & M) - (iArr2[5] & M));
        iArr3[5] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j11 = (((iArr3[0] & M) - (iArr[0] & M)) - (iArr2[0] & M)) + 0;
        iArr3[0] = (int) j11;
        long j12 = (j11 >> 32) + (((iArr3[1] & M) - (iArr[1] & M)) - (iArr2[1] & M));
        iArr3[1] = (int) j12;
        long j13 = (j12 >> 32) + (((iArr3[2] & M) - (iArr[2] & M)) - (iArr2[2] & M));
        iArr3[2] = (int) j13;
        long j14 = (j13 >> 32) + (((iArr3[3] & M) - (iArr[3] & M)) - (iArr2[3] & M));
        iArr3[3] = (int) j14;
        long j15 = (j14 >> 32) + (((iArr3[4] & M) - (iArr[4] & M)) - (iArr2[4] & M));
        iArr3[4] = (int) j15;
        long j16 = (j15 >> 32) + (((iArr3[5] & M) - (iArr[5] & M)) - (iArr2[5] & M));
        iArr3[5] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j11 = ((iArr2[0] & M) - (iArr[0] & M)) + 0;
        iArr2[0] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr2[1] & M) - (iArr[1] & M));
        iArr2[1] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr2[2] & M) - (iArr[2] & M));
        iArr2[2] = (int) j13;
        long j14 = (j13 >> 32) + ((iArr2[3] & M) - (iArr[3] & M));
        iArr2[3] = (int) j14;
        long j15 = (j14 >> 32) + ((iArr2[4] & M) - (iArr[4] & M));
        iArr2[4] = (int) j15;
        long j16 = (j15 >> 32) + ((iArr2[5] & M) - (M & iArr[5]));
        iArr2[5] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i11 = 0; i11 < 6; i11++) {
            int i12 = iArr[i11];
            if (i12 != 0) {
                Pack.intToBigEndian(i12, bArr, (5 - i11) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i11 = 0; i11 < 3; i11++) {
            long j11 = jArr[i11];
            if (j11 != 0) {
                Pack.longToBigEndian(j11, bArr, (2 - i11) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
    }

    public static boolean gte(int[] iArr, int i11, int[] iArr2, int i12) {
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

    public static int addTo(int[] iArr, int i11, int[] iArr2, int i12, int i13) {
        int i14 = i12 + 0;
        long j11 = (i13 & M) + (iArr[i11 + 0] & M) + (iArr2[i14] & M);
        iArr2[i14] = (int) j11;
        int i15 = i12 + 1;
        long j12 = (j11 >>> 32) + (iArr[i11 + 1] & M) + (iArr2[i15] & M);
        iArr2[i15] = (int) j12;
        int i16 = i12 + 2;
        long j13 = (j12 >>> 32) + (iArr[i11 + 2] & M) + (iArr2[i16] & M);
        iArr2[i16] = (int) j13;
        int i17 = i12 + 3;
        long j14 = (j13 >>> 32) + (iArr[i11 + 3] & M) + (iArr2[i17] & M);
        iArr2[i17] = (int) j14;
        int i18 = i12 + 4;
        long j15 = (j14 >>> 32) + (iArr[i11 + 4] & M) + (iArr2[i18] & M);
        iArr2[i18] = (int) j15;
        int i19 = i12 + 5;
        long j16 = (j15 >>> 32) + (iArr[i11 + 5] & M) + (M & iArr2[i19]);
        iArr2[i19] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int sub(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j11 = ((iArr[i11 + 0] & M) - (iArr2[i12 + 0] & M)) + 0;
        iArr3[i13 + 0] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr[i11 + 1] & M) - (iArr2[i12 + 1] & M));
        iArr3[i13 + 1] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr[i11 + 2] & M) - (iArr2[i12 + 2] & M));
        iArr3[i13 + 2] = (int) j13;
        long j14 = (j13 >> 32) + ((iArr[i11 + 3] & M) - (iArr2[i12 + 3] & M));
        iArr3[i13 + 3] = (int) j14;
        long j15 = (j14 >> 32) + ((iArr[i11 + 4] & M) - (iArr2[i12 + 4] & M));
        iArr3[i13 + 4] = (int) j15;
        long j16 = (j15 >> 32) + ((iArr[i11 + 5] & M) - (iArr2[i12 + 5] & M));
        iArr3[i13 + 5] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static int subFrom(int[] iArr, int i11, int[] iArr2, int i12) {
        int i13 = i12 + 0;
        long j11 = ((iArr2[i13] & M) - (iArr[i11 + 0] & M)) + 0;
        iArr2[i13] = (int) j11;
        int i14 = i12 + 1;
        long j12 = (j11 >> 32) + ((iArr2[i14] & M) - (iArr[i11 + 1] & M));
        iArr2[i14] = (int) j12;
        int i15 = i12 + 2;
        long j13 = (j12 >> 32) + ((iArr2[i15] & M) - (iArr[i11 + 2] & M));
        iArr2[i15] = (int) j13;
        int i16 = i12 + 3;
        long j14 = (j13 >> 32) + ((iArr2[i16] & M) - (iArr[i11 + 3] & M));
        iArr2[i16] = (int) j14;
        int i17 = i12 + 4;
        long j15 = (j14 >> 32) + ((iArr2[i17] & M) - (iArr[i11 + 4] & M));
        iArr2[i17] = (int) j15;
        int i18 = i12 + 5;
        long j16 = (j15 >> 32) + ((iArr2[i18] & M) - (iArr[i11 + 5] & M));
        iArr2[i18] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static int mulAddTo(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        long j11 = M;
        long j12 = iArr2[i12 + 0] & M;
        long j13 = iArr2[i12 + 1] & M;
        long j14 = iArr2[i12 + 2] & M;
        long j15 = iArr2[i12 + 3] & M;
        long j16 = iArr2[i12 + 4] & M;
        long j17 = iArr2[i12 + 5] & M;
        int i21 = 0;
        long j18 = 0;
        int i22 = i13;
        while (i21 < 6) {
            int i23 = i21;
            long j19 = iArr[i11 + i21] & j11;
            long j21 = (j19 * j12) + (iArr3[i14] & j11) + 0;
            iArr3[i22 + 0] = (int) j21;
            int i24 = i22 + 1;
            long j22 = j13;
            long j23 = (j21 >>> 32) + (j19 * j13) + (iArr3[i24] & M);
            iArr3[i24] = (int) j23;
            long j24 = j14;
            long j25 = (j23 >>> 32) + (j19 * j14) + (iArr3[i15] & M);
            iArr3[i22 + 2] = (int) j25;
            long j26 = (j25 >>> 32) + (j19 * j15) + (iArr3[i16] & M);
            iArr3[i22 + 3] = (int) j26;
            long j27 = (j26 >>> 32) + (j19 * j16) + (iArr3[i17] & M);
            iArr3[i22 + 4] = (int) j27;
            long j28 = (j27 >>> 32) + (j19 * j17) + (iArr3[i18] & M);
            iArr3[i22 + 5] = (int) j28;
            long j29 = (j28 >>> 32) + j18 + (iArr3[i19] & M);
            iArr3[i22 + 6] = (int) j29;
            j18 = j29 >>> 32;
            i21 = i23 + 1;
            i22 = i24;
            j12 = j12;
            j11 = 4294967295L;
            j13 = j22;
            j14 = j24;
        }
        return (int) j18;
    }

    public static void mul(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        long j11 = iArr2[i12 + 0] & M;
        long j12 = iArr2[i12 + 1] & M;
        long j13 = iArr2[i12 + 2] & M;
        long j14 = iArr2[i12 + 3] & M;
        long j15 = iArr2[i12 + 4] & M;
        long j16 = iArr2[i12 + 5] & M;
        long j17 = iArr[i11 + 0] & M;
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
            long j25 = iArr[i11 + i23] & M;
            long j26 = (j25 * j11) + (iArr3[i14] & M) + 0;
            iArr3[i22 + 0] = (int) j26;
            long j27 = j16;
            long j28 = (j26 >>> 32) + (j25 * j12) + (iArr3[i15] & M);
            iArr3[i22 + 1] = (int) j28;
            long j29 = (j28 >>> 32) + (j25 * j13) + (iArr3[i16] & M);
            iArr3[i22 + 2] = (int) j29;
            long j31 = (j29 >>> 32) + (j25 * j14) + (iArr3[i17] & M);
            iArr3[i22 + 3] = (int) j31;
            long j32 = (j31 >>> 32) + (j25 * j15) + (iArr3[i18] & M);
            iArr3[i22 + 4] = (int) j32;
            long j33 = (j32 >>> 32) + (j25 * j27) + (iArr3[i19] & M);
            iArr3[i22 + 5] = (int) j33;
            iArr3[i22 + 6] = (int) (j33 >>> 32);
            i23++;
            j13 = j13;
            j16 = j27;
            i21 = 1;
        }
    }

    public static void square(int[] iArr, int i11, int[] iArr2, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        long j11 = iArr[i11 + 0] & M;
        int i23 = 0;
        int i24 = 12;
        int i25 = 5;
        while (true) {
            int i26 = i25 - 1;
            long j12 = iArr[i11 + i25] & M;
            long j13 = j12 * j12;
            int i27 = i24 - 1;
            iArr2[i12 + i27] = (i23 << 31) | ((int) (j13 >>> 33));
            i24 = i27 - 1;
            iArr2[i12 + i24] = (int) (j13 >>> 1);
            i23 = (int) j13;
            if (i26 <= 0) {
                long j14 = j11 * j11;
                long j15 = ((i23 << 31) & M) | (j14 >>> 33);
                iArr2[i12 + 0] = (int) j14;
                long j16 = iArr[i11 + 1] & M;
                long j17 = iArr2[i13] & M;
                long j18 = j15 + (j16 * j11);
                int i28 = (int) j18;
                iArr2[i12 + 1] = (i28 << 1) | (((int) (j14 >>> 32)) & 1);
                int i29 = i28 >>> 31;
                long j19 = j17 + (j18 >>> 32);
                long j21 = iArr[i11 + 2] & M;
                long j22 = iArr2[i14] & M;
                long j23 = iArr2[i15] & M;
                long j24 = j19 + (j21 * j11);
                int i31 = (int) j24;
                iArr2[i12 + 2] = (i31 << 1) | i29;
                int i32 = i31 >>> 31;
                long j25 = j22 + (j24 >>> 32) + (j21 * j16);
                long j26 = j23 + (j25 >>> 32);
                long j27 = j25 & M;
                long j28 = iArr[i11 + 3] & M;
                long j29 = (iArr2[i16] & M) + (j26 >>> 32);
                long j31 = j26 & M;
                long j32 = (iArr2[i17] & M) + (j29 >>> 32);
                long j33 = j29 & M;
                long j34 = j27 + (j28 * j11);
                int i33 = (int) j34;
                iArr2[i12 + 3] = (i33 << 1) | i32;
                long j35 = j31 + (j34 >>> 32) + (j28 * j16);
                long j36 = j33 + (j35 >>> 32) + (j28 * j21);
                long j37 = j35 & M;
                long j38 = j32 + (j36 >>> 32);
                long j39 = j36 & M;
                long j41 = iArr[i11 + 4] & M;
                long j42 = (iArr2[i18] & M) + (j38 >>> 32);
                long j43 = j38 & M;
                long j44 = (iArr2[i19] & M) + (j42 >>> 32);
                long j45 = j42 & M;
                long j46 = j37 + (j41 * j11);
                int i34 = (int) j46;
                iArr2[i12 + 4] = (i33 >>> 31) | (i34 << 1);
                int i35 = i34 >>> 31;
                long j47 = j39 + (j46 >>> 32) + (j41 * j16);
                long j48 = j43 + (j47 >>> 32) + (j41 * j21);
                long j49 = j47 & M;
                long j51 = j45 + (j48 >>> 32) + (j41 * j28);
                long j52 = j48 & M;
                long j53 = j44 + (j51 >>> 32);
                long j54 = j51 & M;
                long j55 = iArr[i11 + 5] & M;
                long j56 = (iArr2[i21] & M) + (j53 >>> 32);
                long j57 = j53 & M;
                long j58 = j56 & M;
                long j59 = j49 + (j11 * j55);
                int i36 = (int) j59;
                iArr2[i12 + 5] = (i36 << 1) | i35;
                long j61 = j52 + (j59 >>> 32) + (j55 * j16);
                long j62 = j54 + (j61 >>> 32) + (j55 * j21);
                long j63 = j57 + (j62 >>> 32) + (j55 * j28);
                long j64 = j58 + (j63 >>> 32) + (j55 * j41);
                long j65 = (iArr2[i22] & M) + (j56 >>> 32) + (j64 >>> 32);
                int i37 = (int) j61;
                iArr2[i12 + 6] = (i36 >>> 31) | (i37 << 1);
                int i38 = (int) j62;
                iArr2[i12 + 7] = (i37 >>> 31) | (i38 << 1);
                int i39 = i38 >>> 31;
                int i41 = (int) j63;
                iArr2[i12 + 8] = i39 | (i41 << 1);
                int i42 = i41 >>> 31;
                int i43 = (int) j64;
                iArr2[i12 + 9] = i42 | (i43 << 1);
                int i44 = i43 >>> 31;
                int i45 = (int) j65;
                iArr2[i12 + 10] = i44 | (i45 << 1);
                int i46 = i45 >>> 31;
                int i47 = i12 + 11;
                iArr2[i47] = i46 | ((iArr2[i47] + ((int) (j65 >>> 32))) << 1);
                return;
            }
            i25 = i26;
        }
    }
}