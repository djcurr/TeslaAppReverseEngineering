package v20;

import vz.q;

/* loaded from: classes5.dex */
public final class s0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(zz.d<?> dVar) {
        String b11;
        if (dVar instanceof kotlinx.coroutines.internal.i) {
            return dVar.toString();
        }
        try {
            q.a aVar = vz.q.f54772b;
            b11 = vz.q.b(dVar + '@' + b(dVar));
        } catch (Throwable th2) {
            q.a aVar2 = vz.q.f54772b;
            b11 = vz.q.b(vz.r.a(th2));
        }
        if (vz.q.e(b11) != null) {
            b11 = ((Object) dVar.getClass().getName()) + '@' + b(dVar);
        }
        return (String) b11;
    }
}