package v20;

/* loaded from: classes5.dex */
public final class r {
    public static final void a(o<?> oVar, g1 g1Var) {
        oVar.T(new h1(g1Var));
    }

    public static final <T> p<T> b(zz.d<? super T> dVar) {
        if (!(dVar instanceof kotlinx.coroutines.internal.i)) {
            return new p<>(dVar, 1);
        }
        p<T> j11 = ((kotlinx.coroutines.internal.i) dVar).j();
        if (j11 == null || !j11.H()) {
            j11 = null;
        }
        return j11 == null ? new p<>(dVar, 2) : j11;
    }

    public static final void c(o<?> oVar, kotlinx.coroutines.internal.s sVar) {
        oVar.T(new q2(sVar));
    }
}