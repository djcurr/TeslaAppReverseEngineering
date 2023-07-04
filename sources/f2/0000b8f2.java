package v20;

import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class p0 {
    public static final o0 a(zz.g gVar) {
        a0 b11;
        if (gVar.get(a2.f53887l1) == null) {
            b11 = f2.b(null, 1, null);
            gVar = gVar.plus(b11);
        }
        return new kotlinx.coroutines.internal.g(gVar);
    }

    public static final o0 b() {
        return new kotlinx.coroutines.internal.g(y2.b(null, 1, null).plus(e1.c()));
    }

    public static final void c(o0 o0Var, CancellationException cancellationException) {
        a2 a2Var = (a2) o0Var.J().get(a2.f53887l1);
        if (a2Var != null) {
            a2Var.j(cancellationException);
            return;
        }
        throw new IllegalStateException(kotlin.jvm.internal.s.p("Scope cannot be cancelled because it does not have a job: ", o0Var).toString());
    }

    public static /* synthetic */ void d(o0 o0Var, CancellationException cancellationException, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cancellationException = null;
        }
        c(o0Var, cancellationException);
    }

    public static final <R> Object e(h00.p<? super o0, ? super zz.d<? super R>, ? extends Object> pVar, zz.d<? super R> dVar) {
        Object d11;
        kotlinx.coroutines.internal.d0 d0Var = new kotlinx.coroutines.internal.d0(dVar.getContext(), dVar);
        Object d12 = z20.b.d(d0Var, d0Var, pVar);
        d11 = a00.d.d();
        if (d12 == d11) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return d12;
    }

    public static final boolean f(o0 o0Var) {
        a2 a2Var = (a2) o0Var.J().get(a2.f53887l1);
        if (a2Var == null) {
            return true;
        }
        return a2Var.a();
    }

    public static final o0 g(o0 o0Var, zz.g gVar) {
        return new kotlinx.coroutines.internal.g(o0Var.J().plus(gVar));
    }
}