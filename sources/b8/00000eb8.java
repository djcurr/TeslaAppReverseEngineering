package c0;

import androidx.camera.core.n0;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
abstract class g<V> implements com.google.common.util.concurrent.c<V> {

    /* loaded from: classes.dex */
    static class a<V> extends g<V> {

        /* renamed from: a  reason: collision with root package name */
        private final Throwable f8369a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Throwable th2) {
            this.f8369a = th2;
        }

        @Override // c0.g, java.util.concurrent.Future
        public V get() {
            throw new ExecutionException(this.f8369a);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f8369a + "]]";
        }
    }

    /* loaded from: classes.dex */
    static final class b<V> extends a<V> implements ScheduledFuture<V> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Throwable th2) {
            super(th2);
        }

        @Override // java.lang.Comparable
        /* renamed from: c */
        public int compareTo(Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }
    }

    /* loaded from: classes.dex */
    static final class c<V> extends g<V> {

        /* renamed from: b  reason: collision with root package name */
        static final g<Object> f8370b = new c(null);

        /* renamed from: a  reason: collision with root package name */
        private final V f8371a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(V v11) {
            this.f8371a = v11;
        }

        @Override // c0.g, java.util.concurrent.Future
        public V get() {
            return this.f8371a;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f8371a + "]]";
        }
    }

    g() {
    }

    public static <V> com.google.common.util.concurrent.c<V> b() {
        return c.f8370b;
    }

    @Override // com.google.common.util.concurrent.c
    public void a(Runnable runnable, Executor executor) {
        v3.h.f(runnable);
        v3.h.f(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e11) {
            n0.d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e11);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get();

    @Override // java.util.concurrent.Future
    public V get(long j11, TimeUnit timeUnit) {
        v3.h.f(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}