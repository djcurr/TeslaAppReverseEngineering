package io.grpc.stub;

import com.google.common.base.o;
import com.google.common.base.u;
import com.google.common.base.z;
import io.grpc.StatusException;
import io.grpc.StatusRuntimeException;
import io.grpc.c;
import io.grpc.f1;
import io.grpc.g;
import io.grpc.r0;
import io.grpc.s0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f31610a = Logger.getLogger(g.class.getName());

    /* renamed from: b  reason: collision with root package name */
    static boolean f31611b;

    /* renamed from: c  reason: collision with root package name */
    static final c.a<EnumC0595g> f31612c;

    /* loaded from: classes5.dex */
    private static final class b<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        private final BlockingQueue<Object> f31613a = new ArrayBlockingQueue(3);

        /* renamed from: b  reason: collision with root package name */
        private final e<T> f31614b = new a();

        /* renamed from: c  reason: collision with root package name */
        private final io.grpc.g<?, T> f31615c;

        /* renamed from: d  reason: collision with root package name */
        private final h f31616d;

        /* renamed from: e  reason: collision with root package name */
        private Object f31617e;

        /* loaded from: classes5.dex */
        private final class a extends e<T> {

            /* renamed from: a  reason: collision with root package name */
            private boolean f31618a;

            a() {
                super();
                this.f31618a = false;
            }

            @Override // io.grpc.g.a
            public void a(f1 f1Var, r0 r0Var) {
                u.v(!this.f31618a, "ClientCall already closed");
                if (f1Var.p()) {
                    b.this.f31613a.add(b.this);
                } else {
                    b.this.f31613a.add(f1Var.e(r0Var));
                }
                this.f31618a = true;
            }

            @Override // io.grpc.g.a
            public void b(r0 r0Var) {
            }

            @Override // io.grpc.g.a
            public void c(T t11) {
                u.v(!this.f31618a, "ClientCall already closed");
                b.this.f31613a.add(t11);
            }

            @Override // io.grpc.stub.g.e
            void e() {
                b.this.f31615c.c(1);
            }
        }

        b(io.grpc.g<?, T> gVar, h hVar) {
            this.f31615c = gVar;
            this.f31616d = hVar;
        }

        private Object d() {
            Object take;
            Object poll;
            boolean z11 = true;
            boolean z12 = false;
            try {
                try {
                    if (this.f31616d == null) {
                        while (true) {
                            try {
                                take = this.f31613a.take();
                                break;
                            } catch (InterruptedException e11) {
                                this.f31615c.a("Thread interrupted", e11);
                                z12 = z11;
                            }
                        }
                        if (z12) {
                            Thread.currentThread().interrupt();
                        }
                        return take;
                    }
                    while (true) {
                        poll = this.f31613a.poll();
                        if (poll != null) {
                            break;
                        }
                        try {
                            this.f31616d.d();
                        } catch (InterruptedException e12) {
                            this.f31615c.a("Thread interrupted", e12);
                            z12 = true;
                        }
                    }
                    if (poll == this || (poll instanceof StatusRuntimeException)) {
                        this.f31616d.shutdown();
                    }
                    if (z12) {
                        Thread.currentThread().interrupt();
                    }
                    return poll;
                } catch (Throwable th2) {
                    z12 = z11;
                    th = th2;
                }
                z12 = z11;
                th = th2;
            } catch (Throwable th3) {
                th = th3;
            }
            if (z12) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }

        e<T> c() {
            return this.f31614b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Object obj;
            while (true) {
                obj = this.f31617e;
                if (obj != null) {
                    break;
                }
                this.f31617e = d();
            }
            if (!(obj instanceof StatusRuntimeException)) {
                return obj != this;
            }
            StatusRuntimeException statusRuntimeException = (StatusRuntimeException) obj;
            throw statusRuntimeException.a().e(statusRuntimeException.b());
        }

        @Override // java.util.Iterator
        public T next() {
            Object obj = this.f31617e;
            if (!(obj instanceof StatusRuntimeException) && obj != this) {
                this.f31615c.c(1);
            }
            if (hasNext()) {
                T t11 = (T) this.f31617e;
                this.f31617e = null;
                return t11;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class c<ReqT> extends io.grpc.stub.f<ReqT> {

        /* renamed from: a  reason: collision with root package name */
        private final io.grpc.g<ReqT, ?> f31620a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f31621b;

        /* renamed from: c  reason: collision with root package name */
        private Runnable f31622c;

        /* renamed from: d  reason: collision with root package name */
        private int f31623d = 1;

        /* renamed from: e  reason: collision with root package name */
        private boolean f31624e = true;

        /* renamed from: f  reason: collision with root package name */
        private boolean f31625f = false;

        /* renamed from: g  reason: collision with root package name */
        private boolean f31626g = false;

        c(io.grpc.g<ReqT, ?> gVar, boolean z11) {
            this.f31620a = gVar;
            this.f31621b = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
        }

        @Override // io.grpc.stub.j
        public void a() {
            this.f31620a.b();
            this.f31626g = true;
        }

        @Override // io.grpc.stub.j
        public void b(ReqT reqt) {
            u.v(!this.f31625f, "Stream was terminated by error, no further calls are allowed");
            u.v(!this.f31626g, "Stream is already completed, no further calls are allowed");
            this.f31620a.d(reqt);
        }

        @Override // io.grpc.stub.f
        public void d(String str, Throwable th2) {
            this.f31620a.a(str, th2);
        }

        public void k(int i11) {
            if (!this.f31621b && i11 == 1) {
                this.f31620a.c(2);
            } else {
                this.f31620a.c(i11);
            }
        }

        @Override // io.grpc.stub.j
        public void onError(Throwable th2) {
            this.f31620a.a("Cancelled by client with StreamObserver.onError()", th2);
            this.f31625f = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class d<RespT> extends com.google.common.util.concurrent.a<RespT> {

        /* renamed from: h  reason: collision with root package name */
        private final io.grpc.g<?, RespT> f31627h;

        d(io.grpc.g<?, RespT> gVar) {
            this.f31627h = gVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.a
        public boolean C(RespT respt) {
            return super.C(respt);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.a
        public boolean D(Throwable th2) {
            return super.D(th2);
        }

        @Override // com.google.common.util.concurrent.a
        protected void y() {
            this.f31627h.a("GrpcFuture was cancelled", null);
        }

        @Override // com.google.common.util.concurrent.a
        protected String z() {
            return o.c(this).d("clientCall", this.f31627h).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static abstract class e<T> extends g.a<T> {
        private e() {
        }

        abstract void e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class f<ReqT, RespT> extends e<RespT> {

        /* renamed from: a  reason: collision with root package name */
        private final j<RespT> f31628a;

        /* renamed from: b  reason: collision with root package name */
        private final c<ReqT> f31629b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f31630c;

        f(j<RespT> jVar, c<ReqT> cVar) {
            super();
            this.f31628a = jVar;
            this.f31629b = cVar;
            if (jVar instanceof io.grpc.stub.h) {
                ((io.grpc.stub.h) jVar).c(cVar);
            }
            cVar.j();
        }

        @Override // io.grpc.g.a
        public void a(f1 f1Var, r0 r0Var) {
            if (f1Var.p()) {
                this.f31628a.a();
            } else {
                this.f31628a.onError(f1Var.e(r0Var));
            }
        }

        @Override // io.grpc.g.a
        public void b(r0 r0Var) {
        }

        @Override // io.grpc.g.a
        public void c(RespT respt) {
            if (this.f31630c && !((c) this.f31629b).f31621b) {
                throw f1.f30570n.r("More than one responses received for unary or client-streaming call").d();
            }
            this.f31630c = true;
            this.f31628a.b(respt);
            if (((c) this.f31629b).f31621b && ((c) this.f31629b).f31624e) {
                this.f31629b.k(1);
            }
        }

        @Override // io.grpc.g.a
        public void d() {
            if (((c) this.f31629b).f31622c != null) {
                ((c) this.f31629b).f31622c.run();
            }
        }

        @Override // io.grpc.stub.g.e
        void e() {
            if (((c) this.f31629b).f31623d > 0) {
                c<ReqT> cVar = this.f31629b;
                cVar.k(((c) cVar).f31623d);
            }
        }
    }

    /* renamed from: io.grpc.stub.g$g  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    enum EnumC0595g {
        BLOCKING,
        FUTURE,
        ASYNC
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class h extends ConcurrentLinkedQueue<Runnable> implements Executor {

        /* renamed from: b  reason: collision with root package name */
        private static final Logger f31631b = Logger.getLogger(h.class.getName());

        /* renamed from: c  reason: collision with root package name */
        private static final Object f31632c = new Object();

        /* renamed from: a  reason: collision with root package name */
        private volatile Object f31633a;

        h() {
        }

        private static void b(Runnable runnable) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                f31631b.log(Level.WARNING, "Runnable threw exception", th2);
            }
        }

        private static void c() {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
        }

        public void d() {
            Runnable poll;
            c();
            Runnable poll2 = poll();
            if (poll2 == null) {
                this.f31633a = Thread.currentThread();
                while (true) {
                    try {
                        poll = poll();
                        if (poll != null) {
                            break;
                        }
                        LockSupport.park(this);
                        c();
                    } catch (Throwable th2) {
                        this.f31633a = null;
                        throw th2;
                    }
                }
                this.f31633a = null;
                poll2 = poll;
            }
            do {
                b(poll2);
                poll2 = poll();
            } while (poll2 != null);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            add(runnable);
            Object obj = this.f31633a;
            if (obj != f31632c) {
                LockSupport.unpark((Thread) obj);
            } else if (remove(runnable) && g.f31611b) {
                throw new RejectedExecutionException();
            }
        }

        public void shutdown() {
            this.f31633a = f31632c;
            while (true) {
                Runnable poll = poll();
                if (poll == null) {
                    return;
                }
                b(poll);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class i<RespT> extends e<RespT> {

        /* renamed from: a  reason: collision with root package name */
        private final d<RespT> f31634a;

        /* renamed from: b  reason: collision with root package name */
        private RespT f31635b;

        i(d<RespT> dVar) {
            super();
            this.f31634a = dVar;
        }

        @Override // io.grpc.g.a
        public void a(f1 f1Var, r0 r0Var) {
            if (f1Var.p()) {
                if (this.f31635b == null) {
                    this.f31634a.D(f1.f30570n.r("No value received for unary call").e(r0Var));
                }
                this.f31634a.C(this.f31635b);
                return;
            }
            this.f31634a.D(f1Var.e(r0Var));
        }

        @Override // io.grpc.g.a
        public void b(r0 r0Var) {
        }

        @Override // io.grpc.g.a
        public void c(RespT respt) {
            if (this.f31635b == null) {
                this.f31635b = respt;
                return;
            }
            throw f1.f30570n.r("More than one value received for unary call").d();
        }

        @Override // io.grpc.stub.g.e
        void e() {
            ((d) this.f31634a).f31627h.c(2);
        }
    }

    static {
        f31611b = !z.b(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        f31612c = c.a.b("internal-stub-type");
    }

    private g() {
    }

    public static <ReqT, RespT> void a(io.grpc.g<ReqT, RespT> gVar, ReqT reqt, j<RespT> jVar) {
        d(gVar, reqt, jVar, true);
    }

    public static <ReqT, RespT> void b(io.grpc.g<ReqT, RespT> gVar, ReqT reqt, j<RespT> jVar) {
        d(gVar, reqt, jVar, false);
    }

    private static <ReqT, RespT> void c(io.grpc.g<ReqT, RespT> gVar, ReqT reqt, e<RespT> eVar) {
        j(gVar, eVar);
        try {
            gVar.d(reqt);
            gVar.b();
        } catch (Error e11) {
            throw g(gVar, e11);
        } catch (RuntimeException e12) {
            throw g(gVar, e12);
        }
    }

    private static <ReqT, RespT> void d(io.grpc.g<ReqT, RespT> gVar, ReqT reqt, j<RespT> jVar, boolean z11) {
        c(gVar, reqt, new f(jVar, new c(gVar, z11)));
    }

    public static <ReqT, RespT> Iterator<RespT> e(io.grpc.d dVar, s0<ReqT, RespT> s0Var, io.grpc.c cVar, ReqT reqt) {
        h hVar = new h();
        io.grpc.g h11 = dVar.h(s0Var, cVar.r(f31612c, EnumC0595g.BLOCKING).o(hVar));
        b bVar = new b(h11, hVar);
        c(h11, reqt, bVar.c());
        return bVar;
    }

    public static <ReqT, RespT> RespT f(io.grpc.d dVar, s0<ReqT, RespT> s0Var, io.grpc.c cVar, ReqT reqt) {
        h hVar = new h();
        io.grpc.g h11 = dVar.h(s0Var, cVar.r(f31612c, EnumC0595g.BLOCKING).o(hVar));
        boolean z11 = false;
        try {
            try {
                com.google.common.util.concurrent.c h12 = h(h11, reqt);
                while (!h12.isDone()) {
                    try {
                        hVar.d();
                    } catch (InterruptedException e11) {
                        try {
                            h11.a("Thread interrupted", e11);
                            z11 = true;
                        } catch (Error e12) {
                            e = e12;
                            throw g(h11, e);
                        } catch (RuntimeException e13) {
                            e = e13;
                            throw g(h11, e);
                        } catch (Throwable th2) {
                            th = th2;
                            z11 = true;
                            if (z11) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                }
                hVar.shutdown();
                RespT respt = (RespT) i(h12);
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                return respt;
            } catch (Error e14) {
                e = e14;
            } catch (RuntimeException e15) {
                e = e15;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static RuntimeException g(io.grpc.g<?, ?> gVar, Throwable th2) {
        try {
            gVar.a(null, th2);
        } catch (Throwable th3) {
            f31610a.log(Level.SEVERE, "RuntimeException encountered while closing call", th3);
        }
        if (!(th2 instanceof RuntimeException)) {
            if (th2 instanceof Error) {
                throw ((Error) th2);
            }
            throw new AssertionError(th2);
        }
        throw ((RuntimeException) th2);
    }

    public static <ReqT, RespT> com.google.common.util.concurrent.c<RespT> h(io.grpc.g<ReqT, RespT> gVar, ReqT reqt) {
        d dVar = new d(gVar);
        c(gVar, reqt, new i(dVar));
        return dVar;
    }

    private static <V> V i(Future<V> future) {
        try {
            return future.get();
        } catch (InterruptedException e11) {
            Thread.currentThread().interrupt();
            throw f1.f30563g.r("Thread interrupted").q(e11).d();
        } catch (ExecutionException e12) {
            throw k(e12.getCause());
        }
    }

    private static <ReqT, RespT> void j(io.grpc.g<ReqT, RespT> gVar, e<RespT> eVar) {
        gVar.e(eVar, new r0());
        eVar.e();
    }

    private static StatusRuntimeException k(Throwable th2) {
        for (Throwable th3 = (Throwable) u.p(th2, "t"); th3 != null; th3 = th3.getCause()) {
            if (th3 instanceof StatusException) {
                StatusException statusException = (StatusException) th3;
                return new StatusRuntimeException(statusException.a(), statusException.b());
            } else if (th3 instanceof StatusRuntimeException) {
                StatusRuntimeException statusRuntimeException = (StatusRuntimeException) th3;
                return new StatusRuntimeException(statusRuntimeException.a(), statusRuntimeException.b());
            }
        }
        return f1.f30564h.r("unexpected exception").q(th2).d();
    }
}