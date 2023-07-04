package ty;

/* loaded from: classes5.dex */
public final class q<T> extends hy.e<T> {

    /* renamed from: b  reason: collision with root package name */
    final hy.q<? extends T> f52721b;

    /* loaded from: classes5.dex */
    static final class a<T> extends xy.c<T> implements hy.o<T> {

        /* renamed from: c  reason: collision with root package name */
        iy.b f52722c;

        a(b80.b<? super T> bVar) {
            super(bVar);
        }

        @Override // hy.o
        public void a(iy.b bVar) {
            if (ly.a.validate(this.f52722c, bVar)) {
                this.f52722c = bVar;
                this.f57761a.c(this);
            }
        }

        @Override // xy.c, b80.c
        public void cancel() {
            super.cancel();
            this.f52722c.dispose();
        }

        @Override // hy.o
        public void onError(Throwable th2) {
            this.f57761a.onError(th2);
        }

        @Override // hy.o
        public void onSuccess(T t11) {
            d(t11);
        }
    }

    public q(hy.q<? extends T> qVar) {
        this.f52721b = qVar;
    }

    @Override // hy.e
    public void z(b80.b<? super T> bVar) {
        this.f52721b.a(new a(bVar));
    }
}