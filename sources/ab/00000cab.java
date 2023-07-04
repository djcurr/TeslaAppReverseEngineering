package bk;

import ak.k0;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final e f7782a = new e();

    /* renamed from: b  reason: collision with root package name */
    private final WindowManager f7783b;

    /* renamed from: c  reason: collision with root package name */
    private final b f7784c;

    /* renamed from: d  reason: collision with root package name */
    private final a f7785d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7786e;

    /* renamed from: f  reason: collision with root package name */
    private Surface f7787f;

    /* renamed from: g  reason: collision with root package name */
    private float f7788g;

    /* renamed from: h  reason: collision with root package name */
    private float f7789h;

    /* renamed from: i  reason: collision with root package name */
    private float f7790i;

    /* renamed from: j  reason: collision with root package name */
    private float f7791j;

    /* renamed from: k  reason: collision with root package name */
    private long f7792k;

    /* renamed from: l  reason: collision with root package name */
    private long f7793l;

    /* renamed from: m  reason: collision with root package name */
    private long f7794m;

    /* renamed from: n  reason: collision with root package name */
    private long f7795n;

    /* renamed from: o  reason: collision with root package name */
    private long f7796o;

    /* renamed from: p  reason: collision with root package name */
    private long f7797p;

    /* renamed from: q  reason: collision with root package name */
    private long f7798q;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class a implements DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        private final DisplayManager f7799a;

        public a(DisplayManager displayManager) {
            this.f7799a = displayManager;
        }

        public void a() {
            this.f7799a.registerDisplayListener(this, k0.x());
        }

        public void b() {
            this.f7799a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i11) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i11) {
            if (i11 == 0) {
                l.this.r();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i11) {
        }
    }

    /* loaded from: classes3.dex */
    private static final class b implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f  reason: collision with root package name */
        private static final b f7801f = new b();

        /* renamed from: a  reason: collision with root package name */
        public volatile long f7802a = -9223372036854775807L;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f7803b;

        /* renamed from: c  reason: collision with root package name */
        private final HandlerThread f7804c;

        /* renamed from: d  reason: collision with root package name */
        private Choreographer f7805d;

        /* renamed from: e  reason: collision with root package name */
        private int f7806e;

        private b() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f7804c = handlerThread;
            handlerThread.start();
            Handler w11 = k0.w(handlerThread.getLooper(), this);
            this.f7803b = w11;
            w11.sendEmptyMessage(0);
        }

        private void b() {
            int i11 = this.f7806e + 1;
            this.f7806e = i11;
            if (i11 == 1) {
                ((Choreographer) ak.a.e(this.f7805d)).postFrameCallback(this);
            }
        }

        private void c() {
            this.f7805d = Choreographer.getInstance();
        }

        public static b d() {
            return f7801f;
        }

        private void f() {
            int i11 = this.f7806e - 1;
            this.f7806e = i11;
            if (i11 == 0) {
                ((Choreographer) ak.a.e(this.f7805d)).removeFrameCallback(this);
                this.f7802a = -9223372036854775807L;
            }
        }

        public void a() {
            this.f7803b.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j11) {
            this.f7802a = j11;
            ((Choreographer) ak.a.e(this.f7805d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f7803b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 0) {
                c();
                return true;
            } else if (i11 == 1) {
                b();
                return true;
            } else if (i11 != 2) {
                return false;
            } else {
                f();
                return true;
            }
        }
    }

    public l(Context context) {
        if (context != null) {
            context = context.getApplicationContext();
            this.f7783b = (WindowManager) context.getSystemService("window");
        } else {
            this.f7783b = null;
        }
        if (this.f7783b != null) {
            this.f7785d = k0.f477a >= 17 ? f((Context) ak.a.e(context)) : null;
            this.f7784c = b.d();
        } else {
            this.f7785d = null;
            this.f7784c = null;
        }
        this.f7792k = -9223372036854775807L;
        this.f7793l = -9223372036854775807L;
        this.f7788g = -1.0f;
        this.f7791j = 1.0f;
    }

    private static boolean c(long j11, long j12) {
        return Math.abs(j11 - j12) <= 20000000;
    }

    private void d() {
        Surface surface;
        if (k0.f477a < 30 || (surface = this.f7787f) == null || this.f7790i == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        this.f7790i = BitmapDescriptorFactory.HUE_RED;
        q(surface, BitmapDescriptorFactory.HUE_RED);
    }

    private static long e(long j11, long j12, long j13) {
        long j14;
        long j15 = j12 + (((j11 - j12) / j13) * j13);
        if (j11 <= j15) {
            j14 = j15 - j13;
        } else {
            j15 = j13 + j15;
            j14 = j15;
        }
        return j15 - j11 < j11 - j14 ? j15 : j14;
    }

    private a f(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new a(displayManager);
    }

    private void p() {
        this.f7794m = 0L;
        this.f7797p = -1L;
        this.f7795n = -1L;
    }

    private static void q(Surface surface, float f11) {
        try {
            surface.setFrameRate(f11, f11 == BitmapDescriptorFactory.HUE_RED ? 0 : 1);
        } catch (IllegalStateException e11) {
            ak.o.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        Display defaultDisplay = ((WindowManager) ak.a.e(this.f7783b)).getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / defaultDisplay.getRefreshRate());
            this.f7792k = refreshRate;
            this.f7793l = (refreshRate * 80) / 100;
            return;
        }
        ak.o.h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f7792k = -9223372036854775807L;
        this.f7793l = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
        if (java.lang.Math.abs(r0 - r7.f7789h) >= (r7.f7782a.e() && (r7.f7782a.d() > 5000000000L ? 1 : (r7.f7782a.d() == 5000000000L ? 0 : -1)) >= 0 ? 0.02f : 1.0f)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
        if (r7.f7782a.c() >= 30) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void s() {
        /*
            r7 = this;
            int r0 = ak.k0.f477a
            r1 = 30
            if (r0 < r1) goto L73
            android.view.Surface r0 = r7.f7787f
            if (r0 != 0) goto Lc
            goto L73
        Lc:
            bk.e r0 = r7.f7782a
            boolean r0 = r0.e()
            if (r0 == 0) goto L1b
            bk.e r0 = r7.f7782a
            float r0 = r0.b()
            goto L1d
        L1b:
            float r0 = r7.f7788g
        L1d:
            float r2 = r7.f7789h
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L24
            return
        L24:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L61
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L61
            bk.e r1 = r7.f7782a
            boolean r1 = r1.e()
            if (r1 == 0) goto L49
            bk.e r1 = r7.f7782a
            long r1 = r1.d()
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L49
            r1 = r6
            goto L4a
        L49:
            r1 = r5
        L4a:
            if (r1 == 0) goto L50
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L52
        L50:
            r1 = 1065353216(0x3f800000, float:1.0)
        L52:
            float r2 = r7.f7789h
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L5f
            goto L6c
        L5f:
            r6 = r5
            goto L6c
        L61:
            if (r4 == 0) goto L64
            goto L6c
        L64:
            bk.e r2 = r7.f7782a
            int r2 = r2.c()
            if (r2 < r1) goto L5f
        L6c:
            if (r6 == 0) goto L73
            r7.f7789h = r0
            r7.t(r5)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.l.s():void");
    }

    private void t(boolean z11) {
        Surface surface;
        if (k0.f477a < 30 || (surface = this.f7787f) == null) {
            return;
        }
        float f11 = BitmapDescriptorFactory.HUE_RED;
        if (this.f7786e) {
            float f12 = this.f7789h;
            if (f12 != -1.0f) {
                f11 = this.f7791j * f12;
            }
        }
        if (z11 || this.f7790i != f11) {
            this.f7790i = f11;
            q(surface, f11);
        }
    }

    public long b(long j11) {
        long j12;
        b bVar;
        if (this.f7797p != -1 && this.f7782a.e()) {
            long a11 = this.f7798q + (((float) (this.f7782a.a() * (this.f7794m - this.f7797p))) / this.f7791j);
            if (!c(j11, a11)) {
                p();
            } else {
                j12 = a11;
                this.f7795n = this.f7794m;
                this.f7796o = j12;
                bVar = this.f7784c;
                if (bVar != null || this.f7792k == -9223372036854775807L) {
                    return j12;
                }
                long j13 = bVar.f7802a;
                return j13 == -9223372036854775807L ? j12 : e(j12, j13, this.f7792k) - this.f7793l;
            }
        }
        j12 = j11;
        this.f7795n = this.f7794m;
        this.f7796o = j12;
        bVar = this.f7784c;
        if (bVar != null) {
        }
        return j12;
    }

    public void g() {
        if (this.f7783b != null) {
            a aVar = this.f7785d;
            if (aVar != null) {
                aVar.b();
            }
            ((b) ak.a.e(this.f7784c)).e();
        }
    }

    public void h() {
        if (this.f7783b != null) {
            ((b) ak.a.e(this.f7784c)).a();
            a aVar = this.f7785d;
            if (aVar != null) {
                aVar.a();
            }
            r();
        }
    }

    public void i(float f11) {
        this.f7788g = f11;
        this.f7782a.g();
        s();
    }

    public void j(long j11) {
        long j12 = this.f7795n;
        if (j12 != -1) {
            this.f7797p = j12;
            this.f7798q = this.f7796o;
        }
        this.f7794m++;
        this.f7782a.f(j11 * 1000);
        s();
    }

    public void k(float f11) {
        this.f7791j = f11;
        p();
        t(false);
    }

    public void l() {
        p();
    }

    public void m() {
        this.f7786e = true;
        p();
        t(false);
    }

    public void n() {
        this.f7786e = false;
        d();
    }

    public void o(Surface surface) {
        if (surface instanceof d) {
            surface = null;
        }
        if (this.f7787f == surface) {
            return;
        }
        d();
        this.f7787f = surface;
        t(true);
    }
}