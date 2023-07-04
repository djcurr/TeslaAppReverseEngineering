package n0;

import c1.o0;
import c1.s1;
import v20.p0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h implements f0 {

    /* renamed from: a  reason: collision with root package name */
    private final h00.l<Float, Float> f39775a;

    /* renamed from: b  reason: collision with root package name */
    private final c0 f39776b;

    /* renamed from: c  reason: collision with root package name */
    private final m0.w f39777c;

    /* renamed from: d  reason: collision with root package name */
    private final o0<Boolean> f39778d;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {145}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f39779a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m0.v f39781c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.p<c0, zz.d<? super vz.b0>, Object> f39782d;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {148}, m = "invokeSuspend")
        /* renamed from: n0.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0769a extends kotlin.coroutines.jvm.internal.l implements h00.p<c0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f39783a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f39784b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ h f39785c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ h00.p<c0, zz.d<? super vz.b0>, Object> f39786d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0769a(h hVar, h00.p<? super c0, ? super zz.d<? super vz.b0>, ? extends Object> pVar, zz.d<? super C0769a> dVar) {
                super(2, dVar);
                this.f39785c = hVar;
                this.f39786d = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                C0769a c0769a = new C0769a(this.f39785c, this.f39786d, dVar);
                c0769a.f39784b = obj;
                return c0769a;
            }

            @Override // h00.p
            public final Object invoke(c0 c0Var, zz.d<? super vz.b0> dVar) {
                return ((C0769a) create(c0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f39783a;
                try {
                    if (i11 == 0) {
                        vz.r.b(obj);
                        c0 c0Var = (c0) this.f39784b;
                        this.f39785c.f39778d.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                        h00.p<c0, zz.d<? super vz.b0>, Object> pVar = this.f39786d;
                        this.f39783a = 1;
                        if (pVar.invoke(c0Var, this) == d11) {
                            return d11;
                        }
                    } else if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        vz.r.b(obj);
                    }
                    this.f39785c.f39778d.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    return vz.b0.f54756a;
                } catch (Throwable th2) {
                    this.f39785c.f39778d.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(m0.v vVar, h00.p<? super c0, ? super zz.d<? super vz.b0>, ? extends Object> pVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f39781c = vVar;
            this.f39782d = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f39781c, this.f39782d, dVar);
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f39779a;
            if (i11 == 0) {
                vz.r.b(obj);
                m0.w wVar = h.this.f39777c;
                c0 c0Var = h.this.f39776b;
                m0.v vVar = this.f39781c;
                C0769a c0769a = new C0769a(h.this, this.f39782d, null);
                this.f39779a = 1;
                if (wVar.d(c0Var, vVar, c0769a, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c0 {
        b() {
        }

        @Override // n0.c0
        public float a(float f11) {
            return h.this.g().invoke(Float.valueOf(f11)).floatValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(h00.l<? super Float, Float> onDelta) {
        o0<Boolean> d11;
        kotlin.jvm.internal.s.g(onDelta, "onDelta");
        this.f39775a = onDelta;
        this.f39776b = new b();
        this.f39777c = new m0.w();
        d11 = s1.d(Boolean.FALSE, null, 2, null);
        this.f39778d = d11;
    }

    @Override // n0.f0
    public Object a(m0.v vVar, h00.p<? super c0, ? super zz.d<? super vz.b0>, ? extends Object> pVar, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object e11 = p0.e(new a(vVar, pVar, null), dVar);
        d11 = a00.d.d();
        return e11 == d11 ? e11 : vz.b0.f54756a;
    }

    @Override // n0.f0
    public float b(float f11) {
        return this.f39775a.invoke(Float.valueOf(f11)).floatValue();
    }

    @Override // n0.f0
    public boolean c() {
        return this.f39778d.getValue().booleanValue();
    }

    public final h00.l<Float, Float> g() {
        return this.f39775a;
    }
}