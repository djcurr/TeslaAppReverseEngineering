package k20;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes5.dex */
public final class h1 {
    public static final d0 a(d0 d0Var) {
        kotlin.jvm.internal.s.g(d0Var, "<this>");
        if (d0Var instanceof g1) {
            return ((g1) d0Var).d0();
        }
        return null;
    }

    public static final j1 b(j1 j1Var, d0 origin) {
        kotlin.jvm.internal.s.g(j1Var, "<this>");
        kotlin.jvm.internal.s.g(origin, "origin");
        return e(j1Var, a(origin));
    }

    public static final j1 c(j1 j1Var, d0 origin, h00.l<? super d0, ? extends d0> transform) {
        kotlin.jvm.internal.s.g(j1Var, "<this>");
        kotlin.jvm.internal.s.g(origin, "origin");
        kotlin.jvm.internal.s.g(transform, "transform");
        d0 a11 = a(origin);
        return e(j1Var, a11 == null ? null : transform.invoke(a11));
    }

    public static final d0 d(d0 d0Var) {
        kotlin.jvm.internal.s.g(d0Var, "<this>");
        d0 a11 = a(d0Var);
        return a11 == null ? d0Var : a11;
    }

    public static final j1 e(j1 j1Var, d0 d0Var) {
        kotlin.jvm.internal.s.g(j1Var, "<this>");
        if (d0Var == null) {
            return j1Var;
        }
        if (j1Var instanceof k0) {
            return new m0((k0) j1Var, d0Var);
        }
        if (j1Var instanceof x) {
            return new z((x) j1Var, d0Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}