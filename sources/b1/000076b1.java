package io.grpc.internal;

import ch.qos.logback.core.CoreConstants;
import io.grpc.f1;
import io.grpc.g;
import io.grpc.internal.i1;
import io.grpc.internal.j2;
import io.grpc.internal.r;
import io.grpc.l;
import io.grpc.r;
import io.grpc.r0;
import io.grpc.s0;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class p<ReqT, RespT> extends io.grpc.g<ReqT, RespT> {

    /* renamed from: t  reason: collision with root package name */
    private static final Logger f31104t = Logger.getLogger(p.class.getName());

    /* renamed from: u  reason: collision with root package name */
    private static final byte[] f31105u = "gzip".getBytes(Charset.forName("US-ASCII"));

    /* renamed from: a  reason: collision with root package name */
    private final io.grpc.s0<ReqT, RespT> f31106a;

    /* renamed from: b  reason: collision with root package name */
    private final dy.d f31107b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f31108c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f31109d;

    /* renamed from: e  reason: collision with root package name */
    private final m f31110e;

    /* renamed from: f  reason: collision with root package name */
    private final io.grpc.r f31111f;

    /* renamed from: g  reason: collision with root package name */
    private volatile ScheduledFuture<?> f31112g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f31113h;

    /* renamed from: i  reason: collision with root package name */
    private io.grpc.c f31114i;

    /* renamed from: j  reason: collision with root package name */
    private q f31115j;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f31116k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f31117l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f31118m;

    /* renamed from: n  reason: collision with root package name */
    private final e f31119n;

    /* renamed from: p  reason: collision with root package name */
    private final ScheduledExecutorService f31121p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f31122q;

    /* renamed from: o  reason: collision with root package name */
    private final p<ReqT, RespT>.f f31120o = new f();

    /* renamed from: r  reason: collision with root package name */
    private io.grpc.v f31123r = io.grpc.v.c();

    /* renamed from: s  reason: collision with root package name */
    private io.grpc.o f31124s = io.grpc.o.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b extends x {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g.a f31125b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g.a aVar) {
            super(p.this.f31111f);
            this.f31125b = aVar;
        }

        @Override // io.grpc.internal.x
        public void a() {
            p pVar = p.this;
            pVar.r(this.f31125b, io.grpc.s.a(pVar.f31111f), new io.grpc.r0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class c extends x {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g.a f31127b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f31128c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g.a aVar, String str) {
            super(p.this.f31111f);
            this.f31127b = aVar;
            this.f31128c = str;
        }

        @Override // io.grpc.internal.x
        public void a() {
            p.this.r(this.f31127b, io.grpc.f1.f30570n.r(String.format("Unable to find compressor by name %s", this.f31128c)), new io.grpc.r0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class d implements r {

        /* renamed from: a  reason: collision with root package name */
        private final g.a<RespT> f31130a;

        /* renamed from: b  reason: collision with root package name */
        private io.grpc.f1 f31131b;

        /* loaded from: classes5.dex */
        final class a extends x {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ dy.b f31133b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ io.grpc.r0 f31134c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(dy.b bVar, io.grpc.r0 r0Var) {
                super(p.this.f31111f);
                this.f31133b = bVar;
                this.f31134c = r0Var;
            }

            private void b() {
                if (d.this.f31131b != null) {
                    return;
                }
                try {
                    d.this.f31130a.b(this.f31134c);
                } catch (Throwable th2) {
                    d.this.i(io.grpc.f1.f30563g.q(th2).r("Failed to read headers"));
                }
            }

            @Override // io.grpc.internal.x
            public void a() {
                dy.c.g("ClientCall$Listener.headersRead", p.this.f31107b);
                dy.c.d(this.f31133b);
                try {
                    b();
                } finally {
                    dy.c.i("ClientCall$Listener.headersRead", p.this.f31107b);
                }
            }
        }

        /* loaded from: classes5.dex */
        final class b extends x {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ dy.b f31136b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ j2.a f31137c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(dy.b bVar, j2.a aVar) {
                super(p.this.f31111f);
                this.f31136b = bVar;
                this.f31137c = aVar;
            }

            private void b() {
                if (d.this.f31131b != null) {
                    q0.d(this.f31137c);
                    return;
                }
                while (true) {
                    try {
                        InputStream next = this.f31137c.next();
                        if (next == null) {
                            return;
                        }
                        d.this.f31130a.c(p.this.f31106a.i(next));
                        next.close();
                    } catch (Throwable th2) {
                        q0.d(this.f31137c);
                        d.this.i(io.grpc.f1.f30563g.q(th2).r("Failed to read message."));
                        return;
                    }
                }
            }

            @Override // io.grpc.internal.x
            public void a() {
                dy.c.g("ClientCall$Listener.messagesAvailable", p.this.f31107b);
                dy.c.d(this.f31136b);
                try {
                    b();
                } finally {
                    dy.c.i("ClientCall$Listener.messagesAvailable", p.this.f31107b);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public final class c extends x {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ dy.b f31139b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ io.grpc.f1 f31140c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ io.grpc.r0 f31141d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(dy.b bVar, io.grpc.f1 f1Var, io.grpc.r0 r0Var) {
                super(p.this.f31111f);
                this.f31139b = bVar;
                this.f31140c = f1Var;
                this.f31141d = r0Var;
            }

            private void b() {
                io.grpc.f1 f1Var = this.f31140c;
                io.grpc.r0 r0Var = this.f31141d;
                if (d.this.f31131b != null) {
                    f1Var = d.this.f31131b;
                    r0Var = new io.grpc.r0();
                }
                p.this.f31116k = true;
                try {
                    d dVar = d.this;
                    p.this.r(dVar.f31130a, f1Var, r0Var);
                } finally {
                    p.this.x();
                    p.this.f31110e.a(f1Var.p());
                }
            }

            @Override // io.grpc.internal.x
            public void a() {
                dy.c.g("ClientCall$Listener.onClose", p.this.f31107b);
                dy.c.d(this.f31139b);
                try {
                    b();
                } finally {
                    dy.c.i("ClientCall$Listener.onClose", p.this.f31107b);
                }
            }
        }

        /* renamed from: io.grpc.internal.p$d$d  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        final class C0591d extends x {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ dy.b f31143b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0591d(dy.b bVar) {
                super(p.this.f31111f);
                this.f31143b = bVar;
            }

            private void b() {
                if (d.this.f31131b != null) {
                    return;
                }
                try {
                    d.this.f31130a.d();
                } catch (Throwable th2) {
                    d.this.i(io.grpc.f1.f30563g.q(th2).r("Failed to call onReady."));
                }
            }

            @Override // io.grpc.internal.x
            public void a() {
                dy.c.g("ClientCall$Listener.onReady", p.this.f31107b);
                dy.c.d(this.f31143b);
                try {
                    b();
                } finally {
                    dy.c.i("ClientCall$Listener.onReady", p.this.f31107b);
                }
            }
        }

        public d(g.a<RespT> aVar) {
            this.f31130a = (g.a) com.google.common.base.u.p(aVar, "observer");
        }

        private void h(io.grpc.f1 f1Var, r.a aVar, io.grpc.r0 r0Var) {
            io.grpc.t s11 = p.this.s();
            if (f1Var.n() == f1.b.CANCELLED && s11 != null && s11.g()) {
                w0 w0Var = new w0();
                p.this.f31115j.o(w0Var);
                io.grpc.f1 f1Var2 = io.grpc.f1.f30565i;
                f1Var = f1Var2.f("ClientCall was cancelled at or after deadline. " + w0Var);
                r0Var = new io.grpc.r0();
            }
            p.this.f31108c.execute(new c(dy.c.e(), f1Var, r0Var));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i(io.grpc.f1 f1Var) {
            this.f31131b = f1Var;
            p.this.f31115j.b(f1Var);
        }

        @Override // io.grpc.internal.j2
        public void a(j2.a aVar) {
            dy.c.g("ClientStreamListener.messagesAvailable", p.this.f31107b);
            try {
                p.this.f31108c.execute(new b(dy.c.e(), aVar));
            } finally {
                dy.c.i("ClientStreamListener.messagesAvailable", p.this.f31107b);
            }
        }

        @Override // io.grpc.internal.r
        public void b(io.grpc.r0 r0Var) {
            dy.c.g("ClientStreamListener.headersRead", p.this.f31107b);
            try {
                p.this.f31108c.execute(new a(dy.c.e(), r0Var));
            } finally {
                dy.c.i("ClientStreamListener.headersRead", p.this.f31107b);
            }
        }

        @Override // io.grpc.internal.j2
        public void c() {
            if (p.this.f31106a.e().clientSendsOneMessage()) {
                return;
            }
            dy.c.g("ClientStreamListener.onReady", p.this.f31107b);
            try {
                p.this.f31108c.execute(new C0591d(dy.c.e()));
            } finally {
                dy.c.i("ClientStreamListener.onReady", p.this.f31107b);
            }
        }

        @Override // io.grpc.internal.r
        public void d(io.grpc.f1 f1Var, r.a aVar, io.grpc.r0 r0Var) {
            dy.c.g("ClientStreamListener.closed", p.this.f31107b);
            try {
                h(f1Var, aVar, r0Var);
            } finally {
                dy.c.i("ClientStreamListener.closed", p.this.f31107b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface e {
        q a(io.grpc.s0<?, ?> s0Var, io.grpc.c cVar, io.grpc.r0 r0Var, io.grpc.r rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class f implements r.a {
        private f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final long f31146a;

        g(long j11) {
            this.f31146a = j11;
        }

        @Override // java.lang.Runnable
        public void run() {
            w0 w0Var = new w0();
            p.this.f31115j.o(w0Var);
            long abs = Math.abs(this.f31146a);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long nanos = abs / timeUnit.toNanos(1L);
            long abs2 = Math.abs(this.f31146a) % timeUnit.toNanos(1L);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("deadline exceeded after ");
            if (this.f31146a < 0) {
                sb2.append(CoreConstants.DASH_CHAR);
            }
            sb2.append(nanos);
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
            sb2.append("s. ");
            sb2.append(w0Var);
            p.this.f31115j.b(io.grpc.f1.f30565i.f(sb2.toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(io.grpc.s0<ReqT, RespT> s0Var, Executor executor, io.grpc.c cVar, e eVar, ScheduledExecutorService scheduledExecutorService, m mVar, io.grpc.d0 d0Var) {
        this.f31106a = s0Var;
        dy.d b11 = dy.c.b(s0Var.c(), System.identityHashCode(this));
        this.f31107b = b11;
        boolean z11 = true;
        if (executor == com.google.common.util.concurrent.d.a()) {
            this.f31108c = new b2();
            this.f31109d = true;
        } else {
            this.f31108c = new c2(executor);
            this.f31109d = false;
        }
        this.f31110e = mVar;
        this.f31111f = io.grpc.r.e();
        if (s0Var.e() != s0.d.UNARY && s0Var.e() != s0.d.SERVER_STREAMING) {
            z11 = false;
        }
        this.f31113h = z11;
        this.f31114i = cVar;
        this.f31119n = eVar;
        this.f31121p = scheduledExecutorService;
        dy.c.c("ClientCall.<init>", b11);
    }

    private ScheduledFuture<?> C(io.grpc.t tVar) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long i11 = tVar.i(timeUnit);
        return this.f31121p.schedule(new c1(new g(i11)), i11, timeUnit);
    }

    private void D(g.a<RespT> aVar, io.grpc.r0 r0Var) {
        io.grpc.n nVar;
        boolean z11 = true;
        com.google.common.base.u.v(this.f31115j == null, "Already started");
        com.google.common.base.u.v(!this.f31117l, "call was cancelled");
        com.google.common.base.u.p(aVar, "observer");
        com.google.common.base.u.p(r0Var, "headers");
        if (this.f31111f.h()) {
            this.f31115j = n1.f31085a;
            this.f31108c.execute(new b(aVar));
            return;
        }
        p();
        String b11 = this.f31114i.b();
        if (b11 != null) {
            nVar = this.f31124s.b(b11);
            if (nVar == null) {
                this.f31115j = n1.f31085a;
                this.f31108c.execute(new c(aVar, b11));
                return;
            }
        } else {
            nVar = l.b.f31488a;
        }
        w(r0Var, this.f31123r, nVar, this.f31122q);
        io.grpc.t s11 = s();
        if (s11 == null || !s11.g()) {
            z11 = false;
        }
        if (!z11) {
            u(s11, this.f31111f.g(), this.f31114i.d());
            this.f31115j = this.f31119n.a(this.f31106a, this.f31114i, r0Var, this.f31111f);
        } else {
            this.f31115j = new f0(io.grpc.f1.f30565i.r("ClientCall started after deadline exceeded: " + s11), q0.f(this.f31114i, r0Var, 0, false));
        }
        if (this.f31109d) {
            this.f31115j.d();
        }
        if (this.f31114i.a() != null) {
            this.f31115j.n(this.f31114i.a());
        }
        if (this.f31114i.f() != null) {
            this.f31115j.j(this.f31114i.f().intValue());
        }
        if (this.f31114i.g() != null) {
            this.f31115j.k(this.f31114i.g().intValue());
        }
        if (s11 != null) {
            this.f31115j.q(s11);
        }
        this.f31115j.a(nVar);
        boolean z12 = this.f31122q;
        if (z12) {
            this.f31115j.m(z12);
        }
        this.f31115j.l(this.f31123r);
        this.f31110e.b();
        this.f31115j.r(new d(aVar));
        this.f31111f.a(this.f31120o, com.google.common.util.concurrent.d.a());
        if (s11 != null && !s11.equals(this.f31111f.g()) && this.f31121p != null) {
            this.f31112g = C(s11);
        }
        if (this.f31116k) {
            x();
        }
    }

    private void p() {
        i1.b bVar = (i1.b) this.f31114i.h(i1.b.f30992g);
        if (bVar == null) {
            return;
        }
        Long l11 = bVar.f30993a;
        if (l11 != null) {
            io.grpc.t a11 = io.grpc.t.a(l11.longValue(), TimeUnit.NANOSECONDS);
            io.grpc.t d11 = this.f31114i.d();
            if (d11 == null || a11.compareTo(d11) < 0) {
                this.f31114i = this.f31114i.m(a11);
            }
        }
        Boolean bool = bVar.f30994b;
        if (bool != null) {
            this.f31114i = bool.booleanValue() ? this.f31114i.t() : this.f31114i.u();
        }
        if (bVar.f30995c != null) {
            Integer f11 = this.f31114i.f();
            if (f11 != null) {
                this.f31114i = this.f31114i.p(Math.min(f11.intValue(), bVar.f30995c.intValue()));
            } else {
                this.f31114i = this.f31114i.p(bVar.f30995c.intValue());
            }
        }
        if (bVar.f30996d != null) {
            Integer g11 = this.f31114i.g();
            if (g11 != null) {
                this.f31114i = this.f31114i.q(Math.min(g11.intValue(), bVar.f30996d.intValue()));
            } else {
                this.f31114i = this.f31114i.q(bVar.f30996d.intValue());
            }
        }
    }

    private void q(String str, Throwable th2) {
        io.grpc.f1 r11;
        if (str == null && th2 == null) {
            th2 = new CancellationException("Cancelled without a message or cause");
            f31104t.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th2);
        }
        if (this.f31117l) {
            return;
        }
        this.f31117l = true;
        try {
            if (this.f31115j != null) {
                io.grpc.f1 f1Var = io.grpc.f1.f30563g;
                if (str != null) {
                    r11 = f1Var.r(str);
                } else {
                    r11 = f1Var.r("Call cancelled without message");
                }
                if (th2 != null) {
                    r11 = r11.q(th2);
                }
                this.f31115j.b(r11);
            }
        } finally {
            x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(g.a<RespT> aVar, io.grpc.f1 f1Var, io.grpc.r0 r0Var) {
        aVar.a(f1Var, r0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.grpc.t s() {
        return v(this.f31114i.d(), this.f31111f.g());
    }

    private void t() {
        com.google.common.base.u.v(this.f31115j != null, "Not started");
        com.google.common.base.u.v(!this.f31117l, "call was cancelled");
        com.google.common.base.u.v(!this.f31118m, "call already half-closed");
        this.f31118m = true;
        this.f31115j.p();
    }

    private static void u(io.grpc.t tVar, io.grpc.t tVar2, io.grpc.t tVar3) {
        Logger logger = f31104t;
        if (logger.isLoggable(Level.FINE) && tVar != null && tVar.equals(tVar2)) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            StringBuilder sb2 = new StringBuilder(String.format("Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(Math.max(0L, tVar.i(timeUnit)))));
            if (tVar3 == null) {
                sb2.append(" Explicit call timeout was not set.");
            } else {
                sb2.append(String.format(" Explicit call timeout was '%d' ns.", Long.valueOf(tVar3.i(timeUnit))));
            }
            logger.fine(sb2.toString());
        }
    }

    private static io.grpc.t v(io.grpc.t tVar, io.grpc.t tVar2) {
        return tVar == null ? tVar2 : tVar2 == null ? tVar : tVar.h(tVar2);
    }

    static void w(io.grpc.r0 r0Var, io.grpc.v vVar, io.grpc.n nVar, boolean z11) {
        r0Var.e(q0.f31164g);
        r0.f<String> fVar = q0.f31160c;
        r0Var.e(fVar);
        if (nVar != l.b.f31488a) {
            r0Var.o(fVar, nVar.a());
        }
        r0.f<byte[]> fVar2 = q0.f31161d;
        r0Var.e(fVar2);
        byte[] a11 = io.grpc.e0.a(vVar);
        if (a11.length != 0) {
            r0Var.o(fVar2, a11);
        }
        r0Var.e(q0.f31162e);
        r0.f<byte[]> fVar3 = q0.f31163f;
        r0Var.e(fVar3);
        if (z11) {
            r0Var.o(fVar3, f31105u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        this.f31111f.i(this.f31120o);
        ScheduledFuture<?> scheduledFuture = this.f31112g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    private void y(ReqT reqt) {
        com.google.common.base.u.v(this.f31115j != null, "Not started");
        com.google.common.base.u.v(!this.f31117l, "call was cancelled");
        com.google.common.base.u.v(!this.f31118m, "call was half-closed");
        try {
            q qVar = this.f31115j;
            if (qVar instanceof y1) {
                ((y1) qVar).i0(reqt);
            } else {
                qVar.c(this.f31106a.j(reqt));
            }
            if (this.f31113h) {
                return;
            }
            this.f31115j.flush();
        } catch (Error e11) {
            this.f31115j.b(io.grpc.f1.f30563g.r("Client sendMessage() failed with Error"));
            throw e11;
        } catch (RuntimeException e12) {
            this.f31115j.b(io.grpc.f1.f30563g.q(e12).r("Failed to stream message"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p<ReqT, RespT> A(io.grpc.v vVar) {
        this.f31123r = vVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p<ReqT, RespT> B(boolean z11) {
        this.f31122q = z11;
        return this;
    }

    @Override // io.grpc.g
    public void a(String str, Throwable th2) {
        dy.c.g("ClientCall.cancel", this.f31107b);
        try {
            q(str, th2);
        } finally {
            dy.c.i("ClientCall.cancel", this.f31107b);
        }
    }

    @Override // io.grpc.g
    public void b() {
        dy.c.g("ClientCall.halfClose", this.f31107b);
        try {
            t();
        } finally {
            dy.c.i("ClientCall.halfClose", this.f31107b);
        }
    }

    @Override // io.grpc.g
    public void c(int i11) {
        dy.c.g("ClientCall.request", this.f31107b);
        try {
            boolean z11 = true;
            com.google.common.base.u.v(this.f31115j != null, "Not started");
            if (i11 < 0) {
                z11 = false;
            }
            com.google.common.base.u.e(z11, "Number requested must be non-negative");
            this.f31115j.g(i11);
        } finally {
            dy.c.i("ClientCall.request", this.f31107b);
        }
    }

    @Override // io.grpc.g
    public void d(ReqT reqt) {
        dy.c.g("ClientCall.sendMessage", this.f31107b);
        try {
            y(reqt);
        } finally {
            dy.c.i("ClientCall.sendMessage", this.f31107b);
        }
    }

    @Override // io.grpc.g
    public void e(g.a<RespT> aVar, io.grpc.r0 r0Var) {
        dy.c.g("ClientCall.start", this.f31107b);
        try {
            D(aVar, r0Var);
        } finally {
            dy.c.i("ClientCall.start", this.f31107b);
        }
    }

    public String toString() {
        return com.google.common.base.o.c(this).d("method", this.f31106a).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p<ReqT, RespT> z(io.grpc.o oVar) {
        this.f31124s = oVar;
        return this;
    }
}