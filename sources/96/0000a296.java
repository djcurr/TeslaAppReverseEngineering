package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.raw.Interleave;
import org.spongycastle.math.raw.Nat192;

/* loaded from: classes4.dex */
public class SecT163Field {
    private static final long M35 = 34359738367L;
    private static final long M55 = 36028797018963967L;
    private static final long[] ROOT_Z = {-5270498306774157648L, 5270498306774195053L, 19634136210L};

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr2[2] ^ jArr[2];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        long[] fromBigInteger64 = Nat192.fromBigInteger64(bigInteger);
        reduce29(fromBigInteger64, 0);
        return fromBigInteger64;
    }

    protected static void implCompactExt(long[] jArr) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        jArr[0] = j11 ^ (j12 << 55);
        jArr[1] = (j12 >>> 9) ^ (j13 << 46);
        jArr[2] = (j13 >>> 18) ^ (j14 << 37);
        jArr[3] = (j14 >>> 27) ^ (j15 << 28);
        jArr[4] = (j15 >>> 36) ^ (j16 << 19);
        jArr[5] = j16 >>> 45;
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = (jArr[2] << 18) ^ (j12 >>> 46);
        long j14 = ((j12 << 9) ^ (j11 >>> 55)) & M55;
        long j15 = j11 & M55;
        long j16 = jArr2[0];
        long j17 = jArr2[1];
        long j18 = (j17 >>> 46) ^ (jArr2[2] << 18);
        long j19 = ((j16 >>> 55) ^ (j17 << 9)) & M55;
        long j21 = j16 & M55;
        long[] jArr4 = new long[10];
        implMulw(j15, j21, jArr4, 0);
        implMulw(j13, j18, jArr4, 2);
        long j22 = (j15 ^ j14) ^ j13;
        long j23 = (j21 ^ j19) ^ j18;
        implMulw(j22, j23, jArr4, 4);
        long j24 = (j14 << 1) ^ (j13 << 2);
        long j25 = (j19 << 1) ^ (j18 << 2);
        implMulw(j15 ^ j24, j21 ^ j25, jArr4, 6);
        implMulw(j22 ^ j24, j23 ^ j25, jArr4, 8);
        long j26 = jArr4[6] ^ jArr4[8];
        long j27 = jArr4[7] ^ jArr4[9];
        long j28 = (j26 << 1) ^ jArr4[6];
        long j29 = (j26 ^ (j27 << 1)) ^ jArr4[7];
        long j31 = jArr4[0];
        long j32 = (jArr4[1] ^ jArr4[0]) ^ jArr4[4];
        long j33 = jArr4[1] ^ jArr4[5];
        long j34 = ((j28 ^ j31) ^ (jArr4[2] << 4)) ^ (jArr4[2] << 1);
        long j35 = (((j29 ^ j32) ^ (jArr4[3] << 4)) ^ (jArr4[3] << 1)) ^ (j34 >>> 55);
        long j36 = j34 & M55;
        long j37 = (j33 ^ j27) ^ (j35 >>> 55);
        long j38 = j35 & M55;
        long j39 = (j36 >>> 1) ^ ((j38 & 1) << 54);
        long j41 = j39 ^ (j39 << 1);
        long j42 = j41 ^ (j41 << 2);
        long j43 = j42 ^ (j42 << 4);
        long j44 = j43 ^ (j43 << 8);
        long j45 = j44 ^ (j44 << 16);
        long j46 = (j45 ^ (j45 << 32)) & M55;
        long j47 = ((j38 >>> 1) ^ ((j37 & 1) << 54)) ^ (j46 >>> 54);
        long j48 = j47 ^ (j47 << 1);
        long j49 = j48 ^ (j48 << 2);
        long j51 = j49 ^ (j49 << 4);
        long j52 = j51 ^ (j51 << 8);
        long j53 = j52 ^ (j52 << 16);
        long j54 = (j53 ^ (j53 << 32)) & M55;
        long j55 = (j37 >>> 1) ^ (j54 >>> 54);
        long j56 = j55 ^ (j55 << 1);
        long j57 = j56 ^ (j56 << 2);
        long j58 = j57 ^ (j57 << 4);
        long j59 = j58 ^ (j58 << 8);
        long j61 = j59 ^ (j59 << 16);
        long j62 = j61 ^ (j61 << 32);
        jArr3[0] = j31;
        jArr3[1] = (j32 ^ j46) ^ jArr4[2];
        jArr3[2] = ((j33 ^ j54) ^ j46) ^ jArr4[3];
        jArr3[3] = j62 ^ j54;
        jArr3[4] = jArr4[2] ^ j62;
        jArr3[5] = jArr4[3];
        implCompactExt(jArr3);
    }

    protected static void implMulw(long j11, long j12, long[] jArr, int i11) {
        long[] jArr2 = {0, j12, jArr2[1] << 1, jArr2[2] ^ j12, jArr2[2] << 1, jArr2[4] ^ j12, jArr2[3] << 1, jArr2[6] ^ j12};
        long j13 = jArr2[((int) j11) & 3];
        long j14 = 0;
        int i12 = 47;
        do {
            int i13 = (int) (j11 >>> i12);
            long j15 = (jArr2[i13 & 7] ^ (jArr2[(i13 >>> 3) & 7] << 3)) ^ (jArr2[(i13 >>> 6) & 7] << 6);
            j13 ^= j15 << i12;
            j14 ^= j15 >>> (-i12);
            i12 -= 9;
        } while (i12 > 0);
        jArr[i11] = M55 & j13;
        jArr[i11 + 1] = (j13 >>> 55) ^ (j14 << 9);
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr[0], jArr2, 0);
        Interleave.expand64To128(jArr[1], jArr2, 2);
        long j11 = jArr[2];
        jArr2[4] = Interleave.expand32to64((int) j11);
        jArr2[5] = Interleave.expand8to16((int) (j11 >>> 32)) & 4294967295L;
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (!Nat192.isZero64(jArr)) {
            long[] create64 = Nat192.create64();
            long[] create642 = Nat192.create64();
            square(jArr, create64);
            squareN(create64, 1, create642);
            multiply(create64, create642, create64);
            squareN(create642, 1, create642);
            multiply(create64, create642, create64);
            squareN(create64, 3, create642);
            multiply(create64, create642, create64);
            squareN(create642, 3, create642);
            multiply(create64, create642, create64);
            squareN(create64, 9, create642);
            multiply(create64, create642, create64);
            squareN(create642, 9, create642);
            multiply(create64, create642, create64);
            squareN(create64, 27, create642);
            multiply(create64, create642, create64);
            squareN(create642, 27, create642);
            multiply(create64, create642, create64);
            squareN(create64, 81, create642);
            multiply(create64, create642, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] createExt64 = Nat192.createExt64();
        implMultiply(jArr, jArr2, createExt64);
        reduce(createExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] createExt64 = Nat192.createExt64();
        implMultiply(jArr, jArr2, createExt64);
        addExt(jArr3, createExt64, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = j14 ^ ((((j16 >>> 35) ^ (j16 >>> 32)) ^ (j16 >>> 29)) ^ (j16 >>> 28));
        long j18 = j12 ^ ((((j15 << 29) ^ (j15 << 32)) ^ (j15 << 35)) ^ (j15 << 36));
        long j19 = (j13 ^ ((((j16 << 29) ^ (j16 << 32)) ^ (j16 << 35)) ^ (j16 << 36))) ^ ((j15 >>> 28) ^ (((j15 >>> 35) ^ (j15 >>> 32)) ^ (j15 >>> 29)));
        long j21 = j11 ^ ((((j17 << 29) ^ (j17 << 32)) ^ (j17 << 35)) ^ (j17 << 36));
        long j22 = j18 ^ ((j17 >>> 28) ^ (((j17 >>> 35) ^ (j17 >>> 32)) ^ (j17 >>> 29)));
        long j23 = j19 >>> 35;
        jArr2[0] = (((j21 ^ j23) ^ (j23 << 3)) ^ (j23 << 6)) ^ (j23 << 7);
        jArr2[1] = j22;
        jArr2[2] = M35 & j19;
    }

    public static void reduce29(long[] jArr, int i11) {
        int i12 = i11 + 2;
        long j11 = jArr[i12];
        long j12 = j11 >>> 35;
        jArr[i11] = ((j12 << 7) ^ (((j12 << 3) ^ j12) ^ (j12 << 6))) ^ jArr[i11];
        jArr[i12] = j11 & M35;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] create64 = Nat192.create64();
        long unshuffle = Interleave.unshuffle(jArr[0]);
        long unshuffle2 = Interleave.unshuffle(jArr[1]);
        create64[0] = (unshuffle >>> 32) | (unshuffle2 & (-4294967296L));
        long unshuffle3 = Interleave.unshuffle(jArr[2]);
        long j11 = unshuffle3 & 4294967295L;
        create64[1] = unshuffle3 >>> 32;
        multiply(create64, ROOT_Z, jArr2);
        jArr2[0] = jArr2[0] ^ ((unshuffle & 4294967295L) | (unshuffle2 << 32));
        jArr2[1] = jArr2[1] ^ j11;
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] createExt64 = Nat192.createExt64();
        implSquare(jArr, createExt64);
        reduce(createExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] createExt64 = Nat192.createExt64();
        implSquare(jArr, createExt64);
        addExt(jArr2, createExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i11, long[] jArr2) {
        long[] createExt64 = Nat192.createExt64();
        implSquare(jArr, createExt64);
        reduce(createExt64, jArr2);
        while (true) {
            i11--;
            if (i11 <= 0) {
                return;
            }
            implSquare(jArr2, createExt64);
            reduce(createExt64, jArr2);
        }
    }

    public static int trace(long[] jArr) {
        return ((int) (jArr[0] ^ (jArr[2] >>> 29))) & 1;
    }
}