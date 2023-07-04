package qy;

/* loaded from: classes5.dex */
public final class h<T> extends hy.e<T> {

    /* renamed from: b  reason: collision with root package name */
    private final hy.j<T> f48748b;

    /* loaded from: classes5.dex */
    static final class a<T> implements hy.k<T>, b80.c {

        /* renamed from: a  reason: collision with root package name */
        final b80.b<? super T> f48749a;

        /* renamed from: b  reason: collision with root package name */
        iy.b f48750b;

        a(b80.b<? super T> bVar) {
            this.f48749a = bVar;
        }

        @Override // hy.k
        public void a(iy.b bVar) {
            this.f48750b = bVar;
            this.f48749a.c(this);
        }

        @Override // hy.k
        public void b(T t11) {
            this.f48749a.b(t11);
        }

        @Override // b80.c
        public void cancel() {
            this.f48750b.dispose();
        }

        @Override // hy.k
        public void onComplete() {
            this.f48749a.onComplete();
        }

        @Override // hy.k
        public void onError(Throwable th2) {
            this.f48749a.onError(th2);
        }

        @Override // b80.c
        public void request(long j11) {
        }
    }

    public h(hy.j<T> jVar) {
        this.f48748b = jVar;
    }

    @Override // hy.e
    protected void z(b80.b<? super T> bVar) {
        this.f48748b.c(new a(bVar));
    }
}