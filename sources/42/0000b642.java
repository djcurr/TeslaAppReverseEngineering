package ty;

/* loaded from: classes5.dex */
public final class d<T> extends hy.m<T> {

    /* renamed from: a  reason: collision with root package name */
    final hy.q<T> f52668a;

    /* renamed from: b  reason: collision with root package name */
    final ky.f<? super T> f52669b;

    /* loaded from: classes5.dex */
    final class a implements hy.o<T> {

        /* renamed from: a  reason: collision with root package name */
        final hy.o<? super T> f52670a;

        a(hy.o<? super T> oVar) {
            this.f52670a = oVar;
        }

        @Override // hy.o
        public void a(iy.b bVar) {
            this.f52670a.a(bVar);
        }

        @Override // hy.o
        public void onError(Throwable th2) {
            this.f52670a.onError(th2);
        }

        @Override // hy.o
        public void onSuccess(T t11) {
            try {
                d.this.f52669b.accept(t11);
                this.f52670a.onSuccess(t11);
            } catch (Throwable th2) {
                jy.a.b(th2);
                this.f52670a.onError(th2);
            }
        }
    }

    public d(hy.q<T> qVar, ky.f<? super T> fVar) {
        this.f52668a = qVar;
        this.f52669b = fVar;
    }

    @Override // hy.m
    protected void v(hy.o<? super T> oVar) {
        this.f52668a.a(new a(oVar));
    }
}