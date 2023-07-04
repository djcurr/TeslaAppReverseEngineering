package androidx.camera.core;

import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.h1;
import androidx.camera.core.impl.r0;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class x0 extends DeferrableSurface {

    /* renamed from: i */
    final Object f2544i = new Object();

    /* renamed from: j */
    private final r0.a f2545j;

    /* renamed from: k */
    boolean f2546k;

    /* renamed from: l */
    private final Size f2547l;

    /* renamed from: m */
    final q0 f2548m;

    /* renamed from: n */
    final Surface f2549n;

    /* renamed from: o */
    private final Handler f2550o;

    /* renamed from: p */
    final androidx.camera.core.impl.c0 f2551p;

    /* renamed from: q */
    final androidx.camera.core.impl.b0 f2552q;

    /* renamed from: r */
    private final androidx.camera.core.impl.e f2553r;

    /* renamed from: s */
    private final DeferrableSurface f2554s;

    /* renamed from: t */
    private String f2555t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements c0.c<Surface> {
        a() {
            x0.this = r1;
        }

        @Override // c0.c
        /* renamed from: a */
        public void onSuccess(Surface surface) {
            synchronized (x0.this.f2544i) {
                x0.this.f2552q.a(surface, 1);
            }
        }

        @Override // c0.c
        public void onFailure(Throwable th2) {
            n0.d("ProcessingSurfaceTextur", "Failed to extract Listenable<Surface>.", th2);
        }
    }

    public x0(int i11, int i12, int i13, Handler handler, androidx.camera.core.impl.c0 c0Var, androidx.camera.core.impl.b0 b0Var, DeferrableSurface deferrableSurface, String str) {
        r0.a aVar = new r0.a() { // from class: androidx.camera.core.v0
            {
                x0.this = this;
            }

            @Override // androidx.camera.core.impl.r0.a
            public final void a(androidx.camera.core.impl.r0 r0Var) {
                x0.m(x0.this, r0Var);
            }
        };
        this.f2545j = aVar;
        this.f2546k = false;
        Size size = new Size(i11, i12);
        this.f2547l = size;
        if (handler != null) {
            this.f2550o = handler;
        } else {
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                this.f2550o = new Handler(myLooper);
            } else {
                throw new IllegalStateException("Creating a ProcessingSurface requires a non-null Handler, or be created  on a thread with a Looper.");
            }
        }
        ScheduledExecutorService e11 = b0.a.e(this.f2550o);
        q0 q0Var = new q0(i11, i12, i13, 2);
        this.f2548m = q0Var;
        q0Var.e(aVar, e11);
        this.f2549n = q0Var.getSurface();
        this.f2553r = q0Var.l();
        this.f2552q = b0Var;
        b0Var.b(size);
        this.f2551p = c0Var;
        this.f2554s = deferrableSurface;
        this.f2555t = str;
        c0.f.b(deferrableSurface.e(), new a(), b0.a.a());
        f().a(new Runnable() { // from class: androidx.camera.core.w0
            {
                x0.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                x0.l(x0.this);
            }
        }, b0.a.a());
    }

    public static /* synthetic */ void l(x0 x0Var) {
        x0Var.q();
    }

    public static /* synthetic */ void m(x0 x0Var, androidx.camera.core.impl.r0 r0Var) {
        x0Var.p(r0Var);
    }

    public /* synthetic */ void p(androidx.camera.core.impl.r0 r0Var) {
        synchronized (this.f2544i) {
            o(r0Var);
        }
    }

    public void q() {
        synchronized (this.f2544i) {
            if (this.f2546k) {
                return;
            }
            this.f2548m.close();
            this.f2549n.release();
            this.f2554s.c();
            this.f2546k = true;
        }
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public com.google.common.util.concurrent.c<Surface> k() {
        com.google.common.util.concurrent.c<Surface> h11;
        synchronized (this.f2544i) {
            h11 = c0.f.h(this.f2549n);
        }
        return h11;
    }

    public androidx.camera.core.impl.e n() {
        androidx.camera.core.impl.e eVar;
        synchronized (this.f2544i) {
            if (!this.f2546k) {
                eVar = this.f2553r;
            } else {
                throw new IllegalStateException("ProcessingSurface already released!");
            }
        }
        return eVar;
    }

    void o(androidx.camera.core.impl.r0 r0Var) {
        if (this.f2546k) {
            return;
        }
        g0 g0Var = null;
        try {
            g0Var = r0Var.f();
        } catch (IllegalStateException e11) {
            n0.d("ProcessingSurfaceTextur", "Failed to acquire next image.", e11);
        }
        if (g0Var == null) {
            return;
        }
        z.j0 l12 = g0Var.l1();
        if (l12 == null) {
            g0Var.close();
            return;
        }
        Integer c11 = l12.a().c(this.f2555t);
        if (c11 == null) {
            g0Var.close();
        } else if (this.f2551p.getId() != c11.intValue()) {
            n0.m("ProcessingSurfaceTextur", "ImageProxyBundle does not contain this id: " + c11);
            g0Var.close();
        } else {
            h1 h1Var = new h1(g0Var, this.f2555t);
            this.f2552q.c(h1Var);
            h1Var.c();
        }
    }
}