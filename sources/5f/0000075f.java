package androidx.lifecycle;

import androidx.lifecycle.p;
import x20.x;

/* loaded from: classes.dex */
public final class k {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {91}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a<T> extends kotlin.coroutines.jvm.internal.l implements h00.p<x20.r<? super T>, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f5151a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f5152b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f5153c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p.c f5154d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.e<T> f5155e;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {99}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0085a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f5156a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.e<T> f5157b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ x20.r<T> f5158c;

            /* renamed from: androidx.lifecycle.k$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0086a implements kotlinx.coroutines.flow.f<T> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ x20.r f5159a;

                public C0086a(x20.r rVar) {
                    this.f5159a = rVar;
                }

                @Override // kotlinx.coroutines.flow.f
                public Object emit(T t11, zz.d<? super vz.b0> dVar) {
                    Object d11;
                    Object b11 = this.f5159a.b(t11, dVar);
                    d11 = a00.d.d();
                    return b11 == d11 ? b11 : vz.b0.f54756a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0085a(kotlinx.coroutines.flow.e<? extends T> eVar, x20.r<? super T> rVar, zz.d<? super C0085a> dVar) {
                super(2, dVar);
                this.f5157b = eVar;
                this.f5158c = rVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                return new C0085a(this.f5157b, this.f5158c, dVar);
            }

            @Override // h00.p
            public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                return ((C0085a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f5156a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    kotlinx.coroutines.flow.e<T> eVar = this.f5157b;
                    C0086a c0086a = new C0086a(this.f5158c);
                    this.f5156a = 1;
                    if (eVar.collect(c0086a, this) == d11) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p pVar, p.c cVar, kotlinx.coroutines.flow.e<? extends T> eVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f5153c = pVar;
            this.f5154d = cVar;
            this.f5155e = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            a aVar = new a(this.f5153c, this.f5154d, this.f5155e, dVar);
            aVar.f5152b = obj;
            return aVar;
        }

        @Override // h00.p
        /* renamed from: e */
        public final Object invoke(x20.r<? super T> rVar, zz.d<? super vz.b0> dVar) {
            return ((a) create(rVar, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            x20.r rVar;
            d11 = a00.d.d();
            int i11 = this.f5151a;
            if (i11 == 0) {
                vz.r.b(obj);
                x20.r rVar2 = (x20.r) this.f5152b;
                p pVar = this.f5153c;
                p.c cVar = this.f5154d;
                C0085a c0085a = new C0085a(this.f5155e, rVar2, null);
                this.f5152b = rVar2;
                this.f5151a = 1;
                if (RepeatOnLifecycleKt.a(pVar, cVar, c0085a, this) == d11) {
                    return d11;
                }
                rVar = rVar2;
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                rVar = (x20.r) this.f5152b;
                vz.r.b(obj);
            }
            x.a.a(rVar, null, 1, null);
            return vz.b0.f54756a;
        }
    }

    public static final <T> kotlinx.coroutines.flow.e<T> a(kotlinx.coroutines.flow.e<? extends T> eVar, p lifecycle, p.c minActiveState) {
        kotlin.jvm.internal.s.g(eVar, "<this>");
        kotlin.jvm.internal.s.g(lifecycle, "lifecycle");
        kotlin.jvm.internal.s.g(minActiveState, "minActiveState");
        return kotlinx.coroutines.flow.g.e(new a(lifecycle, minActiveState, eVar, null));
    }
}