package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.e1;
import androidx.camera.core.n0;
import androidx.camera.view.k;
import androidx.concurrent.futures.b;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class x extends k {

    /* renamed from: e */
    TextureView f2664e;

    /* renamed from: f */
    SurfaceTexture f2665f;

    /* renamed from: g */
    com.google.common.util.concurrent.c<e1.f> f2666g;

    /* renamed from: h */
    e1 f2667h;

    /* renamed from: i */
    boolean f2668i;

    /* renamed from: j */
    SurfaceTexture f2669j;

    /* renamed from: k */
    AtomicReference<b.a<Void>> f2670k;

    /* renamed from: l */
    k.a f2671l;

    /* loaded from: classes.dex */
    public class a implements TextureView.SurfaceTextureListener {

        /* renamed from: androidx.camera.view.x$a$a */
        /* loaded from: classes.dex */
        class C0045a implements c0.c<e1.f> {

            /* renamed from: a */
            final /* synthetic */ SurfaceTexture f2673a;

            C0045a(SurfaceTexture surfaceTexture) {
                a.this = r1;
                this.f2673a = surfaceTexture;
            }

            @Override // c0.c
            /* renamed from: a */
            public void onSuccess(e1.f fVar) {
                v3.h.i(fVar.a() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                n0.a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                this.f2673a.release();
                x xVar = x.this;
                if (xVar.f2669j != null) {
                    xVar.f2669j = null;
                }
            }

            @Override // c0.c
            public void onFailure(Throwable th2) {
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th2);
            }
        }

        a() {
            x.this = r1;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
            n0.a("TextureViewImpl", "SurfaceTexture available. Size: " + i11 + "x" + i12);
            x xVar = x.this;
            xVar.f2665f = surfaceTexture;
            if (xVar.f2666g != null) {
                v3.h.f(xVar.f2667h);
                n0.a("TextureViewImpl", "Surface invalidated " + x.this.f2667h);
                x.this.f2667h.k().c();
                return;
            }
            xVar.u();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            x xVar = x.this;
            xVar.f2665f = null;
            com.google.common.util.concurrent.c<e1.f> cVar = xVar.f2666g;
            if (cVar != null) {
                c0.f.b(cVar, new C0045a(surfaceTexture), androidx.core.content.b.getMainExecutor(x.this.f2664e.getContext()));
                x.this.f2669j = surfaceTexture;
                return false;
            }
            n0.a("TextureViewImpl", "SurfaceTexture about to be destroyed");
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
            n0.a("TextureViewImpl", "SurfaceTexture size changed: " + i11 + "x" + i12);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            b.a<Void> andSet = x.this.f2670k.getAndSet(null);
            if (andSet != null) {
                andSet.c(null);
            }
        }
    }

    public x(FrameLayout frameLayout, f fVar) {
        super(frameLayout, fVar);
        this.f2668i = false;
        this.f2670k = new AtomicReference<>();
    }

    public static /* synthetic */ Object j(x xVar, b.a aVar) {
        return xVar.r(aVar);
    }

    public static /* synthetic */ void k(x xVar, e1 e1Var) {
        xVar.o(e1Var);
    }

    public static /* synthetic */ void l(x xVar, Surface surface, com.google.common.util.concurrent.c cVar, e1 e1Var) {
        xVar.q(surface, cVar, e1Var);
    }

    public static /* synthetic */ Object m(x xVar, Surface surface, b.a aVar) {
        return xVar.p(surface, aVar);
    }

    public /* synthetic */ void o(e1 e1Var) {
        e1 e1Var2 = this.f2667h;
        if (e1Var2 != null && e1Var2 == e1Var) {
            this.f2667h = null;
            this.f2666g = null;
        }
        s();
    }

    public /* synthetic */ Object p(Surface surface, final b.a aVar) {
        n0.a("TextureViewImpl", "Surface set on Preview.");
        e1 e1Var = this.f2667h;
        Executor a11 = b0.a.a();
        Objects.requireNonNull(aVar);
        e1Var.v(surface, a11, new v3.a() { // from class: androidx.camera.view.w
            @Override // v3.a
            public final void accept(Object obj) {
                b.a.this.c((e1.f) obj);
            }
        });
        return "provideSurface[request=" + this.f2667h + " surface=" + surface + "]";
    }

    public /* synthetic */ void q(Surface surface, com.google.common.util.concurrent.c cVar, e1 e1Var) {
        n0.a("TextureViewImpl", "Safe to release surface.");
        s();
        surface.release();
        if (this.f2666g == cVar) {
            this.f2666g = null;
        }
        if (this.f2667h == e1Var) {
            this.f2667h = null;
        }
    }

    public /* synthetic */ Object r(b.a aVar) {
        this.f2670k.set(aVar);
        return "textureViewImpl_waitForNextFrame";
    }

    private void s() {
        k.a aVar = this.f2671l;
        if (aVar != null) {
            aVar.a();
            this.f2671l = null;
        }
    }

    private void t() {
        if (!this.f2668i || this.f2669j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f2664e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f2669j;
        if (surfaceTexture != surfaceTexture2) {
            this.f2664e.setSurfaceTexture(surfaceTexture2);
            this.f2669j = null;
            this.f2668i = false;
        }
    }

    @Override // androidx.camera.view.k
    View b() {
        return this.f2664e;
    }

    @Override // androidx.camera.view.k
    Bitmap c() {
        TextureView textureView = this.f2664e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f2664e.getBitmap();
    }

    @Override // androidx.camera.view.k
    public void d() {
        t();
    }

    @Override // androidx.camera.view.k
    public void e() {
        this.f2668i = true;
    }

    @Override // androidx.camera.view.k
    public void g(final e1 e1Var, k.a aVar) {
        this.f2631a = e1Var.l();
        this.f2671l = aVar;
        n();
        e1 e1Var2 = this.f2667h;
        if (e1Var2 != null) {
            e1Var2.y();
        }
        this.f2667h = e1Var;
        e1Var.i(androidx.core.content.b.getMainExecutor(this.f2664e.getContext()), new Runnable() { // from class: androidx.camera.view.v
            @Override // java.lang.Runnable
            public final void run() {
                x.k(x.this, e1Var);
            }
        });
        u();
    }

    @Override // androidx.camera.view.k
    public com.google.common.util.concurrent.c<Void> i() {
        return androidx.concurrent.futures.b.a(new b.c() { // from class: androidx.camera.view.s
            {
                x.this = this;
            }

            @Override // androidx.concurrent.futures.b.c
            public final Object a(b.a aVar) {
                return x.j(x.this, aVar);
            }
        });
    }

    public void n() {
        v3.h.f(this.f2632b);
        v3.h.f(this.f2631a);
        TextureView textureView = new TextureView(this.f2632b.getContext());
        this.f2664e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f2631a.getWidth(), this.f2631a.getHeight()));
        this.f2664e.setSurfaceTextureListener(new a());
        this.f2632b.removeAllViews();
        this.f2632b.addView(this.f2664e);
    }

    void u() {
        SurfaceTexture surfaceTexture;
        Size size = this.f2631a;
        if (size == null || (surfaceTexture = this.f2665f) == null || this.f2667h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f2631a.getHeight());
        final Surface surface = new Surface(this.f2665f);
        final e1 e1Var = this.f2667h;
        final com.google.common.util.concurrent.c<e1.f> a11 = androidx.concurrent.futures.b.a(new b.c() { // from class: androidx.camera.view.t
            {
                x.this = this;
            }

            @Override // androidx.concurrent.futures.b.c
            public final Object a(b.a aVar) {
                return x.m(x.this, surface, aVar);
            }
        });
        this.f2666g = a11;
        a11.a(new Runnable() { // from class: androidx.camera.view.u
            @Override // java.lang.Runnable
            public final void run() {
                x.l(x.this, surface, a11, e1Var);
            }
        }, androidx.core.content.b.getMainExecutor(this.f2664e.getContext()));
        f();
    }
}