package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.raw.Interleave;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat192;

/* loaded from: classes4.dex */
public class SecT131Field {
    private static final long M03 = 7;
    private static final long M44 = 17592186044415L;
    private static final long[] ROOT_Z = {2791191049453778211L, 2791191049453778402L, 6};

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
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        long[] fromBigInteger64 = Nat192.fromBigInteger64(bigInteger);
        reduce61(fromBigInteger64, 0);
        return fromBigInteger64;
    }

    protected static void implCompactExt(long[] jArr) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        jArr[0] = j11 ^ (j12 << 44);
        jArr[1] = (j12 >>> 20) ^ (j13 << 24);
        jArr[2] = ((j13 >>> 40) ^ (j14 << 4)) ^ (j15 << 48);
        jArr[3] = ((j14 >>> 60) ^ (j16 << 28)) ^ (j15 >>> 16);
        jArr[4] = j16 >>> 36;
        jArr[5] = 0;
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = ((jArr[2] << 40) ^ (j12 >>> 24)) & M44;
        long j14 = ((j12 << 20) ^ (j11 >>> 44)) & M44;
        long j15 = j11 & M44;
        long j16 = jArr2[0];
        long j17 = jArr2[1];
        long j18 = ((j17 >>> 24) ^ (jArr2[2] << 40)) & M44;
        long j19 = ((j16 >>> 44) ^ (j17 << 20)) & M44;
        long j21 = j16 & M44;
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
        long j35 = (((j32 ^ j29) ^ (jArr4[3] << 4)) ^ (jArr4[3] << 1)) ^ (j34 >>> 44);
        long j36 = j34 & M44;
        long j37 = (j33 ^ j27) ^ (j35 >>> 44);
        long j38 = j35 & M44;
        long j39 = (j36 >>> 1) ^ ((j38 & 1) << 43);
        long j41 = j39 ^ (j39 << 1);
        long j42 = j41 ^ (j41 << 2);
        long j43 = j42 ^ (j42 << 4);
        long j44 = j43 ^ (j43 << 8);
        long j45 = j44 ^ (j44 << 16);
        long j46 = (j45 ^ (j45 << 32)) & M44;
        long j47 = ((j38 >>> 1) ^ ((j37 & 1) << 43)) ^ (j46 >>> 43);
        long j48 = j47 ^ (j47 << 1);
        long j49 = j48 ^ (j48 << 2);
        long j51 = j49 ^ (j49 << 4);
        long j52 = j51 ^ (j51 << 8);
        long j53 = j52 ^ (j52 << 16);
        long j54 = (j53 ^ (j53 << 32)) & M44;
        long j55 = (j54 >>> 43) ^ (j37 >>> 1);
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
        int i12 = (int) j11;
        long j13 = (jArr2[(i12 >>> 6) & 7] << 6) ^ (jArr2[i12 & 7] ^ (jArr2[(i12 >>> 3) & 7] << 3));
        long j14 = 0;
        int i13 = 33;
        do {
            int i14 = (int) (j11 >>> i13);
            long j15 = ((jArr2[i14 & 7] ^ (jArr2[(i14 >>> 3) & 7] << 3)) ^ (jArr2[(i14 >>> 6) & 7] << 6)) ^ (jArr2[(i14 >>> 9) & 7] << 9);
            j13 ^= j15 << i13;
            j14 ^= j15 >>> (-i13);
            i13 -= 12;
        } while (i13 > 0);
        jArr[i11] = M44 & j13;
        jArr[i11 + 1] = (j13 >>> 44) ^ (j14 << 20);
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr[0], jArr2, 0);
        Interleave.expand64To128(jArr[1], jArr2, 2);
        jArr2[4] = Interleave.expand8to16((int) jArr[2]) & 4294967295L;
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (!Nat192.isZero64(jArr)) {
            long[] create64 = Nat192.create64();
            long[] create642 = Nat192.create64();
            square(jArr, create64);
            multiply(create64, jArr, create64);
            squareN(create64, 2, create642);
            multiply(create642, create64, create642);
            squareN(create642, 4, create64);
            multiply(create64, create642, create64);
            squareN(create64, 8, create642);
            multiply(create642, create64, create642);
            squareN(create642, 16, create64);
            multiply(create64, create642, create64);
            squareN(create64, 32, create642);
            multiply(create642, create64, create642);
            square(create642, create642);
            multiply(create642, jArr, create642);
            squareN(create642, 65, create64);
            multiply(create64, create642, create64);
            square(create64, jArr2);
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
        long j16 = j14 ^ (j15 >>> 59);
        long j17 = j11 ^ ((j16 << 61) ^ (j16 << 63));
        long j18 = (j12 ^ ((j15 << 61) ^ (j15 << 63))) ^ ((((j16 >>> 3) ^ (j16 >>> 1)) ^ j16) ^ (j16 << 5));
        long j19 = (j13 ^ ((((j15 >>> 3) ^ (j15 >>> 1)) ^ j15) ^ (j15 << 5))) ^ (j16 >>> 59);
        long j21 = j19 >>> 3;
        jArr2[0] = (((j17 ^ j21) ^ (j21 << 2)) ^ (j21 << 3)) ^ (j21 << 8);
        jArr2[1] = (j21 >>> 56) ^ j18;
        jArr2[2] = M03 & j19;
    }

    public static void reduce61(long[] jArr, int i11) {
        int i12 = i11 + 2;
        long j11 = jArr[i12];
        long j12 = j11 >>> 3;
        jArr[i11] = jArr[i11] ^ ((((j12 << 2) ^ j12) ^ (j12 << 3)) ^ (j12 << 8));
        int i13 = i11 + 1;
        jArr[i13] = (j12 >>> 56) ^ jArr[i13];
        jArr[i12] = j11 & M03;
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
        long[] create64 = Nat.create64(5);
        implSquare(jArr, create64);
        reduce(create64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] create64 = Nat.create64(5);
        implSquare(jArr, create64);
        addExt(jArr2, create64, jArr2);
    }

    public static void squareN(long[] jArr, int i11, long[] jArr2) {
        long[] create64 = Nat.create64(5);
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
        return ((int) ((jArr[0] ^ (jArr[1] >>> 59)) ^ (jArr[2] >>> 1))) & 1;
    }
}