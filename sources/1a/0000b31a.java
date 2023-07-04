package sy;

/* loaded from: classes5.dex */
public final class m<T> extends sy.a<T, T> {

    /* loaded from: classes5.dex */
    static final class a<T> implements hy.k<T>, iy.b {

        /* renamed from: a  reason: collision with root package name */
        final hy.k<? super T> f50822a;

        /* renamed from: b  reason: collision with root package name */
        iy.b f50823b;

        a(hy.k<? super T> kVar) {
            this.f50822a = kVar;
        }

        @Override // hy.k
        public void a(iy.b bVar) {
            this.f50823b = bVar;
            this.f50822a.a(this);
        }

        @Override // hy.k
        public void b(T t11) {
        }

        @Override // iy.b
        public void dispose() {
            this.f50823b.dispose();
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f50823b.isDisposed();
        }

        @Override // hy.k
        public void onComplete() {
            this.f50822a.onComplete();
        }

        @Override // hy.k
        public void onError(Throwable th2) {
            this.f50822a.onError(th2);
        }
    }

    public m(hy.j<T> jVar) {
        super(jVar);
    }

    @Override // hy.i
    public void L(hy.k<? super T> kVar) {
        this.f50705a.c(new a(kVar));
    }
}