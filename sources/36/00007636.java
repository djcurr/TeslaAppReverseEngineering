package io.grpc.internal;

import io.grpc.a;
import io.grpc.c0;
import io.grpc.d0;
import io.grpc.f;
import io.grpc.g;
import io.grpc.h1;
import io.grpc.internal.i1;
import io.grpc.internal.j;
import io.grpc.internal.j1;
import io.grpc.internal.k;
import io.grpc.internal.m;
import io.grpc.internal.p;
import io.grpc.internal.x0;
import io.grpc.internal.y1;
import io.grpc.k;
import io.grpc.m0;
import io.grpc.t0;
import java.lang.Thread;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class f1 extends io.grpc.p0 implements io.grpc.f0<Object> {

    /* renamed from: l0  reason: collision with root package name */
    static final Logger f30807l0 = Logger.getLogger(f1.class.getName());

    /* renamed from: m0  reason: collision with root package name */
    static final Pattern f30808m0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* renamed from: n0  reason: collision with root package name */
    static final io.grpc.f1 f30809n0;

    /* renamed from: o0  reason: collision with root package name */
    static final io.grpc.f1 f30810o0;

    /* renamed from: p0  reason: collision with root package name */
    static final io.grpc.f1 f30811p0;

    /* renamed from: q0  reason: collision with root package name */
    private static final i1 f30812q0;

    /* renamed from: r0  reason: collision with root package name */
    private static final io.grpc.d0 f30813r0;

    /* renamed from: s0  reason: collision with root package name */
    private static final io.grpc.g<Object, Object> f30814s0;
    private io.grpc.t0 A;
    private boolean B;
    private q C;
    private volatile m0.i D;
    private boolean E;
    private final Set<x0> F;
    private Collection<s.f<?, ?>> G;
    private final Object H;
    private final Set<p1> I;
    private final a0 J;
    private final w K;
    private final AtomicBoolean L;
    private boolean M;
    private boolean N;
    private volatile boolean O;
    private final CountDownLatch P;
    private final m.b Q;
    private final io.grpc.internal.m R;
    private final io.grpc.internal.o S;
    private final io.grpc.f T;
    private final io.grpc.b0 U;
    private final s V;
    private t W;
    private i1 X;
    private final i1 Y;
    private boolean Z;

    /* renamed from: a  reason: collision with root package name */
    private final io.grpc.g0 f30815a;

    /* renamed from: a0  reason: collision with root package name */
    private final boolean f30816a0;

    /* renamed from: b  reason: collision with root package name */
    private final String f30817b;

    /* renamed from: b0  reason: collision with root package name */
    private final y1.t f30818b0;

    /* renamed from: c  reason: collision with root package name */
    private final String f30819c;

    /* renamed from: c0  reason: collision with root package name */
    private final long f30820c0;

    /* renamed from: d  reason: collision with root package name */
    private final t0.d f30821d;

    /* renamed from: d0  reason: collision with root package name */
    private final long f30822d0;

    /* renamed from: e  reason: collision with root package name */
    private final t0.b f30823e;

    /* renamed from: e0  reason: collision with root package name */
    private final boolean f30824e0;

    /* renamed from: f  reason: collision with root package name */
    private final io.grpc.internal.j f30825f;

    /* renamed from: f0  reason: collision with root package name */
    private final j1.a f30826f0;

    /* renamed from: g  reason: collision with root package name */
    private final io.grpc.internal.t f30827g;

    /* renamed from: g0  reason: collision with root package name */
    final v0<Object> f30828g0;

    /* renamed from: h  reason: collision with root package name */
    private final io.grpc.internal.t f30829h;

    /* renamed from: h0  reason: collision with root package name */
    private h1.c f30830h0;

    /* renamed from: i  reason: collision with root package name */
    private final u f30831i;

    /* renamed from: i0  reason: collision with root package name */
    private io.grpc.internal.k f30832i0;

    /* renamed from: j  reason: collision with root package name */
    private final Executor f30833j;

    /* renamed from: j0  reason: collision with root package name */
    private final p.e f30834j0;

    /* renamed from: k  reason: collision with root package name */
    private final o1<? extends Executor> f30835k;

    /* renamed from: k0  reason: collision with root package name */
    private final x1 f30836k0;

    /* renamed from: l  reason: collision with root package name */
    private final o1<? extends Executor> f30837l;

    /* renamed from: m  reason: collision with root package name */
    private final n f30838m;

    /* renamed from: n  reason: collision with root package name */
    private final n f30839n;

    /* renamed from: o  reason: collision with root package name */
    private final k2 f30840o;

    /* renamed from: p  reason: collision with root package name */
    private final int f30841p;

    /* renamed from: q  reason: collision with root package name */
    final io.grpc.h1 f30842q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f30843r;

    /* renamed from: s  reason: collision with root package name */
    private final io.grpc.v f30844s;

    /* renamed from: t  reason: collision with root package name */
    private final io.grpc.o f30845t;

    /* renamed from: u  reason: collision with root package name */
    private final com.google.common.base.a0<com.google.common.base.y> f30846u;

    /* renamed from: v  reason: collision with root package name */
    private final long f30847v;

    /* renamed from: w  reason: collision with root package name */
    private final io.grpc.internal.w f30848w;

    /* renamed from: x  reason: collision with root package name */
    private final k.a f30849x;

    /* renamed from: y  reason: collision with root package name */
    private final io.grpc.d f30850y;

    /* renamed from: z  reason: collision with root package name */
    private final String f30851z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a extends io.grpc.d0 {
        a() {
        }

        @Override // io.grpc.d0
        public d0.b a(m0.f fVar) {
            throw new IllegalStateException("Resolution is pending");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f1.this.t0(true);
        }
    }

    /* loaded from: classes5.dex */
    final class c implements m.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k2 f30853a;

        c(f1 f1Var, k2 k2Var) {
            this.f30853a = k2Var;
        }

        @Override // io.grpc.internal.m.b
        public io.grpc.internal.m create() {
            return new io.grpc.internal.m(this.f30853a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class d extends m0.i {

        /* renamed from: a  reason: collision with root package name */
        private final m0.e f30854a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Throwable f30855b;

        d(f1 f1Var, Throwable th2) {
            this.f30855b = th2;
            this.f30854a = m0.e.e(io.grpc.f1.f30570n.r("Panic! This is a bug!").q(th2));
        }

        @Override // io.grpc.m0.i
        public m0.e a(m0.f fVar) {
            return this.f30854a;
        }

        public String toString() {
            return com.google.common.base.o.b(d.class).d("panicPickResult", this.f30854a).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f1.this.T.a(f.a.INFO, "Entering SHUTDOWN state");
            f1.this.f30848w.a(io.grpc.p.SHUTDOWN);
        }
    }

    /* loaded from: classes5.dex */
    class f implements Thread.UncaughtExceptionHandler {
        f() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            Logger logger = f1.f30807l0;
            Level level = Level.SEVERE;
            logger.log(level, "[" + f1.this.c() + "] Uncaught exception in the SynchronizationContext. Panic!", th2);
            f1.this.C0(th2);
        }
    }

    /* loaded from: classes5.dex */
    class g implements Executor {
        g() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f1.this.f30839n.a().execute(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class h extends m0 {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30859b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(io.grpc.t0 t0Var, String str) {
            super(t0Var);
            this.f30859b = str;
        }

        @Override // io.grpc.t0
        public String a() {
            return this.f30859b;
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

    /* loaded from: classes5.dex */
    private final class j implements p.e {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f1.this.w0();
            }
        }

        /* loaded from: classes5.dex */
        final class b<ReqT> extends y1<ReqT> {
            final /* synthetic */ io.grpc.s0 C;
            final /* synthetic */ io.grpc.c D;
            final /* synthetic */ io.grpc.r E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(io.grpc.s0 s0Var, io.grpc.r0 r0Var, io.grpc.c cVar, z1 z1Var, s0 s0Var2, y1.c0 c0Var, io.grpc.r rVar) {
                super(s0Var, r0Var, f1.this.f30818b0, f1.this.f30820c0, f1.this.f30822d0, f1.this.x0(cVar), f1.this.f30829h.getScheduledExecutorService(), z1Var, s0Var2, c0Var);
                this.C = s0Var;
                this.D = cVar;
                this.E = rVar;
            }

            @Override // io.grpc.internal.y1
            io.grpc.internal.q e0(io.grpc.r0 r0Var, k.a aVar, int i11, boolean z11) {
                io.grpc.c s11 = this.D.s(aVar);
                io.grpc.k[] f11 = q0.f(s11, r0Var, i11, z11);
                io.grpc.internal.s c11 = j.this.c(new s1(this.C, r0Var, s11));
                io.grpc.r b11 = this.E.b();
                try {
                    return c11.e(this.C, r0Var, s11, f11);
                } finally {
                    this.E.f(b11);
                }
            }

            @Override // io.grpc.internal.y1
            void f0() {
                f1.this.K.c(this);
            }

            @Override // io.grpc.internal.y1
            io.grpc.f1 g0() {
                return f1.this.K.a(this);
            }
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public io.grpc.internal.s c(m0.f fVar) {
            m0.i iVar = f1.this.D;
            if (f1.this.L.get()) {
                return f1.this.J;
            }
            if (iVar == null) {
                f1.this.f30842q.execute(new a());
                return f1.this.J;
            }
            io.grpc.internal.s j11 = q0.j(iVar.a(fVar), fVar.a().j());
            return j11 != null ? j11 : f1.this.J;
        }

        @Override // io.grpc.internal.p.e
        public io.grpc.internal.q a(io.grpc.s0<?, ?> s0Var, io.grpc.c cVar, io.grpc.r0 r0Var, io.grpc.r rVar) {
            if (f1.this.f30824e0) {
                y1.c0 g11 = f1.this.X.g();
                i1.b bVar = (i1.b) cVar.h(i1.b.f30992g);
                return new b(s0Var, r0Var, cVar, bVar == null ? null : bVar.f30997e, bVar == null ? null : bVar.f30998f, g11, rVar);
            }
            io.grpc.internal.s c11 = c(new s1(s0Var, r0Var, cVar));
            io.grpc.r b11 = rVar.b();
            try {
                return c11.e(s0Var, r0Var, cVar, q0.f(cVar, r0Var, 0, false));
            } finally {
                rVar.f(b11);
            }
        }

        /* synthetic */ j(f1 f1Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class k<ReqT, RespT> extends io.grpc.y<ReqT, RespT> {

        /* renamed from: a  reason: collision with root package name */
        private final io.grpc.d0 f30862a;

        /* renamed from: b  reason: collision with root package name */
        private final io.grpc.d f30863b;

        /* renamed from: c  reason: collision with root package name */
        private final Executor f30864c;

        /* renamed from: d  reason: collision with root package name */
        private final io.grpc.s0<ReqT, RespT> f30865d;

        /* renamed from: e  reason: collision with root package name */
        private final io.grpc.r f30866e;

        /* renamed from: f  reason: collision with root package name */
        private io.grpc.c f30867f;

        /* renamed from: g  reason: collision with root package name */
        private io.grpc.g<ReqT, RespT> f30868g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public class a extends x {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g.a f30869b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ io.grpc.f1 f30870c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar, g.a aVar, io.grpc.f1 f1Var) {
                super(kVar.f30866e);
                this.f30869b = aVar;
                this.f30870c = f1Var;
            }

            @Override // io.grpc.internal.x
            public void a() {
                this.f30869b.a(this.f30870c, new io.grpc.r0());
            }
        }

        k(io.grpc.d0 d0Var, io.grpc.d dVar, Executor executor, io.grpc.s0<ReqT, RespT> s0Var, io.grpc.c cVar) {
            this.f30862a = d0Var;
            this.f30863b = dVar;
            this.f30865d = s0Var;
            executor = cVar.e() != null ? cVar.e() : executor;
            this.f30864c = executor;
            this.f30867f = cVar.o(executor);
            this.f30866e = io.grpc.r.e();
        }

        private void h(g.a<RespT> aVar, io.grpc.f1 f1Var) {
            this.f30864c.execute(new a(this, aVar, f1Var));
        }

        @Override // io.grpc.g
        public void a(String str, Throwable th2) {
            io.grpc.g<ReqT, RespT> gVar = this.f30868g;
            if (gVar != null) {
                gVar.a(str, th2);
            }
        }

        @Override // io.grpc.g
        public void e(g.a<RespT> aVar, io.grpc.r0 r0Var) {
            d0.b a11 = this.f30862a.a(new s1(this.f30865d, r0Var, this.f30867f));
            io.grpc.f1 c11 = a11.c();
            if (!c11.p()) {
                h(aVar, c11);
                this.f30868g = f1.f30814s0;
                return;
            }
            io.grpc.h b11 = a11.b();
            i1.b f11 = ((i1) a11.a()).f(this.f30865d);
            if (f11 != null) {
                this.f30867f = this.f30867f.r(i1.b.f30992g, f11);
            }
            if (b11 != null) {
                this.f30868g = b11.a(this.f30865d, this.f30867f, this.f30863b);
            } else {
                this.f30868g = this.f30863b.h(this.f30865d, this.f30867f);
            }
            this.f30868g.e(aVar, r0Var);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.w0
        public io.grpc.g<ReqT, RespT> f() {
            return this.f30868g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f1.this.f30830h0 = null;
            f1.this.E0();
        }
    }

    /* loaded from: classes5.dex */
    private final class m implements j1.a {
        private m() {
        }

        @Override // io.grpc.internal.j1.a
        public void a(io.grpc.f1 f1Var) {
            com.google.common.base.u.v(f1.this.L.get(), "Channel must have been shut down");
        }

        @Override // io.grpc.internal.j1.a
        public void b() {
        }

        @Override // io.grpc.internal.j1.a
        public void c(boolean z11) {
            f1 f1Var = f1.this;
            f1Var.f30828g0.e(f1Var.J, z11);
        }

        @Override // io.grpc.internal.j1.a
        public void d() {
            com.google.common.base.u.v(f1.this.L.get(), "Channel must have been shut down");
            f1.this.N = true;
            f1.this.H0(false);
            f1.this.A0();
            f1.this.B0();
        }

        /* synthetic */ m(f1 f1Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class n {

        /* renamed from: a  reason: collision with root package name */
        private final o1<? extends Executor> f30873a;

        /* renamed from: b  reason: collision with root package name */
        private Executor f30874b;

        n(o1<? extends Executor> o1Var) {
            this.f30873a = (o1) com.google.common.base.u.p(o1Var, "executorPool");
        }

        synchronized Executor a() {
            if (this.f30874b == null) {
                this.f30874b = (Executor) com.google.common.base.u.q(this.f30873a.a(), "%s.getObject()", this.f30874b);
            }
            return this.f30874b;
        }

        synchronized void b() {
            Executor executor = this.f30874b;
            if (executor != null) {
                this.f30874b = this.f30873a.b(executor);
            }
        }
    }

    /* loaded from: classes5.dex */
    private final class o extends v0<Object> {
        private o() {
        }

        @Override // io.grpc.internal.v0
        protected void b() {
            f1.this.w0();
        }

        @Override // io.grpc.internal.v0
        protected void c() {
            if (f1.this.L.get()) {
                return;
            }
            f1.this.F0();
        }

        /* synthetic */ o(f1 f1Var, a aVar) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private class p implements Runnable {
        private p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f1.this.C == null) {
                return;
            }
            f1.this.v0();
        }

        /* synthetic */ p(f1 f1Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class q extends m0.d {

        /* renamed from: a  reason: collision with root package name */
        j.b f30877a;

        /* renamed from: b  reason: collision with root package name */
        boolean f30878b;

        /* renamed from: c  reason: collision with root package name */
        boolean f30879c;

        /* loaded from: classes5.dex */
        final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f1.this.D0();
            }
        }

        /* loaded from: classes5.dex */
        final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m0.i f30882a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ io.grpc.p f30883b;

            b(m0.i iVar, io.grpc.p pVar) {
                this.f30882a = iVar;
                this.f30883b = pVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                q qVar = q.this;
                if (qVar != f1.this.C) {
                    return;
                }
                f1.this.I0(this.f30882a);
                if (this.f30883b != io.grpc.p.SHUTDOWN) {
                    f1.this.T.b(f.a.INFO, "Entering {0} state with picker: {1}", this.f30883b, this.f30882a);
                    f1.this.f30848w.a(this.f30883b);
                }
            }
        }

        private q() {
        }

        @Override // io.grpc.m0.d
        public io.grpc.f b() {
            return f1.this.T;
        }

        @Override // io.grpc.m0.d
        public io.grpc.h1 c() {
            return f1.this.f30842q;
        }

        @Override // io.grpc.m0.d
        public void d() {
            f1.this.f30842q.d();
            this.f30878b = true;
            f1.this.f30842q.execute(new a());
        }

        @Override // io.grpc.m0.d
        public void e(io.grpc.p pVar, m0.i iVar) {
            f1.this.f30842q.d();
            com.google.common.base.u.p(pVar, "newState");
            com.google.common.base.u.p(iVar, "newPicker");
            f1.this.f30842q.execute(new b(iVar, pVar));
        }

        @Override // io.grpc.m0.d
        /* renamed from: f */
        public io.grpc.internal.e a(m0.b bVar) {
            f1.this.f30842q.d();
            com.google.common.base.u.v(!f1.this.N, "Channel is being terminated");
            return new v(bVar, this);
        }

        /* synthetic */ q(f1 f1Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class r extends t0.e {

        /* renamed from: a  reason: collision with root package name */
        final q f30885a;

        /* renamed from: b  reason: collision with root package name */
        final io.grpc.t0 f30886b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ io.grpc.f1 f30888a;

            a(io.grpc.f1 f1Var) {
                this.f30888a = f1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                r.this.e(this.f30888a);
            }
        }

        /* loaded from: classes5.dex */
        final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ t0.g f30890a;

            b(t0.g gVar) {
                this.f30890a = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                i1 i1Var;
                List<io.grpc.x> a11 = this.f30890a.a();
                io.grpc.f fVar = f1.this.T;
                f.a aVar = f.a.DEBUG;
                fVar.b(aVar, "Resolved address: {0}, config={1}", a11, this.f30890a.b());
                t tVar = f1.this.W;
                t tVar2 = t.SUCCESS;
                if (tVar != tVar2) {
                    f1.this.T.b(f.a.INFO, "Address resolved: {0}", a11);
                    f1.this.W = tVar2;
                }
                f1.this.f30832i0 = null;
                t0.c c11 = this.f30890a.c();
                io.grpc.d0 d0Var = (io.grpc.d0) this.f30890a.b().b(io.grpc.d0.f30547a);
                i1 i1Var2 = (c11 == null || c11.c() == null) ? null : (i1) c11.c();
                io.grpc.f1 d11 = c11 != null ? c11.d() : null;
                if (!f1.this.f30816a0) {
                    if (i1Var2 != null) {
                        f1.this.T.a(f.a.INFO, "Service config from name resolver discarded by channel settings");
                    }
                    i1Var = f1.this.Y == null ? f1.f30812q0 : f1.this.Y;
                    if (d0Var != null) {
                        f1.this.T.a(f.a.INFO, "Config selector from name resolver discarded by channel settings");
                    }
                    f1.this.V.o(i1Var.c());
                } else {
                    if (i1Var2 != null) {
                        if (d0Var != null) {
                            f1.this.V.o(d0Var);
                            if (i1Var2.c() != null) {
                                f1.this.T.a(aVar, "Method configs in service config will be discarded due to presence ofconfig-selector");
                            }
                        } else {
                            f1.this.V.o(i1Var2.c());
                        }
                    } else if (f1.this.Y != null) {
                        i1Var2 = f1.this.Y;
                        f1.this.V.o(i1Var2.c());
                        f1.this.T.a(f.a.INFO, "Received no service config, using default service config");
                    } else if (d11 != null) {
                        if (!f1.this.Z) {
                            f1.this.T.a(f.a.INFO, "Fallback to error due to invalid first service config without default config");
                            r.this.a(c11.d());
                            return;
                        }
                        i1Var2 = f1.this.X;
                    } else {
                        i1Var2 = f1.f30812q0;
                        f1.this.V.o(null);
                    }
                    if (!i1Var2.equals(f1.this.X)) {
                        io.grpc.f fVar2 = f1.this.T;
                        f.a aVar2 = f.a.INFO;
                        Object[] objArr = new Object[1];
                        objArr[0] = i1Var2 == f1.f30812q0 ? " to empty" : "";
                        fVar2.b(aVar2, "Service config changed{0}", objArr);
                        f1.this.X = i1Var2;
                    }
                    try {
                        f1.this.Z = true;
                    } catch (RuntimeException e11) {
                        Logger logger = f1.f30807l0;
                        Level level = Level.WARNING;
                        logger.log(level, "[" + f1.this.c() + "] Unexpected exception from parsing service config", (Throwable) e11);
                    }
                    i1Var = i1Var2;
                }
                io.grpc.a b11 = this.f30890a.b();
                r rVar = r.this;
                if (rVar.f30885a == f1.this.C) {
                    a.b c12 = b11.d().c(io.grpc.d0.f30547a);
                    Map<String, ?> d12 = i1Var.d();
                    if (d12 != null) {
                        c12.d(io.grpc.m0.f31498a, d12).a();
                    }
                    io.grpc.f1 d13 = r.this.f30885a.f30877a.d(m0.g.d().b(a11).c(c12.a()).d(i1Var.e()).a());
                    if (d13.p()) {
                        return;
                    }
                    r rVar2 = r.this;
                    rVar2.e(d13.f(r.this.f30886b + " was used"));
                }
            }
        }

        r(q qVar, io.grpc.t0 t0Var) {
            this.f30885a = (q) com.google.common.base.u.p(qVar, "helperImpl");
            this.f30886b = (io.grpc.t0) com.google.common.base.u.p(t0Var, "resolver");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(io.grpc.f1 f1Var) {
            f1.f30807l0.log(Level.WARNING, "[{0}] Failed to resolve name. status={1}", new Object[]{f1.this.c(), f1Var});
            f1.this.V.m();
            t tVar = f1.this.W;
            t tVar2 = t.ERROR;
            if (tVar != tVar2) {
                f1.this.T.b(f.a.WARNING, "Failed to resolve name: {0}", f1Var);
                f1.this.W = tVar2;
            }
            if (this.f30885a != f1.this.C) {
                return;
            }
            this.f30885a.f30877a.b(f1Var);
            f();
        }

        private void f() {
            if (f1.this.f30830h0 == null || !f1.this.f30830h0.b()) {
                if (f1.this.f30832i0 == null) {
                    f1 f1Var = f1.this;
                    f1Var.f30832i0 = f1Var.f30849x.get();
                }
                long a11 = f1.this.f30832i0.a();
                f1.this.T.b(f.a.DEBUG, "Scheduling DNS resolution backoff for {0} ns", Long.valueOf(a11));
                f1 f1Var2 = f1.this;
                f1Var2.f30830h0 = f1Var2.f30842q.c(new l(), a11, TimeUnit.NANOSECONDS, f1.this.f30829h.getScheduledExecutorService());
            }
        }

        @Override // io.grpc.t0.e, io.grpc.t0.f
        public void a(io.grpc.f1 f1Var) {
            com.google.common.base.u.e(!f1Var.p(), "the error status must not be OK");
            f1.this.f30842q.execute(new a(f1Var));
        }

        @Override // io.grpc.t0.e
        public void c(t0.g gVar) {
            f1.this.f30842q.execute(new b(gVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class s extends io.grpc.d {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicReference<io.grpc.d0> f30892a;

        /* renamed from: b  reason: collision with root package name */
        private final String f30893b;

        /* renamed from: c  reason: collision with root package name */
        private final io.grpc.d f30894c;

        /* loaded from: classes5.dex */
        class a extends io.grpc.d {
            a() {
            }

            @Override // io.grpc.d
            public String a() {
                return s.this.f30893b;
            }

            @Override // io.grpc.d
            public <RequestT, ResponseT> io.grpc.g<RequestT, ResponseT> h(io.grpc.s0<RequestT, ResponseT> s0Var, io.grpc.c cVar) {
                return new io.grpc.internal.p(s0Var, f1.this.x0(cVar), cVar, f1.this.f30834j0, f1.this.O ? null : f1.this.f30829h.getScheduledExecutorService(), f1.this.R, null).B(f1.this.f30843r).A(f1.this.f30844s).z(f1.this.f30845t);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public final class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (f1.this.G == null) {
                    if (s.this.f30892a.get() == f1.f30813r0) {
                        s.this.f30892a.set(null);
                    }
                    f1.this.K.b(f1.f30810o0);
                }
            }
        }

        /* loaded from: classes5.dex */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f1.this.w0();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [ReqT, RespT] */
        /* loaded from: classes5.dex */
        class d<ReqT, RespT> extends io.grpc.g<ReqT, RespT> {
            d(s sVar) {
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
            public void d(ReqT reqt) {
            }

            @Override // io.grpc.g
            public void e(g.a<RespT> aVar, io.grpc.r0 r0Var) {
                aVar.a(f1.f30810o0, new io.grpc.r0());
            }
        }

        /* loaded from: classes5.dex */
        class e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f30899a;

            e(f fVar) {
                this.f30899a = fVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (s.this.f30892a.get() == f1.f30813r0) {
                    if (f1.this.G == null) {
                        f1.this.G = new LinkedHashSet();
                        f1 f1Var = f1.this;
                        f1Var.f30828g0.e(f1Var.H, true);
                    }
                    f1.this.G.add(this.f30899a);
                    return;
                }
                this.f30899a.q();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes5.dex */
        public final class f<ReqT, RespT> extends z<ReqT, RespT> {

            /* renamed from: l  reason: collision with root package name */
            final io.grpc.r f30901l;

            /* renamed from: m  reason: collision with root package name */
            final io.grpc.s0<ReqT, RespT> f30902m;

            /* renamed from: n  reason: collision with root package name */
            final io.grpc.c f30903n;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes5.dex */
            public class a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Runnable f30905a;

                a(Runnable runnable) {
                    this.f30905a = runnable;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.f30905a.run();
                    f fVar = f.this;
                    f1.this.f30842q.execute(new b());
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes5.dex */
            public final class b implements Runnable {
                b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (f1.this.G != null) {
                        f1.this.G.remove(f.this);
                        if (f1.this.G.isEmpty()) {
                            f1 f1Var = f1.this;
                            f1Var.f30828g0.e(f1Var.H, false);
                            f1.this.G = null;
                            if (f1.this.L.get()) {
                                f1.this.K.b(f1.f30810o0);
                            }
                        }
                    }
                }
            }

            f(io.grpc.r rVar, io.grpc.s0<ReqT, RespT> s0Var, io.grpc.c cVar) {
                super(f1.this.x0(cVar), f1.this.f30831i, cVar.d());
                this.f30901l = rVar;
                this.f30902m = s0Var;
                this.f30903n = cVar;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // io.grpc.internal.z
            public void j() {
                super.j();
                f1.this.f30842q.execute(new b());
            }

            void q() {
                io.grpc.r b11 = this.f30901l.b();
                try {
                    io.grpc.g<ReqT, RespT> l11 = s.this.l(this.f30902m, this.f30903n);
                    this.f30901l.f(b11);
                    Runnable o11 = o(l11);
                    if (o11 != null) {
                        f1.this.x0(this.f30903n).execute(new a(o11));
                    } else {
                        f1.this.f30842q.execute(new b());
                    }
                } catch (Throwable th2) {
                    this.f30901l.f(b11);
                    throw th2;
                }
            }
        }

        /* synthetic */ s(f1 f1Var, String str, a aVar) {
            this(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <ReqT, RespT> io.grpc.g<ReqT, RespT> l(io.grpc.s0<ReqT, RespT> s0Var, io.grpc.c cVar) {
            io.grpc.d0 d0Var = this.f30892a.get();
            if (d0Var == null) {
                return this.f30894c.h(s0Var, cVar);
            }
            if (d0Var instanceof i1.c) {
                i1.b f11 = ((i1.c) d0Var).f30999b.f(s0Var);
                if (f11 != null) {
                    cVar = cVar.r(i1.b.f30992g, f11);
                }
                return this.f30894c.h(s0Var, cVar);
            }
            return new k(d0Var, this.f30894c, f1.this.f30833j, s0Var, cVar);
        }

        @Override // io.grpc.d
        public String a() {
            return this.f30893b;
        }

        @Override // io.grpc.d
        public <ReqT, RespT> io.grpc.g<ReqT, RespT> h(io.grpc.s0<ReqT, RespT> s0Var, io.grpc.c cVar) {
            if (this.f30892a.get() != f1.f30813r0) {
                return l(s0Var, cVar);
            }
            f1.this.f30842q.execute(new c());
            if (this.f30892a.get() == f1.f30813r0) {
                if (f1.this.L.get()) {
                    return new d(this);
                }
                f fVar = new f(io.grpc.r.e(), s0Var, cVar);
                f1.this.f30842q.execute(new e(fVar));
                return fVar;
            }
            return l(s0Var, cVar);
        }

        void m() {
            if (this.f30892a.get() == f1.f30813r0) {
                o(null);
            }
        }

        void n() {
            f1.this.f30842q.execute(new b());
        }

        void o(io.grpc.d0 d0Var) {
            io.grpc.d0 d0Var2 = this.f30892a.get();
            this.f30892a.set(d0Var);
            if (d0Var2 != f1.f30813r0 || f1.this.G == null) {
                return;
            }
            for (f fVar : f1.this.G) {
                fVar.q();
            }
        }

        private s(String str) {
            this.f30892a = new AtomicReference<>(f1.f30813r0);
            this.f30894c = new a();
            this.f30893b = (String) com.google.common.base.u.p(str, "authority");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public enum t {
        NO_RESOLUTION,
        SUCCESS,
        ERROR
    }

    /* loaded from: classes5.dex */
    private static final class u implements ScheduledExecutorService {

        /* renamed from: a  reason: collision with root package name */
        final ScheduledExecutorService f30908a;

        /* synthetic */ u(ScheduledExecutorService scheduledExecutorService, a aVar) {
            this(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j11, TimeUnit timeUnit) {
            return this.f30908a.awaitTermination(j11, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f30908a.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
            return this.f30908a.invokeAll(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
            return (T) this.f30908a.invokeAny(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return this.f30908a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return this.f30908a.isTerminated();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j11, TimeUnit timeUnit) {
            return this.f30908a.schedule(callable, j11, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
            return this.f30908a.scheduleAtFixedRate(runnable, j11, j12, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
            return this.f30908a.scheduleWithFixedDelay(runnable, j11, j12, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> callable) {
            return this.f30908a.submit(callable);
        }

        private u(ScheduledExecutorService scheduledExecutorService) {
            this.f30908a = (ScheduledExecutorService) com.google.common.base.u.p(scheduledExecutorService, "delegate");
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j11, TimeUnit timeUnit) {
            return this.f30908a.invokeAll(collection, j11, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j11, TimeUnit timeUnit) {
            return (T) this.f30908a.invokeAny(collection, j11, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> schedule(Runnable runnable, long j11, TimeUnit timeUnit) {
            return this.f30908a.schedule(runnable, j11, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable runnable) {
            return this.f30908a.submit(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable runnable, T t11) {
            return this.f30908a.submit(runnable, t11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class v extends io.grpc.internal.e {

        /* renamed from: a  reason: collision with root package name */
        final m0.b f30909a;

        /* renamed from: b  reason: collision with root package name */
        final q f30910b;

        /* renamed from: c  reason: collision with root package name */
        final io.grpc.g0 f30911c;

        /* renamed from: d  reason: collision with root package name */
        final io.grpc.internal.n f30912d;

        /* renamed from: e  reason: collision with root package name */
        final io.grpc.internal.o f30913e;

        /* renamed from: f  reason: collision with root package name */
        List<io.grpc.x> f30914f;

        /* renamed from: g  reason: collision with root package name */
        x0 f30915g;

        /* renamed from: h  reason: collision with root package name */
        boolean f30916h;

        /* renamed from: i  reason: collision with root package name */
        boolean f30917i;

        /* renamed from: j  reason: collision with root package name */
        h1.c f30918j;

        /* loaded from: classes5.dex */
        final class a extends x0.j {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m0.j f30920a;

            a(m0.j jVar) {
                this.f30920a = jVar;
            }

            @Override // io.grpc.internal.x0.j
            void a(x0 x0Var) {
                f1.this.f30828g0.e(x0Var, true);
            }

            @Override // io.grpc.internal.x0.j
            void b(x0 x0Var) {
                f1.this.f30828g0.e(x0Var, false);
            }

            @Override // io.grpc.internal.x0.j
            void c(x0 x0Var, io.grpc.q qVar) {
                com.google.common.base.u.v(this.f30920a != null, "listener is null");
                this.f30920a.a(qVar);
                if (qVar.c() == io.grpc.p.TRANSIENT_FAILURE || qVar.c() == io.grpc.p.IDLE) {
                    q qVar2 = v.this.f30910b;
                    if (qVar2.f30879c || qVar2.f30878b) {
                        return;
                    }
                    f1.f30807l0.log(Level.WARNING, "LoadBalancer should call Helper.refreshNameResolution() to refresh name resolution if subchannel state becomes TRANSIENT_FAILURE or IDLE. This will no longer happen automatically in the future releases");
                    f1.this.D0();
                    v.this.f30910b.f30878b = true;
                }
            }

            @Override // io.grpc.internal.x0.j
            void d(x0 x0Var) {
                f1.this.F.remove(x0Var);
                f1.this.U.k(x0Var);
                f1.this.B0();
            }
        }

        /* loaded from: classes5.dex */
        final class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.f30915g.f(f1.f30811p0);
            }
        }

        v(m0.b bVar, q qVar) {
            this.f30914f = bVar.a();
            if (f1.this.f30819c != null) {
                bVar = bVar.d().e(i(bVar.a())).b();
            }
            this.f30909a = (m0.b) com.google.common.base.u.p(bVar, "args");
            this.f30910b = (q) com.google.common.base.u.p(qVar, "helper");
            io.grpc.g0 b11 = io.grpc.g0.b("Subchannel", f1.this.a());
            this.f30911c = b11;
            int i11 = f1.this.f30841p;
            long a11 = f1.this.f30840o.a();
            io.grpc.internal.o oVar = new io.grpc.internal.o(b11, i11, a11, "Subchannel for " + bVar.a());
            this.f30913e = oVar;
            this.f30912d = new io.grpc.internal.n(oVar, f1.this.f30840o);
        }

        private List<io.grpc.x> i(List<io.grpc.x> list) {
            ArrayList arrayList = new ArrayList();
            for (io.grpc.x xVar : list) {
                arrayList.add(new io.grpc.x(xVar.a(), xVar.b().d().c(io.grpc.x.f31679d).a()));
            }
            return Collections.unmodifiableList(arrayList);
        }

        @Override // io.grpc.m0.h
        public List<io.grpc.x> b() {
            f1.this.f30842q.d();
            com.google.common.base.u.v(this.f30916h, "not started");
            return this.f30914f;
        }

        @Override // io.grpc.m0.h
        public io.grpc.a c() {
            return this.f30909a.b();
        }

        @Override // io.grpc.m0.h
        public Object d() {
            com.google.common.base.u.v(this.f30916h, "Subchannel is not started");
            return this.f30915g;
        }

        @Override // io.grpc.m0.h
        public void e() {
            f1.this.f30842q.d();
            com.google.common.base.u.v(this.f30916h, "not started");
            this.f30915g.a();
        }

        @Override // io.grpc.m0.h
        public void f() {
            h1.c cVar;
            f1.this.f30842q.d();
            if (this.f30915g == null) {
                this.f30917i = true;
                return;
            }
            if (this.f30917i) {
                if (!f1.this.N || (cVar = this.f30918j) == null) {
                    return;
                }
                cVar.a();
                this.f30918j = null;
            } else {
                this.f30917i = true;
            }
            if (!f1.this.N) {
                this.f30918j = f1.this.f30842q.c(new c1(new b()), 5L, TimeUnit.SECONDS, f1.this.f30829h.getScheduledExecutorService());
            } else {
                this.f30915g.f(f1.f30810o0);
            }
        }

        @Override // io.grpc.m0.h
        public void g(m0.j jVar) {
            f1.this.f30842q.d();
            com.google.common.base.u.v(!this.f30916h, "already started");
            com.google.common.base.u.v(!this.f30917i, "already shutdown");
            com.google.common.base.u.v(!f1.this.N, "Channel is being terminated");
            this.f30916h = true;
            x0 x0Var = new x0(this.f30909a.a(), f1.this.a(), f1.this.f30851z, f1.this.f30849x, f1.this.f30829h, f1.this.f30829h.getScheduledExecutorService(), f1.this.f30846u, f1.this.f30842q, new a(jVar), f1.this.U, f1.this.Q.create(), this.f30913e, this.f30911c, this.f30912d);
            f1.this.S.e(new c0.a().b("Child Subchannel started").c(c0.b.CT_INFO).e(f1.this.f30840o.a()).d(x0Var).a());
            this.f30915g = x0Var;
            f1.this.U.e(x0Var);
            f1.this.F.add(x0Var);
        }

        @Override // io.grpc.m0.h
        public void h(List<io.grpc.x> list) {
            f1.this.f30842q.d();
            this.f30914f = list;
            if (f1.this.f30819c != null) {
                list = i(list);
            }
            this.f30915g.T(list);
        }

        public String toString() {
            return this.f30911c.toString();
        }
    }

    static {
        io.grpc.f1 f1Var = io.grpc.f1.f30571o;
        f30809n0 = f1Var.r("Channel shutdownNow invoked");
        f30810o0 = f1Var.r("Channel shutdown invoked");
        f30811p0 = f1Var.r("Subchannel shutdown invoked");
        f30812q0 = i1.a();
        f30813r0 = new a();
        f30814s0 = new i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1(g1 g1Var, io.grpc.internal.t tVar, k.a aVar, o1<? extends Executor> o1Var, com.google.common.base.a0<com.google.common.base.y> a0Var, List<io.grpc.h> list, k2 k2Var) {
        a aVar2;
        io.grpc.h1 h1Var = new io.grpc.h1(new f());
        this.f30842q = h1Var;
        this.f30848w = new io.grpc.internal.w();
        this.F = new HashSet(16, 0.75f);
        this.H = new Object();
        this.I = new HashSet(1, 0.75f);
        this.K = new w(this, null);
        this.L = new AtomicBoolean(false);
        this.P = new CountDownLatch(1);
        this.W = t.NO_RESOLUTION;
        this.X = f30812q0;
        this.Z = false;
        this.f30818b0 = new y1.t();
        m mVar = new m(this, null);
        this.f30826f0 = mVar;
        this.f30828g0 = new o(this, null);
        this.f30834j0 = new j(this, null);
        String str = (String) com.google.common.base.u.p(g1Var.f30944f, "target");
        this.f30817b = str;
        io.grpc.g0 b11 = io.grpc.g0.b("Channel", str);
        this.f30815a = b11;
        this.f30840o = (k2) com.google.common.base.u.p(k2Var, "timeProvider");
        o1<? extends Executor> o1Var2 = (o1) com.google.common.base.u.p(g1Var.f30939a, "executorPool");
        this.f30835k = o1Var2;
        Executor executor = (Executor) com.google.common.base.u.p(o1Var2.a(), "executor");
        this.f30833j = executor;
        this.f30827g = tVar;
        io.grpc.internal.l lVar = new io.grpc.internal.l(tVar, g1Var.f30945g, executor);
        this.f30829h = lVar;
        new io.grpc.internal.l(tVar, null, executor);
        u uVar = new u(lVar.getScheduledExecutorService(), null);
        this.f30831i = uVar;
        this.f30841p = g1Var.f30959u;
        int i11 = g1Var.f30959u;
        long a11 = k2Var.a();
        io.grpc.internal.o oVar = new io.grpc.internal.o(b11, i11, a11, "Channel for '" + str + "'");
        this.S = oVar;
        io.grpc.internal.n nVar = new io.grpc.internal.n(oVar, k2Var);
        this.T = nVar;
        io.grpc.y0 y0Var = g1Var.f30962x;
        y0Var = y0Var == null ? q0.f31169l : y0Var;
        boolean z11 = g1Var.f30957s;
        this.f30824e0 = z11;
        io.grpc.internal.j jVar = new io.grpc.internal.j(g1Var.f30948j);
        this.f30825f = jVar;
        this.f30839n = new n((o1) com.google.common.base.u.p(g1Var.f30940b, "offloadExecutorPool"));
        a2 a2Var = new a2(z11, g1Var.f30953o, g1Var.f30954p, jVar);
        t0.b a12 = t0.b.f().c(g1Var.b()).e(y0Var).h(h1Var).f(uVar).g(a2Var).b(nVar).d(new g()).a();
        this.f30823e = a12;
        String str2 = g1Var.f30947i;
        this.f30819c = str2;
        t0.d dVar = g1Var.f30943e;
        this.f30821d = dVar;
        this.A = z0(str, str2, dVar, a12);
        this.f30837l = (o1) com.google.common.base.u.p(o1Var, "balancerRpcExecutorPool");
        this.f30838m = new n(o1Var);
        a0 a0Var2 = new a0(executor, h1Var);
        this.J = a0Var2;
        a0Var2.g(mVar);
        this.f30849x = aVar;
        Map<String, ?> map = g1Var.f30960v;
        if (map != null) {
            t0.c a13 = a2Var.a(map);
            com.google.common.base.u.x(a13.d() == null, "Default config is invalid: %s", a13.d());
            i1 i1Var = (i1) a13.c();
            this.Y = i1Var;
            this.X = i1Var;
            aVar2 = null;
        } else {
            aVar2 = null;
            this.Y = null;
        }
        boolean z12 = g1Var.f30961w;
        this.f30816a0 = z12;
        s sVar = new s(this, this.A.a(), aVar2);
        this.V = sVar;
        this.f30850y = io.grpc.j.a(sVar, list);
        this.f30846u = (com.google.common.base.a0) com.google.common.base.u.p(a0Var, "stopwatchSupplier");
        long j11 = g1Var.f30952n;
        if (j11 == -1) {
            this.f30847v = j11;
        } else {
            com.google.common.base.u.j(j11 >= g1.I, "invalid idleTimeoutMillis %s", j11);
            this.f30847v = g1Var.f30952n;
        }
        this.f30836k0 = new x1(new p(this, null), h1Var, lVar.getScheduledExecutorService(), a0Var.get());
        this.f30843r = g1Var.f30949k;
        this.f30844s = (io.grpc.v) com.google.common.base.u.p(g1Var.f30950l, "decompressorRegistry");
        this.f30845t = (io.grpc.o) com.google.common.base.u.p(g1Var.f30951m, "compressorRegistry");
        this.f30851z = g1Var.f30946h;
        this.f30822d0 = g1Var.f30955q;
        this.f30820c0 = g1Var.f30956r;
        c cVar = new c(this, k2Var);
        this.Q = cVar;
        this.R = cVar.create();
        io.grpc.b0 b0Var = (io.grpc.b0) com.google.common.base.u.o(g1Var.f30958t);
        this.U = b0Var;
        b0Var.d(this);
        if (z12) {
            return;
        }
        if (this.Y != null) {
            nVar.a(f.a.INFO, "Service config look-up disabled, using default service config");
        }
        this.Z = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0() {
        if (this.M) {
            for (x0 x0Var : this.F) {
                x0Var.b(f30809n0);
            }
            for (p1 p1Var : this.I) {
                p1Var.j().b(f30809n0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0() {
        if (!this.O && this.L.get() && this.F.isEmpty() && this.I.isEmpty()) {
            this.T.a(f.a.INFO, "Terminated");
            this.U.j(this);
            this.f30835k.b(this.f30833j);
            this.f30838m.b();
            this.f30839n.b();
            this.f30829h.close();
            this.O = true;
            this.P.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0() {
        this.f30842q.d();
        u0();
        E0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0() {
        this.f30842q.d();
        if (this.B) {
            this.A.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0() {
        long j11 = this.f30847v;
        if (j11 == -1) {
            return;
        }
        this.f30836k0.k(j11, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0(boolean z11) {
        this.f30842q.d();
        if (z11) {
            com.google.common.base.u.v(this.B, "nameResolver is not started");
            com.google.common.base.u.v(this.C != null, "lbHelper is null");
        }
        if (this.A != null) {
            u0();
            this.A.c();
            this.B = false;
            if (z11) {
                this.A = z0(this.f30817b, this.f30819c, this.f30821d, this.f30823e);
            } else {
                this.A = null;
            }
        }
        q qVar = this.C;
        if (qVar != null) {
            qVar.f30877a.c();
            this.C = null;
        }
        this.D = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0(m0.i iVar) {
        this.D = iVar;
        this.J.r(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(boolean z11) {
        this.f30836k0.i(z11);
    }

    private void u0() {
        this.f30842q.d();
        h1.c cVar = this.f30830h0;
        if (cVar != null) {
            cVar.a();
            this.f30830h0 = null;
            this.f30832i0 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0() {
        H0(true);
        this.J.r(null);
        this.T.a(f.a.INFO, "Entering IDLE state");
        this.f30848w.a(io.grpc.p.IDLE);
        if (this.f30828g0.a(this.H, this.J)) {
            w0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Executor x0(io.grpc.c cVar) {
        Executor e11 = cVar.e();
        return e11 == null ? this.f30833j : e11;
    }

    private static io.grpc.t0 y0(String str, t0.d dVar, t0.b bVar) {
        URI uri;
        io.grpc.t0 b11;
        StringBuilder sb2 = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e11) {
            sb2.append(e11.getMessage());
            uri = null;
        }
        if (uri == null || (b11 = dVar.b(uri, bVar)) == null) {
            String str2 = "";
            if (!f30808m0.matcher(str).matches()) {
                try {
                    io.grpc.t0 b12 = dVar.b(new URI(dVar.a(), "", "/" + str, null), bVar);
                    if (b12 != null) {
                        return b12;
                    }
                } catch (URISyntaxException e12) {
                    throw new IllegalArgumentException(e12);
                }
            }
            Object[] objArr = new Object[2];
            objArr[0] = str;
            if (sb2.length() > 0) {
                str2 = " (" + ((Object) sb2) + ")";
            }
            objArr[1] = str2;
            throw new IllegalArgumentException(String.format("cannot find a NameResolver for %s%s", objArr));
        }
        return b11;
    }

    static io.grpc.t0 z0(String str, String str2, t0.d dVar, t0.b bVar) {
        io.grpc.t0 y02 = y0(str, dVar, bVar);
        return str2 == null ? y02 : new h(y02, str2);
    }

    void C0(Throwable th2) {
        if (this.E) {
            return;
        }
        this.E = true;
        t0(true);
        H0(false);
        I0(new d(this, th2));
        this.T.a(f.a.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
        this.f30848w.a(io.grpc.p.TRANSIENT_FAILURE);
    }

    @Override // io.grpc.p0
    /* renamed from: G0 */
    public f1 i() {
        this.T.a(f.a.DEBUG, "shutdown() called");
        if (this.L.compareAndSet(false, true)) {
            this.f30842q.execute(new e());
            this.V.n();
            this.f30842q.execute(new b());
            return this;
        }
        return this;
    }

    @Override // io.grpc.d
    public String a() {
        return this.f30850y.a();
    }

    @Override // io.grpc.k0
    public io.grpc.g0 c() {
        return this.f30815a;
    }

    @Override // io.grpc.d
    public <ReqT, RespT> io.grpc.g<ReqT, RespT> h(io.grpc.s0<ReqT, RespT> s0Var, io.grpc.c cVar) {
        return this.f30850y.h(s0Var, cVar);
    }

    public String toString() {
        return com.google.common.base.o.c(this).c("logId", this.f30815a.d()).d("target", this.f30817b).toString();
    }

    void w0() {
        this.f30842q.d();
        if (this.L.get() || this.E) {
            return;
        }
        if (this.f30828g0.d()) {
            t0(false);
        } else {
            F0();
        }
        if (this.C != null) {
            return;
        }
        this.T.a(f.a.INFO, "Exiting idle mode");
        q qVar = new q(this, null);
        qVar.f30877a = this.f30825f.e(qVar);
        this.C = qVar;
        this.A.d(new r(qVar, this.A));
        this.B = true;
    }

    /* loaded from: classes5.dex */
    private final class w {

        /* renamed from: a  reason: collision with root package name */
        final Object f30923a;

        /* renamed from: b  reason: collision with root package name */
        Collection<io.grpc.internal.q> f30924b;

        /* renamed from: c  reason: collision with root package name */
        io.grpc.f1 f30925c;

        private w() {
            this.f30923a = new Object();
            this.f30924b = new HashSet();
        }

        io.grpc.f1 a(y1<?> y1Var) {
            synchronized (this.f30923a) {
                io.grpc.f1 f1Var = this.f30925c;
                if (f1Var != null) {
                    return f1Var;
                }
                this.f30924b.add(y1Var);
                return null;
            }
        }

        void b(io.grpc.f1 f1Var) {
            synchronized (this.f30923a) {
                if (this.f30925c != null) {
                    return;
                }
                this.f30925c = f1Var;
                boolean isEmpty = this.f30924b.isEmpty();
                if (isEmpty) {
                    f1.this.J.f(f1Var);
                }
            }
        }

        void c(y1<?> y1Var) {
            io.grpc.f1 f1Var;
            synchronized (this.f30923a) {
                this.f30924b.remove(y1Var);
                if (this.f30924b.isEmpty()) {
                    f1Var = this.f30925c;
                    this.f30924b = new HashSet();
                } else {
                    f1Var = null;
                }
            }
            if (f1Var != null) {
                f1.this.J.f(f1Var);
            }
        }

        /* synthetic */ w(f1 f1Var, a aVar) {
            this();
        }
    }
}