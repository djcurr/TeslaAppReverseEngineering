package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.raw.Interleave;
import org.spongycastle.math.raw.Nat256;

/* loaded from: classes4.dex */
public class SecT193Field {
    private static final long M01 = 1;
    private static final long M49 = 562949953421311L;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        long[] fromBigInteger64 = Nat256.fromBigInteger64(bigInteger);
        reduce63(fromBigInteger64, 0);
        return fromBigInteger64;
    }

    protected static void implCompactExt(long[] jArr) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = jArr[6];
        long j18 = jArr[7];
        jArr[0] = j11 ^ (j12 << 49);
        jArr[1] = (j12 >>> 15) ^ (j13 << 34);
        jArr[2] = (j13 >>> 30) ^ (j14 << 19);
        jArr[3] = ((j14 >>> 45) ^ (j15 << 4)) ^ (j16 << 53);
        jArr[4] = ((j15 >>> 60) ^ (j17 << 38)) ^ (j16 >>> 11);
        jArr[5] = (j17 >>> 26) ^ (j18 << 23);
        jArr[6] = j18 >>> 41;
        jArr[7] = 0;
    }

    protected static void implExpand(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        jArr2[0] = j11 & M49;
        jArr2[1] = ((j11 >>> 49) ^ (j12 << 15)) & M49;
        jArr2[2] = ((j12 >>> 34) ^ (j13 << 30)) & M49;
        jArr2[3] = (j13 >>> 19) ^ (j14 << 45);
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        implExpand(jArr, jArr4);
        implExpand(jArr2, jArr5);
        implMulwAcc(jArr4[0], jArr5[0], jArr3, 0);
        implMulwAcc(jArr4[1], jArr5[1], jArr3, 1);
        implMulwAcc(jArr4[2], jArr5[2], jArr3, 2);
        implMulwAcc(jArr4[3], jArr5[3], jArr3, 3);
        for (int i11 = 5; i11 > 0; i11--) {
            jArr3[i11] = jArr3[i11] ^ jArr3[i11 - 1];
        }
        implMulwAcc(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        implMulwAcc(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i12 = 7; i12 > 1; i12--) {
            jArr3[i12] = jArr3[i12] ^ jArr3[i12 - 2];
        }
        long j11 = jArr4[0] ^ jArr4[2];
        long j12 = jArr4[1] ^ jArr4[3];
        long j13 = jArr5[0] ^ jArr5[2];
        long j14 = jArr5[1] ^ jArr5[3];
        implMulwAcc(j11 ^ j12, j13 ^ j14, jArr3, 3);
        long[] jArr6 = new long[3];
        implMulwAcc(j11, j13, jArr6, 0);
        implMulwAcc(j12, j14, jArr6, 1);
        long j15 = jArr6[0];
        long j16 = jArr6[1];
        long j17 = jArr6[2];
        jArr3[2] = jArr3[2] ^ j15;
        jArr3[3] = (j15 ^ j16) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j17 ^ j16);
        jArr3[5] = jArr3[5] ^ j17;
        implCompactExt(jArr3);
    }

    protected static void implMulwAcc(long j11, long j12, long[] jArr, int i11) {
        long[] jArr2 = {0, j12, jArr2[1] << 1, jArr2[2] ^ j12, jArr2[2] << 1, jArr2[4] ^ j12, jArr2[3] << 1, jArr2[6] ^ j12};
        int i12 = (int) j11;
        long j13 = (jArr2[(i12 >>> 3) & 7] << 3) ^ jArr2[i12 & 7];
        long j14 = 0;
        int i13 = 36;
        do {
            int i14 = (int) (j11 >>> i13);
            long j15 = (((jArr2[i14 & 7] ^ (jArr2[(i14 >>> 3) & 7] << 3)) ^ (jArr2[(i14 >>> 6) & 7] << 6)) ^ (jArr2[(i14 >>> 9) & 7] << 9)) ^ (jArr2[(i14 >>> 12) & 7] << 12);
            j13 ^= j15 << i13;
            j14 ^= j15 >>> (-i13);
            i13 -= 15;
        } while (i13 > 0);
        jArr[i11] = jArr[i11] ^ (M49 & j13);
        int i15 = i11 + 1;
        jArr[i15] = jArr[i15] ^ ((j13 >>> 49) ^ (j14 << 15));
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr[0], jArr2, 0);
        Interleave.expand64To128(jArr[1], jArr2, 2);
        Interleave.expand64To128(jArr[2], jArr2, 4);
        jArr2[6] = jArr[3] & 1;
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (!Nat256.isZero64(jArr)) {
            long[] create64 = Nat256.create64();
            long[] create642 = Nat256.create64();
            square(jArr, create64);
            squareN(create64, 1, create642);
            multiply(create64, create642, create64);
            squareN(create642, 1, create642);
            multiply(create64, create642, create64);
            squareN(create64, 3, create642);
            multiply(create64, create642, create64);
            squareN(create64, 6, create642);
            multiply(create64, create642, create64);
            squareN(create64, 12, create642);
            multiply(create64, create642, create64);
            squareN(create64, 24, create642);
            multiply(create64, create642, create64);
            squareN(create64, 48, create642);
            multiply(create64, create642, create64);
            squareN(create64, 96, create642);
            multiply(create64, create642, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] createExt64 = Nat256.createExt64();
        implMultiply(jArr, jArr2, createExt64);
        reduce(createExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] createExt64 = Nat256.createExt64();
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
        long j17 = jArr[6];
        long j18 = j15 ^ (j17 >>> 50);
        long j19 = (j14 ^ ((j17 >>> 1) ^ (j17 << 14))) ^ (j16 >>> 50);
        long j21 = j11 ^ (j18 << 63);
        long j22 = (j12 ^ (j16 << 63)) ^ ((j18 >>> 1) ^ (j18 << 14));
        long j23 = ((j13 ^ (j17 << 63)) ^ ((j16 >>> 1) ^ (j16 << 14))) ^ (j18 >>> 50);
        long j24 = j19 >>> 1;
        jArr2[0] = (j21 ^ j24) ^ (j24 << 15);
        jArr2[1] = (j24 >>> 49) ^ j22;
        jArr2[2] = j23;
        jArr2[3] = 1 & j19;
    }

    public static void reduce63(long[] jArr, int i11) {
        int i12 = i11 + 3;
        long j11 = jArr[i12];
        long j12 = j11 >>> 1;
        jArr[i11] = jArr[i11] ^ ((j12 << 15) ^ j12);
        int i13 = i11 + 1;
        jArr[i13] = (j12 >>> 49) ^ jArr[i13];
        jArr[i12] = j11 & 1;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long unshuffle = Interleave.unshuffle(jArr[0]);
        long unshuffle2 = Interleave.unshuffle(jArr[1]);
        long j11 = (unshuffle & 4294967295L) | (unshuffle2 << 32);
        long j12 = (unshuffle >>> 32) | (unshuffle2 & (-4294967296L));
        long unshuffle3 = Interleave.unshuffle(jArr[2]);
        long j13 = (unshuffle3 & 4294967295L) ^ (jArr[3] << 32);
        long j14 = unshuffle3 >>> 32;
        jArr2[0] = j11 ^ (j12 << 8);
        jArr2[1] = ((j13 ^ (j14 << 8)) ^ (j12 >>> 56)) ^ (j12 << 33);
        jArr2[2] = (j12 >>> 31) ^ ((j14 >>> 56) ^ (j14 << 33));
        jArr2[3] = j14 >>> 31;
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] createExt64 = Nat256.createExt64();
        implSquare(jArr, createExt64);
        reduce(createExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] createExt64 = Nat256.createExt64();
        implSquare(jArr, createExt64);
        addExt(jArr2, createExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i11, long[] jArr2) {
        long[] createExt64 = Nat256.createExt64();
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
        return ((int) jArr[0]) & 1;
    }
}