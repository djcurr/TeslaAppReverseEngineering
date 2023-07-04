package org.spongycastle.math.raw;

import java.math.BigInteger;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public abstract class Nat256 {
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
        long j17 = (j16 >>> 32) + (iArr[6] & M) + (iArr2[6] & M);
        iArr3[6] = (int) j17;
        long j18 = (j17 >>> 32) + (iArr[7] & M) + (iArr2[7] & M);
        iArr3[7] = (int) j18;
        return (int) (j18 >>> 32);
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
        long j17 = (j16 >>> 32) + (iArr[6] & M) + (iArr2[6] & M) + (iArr3[6] & M);
        iArr3[6] = (int) j17;
        long j18 = (j17 >>> 32) + (iArr[7] & M) + (iArr2[7] & M) + (iArr3[7] & M);
        iArr3[7] = (int) j18;
        return (int) (j18 >>> 32);
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
        long j16 = (j15 >>> 32) + (iArr[5] & M) + (iArr2[5] & M);
        iArr2[5] = (int) j16;
        long j17 = (j16 >>> 32) + (iArr[6] & M) + (iArr2[6] & M);
        iArr2[6] = (int) j17;
        long j18 = (j17 >>> 32) + (iArr[7] & M) + (M & iArr2[7]);
        iArr2[7] = (int) j18;
        return (int) (j18 >>> 32);
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
        long j16 = (j15 >>> 32) + (iArr[i29] & M) + (iArr2[i31] & M);
        int i32 = (int) j16;
        iArr[i29] = i32;
        iArr2[i31] = i32;
        int i33 = i11 + 6;
        int i34 = i12 + 6;
        long j17 = (j16 >>> 32) + (iArr[i33] & M) + (iArr2[i34] & M);
        int i35 = (int) j17;
        iArr[i33] = i35;
        iArr2[i34] = i35;
        int i36 = i11 + 7;
        int i37 = i12 + 7;
        long j18 = (j17 >>> 32) + (iArr[i36] & M) + (M & iArr2[i37]);
        int i38 = (int) j18;
        iArr[i36] = i38;
        iArr2[i37] = i38;
        return (int) (j18 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
        iArr2[7] = iArr[7];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static int[] create() {
        return new int[8];
    }

    public static long[] create64() {
        return new long[4];
    }

    public static int[] createExt() {
        return new int[16];
    }

    public static long[] createExt64() {
        return new long[8];
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
        for (int i11 = 7; i11 >= 0; i11--) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i11 = 3; i11 >= 0; i11--) {
            if (jArr[i11] != jArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= 256) {
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
        if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= 256) {
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
        } else if ((i11 & 255) != i11) {
            return 0;
        } else {
            i12 = iArr[i11 >>> 5] >>> (i11 & 31);
        }
        return i12 & 1;
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
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

    public static boolean isOne(int[] iArr) {
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

    public static boolean isOne64(long[] jArr) {
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

    public static boolean isZero(int[] iArr) {
        for (int i11 = 0; i11 < 8; i11++) {
            if (iArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i11 = 0; i11 < 4; i11++) {
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
        int i16;
        int i17;
        long j11 = iArr2[0] & M;
        long j12 = iArr2[1] & M;
        long j13 = iArr2[2] & M;
        long j14 = iArr2[3] & M;
        long j15 = iArr2[4] & M;
        long j16 = iArr2[5] & M;
        long j17 = iArr2[6] & M;
        long j18 = iArr2[7] & M;
        long j19 = iArr[0] & M;
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
            long j29 = iArr[i18] & M;
            long j31 = (j29 * j11) + (iArr3[i11] & M) + 0;
            iArr3[i18 + 0] = (int) j31;
            int i21 = i18 + 1;
            long j32 = j12;
            long j33 = (j31 >>> 32) + (j29 * j12) + (iArr3[i21] & M);
            iArr3[i21] = (int) j33;
            long j34 = j16;
            long j35 = (j33 >>> 32) + (j29 * j13) + (iArr3[i12] & M);
            iArr3[i18 + 2] = (int) j35;
            long j36 = (j35 >>> 32) + (j29 * j14) + (iArr3[i13] & M);
            iArr3[i18 + 3] = (int) j36;
            long j37 = (j36 >>> 32) + (j29 * j15) + (iArr3[i14] & M);
            iArr3[i18 + 4] = (int) j37;
            long j38 = (j37 >>> 32) + (j29 * j34) + (iArr3[i15] & M);
            iArr3[i18 + 5] = (int) j38;
            long j39 = (j38 >>> 32) + (j29 * j17) + (iArr3[i16] & M);
            iArr3[i18 + 6] = (int) j39;
            long j41 = (j39 >>> 32) + (j29 * j18) + (iArr3[i17] & M);
            iArr3[i18 + 7] = (int) j41;
            iArr3[i18 + 8] = (int) (j41 >>> 32);
            i18 = i21;
            j11 = j11;
            j12 = j32;
            j16 = j34;
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
        long j25 = (j23 >>> 32) + (j11 * j24) + j22 + (iArr2[i13 + 5] & M);
        iArr3[i14 + 5] = (int) j25;
        long j26 = iArr[i12 + 6] & M;
        long j27 = (j25 >>> 32) + (j11 * j26) + j24 + (iArr2[i13 + 6] & M);
        iArr3[i14 + 6] = (int) j27;
        long j28 = iArr[i12 + 7] & M;
        long j29 = (j27 >>> 32) + (j11 * j28) + j26 + (M & iArr2[i13 + 7]);
        iArr3[i14 + 7] = (int) j29;
        return (j29 >>> 32) + j28;
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
        return Nat.incAt(8, iArr, i12, 4);
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
        return Nat.incAt(8, iArr, i13, 3);
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j11 = M;
        long j12 = iArr2[0] & M;
        long j13 = iArr2[1] & M;
        long j14 = iArr2[2] & M;
        long j15 = iArr2[3] & M;
        long j16 = iArr2[4] & M;
        long j17 = iArr2[5] & M;
        long j18 = iArr2[6] & M;
        long j19 = iArr2[7] & M;
        long j21 = 0;
        int i19 = 0;
        while (i19 < 8) {
            long j22 = j19;
            long j23 = iArr[i19] & j11;
            long j24 = j17;
            long j25 = (j23 * j12) + (iArr3[i11] & j11) + 0;
            iArr3[i19 + 0] = (int) j25;
            int i21 = i19 + 1;
            long j26 = j13;
            long j27 = (j25 >>> 32) + (j23 * j13) + (iArr3[i21] & j11);
            iArr3[i21] = (int) j27;
            long j28 = (j27 >>> 32) + (j23 * j14) + (iArr3[i12] & j11);
            iArr3[i19 + 2] = (int) j28;
            long j29 = (j28 >>> 32) + (j23 * j15) + (iArr3[i13] & j11);
            iArr3[i19 + 3] = (int) j29;
            long j31 = (j29 >>> 32) + (j23 * j16) + (iArr3[i14] & j11);
            iArr3[i19 + 4] = (int) j31;
            long j32 = (j31 >>> 32) + (j23 * j24) + (iArr3[i15] & j11);
            iArr3[i19 + 5] = (int) j32;
            long j33 = (j32 >>> 32) + (j23 * j18) + (iArr3[i16] & j11);
            iArr3[i19 + 6] = (int) j33;
            long j34 = (j33 >>> 32) + (j23 * j22) + (iArr3[i17] & j11);
            iArr3[i19 + 7] = (int) j34;
            long j35 = (j34 >>> 32) + j21 + (iArr3[i18] & j11);
            iArr3[i19 + 8] = (int) j35;
            j21 = j35 >>> 32;
            i19 = i21;
            j19 = j22;
            j17 = j24;
            j13 = j26;
            j11 = M;
        }
        return (int) j21;
    }

    public static int mulByWord(int i11, int[] iArr) {
        long j11 = i11 & M;
        long j12 = ((iArr[0] & M) * j11) + 0;
        iArr[0] = (int) j12;
        long j13 = (j12 >>> 32) + ((iArr[1] & M) * j11);
        iArr[1] = (int) j13;
        long j14 = (j13 >>> 32) + ((iArr[2] & M) * j11);
        iArr[2] = (int) j14;
        long j15 = (j14 >>> 32) + ((iArr[3] & M) * j11);
        iArr[3] = (int) j15;
        long j16 = (j15 >>> 32) + ((iArr[4] & M) * j11);
        iArr[4] = (int) j16;
        long j17 = (j16 >>> 32) + ((iArr[5] & M) * j11);
        iArr[5] = (int) j17;
        long j18 = (j17 >>> 32) + ((iArr[6] & M) * j11);
        iArr[6] = (int) j18;
        long j19 = (j18 >>> 32) + (j11 * (M & iArr[7]));
        iArr[7] = (int) j19;
        return (int) (j19 >>> 32);
    }

    public static int mulByWordAddTo(int i11, int[] iArr, int[] iArr2) {
        long j11 = i11 & M;
        long j12 = ((iArr2[0] & M) * j11) + (iArr[0] & M) + 0;
        iArr2[0] = (int) j12;
        long j13 = (j12 >>> 32) + ((iArr2[1] & M) * j11) + (iArr[1] & M);
        iArr2[1] = (int) j13;
        long j14 = (j13 >>> 32) + ((iArr2[2] & M) * j11) + (iArr[2] & M);
        iArr2[2] = (int) j14;
        long j15 = (j14 >>> 32) + ((iArr2[3] & M) * j11) + (iArr[3] & M);
        iArr2[3] = (int) j15;
        long j16 = (j15 >>> 32) + ((iArr2[4] & M) * j11) + (iArr[4] & M);
        iArr2[4] = (int) j16;
        long j17 = (j16 >>> 32) + ((iArr2[5] & M) * j11) + (iArr[5] & M);
        iArr2[5] = (int) j17;
        long j18 = (j17 >>> 32) + ((iArr2[6] & M) * j11) + (iArr[6] & M);
        iArr2[6] = (int) j18;
        long j19 = (j18 >>> 32) + (j11 * (iArr2[7] & M)) + (M & iArr[7]);
        iArr2[7] = (int) j19;
        return (int) (j19 >>> 32);
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
        } while (i13 < 8);
        return (int) j12;
    }

    public static int mulWordAddTo(int i11, int[] iArr, int i12, int[] iArr2, int i13) {
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
        long j17 = (j16 >>> 32) + ((iArr[i12 + 5] & M) * j11) + (iArr2[i19] & M);
        iArr2[i19] = (int) j17;
        int i21 = i13 + 6;
        long j18 = (j17 >>> 32) + ((iArr[i12 + 6] & M) * j11) + (iArr2[i21] & M);
        iArr2[i21] = (int) j18;
        int i22 = i13 + 7;
        long j19 = (j18 >>> 32) + (j11 * (iArr[i12 + 7] & M)) + (iArr2[i22] & M);
        iArr2[i22] = (int) j19;
        return (int) (j19 >>> 32);
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
        return Nat.incAt(8, iArr, i12, 3);
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j11 = iArr[0] & M;
        int i11 = 16;
        int i12 = 0;
        int i13 = 7;
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
                int i22 = i21 >>> 31;
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
                long j57 = (iArr2[10] & M) + (j55 >>> 32);
                long j58 = j55 & M;
                long j59 = j48 + (j54 * j11);
                int i23 = (int) j59;
                iArr2[5] = (i23 << 1) | i22;
                long j61 = j51 + (j59 >>> 32) + (j54 * j16);
                long j62 = j53 + (j61 >>> 32) + (j54 * j21);
                long j63 = j61 & M;
                long j64 = j56 + (j62 >>> 32) + (j54 * j28);
                long j65 = j62 & M;
                long j66 = j58 + (j64 >>> 32) + (j54 * j41);
                long j67 = j64 & M;
                long j68 = j57 + (j66 >>> 32);
                long j69 = j66 & M;
                long j71 = iArr[6] & M;
                long j72 = (iArr2[11] & M) + (j68 >>> 32);
                long j73 = j68 & M;
                long j74 = (iArr2[12] & M) + (j72 >>> 32);
                long j75 = j72 & M;
                long j76 = j63 + (j71 * j11);
                int i24 = (int) j76;
                iArr2[6] = (i24 << 1) | (i23 >>> 31);
                long j77 = j65 + (j76 >>> 32) + (j71 * j16);
                long j78 = j67 + (j77 >>> 32) + (j71 * j21);
                long j79 = j77 & M;
                long j81 = j69 + (j78 >>> 32) + (j71 * j28);
                long j82 = j78 & M;
                long j83 = j73 + (j81 >>> 32) + (j71 * j41);
                long j84 = j81 & M;
                long j85 = j75 + (j83 >>> 32) + (j71 * j54);
                long j86 = j83 & M;
                long j87 = j74 + (j85 >>> 32);
                long j88 = j85 & M;
                long j89 = iArr[7] & M;
                long j90 = (iArr2[13] & M) + (j87 >>> 32);
                long j91 = j87 & M;
                long j92 = j90 & M;
                long j93 = j79 + (j11 * j89);
                int i25 = (int) j93;
                iArr2[7] = (i24 >>> 31) | (i25 << 1);
                int i26 = i25 >>> 31;
                long j94 = j82 + (j93 >>> 32) + (j16 * j89);
                long j95 = j84 + (j94 >>> 32) + (j89 * j21);
                long j96 = j86 + (j95 >>> 32) + (j89 * j28);
                long j97 = j88 + (j96 >>> 32) + (j89 * j41);
                long j98 = j91 + (j97 >>> 32) + (j89 * j54);
                long j99 = j92 + (j98 >>> 32) + (j89 * j71);
                long j100 = (iArr2[14] & M) + (j90 >>> 32) + (j99 >>> 32);
                int i27 = (int) j94;
                iArr2[8] = i26 | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) j95;
                iArr2[9] = i28 | (i29 << 1);
                int i31 = i29 >>> 31;
                int i32 = (int) j96;
                iArr2[10] = i31 | (i32 << 1);
                int i33 = i32 >>> 31;
                int i34 = (int) j97;
                iArr2[11] = i33 | (i34 << 1);
                int i35 = i34 >>> 31;
                int i36 = (int) j98;
                iArr2[12] = i35 | (i36 << 1);
                int i37 = i36 >>> 31;
                int i38 = (int) j99;
                iArr2[13] = i37 | (i38 << 1);
                int i39 = i38 >>> 31;
                int i41 = (int) j100;
                iArr2[14] = i39 | (i41 << 1);
                iArr2[15] = (i41 >>> 31) | ((iArr2[15] + ((int) (j100 >>> 32))) << 1);
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
        long j17 = (j16 >> 32) + ((iArr[6] & M) - (iArr2[6] & M));
        iArr3[6] = (int) j17;
        long j18 = (j17 >> 32) + ((iArr[7] & M) - (iArr2[7] & M));
        iArr3[7] = (int) j18;
        return (int) (j18 >> 32);
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
        long j17 = (j16 >> 32) + (((iArr3[6] & M) - (iArr[6] & M)) - (iArr2[6] & M));
        iArr3[6] = (int) j17;
        long j18 = (j17 >> 32) + (((iArr3[7] & M) - (iArr[7] & M)) - (iArr2[7] & M));
        iArr3[7] = (int) j18;
        return (int) (j18 >> 32);
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
        long j16 = (j15 >> 32) + ((iArr2[5] & M) - (iArr[5] & M));
        iArr2[5] = (int) j16;
        long j17 = (j16 >> 32) + ((iArr2[6] & M) - (iArr[6] & M));
        iArr2[6] = (int) j17;
        long j18 = (j17 >> 32) + ((iArr2[7] & M) - (M & iArr[7]));
        iArr2[7] = (int) j18;
        return (int) (j18 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = iArr[i11];
            if (i12 != 0) {
                Pack.intToBigEndian(i12, bArr, (7 - i11) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i11 = 0; i11 < 4; i11++) {
            long j11 = jArr[i11];
            if (j11 != 0) {
                Pack.longToBigEndian(j11, bArr, (3 - i11) << 3);
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
        iArr[6] = 0;
        iArr[7] = 0;
    }

    public static boolean gte(int[] iArr, int i11, int[] iArr2, int i12) {
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

    public static int add(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j11 = (iArr[i11 + 0] & M) + (iArr2[i12 + 0] & M) + 0;
        iArr3[i13 + 0] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[i11 + 1] & M) + (iArr2[i12 + 1] & M);
        iArr3[i13 + 1] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[i11 + 2] & M) + (iArr2[i12 + 2] & M);
        iArr3[i13 + 2] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[i11 + 3] & M) + (iArr2[i12 + 3] & M);
        iArr3[i13 + 3] = (int) j14;
        long j15 = (j14 >>> 32) + (iArr[i11 + 4] & M) + (iArr2[i12 + 4] & M);
        iArr3[i13 + 4] = (int) j15;
        long j16 = (j15 >>> 32) + (iArr[i11 + 5] & M) + (iArr2[i12 + 5] & M);
        iArr3[i13 + 5] = (int) j16;
        long j17 = (j16 >>> 32) + (iArr[i11 + 6] & M) + (iArr2[i12 + 6] & M);
        iArr3[i13 + 6] = (int) j17;
        long j18 = (j17 >>> 32) + (iArr[i11 + 7] & M) + (iArr2[i12 + 7] & M);
        iArr3[i13 + 7] = (int) j18;
        return (int) (j18 >>> 32);
    }

    public static int addBothTo(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        int i14 = i13 + 0;
        long j11 = (iArr[i11 + 0] & M) + (iArr2[i12 + 0] & M) + (iArr3[i14] & M) + 0;
        iArr3[i14] = (int) j11;
        int i15 = i13 + 1;
        long j12 = (j11 >>> 32) + (iArr[i11 + 1] & M) + (iArr2[i12 + 1] & M) + (iArr3[i15] & M);
        iArr3[i15] = (int) j12;
        int i16 = i13 + 2;
        long j13 = (j12 >>> 32) + (iArr[i11 + 2] & M) + (iArr2[i12 + 2] & M) + (iArr3[i16] & M);
        iArr3[i16] = (int) j13;
        int i17 = i13 + 3;
        long j14 = (j13 >>> 32) + (iArr[i11 + 3] & M) + (iArr2[i12 + 3] & M) + (iArr3[i17] & M);
        iArr3[i17] = (int) j14;
        int i18 = i13 + 4;
        long j15 = (j14 >>> 32) + (iArr[i11 + 4] & M) + (iArr2[i12 + 4] & M) + (iArr3[i18] & M);
        iArr3[i18] = (int) j15;
        int i19 = i13 + 5;
        long j16 = (j15 >>> 32) + (iArr[i11 + 5] & M) + (iArr2[i12 + 5] & M) + (iArr3[i19] & M);
        iArr3[i19] = (int) j16;
        int i21 = i13 + 6;
        long j17 = (j16 >>> 32) + (iArr[i11 + 6] & M) + (iArr2[i12 + 6] & M) + (iArr3[i21] & M);
        iArr3[i21] = (int) j17;
        int i22 = i13 + 7;
        long j18 = (j17 >>> 32) + (iArr[i11 + 7] & M) + (iArr2[i12 + 7] & M) + (iArr3[i22] & M);
        iArr3[i22] = (int) j18;
        return (int) (j18 >>> 32);
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
        long j16 = (j15 >>> 32) + (iArr[i11 + 5] & M) + (iArr2[i19] & M);
        iArr2[i19] = (int) j16;
        int i21 = i12 + 6;
        long j17 = (j16 >>> 32) + (iArr[i11 + 6] & M) + (iArr2[i21] & M);
        iArr2[i21] = (int) j17;
        int i22 = i12 + 7;
        long j18 = (j17 >>> 32) + (iArr[i11 + 7] & M) + (M & iArr2[i22]);
        iArr2[i22] = (int) j18;
        return (int) (j18 >>> 32);
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
        long j17 = (j16 >> 32) + ((iArr[i11 + 6] & M) - (iArr2[i12 + 6] & M));
        iArr3[i13 + 6] = (int) j17;
        long j18 = (j17 >> 32) + ((iArr[i11 + 7] & M) - (iArr2[i12 + 7] & M));
        iArr3[i13 + 7] = (int) j18;
        return (int) (j18 >> 32);
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
        int i19 = i12 + 6;
        long j17 = (j16 >> 32) + ((iArr2[i19] & M) - (iArr[i11 + 6] & M));
        iArr2[i19] = (int) j17;
        int i21 = i12 + 7;
        long j18 = (j17 >> 32) + ((iArr2[i21] & M) - (iArr[i11 + 7] & M));
        iArr2[i21] = (int) j18;
        return (int) (j18 >> 32);
    }

    public static int mulAddTo(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        long j11 = iArr2[i12 + 0] & M;
        long j12 = iArr2[i12 + 1] & M;
        long j13 = iArr2[i12 + 2] & M;
        long j14 = iArr2[i12 + 3] & M;
        long j15 = iArr2[i12 + 4] & M;
        long j16 = iArr2[i12 + 5] & M;
        long j17 = iArr2[i12 + 6] & M;
        long j18 = iArr2[i12 + 7] & M;
        int i23 = 0;
        long j19 = 0;
        int i24 = i13;
        while (i23 < 8) {
            int i25 = i23;
            long j21 = iArr[i11 + i23] & M;
            long j22 = j11;
            long j23 = (j21 * j11) + (iArr3[i14] & M) + 0;
            long j24 = j18;
            iArr3[i24 + 0] = (int) j23;
            int i26 = i24 + 1;
            long j25 = (j23 >>> 32) + (j21 * j12) + (iArr3[i26] & M);
            iArr3[i26] = (int) j25;
            long j26 = (j25 >>> 32) + (j21 * j13) + (iArr3[i15] & M);
            iArr3[i24 + 2] = (int) j26;
            long j27 = (j26 >>> 32) + (j21 * j14) + (iArr3[i16] & M);
            iArr3[i24 + 3] = (int) j27;
            long j28 = (j27 >>> 32) + (j21 * j15) + (iArr3[i17] & M);
            iArr3[i24 + 4] = (int) j28;
            long j29 = (j28 >>> 32) + (j21 * j16) + (iArr3[i18] & M);
            iArr3[i24 + 5] = (int) j29;
            long j31 = (j29 >>> 32) + (j21 * j17) + (iArr3[i19] & M);
            iArr3[i24 + 6] = (int) j31;
            long j32 = (j31 >>> 32) + (j21 * j24) + (iArr3[i21] & M);
            iArr3[i24 + 7] = (int) j32;
            long j33 = (j32 >>> 32) + j19 + (iArr3[i22] & M);
            iArr3[i24 + 8] = (int) j33;
            j19 = j33 >>> 32;
            i23 = i25 + 1;
            i24 = i26;
            j18 = j24;
            j11 = j22;
            j13 = j13;
            j12 = j12;
        }
        return (int) j19;
    }

    public static void mul(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        long j11 = iArr2[i12 + 0] & M;
        long j12 = iArr2[i12 + 1] & M;
        long j13 = iArr2[i12 + 2] & M;
        long j14 = iArr2[i12 + 3] & M;
        long j15 = iArr2[i12 + 4] & M;
        long j16 = iArr2[i12 + 5] & M;
        long j17 = iArr2[i12 + 6] & M;
        long j18 = iArr2[i12 + 7] & M;
        long j19 = iArr[i11 + 0] & M;
        long j21 = (j19 * j11) + 0;
        iArr3[i13 + 0] = (int) j21;
        long j22 = (j21 >>> 32) + (j19 * j12);
        iArr3[i13 + 1] = (int) j22;
        long j23 = (j22 >>> 32) + (j19 * j13);
        iArr3[i13 + 2] = (int) j23;
        long j24 = (j23 >>> 32) + (j19 * j14);
        iArr3[i13 + 3] = (int) j24;
        long j25 = (j24 >>> 32) + (j19 * j15);
        iArr3[i13 + 4] = (int) j25;
        long j26 = (j25 >>> 32) + (j19 * j16);
        iArr3[i13 + 5] = (int) j26;
        long j27 = (j26 >>> 32) + (j19 * j17);
        iArr3[i13 + 6] = (int) j27;
        long j28 = j18;
        long j29 = (j27 >>> 32) + (j19 * j28);
        iArr3[i13 + 7] = (int) j29;
        iArr3[i13 + 8] = (int) (j29 >>> 32);
        int i23 = 1;
        int i24 = i13;
        int i25 = 1;
        while (i25 < 8) {
            i24 += i23;
            long j31 = iArr[i11 + i25] & M;
            long j32 = (j31 * j11) + (iArr3[i14] & M) + 0;
            iArr3[i24 + 0] = (int) j32;
            long j33 = j28;
            long j34 = (j32 >>> 32) + (j31 * j12) + (iArr3[i15] & M);
            iArr3[i24 + 1] = (int) j34;
            long j35 = j13;
            long j36 = (j34 >>> 32) + (j31 * j13) + (iArr3[i16] & M);
            iArr3[i24 + 2] = (int) j36;
            long j37 = (j36 >>> 32) + (j31 * j14) + (iArr3[i17] & M);
            iArr3[i24 + 3] = (int) j37;
            long j38 = (j37 >>> 32) + (j31 * j15) + (iArr3[i18] & M);
            iArr3[i24 + 4] = (int) j38;
            long j39 = (j38 >>> 32) + (j31 * j16) + (iArr3[i19] & M);
            iArr3[i24 + 5] = (int) j39;
            long j41 = (j39 >>> 32) + (j31 * j17) + (iArr3[i21] & M);
            iArr3[i24 + 6] = (int) j41;
            long j42 = (j41 >>> 32) + (j31 * j33) + (iArr3[i22] & M);
            iArr3[i24 + 7] = (int) j42;
            iArr3[i24 + 8] = (int) (j42 >>> 32);
            i25++;
            j13 = j35;
            j28 = j33;
            j14 = j14;
            i23 = 1;
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
        int i23;
        int i24;
        int i25;
        int i26;
        long j11 = iArr[i11 + 0] & M;
        int i27 = 0;
        int i28 = 16;
        int i29 = 7;
        while (true) {
            int i31 = i29 - 1;
            long j12 = iArr[i11 + i29] & M;
            long j13 = j12 * j12;
            int i32 = i28 - 1;
            iArr2[i12 + i32] = (i27 << 31) | ((int) (j13 >>> 33));
            i28 = i32 - 1;
            iArr2[i12 + i28] = (int) (j13 >>> 1);
            i27 = (int) j13;
            if (i31 <= 0) {
                long j14 = j11 * j11;
                long j15 = ((i27 << 31) & M) | (j14 >>> 33);
                iArr2[i12 + 0] = (int) j14;
                long j16 = iArr[i11 + 1] & M;
                long j17 = iArr2[i13] & M;
                long j18 = j15 + (j16 * j11);
                int i33 = (int) j18;
                iArr2[i12 + 1] = (i33 << 1) | (((int) (j14 >>> 32)) & 1);
                int i34 = i33 >>> 31;
                long j19 = j17 + (j18 >>> 32);
                long j21 = iArr[i11 + 2] & M;
                long j22 = iArr2[i14] & M;
                long j23 = iArr2[i15] & M;
                long j24 = j19 + (j21 * j11);
                int i35 = (int) j24;
                iArr2[i12 + 2] = (i35 << 1) | i34;
                int i36 = i35 >>> 31;
                long j25 = j22 + (j24 >>> 32) + (j21 * j16);
                long j26 = j23 + (j25 >>> 32);
                long j27 = j25 & M;
                long j28 = iArr[i11 + 3] & M;
                long j29 = (iArr2[i16] & M) + (j26 >>> 32);
                long j31 = j26 & M;
                long j32 = (iArr2[i17] & M) + (j29 >>> 32);
                long j33 = j29 & M;
                long j34 = j27 + (j28 * j11);
                int i37 = (int) j34;
                iArr2[i12 + 3] = (i37 << 1) | i36;
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
                int i38 = (int) j46;
                iArr2[i12 + 4] = (i37 >>> 31) | (i38 << 1);
                int i39 = i38 >>> 31;
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
                long j59 = j49 + (j55 * j11);
                int i41 = (int) j59;
                iArr2[i12 + 5] = i39 | (i41 << 1);
                int i42 = i41 >>> 31;
                long j61 = j52 + (j59 >>> 32) + (j55 * j16);
                long j62 = j54 + (j61 >>> 32) + (j55 * j21);
                long j63 = j61 & M;
                long j64 = j57 + (j62 >>> 32) + (j55 * j28);
                long j65 = j62 & M;
                long j66 = j58 + (j64 >>> 32) + (j55 * j41);
                long j67 = j64 & M;
                long j68 = (iArr2[i22] & M) + (j56 >>> 32) + (j66 >>> 32);
                long j69 = j66 & M;
                long j71 = iArr[i11 + 6] & M;
                long j72 = (iArr2[i23] & M) + (j68 >>> 32);
                long j73 = j68 & M;
                long j74 = (iArr2[i24] & M) + (j72 >>> 32);
                long j75 = j72 & M;
                long j76 = j63 + (j71 * j11);
                int i43 = (int) j76;
                iArr2[i12 + 6] = i42 | (i43 << 1);
                int i44 = i43 >>> 31;
                long j77 = j65 + (j76 >>> 32) + (j71 * j16);
                long j78 = j67 + (j77 >>> 32) + (j71 * j21);
                long j79 = j77 & M;
                long j81 = j69 + (j78 >>> 32) + (j71 * j28);
                long j82 = j78 & M;
                long j83 = j73 + (j81 >>> 32) + (j71 * j41);
                long j84 = j81 & M;
                long j85 = j75 + (j83 >>> 32) + (j71 * j55);
                long j86 = j83 & M;
                long j87 = j74 + (j85 >>> 32);
                long j88 = j85 & M;
                long j89 = iArr[i11 + 7] & M;
                long j90 = (iArr2[i25] & M) + (j87 >>> 32);
                long j91 = j87 & M;
                long j92 = j90 & M;
                long j93 = j79 + (j11 * j89);
                int i45 = (int) j93;
                iArr2[i12 + 7] = (i45 << 1) | i44;
                long j94 = j82 + (j93 >>> 32) + (j89 * j16);
                long j95 = j84 + (j94 >>> 32) + (j89 * j21);
                long j96 = j86 + (j95 >>> 32) + (j89 * j28);
                long j97 = j88 + (j96 >>> 32) + (j89 * j41);
                long j98 = j91 + (j97 >>> 32) + (j89 * j55);
                long j99 = j92 + (j98 >>> 32) + (j89 * j71);
                long j100 = (iArr2[i26] & M) + (j90 >>> 32) + (j99 >>> 32);
                int i46 = (int) j94;
                iArr2[i12 + 8] = (i45 >>> 31) | (i46 << 1);
                int i47 = i46 >>> 31;
                int i48 = (int) j95;
                iArr2[i12 + 9] = i47 | (i48 << 1);
                int i49 = i48 >>> 31;
                int i51 = (int) j96;
                iArr2[i12 + 10] = i49 | (i51 << 1);
                int i52 = i51 >>> 31;
                int i53 = (int) j97;
                iArr2[i12 + 11] = i52 | (i53 << 1);
                int i54 = i53 >>> 31;
                int i55 = (int) j98;
                iArr2[i12 + 12] = i54 | (i55 << 1);
                int i56 = i55 >>> 31;
                int i57 = (int) j99;
                iArr2[i12 + 13] = i56 | (i57 << 1);
                int i58 = i57 >>> 31;
                int i59 = (int) j100;
                iArr2[i12 + 14] = i58 | (i59 << 1);
                int i61 = i59 >>> 31;
                int i62 = i12 + 15;
                iArr2[i62] = i61 | ((iArr2[i62] + ((int) (j100 >>> 32))) << 1);
                return;
            }
            i29 = i31;
        }
    }
}