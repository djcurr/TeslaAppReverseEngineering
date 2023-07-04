package ap;

import bp.c;
import com.google.zxing.NotFoundException;
import com.google.zxing.d;
import com.google.zxing.i;
import com.google.zxing.j;
import com.google.zxing.k;
import com.google.zxing.l;
import java.util.Map;
import uo.b;
import uo.e;

/* loaded from: classes2.dex */
public final class a implements i {

    /* renamed from: b  reason: collision with root package name */
    private static final l[] f6708b = new l[0];

    /* renamed from: a  reason: collision with root package name */
    private final c f6709a = new c();

    private static b b(b bVar) {
        int[] f11 = bVar.f();
        if (f11 != null) {
            int i11 = f11[0];
            int i12 = f11[1];
            int i13 = f11[2];
            int i14 = f11[3];
            b bVar2 = new b(30, 33);
            for (int i15 = 0; i15 < 33; i15++) {
                int i16 = (((i15 * i14) + (i14 / 2)) / 33) + i12;
                for (int i17 = 0; i17 < 30; i17++) {
                    if (bVar.d(((((i17 * i13) + (i13 / 2)) + (((i15 & 1) * i13) / 2)) / 30) + i11, i16)) {
                        bVar2.l(i17, i15);
                    }
                }
            }
            return bVar2;
        }
        throw NotFoundException.a();
    }

    @Override // com.google.zxing.i
    public j a(com.google.zxing.c cVar, Map<d, ?> map) {
        if (map != null && map.containsKey(d.PURE_BARCODE)) {
            e b11 = this.f6709a.b(b(cVar.a()), map);
            j jVar = new j(b11.h(), b11.e(), f6708b, com.google.zxing.a.MAXICODE);
            String b12 = b11.b();
            if (b12 != null) {
                jVar.h(k.ERROR_CORRECTION_LEVEL, b12);
            }
            return jVar;
        }
        throw NotFoundException.a();
    }

    @Override // com.google.zxing.i
    public void reset() {
    }
}