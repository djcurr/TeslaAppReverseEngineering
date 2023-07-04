package f8;

import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import g8.c;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f26060a = c.a.a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f26061b = c.a.a("k");

    private static boolean a(b8.e eVar) {
        return eVar == null || (eVar.k() && eVar.m().get(0).f30188b.equals(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
    }

    private static boolean b(b8.m<PointF, PointF> mVar) {
        return mVar == null || (!(mVar instanceof b8.i) && mVar.k() && mVar.m().get(0).f30188b.equals(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
    }

    private static boolean c(b8.b bVar) {
        return bVar == null || (bVar.k() && bVar.m().get(0).f30188b.floatValue() == BitmapDescriptorFactory.HUE_RED);
    }

    private static boolean d(b8.g gVar) {
        return gVar == null || (gVar.k() && gVar.m().get(0).f30188b.a(1.0f, 1.0f));
    }

    private static boolean e(b8.b bVar) {
        return bVar == null || (bVar.k() && bVar.m().get(0).f30188b.floatValue() == BitmapDescriptorFactory.HUE_RED);
    }

    private static boolean f(b8.b bVar) {
        return bVar == null || (bVar.k() && bVar.m().get(0).f30188b.floatValue() == BitmapDescriptorFactory.HUE_RED);
    }

    public static b8.l g(g8.c cVar, v7.d dVar) {
        boolean z11;
        boolean z12 = false;
        boolean z13 = cVar.e0() == c.b.BEGIN_OBJECT;
        if (z13) {
            cVar.j();
        }
        b8.b bVar = null;
        b8.e eVar = null;
        b8.m<PointF, PointF> mVar = null;
        b8.g gVar = null;
        b8.b bVar2 = null;
        b8.b bVar3 = null;
        b8.d dVar2 = null;
        b8.b bVar4 = null;
        b8.b bVar5 = null;
        while (cVar.p()) {
            switch (cVar.p0(f26060a)) {
                case 0:
                    boolean z14 = z12;
                    cVar.j();
                    while (cVar.p()) {
                        if (cVar.p0(f26061b) != 0) {
                            cVar.t0();
                            cVar.u0();
                        } else {
                            eVar = a.a(cVar, dVar);
                        }
                    }
                    cVar.m();
                    z12 = z14;
                    continue;
                case 1:
                    mVar = a.b(cVar, dVar);
                    continue;
                case 2:
                    gVar = d.j(cVar, dVar);
                    continue;
                case 3:
                    dVar.a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    dVar2 = d.h(cVar, dVar);
                    continue;
                case 6:
                    bVar4 = d.f(cVar, dVar, z12);
                    continue;
                case 7:
                    bVar5 = d.f(cVar, dVar, z12);
                    continue;
                case 8:
                    bVar2 = d.f(cVar, dVar, z12);
                    continue;
                case 9:
                    bVar3 = d.f(cVar, dVar, z12);
                    continue;
                default:
                    cVar.t0();
                    cVar.u0();
                    continue;
            }
            b8.b f11 = d.f(cVar, dVar, z12);
            if (f11.m().isEmpty()) {
                f11.m().add(new i8.a<>(dVar, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED), Float.valueOf((float) BitmapDescriptorFactory.HUE_RED), null, BitmapDescriptorFactory.HUE_RED, Float.valueOf(dVar.f())));
            } else if (f11.m().get(0).f30188b == null) {
                z11 = false;
                f11.m().set(0, new i8.a<>(dVar, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED), Float.valueOf((float) BitmapDescriptorFactory.HUE_RED), null, BitmapDescriptorFactory.HUE_RED, Float.valueOf(dVar.f())));
                z12 = z11;
                bVar = f11;
            }
            z11 = false;
            z12 = z11;
            bVar = f11;
        }
        if (z13) {
            cVar.m();
        }
        b8.e eVar2 = a(eVar) ? null : eVar;
        b8.m<PointF, PointF> mVar2 = b(mVar) ? null : mVar;
        b8.b bVar6 = c(bVar) ? null : bVar;
        if (d(gVar)) {
            gVar = null;
        }
        return new b8.l(eVar2, mVar2, gVar, bVar6, dVar2, bVar4, bVar5, f(bVar2) ? null : bVar2, e(bVar3) ? null : bVar3);
    }
}