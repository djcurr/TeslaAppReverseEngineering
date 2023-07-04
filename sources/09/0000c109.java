package y0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private static final l0.c1<x2.g> f58717a = new l0.c1<>(120, 0, l0.b0.a(), 2, null);

    /* renamed from: b  reason: collision with root package name */
    private static final l0.c1<x2.g> f58718b = new l0.c1<>(150, 0, new l0.u(0.4f, BitmapDescriptorFactory.HUE_RED, 0.6f, 1.0f), 2, null);

    /* renamed from: c  reason: collision with root package name */
    private static final l0.c1<x2.g> f58719c = new l0.c1<>(120, 0, new l0.u(0.4f, BitmapDescriptorFactory.HUE_RED, 0.6f, 1.0f), 2, null);

    public static final Object d(l0.a<x2.g, ?> aVar, float f11, o0.j jVar, o0.j jVar2, zz.d<? super vz.b0> dVar) {
        l0.i<x2.g> b11;
        Object d11;
        Object d12;
        if (jVar2 != null) {
            b11 = x.f58713a.a(jVar2);
        } else {
            b11 = jVar != null ? x.f58713a.b(jVar) : null;
        }
        l0.i<x2.g> iVar = b11;
        if (iVar != null) {
            Object f12 = l0.a.f(aVar, x2.g.c(f11), iVar, null, null, dVar, 12, null);
            d12 = a00.d.d();
            return f12 == d12 ? f12 : vz.b0.f54756a;
        }
        Object v11 = aVar.v(x2.g.c(f11), dVar);
        d11 = a00.d.d();
        return v11 == d11 ? v11 : vz.b0.f54756a;
    }
}