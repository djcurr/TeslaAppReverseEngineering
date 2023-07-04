package dp;

/* loaded from: classes2.dex */
public final class f {
    private static int a(int i11, int i12) {
        int i13 = i11 - i12;
        if (i13 <= i12) {
            i13 = i12;
            i12 = i13;
        }
        int i14 = 1;
        int i15 = 1;
        while (i11 > i13) {
            i14 *= i11;
            if (i15 <= i12) {
                i14 /= i15;
                i15++;
            }
            i11--;
        }
        while (i15 <= i12) {
            i14 /= i15;
            i15++;
        }
        return i14;
    }

    public static int b(int[] iArr, int i11, boolean z11) {
        int[] iArr2 = iArr;
        int i12 = 0;
        for (int i13 : iArr2) {
            i12 += i13;
        }
        int length = iArr2.length;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int i17 = length - 1;
            if (i14 >= i17) {
                return i15;
            }
            int i18 = 1 << i14;
            i16 |= i18;
            int i19 = 1;
            while (i19 < iArr2[i14]) {
                int i21 = i12 - i19;
                int i22 = length - i14;
                int i23 = i22 - 2;
                int a11 = a(i21 - 1, i23);
                if (z11 && i16 == 0) {
                    int i24 = i22 - 1;
                    if (i21 - i24 >= i24) {
                        a11 -= a(i21 - i22, i23);
                    }
                }
                if (i22 - 1 > 1) {
                    int i25 = 0;
                    for (int i26 = i21 - i23; i26 > i11; i26--) {
                        i25 += a((i21 - i26) - 1, i22 - 3);
                    }
                    a11 -= i25 * (i17 - i14);
                } else if (i21 > i11) {
                    a11--;
                }
                i15 += a11;
                i19++;
                i16 &= ~i18;
                iArr2 = iArr;
            }
            i12 -= i19;
            i14++;
            iArr2 = iArr;
        }
    }
}