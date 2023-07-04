package androidx.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.e1;
import androidx.camera.core.n0;
import androidx.camera.view.k;
import androidx.camera.view.q;

/* loaded from: classes.dex */
public final class q extends k {

    /* renamed from: e */
    SurfaceView f2645e;

    /* renamed from: f */
    final b f2646f;

    /* renamed from: g */
    private k.a f2647g;

    /* loaded from: classes.dex */
    private static class a {
        static void a(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    /* loaded from: classes.dex */
    public class b implements SurfaceHolder.Callback {

        /* renamed from: a */
        private Size f2648a;

        /* renamed from: b */
        private e1 f2649b;

        /* renamed from: c */
        private Size f2650c;

        /* renamed from: d */
        private boolean f2651d = false;

        b() {
            q.this = r1;
        }

        public static /* synthetic */ void a(b bVar, e1.f fVar) {
            bVar.e(fVar);
        }

        private boolean b() {
            Size size;
            return (this.f2651d || this.f2649b == null || (size = this.f2648a) == null || !size.equals(this.f2650c)) ? false : true;
        }

        private void c() {
            if (this.f2649b != null) {
                n0.a("SurfaceViewImpl", "Request canceled: " + this.f2649b);
                this.f2649b.y();
            }
        }

        private void d() {
            if (this.f2649b != null) {
                n0.a("SurfaceViewImpl", "Surface invalidated " + this.f2649b);
                this.f2649b.k().c();
            }
        }

        public /* synthetic */ void e(e1.f fVar) {
            n0.a("SurfaceViewImpl", "Safe to release surface.");
            q.this.o();
        }

        private boolean g() {
            Surface surface = q.this.f2645e.getHolder().getSurface();
            if (b()) {
                n0.a("SurfaceViewImpl", "Surface set on Preview.");
                this.f2649b.v(surface, androidx.core.content.b.getMainExecutor(q.this.f2645e.getContext()), new v3.a() { // from class: androidx.camera.view.r
                    @Override // v3.a
                    public final void accept(Object obj) {
                        q.b.a(q.b.this, (e1.f) obj);
                    }
                });
                this.f2651d = true;
                q.this.f();
                return true;
            }
            return false;
        }

        void f(e1 e1Var) {
            c();
            this.f2649b = e1Var;
            Size l11 = e1Var.l();
            this.f2648a = l11;
            this.f2651d = false;
            if (g()) {
                return;
            }
            n0.a("SurfaceViewImpl", "Wait for new Surface creation.");
            q.this.f2645e.getHolder().setFixedSize(l11.getWidth(), l11.getHeight());
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
            n0.a("SurfaceViewImpl", "Surface changed. Size: " + i12 + "x" + i13);
            this.f2650c = new Size(i12, i13);
            g();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            n0.a("SurfaceViewImpl", "Surface created.");
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            n0.a("SurfaceViewImpl", "Surface destroyed.");
            if (this.f2651d) {
                d();
            } else {
                c();
            }
            this.f2651d = false;
            this.f2649b = null;
            this.f2650c = null;
            this.f2648a = null;
        }
    }

    public q(FrameLayout frameLayout, f fVar) {
        super(frameLayout, fVar);
        this.f2646f = new b();
    }

    public static /* synthetic */ void j(q qVar, e1 e1Var) {
        qVar.n(e1Var);
    }

    public static /* synthetic */ void k(int i11) {
        m(i11);
    }

    public static /* synthetic */ void m(int i11) {
        if (i11 == 0) {
            n0.a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
            return;
        }
        n0.c("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i11);
    }

    public /* synthetic */ void n(e1 e1Var) {
        this.f2646f.f(e1Var);
    }

    @Override // androidx.camera.view.k
    View b() {
        return this.f2645e;
    }

    @Override // androidx.camera.view.k
    Bitmap c() {
        SurfaceView surfaceView = this.f2645e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f2645e.getHolder().getSurface().isValid()) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.f2645e.getWidth(), this.f2645e.getHeight(), Bitmap.Config.ARGB_8888);
        SurfaceView surfaceView2 = this.f2645e;
        a.a(surfaceView2, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: androidx.camera.view.n
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i11) {
                q.k(i11);
            }
        }, surfaceView2.getHandler());
        return createBitmap;
    }

    @Override // androidx.camera.view.k
    public void d() {
    }

    @Override // androidx.camera.view.k
    public void e() {
    }

    @Override // androidx.camera.view.k
    public void g(final e1 e1Var, k.a aVar) {
        this.f2631a = e1Var.l();
        this.f2647g = aVar;
        l();
        e1Var.i(androidx.core.content.b.getMainExecutor(this.f2645e.getContext()), new Runnable() { // from class: androidx.camera.view.o
            {
                q.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                q.this.o();
            }
        });
        this.f2645e.post(new Runnable() { // from class: androidx.camera.view.p
            @Override // java.lang.Runnable
            public final void run() {
                q.j(q.this, e1Var);
            }
        });
    }

    @Override // androidx.camera.view.k
    public com.google.common.util.concurrent.c<Void> i() {
        return c0.f.h(null);
    }

    void l() {
        v3.h.f(this.f2632b);
        v3.h.f(this.f2631a);
        SurfaceView surfaceView = new SurfaceView(this.f2632b.getContext());
        this.f2645e = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f2631a.getWidth(), this.f2631a.getHeight()));
        this.f2632b.removeAllViews();
        this.f2632b.addView(this.f2645e);
        this.f2645e.getHolder().addCallback(this.f2646f);
    }

    public void o() {
        k.a aVar = this.f2647g;
        if (aVar != null) {
            aVar.a();
            this.f2647g = null;
        }
    }
}