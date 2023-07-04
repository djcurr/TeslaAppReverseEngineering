package androidx.camera.core;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.r0;
import androidx.camera.core.t0;
import androidx.concurrent.futures.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class t0 implements androidx.camera.core.impl.r0 {

    /* renamed from: a */
    final Object f2515a;

    /* renamed from: b */
    private r0.a f2516b;

    /* renamed from: c */
    private r0.a f2517c;

    /* renamed from: d */
    private c0.c<List<g0>> f2518d;

    /* renamed from: e */
    boolean f2519e;

    /* renamed from: f */
    boolean f2520f;

    /* renamed from: g */
    final q0 f2521g;

    /* renamed from: h */
    final androidx.camera.core.impl.r0 f2522h;

    /* renamed from: i */
    r0.a f2523i;

    /* renamed from: j */
    Executor f2524j;

    /* renamed from: k */
    b.a<Void> f2525k;

    /* renamed from: l */
    private com.google.common.util.concurrent.c<Void> f2526l;

    /* renamed from: m */
    final Executor f2527m;

    /* renamed from: n */
    final androidx.camera.core.impl.b0 f2528n;

    /* renamed from: o */
    private String f2529o;

    /* renamed from: p */
    c1 f2530p;

    /* renamed from: q */
    private final List<Integer> f2531q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements r0.a {
        a() {
            t0.this = r1;
        }

        @Override // androidx.camera.core.impl.r0.a
        public void a(androidx.camera.core.impl.r0 r0Var) {
            t0.this.j(r0Var);
        }
    }

    /* loaded from: classes.dex */
    public class b implements r0.a {
        b() {
            t0.this = r1;
        }

        public static /* synthetic */ void b(b bVar, r0.a aVar) {
            bVar.c(aVar);
        }

        public /* synthetic */ void c(r0.a aVar) {
            aVar.a(t0.this);
        }

        @Override // androidx.camera.core.impl.r0.a
        public void a(androidx.camera.core.impl.r0 r0Var) {
            final r0.a aVar;
            Executor executor;
            synchronized (t0.this.f2515a) {
                t0 t0Var = t0.this;
                aVar = t0Var.f2523i;
                executor = t0Var.f2524j;
                t0Var.f2530p.e();
                t0.this.m();
            }
            if (aVar != null) {
                if (executor != null) {
                    executor.execute(new Runnable() { // from class: androidx.camera.core.u0
                        {
                            t0.b.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            t0.b.b(t0.b.this, aVar);
                        }
                    });
                } else {
                    aVar.a(t0.this);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements c0.c<List<g0>> {
        c() {
            t0.this = r1;
        }

        @Override // c0.c
        /* renamed from: a */
        public void onSuccess(List<g0> list) {
            synchronized (t0.this.f2515a) {
                t0 t0Var = t0.this;
                if (t0Var.f2519e) {
                    return;
                }
                t0Var.f2520f = true;
                t0Var.f2528n.c(t0Var.f2530p);
                synchronized (t0.this.f2515a) {
                    t0 t0Var2 = t0.this;
                    t0Var2.f2520f = false;
                    if (t0Var2.f2519e) {
                        t0Var2.f2521g.close();
                        t0.this.f2530p.d();
                        t0.this.f2522h.close();
                        b.a<Void> aVar = t0.this.f2525k;
                        if (aVar != null) {
                            aVar.c(null);
                        }
                    }
                }
            }
        }

        @Override // c0.c
        public void onFailure(Throwable th2) {
        }
    }

    public t0(int i11, int i12, int i13, int i14, Executor executor, androidx.camera.core.impl.z zVar, androidx.camera.core.impl.b0 b0Var, int i15) {
        this(new q0(i11, i12, i13, i14), executor, zVar, b0Var, i15);
    }

    public static /* synthetic */ Object a(t0 t0Var, b.a aVar) {
        return t0Var.k(aVar);
    }

    public /* synthetic */ Object k(b.a aVar) {
        synchronized (this.f2515a) {
            this.f2525k = aVar;
        }
        return "ProcessingImageReader-close";
    }

    @Override // androidx.camera.core.impl.r0
    public g0 b() {
        g0 b11;
        synchronized (this.f2515a) {
            b11 = this.f2522h.b();
        }
        return b11;
    }

    @Override // androidx.camera.core.impl.r0
    public void c() {
        synchronized (this.f2515a) {
            this.f2523i = null;
            this.f2524j = null;
            this.f2521g.c();
            this.f2522h.c();
            if (!this.f2520f) {
                this.f2530p.d();
            }
        }
    }

    @Override // androidx.camera.core.impl.r0
    public void close() {
        synchronized (this.f2515a) {
            if (this.f2519e) {
                return;
            }
            this.f2522h.c();
            if (!this.f2520f) {
                this.f2521g.close();
                this.f2530p.d();
                this.f2522h.close();
                b.a<Void> aVar = this.f2525k;
                if (aVar != null) {
                    aVar.c(null);
                }
            }
            this.f2519e = true;
        }
    }

    @Override // androidx.camera.core.impl.r0
    public int d() {
        int d11;
        synchronized (this.f2515a) {
            d11 = this.f2521g.d();
        }
        return d11;
    }

    @Override // androidx.camera.core.impl.r0
    public void e(r0.a aVar, Executor executor) {
        synchronized (this.f2515a) {
            this.f2523i = (r0.a) v3.h.f(aVar);
            this.f2524j = (Executor) v3.h.f(executor);
            this.f2521g.e(this.f2516b, executor);
            this.f2522h.e(this.f2517c, executor);
        }
    }

    @Override // androidx.camera.core.impl.r0
    public g0 f() {
        g0 f11;
        synchronized (this.f2515a) {
            f11 = this.f2522h.f();
        }
        return f11;
    }

    public androidx.camera.core.impl.e g() {
        androidx.camera.core.impl.e l11;
        synchronized (this.f2515a) {
            l11 = this.f2521g.l();
        }
        return l11;
    }

    @Override // androidx.camera.core.impl.r0
    public int getHeight() {
        int height;
        synchronized (this.f2515a) {
            height = this.f2521g.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.r0
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f2515a) {
            surface = this.f2521g.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.r0
    public int getWidth() {
        int width;
        synchronized (this.f2515a) {
            width = this.f2521g.getWidth();
        }
        return width;
    }

    public com.google.common.util.concurrent.c<Void> h() {
        com.google.common.util.concurrent.c<Void> j11;
        synchronized (this.f2515a) {
            if (this.f2519e && !this.f2520f) {
                j11 = c0.f.h(null);
            } else {
                if (this.f2526l == null) {
                    this.f2526l = androidx.concurrent.futures.b.a(new b.c() { // from class: androidx.camera.core.s0
                        {
                            t0.this = this;
                        }

                        @Override // androidx.concurrent.futures.b.c
                        public final Object a(b.a aVar) {
                            return t0.a(t0.this, aVar);
                        }
                    });
                }
                j11 = c0.f.j(this.f2526l);
            }
        }
        return j11;
    }

    public String i() {
        return this.f2529o;
    }

    void j(androidx.camera.core.impl.r0 r0Var) {
        synchronized (this.f2515a) {
            if (this.f2519e) {
                return;
            }
            try {
                g0 f11 = r0Var.f();
                if (f11 != null) {
                    Integer c11 = f11.l1().a().c(this.f2529o);
                    if (!this.f2531q.contains(c11)) {
                        n0.m("ProcessingImageReader", "ImageProxyBundle does not contain this id: " + c11);
                        f11.close();
                    } else {
                        this.f2530p.c(f11);
                    }
                }
            } catch (IllegalStateException e11) {
                n0.d("ProcessingImageReader", "Failed to acquire latest image.", e11);
            }
        }
    }

    public void l(androidx.camera.core.impl.z zVar) {
        synchronized (this.f2515a) {
            if (zVar.a() != null) {
                if (this.f2521g.d() >= zVar.a().size()) {
                    this.f2531q.clear();
                    for (androidx.camera.core.impl.c0 c0Var : zVar.a()) {
                        if (c0Var != null) {
                            this.f2531q.add(Integer.valueOf(c0Var.getId()));
                        }
                    }
                } else {
                    throw new IllegalArgumentException("CaptureBundle is larger than InputImageReader.");
                }
            }
            String num = Integer.toString(zVar.hashCode());
            this.f2529o = num;
            this.f2530p = new c1(this.f2531q, num);
            m();
        }
    }

    void m() {
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.f2531q) {
            arrayList.add(this.f2530p.b(num.intValue()));
        }
        c0.f.b(c0.f.c(arrayList), this.f2518d, this.f2527m);
    }

    t0(q0 q0Var, Executor executor, androidx.camera.core.impl.z zVar, androidx.camera.core.impl.b0 b0Var, int i11) {
        this.f2515a = new Object();
        this.f2516b = new a();
        this.f2517c = new b();
        this.f2518d = new c();
        this.f2519e = false;
        this.f2520f = false;
        this.f2529o = new String();
        this.f2530p = new c1(Collections.emptyList(), this.f2529o);
        this.f2531q = new ArrayList();
        if (q0Var.d() >= zVar.a().size()) {
            this.f2521g = q0Var;
            int width = q0Var.getWidth();
            int height = q0Var.getHeight();
            if (i11 == 256) {
                width = q0Var.getWidth() * q0Var.getHeight();
                height = 1;
            }
            d dVar = new d(ImageReader.newInstance(width, height, i11, q0Var.d()));
            this.f2522h = dVar;
            this.f2527m = executor;
            this.f2528n = b0Var;
            b0Var.a(dVar.getSurface(), i11);
            b0Var.b(new Size(q0Var.getWidth(), q0Var.getHeight()));
            l(zVar);
            return;
        }
        throw new IllegalArgumentException("MetadataImageReader is smaller than CaptureBundle.");
    }
}