package b0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.concurrent.futures.b;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f7150a;

    /* loaded from: classes.dex */
    class a extends ThreadLocal<ScheduledExecutorService> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return b0.a.d();
            }
            if (Looper.myLooper() != null) {
                return new c(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    class b implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f7151a;

        b(c cVar, Runnable runnable) {
            this.f7151a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            this.f7151a.run();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableScheduledFutureC0135c<V> implements RunnableScheduledFuture<V> {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReference<b.a<V>> f7152a = new AtomicReference<>(null);

        /* renamed from: b  reason: collision with root package name */
        private final long f7153b;

        /* renamed from: c  reason: collision with root package name */
        private final Callable<V> f7154c;

        /* renamed from: d  reason: collision with root package name */
        private final com.google.common.util.concurrent.c<V> f7155d;

        /* renamed from: b0.c$c$a */
        /* loaded from: classes.dex */
        class a implements b.c<V> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Handler f7156a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Callable f7157b;

            /* renamed from: b0.c$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class RunnableC0136a implements Runnable {
                RunnableC0136a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (RunnableScheduledFutureC0135c.this.f7152a.getAndSet(null) != null) {
                        a aVar = a.this;
                        aVar.f7156a.removeCallbacks(RunnableScheduledFutureC0135c.this);
                    }
                }
            }

            a(Handler handler, Callable callable) {
                this.f7156a = handler;
                this.f7157b = callable;
            }

            @Override // androidx.concurrent.futures.b.c
            public Object a(b.a<V> aVar) {
                aVar.a(new RunnableC0136a(), b0.a.a());
                RunnableScheduledFutureC0135c.this.f7152a.set(aVar);
                return "HandlerScheduledFuture-" + this.f7157b.toString();
            }
        }

        RunnableScheduledFutureC0135c(Handler handler, long j11, Callable<V> callable) {
            this.f7153b = j11;
            this.f7154c = callable;
            this.f7155d = androidx.concurrent.futures.b.a(new a(handler, callable));
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z11) {
            return this.f7155d.cancel(z11);
        }

        @Override // java.util.concurrent.Future
        public V get() {
            return this.f7155d.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f7153b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f7155d.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f7155d.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            b.a<V> andSet = this.f7152a.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.c(this.f7154c.call());
                } catch (Exception e11) {
                    andSet.f(e11);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public V get(long j11, TimeUnit timeUnit) {
            return this.f7155d.get(j11, timeUnit);
        }
    }

    static {
        new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Handler handler) {
        this.f7150a = handler;
    }

    private RejectedExecutionException a() {
        return new RejectedExecutionException(this.f7150a + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!this.f7150a.post(runnable)) {
            throw a();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j11, TimeUnit timeUnit) {
        return schedule(new b(this, runnable), j11, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j11, TimeUnit timeUnit) {
        long uptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j11, timeUnit);
        RunnableScheduledFutureC0135c runnableScheduledFutureC0135c = new RunnableScheduledFutureC0135c(this.f7150a, uptimeMillis, callable);
        return this.f7150a.postAtTime(runnableScheduledFutureC0135c, uptimeMillis) ? runnableScheduledFutureC0135c : c0.f.g(a());
    }
}