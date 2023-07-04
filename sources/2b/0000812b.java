package l0;

import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: S
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public final class a1<S> {

    /* renamed from: a  reason: collision with root package name */
    private final n0<S> f36024a;

    /* renamed from: b  reason: collision with root package name */
    private final String f36025b;

    /* renamed from: c  reason: collision with root package name */
    private final c1.o0 f36026c;

    /* renamed from: d  reason: collision with root package name */
    private final c1.o0 f36027d;

    /* renamed from: e  reason: collision with root package name */
    private final c1.o0 f36028e;

    /* renamed from: f  reason: collision with root package name */
    private final c1.o0 f36029f;

    /* renamed from: g  reason: collision with root package name */
    private final c1.o0 f36030g;

    /* renamed from: h  reason: collision with root package name */
    private final m1.r<a1<S>.d<?, ?>> f36031h;

    /* renamed from: i  reason: collision with root package name */
    private final m1.r<a1<?>> f36032i;

    /* renamed from: j  reason: collision with root package name */
    private final c1.o0 f36033j;

    /* renamed from: k  reason: collision with root package name */
    private long f36034k;

    /* renamed from: l  reason: collision with root package name */
    private final v1 f36035l;

    /* loaded from: classes.dex */
    public final class a<T, V extends p> {

        /* renamed from: a  reason: collision with root package name */
        private final d1<T, V> f36036a;

        /* renamed from: b  reason: collision with root package name */
        private final String f36037b;

        /* renamed from: c  reason: collision with root package name */
        private a1<S>.C0689a<T, V>.C0000a<T, V> f36038c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a1<S> f36039d;

        /* renamed from: l0.a1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C0689a<T, V extends p> implements v1<T> {

            /* renamed from: a  reason: collision with root package name */
            private final a1<S>.d<T, V> f36040a;

            /* renamed from: b  reason: collision with root package name */
            private h00.l<? super b<S>, ? extends c0<T>> f36041b;

            /* renamed from: c  reason: collision with root package name */
            private h00.l<? super S, ? extends T> f36042c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ a1<S>.a<T, V> f36043d;

            public C0689a(a this$0, a1<S>.d<T, V> animation, h00.l<? super b<S>, ? extends c0<T>> transitionSpec, h00.l<? super S, ? extends T> targetValueByState) {
                kotlin.jvm.internal.s.g(this$0, "this$0");
                kotlin.jvm.internal.s.g(animation, "animation");
                kotlin.jvm.internal.s.g(transitionSpec, "transitionSpec");
                kotlin.jvm.internal.s.g(targetValueByState, "targetValueByState");
                this.f36043d = this$0;
                this.f36040a = animation;
                this.f36041b = transitionSpec;
                this.f36042c = targetValueByState;
            }

            public final a1<S>.d<T, V> b() {
                return this.f36040a;
            }

            public final h00.l<S, T> c() {
                return (h00.l<? super S, ? extends T>) this.f36042c;
            }

            public final h00.l<b<S>, c0<T>> e() {
                return (h00.l<? super b<S>, ? extends c0<T>>) this.f36041b;
            }

            public final void g(h00.l<? super S, ? extends T> lVar) {
                kotlin.jvm.internal.s.g(lVar, "<set-?>");
                this.f36042c = lVar;
            }

            @Override // c1.v1
            public T getValue() {
                i(this.f36043d.f36039d.k());
                return this.f36040a.getValue();
            }

            public final void h(h00.l<? super b<S>, ? extends c0<T>> lVar) {
                kotlin.jvm.internal.s.g(lVar, "<set-?>");
                this.f36041b = lVar;
            }

            public final void i(b<S> segment) {
                kotlin.jvm.internal.s.g(segment, "segment");
                T invoke = this.f36042c.invoke(segment.a());
                if (this.f36043d.f36039d.q()) {
                    this.f36040a.x(this.f36042c.invoke(segment.b()), invoke, this.f36041b.invoke(segment));
                    return;
                }
                this.f36040a.y(invoke, this.f36041b.invoke(segment));
            }
        }

        public a(a1 this$0, d1<T, V> typeConverter, String label) {
            kotlin.jvm.internal.s.g(this$0, "this$0");
            kotlin.jvm.internal.s.g(typeConverter, "typeConverter");
            kotlin.jvm.internal.s.g(label, "label");
            this.f36039d = this$0;
            this.f36036a = typeConverter;
            this.f36037b = label;
        }

        public final v1<T> a(h00.l<? super b<S>, ? extends c0<T>> transitionSpec, h00.l<? super S, ? extends T> targetValueByState) {
            kotlin.jvm.internal.s.g(transitionSpec, "transitionSpec");
            kotlin.jvm.internal.s.g(targetValueByState, "targetValueByState");
            a1<S>.C0689a<T, V>.C0000a<T, V> c0689a = this.f36038c;
            if (c0689a == null) {
                a1<S> a1Var = this.f36039d;
                c0689a = new C0689a<>(this, new d(a1Var, targetValueByState.invoke((S) a1Var.g()), l.e(this.f36036a, targetValueByState.invoke((S) this.f36039d.g())), this.f36036a, this.f36037b), transitionSpec, targetValueByState);
                a1<S> a1Var2 = this.f36039d;
                c(c0689a);
                a1Var2.d(c0689a.b());
            }
            a1<S> a1Var3 = this.f36039d;
            c0689a.g(targetValueByState);
            c0689a.h(transitionSpec);
            c0689a.i(a1Var3.k());
            return c0689a;
        }

        public final a1<S>.C0689a<T, V>.C0000a<T, V> b() {
            return this.f36038c;
        }

        public final void c(a1<S>.C0689a<T, V>.C0000a<T, V> c0689a) {
            this.f36038c = c0689a;
        }

        public final void d() {
            a1<S>.C0689a<T, V>.C0000a<T, V> c0689a = this.f36038c;
            if (c0689a == null) {
                return;
            }
            a1<S> a1Var = this.f36039d;
            c0689a.b().x(c0689a.c().invoke(a1Var.k().b()), c0689a.c().invoke(a1Var.k().a()), c0689a.e().invoke(a1Var.k()));
        }
    }

    /* loaded from: classes.dex */
    public interface b<S> {

        /* loaded from: classes.dex */
        public static final class a {
            public static <S> boolean a(b<S> bVar, S s11, S s12) {
                kotlin.jvm.internal.s.g(bVar, "this");
                return kotlin.jvm.internal.s.c(s11, bVar.b()) && kotlin.jvm.internal.s.c(s12, bVar.a());
            }
        }

        S a();

        S b();

        boolean c(S s11, S s12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c<S> implements b<S> {

        /* renamed from: a  reason: collision with root package name */
        private final S f36044a;

        /* renamed from: b  reason: collision with root package name */
        private final S f36045b;

        public c(S s11, S s12) {
            this.f36044a = s11;
            this.f36045b = s12;
        }

        @Override // l0.a1.b
        public S a() {
            return this.f36045b;
        }

        @Override // l0.a1.b
        public S b() {
            return this.f36044a;
        }

        @Override // l0.a1.b
        public boolean c(S s11, S s12) {
            return b.a.a(this, s11, s12);
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (kotlin.jvm.internal.s.c(b(), bVar.b()) && kotlin.jvm.internal.s.c(a(), bVar.a())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            S b11 = b();
            int hashCode = (b11 == null ? 0 : b11.hashCode()) * 31;
            S a11 = a();
            return hashCode + (a11 != null ? a11.hashCode() : 0);
        }
    }

    /* loaded from: classes.dex */
    public final class d<T, V extends p> implements v1<T> {

        /* renamed from: a  reason: collision with root package name */
        private final d1<T, V> f36046a;

        /* renamed from: b  reason: collision with root package name */
        private final c1.o0 f36047b;

        /* renamed from: c  reason: collision with root package name */
        private final c1.o0 f36048c;

        /* renamed from: d  reason: collision with root package name */
        private final c1.o0 f36049d;

        /* renamed from: e  reason: collision with root package name */
        private final c1.o0 f36050e;

        /* renamed from: f  reason: collision with root package name */
        private final c1.o0 f36051f;

        /* renamed from: g  reason: collision with root package name */
        private final c1.o0 f36052g;

        /* renamed from: h  reason: collision with root package name */
        private final c1.o0 f36053h;

        /* renamed from: i  reason: collision with root package name */
        private V f36054i;

        /* renamed from: j  reason: collision with root package name */
        private final c0<T> f36055j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ a1<S> f36056k;

        public d(a1 this$0, T t11, V initialVelocityVector, d1<T, V> typeConverter, String label) {
            c1.o0 d11;
            c1.o0 d12;
            c1.o0 d13;
            c1.o0 d14;
            c1.o0 d15;
            c1.o0 d16;
            c1.o0 d17;
            T invoke;
            kotlin.jvm.internal.s.g(this$0, "this$0");
            kotlin.jvm.internal.s.g(initialVelocityVector, "initialVelocityVector");
            kotlin.jvm.internal.s.g(typeConverter, "typeConverter");
            kotlin.jvm.internal.s.g(label, "label");
            this.f36056k = this$0;
            this.f36046a = typeConverter;
            d11 = c1.s1.d(t11, null, 2, null);
            this.f36047b = d11;
            d12 = c1.s1.d(j.i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null), null, 2, null);
            this.f36048c = d12;
            d13 = c1.s1.d(new z0(c(), typeConverter, t11, i(), initialVelocityVector), null, 2, null);
            this.f36049d = d13;
            d14 = c1.s1.d(Boolean.TRUE, null, 2, null);
            this.f36050e = d14;
            d15 = c1.s1.d(0L, null, 2, null);
            this.f36051f = d15;
            d16 = c1.s1.d(Boolean.FALSE, null, 2, null);
            this.f36052g = d16;
            d17 = c1.s1.d(t11, null, 2, null);
            this.f36053h = d17;
            this.f36054i = initialVelocityVector;
            Float f11 = s1.h().get(typeConverter);
            if (f11 == null) {
                invoke = null;
            } else {
                float floatValue = f11.floatValue();
                V invoke2 = j().a().invoke(t11);
                int b11 = invoke2.b();
                for (int i11 = 0; i11 < b11; i11++) {
                    invoke2.e(i11, floatValue);
                }
                invoke = j().b().invoke(invoke2);
            }
            this.f36055j = j.i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, invoke, 3, null);
        }

        private final boolean g() {
            return ((Boolean) this.f36052g.getValue()).booleanValue();
        }

        private final long h() {
            return ((Number) this.f36051f.getValue()).longValue();
        }

        private final T i() {
            return this.f36047b.getValue();
        }

        private final void o(z0<T, V> z0Var) {
            this.f36049d.setValue(z0Var);
        }

        private final void p(c0<T> c0Var) {
            this.f36048c.setValue(c0Var);
        }

        private final void r(boolean z11) {
            this.f36052g.setValue(Boolean.valueOf(z11));
        }

        private final void s(long j11) {
            this.f36051f.setValue(Long.valueOf(j11));
        }

        private final void t(T t11) {
            this.f36047b.setValue(t11);
        }

        private final void v(T t11, boolean z11) {
            c0<T> c11;
            if (z11) {
                c11 = c() instanceof v0 ? c() : this.f36055j;
            } else {
                c11 = c();
            }
            o(new z0<>(c11, this.f36046a, t11, i(), this.f36054i));
            this.f36056k.r();
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ void w(d dVar, Object obj, boolean z11, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                obj = dVar.getValue();
            }
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            dVar.v(obj, z11);
        }

        public final z0<T, V> b() {
            return (z0) this.f36049d.getValue();
        }

        public final c0<T> c() {
            return (c0) this.f36048c.getValue();
        }

        public final long e() {
            return b().d();
        }

        @Override // c1.v1
        public T getValue() {
            return this.f36053h.getValue();
        }

        public final d1<T, V> j() {
            return this.f36046a;
        }

        public final boolean k() {
            return ((Boolean) this.f36050e.getValue()).booleanValue();
        }

        public final void l(long j11) {
            long h11 = j11 - h();
            u(b().f(h11));
            this.f36054i = b().b(h11);
            if (b().c(h11)) {
                q(true);
                s(0L);
            }
        }

        public final void m() {
            r(true);
        }

        public final void n(long j11) {
            u(b().f(j11));
            this.f36054i = b().b(j11);
        }

        public final void q(boolean z11) {
            this.f36050e.setValue(Boolean.valueOf(z11));
        }

        public void u(T t11) {
            this.f36053h.setValue(t11);
        }

        public final void x(T t11, T t12, c0<T> animationSpec) {
            kotlin.jvm.internal.s.g(animationSpec, "animationSpec");
            t(t12);
            p(animationSpec);
            if (kotlin.jvm.internal.s.c(b().h(), t11) && kotlin.jvm.internal.s.c(b().g(), t12)) {
                return;
            }
            w(this, t11, false, 2, null);
        }

        public final void y(T t11, c0<T> animationSpec) {
            kotlin.jvm.internal.s.g(animationSpec, "animationSpec");
            if (!kotlin.jvm.internal.s.c(i(), t11) || g()) {
                t(t11);
                p(animationSpec);
                w(this, null, !k(), 1, null);
                q(false);
                s(this.f36056k.j());
                r(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.Transition$animateTo$1$1", f = "Transition.kt", l = {432}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f36057a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a1<S> f36058b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<Long, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a1<S> f36059a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a1<S> a1Var) {
                super(1);
                this.f36059a = a1Var;
            }

            public final void a(long j11) {
                if (this.f36059a.q()) {
                    return;
                }
                this.f36059a.s(j11 / 1);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(Long l11) {
                a(l11.longValue());
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(a1<S> a1Var, zz.d<? super e> dVar) {
            super(2, dVar);
            this.f36058b = a1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new e(this.f36058b, dVar);
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((e) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            a aVar;
            d11 = a00.d.d();
            int i11 = this.f36057a;
            if (i11 != 0 && i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vz.r.b(obj);
            do {
                aVar = new a(this.f36058b);
                this.f36057a = 1;
            } while (c1.n0.b(aVar, this) != d11);
            return d11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a1<S> f36060a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ S f36061b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f36062c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(a1<S> a1Var, S s11, int i11) {
            super(2);
            this.f36060a = a1Var;
            this.f36061b = s11;
            this.f36062c = i11;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            this.f36060a.f(this.f36061b, iVar, this.f36062c | 1);
        }
    }

    /* loaded from: classes.dex */
    static final class g extends kotlin.jvm.internal.u implements h00.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a1<S> f36063a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(a1<S> a1Var) {
            super(0);
            this.f36063a = a1Var;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ Long invoke() {
            return invoke();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final Long invoke() {
            long j11 = 0;
            for (d dVar : ((a1) this.f36063a).f36031h) {
                j11 = Math.max(j11, dVar.e());
            }
            for (a1 a1Var : ((a1) this.f36063a).f36032i) {
                j11 = Math.max(j11, a1Var.n());
            }
            return Long.valueOf(j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a1<S> f36064a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ S f36065b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f36066c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(a1<S> a1Var, S s11, int i11) {
            super(2);
            this.f36064a = a1Var;
            this.f36065b = s11;
            this.f36066c = i11;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            this.f36064a.G(this.f36065b, iVar, this.f36066c | 1);
        }
    }

    public a1(n0<S> transitionState, String str) {
        c1.o0 d11;
        c1.o0 d12;
        c1.o0 d13;
        c1.o0 d14;
        c1.o0 d15;
        c1.o0 d16;
        kotlin.jvm.internal.s.g(transitionState, "transitionState");
        this.f36024a = transitionState;
        this.f36025b = str;
        d11 = c1.s1.d(g(), null, 2, null);
        this.f36026c = d11;
        d12 = c1.s1.d(new c(g(), g()), null, 2, null);
        this.f36027d = d12;
        d13 = c1.s1.d(0L, null, 2, null);
        this.f36028e = d13;
        d14 = c1.s1.d(Long.MIN_VALUE, null, 2, null);
        this.f36029f = d14;
        d15 = c1.s1.d(Boolean.TRUE, null, 2, null);
        this.f36030g = d15;
        this.f36031h = c1.n1.d();
        this.f36032i = c1.n1.d();
        d16 = c1.s1.d(Boolean.FALSE, null, 2, null);
        this.f36033j = d16;
        this.f36035l = c1.n1.c(new g(this));
    }

    private final void C(b<S> bVar) {
        this.f36027d.setValue(bVar);
    }

    private final void D(long j11) {
        this.f36029f.setValue(Long.valueOf(j11));
    }

    private final long l() {
        return ((Number) this.f36029f.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        F(true);
        if (q()) {
            long j11 = 0;
            for (a1<S>.d<?, ?> dVar : this.f36031h) {
                j11 = Math.max(j11, dVar.e());
                dVar.n(i());
            }
            F(false);
        }
    }

    public final void A(long j11) {
        this.f36028e.setValue(Long.valueOf(j11));
    }

    public final void B(boolean z11) {
        this.f36033j.setValue(Boolean.valueOf(z11));
    }

    public final void E(S s11) {
        this.f36026c.setValue(s11);
    }

    public final void F(boolean z11) {
        this.f36030g.setValue(Boolean.valueOf(z11));
    }

    public final void G(S s11, c1.i iVar, int i11) {
        c1.i h11 = iVar.h(-1598251902);
        int i12 = (i11 & 14) == 0 ? (h11.O(s11) ? 4 : 2) | i11 : i11;
        if ((i11 & 112) == 0) {
            i12 |= h11.O(this) ? 32 : 16;
        }
        if (((i12 & 91) ^ 18) == 0 && h11.i()) {
            h11.G();
        } else if (!q() && !kotlin.jvm.internal.s.c(m(), s11)) {
            C(new c(m(), s11));
            z(m());
            E(s11);
            if (!p()) {
                F(true);
            }
            for (a1<S>.d<?, ?> dVar : this.f36031h) {
                dVar.m();
            }
        }
        c1.e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new h(this, s11, i11));
    }

    public final boolean d(a1<S>.d<?, ?> animation) {
        kotlin.jvm.internal.s.g(animation, "animation");
        return this.f36031h.add(animation);
    }

    public final boolean e(a1<?> transition) {
        kotlin.jvm.internal.s.g(transition, "transition");
        return this.f36032i.add(transition);
    }

    public final void f(S s11, c1.i iVar, int i11) {
        int i12;
        c1.i h11 = iVar.h(-1097578271);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(s11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.O(this) ? 32 : 16;
        }
        if (((i12 & 91) ^ 18) == 0 && h11.i()) {
            h11.G();
        } else if (!q()) {
            G(s11, h11, (i12 & 14) | (i12 & 112));
            if (!kotlin.jvm.internal.s.c(s11, g()) || p() || o()) {
                int i13 = (i12 >> 3) & 14;
                h11.x(-3686930);
                boolean O = h11.O(this);
                Object y11 = h11.y();
                if (O || y11 == c1.i.f8486a.a()) {
                    y11 = new e(this, null);
                    h11.p(y11);
                }
                h11.N();
                c1.b0.d(this, (h00.p) y11, h11, i13);
            }
        }
        c1.e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new f(this, s11, i11));
    }

    public final S g() {
        return this.f36024a.a();
    }

    public final String h() {
        return this.f36025b;
    }

    public final long i() {
        return this.f36034k;
    }

    public final long j() {
        return ((Number) this.f36028e.getValue()).longValue();
    }

    public final b<S> k() {
        return (b) this.f36027d.getValue();
    }

    public final S m() {
        return (S) this.f36026c.getValue();
    }

    public final long n() {
        return ((Number) this.f36035l.getValue()).longValue();
    }

    public final boolean o() {
        return ((Boolean) this.f36030g.getValue()).booleanValue();
    }

    public final boolean p() {
        return l() != Long.MIN_VALUE;
    }

    public final boolean q() {
        return ((Boolean) this.f36033j.getValue()).booleanValue();
    }

    public final void s(long j11) {
        if (l() == Long.MIN_VALUE) {
            u(j11);
        }
        F(false);
        A(j11 - l());
        boolean z11 = true;
        for (a1<S>.d<?, ?> dVar : this.f36031h) {
            if (!dVar.k()) {
                dVar.l(j());
            }
            if (!dVar.k()) {
                z11 = false;
            }
        }
        for (a1<?> a1Var : this.f36032i) {
            if (!kotlin.jvm.internal.s.c(a1Var.m(), a1Var.g())) {
                a1Var.s(j());
            }
            if (!kotlin.jvm.internal.s.c(a1Var.m(), a1Var.g())) {
                z11 = false;
            }
        }
        if (z11) {
            t();
        }
    }

    public final void t() {
        D(Long.MIN_VALUE);
        z(m());
        A(0L);
        this.f36024a.d(false);
    }

    public final void u(long j11) {
        D(j11);
        this.f36024a.d(true);
    }

    public final void v(a1<S>.a<?, ?> deferredAnimation) {
        a1<S>.d<?, ?> b11;
        kotlin.jvm.internal.s.g(deferredAnimation, "deferredAnimation");
        a1<S>.C0689a<?, V>.C0000a<?, ?> b12 = deferredAnimation.b();
        if (b12 == null || (b11 = b12.b()) == null) {
            return;
        }
        w(b11);
    }

    public final void w(a1<S>.d<?, ?> animation) {
        kotlin.jvm.internal.s.g(animation, "animation");
        this.f36031h.remove(animation);
    }

    public final boolean x(a1<?> transition) {
        kotlin.jvm.internal.s.g(transition, "transition");
        return this.f36032i.remove(transition);
    }

    public final void y(S s11, S s12, long j11) {
        D(Long.MIN_VALUE);
        this.f36024a.d(false);
        if (!q() || !kotlin.jvm.internal.s.c(g(), s11) || !kotlin.jvm.internal.s.c(m(), s12)) {
            z(s11);
            E(s12);
            B(true);
            C(new c(s11, s12));
        }
        for (a1<?> a1Var : this.f36032i) {
            if (a1Var.q()) {
                a1Var.y(a1Var.g(), a1Var.m(), j11);
            }
        }
        for (a1<S>.d<?, ?> dVar : this.f36031h) {
            dVar.n(j11);
        }
        this.f36034k = j11;
    }

    public final void z(S s11) {
        this.f36024a.c(s11);
    }

    public a1(S s11, String str) {
        this(new n0(s11), str);
    }
}