package ty;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* loaded from: classes5.dex */
public final class m<T> extends hy.m<T> {

    /* renamed from: a  reason: collision with root package name */
    final hy.q<? extends T> f52695a;

    /* renamed from: b  reason: collision with root package name */
    final ky.h<? super Throwable, ? extends T> f52696b;

    /* renamed from: c  reason: collision with root package name */
    final T f52697c;

    /* loaded from: classes5.dex */
    final class a implements hy.o<T> {

        /* renamed from: a  reason: collision with root package name */
        private final hy.o<? super T> f52698a;

        a(hy.o<? super T> oVar) {
            this.f52698a = oVar;
        }

        @Override // hy.o
        public void a(iy.b bVar) {
            this.f52698a.a(bVar);
        }

        @Override // hy.o
        public void onError(Throwable th2) {
            T apply;
            m mVar = m.this;
            ky.h<? super Throwable, ? extends T> hVar = mVar.f52696b;
            if (hVar != null) {
                try {
                    apply = hVar.apply(th2);
                } catch (Throwable th3) {
                    jy.a.b(th3);
                    this.f52698a.onError(new CompositeException(th2, th3));
                    return;
                }
            } else {
                apply = mVar.f52697c;
            }
            if (apply == null) {
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th2);
                this.f52698a.onError(nullPointerException);
                return;
            }
            this.f52698a.onSuccess(apply);
        }

        @Override // hy.o
        public void onSuccess(T t11) {
            this.f52698a.onSuccess(t11);
        }
    }

    public m(hy.q<? extends T> qVar, ky.h<? super Throwable, ? extends T> hVar, T t11) {
        this.f52695a = qVar;
        this.f52696b = hVar;
        this.f52697c = t11;
    }

    @Override // hy.m
    protected void v(hy.o<? super T> oVar) {
        this.f52695a.a(new a(oVar));
    }
}