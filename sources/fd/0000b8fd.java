package v20;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class r1 extends q1 implements x0 {

    /* renamed from: b  reason: collision with root package name */
    private final Executor f53995b;

    public r1(Executor executor) {
        this.f53995b = executor;
        kotlinx.coroutines.internal.f.a(R0());
    }

    private final void S0(zz.g gVar, RejectedExecutionException rejectedExecutionException) {
        d2.d(gVar, p1.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture<?> X0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, zz.g gVar, long j11) {
        try {
            return scheduledExecutorService.schedule(runnable, j11, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e11) {
            S0(gVar, e11);
            return null;
        }
    }

    @Override // v20.j0
    public void I0(zz.g gVar, Runnable runnable) {
        try {
            Executor R0 = R0();
            c.a();
            R0.execute(runnable);
        } catch (RejectedExecutionException e11) {
            c.a();
            S0(gVar, e11);
            e1.b().I0(gVar, runnable);
        }
    }

    @Override // v20.x0
    public void J(long j11, o<? super vz.b0> oVar) {
        Executor R0 = R0();
        ScheduledExecutorService scheduledExecutorService = R0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) R0 : null;
        ScheduledFuture<?> X0 = scheduledExecutorService != null ? X0(scheduledExecutorService, new t2(this, oVar), oVar.getContext(), j11) : null;
        if (X0 != null) {
            d2.j(oVar, X0);
        } else {
            t0.f54000g.J(j11, oVar);
        }
    }

    @Override // v20.q1
    public Executor R0() {
        return this.f53995b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor R0 = R0();
        ExecutorService executorService = R0 instanceof ExecutorService ? (ExecutorService) R0 : null;
        if (executorService == null) {
            return;
        }
        executorService.shutdown();
    }

    public boolean equals(Object obj) {
        return (obj instanceof r1) && ((r1) obj).R0() == R0();
    }

    public int hashCode() {
        return System.identityHashCode(R0());
    }

    @Override // v20.x0
    public g1 l(long j11, Runnable runnable, zz.g gVar) {
        Executor R0 = R0();
        ScheduledExecutorService scheduledExecutorService = R0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) R0 : null;
        ScheduledFuture<?> X0 = scheduledExecutorService != null ? X0(scheduledExecutorService, runnable, gVar, j11) : null;
        if (X0 != null) {
            return new f1(X0);
        }
        return t0.f54000g.l(j11, runnable, gVar);
    }

    @Override // v20.j0
    public String toString() {
        return R0().toString();
    }
}