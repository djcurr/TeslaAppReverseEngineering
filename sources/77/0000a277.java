package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat224;

/* loaded from: classes4.dex */
public class SecP224R1Field {
    private static final long M = 4294967295L;
    private static final int P6 = -1;
    private static final int PExt13 = -1;
    static final int[] P = {1, 0, 0, -1, -1, -1, -1};
    static final int[] PExt = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};
    private static final int[] PExtInv = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.add(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && Nat224.gte(iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(14, iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && Nat.gte(14, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && Nat224.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
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
        long j15 = j12 + (M & iArr[3]) + 1;
        iArr[3] = (int) j15;
        if ((j15 >> 32) != 0) {
            Nat.incAt(7, iArr, 4);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = Nat224.fromBigInteger(bigInteger);
        if (fromBigInteger[6] == -1) {
            int[] iArr = P;
            if (Nat224.gte(fromBigInteger, iArr)) {
                Nat224.subFrom(iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(7, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(7, iArr2, Nat224.add(iArr, P, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] createExt = Nat224.createExt();
        Nat224.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && Nat.gte(14, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat224.isZero(iArr)) {
            Nat224.zero(iArr2);
        } else {
            Nat224.sub(P, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j11 = iArr[10] & M;
        long j12 = iArr[11] & M;
        long j13 = iArr[12] & M;
        long j14 = iArr[13] & M;
        long j15 = ((iArr[7] & M) + j12) - 1;
        long j16 = (iArr[8] & M) + j13;
        long j17 = (iArr[9] & M) + j14;
        long j18 = ((iArr[0] & M) - j15) + 0;
        long j19 = j18 & M;
        long j21 = (j18 >> 32) + ((iArr[1] & M) - j16);
        iArr2[1] = (int) j21;
        long j22 = (j21 >> 32) + ((iArr[2] & M) - j17);
        iArr2[2] = (int) j22;
        long j23 = (j22 >> 32) + (((iArr[3] & M) + j15) - j11);
        long j24 = j23 & M;
        long j25 = (j23 >> 32) + (((iArr[4] & M) + j16) - j12);
        iArr2[4] = (int) j25;
        long j26 = (j25 >> 32) + (((iArr[5] & M) + j17) - j13);
        iArr2[5] = (int) j26;
        long j27 = (j26 >> 32) + (((iArr[6] & M) + j11) - j14);
        iArr2[6] = (int) j27;
        long j28 = (j27 >> 32) + 1;
        long j29 = j24 + j28;
        long j31 = j19 - j28;
        iArr2[0] = (int) j31;
        long j32 = j31 >> 32;
        if (j32 != 0) {
            long j33 = j32 + (iArr2[1] & M);
            iArr2[1] = (int) j33;
            long j34 = (j33 >> 32) + (M & iArr2[2]);
            iArr2[2] = (int) j34;
            j29 += j34 >> 32;
        }
        iArr2[3] = (int) j29;
        if (((j29 >> 32) == 0 || Nat.incAt(7, iArr2, 4) == 0) && !(iArr2[6] == -1 && Nat224.gte(iArr2, P))) {
            return;
        }
        addPInvTo(iArr2);
    }

    public static void reduce32(int i11, int[] iArr) {
        long j11;
        if (i11 != 0) {
            long j12 = i11 & M;
            long j13 = ((iArr[0] & M) - j12) + 0;
            iArr[0] = (int) j13;
            long j14 = j13 >> 32;
            if (j14 != 0) {
                long j15 = j14 + (iArr[1] & M);
                iArr[1] = (int) j15;
                long j16 = (j15 >> 32) + (iArr[2] & M);
                iArr[2] = (int) j16;
                j14 = j16 >> 32;
            }
            long j17 = j14 + (M & iArr[3]) + j12;
            iArr[3] = (int) j17;
            j11 = j17 >> 32;
        } else {
            j11 = 0;
        }
        if ((j11 == 0 || Nat.incAt(7, iArr, 4) == 0) && !(iArr[6] == -1 && Nat224.gte(iArr, P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] createExt = Nat224.createExt();
        Nat224.square(iArr, createExt);
        reduce(createExt, iArr2);
    }

    public static void squareN(int[] iArr, int i11, int[] iArr2) {
        int[] createExt = Nat224.createExt();
        Nat224.square(iArr, createExt);
        reduce(createExt, iArr2);
        while (true) {
            i11--;
            if (i11 <= 0) {
                return;
            }
            Nat224.square(iArr2, createExt);
            reduce(createExt, iArr2);
        }
    }

    private static void subPInvFrom(int[] iArr) {
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
        long j15 = j12 + ((M & iArr[3]) - 1);
        iArr[3] = (int) j15;
        if ((j15 >> 32) != 0) {
            Nat.decAt(7, iArr, 4);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(14, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && Nat224.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }
}