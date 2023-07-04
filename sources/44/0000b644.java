package ty;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* loaded from: classes5.dex */
public final class e<T> extends hy.m<T> {

    /* renamed from: a  reason: collision with root package name */
    final hy.q<T> f52672a;

    /* renamed from: b  reason: collision with root package name */
    final ky.a f52673b;

    /* loaded from: classes5.dex */
    final class a implements hy.o<T> {

        /* renamed from: a  reason: collision with root package name */
        final hy.o<? super T> f52674a;

        a(hy.o<? super T> oVar) {
            this.f52674a = oVar;
        }

        @Override // hy.o
        public void a(iy.b bVar) {
            this.f52674a.a(bVar);
        }

        @Override // hy.o
        public void onError(Throwable th2) {
            try {
                e.this.f52673b.run();
            } catch (Throwable th3) {
                jy.a.b(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f52674a.onError(th2);
        }

        @Override // hy.o
        public void onSuccess(T t11) {
            try {
                e.this.f52673b.run();
                this.f52674a.onSuccess(t11);
            } catch (Throwable th2) {
                jy.a.b(th2);
                this.f52674a.onError(th2);
            }
        }
    }

    public e(hy.q<T> qVar, ky.a aVar) {
        this.f52672a = qVar;
        this.f52673b = aVar;
    }

    @Override // hy.m
    protected void v(hy.o<? super T> oVar) {
        this.f52672a.a(new a(oVar));
    }
}