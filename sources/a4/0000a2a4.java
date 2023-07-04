package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.raw.Interleave;
import org.spongycastle.math.raw.Nat256;

/* loaded from: classes4.dex */
public class SecT233Field {
    private static final long M41 = 2199023255551L;
    private static final long M59 = 576460752303423487L;

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
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        long[] fromBigInteger64 = Nat256.fromBigInteger64(bigInteger);
        reduce23(fromBigInteger64, 0);
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
        jArr[0] = j11 ^ (j12 << 59);
        jArr[1] = (j12 >>> 5) ^ (j13 << 54);
        jArr[2] = (j13 >>> 10) ^ (j14 << 49);
        jArr[3] = (j14 >>> 15) ^ (j15 << 44);
        jArr[4] = (j15 >>> 20) ^ (j16 << 39);
        jArr[5] = (j16 >>> 25) ^ (j17 << 34);
        jArr[6] = (j17 >>> 30) ^ (j18 << 29);
        jArr[7] = j18 >>> 35;
    }

    protected static void implExpand(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        jArr2[0] = j11 & M59;
        jArr2[1] = ((j11 >>> 59) ^ (j12 << 5)) & M59;
        jArr2[2] = ((j12 >>> 54) ^ (j13 << 10)) & M59;
        jArr2[3] = (j13 >>> 49) ^ (j14 << 15);
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
        int i13 = 54;
        do {
            int i14 = (int) (j11 >>> i13);
            long j15 = jArr2[i14 & 7] ^ (jArr2[(i14 >>> 3) & 7] << 3);
            j13 ^= j15 << i13;
            j14 ^= j15 >>> (-i13);
            i13 -= 6;
        } while (i13 > 0);
        jArr[i11] = jArr[i11] ^ (M59 & j13);
        int i15 = i11 + 1;
        jArr[i15] = jArr[i15] ^ ((j13 >>> 59) ^ (j14 << 5));
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr[0], jArr2, 0);
        Interleave.expand64To128(jArr[1], jArr2, 2);
        Interleave.expand64To128(jArr[2], jArr2, 4);
        long j11 = jArr[3];
        jArr2[6] = Interleave.expand32to64((int) j11);
        jArr2[7] = Interleave.expand16to32((int) (j11 >>> 32)) & 4294967295L;
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (!Nat256.isZero64(jArr)) {
            long[] create64 = Nat256.create64();
            long[] create642 = Nat256.create64();
            square(jArr, create64);
            multiply(create64, jArr, create64);
            square(create64, create64);
            multiply(create64, jArr, create64);
            squareN(create64, 3, create642);
            multiply(create642, create64, create642);
            square(create642, create642);
            multiply(create642, jArr, create642);
            squareN(create642, 7, create64);
            multiply(create64, create642, create64);
            squareN(create64, 14, create642);
            multiply(create642, create64, create642);
            square(create642, create642);
            multiply(create642, jArr, create642);
            squareN(create642, 29, create64);
            multiply(create64, create642, create64);
            squareN(create64, 58, create642);
            multiply(create642, create64, create642);
            squareN(create642, 116, create64);
            multiply(create64, create642, create64);
            square(create64, jArr2);
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
        long j18 = jArr[7];
        long j19 = j16 ^ (j18 >>> 31);
        long j21 = (j15 ^ ((j18 >>> 41) ^ (j18 << 33))) ^ (j17 >>> 31);
        long j22 = ((j14 ^ (j18 << 23)) ^ ((j17 >>> 41) ^ (j17 << 33))) ^ (j19 >>> 31);
        long j23 = j11 ^ (j21 << 23);
        long j24 = ((j13 ^ (j17 << 23)) ^ ((j19 >>> 41) ^ (j19 << 33))) ^ (j21 >>> 31);
        long j25 = j22 >>> 41;
        jArr2[0] = j23 ^ j25;
        long j26 = j25 << 10;
        jArr2[1] = j26 ^ ((j12 ^ (j19 << 23)) ^ ((j21 >>> 41) ^ (j21 << 33)));
        jArr2[2] = j24;
        jArr2[3] = M41 & j22;
    }

    public static void reduce23(long[] jArr, int i11) {
        int i12 = i11 + 3;
        long j11 = jArr[i12];
        long j12 = j11 >>> 41;
        jArr[i11] = jArr[i11] ^ j12;
        int i13 = i11 + 1;
        jArr[i13] = (j12 << 10) ^ jArr[i13];
        jArr[i12] = j11 & M41;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long unshuffle = Interleave.unshuffle(jArr[0]);
        long unshuffle2 = Interleave.unshuffle(jArr[1]);
        long j11 = (unshuffle & 4294967295L) | (unshuffle2 << 32);
        long j12 = (unshuffle >>> 32) | (unshuffle2 & (-4294967296L));
        long unshuffle3 = Interleave.unshuffle(jArr[2]);
        long unshuffle4 = Interleave.unshuffle(jArr[3]);
        long j13 = (4294967295L & unshuffle3) | (unshuffle4 << 32);
        long j14 = (unshuffle3 >>> 32) | (unshuffle4 & (-4294967296L));
        long j15 = j14 >>> 27;
        long j16 = j14 ^ ((j12 >>> 27) | (j14 << 37));
        long j17 = j12 ^ (j12 << 37);
        long[] createExt64 = Nat256.createExt64();
        int[] iArr = {32, 117, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256};
        int i11 = 0;
        for (int i12 = 3; i11 < i12; i12 = 3) {
            int i13 = iArr[i11] >>> 6;
            int i14 = iArr[i11] & 63;
            createExt64[i13] = createExt64[i13] ^ (j17 << i14);
            int i15 = i13 + 1;
            int i16 = -i14;
            createExt64[i15] = createExt64[i15] ^ ((j16 << i14) | (j17 >>> i16));
            int i17 = i13 + 2;
            createExt64[i17] = createExt64[i17] ^ ((j15 << i14) | (j16 >>> i16));
            int i18 = i13 + 3;
            createExt64[i18] = createExt64[i18] ^ (j15 >>> i16);
            i11++;
        }
        reduce(createExt64, jArr2);
        jArr2[0] = jArr2[0] ^ j11;
        jArr2[1] = jArr2[1] ^ j13;
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
        return ((int) (jArr[0] ^ (jArr[2] >>> 31))) & 1;
    }
}