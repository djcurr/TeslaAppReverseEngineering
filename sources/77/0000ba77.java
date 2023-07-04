package vy;

import hy.l;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class o extends hy.l {

    /* renamed from: d  reason: collision with root package name */
    static final j f54732d;

    /* renamed from: e  reason: collision with root package name */
    static final ScheduledExecutorService f54733e;

    /* renamed from: c  reason: collision with root package name */
    final AtomicReference<ScheduledExecutorService> f54734c;

    /* loaded from: classes5.dex */
    static final class a extends l.c {

        /* renamed from: a  reason: collision with root package name */
        final ScheduledExecutorService f54735a;

        /* renamed from: b  reason: collision with root package name */
        final iy.a f54736b = new iy.a();

        /* renamed from: c  reason: collision with root package name */
        volatile boolean f54737c;

        a(ScheduledExecutorService scheduledExecutorService) {
            this.f54735a = scheduledExecutorService;
        }

        @Override // hy.l.c
        public iy.b c(Runnable runnable, long j11, TimeUnit timeUnit) {
            Future<?> schedule;
            if (this.f54737c) {
                return ly.b.INSTANCE;
            }
            m mVar = new m(az.a.t(runnable), this.f54736b);
            this.f54736b.c(mVar);
            try {
                if (j11 <= 0) {
                    schedule = this.f54735a.submit((Callable) mVar);
                } else {
                    schedule = this.f54735a.schedule((Callable) mVar, j11, timeUnit);
                }
                mVar.a(schedule);
                return mVar;
            } catch (RejectedExecutionException e11) {
                dispose();
                az.a.r(e11);
                return ly.b.INSTANCE;
            }
        }

        @Override // iy.b
        public void dispose() {
            if (this.f54737c) {
                return;
            }
            this.f54737c = true;
            this.f54736b.dispose();
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f54737c;
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f54733e = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        f54732d = new j("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())), true);
    }

    public o() {
        this(f54732d);
    }

    static ScheduledExecutorService g(ThreadFactory threadFactory) {
        return n.a(threadFactory);
    }

    @Override // hy.l
    public l.c c() {
        return new a(this.f54734c.get());
    }

    @Override // hy.l
    public iy.b e(Runnable runnable, long j11, TimeUnit timeUnit) {
        Future<?> schedule;
        l lVar = new l(az.a.t(runnable), true);
        try {
            if (j11 <= 0) {
                schedule = this.f54734c.get().submit(lVar);
            } else {
                schedule = this.f54734c.get().schedule(lVar, j11, timeUnit);
            }
            lVar.b(schedule);
            return lVar;
        } catch (RejectedExecutionException e11) {
            az.a.r(e11);
            return ly.b.INSTANCE;
        }
    }

    @Override // hy.l
    public iy.b f(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        Future<?> schedule;
        Runnable t11 = az.a.t(runnable);
        if (j12 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.f54734c.get();
            e eVar = new e(t11, scheduledExecutorService);
            try {
                if (j11 <= 0) {
                    schedule = scheduledExecutorService.submit(eVar);
                } else {
                    schedule = scheduledExecutorService.schedule(eVar, j11, timeUnit);
                }
                eVar.b(schedule);
                return eVar;
            } catch (RejectedExecutionException e11) {
                az.a.r(e11);
                return ly.b.INSTANCE;
            }
        }
        k kVar = new k(t11, true);
        try {
            kVar.b(this.f54734c.get().scheduleAtFixedRate(kVar, j11, j12, timeUnit));
            return kVar;
        } catch (RejectedExecutionException e12) {
            az.a.r(e12);
            return ly.b.INSTANCE;
        }
    }

    public o(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f54734c = atomicReference;
        atomicReference.lazySet(g(threadFactory));
    }
}