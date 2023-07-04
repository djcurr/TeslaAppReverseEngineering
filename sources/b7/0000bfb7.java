package xo;

import com.google.zxing.NotFoundException;
import com.google.zxing.c;
import com.google.zxing.i;
import com.google.zxing.j;
import com.google.zxing.k;
import com.google.zxing.l;
import java.util.List;
import java.util.Map;
import uo.b;
import uo.e;
import uo.g;
import yo.d;

/* loaded from: classes2.dex */
public final class a implements i {

    /* renamed from: b  reason: collision with root package name */
    private static final l[] f57641b = new l[0];

    /* renamed from: a  reason: collision with root package name */
    private final d f57642a = new d();

    private static b b(b bVar) {
        int[] i11 = bVar.i();
        int[] e11 = bVar.e();
        if (i11 != null && e11 != null) {
            int c11 = c(i11, bVar);
            int i12 = i11[1];
            int i13 = e11[1];
            int i14 = i11[0];
            int i15 = ((e11[0] - i14) + 1) / c11;
            int i16 = ((i13 - i12) + 1) / c11;
            if (i15 > 0 && i16 > 0) {
                int i17 = c11 / 2;
                int i18 = i12 + i17;
                int i19 = i14 + i17;
                b bVar2 = new b(i15, i16);
                for (int i21 = 0; i21 < i16; i21++) {
                    int i22 = (i21 * c11) + i18;
                    for (int i23 = 0; i23 < i15; i23++) {
                        if (bVar.d((i23 * c11) + i19, i22)) {
                            bVar2.l(i23, i21);
                        }
                    }
                }
                return bVar2;
            }
            throw NotFoundException.a();
        }
        throw NotFoundException.a();
    }

    private static int c(int[] iArr, b bVar) {
        int j11 = bVar.j();
        int i11 = iArr[0];
        int i12 = iArr[1];
        while (i11 < j11 && bVar.d(i11, i12)) {
            i11++;
        }
        if (i11 != j11) {
            int i13 = i11 - iArr[0];
            if (i13 != 0) {
                return i13;
            }
            throw NotFoundException.a();
        }
        throw NotFoundException.a();
    }

    @Override // com.google.zxing.i
    public j a(c cVar, Map<com.google.zxing.d, ?> map) {
        l[] b11;
        e eVar;
        if (map != null && map.containsKey(com.google.zxing.d.PURE_BARCODE)) {
            eVar = this.f57642a.b(b(cVar.a()));
            b11 = f57641b;
        } else {
            g c11 = new zo.a(cVar.a()).c();
            e b12 = this.f57642a.b(c11.a());
            b11 = c11.b();
            eVar = b12;
        }
        j jVar = new j(eVar.h(), eVar.e(), b11, com.google.zxing.a.DATA_MATRIX);
        List<byte[]> a11 = eVar.a();
        if (a11 != null) {
            jVar.h(k.BYTE_SEGMENTS, a11);
        }
        String b13 = eVar.b();
        if (b13 != null) {
            jVar.h(k.ERROR_CORRECTION_LEVEL, b13);
        }
        return jVar;
    }

    @Override // com.google.zxing.i
    public void reset() {
    }
}