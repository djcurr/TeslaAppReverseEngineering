package mx;

import ch.qos.logback.classic.spi.CallerData;
import com.google.common.base.u;
import com.google.common.io.BaseEncoding;
import io.grpc.f1;
import io.grpc.internal.a;
import io.grpc.internal.h2;
import io.grpc.internal.n2;
import io.grpc.internal.o2;
import io.grpc.internal.r;
import io.grpc.internal.t0;
import io.grpc.r0;
import io.grpc.s0;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class g extends io.grpc.internal.a {

    /* renamed from: r  reason: collision with root package name */
    private static final okio.f f39554r = new okio.f();

    /* renamed from: h  reason: collision with root package name */
    private final s0<?, ?> f39555h;

    /* renamed from: i  reason: collision with root package name */
    private final String f39556i;

    /* renamed from: j  reason: collision with root package name */
    private final h2 f39557j;

    /* renamed from: k  reason: collision with root package name */
    private String f39558k;

    /* renamed from: l  reason: collision with root package name */
    private Object f39559l;

    /* renamed from: m  reason: collision with root package name */
    private volatile int f39560m;

    /* renamed from: n  reason: collision with root package name */
    private final b f39561n;

    /* renamed from: o  reason: collision with root package name */
    private final a f39562o;

    /* renamed from: p  reason: collision with root package name */
    private final io.grpc.a f39563p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f39564q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements a.b {
        a() {
        }

        @Override // io.grpc.internal.a.b
        public void b(f1 f1Var) {
            dy.c.f("OkHttpClientStream$Sink.cancel");
            try {
                synchronized (g.this.f39561n.f39567y) {
                    g.this.f39561n.a0(f1Var, true, null);
                }
            } finally {
                dy.c.h("OkHttpClientStream$Sink.cancel");
            }
        }

        @Override // io.grpc.internal.a.b
        public void c(o2 o2Var, boolean z11, boolean z12, int i11) {
            okio.f a11;
            dy.c.f("OkHttpClientStream$Sink.writeFrame");
            if (o2Var == null) {
                a11 = g.f39554r;
            } else {
                a11 = ((n) o2Var).a();
                int P0 = (int) a11.P0();
                if (P0 > 0) {
                    g.this.i(P0);
                }
            }
            try {
                synchronized (g.this.f39561n.f39567y) {
                    g.this.f39561n.c0(a11, z11, z12);
                    g.this.v().e(i11);
                }
            } finally {
                dy.c.h("OkHttpClientStream$Sink.writeFrame");
            }
        }

        @Override // io.grpc.internal.a.b
        public void d(r0 r0Var, byte[] bArr) {
            dy.c.f("OkHttpClientStream$Sink.writeHeaders");
            String str = "/" + g.this.f39555h.c();
            if (bArr != null) {
                g.this.f39564q = true;
                str = str + CallerData.NA + BaseEncoding.a().f(bArr);
            }
            try {
                synchronized (g.this.f39561n.f39567y) {
                    g.this.f39561n.e0(r0Var, str);
                }
            } finally {
                dy.c.h("OkHttpClientStream$Sink.writeHeaders");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b extends t0 {
        private okio.f A;
        private boolean B;
        private boolean C;
        private boolean D;
        private int E;
        private int F;
        private final mx.b G;
        private final p H;
        private final h I;
        private boolean J;
        private final dy.d K;

        /* renamed from: x  reason: collision with root package name */
        private final int f39566x;

        /* renamed from: y  reason: collision with root package name */
        private final Object f39567y;

        /* renamed from: z  reason: collision with root package name */
        private List<nx.d> f39568z;

        public b(int i11, h2 h2Var, Object obj, mx.b bVar, p pVar, h hVar, int i12, String str) {
            super(i11, h2Var, g.this.v());
            this.A = new okio.f();
            this.B = false;
            this.C = false;
            this.D = false;
            this.J = true;
            this.f39567y = u.p(obj, "lock");
            this.G = bVar;
            this.H = pVar;
            this.I = hVar;
            this.E = i12;
            this.F = i12;
            this.f39566x = i12;
            this.K = dy.c.a(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a0(f1 f1Var, boolean z11, r0 r0Var) {
            if (this.D) {
                return;
            }
            this.D = true;
            if (this.J) {
                this.I.h0(g.this);
                this.f39568z = null;
                this.A.a();
                this.J = false;
                if (r0Var == null) {
                    r0Var = new r0();
                }
                N(f1Var, true, r0Var);
                return;
            }
            this.I.T(g.this.O(), f1Var, r.a.PROCESSED, z11, nx.a.CANCEL, r0Var);
        }

        private void b0() {
            if (!G()) {
                this.I.T(g.this.O(), null, r.a.PROCESSED, false, nx.a.CANCEL, null);
            } else {
                this.I.T(g.this.O(), null, r.a.PROCESSED, false, null, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c0(okio.f fVar, boolean z11, boolean z12) {
            if (this.D) {
                return;
            }
            if (this.J) {
                this.A.write(fVar, (int) fVar.P0());
                this.B |= z11;
                this.C |= z12;
                return;
            }
            u.v(g.this.O() != -1, "streamId should be set");
            this.H.c(z11, g.this.O(), fVar, z12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e0(r0 r0Var, String str) {
            this.f39568z = c.a(r0Var, str, g.this.f39558k, g.this.f39556i, g.this.f39564q, this.I.b0());
            this.I.o0(g.this);
        }

        @Override // io.grpc.internal.t0
        protected void P(f1 f1Var, boolean z11, r0 r0Var) {
            a0(f1Var, z11, r0Var);
        }

        @Override // io.grpc.internal.k1.b
        public void b(int i11) {
            int i12 = this.F - i11;
            this.F = i12;
            int i13 = this.f39566x;
            if (i12 <= i13 * 0.5f) {
                int i14 = i13 - i12;
                this.E += i14;
                this.F = i12 + i14;
                this.G.windowUpdate(g.this.O(), i14);
            }
        }

        @Override // io.grpc.internal.k1.b
        public void c(Throwable th2) {
            P(f1.l(th2), true, new r0());
        }

        @Override // io.grpc.internal.a.c, io.grpc.internal.k1.b
        public void d(boolean z11) {
            b0();
            super.d(z11);
        }

        public void d0(int i11) {
            u.w(g.this.f39560m == -1, "the stream has been started with id %s", i11);
            g.this.f39560m = i11;
            g.this.f39561n.r();
            if (this.J) {
                this.G.E1(g.this.f39564q, false, g.this.f39560m, 0, this.f39568z);
                g.this.f39557j.c();
                this.f39568z = null;
                if (this.A.P0() > 0) {
                    this.H.c(this.B, g.this.f39560m, this.A, this.C);
                }
                this.J = false;
            }
        }

        @Override // io.grpc.internal.g.d
        public void e(Runnable runnable) {
            synchronized (this.f39567y) {
                runnable.run();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public dy.d f0() {
            return this.K;
        }

        public void g0(okio.f fVar, boolean z11) {
            int P0 = this.E - ((int) fVar.P0());
            this.E = P0;
            if (P0 < 0) {
                this.G.k(g.this.O(), nx.a.FLOW_CONTROL_ERROR);
                this.I.T(g.this.O(), f1.f30570n.r("Received data size exceeded our receiving window size"), r.a.PROCESSED, false, null, null);
                return;
            }
            super.S(new k(fVar), z11);
        }

        public void h0(List<nx.d> list, boolean z11) {
            if (z11) {
                U(q.c(list));
            } else {
                T(q.a(list));
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.internal.d.a
        public void r() {
            super.r();
            l().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(s0<?, ?> s0Var, r0 r0Var, mx.b bVar, h hVar, p pVar, Object obj, int i11, int i12, String str, String str2, h2 h2Var, n2 n2Var, io.grpc.c cVar, boolean z11) {
        super(new o(), h2Var, n2Var, r0Var, cVar, z11 && s0Var.f());
        this.f39560m = -1;
        this.f39562o = new a();
        this.f39564q = false;
        this.f39557j = (h2) u.p(h2Var, "statsTraceCtx");
        this.f39555h = s0Var;
        this.f39558k = str;
        this.f39556i = str2;
        this.f39563p = hVar.V();
        this.f39561n = new b(i11, h2Var, obj, bVar, pVar, hVar, i12, s0Var.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object M() {
        return this.f39559l;
    }

    public s0.d N() {
        return this.f39555h.e();
    }

    public int O() {
        return this.f39560m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P(Object obj) {
        this.f39559l = obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.a
    /* renamed from: Q */
    public b x() {
        return this.f39561n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean R() {
        return this.f39564q;
    }

    @Override // io.grpc.internal.q
    public io.grpc.a getAttributes() {
        return this.f39563p;
    }

    @Override // io.grpc.internal.q
    public void n(String str) {
        this.f39558k = (String) u.p(str, "authority");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.a
    /* renamed from: y */
    public a t() {
        return this.f39562o;
    }
}