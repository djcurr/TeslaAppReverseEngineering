package org.spongycastle.math.raw;

import java.util.Random;

/* loaded from: classes4.dex */
public abstract class Mod {
    public static void add(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int length = iArr.length;
        if (Nat.add(length, iArr2, iArr3, iArr4) != 0) {
            Nat.subFrom(length, iArr, iArr4);
        }
    }

    private static int getTrailingZeroes(int i11) {
        int i12 = 0;
        while ((i11 & 1) == 0) {
            i11 >>>= 1;
            i12++;
        }
        return i12;
    }

    public static int inverse32(int i11) {
        int i12 = (2 - (i11 * i11)) * i11;
        int i13 = i12 * (2 - (i11 * i12));
        int i14 = i13 * (2 - (i11 * i13));
        return i14 * (2 - (i11 * i14));
    }

    private static void inversionResult(int[] iArr, int i11, int[] iArr2, int[] iArr3) {
        if (i11 < 0) {
            Nat.add(iArr.length, iArr2, iArr, iArr3);
        } else {
            System.arraycopy(iArr2, 0, iArr3, 0, iArr.length);
        }
    }

    private static int inversionStep(int[] iArr, int[] iArr2, int i11, int[] iArr3, int i12) {
        int subFrom;
        int length = iArr.length;
        int i13 = 0;
        while (iArr2[0] == 0) {
            Nat.shiftDownWord(i11, iArr2, 0);
            i13 += 32;
        }
        int trailingZeroes = getTrailingZeroes(iArr2[0]);
        if (trailingZeroes > 0) {
            Nat.shiftDownBits(i11, iArr2, trailingZeroes, 0);
            i13 += trailingZeroes;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            if ((iArr3[0] & 1) != 0) {
                if (i12 < 0) {
                    subFrom = Nat.addTo(length, iArr, iArr3);
                } else {
                    subFrom = Nat.subFrom(length, iArr, iArr3);
                }
                i12 += subFrom;
            }
            Nat.shiftDownBit(length, iArr3, i12);
        }
        return i12;
    }

    public static void invert(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        if (!Nat.isZero(length, iArr2)) {
            int i11 = 0;
            if (Nat.isOne(length, iArr2)) {
                System.arraycopy(iArr2, 0, iArr3, 0, length);
                return;
            }
            int[] copy = Nat.copy(length, iArr2);
            int[] create = Nat.create(length);
            create[0] = 1;
            int inversionStep = (1 & copy[0]) == 0 ? inversionStep(iArr, copy, length, create, 0) : 0;
            if (Nat.isOne(length, copy)) {
                inversionResult(iArr, inversionStep, create, iArr3);
                return;
            }
            int[] copy2 = Nat.copy(length, iArr);
            int[] create2 = Nat.create(length);
            int i12 = length;
            while (true) {
                int i13 = i12 - 1;
                if (copy[i13] == 0 && copy2[i13] == 0) {
                    i12--;
                } else if (Nat.gte(i12, copy, copy2)) {
                    Nat.subFrom(i12, copy2, copy);
                    inversionStep = inversionStep(iArr, copy, i12, create, inversionStep + (Nat.subFrom(length, create2, create) - i11));
                    if (Nat.isOne(i12, copy)) {
                        inversionResult(iArr, inversionStep, create, iArr3);
                        return;
                    }
                } else {
                    Nat.subFrom(i12, copy, copy2);
                    i11 = inversionStep(iArr, copy2, i12, create2, i11 + (Nat.subFrom(length, create, create2) - inversionStep));
                    if (Nat.isOne(i12, copy2)) {
                        inversionResult(iArr, i11, create2, iArr3);
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("'x' cannot be 0");
        }
    }

    public static int[] random(int[] iArr) {
        int length = iArr.length;
        Random random = new Random();
        int[] create = Nat.create(length);
        int i11 = length - 1;
        int i12 = iArr[i11];
        int i13 = i12 | (i12 >>> 1);
        int i14 = i13 | (i13 >>> 2);
        int i15 = i14 | (i14 >>> 4);
        int i16 = i15 | (i15 >>> 8);
        int i17 = i16 | (i16 >>> 16);
        do {
            for (int i18 = 0; i18 != length; i18++) {
                create[i18] = random.nextInt();
            }
            create[i11] = create[i11] & i17;
        } while (Nat.gte(length, create, iArr));
        return create;
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int length = iArr.length;
        if (Nat.sub(length, iArr2, iArr3, iArr4) != 0) {
            Nat.addTo(length, iArr, iArr4);
        }
    }
}