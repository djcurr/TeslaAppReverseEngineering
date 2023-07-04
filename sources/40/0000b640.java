package ty;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* loaded from: classes5.dex */
public final class c<T> extends hy.m<T> {

    /* renamed from: a  reason: collision with root package name */
    final hy.q<T> f52664a;

    /* renamed from: b  reason: collision with root package name */
    final ky.f<? super Throwable> f52665b;

    /* loaded from: classes5.dex */
    final class a implements hy.o<T> {

        /* renamed from: a  reason: collision with root package name */
        private final hy.o<? super T> f52666a;

        a(hy.o<? super T> oVar) {
            this.f52666a = oVar;
        }

        @Override // hy.o
        public void a(iy.b bVar) {
            this.f52666a.a(bVar);
        }

        @Override // hy.o
        public void onError(Throwable th2) {
            try {
                c.this.f52665b.accept(th2);
            } catch (Throwable th3) {
                jy.a.b(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f52666a.onError(th2);
        }

        @Override // hy.o
        public void onSuccess(T t11) {
            this.f52666a.onSuccess(t11);
        }
    }

    public c(hy.q<T> qVar, ky.f<? super Throwable> fVar) {
        this.f52664a = qVar;
        this.f52665b = fVar;
    }

    @Override // hy.m
    protected void v(hy.o<? super T> oVar) {
        this.f52664a.a(new a(oVar));
    }
}