package io.grpc;

import expo.modules.interfaces.permissions.PermissionsResponse;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public abstract class t0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f31643a;

        a(t0 t0Var, f fVar) {
            this.f31643a = fVar;
        }

        @Override // io.grpc.t0.e, io.grpc.t0.f
        public void a(f1 f1Var) {
            this.f31643a.a(f1Var);
        }

        @Override // io.grpc.t0.e
        public void c(g gVar) {
            this.f31643a.b(gVar.a(), gVar.b());
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f31644a;

        /* renamed from: b  reason: collision with root package name */
        private final y0 f31645b;

        /* renamed from: c  reason: collision with root package name */
        private final h1 f31646c;

        /* renamed from: d  reason: collision with root package name */
        private final h f31647d;

        /* renamed from: e  reason: collision with root package name */
        private final ScheduledExecutorService f31648e;

        /* renamed from: f  reason: collision with root package name */
        private final io.grpc.f f31649f;

        /* renamed from: g  reason: collision with root package name */
        private final Executor f31650g;

        /* loaded from: classes5.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private Integer f31651a;

            /* renamed from: b  reason: collision with root package name */
            private y0 f31652b;

            /* renamed from: c  reason: collision with root package name */
            private h1 f31653c;

            /* renamed from: d  reason: collision with root package name */
            private h f31654d;

            /* renamed from: e  reason: collision with root package name */
            private ScheduledExecutorService f31655e;

            /* renamed from: f  reason: collision with root package name */
            private io.grpc.f f31656f;

            /* renamed from: g  reason: collision with root package name */
            private Executor f31657g;

            a() {
            }

            public b a() {
                return new b(this.f31651a, this.f31652b, this.f31653c, this.f31654d, this.f31655e, this.f31656f, this.f31657g, null);
            }

            public a b(io.grpc.f fVar) {
                this.f31656f = (io.grpc.f) com.google.common.base.u.o(fVar);
                return this;
            }

            public a c(int i11) {
                this.f31651a = Integer.valueOf(i11);
                return this;
            }

            public a d(Executor executor) {
                this.f31657g = executor;
                return this;
            }

            public a e(y0 y0Var) {
                this.f31652b = (y0) com.google.common.base.u.o(y0Var);
                return this;
            }

            public a f(ScheduledExecutorService scheduledExecutorService) {
                this.f31655e = (ScheduledExecutorService) com.google.common.base.u.o(scheduledExecutorService);
                return this;
            }

            public a g(h hVar) {
                this.f31654d = (h) com.google.common.base.u.o(hVar);
                return this;
            }

            public a h(h1 h1Var) {
                this.f31653c = (h1) com.google.common.base.u.o(h1Var);
                return this;
            }
        }

        /* synthetic */ b(Integer num, y0 y0Var, h1 h1Var, h hVar, ScheduledExecutorService scheduledExecutorService, io.grpc.f fVar, Executor executor, a aVar) {
            this(num, y0Var, h1Var, hVar, scheduledExecutorService, fVar, executor);
        }

        public static a f() {
            return new a();
        }

        public int a() {
            return this.f31644a;
        }

        public Executor b() {
            return this.f31650g;
        }

        public y0 c() {
            return this.f31645b;
        }

        public h d() {
            return this.f31647d;
        }

        public h1 e() {
            return this.f31646c;
        }

        public String toString() {
            return com.google.common.base.o.c(this).b("defaultPort", this.f31644a).d("proxyDetector", this.f31645b).d("syncContext", this.f31646c).d("serviceConfigParser", this.f31647d).d("scheduledExecutorService", this.f31648e).d("channelLogger", this.f31649f).d("executor", this.f31650g).toString();
        }

        private b(Integer num, y0 y0Var, h1 h1Var, h hVar, ScheduledExecutorService scheduledExecutorService, io.grpc.f fVar, Executor executor) {
            this.f31644a = ((Integer) com.google.common.base.u.p(num, "defaultPort not set")).intValue();
            this.f31645b = (y0) com.google.common.base.u.p(y0Var, "proxyDetector not set");
            this.f31646c = (h1) com.google.common.base.u.p(h1Var, "syncContext not set");
            this.f31647d = (h) com.google.common.base.u.p(hVar, "serviceConfigParser not set");
            this.f31648e = scheduledExecutorService;
            this.f31649f = fVar;
            this.f31650g = executor;
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class d {
        public abstract String a();

        public abstract t0 b(URI uri, b bVar);
    }

    /* loaded from: classes5.dex */
    public static abstract class e implements f {
        @Override // io.grpc.t0.f
        public abstract void a(f1 f1Var);

        @Override // io.grpc.t0.f
        @Deprecated
        public final void b(List<x> list, io.grpc.a aVar) {
            c(g.d().b(list).c(aVar).a());
        }

        public abstract void c(g gVar);
    }

    /* loaded from: classes5.dex */
    public interface f {
        void a(f1 f1Var);

        void b(List<x> list, io.grpc.a aVar);
    }

    /* loaded from: classes5.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final List<x> f31660a;

        /* renamed from: b  reason: collision with root package name */
        private final io.grpc.a f31661b;

        /* renamed from: c  reason: collision with root package name */
        private final c f31662c;

        /* loaded from: classes5.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private List<x> f31663a = Collections.emptyList();

            /* renamed from: b  reason: collision with root package name */
            private io.grpc.a f31664b = io.grpc.a.f30500c;

            /* renamed from: c  reason: collision with root package name */
            private c f31665c;

            a() {
            }

            public g a() {
                return new g(this.f31663a, this.f31664b, this.f31665c);
            }

            public a b(List<x> list) {
                this.f31663a = list;
                return this;
            }

            public a c(io.grpc.a aVar) {
                this.f31664b = aVar;
                return this;
            }

            public a d(c cVar) {
                this.f31665c = cVar;
                return this;
            }
        }

        g(List<x> list, io.grpc.a aVar, c cVar) {
            this.f31660a = Collections.unmodifiableList(new ArrayList(list));
            this.f31661b = (io.grpc.a) com.google.common.base.u.p(aVar, "attributes");
            this.f31662c = cVar;
        }

        public static a d() {
            return new a();
        }

        public List<x> a() {
            return this.f31660a;
        }

        public io.grpc.a b() {
            return this.f31661b;
        }

        public c c() {
            return this.f31662c;
        }

        public boolean equals(Object obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                return com.google.common.base.q.a(this.f31660a, gVar.f31660a) && com.google.common.base.q.a(this.f31661b, gVar.f31661b) && com.google.common.base.q.a(this.f31662c, gVar.f31662c);
            }
            return false;
        }

        public int hashCode() {
            return com.google.common.base.q.b(this.f31660a, this.f31661b, this.f31662c);
        }

        public String toString() {
            return com.google.common.base.o.c(this).d("addresses", this.f31660a).d("attributes", this.f31661b).d("serviceConfig", this.f31662c).toString();
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class h {
        public abstract c a(Map<String, ?> map);
    }

    public abstract String a();

    public void b() {
    }

    public abstract void c();

    public void d(e eVar) {
        e(eVar);
    }

    public void e(f fVar) {
        if (fVar instanceof e) {
            d((e) fVar);
        } else {
            d(new a(this, fVar));
        }
    }

    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final f1 f31658a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f31659b;

        private c(Object obj) {
            this.f31659b = com.google.common.base.u.p(obj, "config");
            this.f31658a = null;
        }

        public static c a(Object obj) {
            return new c(obj);
        }

        public static c b(f1 f1Var) {
            return new c(f1Var);
        }

        public Object c() {
            return this.f31659b;
        }

        public f1 d() {
            return this.f31658a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return com.google.common.base.q.a(this.f31658a, cVar.f31658a) && com.google.common.base.q.a(this.f31659b, cVar.f31659b);
        }

        public int hashCode() {
            return com.google.common.base.q.b(this.f31658a, this.f31659b);
        }

        public String toString() {
            if (this.f31659b != null) {
                return com.google.common.base.o.c(this).d("config", this.f31659b).toString();
            }
            return com.google.common.base.o.c(this).d("error", this.f31658a).toString();
        }

        private c(f1 f1Var) {
            this.f31659b = null;
            this.f31658a = (f1) com.google.common.base.u.p(f1Var, PermissionsResponse.STATUS_KEY);
            com.google.common.base.u.k(!f1Var.p(), "cannot use OK status: %s", f1Var);
        }
    }
}