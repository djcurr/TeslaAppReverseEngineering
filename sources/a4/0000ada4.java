package q70;

import java.lang.reflect.Array;

/* loaded from: classes5.dex */
public final class c {
    public static a a(b bVar, i iVar) {
        int d11 = bVar.d();
        int i11 = 1 << d11;
        int g11 = iVar.g();
        int i12 = 0;
        int[][] iArr = (int[][]) Array.newInstance(int.class, g11, i11);
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, g11, i11);
        for (int i13 = 0; i13 < i11; i13++) {
            iArr2[0][i13] = bVar.f(iVar.e(i13));
        }
        for (int i14 = 1; i14 < g11; i14++) {
            for (int i15 = 0; i15 < i11; i15++) {
                iArr2[i14][i15] = bVar.h(iArr2[i14 - 1][i15], i15);
            }
        }
        int i16 = 0;
        while (i16 < g11) {
            int i17 = i12;
            while (i17 < i11) {
                for (int i18 = i12; i18 <= i16; i18++) {
                    iArr[i16][i17] = bVar.a(iArr[i16][i17], bVar.h(iArr2[i18][i17], iVar.f((g11 + i18) - i16)));
                }
                i17++;
                i12 = 0;
            }
            i16++;
            i12 = 0;
        }
        int[][] iArr3 = (int[][]) Array.newInstance(int.class, g11 * d11, (i11 + 31) >>> 5);
        for (int i19 = 0; i19 < i11; i19++) {
            int i21 = i19 >>> 5;
            int i22 = 1 << (i19 & 31);
            for (int i23 = 0; i23 < g11; i23++) {
                int i24 = iArr[i23][i19];
                for (int i25 = 0; i25 < d11; i25++) {
                    if (((i24 >>> i25) & 1) != 0) {
                        int[] iArr4 = iArr3[(((i23 + 1) * d11) - i25) - 1];
                        iArr4[i21] = iArr4[i21] ^ i22;
                    }
                }
            }
        }
        return new a(i11, iArr3);
    }
}