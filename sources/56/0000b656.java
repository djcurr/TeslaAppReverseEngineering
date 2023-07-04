package ty;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class o<T> extends hy.m<T> {

    /* renamed from: a  reason: collision with root package name */
    final hy.q<? extends T> f52704a;

    /* renamed from: b  reason: collision with root package name */
    final hy.l f52705b;

    /* loaded from: classes5.dex */
    static final class a<T> extends AtomicReference<iy.b> implements hy.o<T>, iy.b, Runnable {

        /* renamed from: a  reason: collision with root package name */
        final hy.o<? super T> f52706a;

        /* renamed from: b  reason: collision with root package name */
        final ly.d f52707b = new ly.d();

        /* renamed from: c  reason: collision with root package name */
        final hy.q<? extends T> f52708c;

        a(hy.o<? super T> oVar, hy.q<? extends T> qVar) {
            this.f52706a = oVar;
            this.f52708c = qVar;
        }

        @Override // hy.o
        public void a(iy.b bVar) {
            ly.a.setOnce(this, bVar);
        }

        @Override // iy.b
        public void dispose() {
            ly.a.dispose(this);
            this.f52707b.dispose();
        }

        @Override // iy.b
        public boolean isDisposed() {
            return ly.a.isDisposed(get());
        }

        @Override // hy.o
        public void onError(Throwable th2) {
            this.f52706a.onError(th2);
        }

        @Override // hy.o
        public void onSuccess(T t11) {
            this.f52706a.onSuccess(t11);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f52708c.a(this);
        }
    }

    public o(hy.q<? extends T> qVar, hy.l lVar) {
        this.f52704a = qVar;
        this.f52705b = lVar;
    }

    @Override // hy.m
    protected void v(hy.o<? super T> oVar) {
        a aVar = new a(oVar, this.f52704a);
        oVar.a(aVar);
        aVar.f52707b.a(this.f52705b.d(aVar));
    }
}