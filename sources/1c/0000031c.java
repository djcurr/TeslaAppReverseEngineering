package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.e1;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.concurrent.futures.b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a */
    private final Size f2199a;

    /* renamed from: b */
    private final boolean f2200b;

    /* renamed from: c */
    private final androidx.camera.core.impl.s f2201c;

    /* renamed from: d */
    final com.google.common.util.concurrent.c<Surface> f2202d;

    /* renamed from: e */
    private final b.a<Surface> f2203e;

    /* renamed from: f */
    private final com.google.common.util.concurrent.c<Void> f2204f;

    /* renamed from: g */
    private final b.a<Void> f2205g;

    /* renamed from: h */
    private final DeferrableSurface f2206h;

    /* renamed from: i */
    private g f2207i;

    /* renamed from: j */
    private h f2208j;

    /* renamed from: k */
    private Executor f2209k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements c0.c<Void> {

        /* renamed from: a */
        final /* synthetic */ b.a f2210a;

        /* renamed from: b */
        final /* synthetic */ com.google.common.util.concurrent.c f2211b;

        a(e1 e1Var, b.a aVar, com.google.common.util.concurrent.c cVar) {
            this.f2210a = aVar;
            this.f2211b = cVar;
        }

        @Override // c0.c
        /* renamed from: a */
        public void onSuccess(Void r22) {
            v3.h.h(this.f2210a.c(null));
        }

        @Override // c0.c
        public void onFailure(Throwable th2) {
            if (th2 instanceof e) {
                v3.h.h(this.f2211b.cancel(false));
            } else {
                v3.h.h(this.f2210a.c(null));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends DeferrableSurface {
        b() {
            e1.this = r1;
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        protected com.google.common.util.concurrent.c<Surface> k() {
            return e1.this.f2202d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements c0.c<Surface> {

        /* renamed from: a */
        final /* synthetic */ com.google.common.util.concurrent.c f2213a;

        /* renamed from: b */
        final /* synthetic */ b.a f2214b;

        /* renamed from: c */
        final /* synthetic */ String f2215c;

        c(e1 e1Var, com.google.common.util.concurrent.c cVar, b.a aVar, String str) {
            this.f2213a = cVar;
            this.f2214b = aVar;
            this.f2215c = str;
        }

        @Override // c0.c
        /* renamed from: a */
        public void onSuccess(Surface surface) {
            c0.f.k(this.f2213a, this.f2214b);
        }

        @Override // c0.c
        public void onFailure(Throwable th2) {
            if (th2 instanceof CancellationException) {
                b.a aVar = this.f2214b;
                v3.h.h(aVar.f(new e(this.f2215c + " cancelled.", th2)));
                return;
            }
            this.f2214b.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements c0.c<Void> {

        /* renamed from: a */
        final /* synthetic */ v3.a f2216a;

        /* renamed from: b */
        final /* synthetic */ Surface f2217b;

        d(e1 e1Var, v3.a aVar, Surface surface) {
            this.f2216a = aVar;
            this.f2217b = surface;
        }

        @Override // c0.c
        /* renamed from: a */
        public void onSuccess(Void r32) {
            this.f2216a.accept(f.c(0, this.f2217b));
        }

        @Override // c0.c
        public void onFailure(Throwable th2) {
            v3.h.i(th2 instanceof e, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2);
            this.f2216a.accept(f.c(1, this.f2217b));
        }
    }

    /* loaded from: classes.dex */
    private static final class e extends RuntimeException {
        e(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        static f c(int i11, Surface surface) {
            return new androidx.camera.core.f(i11, surface);
        }

        public abstract int a();

        public abstract Surface b();
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        public static g d(Rect rect, int i11, int i12) {
            return new androidx.camera.core.g(rect, i11, i12);
        }

        public abstract Rect a();

        public abstract int b();

        public abstract int c();
    }

    /* loaded from: classes.dex */
    public interface h {
        void a(g gVar);
    }

    public e1(Size size, androidx.camera.core.impl.s sVar, boolean z11) {
        this.f2199a = size;
        this.f2201c = sVar;
        this.f2200b = z11;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        com.google.common.util.concurrent.c a11 = androidx.concurrent.futures.b.a(new b.c() { // from class: z.s0
            @Override // androidx.concurrent.futures.b.c
            public final Object a(b.a aVar) {
                return e1.g(atomicReference, str, aVar);
            }
        });
        b.a<Void> aVar = (b.a) v3.h.f((b.a) atomicReference.get());
        this.f2205g = aVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        com.google.common.util.concurrent.c<Void> a12 = androidx.concurrent.futures.b.a(new b.c() { // from class: z.t0
            @Override // androidx.concurrent.futures.b.c
            public final Object a(b.a aVar2) {
                return e1.h(atomicReference2, str, aVar2);
            }
        });
        this.f2204f = a12;
        c0.f.b(a12, new a(this, aVar, a11), b0.a.a());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        com.google.common.util.concurrent.c<Surface> a13 = androidx.concurrent.futures.b.a(new b.c() { // from class: z.r0
            @Override // androidx.concurrent.futures.b.c
            public final Object a(b.a aVar2) {
                return e1.f(atomicReference3, str, aVar2);
            }
        });
        this.f2202d = a13;
        this.f2203e = (b.a) v3.h.f((b.a) atomicReference3.get());
        b bVar = new b();
        this.f2206h = bVar;
        com.google.common.util.concurrent.c<Void> f11 = bVar.f();
        c0.f.b(a13, new c(this, f11, (b.a) v3.h.f((b.a) atomicReference2.get()), str), b0.a.a());
        f11.a(new Runnable() { // from class: z.w0
            {
                e1.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e1.e(e1.this);
            }
        }, b0.a.a());
    }

    public static /* synthetic */ void a(v3.a aVar, Surface surface) {
        r(aVar, surface);
    }

    public static /* synthetic */ void b(v3.a aVar, Surface surface) {
        s(aVar, surface);
    }

    public static /* synthetic */ void c(h hVar, g gVar) {
        hVar.a(gVar);
    }

    public static /* synthetic */ void d(h hVar, g gVar) {
        hVar.a(gVar);
    }

    public static /* synthetic */ void e(e1 e1Var) {
        e1Var.q();
    }

    public static /* synthetic */ Object f(AtomicReference atomicReference, String str, b.a aVar) {
        return p(atomicReference, str, aVar);
    }

    public static /* synthetic */ Object g(AtomicReference atomicReference, String str, b.a aVar) {
        return n(atomicReference, str, aVar);
    }

    public static /* synthetic */ Object h(AtomicReference atomicReference, String str, b.a aVar) {
        return o(atomicReference, str, aVar);
    }

    public static /* synthetic */ Object n(AtomicReference atomicReference, String str, b.a aVar) {
        atomicReference.set(aVar);
        return str + "-cancellation";
    }

    public static /* synthetic */ Object o(AtomicReference atomicReference, String str, b.a aVar) {
        atomicReference.set(aVar);
        return str + "-status";
    }

    public static /* synthetic */ Object p(AtomicReference atomicReference, String str, b.a aVar) {
        atomicReference.set(aVar);
        return str + "-Surface";
    }

    public /* synthetic */ void q() {
        this.f2202d.cancel(true);
    }

    public static /* synthetic */ void r(v3.a aVar, Surface surface) {
        aVar.accept(f.c(3, surface));
    }

    public static /* synthetic */ void s(v3.a aVar, Surface surface) {
        aVar.accept(f.c(4, surface));
    }

    public void i(Executor executor, Runnable runnable) {
        this.f2205g.a(runnable, executor);
    }

    public androidx.camera.core.impl.s j() {
        return this.f2201c;
    }

    public DeferrableSurface k() {
        return this.f2206h;
    }

    public Size l() {
        return this.f2199a;
    }

    public boolean m() {
        return this.f2200b;
    }

    public void v(final Surface surface, Executor executor, final v3.a<f> aVar) {
        if (!this.f2203e.c(surface) && !this.f2202d.isCancelled()) {
            v3.h.h(this.f2202d.isDone());
            try {
                this.f2202d.get();
                executor.execute(new Runnable() { // from class: z.x0
                    @Override // java.lang.Runnable
                    public final void run() {
                        e1.a(aVar, surface);
                    }
                });
                return;
            } catch (InterruptedException | ExecutionException unused) {
                executor.execute(new Runnable() { // from class: z.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        e1.b(aVar, surface);
                    }
                });
                return;
            }
        }
        c0.f.b(this.f2204f, new d(this, aVar, surface), executor);
    }

    public void w(Executor executor, final h hVar) {
        this.f2208j = hVar;
        this.f2209k = executor;
        final g gVar = this.f2207i;
        if (gVar != null) {
            executor.execute(new Runnable() { // from class: z.u0
                @Override // java.lang.Runnable
                public final void run() {
                    e1.c(hVar, gVar);
                }
            });
        }
    }

    public void x(final g gVar) {
        this.f2207i = gVar;
        final h hVar = this.f2208j;
        if (hVar != null) {
            this.f2209k.execute(new Runnable() { // from class: z.v0
                @Override // java.lang.Runnable
                public final void run() {
                    e1.d(hVar, gVar);
                }
            });
        }
    }

    public boolean y() {
        return this.f2203e.f(new DeferrableSurface.SurfaceUnavailableException("Surface request will not complete."));
    }
}