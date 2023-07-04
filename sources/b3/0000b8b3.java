package v20;

import vz.q;

/* loaded from: classes5.dex */
public final class f0 {
    public static final <T> Object a(Object obj, zz.d<? super T> dVar) {
        if (obj instanceof c0) {
            q.a aVar = vz.q.f54772b;
            Throwable th2 = ((c0) obj).f53902a;
            if (r0.d() && (dVar instanceof kotlin.coroutines.jvm.internal.e)) {
                th2 = kotlinx.coroutines.internal.e0.j(th2, (kotlin.coroutines.jvm.internal.e) dVar);
            }
            return vz.q.b(vz.r.a(th2));
        }
        q.a aVar2 = vz.q.f54772b;
        return vz.q.b(obj);
    }

    public static final <T> Object b(Object obj, h00.l<? super Throwable, vz.b0> lVar) {
        Throwable e11 = vz.q.e(obj);
        if (e11 == null) {
            return lVar != null ? new d0(obj, lVar) : obj;
        }
        return new c0(e11, false, 2, null);
    }

    public static final <T> Object c(Object obj, o<?> oVar) {
        Throwable e11 = vz.q.e(obj);
        if (e11 != null) {
            if (r0.d() && (oVar instanceof kotlin.coroutines.jvm.internal.e)) {
                e11 = kotlinx.coroutines.internal.e0.j(e11, (kotlin.coroutines.jvm.internal.e) oVar);
            }
            obj = new c0(e11, false, 2, null);
        }
        return obj;
    }

    public static /* synthetic */ Object d(Object obj, h00.l lVar, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            lVar = null;
        }
        return b(obj, lVar);
    }
}