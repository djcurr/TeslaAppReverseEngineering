package v20;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import v20.l1;

/* loaded from: classes5.dex */
public final class t0 extends l1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: g  reason: collision with root package name */
    public static final t0 f54000g;

    /* renamed from: h  reason: collision with root package name */
    private static final long f54001h;

    static {
        Long l11;
        t0 t0Var = new t0();
        f54000g = t0Var;
        k1.p1(t0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l11 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l11 = 1000L;
        }
        f54001h = timeUnit.toNanos(l11.longValue());
    }

    private t0() {
    }

    private final synchronized void a2() {
        if (d2()) {
            debugStatus = 3;
            U1();
            notifyAll();
        }
    }

    private final synchronized Thread b2() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean c2() {
        return debugStatus == 4;
    }

    private final boolean d2() {
        int i11 = debugStatus;
        return i11 == 2 || i11 == 3;
    }

    private final synchronized boolean e2() {
        if (d2()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private final void f2() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // v20.m1
    protected Thread F1() {
        Thread thread = _thread;
        return thread == null ? b2() : thread;
    }

    @Override // v20.m1
    protected void K1(long j11, l1.c cVar) {
        f2();
    }

    @Override // v20.l1
    public void P1(Runnable runnable) {
        if (c2()) {
            f2();
        }
        super.P1(runnable);
    }

    @Override // v20.l1, v20.x0
    public g1 l(long j11, Runnable runnable, zz.g gVar) {
        return X1(j11, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean S1;
        a3.f53889a.d(this);
        c.a();
        try {
            if (!e2()) {
                if (S1) {
                    return;
                }
                return;
            }
            long j11 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long y12 = y1();
                if (y12 == Long.MAX_VALUE) {
                    c.a();
                    long nanoTime = System.nanoTime();
                    if (j11 == Long.MAX_VALUE) {
                        j11 = f54001h + nanoTime;
                    }
                    long j12 = j11 - nanoTime;
                    if (j12 <= 0) {
                        _thread = null;
                        a2();
                        c.a();
                        if (S1()) {
                            return;
                        }
                        F1();
                        return;
                    }
                    y12 = m00.l.j(y12, j12);
                } else {
                    j11 = Long.MAX_VALUE;
                }
                if (y12 > 0) {
                    if (d2()) {
                        _thread = null;
                        a2();
                        c.a();
                        if (S1()) {
                            return;
                        }
                        F1();
                        return;
                    }
                    c.a();
                    LockSupport.parkNanos(this, y12);
                }
            }
        } finally {
            _thread = null;
            a2();
            c.a();
            if (!S1()) {
                F1();
            }
        }
    }

    @Override // v20.l1, v20.k1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}