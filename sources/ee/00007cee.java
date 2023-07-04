package k20;

import java.util.List;
import k20.u0;

/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: a */
    public static final e0 f34240a = new e0();

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l {

        /* renamed from: a */
        public static final a f34241a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Void invoke(kotlin.reflect.jvm.internal.impl.types.checker.h noName_0) {
            kotlin.jvm.internal.s.g(noName_0, "$noName_0");
            return null;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a */
        private final k0 f34242a;

        /* renamed from: b */
        private final w0 f34243b;

        public b(k0 k0Var, w0 w0Var) {
            this.f34242a = k0Var;
            this.f34243b = w0Var;
        }

        public final k0 a() {
            return this.f34242a;
        }

        public final w0 b() {
            return this.f34243b;
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<kotlin.reflect.jvm.internal.impl.types.checker.h, k0> {

        /* renamed from: a */
        final /* synthetic */ w0 f34244a;

        /* renamed from: b */
        final /* synthetic */ List<y0> f34245b;

        /* renamed from: c */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f34246c;

        /* renamed from: d */
        final /* synthetic */ boolean f34247d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(w0 w0Var, List<? extends y0> list, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z11) {
            super(1);
            this.f34244a = w0Var;
            this.f34245b = list;
            this.f34246c = gVar;
            this.f34247d = z11;
        }

        @Override // h00.l
        /* renamed from: a */
        public final k0 invoke(kotlin.reflect.jvm.internal.impl.types.checker.h refiner) {
            kotlin.jvm.internal.s.g(refiner, "refiner");
            b f11 = e0.f34240a.f(this.f34244a, refiner, this.f34245b);
            if (f11 == null) {
                return null;
            }
            k0 a11 = f11.a();
            if (a11 == null) {
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar = this.f34246c;
                w0 b11 = f11.b();
                kotlin.jvm.internal.s.e(b11);
                return e0.h(gVar, b11, this.f34245b, this.f34247d, refiner);
            }
            return a11;
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.l<kotlin.reflect.jvm.internal.impl.types.checker.h, k0> {

        /* renamed from: a */
        final /* synthetic */ w0 f34248a;

        /* renamed from: b */
        final /* synthetic */ List<y0> f34249b;

        /* renamed from: c */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f34250c;

        /* renamed from: d */
        final /* synthetic */ boolean f34251d;

        /* renamed from: e */
        final /* synthetic */ d20.h f34252e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(w0 w0Var, List<? extends y0> list, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z11, d20.h hVar) {
            super(1);
            this.f34248a = w0Var;
            this.f34249b = list;
            this.f34250c = gVar;
            this.f34251d = z11;
            this.f34252e = hVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final k0 invoke(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
            kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            b f11 = e0.f34240a.f(this.f34248a, kotlinTypeRefiner, this.f34249b);
            if (f11 == null) {
                return null;
            }
            k0 a11 = f11.a();
            if (a11 == null) {
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar = this.f34250c;
                w0 b11 = f11.b();
                kotlin.jvm.internal.s.e(b11);
                return e0.j(gVar, b11, this.f34249b, this.f34251d, this.f34252e);
            }
            return a11;
        }
    }

    static {
        a aVar = a.f34241a;
    }

    private e0() {
    }

    public static final k0 b(w00.r0 r0Var, List<? extends y0> arguments) {
        kotlin.jvm.internal.s.g(r0Var, "<this>");
        kotlin.jvm.internal.s.g(arguments, "arguments");
        return new s0(u0.a.f34332a, false).i(t0.f34322e.a(null, r0Var, arguments), kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b());
    }

    private final d20.h c(w0 w0Var, List<? extends y0> list, kotlin.reflect.jvm.internal.impl.types.checker.h hVar) {
        w00.e n11 = w0Var.n();
        if (n11 instanceof w00.s0) {
            return ((w00.s0) n11).n().m();
        }
        if (n11 instanceof w00.c) {
            if (hVar == null) {
                hVar = a20.a.k(a20.a.l(n11));
            }
            if (list.isEmpty()) {
                return y00.u.b((w00.c) n11, hVar);
            }
            return y00.u.a((w00.c) n11, x0.f34347b.b(w0Var, list), hVar);
        } else if (n11 instanceof w00.r0) {
            d20.h i11 = v.i(kotlin.jvm.internal.s.p("Scope for abbreviation: ", ((w00.r0) n11).getName()), true);
            kotlin.jvm.internal.s.f(i11, "createErrorScope(\"Scope …{descriptor.name}\", true)");
            return i11;
        } else if (w0Var instanceof c0) {
            return ((c0) w0Var).b();
        } else {
            throw new IllegalStateException("Unsupported classifier: " + n11 + " for constructor: " + w0Var);
        }
    }

    public static final j1 d(k0 lowerBound, k0 upperBound) {
        kotlin.jvm.internal.s.g(lowerBound, "lowerBound");
        kotlin.jvm.internal.s.g(upperBound, "upperBound");
        return kotlin.jvm.internal.s.c(lowerBound, upperBound) ? lowerBound : new y(lowerBound, upperBound);
    }

    public static final k0 e(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, y10.n constructor, boolean z11) {
        List i11;
        kotlin.jvm.internal.s.g(annotations, "annotations");
        kotlin.jvm.internal.s.g(constructor, "constructor");
        i11 = wz.w.i();
        d20.h i12 = v.i("Scope for integer literal type", true);
        kotlin.jvm.internal.s.f(i12, "createErrorScope(\"Scope …eger literal type\", true)");
        return j(annotations, constructor, i11, z11, i12);
    }

    public final b f(w0 w0Var, kotlin.reflect.jvm.internal.impl.types.checker.h hVar, List<? extends y0> list) {
        w00.e n11 = w0Var.n();
        w00.e e11 = n11 == null ? null : hVar.e(n11);
        if (e11 == null) {
            return null;
        }
        if (e11 instanceof w00.r0) {
            return new b(b((w00.r0) e11, list), null);
        }
        w0 m11 = e11.i().m(hVar);
        kotlin.jvm.internal.s.f(m11, "descriptor.typeConstruct…refine(kotlinTypeRefiner)");
        return new b(null, m11);
    }

    public static final k0 g(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, w00.c descriptor, List<? extends y0> arguments) {
        kotlin.jvm.internal.s.g(annotations, "annotations");
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        kotlin.jvm.internal.s.g(arguments, "arguments");
        w0 i11 = descriptor.i();
        kotlin.jvm.internal.s.f(i11, "descriptor.typeConstructor");
        return i(annotations, i11, arguments, false, null, 16, null);
    }

    public static final k0 h(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, w0 constructor, List<? extends y0> arguments, boolean z11, kotlin.reflect.jvm.internal.impl.types.checker.h hVar) {
        kotlin.jvm.internal.s.g(annotations, "annotations");
        kotlin.jvm.internal.s.g(constructor, "constructor");
        kotlin.jvm.internal.s.g(arguments, "arguments");
        if (annotations.isEmpty() && arguments.isEmpty() && !z11 && constructor.n() != null) {
            w00.e n11 = constructor.n();
            kotlin.jvm.internal.s.e(n11);
            k0 n12 = n11.n();
            kotlin.jvm.internal.s.f(n12, "constructor.declarationDescriptor!!.defaultType");
            return n12;
        }
        return k(annotations, constructor, arguments, z11, f34240a.c(constructor, arguments, hVar), new c(constructor, arguments, annotations, z11));
    }

    public static /* synthetic */ k0 i(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, w0 w0Var, List list, boolean z11, kotlin.reflect.jvm.internal.impl.types.checker.h hVar, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            hVar = null;
        }
        return h(gVar, w0Var, list, z11, hVar);
    }

    public static final k0 j(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, w0 constructor, List<? extends y0> arguments, boolean z11, d20.h memberScope) {
        kotlin.jvm.internal.s.g(annotations, "annotations");
        kotlin.jvm.internal.s.g(constructor, "constructor");
        kotlin.jvm.internal.s.g(arguments, "arguments");
        kotlin.jvm.internal.s.g(memberScope, "memberScope");
        l0 l0Var = new l0(constructor, arguments, z11, memberScope, new d(constructor, arguments, annotations, z11, memberScope));
        return annotations.isEmpty() ? l0Var : new i(l0Var, annotations);
    }

    public static final k0 k(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, w0 constructor, List<? extends y0> arguments, boolean z11, d20.h memberScope, h00.l<? super kotlin.reflect.jvm.internal.impl.types.checker.h, ? extends k0> refinedTypeFactory) {
        kotlin.jvm.internal.s.g(annotations, "annotations");
        kotlin.jvm.internal.s.g(constructor, "constructor");
        kotlin.jvm.internal.s.g(arguments, "arguments");
        kotlin.jvm.internal.s.g(memberScope, "memberScope");
        kotlin.jvm.internal.s.g(refinedTypeFactory, "refinedTypeFactory");
        l0 l0Var = new l0(constructor, arguments, z11, memberScope, refinedTypeFactory);
        return annotations.isEmpty() ? l0Var : new i(l0Var, annotations);
    }
}