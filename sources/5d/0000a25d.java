package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat128;
import org.spongycastle.math.raw.Nat256;

/* loaded from: classes4.dex */
public class SecP128R1Field {
    private static final long M = 4294967295L;
    private static final int P3 = -3;
    private static final int PExt7 = -4;
    static final int[] P = {-1, -1, -1, -3};
    static final int[] PExt = {1, 0, 0, 4, -2, -1, 3, -4};
    private static final int[] PExtInv = {-1, -1, -1, -5, 1, 0, -4, 3};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat128.add(iArr, iArr2, iArr3) != 0 || (iArr3[3] == -3 && Nat128.gte(iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.add(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -4 && Nat256.gte(iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            Nat.addTo(iArr4.length, iArr4, iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(4, iArr, iArr2) != 0 || (iArr2[3] == -3 && Nat128.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j11 = (iArr[0] & M) + 1;
        iArr[0] = (int) j11;
        long j12 = j11 >> 32;
        if (j12 != 0) {
            long j13 = j12 + (iArr[1] & M);
            iArr[1] = (int) j13;
            long j14 = (j13 >> 32) + (iArr[2] & M);
            iArr[2] = (int) j14;
            j12 = j14 >> 32;
        }
        iArr[3] = (int) (j12 + (M & iArr[3]) + 2);
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = Nat128.fromBigInteger(bigInteger);
        if (fromBigInteger[3] == -3) {
            int[] iArr = P;
            if (Nat128.gte(fromBigInteger, iArr)) {
                Nat128.subFrom(iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(4, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(4, iArr2, Nat128.add(iArr, P, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] createExt = Nat128.createExt();
        Nat128.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat128.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -4 && Nat256.gte(iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            Nat.addTo(iArr4.length, iArr4, iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat128.isZero(iArr)) {
            Nat128.zero(iArr2);
        } else {
            Nat128.sub(P, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j11 = iArr[0] & M;
        long j12 = iArr[1] & M;
        long j13 = iArr[2] & M;
        long j14 = iArr[3] & M;
        long j15 = iArr[4] & M;
        long j16 = iArr[5] & M;
        long j17 = iArr[6] & M;
        long j18 = iArr[7] & M;
        long j19 = j14 + j18;
        long j21 = j17 + (j18 << 1);
        long j22 = j13 + j21;
        long j23 = j16 + (j21 << 1);
        long j24 = j12 + j23;
        long j25 = j15 + (j23 << 1);
        long j26 = j11 + j25;
        iArr2[0] = (int) j26;
        long j27 = j24 + (j26 >>> 32);
        iArr2[1] = (int) j27;
        long j28 = j22 + (j27 >>> 32);
        iArr2[2] = (int) j28;
        long j29 = j19 + (j25 << 1) + (j28 >>> 32);
        iArr2[3] = (int) j29;
        reduce32((int) (j29 >>> 32), iArr2);
    }

    public static void reduce32(int i11, int[] iArr) {
        while (i11 != 0) {
            long j11 = i11 & M;
            long j12 = (iArr[0] & M) + j11;
            iArr[0] = (int) j12;
            long j13 = j12 >> 32;
            if (j13 != 0) {
                long j14 = j13 + (iArr[1] & M);
                iArr[1] = (int) j14;
                long j15 = (j14 >> 32) + (iArr[2] & M);
                iArr[2] = (int) j15;
                j13 = j15 >> 32;
            }
            long j16 = j13 + (M & iArr[3]) + (j11 << 1);
            iArr[3] = (int) j16;
            i11 = (int) (j16 >> 32);
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] createExt = Nat128.createExt();
        Nat128.square(iArr, createExt);
        reduce(createExt, iArr2);
    }

    public static void squareN(int[] iArr, int i11, int[] iArr2) {
        int[] createExt = Nat128.createExt();
        Nat128.square(iArr, createExt);
        reduce(createExt, iArr2);
        while (true) {
            i11--;
            if (i11 <= 0) {
                return;
            }
            Nat128.square(iArr2, createExt);
            reduce(createExt, iArr2);
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j11 = (iArr[0] & M) - 1;
        iArr[0] = (int) j11;
        long j12 = j11 >> 32;
        if (j12 != 0) {
            long j13 = j12 + (iArr[1] & M);
            iArr[1] = (int) j13;
            long j14 = (j13 >> 32) + (iArr[2] & M);
            iArr[2] = (int) j14;
            j12 = j14 >> 32;
        }
        iArr[3] = (int) (j12 + ((M & iArr[3]) - 2));
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat128.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(10, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            Nat.subFrom(iArr4.length, iArr4, iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(4, iArr, 0, iArr2) != 0 || (iArr2[3] == -3 && Nat128.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }
}