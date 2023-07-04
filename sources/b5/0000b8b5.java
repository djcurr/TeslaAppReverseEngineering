package v20;

import java.util.concurrent.CancellationException;
import v20.a2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final /* synthetic */ class f2 {
    public static final a0 a(a2 a2Var) {
        return new c2(a2Var);
    }

    public static /* synthetic */ a0 b(a2 a2Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            a2Var = null;
        }
        return d2.a(a2Var);
    }

    public static final void c(a2 a2Var, String str, Throwable th2) {
        a2Var.j(p1.a(str, th2));
    }

    public static final void d(zz.g gVar, CancellationException cancellationException) {
        a2 a2Var = (a2) gVar.get(a2.f53887l1);
        if (a2Var == null) {
            return;
        }
        a2Var.j(cancellationException);
    }

    public static /* synthetic */ void e(a2 a2Var, String str, Throwable th2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        d2.c(a2Var, str, th2);
    }

    public static /* synthetic */ void f(zz.g gVar, CancellationException cancellationException, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cancellationException = null;
        }
        d2.d(gVar, cancellationException);
    }

    public static final Object g(a2 a2Var, zz.d<? super vz.b0> dVar) {
        Object d11;
        a2.a.a(a2Var, null, 1, null);
        Object D = a2Var.D(dVar);
        d11 = a00.d.d();
        return D == d11 ? D : vz.b0.f54756a;
    }

    public static final void h(zz.g gVar, CancellationException cancellationException) {
        u20.h<a2> children;
        a2 a2Var = (a2) gVar.get(a2.f53887l1);
        if (a2Var == null || (children = a2Var.getChildren()) == null) {
            return;
        }
        for (a2 a2Var2 : children) {
            a2Var2.j(cancellationException);
        }
    }

    public static /* synthetic */ void i(zz.g gVar, CancellationException cancellationException, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cancellationException = null;
        }
        d2.h(gVar, cancellationException);
    }

    public static final g1 j(a2 a2Var, g1 g1Var) {
        return a2Var.p(new i1(g1Var));
    }

    public static final void k(a2 a2Var) {
        if (!a2Var.a()) {
            throw a2Var.m();
        }
    }

    public static final void l(zz.g gVar) {
        a2 a2Var = (a2) gVar.get(a2.f53887l1);
        if (a2Var == null) {
            return;
        }
        d2.l(a2Var);
    }

    public static final a2 m(zz.g gVar) {
        a2 a2Var = (a2) gVar.get(a2.f53887l1);
        if (a2Var != null) {
            return a2Var;
        }
        throw new IllegalStateException(kotlin.jvm.internal.s.p("Current context doesn't contain Job in it: ", gVar).toString());
    }

    public static final boolean n(zz.g gVar) {
        a2 a2Var = (a2) gVar.get(a2.f53887l1);
        return a2Var != null && a2Var.a();
    }
}