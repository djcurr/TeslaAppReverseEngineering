package y20;

import kotlin.jvm.internal.r0;
import kotlinx.coroutines.internal.j0;

/* loaded from: classes5.dex */
public final class e {
    public static final /* synthetic */ kotlinx.coroutines.flow.f a(kotlinx.coroutines.flow.f fVar, zz.g gVar) {
        return e(fVar, gVar);
    }

    public static final <T> d<T> b(kotlinx.coroutines.flow.e<? extends T> eVar) {
        d<T> dVar = eVar instanceof d ? (d) eVar : null;
        return dVar == null ? new g(eVar, null, 0, null, 14, null) : dVar;
    }

    public static final <T, V> Object c(zz.g gVar, V v11, Object obj, h00.p<? super V, ? super zz.d<? super T>, ? extends Object> pVar, zz.d<? super T> dVar) {
        Object d11;
        Object c11 = j0.c(gVar, obj);
        try {
            Object invoke = ((h00.p) r0.f(pVar, 2)).invoke(v11, new v(dVar, gVar));
            j0.a(gVar, c11);
            d11 = a00.d.d();
            if (invoke == d11) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return invoke;
        } catch (Throwable th2) {
            j0.a(gVar, c11);
            throw th2;
        }
    }

    public static /* synthetic */ Object d(zz.g gVar, Object obj, Object obj2, h00.p pVar, zz.d dVar, int i11, Object obj3) {
        if ((i11 & 4) != 0) {
            obj2 = j0.b(gVar);
        }
        return c(gVar, obj, obj2, pVar, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlinx.coroutines.flow.f<T> e(kotlinx.coroutines.flow.f<? super T> fVar, zz.g gVar) {
        return fVar instanceof u ? true : fVar instanceof p ? fVar : new x(fVar, gVar);
    }
}