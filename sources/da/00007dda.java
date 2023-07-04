package kd;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class e<V> implements RunnableFuture<V>, ScheduledFuture<V> {

    /* renamed from: a  reason: collision with root package name */
    private final FutureTask<V> f34570a;

    public e(Handler handler, Callable<V> callable) {
        this.f34570a = new FutureTask<>(callable);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        return this.f34570a.cancel(z11);
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f34570a.get();
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f34570a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f34570a.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.f34570a.run();
    }

    @Override // java.util.concurrent.Future
    public V get(long j11, TimeUnit timeUnit) {
        return this.f34570a.get(j11, timeUnit);
    }

    public e(Handler handler, Runnable runnable, V v11) {
        this.f34570a = new FutureTask<>(runnable, v11);
    }
}