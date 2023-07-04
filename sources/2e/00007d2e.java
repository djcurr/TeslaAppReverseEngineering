package k20;

import d20.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k20.u0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class s0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f34319c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final u0 f34320a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f34321b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(int i11, w00.r0 r0Var) {
            if (i11 > 100) {
                throw new AssertionError(kotlin.jvm.internal.s.p("Too deep recursion while expanding type alias ", r0Var.getName()));
            }
        }
    }

    static {
        new s0(u0.a.f34332a, false);
    }

    public s0(u0 reportStrategy, boolean z11) {
        kotlin.jvm.internal.s.g(reportStrategy, "reportStrategy");
        this.f34320a = reportStrategy;
        this.f34321b = z11;
    }

    private final void a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2) {
        HashSet hashSet = new HashSet();
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> it2 = gVar.iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next().e());
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar : gVar2) {
            if (hashSet.contains(cVar.e())) {
                this.f34320a.d(cVar);
            }
        }
    }

    private final void b(d0 d0Var, d0 d0Var2) {
        d1 f11 = d1.f(d0Var2);
        kotlin.jvm.internal.s.f(f11, "create(substitutedType)");
        int i11 = 0;
        for (Object obj : d0Var2.G0()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                wz.w.s();
            }
            y0 y0Var = (y0) obj;
            if (!y0Var.a()) {
                d0 type = y0Var.getType();
                kotlin.jvm.internal.s.f(type, "substitutedArgument.type");
                if (!n20.a.d(type)) {
                    y0 y0Var2 = d0Var.G0().get(i11);
                    w00.s0 typeParameter = d0Var.H0().getParameters().get(i11);
                    if (this.f34321b) {
                        u0 u0Var = this.f34320a;
                        d0 type2 = y0Var2.getType();
                        kotlin.jvm.internal.s.f(type2, "unsubstitutedArgument.type");
                        d0 type3 = y0Var.getType();
                        kotlin.jvm.internal.s.f(type3, "substitutedArgument.type");
                        kotlin.jvm.internal.s.f(typeParameter, "typeParameter");
                        u0Var.c(f11, type2, type3, typeParameter);
                    }
                }
            }
            i11 = i12;
        }
    }

    private final s c(s sVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        return sVar.N0(h(sVar, gVar));
    }

    private final k0 d(k0 k0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        return f0.a(k0Var) ? k0Var : c1.f(k0Var, null, h(k0Var, gVar), 1, null);
    }

    private final k0 e(k0 k0Var, d0 d0Var) {
        k0 s11 = f1.s(k0Var, d0Var.I0());
        kotlin.jvm.internal.s.f(s11, "makeNullableIfNeeded(thi…romType.isMarkedNullable)");
        return s11;
    }

    private final k0 f(k0 k0Var, d0 d0Var) {
        return d(e(k0Var, d0Var), d0Var.mo140getAnnotations());
    }

    private final k0 g(t0 t0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z11) {
        w0 mo234i = t0Var.b().mo234i();
        kotlin.jvm.internal.s.f(mo234i, "descriptor.typeConstructor");
        return e0.j(gVar, mo234i, t0Var.a(), z11, h.b.f23482b);
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g h(d0 d0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        return f0.a(d0Var) ? d0Var.mo140getAnnotations() : kotlin.reflect.jvm.internal.impl.descriptors.annotations.i.a(gVar, d0Var.mo140getAnnotations());
    }

    private final y0 j(y0 y0Var, t0 t0Var, int i11) {
        int t11;
        j1 K0 = y0Var.getType().K0();
        if (t.a(K0)) {
            return y0Var;
        }
        k0 a11 = c1.a(K0);
        if (f0.a(a11) || !n20.a.u(a11)) {
            return y0Var;
        }
        w0 H0 = a11.H0();
        w00.e n11 = H0.n();
        H0.getParameters().size();
        a11.G0().size();
        if (n11 instanceof w00.s0) {
            return y0Var;
        }
        if (n11 instanceof w00.r0) {
            w00.r0 r0Var = (w00.r0) n11;
            if (t0Var.d(r0Var)) {
                this.f34320a.b(r0Var);
                return new a1(k1.INVARIANT, v.j(kotlin.jvm.internal.s.p("Recursive type alias: ", r0Var.getName())));
            }
            List<y0> G0 = a11.G0();
            t11 = wz.x.t(G0, 10);
            ArrayList arrayList = new ArrayList(t11);
            int i12 = 0;
            for (Object obj : G0) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    wz.w.s();
                }
                arrayList.add(l((y0) obj, t0Var, H0.getParameters().get(i12), i11 + 1));
                i12 = i13;
            }
            k0 k11 = k(t0.f34322e.a(t0Var, r0Var, arrayList), a11.mo140getAnnotations(), a11.I0(), i11 + 1, false);
            k0 m11 = m(a11, t0Var, i11);
            if (!t.a(k11)) {
                k11 = n0.j(k11, m11);
            }
            return new a1(y0Var.b(), k11);
        }
        k0 m12 = m(a11, t0Var, i11);
        b(a11, m12);
        return new a1(y0Var.b(), m12);
    }

    private final k0 k(t0 t0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z11, int i11, boolean z12) {
        y0 l11 = l(new a1(k1.INVARIANT, t0Var.b().o0()), t0Var, null, i11);
        d0 type = l11.getType();
        kotlin.jvm.internal.s.f(type, "expandedProjection.type");
        k0 a11 = c1.a(type);
        if (f0.a(a11)) {
            return a11;
        }
        l11.b();
        a(a11.mo140getAnnotations(), gVar);
        k0 s11 = f1.s(d(a11, gVar), z11);
        kotlin.jvm.internal.s.f(s11, "expandedType.combineAnno…fNeeded(it, isNullable) }");
        return z12 ? n0.j(s11, g(t0Var, gVar, z11)) : s11;
    }

    private final y0 l(y0 y0Var, t0 t0Var, w00.s0 s0Var, int i11) {
        d0 f11;
        k1 k1Var;
        k1 k1Var2;
        f34319c.b(i11, t0Var.b());
        if (y0Var.a()) {
            kotlin.jvm.internal.s.e(s0Var);
            y0 t11 = f1.t(s0Var);
            kotlin.jvm.internal.s.f(t11, "makeStarProjection(typeParameterDescriptor!!)");
            return t11;
        }
        d0 type = y0Var.getType();
        kotlin.jvm.internal.s.f(type, "underlyingProjection.type");
        y0 c11 = t0Var.c(type.H0());
        if (c11 == null) {
            return j(y0Var, t0Var, i11);
        }
        if (c11.a()) {
            kotlin.jvm.internal.s.e(s0Var);
            y0 t12 = f1.t(s0Var);
            kotlin.jvm.internal.s.f(t12, "makeStarProjection(typeParameterDescriptor!!)");
            return t12;
        }
        j1 K0 = c11.getType().K0();
        k1 b11 = c11.b();
        kotlin.jvm.internal.s.f(b11, "argument.projectionKind");
        k1 b12 = y0Var.b();
        kotlin.jvm.internal.s.f(b12, "underlyingProjection.projectionKind");
        if (b12 != b11 && b12 != (k1Var2 = k1.INVARIANT)) {
            if (b11 == k1Var2) {
                b11 = b12;
            } else {
                this.f34320a.a(t0Var.b(), s0Var, K0);
            }
        }
        k1 k11 = s0Var == null ? null : s0Var.k();
        if (k11 == null) {
            k11 = k1.INVARIANT;
        }
        kotlin.jvm.internal.s.f(k11, "typeParameterDescriptor?…nce ?: Variance.INVARIANT");
        if (k11 != b11 && k11 != (k1Var = k1.INVARIANT)) {
            if (b11 == k1Var) {
                b11 = k1Var;
            } else {
                this.f34320a.a(t0Var.b(), s0Var, K0);
            }
        }
        a(type.mo140getAnnotations(), K0.mo140getAnnotations());
        if (K0 instanceof s) {
            f11 = c((s) K0, type.mo140getAnnotations());
        } else {
            f11 = f(c1.a(K0), type);
        }
        return new a1(b11, f11);
    }

    private final k0 m(k0 k0Var, t0 t0Var, int i11) {
        int t11;
        w0 H0 = k0Var.H0();
        List<y0> G0 = k0Var.G0();
        t11 = wz.x.t(G0, 10);
        ArrayList arrayList = new ArrayList(t11);
        int i12 = 0;
        for (Object obj : G0) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                wz.w.s();
            }
            y0 y0Var = (y0) obj;
            y0 l11 = l(y0Var, t0Var, H0.getParameters().get(i12), i11 + 1);
            if (!l11.a()) {
                l11 = new a1(l11.b(), f1.r(l11.getType(), y0Var.getType().I0()));
            }
            arrayList.add(l11);
            i12 = i13;
        }
        return c1.f(k0Var, arrayList, null, 2, null);
    }

    public final k0 i(t0 typeAliasExpansion, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations) {
        kotlin.jvm.internal.s.g(typeAliasExpansion, "typeAliasExpansion");
        kotlin.jvm.internal.s.g(annotations, "annotations");
        return k(typeAliasExpansion, annotations, false, 0, true);
    }
}