package b20;

import java.util.Collection;
import java.util.List;
import k20.d0;
import kotlin.jvm.internal.s;
import t00.k;
import w00.i;
import w00.p;
import w00.s0;
import w00.v0;

/* loaded from: classes5.dex */
public final class b {
    private static final boolean a(w00.c cVar) {
        return s.c(a20.a.i(cVar), k.f51313h);
    }

    public static final boolean b(d0 d0Var) {
        s.g(d0Var, "<this>");
        w00.e n11 = d0Var.H0().n();
        return n11 != null && c(n11);
    }

    public static final boolean c(i iVar) {
        s.g(iVar, "<this>");
        return w10.f.b(iVar) && !a((w00.c) iVar);
    }

    private static final boolean d(d0 d0Var) {
        w00.e n11 = d0Var.H0().n();
        s0 s0Var = n11 instanceof s0 ? (s0) n11 : null;
        if (s0Var == null) {
            return false;
        }
        return e(n20.a.i(s0Var));
    }

    private static final boolean e(d0 d0Var) {
        return b(d0Var) || d(d0Var);
    }

    public static final boolean f(kotlin.reflect.jvm.internal.impl.descriptors.b descriptor) {
        s.g(descriptor, "descriptor");
        w00.b bVar = descriptor instanceof w00.b ? (w00.b) descriptor : null;
        if (bVar == null || p.g(bVar.getVisibility())) {
            return false;
        }
        w00.c Z = bVar.Z();
        s.f(Z, "constructorDescriptor.constructedClass");
        if (w10.f.b(Z) || w10.d.G(bVar.Z())) {
            return false;
        }
        List<v0> h11 = bVar.h();
        s.f(h11, "constructorDescriptor.valueParameters");
        if ((h11 instanceof Collection) && h11.isEmpty()) {
            return false;
        }
        for (v0 v0Var : h11) {
            d0 type = v0Var.getType();
            s.f(type, "it.type");
            if (e(type)) {
                return true;
            }
        }
        return false;
    }
}