package io.grpc.internal;

import io.grpc.internal.s;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class b1 {

    /* renamed from: l  reason: collision with root package name */
    private static final long f30696l = TimeUnit.SECONDS.toNanos(10);

    /* renamed from: m  reason: collision with root package name */
    private static final long f30697m = TimeUnit.MILLISECONDS.toNanos(10);

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f30698a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.common.base.y f30699b;

    /* renamed from: c  reason: collision with root package name */
    private final d f30700c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f30701d;

    /* renamed from: e  reason: collision with root package name */
    private e f30702e;

    /* renamed from: f  reason: collision with root package name */
    private ScheduledFuture<?> f30703f;

    /* renamed from: g  reason: collision with root package name */
    private ScheduledFuture<?> f30704g;

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f30705h;

    /* renamed from: i  reason: collision with root package name */
    private final Runnable f30706i;

    /* renamed from: j  reason: collision with root package name */
    private final long f30707j;

    /* renamed from: k  reason: collision with root package name */
    private final long f30708k;

    /* loaded from: classes5.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z11;
            synchronized (b1.this) {
                e eVar = b1.this.f30702e;
                e eVar2 = e.DISCONNECTED;
                if (eVar != eVar2) {
                    b1.this.f30702e = eVar2;
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                b1.this.f30700c.b();
            }
        }
    }

    /* loaded from: classes5.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z11;
            synchronized (b1.this) {
                b1.this.f30704g = null;
                e eVar = b1.this.f30702e;
                e eVar2 = e.PING_SCHEDULED;
                if (eVar != eVar2) {
                    if (b1.this.f30702e == e.PING_DELAYED) {
                        b1 b1Var = b1.this;
                        ScheduledExecutorService scheduledExecutorService = b1Var.f30698a;
                        Runnable runnable = b1.this.f30706i;
                        long j11 = b1.this.f30707j;
                        com.google.common.base.y yVar = b1.this.f30699b;
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        b1Var.f30704g = scheduledExecutorService.schedule(runnable, j11 - yVar.d(timeUnit), timeUnit);
                        b1.this.f30702e = eVar2;
                    }
                    z11 = false;
                } else {
                    z11 = true;
                    b1.this.f30702e = e.PING_SENT;
                    b1 b1Var2 = b1.this;
                    b1Var2.f30703f = b1Var2.f30698a.schedule(b1.this.f30705h, b1.this.f30708k, TimeUnit.NANOSECONDS);
                }
            }
            if (z11) {
                b1.this.f30700c.a();
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements d {

        /* renamed from: a  reason: collision with root package name */
        private final v f30711a;

        /* loaded from: classes5.dex */
        class a implements s.a {
            a() {
            }

            @Override // io.grpc.internal.s.a
            public void a(long j11) {
            }

            @Override // io.grpc.internal.s.a
            public void onFailure(Throwable th2) {
                c.this.f30711a.b(io.grpc.f1.f30571o.r("Keepalive failed. The connection is likely gone"));
            }
        }

        public c(v vVar) {
            this.f30711a = vVar;
        }

        @Override // io.grpc.internal.b1.d
        public void a() {
            this.f30711a.d(new a(), com.google.common.util.concurrent.d.a());
        }

        @Override // io.grpc.internal.b1.d
        public void b() {
            this.f30711a.b(io.grpc.f1.f30571o.r("Keepalive failed. The connection is likely gone"));
        }
    }

    /* loaded from: classes5.dex */
    public interface d {
        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public enum e {
        IDLE,
        PING_SCHEDULED,
        PING_DELAYED,
        PING_SENT,
        IDLE_AND_PING_SENT,
        DISCONNECTED
    }

    public b1(d dVar, ScheduledExecutorService scheduledExecutorService, long j11, long j12, boolean z11) {
        this(dVar, scheduledExecutorService, com.google.common.base.y.c(), j11, j12, z11);
    }

    public static long l(long j11) {
        return Math.max(j11, f30696l);
    }

    public static long m(long j11) {
        return Math.max(j11, f30697m);
    }

    public synchronized void n() {
        this.f30699b.f().g();
        e eVar = this.f30702e;
        e eVar2 = e.PING_SCHEDULED;
        if (eVar == eVar2) {
            this.f30702e = e.PING_DELAYED;
        } else if (eVar == e.PING_SENT || eVar == e.IDLE_AND_PING_SENT) {
            ScheduledFuture<?> scheduledFuture = this.f30703f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            if (this.f30702e == e.IDLE_AND_PING_SENT) {
                this.f30702e = e.IDLE;
                return;
            }
            this.f30702e = eVar2;
            com.google.common.base.u.v(this.f30704g == null, "There should be no outstanding pingFuture");
            this.f30704g = this.f30698a.schedule(this.f30706i, this.f30707j, TimeUnit.NANOSECONDS);
        }
    }

    public synchronized void o() {
        e eVar = this.f30702e;
        if (eVar == e.IDLE) {
            this.f30702e = e.PING_SCHEDULED;
            if (this.f30704g == null) {
                ScheduledExecutorService scheduledExecutorService = this.f30698a;
                Runnable runnable = this.f30706i;
                long j11 = this.f30707j;
                com.google.common.base.y yVar = this.f30699b;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                this.f30704g = scheduledExecutorService.schedule(runnable, j11 - yVar.d(timeUnit), timeUnit);
            }
        } else if (eVar == e.IDLE_AND_PING_SENT) {
            this.f30702e = e.PING_SENT;
        }
    }

    public synchronized void p() {
        if (this.f30701d) {
            return;
        }
        e eVar = this.f30702e;
        if (eVar == e.PING_SCHEDULED || eVar == e.PING_DELAYED) {
            this.f30702e = e.IDLE;
        }
        if (this.f30702e == e.PING_SENT) {
            this.f30702e = e.IDLE_AND_PING_SENT;
        }
    }

    public synchronized void q() {
        if (this.f30701d) {
            o();
        }
    }

    public synchronized void r() {
        e eVar = this.f30702e;
        e eVar2 = e.DISCONNECTED;
        if (eVar != eVar2) {
            this.f30702e = eVar2;
            ScheduledFuture<?> scheduledFuture = this.f30703f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledFuture<?> scheduledFuture2 = this.f30704g;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                this.f30704g = null;
            }
        }
    }

    b1(d dVar, ScheduledExecutorService scheduledExecutorService, com.google.common.base.y yVar, long j11, long j12, boolean z11) {
        this.f30702e = e.IDLE;
        this.f30705h = new c1(new a());
        this.f30706i = new c1(new b());
        this.f30700c = (d) com.google.common.base.u.p(dVar, "keepAlivePinger");
        this.f30698a = (ScheduledExecutorService) com.google.common.base.u.p(scheduledExecutorService, "scheduler");
        this.f30699b = (com.google.common.base.y) com.google.common.base.u.p(yVar, "stopwatch");
        this.f30707j = j11;
        this.f30708k = j12;
        this.f30701d = z11;
        yVar.f().g();
    }
}