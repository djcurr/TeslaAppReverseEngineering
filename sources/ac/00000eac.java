package c0;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b<I, O> extends d<O> implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    private c0.a<? super I, ? extends O> f8351c;

    /* renamed from: d  reason: collision with root package name */
    private final BlockingQueue<Boolean> f8352d = new LinkedBlockingQueue(1);

    /* renamed from: e  reason: collision with root package name */
    private final CountDownLatch f8353e = new CountDownLatch(1);

    /* renamed from: f  reason: collision with root package name */
    private com.google.common.util.concurrent.c<? extends I> f8354f;

    /* renamed from: g  reason: collision with root package name */
    volatile com.google.common.util.concurrent.c<? extends O> f8355g;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.c f8356a;

        a(com.google.common.util.concurrent.c cVar) {
            this.f8356a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    b.this.c(f.e(this.f8356a));
                } catch (CancellationException unused) {
                    b.this.cancel(false);
                    b.this.f8355g = null;
                    return;
                } catch (ExecutionException e11) {
                    b.this.d(e11.getCause());
                }
                b.this.f8355g = null;
            } catch (Throwable th2) {
                b.this.f8355g = null;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(c0.a<? super I, ? extends O> aVar, com.google.common.util.concurrent.c<? extends I> cVar) {
        this.f8351c = (c0.a) v3.h.f(aVar);
        this.f8354f = (com.google.common.util.concurrent.c) v3.h.f(cVar);
    }

    private void g(Future<?> future, boolean z11) {
        if (future != null) {
            future.cancel(z11);
        }
    }

    private <E> void h(BlockingQueue<E> blockingQueue, E e11) {
        boolean z11 = false;
        while (true) {
            try {
                blockingQueue.put(e11);
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    private <E> E i(BlockingQueue<E> blockingQueue) {
        E take;
        boolean z11 = false;
        while (true) {
            try {
                take = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    @Override // c0.d, java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        if (super.cancel(z11)) {
            h(this.f8352d, Boolean.valueOf(z11));
            g(this.f8354f, z11);
            g(this.f8355g, z11);
            return true;
        }
        return false;
    }

    @Override // c0.d, java.util.concurrent.Future
    public O get() {
        if (!isDone()) {
            com.google.common.util.concurrent.c<? extends I> cVar = this.f8354f;
            if (cVar != null) {
                cVar.get();
            }
            this.f8353e.await();
            com.google.common.util.concurrent.c<? extends O> cVar2 = this.f8355g;
            if (cVar2 != null) {
                cVar2.get();
            }
        }
        return (O) super.get();
    }

    @Override // java.lang.Runnable
    public void run() {
        com.google.common.util.concurrent.c<? extends O> apply;
        try {
        } catch (Exception e11) {
            d(e11);
        }
        try {
            try {
                try {
                    apply = this.f8351c.apply(f.e(this.f8354f));
                    this.f8355g = apply;
                } catch (Error e12) {
                    d(e12);
                } catch (UndeclaredThrowableException e13) {
                    d(e13.getCause());
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e14) {
                d(e14.getCause());
            }
            if (isCancelled()) {
                apply.cancel(((Boolean) i(this.f8352d)).booleanValue());
                this.f8355g = null;
                this.f8351c = null;
                this.f8354f = null;
                this.f8353e.countDown();
                return;
            }
            apply.a(new a(apply), b0.a.a());
            this.f8351c = null;
            this.f8354f = null;
            this.f8353e.countDown();
        } catch (Throwable th2) {
            this.f8351c = null;
            this.f8354f = null;
            this.f8353e.countDown();
            throw th2;
        }
    }

    @Override // c0.d, java.util.concurrent.Future
    public O get(long j11, TimeUnit timeUnit) {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j11 = timeUnit2.convert(j11, timeUnit);
                timeUnit = timeUnit2;
            }
            com.google.common.util.concurrent.c<? extends I> cVar = this.f8354f;
            if (cVar != null) {
                long nanoTime = System.nanoTime();
                cVar.get(j11, timeUnit);
                j11 -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.f8353e.await(j11, timeUnit)) {
                j11 -= Math.max(0L, System.nanoTime() - nanoTime2);
                com.google.common.util.concurrent.c<? extends O> cVar2 = this.f8355g;
                if (cVar2 != null) {
                    cVar2.get(j11, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j11, timeUnit);
    }
}