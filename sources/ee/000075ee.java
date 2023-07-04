package io.grpc.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.grpc.internal.j2;
import io.grpc.internal.r;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
class b0 implements q {

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f30651a;

    /* renamed from: b  reason: collision with root package name */
    private r f30652b;

    /* renamed from: c  reason: collision with root package name */
    private q f30653c;

    /* renamed from: d  reason: collision with root package name */
    private io.grpc.f1 f30654d;

    /* renamed from: f  reason: collision with root package name */
    private o f30656f;

    /* renamed from: g  reason: collision with root package name */
    private long f30657g;

    /* renamed from: h  reason: collision with root package name */
    private long f30658h;

    /* renamed from: e  reason: collision with root package name */
    private List<Runnable> f30655e = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private List<Runnable> f30659i = new ArrayList();

    /* loaded from: classes5.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f30660a;

        a(int i11) {
            this.f30660a = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f30653c.g(this.f30660a);
        }
    }

    /* loaded from: classes5.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f30653c.d();
        }
    }

    /* loaded from: classes5.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ io.grpc.n f30663a;

        c(io.grpc.n nVar) {
            this.f30663a = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f30653c.a(this.f30663a);
        }
    }

    /* loaded from: classes5.dex */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f30665a;

        d(boolean z11) {
            this.f30665a = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f30653c.m(this.f30665a);
        }
    }

    /* loaded from: classes5.dex */
    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ io.grpc.v f30667a;

        e(io.grpc.v vVar) {
            this.f30667a = vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f30653c.l(this.f30667a);
        }
    }

    /* loaded from: classes5.dex */
    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f30669a;

        f(int i11) {
            this.f30669a = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f30653c.j(this.f30669a);
        }
    }

    /* loaded from: classes5.dex */
    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f30671a;

        g(int i11) {
            this.f30671a = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f30653c.k(this.f30671a);
        }
    }

    /* loaded from: classes5.dex */
    class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ io.grpc.t f30673a;

        h(io.grpc.t tVar) {
            this.f30673a = tVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f30653c.q(this.f30673a);
        }
    }

    /* loaded from: classes5.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.i();
        }
    }

    /* loaded from: classes5.dex */
    class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f30676a;

        j(String str) {
            this.f30676a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f30653c.n(this.f30676a);
        }
    }

    /* loaded from: classes5.dex */
    class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InputStream f30678a;

        k(InputStream inputStream) {
            this.f30678a = inputStream;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f30653c.c(this.f30678a);
        }
    }

    /* loaded from: classes5.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f30653c.flush();
        }
    }

    /* loaded from: classes5.dex */
    class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ io.grpc.f1 f30681a;

        m(io.grpc.f1 f1Var) {
            this.f30681a = f1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f30653c.b(this.f30681a);
        }
    }

    /* loaded from: classes5.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f30653c.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class o implements r {

        /* renamed from: a  reason: collision with root package name */
        private final r f30684a;

        /* renamed from: b  reason: collision with root package name */
        private volatile boolean f30685b;

        /* renamed from: c  reason: collision with root package name */
        private List<Runnable> f30686c = new ArrayList();

        /* loaded from: classes5.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j2.a f30687a;

            a(j2.a aVar) {
                this.f30687a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f30684a.a(this.f30687a);
            }
        }

        /* loaded from: classes5.dex */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f30684a.c();
            }
        }

        /* loaded from: classes5.dex */
        class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ io.grpc.r0 f30690a;

            c(io.grpc.r0 r0Var) {
                this.f30690a = r0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f30684a.b(this.f30690a);
            }
        }

        /* loaded from: classes5.dex */
        class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ io.grpc.f1 f30692a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ r.a f30693b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ io.grpc.r0 f30694c;

            d(io.grpc.f1 f1Var, r.a aVar, io.grpc.r0 r0Var) {
                this.f30692a = f1Var;
                this.f30693b = aVar;
                this.f30694c = r0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f30684a.d(this.f30692a, this.f30693b, this.f30694c);
            }
        }

        public o(r rVar) {
            this.f30684a = rVar;
        }

        private void f(Runnable runnable) {
            synchronized (this) {
                if (!this.f30685b) {
                    this.f30686c.add(runnable);
                } else {
                    runnable.run();
                }
            }
        }

        @Override // io.grpc.internal.j2
        public void a(j2.a aVar) {
            if (this.f30685b) {
                this.f30684a.a(aVar);
            } else {
                f(new a(aVar));
            }
        }

        @Override // io.grpc.internal.r
        public void b(io.grpc.r0 r0Var) {
            f(new c(r0Var));
        }

        @Override // io.grpc.internal.j2
        public void c() {
            if (this.f30685b) {
                this.f30684a.c();
            } else {
                f(new b());
            }
        }

        @Override // io.grpc.internal.r
        public void d(io.grpc.f1 f1Var, r.a aVar, io.grpc.r0 r0Var) {
            f(new d(f1Var, aVar, r0Var));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g() {
            List<Runnable> list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    if (this.f30686c.isEmpty()) {
                        this.f30686c = null;
                        this.f30685b = true;
                        return;
                    }
                    list = this.f30686c;
                    this.f30686c = arrayList;
                }
                for (Runnable runnable : list) {
                    runnable.run();
                }
                list.clear();
                arrayList = list;
            }
        }
    }

    private void h(Runnable runnable) {
        com.google.common.base.u.v(this.f30652b != null, "May only be called after start");
        synchronized (this) {
            if (!this.f30651a) {
                this.f30655e.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r0.hasNext() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f30655e     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L1d
            r0 = 0
            r3.f30655e = r0     // Catch: java.lang.Throwable -> L3b
            r0 = 1
            r3.f30651a = r0     // Catch: java.lang.Throwable -> L3b
            io.grpc.internal.b0$o r0 = r3.f30656f     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L1c
            r0.g()
        L1c:
            return
        L1d:
            java.util.List<java.lang.Runnable> r1 = r3.f30655e     // Catch: java.lang.Throwable -> L3b
            r3.f30655e = r0     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r0 = r1.iterator()
        L26:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L26
        L36:
            r1.clear()
            r0 = r1
            goto L5
        L3b:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.b0.i():void");
    }

    private void s(r rVar) {
        for (Runnable runnable : this.f30659i) {
            runnable.run();
        }
        this.f30659i = null;
        this.f30653c.r(rVar);
    }

    private void u(q qVar) {
        q qVar2 = this.f30653c;
        com.google.common.base.u.x(qVar2 == null, "realStream already set to %s", qVar2);
        this.f30653c = qVar;
        this.f30658h = System.nanoTime();
    }

    @Override // io.grpc.internal.i2
    public void a(io.grpc.n nVar) {
        com.google.common.base.u.v(this.f30652b == null, "May only be called before start");
        com.google.common.base.u.p(nVar, "compressor");
        this.f30659i.add(new c(nVar));
    }

    @Override // io.grpc.internal.q
    public void b(io.grpc.f1 f1Var) {
        boolean z11 = true;
        com.google.common.base.u.v(this.f30652b != null, "May only be called after start");
        com.google.common.base.u.p(f1Var, "reason");
        synchronized (this) {
            if (this.f30653c == null) {
                u(n1.f31085a);
                this.f30654d = f1Var;
                z11 = false;
            }
        }
        if (z11) {
            h(new m(f1Var));
            return;
        }
        i();
        t(f1Var);
        this.f30652b.d(f1Var, r.a.PROCESSED, new io.grpc.r0());
    }

    @Override // io.grpc.internal.i2
    public void c(InputStream inputStream) {
        com.google.common.base.u.v(this.f30652b != null, "May only be called after start");
        com.google.common.base.u.p(inputStream, "message");
        if (this.f30651a) {
            this.f30653c.c(inputStream);
        } else {
            h(new k(inputStream));
        }
    }

    @Override // io.grpc.internal.i2
    public void d() {
        com.google.common.base.u.v(this.f30652b == null, "May only be called before start");
        this.f30659i.add(new b());
    }

    @Override // io.grpc.internal.i2
    public void flush() {
        com.google.common.base.u.v(this.f30652b != null, "May only be called after start");
        if (this.f30651a) {
            this.f30653c.flush();
        } else {
            h(new l());
        }
    }

    @Override // io.grpc.internal.i2
    public void g(int i11) {
        com.google.common.base.u.v(this.f30652b != null, "May only be called after start");
        if (this.f30651a) {
            this.f30653c.g(i11);
        } else {
            h(new a(i11));
        }
    }

    @Override // io.grpc.internal.i2
    public boolean isReady() {
        if (this.f30651a) {
            return this.f30653c.isReady();
        }
        return false;
    }

    @Override // io.grpc.internal.q
    public void j(int i11) {
        com.google.common.base.u.v(this.f30652b == null, "May only be called before start");
        this.f30659i.add(new f(i11));
    }

    @Override // io.grpc.internal.q
    public void k(int i11) {
        com.google.common.base.u.v(this.f30652b == null, "May only be called before start");
        this.f30659i.add(new g(i11));
    }

    @Override // io.grpc.internal.q
    public void l(io.grpc.v vVar) {
        com.google.common.base.u.v(this.f30652b == null, "May only be called before start");
        com.google.common.base.u.p(vVar, "decompressorRegistry");
        this.f30659i.add(new e(vVar));
    }

    @Override // io.grpc.internal.q
    public void m(boolean z11) {
        com.google.common.base.u.v(this.f30652b == null, "May only be called before start");
        this.f30659i.add(new d(z11));
    }

    @Override // io.grpc.internal.q
    public void n(String str) {
        com.google.common.base.u.v(this.f30652b == null, "May only be called before start");
        com.google.common.base.u.p(str, "authority");
        this.f30659i.add(new j(str));
    }

    @Override // io.grpc.internal.q
    public void o(w0 w0Var) {
        synchronized (this) {
            if (this.f30652b == null) {
                return;
            }
            if (this.f30653c != null) {
                w0Var.b("buffered_nanos", Long.valueOf(this.f30658h - this.f30657g));
                this.f30653c.o(w0Var);
            } else {
                w0Var.b("buffered_nanos", Long.valueOf(System.nanoTime() - this.f30657g));
                w0Var.a("waiting_for_connection");
            }
        }
    }

    @Override // io.grpc.internal.q
    public void p() {
        com.google.common.base.u.v(this.f30652b != null, "May only be called after start");
        h(new n());
    }

    @Override // io.grpc.internal.q
    public void q(io.grpc.t tVar) {
        com.google.common.base.u.v(this.f30652b == null, "May only be called before start");
        this.f30659i.add(new h(tVar));
    }

    @Override // io.grpc.internal.q
    public void r(r rVar) {
        io.grpc.f1 f1Var;
        boolean z11;
        com.google.common.base.u.p(rVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        com.google.common.base.u.v(this.f30652b == null, "already started");
        synchronized (this) {
            f1Var = this.f30654d;
            z11 = this.f30651a;
            if (!z11) {
                o oVar = new o(rVar);
                this.f30656f = oVar;
                rVar = oVar;
            }
            this.f30652b = rVar;
            this.f30657g = System.nanoTime();
        }
        if (f1Var != null) {
            rVar.d(f1Var, r.a.PROCESSED, new io.grpc.r0());
        } else if (z11) {
            s(rVar);
        }
    }

    protected void t(io.grpc.f1 f1Var) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Runnable v(q qVar) {
        synchronized (this) {
            if (this.f30653c != null) {
                return null;
            }
            u((q) com.google.common.base.u.p(qVar, "stream"));
            r rVar = this.f30652b;
            if (rVar == null) {
                this.f30655e = null;
                this.f30651a = true;
            }
            if (rVar == null) {
                return null;
            }
            s(rVar);
            return new i();
        }
    }
}