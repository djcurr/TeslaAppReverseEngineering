package io.grpc.internal;

import io.grpc.f;
import io.grpc.internal.d2;
import io.grpc.m0;
import io.grpc.t0;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final io.grpc.o0 f31000a;

    /* renamed from: b  reason: collision with root package name */
    private final String f31001b;

    /* loaded from: classes5.dex */
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        private final m0.d f31002a;

        /* renamed from: b  reason: collision with root package name */
        private io.grpc.m0 f31003b;

        /* renamed from: c  reason: collision with root package name */
        private io.grpc.n0 f31004c;

        b(m0.d dVar) {
            this.f31002a = dVar;
            io.grpc.n0 d11 = j.this.f31000a.d(j.this.f31001b);
            this.f31004c = d11;
            if (d11 == null) {
                throw new IllegalStateException("Could not find policy '" + j.this.f31001b + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
            }
            this.f31003b = d11.a(dVar);
        }

        public io.grpc.m0 a() {
            return this.f31003b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(io.grpc.f1 f1Var) {
            a().b(f1Var);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c() {
            this.f31003b.d();
            this.f31003b = null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public io.grpc.f1 d(m0.g gVar) {
            List<io.grpc.x> a11 = gVar.a();
            io.grpc.a b11 = gVar.b();
            d2.b bVar = (d2.b) gVar.c();
            if (bVar == null) {
                try {
                    j jVar = j.this;
                    bVar = new d2.b(jVar.d(jVar.f31001b, "using default policy"), null);
                } catch (f e11) {
                    this.f31002a.e(io.grpc.p.TRANSIENT_FAILURE, new d(io.grpc.f1.f30570n.r(e11.getMessage())));
                    this.f31003b.d();
                    this.f31004c = null;
                    this.f31003b = new e();
                    return io.grpc.f1.f30562f;
                }
            }
            if (this.f31004c == null || !bVar.f30770a.b().equals(this.f31004c.b())) {
                this.f31002a.e(io.grpc.p.CONNECTING, new c());
                this.f31003b.d();
                io.grpc.n0 n0Var = bVar.f30770a;
                this.f31004c = n0Var;
                io.grpc.m0 m0Var = this.f31003b;
                this.f31003b = n0Var.a(this.f31002a);
                this.f31002a.b().b(f.a.INFO, "Load balancer changed from {0} to {1}", m0Var.getClass().getSimpleName(), this.f31003b.getClass().getSimpleName());
            }
            Object obj = bVar.f30771b;
            if (obj != null) {
                this.f31002a.b().b(f.a.DEBUG, "Load-balancing config: {0}", bVar.f30771b);
            }
            io.grpc.m0 a12 = a();
            if (gVar.a().isEmpty() && !a12.a()) {
                io.grpc.f1 f1Var = io.grpc.f1.f30571o;
                return f1Var.r("NameResolver returned no usable address. addrs=" + a11 + ", attrs=" + b11);
            }
            a12.c(m0.g.d().b(gVar.a()).c(b11).d(obj).a());
            return io.grpc.f1.f30562f;
        }
    }

    /* loaded from: classes5.dex */
    private static final class c extends m0.i {
        private c() {
        }

        @Override // io.grpc.m0.i
        public m0.e a(m0.f fVar) {
            return m0.e.g();
        }

        public String toString() {
            return com.google.common.base.o.b(c.class).toString();
        }
    }

    /* loaded from: classes5.dex */
    private static final class d extends m0.i {

        /* renamed from: a  reason: collision with root package name */
        private final io.grpc.f1 f31006a;

        d(io.grpc.f1 f1Var) {
            this.f31006a = f1Var;
        }

        @Override // io.grpc.m0.i
        public m0.e a(m0.f fVar) {
            return m0.e.f(this.f31006a);
        }
    }

    /* loaded from: classes5.dex */
    private static final class e extends io.grpc.m0 {
        private e() {
        }

        @Override // io.grpc.m0
        public void b(io.grpc.f1 f1Var) {
        }

        @Override // io.grpc.m0
        public void c(m0.g gVar) {
        }

        @Override // io.grpc.m0
        public void d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends Exception {
        private f(String str) {
            super(str);
        }
    }

    public j(String str) {
        this(io.grpc.o0.b(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.grpc.n0 d(String str, String str2) {
        io.grpc.n0 d11 = this.f31000a.d(str);
        if (d11 != null) {
            return d11;
        }
        throw new f("Trying to load '" + str + "' because " + str2 + ", but it's unavailable");
    }

    public b e(m0.d dVar) {
        return new b(dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0.c f(Map<String, ?> map) {
        List<d2.a> A;
        if (map != null) {
            try {
                A = d2.A(d2.g(map));
            } catch (RuntimeException e11) {
                return t0.c.b(io.grpc.f1.f30564h.r("can't parse load balancer configuration").q(e11));
            }
        } else {
            A = null;
        }
        if (A == null || A.isEmpty()) {
            return null;
        }
        return d2.y(A, this.f31000a);
    }

    j(io.grpc.o0 o0Var, String str) {
        this.f31000a = (io.grpc.o0) com.google.common.base.u.p(o0Var, "registry");
        this.f31001b = (String) com.google.common.base.u.p(str, "defaultPolicy");
    }
}