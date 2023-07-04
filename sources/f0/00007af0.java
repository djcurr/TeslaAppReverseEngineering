package j10;

import f10.k;
import h10.h;
import h10.l;
import java.util.ArrayList;
import java.util.List;
import k20.a1;
import k20.d0;
import k20.e0;
import k20.g0;
import k20.k0;
import k20.k1;
import k20.w0;
import k20.y0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import l10.a0;
import l10.c0;
import l10.i;
import l10.j;
import l10.x;
import l10.y;
import w00.s0;
import w00.z;
import wz.v;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final h f33084a;

    /* renamed from: b  reason: collision with root package name */
    private final l f33085b;

    /* renamed from: c  reason: collision with root package name */
    private final g f33086c;

    /* renamed from: d  reason: collision with root package name */
    private final e f33087d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends u implements h00.a<d0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s0 f33089b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f33090c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j10.a f33091d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ w0 f33092e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s0 s0Var, j jVar, j10.a aVar, w0 w0Var) {
            super(0);
            this.f33089b = s0Var;
            this.f33090c = jVar;
            this.f33091d = aVar;
            this.f33092e = w0Var;
        }

        @Override // h00.a
        /* renamed from: a */
        public final d0 mo11invoke() {
            g gVar = c.this.f33086c;
            s0 s0Var = this.f33089b;
            boolean t11 = this.f33090c.t();
            j10.a aVar = this.f33091d;
            w00.e n11 = this.f33092e.n();
            d0 c11 = gVar.c(s0Var, t11, aVar.h(n11 == null ? null : n11.n()));
            s.f(c11, "typeParameterUpperBoundE…efaultType)\n            )");
            return c11;
        }
    }

    public c(h c11, l typeParameterResolver) {
        s.g(c11, "c");
        s.g(typeParameterResolver, "typeParameterResolver");
        this.f33084a = c11;
        this.f33085b = typeParameterResolver;
        g gVar = new g(null, 1, null);
        this.f33086c = gVar;
        this.f33087d = new e(gVar);
    }

    private final boolean b(j jVar, w00.c cVar) {
        if (a0.a((x) wz.u.p0(jVar.y()))) {
            List<s0> parameters = v00.d.f53803a.b(cVar).mo234i().getParameters();
            s.f(parameters, "JavaToKotlinClassMapper.…ypeConstructor.parameters");
            s0 s0Var = (s0) wz.u.p0(parameters);
            k1 k11 = s0Var == null ? null : s0Var.k();
            return (k11 == null || k11 == k1.OUT_VARIANCE) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        if ((!r0.isEmpty()) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<k20.y0> c(l10.j r7, j10.a r8, k20.w0 r9) {
        /*
            r6 = this;
            boolean r0 = r7.t()
            r1 = 0
            java.lang.String r2 = "constructor.parameters"
            r3 = 1
            if (r0 != 0) goto L24
            java.util.List r0 = r7.y()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L23
            java.util.List r0 = r9.getParameters()
            kotlin.jvm.internal.s.f(r0, r2)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r3
            if (r0 == 0) goto L23
            goto L24
        L23:
            r3 = r1
        L24:
            java.util.List r0 = r9.getParameters()
            kotlin.jvm.internal.s.f(r0, r2)
            if (r3 == 0) goto L32
            java.util.List r7 = r6.d(r7, r0, r9, r8)
            return r7
        L32:
            int r8 = r0.size()
            java.util.List r9 = r7.y()
            int r9 = r9.size()
            r2 = 10
            if (r8 == r9) goto L75
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = wz.u.t(r0, r2)
            r7.<init>(r8)
            java.util.Iterator r8 = r0.iterator()
        L4f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L70
            java.lang.Object r9 = r8.next()
            w00.s0 r9 = (w00.s0) r9
            k20.a1 r0 = new k20.a1
            u10.f r9 = r9.getName()
            java.lang.String r9 = r9.b()
            k20.k0 r9 = k20.v.j(r9)
            r0.<init>(r9)
            r7.add(r0)
            goto L4f
        L70:
            java.util.List r7 = wz.u.O0(r7)
            return r7
        L75:
            java.util.List r7 = r7.y()
            java.lang.Iterable r7 = wz.u.U0(r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = wz.u.t(r7, r2)
            r8.<init>(r9)
            java.util.Iterator r7 = r7.iterator()
        L8a:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto Lbe
            java.lang.Object r9 = r7.next()
            wz.k0 r9 = (wz.k0) r9
            int r2 = r9.a()
            java.lang.Object r9 = r9.b()
            l10.x r9 = (l10.x) r9
            r0.size()
            java.lang.Object r2 = r0.get(r2)
            w00.s0 r2 = (w00.s0) r2
            f10.k r3 = f10.k.COMMON
            r4 = 3
            r5 = 0
            j10.a r3 = j10.d.d(r3, r1, r5, r4, r5)
            java.lang.String r4 = "parameter"
            kotlin.jvm.internal.s.f(r2, r4)
            k20.y0 r9 = r6.p(r9, r3, r2)
            r8.add(r9)
            goto L8a
        Lbe:
            java.util.List r7 = wz.u.O0(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j10.c.c(l10.j, j10.a, k20.w0):java.util.List");
    }

    private final List<y0> d(j jVar, List<? extends s0> list, w0 w0Var, j10.a aVar) {
        int t11;
        y0 j11;
        t11 = wz.x.t(list, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (s0 s0Var : list) {
            if (n20.a.k(s0Var, null, aVar.f())) {
                j11 = d.b(s0Var, aVar);
            } else {
                j11 = this.f33087d.j(s0Var, jVar.t() ? aVar : aVar.i(b.INFLEXIBLE), new g0(this.f33084a.e(), new a(s0Var, jVar, aVar, w0Var)));
            }
            arrayList.add(j11);
        }
        return arrayList;
    }

    private final k0 e(j jVar, j10.a aVar, k0 k0Var) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g mo140getAnnotations = k0Var == null ? null : k0Var.mo140getAnnotations();
        if (mo140getAnnotations == null) {
            mo140getAnnotations = new h10.e(this.f33084a, jVar, false, 4, null);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar = mo140getAnnotations;
        w0 f11 = f(jVar, aVar);
        if (f11 == null) {
            return null;
        }
        boolean i11 = i(aVar);
        if (s.c(k0Var != null ? k0Var.H0() : null, f11) && !jVar.t() && i11) {
            return k0Var.O0(true);
        }
        return e0.i(gVar, f11, c(jVar, aVar, f11), i11, null, 16, null);
    }

    private final w0 f(j jVar, j10.a aVar) {
        i c11 = jVar.c();
        if (c11 == null) {
            return g(jVar);
        }
        if (c11 instanceof l10.g) {
            l10.g gVar = (l10.g) c11;
            u10.c e11 = gVar.e();
            if (e11 != null) {
                w00.c j11 = j(jVar, aVar, e11);
                if (j11 == null) {
                    j11 = this.f33084a.a().n().a(gVar);
                }
                w0 mo234i = j11 != null ? j11.mo234i() : null;
                return mo234i == null ? g(jVar) : mo234i;
            }
            throw new AssertionError(s.p("Class type should have a FQ name: ", c11));
        } else if (c11 instanceof y) {
            s0 a11 = this.f33085b.a((y) c11);
            if (a11 == null) {
                return null;
            }
            return a11.mo234i();
        } else {
            throw new IllegalStateException(s.p("Unknown classifier kind: ", c11));
        }
    }

    private final w0 g(j jVar) {
        List<Integer> d11;
        u10.b m11 = u10.b.m(new u10.c(jVar.F()));
        s.f(m11, "topLevel(FqName(javaType.classifierQualifiedName))");
        z q11 = this.f33084a.a().b().e().q();
        d11 = v.d(0);
        w0 mo234i = q11.d(m11, d11).mo234i();
        s.f(mo234i, "c.components.deserialize…istOf(0)).typeConstructor");
        return mo234i;
    }

    private final boolean h(k1 k1Var, s0 s0Var) {
        return (s0Var.k() == k1.INVARIANT || k1Var == s0Var.k()) ? false : true;
    }

    private final boolean i(j10.a aVar) {
        return (aVar.d() == b.FLEXIBLE_LOWER_BOUND || aVar.g() || aVar.e() == k.SUPERTYPE) ? false : true;
    }

    private final w00.c j(j jVar, j10.a aVar, u10.c cVar) {
        if (aVar.g() && s.c(cVar, d.a())) {
            return this.f33084a.a().p().c();
        }
        v00.d dVar = v00.d.f53803a;
        w00.c h11 = v00.d.h(dVar, cVar, this.f33084a.d().l(), null, 4, null);
        if (h11 == null) {
            return null;
        }
        return (dVar.f(h11) && (aVar.d() == b.FLEXIBLE_LOWER_BOUND || aVar.e() == k.SUPERTYPE || b(jVar, h11))) ? dVar.b(h11) : h11;
    }

    public static /* synthetic */ d0 l(c cVar, l10.f fVar, j10.a aVar, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return cVar.k(fVar, aVar, z11);
    }

    private final d0 m(j jVar, j10.a aVar) {
        boolean z11 = (aVar.g() || aVar.e() == k.SUPERTYPE) ? false : true;
        boolean t11 = jVar.t();
        if (!t11 && !z11) {
            k0 e11 = e(jVar, aVar, null);
            return e11 == null ? n(jVar) : e11;
        }
        k0 e12 = e(jVar, aVar.i(b.FLEXIBLE_LOWER_BOUND), null);
        if (e12 == null) {
            return n(jVar);
        }
        k0 e13 = e(jVar, aVar.i(b.FLEXIBLE_UPPER_BOUND), e12);
        if (e13 == null) {
            return n(jVar);
        }
        if (t11) {
            return new f(e12, e13);
        }
        return e0.d(e12, e13);
    }

    private static final k0 n(j jVar) {
        k0 j11 = k20.v.j(s.p("Unresolved java class ", jVar.D()));
        s.f(j11, "createErrorType(\"Unresol…vaType.presentableText}\")");
        return j11;
    }

    private final y0 p(x xVar, j10.a aVar, s0 s0Var) {
        if (xVar instanceof c0) {
            c0 c0Var = (c0) xVar;
            x mo43x = c0Var.mo43x();
            k1 k1Var = c0Var.L() ? k1.OUT_VARIANCE : k1.IN_VARIANCE;
            if (mo43x != null && !h(k1Var, s0Var)) {
                return n20.a.e(o(mo43x, d.d(k.COMMON, false, null, 3, null)), k1Var, s0Var);
            }
            return d.b(s0Var, aVar);
        }
        return new a1(k1.INVARIANT, o(xVar, aVar));
    }

    public final d0 k(l10.f arrayType, j10.a attr, boolean z11) {
        List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> w02;
        s.g(arrayType, "arrayType");
        s.g(attr, "attr");
        x mo31o = arrayType.mo31o();
        l10.v vVar = mo31o instanceof l10.v ? (l10.v) mo31o : null;
        t00.i type = vVar == null ? null : vVar.getType();
        h10.e eVar = new h10.e(this.f33084a, arrayType, true);
        if (type != null) {
            k0 O = this.f33084a.d().l().O(type);
            s.f(O, "c.module.builtIns.getPri…KotlinType(primitiveType)");
            g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1;
            w02 = wz.e0.w0(eVar, O.mo140getAnnotations());
            O.P0(aVar.a(w02));
            return attr.g() ? O : e0.d(O, O.O0(true));
        }
        d0 o11 = o(mo31o, d.d(k.COMMON, attr.g(), null, 2, null));
        if (attr.g()) {
            k0 m11 = this.f33084a.d().l().m(z11 ? k1.OUT_VARIANCE : k1.INVARIANT, o11, eVar);
            s.f(m11, "c.module.builtIns.getArr…mponentType, annotations)");
            return m11;
        }
        k0 m12 = this.f33084a.d().l().m(k1.INVARIANT, o11, eVar);
        s.f(m12, "c.module.builtIns.getArr…mponentType, annotations)");
        return e0.d(m12, this.f33084a.d().l().m(k1.OUT_VARIANCE, o11, eVar).O0(true));
    }

    public final d0 o(x xVar, j10.a attr) {
        k0 Z;
        s.g(attr, "attr");
        if (xVar instanceof l10.v) {
            t00.i type = ((l10.v) xVar).getType();
            if (type != null) {
                Z = this.f33084a.d().l().R(type);
            } else {
                Z = this.f33084a.d().l().Z();
            }
            s.f(Z, "{\n                val pr…ns.unitType\n            }");
            return Z;
        } else if (xVar instanceof j) {
            return m((j) xVar, attr);
        } else {
            if (xVar instanceof l10.f) {
                return l(this, (l10.f) xVar, attr, false, 4, null);
            }
            if (!(xVar instanceof c0)) {
                if (xVar == null) {
                    k0 y11 = this.f33084a.d().l().y();
                    s.f(y11, "c.module.builtIns.defaultBound");
                    return y11;
                }
                throw new UnsupportedOperationException(s.p("Unsupported type: ", xVar));
            }
            x mo43x = ((c0) xVar).mo43x();
            d0 o11 = mo43x == null ? null : o(mo43x, attr);
            if (o11 == null) {
                k0 y12 = this.f33084a.d().l().y();
                s.f(y12, "c.module.builtIns.defaultBound");
                return y12;
            }
            return o11;
        }
    }
}