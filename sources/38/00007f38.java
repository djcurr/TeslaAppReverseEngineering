package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k20.d0;
import k20.d1;
import k20.j1;
import k20.k0;
import k20.k1;
import k20.x0;
import k20.y0;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import w00.s0;
import wz.e0;

/* loaded from: classes5.dex */
public final class l {
    private static final List<y0> a(j1 j1Var, m20.b bVar) {
        boolean z11;
        List<vz.p> V0;
        int t11;
        if (j1Var.G0().size() != j1Var.H0().getParameters().size()) {
            return null;
        }
        List<y0> G0 = j1Var.G0();
        int i11 = 0;
        boolean z12 = true;
        if (!(G0 instanceof Collection) || !G0.isEmpty()) {
            Iterator<T> it2 = G0.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((y0) it2.next()).b() == k1.INVARIANT) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (!z11) {
                    z12 = false;
                    break;
                }
            }
        }
        if (z12) {
            return null;
        }
        List<s0> parameters = j1Var.H0().getParameters();
        kotlin.jvm.internal.s.f(parameters, "type.constructor.parameters");
        V0 = e0.V0(G0, parameters);
        t11 = wz.x.t(V0, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (vz.p pVar : V0) {
            y0 y0Var = (y0) pVar.a();
            s0 parameter = (s0) pVar.b();
            if (y0Var.b() != k1.INVARIANT) {
                j1 K0 = (y0Var.a() || y0Var.b() != k1.IN_VARIANCE) ? null : y0Var.getType().K0();
                kotlin.jvm.internal.s.f(parameter, "parameter");
                y0Var = n20.a.a(new j(bVar, K0, y0Var, parameter));
            }
            arrayList.add(y0Var);
        }
        d1 c11 = x0.f34347b.b(j1Var.H0(), arrayList).c();
        int size = G0.size() - 1;
        if (size >= 0) {
            while (true) {
                int i12 = i11 + 1;
                y0 y0Var2 = G0.get(i11);
                y0 y0Var3 = (y0) arrayList.get(i11);
                if (y0Var2.b() != k1.INVARIANT) {
                    List<d0> upperBounds = j1Var.H0().getParameters().get(i11).getUpperBounds();
                    kotlin.jvm.internal.s.f(upperBounds, "type.constructor.parameters[index].upperBounds");
                    ArrayList arrayList2 = new ArrayList();
                    for (d0 d0Var : upperBounds) {
                        arrayList2.add(g.a.f35150a.a(c11.n(d0Var, k1.INVARIANT).K0()));
                    }
                    if (!y0Var2.a() && y0Var2.b() == k1.OUT_VARIANCE) {
                        arrayList2.add(g.a.f35150a.a(y0Var2.getType().K0()));
                    }
                    ((j) y0Var3.getType()).H0().e(arrayList2);
                }
                if (i12 > size) {
                    break;
                }
                i11 = i12;
            }
        }
        return arrayList;
    }

    public static final k0 b(k0 type, m20.b status) {
        kotlin.jvm.internal.s.g(type, "type");
        kotlin.jvm.internal.s.g(status, "status");
        List<y0> a11 = a(type, status);
        if (a11 == null) {
            return null;
        }
        return c(type, a11);
    }

    private static final k0 c(j1 j1Var, List<? extends y0> list) {
        return k20.e0.i(j1Var.mo140getAnnotations(), j1Var.H0(), list, j1Var.I0(), null, 16, null);
    }
}