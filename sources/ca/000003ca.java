package androidx.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.impl.r0;
import androidx.camera.core.m;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class q0 implements androidx.camera.core.impl.r0, m.a {

    /* renamed from: a */
    private final Object f2477a;

    /* renamed from: b */
    private androidx.camera.core.impl.e f2478b;

    /* renamed from: c */
    private r0.a f2479c;

    /* renamed from: d */
    private boolean f2480d;

    /* renamed from: e */
    private final androidx.camera.core.impl.r0 f2481e;

    /* renamed from: f */
    r0.a f2482f;

    /* renamed from: g */
    private Executor f2483g;

    /* renamed from: h */
    private final LongSparseArray<z.j0> f2484h;

    /* renamed from: i */
    private final LongSparseArray<g0> f2485i;

    /* renamed from: j */
    private int f2486j;

    /* renamed from: k */
    private final List<g0> f2487k;

    /* renamed from: l */
    private final List<g0> f2488l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends androidx.camera.core.impl.e {
        a() {
            q0.this = r1;
        }

        @Override // androidx.camera.core.impl.e
        public void b(androidx.camera.core.impl.m mVar) {
            super.b(mVar);
            q0.this.r(mVar);
        }
    }

    public q0(int i11, int i12, int i13, int i14) {
        this(i(i11, i12, i13, i14));
    }

    public static /* synthetic */ void g(q0 q0Var, androidx.camera.core.impl.r0 r0Var) {
        q0Var.o(r0Var);
    }

    public static /* synthetic */ void h(q0 q0Var, r0.a aVar) {
        q0Var.n(aVar);
    }

    private static androidx.camera.core.impl.r0 i(int i11, int i12, int i13, int i14) {
        return new d(ImageReader.newInstance(i11, i12, i13, i14));
    }

    private void j(g0 g0Var) {
        synchronized (this.f2477a) {
            int indexOf = this.f2487k.indexOf(g0Var);
            if (indexOf >= 0) {
                this.f2487k.remove(indexOf);
                int i11 = this.f2486j;
                if (indexOf <= i11) {
                    this.f2486j = i11 - 1;
                }
            }
            this.f2488l.remove(g0Var);
        }
    }

    private void k(b1 b1Var) {
        final r0.a aVar;
        Executor executor;
        synchronized (this.f2477a) {
            aVar = null;
            if (this.f2487k.size() < d()) {
                b1Var.a(this);
                this.f2487k.add(b1Var);
                aVar = this.f2482f;
                executor = this.f2483g;
            } else {
                n0.a("TAG", "Maximum image number reached.");
                b1Var.close();
                executor = null;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: androidx.camera.core.p0
                    {
                        q0.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        q0.h(q0.this, aVar);
                    }
                });
            } else {
                aVar.a(this);
            }
        }
    }

    public /* synthetic */ void n(r0.a aVar) {
        aVar.a(this);
    }

    private void p() {
        synchronized (this.f2477a) {
            for (int size = this.f2484h.size() - 1; size >= 0; size--) {
                z.j0 valueAt = this.f2484h.valueAt(size);
                long timestamp = valueAt.getTimestamp();
                g0 g0Var = this.f2485i.get(timestamp);
                if (g0Var != null) {
                    this.f2485i.remove(timestamp);
                    this.f2484h.removeAt(size);
                    k(new b1(g0Var, valueAt));
                }
            }
            q();
        }
    }

    private void q() {
        synchronized (this.f2477a) {
            if (this.f2485i.size() != 0 && this.f2484h.size() != 0) {
                Long valueOf = Long.valueOf(this.f2485i.keyAt(0));
                Long valueOf2 = Long.valueOf(this.f2484h.keyAt(0));
                v3.h.a(valueOf2.equals(valueOf) ? false : true);
                if (valueOf2.longValue() > valueOf.longValue()) {
                    for (int size = this.f2485i.size() - 1; size >= 0; size--) {
                        if (this.f2485i.keyAt(size) < valueOf2.longValue()) {
                            this.f2485i.valueAt(size).close();
                            this.f2485i.removeAt(size);
                        }
                    }
                } else {
                    for (int size2 = this.f2484h.size() - 1; size2 >= 0; size2--) {
                        if (this.f2484h.keyAt(size2) < valueOf.longValue()) {
                            this.f2484h.removeAt(size2);
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.camera.core.m.a
    public void a(g0 g0Var) {
        synchronized (this.f2477a) {
            j(g0Var);
        }
    }

    @Override // androidx.camera.core.impl.r0
    public g0 b() {
        synchronized (this.f2477a) {
            if (this.f2487k.isEmpty()) {
                return null;
            }
            if (this.f2486j < this.f2487k.size()) {
                ArrayList<g0> arrayList = new ArrayList();
                for (int i11 = 0; i11 < this.f2487k.size() - 1; i11++) {
                    if (!this.f2488l.contains(this.f2487k.get(i11))) {
                        arrayList.add(this.f2487k.get(i11));
                    }
                }
                for (g0 g0Var : arrayList) {
                    g0Var.close();
                }
                int size = this.f2487k.size() - 1;
                this.f2486j = size;
                List<g0> list = this.f2487k;
                this.f2486j = size + 1;
                g0 g0Var2 = list.get(size);
                this.f2488l.add(g0Var2);
                return g0Var2;
            }
            throw new IllegalStateException("Maximum image number reached.");
        }
    }

    @Override // androidx.camera.core.impl.r0
    public void c() {
        synchronized (this.f2477a) {
            this.f2482f = null;
            this.f2483g = null;
        }
    }

    @Override // androidx.camera.core.impl.r0
    public void close() {
        synchronized (this.f2477a) {
            if (this.f2480d) {
                return;
            }
            for (g0 g0Var : new ArrayList(this.f2487k)) {
                g0Var.close();
            }
            this.f2487k.clear();
            this.f2481e.close();
            this.f2480d = true;
        }
    }

    @Override // androidx.camera.core.impl.r0
    public int d() {
        int d11;
        synchronized (this.f2477a) {
            d11 = this.f2481e.d();
        }
        return d11;
    }

    @Override // androidx.camera.core.impl.r0
    public void e(r0.a aVar, Executor executor) {
        synchronized (this.f2477a) {
            this.f2482f = (r0.a) v3.h.f(aVar);
            this.f2483g = (Executor) v3.h.f(executor);
            this.f2481e.e(this.f2479c, executor);
        }
    }

    @Override // androidx.camera.core.impl.r0
    public g0 f() {
        synchronized (this.f2477a) {
            if (this.f2487k.isEmpty()) {
                return null;
            }
            if (this.f2486j < this.f2487k.size()) {
                List<g0> list = this.f2487k;
                int i11 = this.f2486j;
                this.f2486j = i11 + 1;
                g0 g0Var = list.get(i11);
                this.f2488l.add(g0Var);
                return g0Var;
            }
            throw new IllegalStateException("Maximum image number reached.");
        }
    }

    @Override // androidx.camera.core.impl.r0
    public int getHeight() {
        int height;
        synchronized (this.f2477a) {
            height = this.f2481e.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.r0
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f2477a) {
            surface = this.f2481e.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.r0
    public int getWidth() {
        int width;
        synchronized (this.f2477a) {
            width = this.f2481e.getWidth();
        }
        return width;
    }

    public androidx.camera.core.impl.e l() {
        return this.f2478b;
    }

    /* renamed from: m */
    public void o(androidx.camera.core.impl.r0 r0Var) {
        synchronized (this.f2477a) {
            if (this.f2480d) {
                return;
            }
            int i11 = 0;
            do {
                g0 g0Var = null;
                try {
                    g0Var = r0Var.f();
                    if (g0Var != null) {
                        i11++;
                        this.f2485i.put(g0Var.l1().getTimestamp(), g0Var);
                        p();
                    }
                } catch (IllegalStateException e11) {
                    n0.b("MetadataImageReader", "Failed to acquire next image.", e11);
                }
                if (g0Var == null) {
                    break;
                }
            } while (i11 < r0Var.d());
        }
    }

    void r(androidx.camera.core.impl.m mVar) {
        synchronized (this.f2477a) {
            if (this.f2480d) {
                return;
            }
            this.f2484h.put(mVar.getTimestamp(), new d0.b(mVar));
            p();
        }
    }

    q0(androidx.camera.core.impl.r0 r0Var) {
        this.f2477a = new Object();
        this.f2478b = new a();
        this.f2479c = new r0.a() { // from class: androidx.camera.core.o0
            {
                q0.this = this;
            }

            @Override // androidx.camera.core.impl.r0.a
            public final void a(androidx.camera.core.impl.r0 r0Var2) {
                q0.g(q0.this, r0Var2);
            }
        };
        this.f2480d = false;
        this.f2484h = new LongSparseArray<>();
        this.f2485i = new LongSparseArray<>();
        this.f2488l = new ArrayList();
        this.f2481e = r0Var;
        this.f2486j = 0;
        this.f2487k = new ArrayList(d());
    }
}