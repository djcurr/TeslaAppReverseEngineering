package n4;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
abstract class d<Params, Progress, Result> {

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadFactory f40475f;

    /* renamed from: g  reason: collision with root package name */
    private static final BlockingQueue<Runnable> f40476g;

    /* renamed from: h  reason: collision with root package name */
    public static final Executor f40477h;

    /* renamed from: i  reason: collision with root package name */
    private static f f40478i;

    /* renamed from: a  reason: collision with root package name */
    private final h<Params, Result> f40479a;

    /* renamed from: b  reason: collision with root package name */
    private final FutureTask<Result> f40480b;

    /* renamed from: c  reason: collision with root package name */
    private volatile g f40481c = g.PENDING;

    /* renamed from: d  reason: collision with root package name */
    final AtomicBoolean f40482d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    final AtomicBoolean f40483e = new AtomicBoolean();

    /* loaded from: classes.dex */
    static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f40484a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f40484a.getAndIncrement());
        }
    }

    /* loaded from: classes.dex */
    class b extends h<Params, Result> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() {
            d.this.f40483e.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) d.this.b(this.f40490a);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* loaded from: classes.dex */
    class c extends FutureTask<Result> {
        c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                d.this.m(get());
            } catch (InterruptedException e11) {
                Log.w("AsyncTask", e11);
            } catch (CancellationException unused) {
                d.this.m(null);
            } catch (ExecutionException e12) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e12.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* renamed from: n4.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0793d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f40487a;

        static {
            int[] iArr = new int[g.values().length];
            f40487a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40487a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e<Data> {

        /* renamed from: a  reason: collision with root package name */
        final d f40488a;

        /* renamed from: b  reason: collision with root package name */
        final Data[] f40489b;

        e(d dVar, Data... dataArr) {
            this.f40488a = dVar;
            this.f40489b = dataArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i11 = message.what;
            if (i11 == 1) {
                eVar.f40488a.d(eVar.f40489b[0]);
            } else if (i11 != 2) {
            } else {
                eVar.f40488a.k(eVar.f40489b);
            }
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* loaded from: classes.dex */
    private static abstract class h<Params, Result> implements Callable<Result> {

        /* renamed from: a  reason: collision with root package name */
        Params[] f40490a;

        h() {
        }
    }

    static {
        a aVar = new a();
        f40475f = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f40476g = linkedBlockingQueue;
        f40477h = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d() {
        b bVar = new b();
        this.f40479a = bVar;
        this.f40480b = new c(bVar);
    }

    private static Handler e() {
        f fVar;
        synchronized (d.class) {
            if (f40478i == null) {
                f40478i = new f();
            }
            fVar = f40478i;
        }
        return fVar;
    }

    public final boolean a(boolean z11) {
        this.f40482d.set(true);
        return this.f40480b.cancel(z11);
    }

    protected abstract Result b(Params... paramsArr);

    public final d<Params, Progress, Result> c(Executor executor, Params... paramsArr) {
        if (this.f40481c != g.PENDING) {
            int i11 = C0793d.f40487a[this.f40481c.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("We should never reach this state");
                }
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        this.f40481c = g.RUNNING;
        j();
        this.f40479a.f40490a = paramsArr;
        executor.execute(this.f40480b);
        return this;
    }

    void d(Result result) {
        if (f()) {
            h(result);
        } else {
            i(result);
        }
        this.f40481c = g.FINISHED;
    }

    public final boolean f() {
        return this.f40482d.get();
    }

    protected void g() {
    }

    protected void h(Result result) {
        g();
    }

    protected void i(Result result) {
    }

    protected void j() {
    }

    protected void k(Progress... progressArr) {
    }

    Result l(Result result) {
        e().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    void m(Result result) {
        if (this.f40483e.get()) {
            return;
        }
        l(result);
    }
}