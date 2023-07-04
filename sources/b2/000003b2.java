package androidx.camera.core;

import android.os.Handler;
import androidx.camera.core.impl.d0;
import androidx.camera.core.impl.p;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.q1;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k implements d0.e<j> {

    /* renamed from: t  reason: collision with root package name */
    static final d0.a<q.a> f2434t = d0.a.a("camerax.core.appConfig.cameraFactoryProvider", q.a.class);

    /* renamed from: u  reason: collision with root package name */
    static final d0.a<p.a> f2435u = d0.a.a("camerax.core.appConfig.deviceSurfaceManagerProvider", p.a.class);

    /* renamed from: v  reason: collision with root package name */
    static final d0.a<q1.b> f2436v = d0.a.a("camerax.core.appConfig.useCaseConfigFactoryProvider", q1.b.class);

    /* renamed from: w  reason: collision with root package name */
    static final d0.a<Executor> f2437w = d0.a.a("camerax.core.appConfig.cameraExecutor", Executor.class);

    /* renamed from: x  reason: collision with root package name */
    static final d0.a<Handler> f2438x = d0.a.a("camerax.core.appConfig.schedulerHandler", Handler.class);

    /* renamed from: y  reason: collision with root package name */
    static final d0.a<Integer> f2439y = d0.a.a("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);

    /* renamed from: z  reason: collision with root package name */
    static final d0.a<z.e> f2440z = d0.a.a("camerax.core.appConfig.availableCamerasLimiter", z.e.class);

    /* renamed from: s  reason: collision with root package name */
    private final androidx.camera.core.impl.b1 f2441s;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.camera.core.impl.x0 f2442a;

        public a() {
            this(androidx.camera.core.impl.x0.I());
        }

        private androidx.camera.core.impl.w0 b() {
            return this.f2442a;
        }

        public k a() {
            return new k(androidx.camera.core.impl.b1.G(this.f2442a));
        }

        public a c(q.a aVar) {
            b().p(k.f2434t, aVar);
            return this;
        }

        public a d(p.a aVar) {
            b().p(k.f2435u, aVar);
            return this;
        }

        public a e(Class<j> cls) {
            b().p(d0.e.f23253p, cls);
            if (b().g(d0.e.f23252o, null) == null) {
                f(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a f(String str) {
            b().p(d0.e.f23252o, str);
            return this;
        }

        public a g(q1.b bVar) {
            b().p(k.f2436v, bVar);
            return this;
        }

        private a(androidx.camera.core.impl.x0 x0Var) {
            this.f2442a = x0Var;
            Class cls = (Class) x0Var.g(d0.e.f23253p, null);
            if (cls != null && !cls.equals(j.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            e(j.class);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        k getCameraXConfig();
    }

    k(androidx.camera.core.impl.b1 b1Var) {
        this.f2441s = b1Var;
    }

    public z.e E(z.e eVar) {
        return (z.e) this.f2441s.g(f2440z, eVar);
    }

    public Executor F(Executor executor) {
        return (Executor) this.f2441s.g(f2437w, executor);
    }

    public q.a G(q.a aVar) {
        return (q.a) this.f2441s.g(f2434t, aVar);
    }

    public p.a H(p.a aVar) {
        return (p.a) this.f2441s.g(f2435u, aVar);
    }

    public Handler I(Handler handler) {
        return (Handler) this.f2441s.g(f2438x, handler);
    }

    public q1.b J(q1.b bVar) {
        return (q1.b) this.f2441s.g(f2436v, bVar);
    }

    @Override // androidx.camera.core.impl.f1
    public androidx.camera.core.impl.d0 l() {
        return this.f2441s;
    }
}