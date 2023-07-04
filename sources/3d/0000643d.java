package cp;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class k implements com.google.zxing.i {
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c A[Catch: ReaderException -> 0x00cc, TRY_LEAVE, TryCatch #5 {ReaderException -> 0x00cc, blocks: (B:39:0x0076, B:41:0x007c), top: B:76:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00cb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.google.zxing.j c(com.google.zxing.c r22, java.util.Map<com.google.zxing.d, ?> r23) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cp.k.c(com.google.zxing.c, java.util.Map):com.google.zxing.j");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static float d(int[] iArr, int[] iArr2, float f11) {
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            i11 += iArr[i13];
            i12 += iArr2[i13];
        }
        if (i11 < i12) {
            return Float.POSITIVE_INFINITY;
        }
        float f12 = i11;
        float f13 = f12 / i12;
        float f14 = f11 * f13;
        float f15 = BitmapDescriptorFactory.HUE_RED;
        for (int i14 = 0; i14 < length; i14++) {
            float f16 = iArr2[i14] * f13;
            float f17 = iArr[i14];
            float f18 = f17 > f16 ? f17 - f16 : f16 - f17;
            if (f18 > f14) {
                return Float.POSITIVE_INFINITY;
            }
            f15 += f18;
        }
        return f15 / f12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void e(uo.a aVar, int i11, int[] iArr) {
        int length = iArr.length;
        int i12 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int g11 = aVar.g();
        if (i11 < g11) {
            boolean z11 = !aVar.c(i11);
            while (i11 < g11) {
                if (aVar.c(i11) == z11) {
                    i12++;
                    if (i12 == length) {
                        break;
                    }
                    iArr[i12] = 1;
                    z11 = !z11;
                } else {
                    iArr[i12] = iArr[i12] + 1;
                }
                i11++;
            }
            if (i12 != length) {
                if (i12 != length - 1 || i11 != g11) {
                    throw NotFoundException.a();
                }
                return;
            }
            return;
        }
        throw NotFoundException.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void f(uo.a aVar, int i11, int[] iArr) {
        int length = iArr.length;
        boolean c11 = aVar.c(i11);
        while (i11 > 0 && length >= 0) {
            i11--;
            if (aVar.c(i11) != c11) {
                length--;
                c11 = !c11;
            }
        }
        if (length < 0) {
            e(aVar, i11 + 1, iArr);
            return;
        }
        throw NotFoundException.a();
    }

    @Override // com.google.zxing.i
    public com.google.zxing.j a(com.google.zxing.c cVar, Map<com.google.zxing.d, ?> map) {
        try {
            return c(cVar, map);
        } catch (NotFoundException e11) {
            if ((map != null && map.containsKey(com.google.zxing.d.TRY_HARDER)) && cVar.e()) {
                com.google.zxing.c f11 = cVar.f();
                com.google.zxing.j c11 = c(f11, map);
                Map<com.google.zxing.k, Object> d11 = c11.d();
                int i11 = 270;
                if (d11 != null) {
                    com.google.zxing.k kVar = com.google.zxing.k.ORIENTATION;
                    if (d11.containsKey(kVar)) {
                        i11 = (((Integer) d11.get(kVar)).intValue() + 270) % 360;
                    }
                }
                c11.h(com.google.zxing.k.ORIENTATION, Integer.valueOf(i11));
                com.google.zxing.l[] e12 = c11.e();
                if (e12 != null) {
                    int c12 = f11.c();
                    for (int i12 = 0; i12 < e12.length; i12++) {
                        e12[i12] = new com.google.zxing.l((c12 - e12[i12].d()) - 1.0f, e12[i12].c());
                    }
                }
                return c11;
            }
            throw e11;
        }
    }

    public abstract com.google.zxing.j b(int i11, uo.a aVar, Map<com.google.zxing.d, ?> map);

    @Override // com.google.zxing.i
    public void reset() {
    }
}