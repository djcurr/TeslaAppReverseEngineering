package io.grpc.internal;

import expo.modules.interfaces.permissions.PermissionsResponse;
import io.grpc.b;
import io.grpc.internal.m1;
import io.grpc.internal.t;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
final class l implements t {

    /* renamed from: a  reason: collision with root package name */
    private final t f31034a;

    /* renamed from: b  reason: collision with root package name */
    private final io.grpc.b f31035b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f31036c;

    /* loaded from: classes5.dex */
    private class a extends j0 {

        /* renamed from: a  reason: collision with root package name */
        private final v f31037a;

        /* renamed from: c  reason: collision with root package name */
        private volatile io.grpc.f1 f31039c;

        /* renamed from: d  reason: collision with root package name */
        private io.grpc.f1 f31040d;

        /* renamed from: e  reason: collision with root package name */
        private io.grpc.f1 f31041e;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicInteger f31038b = new AtomicInteger(-2147483647);

        /* renamed from: f  reason: collision with root package name */
        private final m1.a f31042f = new C0590a();

        /* renamed from: io.grpc.internal.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        class C0590a implements m1.a {
            C0590a() {
            }

            @Override // io.grpc.internal.m1.a
            public void onComplete() {
                if (a.this.f31038b.decrementAndGet() == 0) {
                    a.this.j();
                }
            }
        }

        /* loaded from: classes5.dex */
        class b extends b.AbstractC0585b {
            b(a aVar, io.grpc.s0 s0Var, io.grpc.c cVar) {
            }
        }

        a(v vVar, String str) {
            this.f31037a = (v) com.google.common.base.u.p(vVar, "delegate");
            String str2 = (String) com.google.common.base.u.p(str, "authority");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
            synchronized (this) {
                if (this.f31038b.get() != 0) {
                    return;
                }
                io.grpc.f1 f1Var = this.f31040d;
                io.grpc.f1 f1Var2 = this.f31041e;
                this.f31040d = null;
                this.f31041e = null;
                if (f1Var != null) {
                    super.f(f1Var);
                }
                if (f1Var2 != null) {
                    super.b(f1Var2);
                }
            }
        }

        @Override // io.grpc.internal.j0
        protected v a() {
            return this.f31037a;
        }

        @Override // io.grpc.internal.j0, io.grpc.internal.j1
        public void b(io.grpc.f1 f1Var) {
            com.google.common.base.u.p(f1Var, PermissionsResponse.STATUS_KEY);
            synchronized (this) {
                if (this.f31038b.get() < 0) {
                    this.f31039c = f1Var;
                    this.f31038b.addAndGet(Integer.MAX_VALUE);
                } else if (this.f31041e != null) {
                    return;
                }
                if (this.f31038b.get() != 0) {
                    this.f31041e = f1Var;
                } else {
                    super.b(f1Var);
                }
            }
        }

        @Override // io.grpc.internal.j0, io.grpc.internal.s
        public q e(io.grpc.s0<?, ?> s0Var, io.grpc.r0 r0Var, io.grpc.c cVar, io.grpc.k[] kVarArr) {
            io.grpc.b c11 = cVar.c();
            if (c11 == null) {
                c11 = l.this.f31035b;
            } else if (l.this.f31035b != null) {
                c11 = new io.grpc.m(l.this.f31035b, c11);
            }
            if (c11 != null) {
                m1 m1Var = new m1(this.f31037a, s0Var, r0Var, cVar, this.f31042f, kVarArr);
                if (this.f31038b.incrementAndGet() > 0) {
                    this.f31042f.onComplete();
                    return new f0(this.f31039c, kVarArr);
                }
                try {
                    c11.a(new b(this, s0Var, cVar), (Executor) com.google.common.base.o.a(cVar.e(), l.this.f31036c), m1Var);
                } catch (Throwable th2) {
                    m1Var.b(io.grpc.f1.f30567k.r("Credentials should use fail() instead of throwing exceptions").q(th2));
                }
                return m1Var.d();
            } else if (this.f31038b.get() >= 0) {
                return new f0(this.f31039c, kVarArr);
            } else {
                return this.f31037a.e(s0Var, r0Var, cVar, kVarArr);
            }
        }

        @Override // io.grpc.internal.j0, io.grpc.internal.j1
        public void f(io.grpc.f1 f1Var) {
            com.google.common.base.u.p(f1Var, PermissionsResponse.STATUS_KEY);
            synchronized (this) {
                if (this.f31038b.get() < 0) {
                    this.f31039c = f1Var;
                    this.f31038b.addAndGet(Integer.MAX_VALUE);
                    if (this.f31038b.get() != 0) {
                        this.f31040d = f1Var;
                    } else {
                        super.f(f1Var);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(t tVar, io.grpc.b bVar, Executor executor) {
        this.f31034a = (t) com.google.common.base.u.p(tVar, "delegate");
        this.f31035b = bVar;
        this.f31036c = (Executor) com.google.common.base.u.p(executor, "appExecutor");
    }

    @Override // io.grpc.internal.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f31034a.close();
    }

    @Override // io.grpc.internal.t
    public v g1(SocketAddress socketAddress, t.a aVar, io.grpc.f fVar) {
        return new a(this.f31034a.g1(socketAddress, aVar, fVar), aVar.a());
    }

    @Override // io.grpc.internal.t
    public ScheduledExecutorService getScheduledExecutorService() {
        return this.f31034a.getScheduledExecutorService();
    }
}