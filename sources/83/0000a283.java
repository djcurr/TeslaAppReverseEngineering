package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat384;

/* loaded from: classes4.dex */
public class SecP384R1Field {
    private static final long M = 4294967295L;
    private static final int P11 = -1;
    private static final int PExt23 = -1;
    static final int[] P = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};
    static final int[] PExt = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] PExtInv = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Nat.gte(12, iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(24, iArr, iArr2, iArr3) != 0 || (iArr3[23] == -1 && Nat.gte(24, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(24, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(12, iArr, iArr2) != 0 || (iArr2[11] == -1 && Nat.gte(12, iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j11 = (iArr[0] & M) + 1;
        iArr[0] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr[1] & M) - 1);
        iArr[1] = (int) j12;
        long j13 = j12 >> 32;
        if (j13 != 0) {
            long j14 = j13 + (iArr[2] & M);
            iArr[2] = (int) j14;
            j13 = j14 >> 32;
        }
        long j15 = j13 + (iArr[3] & M) + 1;
        iArr[3] = (int) j15;
        long j16 = (j15 >> 32) + (M & iArr[4]) + 1;
        iArr[4] = (int) j16;
        if ((j16 >> 32) != 0) {
            Nat.incAt(12, iArr, 5);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = Nat.fromBigInteger(384, bigInteger);
        if (fromBigInteger[11] == -1) {
            int[] iArr = P;
            if (Nat.gte(12, fromBigInteger, iArr)) {
                Nat.subFrom(12, iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(12, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(12, iArr2, Nat.add(12, iArr, P, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] create = Nat.create(24);
        Nat384.mul(iArr, iArr2, create);
        reduce(create, iArr3);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat.isZero(12, iArr)) {
            Nat.zero(12, iArr2);
        } else {
            Nat.sub(12, P, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j11 = iArr[16] & M;
        long j12 = iArr[17] & M;
        long j13 = iArr[18] & M;
        long j14 = iArr[19] & M;
        long j15 = iArr[20] & M;
        long j16 = iArr[21] & M;
        long j17 = iArr[22] & M;
        long j18 = iArr[23] & M;
        long j19 = ((iArr[12] & M) + j15) - 1;
        long j21 = (iArr[13] & M) + j17;
        long j22 = (iArr[14] & M) + j17 + j18;
        long j23 = (iArr[15] & M) + j18;
        long j24 = j12 + j16;
        long j25 = j16 - j18;
        long j26 = j17 - j18;
        long j27 = j19 + j25;
        long j28 = (iArr[0] & M) + j27 + 0;
        iArr2[0] = (int) j28;
        long j29 = (j28 >> 32) + (((iArr[1] & M) + j18) - j19) + j21;
        iArr2[1] = (int) j29;
        long j31 = (j29 >> 32) + (((iArr[2] & M) - j16) - j21) + j22;
        iArr2[2] = (int) j31;
        long j32 = (j31 >> 32) + ((iArr[3] & M) - j22) + j23 + j27;
        iArr2[3] = (int) j32;
        long j33 = (j32 >> 32) + (((((iArr[4] & M) + j11) + j16) + j21) - j23) + j27;
        iArr2[4] = (int) j33;
        long j34 = (j33 >> 32) + ((iArr[5] & M) - j11) + j21 + j22 + j24;
        iArr2[5] = (int) j34;
        long j35 = (j34 >> 32) + (((iArr[6] & M) + j13) - j12) + j22 + j23;
        iArr2[6] = (int) j35;
        long j36 = (j35 >> 32) + ((((iArr[7] & M) + j11) + j14) - j13) + j23;
        iArr2[7] = (int) j36;
        long j37 = (j36 >> 32) + (((((iArr[8] & M) + j11) + j12) + j15) - j14);
        iArr2[8] = (int) j37;
        long j38 = (j37 >> 32) + (((iArr[9] & M) + j13) - j15) + j24;
        iArr2[9] = (int) j38;
        long j39 = (j38 >> 32) + ((((iArr[10] & M) + j13) + j14) - j25) + j26;
        iArr2[10] = (int) j39;
        long j41 = (j39 >> 32) + ((((iArr[11] & M) + j14) + j15) - j26);
        iArr2[11] = (int) j41;
        reduce32((int) ((j41 >> 32) + 1), iArr2);
    }

    public static void reduce32(int i11, int[] iArr) {
        long j11;
        if (i11 != 0) {
            long j12 = i11 & M;
            long j13 = (iArr[0] & M) + j12 + 0;
            iArr[0] = (int) j13;
            long j14 = (j13 >> 32) + ((iArr[1] & M) - j12);
            iArr[1] = (int) j14;
            long j15 = j14 >> 32;
            if (j15 != 0) {
                long j16 = j15 + (iArr[2] & M);
                iArr[2] = (int) j16;
                j15 = j16 >> 32;
            }
            long j17 = j15 + (iArr[3] & M) + j12;
            iArr[3] = (int) j17;
            long j18 = (j17 >> 32) + (M & iArr[4]) + j12;
            iArr[4] = (int) j18;
            j11 = j18 >> 32;
        } else {
            j11 = 0;
        }
        if ((j11 == 0 || Nat.incAt(12, iArr, 5) == 0) && !(iArr[11] == -1 && Nat.gte(12, iArr, P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] create = Nat.create(24);
        Nat384.square(iArr, create);
        reduce(create, iArr2);
    }

    public static void squareN(int[] iArr, int i11, int[] iArr2) {
        int[] create = Nat.create(24);
        Nat384.square(iArr, create);
        reduce(create, iArr2);
        while (true) {
            i11--;
            if (i11 <= 0) {
                return;
            }
            Nat384.square(iArr2, create);
            reduce(create, iArr2);
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j11 = (iArr[0] & M) - 1;
        iArr[0] = (int) j11;
        long j12 = (j11 >> 32) + (iArr[1] & M) + 1;
        iArr[1] = (int) j12;
        long j13 = j12 >> 32;
        if (j13 != 0) {
            long j14 = j13 + (iArr[2] & M);
            iArr[2] = (int) j14;
            j13 = j14 >> 32;
        }
        long j15 = j13 + ((iArr[3] & M) - 1);
        iArr[3] = (int) j15;
        long j16 = (j15 >> 32) + ((M & iArr[4]) - 1);
        iArr[4] = (int) j16;
        if ((j16 >> 32) != 0) {
            Nat.decAt(12, iArr, 5);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(12, iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(24, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(24, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(12, iArr, 0, iArr2) != 0 || (iArr2[11] == -1 && Nat.gte(12, iArr2, P))) {
            addPInvTo(iArr2);
        }
    }
}