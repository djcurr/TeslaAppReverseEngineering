package uo;

import com.google.zxing.NotFoundException;

/* loaded from: classes2.dex */
public final class f extends i {
    @Override // uo.i
    public b c(b bVar, int i11, int i12, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, float f25, float f26, float f27) {
        return d(bVar, i11, i12, k.b(f11, f12, f13, f14, f15, f16, f17, f18, f19, f21, f22, f23, f24, f25, f26, f27));
    }

    @Override // uo.i
    public b d(b bVar, int i11, int i12, k kVar) {
        if (i11 > 0 && i12 > 0) {
            b bVar2 = new b(i11, i12);
            int i13 = i11 * 2;
            float[] fArr = new float[i13];
            for (int i14 = 0; i14 < i12; i14++) {
                float f11 = i14 + 0.5f;
                for (int i15 = 0; i15 < i13; i15 += 2) {
                    fArr[i15] = (i15 / 2) + 0.5f;
                    fArr[i15 + 1] = f11;
                }
                kVar.f(fArr);
                i.a(bVar, fArr);
                for (int i16 = 0; i16 < i13; i16 += 2) {
                    try {
                        if (bVar.d((int) fArr[i16], (int) fArr[i16 + 1])) {
                            bVar2.l(i16 / 2, i14);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw NotFoundException.a();
                    }
                }
            }
            return bVar2;
        }
        throw NotFoundException.a();
    }
}