package uo;

import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public final class j extends h {

    /* renamed from: e  reason: collision with root package name */
    private b f53634e;

    public j(com.google.zxing.f fVar) {
        super(fVar);
    }

    private static int[][] i(byte[] bArr, int i11, int i12, int i13, int i14) {
        char c11;
        int i15 = 8;
        int i16 = i14 - 8;
        int i17 = i13 - 8;
        char c12 = 2;
        boolean z11 = true;
        int i18 = 0;
        int[][] iArr = (int[][]) Array.newInstance(int.class, i12, i11);
        int i19 = 0;
        while (i19 < i12) {
            int i21 = i19 << 3;
            if (i21 > i16) {
                i21 = i16;
            }
            int i22 = i18;
            while (i22 < i11) {
                int i23 = i22 << 3;
                if (i23 > i17) {
                    i23 = i17;
                }
                int i24 = (i21 * i13) + i23;
                int i25 = i18;
                int i26 = i25;
                int i27 = i26;
                int i28 = 255;
                while (i25 < i15) {
                    int i29 = i27;
                    int i31 = 0;
                    while (i31 < i15) {
                        int i32 = bArr[i24 + i31] & 255;
                        i26 += i32;
                        if (i32 < i28) {
                            i28 = i32;
                        }
                        if (i32 > i29) {
                            i29 = i32;
                        }
                        i31++;
                        i15 = 8;
                    }
                    if (i29 - i28 <= 24) {
                        i25++;
                        i24 += i13;
                        i27 = i29;
                        z11 = true;
                        i15 = 8;
                    }
                    while (true) {
                        i25++;
                        i24 += i13;
                        if (i25 < 8) {
                            int i33 = 0;
                            for (int i34 = 8; i33 < i34; i34 = 8) {
                                i26 += bArr[i24 + i33] & 255;
                                i33++;
                            }
                        }
                    }
                    i25++;
                    i24 += i13;
                    i27 = i29;
                    z11 = true;
                    i15 = 8;
                }
                boolean z12 = z11;
                int i35 = i26 >> 6;
                if (i27 - i28 <= 24) {
                    i35 = i28 / 2;
                    if (i19 > 0 && i22 > 0) {
                        int i36 = i19 - 1;
                        int i37 = i22 - 1;
                        c11 = 2;
                        int i38 = ((iArr[i36][i22] + (iArr[i19][i37] * 2)) + iArr[i36][i37]) / 4;
                        if (i28 < i38) {
                            i35 = i38;
                        }
                        iArr[i19][i22] = i35;
                        i22++;
                        z11 = z12;
                        c12 = c11;
                        i15 = 8;
                        i18 = 0;
                    }
                }
                c11 = 2;
                iArr[i19][i22] = i35;
                i22++;
                z11 = z12;
                c12 = c11;
                i15 = 8;
                i18 = 0;
            }
            i19++;
            i15 = 8;
            i18 = 0;
        }
        return iArr;
    }

    private static void j(byte[] bArr, int i11, int i12, int i13, int i14, int[][] iArr, b bVar) {
        int i15 = i14 - 8;
        int i16 = i13 - 8;
        for (int i17 = 0; i17 < i12; i17++) {
            int i18 = i17 << 3;
            int i19 = i18 > i15 ? i15 : i18;
            int k11 = k(i17, 2, i12 - 3);
            for (int i21 = 0; i21 < i11; i21++) {
                int i22 = i21 << 3;
                int i23 = i22 > i16 ? i16 : i22;
                int k12 = k(i21, 2, i11 - 3);
                int i24 = 0;
                for (int i25 = -2; i25 <= 2; i25++) {
                    int[] iArr2 = iArr[k11 + i25];
                    i24 += iArr2[k12 - 2] + iArr2[k12 - 1] + iArr2[k12] + iArr2[k12 + 1] + iArr2[k12 + 2];
                }
                l(bArr, i23, i19, i24 / 25, i13, bVar);
            }
        }
    }

    private static int k(int i11, int i12, int i13) {
        return i11 < i12 ? i12 : i11 > i13 ? i13 : i11;
    }

    private static void l(byte[] bArr, int i11, int i12, int i13, int i14, b bVar) {
        int i15 = (i12 * i14) + i11;
        int i16 = 0;
        while (i16 < 8) {
            for (int i17 = 0; i17 < 8; i17++) {
                if ((bArr[i15 + i17] & 255) <= i13) {
                    bVar.l(i11 + i17, i12 + i16);
                }
            }
            i16++;
            i15 += i14;
        }
    }

    @Override // com.google.zxing.b
    public com.google.zxing.b a(com.google.zxing.f fVar) {
        return new j(fVar);
    }

    @Override // uo.h, com.google.zxing.b
    public b b() {
        b bVar = this.f53634e;
        if (bVar != null) {
            return bVar;
        }
        com.google.zxing.f e11 = e();
        int d11 = e11.d();
        int a11 = e11.a();
        if (d11 >= 40 && a11 >= 40) {
            byte[] b11 = e11.b();
            int i11 = d11 >> 3;
            if ((d11 & 7) != 0) {
                i11++;
            }
            int i12 = i11;
            int i13 = a11 >> 3;
            if ((a11 & 7) != 0) {
                i13++;
            }
            int i14 = i13;
            int[][] i15 = i(b11, i12, i14, d11, a11);
            b bVar2 = new b(d11, a11);
            j(b11, i12, i14, d11, a11, i15, bVar2);
            this.f53634e = bVar2;
        } else {
            this.f53634e = super.b();
        }
        return this.f53634e;
    }
}