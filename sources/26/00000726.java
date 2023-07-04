package androidx.lifecycle;

import androidx.lifecycle.p;
import kotlin.Metadata;
import v20.e1;
import v20.f2;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/q;", "Landroidx/lifecycle/s;", "Landroidx/lifecycle/p;", "lifecycle", "Lzz/g;", "coroutineContext", "<init>", "(Landroidx/lifecycle/p;Lzz/g;)V", "lifecycle-runtime-ktx_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends q implements s {

    /* renamed from: a  reason: collision with root package name */
    private final p f5033a;

    /* renamed from: b  reason: collision with root package name */
    private final zz.g f5034b;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f5035a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f5036b;

        a(zz.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f5036b = obj;
            return aVar;
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f5035a == 0) {
                vz.r.b(obj);
                v20.o0 o0Var = (v20.o0) this.f5036b;
                if (LifecycleCoroutineScopeImpl.this.a().b().compareTo(p.c.INITIALIZED) < 0) {
                    f2.f(o0Var.J(), null, 1, null);
                } else {
                    LifecycleCoroutineScopeImpl.this.a().a(LifecycleCoroutineScopeImpl.this);
                }
                return vz.b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public LifecycleCoroutineScopeImpl(p lifecycle, zz.g coroutineContext) {
        kotlin.jvm.internal.s.g(lifecycle, "lifecycle");
        kotlin.jvm.internal.s.g(coroutineContext, "coroutineContext");
        this.f5033a = lifecycle;
        this.f5034b = coroutineContext;
        if (a().b() == p.c.DESTROYED) {
            f2.f(J(), null, 1, null);
        }
    }

    @Override // v20.o0
    public zz.g J() {
        return this.f5034b;
    }

    @Override // androidx.lifecycle.q
    public p a() {
        return this.f5033a;
    }

    public final void f() {
        v20.k.d(this, e1.c().R0(), null, new a(null), 2, null);
    }

    @Override // androidx.lifecycle.s
    public void g(v source, p.b event) {
        kotlin.jvm.internal.s.g(source, "source");
        kotlin.jvm.internal.s.g(event, "event");
        if (a().b().compareTo(p.c.DESTROYED) <= 0) {
            a().c(this);
            f2.f(J(), null, 1, null);
        }
    }
}