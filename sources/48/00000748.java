package androidx.lifecycle;

import v20.e1;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public final class c0<T> implements b0<T> {

    /* renamed from: a  reason: collision with root package name */
    private f<T> f5115a;

    /* renamed from: b  reason: collision with root package name */
    private final zz.g f5116b;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", l = {98}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f5117a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c0<T> f5118b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ T f5119c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c0<T> c0Var, T t11, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f5118b = c0Var;
            this.f5119c = t11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f5118b, this.f5119c, dVar);
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return invoke2(o0Var, dVar);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f5117a;
            if (i11 == 0) {
                vz.r.b(obj);
                f<T> a11 = this.f5118b.a();
                this.f5117a = 1;
                if (a11.e(this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            this.f5118b.a().setValue(this.f5119c);
            return vz.b0.f54756a;
        }
    }

    public c0(f<T> target, zz.g context) {
        kotlin.jvm.internal.s.g(target, "target");
        kotlin.jvm.internal.s.g(context, "context");
        this.f5115a = target;
        this.f5116b = context.plus(e1.c().R0());
    }

    public final f<T> a() {
        return this.f5115a;
    }

    @Override // androidx.lifecycle.b0
    public Object emit(T t11, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object g11 = v20.i.g(this.f5116b, new a(this, t11, null), dVar);
        d11 = a00.d.d();
        return g11 == d11 ? g11 : vz.b0.f54756a;
    }
}