package androidx.lifecycle;

import androidx.lifecycle.p;

/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt {
    public static final Object a(p pVar, p.c cVar, h00.p<? super v20.o0, ? super zz.d<? super vz.b0>, ? extends Object> pVar2, zz.d<? super vz.b0> dVar) {
        Object d11;
        if (cVar != p.c.INITIALIZED) {
            if (pVar.b() == p.c.DESTROYED) {
                return vz.b0.f54756a;
            }
            Object e11 = v20.p0.e(new RepeatOnLifecycleKt$repeatOnLifecycle$3(pVar, cVar, pVar2, null), dVar);
            d11 = a00.d.d();
            return e11 == d11 ? e11 : vz.b0.f54756a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
    }

    public static final Object b(v vVar, p.c cVar, h00.p<? super v20.o0, ? super zz.d<? super vz.b0>, ? extends Object> pVar, zz.d<? super vz.b0> dVar) {
        Object d11;
        p lifecycle = vVar.getLifecycle();
        kotlin.jvm.internal.s.f(lifecycle, "lifecycle");
        Object a11 = a(lifecycle, cVar, pVar, dVar);
        d11 = a00.d.d();
        return a11 == d11 ? a11 : vz.b0.f54756a;
    }
}