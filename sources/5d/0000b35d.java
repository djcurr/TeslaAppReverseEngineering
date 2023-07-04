package t;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.a0;
import androidx.camera.core.impl.g1;
import androidx.camera.core.impl.s;
import androidx.camera.core.impl.x;
import androidx.concurrent.futures.b;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import t.f2;
import t.h0;

/* loaded from: classes.dex */
public final class h0 implements androidx.camera.core.impl.s {
    private final Set<String> A;

    /* renamed from: a */
    private final androidx.camera.core.impl.o1 f51000a;

    /* renamed from: b */
    private final u.j f51001b;

    /* renamed from: c */
    private final Executor f51002c;

    /* renamed from: d */
    volatile f f51003d = f.INITIALIZED;

    /* renamed from: e */
    private final androidx.camera.core.impl.u0<s.a> f51004e;

    /* renamed from: f */
    private final s f51005f;

    /* renamed from: g */
    private final g f51006g;

    /* renamed from: h */
    final k0 f51007h;

    /* renamed from: i */
    CameraDevice f51008i;

    /* renamed from: j */
    int f51009j;

    /* renamed from: k */
    d1 f51010k;

    /* renamed from: l */
    androidx.camera.core.impl.g1 f51011l;

    /* renamed from: m */
    final AtomicInteger f51012m;

    /* renamed from: n */
    com.google.common.util.concurrent.c<Void> f51013n;

    /* renamed from: o */
    b.a<Void> f51014o;

    /* renamed from: p */
    final Map<d1, com.google.common.util.concurrent.c<Void>> f51015p;

    /* renamed from: q */
    private final d f51016q;

    /* renamed from: t */
    private final androidx.camera.core.impl.x f51017t;

    /* renamed from: w */
    final Set<d1> f51018w;

    /* renamed from: x */
    private s1 f51019x;

    /* renamed from: y */
    private final f1 f51020y;

    /* renamed from: z */
    private final f2.a f51021z;

    /* loaded from: classes.dex */
    public class a implements c0.c<Void> {

        /* renamed from: a */
        final /* synthetic */ d1 f51022a;

        a(d1 d1Var) {
            h0.this = r1;
            this.f51022a = d1Var;
        }

        @Override // c0.c
        /* renamed from: a */
        public void onSuccess(Void r22) {
            CameraDevice cameraDevice;
            h0.this.f51015p.remove(this.f51022a);
            int i11 = c.f51025a[h0.this.f51003d.ordinal()];
            if (i11 != 2) {
                if (i11 != 5) {
                    if (i11 != 7) {
                        return;
                    }
                } else if (h0.this.f51009j == 0) {
                    return;
                }
            }
            if (!h0.this.M() || (cameraDevice = h0.this.f51008i) == null) {
                return;
            }
            cameraDevice.close();
            h0.this.f51008i = null;
        }

        @Override // c0.c
        public void onFailure(Throwable th2) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements c0.c<Void> {
        b() {
            h0.this = r1;
        }

        @Override // c0.c
        /* renamed from: a */
        public void onSuccess(Void r12) {
        }

        @Override // c0.c
        public void onFailure(Throwable th2) {
            if (th2 instanceof CameraAccessException) {
                h0 h0Var = h0.this;
                h0Var.F("Unable to configure camera due to " + th2.getMessage());
            } else if (th2 instanceof CancellationException) {
                h0.this.F("Unable to configure camera cancelled");
            } else if (th2 instanceof DeferrableSurface.SurfaceClosedException) {
                androidx.camera.core.impl.g1 H = h0.this.H(((DeferrableSurface.SurfaceClosedException) th2).a());
                if (H != null) {
                    h0.this.e0(H);
                }
            } else if (th2 instanceof TimeoutException) {
                androidx.camera.core.n0.c("Camera2CameraImpl", "Unable to configure camera " + h0.this.f51007h.a() + ", timeout!");
            } else {
                throw new RuntimeException(th2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f51025a;

        static {
            int[] iArr = new int[f.values().length];
            f51025a = iArr;
            try {
                iArr[f.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51025a[f.CLOSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51025a[f.OPENED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51025a[f.OPENING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51025a[f.REOPENING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51025a[f.PENDING_OPEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51025a[f.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f51025a[f.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes.dex */
    public final class d extends CameraManager.AvailabilityCallback implements x.b {

        /* renamed from: a */
        private final String f51026a;

        /* renamed from: b */
        private boolean f51027b = true;

        d(String str) {
            h0.this = r1;
            this.f51026a = str;
        }

        @Override // androidx.camera.core.impl.x.b
        public void a() {
            if (h0.this.f51003d == f.PENDING_OPEN) {
                h0.this.b0(false);
            }
        }

        boolean b() {
            return this.f51027b;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            if (this.f51026a.equals(str)) {
                this.f51027b = true;
                if (h0.this.f51003d == f.PENDING_OPEN) {
                    h0.this.b0(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (this.f51026a.equals(str)) {
                this.f51027b = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class e implements CameraControlInternal.b {
        e() {
            h0.this = r1;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.b
        public void a(List<androidx.camera.core.impl.a0> list) {
            h0.this.l0((List) v3.h.f(list));
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.b
        public void b(androidx.camera.core.impl.g1 g1Var) {
            h0.this.f51011l = (androidx.camera.core.impl.g1) v3.h.f(g1Var);
            h0.this.p0();
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        INITIALIZED,
        PENDING_OPEN,
        OPENING,
        OPENED,
        CLOSING,
        REOPENING,
        RELEASING,
        RELEASED
    }

    /* loaded from: classes.dex */
    public final class g extends CameraDevice.StateCallback {

        /* renamed from: a */
        private final Executor f51030a;

        /* renamed from: b */
        private final ScheduledExecutorService f51031b;

        /* renamed from: c */
        private b f51032c;

        /* renamed from: d */
        ScheduledFuture<?> f51033d;

        /* renamed from: e */
        private final a f51034e = new a(this);

        /* loaded from: classes.dex */
        public class a {

            /* renamed from: a */
            private long f51036a = -1;

            a(g gVar) {
            }

            boolean a() {
                long uptimeMillis = SystemClock.uptimeMillis();
                long j11 = this.f51036a;
                if (j11 == -1) {
                    this.f51036a = uptimeMillis;
                    return true;
                }
                if (uptimeMillis - j11 >= AbstractComponentTracker.LINGERING_TIMEOUT) {
                    b();
                    return false;
                }
                return true;
            }

            void b() {
                this.f51036a = -1L;
            }
        }

        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: a */
            private Executor f51037a;

            /* renamed from: b */
            private boolean f51038b = false;

            b(Executor executor) {
                g.this = r1;
                this.f51037a = executor;
            }

            public static /* synthetic */ void a(b bVar) {
                bVar.c();
            }

            public /* synthetic */ void c() {
                if (this.f51038b) {
                    return;
                }
                v3.h.h(h0.this.f51003d == f.REOPENING);
                h0.this.b0(true);
            }

            void b() {
                this.f51038b = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f51037a.execute(new Runnable() { // from class: t.i0
                    {
                        h0.g.b.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        h0.g.b.a(h0.g.b.this);
                    }
                });
            }
        }

        g(Executor executor, ScheduledExecutorService scheduledExecutorService) {
            h0.this = r1;
            this.f51030a = executor;
            this.f51031b = scheduledExecutorService;
        }

        private void b(CameraDevice cameraDevice, int i11) {
            boolean z11 = h0.this.f51003d == f.OPENING || h0.this.f51003d == f.OPENED || h0.this.f51003d == f.REOPENING;
            v3.h.i(z11, "Attempt to handle open error from non open state: " + h0.this.f51003d);
            if (i11 != 1 && i11 != 2 && i11 != 4) {
                androidx.camera.core.n0.c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + h0.J(i11) + " closing camera.");
                h0.this.k0(f.CLOSING);
                h0.this.B(false);
                return;
            }
            androidx.camera.core.n0.a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), h0.J(i11)));
            c();
        }

        private void c() {
            v3.h.i(h0.this.f51009j != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            h0.this.k0(f.REOPENING);
            h0.this.B(false);
        }

        boolean a() {
            if (this.f51033d != null) {
                h0 h0Var = h0.this;
                h0Var.F("Cancelling scheduled re-open: " + this.f51032c);
                this.f51032c.b();
                this.f51032c = null;
                this.f51033d.cancel(false);
                this.f51033d = null;
                return true;
            }
            return false;
        }

        void d() {
            this.f51034e.b();
        }

        void e() {
            v3.h.h(this.f51032c == null);
            v3.h.h(this.f51033d == null);
            if (this.f51034e.a()) {
                this.f51032c = new b(this.f51030a);
                h0 h0Var = h0.this;
                h0Var.F("Attempting camera re-open in 700ms: " + this.f51032c);
                this.f51033d = this.f51031b.schedule(this.f51032c, 700L, TimeUnit.MILLISECONDS);
                return;
            }
            androidx.camera.core.n0.c("Camera2CameraImpl", "Camera reopening attempted for 10000ms without success.");
            h0.this.k0(f.INITIALIZED);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            h0.this.F("CameraDevice.onClosed()");
            boolean z11 = h0.this.f51008i == null;
            v3.h.i(z11, "Unexpected onClose callback on camera device: " + cameraDevice);
            int i11 = c.f51025a[h0.this.f51003d.ordinal()];
            if (i11 != 2) {
                if (i11 == 5) {
                    h0 h0Var = h0.this;
                    if (h0Var.f51009j != 0) {
                        h0Var.F("Camera closed due to error: " + h0.J(h0.this.f51009j));
                        e();
                        return;
                    }
                    h0Var.b0(false);
                    return;
                } else if (i11 != 7) {
                    throw new IllegalStateException("Camera closed while in state: " + h0.this.f51003d);
                }
            }
            v3.h.h(h0.this.M());
            h0.this.I();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            h0.this.F("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i11) {
            h0 h0Var = h0.this;
            h0Var.f51008i = cameraDevice;
            h0Var.f51009j = i11;
            int i12 = c.f51025a[h0Var.f51003d.ordinal()];
            if (i12 != 2) {
                if (i12 == 3 || i12 == 4 || i12 == 5) {
                    androidx.camera.core.n0.a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), h0.J(i11), h0.this.f51003d.name()));
                    b(cameraDevice, i11);
                    return;
                } else if (i12 != 7) {
                    throw new IllegalStateException("onError() should not be possible from state: " + h0.this.f51003d);
                }
            }
            androidx.camera.core.n0.c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), h0.J(i11), h0.this.f51003d.name()));
            h0.this.B(false);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            h0.this.F("CameraDevice.onOpened()");
            h0 h0Var = h0.this;
            h0Var.f51008i = cameraDevice;
            h0Var.q0(cameraDevice);
            h0 h0Var2 = h0.this;
            h0Var2.f51009j = 0;
            int i11 = c.f51025a[h0Var2.f51003d.ordinal()];
            if (i11 == 2 || i11 == 7) {
                v3.h.h(h0.this.M());
                h0.this.f51008i.close();
                h0.this.f51008i = null;
            } else if (i11 != 4 && i11 != 5) {
                throw new IllegalStateException("onOpened() should not be possible from state: " + h0.this.f51003d);
            } else {
                h0.this.k0(f.OPENED);
                h0.this.c0();
            }
        }
    }

    public h0(u.j jVar, String str, k0 k0Var, androidx.camera.core.impl.x xVar, Executor executor, Handler handler) {
        androidx.camera.core.impl.u0<s.a> u0Var = new androidx.camera.core.impl.u0<>();
        this.f51004e = u0Var;
        this.f51009j = 0;
        this.f51011l = androidx.camera.core.impl.g1.a();
        this.f51012m = new AtomicInteger(0);
        this.f51015p = new LinkedHashMap();
        this.f51018w = new HashSet();
        this.A = new HashSet();
        this.f51001b = jVar;
        this.f51017t = xVar;
        ScheduledExecutorService e11 = b0.a.e(handler);
        Executor f11 = b0.a.f(executor);
        this.f51002c = f11;
        this.f51006g = new g(f11, e11);
        this.f51000a = new androidx.camera.core.impl.o1(str);
        u0Var.c(s.a.CLOSED);
        f1 f1Var = new f1(f11);
        this.f51020y = f1Var;
        this.f51010k = new d1();
        try {
            s sVar = new s(jVar.c(str), e11, f11, new e(), k0Var.d());
            this.f51005f = sVar;
            this.f51007h = k0Var;
            k0Var.l(sVar);
            this.f51021z = new f2.a(f11, e11, handler, f1Var, k0Var.k());
            d dVar = new d(str);
            this.f51016q = dVar;
            xVar.d(this, f11, dVar);
            jVar.f(f11, dVar);
        } catch (CameraAccessExceptionCompat e12) {
            throw w0.a(e12);
        }
    }

    private void A(Collection<androidx.camera.core.f1> collection) {
        for (androidx.camera.core.f1 f1Var : collection) {
            if (f1Var instanceof androidx.camera.core.r0) {
                this.f51005f.e0(null);
                return;
            }
        }
    }

    private void C() {
        F("Closing camera.");
        int i11 = c.f51025a[this.f51003d.ordinal()];
        if (i11 == 3) {
            k0(f.CLOSING);
            B(false);
        } else if (i11 == 4 || i11 == 5) {
            boolean a11 = this.f51006g.a();
            k0(f.CLOSING);
            if (a11) {
                v3.h.h(M());
                I();
            }
        } else if (i11 != 6) {
            F("close() ignored due to being in state: " + this.f51003d);
        } else {
            v3.h.h(this.f51008i == null);
            k0(f.INITIALIZED);
        }
    }

    private void D(boolean z11) {
        final d1 d1Var = new d1();
        this.f51018w.add(d1Var);
        j0(z11);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final Runnable runnable = new Runnable() { // from class: t.z
            @Override // java.lang.Runnable
            public final void run() {
                h0.t(surface, surfaceTexture);
            }
        };
        g1.b bVar = new g1.b();
        final androidx.camera.core.impl.s0 s0Var = new androidx.camera.core.impl.s0(surface);
        bVar.h(s0Var);
        bVar.q(1);
        F("Start configAndClose.");
        d1Var.r(bVar.m(), (CameraDevice) v3.h.f(this.f51008i), this.f51021z.a()).a(new Runnable() { // from class: t.x
            @Override // java.lang.Runnable
            public final void run() {
                h0.this.P(d1Var, s0Var, runnable);
            }
        }, this.f51002c);
    }

    private CameraDevice.StateCallback E() {
        ArrayList arrayList = new ArrayList(this.f51000a.e().b().b());
        arrayList.add(this.f51020y.c());
        arrayList.add(this.f51006g);
        return u0.a(arrayList);
    }

    private void G(String str, Throwable th2) {
        androidx.camera.core.n0.b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th2);
    }

    static String J(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    private com.google.common.util.concurrent.c<Void> K() {
        if (this.f51013n == null) {
            if (this.f51003d != f.RELEASED) {
                this.f51013n = androidx.concurrent.futures.b.a(new b.c() { // from class: t.v
                    {
                        h0.this = this;
                    }

                    @Override // androidx.concurrent.futures.b.c
                    public final Object a(b.a aVar) {
                        return h0.p(h0.this, aVar);
                    }
                });
            } else {
                this.f51013n = c0.f.h(null);
            }
        }
        return this.f51013n;
    }

    private boolean L() {
        return ((k0) i()).k() == 2;
    }

    public /* synthetic */ void N(Collection collection) {
        try {
            m0(collection);
        } finally {
            this.f51005f.y();
        }
    }

    public static /* synthetic */ void O(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    public /* synthetic */ Object R(b.a aVar) {
        v3.h.i(this.f51014o == null, "Camera can only be released once, so release completer should be null on creation.");
        this.f51014o = aVar;
        return "Release[camera=" + this + "]";
    }

    public /* synthetic */ void S(androidx.camera.core.f1 f1Var) {
        F("Use case " + f1Var + " ACTIVE");
        try {
            androidx.camera.core.impl.o1 o1Var = this.f51000a;
            o1Var.m(f1Var.i() + f1Var.hashCode(), f1Var.k());
            androidx.camera.core.impl.o1 o1Var2 = this.f51000a;
            o1Var2.q(f1Var.i() + f1Var.hashCode(), f1Var.k());
            p0();
        } catch (NullPointerException unused) {
            F("Failed to set already detached use case active");
        }
    }

    public /* synthetic */ void T(androidx.camera.core.f1 f1Var) {
        F("Use case " + f1Var + " INACTIVE");
        androidx.camera.core.impl.o1 o1Var = this.f51000a;
        o1Var.p(f1Var.i() + f1Var.hashCode());
        p0();
    }

    public /* synthetic */ void U(androidx.camera.core.f1 f1Var) {
        F("Use case " + f1Var + " RESET");
        androidx.camera.core.impl.o1 o1Var = this.f51000a;
        o1Var.q(f1Var.i() + f1Var.hashCode(), f1Var.k());
        j0(false);
        p0();
        if (this.f51003d == f.OPENED) {
            c0();
        }
    }

    public /* synthetic */ void V(androidx.camera.core.f1 f1Var) {
        F("Use case " + f1Var + " UPDATED");
        androidx.camera.core.impl.o1 o1Var = this.f51000a;
        o1Var.q(f1Var.i() + f1Var.hashCode(), f1Var.k());
        p0();
    }

    public static /* synthetic */ void W(g1.c cVar, androidx.camera.core.impl.g1 g1Var) {
        cVar.a(g1Var, g1.e.SESSION_ERROR_SURFACE_NEEDS_RESET);
    }

    public /* synthetic */ void X(b.a aVar) {
        c0.f.k(f0(), aVar);
    }

    public /* synthetic */ Object Y(final b.a aVar) {
        this.f51002c.execute(new Runnable() { // from class: t.f0
            {
                h0.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                h0.m(h0.this, aVar);
            }
        });
        return "Release[request=" + this.f51012m.getAndIncrement() + "]";
    }

    private void Z(List<androidx.camera.core.f1> list) {
        for (androidx.camera.core.f1 f1Var : list) {
            Set<String> set = this.A;
            if (!set.contains(f1Var.i() + f1Var.hashCode())) {
                Set<String> set2 = this.A;
                set2.add(f1Var.i() + f1Var.hashCode());
                f1Var.B();
            }
        }
    }

    private void a0(List<androidx.camera.core.f1> list) {
        for (androidx.camera.core.f1 f1Var : list) {
            Set<String> set = this.A;
            if (set.contains(f1Var.i() + f1Var.hashCode())) {
                f1Var.C();
                Set<String> set2 = this.A;
                set2.remove(f1Var.i() + f1Var.hashCode());
            }
        }
    }

    private void d0() {
        int i11 = c.f51025a[this.f51003d.ordinal()];
        if (i11 == 1) {
            b0(false);
        } else if (i11 != 2) {
            F("open() ignored due to being in state: " + this.f51003d);
        } else {
            k0(f.REOPENING);
            if (M() || this.f51009j != 0) {
                return;
            }
            v3.h.i(this.f51008i != null, "Camera Device should be open if session close is not complete");
            k0(f.OPENED);
            c0();
        }
    }

    private com.google.common.util.concurrent.c<Void> f0() {
        com.google.common.util.concurrent.c<Void> K = K();
        switch (c.f51025a[this.f51003d.ordinal()]) {
            case 1:
            case 6:
                v3.h.h(this.f51008i == null);
                k0(f.RELEASING);
                v3.h.h(M());
                I();
                break;
            case 2:
            case 4:
            case 5:
            case 7:
                boolean a11 = this.f51006g.a();
                k0(f.RELEASING);
                if (a11) {
                    v3.h.h(M());
                    I();
                    break;
                }
                break;
            case 3:
                k0(f.RELEASING);
                B(false);
                break;
            default:
                F("release() ignored due to being in state: " + this.f51003d);
                break;
        }
        return K;
    }

    private void i0() {
        if (this.f51019x != null) {
            androidx.camera.core.impl.o1 o1Var = this.f51000a;
            o1Var.o(this.f51019x.d() + this.f51019x.hashCode());
            androidx.camera.core.impl.o1 o1Var2 = this.f51000a;
            o1Var2.p(this.f51019x.d() + this.f51019x.hashCode());
            this.f51019x.b();
            this.f51019x = null;
        }
    }

    public static /* synthetic */ void l(h0 h0Var, Collection collection) {
        h0Var.Q(collection);
    }

    public static /* synthetic */ void m(h0 h0Var, b.a aVar) {
        h0Var.X(aVar);
    }

    private void m0(Collection<androidx.camera.core.f1> collection) {
        boolean isEmpty = this.f51000a.f().isEmpty();
        ArrayList arrayList = new ArrayList();
        for (androidx.camera.core.f1 f1Var : collection) {
            androidx.camera.core.impl.o1 o1Var = this.f51000a;
            if (!o1Var.i(f1Var.i() + f1Var.hashCode())) {
                try {
                    androidx.camera.core.impl.o1 o1Var2 = this.f51000a;
                    o1Var2.n(f1Var.i() + f1Var.hashCode(), f1Var.k());
                    arrayList.add(f1Var);
                } catch (NullPointerException unused) {
                    F("Failed to attach a detached use case");
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        F("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (isEmpty) {
            this.f51005f.c0(true);
            this.f51005f.M();
        }
        y();
        p0();
        j0(false);
        if (this.f51003d == f.OPENED) {
            c0();
        } else {
            d0();
        }
        o0(arrayList);
    }

    public static /* synthetic */ void n(g1.c cVar, androidx.camera.core.impl.g1 g1Var) {
        W(cVar, g1Var);
    }

    /* renamed from: n0 */
    public void Q(Collection<androidx.camera.core.f1> collection) {
        ArrayList arrayList = new ArrayList();
        for (androidx.camera.core.f1 f1Var : collection) {
            androidx.camera.core.impl.o1 o1Var = this.f51000a;
            if (o1Var.i(f1Var.i() + f1Var.hashCode())) {
                androidx.camera.core.impl.o1 o1Var2 = this.f51000a;
                o1Var2.l(f1Var.i() + f1Var.hashCode());
                arrayList.add(f1Var);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        F("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        A(arrayList);
        y();
        if (this.f51000a.f().isEmpty()) {
            this.f51005f.y();
            j0(false);
            this.f51005f.c0(false);
            this.f51010k = new d1();
            C();
            return;
        }
        p0();
        j0(false);
        if (this.f51003d == f.OPENED) {
            c0();
        }
    }

    public static /* synthetic */ void o(h0 h0Var, androidx.camera.core.f1 f1Var) {
        h0Var.S(f1Var);
    }

    private void o0(Collection<androidx.camera.core.f1> collection) {
        for (androidx.camera.core.f1 f1Var : collection) {
            if (f1Var instanceof androidx.camera.core.r0) {
                Size b11 = f1Var.b();
                if (b11 != null) {
                    this.f51005f.e0(new Rational(b11.getWidth(), b11.getHeight()));
                    return;
                }
                return;
            }
        }
    }

    public static /* synthetic */ Object p(h0 h0Var, b.a aVar) {
        return h0Var.R(aVar);
    }

    public static /* synthetic */ Object q(h0 h0Var, b.a aVar) {
        return h0Var.Y(aVar);
    }

    public static /* synthetic */ void r(h0 h0Var, androidx.camera.core.f1 f1Var) {
        h0Var.V(f1Var);
    }

    public static /* synthetic */ void t(Surface surface, SurfaceTexture surfaceTexture) {
        O(surface, surfaceTexture);
    }

    public static /* synthetic */ void u(h0 h0Var, Collection collection) {
        h0Var.N(collection);
    }

    public static /* synthetic */ void v(h0 h0Var, androidx.camera.core.f1 f1Var) {
        h0Var.T(f1Var);
    }

    public static /* synthetic */ void w(h0 h0Var, androidx.camera.core.f1 f1Var) {
        h0Var.U(f1Var);
    }

    private void x() {
        if (this.f51019x != null) {
            androidx.camera.core.impl.o1 o1Var = this.f51000a;
            o1Var.n(this.f51019x.d() + this.f51019x.hashCode(), this.f51019x.e());
            androidx.camera.core.impl.o1 o1Var2 = this.f51000a;
            o1Var2.m(this.f51019x.d() + this.f51019x.hashCode(), this.f51019x.e());
        }
    }

    private void y() {
        androidx.camera.core.impl.g1 b11 = this.f51000a.e().b();
        androidx.camera.core.impl.a0 f11 = b11.f();
        int size = f11.d().size();
        int size2 = b11.i().size();
        if (b11.i().isEmpty()) {
            return;
        }
        if (f11.d().isEmpty()) {
            if (this.f51019x == null) {
                this.f51019x = new s1(this.f51007h.i());
            }
            x();
        } else if (size2 == 1 && size == 1) {
            i0();
        } else if (size >= 2) {
            i0();
        } else {
            androidx.camera.core.n0.a("Camera2CameraImpl", "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
        }
    }

    private boolean z(a0.a aVar) {
        if (!aVar.k().isEmpty()) {
            androidx.camera.core.n0.m("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        for (androidx.camera.core.impl.g1 g1Var : this.f51000a.d()) {
            List<DeferrableSurface> d11 = g1Var.f().d();
            if (!d11.isEmpty()) {
                for (DeferrableSurface deferrableSurface : d11) {
                    aVar.f(deferrableSurface);
                }
            }
        }
        if (aVar.k().isEmpty()) {
            androidx.camera.core.n0.m("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
            return false;
        }
        return true;
    }

    void B(boolean z11) {
        boolean z12 = this.f51003d == f.CLOSING || this.f51003d == f.RELEASING || (this.f51003d == f.REOPENING && this.f51009j != 0);
        v3.h.i(z12, "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f51003d + " (error: " + J(this.f51009j) + ")");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 > 23 && i11 < 29 && L() && this.f51009j == 0) {
            D(z11);
        } else {
            j0(z11);
        }
        this.f51010k.d();
    }

    void F(String str) {
        G(str, null);
    }

    androidx.camera.core.impl.g1 H(DeferrableSurface deferrableSurface) {
        for (androidx.camera.core.impl.g1 g1Var : this.f51000a.f()) {
            if (g1Var.i().contains(deferrableSurface)) {
                return g1Var;
            }
        }
        return null;
    }

    void I() {
        v3.h.h(this.f51003d == f.RELEASING || this.f51003d == f.CLOSING);
        v3.h.h(this.f51015p.isEmpty());
        this.f51008i = null;
        if (this.f51003d == f.CLOSING) {
            k0(f.INITIALIZED);
            return;
        }
        this.f51001b.g(this.f51016q);
        k0(f.RELEASED);
        b.a<Void> aVar = this.f51014o;
        if (aVar != null) {
            aVar.c(null);
            this.f51014o = null;
        }
    }

    boolean M() {
        return this.f51015p.isEmpty() && this.f51018w.isEmpty();
    }

    void b0(boolean z11) {
        if (!z11) {
            this.f51006g.d();
        }
        this.f51006g.a();
        if (this.f51016q.b() && this.f51017t.e(this)) {
            k0(f.OPENING);
            F("Opening camera.");
            try {
                this.f51001b.e(this.f51007h.a(), this.f51002c, E());
                return;
            } catch (CameraAccessExceptionCompat e11) {
                F("Unable to open camera due to " + e11.getMessage());
                if (e11.b() != 10001) {
                    return;
                }
                k0(f.INITIALIZED);
                return;
            } catch (SecurityException e12) {
                F("Unable to open camera due to " + e12.getMessage());
                k0(f.REOPENING);
                this.f51006g.e();
                return;
            }
        }
        F("No cameras available. Waiting for available camera before opening camera.");
        k0(f.PENDING_OPEN);
    }

    @Override // androidx.camera.core.f1.d
    public void c(final androidx.camera.core.f1 f1Var) {
        v3.h.f(f1Var);
        this.f51002c.execute(new Runnable() { // from class: t.b0
            @Override // java.lang.Runnable
            public final void run() {
                h0.o(h0.this, f1Var);
            }
        });
    }

    void c0() {
        v3.h.h(this.f51003d == f.OPENED);
        g1.f e11 = this.f51000a.e();
        if (!e11.c()) {
            F("Unable to create capture session due to conflicting configurations");
        } else {
            c0.f.b(this.f51010k.r(e11.b(), (CameraDevice) v3.h.f(this.f51008i), this.f51021z.a()), new b(), this.f51002c);
        }
    }

    @Override // androidx.camera.core.f1.d
    public void d(final androidx.camera.core.f1 f1Var) {
        v3.h.f(f1Var);
        this.f51002c.execute(new Runnable() { // from class: t.c0
            @Override // java.lang.Runnable
            public final void run() {
                h0.r(h0.this, f1Var);
            }
        });
    }

    @Override // androidx.camera.core.impl.s
    public CameraControlInternal e() {
        return this.f51005f;
    }

    void e0(final androidx.camera.core.impl.g1 g1Var) {
        ScheduledExecutorService d11 = b0.a.d();
        List<g1.c> c11 = g1Var.c();
        if (c11.isEmpty()) {
            return;
        }
        final g1.c cVar = c11.get(0);
        G("Posting surface closed", new Throwable());
        d11.execute(new Runnable() { // from class: t.a0
            @Override // java.lang.Runnable
            public final void run() {
                h0.n(g1.c.this, g1Var);
            }
        });
    }

    @Override // androidx.camera.core.impl.s
    public void f(final Collection<androidx.camera.core.f1> collection) {
        if (collection.isEmpty()) {
            return;
        }
        this.f51005f.M();
        Z(new ArrayList(collection));
        try {
            this.f51002c.execute(new Runnable() { // from class: t.w
                {
                    h0.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    h0.u(h0.this, collection);
                }
            });
        } catch (RejectedExecutionException e11) {
            G("Unable to attach use cases.", e11);
            this.f51005f.y();
        }
    }

    @Override // androidx.camera.core.f1.d
    public void g(final androidx.camera.core.f1 f1Var) {
        v3.h.f(f1Var);
        this.f51002c.execute(new Runnable() { // from class: t.e0
            @Override // java.lang.Runnable
            public final void run() {
                h0.w(h0.this, f1Var);
            }
        });
    }

    /* renamed from: g0 */
    public void P(d1 d1Var, DeferrableSurface deferrableSurface, Runnable runnable) {
        this.f51018w.remove(d1Var);
        com.google.common.util.concurrent.c<Void> h02 = h0(d1Var, false);
        deferrableSurface.c();
        c0.f.n(Arrays.asList(h02, deferrableSurface.f())).a(runnable, b0.a.a());
    }

    @Override // androidx.camera.core.impl.s
    public void h(final Collection<androidx.camera.core.f1> collection) {
        if (collection.isEmpty()) {
            return;
        }
        a0(new ArrayList(collection));
        this.f51002c.execute(new Runnable() { // from class: t.g0
            {
                h0.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                h0.l(h0.this, collection);
            }
        });
    }

    com.google.common.util.concurrent.c<Void> h0(d1 d1Var, boolean z11) {
        d1Var.e();
        com.google.common.util.concurrent.c<Void> t11 = d1Var.t(z11);
        F("Releasing session in state " + this.f51003d.name());
        this.f51015p.put(d1Var, t11);
        c0.f.b(t11, new a(d1Var), b0.a.a());
        return t11;
    }

    @Override // androidx.camera.core.impl.s
    public androidx.camera.core.impl.r i() {
        return this.f51007h;
    }

    @Override // androidx.camera.core.impl.s
    public androidx.camera.core.impl.z0<s.a> j() {
        return this.f51004e;
    }

    void j0(boolean z11) {
        v3.h.h(this.f51010k != null);
        F("Resetting Capture Session");
        d1 d1Var = this.f51010k;
        androidx.camera.core.impl.g1 i11 = d1Var.i();
        List<androidx.camera.core.impl.a0> h11 = d1Var.h();
        d1 d1Var2 = new d1();
        this.f51010k = d1Var2;
        d1Var2.u(i11);
        this.f51010k.k(h11);
        h0(d1Var, z11);
    }

    @Override // androidx.camera.core.f1.d
    public void k(final androidx.camera.core.f1 f1Var) {
        v3.h.f(f1Var);
        this.f51002c.execute(new Runnable() { // from class: t.d0
            @Override // java.lang.Runnable
            public final void run() {
                h0.v(h0.this, f1Var);
            }
        });
    }

    void k0(f fVar) {
        s.a aVar;
        F("Transitioning camera internal state: " + this.f51003d + " --> " + fVar);
        this.f51003d = fVar;
        switch (c.f51025a[fVar.ordinal()]) {
            case 1:
                aVar = s.a.CLOSED;
                break;
            case 2:
                aVar = s.a.CLOSING;
                break;
            case 3:
                aVar = s.a.OPEN;
                break;
            case 4:
            case 5:
                aVar = s.a.OPENING;
                break;
            case 6:
                aVar = s.a.PENDING_OPEN;
                break;
            case 7:
                aVar = s.a.RELEASING;
                break;
            case 8:
                aVar = s.a.RELEASED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + fVar);
        }
        this.f51017t.b(this, aVar);
        this.f51004e.c(aVar);
    }

    void l0(List<androidx.camera.core.impl.a0> list) {
        ArrayList arrayList = new ArrayList();
        for (androidx.camera.core.impl.a0 a0Var : list) {
            a0.a j11 = a0.a.j(a0Var);
            if (!a0Var.d().isEmpty() || !a0Var.g() || z(j11)) {
                arrayList.add(j11.h());
            }
        }
        F("Issue capture request");
        this.f51010k.k(arrayList);
    }

    void p0() {
        g1.f c11 = this.f51000a.c();
        if (c11.c()) {
            c11.a(this.f51011l);
            this.f51010k.u(c11.b());
            return;
        }
        this.f51010k.u(this.f51011l);
    }

    void q0(CameraDevice cameraDevice) {
        try {
            this.f51005f.d0(cameraDevice.createCaptureRequest(this.f51005f.B()));
        } catch (CameraAccessException e11) {
            androidx.camera.core.n0.d("Camera2CameraImpl", "fail to create capture request.", e11);
        }
    }

    @Override // androidx.camera.core.impl.s
    public com.google.common.util.concurrent.c<Void> release() {
        return androidx.concurrent.futures.b.a(new b.c() { // from class: t.y
            {
                h0.this = this;
            }

            @Override // androidx.concurrent.futures.b.c
            public final Object a(b.a aVar) {
                return h0.q(h0.this, aVar);
            }
        });
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f51007h.a());
    }
}