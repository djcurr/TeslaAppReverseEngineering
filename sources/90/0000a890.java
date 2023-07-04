package oy;

/* loaded from: classes5.dex */
public final class i<T> implements hy.k<T>, iy.b {

    /* renamed from: a  reason: collision with root package name */
    final hy.k<? super T> f45218a;

    /* renamed from: b  reason: collision with root package name */
    final ky.f<? super iy.b> f45219b;

    /* renamed from: c  reason: collision with root package name */
    final ky.a f45220c;

    /* renamed from: d  reason: collision with root package name */
    iy.b f45221d;

    public i(hy.k<? super T> kVar, ky.f<? super iy.b> fVar, ky.a aVar) {
        this.f45218a = kVar;
        this.f45219b = fVar;
        this.f45220c = aVar;
    }

    @Override // hy.k
    public void a(iy.b bVar) {
        try {
            this.f45219b.accept(bVar);
            if (ly.a.validate(this.f45221d, bVar)) {
                this.f45221d = bVar;
                this.f45218a.a(this);
            }
        } catch (Throwable th2) {
            jy.a.b(th2);
            bVar.dispose();
            this.f45221d = ly.a.DISPOSED;
            ly.b.error(th2, this.f45218a);
        }
    }

    @Override // hy.k
    public void b(T t11) {
        this.f45218a.b(t11);
    }

    @Override // iy.b
    public void dispose() {
        iy.b bVar = this.f45221d;
        ly.a aVar = ly.a.DISPOSED;
        if (bVar != aVar) {
            this.f45221d = aVar;
            try {
                this.f45220c.run();
            } catch (Throwable th2) {
                jy.a.b(th2);
                az.a.r(th2);
            }
            bVar.dispose();
        }
    }

    @Override // iy.b
    public boolean isDisposed() {
        return this.f45221d.isDisposed();
    }

    @Override // hy.k
    public void onComplete() {
        iy.b bVar = this.f45221d;
        ly.a aVar = ly.a.DISPOSED;
        if (bVar != aVar) {
            this.f45221d = aVar;
            this.f45218a.onComplete();
        }
    }

    @Override // hy.k
    public void onError(Throwable th2) {
        iy.b bVar = this.f45221d;
        ly.a aVar = ly.a.DISPOSED;
        if (bVar != aVar) {
            this.f45221d = aVar;
            this.f45218a.onError(th2);
            return;
        }
        az.a.r(th2);
    }
}