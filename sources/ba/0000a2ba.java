package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.raw.Interleave;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat576;

/* loaded from: classes4.dex */
public class SecT571Field {
    private static final long M59 = 576460752303423487L;
    private static final long RM = -1190112520884487202L;
    private static final long[] ROOT_Z = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 0; i11 < 9; i11++) {
            jArr3[i11] = jArr[i11] ^ jArr2[i11];
        }
    }

    private static void addBothTo(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13) {
        for (int i14 = 0; i14 < 9; i14++) {
            int i15 = i13 + i14;
            jArr3[i15] = jArr3[i15] ^ (jArr[i11 + i14] ^ jArr2[i12 + i14]);
        }
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 0; i11 < 18; i11++) {
            jArr3[i11] = jArr[i11] ^ jArr2[i11];
        }
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        for (int i11 = 1; i11 < 9; i11++) {
            jArr2[i11] = jArr[i11];
        }
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        long[] fromBigInteger64 = Nat576.fromBigInteger64(bigInteger);
        reduce5(fromBigInteger64, 0);
        return fromBigInteger64;
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[144];
        System.arraycopy(jArr2, 0, jArr4, 9, 9);
        int i11 = 7;
        int i12 = 0;
        while (i11 > 0) {
            int i13 = i12 + 18;
            Nat.shiftUpBit64(9, jArr4, i13 >>> 1, 0L, jArr4, i13);
            reduce5(jArr4, i13);
            add(jArr4, 9, jArr4, i13, jArr4, i13 + 9);
            i11--;
            i12 = i13;
        }
        long[] jArr5 = new long[144];
        Nat.shiftUpBits64(144, jArr4, 0, 4, 0L, jArr5, 0);
        for (int i14 = 56; i14 >= 0; i14 -= 8) {
            for (int i15 = 1; i15 < 9; i15 += 2) {
                int i16 = (int) (jArr[i15] >>> i14);
                addBothTo(jArr4, (i16 & 15) * 9, jArr5, ((i16 >>> 4) & 15) * 9, jArr3, i15 - 1);
            }
            Nat.shiftUpBits64(16, jArr3, 0, 8, 0L);
        }
        for (int i17 = 56; i17 >= 0; i17 -= 8) {
            for (int i18 = 0; i18 < 9; i18 += 2) {
                int i19 = (int) (jArr[i18] >>> i17);
                addBothTo(jArr4, (i19 & 15) * 9, jArr5, ((i19 >>> 4) & 15) * 9, jArr3, i18);
            }
            if (i17 > 0) {
                Nat.shiftUpBits64(18, jArr3, 0, 8, 0L);
            }
        }
    }

    protected static void implMulwAcc(long[] jArr, long j11, long[] jArr2, int i11) {
        long[] jArr3 = new long[32];
        jArr3[1] = j11;
        for (int i12 = 2; i12 < 32; i12 += 2) {
            jArr3[i12] = jArr3[i12 >>> 1] << 1;
            jArr3[i12 + 1] = jArr3[i12] ^ j11;
        }
        int i13 = 0;
        long j12 = 0;
        while (i13 < 9) {
            long j13 = jArr[i13];
            long j14 = j12 ^ jArr3[((int) j13) & 31];
            int i14 = 60;
            long j15 = 0;
            do {
                long j16 = jArr3[((int) (j13 >>> i14)) & 31];
                j14 ^= j16 << i14;
                j15 ^= j16 >>> (-i14);
                i14 -= 5;
            } while (i14 > 0);
            for (int i15 = 0; i15 < 4; i15++) {
                j13 = (j13 & RM) >>> 1;
                j15 ^= ((j11 << i15) >> 63) & j13;
            }
            int i16 = i11 + i13;
            jArr2[i16] = j14 ^ jArr2[i16];
            i13++;
            j12 = j15;
        }
        int i17 = i11 + 9;
        jArr2[i17] = jArr2[i17] ^ j12;
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        for (int i11 = 0; i11 < 9; i11++) {
            Interleave.expand64To128(jArr[i11], jArr2, i11 << 1);
        }
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (!Nat576.isZero64(jArr)) {
            long[] create64 = Nat576.create64();
            long[] create642 = Nat576.create64();
            long[] create643 = Nat576.create64();
            square(jArr, create643);
            square(create643, create64);
            square(create64, create642);
            multiply(create64, create642, create64);
            squareN(create64, 2, create642);
            multiply(create64, create642, create64);
            multiply(create64, create643, create64);
            squareN(create64, 5, create642);
            multiply(create64, create642, create64);
            squareN(create642, 5, create642);
            multiply(create64, create642, create64);
            squareN(create64, 15, create642);
            multiply(create64, create642, create643);
            squareN(create643, 30, create64);
            squareN(create64, 30, create642);
            multiply(create64, create642, create64);
            squareN(create64, 60, create642);
            multiply(create64, create642, create64);
            squareN(create642, 60, create642);
            multiply(create64, create642, create64);
            squareN(create64, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256, create642);
            multiply(create64, create642, create64);
            squareN(create642, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256, create642);
            multiply(create64, create642, create64);
            multiply(create64, create643, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] createExt64 = Nat576.createExt64();
        implMultiply(jArr, jArr2, createExt64);
        reduce(createExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] createExt64 = Nat576.createExt64();
        implMultiply(jArr, jArr2, createExt64);
        addExt(jArr3, createExt64, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j11 = jArr[9];
        long j12 = jArr[17];
        long j13 = (((j11 ^ (j12 >>> 59)) ^ (j12 >>> 57)) ^ (j12 >>> 54)) ^ (j12 >>> 49);
        long j14 = (j12 << 15) ^ (((jArr[8] ^ (j12 << 5)) ^ (j12 << 7)) ^ (j12 << 10));
        for (int i11 = 16; i11 >= 10; i11--) {
            long j15 = jArr[i11];
            jArr2[i11 - 8] = (((j14 ^ (j15 >>> 59)) ^ (j15 >>> 57)) ^ (j15 >>> 54)) ^ (j15 >>> 49);
            j14 = (((jArr[i11 - 9] ^ (j15 << 5)) ^ (j15 << 7)) ^ (j15 << 10)) ^ (j15 << 15);
        }
        jArr2[1] = (((j14 ^ (j13 >>> 59)) ^ (j13 >>> 57)) ^ (j13 >>> 54)) ^ (j13 >>> 49);
        long j16 = (j13 << 15) ^ (((jArr[0] ^ (j13 << 5)) ^ (j13 << 7)) ^ (j13 << 10));
        long j17 = jArr2[8];
        long j18 = j17 >>> 59;
        jArr2[0] = (((j16 ^ j18) ^ (j18 << 2)) ^ (j18 << 5)) ^ (j18 << 10);
        jArr2[8] = M59 & j17;
    }

    public static void reduce5(long[] jArr, int i11) {
        int i12 = i11 + 8;
        long j11 = jArr[i12];
        long j12 = j11 >>> 59;
        jArr[i11] = ((j12 << 10) ^ (((j12 << 2) ^ j12) ^ (j12 << 5))) ^ jArr[i11];
        jArr[i12] = j11 & M59;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] create64 = Nat576.create64();
        long[] create642 = Nat576.create64();
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = i11 + 1;
            long unshuffle = Interleave.unshuffle(jArr[i11]);
            i11 = i13 + 1;
            long unshuffle2 = Interleave.unshuffle(jArr[i13]);
            create64[i12] = (4294967295L & unshuffle) | (unshuffle2 << 32);
            create642[i12] = (unshuffle >>> 32) | ((-4294967296L) & unshuffle2);
        }
        long unshuffle3 = Interleave.unshuffle(jArr[i11]);
        create64[4] = 4294967295L & unshuffle3;
        create642[4] = unshuffle3 >>> 32;
        multiply(create642, ROOT_Z, jArr2);
        add(jArr2, create64, jArr2);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] createExt64 = Nat576.createExt64();
        implSquare(jArr, createExt64);
        reduce(createExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] createExt64 = Nat576.createExt64();
        implSquare(jArr, createExt64);
        addExt(jArr2, createExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i11, long[] jArr2) {
        long[] createExt64 = Nat576.createExt64();
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
        return ((int) ((jArr[0] ^ (jArr[8] >>> 49)) ^ (jArr[8] >>> 57))) & 1;
    }

    private static void add(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13) {
        for (int i14 = 0; i14 < 9; i14++) {
            jArr3[i13 + i14] = jArr[i11 + i14] ^ jArr2[i12 + i14];
        }
    }
}