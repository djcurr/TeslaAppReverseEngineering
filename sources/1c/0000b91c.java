package v20;

/* loaded from: classes5.dex */
public final class y2 {
    public static final a0 a(a2 a2Var) {
        return new x2(a2Var);
    }

    public static /* synthetic */ a0 b(a2 a2Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            a2Var = null;
        }
        return a(a2Var);
    }

    public static final <R> Object c(h00.p<? super o0, ? super zz.d<? super R>, ? extends Object> pVar, zz.d<? super R> dVar) {
        Object d11;
        w2 w2Var = new w2(dVar.getContext(), dVar);
        Object d12 = z20.b.d(w2Var, w2Var, pVar);
        d11 = a00.d.d();
        if (d12 == d11) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return d12;
    }
}