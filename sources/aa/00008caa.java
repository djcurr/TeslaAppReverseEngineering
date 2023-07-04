package nr;

import nr.s;
import v20.o0;
import v20.p0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class d<P, S, O> implements nr.a<P, S, O>, h<q<? super P, S, ? extends O>> {

    /* renamed from: a  reason: collision with root package name */
    private final nr.a<P, S, O> f41784a;

    /* renamed from: b  reason: collision with root package name */
    private final s.b<P, S, O> f41785b;

    /* JADX INFO: Add missing generic type declarations: [ChildOutputT, ChildRenderingT, ChildPropsT] */
    /* loaded from: classes2.dex */
    static final class a<ChildOutputT, ChildPropsT, ChildRenderingT> extends kotlin.jvm.internal.u implements h00.r<p<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT>, ChildPropsT, String, h00.l<? super ChildOutputT, ? extends q<? super P, S, ? extends O>>, ChildRenderingT> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d<P, S, O> f41786a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d<P, S, O> dVar) {
            super(4);
            this.f41786a = dVar;
        }

        @Override // h00.r
        /* renamed from: a */
        public final ChildRenderingT invoke(p<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> iChild, ChildPropsT childpropst, String iKey, h00.l<? super ChildOutputT, ? extends q<? super P, S, ? extends O>> iHandler) {
            kotlin.jvm.internal.s.g(iChild, "iChild");
            kotlin.jvm.internal.s.g(iKey, "iKey");
            kotlin.jvm.internal.s.g(iHandler, "iHandler");
            return (ChildRenderingT) ((d) this.f41786a).f41784a.c(iChild, childpropst, iKey, iHandler);
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.p<String, h00.l<? super zz.d<? super vz.b0>, ? extends Object>, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d<P, S, O> f41787a;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "com.squareup.workflow1.InterceptedRenderContext$runningSideEffect$1$1", f = "WorkflowInterceptor.kt", l = {306}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f41788a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h00.l<zz.d<? super vz.b0>, Object> f41789b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(h00.l<? super zz.d<? super vz.b0>, ? extends Object> lVar, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f41789b = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                return new a(this.f41789b, dVar);
            }

            @Override // h00.p
            public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
                return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f41788a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    h00.l<zz.d<? super vz.b0>, Object> lVar = this.f41789b;
                    this.f41788a = 1;
                    if (lVar.invoke(this) == d11) {
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
        b(d<P, S, O> dVar) {
            super(2);
            this.f41787a = dVar;
        }

        public final void a(String iKey, h00.l<? super zz.d<? super vz.b0>, ? extends Object> iSideEffect) {
            kotlin.jvm.internal.s.g(iKey, "iKey");
            kotlin.jvm.internal.s.g(iSideEffect, "iSideEffect");
            ((d) this.f41787a).f41784a.a(iKey, new a(iSideEffect, null));
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(String str, h00.l<? super zz.d<? super vz.b0>, ? extends Object> lVar) {
            a(str, lVar);
            return vz.b0.f54756a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.squareup.workflow1.InterceptedRenderContext$runningSideEffect$withScopeReceiver$1", f = "WorkflowInterceptor.kt", l = {301}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements h00.l<zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f41790a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.p<o0, zz.d<? super vz.b0>, Object> f41791b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d<P, S, O> f41792c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(h00.p<? super o0, ? super zz.d<? super vz.b0>, ? extends Object> pVar, d<P, S, O> dVar, zz.d<? super c> dVar2) {
            super(1, dVar2);
            this.f41791b = pVar;
            this.f41792c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(zz.d<?> dVar) {
            return new c(this.f41791b, this.f41792c, dVar);
        }

        @Override // h00.l
        public final Object invoke(zz.d<? super vz.b0> dVar) {
            return ((c) create(dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f41790a;
            if (i11 == 0) {
                vz.r.b(obj);
                h00.p<o0, zz.d<? super vz.b0>, Object> pVar = this.f41791b;
                o0 a11 = p0.a(getContext());
                this.f41790a = 1;
                if (pVar.invoke(a11, this) == d11) {
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
    /* renamed from: nr.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0813d extends kotlin.jvm.internal.u implements h00.l<q<? super P, S, ? extends O>, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d<P, S, O> f41793a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0813d(d<P, S, O> dVar) {
            super(1);
            this.f41793a = dVar;
        }

        public final void a(q<? super P, S, ? extends O> interceptedAction) {
            kotlin.jvm.internal.s.g(interceptedAction, "interceptedAction");
            ((d) this.f41793a).f41784a.b().d(interceptedAction);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Object obj) {
            a((q) obj);
            return vz.b0.f54756a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(nr.a<? extends P, S, ? super O> baseRenderContext, s.b<P, S, O> interceptor) {
        kotlin.jvm.internal.s.g(baseRenderContext, "baseRenderContext");
        kotlin.jvm.internal.s.g(interceptor, "interceptor");
        this.f41784a = baseRenderContext;
        this.f41785b = interceptor;
    }

    @Override // nr.a
    public void a(String key, h00.p<? super o0, ? super zz.d<? super vz.b0>, ? extends Object> sideEffect) {
        kotlin.jvm.internal.s.g(key, "key");
        kotlin.jvm.internal.s.g(sideEffect, "sideEffect");
        this.f41785b.b(key, new c(sideEffect, this, null), new b(this));
    }

    @Override // nr.a
    public h<q<? super P, S, ? extends O>> b() {
        return this;
    }

    @Override // nr.a
    public <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT c(p<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT childpropst, String key, h00.l<? super ChildOutputT, ? extends q<? super P, S, ? extends O>> handler) {
        kotlin.jvm.internal.s.g(child, "child");
        kotlin.jvm.internal.s.g(key, "key");
        kotlin.jvm.internal.s.g(handler, "handler");
        return (ChildRenderingT) this.f41785b.c(child, childpropst, key, handler, new a(this));
    }

    @Override // nr.h
    /* renamed from: f */
    public void d(q<? super P, S, ? extends O> value) {
        kotlin.jvm.internal.s.g(value, "value");
        this.f41785b.a(value, new C0813d(this));
    }
}