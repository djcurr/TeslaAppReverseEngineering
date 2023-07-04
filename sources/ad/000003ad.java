package androidx.camera.core;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import androidx.camera.core.impl.CameraValidator;
import androidx.camera.core.impl.p;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.q1;
import androidx.camera.core.k;
import androidx.concurrent.futures.b;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: n */
    static j f2411n;

    /* renamed from: o */
    private static k.b f2412o;

    /* renamed from: c */
    private final k f2417c;

    /* renamed from: d */
    private final Executor f2418d;

    /* renamed from: e */
    private final Handler f2419e;

    /* renamed from: f */
    private final HandlerThread f2420f;

    /* renamed from: g */
    private androidx.camera.core.impl.q f2421g;

    /* renamed from: h */
    private androidx.camera.core.impl.p f2422h;

    /* renamed from: i */
    private q1 f2423i;

    /* renamed from: j */
    private Context f2424j;

    /* renamed from: m */
    static final Object f2410m = new Object();

    /* renamed from: p */
    private static com.google.common.util.concurrent.c<Void> f2413p = c0.f.f(new IllegalStateException("CameraX is not initialized."));

    /* renamed from: q */
    private static com.google.common.util.concurrent.c<Void> f2414q = c0.f.h(null);

    /* renamed from: a */
    final androidx.camera.core.impl.v f2415a = new androidx.camera.core.impl.v();

    /* renamed from: b */
    private final Object f2416b = new Object();

    /* renamed from: k */
    private c f2425k = c.UNINITIALIZED;

    /* renamed from: l */
    private com.google.common.util.concurrent.c<Void> f2426l = c0.f.h(null);

    /* loaded from: classes.dex */
    public class a implements c0.c<Void> {

        /* renamed from: a */
        final /* synthetic */ b.a f2427a;

        /* renamed from: b */
        final /* synthetic */ j f2428b;

        a(b.a aVar, j jVar) {
            this.f2427a = aVar;
            this.f2428b = jVar;
        }

        @Override // c0.c
        /* renamed from: a */
        public void onSuccess(Void r22) {
            this.f2427a.c(null);
        }

        @Override // c0.c
        public void onFailure(Throwable th2) {
            n0.n("CameraX", "CameraX initialize() failed", th2);
            synchronized (j.f2410m) {
                if (j.f2411n == this.f2428b) {
                    j.H();
                }
            }
            this.f2427a.f(th2);
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f2429a;

        static {
            int[] iArr = new int[c.values().length];
            f2429a = iArr;
            try {
                iArr[c.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2429a[c.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2429a[c.INITIALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2429a[c.SHUTDOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZED,
        SHUTDOWN
    }

    j(k kVar) {
        this.f2417c = (k) v3.h.f(kVar);
        Executor F = kVar.F(null);
        Handler I = kVar.I(null);
        this.f2418d = F == null ? new i() : F;
        if (I == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f2420f = handlerThread;
            handlerThread.start();
            this.f2419e = r3.f.a(handlerThread.getLooper());
            return;
        }
        this.f2420f = null;
        this.f2419e = I;
    }

    public static /* synthetic */ Object A(j jVar, final Context context, b.a aVar) {
        synchronized (f2410m) {
            c0.f.b(c0.d.b(f2414q).f(new c0.a() { // from class: z.j
                {
                    androidx.camera.core.j.this = jVar;
                }

                @Override // c0.a
                public final com.google.common.util.concurrent.c apply(Object obj) {
                    return androidx.camera.core.j.e(androidx.camera.core.j.this, context, (Void) obj);
                }
            }, b0.a.a()), new a(aVar, jVar), b0.a.a());
        }
        return "CameraX-initialize";
    }

    public /* synthetic */ void B(b.a aVar) {
        if (this.f2420f != null) {
            Executor executor = this.f2418d;
            if (executor instanceof i) {
                ((i) executor).b();
            }
            this.f2420f.quit();
            aVar.c(null);
        }
    }

    public /* synthetic */ Object C(final b.a aVar) {
        this.f2415a.c().a(new Runnable() { // from class: z.l
            {
                androidx.camera.core.j.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.j.f(androidx.camera.core.j.this, aVar);
            }
        }, this.f2418d);
        return "CameraX shutdownInternal";
    }

    public static /* synthetic */ void D(j jVar, b.a aVar) {
        c0.f.k(jVar.G(), aVar);
    }

    public static /* synthetic */ Object E(j jVar, final b.a aVar) {
        synchronized (f2410m) {
            f2413p.a(new Runnable() { // from class: z.m
                {
                    androidx.camera.core.j.this = jVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.j.h(androidx.camera.core.j.this, aVar);
                }
            }, b0.a.a());
        }
        return "CameraX shutdown";
    }

    private void F() {
        synchronized (this.f2416b) {
            this.f2425k = c.INITIALIZED;
        }
    }

    private com.google.common.util.concurrent.c<Void> G() {
        synchronized (this.f2416b) {
            this.f2419e.removeCallbacksAndMessages("retry_token");
            int i11 = b.f2429a[this.f2425k.ordinal()];
            if (i11 == 1) {
                this.f2425k = c.SHUTDOWN;
                return c0.f.h(null);
            } else if (i11 != 2) {
                if (i11 == 3) {
                    this.f2425k = c.SHUTDOWN;
                    this.f2426l = androidx.concurrent.futures.b.a(new b.c() { // from class: z.g
                        {
                            androidx.camera.core.j.this = this;
                        }

                        @Override // androidx.concurrent.futures.b.c
                        public final Object a(b.a aVar) {
                            return androidx.camera.core.j.j(androidx.camera.core.j.this, aVar);
                        }
                    });
                }
                return this.f2426l;
            } else {
                throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
            }
        }
    }

    static com.google.common.util.concurrent.c<Void> H() {
        j jVar = f2411n;
        if (jVar == null) {
            return f2414q;
        }
        f2411n = null;
        com.google.common.util.concurrent.c<Void> a11 = androidx.concurrent.futures.b.a(new b.c() { // from class: z.f
            {
                androidx.camera.core.j.this = jVar;
            }

            @Override // androidx.concurrent.futures.b.c
            public final Object a(b.a aVar) {
                return androidx.camera.core.j.i(androidx.camera.core.j.this, aVar);
            }
        });
        f2414q = a11;
        return a11;
    }

    public static /* synthetic */ Object a(j jVar, Context context, b.a aVar) {
        return jVar.y(context, aVar);
    }

    public static /* synthetic */ j b(j jVar, Void r12) {
        return v(jVar, r12);
    }

    public static /* synthetic */ Object c(j jVar, Context context, b.a aVar) {
        return A(jVar, context, aVar);
    }

    public static /* synthetic */ void d(j jVar, Executor executor, long j11, b.a aVar) {
        jVar.w(executor, j11, aVar);
    }

    public static /* synthetic */ com.google.common.util.concurrent.c e(j jVar, Context context, Void r22) {
        return jVar.t(context);
    }

    public static /* synthetic */ void f(j jVar, b.a aVar) {
        jVar.B(aVar);
    }

    public static /* synthetic */ void g(j jVar, Context context, Executor executor, b.a aVar, long j11) {
        jVar.x(context, executor, aVar, j11);
    }

    public static /* synthetic */ void h(j jVar, b.a aVar) {
        D(jVar, aVar);
    }

    public static /* synthetic */ Object i(j jVar, b.a aVar) {
        return E(jVar, aVar);
    }

    public static /* synthetic */ Object j(j jVar, b.a aVar) {
        return jVar.C(aVar);
    }

    private static void k(k.b bVar) {
        v3.h.f(bVar);
        v3.h.i(f2412o == null, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
        f2412o = bVar;
        Integer num = (Integer) bVar.getCameraXConfig().g(k.f2439y, null);
        if (num != null) {
            n0.k(num.intValue());
        }
    }

    private static Application l(Context context) {
        for (Context applicationContext = context.getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
            if (applicationContext instanceof Application) {
                return (Application) applicationContext;
            }
        }
        return null;
    }

    private static k.b o(Context context) {
        Application l11 = l(context);
        if (l11 instanceof k.b) {
            return (k.b) l11;
        }
        try {
            return (k.b) Class.forName(context.getApplicationContext().getResources().getString(z.q0.f59994a)).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Resources.NotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e11) {
            n0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from resources", e11);
            return null;
        }
    }

    private static com.google.common.util.concurrent.c<j> q() {
        j jVar = f2411n;
        if (jVar == null) {
            return c0.f.f(new IllegalStateException("Must call CameraX.initialize() first"));
        }
        return c0.f.o(f2413p, new p.a() { // from class: z.o
            {
                androidx.camera.core.j.this = jVar;
            }

            @Override // p.a
            public final Object apply(Object obj) {
                return androidx.camera.core.j.b(androidx.camera.core.j.this, (Void) obj);
            }
        }, b0.a.a());
    }

    public static com.google.common.util.concurrent.c<j> r(Context context) {
        com.google.common.util.concurrent.c<j> q11;
        v3.h.g(context, "Context must not be null.");
        synchronized (f2410m) {
            boolean z11 = f2412o != null;
            q11 = q();
            if (q11.isDone()) {
                try {
                    q11.get();
                } catch (InterruptedException e11) {
                    throw new RuntimeException("Unexpected thread interrupt. Should not be possible since future is already complete.", e11);
                } catch (ExecutionException unused) {
                    H();
                    q11 = null;
                }
            }
            if (q11 == null) {
                if (!z11) {
                    k.b o11 = o(context);
                    if (o11 != null) {
                        k(o11);
                    } else {
                        throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
                    }
                }
                u(context);
                q11 = q();
            }
        }
        return q11;
    }

    private void s(final Executor executor, final long j11, final Context context, final b.a<Void> aVar) {
        executor.execute(new Runnable() { // from class: z.k
            {
                androidx.camera.core.j.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.j.g(androidx.camera.core.j.this, context, executor, aVar, j11);
            }
        });
    }

    public com.google.common.util.concurrent.c<Void> t(final Context context) {
        com.google.common.util.concurrent.c<Void> a11;
        synchronized (this.f2416b) {
            v3.h.i(this.f2425k == c.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.f2425k = c.INITIALIZING;
            a11 = androidx.concurrent.futures.b.a(new b.c() { // from class: z.h
                {
                    androidx.camera.core.j.this = this;
                }

                @Override // androidx.concurrent.futures.b.c
                public final Object a(b.a aVar) {
                    return androidx.camera.core.j.a(androidx.camera.core.j.this, context, aVar);
                }
            });
        }
        return a11;
    }

    private static void u(final Context context) {
        v3.h.f(context);
        v3.h.i(f2411n == null, "CameraX already initialized.");
        v3.h.f(f2412o);
        j jVar = new j(f2412o.getCameraXConfig());
        f2411n = jVar;
        f2413p = androidx.concurrent.futures.b.a(new b.c() { // from class: z.i
            {
                androidx.camera.core.j.this = jVar;
            }

            @Override // androidx.concurrent.futures.b.c
            public final Object a(b.a aVar) {
                return androidx.camera.core.j.c(androidx.camera.core.j.this, context, aVar);
            }
        });
    }

    public static /* synthetic */ j v(j jVar, Void r12) {
        return jVar;
    }

    public /* synthetic */ void w(Executor executor, long j11, b.a aVar) {
        s(executor, j11, this.f2424j, aVar);
    }

    public /* synthetic */ void x(Context context, final Executor executor, final b.a aVar, final long j11) {
        try {
            Application l11 = l(context);
            this.f2424j = l11;
            if (l11 == null) {
                this.f2424j = context.getApplicationContext();
            }
            q.a G = this.f2417c.G(null);
            if (G != null) {
                androidx.camera.core.impl.y a11 = androidx.camera.core.impl.y.a(this.f2418d, this.f2419e);
                z.e E = this.f2417c.E(null);
                this.f2421g = G.a(this.f2424j, a11, E);
                p.a H = this.f2417c.H(null);
                if (H != null) {
                    this.f2422h = H.a(this.f2424j, this.f2421g.c(), this.f2421g.b());
                    q1.b J = this.f2417c.J(null);
                    if (J != null) {
                        this.f2423i = J.a(this.f2424j);
                        if (executor instanceof i) {
                            ((i) executor).c(this.f2421g);
                        }
                        this.f2415a.e(this.f2421g);
                        if (f0.a.a(f0.d.class) != null) {
                            CameraValidator.a(this.f2424j, this.f2415a, E);
                        }
                        F();
                        aVar.c(null);
                        return;
                    }
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                }
                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
            }
            throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
        } catch (InitializationException | CameraValidator.CameraIdListIncorrectException | RuntimeException e11) {
            if (SystemClock.elapsedRealtime() - j11 < 2500) {
                n0.n("CameraX", "Retry init. Start time " + j11 + " current time " + SystemClock.elapsedRealtime(), e11);
                r3.f.b(this.f2419e, new Runnable() { // from class: z.n
                    {
                        androidx.camera.core.j.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.j.d(androidx.camera.core.j.this, executor, j11, aVar);
                    }
                }, "retry_token", 500L);
                return;
            }
            F();
            if (e11 instanceof CameraValidator.CameraIdListIncorrectException) {
                n0.c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                aVar.c(null);
            } else if (e11 instanceof InitializationException) {
                aVar.f(e11);
            } else {
                aVar.f(new InitializationException(e11));
            }
        }
    }

    public /* synthetic */ Object y(Context context, b.a aVar) {
        s(this.f2418d, SystemClock.elapsedRealtime(), context, aVar);
        return "CameraX initInternal";
    }

    public androidx.camera.core.impl.p m() {
        androidx.camera.core.impl.p pVar = this.f2422h;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public androidx.camera.core.impl.v n() {
        return this.f2415a;
    }

    public q1 p() {
        q1 q1Var = this.f2423i;
        if (q1Var != null) {
            return q1Var;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }
}