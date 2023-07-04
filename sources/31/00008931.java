package n10;

import e10.f0;
import java.util.List;
import k20.d0;
import n10.j;
import t00.k;
import w00.l0;
import w00.v0;

/* loaded from: classes5.dex */
public final class t {
    private static final void a(StringBuilder sb2, d0 d0Var) {
        sb2.append(g(d0Var));
    }

    public static final String b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, boolean z11, boolean z12) {
        String b11;
        kotlin.jvm.internal.s.g(eVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z12) {
            if (eVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
                b11 = "<init>";
            } else {
                b11 = eVar.getName().b();
                kotlin.jvm.internal.s.f(b11, "name.asString()");
            }
            sb2.append(b11);
        }
        sb2.append("(");
        l0 N = eVar.N();
        if (N != null) {
            d0 type = N.getType();
            kotlin.jvm.internal.s.f(type, "it.type");
            a(sb2, type);
        }
        for (v0 v0Var : eVar.h()) {
            d0 type2 = v0Var.getType();
            kotlin.jvm.internal.s.f(type2, "parameter.type");
            a(sb2, type2);
        }
        sb2.append(")");
        if (z11) {
            if (c.c(eVar)) {
                sb2.append("V");
            } else {
                d0 returnType = eVar.getReturnType();
                kotlin.jvm.internal.s.e(returnType);
                kotlin.jvm.internal.s.f(returnType, "returnType!!");
                a(sb2, returnType);
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static /* synthetic */ String c(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        return b(eVar, z11, z12);
    }

    public static final String d(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        v vVar = v.f40228a;
        if (w10.d.E(aVar)) {
            return null;
        }
        w00.i b11 = aVar.b();
        w00.c cVar = b11 instanceof w00.c ? (w00.c) b11 : null;
        if (cVar == null || cVar.getName().g()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.a a11 = aVar.a();
        kotlin.reflect.jvm.internal.impl.descriptors.h hVar = a11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.h ? (kotlin.reflect.jvm.internal.impl.descriptors.h) a11 : null;
        if (hVar == null) {
            return null;
        }
        return s.a(vVar, cVar, c(hVar, false, false, 3, null));
    }

    public static final boolean e(kotlin.reflect.jvm.internal.impl.descriptors.a f11) {
        kotlin.reflect.jvm.internal.impl.descriptors.e k11;
        kotlin.jvm.internal.s.g(f11, "f");
        if (f11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) f11;
            if (kotlin.jvm.internal.s.c(eVar.getName().b(), "remove") && eVar.h().size() == 1 && !f0.h((kotlin.reflect.jvm.internal.impl.descriptors.b) f11)) {
                List<v0> h11 = eVar.a().h();
                kotlin.jvm.internal.s.f(h11, "f.original.valueParameters");
                d0 type = ((v0) wz.u.C0(h11)).getType();
                kotlin.jvm.internal.s.f(type, "f.original.valueParameters.single().type");
                j g11 = g(type);
                j.d dVar = g11 instanceof j.d ? (j.d) g11 : null;
                if ((dVar != null ? dVar.i() : null) == b20.e.INT && (k11 = e10.f.k(eVar)) != null) {
                    List<v0> h12 = k11.a().h();
                    kotlin.jvm.internal.s.f(h12, "overridden.original.valueParameters");
                    d0 type2 = ((v0) wz.u.C0(h12)).getType();
                    kotlin.jvm.internal.s.f(type2, "overridden.original.valueParameters.single().type");
                    j g12 = g(type2);
                    w00.i b11 = k11.b();
                    kotlin.jvm.internal.s.f(b11, "overridden.containingDeclaration");
                    return kotlin.jvm.internal.s.c(a20.a.j(b11), k.a.K.j()) && (g12 instanceof j.c) && kotlin.jvm.internal.s.c(((j.c) g12).i(), "java/lang/Object");
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final String f(w00.c cVar) {
        kotlin.jvm.internal.s.g(cVar, "<this>");
        v00.c cVar2 = v00.c.f53787a;
        u10.d j11 = a20.a.i(cVar).j();
        kotlin.jvm.internal.s.f(j11, "fqNameSafe.toUnsafe()");
        u10.b o11 = cVar2.o(j11);
        if (o11 == null) {
            return c.b(cVar, null, 2, null);
        }
        String f11 = b20.d.b(o11).f();
        kotlin.jvm.internal.s.f(f11, "byClassId(it).internalName");
        return f11;
    }

    public static final j g(d0 d0Var) {
        kotlin.jvm.internal.s.g(d0Var, "<this>");
        return (j) c.e(d0Var, l.f40219a, y.f40233m, x.f40230a, null, null, 32, null);
    }
}