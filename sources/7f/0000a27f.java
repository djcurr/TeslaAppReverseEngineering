package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat256;

/* loaded from: classes4.dex */
public class SecP256R1Field {
    private static final long M = 4294967295L;
    private static final int P7 = -1;
    private static final int PExt15 = -1;
    static final int[] P = {-1, -1, -1, 0, 0, 0, 1, -1};
    static final int[] PExt = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.add(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && Nat256.gte(iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(16, iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && Nat.gte(16, iArr3, PExt))) {
            Nat.subFrom(16, PExt, iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && Nat256.gte(iArr2, P))) {
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
        long j15 = j12 + ((iArr[3] & M) - 1);
        iArr[3] = (int) j15;
        long j16 = j15 >> 32;
        if (j16 != 0) {
            long j17 = j16 + (iArr[4] & M);
            iArr[4] = (int) j17;
            long j18 = (j17 >> 32) + (iArr[5] & M);
            iArr[5] = (int) j18;
            j16 = j18 >> 32;
        }
        long j19 = j16 + ((iArr[6] & M) - 1);
        iArr[6] = (int) j19;
        iArr[7] = (int) ((j19 >> 32) + (M & iArr[7]) + 1);
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = Nat256.fromBigInteger(bigInteger);
        if (fromBigInteger[7] == -1) {
            int[] iArr = P;
            if (Nat256.gte(fromBigInteger, iArr)) {
                Nat256.subFrom(iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(8, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(8, iArr2, Nat256.add(iArr, P, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] createExt = Nat256.createExt();
        Nat256.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && Nat.gte(16, iArr3, PExt))) {
            Nat.subFrom(16, PExt, iArr3);
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
        long j11 = iArr[8] & M;
        long j12 = iArr[9] & M;
        long j13 = iArr[10] & M;
        long j14 = iArr[11] & M;
        long j15 = iArr[12] & M;
        long j16 = iArr[13] & M;
        long j17 = iArr[14] & M;
        long j18 = iArr[15] & M;
        long j19 = j11 - 6;
        long j21 = j19 + j12;
        long j22 = j12 + j13;
        long j23 = (j13 + j14) - j18;
        long j24 = j14 + j15;
        long j25 = j15 + j16;
        long j26 = j16 + j17;
        long j27 = j17 + j18;
        long j28 = j26 - j21;
        long j29 = (((iArr[0] & M) - j24) - j28) + 0;
        iArr2[0] = (int) j29;
        long j31 = (j29 >> 32) + ((((iArr[1] & M) + j22) - j25) - j27);
        iArr2[1] = (int) j31;
        long j32 = (j31 >> 32) + (((iArr[2] & M) + j23) - j26);
        iArr2[2] = (int) j32;
        long j33 = (j32 >> 32) + ((((iArr[3] & M) + (j24 << 1)) + j28) - j27);
        iArr2[3] = (int) j33;
        long j34 = (j33 >> 32) + ((((iArr[4] & M) + (j25 << 1)) + j17) - j22);
        iArr2[4] = (int) j34;
        long j35 = (j34 >> 32) + (((iArr[5] & M) + (j26 << 1)) - j23);
        iArr2[5] = (int) j35;
        long j36 = (j35 >> 32) + (iArr[6] & M) + (j27 << 1) + j28;
        iArr2[6] = (int) j36;
        long j37 = (j36 >> 32) + (((((iArr[7] & M) + (j18 << 1)) + j19) - j23) - j25);
        iArr2[7] = (int) j37;
        reduce32((int) ((j37 >> 32) + 6), iArr2);
    }

    public static void reduce32(int i11, int[] iArr) {
        long j11;
        if (i11 != 0) {
            long j12 = i11 & M;
            long j13 = (iArr[0] & M) + j12 + 0;
            iArr[0] = (int) j13;
            long j14 = j13 >> 32;
            if (j14 != 0) {
                long j15 = j14 + (iArr[1] & M);
                iArr[1] = (int) j15;
                long j16 = (j15 >> 32) + (iArr[2] & M);
                iArr[2] = (int) j16;
                j14 = j16 >> 32;
            }
            long j17 = j14 + ((iArr[3] & M) - j12);
            iArr[3] = (int) j17;
            long j18 = j17 >> 32;
            if (j18 != 0) {
                long j19 = j18 + (iArr[4] & M);
                iArr[4] = (int) j19;
                long j21 = (j19 >> 32) + (iArr[5] & M);
                iArr[5] = (int) j21;
                j18 = j21 >> 32;
            }
            long j22 = j18 + ((iArr[6] & M) - j12);
            iArr[6] = (int) j22;
            long j23 = (j22 >> 32) + (M & iArr[7]) + j12;
            iArr[7] = (int) j23;
            j11 = j23 >> 32;
        } else {
            j11 = 0;
        }
        if (j11 != 0 || (iArr[7] == -1 && Nat256.gte(iArr, P))) {
            addPInvTo(iArr);
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
        long j15 = j12 + (iArr[3] & M) + 1;
        iArr[3] = (int) j15;
        long j16 = j15 >> 32;
        if (j16 != 0) {
            long j17 = j16 + (iArr[4] & M);
            iArr[4] = (int) j17;
            long j18 = (j17 >> 32) + (iArr[5] & M);
            iArr[5] = (int) j18;
            j16 = j18 >> 32;
        }
        long j19 = j16 + (iArr[6] & M) + 1;
        iArr[6] = (int) j19;
        iArr[7] = (int) ((j19 >> 32) + ((M & iArr[7]) - 1));
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(16, iArr, iArr2, iArr3) != 0) {
            Nat.addTo(16, PExt, iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && Nat256.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }
}