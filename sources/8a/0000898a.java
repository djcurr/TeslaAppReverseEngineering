package n20;

import h00.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k20.a1;
import k20.c1;
import k20.d0;
import k20.d1;
import k20.f1;
import k20.h1;
import k20.j1;
import k20.k1;
import k20.p0;
import k20.w0;
import k20.x;
import k20.y0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import t00.h;
import w00.e;
import w00.f;
import w00.r0;
import w00.s0;
import wz.e0;
import wz.k0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: n20.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0790a extends u implements l<j1, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0790a f40420a = new C0790a();

        C0790a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(j1 it2) {
            s.g(it2, "it");
            e n11 = it2.H0().n();
            return Boolean.valueOf(n11 == null ? false : a.n(n11));
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends u implements l<j1, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f40421a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(j1 it2) {
            s.g(it2, "it");
            e n11 = it2.H0().n();
            boolean z11 = false;
            if (n11 != null && ((n11 instanceof r0) || (n11 instanceof s0))) {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    public static final y0 a(d0 d0Var) {
        s.g(d0Var, "<this>");
        return new a1(d0Var);
    }

    public static final boolean b(d0 d0Var, l<? super j1, Boolean> predicate) {
        s.g(d0Var, "<this>");
        s.g(predicate, "predicate");
        return f1.c(d0Var, predicate);
    }

    private static final boolean c(d0 d0Var, w0 w0Var, Set<? extends s0> set) {
        Iterable<k0> U0;
        boolean z11;
        if (s.c(d0Var.H0(), w0Var)) {
            return true;
        }
        e n11 = d0Var.H0().n();
        f fVar = n11 instanceof f ? (f) n11 : null;
        List<s0> o11 = fVar == null ? null : fVar.o();
        U0 = e0.U0(d0Var.G0());
        if (!(U0 instanceof Collection) || !((Collection) U0).isEmpty()) {
            for (k0 k0Var : U0) {
                int a11 = k0Var.a();
                y0 y0Var = (y0) k0Var.b();
                s0 s0Var = o11 == null ? null : (s0) wz.u.e0(o11, a11);
                if (((s0Var == null || set == null || !set.contains(s0Var)) ? false : true) || y0Var.a()) {
                    z11 = false;
                    continue;
                } else {
                    d0 type = y0Var.getType();
                    s.f(type, "argument.type");
                    z11 = c(type, w0Var, set);
                    continue;
                }
                if (z11) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean d(d0 d0Var) {
        s.g(d0Var, "<this>");
        return b(d0Var, C0790a.f40420a);
    }

    public static final y0 e(d0 type, k1 projectionKind, s0 s0Var) {
        s.g(type, "type");
        s.g(projectionKind, "projectionKind");
        if ((s0Var == null ? null : s0Var.k()) == projectionKind) {
            projectionKind = k1.INVARIANT;
        }
        return new a1(projectionKind, type);
    }

    public static final Set<s0> f(d0 d0Var, Set<? extends s0> set) {
        s.g(d0Var, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        g(d0Var, d0Var, linkedHashSet, set);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void g(d0 d0Var, d0 d0Var2, Set<s0> set, Set<? extends s0> set2) {
        boolean T;
        e n11 = d0Var.H0().n();
        if (n11 instanceof s0) {
            if (!s.c(d0Var.H0(), d0Var2.H0())) {
                set.add(n11);
                return;
            }
            for (d0 upperBound : ((s0) n11).getUpperBounds()) {
                s.f(upperBound, "upperBound");
                g(upperBound, d0Var2, set, set2);
            }
            return;
        }
        e n12 = d0Var.H0().n();
        f fVar = n12 instanceof f ? (f) n12 : null;
        List<s0> o11 = fVar == null ? null : fVar.o();
        int i11 = 0;
        for (y0 y0Var : d0Var.G0()) {
            int i12 = i11 + 1;
            s0 s0Var = o11 == null ? null : (s0) wz.u.e0(o11, i11);
            if (!((s0Var == null || set2 == null || !set2.contains(s0Var)) ? false : true) && !y0Var.a()) {
                T = e0.T(set, y0Var.getType().H0().n());
                if (!T && !s.c(y0Var.getType().H0(), d0Var2.H0())) {
                    d0 type = y0Var.getType();
                    s.f(type, "argument.type");
                    g(type, d0Var2, set, set2);
                }
            }
            i11 = i12;
        }
    }

    public static final h h(d0 d0Var) {
        s.g(d0Var, "<this>");
        h l11 = d0Var.H0().l();
        s.f(l11, "constructor.builtIns");
        return l11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
        r3 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051 A[EDGE_INSN: B:22:0x0051->B:18:0x0051 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final k20.d0 i(w00.s0 r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.s.g(r7, r0)
            java.util.List r0 = r7.getUpperBounds()
            java.lang.String r1 = "upperBounds"
            kotlin.jvm.internal.s.f(r0, r1)
            r0.isEmpty()
            java.util.List r0 = r7.getUpperBounds()
            kotlin.jvm.internal.s.f(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L51
            java.lang.Object r2 = r0.next()
            r4 = r2
            k20.d0 r4 = (k20.d0) r4
            k20.w0 r4 = r4.H0()
            w00.e r4 = r4.n()
            boolean r5 = r4 instanceof w00.c
            if (r5 == 0) goto L39
            r3 = r4
            w00.c r3 = (w00.c) r3
        L39:
            r4 = 0
            if (r3 != 0) goto L3d
            goto L4e
        L3d:
            kotlin.reflect.jvm.internal.impl.descriptors.c r5 = r3.getKind()
            kotlin.reflect.jvm.internal.impl.descriptors.c r6 = kotlin.reflect.jvm.internal.impl.descriptors.c.INTERFACE
            if (r5 == r6) goto L4e
            kotlin.reflect.jvm.internal.impl.descriptors.c r3 = r3.getKind()
            kotlin.reflect.jvm.internal.impl.descriptors.c r5 = kotlin.reflect.jvm.internal.impl.descriptors.c.ANNOTATION_CLASS
            if (r3 == r5) goto L4e
            r4 = 1
        L4e:
            if (r4 == 0) goto L1c
            r3 = r2
        L51:
            k20.d0 r3 = (k20.d0) r3
            if (r3 != 0) goto L68
            java.util.List r7 = r7.getUpperBounds()
            kotlin.jvm.internal.s.f(r7, r1)
            java.lang.Object r7 = wz.u.b0(r7)
            java.lang.String r0 = "upperBounds.first()"
            kotlin.jvm.internal.s.f(r7, r0)
            r3 = r7
            k20.d0 r3 = (k20.d0) r3
        L68:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n20.a.i(w00.s0):k20.d0");
    }

    public static final boolean j(s0 typeParameter) {
        s.g(typeParameter, "typeParameter");
        return l(typeParameter, null, null, 6, null);
    }

    public static final boolean k(s0 typeParameter, w0 w0Var, Set<? extends s0> set) {
        boolean z11;
        s.g(typeParameter, "typeParameter");
        List<d0> upperBounds = typeParameter.getUpperBounds();
        s.f(upperBounds, "typeParameter.upperBounds");
        if (!(upperBounds instanceof Collection) || !upperBounds.isEmpty()) {
            for (d0 upperBound : upperBounds) {
                s.f(upperBound, "upperBound");
                if (c(upperBound, typeParameter.n().H0(), set) && (w0Var == null || s.c(upperBound.H0(), w0Var))) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean l(s0 s0Var, w0 w0Var, Set set, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            w0Var = null;
        }
        if ((i11 & 4) != 0) {
            set = null;
        }
        return k(s0Var, w0Var, set);
    }

    public static final boolean m(d0 d0Var, d0 superType) {
        s.g(d0Var, "<this>");
        s.g(superType, "superType");
        return kotlin.reflect.jvm.internal.impl.types.checker.f.f35149a.c(d0Var, superType);
    }

    public static final boolean n(e eVar) {
        s.g(eVar, "<this>");
        return (eVar instanceof s0) && (((s0) eVar).b() instanceof r0);
    }

    public static final boolean o(d0 d0Var) {
        s.g(d0Var, "<this>");
        return f1.n(d0Var);
    }

    public static final d0 p(d0 d0Var) {
        s.g(d0Var, "<this>");
        d0 o11 = f1.o(d0Var);
        s.f(o11, "makeNotNullable(this)");
        return o11;
    }

    public static final d0 q(d0 d0Var) {
        s.g(d0Var, "<this>");
        d0 p11 = f1.p(d0Var);
        s.f(p11, "makeNullable(this)");
        return p11;
    }

    public static final d0 r(d0 d0Var, g newAnnotations) {
        s.g(d0Var, "<this>");
        s.g(newAnnotations, "newAnnotations");
        return (d0Var.getAnnotations().isEmpty() && newAnnotations.isEmpty()) ? d0Var : d0Var.K0().N0(newAnnotations);
    }

    public static final d0 s(d0 d0Var, d1 substitutor, Map<w0, ? extends y0> substitutionMap, k1 variance, Set<? extends s0> set) {
        j1 j1Var;
        int t11;
        int t12;
        int t13;
        s.g(d0Var, "<this>");
        s.g(substitutor, "substitutor");
        s.g(substitutionMap, "substitutionMap");
        s.g(variance, "variance");
        j1 K0 = d0Var.K0();
        if (K0 instanceof x) {
            x xVar = (x) K0;
            k20.k0 P0 = xVar.P0();
            if (!P0.H0().getParameters().isEmpty() && P0.H0().n() != null) {
                List<s0> parameters = P0.H0().getParameters();
                s.f(parameters, "constructor.parameters");
                t13 = wz.x.t(parameters, 10);
                ArrayList arrayList = new ArrayList(t13);
                for (s0 s0Var : parameters) {
                    y0 y0Var = (y0) wz.u.e0(d0Var.G0(), s0Var.getIndex());
                    if ((set != null && set.contains(s0Var)) || y0Var == null || !substitutionMap.containsKey(y0Var.getType().H0())) {
                        y0Var = new p0(s0Var);
                    }
                    arrayList.add(y0Var);
                }
                P0 = c1.f(P0, arrayList, null, 2, null);
            }
            k20.k0 Q0 = xVar.Q0();
            if (!Q0.H0().getParameters().isEmpty() && Q0.H0().n() != null) {
                List<s0> parameters2 = Q0.H0().getParameters();
                s.f(parameters2, "constructor.parameters");
                t12 = wz.x.t(parameters2, 10);
                ArrayList arrayList2 = new ArrayList(t12);
                for (s0 s0Var2 : parameters2) {
                    y0 y0Var2 = (y0) wz.u.e0(d0Var.G0(), s0Var2.getIndex());
                    if ((set != null && set.contains(s0Var2)) || y0Var2 == null || !substitutionMap.containsKey(y0Var2.getType().H0())) {
                        y0Var2 = new p0(s0Var2);
                    }
                    arrayList2.add(y0Var2);
                }
                Q0 = c1.f(Q0, arrayList2, null, 2, null);
            }
            j1Var = k20.e0.d(P0, Q0);
        } else if (K0 instanceof k20.k0) {
            k20.k0 k0Var = (k20.k0) K0;
            if (k0Var.H0().getParameters().isEmpty() || k0Var.H0().n() == null) {
                j1Var = k0Var;
            } else {
                List<s0> parameters3 = k0Var.H0().getParameters();
                s.f(parameters3, "constructor.parameters");
                t11 = wz.x.t(parameters3, 10);
                ArrayList arrayList3 = new ArrayList(t11);
                for (s0 s0Var3 : parameters3) {
                    y0 y0Var3 = (y0) wz.u.e0(d0Var.G0(), s0Var3.getIndex());
                    if ((set != null && set.contains(s0Var3)) || y0Var3 == null || !substitutionMap.containsKey(y0Var3.getType().H0())) {
                        y0Var3 = new p0(s0Var3);
                    }
                    arrayList3.add(y0Var3);
                }
                j1Var = c1.f(k0Var, arrayList3, null, 2, null);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        d0 n11 = substitutor.n(h1.b(j1Var, K0), variance);
        s.f(n11, "replaceArgumentsByParame…ubstitute(it, variance) }");
        return n11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [k20.j1] */
    public static final d0 t(d0 d0Var) {
        int t11;
        k20.k0 k0Var;
        int t12;
        int t13;
        s.g(d0Var, "<this>");
        j1 K0 = d0Var.K0();
        if (K0 instanceof x) {
            x xVar = (x) K0;
            k20.k0 P0 = xVar.P0();
            if (!P0.H0().getParameters().isEmpty() && P0.H0().n() != null) {
                List<s0> parameters = P0.H0().getParameters();
                s.f(parameters, "constructor.parameters");
                t13 = wz.x.t(parameters, 10);
                ArrayList arrayList = new ArrayList(t13);
                for (s0 s0Var : parameters) {
                    arrayList.add(new p0(s0Var));
                }
                P0 = c1.f(P0, arrayList, null, 2, null);
            }
            k20.k0 Q0 = xVar.Q0();
            if (!Q0.H0().getParameters().isEmpty() && Q0.H0().n() != null) {
                List<s0> parameters2 = Q0.H0().getParameters();
                s.f(parameters2, "constructor.parameters");
                t12 = wz.x.t(parameters2, 10);
                ArrayList arrayList2 = new ArrayList(t12);
                for (s0 s0Var2 : parameters2) {
                    arrayList2.add(new p0(s0Var2));
                }
                Q0 = c1.f(Q0, arrayList2, null, 2, null);
            }
            k0Var = k20.e0.d(P0, Q0);
        } else if (K0 instanceof k20.k0) {
            k20.k0 k0Var2 = (k20.k0) K0;
            boolean isEmpty = k0Var2.H0().getParameters().isEmpty();
            k0Var = k0Var2;
            if (!isEmpty) {
                e n11 = k0Var2.H0().n();
                k0Var = k0Var2;
                if (n11 != null) {
                    List<s0> parameters3 = k0Var2.H0().getParameters();
                    s.f(parameters3, "constructor.parameters");
                    t11 = wz.x.t(parameters3, 10);
                    ArrayList arrayList3 = new ArrayList(t11);
                    for (s0 s0Var3 : parameters3) {
                        arrayList3.add(new p0(s0Var3));
                    }
                    k0Var = c1.f(k0Var2, arrayList3, null, 2, null);
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return h1.b(k0Var, K0);
    }

    public static final boolean u(d0 d0Var) {
        s.g(d0Var, "<this>");
        return b(d0Var, b.f40421a);
    }
}