package androidx.lifecycle;

import androidx.lifecycle.p;
import org.spongycastle.crypto.tls.CipherSuite;
import v20.a2;
import v20.e1;

/* loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = {CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a<T> extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super T>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f5146a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f5147b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f5148c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p.c f5149d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h00.p<v20.o0, zz.d<? super T>, Object> f5150e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p pVar, p.c cVar, h00.p<? super v20.o0, ? super zz.d<? super T>, ? extends Object> pVar2, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f5148c = pVar;
            this.f5149d = cVar;
            this.f5150e = pVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            a aVar = new a(this.f5148c, this.f5149d, this.f5150e, dVar);
            aVar.f5147b = obj;
            return aVar;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Object invoke(v20.o0 o0Var, Object obj) {
            return invoke(o0Var, (zz.d) ((zz.d) obj));
        }

        public final Object invoke(v20.o0 o0Var, zz.d<? super T> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            LifecycleController lifecycleController;
            d11 = a00.d.d();
            int i11 = this.f5146a;
            if (i11 == 0) {
                vz.r.b(obj);
                a2 a2Var = (a2) ((v20.o0) this.f5147b).J().get(a2.f53887l1);
                if (a2Var != null) {
                    i0 i0Var = new i0();
                    LifecycleController lifecycleController2 = new LifecycleController(this.f5148c, this.f5149d, i0Var.f5145b, a2Var);
                    try {
                        h00.p<v20.o0, zz.d<? super T>, Object> pVar = this.f5150e;
                        this.f5147b = lifecycleController2;
                        this.f5146a = 1;
                        obj = v20.i.g(i0Var, pVar, this);
                        if (obj == d11) {
                            return d11;
                        }
                        lifecycleController = lifecycleController2;
                    } catch (Throwable th2) {
                        th = th2;
                        lifecycleController = lifecycleController2;
                        lifecycleController.c();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("when[State] methods should have a parent job".toString());
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                lifecycleController = (LifecycleController) this.f5147b;
                try {
                    vz.r.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    lifecycleController.c();
                    throw th;
                }
            }
            lifecycleController.c();
            return obj;
        }
    }

    public static final <T> Object a(p pVar, h00.p<? super v20.o0, ? super zz.d<? super T>, ? extends Object> pVar2, zz.d<? super T> dVar) {
        return d(pVar, p.c.CREATED, pVar2, dVar);
    }

    public static final <T> Object b(p pVar, h00.p<? super v20.o0, ? super zz.d<? super T>, ? extends Object> pVar2, zz.d<? super T> dVar) {
        return d(pVar, p.c.RESUMED, pVar2, dVar);
    }

    public static final <T> Object c(p pVar, h00.p<? super v20.o0, ? super zz.d<? super T>, ? extends Object> pVar2, zz.d<? super T> dVar) {
        return d(pVar, p.c.STARTED, pVar2, dVar);
    }

    public static final <T> Object d(p pVar, p.c cVar, h00.p<? super v20.o0, ? super zz.d<? super T>, ? extends Object> pVar2, zz.d<? super T> dVar) {
        return v20.i.g(e1.c().R0(), new a(pVar, cVar, pVar2, null), dVar);
    }
}