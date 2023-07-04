package a1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.s;
import t1.a0;
import t1.e1;
import t1.f1;
import t1.g1;
import x1.c;
import x1.d;
import x1.p;
import x2.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static x1.c f109a;

    public static final x1.c a(z0.a aVar) {
        s.g(aVar, "<this>");
        x1.c cVar = f109a;
        if (cVar != null) {
            s.e(cVar);
            return cVar;
        }
        c.a aVar2 = new c.a("Filled.Check", g.f(24.0f), g.f(24.0f), 24.0f, 24.0f, 0L, 0, 96, null);
        int b11 = p.b();
        e1 e1Var = new e1(a0.f51365b.a(), null);
        int a11 = f1.f51429b.a();
        int a12 = g1.f51434b.a();
        d dVar = new d();
        dVar.g(9.0f, 16.17f);
        dVar.e(4.83f, 12.0f);
        dVar.f(-1.42f, 1.41f);
        dVar.e(9.0f, 19.0f);
        dVar.e(21.0f, 7.0f);
        dVar.f(-1.41f, -1.41f);
        dVar.b();
        x1.c f11 = c.a.d(aVar2, dVar.d(), b11, "", e1Var, 1.0f, null, 1.0f, 1.0f, a11, a12, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14336, null).f();
        f109a = f11;
        s.e(f11);
        return f11;
    }
}