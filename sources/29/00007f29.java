package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.List;
import k20.a0;
import k20.e0;
import k20.f0;
import k20.j1;
import k20.k0;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes5.dex */
public final class e {
    public static final j1 a(List<? extends j1> types) {
        int t11;
        int t12;
        k0 P0;
        kotlin.jvm.internal.s.g(types, "types");
        int size = types.size();
        if (size != 0) {
            if (size != 1) {
                t11 = wz.x.t(types, 10);
                ArrayList arrayList = new ArrayList(t11);
                boolean z11 = false;
                boolean z12 = false;
                for (j1 j1Var : types) {
                    z11 = z11 || f0.a(j1Var);
                    if (j1Var instanceof k0) {
                        P0 = (k0) j1Var;
                    } else if (j1Var instanceof k20.x) {
                        if (k20.t.a(j1Var)) {
                            return j1Var;
                        }
                        P0 = ((k20.x) j1Var).P0();
                        z12 = true;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList.add(P0);
                }
                if (z11) {
                    k0 j11 = k20.v.j(kotlin.jvm.internal.s.p("Intersection of error types: ", types));
                    kotlin.jvm.internal.s.f(j11, "createErrorType(\"Interse… of error types: $types\")");
                    return j11;
                } else if (!z12) {
                    return x.f35181a.c(arrayList);
                } else {
                    t12 = wz.x.t(types, 10);
                    ArrayList arrayList2 = new ArrayList(t12);
                    for (j1 j1Var2 : types) {
                        arrayList2.add(a0.d(j1Var2));
                    }
                    x xVar = x.f35181a;
                    return e0.d(xVar.c(arrayList), xVar.c(arrayList2));
                }
            }
            return (j1) wz.u.C0(types);
        }
        throw new IllegalStateException("Expected some types".toString());
    }
}