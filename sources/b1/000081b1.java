package l0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T, V] */
    /* loaded from: classes.dex */
    public static final class a<T, V> extends kotlin.jvm.internal.u implements h00.l<l0.h<T, V>, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.p<T, T, vz.b0> f36302a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d1<T, V> f36303b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h00.p<? super T, ? super T, vz.b0> pVar, d1<T, V> d1Var) {
            super(1);
            this.f36302a = pVar;
            this.f36303b = d1Var;
        }

        public final void a(l0.h<T, V> animate) {
            kotlin.jvm.internal.s.g(animate, "$this$animate");
            this.f36302a.invoke(animate.e(), this.f36303b.b().invoke(animate.g()));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Object obj) {
            a((l0.h) obj);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {229, 261}, m = "animate")
    /* loaded from: classes.dex */
    public static final class b<T, V extends p> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f36304a;

        /* renamed from: b  reason: collision with root package name */
        Object f36305b;

        /* renamed from: c  reason: collision with root package name */
        Object f36306c;

        /* renamed from: d  reason: collision with root package name */
        Object f36307d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f36308e;

        /* renamed from: f  reason: collision with root package name */
        int f36309f;

        b(zz.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36308e = obj;
            this.f36309f |= Integer.MIN_VALUE;
            return y0.c(null, null, 0L, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T, V] */
    /* loaded from: classes.dex */
    public static final class c<T, V> extends kotlin.jvm.internal.u implements h00.l<l0.h<T, V>, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f36310a = new c();

        c() {
            super(1);
        }

        public final void a(l0.h<T, V> hVar) {
            kotlin.jvm.internal.s.g(hVar, "$this$null");
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Object obj) {
            a((l0.h) obj);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Incorrect field signature: TV; */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.l<Long, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.l0<l0.h<T, V>> f36311a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ T f36312b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l0.d<T, V> f36313c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f36314d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k<T, V> f36315e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h00.l<l0.h<T, V>, vz.b0> f36316f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k<T, V> f36317a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k<T, V> kVar) {
                super(0);
                this.f36317a = kVar;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f36317a.k(false);
            }

            @Override // h00.a
            public /* bridge */ /* synthetic */ vz.b0 invoke() {
                invoke2();
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/internal/l0<Ll0/h<TT;TV;>;>;TT;Ll0/d<TT;TV;>;TV;Ll0/k<TT;TV;>;Lh00/l<-Ll0/h<TT;TV;>;Lvz/b0;>;)V */
        /* JADX WARN: Multi-variable type inference failed */
        d(kotlin.jvm.internal.l0 l0Var, Object obj, l0.d dVar, p pVar, k kVar, h00.l lVar) {
            super(1);
            this.f36311a = l0Var;
            this.f36312b = obj;
            this.f36313c = dVar;
            this.f36314d = pVar;
            this.f36315e = kVar;
            this.f36316f = lVar;
        }

        /* JADX WARN: Type inference failed for: r12v0, types: [T, l0.h] */
        public final void a(long j11) {
            kotlin.jvm.internal.l0<l0.h<T, V>> l0Var = this.f36311a;
            ?? hVar = new l0.h(this.f36312b, this.f36313c.e(), this.f36314d, j11, this.f36313c.g(), j11, true, new a(this.f36315e));
            y0.j(hVar, j11, this.f36313c, this.f36315e, this.f36316f);
            l0Var.f34916a = hVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Long l11) {
            a(l11.longValue());
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k<T, V> f36318a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(k<T, V> kVar) {
            super(0);
            this.f36318a = kVar;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f36318a.k(false);
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.l<Long, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.l0<l0.h<T, V>> f36319a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l0.d<T, V> f36320b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k<T, V> f36321c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.l<l0.h<T, V>, vz.b0> f36322d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(kotlin.jvm.internal.l0<l0.h<T, V>> l0Var, l0.d<T, V> dVar, k<T, V> kVar, h00.l<? super l0.h<T, V>, vz.b0> lVar) {
            super(1);
            this.f36319a = l0Var;
            this.f36320b = dVar;
            this.f36321c = kVar;
            this.f36322d = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(long j11) {
            T t11 = this.f36319a.f34916a;
            kotlin.jvm.internal.s.e(t11);
            y0.j((l0.h) t11, j11, this.f36320b, this.f36321c, this.f36322d);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Long l11) {
            a(l11.longValue());
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T, V] */
    /* loaded from: classes.dex */
    public static final class g<T, V> extends kotlin.jvm.internal.u implements h00.l<l0.h<T, V>, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f36323a = new g();

        static {
        }

        g() {
            super(1);
        }

        public final void a(l0.h<T, V> hVar) {
            kotlin.jvm.internal.s.g(hVar, "$this$null");
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Object obj) {
            a((l0.h) obj);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes.dex */
    public static final class h<R> extends kotlin.jvm.internal.u implements h00.l<Long, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l<Long, R> f36324a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(h00.l<? super Long, ? extends R> lVar) {
            super(1);
            this.f36324a = lVar;
        }

        public final R a(long j11) {
            return this.f36324a.invoke(Long.valueOf(j11 / 1));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Object invoke(Long l11) {
            return a(l11.longValue());
        }
    }

    public static final Object b(float f11, float f12, float f13, i<Float> iVar, h00.p<? super Float, ? super Float, vz.b0> pVar, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object d12 = d(f1.b(kotlin.jvm.internal.l.f34915a), kotlin.coroutines.jvm.internal.b.b(f11), kotlin.coroutines.jvm.internal.b.b(f12), kotlin.coroutines.jvm.internal.b.b(f13), iVar, pVar, dVar);
        d11 = a00.d.d();
        return d12 == d11 ? d12 : vz.b0.f54756a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5 A[Catch: CancellationException -> 0x0061, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0061, blocks: (B:16:0x005a, B:35:0x00d8, B:37:0x00e5), top: B:63:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, l0.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T, V extends l0.p> java.lang.Object c(l0.k<T, V> r24, l0.d<T, V> r25, long r26, h00.l<? super l0.h<T, V>, vz.b0> r28, zz.d<? super vz.b0> r29) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.y0.c(l0.k, l0.d, long, h00.l, zz.d):java.lang.Object");
    }

    public static final <T, V extends p> Object d(d1<T, V> d1Var, T t11, T t12, T t13, i<T> iVar, h00.p<? super T, ? super T, vz.b0> pVar, zz.d<? super vz.b0> dVar) {
        Object d11;
        V invoke = t13 == null ? null : d1Var.a().invoke(t13);
        if (invoke == null) {
            invoke = q.d(d1Var.a().invoke(t11));
        }
        Object f11 = f(new k(d1Var, t11, invoke, 0L, 0L, false, 56, null), new z0(iVar, d1Var, t11, t12, invoke), 0L, new a(pVar, d1Var), dVar, 2, null);
        d11 = a00.d.d();
        return f11 == d11 ? f11 : vz.b0.f54756a;
    }

    public static /* synthetic */ Object e(float f11, float f12, float f13, i iVar, h00.p pVar, zz.d dVar, int i11, Object obj) {
        float f14 = (i11 & 4) != 0 ? 0.0f : f13;
        if ((i11 & 8) != 0) {
            iVar = j.i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
        }
        return b(f11, f12, f14, iVar, pVar, dVar);
    }

    public static /* synthetic */ Object f(k kVar, l0.d dVar, long j11, h00.l lVar, zz.d dVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = Long.MIN_VALUE;
        }
        long j12 = j11;
        if ((i11 & 4) != 0) {
            lVar = c.f36310a;
        }
        return c(kVar, dVar, j12, lVar, dVar2);
    }

    public static final <T, V extends p> Object g(k<T, V> kVar, w<T> wVar, boolean z11, h00.l<? super l0.h<T, V>, vz.b0> lVar, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object c11 = c(kVar, new v(wVar, kVar.e(), kVar.getValue(), kVar.g()), z11 ? kVar.c() : Long.MIN_VALUE, lVar, dVar);
        d11 = a00.d.d();
        return c11 == d11 ? c11 : vz.b0.f54756a;
    }

    public static /* synthetic */ Object h(k kVar, w wVar, boolean z11, h00.l lVar, zz.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            lVar = g.f36323a;
        }
        return g(kVar, wVar, z11, lVar, dVar);
    }

    private static final <R, T, V extends p> Object i(l0.d<T, V> dVar, h00.l<? super Long, ? extends R> lVar, zz.d<? super R> dVar2) {
        if (dVar.a()) {
            return h0.a(lVar, dVar2);
        }
        return c1.n0.b(new h(lVar), dVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends p> void j(l0.h<T, V> hVar, long j11, l0.d<T, V> dVar, k<T, V> kVar, h00.l<? super l0.h<T, V>, vz.b0> lVar) {
        hVar.j(j11);
        long d11 = j11 - hVar.d();
        hVar.l(dVar.f(d11));
        hVar.m(dVar.b(d11));
        if (dVar.c(d11)) {
            hVar.i(hVar.c());
            hVar.k(false);
        }
        k(hVar, kVar);
        lVar.invoke(hVar);
    }

    public static final <T, V extends p> void k(l0.h<T, V> hVar, k<T, V> state) {
        kotlin.jvm.internal.s.g(hVar, "<this>");
        kotlin.jvm.internal.s.g(state, "state");
        state.l(hVar.e());
        q.c(state.g(), hVar.g());
        state.i(hVar.b());
        state.j(hVar.c());
        state.k(hVar.h());
    }
}