package hf;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: h  reason: collision with root package name */
    private static final Class<?> f29145h = e.class;

    /* renamed from: a  reason: collision with root package name */
    private final hd.i f29146a;

    /* renamed from: b  reason: collision with root package name */
    private final pd.g f29147b;

    /* renamed from: c  reason: collision with root package name */
    private final pd.j f29148c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f29149d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f29150e;

    /* renamed from: f  reason: collision with root package name */
    private final x f29151f = x.d();

    /* renamed from: g  reason: collision with root package name */
    private final o f29152g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Callable<nf.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f29153a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f29154b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ gd.d f29155c;

        a(Object obj, AtomicBoolean atomicBoolean, gd.d dVar) {
            this.f29153a = obj;
            this.f29154b = atomicBoolean;
            this.f29155c = dVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public nf.e call() {
            Object e11 = of.a.e(this.f29153a, null);
            try {
                if (!this.f29154b.get()) {
                    nf.e c11 = e.this.f29151f.c(this.f29155c);
                    if (c11 != null) {
                        nd.a.w(e.f29145h, "Found image for %s in staging area", this.f29155c.a());
                        e.this.f29152g.g(this.f29155c);
                    } else {
                        nd.a.w(e.f29145h, "Did not find image for %s in staging area", this.f29155c.a());
                        e.this.f29152g.l(this.f29155c);
                        try {
                            PooledByteBuffer q11 = e.this.q(this.f29155c);
                            if (q11 == null) {
                                return null;
                            }
                            qd.a p02 = qd.a.p0(q11);
                            try {
                                c11 = new nf.e(p02);
                            } finally {
                                qd.a.C(p02);
                            }
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                    if (Thread.interrupted()) {
                        nd.a.v(e.f29145h, "Host thread was interrupted, decreasing reference count");
                        c11.close();
                        throw new InterruptedException();
                    }
                    return c11;
                }
                throw new CancellationException();
            } catch (Throwable th2) {
                try {
                    of.a.c(this.f29153a, th2);
                    throw th2;
                } finally {
                    of.a.f(e11);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f29157a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ gd.d f29158b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ nf.e f29159c;

        b(Object obj, gd.d dVar, nf.e eVar) {
            this.f29157a = obj;
            this.f29158b = dVar;
            this.f29159c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object e11 = of.a.e(this.f29157a, null);
            try {
                e.this.s(this.f29158b, this.f29159c);
            } finally {
            }
        }
    }

    /* loaded from: classes3.dex */
    class c implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f29161a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ gd.d f29162b;

        c(Object obj, gd.d dVar) {
            this.f29161a = obj;
            this.f29162b = dVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            Object e11 = of.a.e(this.f29161a, null);
            try {
                e.this.f29151f.g(this.f29162b);
                e.this.f29146a.g(this.f29162b);
                return null;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f29164a;

        d(Object obj) {
            this.f29164a = obj;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            Object e11 = of.a.e(this.f29164a, null);
            try {
                e.this.f29151f.a();
                e.this.f29146a.a();
                return null;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hf.e$e  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0563e implements gd.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nf.e f29166a;

        C0563e(nf.e eVar) {
            this.f29166a = eVar;
        }

        @Override // gd.j
        public void write(OutputStream outputStream) {
            InputStream R = this.f29166a.R();
            md.k.g(R);
            e.this.f29148c.a(R, outputStream);
        }
    }

    public e(hd.i iVar, pd.g gVar, pd.j jVar, Executor executor, Executor executor2, o oVar) {
        this.f29146a = iVar;
        this.f29147b = gVar;
        this.f29148c = jVar;
        this.f29149d = executor;
        this.f29150e = executor2;
        this.f29152g = oVar;
    }

    private boolean i(gd.d dVar) {
        nf.e c11 = this.f29151f.c(dVar);
        if (c11 != null) {
            c11.close();
            nd.a.w(f29145h, "Found image for %s in staging area", dVar.a());
            this.f29152g.g(dVar);
            return true;
        }
        nd.a.w(f29145h, "Did not find image for %s in staging area", dVar.a());
        this.f29152g.l(dVar);
        try {
            return this.f29146a.f(dVar);
        } catch (Exception unused) {
            return false;
        }
    }

    private n5.e<nf.e> m(gd.d dVar, nf.e eVar) {
        nd.a.w(f29145h, "Found image for %s in staging area", dVar.a());
        this.f29152g.g(dVar);
        return n5.e.h(eVar);
    }

    private n5.e<nf.e> o(gd.d dVar, AtomicBoolean atomicBoolean) {
        try {
            return n5.e.b(new a(of.a.d("BufferedDiskCache_getAsync"), atomicBoolean, dVar), this.f29149d);
        } catch (Exception e11) {
            nd.a.F(f29145h, e11, "Failed to schedule disk-cache read for %s", dVar.a());
            return n5.e.g(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PooledByteBuffer q(gd.d dVar) {
        try {
            Class<?> cls = f29145h;
            nd.a.w(cls, "Disk cache read for %s", dVar.a());
            fd.a d11 = this.f29146a.d(dVar);
            if (d11 == null) {
                nd.a.w(cls, "Disk cache miss for %s", dVar.a());
                this.f29152g.d(dVar);
                return null;
            }
            nd.a.w(cls, "Found entry in disk cache for %s", dVar.a());
            this.f29152g.m(dVar);
            InputStream a11 = d11.a();
            PooledByteBuffer b11 = this.f29147b.b(a11, (int) d11.size());
            a11.close();
            nd.a.w(cls, "Successful read from disk cache for %s", dVar.a());
            return b11;
        } catch (IOException e11) {
            nd.a.F(f29145h, e11, "Exception reading from cache for %s", dVar.a());
            this.f29152g.c(dVar);
            throw e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(gd.d dVar, nf.e eVar) {
        Class<?> cls = f29145h;
        nd.a.w(cls, "About to write to disk-cache for key %s", dVar.a());
        try {
            this.f29146a.c(dVar, new C0563e(eVar));
            this.f29152g.h(dVar);
            nd.a.w(cls, "Successful disk-cache write for key %s", dVar.a());
        } catch (IOException e11) {
            nd.a.F(f29145h, e11, "Failed to write to disk-cache for key %s", dVar.a());
        }
    }

    public void h(gd.d dVar) {
        md.k.g(dVar);
        this.f29146a.b(dVar);
    }

    public n5.e<Void> j() {
        this.f29151f.a();
        try {
            return n5.e.b(new d(of.a.d("BufferedDiskCache_clearAll")), this.f29150e);
        } catch (Exception e11) {
            nd.a.F(f29145h, e11, "Failed to schedule disk-cache clear", new Object[0]);
            return n5.e.g(e11);
        }
    }

    public boolean k(gd.d dVar) {
        return this.f29151f.b(dVar) || this.f29146a.e(dVar);
    }

    public boolean l(gd.d dVar) {
        if (k(dVar)) {
            return true;
        }
        return i(dVar);
    }

    public n5.e<nf.e> n(gd.d dVar, AtomicBoolean atomicBoolean) {
        try {
            if (tf.b.d()) {
                tf.b.a("BufferedDiskCache#get");
            }
            nf.e c11 = this.f29151f.c(dVar);
            if (c11 != null) {
                return m(dVar, c11);
            }
            n5.e<nf.e> o11 = o(dVar, atomicBoolean);
            if (tf.b.d()) {
                tf.b.b();
            }
            return o11;
        } finally {
            if (tf.b.d()) {
                tf.b.b();
            }
        }
    }

    public void p(gd.d dVar, nf.e eVar) {
        try {
            if (tf.b.d()) {
                tf.b.a("BufferedDiskCache#put");
            }
            md.k.g(dVar);
            md.k.b(Boolean.valueOf(nf.e.G0(eVar)));
            this.f29151f.f(dVar, eVar);
            nf.e g11 = nf.e.g(eVar);
            try {
                this.f29150e.execute(new b(of.a.d("BufferedDiskCache_putAsync"), dVar, g11));
            } catch (Exception e11) {
                nd.a.F(f29145h, e11, "Failed to schedule disk-cache write for %s", dVar.a());
                this.f29151f.h(dVar, eVar);
                nf.e.j(g11);
            }
        } finally {
            if (tf.b.d()) {
                tf.b.b();
            }
        }
    }

    public n5.e<Void> r(gd.d dVar) {
        md.k.g(dVar);
        this.f29151f.g(dVar);
        try {
            return n5.e.b(new c(of.a.d("BufferedDiskCache_remove"), dVar), this.f29150e);
        } catch (Exception e11) {
            nd.a.F(f29145h, e11, "Failed to schedule disk-cache remove for %s", dVar.a());
            return n5.e.g(e11);
        }
    }
}