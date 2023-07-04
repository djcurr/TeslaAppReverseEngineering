package io.grpc.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import expo.modules.interfaces.permissions.PermissionsResponse;
import io.grpc.internal.d;
import io.grpc.internal.l1;
import io.grpc.internal.r;
import io.grpc.r0;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public abstract class a extends d implements q, l1.d {

    /* renamed from: g  reason: collision with root package name */
    private static final Logger f30598g = Logger.getLogger(a.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final n2 f30599a;

    /* renamed from: b  reason: collision with root package name */
    private final o0 f30600b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f30601c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f30602d;

    /* renamed from: e  reason: collision with root package name */
    private io.grpc.r0 f30603e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f30604f;

    /* renamed from: io.grpc.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private class C0586a implements o0 {

        /* renamed from: a  reason: collision with root package name */
        private io.grpc.r0 f30605a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f30606b;

        /* renamed from: c  reason: collision with root package name */
        private final h2 f30607c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f30608d;

        public C0586a(io.grpc.r0 r0Var, h2 h2Var) {
            this.f30605a = (io.grpc.r0) com.google.common.base.u.p(r0Var, "headers");
            this.f30607c = (h2) com.google.common.base.u.p(h2Var, "statsTraceCtx");
        }

        @Override // io.grpc.internal.o0
        public o0 a(io.grpc.n nVar) {
            return this;
        }

        @Override // io.grpc.internal.o0
        public void b(InputStream inputStream) {
            com.google.common.base.u.v(this.f30608d == null, "writePayload should not be called multiple times");
            try {
                this.f30608d = dl.a.d(inputStream);
                this.f30607c.i(0);
                h2 h2Var = this.f30607c;
                byte[] bArr = this.f30608d;
                h2Var.j(0, bArr.length, bArr.length);
                this.f30607c.k(this.f30608d.length);
                this.f30607c.l(this.f30608d.length);
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // io.grpc.internal.o0
        public void close() {
            this.f30606b = true;
            com.google.common.base.u.v(this.f30608d != null, "Lack of request message. GET request is only supported for unary requests");
            a.this.t().d(this.f30605a, this.f30608d);
            this.f30608d = null;
            this.f30605a = null;
        }

        @Override // io.grpc.internal.o0
        public void flush() {
        }

        @Override // io.grpc.internal.o0
        public boolean isClosed() {
            return this.f30606b;
        }

        @Override // io.grpc.internal.o0
        public void k(int i11) {
        }
    }

    /* loaded from: classes5.dex */
    protected interface b {
        void b(io.grpc.f1 f1Var);

        void c(o2 o2Var, boolean z11, boolean z12, int i11);

        void d(io.grpc.r0 r0Var, byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static abstract class c extends d.a {

        /* renamed from: h  reason: collision with root package name */
        private final h2 f30610h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f30611i;

        /* renamed from: j  reason: collision with root package name */
        private r f30612j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f30613k;

        /* renamed from: l  reason: collision with root package name */
        private io.grpc.v f30614l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f30615m;

        /* renamed from: n  reason: collision with root package name */
        private Runnable f30616n;

        /* renamed from: o  reason: collision with root package name */
        private volatile boolean f30617o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f30618p;

        /* renamed from: q  reason: collision with root package name */
        private boolean f30619q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.grpc.internal.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public class RunnableC0587a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ io.grpc.f1 f30620a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ r.a f30621b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ io.grpc.r0 f30622c;

            RunnableC0587a(io.grpc.f1 f1Var, r.a aVar, io.grpc.r0 r0Var) {
                this.f30620a = f1Var;
                this.f30621b = aVar;
                this.f30622c = r0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.C(this.f30620a, this.f30621b, this.f30622c);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public c(int i11, h2 h2Var, n2 n2Var) {
            super(i11, h2Var, n2Var);
            this.f30614l = io.grpc.v.c();
            this.f30615m = false;
            this.f30610h = (h2) com.google.common.base.u.p(h2Var, "statsTraceCtx");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C(io.grpc.f1 f1Var, r.a aVar, io.grpc.r0 r0Var) {
            if (this.f30611i) {
                return;
            }
            this.f30611i = true;
            this.f30610h.m(f1Var);
            n().d(f1Var, aVar, r0Var);
            if (l() != null) {
                l().f(f1Var.p());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I(io.grpc.v vVar) {
            com.google.common.base.u.v(this.f30612j == null, "Already called start");
            this.f30614l = (io.grpc.v) com.google.common.base.u.p(vVar, "decompressorRegistry");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J(boolean z11) {
            this.f30613k = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void L() {
            this.f30617o = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void D(u1 u1Var) {
            com.google.common.base.u.p(u1Var, "frame");
            try {
                if (this.f30618p) {
                    a.f30598g.log(Level.INFO, "Received data on closed stream");
                    u1Var.close();
                    return;
                }
                k(u1Var);
            } catch (Throwable th2) {
                if (1 != 0) {
                    u1Var.close();
                }
                throw th2;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void E(io.grpc.r0 r6) {
            /*
                r5 = this;
                boolean r0 = r5.f30618p
                r1 = 1
                r0 = r0 ^ r1
                java.lang.String r2 = "Received headers on closed stream"
                com.google.common.base.u.v(r0, r2)
                io.grpc.internal.h2 r0 = r5.f30610h
                r0.a()
                io.grpc.r0$f<java.lang.String> r0 = io.grpc.internal.q0.f31162e
                java.lang.Object r0 = r6.g(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r2 = r5.f30613k
                r3 = 0
                if (r2 == 0) goto L4f
                if (r0 == 0) goto L4f
                java.lang.String r2 = "gzip"
                boolean r2 = r0.equalsIgnoreCase(r2)
                if (r2 == 0) goto L2f
                io.grpc.internal.r0 r0 = new io.grpc.internal.r0
                r0.<init>()
                r5.w(r0)
                r0 = r1
                goto L50
            L2f:
                java.lang.String r2 = "identity"
                boolean r2 = r0.equalsIgnoreCase(r2)
                if (r2 != 0) goto L4f
                io.grpc.f1 r6 = io.grpc.f1.f30570n
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r0
                java.lang.String r0 = "Can't find full stream decompressor for %s"
                java.lang.String r0 = java.lang.String.format(r0, r1)
                io.grpc.f1 r6 = r6.r(r0)
                io.grpc.StatusRuntimeException r6 = r6.d()
                r5.c(r6)
                return
            L4f:
                r0 = r3
            L50:
                io.grpc.r0$f<java.lang.String> r2 = io.grpc.internal.q0.f31160c
                java.lang.Object r2 = r6.g(r2)
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L99
                io.grpc.v r4 = r5.f30614l
                io.grpc.u r4 = r4.e(r2)
                if (r4 != 0) goto L7a
                io.grpc.f1 r6 = io.grpc.f1.f30570n
                java.lang.Object[] r0 = new java.lang.Object[r1]
                r0[r3] = r2
                java.lang.String r1 = "Can't find decompressor for %s"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                io.grpc.f1 r6 = r6.r(r0)
                io.grpc.StatusRuntimeException r6 = r6.d()
                r5.c(r6)
                return
            L7a:
                io.grpc.l r1 = io.grpc.l.b.f31488a
                if (r4 == r1) goto L99
                if (r0 == 0) goto L96
                io.grpc.f1 r6 = io.grpc.f1.f30570n
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.String r1 = "Full stream and gRPC message encoding cannot both be set"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                io.grpc.f1 r6 = r6.r(r0)
                io.grpc.StatusRuntimeException r6 = r6.d()
                r5.c(r6)
                return
            L96:
                r5.v(r4)
            L99:
                io.grpc.internal.r r0 = r5.n()
                r0.b(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.a.c.E(io.grpc.r0):void");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void F(io.grpc.r0 r0Var, io.grpc.f1 f1Var) {
            com.google.common.base.u.p(f1Var, PermissionsResponse.STATUS_KEY);
            com.google.common.base.u.p(r0Var, "trailers");
            if (this.f30618p) {
                a.f30598g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{f1Var, r0Var});
                return;
            }
            this.f30610h.b(r0Var);
            N(f1Var, false, r0Var);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final boolean G() {
            return this.f30617o;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.internal.d.a
        /* renamed from: H */
        public final r n() {
            return this.f30612j;
        }

        public final void K(r rVar) {
            com.google.common.base.u.v(this.f30612j == null, "Already called setListener");
            this.f30612j = (r) com.google.common.base.u.p(rVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }

        public final void M(io.grpc.f1 f1Var, r.a aVar, boolean z11, io.grpc.r0 r0Var) {
            com.google.common.base.u.p(f1Var, PermissionsResponse.STATUS_KEY);
            com.google.common.base.u.p(r0Var, "trailers");
            if (!this.f30618p || z11) {
                this.f30618p = true;
                this.f30619q = f1Var.p();
                s();
                if (this.f30615m) {
                    this.f30616n = null;
                    C(f1Var, aVar, r0Var);
                    return;
                }
                this.f30616n = new RunnableC0587a(f1Var, aVar, r0Var);
                j(z11);
            }
        }

        public final void N(io.grpc.f1 f1Var, boolean z11, io.grpc.r0 r0Var) {
            M(f1Var, r.a.PROCESSED, z11, r0Var);
        }

        @Override // io.grpc.internal.k1.b
        public void d(boolean z11) {
            com.google.common.base.u.v(this.f30618p, "status should have been reported on deframer closed");
            this.f30615m = true;
            if (this.f30619q && z11) {
                N(io.grpc.f1.f30570n.r("Encountered end-of-stream mid-frame"), true, new io.grpc.r0());
            }
            Runnable runnable = this.f30616n;
            if (runnable != null) {
                runnable.run();
                this.f30616n = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(p2 p2Var, h2 h2Var, n2 n2Var, io.grpc.r0 r0Var, io.grpc.c cVar, boolean z11) {
        com.google.common.base.u.p(r0Var, "headers");
        this.f30599a = (n2) com.google.common.base.u.p(n2Var, "transportTracer");
        this.f30601c = q0.n(cVar);
        this.f30602d = z11;
        if (!z11) {
            this.f30600b = new l1(this, p2Var, h2Var);
            this.f30603e = r0Var;
            return;
        }
        this.f30600b = new C0586a(r0Var, h2Var);
    }

    @Override // io.grpc.internal.q
    public final void b(io.grpc.f1 f1Var) {
        com.google.common.base.u.e(!f1Var.p(), "Should not cancel with OK status");
        this.f30604f = true;
        t().b(f1Var);
    }

    @Override // io.grpc.internal.l1.d
    public final void e(o2 o2Var, boolean z11, boolean z12, int i11) {
        com.google.common.base.u.e(o2Var != null || z11, "null frame before EOS");
        t().c(o2Var, z11, z12, i11);
    }

    @Override // io.grpc.internal.d
    protected final o0 h() {
        return this.f30600b;
    }

    @Override // io.grpc.internal.d, io.grpc.internal.i2
    public final boolean isReady() {
        return super.isReady() && !this.f30604f;
    }

    @Override // io.grpc.internal.q
    public void j(int i11) {
        s().x(i11);
    }

    @Override // io.grpc.internal.q
    public void k(int i11) {
        this.f30600b.k(i11);
    }

    @Override // io.grpc.internal.q
    public final void l(io.grpc.v vVar) {
        s().I(vVar);
    }

    @Override // io.grpc.internal.q
    public final void m(boolean z11) {
        s().J(z11);
    }

    @Override // io.grpc.internal.q
    public final void o(w0 w0Var) {
        w0Var.b("remote_addr", getAttributes().b(io.grpc.z.f31683a));
    }

    @Override // io.grpc.internal.q
    public final void p() {
        if (s().G()) {
            return;
        }
        s().L();
        f();
    }

    @Override // io.grpc.internal.q
    public void q(io.grpc.t tVar) {
        io.grpc.r0 r0Var = this.f30603e;
        r0.f<Long> fVar = q0.f31159b;
        r0Var.e(fVar);
        this.f30603e.o(fVar, Long.valueOf(Math.max(0L, tVar.i(TimeUnit.NANOSECONDS))));
    }

    @Override // io.grpc.internal.q
    public final void r(r rVar) {
        s().K(rVar);
        if (this.f30602d) {
            return;
        }
        t().d(this.f30603e, null);
        this.f30603e = null;
    }

    protected abstract b t();

    /* JADX INFO: Access modifiers changed from: protected */
    public n2 v() {
        return this.f30599a;
    }

    public final boolean w() {
        return this.f30601c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.d
    /* renamed from: x */
    public abstract c s();
}