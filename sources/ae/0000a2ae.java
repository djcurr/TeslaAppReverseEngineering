package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.raw.Interleave;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat320;

/* loaded from: classes4.dex */
public class SecT283Field {
    private static final long M27 = 134217727;
    private static final long M57 = 144115188075855871L;
    private static final long[] ROOT_Z = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr2[8] ^ jArr[8];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        long[] fromBigInteger64 = Nat320.fromBigInteger64(bigInteger);
        reduce37(fromBigInteger64, 0);
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
        long j19 = jArr[8];
        long j21 = jArr[9];
        jArr[0] = j11 ^ (j12 << 57);
        jArr[1] = (j12 >>> 7) ^ (j13 << 50);
        jArr[2] = (j13 >>> 14) ^ (j14 << 43);
        jArr[3] = (j14 >>> 21) ^ (j15 << 36);
        jArr[4] = (j15 >>> 28) ^ (j16 << 29);
        jArr[5] = (j16 >>> 35) ^ (j17 << 22);
        jArr[6] = (j17 >>> 42) ^ (j18 << 15);
        jArr[7] = (j18 >>> 49) ^ (j19 << 8);
        jArr[8] = (j19 >>> 56) ^ (j21 << 1);
        jArr[9] = j21 >>> 63;
    }

    protected static void implExpand(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        jArr2[0] = j11 & M57;
        jArr2[1] = ((j11 >>> 57) ^ (j12 << 7)) & M57;
        jArr2[2] = ((j12 >>> 50) ^ (j13 << 14)) & M57;
        jArr2[3] = ((j13 >>> 43) ^ (j14 << 21)) & M57;
        jArr2[4] = (j14 >>> 36) ^ (j15 << 28);
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        implExpand(jArr, jArr4);
        implExpand(jArr2, jArr5);
        long[] jArr6 = new long[26];
        implMulw(jArr4[0], jArr5[0], jArr6, 0);
        implMulw(jArr4[1], jArr5[1], jArr6, 2);
        implMulw(jArr4[2], jArr5[2], jArr6, 4);
        implMulw(jArr4[3], jArr5[3], jArr6, 6);
        implMulw(jArr4[4], jArr5[4], jArr6, 8);
        long j11 = jArr4[0] ^ jArr4[1];
        long j12 = jArr5[0] ^ jArr5[1];
        long j13 = jArr4[0] ^ jArr4[2];
        long j14 = jArr5[0] ^ jArr5[2];
        long j15 = jArr4[2] ^ jArr4[4];
        long j16 = jArr5[2] ^ jArr5[4];
        long j17 = jArr4[3] ^ jArr4[4];
        long j18 = jArr5[3] ^ jArr5[4];
        implMulw(j13 ^ jArr4[3], j14 ^ jArr5[3], jArr6, 18);
        implMulw(j15 ^ jArr4[1], j16 ^ jArr5[1], jArr6, 20);
        long j19 = j11 ^ j17;
        long j21 = j12 ^ j18;
        implMulw(j19, j21, jArr6, 22);
        implMulw(j19 ^ jArr4[2], jArr5[2] ^ j21, jArr6, 24);
        implMulw(j11, j12, jArr6, 10);
        implMulw(j13, j14, jArr6, 12);
        implMulw(j15, j16, jArr6, 14);
        implMulw(j17, j18, jArr6, 16);
        jArr3[0] = jArr6[0];
        jArr3[9] = jArr6[9];
        long j22 = jArr6[0] ^ jArr6[1];
        long j23 = jArr6[2] ^ j22;
        long j24 = jArr6[10] ^ j23;
        jArr3[1] = j24;
        long j25 = jArr6[3] ^ jArr6[4];
        long j26 = j23 ^ (j25 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j26;
        long j27 = jArr6[5] ^ jArr6[6];
        long j28 = ((j22 ^ j25) ^ j27) ^ jArr6[8];
        long j29 = jArr6[13] ^ jArr6[14];
        jArr3[3] = (j28 ^ j29) ^ ((jArr6[18] ^ jArr6[22]) ^ jArr6[24]);
        long j31 = (jArr6[7] ^ jArr6[8]) ^ jArr6[9];
        long j32 = j31 ^ jArr6[17];
        jArr3[8] = j32;
        long j33 = (j31 ^ j27) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j33;
        long j34 = j24 ^ j33;
        long j35 = (jArr6[19] ^ jArr6[20]) ^ (jArr6[25] ^ jArr6[24]);
        jArr3[4] = (j35 ^ (jArr6[18] ^ jArr6[23])) ^ j34;
        jArr3[5] = ((j26 ^ j32) ^ j35) ^ (jArr6[21] ^ jArr6[22]);
        jArr3[6] = ((((jArr6[9] ^ (j28 ^ jArr6[0])) ^ j29) ^ jArr6[21]) ^ jArr6[23]) ^ jArr6[25];
        implCompactExt(jArr3);
    }

    protected static void implMulw(long j11, long j12, long[] jArr, int i11) {
        long[] jArr2 = {0, j12, jArr2[1] << 1, jArr2[2] ^ j12, jArr2[2] << 1, jArr2[4] ^ j12, jArr2[3] << 1, jArr2[6] ^ j12};
        long j13 = jArr2[((int) j11) & 7];
        long j14 = 0;
        int i12 = 48;
        do {
            int i13 = (int) (j11 >>> i12);
            long j15 = (jArr2[i13 & 7] ^ (jArr2[(i13 >>> 3) & 7] << 3)) ^ (jArr2[(i13 >>> 6) & 7] << 6);
            j13 ^= j15 << i12;
            j14 ^= j15 >>> (-i12);
            i12 -= 9;
        } while (i12 > 0);
        jArr[i11] = M57 & j13;
        jArr[i11 + 1] = (((((j11 & 72198606942111744L) & ((j12 << 7) >> 63)) >>> 8) ^ j14) << 7) ^ (j13 >>> 57);
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        for (int i11 = 0; i11 < 4; i11++) {
            Interleave.expand64To128(jArr[i11], jArr2, i11 << 1);
        }
        jArr2[8] = Interleave.expand32to64((int) jArr[4]);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (!Nat320.isZero64(jArr)) {
            long[] create64 = Nat320.create64();
            long[] create642 = Nat320.create64();
            square(jArr, create64);
            multiply(create64, jArr, create64);
            squareN(create64, 2, create642);
            multiply(create642, create64, create642);
            squareN(create642, 4, create64);
            multiply(create64, create642, create64);
            squareN(create64, 8, create642);
            multiply(create642, create64, create642);
            square(create642, create642);
            multiply(create642, jArr, create642);
            squareN(create642, 17, create64);
            multiply(create64, create642, create64);
            square(create64, create64);
            multiply(create64, jArr, create64);
            squareN(create64, 35, create642);
            multiply(create642, create64, create642);
            squareN(create642, 70, create64);
            multiply(create64, create642, create64);
            square(create64, create64);
            multiply(create64, jArr, create64);
            squareN(create64, 141, create642);
            multiply(create642, create64, create642);
            square(create642, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] createExt64 = Nat320.createExt64();
        implMultiply(jArr, jArr2, createExt64);
        reduce(createExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] createExt64 = Nat320.createExt64();
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
        long j18 = jArr[7];
        long j19 = jArr[8];
        long j21 = j15 ^ ((((j19 >>> 27) ^ (j19 >>> 22)) ^ (j19 >>> 20)) ^ (j19 >>> 15));
        long j22 = j11 ^ ((((j16 << 37) ^ (j16 << 42)) ^ (j16 << 44)) ^ (j16 << 49));
        long j23 = (j12 ^ ((((j17 << 37) ^ (j17 << 42)) ^ (j17 << 44)) ^ (j17 << 49))) ^ ((((j16 >>> 27) ^ (j16 >>> 22)) ^ (j16 >>> 20)) ^ (j16 >>> 15));
        long j24 = j21 >>> 27;
        jArr2[0] = (((j22 ^ j24) ^ (j24 << 5)) ^ (j24 << 7)) ^ (j24 << 12);
        jArr2[1] = j23;
        jArr2[2] = (j13 ^ ((((j18 << 37) ^ (j18 << 42)) ^ (j18 << 44)) ^ (j18 << 49))) ^ ((((j17 >>> 27) ^ (j17 >>> 22)) ^ (j17 >>> 20)) ^ (j17 >>> 15));
        jArr2[3] = (j14 ^ ((((j19 << 37) ^ (j19 << 42)) ^ (j19 << 44)) ^ (j19 << 49))) ^ ((((j18 >>> 27) ^ (j18 >>> 22)) ^ (j18 >>> 20)) ^ (j18 >>> 15));
        jArr2[4] = M27 & j21;
    }

    public static void reduce37(long[] jArr, int i11) {
        int i12 = i11 + 4;
        long j11 = jArr[i12];
        long j12 = j11 >>> 27;
        jArr[i11] = ((j12 << 12) ^ (((j12 << 5) ^ j12) ^ (j12 << 7))) ^ jArr[i11];
        jArr[i12] = j11 & M27;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] create64 = Nat320.create64();
        long unshuffle = Interleave.unshuffle(jArr[0]);
        long unshuffle2 = Interleave.unshuffle(jArr[1]);
        long j11 = (unshuffle & 4294967295L) | (unshuffle2 << 32);
        create64[0] = (unshuffle >>> 32) | (unshuffle2 & (-4294967296L));
        long unshuffle3 = Interleave.unshuffle(jArr[2]);
        long unshuffle4 = Interleave.unshuffle(jArr[3]);
        create64[1] = (unshuffle3 >>> 32) | ((-4294967296L) & unshuffle4);
        long unshuffle5 = Interleave.unshuffle(jArr[4]);
        create64[2] = unshuffle5 >>> 32;
        multiply(create64, ROOT_Z, jArr2);
        jArr2[0] = jArr2[0] ^ j11;
        jArr2[1] = jArr2[1] ^ ((unshuffle3 & 4294967295L) | (unshuffle4 << 32));
        jArr2[2] = jArr2[2] ^ (4294967295L & unshuffle5);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] create64 = Nat.create64(9);
        implSquare(jArr, create64);
        reduce(create64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] create64 = Nat.create64(9);
        implSquare(jArr, create64);
        addExt(jArr2, create64, jArr2);
    }

    public static void squareN(long[] jArr, int i11, long[] jArr2) {
        long[] create64 = Nat.create64(9);
        implSquare(jArr, create64);
        reduce(create64, jArr2);
        while (true) {
            i11--;
            if (i11 <= 0) {
                return;
            }
            implSquare(jArr2, create64);
            reduce(create64, jArr2);
        }
    }

    public static int trace(long[] jArr) {
        return ((int) (jArr[0] ^ (jArr[4] >>> 15))) & 1;
    }
}