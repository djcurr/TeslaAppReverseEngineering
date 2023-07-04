package l0;

import c1.v1;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: e  reason: collision with root package name */
    public static final int f36164e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final d1.e<a<?, ?>> f36165a = new d1.e<>(new a[16], 0);

    /* renamed from: b  reason: collision with root package name */
    private final c1.o0 f36166b;

    /* renamed from: c  reason: collision with root package name */
    private long f36167c;

    /* renamed from: d  reason: collision with root package name */
    private final c1.o0 f36168d;

    /* loaded from: classes.dex */
    public final class a<T, V extends p> implements v1<T> {

        /* renamed from: a  reason: collision with root package name */
        private T f36169a;

        /* renamed from: b  reason: collision with root package name */
        private T f36170b;

        /* renamed from: c  reason: collision with root package name */
        private final d1<T, V> f36171c;

        /* renamed from: d  reason: collision with root package name */
        private i<T> f36172d;

        /* renamed from: e  reason: collision with root package name */
        private final c1.o0 f36173e;

        /* renamed from: f  reason: collision with root package name */
        private z0<T, V> f36174f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f36175g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f36176h;

        /* renamed from: i  reason: collision with root package name */
        private long f36177i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ j0 f36178j;

        public a(j0 this$0, T t11, T t12, d1<T, V> typeConverter, i<T> animationSpec) {
            c1.o0 d11;
            kotlin.jvm.internal.s.g(this$0, "this$0");
            kotlin.jvm.internal.s.g(typeConverter, "typeConverter");
            kotlin.jvm.internal.s.g(animationSpec, "animationSpec");
            this.f36178j = this$0;
            this.f36169a = t11;
            this.f36170b = t12;
            this.f36171c = typeConverter;
            this.f36172d = animationSpec;
            d11 = c1.s1.d(t11, null, 2, null);
            this.f36173e = d11;
            this.f36174f = new z0<>(this.f36172d, typeConverter, this.f36169a, this.f36170b, null, 16, null);
        }

        public final T b() {
            return this.f36169a;
        }

        public final T c() {
            return this.f36170b;
        }

        public final boolean e() {
            return this.f36175g;
        }

        public final void g(long j11) {
            this.f36178j.i(false);
            if (this.f36176h) {
                this.f36176h = false;
                this.f36177i = j11;
            }
            long j12 = j11 - this.f36177i;
            h(this.f36174f.f(j12));
            this.f36175g = this.f36174f.c(j12);
        }

        @Override // c1.v1
        public T getValue() {
            return this.f36173e.getValue();
        }

        public void h(T t11) {
            this.f36173e.setValue(t11);
        }

        public final void i(T t11, T t12, i<T> animationSpec) {
            kotlin.jvm.internal.s.g(animationSpec, "animationSpec");
            this.f36169a = t11;
            this.f36170b = t12;
            this.f36172d = animationSpec;
            this.f36174f = new z0<>(animationSpec, this.f36171c, t11, t12, null, 16, null);
            this.f36178j.i(true);
            this.f36175g = false;
            this.f36176h = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.InfiniteTransition$run$1", f = "InfiniteTransition.kt", l = {134}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f36179a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.l<Long, vz.b0> {
            a(Object obj) {
                super(1, obj, j0.class, "onFrame", "onFrame(J)V", 0);
            }

            public final void d(long j11) {
                ((j0) this.receiver).f(j11);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(Long l11) {
                d(l11.longValue());
                return vz.b0.f54756a;
            }
        }

        b(zz.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new b(dVar);
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            a aVar;
            d11 = a00.d.d();
            int i11 = this.f36179a;
            if (i11 != 0 && i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vz.r.b(obj);
            do {
                aVar = new a(j0.this);
                this.f36179a = 1;
            } while (h0.a(aVar, this) != d11);
            return d11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f36182b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11) {
            super(2);
            this.f36182b = i11;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            j0.this.h(iVar, this.f36182b | 1);
        }
    }

    public j0() {
        c1.o0 d11;
        c1.o0 d12;
        d11 = c1.s1.d(Boolean.FALSE, null, 2, null);
        this.f36166b = d11;
        this.f36167c = Long.MIN_VALUE;
        d12 = c1.s1.d(Boolean.TRUE, null, 2, null);
        this.f36168d = d12;
    }

    private final boolean d() {
        return ((Boolean) this.f36166b.getValue()).booleanValue();
    }

    private final boolean e() {
        return ((Boolean) this.f36168d.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(long j11) {
        boolean z11;
        if (this.f36167c == Long.MIN_VALUE) {
            this.f36167c = j11;
        }
        long j12 = j11 - this.f36167c;
        d1.e<a<?, ?>> eVar = this.f36165a;
        int l11 = eVar.l();
        if (l11 > 0) {
            a<?, ?>[] k11 = eVar.k();
            z11 = true;
            int i11 = 0;
            do {
                a<?, ?> aVar = k11[i11];
                if (!aVar.e()) {
                    aVar.g(j12);
                }
                if (!aVar.e()) {
                    z11 = false;
                }
                i11++;
            } while (i11 < l11);
        } else {
            z11 = true;
        }
        j(!z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(boolean z11) {
        this.f36166b.setValue(Boolean.valueOf(z11));
    }

    private final void j(boolean z11) {
        this.f36168d.setValue(Boolean.valueOf(z11));
    }

    public final void c(a<?, ?> animation) {
        kotlin.jvm.internal.s.g(animation, "animation");
        this.f36165a.b(animation);
        i(true);
    }

    public final void g(a<?, ?> animation) {
        kotlin.jvm.internal.s.g(animation, "animation");
        this.f36165a.q(animation);
    }

    public final void h(c1.i iVar, int i11) {
        c1.i h11 = iVar.h(2102343854);
        if (e() || d()) {
            c1.b0.d(this, new b(null), h11, 8);
        }
        c1.e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new c(i11));
    }
}