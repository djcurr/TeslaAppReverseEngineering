package sy;

/* loaded from: classes5.dex */
public final class n<T> extends hy.b implements ny.b<T> {

    /* renamed from: a  reason: collision with root package name */
    final hy.j<T> f50824a;

    /* loaded from: classes5.dex */
    static final class a<T> implements hy.k<T>, iy.b {

        /* renamed from: a  reason: collision with root package name */
        final hy.c f50825a;

        /* renamed from: b  reason: collision with root package name */
        iy.b f50826b;

        a(hy.c cVar) {
            this.f50825a = cVar;
        }

        @Override // hy.k
        public void a(iy.b bVar) {
            this.f50826b = bVar;
            this.f50825a.a(this);
        }

        @Override // hy.k
        public void b(T t11) {
        }

        @Override // iy.b
        public void dispose() {
            this.f50826b.dispose();
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f50826b.isDisposed();
        }

        @Override // hy.k
        public void onComplete() {
            this.f50825a.onComplete();
        }

        @Override // hy.k
        public void onError(Throwable th2) {
            this.f50825a.onError(th2);
        }
    }

    public n(hy.j<T> jVar) {
        this.f50824a = jVar;
    }

    @Override // ny.b
    public hy.i<T> a() {
        return az.a.n(new m(this.f50824a));
    }

    @Override // hy.b
    public void h(hy.c cVar) {
        this.f50824a.c(new a(cVar));
    }
}