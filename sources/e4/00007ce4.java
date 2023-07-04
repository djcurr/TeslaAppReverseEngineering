package k20;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes5.dex */
public final class c1 {
    public static final k0 a(d0 d0Var) {
        kotlin.jvm.internal.s.g(d0Var, "<this>");
        j1 K0 = d0Var.K0();
        k0 k0Var = K0 instanceof k0 ? (k0) K0 : null;
        if (k0Var != null) {
            return k0Var;
        }
        throw new IllegalStateException(kotlin.jvm.internal.s.p("This is should be simple type: ", d0Var).toString());
    }

    public static final d0 b(d0 d0Var, List<? extends y0> newArguments, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g newAnnotations) {
        kotlin.jvm.internal.s.g(d0Var, "<this>");
        kotlin.jvm.internal.s.g(newArguments, "newArguments");
        kotlin.jvm.internal.s.g(newAnnotations, "newAnnotations");
        return e(d0Var, newArguments, newAnnotations, null, 4, null);
    }

    public static final d0 c(d0 d0Var, List<? extends y0> newArguments, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g newAnnotations, List<? extends y0> newArgumentsForUpperBound) {
        kotlin.jvm.internal.s.g(d0Var, "<this>");
        kotlin.jvm.internal.s.g(newArguments, "newArguments");
        kotlin.jvm.internal.s.g(newAnnotations, "newAnnotations");
        kotlin.jvm.internal.s.g(newArgumentsForUpperBound, "newArgumentsForUpperBound");
        if ((newArguments.isEmpty() || newArguments == d0Var.G0()) && newAnnotations == d0Var.getAnnotations()) {
            return d0Var;
        }
        j1 K0 = d0Var.K0();
        if (K0 instanceof x) {
            x xVar = (x) K0;
            return e0.d(d(xVar.P0(), newArguments, newAnnotations), d(xVar.Q0(), newArgumentsForUpperBound, newAnnotations));
        } else if (K0 instanceof k0) {
            return d((k0) K0, newArguments, newAnnotations);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final k0 d(k0 k0Var, List<? extends y0> newArguments, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g newAnnotations) {
        kotlin.jvm.internal.s.g(k0Var, "<this>");
        kotlin.jvm.internal.s.g(newArguments, "newArguments");
        kotlin.jvm.internal.s.g(newAnnotations, "newAnnotations");
        if (newArguments.isEmpty() && newAnnotations == k0Var.getAnnotations()) {
            return k0Var;
        }
        if (newArguments.isEmpty()) {
            return k0Var.P0(newAnnotations);
        }
        return e0.i(newAnnotations, k0Var.H0(), newArguments, k0Var.I0(), null, 16, null);
    }

    public static /* synthetic */ d0 e(d0 d0Var, List list, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = d0Var.G0();
        }
        if ((i11 & 2) != 0) {
            gVar = d0Var.getAnnotations();
        }
        if ((i11 & 4) != 0) {
            list2 = list;
        }
        return c(d0Var, list, gVar, list2);
    }

    public static /* synthetic */ k0 f(k0 k0Var, List list, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = k0Var.G0();
        }
        if ((i11 & 2) != 0) {
            gVar = k0Var.getAnnotations();
        }
        return d(k0Var, list, gVar);
    }
}