package org.spongycastle.math.raw;

import java.math.BigInteger;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public abstract class Nat128 {
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
        return (int) (j14 >>> 32);
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
        return (int) (j14 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j11 = (iArr[0] & M) + (iArr2[0] & M) + 0;
        iArr2[0] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[1] & M) + (iArr2[1] & M);
        iArr2[1] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[2] & M) + (iArr2[2] & M);
        iArr2[2] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[3] & M) + (M & iArr2[3]);
        iArr2[3] = (int) j14;
        return (int) (j14 >>> 32);
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
        long j14 = (j13 >>> 32) + (iArr[i23] & M) + (M & iArr2[i24]);
        int i25 = (int) j14;
        iArr[i23] = i25;
        iArr2[i24] = i25;
        return (int) (j14 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static int[] create() {
        return new int[4];
    }

    public static long[] create64() {
        return new long[2];
    }

    public static int[] createExt() {
        return new int[8];
    }

    public static long[] createExt64() {
        return new long[4];
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
        for (int i11 = 3; i11 >= 0; i11--) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i11 = 1; i11 >= 0; i11--) {
            if (jArr[i11] != jArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= 128) {
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
        if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= 128) {
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
            if (i13 < 0 || i13 >= 4) {
                return 0;
            }
            i12 = iArr[i13] >>> (i11 & 31);
        }
        return i12 & 1;
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
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

    public static boolean isOne(int[] iArr) {
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

    public static boolean isOne64(long[] jArr) {
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

    public static boolean isZero(int[] iArr) {
        for (int i11 = 0; i11 < 4; i11++) {
            if (iArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i11 = 0; i11 < 2; i11++) {
            if (jArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j11 = iArr2[0] & M;
        int i11 = 1;
        long j12 = iArr2[1] & M;
        long j13 = iArr2[2] & M;
        long j14 = iArr2[3] & M;
        long j15 = iArr[0] & M;
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
            long j21 = iArr[i11] & M;
            int i13 = i11 + 0;
            int i14 = i11;
            long j22 = (j21 * j11) + (iArr3[i13] & M) + 0;
            iArr3[i13] = (int) j22;
            int i15 = i14 + 1;
            long j23 = j11;
            long j24 = (j22 >>> c11) + (j21 * j12) + (iArr3[i15] & M);
            iArr3[i15] = (int) j24;
            int i16 = i14 + 2;
            long j25 = (j24 >>> 32) + (j21 * j13) + (iArr3[i16] & M);
            iArr3[i16] = (int) j25;
            c11 = ' ';
            int i17 = i14 + 3;
            long j26 = (j25 >>> 32) + (j21 * j14) + (iArr3[i17] & M);
            iArr3[i17] = (int) j26;
            iArr3[i14 + 4] = (int) (j26 >>> 32);
            i11 = i15;
            j11 = j23;
            j12 = j12;
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
        long j21 = (j18 >>> 32) + (j11 * j19) + j17 + (M & iArr2[i13 + 3]);
        iArr3[i14 + 3] = (int) j21;
        return (j21 >>> 32) + j19;
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
        long j19 = (j18 >>> 32) + (iArr[i16] & M);
        iArr[i16] = (int) j19;
        return (int) (j19 >>> 32);
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
        return Nat.incAt(4, iArr, i13, 3);
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        long j11 = M;
        long j12 = iArr2[0] & M;
        long j13 = iArr2[1] & M;
        long j14 = iArr2[2] & M;
        long j15 = iArr2[3] & M;
        long j16 = 0;
        while (i15 < 4) {
            long j17 = iArr[i15] & j11;
            long j18 = (j17 * j12) + (iArr3[i11] & j11) + 0;
            iArr3[i15 + 0] = (int) j18;
            int i16 = i15 + 1;
            long j19 = (j18 >>> 32) + (j17 * j13) + (iArr3[i16] & M);
            iArr3[i16] = (int) j19;
            long j21 = (j19 >>> 32) + (j17 * j14) + (iArr3[i12] & M);
            iArr3[i15 + 2] = (int) j21;
            long j22 = (j21 >>> 32) + (j17 * j15) + (iArr3[i13] & M);
            iArr3[i15 + 3] = (int) j22;
            long j23 = (j22 >>> 32) + j16 + (iArr3[i14] & M);
            iArr3[i15 + 4] = (int) j23;
            j16 = j23 >>> 32;
            i15 = i16;
            j11 = 4294967295L;
            j12 = j12;
            j13 = j13;
        }
        return (int) j16;
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
        } while (i13 < 4);
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
        long j15 = (j14 >>> 32) + (j11 * (iArr[i12 + 3] & M)) + (iArr2[i17] & M);
        iArr2[i17] = (int) j15;
        return (int) (j15 >>> 32);
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
        return Nat.incAt(4, iArr, i12, 3);
    }

    public static int mulWordsAdd(int i11, int i12, int[] iArr, int i13) {
        long j11 = (i12 & M) * (i11 & M);
        int i14 = i13 + 0;
        long j12 = j11 + (iArr[i14] & M) + 0;
        iArr[i14] = (int) j12;
        int i15 = i13 + 1;
        long j13 = (j12 >>> 32) + (M & iArr[i15]);
        iArr[i15] = (int) j13;
        if ((j13 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(4, iArr, i13, 2);
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j11 = M;
        long j12 = iArr[0] & M;
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
                long j27 = j25 & M;
                long j28 = iArr[3] & M;
                long j29 = (iArr2[5] & M) + (j26 >>> 32);
                long j31 = j26 & M;
                long j32 = j29 & M;
                long j33 = j27 + (j12 * j28);
                int i19 = (int) j33;
                iArr2[3] = (i19 << 1) | (i18 >>> 31);
                long j34 = j31 + (j33 >>> 32) + (j17 * j28);
                long j35 = j32 + (j34 >>> 32) + (j28 * j21);
                long j36 = (iArr2[6] & M) + (j29 >>> 32) + (j35 >>> 32);
                long j37 = M & j35;
                int i21 = (int) j34;
                iArr2[4] = (i19 >>> 31) | (i21 << 1);
                int i22 = (int) j37;
                iArr2[5] = (i21 >>> 31) | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) j36;
                iArr2[6] = i23 | (i24 << 1);
                iArr2[7] = (i24 >>> 31) | ((iArr2[7] + ((int) (j36 >>> 32))) << 1);
                return;
            }
            i13 = i14;
            i12 = i16;
            c11 = c11;
            j11 = j11;
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
        return (int) (j14 >> 32);
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
        return (int) (j14 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j11 = ((iArr2[0] & M) - (iArr[0] & M)) + 0;
        iArr2[0] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr2[1] & M) - (iArr[1] & M));
        iArr2[1] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr2[2] & M) - (iArr[2] & M));
        iArr2[2] = (int) j13;
        long j14 = (j13 >> 32) + ((iArr2[3] & M) - (M & iArr[3]));
        iArr2[3] = (int) j14;
        return (int) (j14 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[16];
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = iArr[i11];
            if (i12 != 0) {
                Pack.intToBigEndian(i12, bArr, (3 - i11) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[16];
        for (int i11 = 0; i11 < 2; i11++) {
            long j11 = jArr[i11];
            if (j11 != 0) {
                Pack.longToBigEndian(j11, bArr, (1 - i11) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
    }

    public static boolean gte(int[] iArr, int i11, int[] iArr2, int i12) {
        for (int i13 = 3; i13 >= 0; i13--) {
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
        long j14 = (j13 >>> 32) + (iArr[i11 + 3] & M) + (M & iArr2[i17]);
        iArr2[i17] = (int) j14;
        return (int) (j14 >>> 32);
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
        return (int) (j14 >> 32);
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
        return (int) (j14 >> 32);
    }

    public static int mulAddTo(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        long j11 = M;
        long j12 = iArr2[i12 + 0] & M;
        long j13 = iArr2[i12 + 1] & M;
        long j14 = iArr2[i12 + 2] & M;
        long j15 = iArr2[i12 + 3] & M;
        int i18 = 0;
        long j16 = 0;
        int i19 = i13;
        while (i18 < 4) {
            long j17 = iArr[i11 + i18] & j11;
            long j18 = (j17 * j12) + (iArr3[i14] & j11) + 0;
            iArr3[i19 + 0] = (int) j18;
            int i21 = i19 + 1;
            long j19 = j13;
            long j21 = (j18 >>> 32) + (j17 * j13) + (iArr3[i21] & M);
            iArr3[i21] = (int) j21;
            long j22 = (j21 >>> 32) + (j17 * j14) + (iArr3[i15] & M);
            iArr3[i19 + 2] = (int) j22;
            long j23 = (j22 >>> 32) + (j17 * j15) + (iArr3[i16] & M);
            iArr3[i19 + 3] = (int) j23;
            long j24 = (j23 >>> 32) + j16 + (iArr3[i17] & M);
            iArr3[i19 + 4] = (int) j24;
            j16 = j24 >>> 32;
            i18++;
            i19 = i21;
            j12 = j12;
            j11 = 4294967295L;
            j13 = j19;
            j14 = j14;
        }
        return (int) j16;
    }

    public static void mul(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        long j11 = iArr2[i12 + 0] & M;
        long j12 = iArr2[i12 + 1] & M;
        long j13 = iArr2[i12 + 2] & M;
        long j14 = iArr2[i12 + 3] & M;
        long j15 = iArr[i11 + 0] & M;
        long j16 = (j15 * j11) + 0;
        iArr3[i13 + 0] = (int) j16;
        long j17 = (j16 >>> 32) + (j15 * j12);
        iArr3[i13 + 1] = (int) j17;
        long j18 = (j17 >>> 32) + (j15 * j13);
        iArr3[i13 + 2] = (int) j18;
        long j19 = (j18 >>> 32) + (j15 * j14);
        iArr3[i13 + 3] = (int) j19;
        iArr3[i13 + 4] = (int) (j19 >>> 32);
        int i18 = 1;
        int i19 = i13;
        int i21 = 1;
        while (i21 < 4) {
            i19 += i18;
            long j21 = iArr[i11 + i21] & M;
            long j22 = j11;
            long j23 = (j21 * j11) + (iArr3[i14] & M) + 0;
            iArr3[i19 + 0] = (int) j23;
            long j24 = (j23 >>> 32) + (j21 * j12) + (iArr3[i15] & M);
            iArr3[i19 + 1] = (int) j24;
            long j25 = j12;
            long j26 = (j24 >>> 32) + (j21 * j13) + (iArr3[i16] & M);
            iArr3[i19 + 2] = (int) j26;
            long j27 = (j26 >>> 32) + (j21 * j14) + (iArr3[i17] & M);
            iArr3[i19 + 3] = (int) j27;
            iArr3[i19 + 4] = (int) (j27 >>> 32);
            i21++;
            j12 = j25;
            j11 = j22;
            i18 = 1;
        }
    }

    public static void square(int[] iArr, int i11, int[] iArr2, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j11 = iArr[i11 + 0] & M;
        int i18 = 0;
        int i19 = 8;
        int i21 = 3;
        while (true) {
            int i22 = i21 - 1;
            long j12 = iArr[i11 + i21] & M;
            long j13 = j12 * j12;
            int i23 = i19 - 1;
            iArr2[i12 + i23] = (i18 << 31) | ((int) (j13 >>> 33));
            i19 = i23 - 1;
            iArr2[i12 + i19] = (int) (j13 >>> 1);
            i18 = (int) j13;
            if (i22 <= 0) {
                long j14 = j11 * j11;
                long j15 = ((i18 << 31) & M) | (j14 >>> 33);
                iArr2[i12 + 0] = (int) j14;
                long j16 = iArr[i11 + 1] & M;
                long j17 = iArr2[i13] & M;
                long j18 = j15 + (j16 * j11);
                int i24 = (int) j18;
                iArr2[i12 + 1] = (i24 << 1) | (((int) (j14 >>> 32)) & 1);
                int i25 = i24 >>> 31;
                long j19 = j17 + (j18 >>> 32);
                long j21 = iArr[i11 + 2] & M;
                long j22 = iArr2[i14] & M;
                long j23 = iArr2[i15] & M;
                long j24 = j19 + (j21 * j11);
                int i26 = (int) j24;
                iArr2[i12 + 2] = (i26 << 1) | i25;
                int i27 = i26 >>> 31;
                long j25 = j22 + (j24 >>> 32) + (j21 * j16);
                long j26 = j23 + (j25 >>> 32);
                long j27 = j25 & M;
                long j28 = iArr[i11 + 3] & M;
                long j29 = (iArr2[i16] & M) + (j26 >>> 32);
                long j31 = j26 & M;
                long j32 = M & j29;
                long j33 = j27 + (j11 * j28);
                int i28 = (int) j33;
                iArr2[i12 + 3] = (i28 << 1) | i27;
                long j34 = j31 + (j33 >>> 32) + (j28 * j16);
                long j35 = j32 + (j34 >>> 32) + (j28 * j21);
                long j36 = (iArr2[i17] & M) + (j29 >>> 32) + (j35 >>> 32);
                int i29 = (int) j34;
                iArr2[i12 + 4] = (i28 >>> 31) | (i29 << 1);
                int i31 = i29 >>> 31;
                int i32 = (int) j35;
                iArr2[i12 + 5] = i31 | (i32 << 1);
                int i33 = i32 >>> 31;
                int i34 = (int) j36;
                iArr2[i12 + 6] = i33 | (i34 << 1);
                int i35 = i34 >>> 31;
                int i36 = i12 + 7;
                iArr2[i36] = i35 | ((iArr2[i36] + ((int) (j36 >>> 32))) << 1);
                return;
            }
            i21 = i22;
        }
    }
}