package c1;

/* loaded from: classes.dex */
public final class n0 {
    public static final m0 a(zz.g gVar) {
        kotlin.jvm.internal.s.g(gVar, "<this>");
        m0 m0Var = (m0) gVar.get(m0.f8617v);
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    public static final <R> Object b(h00.l<? super Long, ? extends R> lVar, zz.d<? super R> dVar) {
        return a(dVar.getContext()).e0(lVar, dVar);
    }
}