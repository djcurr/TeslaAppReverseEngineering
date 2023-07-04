package g20;

import g20.y;
import i20.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import k20.d0;
import k20.y0;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import p10.v;
import r10.b;
import r10.h;
import w00.i0;
import w00.l0;
import w00.n0;
import w00.r0;
import w00.s0;
import w00.v0;
import wz.e0;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final l f27445a;

    /* renamed from: b  reason: collision with root package name */
    private final g20.e f27446b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.o f27449b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g20.b f27450c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.reflect.jvm.internal.impl.protobuf.o oVar, g20.b bVar) {
            super(0);
            this.f27449b = oVar;
            this.f27450c = bVar;
        }

        @Override // h00.a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> mo11invoke() {
            List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> O0;
            List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> i11;
            v vVar = v.this;
            y c11 = vVar.c(vVar.f27445a.e());
            if (c11 == null) {
                O0 = null;
            } else {
                v vVar2 = v.this;
                O0 = e0.O0(vVar2.f27445a.c().d().g(c11, this.f27449b, this.f27450c));
            }
            if (O0 != null) {
                return O0;
            }
            i11 = wz.w.i();
            return i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f27452b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p10.n f27453c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z11, p10.n nVar) {
            super(0);
            this.f27452b = z11;
            this.f27453c = nVar;
        }

        @Override // h00.a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> mo11invoke() {
            List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> O0;
            List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> i11;
            v vVar = v.this;
            y c11 = vVar.c(vVar.f27445a.e());
            if (c11 == null) {
                O0 = null;
            } else {
                boolean z11 = this.f27452b;
                v vVar2 = v.this;
                p10.n nVar = this.f27453c;
                O0 = z11 ? e0.O0(vVar2.f27445a.c().d().j(c11, nVar)) : e0.O0(vVar2.f27445a.c().d().a(c11, nVar));
            }
            if (O0 != null) {
                return O0;
            }
            i11 = wz.w.i();
            return i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.o f27455b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g20.b f27456c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(kotlin.reflect.jvm.internal.impl.protobuf.o oVar, g20.b bVar) {
            super(0);
            this.f27455b = oVar;
            this.f27456c = bVar;
        }

        @Override // h00.a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> mo11invoke() {
            List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> c11;
            List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> i11;
            v vVar = v.this;
            y c12 = vVar.c(vVar.f27445a.e());
            if (c12 == null) {
                c11 = null;
            } else {
                v vVar2 = v.this;
                c11 = vVar2.f27445a.c().d().c(c12, this.f27455b, this.f27456c);
            }
            if (c11 != null) {
                return c11;
            }
            i11 = wz.w.i();
            return i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.a<y10.g<?>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p10.n f27458b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i20.j f27459c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p10.n nVar, i20.j jVar) {
            super(0);
            this.f27458b = nVar;
            this.f27459c = jVar;
        }

        @Override // h00.a
        /* renamed from: a */
        public final y10.g<?> mo11invoke() {
            v vVar = v.this;
            y c11 = vVar.c(vVar.f27445a.e());
            kotlin.jvm.internal.s.e(c11);
            g20.c<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, y10.g<?>> d11 = v.this.f27445a.c().d();
            p10.n nVar = this.f27458b;
            d0 returnType = this.f27459c.getReturnType();
            kotlin.jvm.internal.s.f(returnType, "property.returnType");
            return d11.f(c11, nVar, returnType);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ y f27461b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.o f27462c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g20.b f27463d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f27464e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p10.u f27465f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(y yVar, kotlin.reflect.jvm.internal.impl.protobuf.o oVar, g20.b bVar, int i11, p10.u uVar) {
            super(0);
            this.f27461b = yVar;
            this.f27462c = oVar;
            this.f27463d = bVar;
            this.f27464e = i11;
            this.f27465f = uVar;
        }

        @Override // h00.a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> mo11invoke() {
            List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> O0;
            O0 = e0.O0(v.this.f27445a.c().d().d(this.f27461b, this.f27462c, this.f27463d, this.f27464e, this.f27465f));
            return O0;
        }
    }

    public v(l c11) {
        kotlin.jvm.internal.s.g(c11, "c");
        this.f27445a = c11;
        this.f27446b = new g20.e(c11.c().p(), c11.c().q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y c(w00.i iVar) {
        if (iVar instanceof w00.a0) {
            return new y.b(((w00.a0) iVar).e(), this.f27445a.g(), this.f27445a.j(), this.f27445a.d());
        }
        if (iVar instanceof i20.d) {
            return ((i20.d) iVar).Z0();
        }
        return null;
    }

    private final g.a d(i20.g gVar, c0 c0Var) {
        if (s(gVar)) {
            g(c0Var);
            if (c0Var.j()) {
                return g.a.INCOMPATIBLE;
            }
            return g.a.COMPATIBLE;
        }
        return g.a.COMPATIBLE;
    }

    private final g.a e(i20.b bVar, l0 l0Var, Collection<? extends v0> collection, Collection<? extends s0> collection2, d0 d0Var, boolean z11) {
        int t11;
        List m11;
        List<d0> y02;
        boolean z12;
        boolean z13;
        int t12;
        g.a aVar;
        g.a aVar2;
        boolean z14;
        if (s(bVar) && !kotlin.jvm.internal.s.c(a20.a.e(bVar), b0.f27360a)) {
            t11 = wz.x.t(collection, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (v0 v0Var : collection) {
                arrayList.add(v0Var.getType());
            }
            m11 = wz.w.m(l0Var == null ? null : l0Var.getType());
            y02 = e0.y0(arrayList, m11);
            if (d0Var != null && f(d0Var)) {
                return g.a.INCOMPATIBLE;
            }
            if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                for (s0 s0Var : collection2) {
                    List<d0> upperBounds = s0Var.getUpperBounds();
                    kotlin.jvm.internal.s.f(upperBounds, "typeParameter.upperBounds");
                    if (!(upperBounds instanceof Collection) || !upperBounds.isEmpty()) {
                        for (d0 it2 : upperBounds) {
                            kotlin.jvm.internal.s.f(it2, "it");
                            if (f(it2)) {
                                z12 = true;
                                continue;
                                break;
                            }
                        }
                    }
                    z12 = false;
                    continue;
                    if (z12) {
                        z13 = true;
                        break;
                    }
                }
            }
            z13 = false;
            if (z13) {
                return g.a.INCOMPATIBLE;
            }
            t12 = wz.x.t(y02, 10);
            ArrayList arrayList2 = new ArrayList(t12);
            for (d0 type : y02) {
                kotlin.jvm.internal.s.f(type, "type");
                if (t00.g.o(type) && type.G0().size() <= 3) {
                    List<y0> G0 = type.G0();
                    if (!(G0 instanceof Collection) || !G0.isEmpty()) {
                        for (y0 y0Var : G0) {
                            d0 type2 = y0Var.getType();
                            kotlin.jvm.internal.s.f(type2, "it.type");
                            if (f(type2)) {
                                z14 = true;
                                break;
                            }
                        }
                    }
                    z14 = false;
                    if (z14) {
                        aVar2 = g.a.INCOMPATIBLE;
                    } else {
                        aVar2 = g.a.NEEDS_WRAPPER;
                    }
                } else {
                    aVar2 = f(type) ? g.a.INCOMPATIBLE : g.a.COMPATIBLE;
                }
                arrayList2.add(aVar2);
            }
            g.a aVar3 = (g.a) wz.u.r0(arrayList2);
            if (aVar3 == null) {
                aVar3 = g.a.COMPATIBLE;
            }
            if (z11) {
                aVar = g.a.NEEDS_WRAPPER;
            } else {
                aVar = g.a.COMPATIBLE;
            }
            return (g.a) yz.a.d(aVar, aVar3);
        }
        return g.a.COMPATIBLE;
    }

    private final boolean f(d0 d0Var) {
        return n20.a.b(d0Var, new kotlin.jvm.internal.e0() { // from class: g20.v.a
            @Override // n00.o
            public Object get(Object obj) {
                return Boolean.valueOf(t00.g.o((d0) obj));
            }

            @Override // kotlin.jvm.internal.f, n00.c
            public String getName() {
                return "isSuspendFunctionType";
            }

            @Override // kotlin.jvm.internal.f
            public n00.g getOwner() {
                return m0.d(t00.g.class, "deserialization");
            }

            @Override // kotlin.jvm.internal.f
            public String getSignature() {
                return "isSuspendFunctionType(Lorg/jetbrains/kotlin/types/KotlinType;)Z";
            }
        });
    }

    private final void g(c0 c0Var) {
        for (s0 s0Var : c0Var.k()) {
            s0Var.getUpperBounds();
        }
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g h(kotlin.reflect.jvm.internal.impl.protobuf.o oVar, int i11, g20.b bVar) {
        if (!r10.b.f49032c.d(i11).booleanValue()) {
            return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b();
        }
        return new i20.n(this.f27445a.h(), new b(oVar, bVar));
    }

    private final l0 i() {
        w00.i e11 = this.f27445a.e();
        w00.c cVar = e11 instanceof w00.c ? (w00.c) e11 : null;
        if (cVar == null) {
            return null;
        }
        return cVar.E0();
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g j(p10.n nVar, boolean z11) {
        if (!r10.b.f49032c.d(nVar.N()).booleanValue()) {
            return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b();
        }
        return new i20.n(this.f27445a.h(), new c(z11, nVar));
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g k(kotlin.reflect.jvm.internal.impl.protobuf.o oVar, g20.b bVar) {
        return new i20.a(this.f27445a.h(), new d(oVar, bVar));
    }

    private final void l(i20.k kVar, l0 l0Var, l0 l0Var2, List<? extends s0> list, List<? extends v0> list2, d0 d0Var, kotlin.reflect.jvm.internal.impl.descriptors.f fVar, w00.q qVar, Map<? extends a.InterfaceC0649a<?>, ?> map, boolean z11) {
        kVar.n1(l0Var, l0Var2, list, list2, d0Var, fVar, qVar, map, e(kVar, l0Var, list2, list, d0Var, z11));
    }

    private final int o(int i11) {
        return (i11 & 63) + ((i11 >> 8) << 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<w00.v0> r(java.util.List<p10.u> r26, kotlin.reflect.jvm.internal.impl.protobuf.o r27, g20.b r28) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g20.v.r(java.util.List, kotlin.reflect.jvm.internal.impl.protobuf.o, g20.b):java.util.List");
    }

    private final boolean s(i20.g gVar) {
        boolean z11;
        boolean z12;
        if (this.f27445a.c().g().g()) {
            List<r10.h> D0 = gVar.D0();
            if (!(D0 instanceof Collection) || !D0.isEmpty()) {
                for (r10.h hVar : D0) {
                    if (kotlin.jvm.internal.s.c(hVar.b(), new h.b(1, 3, 0, 4, null)) && hVar.a() == v.d.LANGUAGE_VERSION) {
                        z11 = true;
                        continue;
                    } else {
                        z11 = false;
                        continue;
                    }
                    if (z11) {
                        z12 = false;
                        break;
                    }
                }
            }
            z12 = true;
            return z12;
        }
        return false;
    }

    public final w00.b m(p10.d proto, boolean z11) {
        List i11;
        l U0;
        c0 i12;
        i20.c cVar;
        g.a e11;
        kotlin.jvm.internal.s.g(proto, "proto");
        w00.c cVar2 = (w00.c) this.f27445a.e();
        int E = proto.E();
        g20.b bVar = g20.b.FUNCTION;
        i20.c cVar3 = new i20.c(cVar2, null, h(proto, E, bVar), z11, b.a.DECLARATION, proto, this.f27445a.g(), this.f27445a.j(), this.f27445a.k(), this.f27445a.d(), null, 1024, null);
        l lVar = this.f27445a;
        i11 = wz.w.i();
        v f11 = l.b(lVar, cVar3, i11, null, null, null, null, 60, null).f();
        List<p10.u> H = proto.H();
        kotlin.jvm.internal.s.f(H, "proto.valueParameterList");
        cVar3.l1(f11.r(H, proto, bVar), a0.a(z.f27479a, r10.b.f49033d.d(proto.E())));
        cVar3.c1(cVar2.n());
        boolean z12 = true;
        cVar3.U0(!r10.b.f49043n.d(proto.E()).booleanValue());
        w00.i e12 = this.f27445a.e();
        i20.d dVar = e12 instanceof i20.d ? (i20.d) e12 : null;
        if (!((dVar == null || (U0 = dVar.U0()) == null || (i12 = U0.i()) == null || !i12.j()) ? false : true) || !s(cVar3)) {
            z12 = false;
        }
        if (z12) {
            e11 = g.a.INCOMPATIBLE;
            cVar = cVar3;
        } else {
            Collection<? extends v0> h11 = cVar3.h();
            kotlin.jvm.internal.s.f(h11, "descriptor.valueParameters");
            Collection<? extends s0> typeParameters = cVar3.getTypeParameters();
            kotlin.jvm.internal.s.f(typeParameters, "descriptor.typeParameters");
            cVar = cVar3;
            e11 = e(cVar3, null, h11, typeParameters, cVar3.getReturnType(), false);
        }
        cVar.q1(e11);
        return cVar;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.h n(p10.i proto) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b11;
        r10.i k11;
        Map<? extends a.InterfaceC0649a<?>, ?> i11;
        d0 q11;
        kotlin.jvm.internal.s.g(proto, "proto");
        int P = proto.f0() ? proto.P() : o(proto.R());
        g20.b bVar = g20.b.FUNCTION;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g h11 = h(proto, P, bVar);
        if (r10.f.d(proto)) {
            b11 = k(proto, bVar);
        } else {
            b11 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b();
        }
        if (kotlin.jvm.internal.s.c(a20.a.i(this.f27445a.e()).c(w.b(this.f27445a.g(), proto.Q())), b0.f27360a)) {
            k11 = r10.i.f49075b.b();
        } else {
            k11 = this.f27445a.k();
        }
        r10.i iVar = k11;
        w00.i e11 = this.f27445a.e();
        u10.f b12 = w.b(this.f27445a.g(), proto.Q());
        z zVar = z.f27479a;
        i20.k kVar = new i20.k(e11, null, h11, b12, a0.b(zVar, r10.b.f49044o.d(P)), proto, this.f27445a.g(), this.f27445a.j(), iVar, this.f27445a.d(), null, 1024, null);
        l lVar = this.f27445a;
        List<p10.s> Y = proto.Y();
        kotlin.jvm.internal.s.f(Y, "proto.typeParameterList");
        l b13 = l.b(lVar, kVar, Y, null, null, null, null, 60, null);
        p10.q h12 = r10.f.h(proto, this.f27445a.j());
        l0 l0Var = null;
        if (h12 != null && (q11 = b13.i().q(h12)) != null) {
            l0Var = w10.c.f(kVar, q11, b11);
        }
        l0 i12 = i();
        List<s0> k12 = b13.i().k();
        v f11 = b13.f();
        List<p10.u> c02 = proto.c0();
        kotlin.jvm.internal.s.f(c02, "proto.valueParameterList");
        List<v0> r11 = f11.r(c02, proto, bVar);
        d0 q12 = b13.i().q(r10.f.j(proto, this.f27445a.j()));
        kotlin.reflect.jvm.internal.impl.descriptors.f b14 = zVar.b(r10.b.f49034e.d(P));
        w00.q a11 = a0.a(zVar, r10.b.f49033d.d(P));
        i11 = wz.s0.i();
        b.C1069b c1069b = r10.b.f49050u;
        Boolean d11 = c1069b.d(P);
        kotlin.jvm.internal.s.f(d11, "IS_SUSPEND.get(flags)");
        l(kVar, l0Var, i12, k12, r11, q12, b14, a11, i11, d11.booleanValue());
        Boolean d12 = r10.b.f49045p.d(P);
        kotlin.jvm.internal.s.f(d12, "IS_OPERATOR.get(flags)");
        kVar.b1(d12.booleanValue());
        Boolean d13 = r10.b.f49046q.d(P);
        kotlin.jvm.internal.s.f(d13, "IS_INFIX.get(flags)");
        kVar.Y0(d13.booleanValue());
        Boolean d14 = r10.b.f49049t.d(P);
        kotlin.jvm.internal.s.f(d14, "IS_EXTERNAL_FUNCTION.get(flags)");
        kVar.T0(d14.booleanValue());
        Boolean d15 = r10.b.f49047r.d(P);
        kotlin.jvm.internal.s.f(d15, "IS_INLINE.get(flags)");
        kVar.a1(d15.booleanValue());
        Boolean d16 = r10.b.f49048s.d(P);
        kotlin.jvm.internal.s.f(d16, "IS_TAILREC.get(flags)");
        kVar.e1(d16.booleanValue());
        Boolean d17 = c1069b.d(P);
        kotlin.jvm.internal.s.f(d17, "IS_SUSPEND.get(flags)");
        kVar.d1(d17.booleanValue());
        Boolean d18 = r10.b.f49051v.d(P);
        kotlin.jvm.internal.s.f(d18, "IS_EXPECT_FUNCTION.get(flags)");
        kVar.S0(d18.booleanValue());
        kVar.U0(!r10.b.f49052w.d(P).booleanValue());
        vz.p<a.InterfaceC0649a<?>, Object> a12 = this.f27445a.c().h().a(proto, kVar, this.f27445a.j(), b13.i());
        if (a12 != null) {
            kVar.Q0(a12.c(), a12.d());
        }
        return kVar;
    }

    public final i0 p(p10.n proto) {
        p10.n nVar;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b11;
        d0 q11;
        i20.j jVar;
        l0 f11;
        b.d<p10.k> dVar;
        b.d<p10.x> dVar2;
        y00.d0 d0Var;
        i20.j jVar2;
        p10.n nVar2;
        int i11;
        boolean z11;
        y00.e0 e0Var;
        List i12;
        List<p10.u> d11;
        y00.d0 b12;
        kotlin.jvm.internal.s.g(proto, "proto");
        int N = proto.b0() ? proto.N() : o(proto.Q());
        w00.i e11 = this.f27445a.e();
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g h11 = h(proto, N, g20.b.PROPERTY);
        z zVar = z.f27479a;
        b.d<p10.k> dVar3 = r10.b.f49034e;
        kotlin.reflect.jvm.internal.impl.descriptors.f b13 = zVar.b(dVar3.d(N));
        b.d<p10.x> dVar4 = r10.b.f49033d;
        w00.q a11 = a0.a(zVar, dVar4.d(N));
        Boolean d12 = r10.b.f49053x.d(N);
        kotlin.jvm.internal.s.f(d12, "IS_VAR.get(flags)");
        boolean booleanValue = d12.booleanValue();
        u10.f b14 = w.b(this.f27445a.g(), proto.P());
        b.a b15 = a0.b(zVar, r10.b.f49044o.d(N));
        Boolean d13 = r10.b.B.d(N);
        kotlin.jvm.internal.s.f(d13, "IS_LATEINIT.get(flags)");
        boolean booleanValue2 = d13.booleanValue();
        Boolean d14 = r10.b.A.d(N);
        kotlin.jvm.internal.s.f(d14, "IS_CONST.get(flags)");
        boolean booleanValue3 = d14.booleanValue();
        Boolean d15 = r10.b.D.d(N);
        kotlin.jvm.internal.s.f(d15, "IS_EXTERNAL_PROPERTY.get(flags)");
        boolean booleanValue4 = d15.booleanValue();
        Boolean d16 = r10.b.E.d(N);
        kotlin.jvm.internal.s.f(d16, "IS_DELEGATED.get(flags)");
        boolean booleanValue5 = d16.booleanValue();
        Boolean d17 = r10.b.F.d(N);
        kotlin.jvm.internal.s.f(d17, "IS_EXPECT_PROPERTY.get(flags)");
        z zVar2 = zVar;
        i20.j jVar3 = new i20.j(e11, null, h11, b13, a11, booleanValue, b14, b15, booleanValue2, booleanValue3, booleanValue4, booleanValue5, d17.booleanValue(), proto, this.f27445a.g(), this.f27445a.j(), this.f27445a.k(), this.f27445a.d());
        l lVar = this.f27445a;
        List<p10.s> Z = proto.Z();
        kotlin.jvm.internal.s.f(Z, "proto.typeParameterList");
        l b16 = l.b(lVar, jVar3, Z, null, null, null, null, 60, null);
        Boolean d18 = r10.b.f49054y.d(N);
        kotlin.jvm.internal.s.f(d18, "HAS_GETTER.get(flags)");
        boolean booleanValue6 = d18.booleanValue();
        if (booleanValue6 && r10.f.e(proto)) {
            nVar = proto;
            b11 = k(nVar, g20.b.PROPERTY_GETTER);
        } else {
            nVar = proto;
            b11 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b();
        }
        d0 q12 = b16.i().q(r10.f.k(nVar, this.f27445a.j()));
        List<s0> k11 = b16.i().k();
        l0 i13 = i();
        p10.q i14 = r10.f.i(nVar, this.f27445a.j());
        if (i14 == null || (q11 = b16.i().q(i14)) == null) {
            jVar = jVar3;
            f11 = null;
        } else {
            jVar = jVar3;
            f11 = w10.c.f(jVar, q11, b11);
        }
        jVar.V0(q12, k11, i13, f11);
        Boolean d19 = r10.b.f49032c.d(N);
        kotlin.jvm.internal.s.f(d19, "HAS_ANNOTATIONS.get(flags)");
        int b17 = r10.b.b(d19.booleanValue(), dVar4.d(N), dVar3.d(N), false, false, false);
        if (booleanValue6) {
            int O = proto.c0() ? proto.O() : b17;
            Boolean d21 = r10.b.J.d(O);
            kotlin.jvm.internal.s.f(d21, "IS_NOT_DEFAULT.get(getterFlags)");
            boolean booleanValue7 = d21.booleanValue();
            Boolean d22 = r10.b.K.d(O);
            kotlin.jvm.internal.s.f(d22, "IS_EXTERNAL_ACCESSOR.get(getterFlags)");
            boolean booleanValue8 = d22.booleanValue();
            Boolean d23 = r10.b.L.d(O);
            kotlin.jvm.internal.s.f(d23, "IS_INLINE_ACCESSOR.get(getterFlags)");
            boolean booleanValue9 = d23.booleanValue();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g h12 = h(nVar, O, g20.b.PROPERTY_GETTER);
            if (booleanValue7) {
                zVar2 = zVar2;
                dVar = dVar3;
                dVar2 = dVar4;
                b12 = new y00.d0(jVar, h12, zVar2.b(dVar3.d(O)), a0.a(zVar2, dVar4.d(O)), !booleanValue7, booleanValue8, booleanValue9, jVar.getKind(), null, n0.f55303a);
            } else {
                dVar = dVar3;
                dVar2 = dVar4;
                b12 = w10.c.b(jVar, h12);
                kotlin.jvm.internal.s.f(b12, "{\n                Descri…nnotations)\n            }");
            }
            b12.M0(jVar.getReturnType());
            d0Var = b12;
        } else {
            dVar = dVar3;
            dVar2 = dVar4;
            d0Var = null;
        }
        Boolean d24 = r10.b.f49055z.d(N);
        kotlin.jvm.internal.s.f(d24, "HAS_SETTER.get(flags)");
        if (d24.booleanValue()) {
            if (proto.j0()) {
                b17 = proto.V();
            }
            int i15 = b17;
            Boolean d25 = r10.b.J.d(i15);
            kotlin.jvm.internal.s.f(d25, "IS_NOT_DEFAULT.get(setterFlags)");
            boolean booleanValue10 = d25.booleanValue();
            Boolean d26 = r10.b.K.d(i15);
            kotlin.jvm.internal.s.f(d26, "IS_EXTERNAL_ACCESSOR.get(setterFlags)");
            boolean booleanValue11 = d26.booleanValue();
            Boolean d27 = r10.b.L.d(i15);
            kotlin.jvm.internal.s.f(d27, "IS_INLINE_ACCESSOR.get(setterFlags)");
            boolean booleanValue12 = d27.booleanValue();
            g20.b bVar = g20.b.PROPERTY_SETTER;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g h13 = h(nVar, i15, bVar);
            if (booleanValue10) {
                z zVar3 = zVar2;
                y00.e0 e0Var2 = new y00.e0(jVar, h13, zVar3.b(dVar.d(i15)), a0.a(zVar3, dVar2.d(i15)), !booleanValue10, booleanValue11, booleanValue12, jVar.getKind(), null, n0.f55303a);
                i12 = wz.w.i();
                z11 = true;
                jVar2 = jVar;
                nVar2 = nVar;
                i11 = N;
                v f12 = l.b(b16, e0Var2, i12, null, null, null, null, 60, null).f();
                d11 = wz.v.d(proto.W());
                e0Var2.N0((v0) wz.u.C0(f12.r(d11, nVar2, bVar)));
                e0Var = e0Var2;
            } else {
                jVar2 = jVar;
                nVar2 = nVar;
                i11 = N;
                z11 = true;
                e0Var = w10.c.c(jVar2, h13, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b());
                kotlin.jvm.internal.s.f(e0Var, "{\n                Descri…          )\n            }");
            }
        } else {
            jVar2 = jVar;
            nVar2 = nVar;
            i11 = N;
            z11 = true;
            e0Var = null;
        }
        Boolean d28 = r10.b.C.d(i11);
        kotlin.jvm.internal.s.f(d28, "HAS_CONSTANT.get(flags)");
        if (d28.booleanValue()) {
            jVar2.G0(this.f27445a.h().i(new e(nVar2, jVar2)));
        }
        jVar2.Y0(d0Var, e0Var, new y00.o(j(nVar2, false), jVar2), new y00.o(j(nVar2, z11), jVar2), d(jVar2, b16.i()));
        return jVar2;
    }

    public final r0 q(p10.r proto) {
        int t11;
        kotlin.jvm.internal.s.g(proto, "proto");
        g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1;
        List<p10.b> L = proto.L();
        kotlin.jvm.internal.s.f(L, "proto.annotationList");
        t11 = wz.x.t(L, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (p10.b it2 : L) {
            g20.e eVar = this.f27446b;
            kotlin.jvm.internal.s.f(it2, "it");
            arrayList.add(eVar.a(it2, this.f27445a.g()));
        }
        i20.l lVar = new i20.l(this.f27445a.h(), this.f27445a.e(), aVar.a(arrayList), w.b(this.f27445a.g(), proto.R()), a0.a(z.f27479a, r10.b.f49033d.d(proto.Q())), proto, this.f27445a.g(), this.f27445a.j(), this.f27445a.k(), this.f27445a.d());
        l lVar2 = this.f27445a;
        List<p10.s> U = proto.U();
        kotlin.jvm.internal.s.f(U, "proto.typeParameterList");
        l b11 = l.b(lVar2, lVar, U, null, null, null, null, 60, null);
        lVar.M0(b11.i().k(), b11.i().m(r10.f.o(proto, this.f27445a.j()), false), b11.i().m(r10.f.b(proto, this.f27445a.j()), false), d(lVar, b11.i()));
        return lVar;
    }
}