package io.grpc.internal;

import io.grpc.f;
import io.grpc.h1;
import io.grpc.internal.j1;
import io.grpc.internal.k;
import io.grpc.internal.r;
import io.grpc.internal.t;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class x0 implements io.grpc.f0<Object>, m2 {

    /* renamed from: a  reason: collision with root package name */
    private final io.grpc.g0 f31266a;

    /* renamed from: b  reason: collision with root package name */
    private final String f31267b;

    /* renamed from: c  reason: collision with root package name */
    private final String f31268c;

    /* renamed from: d  reason: collision with root package name */
    private final k.a f31269d;

    /* renamed from: e  reason: collision with root package name */
    private final j f31270e;

    /* renamed from: f  reason: collision with root package name */
    private final t f31271f;

    /* renamed from: g  reason: collision with root package name */
    private final ScheduledExecutorService f31272g;

    /* renamed from: h  reason: collision with root package name */
    private final io.grpc.b0 f31273h;

    /* renamed from: i  reason: collision with root package name */
    private final io.grpc.internal.m f31274i;

    /* renamed from: j  reason: collision with root package name */
    private final io.grpc.f f31275j;

    /* renamed from: k  reason: collision with root package name */
    private final io.grpc.h1 f31276k;

    /* renamed from: l  reason: collision with root package name */
    private final k f31277l;

    /* renamed from: m  reason: collision with root package name */
    private volatile List<io.grpc.x> f31278m;

    /* renamed from: n  reason: collision with root package name */
    private io.grpc.internal.k f31279n;

    /* renamed from: o  reason: collision with root package name */
    private final com.google.common.base.y f31280o;

    /* renamed from: p  reason: collision with root package name */
    private h1.c f31281p;

    /* renamed from: q  reason: collision with root package name */
    private h1.c f31282q;

    /* renamed from: r  reason: collision with root package name */
    private j1 f31283r;

    /* renamed from: u  reason: collision with root package name */
    private v f31286u;

    /* renamed from: v  reason: collision with root package name */
    private volatile j1 f31287v;

    /* renamed from: x  reason: collision with root package name */
    private io.grpc.f1 f31289x;

    /* renamed from: s  reason: collision with root package name */
    private final Collection<v> f31284s = new ArrayList();

    /* renamed from: t  reason: collision with root package name */
    private final v0<v> f31285t = new a();

    /* renamed from: w  reason: collision with root package name */
    private volatile io.grpc.q f31288w = io.grpc.q.a(io.grpc.p.IDLE);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a extends v0<v> {
        a() {
        }

        @Override // io.grpc.internal.v0
        protected void b() {
            x0.this.f31270e.a(x0.this);
        }

        @Override // io.grpc.internal.v0
        protected void c() {
            x0.this.f31270e.b(x0.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x0.this.f31281p = null;
            x0.this.f31275j.a(f.a.INFO, "CONNECTING after backoff");
            x0.this.M(io.grpc.p.CONNECTING);
            x0.this.S();
        }
    }

    /* loaded from: classes5.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (x0.this.f31288w.c() == io.grpc.p.IDLE) {
                x0.this.f31275j.a(f.a.INFO, "CONNECTING as requested");
                x0.this.M(io.grpc.p.CONNECTING);
                x0.this.S();
            }
        }
    }

    /* loaded from: classes5.dex */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f31293a;

        /* loaded from: classes5.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j1 j1Var = x0.this.f31283r;
                x0.this.f31282q = null;
                x0.this.f31283r = null;
                j1Var.f(io.grpc.f1.f30571o.r("InternalSubchannel closed transport due to address change"));
            }
        }

        d(List list) {
            this.f31293a = list;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r7 = this;
                io.grpc.internal.x0 r0 = io.grpc.internal.x0.this
                io.grpc.internal.x0$k r0 = io.grpc.internal.x0.I(r0)
                java.net.SocketAddress r0 = r0.a()
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.internal.x0$k r1 = io.grpc.internal.x0.I(r1)
                java.util.List r2 = r7.f31293a
                r1.h(r2)
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                java.util.List r2 = r7.f31293a
                io.grpc.internal.x0.J(r1, r2)
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.q r1 = io.grpc.internal.x0.i(r1)
                io.grpc.p r1 = r1.c()
                io.grpc.p r2 = io.grpc.p.READY
                r3 = 0
                if (r1 == r2) goto L39
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.q r1 = io.grpc.internal.x0.i(r1)
                io.grpc.p r1 = r1.c()
                io.grpc.p r4 = io.grpc.p.CONNECTING
                if (r1 != r4) goto L91
            L39:
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.internal.x0$k r1 = io.grpc.internal.x0.I(r1)
                boolean r0 = r1.g(r0)
                if (r0 != 0) goto L91
                io.grpc.internal.x0 r0 = io.grpc.internal.x0.this
                io.grpc.q r0 = io.grpc.internal.x0.i(r0)
                io.grpc.p r0 = r0.c()
                if (r0 != r2) goto L6d
                io.grpc.internal.x0 r0 = io.grpc.internal.x0.this
                io.grpc.internal.j1 r0 = io.grpc.internal.x0.j(r0)
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.internal.x0.k(r1, r3)
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.internal.x0$k r1 = io.grpc.internal.x0.I(r1)
                r1.f()
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.p r2 = io.grpc.p.IDLE
                io.grpc.internal.x0.E(r1, r2)
                goto L92
            L6d:
                io.grpc.internal.x0 r0 = io.grpc.internal.x0.this
                io.grpc.internal.v r0 = io.grpc.internal.x0.l(r0)
                io.grpc.f1 r1 = io.grpc.f1.f30571o
                java.lang.String r2 = "InternalSubchannel closed pending transport due to address change"
                io.grpc.f1 r1 = r1.r(r2)
                r0.f(r1)
                io.grpc.internal.x0 r0 = io.grpc.internal.x0.this
                io.grpc.internal.x0.m(r0, r3)
                io.grpc.internal.x0 r0 = io.grpc.internal.x0.this
                io.grpc.internal.x0$k r0 = io.grpc.internal.x0.I(r0)
                r0.f()
                io.grpc.internal.x0 r0 = io.grpc.internal.x0.this
                io.grpc.internal.x0.F(r0)
            L91:
                r0 = r3
            L92:
                if (r0 == 0) goto Le1
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.h1$c r1 = io.grpc.internal.x0.n(r1)
                if (r1 == 0) goto Lc0
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.internal.j1 r1 = io.grpc.internal.x0.p(r1)
                io.grpc.f1 r2 = io.grpc.f1.f30571o
                java.lang.String r4 = "InternalSubchannel closed transport early due to address change"
                io.grpc.f1 r2 = r2.r(r4)
                r1.f(r2)
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.h1$c r1 = io.grpc.internal.x0.n(r1)
                r1.a()
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.internal.x0.o(r1, r3)
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.internal.x0.q(r1, r3)
            Lc0:
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.internal.x0.q(r1, r0)
                io.grpc.internal.x0 r0 = io.grpc.internal.x0.this
                io.grpc.h1 r1 = io.grpc.internal.x0.s(r0)
                io.grpc.internal.x0$d$a r2 = new io.grpc.internal.x0$d$a
                r2.<init>()
                r3 = 5
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
                io.grpc.internal.x0 r6 = io.grpc.internal.x0.this
                java.util.concurrent.ScheduledExecutorService r6 = io.grpc.internal.x0.r(r6)
                io.grpc.h1$c r1 = r1.c(r2, r3, r5, r6)
                io.grpc.internal.x0.o(r0, r1)
            Le1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.x0.d.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ io.grpc.f1 f31296a;

        e(io.grpc.f1 f1Var) {
            this.f31296a = f1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            io.grpc.p c11 = x0.this.f31288w.c();
            io.grpc.p pVar = io.grpc.p.SHUTDOWN;
            if (c11 == pVar) {
                return;
            }
            x0.this.f31289x = this.f31296a;
            j1 j1Var = x0.this.f31287v;
            v vVar = x0.this.f31286u;
            x0.this.f31287v = null;
            x0.this.f31286u = null;
            x0.this.M(pVar);
            x0.this.f31277l.f();
            if (x0.this.f31284s.isEmpty()) {
                x0.this.O();
            }
            x0.this.K();
            if (x0.this.f31282q != null) {
                x0.this.f31282q.a();
                x0.this.f31283r.f(this.f31296a);
                x0.this.f31282q = null;
                x0.this.f31283r = null;
            }
            if (j1Var != null) {
                j1Var.f(this.f31296a);
            }
            if (vVar != null) {
                vVar.f(this.f31296a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x0.this.f31275j.a(f.a.INFO, "Terminated");
            x0.this.f31270e.d(x0.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f31299a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f31300b;

        g(v vVar, boolean z11) {
            this.f31299a = vVar;
            this.f31300b = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            x0.this.f31285t.e(this.f31299a, this.f31300b);
        }
    }

    /* loaded from: classes5.dex */
    class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ io.grpc.f1 f31302a;

        h(io.grpc.f1 f1Var) {
            this.f31302a = f1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (j1 j1Var : new ArrayList(x0.this.f31284s)) {
                j1Var.b(this.f31302a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class i extends j0 {

        /* renamed from: a  reason: collision with root package name */
        private final v f31304a;

        /* renamed from: b  reason: collision with root package name */
        private final io.grpc.internal.m f31305b;

        /* loaded from: classes5.dex */
        class a extends h0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ q f31306a;

            /* renamed from: io.grpc.internal.x0$i$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            class C0592a extends i0 {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ r f31308a;

                C0592a(r rVar) {
                    this.f31308a = rVar;
                }

                @Override // io.grpc.internal.i0, io.grpc.internal.r
                public void d(io.grpc.f1 f1Var, r.a aVar, io.grpc.r0 r0Var) {
                    i.this.f31305b.a(f1Var.p());
                    super.d(f1Var, aVar, r0Var);
                }

                @Override // io.grpc.internal.i0
                protected r e() {
                    return this.f31308a;
                }
            }

            a(q qVar) {
                this.f31306a = qVar;
            }

            @Override // io.grpc.internal.h0
            protected q e() {
                return this.f31306a;
            }

            @Override // io.grpc.internal.h0, io.grpc.internal.q
            public void r(r rVar) {
                i.this.f31305b.b();
                super.r(new C0592a(rVar));
            }
        }

        /* synthetic */ i(v vVar, io.grpc.internal.m mVar, a aVar) {
            this(vVar, mVar);
        }

        @Override // io.grpc.internal.j0
        protected v a() {
            return this.f31304a;
        }

        @Override // io.grpc.internal.j0, io.grpc.internal.s
        public q e(io.grpc.s0<?, ?> s0Var, io.grpc.r0 r0Var, io.grpc.c cVar, io.grpc.k[] kVarArr) {
            return new a(super.e(s0Var, r0Var, cVar, kVarArr));
        }

        private i(v vVar, io.grpc.internal.m mVar) {
            this.f31304a = vVar;
            this.f31305b = mVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static abstract class j {
        abstract void a(x0 x0Var);

        abstract void b(x0 x0Var);

        abstract void c(x0 x0Var, io.grpc.q qVar);

        abstract void d(x0 x0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class k {

        /* renamed from: a  reason: collision with root package name */
        private List<io.grpc.x> f31310a;

        /* renamed from: b  reason: collision with root package name */
        private int f31311b;

        /* renamed from: c  reason: collision with root package name */
        private int f31312c;

        public k(List<io.grpc.x> list) {
            this.f31310a = list;
        }

        public SocketAddress a() {
            return this.f31310a.get(this.f31311b).a().get(this.f31312c);
        }

        public io.grpc.a b() {
            return this.f31310a.get(this.f31311b).b();
        }

        public void c() {
            int i11 = this.f31312c + 1;
            this.f31312c = i11;
            if (i11 >= this.f31310a.get(this.f31311b).a().size()) {
                this.f31311b++;
                this.f31312c = 0;
            }
        }

        public boolean d() {
            return this.f31311b == 0 && this.f31312c == 0;
        }

        public boolean e() {
            return this.f31311b < this.f31310a.size();
        }

        public void f() {
            this.f31311b = 0;
            this.f31312c = 0;
        }

        public boolean g(SocketAddress socketAddress) {
            for (int i11 = 0; i11 < this.f31310a.size(); i11++) {
                int indexOf = this.f31310a.get(i11).a().indexOf(socketAddress);
                if (indexOf != -1) {
                    this.f31311b = i11;
                    this.f31312c = indexOf;
                    return true;
                }
            }
            return false;
        }

        public void h(List<io.grpc.x> list) {
            this.f31310a = list;
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class l implements j1.a {

        /* renamed from: a  reason: collision with root package name */
        final v f31313a;

        /* renamed from: b  reason: collision with root package name */
        boolean f31314b = false;

        /* loaded from: classes5.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                x0.this.f31279n = null;
                if (x0.this.f31289x != null) {
                    com.google.common.base.u.v(x0.this.f31287v == null, "Unexpected non-null activeTransport");
                    l lVar = l.this;
                    lVar.f31313a.f(x0.this.f31289x);
                    return;
                }
                v vVar = x0.this.f31286u;
                l lVar2 = l.this;
                v vVar2 = lVar2.f31313a;
                if (vVar == vVar2) {
                    x0.this.f31287v = vVar2;
                    x0.this.f31286u = null;
                    x0.this.M(io.grpc.p.READY);
                }
            }
        }

        /* loaded from: classes5.dex */
        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ io.grpc.f1 f31317a;

            b(io.grpc.f1 f1Var) {
                this.f31317a = f1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (x0.this.f31288w.c() == io.grpc.p.SHUTDOWN) {
                    return;
                }
                j1 j1Var = x0.this.f31287v;
                l lVar = l.this;
                if (j1Var == lVar.f31313a) {
                    x0.this.f31287v = null;
                    x0.this.f31277l.f();
                    x0.this.M(io.grpc.p.IDLE);
                    return;
                }
                v vVar = x0.this.f31286u;
                l lVar2 = l.this;
                if (vVar == lVar2.f31313a) {
                    com.google.common.base.u.x(x0.this.f31288w.c() == io.grpc.p.CONNECTING, "Expected state is CONNECTING, actual state is %s", x0.this.f31288w.c());
                    x0.this.f31277l.c();
                    if (!x0.this.f31277l.e()) {
                        x0.this.f31286u = null;
                        x0.this.f31277l.f();
                        x0.this.R(this.f31317a);
                        return;
                    }
                    x0.this.S();
                }
            }
        }

        /* loaded from: classes5.dex */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                x0.this.f31284s.remove(l.this.f31313a);
                if (x0.this.f31288w.c() == io.grpc.p.SHUTDOWN && x0.this.f31284s.isEmpty()) {
                    x0.this.O();
                }
            }
        }

        l(v vVar, SocketAddress socketAddress) {
            this.f31313a = vVar;
        }

        @Override // io.grpc.internal.j1.a
        public void a(io.grpc.f1 f1Var) {
            x0.this.f31275j.b(f.a.INFO, "{0} SHUTDOWN with {1}", this.f31313a.c(), x0.this.Q(f1Var));
            this.f31314b = true;
            x0.this.f31276k.execute(new b(f1Var));
        }

        @Override // io.grpc.internal.j1.a
        public void b() {
            x0.this.f31275j.a(f.a.INFO, "READY");
            x0.this.f31276k.execute(new a());
        }

        @Override // io.grpc.internal.j1.a
        public void c(boolean z11) {
            x0.this.P(this.f31313a, z11);
        }

        @Override // io.grpc.internal.j1.a
        public void d() {
            com.google.common.base.u.v(this.f31314b, "transportShutdown() must be called before transportTerminated().");
            x0.this.f31275j.b(f.a.INFO, "{0} Terminated", this.f31313a.c());
            x0.this.f31273h.i(this.f31313a);
            x0.this.P(this.f31313a, false);
            x0.this.f31276k.execute(new c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class m extends io.grpc.f {

        /* renamed from: a  reason: collision with root package name */
        io.grpc.g0 f31320a;

        m() {
        }

        @Override // io.grpc.f
        public void a(f.a aVar, String str) {
            n.d(this.f31320a, aVar, str);
        }

        @Override // io.grpc.f
        public void b(f.a aVar, String str, Object... objArr) {
            n.e(this.f31320a, aVar, str, objArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0(List<io.grpc.x> list, String str, String str2, k.a aVar, t tVar, ScheduledExecutorService scheduledExecutorService, com.google.common.base.a0<com.google.common.base.y> a0Var, io.grpc.h1 h1Var, j jVar, io.grpc.b0 b0Var, io.grpc.internal.m mVar, o oVar, io.grpc.g0 g0Var, io.grpc.f fVar) {
        com.google.common.base.u.p(list, "addressGroups");
        com.google.common.base.u.e(!list.isEmpty(), "addressGroups is empty");
        L(list, "addressGroups contains null entry");
        List<io.grpc.x> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f31278m = unmodifiableList;
        this.f31277l = new k(unmodifiableList);
        this.f31267b = str;
        this.f31268c = str2;
        this.f31269d = aVar;
        this.f31271f = tVar;
        this.f31272g = scheduledExecutorService;
        this.f31280o = a0Var.get();
        this.f31276k = h1Var;
        this.f31270e = jVar;
        this.f31273h = b0Var;
        this.f31274i = mVar;
        o oVar2 = (o) com.google.common.base.u.p(oVar, "channelTracer");
        this.f31266a = (io.grpc.g0) com.google.common.base.u.p(g0Var, "logId");
        this.f31275j = (io.grpc.f) com.google.common.base.u.p(fVar, "channelLogger");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        this.f31276k.d();
        h1.c cVar = this.f31281p;
        if (cVar != null) {
            cVar.a();
            this.f31281p = null;
            this.f31279n = null;
        }
    }

    private static void L(List<?> list, String str) {
        Iterator<?> it2 = list.iterator();
        while (it2.hasNext()) {
            com.google.common.base.u.p(it2.next(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(io.grpc.p pVar) {
        this.f31276k.d();
        N(io.grpc.q.a(pVar));
    }

    private void N(io.grpc.q qVar) {
        this.f31276k.d();
        if (this.f31288w.c() != qVar.c()) {
            boolean z11 = this.f31288w.c() != io.grpc.p.SHUTDOWN;
            com.google.common.base.u.v(z11, "Cannot transition out of SHUTDOWN to " + qVar);
            this.f31288w = qVar;
            this.f31270e.c(this, qVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        this.f31276k.execute(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(v vVar, boolean z11) {
        this.f31276k.execute(new g(vVar, z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String Q(io.grpc.f1 f1Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f1Var.n());
        if (f1Var.o() != null) {
            sb2.append("(");
            sb2.append(f1Var.o());
            sb2.append(")");
        }
        if (f1Var.m() != null) {
            sb2.append("[");
            sb2.append(f1Var.m());
            sb2.append("]");
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(io.grpc.f1 f1Var) {
        this.f31276k.d();
        N(io.grpc.q.b(f1Var));
        if (this.f31279n == null) {
            this.f31279n = this.f31269d.get();
        }
        long a11 = this.f31279n.a();
        com.google.common.base.y yVar = this.f31280o;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long d11 = a11 - yVar.d(timeUnit);
        this.f31275j.b(f.a.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", Q(f1Var), Long.valueOf(d11));
        com.google.common.base.u.v(this.f31281p == null, "previous reconnectTask is not done");
        this.f31281p = this.f31276k.c(new b(), d11, timeUnit, this.f31272g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        InetSocketAddress inetSocketAddress;
        io.grpc.a0 a0Var;
        this.f31276k.d();
        com.google.common.base.u.v(this.f31281p == null, "Should have no reconnectTask scheduled");
        if (this.f31277l.d()) {
            this.f31280o.f().g();
        }
        SocketAddress a11 = this.f31277l.a();
        if (a11 instanceof io.grpc.a0) {
            a0Var = (io.grpc.a0) a11;
            inetSocketAddress = a0Var.c();
        } else {
            inetSocketAddress = a11;
            a0Var = null;
        }
        io.grpc.a b11 = this.f31277l.b();
        String str = (String) b11.b(io.grpc.x.f31679d);
        t.a aVar = new t.a();
        if (str == null) {
            str = this.f31267b;
        }
        t.a g11 = aVar.e(str).f(b11).h(this.f31268c).g(a0Var);
        m mVar = new m();
        mVar.f31320a = c();
        i iVar = new i(this.f31271f.g1(inetSocketAddress, g11, mVar), this.f31274i, null);
        mVar.f31320a = iVar.c();
        this.f31273h.c(iVar);
        this.f31286u = iVar;
        this.f31284s.add(iVar);
        Runnable g12 = iVar.g(new l(iVar, inetSocketAddress));
        if (g12 != null) {
            this.f31276k.b(g12);
        }
        this.f31275j.b(f.a.INFO, "Started transport {0}", mVar.f31320a);
    }

    public void T(List<io.grpc.x> list) {
        com.google.common.base.u.p(list, "newAddressGroups");
        L(list, "newAddressGroups contains null entry");
        com.google.common.base.u.e(!list.isEmpty(), "newAddressGroups is empty");
        this.f31276k.execute(new d(Collections.unmodifiableList(new ArrayList(list))));
    }

    @Override // io.grpc.internal.m2
    public s a() {
        j1 j1Var = this.f31287v;
        if (j1Var != null) {
            return j1Var;
        }
        this.f31276k.execute(new c());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(io.grpc.f1 f1Var) {
        f(f1Var);
        this.f31276k.execute(new h(f1Var));
    }

    @Override // io.grpc.k0
    public io.grpc.g0 c() {
        return this.f31266a;
    }

    public void f(io.grpc.f1 f1Var) {
        this.f31276k.execute(new e(f1Var));
    }

    public String toString() {
        return com.google.common.base.o.c(this).c("logId", this.f31266a.d()).d("addressGroups", this.f31278m).toString();
    }
}