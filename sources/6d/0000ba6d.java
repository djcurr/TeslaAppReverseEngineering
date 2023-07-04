package vy;

import hy.l;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class h extends l.c {

    /* renamed from: a */
    private final ScheduledExecutorService f54718a;

    /* renamed from: b */
    volatile boolean f54719b;

    public h(ThreadFactory threadFactory) {
        this.f54718a = n.a(threadFactory);
    }

    @Override // hy.l.c
    public iy.b b(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // hy.l.c
    public iy.b c(Runnable runnable, long j11, TimeUnit timeUnit) {
        if (this.f54719b) {
            return ly.b.INSTANCE;
        }
        return h(runnable, j11, timeUnit, null);
    }

    @Override // iy.b
    public void dispose() {
        if (this.f54719b) {
            return;
        }
        this.f54719b = true;
        this.f54718a.shutdownNow();
    }

    public m h(Runnable runnable, long j11, TimeUnit timeUnit, iy.c cVar) {
        Future<?> schedule;
        m mVar = new m(az.a.t(runnable), cVar);
        if (cVar == null || cVar.c(mVar)) {
            try {
                if (j11 <= 0) {
                    schedule = this.f54718a.submit((Callable) mVar);
                } else {
                    schedule = this.f54718a.schedule((Callable) mVar, j11, timeUnit);
                }
                mVar.a(schedule);
            } catch (RejectedExecutionException e11) {
                if (cVar != null) {
                    cVar.b(mVar);
                }
                az.a.r(e11);
            }
            return mVar;
        }
        return mVar;
    }

    public iy.b i(Runnable runnable, long j11, TimeUnit timeUnit) {
        Future<?> schedule;
        l lVar = new l(az.a.t(runnable), true);
        try {
            if (j11 <= 0) {
                schedule = this.f54718a.submit(lVar);
            } else {
                schedule = this.f54718a.schedule(lVar, j11, timeUnit);
            }
            lVar.b(schedule);
            return lVar;
        } catch (RejectedExecutionException e11) {
            az.a.r(e11);
            return ly.b.INSTANCE;
        }
    }

    @Override // iy.b
    public boolean isDisposed() {
        return this.f54719b;
    }

    public iy.b j(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        Future<?> schedule;
        Runnable t11 = az.a.t(runnable);
        if (j12 <= 0) {
            e eVar = new e(t11, this.f54718a);
            try {
                if (j11 <= 0) {
                    schedule = this.f54718a.submit(eVar);
                } else {
                    schedule = this.f54718a.schedule(eVar, j11, timeUnit);
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
            kVar.b(this.f54718a.scheduleAtFixedRate(kVar, j11, j12, timeUnit));
            return kVar;
        } catch (RejectedExecutionException e12) {
            az.a.r(e12);
            return ly.b.INSTANCE;
        }
    }

    public void k() {
        if (this.f54719b) {
            return;
        }
        this.f54719b = true;
        this.f54718a.shutdown();
    }
}