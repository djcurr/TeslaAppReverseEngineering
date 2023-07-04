package org.spongycastle.math.ec.custom.djb;

import java.math.BigInteger;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat256;

/* loaded from: classes4.dex */
public class Curve25519Field {
    private static final long M = 4294967295L;
    private static final int P7 = Integer.MAX_VALUE;
    private static final int PInv = 19;
    static final int[] P = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] PExt = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat256.add(iArr, iArr2, iArr3);
        if (Nat256.gte(iArr3, P)) {
            subPFrom(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat.add(16, iArr, iArr2, iArr3);
        if (Nat.gte(16, iArr3, PExt)) {
            subPExtFrom(iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        Nat.inc(8, iArr, iArr2);
        if (Nat256.gte(iArr2, P)) {
            subPFrom(iArr2);
        }
    }

    private static int addPExtTo(int[] iArr) {
        long j11 = iArr[0] & M;
        int[] iArr2 = PExt;
        long j12 = j11 + (iArr2[0] & M);
        iArr[0] = (int) j12;
        long j13 = j12 >> 32;
        if (j13 != 0) {
            j13 = Nat.incAt(8, iArr, 1);
        }
        long j14 = j13 + ((iArr[8] & M) - 19);
        iArr[8] = (int) j14;
        long j15 = j14 >> 32;
        if (j15 != 0) {
            j15 = Nat.decAt(15, iArr, 9);
        }
        long j16 = j15 + (iArr[15] & M) + (M & (iArr2[15] + 1));
        iArr[15] = (int) j16;
        return (int) (j16 >> 32);
    }

    private static int addPTo(int[] iArr) {
        long j11 = (iArr[0] & M) - 19;
        iArr[0] = (int) j11;
        long j12 = j11 >> 32;
        if (j12 != 0) {
            j12 = Nat.decAt(7, iArr, 1);
        }
        long j13 = j12 + (M & iArr[7]) + 2147483648L;
        iArr[7] = (int) j13;
        return (int) (j13 >> 32);
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = Nat256.fromBigInteger(bigInteger);
        while (true) {
            int[] iArr = P;
            if (!Nat256.gte(fromBigInteger, iArr)) {
                return fromBigInteger;
            }
            Nat256.subFrom(iArr, fromBigInteger);
        }
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(8, iArr, 0, iArr2);
            return;
        }
        Nat256.add(iArr, P, iArr2);
        Nat.shiftDownBit(8, iArr2, 0);
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] createExt = Nat256.createExt();
        Nat256.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat256.mulAddTo(iArr, iArr2, iArr3);
        if (Nat.gte(16, iArr3, PExt)) {
            subPExtFrom(iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat256.isZero(iArr)) {
            Nat256.zero(iArr2);
        } else {
            Nat256.sub(P, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        int i11 = iArr[7];
        Nat.shiftUpBit(8, iArr, 8, i11, iArr2, 0);
        int i12 = iArr2[7];
        iArr2[7] = (i12 & Integer.MAX_VALUE) + Nat.addWordTo(7, ((Nat256.mulByWordAddTo(19, iArr, iArr2) << 1) + ((i12 >>> 31) - (i11 >>> 31))) * 19, iArr2);
        if (Nat256.gte(iArr2, P)) {
            subPFrom(iArr2);
        }
    }

    public static void reduce27(int i11, int[] iArr) {
        int i12 = iArr[7];
        iArr[7] = (i12 & Integer.MAX_VALUE) + Nat.addWordTo(7, ((i11 << 1) | (i12 >>> 31)) * 19, iArr);
        if (Nat256.gte(iArr, P)) {
            subPFrom(iArr);
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] createExt = Nat256.createExt();
        Nat256.square(iArr, createExt);
        reduce(createExt, iArr2);
    }

    public static void squareN(int[] iArr, int i11, int[] iArr2) {
        int[] createExt = Nat256.createExt();
        Nat256.square(iArr, createExt);
        reduce(createExt, iArr2);
        while (true) {
            i11--;
            if (i11 <= 0) {
                return;
            }
            Nat256.square(iArr2, createExt);
            reduce(createExt, iArr2);
        }
    }

    private static int subPExtFrom(int[] iArr) {
        long j11 = iArr[0] & M;
        int[] iArr2 = PExt;
        long j12 = j11 - (iArr2[0] & M);
        iArr[0] = (int) j12;
        long j13 = j12 >> 32;
        if (j13 != 0) {
            j13 = Nat.decAt(8, iArr, 1);
        }
        long j14 = j13 + (iArr[8] & M) + 19;
        iArr[8] = (int) j14;
        long j15 = j14 >> 32;
        if (j15 != 0) {
            j15 = Nat.incAt(15, iArr, 9);
        }
        long j16 = j15 + ((iArr[15] & M) - (M & (iArr2[15] + 1)));
        iArr[15] = (int) j16;
        return (int) (j16 >> 32);
    }

    private static int subPFrom(int[] iArr) {
        long j11 = (iArr[0] & M) + 19;
        iArr[0] = (int) j11;
        long j12 = j11 >> 32;
        if (j12 != 0) {
            j12 = Nat.incAt(7, iArr, 1);
        }
        long j13 = j12 + ((M & iArr[7]) - 2147483648L);
        iArr[7] = (int) j13;
        return (int) (j13 >> 32);
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.sub(iArr, iArr2, iArr3) != 0) {
            addPTo(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(16, iArr, iArr2, iArr3) != 0) {
            addPExtTo(iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        Nat.shiftUpBit(8, iArr, 0, iArr2);
        if (Nat256.gte(iArr2, P)) {
            subPFrom(iArr2);
        }
    }
}