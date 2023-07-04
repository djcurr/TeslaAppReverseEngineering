package uo;

import com.google.zxing.NotFoundException;

/* loaded from: classes2.dex */
public class h extends com.google.zxing.b {

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f53630d = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    private byte[] f53631b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f53632c;

    public h(com.google.zxing.f fVar) {
        super(fVar);
        this.f53631b = f53630d;
        this.f53632c = new int[32];
    }

    private static int g(int[] iArr) {
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            if (iArr[i14] > i11) {
                i11 = iArr[i14];
                i13 = i14;
            }
            if (iArr[i14] > i12) {
                i12 = iArr[i14];
            }
        }
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = i17 - i13;
            int i19 = iArr[i17] * i18 * i18;
            if (i19 > i16) {
                i15 = i17;
                i16 = i19;
            }
        }
        if (i13 <= i15) {
            int i21 = i13;
            i13 = i15;
            i15 = i21;
        }
        if (i13 - i15 > length / 16) {
            int i22 = i13 - 1;
            int i23 = -1;
            int i24 = i22;
            while (i22 > i15) {
                int i25 = i22 - i15;
                int i26 = i25 * i25 * (i13 - i22) * (i12 - iArr[i22]);
                if (i26 > i23) {
                    i24 = i22;
                    i23 = i26;
                }
                i22--;
            }
            return i24 << 3;
        }
        throw NotFoundException.a();
    }

    private void h(int i11) {
        if (this.f53631b.length < i11) {
            this.f53631b = new byte[i11];
        }
        for (int i12 = 0; i12 < 32; i12++) {
            this.f53632c[i12] = 0;
        }
    }

    @Override // com.google.zxing.b
    public b b() {
        com.google.zxing.f e11 = e();
        int d11 = e11.d();
        int a11 = e11.a();
        b bVar = new b(d11, a11);
        h(d11);
        int[] iArr = this.f53632c;
        for (int i11 = 1; i11 < 5; i11++) {
            byte[] c11 = e11.c((a11 * i11) / 5, this.f53631b);
            int i12 = (d11 << 2) / 5;
            for (int i13 = d11 / 5; i13 < i12; i13++) {
                int i14 = (c11[i13] & 255) >> 3;
                iArr[i14] = iArr[i14] + 1;
            }
        }
        int g11 = g(iArr);
        byte[] b11 = e11.b();
        for (int i15 = 0; i15 < a11; i15++) {
            int i16 = i15 * d11;
            for (int i17 = 0; i17 < d11; i17++) {
                if ((b11[i16 + i17] & 255) < g11) {
                    bVar.l(i17, i15);
                }
            }
        }
        return bVar;
    }

    @Override // com.google.zxing.b
    public a c(int i11, a aVar) {
        com.google.zxing.f e11 = e();
        int d11 = e11.d();
        if (aVar != null && aVar.g() >= d11) {
            aVar.a();
        } else {
            aVar = new a(d11);
        }
        h(d11);
        byte[] c11 = e11.c(i11, this.f53631b);
        int[] iArr = this.f53632c;
        for (int i12 = 0; i12 < d11; i12++) {
            int i13 = (c11[i12] & 255) >> 3;
            iArr[i13] = iArr[i13] + 1;
        }
        int g11 = g(iArr);
        if (d11 < 3) {
            for (int i14 = 0; i14 < d11; i14++) {
                if ((c11[i14] & 255) < g11) {
                    aVar.k(i14);
                }
            }
        } else {
            int i15 = c11[1] & 255;
            int i16 = 1;
            int i17 = c11[0] & 255;
            int i18 = i15;
            while (i16 < d11 - 1) {
                int i19 = i16 + 1;
                int i21 = c11[i19] & 255;
                if ((((i18 << 2) - i17) - i21) / 2 < g11) {
                    aVar.k(i16);
                }
                i17 = i18;
                i16 = i19;
                i18 = i21;
            }
        }
        return aVar;
    }
}