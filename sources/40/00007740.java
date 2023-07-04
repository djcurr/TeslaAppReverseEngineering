package io.grpc.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.grpc.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public class z<ReqT, RespT> extends io.grpc.g<ReqT, RespT> {

    /* renamed from: j  reason: collision with root package name */
    private static final Logger f31432j = Logger.getLogger(z.class.getName());

    /* renamed from: k  reason: collision with root package name */
    private static final io.grpc.g<Object, Object> f31433k = new i();

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledFuture<?> f31434a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f31435b;

    /* renamed from: c  reason: collision with root package name */
    private final io.grpc.r f31436c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f31437d;

    /* renamed from: e  reason: collision with root package name */
    private g.a<RespT> f31438e;

    /* renamed from: f  reason: collision with root package name */
    private io.grpc.g<ReqT, RespT> f31439f;

    /* renamed from: g  reason: collision with root package name */
    private io.grpc.f1 f31440g;

    /* renamed from: h  reason: collision with root package name */
    private List<Runnable> f31441h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private k<RespT> f31442i;

    /* loaded from: classes5.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StringBuilder f31444a;

        b(StringBuilder sb2) {
            this.f31444a = sb2;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.k(io.grpc.f1.f30565i.r(this.f31444a.toString()), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class c extends x {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f31446b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(z zVar, k kVar) {
            super(zVar.f31436c);
            this.f31446b = kVar;
        }

        @Override // io.grpc.internal.x
        public void a() {
            this.f31446b.g();
        }
    }

    /* loaded from: classes5.dex */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g.a f31447a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ io.grpc.r0 f31448b;

        d(g.a aVar, io.grpc.r0 r0Var) {
            this.f31447a = aVar;
            this.f31448b = r0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.f31439f.e(this.f31447a, this.f31448b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ io.grpc.f1 f31450a;

        e(io.grpc.f1 f1Var) {
            this.f31450a = f1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.f31439f.a(this.f31450a.o(), this.f31450a.m());
        }
    }

    /* loaded from: classes5.dex */
    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f31452a;

        f(Object obj) {
            this.f31452a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            z.this.f31439f.d(this.f31452a);
        }
    }

    /* loaded from: classes5.dex */
    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f31454a;

        g(int i11) {
            this.f31454a = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.f31439f.c(this.f31454a);
        }
    }

    /* loaded from: classes5.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.f31439f.b();
        }
    }

    /* loaded from: classes5.dex */
    class i extends io.grpc.g<Object, Object> {
        i() {
        }

        @Override // io.grpc.g
        public void a(String str, Throwable th2) {
        }

        @Override // io.grpc.g
        public void b() {
        }

        @Override // io.grpc.g
        public void c(int i11) {
        }

        @Override // io.grpc.g
        public void d(Object obj) {
        }

        @Override // io.grpc.g
        public void e(g.a<Object> aVar, io.grpc.r0 r0Var) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class j extends x {

        /* renamed from: b  reason: collision with root package name */
        final g.a<RespT> f31457b;

        /* renamed from: c  reason: collision with root package name */
        final io.grpc.f1 f31458c;

        j(z zVar, g.a<RespT> aVar, io.grpc.f1 f1Var) {
            super(zVar.f31436c);
            this.f31457b = aVar;
            this.f31458c = f1Var;
        }

        @Override // io.grpc.internal.x
        public void a() {
            this.f31457b.a(this.f31458c, new io.grpc.r0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class k<RespT> extends g.a<RespT> {

        /* renamed from: a  reason: collision with root package name */
        private final g.a<RespT> f31459a;

        /* renamed from: b  reason: collision with root package name */
        private volatile boolean f31460b;

        /* renamed from: c  reason: collision with root package name */
        private List<Runnable> f31461c = new ArrayList();

        /* loaded from: classes5.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ io.grpc.r0 f31462a;

            a(io.grpc.r0 r0Var) {
                this.f31462a = r0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f31459a.b(this.f31462a);
            }
        }

        /* loaded from: classes5.dex */
        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Object f31464a;

            b(Object obj) {
                this.f31464a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f31459a.c(this.f31464a);
            }
        }

        /* loaded from: classes5.dex */
        class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ io.grpc.f1 f31466a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ io.grpc.r0 f31467b;

            c(io.grpc.f1 f1Var, io.grpc.r0 r0Var) {
                this.f31466a = f1Var;
                this.f31467b = r0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f31459a.a(this.f31466a, this.f31467b);
            }
        }

        /* loaded from: classes5.dex */
        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f31459a.d();
            }
        }

        public k(g.a<RespT> aVar) {
            this.f31459a = aVar;
        }

        private void f(Runnable runnable) {
            synchronized (this) {
                if (!this.f31460b) {
                    this.f31461c.add(runnable);
                } else {
                    runnable.run();
                }
            }
        }

        @Override // io.grpc.g.a
        public void a(io.grpc.f1 f1Var, io.grpc.r0 r0Var) {
            f(new c(f1Var, r0Var));
        }

        @Override // io.grpc.g.a
        public void b(io.grpc.r0 r0Var) {
            if (this.f31460b) {
                this.f31459a.b(r0Var);
            } else {
                f(new a(r0Var));
            }
        }

        @Override // io.grpc.g.a
        public void c(RespT respt) {
            if (this.f31460b) {
                this.f31459a.c(respt);
            } else {
                f(new b(respt));
            }
        }

        @Override // io.grpc.g.a
        public void d() {
            if (this.f31460b) {
                this.f31459a.d();
            } else {
                f(new d());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void g() {
            List<Runnable> list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    if (this.f31461c.isEmpty()) {
                        this.f31461c = null;
                        this.f31460b = true;
                        return;
                    }
                    list = this.f31461c;
                    this.f31461c = arrayList;
                }
                for (Runnable runnable : list) {
                    runnable.run();
                }
                list.clear();
                arrayList = list;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public z(Executor executor, ScheduledExecutorService scheduledExecutorService, io.grpc.t tVar) {
        this.f31435b = (Executor) com.google.common.base.u.p(executor, "callExecutor");
        com.google.common.base.u.p(scheduledExecutorService, "scheduler");
        this.f31436c = io.grpc.r.e();
        this.f31434a = n(scheduledExecutorService, tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void k(io.grpc.f1 f1Var, boolean z11) {
        boolean z12;
        g.a<RespT> aVar;
        synchronized (this) {
            if (this.f31439f == null) {
                p(f31433k);
                z12 = false;
                aVar = this.f31438e;
                this.f31440g = f1Var;
            } else if (z11) {
                return;
            } else {
                z12 = true;
                aVar = null;
            }
            if (z12) {
                l(new e(f1Var));
            } else {
                if (aVar != null) {
                    this.f31435b.execute(new j(this, aVar, f1Var));
                }
                m();
            }
            j();
        }
    }

    private void l(Runnable runnable) {
        synchronized (this) {
            if (!this.f31437d) {
                this.f31441h.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r0.hasNext() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f31441h     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L24
            r0 = 0
            r3.f31441h = r0     // Catch: java.lang.Throwable -> L42
            r0 = 1
            r3.f31437d = r0     // Catch: java.lang.Throwable -> L42
            io.grpc.internal.z$k<RespT> r0 = r3.f31442i     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f31435b
            io.grpc.internal.z$c r2 = new io.grpc.internal.z$c
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List<java.lang.Runnable> r1 = r3.f31441h     // Catch: java.lang.Throwable -> L42
            r3.f31441h = r0     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r1.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2d
        L3d:
            r1.clear()
            r0 = r1
            goto L5
        L42:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.z.m():void");
    }

    private ScheduledFuture<?> n(ScheduledExecutorService scheduledExecutorService, io.grpc.t tVar) {
        io.grpc.t g11 = this.f31436c.g();
        if (tVar == null && g11 == null) {
            return null;
        }
        long min = tVar != null ? Math.min(Long.MAX_VALUE, tVar.i(TimeUnit.NANOSECONDS)) : Long.MAX_VALUE;
        if (g11 != null) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (g11.i(timeUnit) < min) {
                min = g11.i(timeUnit);
                Logger logger = f31432j;
                if (logger.isLoggable(Level.FINE)) {
                    StringBuilder sb2 = new StringBuilder(String.format("Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(min)));
                    if (tVar == null) {
                        sb2.append(" Explicit call timeout was not set.");
                    } else {
                        sb2.append(String.format(" Explicit call timeout was '%d' ns.", Long.valueOf(tVar.i(timeUnit))));
                    }
                    logger.fine(sb2.toString());
                }
            }
        }
        long abs = Math.abs(min);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long nanos = abs / timeUnit2.toNanos(1L);
        long abs2 = Math.abs(min) % timeUnit2.toNanos(1L);
        StringBuilder sb3 = new StringBuilder();
        if (min < 0) {
            sb3.append("ClientCall started after deadline exceeded. Deadline exceeded after -");
        } else {
            sb3.append("Deadline exceeded after ");
        }
        sb3.append(nanos);
        sb3.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        sb3.append("s. ");
        return scheduledExecutorService.schedule(new b(sb3), min, TimeUnit.NANOSECONDS);
    }

    private void p(io.grpc.g<ReqT, RespT> gVar) {
        io.grpc.g<ReqT, RespT> gVar2 = this.f31439f;
        com.google.common.base.u.x(gVar2 == null, "realCall already set to %s", gVar2);
        ScheduledFuture<?> scheduledFuture = this.f31434a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f31439f = gVar;
    }

    @Override // io.grpc.g
    public final void a(String str, Throwable th2) {
        io.grpc.f1 r11;
        io.grpc.f1 f1Var = io.grpc.f1.f30563g;
        if (str != null) {
            r11 = f1Var.r(str);
        } else {
            r11 = f1Var.r("Call cancelled without message");
        }
        if (th2 != null) {
            r11 = r11.q(th2);
        }
        k(r11, false);
    }

    @Override // io.grpc.g
    public final void b() {
        l(new h());
    }

    @Override // io.grpc.g
    public final void c(int i11) {
        if (this.f31437d) {
            this.f31439f.c(i11);
        } else {
            l(new g(i11));
        }
    }

    @Override // io.grpc.g
    public final void d(ReqT reqt) {
        if (this.f31437d) {
            this.f31439f.d(reqt);
        } else {
            l(new f(reqt));
        }
    }

    @Override // io.grpc.g
    public final void e(g.a<RespT> aVar, io.grpc.r0 r0Var) {
        io.grpc.f1 f1Var;
        boolean z11;
        com.google.common.base.u.v(this.f31438e == null, "already started");
        synchronized (this) {
            this.f31438e = (g.a) com.google.common.base.u.p(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            f1Var = this.f31440g;
            z11 = this.f31437d;
            if (!z11) {
                k<RespT> kVar = new k<>(aVar);
                this.f31442i = kVar;
                aVar = kVar;
            }
        }
        if (f1Var != null) {
            this.f31435b.execute(new j(this, aVar, f1Var));
        } else if (z11) {
            this.f31439f.e(aVar, r0Var);
        } else {
            l(new d(aVar, r0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j() {
    }

    public final Runnable o(io.grpc.g<ReqT, RespT> gVar) {
        synchronized (this) {
            if (this.f31439f != null) {
                return null;
            }
            p((io.grpc.g) com.google.common.base.u.p(gVar, "call"));
            return new a();
        }
    }

    public String toString() {
        return com.google.common.base.o.c(this).d("realCall", this.f31439f).toString();
    }
}