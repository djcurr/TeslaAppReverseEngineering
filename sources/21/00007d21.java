package k20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class n0 {
    public static final a a(d0 d0Var) {
        kotlin.jvm.internal.s.g(d0Var, "<this>");
        j1 K0 = d0Var.K0();
        if (K0 instanceof a) {
            return (a) K0;
        }
        return null;
    }

    public static final k0 b(d0 d0Var) {
        kotlin.jvm.internal.s.g(d0Var, "<this>");
        a a11 = a(d0Var);
        if (a11 == null) {
            return null;
        }
        return a11.T0();
    }

    public static final boolean c(d0 d0Var) {
        kotlin.jvm.internal.s.g(d0Var, "<this>");
        return d0Var.K0() instanceof m;
    }

    private static final c0 d(c0 c0Var) {
        int t11;
        d0 d0Var;
        Collection<d0> a11 = c0Var.a();
        t11 = wz.x.t(a11, 10);
        ArrayList arrayList = new ArrayList(t11);
        Iterator<T> it2 = a11.iterator();
        boolean z11 = false;
        while (true) {
            d0Var = null;
            if (!it2.hasNext()) {
                break;
            }
            d0 d0Var2 = (d0) it2.next();
            if (f1.m(d0Var2)) {
                d0Var2 = f(d0Var2.K0(), false, 1, null);
                z11 = true;
            }
            arrayList.add(d0Var2);
        }
        if (z11) {
            d0 d11 = c0Var.d();
            if (d11 != null) {
                if (f1.m(d11)) {
                    d11 = f(d11.K0(), false, 1, null);
                }
                d0Var = d11;
            }
            return new c0(arrayList).h(d0Var);
        }
        return null;
    }

    public static final j1 e(j1 j1Var, boolean z11) {
        kotlin.jvm.internal.s.g(j1Var, "<this>");
        m b11 = m.f34301d.b(j1Var, z11);
        if (b11 == null) {
            k0 g11 = g(j1Var);
            return g11 == null ? j1Var.L0(false) : g11;
        }
        return b11;
    }

    public static /* synthetic */ j1 f(j1 j1Var, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return e(j1Var, z11);
    }

    private static final k0 g(d0 d0Var) {
        c0 d11;
        w0 H0 = d0Var.H0();
        c0 c0Var = H0 instanceof c0 ? (c0) H0 : null;
        if (c0Var == null || (d11 = d(c0Var)) == null) {
            return null;
        }
        return d11.c();
    }

    public static final k0 h(k0 k0Var, boolean z11) {
        kotlin.jvm.internal.s.g(k0Var, "<this>");
        m b11 = m.f34301d.b(k0Var, z11);
        if (b11 == null) {
            k0 g11 = g(k0Var);
            return g11 == null ? k0Var.O0(false) : g11;
        }
        return b11;
    }

    public static /* synthetic */ k0 i(k0 k0Var, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return h(k0Var, z11);
    }

    public static final k0 j(k0 k0Var, k0 abbreviatedType) {
        kotlin.jvm.internal.s.g(k0Var, "<this>");
        kotlin.jvm.internal.s.g(abbreviatedType, "abbreviatedType");
        return f0.a(k0Var) ? k0Var : new a(k0Var, abbreviatedType);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.checker.j k(kotlin.reflect.jvm.internal.impl.types.checker.j jVar) {
        kotlin.jvm.internal.s.g(jVar, "<this>");
        return new kotlin.reflect.jvm.internal.impl.types.checker.j(jVar.Q0(), jVar.H0(), jVar.S0(), jVar.getAnnotations(), jVar.I0(), true);
    }
}