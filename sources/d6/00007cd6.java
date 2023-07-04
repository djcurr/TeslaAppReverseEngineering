package k20;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes5.dex */
public final class a0 {
    public static final x a(d0 d0Var) {
        kotlin.jvm.internal.s.g(d0Var, "<this>");
        return (x) d0Var.K0();
    }

    public static final boolean b(d0 d0Var) {
        kotlin.jvm.internal.s.g(d0Var, "<this>");
        return d0Var.K0() instanceof x;
    }

    public static final k0 c(d0 d0Var) {
        kotlin.jvm.internal.s.g(d0Var, "<this>");
        j1 K0 = d0Var.K0();
        if (K0 instanceof x) {
            return ((x) K0).P0();
        }
        if (K0 instanceof k0) {
            return (k0) K0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final k0 d(d0 d0Var) {
        kotlin.jvm.internal.s.g(d0Var, "<this>");
        j1 K0 = d0Var.K0();
        if (K0 instanceof x) {
            return ((x) K0).Q0();
        }
        if (K0 instanceof k0) {
            return (k0) K0;
        }
        throw new NoWhenBranchMatchedException();
    }
}