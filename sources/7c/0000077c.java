package androidx.lifecycle;

import v20.a2;

/* loaded from: classes.dex */
public abstract class q implements v20.o0 {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.kt", l = {79}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f5201a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p<v20.o0, zz.d<? super vz.b0>, Object> f5203c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h00.p<? super v20.o0, ? super zz.d<? super vz.b0>, ? extends Object> pVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f5203c = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f5203c, dVar);
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f5201a;
            if (i11 == 0) {
                vz.r.b(obj);
                p a11 = q.this.a();
                h00.p<v20.o0, zz.d<? super vz.b0>, Object> pVar = this.f5203c;
                this.f5201a = 1;
                if (j0.a(a11, pVar, this) == d11) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.kt", l = {114}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f5204a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p<v20.o0, zz.d<? super vz.b0>, Object> f5206c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(h00.p<? super v20.o0, ? super zz.d<? super vz.b0>, ? extends Object> pVar, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f5206c = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new b(this.f5206c, dVar);
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f5204a;
            if (i11 == 0) {
                vz.r.b(obj);
                p a11 = q.this.a();
                h00.p<v20.o0, zz.d<? super vz.b0>, Object> pVar = this.f5206c;
                this.f5204a = 1;
                if (j0.b(a11, pVar, this) == d11) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.kt", l = {97}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f5207a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p<v20.o0, zz.d<? super vz.b0>, Object> f5209c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(h00.p<? super v20.o0, ? super zz.d<? super vz.b0>, ? extends Object> pVar, zz.d<? super c> dVar) {
            super(2, dVar);
            this.f5209c = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new c(this.f5209c, dVar);
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((c) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f5207a;
            if (i11 == 0) {
                vz.r.b(obj);
                p a11 = q.this.a();
                h00.p<v20.o0, zz.d<? super vz.b0>, Object> pVar = this.f5209c;
                this.f5207a = 1;
                if (j0.c(a11, pVar, this) == d11) {
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

    public abstract p a();

    public final a2 b(h00.p<? super v20.o0, ? super zz.d<? super vz.b0>, ? extends Object> block) {
        a2 d11;
        kotlin.jvm.internal.s.g(block, "block");
        d11 = v20.k.d(this, null, null, new a(block, null), 3, null);
        return d11;
    }

    public final a2 d(h00.p<? super v20.o0, ? super zz.d<? super vz.b0>, ? extends Object> block) {
        a2 d11;
        kotlin.jvm.internal.s.g(block, "block");
        d11 = v20.k.d(this, null, null, new b(block, null), 3, null);
        return d11;
    }

    public final a2 e(h00.p<? super v20.o0, ? super zz.d<? super vz.b0>, ? extends Object> block) {
        a2 d11;
        kotlin.jvm.internal.s.g(block, "block");
        d11 = v20.k.d(this, null, null, new c(block, null), 3, null);
        return d11;
    }
}