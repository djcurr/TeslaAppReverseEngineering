package kp;

import com.google.zxing.NotFoundException;
import com.google.zxing.c;
import com.google.zxing.d;
import com.google.zxing.i;
import com.google.zxing.j;
import com.google.zxing.k;
import com.google.zxing.l;
import com.google.zxing.qrcode.decoder.e;
import java.util.List;
import java.util.Map;
import uo.b;
import uo.g;

/* loaded from: classes2.dex */
public class a implements i {

    /* renamed from: b  reason: collision with root package name */
    private static final l[] f35672b = new l[0];

    /* renamed from: a  reason: collision with root package name */
    private final e f35673a = new e();

    private static b b(b bVar) {
        int[] i11 = bVar.i();
        int[] e11 = bVar.e();
        if (i11 != null && e11 != null) {
            float c11 = c(i11, bVar);
            int i12 = i11[1];
            int i13 = e11[1];
            int i14 = i11[0];
            int i15 = e11[0];
            if (i14 < i15 && i12 < i13) {
                int i16 = i13 - i12;
                if (i16 != i15 - i14 && (i15 = i14 + i16) >= bVar.j()) {
                    throw NotFoundException.a();
                }
                int round = Math.round(((i15 - i14) + 1) / c11);
                int round2 = Math.round((i16 + 1) / c11);
                if (round <= 0 || round2 <= 0) {
                    throw NotFoundException.a();
                }
                if (round2 == round) {
                    int i17 = (int) (c11 / 2.0f);
                    int i18 = i12 + i17;
                    int i19 = i14 + i17;
                    int i21 = (((int) ((round - 1) * c11)) + i19) - i15;
                    if (i21 > 0) {
                        if (i21 > i17) {
                            throw NotFoundException.a();
                        }
                        i19 -= i21;
                    }
                    int i22 = (((int) ((round2 - 1) * c11)) + i18) - i13;
                    if (i22 > 0) {
                        if (i22 > i17) {
                            throw NotFoundException.a();
                        }
                        i18 -= i22;
                    }
                    b bVar2 = new b(round, round2);
                    for (int i23 = 0; i23 < round2; i23++) {
                        int i24 = ((int) (i23 * c11)) + i18;
                        for (int i25 = 0; i25 < round; i25++) {
                            if (bVar.d(((int) (i25 * c11)) + i19, i24)) {
                                bVar2.l(i25, i23);
                            }
                        }
                    }
                    return bVar2;
                }
                throw NotFoundException.a();
            }
            throw NotFoundException.a();
        }
        throw NotFoundException.a();
    }

    private static float c(int[] iArr, b bVar) {
        int g11 = bVar.g();
        int j11 = bVar.j();
        int i11 = iArr[0];
        boolean z11 = true;
        int i12 = iArr[1];
        int i13 = 0;
        while (i11 < j11 && i12 < g11) {
            if (z11 != bVar.d(i11, i12)) {
                i13++;
                if (i13 == 5) {
                    break;
                }
                z11 = !z11;
            }
            i11++;
            i12++;
        }
        if (i11 != j11 && i12 != g11) {
            return (i11 - iArr[0]) / 7.0f;
        }
        throw NotFoundException.a();
    }

    @Override // com.google.zxing.i
    public final j a(c cVar, Map<d, ?> map) {
        l[] b11;
        uo.e eVar;
        if (map != null && map.containsKey(d.PURE_BARCODE)) {
            eVar = this.f35673a.c(b(cVar.a()), map);
            b11 = f35672b;
        } else {
            g e11 = new lp.c(cVar.a()).e(map);
            uo.e c11 = this.f35673a.c(e11.a(), map);
            b11 = e11.b();
            eVar = c11;
        }
        if (eVar.d() instanceof com.google.zxing.qrcode.decoder.i) {
            ((com.google.zxing.qrcode.decoder.i) eVar.d()).a(b11);
        }
        j jVar = new j(eVar.h(), eVar.e(), b11, com.google.zxing.a.QR_CODE);
        List<byte[]> a11 = eVar.a();
        if (a11 != null) {
            jVar.h(k.BYTE_SEGMENTS, a11);
        }
        String b12 = eVar.b();
        if (b12 != null) {
            jVar.h(k.ERROR_CORRECTION_LEVEL, b12);
        }
        if (eVar.i()) {
            jVar.h(k.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(eVar.g()));
            jVar.h(k.STRUCTURED_APPEND_PARITY, Integer.valueOf(eVar.f()));
        }
        return jVar;
    }

    @Override // com.google.zxing.i
    public void reset() {
    }
}