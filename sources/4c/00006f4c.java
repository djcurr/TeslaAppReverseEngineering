package g20;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k20.a1;
import k20.d0;
import k20.f0;
import k20.k0;
import k20.k1;
import k20.m;
import k20.n0;
import k20.o0;
import k20.p0;
import k20.w0;
import k20.y0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import p10.q;
import w00.r0;
import w00.s0;
import wz.e0;

/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: a */
    private final l f27361a;

    /* renamed from: b */
    private final c0 f27362b;

    /* renamed from: c */
    private final String f27363c;

    /* renamed from: d */
    private final String f27364d;

    /* renamed from: e */
    private boolean f27365e;

    /* renamed from: f */
    private final h00.l<Integer, w00.e> f27366f;

    /* renamed from: g */
    private final h00.l<Integer, w00.e> f27367g;

    /* renamed from: h */
    private final Map<Integer, s0> f27368h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<Integer, w00.e> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(1);
            c0.this = r1;
        }

        public final w00.e a(int i11) {
            return c0.this.d(i11);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ w00.e invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {

        /* renamed from: b */
        final /* synthetic */ p10.q f27371b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p10.q qVar) {
            super(0);
            c0.this = r1;
            this.f27371b = qVar;
        }

        @Override // h00.a
        public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
            return c0.this.f27361a.c().d().i(this.f27371b, c0.this.f27361a.g());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<Integer, w00.e> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(1);
            c0.this = r1;
        }

        public final w00.e a(int i11) {
            return c0.this.f(i11);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ w00.e invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* loaded from: classes5.dex */
    public /* synthetic */ class d extends kotlin.jvm.internal.o implements h00.l<u10.b, u10.b> {

        /* renamed from: a */
        public static final d f27373a = new d();

        d() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: d */
        public final u10.b invoke(u10.b p02) {
            kotlin.jvm.internal.s.g(p02, "p0");
            return p02.g();
        }

        @Override // kotlin.jvm.internal.f, n00.c
        public final String getName() {
            return "getOuterClassId";
        }

        @Override // kotlin.jvm.internal.f
        public final n00.g getOwner() {
            return m0.b(u10.b.class);
        }

        @Override // kotlin.jvm.internal.f
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }
    }

    /* loaded from: classes5.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.l<p10.q, p10.q> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e() {
            super(1);
            c0.this = r1;
        }

        @Override // h00.l
        /* renamed from: a */
        public final p10.q invoke(p10.q it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return r10.f.g(it2, c0.this.f27361a.j());
        }
    }

    /* loaded from: classes5.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.l<p10.q, Integer> {

        /* renamed from: a */
        public static final f f27375a = new f();

        f() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Integer invoke(p10.q it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Integer.valueOf(it2.P());
        }
    }

    public c0(l c11, c0 c0Var, List<p10.s> typeParameterProtos, String debugName, String containerPresentableName, boolean z11) {
        Map<Integer, s0> linkedHashMap;
        kotlin.jvm.internal.s.g(c11, "c");
        kotlin.jvm.internal.s.g(typeParameterProtos, "typeParameterProtos");
        kotlin.jvm.internal.s.g(debugName, "debugName");
        kotlin.jvm.internal.s.g(containerPresentableName, "containerPresentableName");
        this.f27361a = c11;
        this.f27362b = c0Var;
        this.f27363c = debugName;
        this.f27364d = containerPresentableName;
        this.f27365e = z11;
        this.f27366f = c11.h().h(new a());
        this.f27367g = c11.h().h(new c());
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = wz.s0.i();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i11 = 0;
            for (p10.s sVar : typeParameterProtos) {
                linkedHashMap.put(Integer.valueOf(sVar.H()), new i20.m(this.f27361a, sVar, i11));
                i11++;
            }
        }
        this.f27368h = linkedHashMap;
    }

    public final w00.e d(int i11) {
        u10.b a11 = w.a(this.f27361a.g(), i11);
        if (a11.k()) {
            return this.f27361a.c().b(a11);
        }
        return w00.s.b(this.f27361a.c().p(), a11);
    }

    private final k0 e(int i11) {
        if (w.a(this.f27361a.g(), i11).k()) {
            return this.f27361a.c().n().a();
        }
        return null;
    }

    public final w00.e f(int i11) {
        u10.b a11 = w.a(this.f27361a.g(), i11);
        if (a11.k()) {
            return null;
        }
        return w00.s.d(this.f27361a.c().p(), a11);
    }

    private final k0 g(d0 d0Var, d0 d0Var2) {
        List<y0> W;
        int t11;
        t00.h h11 = n20.a.h(d0Var);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = d0Var.getAnnotations();
        d0 h12 = t00.g.h(d0Var);
        W = e0.W(t00.g.j(d0Var), 1);
        t11 = wz.x.t(W, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (y0 y0Var : W) {
            arrayList.add(y0Var.getType());
        }
        return t00.g.a(h11, annotations, h12, arrayList, null, d0Var2, true).O0(d0Var.I0());
    }

    private final k0 h(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, w0 w0Var, List<? extends y0> list, boolean z11) {
        int size;
        int size2 = w0Var.getParameters().size() - list.size();
        k0 k0Var = null;
        if (size2 == 0) {
            k0Var = i(gVar, w0Var, list, z11);
        } else if (size2 == 1 && (size = list.size() - 1) >= 0) {
            w0 i11 = w0Var.l().X(size).i();
            kotlin.jvm.internal.s.f(i11, "functionTypeConstructor.…on(arity).typeConstructor");
            k0Var = k20.e0.i(gVar, i11, list, z11, null, 16, null);
        }
        if (k0Var == null) {
            k0 n11 = k20.v.n(kotlin.jvm.internal.s.p("Bad suspend function in metadata with constructor: ", w0Var), list);
            kotlin.jvm.internal.s.f(n11, "createErrorTypeWithArgum…      arguments\n        )");
            return n11;
        }
        return k0Var;
    }

    private final k0 i(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, w0 w0Var, List<? extends y0> list, boolean z11) {
        k0 i11 = k20.e0.i(gVar, w0Var, list, z11, null, 16, null);
        if (t00.g.n(i11)) {
            return p(i11);
        }
        return null;
    }

    private final s0 l(int i11) {
        s0 s0Var = this.f27368h.get(Integer.valueOf(i11));
        if (s0Var == null) {
            c0 c0Var = this.f27362b;
            if (c0Var == null) {
                return null;
            }
            return c0Var.l(i11);
        }
        return s0Var;
    }

    private static final List<q.b> n(p10.q qVar, c0 c0Var) {
        List<q.b> y02;
        List<q.b> argumentList = qVar.Q();
        kotlin.jvm.internal.s.f(argumentList, "argumentList");
        p10.q g11 = r10.f.g(qVar, c0Var.f27361a.j());
        List<q.b> n11 = g11 == null ? null : n(g11, c0Var);
        if (n11 == null) {
            n11 = wz.w.i();
        }
        y02 = e0.y0(argumentList, n11);
        return y02;
    }

    public static /* synthetic */ k0 o(c0 c0Var, p10.q qVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return c0Var.m(qVar, z11);
    }

    private final k0 p(d0 d0Var) {
        boolean g11 = this.f27361a.c().g().g();
        y0 y0Var = (y0) wz.u.p0(t00.g.j(d0Var));
        d0 type = y0Var == null ? null : y0Var.getType();
        if (type == null) {
            return null;
        }
        w00.e n11 = type.H0().n();
        u10.c i11 = n11 == null ? null : a20.a.i(n11);
        boolean z11 = true;
        if (type.G0().size() == 1 && (t00.l.a(i11, true) || t00.l.a(i11, false))) {
            d0 type2 = ((y0) wz.u.C0(type.G0())).getType();
            kotlin.jvm.internal.s.f(type2, "continuationArgumentType.arguments.single().type");
            w00.i e11 = this.f27361a.e();
            if (!(e11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a)) {
                e11 = null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.a aVar = (kotlin.reflect.jvm.internal.impl.descriptors.a) e11;
            if (kotlin.jvm.internal.s.c(aVar != null ? a20.a.e(aVar) : null, b0.f27360a)) {
                return g(d0Var, type2);
            }
            if (!this.f27365e && (!g11 || !t00.l.a(i11, !g11))) {
                z11 = false;
            }
            this.f27365e = z11;
            return g(d0Var, type2);
        }
        return (k0) d0Var;
    }

    private final y0 r(s0 s0Var, q.b bVar) {
        if (bVar.r() == q.b.c.STAR) {
            if (s0Var == null) {
                return new o0(this.f27361a.c().p().l());
            }
            return new p0(s0Var);
        }
        z zVar = z.f27479a;
        q.b.c r11 = bVar.r();
        kotlin.jvm.internal.s.f(r11, "typeArgumentProto.projection");
        k1 c11 = zVar.c(r11);
        p10.q m11 = r10.f.m(bVar, this.f27361a.j());
        return m11 == null ? new a1(k20.v.j("No type recorded")) : new a1(c11, q(m11));
    }

    private final w0 s(p10.q qVar) {
        w00.e invoke;
        Object obj;
        if (qVar.g0()) {
            invoke = this.f27366f.invoke(Integer.valueOf(qVar.R()));
            if (invoke == null) {
                invoke = t(this, qVar, qVar.R());
            }
        } else if (qVar.p0()) {
            invoke = l(qVar.c0());
            if (invoke == null) {
                w0 k11 = k20.v.k("Unknown type parameter " + qVar.c0() + ". Please try recompiling module containing \"" + this.f27364d + CoreConstants.DOUBLE_QUOTE_CHAR);
                kotlin.jvm.internal.s.f(k11, "createErrorTypeConstruct…\\\"\"\n                    )");
                return k11;
            }
        } else if (qVar.q0()) {
            String string = this.f27361a.g().getString(qVar.d0());
            Iterator<T> it2 = k().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (kotlin.jvm.internal.s.c(((s0) obj).getName().b(), string)) {
                    break;
                }
            }
            invoke = (s0) obj;
            if (invoke == null) {
                w0 k12 = k20.v.k("Deserialized type parameter " + string + " in " + this.f27361a.e());
                kotlin.jvm.internal.s.f(k12, "createErrorTypeConstruct….containingDeclaration}\")");
                return k12;
            }
        } else if (qVar.o0()) {
            invoke = this.f27367g.invoke(Integer.valueOf(qVar.b0()));
            if (invoke == null) {
                invoke = t(this, qVar, qVar.b0());
            }
        } else {
            w0 k13 = k20.v.k("Unknown type");
            kotlin.jvm.internal.s.f(k13, "createErrorTypeConstructor(\"Unknown type\")");
            return k13;
        }
        w0 i11 = invoke.i();
        kotlin.jvm.internal.s.f(i11, "classifier.typeConstructor");
        return i11;
    }

    private static final w00.c t(c0 c0Var, p10.q qVar, int i11) {
        u20.h k11;
        u20.h B;
        List<Integer> J;
        u20.h k12;
        int o11;
        u10.b a11 = w.a(c0Var.f27361a.g(), i11);
        k11 = u20.n.k(qVar, new e());
        B = u20.p.B(k11, f.f27375a);
        J = u20.p.J(B);
        k12 = u20.n.k(a11, d.f27373a);
        o11 = u20.p.o(k12);
        while (J.size() < o11) {
            J.add(0);
        }
        return c0Var.f27361a.c().q().d(a11, J);
    }

    public final boolean j() {
        return this.f27365e;
    }

    public final List<s0> k() {
        List<s0> O0;
        O0 = e0.O0(this.f27368h.values());
        return O0;
    }

    public final k0 m(p10.q proto, boolean z11) {
        k0 e11;
        int t11;
        List<? extends y0> O0;
        k0 i11;
        k0 j11;
        List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> w02;
        kotlin.jvm.internal.s.g(proto, "proto");
        if (proto.g0()) {
            e11 = e(proto.R());
        } else {
            e11 = proto.o0() ? e(proto.b0()) : null;
        }
        if (e11 != null) {
            return e11;
        }
        w0 s11 = s(proto);
        if (k20.v.r(s11.n())) {
            k0 o11 = k20.v.o(s11.toString(), s11);
            kotlin.jvm.internal.s.f(o11, "createErrorTypeWithCusto….toString(), constructor)");
            return o11;
        }
        i20.a aVar = new i20.a(this.f27361a.h(), new b(proto));
        List<q.b> n11 = n(proto, this);
        t11 = wz.x.t(n11, 10);
        ArrayList arrayList = new ArrayList(t11);
        int i12 = 0;
        for (Object obj : n11) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                wz.w.s();
            }
            List<s0> parameters = s11.getParameters();
            kotlin.jvm.internal.s.f(parameters, "constructor.parameters");
            arrayList.add(r((s0) wz.u.e0(parameters, i12), (q.b) obj));
            i12 = i13;
        }
        O0 = e0.O0(arrayList);
        w00.e n12 = s11.n();
        if (z11 && (n12 instanceof r0)) {
            k20.e0 e0Var = k20.e0.f34240a;
            k0 b11 = k20.e0.b((r0) n12, O0);
            k0 O02 = b11.O0(f0.b(b11) || proto.Y());
            g.a aVar2 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1;
            w02 = e0.w0(aVar, b11.getAnnotations());
            i11 = O02.P0(aVar2.a(w02));
        } else {
            Boolean d11 = r10.b.f49030a.d(proto.U());
            kotlin.jvm.internal.s.f(d11, "SUSPEND_TYPE.get(proto.flags)");
            if (d11.booleanValue()) {
                i11 = h(aVar, s11, O0, proto.Y());
            } else {
                i11 = k20.e0.i(aVar, s11, O0, proto.Y(), null, 16, null);
                Boolean d12 = r10.b.f49031b.d(proto.U());
                kotlin.jvm.internal.s.f(d12, "DEFINITELY_NOT_NULL_TYPE.get(proto.flags)");
                if (d12.booleanValue()) {
                    k20.m c11 = m.a.c(k20.m.f34301d, i11, false, 2, null);
                    if (c11 == null) {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + i11 + CoreConstants.SINGLE_QUOTE_CHAR).toString());
                    }
                    i11 = c11;
                }
            }
        }
        p10.q a11 = r10.f.a(proto, this.f27361a.j());
        if (a11 != null && (j11 = n0.j(i11, m(a11, false))) != null) {
            i11 = j11;
        }
        return proto.g0() ? this.f27361a.c().t().a(w.a(this.f27361a.g(), proto.R()), i11) : i11;
    }

    public final d0 q(p10.q proto) {
        kotlin.jvm.internal.s.g(proto, "proto");
        if (proto.i0()) {
            String string = this.f27361a.g().getString(proto.V());
            k0 o11 = o(this, proto, false, 2, null);
            p10.q c11 = r10.f.c(proto, this.f27361a.j());
            kotlin.jvm.internal.s.e(c11);
            return this.f27361a.c().l().a(proto, string, o11, o(this, c11, false, 2, null));
        }
        return m(proto, true);
    }

    public String toString() {
        String str = this.f27363c;
        c0 c0Var = this.f27362b;
        return kotlin.jvm.internal.s.p(str, c0Var == null ? "" : kotlin.jvm.internal.s.p(". Child of ", c0Var.f27363c));
    }

    public /* synthetic */ c0(l lVar, c0 c0Var, List list, String str, String str2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, c0Var, list, str, str2, (i11 & 32) != 0 ? false : z11);
    }
}