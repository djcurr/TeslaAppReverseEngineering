package io.sentry;

import io.sentry.u1;
import io.sentry.y3;
import java.io.Closeable;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;
import org.jetbrains.annotations.ApiStatus;

/* loaded from: classes5.dex */
public final class y implements c0 {

    /* renamed from: a */
    private final g3 f32706a;

    /* renamed from: b */
    private volatile boolean f32707b;

    /* renamed from: c */
    private final y3 f32708c;

    /* renamed from: d */
    private final d4 f32709d;

    /* renamed from: e */
    private final Map<Throwable, rz.k<i0, String>> f32710e;

    public y(g3 g3Var) {
        this(g3Var, v(g3Var));
    }

    public static /* synthetic */ void a(j0 j0Var, u1 u1Var) {
        u1Var.x(j0Var);
    }

    private void b(b3 b3Var) {
        rz.k<i0, String> kVar;
        if (!this.f32706a.isTracingEnabled() || b3Var.M() == null || (kVar = this.f32710e.get(rz.b.a(b3Var.M()))) == null) {
            return;
        }
        i0 a11 = kVar.a();
        if (b3Var.B().f() == null && a11 != null) {
            b3Var.B().n(a11.h());
        }
        String b11 = kVar.b();
        if (b3Var.q0() != null || b11 == null) {
            return;
        }
        b3Var.y0(b11);
    }

    private u1 c(u1 u1Var, v1 v1Var) {
        if (v1Var != null) {
            u1 u1Var2 = new u1(u1Var);
            v1Var.a(u1Var2);
            return u1Var2;
        }
        return u1Var;
    }

    private io.sentry.protocol.o t(b3 b3Var, t tVar, v1 v1Var) {
        io.sentry.protocol.o oVar = io.sentry.protocol.o.f32468b;
        if (!isEnabled()) {
            this.f32706a.getLogger().c(f3.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return oVar;
        } else if (b3Var == null) {
            this.f32706a.getLogger().c(f3.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return oVar;
        } else {
            try {
                b(b3Var);
                y3.a a11 = this.f32708c.a();
                return a11.a().a(b3Var, c(a11.c(), v1Var), tVar);
            } catch (Throwable th2) {
                d0 logger = this.f32706a.getLogger();
                f3 f3Var = f3.ERROR;
                logger.b(f3Var, "Error while capturing event with id: " + b3Var.E(), th2);
                return oVar;
            }
        }
    }

    private io.sentry.protocol.o u(Throwable th2, t tVar, v1 v1Var) {
        io.sentry.protocol.o oVar = io.sentry.protocol.o.f32468b;
        if (!isEnabled()) {
            this.f32706a.getLogger().c(f3.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
            return oVar;
        } else if (th2 == null) {
            this.f32706a.getLogger().c(f3.WARNING, "captureException called with null parameter.", new Object[0]);
            return oVar;
        } else {
            try {
                y3.a a11 = this.f32708c.a();
                b3 b3Var = new b3(th2);
                b(b3Var);
                return a11.a().a(b3Var, c(a11.c(), v1Var), tVar);
            } catch (Throwable th3) {
                d0 logger = this.f32706a.getLogger();
                f3 f3Var = f3.ERROR;
                logger.b(f3Var, "Error while capturing exception: " + th2.getMessage(), th3);
                return oVar;
            }
        }
    }

    private static y3.a v(g3 g3Var) {
        y(g3Var);
        return new y3.a(g3Var, new g2(g3Var), new u1(g3Var));
    }

    private j0 w(e4 e4Var, e eVar, boolean z11, Date date, boolean z12, Long l11, boolean z13, f4 f4Var) {
        final j0 j0Var;
        rz.j.a(e4Var, "transactionContext is required");
        if (!isEnabled()) {
            this.f32706a.getLogger().c(f3.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            j0Var = i1.i();
        } else if (!this.f32706a.isTracingEnabled()) {
            this.f32706a.getLogger().c(f3.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            j0Var = i1.i();
        } else {
            boolean a11 = this.f32709d.a(new t1(e4Var, eVar));
            e4Var.j(Boolean.valueOf(a11));
            o3 o3Var = new o3(e4Var, this, date, z12, l11, z13, f4Var);
            if (a11 && this.f32706a.isProfilingEnabled()) {
                this.f32706a.getTransactionProfiler().a(o3Var);
            }
            j0Var = o3Var;
        }
        if (z11) {
            i(new v1() { // from class: io.sentry.x
                @Override // io.sentry.v1
                public final void a(u1 u1Var) {
                    y.a(j0.this, u1Var);
                }
            });
        }
        return j0Var;
    }

    private static void y(g3 g3Var) {
        rz.j.a(g3Var, "SentryOptions is required.");
        if (g3Var.getDsn() == null || g3Var.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub if no DSN is available.");
        }
    }

    @Override // io.sentry.c0
    public void close() {
        if (!isEnabled()) {
            this.f32706a.getLogger().c(f3.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (m0 m0Var : this.f32706a.getIntegrations()) {
                if (m0Var instanceof Closeable) {
                    ((Closeable) m0Var).close();
                }
            }
            this.f32706a.getExecutorService().a(this.f32706a.getShutdownTimeoutMillis());
            this.f32708c.a().a().close();
        } catch (Throwable th2) {
            this.f32706a.getLogger().b(f3.ERROR, "Error while closing the Hub.", th2);
        }
        this.f32707b = false;
    }

    @Override // io.sentry.c0
    public void d(long j11) {
        if (!isEnabled()) {
            this.f32706a.getLogger().c(f3.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.f32708c.a().a().d(j11);
        } catch (Throwable th2) {
            this.f32706a.getLogger().b(f3.ERROR, "Error in the 'client.flush'.", th2);
        }
    }

    @Override // io.sentry.c0
    @ApiStatus.Internal
    public io.sentry.protocol.o f(i2 i2Var, t tVar) {
        rz.j.a(i2Var, "SentryEnvelope is required.");
        io.sentry.protocol.o oVar = io.sentry.protocol.o.f32468b;
        if (!isEnabled()) {
            this.f32706a.getLogger().c(f3.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return oVar;
        }
        try {
            io.sentry.protocol.o f11 = this.f32708c.a().a().f(i2Var, tVar);
            return f11 != null ? f11 : oVar;
        } catch (Throwable th2) {
            this.f32706a.getLogger().b(f3.ERROR, "Error while capturing envelope.", th2);
            return oVar;
        }
    }

    @Override // io.sentry.c0
    public g3 getOptions() {
        return this.f32708c.a().b();
    }

    @Override // io.sentry.c0
    public void h(c cVar, t tVar) {
        if (!isEnabled()) {
            this.f32706a.getLogger().c(f3.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (cVar == null) {
            this.f32706a.getLogger().c(f3.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            this.f32708c.a().c().b(cVar, tVar);
        }
    }

    @Override // io.sentry.c0
    public void i(v1 v1Var) {
        if (!isEnabled()) {
            this.f32706a.getLogger().c(f3.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            v1Var.a(this.f32708c.a().c());
        } catch (Throwable th2) {
            this.f32706a.getLogger().b(f3.ERROR, "Error in the 'configureScope' callback.", th2);
        }
    }

    @Override // io.sentry.c0
    public boolean isEnabled() {
        return this.f32707b;
    }

    @Override // io.sentry.c0
    @ApiStatus.Internal
    public void j(Throwable th2, i0 i0Var, String str) {
        rz.j.a(th2, "throwable is required");
        rz.j.a(i0Var, "span is required");
        rz.j.a(str, "transactionName is required");
        Throwable a11 = rz.b.a(th2);
        if (this.f32710e.containsKey(a11)) {
            return;
        }
        this.f32710e.put(a11, new rz.k<>(i0Var, str));
    }

    @Override // io.sentry.c0
    @ApiStatus.Internal
    public j0 k(e4 e4Var, e eVar, boolean z11, Date date, boolean z12, Long l11, boolean z13, f4 f4Var) {
        return w(e4Var, eVar, z11, date, z12, l11, z13, f4Var);
    }

    @Override // io.sentry.c0
    public void n() {
        if (!isEnabled()) {
            this.f32706a.getLogger().c(f3.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        y3.a a11 = this.f32708c.a();
        q3 f11 = a11.c().f();
        if (f11 != null) {
            a11.a().b(f11, rz.h.e(new oz.h()));
        }
    }

    @Override // io.sentry.c0
    public io.sentry.protocol.o o(b3 b3Var, t tVar) {
        return t(b3Var, tVar, null);
    }

    @Override // io.sentry.c0
    public io.sentry.protocol.o q(Throwable th2, t tVar) {
        return u(th2, tVar, null);
    }

    @Override // io.sentry.c0
    @ApiStatus.Internal
    public io.sentry.protocol.o r(io.sentry.protocol.v vVar, c4 c4Var, t tVar, q1 q1Var) {
        rz.j.a(vVar, "transaction is required");
        io.sentry.protocol.o oVar = io.sentry.protocol.o.f32468b;
        if (!isEnabled()) {
            this.f32706a.getLogger().c(f3.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return oVar;
        } else if (!vVar.k0()) {
            this.f32706a.getLogger().c(f3.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", vVar.E());
            return oVar;
        } else if (!Boolean.TRUE.equals(Boolean.valueOf(vVar.l0()))) {
            this.f32706a.getLogger().c(f3.DEBUG, "Transaction %s was dropped due to sampling decision.", vVar.E());
            this.f32706a.getClientReportRecorder().c(mz.e.SAMPLE_RATE, f.Transaction);
            return oVar;
        } else {
            try {
                y3.a a11 = this.f32708c.a();
                return a11.a().c(vVar, c4Var, a11.c(), tVar, q1Var);
            } catch (Throwable th2) {
                d0 logger = this.f32706a.getLogger();
                f3 f3Var = f3.ERROR;
                logger.b(f3Var, "Error while capturing transaction with id: " + vVar.E(), th2);
                return oVar;
            }
        }
    }

    @Override // io.sentry.c0
    public void s() {
        if (!isEnabled()) {
            this.f32706a.getLogger().c(f3.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        y3.a a11 = this.f32708c.a();
        u1.c z11 = a11.c().z();
        if (z11 != null) {
            if (z11.b() != null) {
                a11.a().b(z11.b(), rz.h.e(new oz.h()));
            }
            a11.a().b(z11.a(), rz.h.e(new oz.j()));
            return;
        }
        this.f32706a.getLogger().c(f3.WARNING, "Session could not be started.", new Object[0]);
    }

    private y(g3 g3Var, y3 y3Var) {
        this.f32710e = Collections.synchronizedMap(new WeakHashMap());
        y(g3Var);
        this.f32706a = g3Var;
        this.f32709d = new d4(g3Var);
        this.f32708c = y3Var;
        io.sentry.protocol.o oVar = io.sentry.protocol.o.f32468b;
        this.f32707b = true;
    }

    @Override // io.sentry.c0
    /* renamed from: clone */
    public c0 m150clone() {
        if (!isEnabled()) {
            this.f32706a.getLogger().c(f3.WARNING, "Disabled Hub cloned.", new Object[0]);
        }
        return new y(this.f32706a, new y3(this.f32708c));
    }

    private y(g3 g3Var, y3.a aVar) {
        this(g3Var, new y3(g3Var.getLogger(), aVar));
    }
}