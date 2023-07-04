package lp;

import com.google.zxing.NotFoundException;
import com.google.zxing.l;
import com.google.zxing.m;
import com.google.zxing.qrcode.decoder.j;
import java.util.Map;
import uo.g;
import uo.i;
import uo.k;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final uo.b f37263a;

    /* renamed from: b  reason: collision with root package name */
    private m f37264b;

    public c(uo.b bVar) {
        this.f37263a = bVar;
    }

    private float b(l lVar, l lVar2) {
        float j11 = j((int) lVar.c(), (int) lVar.d(), (int) lVar2.c(), (int) lVar2.d());
        float j12 = j((int) lVar2.c(), (int) lVar2.d(), (int) lVar.c(), (int) lVar.d());
        return Float.isNaN(j11) ? j12 / 7.0f : Float.isNaN(j12) ? j11 / 7.0f : (j11 + j12) / 14.0f;
    }

    private static int c(l lVar, l lVar2, l lVar3, float f11) {
        int c11 = ((vo.a.c(l.b(lVar, lVar2) / f11) + vo.a.c(l.b(lVar, lVar3) / f11)) / 2) + 7;
        int i11 = c11 & 3;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return c11;
                }
                throw NotFoundException.a();
            }
            return c11 - 1;
        }
        return c11 + 1;
    }

    private static k d(l lVar, l lVar2, l lVar3, l lVar4, int i11) {
        float c11;
        float d11;
        float f11;
        float f12 = i11 - 3.5f;
        if (lVar4 != null) {
            c11 = lVar4.c();
            d11 = lVar4.d();
            f11 = f12 - 3.0f;
        } else {
            c11 = (lVar2.c() - lVar.c()) + lVar3.c();
            d11 = (lVar2.d() - lVar.d()) + lVar3.d();
            f11 = f12;
        }
        return k.b(3.5f, 3.5f, f12, 3.5f, f11, f11, 3.5f, f12, lVar.c(), lVar.d(), lVar2.c(), lVar2.d(), c11, d11, lVar3.c(), lVar3.d());
    }

    private static uo.b h(uo.b bVar, k kVar, int i11) {
        return i.b().d(bVar, i11, i11, kVar);
    }

    private float i(int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        c cVar;
        boolean z11;
        boolean z12;
        boolean z13 = true;
        boolean z14 = Math.abs(i14 - i12) > Math.abs(i13 - i11);
        if (z14) {
            i16 = i11;
            i15 = i12;
            i18 = i13;
            i17 = i14;
        } else {
            i15 = i11;
            i16 = i12;
            i17 = i13;
            i18 = i14;
        }
        int abs = Math.abs(i17 - i15);
        int abs2 = Math.abs(i18 - i16);
        int i22 = 2;
        int i23 = (-abs) / 2;
        int i24 = i15 < i17 ? 1 : -1;
        int i25 = i16 < i18 ? 1 : -1;
        int i26 = i17 + i24;
        int i27 = i15;
        int i28 = i16;
        int i29 = 0;
        while (true) {
            if (i27 == i26) {
                i19 = i26;
                i21 = i22;
                break;
            }
            int i31 = z14 ? i28 : i27;
            int i32 = z14 ? i27 : i28;
            if (i29 == z13) {
                z11 = z14;
                z12 = z13;
                i19 = i26;
                cVar = this;
            } else {
                cVar = this;
                z11 = z14;
                i19 = i26;
                z12 = false;
            }
            if (z12 == cVar.f37263a.d(i31, i32)) {
                if (i29 == 2) {
                    return vo.a.b(i27, i28, i15, i16);
                }
                i29++;
            }
            i23 += abs2;
            if (i23 > 0) {
                if (i28 == i18) {
                    i21 = 2;
                    break;
                }
                i28 += i25;
                i23 -= abs;
            }
            i27 += i24;
            i26 = i19;
            z14 = z11;
            z13 = true;
            i22 = 2;
        }
        if (i29 == i21) {
            return vo.a.b(i19, i18, i15, i16);
        }
        return Float.NaN;
    }

    private float j(int i11, int i12, int i13, int i14) {
        float f11;
        float f12;
        float i15 = i(i11, i12, i13, i14);
        int i16 = i11 - (i13 - i11);
        int i17 = 0;
        if (i16 < 0) {
            f11 = i11 / (i11 - i16);
            i16 = 0;
        } else if (i16 >= this.f37263a.j()) {
            f11 = ((this.f37263a.j() - 1) - i11) / (i16 - i11);
            i16 = this.f37263a.j() - 1;
        } else {
            f11 = 1.0f;
        }
        float f13 = i12;
        int i18 = (int) (f13 - ((i14 - i12) * f11));
        if (i18 < 0) {
            f12 = f13 / (i12 - i18);
        } else if (i18 >= this.f37263a.g()) {
            f12 = ((this.f37263a.g() - 1) - i12) / (i18 - i12);
            i17 = this.f37263a.g() - 1;
        } else {
            i17 = i18;
            f12 = 1.0f;
        }
        return (i15 + i(i11, i12, (int) (i11 + ((i16 - i11) * f12)), i17)) - 1.0f;
    }

    protected final float a(l lVar, l lVar2, l lVar3) {
        return (b(lVar, lVar2) + b(lVar, lVar3)) / 2.0f;
    }

    public final g e(Map<com.google.zxing.d, ?> map) {
        m mVar = map == null ? null : (m) map.get(com.google.zxing.d.NEED_RESULT_POINT_CALLBACK);
        this.f37264b = mVar;
        return g(new e(this.f37263a, mVar).f(map));
    }

    protected final a f(float f11, int i11, int i12, float f12) {
        int i13 = (int) (f12 * f11);
        int max = Math.max(0, i11 - i13);
        int min = Math.min(this.f37263a.j() - 1, i11 + i13) - max;
        float f13 = 3.0f * f11;
        if (min >= f13) {
            int max2 = Math.max(0, i12 - i13);
            int min2 = Math.min(this.f37263a.g() - 1, i12 + i13) - max2;
            if (min2 >= f13) {
                return new b(this.f37263a, max, max2, min, min2, f11, this.f37264b).c();
            }
            throw NotFoundException.a();
        }
        throw NotFoundException.a();
    }

    protected final g g(f fVar) {
        d b11 = fVar.b();
        d c11 = fVar.c();
        d a11 = fVar.a();
        float a12 = a(b11, c11, a11);
        if (a12 >= 1.0f) {
            int c12 = c(b11, c11, a11, a12);
            j g11 = j.g(c12);
            int e11 = g11.e() - 7;
            a aVar = null;
            if (g11.d().length > 0) {
                float c13 = (c11.c() - b11.c()) + a11.c();
                float d11 = (c11.d() - b11.d()) + a11.d();
                float f11 = 1.0f - (3.0f / e11);
                int c14 = (int) (b11.c() + ((c13 - b11.c()) * f11));
                int d12 = (int) (b11.d() + (f11 * (d11 - b11.d())));
                for (int i11 = 4; i11 <= 16; i11 <<= 1) {
                    try {
                        aVar = f(a12, c14, d12, i11);
                        break;
                    } catch (NotFoundException unused) {
                    }
                }
            }
            return new g(h(this.f37263a, d(b11, c11, a11, aVar, c12), c12), aVar == null ? new l[]{a11, b11, c11} : new l[]{a11, b11, c11, aVar});
        }
        throw NotFoundException.a();
    }
}