package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.impl.r0;
import androidx.camera.core.m;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class a1 implements androidx.camera.core.impl.r0 {

    /* renamed from: d */
    private final androidx.camera.core.impl.r0 f2091d;

    /* renamed from: e */
    private final Surface f2092e;

    /* renamed from: a */
    private final Object f2088a = new Object();

    /* renamed from: b */
    private volatile int f2089b = 0;

    /* renamed from: c */
    private volatile boolean f2090c = false;

    /* renamed from: f */
    private m.a f2093f = new m.a() { // from class: androidx.camera.core.y0
        @Override // androidx.camera.core.m.a
        public final void a(g0 g0Var) {
            a1.g(a1.this, g0Var);
        }
    };

    public a1(androidx.camera.core.impl.r0 r0Var) {
        this.f2091d = r0Var;
        this.f2092e = r0Var.getSurface();
    }

    public static /* synthetic */ void a(a1 a1Var, r0.a aVar, androidx.camera.core.impl.r0 r0Var) {
        a1Var.i(aVar, r0Var);
    }

    public static /* synthetic */ void g(a1 a1Var, g0 g0Var) {
        a1Var.h(g0Var);
    }

    public /* synthetic */ void h(g0 g0Var) {
        synchronized (this.f2088a) {
            this.f2089b--;
            if (this.f2090c && this.f2089b == 0) {
                close();
            }
        }
    }

    public /* synthetic */ void i(r0.a aVar, androidx.camera.core.impl.r0 r0Var) {
        aVar.a(this);
    }

    private g0 k(g0 g0Var) {
        synchronized (this.f2088a) {
            if (g0Var != null) {
                this.f2089b++;
                d1 d1Var = new d1(g0Var);
                d1Var.a(this.f2093f);
                return d1Var;
            }
            return null;
        }
    }

    @Override // androidx.camera.core.impl.r0
    public g0 b() {
        g0 k11;
        synchronized (this.f2088a) {
            k11 = k(this.f2091d.b());
        }
        return k11;
    }

    @Override // androidx.camera.core.impl.r0
    public void c() {
        synchronized (this.f2088a) {
            this.f2091d.c();
        }
    }

    @Override // androidx.camera.core.impl.r0
    public void close() {
        synchronized (this.f2088a) {
            Surface surface = this.f2092e;
            if (surface != null) {
                surface.release();
            }
            this.f2091d.close();
        }
    }

    @Override // androidx.camera.core.impl.r0
    public int d() {
        int d11;
        synchronized (this.f2088a) {
            d11 = this.f2091d.d();
        }
        return d11;
    }

    @Override // androidx.camera.core.impl.r0
    public void e(final r0.a aVar, Executor executor) {
        synchronized (this.f2088a) {
            this.f2091d.e(new r0.a() { // from class: androidx.camera.core.z0
                @Override // androidx.camera.core.impl.r0.a
                public final void a(androidx.camera.core.impl.r0 r0Var) {
                    a1.a(a1.this, aVar, r0Var);
                }
            }, executor);
        }
    }

    @Override // androidx.camera.core.impl.r0
    public g0 f() {
        g0 k11;
        synchronized (this.f2088a) {
            k11 = k(this.f2091d.f());
        }
        return k11;
    }

    @Override // androidx.camera.core.impl.r0
    public int getHeight() {
        int height;
        synchronized (this.f2088a) {
            height = this.f2091d.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.r0
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f2088a) {
            surface = this.f2091d.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.r0
    public int getWidth() {
        int width;
        synchronized (this.f2088a) {
            width = this.f2091d.getWidth();
        }
        return width;
    }

    public void j() {
        synchronized (this.f2088a) {
            this.f2090c = true;
            this.f2091d.c();
            if (this.f2089b == 0) {
                close();
            }
        }
    }
}