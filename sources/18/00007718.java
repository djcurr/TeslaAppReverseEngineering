package io.grpc.internal;

import io.grpc.internal.j2;
import io.grpc.internal.r;
import io.grpc.k;
import io.grpc.r0;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class y1<ReqT> implements io.grpc.internal.q {
    private static final io.grpc.f1 A;
    private static Random B;

    /* renamed from: y  reason: collision with root package name */
    static final r0.f<String> f31333y;

    /* renamed from: z  reason: collision with root package name */
    static final r0.f<String> f31334z;

    /* renamed from: a  reason: collision with root package name */
    private final io.grpc.s0<ReqT, ?> f31335a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f31336b;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledExecutorService f31338d;

    /* renamed from: e  reason: collision with root package name */
    private final io.grpc.r0 f31339e;

    /* renamed from: f  reason: collision with root package name */
    private final z1 f31340f;

    /* renamed from: g  reason: collision with root package name */
    private final s0 f31341g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f31342h;

    /* renamed from: j  reason: collision with root package name */
    private final t f31344j;

    /* renamed from: k  reason: collision with root package name */
    private final long f31345k;

    /* renamed from: l  reason: collision with root package name */
    private final long f31346l;

    /* renamed from: m  reason: collision with root package name */
    private final c0 f31347m;

    /* renamed from: r  reason: collision with root package name */
    private long f31352r;

    /* renamed from: s  reason: collision with root package name */
    private io.grpc.internal.r f31353s;

    /* renamed from: t  reason: collision with root package name */
    private u f31354t;

    /* renamed from: u  reason: collision with root package name */
    private u f31355u;

    /* renamed from: v  reason: collision with root package name */
    private long f31356v;

    /* renamed from: w  reason: collision with root package name */
    private io.grpc.f1 f31357w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f31358x;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f31337c = new io.grpc.h1(new a(this));

    /* renamed from: i  reason: collision with root package name */
    private final Object f31343i = new Object();

    /* renamed from: n  reason: collision with root package name */
    private final w0 f31348n = new w0();

    /* renamed from: o  reason: collision with root package name */
    private volatile z f31349o = new z(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);

    /* renamed from: p  reason: collision with root package name */
    private final AtomicBoolean f31350p = new AtomicBoolean();

    /* renamed from: q  reason: collision with root package name */
    private final AtomicInteger f31351q = new AtomicInteger();

    /* loaded from: classes5.dex */
    class a implements Thread.UncaughtExceptionHandler {
        a(y1 y1Var) {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            throw io.grpc.f1.l(th2).r("Uncaught exception in the SynchronizationContext. Re-thrown.").d();
        }
    }

    /* loaded from: classes5.dex */
    private final class a0 implements io.grpc.internal.r {

        /* renamed from: a  reason: collision with root package name */
        final b0 f31359a;

        /* loaded from: classes5.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ io.grpc.r0 f31361a;

            a(io.grpc.r0 r0Var) {
                this.f31361a = r0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                y1.this.f31353s.b(this.f31361a);
            }
        }

        /* loaded from: classes5.dex */
        class b implements Runnable {

            /* loaded from: classes5.dex */
            class a implements Runnable {
                a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    a0 a0Var = a0.this;
                    y1.this.b0(y1.this.Z(a0Var.f31359a.f31386d + 1, false));
                }
            }

            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                y1.this.f31336b.execute(new a());
            }
        }

        /* loaded from: classes5.dex */
        class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ io.grpc.f1 f31365a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ r.a f31366b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ io.grpc.r0 f31367c;

            c(io.grpc.f1 f1Var, r.a aVar, io.grpc.r0 r0Var) {
                this.f31365a = f1Var;
                this.f31366b = aVar;
                this.f31367c = r0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                y1.this.f31358x = true;
                y1.this.f31353s.d(this.f31365a, this.f31366b, this.f31367c);
            }
        }

        /* loaded from: classes5.dex */
        class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ io.grpc.f1 f31369a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ r.a f31370b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ io.grpc.r0 f31371c;

            d(io.grpc.f1 f1Var, r.a aVar, io.grpc.r0 r0Var) {
                this.f31369a = f1Var;
                this.f31370b = aVar;
                this.f31371c = r0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                y1.this.f31358x = true;
                y1.this.f31353s.d(this.f31369a, this.f31370b, this.f31371c);
            }
        }

        /* loaded from: classes5.dex */
        class e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b0 f31373a;

            e(b0 b0Var) {
                this.f31373a = b0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                y1.this.b0(this.f31373a);
            }
        }

        /* loaded from: classes5.dex */
        class f implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ io.grpc.f1 f31375a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ r.a f31376b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ io.grpc.r0 f31377c;

            f(io.grpc.f1 f1Var, r.a aVar, io.grpc.r0 r0Var) {
                this.f31375a = f1Var;
                this.f31376b = aVar;
                this.f31377c = r0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                y1.this.f31358x = true;
                y1.this.f31353s.d(this.f31375a, this.f31376b, this.f31377c);
            }
        }

        /* loaded from: classes5.dex */
        class g implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j2.a f31379a;

            g(j2.a aVar) {
                this.f31379a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                y1.this.f31353s.a(this.f31379a);
            }
        }

        /* loaded from: classes5.dex */
        class h implements Runnable {
            h() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (y1.this.f31358x) {
                    return;
                }
                y1.this.f31353s.c();
            }
        }

        a0(b0 b0Var) {
            this.f31359a = b0Var;
        }

        private Integer e(io.grpc.r0 r0Var) {
            String str = (String) r0Var.g(y1.f31334z);
            if (str != null) {
                try {
                    return Integer.valueOf(str);
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }
            return null;
        }

        private v f(io.grpc.f1 f1Var, io.grpc.r0 r0Var) {
            Integer e11 = e(r0Var);
            boolean z11 = true;
            boolean z12 = !y1.this.f31341g.f31207c.contains(f1Var.n());
            boolean z13 = (y1.this.f31347m == null || (z12 && (e11 == null || e11.intValue() >= 0))) ? false : !y1.this.f31347m.b();
            if (z12 || z13) {
                z11 = false;
            }
            return new v(z11, e11);
        }

        private x g(io.grpc.f1 f1Var, io.grpc.r0 r0Var) {
            y1 y1Var;
            long j11 = 0;
            boolean z11 = false;
            if (y1.this.f31340f != null) {
                boolean contains = y1.this.f31340f.f31477f.contains(f1Var.n());
                Integer e11 = e(r0Var);
                boolean z12 = (y1.this.f31347m == null || (!contains && (e11 == null || e11.intValue() >= 0))) ? false : !y1.this.f31347m.b();
                if (y1.this.f31340f.f31472a > this.f31359a.f31386d + 1 && !z12) {
                    if (e11 == null) {
                        if (contains) {
                            j11 = (long) (y1.this.f31356v * y1.B.nextDouble());
                            y1.this.f31356v = Math.min((long) (y1Var.f31356v * y1.this.f31340f.f31475d), y1.this.f31340f.f31474c);
                            z11 = true;
                        }
                    } else if (e11.intValue() >= 0) {
                        j11 = TimeUnit.MILLISECONDS.toNanos(e11.intValue());
                        y1 y1Var2 = y1.this;
                        y1Var2.f31356v = y1Var2.f31340f.f31473b;
                        z11 = true;
                    }
                }
                return new x(z11, j11);
            }
            return new x(false, 0L);
        }

        @Override // io.grpc.internal.j2
        public void a(j2.a aVar) {
            z zVar = y1.this.f31349o;
            com.google.common.base.u.v(zVar.f31429f != null, "Headers should be received prior to messages.");
            if (zVar.f31429f != this.f31359a) {
                return;
            }
            y1.this.f31337c.execute(new g(aVar));
        }

        @Override // io.grpc.internal.r
        public void b(io.grpc.r0 r0Var) {
            y1.this.Y(this.f31359a);
            if (y1.this.f31349o.f31429f == this.f31359a) {
                if (y1.this.f31347m != null) {
                    y1.this.f31347m.c();
                }
                y1.this.f31337c.execute(new a(r0Var));
            }
        }

        @Override // io.grpc.internal.j2
        public void c() {
            if (y1.this.isReady()) {
                y1.this.f31337c.execute(new h());
            }
        }

        @Override // io.grpc.internal.r
        public void d(io.grpc.f1 f1Var, r.a aVar, io.grpc.r0 r0Var) {
            u uVar;
            synchronized (y1.this.f31343i) {
                y1 y1Var = y1.this;
                y1Var.f31349o = y1Var.f31349o.g(this.f31359a);
                y1.this.f31348n.a(f1Var.n());
            }
            b0 b0Var = this.f31359a;
            if (b0Var.f31385c) {
                y1.this.Y(b0Var);
                if (y1.this.f31349o.f31429f == this.f31359a) {
                    y1.this.f31337c.execute(new c(f1Var, aVar, r0Var));
                    return;
                }
                return;
            }
            r.a aVar2 = r.a.MISCARRIED;
            if (aVar != aVar2 || y1.this.f31351q.incrementAndGet() <= 1000) {
                if (y1.this.f31349o.f31429f == null) {
                    boolean z11 = false;
                    if (aVar == aVar2 || (aVar == r.a.REFUSED && y1.this.f31350p.compareAndSet(false, true))) {
                        b0 Z = y1.this.Z(this.f31359a.f31386d, true);
                        if (y1.this.f31342h) {
                            synchronized (y1.this.f31343i) {
                                y1 y1Var2 = y1.this;
                                y1Var2.f31349o = y1Var2.f31349o.f(this.f31359a, Z);
                                y1 y1Var3 = y1.this;
                                if (!y1Var3.d0(y1Var3.f31349o) && y1.this.f31349o.f31427d.size() == 1) {
                                    z11 = true;
                                }
                            }
                            if (z11) {
                                y1.this.Y(Z);
                            }
                        } else if (y1.this.f31340f == null || y1.this.f31340f.f31472a == 1) {
                            y1.this.Y(Z);
                        }
                        y1.this.f31336b.execute(new e(Z));
                        return;
                    } else if (aVar == r.a.DROPPED) {
                        if (y1.this.f31342h) {
                            y1.this.c0();
                        }
                    } else {
                        y1.this.f31350p.set(true);
                        if (y1.this.f31342h) {
                            v f11 = f(f1Var, r0Var);
                            if (f11.f31416a) {
                                y1.this.h0(f11.f31417b);
                            }
                            synchronized (y1.this.f31343i) {
                                y1 y1Var4 = y1.this;
                                y1Var4.f31349o = y1Var4.f31349o.e(this.f31359a);
                                if (f11.f31416a) {
                                    y1 y1Var5 = y1.this;
                                    if (y1Var5.d0(y1Var5.f31349o) || !y1.this.f31349o.f31427d.isEmpty()) {
                                        return;
                                    }
                                }
                            }
                        } else {
                            x g11 = g(f1Var, r0Var);
                            if (g11.f31421a) {
                                synchronized (y1.this.f31343i) {
                                    y1 y1Var6 = y1.this;
                                    uVar = new u(y1Var6.f31343i);
                                    y1Var6.f31354t = uVar;
                                }
                                uVar.c(y1.this.f31338d.schedule(new b(), g11.f31422b, TimeUnit.NANOSECONDS));
                                return;
                            }
                        }
                    }
                }
                y1.this.Y(this.f31359a);
                if (y1.this.f31349o.f31429f == this.f31359a) {
                    y1.this.f31337c.execute(new f(f1Var, aVar, r0Var));
                    return;
                }
                return;
            }
            y1.this.Y(this.f31359a);
            if (y1.this.f31349o.f31429f == this.f31359a) {
                y1.this.f31337c.execute(new d(io.grpc.f1.f30570n.r("Too many transparent retries. Might be a bug in gRPC").q(f1Var.d()), aVar, r0Var));
            }
        }
    }

    /* loaded from: classes5.dex */
    class b implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f31382a;

        b(y1 y1Var, String str) {
            this.f31382a = str;
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f31383a.n(this.f31382a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class b0 {

        /* renamed from: a  reason: collision with root package name */
        io.grpc.internal.q f31383a;

        /* renamed from: b  reason: collision with root package name */
        boolean f31384b;

        /* renamed from: c  reason: collision with root package name */
        boolean f31385c;

        /* renamed from: d  reason: collision with root package name */
        final int f31386d;

        b0(int i11) {
            this.f31386d = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Collection f31387a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b0 f31388b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Future f31389c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Future f31390d;

        c(Collection collection, b0 b0Var, Future future, Future future2) {
            this.f31387a = collection;
            this.f31388b = b0Var;
            this.f31389c = future;
            this.f31390d = future2;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (b0 b0Var : this.f31387a) {
                if (b0Var != this.f31388b) {
                    b0Var.f31383a.b(y1.A);
                }
            }
            Future future = this.f31389c;
            if (future != null) {
                future.cancel(false);
            }
            Future future2 = this.f31390d;
            if (future2 != null) {
                future2.cancel(false);
            }
            y1.this.f0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c0 {

        /* renamed from: a  reason: collision with root package name */
        final int f31392a;

        /* renamed from: b  reason: collision with root package name */
        final int f31393b;

        /* renamed from: c  reason: collision with root package name */
        final int f31394c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicInteger f31395d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c0(float f11, float f12) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f31395d = atomicInteger;
            this.f31394c = (int) (f12 * 1000.0f);
            int i11 = (int) (f11 * 1000.0f);
            this.f31392a = i11;
            this.f31393b = i11 / 2;
            atomicInteger.set(i11);
        }

        boolean a() {
            return this.f31395d.get() > this.f31393b;
        }

        boolean b() {
            int i11;
            int i12;
            do {
                i11 = this.f31395d.get();
                if (i11 == 0) {
                    return false;
                }
                i12 = i11 - 1000;
            } while (!this.f31395d.compareAndSet(i11, Math.max(i12, 0)));
            return i12 > this.f31393b;
        }

        void c() {
            int i11;
            int i12;
            do {
                i11 = this.f31395d.get();
                i12 = this.f31392a;
                if (i11 == i12) {
                    return;
                }
            } while (!this.f31395d.compareAndSet(i11, Math.min(this.f31394c + i11, i12)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c0) {
                c0 c0Var = (c0) obj;
                return this.f31392a == c0Var.f31392a && this.f31394c == c0Var.f31394c;
            }
            return false;
        }

        public int hashCode() {
            return com.google.common.base.q.b(Integer.valueOf(this.f31392a), Integer.valueOf(this.f31394c));
        }
    }

    /* loaded from: classes5.dex */
    class d implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ io.grpc.n f31396a;

        d(y1 y1Var, io.grpc.n nVar) {
            this.f31396a = nVar;
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f31383a.a(this.f31396a);
        }
    }

    /* loaded from: classes5.dex */
    class e implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ io.grpc.t f31397a;

        e(y1 y1Var, io.grpc.t tVar) {
            this.f31397a = tVar;
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f31383a.q(this.f31397a);
        }
    }

    /* loaded from: classes5.dex */
    class f implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ io.grpc.v f31398a;

        f(y1 y1Var, io.grpc.v vVar) {
            this.f31398a = vVar;
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f31383a.l(this.f31398a);
        }
    }

    /* loaded from: classes5.dex */
    class g implements r {
        g(y1 y1Var) {
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f31383a.flush();
        }
    }

    /* loaded from: classes5.dex */
    class h implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f31399a;

        h(y1 y1Var, boolean z11) {
            this.f31399a = z11;
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f31383a.m(this.f31399a);
        }
    }

    /* loaded from: classes5.dex */
    class i implements r {
        i(y1 y1Var) {
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f31383a.p();
        }
    }

    /* loaded from: classes5.dex */
    class j implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f31400a;

        j(y1 y1Var, int i11) {
            this.f31400a = i11;
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f31383a.j(this.f31400a);
        }
    }

    /* loaded from: classes5.dex */
    class k implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f31401a;

        k(y1 y1Var, int i11) {
            this.f31401a = i11;
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f31383a.k(this.f31401a);
        }
    }

    /* loaded from: classes5.dex */
    class l implements r {
        l(y1 y1Var) {
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f31383a.d();
        }
    }

    /* loaded from: classes5.dex */
    class m implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f31402a;

        m(y1 y1Var, int i11) {
            this.f31402a = i11;
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f31383a.g(this.f31402a);
        }
    }

    /* loaded from: classes5.dex */
    class n implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f31403a;

        n(Object obj) {
            this.f31403a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f31383a.c(y1.this.f31335a.j(this.f31403a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class o extends k.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ io.grpc.k f31405a;

        o(y1 y1Var, io.grpc.k kVar) {
            this.f31405a = kVar;
        }

        @Override // io.grpc.k.a
        public io.grpc.k a(k.b bVar, io.grpc.r0 r0Var) {
            return this.f31405a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y1.this.f31358x) {
                return;
            }
            y1.this.f31353s.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class q implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ io.grpc.f1 f31407a;

        q(io.grpc.f1 f1Var) {
            this.f31407a = f1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            y1.this.f31358x = true;
            y1.this.f31353s.d(this.f31407a, r.a.PROCESSED, new io.grpc.r0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public interface r {
        void a(b0 b0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class s extends io.grpc.k {

        /* renamed from: a  reason: collision with root package name */
        private final b0 f31409a;

        /* renamed from: b  reason: collision with root package name */
        long f31410b;

        s(b0 b0Var) {
            this.f31409a = b0Var;
        }

        @Override // io.grpc.g1
        public void h(long j11) {
            if (y1.this.f31349o.f31429f != null) {
                return;
            }
            synchronized (y1.this.f31343i) {
                if (y1.this.f31349o.f31429f == null && !this.f31409a.f31384b) {
                    long j12 = this.f31410b + j11;
                    this.f31410b = j12;
                    if (j12 <= y1.this.f31352r) {
                        return;
                    }
                    if (this.f31410b <= y1.this.f31345k) {
                        long a11 = y1.this.f31344j.a(this.f31410b - y1.this.f31352r);
                        y1.this.f31352r = this.f31410b;
                        if (a11 > y1.this.f31346l) {
                            this.f31409a.f31385c = true;
                        }
                    } else {
                        this.f31409a.f31385c = true;
                    }
                    b0 b0Var = this.f31409a;
                    Runnable X = b0Var.f31385c ? y1.this.X(b0Var) : null;
                    if (X != null) {
                        X.run();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class t {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicLong f31412a = new AtomicLong();

        long a(long j11) {
            return this.f31412a.addAndGet(j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class u {

        /* renamed from: a  reason: collision with root package name */
        final Object f31413a;

        /* renamed from: b  reason: collision with root package name */
        Future<?> f31414b;

        /* renamed from: c  reason: collision with root package name */
        boolean f31415c;

        u(Object obj) {
            this.f31413a = obj;
        }

        boolean a() {
            return this.f31415c;
        }

        Future<?> b() {
            this.f31415c = true;
            return this.f31414b;
        }

        void c(Future<?> future) {
            synchronized (this.f31413a) {
                if (!this.f31415c) {
                    this.f31414b = future;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class v {

        /* renamed from: a  reason: collision with root package name */
        final boolean f31416a;

        /* renamed from: b  reason: collision with root package name */
        final Integer f31417b;

        public v(boolean z11, Integer num) {
            this.f31416a = z11;
            this.f31417b = num;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class w implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final u f31418a;

        /* loaded from: classes5.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                u uVar;
                y1 y1Var = y1.this;
                boolean z11 = false;
                b0 Z = y1Var.Z(y1Var.f31349o.f31428e, false);
                synchronized (y1.this.f31343i) {
                    uVar = null;
                    if (w.this.f31418a.a()) {
                        z11 = true;
                    } else {
                        y1 y1Var2 = y1.this;
                        y1Var2.f31349o = y1Var2.f31349o.a(Z);
                        y1 y1Var3 = y1.this;
                        if (y1Var3.d0(y1Var3.f31349o) && (y1.this.f31347m == null || y1.this.f31347m.a())) {
                            y1 y1Var4 = y1.this;
                            uVar = new u(y1Var4.f31343i);
                            y1Var4.f31355u = uVar;
                        } else {
                            y1 y1Var5 = y1.this;
                            y1Var5.f31349o = y1Var5.f31349o.d();
                            y1.this.f31355u = null;
                        }
                    }
                }
                if (!z11) {
                    if (uVar != null) {
                        uVar.c(y1.this.f31338d.schedule(new w(uVar), y1.this.f31341g.f31206b, TimeUnit.NANOSECONDS));
                    }
                    y1.this.b0(Z);
                    return;
                }
                Z.f31383a.b(io.grpc.f1.f30563g.r("Unneeded hedging"));
            }
        }

        w(u uVar) {
            this.f31418a = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            y1.this.f31336b.execute(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class x {

        /* renamed from: a  reason: collision with root package name */
        final boolean f31421a;

        /* renamed from: b  reason: collision with root package name */
        final long f31422b;

        x(boolean z11, long j11) {
            this.f31421a = z11;
            this.f31422b = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class y implements r {
        y() {
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f31383a.r(new a0(b0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class z {

        /* renamed from: a  reason: collision with root package name */
        final boolean f31424a;

        /* renamed from: b  reason: collision with root package name */
        final List<r> f31425b;

        /* renamed from: c  reason: collision with root package name */
        final Collection<b0> f31426c;

        /* renamed from: d  reason: collision with root package name */
        final Collection<b0> f31427d;

        /* renamed from: e  reason: collision with root package name */
        final int f31428e;

        /* renamed from: f  reason: collision with root package name */
        final b0 f31429f;

        /* renamed from: g  reason: collision with root package name */
        final boolean f31430g;

        /* renamed from: h  reason: collision with root package name */
        final boolean f31431h;

        z(List<r> list, Collection<b0> collection, Collection<b0> collection2, b0 b0Var, boolean z11, boolean z12, boolean z13, int i11) {
            this.f31425b = list;
            this.f31426c = (Collection) com.google.common.base.u.p(collection, "drainedSubstreams");
            this.f31429f = b0Var;
            this.f31427d = collection2;
            this.f31430g = z11;
            this.f31424a = z12;
            this.f31431h = z13;
            this.f31428e = i11;
            boolean z14 = false;
            com.google.common.base.u.v(!z12 || list == null, "passThrough should imply buffer is null");
            com.google.common.base.u.v((z12 && b0Var == null) ? false : true, "passThrough should imply winningSubstream != null");
            com.google.common.base.u.v(!z12 || (collection.size() == 1 && collection.contains(b0Var)) || (collection.size() == 0 && b0Var.f31384b), "passThrough should imply winningSubstream is drained");
            com.google.common.base.u.v((z11 && b0Var == null) ? z14 : true, "cancelled should imply committed");
        }

        z a(b0 b0Var) {
            Collection unmodifiableCollection;
            com.google.common.base.u.v(!this.f31431h, "hedging frozen");
            com.google.common.base.u.v(this.f31429f == null, "already committed");
            if (this.f31427d == null) {
                unmodifiableCollection = Collections.singleton(b0Var);
            } else {
                ArrayList arrayList = new ArrayList(this.f31427d);
                arrayList.add(b0Var);
                unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            return new z(this.f31425b, this.f31426c, unmodifiableCollection, this.f31429f, this.f31430g, this.f31424a, this.f31431h, this.f31428e + 1);
        }

        z b() {
            return new z(this.f31425b, this.f31426c, this.f31427d, this.f31429f, true, this.f31424a, this.f31431h, this.f31428e);
        }

        z c(b0 b0Var) {
            List<r> list;
            Collection emptyList;
            boolean z11;
            com.google.common.base.u.v(this.f31429f == null, "Already committed");
            List<r> list2 = this.f31425b;
            if (this.f31426c.contains(b0Var)) {
                list = null;
                z11 = true;
                emptyList = Collections.singleton(b0Var);
            } else {
                list = list2;
                emptyList = Collections.emptyList();
                z11 = false;
            }
            return new z(list, emptyList, this.f31427d, b0Var, this.f31430g, z11, this.f31431h, this.f31428e);
        }

        z d() {
            return this.f31431h ? this : new z(this.f31425b, this.f31426c, this.f31427d, this.f31429f, this.f31430g, this.f31424a, true, this.f31428e);
        }

        z e(b0 b0Var) {
            ArrayList arrayList = new ArrayList(this.f31427d);
            arrayList.remove(b0Var);
            return new z(this.f31425b, this.f31426c, Collections.unmodifiableCollection(arrayList), this.f31429f, this.f31430g, this.f31424a, this.f31431h, this.f31428e);
        }

        z f(b0 b0Var, b0 b0Var2) {
            ArrayList arrayList = new ArrayList(this.f31427d);
            arrayList.remove(b0Var);
            arrayList.add(b0Var2);
            return new z(this.f31425b, this.f31426c, Collections.unmodifiableCollection(arrayList), this.f31429f, this.f31430g, this.f31424a, this.f31431h, this.f31428e);
        }

        z g(b0 b0Var) {
            b0Var.f31384b = true;
            if (this.f31426c.contains(b0Var)) {
                ArrayList arrayList = new ArrayList(this.f31426c);
                arrayList.remove(b0Var);
                return new z(this.f31425b, Collections.unmodifiableCollection(arrayList), this.f31427d, this.f31429f, this.f31430g, this.f31424a, this.f31431h, this.f31428e);
            }
            return this;
        }

        z h(b0 b0Var) {
            Collection unmodifiableCollection;
            com.google.common.base.u.v(!this.f31424a, "Already passThrough");
            if (b0Var.f31384b) {
                unmodifiableCollection = this.f31426c;
            } else if (this.f31426c.isEmpty()) {
                unmodifiableCollection = Collections.singletonList(b0Var);
            } else {
                ArrayList arrayList = new ArrayList(this.f31426c);
                arrayList.add(b0Var);
                unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            Collection collection = unmodifiableCollection;
            b0 b0Var2 = this.f31429f;
            boolean z11 = b0Var2 != null;
            List<r> list = this.f31425b;
            if (z11) {
                com.google.common.base.u.v(b0Var2 == b0Var, "Another RPC attempt has already committed");
                list = null;
            }
            return new z(list, collection, this.f31427d, this.f31429f, this.f31430g, z11, this.f31431h, this.f31428e);
        }
    }

    static {
        r0.d<String> dVar = io.grpc.r0.f31579d;
        f31333y = r0.f.e("grpc-previous-rpc-attempts", dVar);
        f31334z = r0.f.e("grpc-retry-pushback-ms", dVar);
        A = io.grpc.f1.f30563g.r("Stream thrown away because RetriableStream committed");
        B = new Random();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y1(io.grpc.s0<ReqT, ?> s0Var, io.grpc.r0 r0Var, t tVar, long j11, long j12, Executor executor, ScheduledExecutorService scheduledExecutorService, z1 z1Var, s0 s0Var2, c0 c0Var) {
        this.f31335a = s0Var;
        this.f31344j = tVar;
        this.f31345k = j11;
        this.f31346l = j12;
        this.f31336b = executor;
        this.f31338d = scheduledExecutorService;
        this.f31339e = r0Var;
        this.f31340f = z1Var;
        if (z1Var != null) {
            this.f31356v = z1Var.f31473b;
        }
        this.f31341g = s0Var2;
        com.google.common.base.u.e(z1Var == null || s0Var2 == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.f31342h = s0Var2 != null;
        this.f31347m = c0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable X(b0 b0Var) {
        Future<?> future;
        Future<?> future2;
        synchronized (this.f31343i) {
            if (this.f31349o.f31429f != null) {
                return null;
            }
            Collection<b0> collection = this.f31349o.f31426c;
            this.f31349o = this.f31349o.c(b0Var);
            this.f31344j.a(-this.f31352r);
            u uVar = this.f31354t;
            if (uVar != null) {
                Future<?> b11 = uVar.b();
                this.f31354t = null;
                future = b11;
            } else {
                future = null;
            }
            u uVar2 = this.f31355u;
            if (uVar2 != null) {
                Future<?> b12 = uVar2.b();
                this.f31355u = null;
                future2 = b12;
            } else {
                future2 = null;
            }
            return new c(collection, b0Var, future, future2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(b0 b0Var) {
        Runnable X = X(b0Var);
        if (X != null) {
            X.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b0 Z(int i11, boolean z11) {
        b0 b0Var = new b0(i11);
        b0Var.f31383a = e0(j0(this.f31339e, i11), new o(this, new s(b0Var)), i11, z11);
        return b0Var;
    }

    private void a0(r rVar) {
        Collection<b0> collection;
        synchronized (this.f31343i) {
            if (!this.f31349o.f31424a) {
                this.f31349o.f31425b.add(rVar);
            }
            collection = this.f31349o.f31426c;
        }
        for (b0 b0Var : collection) {
            rVar.a(b0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
        if (r0 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
        r8.f31337c.execute(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
        r0 = r9.f31383a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
        if (r8.f31349o.f31429f != r9) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
        r9 = r8.f31357w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
        r9 = io.grpc.internal.y1.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
        r0.b(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007b, code lost:
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0083, code lost:
        if (r2.hasNext() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0085, code lost:
        r4 = (io.grpc.internal.y1.r) r2.next();
        r4.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
        if ((r4 instanceof io.grpc.internal.y1.y) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0092, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0093, code lost:
        if (r1 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0095, code lost:
        r4 = r8.f31349o;
        r5 = r4.f31429f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0099, code lost:
        if (r5 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009b, code lost:
        if (r5 == r9) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a0, code lost:
        if (r4.f31430g == false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b0(io.grpc.internal.y1.b0 r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r3 = r0
            r2 = r1
        L4:
            java.lang.Object r4 = r8.f31343i
            monitor-enter(r4)
            io.grpc.internal.y1$z r5 = r8.f31349o     // Catch: java.lang.Throwable -> La5
            if (r1 == 0) goto L19
            io.grpc.internal.y1$b0 r6 = r5.f31429f     // Catch: java.lang.Throwable -> La5
            if (r6 == 0) goto L13
            if (r6 == r9) goto L13
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La5
            goto L35
        L13:
            boolean r6 = r5.f31430g     // Catch: java.lang.Throwable -> La5
            if (r6 == 0) goto L19
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La5
            goto L35
        L19:
            java.util.List<io.grpc.internal.y1$r> r6 = r5.f31425b     // Catch: java.lang.Throwable -> La5
            int r6 = r6.size()     // Catch: java.lang.Throwable -> La5
            if (r2 != r6) goto L4e
            io.grpc.internal.y1$z r0 = r5.h(r9)     // Catch: java.lang.Throwable -> La5
            r8.f31349o = r0     // Catch: java.lang.Throwable -> La5
            boolean r0 = r8.isReady()     // Catch: java.lang.Throwable -> La5
            if (r0 != 0) goto L2f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La5
            return
        L2f:
            io.grpc.internal.y1$p r0 = new io.grpc.internal.y1$p     // Catch: java.lang.Throwable -> La5
            r0.<init>()     // Catch: java.lang.Throwable -> La5
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La5
        L35:
            if (r0 == 0) goto L3d
            java.util.concurrent.Executor r9 = r8.f31337c
            r9.execute(r0)
            return
        L3d:
            io.grpc.internal.q r0 = r9.f31383a
            io.grpc.internal.y1$z r1 = r8.f31349o
            io.grpc.internal.y1$b0 r1 = r1.f31429f
            if (r1 != r9) goto L48
            io.grpc.f1 r9 = r8.f31357w
            goto L4a
        L48:
            io.grpc.f1 r9 = io.grpc.internal.y1.A
        L4a:
            r0.b(r9)
            return
        L4e:
            boolean r6 = r9.f31384b     // Catch: java.lang.Throwable -> La5
            if (r6 == 0) goto L54
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La5
            return
        L54:
            int r6 = r2 + 128
            java.util.List<io.grpc.internal.y1$r> r7 = r5.f31425b     // Catch: java.lang.Throwable -> La5
            int r7 = r7.size()     // Catch: java.lang.Throwable -> La5
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> La5
            if (r3 != 0) goto L6e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La5
            java.util.List<io.grpc.internal.y1$r> r5 = r5.f31425b     // Catch: java.lang.Throwable -> La5
            java.util.List r2 = r5.subList(r2, r6)     // Catch: java.lang.Throwable -> La5
            r3.<init>(r2)     // Catch: java.lang.Throwable -> La5
            goto L7a
        L6e:
            r3.clear()     // Catch: java.lang.Throwable -> La5
            java.util.List<io.grpc.internal.y1$r> r5 = r5.f31425b     // Catch: java.lang.Throwable -> La5
            java.util.List r2 = r5.subList(r2, r6)     // Catch: java.lang.Throwable -> La5
            r3.addAll(r2)     // Catch: java.lang.Throwable -> La5
        L7a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La5
            java.util.Iterator r2 = r3.iterator()
        L7f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto La2
            java.lang.Object r4 = r2.next()
            io.grpc.internal.y1$r r4 = (io.grpc.internal.y1.r) r4
            r4.a(r9)
            boolean r4 = r4 instanceof io.grpc.internal.y1.y
            if (r4 == 0) goto L93
            r1 = 1
        L93:
            if (r1 == 0) goto L7f
            io.grpc.internal.y1$z r4 = r8.f31349o
            io.grpc.internal.y1$b0 r5 = r4.f31429f
            if (r5 == 0) goto L9e
            if (r5 == r9) goto L9e
            goto La2
        L9e:
            boolean r4 = r4.f31430g
            if (r4 == 0) goto L7f
        La2:
            r2 = r6
            goto L4
        La5:
            r9 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La5
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.y1.b0(io.grpc.internal.y1$b0):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        Future<?> future;
        synchronized (this.f31343i) {
            u uVar = this.f31355u;
            future = null;
            if (uVar != null) {
                Future<?> b11 = uVar.b();
                this.f31355u = null;
                future = b11;
            }
            this.f31349o = this.f31349o.d();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d0(z zVar) {
        return zVar.f31429f == null && zVar.f31428e < this.f31341g.f31205a && !zVar.f31431h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            c0();
            return;
        }
        synchronized (this.f31343i) {
            u uVar = this.f31355u;
            if (uVar == null) {
                return;
            }
            Future<?> b11 = uVar.b();
            u uVar2 = new u(this.f31343i);
            this.f31355u = uVar2;
            if (b11 != null) {
                b11.cancel(false);
            }
            uVar2.c(this.f31338d.schedule(new w(uVar2), num.intValue(), TimeUnit.MILLISECONDS));
        }
    }

    @Override // io.grpc.internal.i2
    public final void a(io.grpc.n nVar) {
        a0(new d(this, nVar));
    }

    @Override // io.grpc.internal.q
    public final void b(io.grpc.f1 f1Var) {
        b0 b0Var = new b0(0);
        b0Var.f31383a = new n1();
        Runnable X = X(b0Var);
        if (X != null) {
            X.run();
            this.f31337c.execute(new q(f1Var));
            return;
        }
        b0 b0Var2 = null;
        synchronized (this.f31343i) {
            if (this.f31349o.f31426c.contains(this.f31349o.f31429f)) {
                b0Var2 = this.f31349o.f31429f;
            } else {
                this.f31357w = f1Var;
            }
            this.f31349o = this.f31349o.b();
        }
        if (b0Var2 != null) {
            b0Var2.f31383a.b(f1Var);
        }
    }

    @Override // io.grpc.internal.i2
    public final void c(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // io.grpc.internal.i2
    public void d() {
        a0(new l(this));
    }

    abstract io.grpc.internal.q e0(io.grpc.r0 r0Var, k.a aVar, int i11, boolean z11);

    abstract void f0();

    @Override // io.grpc.internal.i2
    public final void flush() {
        z zVar = this.f31349o;
        if (zVar.f31424a) {
            zVar.f31429f.f31383a.flush();
        } else {
            a0(new g(this));
        }
    }

    @Override // io.grpc.internal.i2
    public final void g(int i11) {
        z zVar = this.f31349o;
        if (zVar.f31424a) {
            zVar.f31429f.f31383a.g(i11);
        } else {
            a0(new m(this, i11));
        }
    }

    abstract io.grpc.f1 g0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i0(ReqT reqt) {
        z zVar = this.f31349o;
        if (zVar.f31424a) {
            zVar.f31429f.f31383a.c(this.f31335a.j(reqt));
        } else {
            a0(new n(reqt));
        }
    }

    @Override // io.grpc.internal.i2
    public final boolean isReady() {
        for (b0 b0Var : this.f31349o.f31426c) {
            if (b0Var.f31383a.isReady()) {
                return true;
            }
        }
        return false;
    }

    @Override // io.grpc.internal.q
    public final void j(int i11) {
        a0(new j(this, i11));
    }

    final io.grpc.r0 j0(io.grpc.r0 r0Var, int i11) {
        io.grpc.r0 r0Var2 = new io.grpc.r0();
        r0Var2.l(r0Var);
        if (i11 > 0) {
            r0Var2.o(f31333y, String.valueOf(i11));
        }
        return r0Var2;
    }

    @Override // io.grpc.internal.q
    public final void k(int i11) {
        a0(new k(this, i11));
    }

    @Override // io.grpc.internal.q
    public final void l(io.grpc.v vVar) {
        a0(new f(this, vVar));
    }

    @Override // io.grpc.internal.q
    public final void m(boolean z11) {
        a0(new h(this, z11));
    }

    @Override // io.grpc.internal.q
    public final void n(String str) {
        a0(new b(this, str));
    }

    @Override // io.grpc.internal.q
    public void o(w0 w0Var) {
        z zVar;
        synchronized (this.f31343i) {
            w0Var.b("closed", this.f31348n);
            zVar = this.f31349o;
        }
        if (zVar.f31429f != null) {
            w0 w0Var2 = new w0();
            zVar.f31429f.f31383a.o(w0Var2);
            w0Var.b("committed", w0Var2);
            return;
        }
        w0 w0Var3 = new w0();
        for (b0 b0Var : zVar.f31426c) {
            w0 w0Var4 = new w0();
            b0Var.f31383a.o(w0Var4);
            w0Var3.a(w0Var4);
        }
        w0Var.b("open", w0Var3);
    }

    @Override // io.grpc.internal.q
    public final void p() {
        a0(new i(this));
    }

    @Override // io.grpc.internal.q
    public final void q(io.grpc.t tVar) {
        a0(new e(this, tVar));
    }

    @Override // io.grpc.internal.q
    public final void r(io.grpc.internal.r rVar) {
        c0 c0Var;
        this.f31353s = rVar;
        io.grpc.f1 g02 = g0();
        if (g02 != null) {
            b(g02);
            return;
        }
        synchronized (this.f31343i) {
            this.f31349o.f31425b.add(new y());
        }
        b0 Z = Z(0, false);
        if (this.f31342h) {
            u uVar = null;
            synchronized (this.f31343i) {
                this.f31349o = this.f31349o.a(Z);
                if (d0(this.f31349o) && ((c0Var = this.f31347m) == null || c0Var.a())) {
                    uVar = new u(this.f31343i);
                    this.f31355u = uVar;
                }
            }
            if (uVar != null) {
                uVar.c(this.f31338d.schedule(new w(uVar), this.f31341g.f31206b, TimeUnit.NANOSECONDS));
            }
        }
        b0(Z);
    }
}