package io.sentry;

import io.sentry.exception.SentryEnvelopeException;
import io.sentry.g3;
import io.sentry.q3;
import io.sentry.u1;
import java.io.Closeable;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* loaded from: classes5.dex */
public final class g2 implements f0 {

    /* renamed from: a */
    private final g3 f32261a;

    /* renamed from: b */
    private final qz.p f32262b;

    /* renamed from: c */
    private final SecureRandom f32263c;

    /* renamed from: d */
    private final b f32264d = new b();

    /* loaded from: classes5.dex */
    public static final class b implements Comparator<c> {
        private b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            return cVar.j().compareTo(cVar2.j());
        }
    }

    public g2(g3 g3Var) {
        this.f32261a = (g3) rz.j.a(g3Var, "SentryOptions is required.");
        l0 transportFactory = g3Var.getTransportFactory();
        if (transportFactory instanceof k1) {
            transportFactory = new io.sentry.a();
            g3Var.setTransportFactory(transportFactory);
        }
        this.f32262b = transportFactory.a(g3Var, new s1(g3Var).a());
        this.f32263c = g3Var.getSampleRate() != null ? new SecureRandom() : null;
    }

    public static /* synthetic */ void e(q3 q3Var) {
        o(q3Var);
    }

    public static /* synthetic */ void g(g2 g2Var, b3 b3Var, t tVar, q3 q3Var) {
        g2Var.p(b3Var, tVar, q3Var);
    }

    private void h(u1 u1Var, t tVar) {
        if (u1Var != null) {
            tVar.a(u1Var.h());
        }
    }

    private <T extends d2> T i(T t11, u1 u1Var) {
        if (u1Var != null) {
            if (t11.I() == null) {
                t11.W(u1Var.o());
            }
            if (t11.O() == null) {
                t11.b0(u1Var.t());
            }
            if (t11.L() == null) {
                t11.a0(new HashMap(u1Var.q()));
            } else {
                for (Map.Entry<String, String> entry : u1Var.q().entrySet()) {
                    if (!t11.L().containsKey(entry.getKey())) {
                        t11.L().put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (t11.A() == null) {
                t11.P(new ArrayList(u1Var.i()));
            } else {
                v(t11, u1Var.i());
            }
            if (t11.F() == null) {
                t11.T(new HashMap(u1Var.l()));
            } else {
                for (Map.Entry<String, Object> entry2 : u1Var.l().entrySet()) {
                    if (!t11.F().containsKey(entry2.getKey())) {
                        t11.F().put(entry2.getKey(), entry2.getValue());
                    }
                }
            }
            io.sentry.protocol.c B = t11.B();
            for (Map.Entry<String, Object> entry3 : new io.sentry.protocol.c(u1Var.j()).entrySet()) {
                if (!B.containsKey(entry3.getKey())) {
                    B.put(entry3.getKey(), entry3.getValue());
                }
            }
        }
        return t11;
    }

    private b3 j(b3 b3Var, u1 u1Var, t tVar) {
        if (u1Var != null) {
            i(b3Var, u1Var);
            if (b3Var.q0() == null) {
                b3Var.y0(u1Var.s());
            }
            if (b3Var.o0() == null) {
                b3Var.v0(u1Var.m());
            }
            if (u1Var.n() != null) {
                b3Var.w0(u1Var.n());
            }
            i0 p11 = u1Var.p();
            if (b3Var.B().f() == null && p11 != null) {
                b3Var.B().n(p11.h());
            }
            return q(b3Var, tVar, u1Var.k());
        }
        return b3Var;
    }

    private i2 k(d2 d2Var, List<io.sentry.b> list, q3 q3Var, c4 c4Var, q1 q1Var) {
        io.sentry.protocol.o oVar;
        ArrayList arrayList = new ArrayList();
        if (d2Var != null) {
            arrayList.add(z2.r(this.f32261a.getSerializer(), d2Var));
            oVar = d2Var.E();
        } else {
            oVar = null;
        }
        if (q3Var != null) {
            arrayList.add(z2.t(this.f32261a.getSerializer(), q3Var));
        }
        if (q1Var != null) {
            arrayList.add(z2.s(q1Var, this.f32261a.getMaxTraceFileSize(), this.f32261a.getSerializer()));
        }
        if (list != null) {
            for (io.sentry.b bVar : list) {
                arrayList.add(z2.p(bVar, this.f32261a.getMaxAttachmentSize()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new i2(new j2(oVar, this.f32261a.getSdkVersion(), c4Var), arrayList);
    }

    private b3 l(b3 b3Var, t tVar) {
        g3.b beforeSend = this.f32261a.getBeforeSend();
        if (beforeSend != null) {
            try {
                return beforeSend.a(b3Var, tVar);
            } catch (Throwable th2) {
                this.f32261a.getLogger().b(f3.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th2);
                c cVar = new c();
                cVar.o("BeforeSend callback failed.");
                cVar.l("SentryClient");
                cVar.n(f3.ERROR);
                if (th2.getMessage() != null) {
                    cVar.m("sentry:message", th2.getMessage());
                }
                b3Var.z(cVar);
                return b3Var;
            }
        }
        return b3Var;
    }

    private List<io.sentry.b> m(List<io.sentry.b> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (io.sentry.b bVar : list) {
            if (bVar.g()) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private List<io.sentry.b> n(t tVar) {
        List<io.sentry.b> c11 = tVar.c();
        io.sentry.b d11 = tVar.d();
        if (d11 != null) {
            c11.add(d11);
        }
        return c11;
    }

    public static /* synthetic */ void o(q3 q3Var) {
    }

    public /* synthetic */ void p(b3 b3Var, t tVar, q3 q3Var) {
        boolean z11 = false;
        if (q3Var != null) {
            String str = null;
            q3.b bVar = b3Var.r0() ? q3.b.Crashed : null;
            z11 = (q3.b.Crashed == bVar || b3Var.s0()) ? true : true;
            if (b3Var.I() != null && b3Var.I().i() != null && b3Var.I().i().containsKey("user-agent")) {
                str = b3Var.I().i().get("user-agent");
            }
            if (q3Var.m(bVar, str, z11) && rz.h.g(tVar, oz.c.class)) {
                q3Var.c();
                return;
            }
            return;
        }
        this.f32261a.getLogger().c(f3.INFO, "Session is null on scope.withSession", new Object[0]);
    }

    private b3 q(b3 b3Var, t tVar, List<r> list) {
        Iterator<r> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            r next = it2.next();
            try {
                b3Var = next.a(b3Var, tVar);
                continue;
            } catch (Throwable th2) {
                this.f32261a.getLogger().a(f3.ERROR, th2, "An exception occurred while processing event by processor: %s", next.getClass().getName());
                continue;
            }
            if (b3Var == null) {
                this.f32261a.getLogger().c(f3.DEBUG, "Event was dropped by a processor: %s", next.getClass().getName());
                this.f32261a.getClientReportRecorder().c(mz.e.EVENT_PROCESSOR, f.Error);
                break;
            }
        }
        return b3Var;
    }

    private io.sentry.protocol.v r(io.sentry.protocol.v vVar, t tVar, List<r> list) {
        Iterator<r> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            r next = it2.next();
            try {
                vVar = next.g(vVar, tVar);
                continue;
            } catch (Throwable th2) {
                this.f32261a.getLogger().a(f3.ERROR, th2, "An exception occurred while processing transaction by processor: %s", next.getClass().getName());
                continue;
            }
            if (vVar == null) {
                this.f32261a.getLogger().c(f3.DEBUG, "Transaction was dropped by a processor: %s", next.getClass().getName());
                this.f32261a.getClientReportRecorder().c(mz.e.EVENT_PROCESSOR, f.Transaction);
                break;
            }
        }
        return vVar;
    }

    private boolean s() {
        return this.f32261a.getSampleRate() == null || this.f32263c == null || this.f32261a.getSampleRate().doubleValue() >= this.f32263c.nextDouble();
    }

    private boolean t(d2 d2Var, t tVar) {
        if (rz.h.q(tVar)) {
            return true;
        }
        this.f32261a.getLogger().c(f3.DEBUG, "Event was cached so not applying scope: %s", d2Var.E());
        return false;
    }

    private boolean u(q3 q3Var, q3 q3Var2) {
        if (q3Var2 == null) {
            return false;
        }
        if (q3Var == null) {
            return true;
        }
        q3.b j11 = q3Var2.j();
        q3.b bVar = q3.b.Crashed;
        if (j11 == bVar && q3Var.j() != bVar) {
            return true;
        }
        return q3Var2.e() > 0 && q3Var.e() <= 0;
    }

    private void v(d2 d2Var, Collection<c> collection) {
        List<c> A = d2Var.A();
        if (A == null || collection.isEmpty()) {
            return;
        }
        A.addAll(collection);
        Collections.sort(A, this.f32264d);
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0126 A[Catch: SentryEnvelopeException -> 0x011a, IOException -> 0x011c, TryCatch #2 {SentryEnvelopeException -> 0x011a, IOException -> 0x011c, blocks: (B:117:0x010a, B:119:0x0110, B:129:0x0126, B:130:0x012a, B:132:0x0133), top: B:136:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0133 A[Catch: SentryEnvelopeException -> 0x011a, IOException -> 0x011c, TRY_LEAVE, TryCatch #2 {SentryEnvelopeException -> 0x011a, IOException -> 0x011c, blocks: (B:117:0x010a, B:119:0x0110, B:129:0x0126, B:130:0x012a, B:132:0x0133), top: B:136:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    @Override // io.sentry.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.sentry.protocol.o a(io.sentry.b3 r13, io.sentry.u1 r14, io.sentry.t r15) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.g2.a(io.sentry.b3, io.sentry.u1, io.sentry.t):io.sentry.protocol.o");
    }

    @Override // io.sentry.f0
    @ApiStatus.Internal
    public void b(q3 q3Var, t tVar) {
        rz.j.a(q3Var, "Session is required.");
        if (q3Var.g() != null && !q3Var.g().isEmpty()) {
            try {
                f(i2.a(this.f32261a.getSerializer(), q3Var, this.f32261a.getSdkVersion()), tVar);
                return;
            } catch (IOException e11) {
                this.f32261a.getLogger().b(f3.ERROR, "Failed to capture session.", e11);
                return;
            }
        }
        this.f32261a.getLogger().c(f3.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
    }

    @Override // io.sentry.f0
    public io.sentry.protocol.o c(io.sentry.protocol.v vVar, c4 c4Var, u1 u1Var, t tVar, q1 q1Var) {
        io.sentry.protocol.v vVar2 = vVar;
        rz.j.a(vVar, "Transaction is required.");
        t tVar2 = tVar == null ? new t() : tVar;
        if (t(vVar, tVar2)) {
            h(u1Var, tVar2);
        }
        d0 logger = this.f32261a.getLogger();
        f3 f3Var = f3.DEBUG;
        logger.c(f3Var, "Capturing transaction: %s", vVar.E());
        io.sentry.protocol.o oVar = io.sentry.protocol.o.f32468b;
        io.sentry.protocol.o E = vVar.E() != null ? vVar.E() : oVar;
        if (t(vVar, tVar2)) {
            vVar2 = (io.sentry.protocol.v) i(vVar, u1Var);
            if (vVar2 != null && u1Var != null) {
                vVar2 = r(vVar2, tVar2, u1Var.k());
            }
            if (vVar2 == null) {
                this.f32261a.getLogger().c(f3Var, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (vVar2 != null) {
            vVar2 = r(vVar2, tVar2, this.f32261a.getEventProcessors());
        }
        io.sentry.protocol.v vVar3 = vVar2;
        if (vVar3 == null) {
            this.f32261a.getLogger().c(f3Var, "Transaction was dropped by Event processors.", new Object[0]);
            return oVar;
        }
        try {
            i2 k11 = k(vVar3, m(n(tVar2)), null, c4Var, q1Var);
            if (k11 != null) {
                this.f32262b.E(k11, tVar2);
                return E;
            }
            return oVar;
        } catch (SentryEnvelopeException | IOException e11) {
            this.f32261a.getLogger().a(f3.WARNING, e11, "Capturing transaction %s failed.", E);
            return io.sentry.protocol.o.f32468b;
        }
    }

    @Override // io.sentry.f0
    public void close() {
        this.f32261a.getLogger().c(f3.INFO, "Closing SentryClient.", new Object[0]);
        try {
            d(this.f32261a.getShutdownTimeoutMillis());
            this.f32262b.close();
        } catch (IOException e11) {
            this.f32261a.getLogger().b(f3.WARNING, "Failed to close the connection to the Sentry Server.", e11);
        }
        for (r rVar : this.f32261a.getEventProcessors()) {
            if (rVar instanceof Closeable) {
                try {
                    ((Closeable) rVar).close();
                } catch (IOException e12) {
                    this.f32261a.getLogger().c(f3.WARNING, "Failed to close the event processor {}.", rVar, e12);
                }
            }
        }
    }

    @Override // io.sentry.f0
    public void d(long j11) {
        this.f32262b.d(j11);
    }

    @Override // io.sentry.f0
    @ApiStatus.Internal
    public io.sentry.protocol.o f(i2 i2Var, t tVar) {
        rz.j.a(i2Var, "SentryEnvelope is required.");
        if (tVar == null) {
            tVar = new t();
        }
        try {
            this.f32262b.E(i2Var, tVar);
            io.sentry.protocol.o a11 = i2Var.b().a();
            return a11 != null ? a11 : io.sentry.protocol.o.f32468b;
        } catch (IOException e11) {
            this.f32261a.getLogger().b(f3.ERROR, "Failed to capture envelope.", e11);
            return io.sentry.protocol.o.f32468b;
        }
    }

    q3 w(final b3 b3Var, final t tVar, u1 u1Var) {
        if (rz.h.q(tVar)) {
            if (u1Var != null) {
                return u1Var.A(new u1.a() { // from class: io.sentry.e2
                    @Override // io.sentry.u1.a
                    public final void a(q3 q3Var) {
                        g2.g(g2.this, b3Var, tVar, q3Var);
                    }
                });
            }
            this.f32261a.getLogger().c(f3.INFO, "Scope is null on client.captureEvent", new Object[0]);
        }
        return null;
    }
}