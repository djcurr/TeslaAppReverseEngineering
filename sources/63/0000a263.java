package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat160;

/* loaded from: classes4.dex */
public class SecP160R1Field {
    private static final long M = 4294967295L;
    private static final int P4 = -1;
    private static final int PExt9 = -1;
    private static final int PInv = -2147483647;
    static final int[] P = {Integer.MAX_VALUE, -1, -1, -1, -1};
    static final int[] PExt = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};
    private static final int[] PExtInv = {-1, -1073741826, -1, -1, -1, 1, 1};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat160.add(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && Nat160.gte(iArr3, P))) {
            Nat.addWordTo(5, PInv, iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(10, iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && Nat.gte(10, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(10, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && Nat160.gte(iArr2, P))) {
            Nat.addWordTo(5, PInv, iArr2);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = Nat160.fromBigInteger(bigInteger);
        if (fromBigInteger[4] == -1) {
            int[] iArr = P;
            if (Nat160.gte(fromBigInteger, iArr)) {
                Nat160.subFrom(iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(5, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(5, iArr2, Nat160.add(iArr, P, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] createExt = Nat160.createExt();
        Nat160.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat160.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && Nat.gte(10, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(10, iArr3, iArr4.length);
            }
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat160.isZero(iArr)) {
            Nat160.zero(iArr2);
        } else {
            Nat160.sub(P, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j11 = iArr[5] & M;
        long j12 = iArr[6] & M;
        long j13 = iArr[7] & M;
        long j14 = iArr[8] & M;
        long j15 = iArr[9] & M;
        long j16 = (iArr[0] & M) + j11 + (j11 << 31) + 0;
        iArr2[0] = (int) j16;
        long j17 = (j16 >>> 32) + (iArr[1] & M) + j12 + (j12 << 31);
        iArr2[1] = (int) j17;
        long j18 = (j17 >>> 32) + (iArr[2] & M) + j13 + (j13 << 31);
        iArr2[2] = (int) j18;
        long j19 = (j18 >>> 32) + (iArr[3] & M) + j14 + (j14 << 31);
        iArr2[3] = (int) j19;
        long j21 = (j19 >>> 32) + (M & iArr[4]) + j15 + (j15 << 31);
        iArr2[4] = (int) j21;
        reduce32((int) (j21 >>> 32), iArr2);
    }

    public static void reduce32(int i11, int[] iArr) {
        if ((i11 == 0 || Nat160.mulWordsAdd(PInv, i11, iArr, 0) == 0) && !(iArr[4] == -1 && Nat160.gte(iArr, P))) {
            return;
        }
        Nat.addWordTo(5, PInv, iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] createExt = Nat160.createExt();
        Nat160.square(iArr, createExt);
        reduce(createExt, iArr2);
    }

    public static void squareN(int[] iArr, int i11, int[] iArr2) {
        int[] createExt = Nat160.createExt();
        Nat160.square(iArr, createExt);
        reduce(createExt, iArr2);
        while (true) {
            i11--;
            if (i11 <= 0) {
                return;
            }
            Nat160.square(iArr2, createExt);
            reduce(createExt, iArr2);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat160.sub(iArr, iArr2, iArr3) != 0) {
            Nat.subWordFrom(5, PInv, iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(10, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(10, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && Nat160.gte(iArr2, P))) {
            Nat.addWordTo(5, PInv, iArr2);
        }
    }
}