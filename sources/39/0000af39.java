package qz;

import io.sentry.d0;
import io.sentry.f3;
import io.sentry.g3;
import io.sentry.i2;
import io.sentry.r1;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import qz.d;
import rz.h;

/* loaded from: classes5.dex */
public final class d implements p {

    /* renamed from: a */
    private final v f48813a;

    /* renamed from: b */
    private final lz.e f48814b;

    /* renamed from: c */
    private final g3 f48815c;

    /* renamed from: d */
    private final y f48816d;

    /* renamed from: e */
    private final q f48817e;

    /* renamed from: f */
    private final n f48818f;

    /* loaded from: classes5.dex */
    public static final class b implements ThreadFactory {

        /* renamed from: a */
        private int f48819a;

        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryAsyncConnection-");
            int i11 = this.f48819a;
            this.f48819a = i11 + 1;
            sb2.append(i11);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* loaded from: classes5.dex */
    public final class c implements Runnable {

        /* renamed from: a */
        private final i2 f48820a;

        /* renamed from: b */
        private final io.sentry.t f48821b;

        /* renamed from: c */
        private final lz.e f48822c;

        /* renamed from: d */
        private final a0 f48823d = a0.a();

        c(i2 i2Var, io.sentry.t tVar, lz.e eVar) {
            d.this = r1;
            this.f48820a = (i2) rz.j.a(i2Var, "Envelope is required.");
            this.f48821b = tVar;
            this.f48822c = (lz.e) rz.j.a(eVar, "EnvelopeCache is required.");
        }

        public static /* synthetic */ void a(c cVar, i2 i2Var, Object obj, Class cls) {
            cVar.n(i2Var, obj, cls);
        }

        public static /* synthetic */ void b(c cVar, i2 i2Var, Object obj) {
            cVar.l(i2Var, obj);
        }

        public static /* synthetic */ void c(c cVar, oz.c cVar2) {
            cVar.k(cVar2);
        }

        public static /* synthetic */ void d(c cVar, Object obj, Class cls) {
            cVar.p(obj, cls);
        }

        public static /* synthetic */ void e(oz.f fVar) {
            fVar.c(true);
        }

        public static /* synthetic */ void f(oz.f fVar) {
            fVar.c(true);
        }

        public static /* synthetic */ void g(c cVar, a0 a0Var, oz.k kVar) {
            cVar.q(a0Var, kVar);
        }

        private a0 j() {
            a0 a0Var = this.f48823d;
            this.f48822c.R0(this.f48820a, this.f48821b);
            rz.h.m(this.f48821b, oz.c.class, new h.a() { // from class: qz.e
                @Override // rz.h.a
                public final void accept(Object obj) {
                    d.c.c(d.c.this, (oz.c) obj);
                }
            });
            if (d.this.f48817e.isConnected()) {
                final i2 d11 = d.this.f48815c.getClientReportRecorder().d(this.f48820a);
                try {
                    a0 h11 = d.this.f48818f.h(d11);
                    if (h11.d()) {
                        this.f48822c.a(this.f48820a);
                        return h11;
                    }
                    String str = "The transport failed to send the envelope with response code " + h11.c();
                    d.this.f48815c.getLogger().c(f3.ERROR, str, new Object[0]);
                    if (h11.c() >= 400 && h11.c() != 429) {
                        rz.h.l(this.f48821b, oz.f.class, new h.c() { // from class: qz.k
                            @Override // rz.h.c
                            public final void accept(Object obj) {
                                d.c.b(d.c.this, d11, obj);
                            }
                        });
                    }
                    throw new IllegalStateException(str);
                } catch (IOException e11) {
                    rz.h.n(this.f48821b, oz.f.class, new h.a() { // from class: qz.g
                        @Override // rz.h.a
                        public final void accept(Object obj) {
                            d.c.e((oz.f) obj);
                        }
                    }, new h.b() { // from class: qz.j
                        @Override // rz.h.b
                        public final void a(Object obj, Class cls) {
                            d.c.a(d.c.this, d11, obj, cls);
                        }
                    });
                    throw new IllegalStateException("Sending the event failed.", e11);
                }
            }
            rz.h.n(this.f48821b, oz.f.class, new h.a() { // from class: qz.h
                @Override // rz.h.a
                public final void accept(Object obj) {
                    d.c.f((oz.f) obj);
                }
            }, new h.b() { // from class: qz.i
                @Override // rz.h.b
                public final void a(Object obj, Class cls) {
                    d.c.d(d.c.this, obj, cls);
                }
            });
            return a0Var;
        }

        public /* synthetic */ void k(oz.c cVar) {
            cVar.a();
            d.this.f48815c.getLogger().c(f3.DEBUG, "Disk flush envelope fired", new Object[0]);
        }

        public /* synthetic */ void l(i2 i2Var, Object obj) {
            d.this.f48815c.getClientReportRecorder().b(mz.e.NETWORK_ERROR, i2Var);
        }

        public /* synthetic */ void n(i2 i2Var, Object obj, Class cls) {
            rz.i.a(cls, obj, d.this.f48815c.getLogger());
            d.this.f48815c.getClientReportRecorder().b(mz.e.NETWORK_ERROR, i2Var);
        }

        public /* synthetic */ void p(Object obj, Class cls) {
            rz.i.a(cls, obj, d.this.f48815c.getLogger());
            d.this.f48815c.getClientReportRecorder().b(mz.e.NETWORK_ERROR, this.f48820a);
        }

        public /* synthetic */ void q(a0 a0Var, oz.k kVar) {
            d.this.f48815c.getLogger().c(f3.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(a0Var.d()));
            kVar.b(a0Var.d());
        }

        @Override // java.lang.Runnable
        public void run() {
            final a0 a0Var = this.f48823d;
            try {
                a0Var = j();
                d.this.f48815c.getLogger().c(f3.DEBUG, "Envelope flushed", new Object[0]);
            } finally {
            }
        }
    }

    public d(g3 g3Var, y yVar, q qVar, r1 r1Var) {
        this(C(g3Var.getMaxQueueSize(), g3Var.getEnvelopeDiskCache(), g3Var.getLogger()), g3Var, yVar, qVar, new n(g3Var, r1Var, yVar));
    }

    private static v C(int i11, final lz.e eVar, final d0 d0Var) {
        return new v(1, i11, new b(), new RejectedExecutionHandler() { // from class: qz.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                d.a(eVar, d0Var, runnable, threadPoolExecutor);
            }
        }, d0Var);
    }

    public static /* synthetic */ void D(lz.e eVar, d0 d0Var, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (runnable instanceof c) {
            c cVar = (c) runnable;
            if (!rz.h.g(cVar.f48821b, oz.b.class)) {
                eVar.R0(cVar.f48820a, cVar.f48821b);
            }
            R(cVar.f48821b, true);
            d0Var.c(f3.WARNING, "Envelope rejected", new Object[0]);
        }
    }

    private static void R(io.sentry.t tVar, final boolean z11) {
        rz.h.m(tVar, oz.k.class, new h.a() { // from class: qz.c
            @Override // rz.h.a
            public final void accept(Object obj) {
                d.g((oz.k) obj);
            }
        });
        rz.h.m(tVar, oz.f.class, new h.a() { // from class: qz.b
            @Override // rz.h.a
            public final void accept(Object obj) {
                d.j(z11, (oz.f) obj);
            }
        });
    }

    public static /* synthetic */ void a(lz.e eVar, d0 d0Var, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        D(eVar, d0Var, runnable, threadPoolExecutor);
    }

    public static /* synthetic */ void g(oz.k kVar) {
        kVar.b(false);
    }

    public static /* synthetic */ void j(boolean z11, oz.f fVar) {
        fVar.c(z11);
    }

    @Override // qz.p
    public void E(i2 i2Var, io.sentry.t tVar) {
        lz.e eVar = this.f48814b;
        boolean z11 = false;
        if (rz.h.g(tVar, oz.b.class)) {
            eVar = r.b();
            this.f48815c.getLogger().c(f3.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z11 = true;
        }
        i2 d11 = this.f48816d.d(i2Var, tVar);
        if (d11 == null) {
            if (z11) {
                this.f48814b.a(i2Var);
                return;
            }
            return;
        }
        if (rz.h.g(tVar, oz.c.class)) {
            d11 = this.f48815c.getClientReportRecorder().d(d11);
        }
        Future<?> submit = this.f48813a.submit(new c(d11, tVar, eVar));
        if (submit == null || !submit.isCancelled()) {
            return;
        }
        this.f48815c.getClientReportRecorder().b(mz.e.QUEUE_OVERFLOW, d11);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f48813a.shutdown();
        this.f48815c.getLogger().c(f3.DEBUG, "Shutting down", new Object[0]);
        try {
            if (this.f48813a.awaitTermination(1L, TimeUnit.MINUTES)) {
                return;
            }
            this.f48815c.getLogger().c(f3.WARNING, "Failed to shutdown the async connection async sender within 1 minute. Trying to force it now.", new Object[0]);
            this.f48813a.shutdownNow();
        } catch (InterruptedException unused) {
            this.f48815c.getLogger().c(f3.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // qz.p
    public void d(long j11) {
        this.f48813a.b(j11);
    }

    public d(v vVar, g3 g3Var, y yVar, q qVar, n nVar) {
        this.f48813a = (v) rz.j.a(vVar, "executor is required");
        this.f48814b = (lz.e) rz.j.a(g3Var.getEnvelopeDiskCache(), "envelopeCache is required");
        this.f48815c = (g3) rz.j.a(g3Var, "options is required");
        this.f48816d = (y) rz.j.a(yVar, "rateLimiter is required");
        this.f48817e = (q) rz.j.a(qVar, "transportGate is required");
        this.f48818f = (n) rz.j.a(nVar, "httpConnection is required");
    }
}