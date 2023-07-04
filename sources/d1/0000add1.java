package qe;

import android.graphics.Bitmap;
import android.util.SparseArray;
import md.k;
import nf.i;

/* loaded from: classes3.dex */
public class b implements pe.b {

    /* renamed from: e  reason: collision with root package name */
    private static final Class<?> f48065e = b.class;

    /* renamed from: a  reason: collision with root package name */
    private final df.c f48066a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f48067b;

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<qd.a<nf.c>> f48068c = new SparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    private qd.a<nf.c> f48069d;

    public b(df.c cVar, boolean z11) {
        this.f48066a = cVar;
        this.f48067b = z11;
    }

    static qd.a<Bitmap> g(qd.a<nf.c> aVar) {
        nf.d dVar;
        try {
            if (qd.a.n0(aVar) && (aVar.J() instanceof nf.d) && (dVar = (nf.d) aVar.J()) != null) {
                return dVar.C();
            }
            return null;
        } finally {
            qd.a.C(aVar);
        }
    }

    private static qd.a<nf.c> h(qd.a<Bitmap> aVar) {
        return qd.a.p0(new nf.d(aVar, i.f41655d, 0));
    }

    private synchronized void i(int i11) {
        qd.a<nf.c> aVar = this.f48068c.get(i11);
        if (aVar != null) {
            this.f48068c.delete(i11);
            qd.a.C(aVar);
            nd.a.x(f48065e, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i11), this.f48068c);
        }
    }

    @Override // pe.b
    public synchronized qd.a<Bitmap> a(int i11) {
        return g(qd.a.m(this.f48069d));
    }

    @Override // pe.b
    public synchronized qd.a<Bitmap> b(int i11, int i12, int i13) {
        if (this.f48067b) {
            return g(this.f48066a.d());
        }
        return null;
    }

    @Override // pe.b
    public synchronized boolean c(int i11) {
        return this.f48066a.b(i11);
    }

    @Override // pe.b
    public synchronized void clear() {
        qd.a.C(this.f48069d);
        this.f48069d = null;
        for (int i11 = 0; i11 < this.f48068c.size(); i11++) {
            qd.a.C(this.f48068c.valueAt(i11));
        }
        this.f48068c.clear();
    }

    @Override // pe.b
    public synchronized qd.a<Bitmap> d(int i11) {
        return g(this.f48066a.c(i11));
    }

    @Override // pe.b
    public synchronized void e(int i11, qd.a<Bitmap> aVar, int i12) {
        k.g(aVar);
        i(i11);
        qd.a<nf.c> h11 = h(aVar);
        if (h11 != null) {
            qd.a.C(this.f48069d);
            this.f48069d = this.f48066a.a(i11, h11);
        }
        qd.a.C(h11);
    }

    @Override // pe.b
    public synchronized void f(int i11, qd.a<Bitmap> aVar, int i12) {
        k.g(aVar);
        qd.a<nf.c> h11 = h(aVar);
        if (h11 == null) {
            qd.a.C(h11);
            return;
        }
        qd.a<nf.c> a11 = this.f48066a.a(i11, h11);
        if (qd.a.n0(a11)) {
            qd.a.C(this.f48068c.get(i11));
            this.f48068c.put(i11, a11);
            nd.a.x(f48065e, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(i11), this.f48068c);
        }
        qd.a.C(h11);
    }
}