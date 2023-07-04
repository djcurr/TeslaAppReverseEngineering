package re;

import android.graphics.Bitmap;
import android.util.SparseArray;
import gf.f;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public class c implements b {

    /* renamed from: f  reason: collision with root package name */
    private static final Class<?> f49355f = c.class;

    /* renamed from: a  reason: collision with root package name */
    private final f f49356a;

    /* renamed from: b  reason: collision with root package name */
    private final pe.c f49357b;

    /* renamed from: c  reason: collision with root package name */
    private final Bitmap.Config f49358c;

    /* renamed from: d  reason: collision with root package name */
    private final ExecutorService f49359d;

    /* renamed from: e  reason: collision with root package name */
    private final SparseArray<Runnable> f49360e = new SparseArray<>();

    /* loaded from: classes3.dex */
    private class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final pe.b f49361a;

        /* renamed from: b  reason: collision with root package name */
        private final oe.a f49362b;

        /* renamed from: c  reason: collision with root package name */
        private final int f49363c;

        /* renamed from: d  reason: collision with root package name */
        private final int f49364d;

        public a(oe.a aVar, pe.b bVar, int i11, int i12) {
            this.f49362b = aVar;
            this.f49361a = bVar;
            this.f49363c = i11;
            this.f49364d = i12;
        }

        private boolean a(int i11, int i12) {
            qd.a<Bitmap> b11;
            int i13 = 2;
            try {
                if (i12 == 1) {
                    b11 = this.f49361a.b(i11, this.f49362b.e(), this.f49362b.c());
                } else if (i12 != 2) {
                    return false;
                } else {
                    b11 = c.this.f49356a.b(this.f49362b.e(), this.f49362b.c(), c.this.f49358c);
                    i13 = -1;
                }
                boolean b12 = b(i11, b11, i12);
                qd.a.C(b11);
                return (b12 || i13 == -1) ? b12 : a(i11, i13);
            } catch (RuntimeException e11) {
                nd.a.D(c.f49355f, "Failed to create frame bitmap", e11);
                return false;
            } finally {
                qd.a.C(null);
            }
        }

        private boolean b(int i11, qd.a<Bitmap> aVar, int i12) {
            if (qd.a.n0(aVar) && c.this.f49357b.a(i11, aVar.J())) {
                nd.a.w(c.f49355f, "Frame %d ready.", Integer.valueOf(this.f49363c));
                synchronized (c.this.f49360e) {
                    this.f49361a.f(this.f49363c, aVar, i12);
                }
                return true;
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f49361a.c(this.f49363c)) {
                    nd.a.w(c.f49355f, "Frame %d is cached already.", Integer.valueOf(this.f49363c));
                    synchronized (c.this.f49360e) {
                        c.this.f49360e.remove(this.f49364d);
                    }
                    return;
                }
                if (a(this.f49363c, 1)) {
                    nd.a.w(c.f49355f, "Prepared frame frame %d.", Integer.valueOf(this.f49363c));
                } else {
                    nd.a.h(c.f49355f, "Could not prepare frame %d.", Integer.valueOf(this.f49363c));
                }
                synchronized (c.this.f49360e) {
                    c.this.f49360e.remove(this.f49364d);
                }
            } catch (Throwable th2) {
                synchronized (c.this.f49360e) {
                    c.this.f49360e.remove(this.f49364d);
                    throw th2;
                }
            }
        }
    }

    public c(f fVar, pe.c cVar, Bitmap.Config config, ExecutorService executorService) {
        this.f49356a = fVar;
        this.f49357b = cVar;
        this.f49358c = config;
        this.f49359d = executorService;
    }

    private static int g(oe.a aVar, int i11) {
        return (aVar.hashCode() * 31) + i11;
    }

    @Override // re.b
    public boolean a(pe.b bVar, oe.a aVar, int i11) {
        int g11 = g(aVar, i11);
        synchronized (this.f49360e) {
            if (this.f49360e.get(g11) != null) {
                nd.a.w(f49355f, "Already scheduled decode job for frame %d", Integer.valueOf(i11));
                return true;
            } else if (bVar.c(i11)) {
                nd.a.w(f49355f, "Frame %d is cached already.", Integer.valueOf(i11));
                return true;
            } else {
                a aVar2 = new a(aVar, bVar, i11, g11);
                this.f49360e.put(g11, aVar2);
                this.f49359d.execute(aVar2);
                return true;
            }
        }
    }
}