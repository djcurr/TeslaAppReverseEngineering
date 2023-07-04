package t00;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k20.d0;
import k20.e0;
import k20.k0;
import k20.y0;
import kotlin.jvm.internal.s;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import t00.k;
import u00.c;
import wz.r0;
import wz.s0;
import wz.u;
import wz.w;
import y10.v;

/* loaded from: classes5.dex */
public final class g {
    public static final k0 a(h builtIns, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, d0 d0Var, List<? extends d0> parameterTypes, List<u10.f> list, d0 returnType, boolean z11) {
        s.g(builtIns, "builtIns");
        s.g(annotations, "annotations");
        s.g(parameterTypes, "parameterTypes");
        s.g(returnType, "returnType");
        List<y0> e11 = e(d0Var, parameterTypes, list, returnType, builtIns);
        int size = parameterTypes.size();
        if (d0Var != null) {
            size++;
        }
        w00.c d11 = d(builtIns, size, z11);
        if (d0Var != null) {
            annotations = q(annotations, builtIns);
        }
        return e0.g(annotations, d11, e11);
    }

    public static /* synthetic */ k0 b(h hVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, d0 d0Var, List list, List list2, d0 d0Var2, boolean z11, int i11, Object obj) {
        if ((i11 & 64) != 0) {
            z11 = false;
        }
        return a(hVar, gVar, d0Var, list, list2, d0Var2, z11);
    }

    public static final u10.f c(d0 d0Var) {
        String b11;
        s.g(d0Var, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c mo169l = d0Var.mo140getAnnotations().mo169l(k.a.f51348r);
        if (mo169l == null) {
            return null;
        }
        Object D0 = u.D0(mo169l.g().values());
        v vVar = D0 instanceof v ? (v) D0 : null;
        if (vVar == null || (b11 = vVar.b()) == null || !u10.f.h(b11)) {
            b11 = null;
        }
        if (b11 == null) {
            return null;
        }
        return u10.f.f(b11);
    }

    public static final w00.c d(h builtIns, int i11, boolean z11) {
        s.g(builtIns, "builtIns");
        w00.c X = z11 ? builtIns.X(i11) : builtIns.C(i11);
        s.f(X, "if (isSuspendFunction) b…tFunction(parameterCount)");
        return X;
    }

    public static final List<y0> e(d0 d0Var, List<? extends d0> parameterTypes, List<u10.f> list, d0 returnType, h builtIns) {
        u10.f fVar;
        Map f11;
        List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> x02;
        s.g(parameterTypes, "parameterTypes");
        s.g(returnType, "returnType");
        s.g(builtIns, "builtIns");
        int i11 = 0;
        ArrayList arrayList = new ArrayList(parameterTypes.size() + (d0Var != null ? 1 : 0) + 1);
        s20.a.a(arrayList, d0Var == null ? null : n20.a.a(d0Var));
        for (Object obj : parameterTypes) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                w.s();
            }
            d0 d0Var2 = (d0) obj;
            if (list == null || (fVar = list.get(i11)) == null || fVar.g()) {
                fVar = null;
            }
            if (fVar != null) {
                u10.c cVar = k.a.f51348r;
                u10.f f12 = u10.f.f("name");
                String b11 = fVar.b();
                s.f(b11, "name.asString()");
                f11 = r0.f(vz.v.a(f12, new v(b11)));
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.j jVar = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.j(builtIns, cVar, f11);
                g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1;
                x02 = wz.e0.x0(d0Var2.mo140getAnnotations(), jVar);
                d0Var2 = n20.a.r(d0Var2, aVar.a(x02));
            }
            arrayList.add(n20.a.a(d0Var2));
            i11 = i12;
        }
        arrayList.add(n20.a.a(returnType));
        return arrayList;
    }

    private static final u00.c f(u10.d dVar) {
        if (!dVar.f() || dVar.e()) {
            return null;
        }
        c.a aVar = u00.c.Companion;
        String b11 = dVar.i().b();
        s.f(b11, "shortName().asString()");
        u10.c e11 = dVar.l().e();
        s.f(e11, "toSafe().parent()");
        return aVar.b(b11, e11);
    }

    public static final u00.c g(w00.i iVar) {
        s.g(iVar, "<this>");
        if ((iVar instanceof w00.c) && h.z0(iVar)) {
            return f(a20.a.j(iVar));
        }
        return null;
    }

    public static final d0 h(d0 d0Var) {
        s.g(d0Var, "<this>");
        m(d0Var);
        if (p(d0Var)) {
            return ((y0) u.b0(d0Var.G0())).getType();
        }
        return null;
    }

    public static final d0 i(d0 d0Var) {
        s.g(d0Var, "<this>");
        m(d0Var);
        d0 type = ((y0) u.n0(d0Var.G0())).getType();
        s.f(type, "arguments.last().type");
        return type;
    }

    public static final List<y0> j(d0 d0Var) {
        s.g(d0Var, "<this>");
        m(d0Var);
        List<y0> G0 = d0Var.G0();
        return G0.subList(k(d0Var) ? 1 : 0, G0.size() - 1);
    }

    public static final boolean k(d0 d0Var) {
        s.g(d0Var, "<this>");
        return m(d0Var) && p(d0Var);
    }

    public static final boolean l(w00.i iVar) {
        s.g(iVar, "<this>");
        u00.c g11 = g(iVar);
        return g11 == u00.c.Function || g11 == u00.c.SuspendFunction;
    }

    public static final boolean m(d0 d0Var) {
        s.g(d0Var, "<this>");
        w00.e n11 = d0Var.H0().n();
        return n11 != null && l(n11);
    }

    public static final boolean n(d0 d0Var) {
        s.g(d0Var, "<this>");
        w00.e n11 = d0Var.H0().n();
        return (n11 == null ? null : g(n11)) == u00.c.Function;
    }

    public static final boolean o(d0 d0Var) {
        s.g(d0Var, "<this>");
        w00.e n11 = d0Var.H0().n();
        return (n11 == null ? null : g(n11)) == u00.c.SuspendFunction;
    }

    private static final boolean p(d0 d0Var) {
        return d0Var.mo140getAnnotations().mo169l(k.a.f51347q) != null;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g q(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, h builtIns) {
        Map i11;
        List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> x02;
        s.g(gVar, "<this>");
        s.g(builtIns, "builtIns");
        u10.c cVar = k.a.f51347q;
        if (gVar.b1(cVar)) {
            return gVar;
        }
        g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1;
        i11 = s0.i();
        x02 = wz.e0.x0(gVar, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.j(builtIns, cVar, i11));
        return aVar.a(x02);
    }
}