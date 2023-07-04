package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.concurrent.futures.b;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import t.f2;
import t.u1;

/* loaded from: classes.dex */
public class a2 extends u1.a implements u1, f2.b {

    /* renamed from: b */
    final f1 f50907b;

    /* renamed from: c */
    final Handler f50908c;

    /* renamed from: d */
    final Executor f50909d;

    /* renamed from: e */
    private final ScheduledExecutorService f50910e;

    /* renamed from: f */
    u1.a f50911f;

    /* renamed from: g */
    u.a f50912g;

    /* renamed from: h */
    com.google.common.util.concurrent.c<Void> f50913h;

    /* renamed from: i */
    b.a<Void> f50914i;

    /* renamed from: j */
    private com.google.common.util.concurrent.c<List<Surface>> f50915j;

    /* renamed from: a */
    final Object f50906a = new Object();

    /* renamed from: k */
    private List<DeferrableSurface> f50916k = null;

    /* renamed from: l */
    private boolean f50917l = false;

    /* renamed from: m */
    private boolean f50918m = false;

    /* renamed from: n */
    private boolean f50919n = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements c0.c<Void> {
        a() {
            a2.this = r1;
        }

        @Override // c0.c
        /* renamed from: a */
        public void onSuccess(Void r12) {
        }

        @Override // c0.c
        public void onFailure(Throwable th2) {
            a2.this.d();
            a2 a2Var = a2.this;
            a2Var.f50907b.j(a2Var);
        }
    }

    /* loaded from: classes.dex */
    class b extends CameraCaptureSession.StateCallback {
        b() {
            a2.this = r1;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            a2.this.A(cameraCaptureSession);
            a2 a2Var = a2.this;
            a2Var.n(a2Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            a2.this.A(cameraCaptureSession);
            a2 a2Var = a2.this;
            a2Var.o(a2Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            a2.this.A(cameraCaptureSession);
            a2 a2Var = a2.this;
            a2Var.p(a2Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            b.a<Void> aVar;
            try {
                a2.this.A(cameraCaptureSession);
                a2 a2Var = a2.this;
                a2Var.q(a2Var);
                synchronized (a2.this.f50906a) {
                    v3.h.g(a2.this.f50914i, "OpenCaptureSession completer should not null");
                    a2 a2Var2 = a2.this;
                    aVar = a2Var2.f50914i;
                    a2Var2.f50914i = null;
                }
                aVar.f(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th2) {
                synchronized (a2.this.f50906a) {
                    v3.h.g(a2.this.f50914i, "OpenCaptureSession completer should not null");
                    a2 a2Var3 = a2.this;
                    b.a<Void> aVar2 = a2Var3.f50914i;
                    a2Var3.f50914i = null;
                    aVar2.f(new IllegalStateException("onConfigureFailed"));
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            b.a<Void> aVar;
            try {
                a2.this.A(cameraCaptureSession);
                a2 a2Var = a2.this;
                a2Var.r(a2Var);
                synchronized (a2.this.f50906a) {
                    v3.h.g(a2.this.f50914i, "OpenCaptureSession completer should not null");
                    a2 a2Var2 = a2.this;
                    aVar = a2Var2.f50914i;
                    a2Var2.f50914i = null;
                }
                aVar.c(null);
            } catch (Throwable th2) {
                synchronized (a2.this.f50906a) {
                    v3.h.g(a2.this.f50914i, "OpenCaptureSession completer should not null");
                    a2 a2Var3 = a2.this;
                    b.a<Void> aVar2 = a2Var3.f50914i;
                    a2Var3.f50914i = null;
                    aVar2.c(null);
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            a2.this.A(cameraCaptureSession);
            a2 a2Var = a2.this;
            a2Var.s(a2Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            a2.this.A(cameraCaptureSession);
            a2 a2Var = a2.this;
            a2Var.u(a2Var, surface);
        }
    }

    public a2(f1 f1Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f50907b = f1Var;
        this.f50908c = handler;
        this.f50909d = executor;
        this.f50910e = scheduledExecutorService;
    }

    public /* synthetic */ void D() {
        t(this);
    }

    public /* synthetic */ void E(u1 u1Var) {
        this.f50907b.h(this);
        t(u1Var);
        this.f50911f.p(u1Var);
    }

    public /* synthetic */ void F(u1 u1Var) {
        this.f50911f.t(u1Var);
    }

    public /* synthetic */ Object G(List list, u.e eVar, v.g gVar, b.a aVar) {
        String str;
        synchronized (this.f50906a) {
            B(list);
            v3.h.i(this.f50914i == null, "The openCaptureSessionCompleter can only set once!");
            this.f50914i = aVar;
            eVar.a(gVar);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    public /* synthetic */ com.google.common.util.concurrent.c H(List list, List list2) {
        androidx.camera.core.n0.a("SyncCaptureSessionBase", "[" + this + "] getSurface...done");
        if (list2.contains(null)) {
            return c0.f.f(new DeferrableSurface.SurfaceClosedException("Surface closed", (DeferrableSurface) list.get(list2.indexOf(null))));
        }
        if (list2.isEmpty()) {
            return c0.f.f(new IllegalArgumentException("Unable to open capture session without surfaces"));
        }
        return c0.f.h(list2);
    }

    public static /* synthetic */ void v(a2 a2Var, u1 u1Var) {
        a2Var.F(u1Var);
    }

    public static /* synthetic */ Object w(a2 a2Var, List list, u.e eVar, v.g gVar, b.a aVar) {
        return a2Var.G(list, eVar, gVar, aVar);
    }

    public static /* synthetic */ void x(a2 a2Var, u1 u1Var) {
        a2Var.E(u1Var);
    }

    public static /* synthetic */ com.google.common.util.concurrent.c y(a2 a2Var, List list, List list2) {
        return a2Var.H(list, list2);
    }

    public static /* synthetic */ void z(a2 a2Var) {
        a2Var.D();
    }

    void A(CameraCaptureSession cameraCaptureSession) {
        if (this.f50912g == null) {
            this.f50912g = u.a.d(cameraCaptureSession, this.f50908c);
        }
    }

    void B(List<DeferrableSurface> list) {
        synchronized (this.f50906a) {
            I();
            androidx.camera.core.impl.k0.f(list);
            this.f50916k = list;
        }
    }

    public boolean C() {
        boolean z11;
        synchronized (this.f50906a) {
            z11 = this.f50913h != null;
        }
        return z11;
    }

    void I() {
        synchronized (this.f50906a) {
            List<DeferrableSurface> list = this.f50916k;
            if (list != null) {
                androidx.camera.core.impl.k0.e(list);
                this.f50916k = null;
            }
        }
    }

    @Override // t.f2.b
    public Executor a() {
        return this.f50909d;
    }

    @Override // t.f2.b
    public com.google.common.util.concurrent.c<List<Surface>> b(final List<DeferrableSurface> list, long j11) {
        synchronized (this.f50906a) {
            if (this.f50918m) {
                return c0.f.f(new CancellationException("Opener is disabled"));
            }
            c0.d f11 = c0.d.b(androidx.camera.core.impl.k0.k(list, false, j11, a(), this.f50910e)).f(new c0.a() { // from class: t.w1
                {
                    a2.this = this;
                }

                @Override // c0.a
                public final com.google.common.util.concurrent.c apply(Object obj) {
                    return a2.y(a2.this, list, (List) obj);
                }
            }, a());
            this.f50915j = f11;
            return c0.f.j(f11);
        }
    }

    @Override // t.u1
    public u1.a c() {
        return this;
    }

    @Override // t.u1
    public void close() {
        v3.h.g(this.f50912g, "Need to call openCaptureSession before using this API.");
        this.f50907b.i(this);
        this.f50912g.c().close();
        a().execute(new Runnable() { // from class: t.x1
            {
                a2.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a2.z(a2.this);
            }
        });
    }

    @Override // t.u1
    public void d() {
        I();
    }

    @Override // t.u1
    public void e() {
        v3.h.g(this.f50912g, "Need to call openCaptureSession before using this API.");
        this.f50912g.c().abortCaptures();
    }

    @Override // t.u1
    public CameraDevice f() {
        v3.h.f(this.f50912g);
        return this.f50912g.c().getDevice();
    }

    @Override // t.u1
    public int g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        v3.h.g(this.f50912g, "Need to call openCaptureSession before using this API.");
        return this.f50912g.b(captureRequest, a(), captureCallback);
    }

    @Override // t.u1
    public com.google.common.util.concurrent.c<Void> h(String str) {
        return c0.f.h(null);
    }

    @Override // t.f2.b
    public v.g i(int i11, List<v.b> list, u1.a aVar) {
        this.f50911f = aVar;
        return new v.g(i11, list, a(), new b());
    }

    @Override // t.u1
    public int j(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        v3.h.g(this.f50912g, "Need to call openCaptureSession before using this API.");
        return this.f50912g.a(list, a(), captureCallback);
    }

    @Override // t.u1
    public u.a k() {
        v3.h.f(this.f50912g);
        return this.f50912g;
    }

    @Override // t.f2.b
    public com.google.common.util.concurrent.c<Void> l(CameraDevice cameraDevice, final v.g gVar, final List<DeferrableSurface> list) {
        synchronized (this.f50906a) {
            if (this.f50918m) {
                return c0.f.f(new CancellationException("Opener is disabled"));
            }
            this.f50907b.l(this);
            final u.e b11 = u.e.b(cameraDevice, this.f50908c);
            com.google.common.util.concurrent.c<Void> a11 = androidx.concurrent.futures.b.a(new b.c() { // from class: t.v1
                @Override // androidx.concurrent.futures.b.c
                public final Object a(b.a aVar) {
                    return a2.w(a2.this, list, b11, gVar, aVar);
                }
            });
            this.f50913h = a11;
            c0.f.b(a11, new a(), b0.a.a());
            return c0.f.j(this.f50913h);
        }
    }

    @Override // t.u1
    public void m() {
        v3.h.g(this.f50912g, "Need to call openCaptureSession before using this API.");
        this.f50912g.c().stopRepeating();
    }

    @Override // t.u1.a
    public void n(u1 u1Var) {
        this.f50911f.n(u1Var);
    }

    @Override // t.u1.a
    public void o(u1 u1Var) {
        this.f50911f.o(u1Var);
    }

    @Override // t.u1.a
    public void p(final u1 u1Var) {
        com.google.common.util.concurrent.c<Void> cVar;
        synchronized (this.f50906a) {
            if (this.f50917l) {
                cVar = null;
            } else {
                this.f50917l = true;
                v3.h.g(this.f50913h, "Need to call openCaptureSession before using this API.");
                cVar = this.f50913h;
            }
        }
        d();
        if (cVar != null) {
            cVar.a(new Runnable() { // from class: t.z1
                {
                    a2.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a2.x(a2.this, u1Var);
                }
            }, b0.a.a());
        }
    }

    @Override // t.u1.a
    public void q(u1 u1Var) {
        d();
        this.f50907b.j(this);
        this.f50911f.q(u1Var);
    }

    @Override // t.u1.a
    public void r(u1 u1Var) {
        this.f50907b.k(this);
        this.f50911f.r(u1Var);
    }

    @Override // t.u1.a
    public void s(u1 u1Var) {
        this.f50911f.s(u1Var);
    }

    @Override // t.f2.b
    public boolean stop() {
        boolean z11;
        try {
            synchronized (this.f50906a) {
                if (!this.f50918m) {
                    com.google.common.util.concurrent.c<List<Surface>> cVar = this.f50915j;
                    r1 = cVar != null ? cVar : null;
                    this.f50918m = true;
                }
                z11 = !C();
            }
            return z11;
        } finally {
            if (r1 != null) {
                r1.cancel(true);
            }
        }
    }

    @Override // t.u1.a
    public void t(final u1 u1Var) {
        com.google.common.util.concurrent.c<Void> cVar;
        synchronized (this.f50906a) {
            if (this.f50919n) {
                cVar = null;
            } else {
                this.f50919n = true;
                v3.h.g(this.f50913h, "Need to call openCaptureSession before using this API.");
                cVar = this.f50913h;
            }
        }
        if (cVar != null) {
            cVar.a(new Runnable() { // from class: t.y1
                {
                    a2.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a2.v(a2.this, u1Var);
                }
            }, b0.a.a());
        }
    }

    @Override // t.u1.a
    public void u(u1 u1Var, Surface surface) {
        this.f50911f.u(u1Var, surface);
    }
}