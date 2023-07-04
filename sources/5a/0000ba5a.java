package vy;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class a extends AtomicReference<Future<?>> implements iy.b {

    /* renamed from: d  reason: collision with root package name */
    protected static final FutureTask<Void> f54648d;

    /* renamed from: e  reason: collision with root package name */
    protected static final FutureTask<Void> f54649e;

    /* renamed from: a  reason: collision with root package name */
    protected final Runnable f54650a;

    /* renamed from: b  reason: collision with root package name */
    protected final boolean f54651b;

    /* renamed from: c  reason: collision with root package name */
    protected Thread f54652c;

    static {
        Runnable runnable = my.a.f39641b;
        f54648d = new FutureTask<>(runnable, null);
        f54649e = new FutureTask<>(runnable, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Runnable runnable, boolean z11) {
        this.f54650a = runnable;
        this.f54651b = z11;
    }

    private void a(Future<?> future) {
        if (this.f54652c == Thread.currentThread()) {
            future.cancel(false);
        } else {
            future.cancel(this.f54651b);
        }
    }

    public final void b(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f54648d) {
                return;
            }
            if (future2 == f54649e) {
                a(future);
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // iy.b
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == f54648d || future == (futureTask = f54649e) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        a(future);
    }

    @Override // iy.b
    public final boolean isDisposed() {
        Future<?> future = get();
        return future == f54648d || future == f54649e;
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        String str;
        Future<?> future = get();
        if (future == f54648d) {
            str = "Finished";
        } else if (future == f54649e) {
            str = "Disposed";
        } else if (this.f54652c != null) {
            str = "Running on " + this.f54652c;
        } else {
            str = "Waiting";
        }
        return getClass().getSimpleName() + "[" + str + "]";
    }
}