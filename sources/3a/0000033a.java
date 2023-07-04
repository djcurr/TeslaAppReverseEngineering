package androidx.camera.core.impl;

import android.util.Log;
import android.view.Surface;
import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class DeferrableSurface {

    /* renamed from: f */
    private static final boolean f2244f = androidx.camera.core.n0.g("DeferrableSurface");

    /* renamed from: g */
    private static final AtomicInteger f2245g = new AtomicInteger(0);

    /* renamed from: h */
    private static final AtomicInteger f2246h = new AtomicInteger(0);

    /* renamed from: a */
    private final Object f2247a = new Object();

    /* renamed from: b */
    private int f2248b = 0;

    /* renamed from: c */
    private boolean f2249c = false;

    /* renamed from: d */
    private b.a<Void> f2250d;

    /* renamed from: e */
    private final com.google.common.util.concurrent.c<Void> f2251e;

    /* loaded from: classes.dex */
    public static final class SurfaceClosedException extends Exception {

        /* renamed from: a */
        DeferrableSurface f2252a;

        public SurfaceClosedException(String str, DeferrableSurface deferrableSurface) {
            super(str);
            this.f2252a = deferrableSurface;
        }

        public DeferrableSurface a() {
            return this.f2252a;
        }
    }

    /* loaded from: classes.dex */
    public static final class SurfaceUnavailableException extends Exception {
        public SurfaceUnavailableException(String str) {
            super(str);
        }
    }

    public DeferrableSurface() {
        com.google.common.util.concurrent.c<Void> a11 = androidx.concurrent.futures.b.a(new b.c() { // from class: androidx.camera.core.impl.e0
            {
                DeferrableSurface.this = this;
            }

            @Override // androidx.concurrent.futures.b.c
            public final Object a(b.a aVar) {
                return DeferrableSurface.b(DeferrableSurface.this, aVar);
            }
        });
        this.f2251e = a11;
        if (androidx.camera.core.n0.g("DeferrableSurface")) {
            j("Surface created", f2246h.incrementAndGet(), f2245g.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            a11.a(new Runnable() { // from class: androidx.camera.core.impl.f0
                {
                    DeferrableSurface.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    DeferrableSurface.a(DeferrableSurface.this, stackTraceString);
                }
            }, b0.a.a());
        }
    }

    public static /* synthetic */ void a(DeferrableSurface deferrableSurface, String str) {
        deferrableSurface.i(str);
    }

    public static /* synthetic */ Object b(DeferrableSurface deferrableSurface, b.a aVar) {
        return deferrableSurface.h(aVar);
    }

    public /* synthetic */ Object h(b.a aVar) {
        synchronized (this.f2247a) {
            this.f2250d = aVar;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    public /* synthetic */ void i(String str) {
        try {
            this.f2251e.get();
            j("Surface terminated", f2246h.decrementAndGet(), f2245g.get());
        } catch (Exception e11) {
            androidx.camera.core.n0.c("DeferrableSurface", "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.f2247a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", this, Boolean.valueOf(this.f2249c), Integer.valueOf(this.f2248b)), e11);
            }
        }
    }

    private void j(String str, int i11, int i12) {
        if (!f2244f && androidx.camera.core.n0.g("DeferrableSurface")) {
            androidx.camera.core.n0.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        androidx.camera.core.n0.a("DeferrableSurface", str + "[total_surfaces=" + i11 + ", used_surfaces=" + i12 + "](" + this + "}");
    }

    public final void c() {
        b.a<Void> aVar;
        synchronized (this.f2247a) {
            if (this.f2249c) {
                aVar = null;
            } else {
                this.f2249c = true;
                if (this.f2248b == 0) {
                    aVar = this.f2250d;
                    this.f2250d = null;
                } else {
                    aVar = null;
                }
                if (androidx.camera.core.n0.g("DeferrableSurface")) {
                    androidx.camera.core.n0.a("DeferrableSurface", "surface closed,  useCount=" + this.f2248b + " closed=true " + this);
                }
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public void d() {
        b.a<Void> aVar;
        synchronized (this.f2247a) {
            int i11 = this.f2248b;
            if (i11 != 0) {
                int i12 = i11 - 1;
                this.f2248b = i12;
                if (i12 == 0 && this.f2249c) {
                    aVar = this.f2250d;
                    this.f2250d = null;
                } else {
                    aVar = null;
                }
                if (androidx.camera.core.n0.g("DeferrableSurface")) {
                    androidx.camera.core.n0.a("DeferrableSurface", "use count-1,  useCount=" + this.f2248b + " closed=" + this.f2249c + " " + this);
                    if (this.f2248b == 0) {
                        j("Surface no longer in use", f2246h.get(), f2245g.decrementAndGet());
                    }
                }
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public final com.google.common.util.concurrent.c<Surface> e() {
        synchronized (this.f2247a) {
            if (this.f2249c) {
                return c0.f.f(new SurfaceClosedException("DeferrableSurface already closed.", this));
            }
            return k();
        }
    }

    public com.google.common.util.concurrent.c<Void> f() {
        return c0.f.j(this.f2251e);
    }

    public void g() {
        synchronized (this.f2247a) {
            int i11 = this.f2248b;
            if (i11 == 0 && this.f2249c) {
                throw new SurfaceClosedException("Cannot begin use on a closed surface.", this);
            }
            this.f2248b = i11 + 1;
            if (androidx.camera.core.n0.g("DeferrableSurface")) {
                if (this.f2248b == 1) {
                    j("New surface in use", f2246h.get(), f2245g.incrementAndGet());
                }
                androidx.camera.core.n0.a("DeferrableSurface", "use count+1, useCount=" + this.f2248b + " " + this);
            }
        }
    }

    protected abstract com.google.common.util.concurrent.c<Surface> k();
}