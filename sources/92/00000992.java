package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import v20.a2;
import v20.e1;
import v20.f2;
import v20.j0;
import v20.o0;
import v20.p0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0013\u0010\u0005\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002J\u0006\u0010\u0012\u001a\u00020\u000bR\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00138\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u00020\u00188\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0016@\u0017X\u0097\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Lcom/google/common/util/concurrent/c;", "Landroidx/work/ListenableWorker$a;", "startWork", "doWork", "(Lzz/d;)Ljava/lang/Object;", "Landroidx/work/i;", "getForegroundInfo", "Landroidx/work/e;", MessageExtension.FIELD_DATA, "Lvz/b0;", "setProgress", "(Landroidx/work/e;Lzz/d;)Ljava/lang/Object;", "foregroundInfo", "setForeground", "(Landroidx/work/i;Lzz/d;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "Landroidx/work/impl/utils/futures/c;", "future", "Landroidx/work/impl/utils/futures/c;", "getFuture$work_runtime_ktx_release", "()Landroidx/work/impl/utils/futures/c;", "Lv20/a0;", "job", "Lv20/a0;", "getJob$work_runtime_ktx_release", "()Lv20/a0;", "Lv20/j0;", "coroutineContext", "Lv20/j0;", "getCoroutineContext", "()Lv20/j0;", "getCoroutineContext$annotations", "()V", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    private final j0 coroutineContext;
    private final androidx.work.impl.utils.futures.c<ListenableWorker.a> future;
    private final v20.a0 job;

    /* loaded from: classes.dex */
    static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CoroutineWorker.this.getFuture$work_runtime_ktx_release().isCancelled()) {
                a2.a.a(CoroutineWorker.this.getJob$work_runtime_ktx_release(), null, 1, null);
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f6459a;

        /* renamed from: b  reason: collision with root package name */
        int f6460b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n<i> f6461c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CoroutineWorker f6462d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n<i> nVar, CoroutineWorker coroutineWorker, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f6461c = nVar;
            this.f6462d = coroutineWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new b(this.f6461c, this.f6462d, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            n nVar;
            d11 = a00.d.d();
            int i11 = this.f6460b;
            if (i11 == 0) {
                vz.r.b(obj);
                n nVar2 = this.f6461c;
                CoroutineWorker coroutineWorker = this.f6462d;
                this.f6459a = nVar2;
                this.f6460b = 1;
                Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
                if (foregroundInfo == d11) {
                    return d11;
                }
                nVar = nVar2;
                obj = foregroundInfo;
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                nVar = (n) this.f6459a;
                vz.r.b(obj);
            }
            nVar.c(obj);
            return vz.b0.f54756a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {68}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f6463a;

        c(zz.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new c(dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((c) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f6463a;
            try {
                if (i11 == 0) {
                    vz.r.b(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.f6463a = 1;
                    obj = coroutineWorker.doWork(this);
                    if (obj == d11) {
                        return d11;
                    }
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    vz.r.b(obj);
                }
                CoroutineWorker.this.getFuture$work_runtime_ktx_release().p((ListenableWorker.a) obj);
            } catch (Throwable th2) {
                CoroutineWorker.this.getFuture$work_runtime_ktx_release().q(th2);
            }
            return vz.b0.f54756a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        v20.a0 b11;
        kotlin.jvm.internal.s.g(appContext, "appContext");
        kotlin.jvm.internal.s.g(params, "params");
        b11 = f2.b(null, 1, null);
        this.job = b11;
        androidx.work.impl.utils.futures.c<ListenableWorker.a> t11 = androidx.work.impl.utils.futures.c.t();
        kotlin.jvm.internal.s.f(t11, "create()");
        this.future = t11;
        t11.a(new a(), getTaskExecutor().c());
        this.coroutineContext = e1.a();
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, zz.d dVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(zz.d<? super ListenableWorker.a> dVar);

    public j0 getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(zz.d<? super i> dVar) {
        return getForegroundInfo$suspendImpl(this, dVar);
    }

    @Override // androidx.work.ListenableWorker
    public final com.google.common.util.concurrent.c<i> getForegroundInfoAsync() {
        v20.a0 b11;
        b11 = f2.b(null, 1, null);
        o0 a11 = p0.a(getCoroutineContext().plus(b11));
        n nVar = new n(b11, null, 2, null);
        v20.k.d(a11, null, null, new b(nVar, this, null), 3, null);
        return nVar;
    }

    public final androidx.work.impl.utils.futures.c<ListenableWorker.a> getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    public final v20.a0 getJob$work_runtime_ktx_release() {
        return this.job;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    public final Object setForeground(i iVar, zz.d<? super vz.b0> dVar) {
        Object obj;
        Object d11;
        zz.d c11;
        Object d12;
        com.google.common.util.concurrent.c<Void> foregroundAsync = setForegroundAsync(iVar);
        kotlin.jvm.internal.s.f(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                obj = foregroundAsync.get();
            } catch (ExecutionException e11) {
                Throwable cause = e11.getCause();
                if (cause == null) {
                    throw e11;
                }
                throw cause;
            }
        } else {
            c11 = a00.c.c(dVar);
            v20.p pVar = new v20.p(c11, 1);
            pVar.y();
            foregroundAsync.a(new o(pVar, foregroundAsync), f.INSTANCE);
            pVar.T(new p(foregroundAsync));
            obj = pVar.s();
            d12 = a00.d.d();
            if (obj == d12) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
        }
        d11 = a00.d.d();
        return obj == d11 ? obj : vz.b0.f54756a;
    }

    public final Object setProgress(e eVar, zz.d<? super vz.b0> dVar) {
        Object obj;
        Object d11;
        zz.d c11;
        Object d12;
        com.google.common.util.concurrent.c<Void> progressAsync = setProgressAsync(eVar);
        kotlin.jvm.internal.s.f(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                obj = progressAsync.get();
            } catch (ExecutionException e11) {
                Throwable cause = e11.getCause();
                if (cause == null) {
                    throw e11;
                }
                throw cause;
            }
        } else {
            c11 = a00.c.c(dVar);
            v20.p pVar = new v20.p(c11, 1);
            pVar.y();
            progressAsync.a(new o(pVar, progressAsync), f.INSTANCE);
            pVar.T(new p(progressAsync));
            obj = pVar.s();
            d12 = a00.d.d();
            if (obj == d12) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
        }
        d11 = a00.d.d();
        return obj == d11 ? obj : vz.b0.f54756a;
    }

    @Override // androidx.work.ListenableWorker
    public final com.google.common.util.concurrent.c<ListenableWorker.a> startWork() {
        v20.k.d(p0.a(getCoroutineContext().plus(this.job)), null, null, new c(null), 3, null);
        return this.future;
    }
}