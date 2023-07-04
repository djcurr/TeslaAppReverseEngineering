package ty;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class b<T> extends hy.m<T> {

    /* renamed from: a  reason: collision with root package name */
    final hy.q<T> f52660a;

    /* renamed from: b  reason: collision with root package name */
    final hy.d f52661b;

    /* loaded from: classes5.dex */
    static final class a<T> extends AtomicReference<iy.b> implements hy.c, iy.b {

        /* renamed from: a  reason: collision with root package name */
        final hy.o<? super T> f52662a;

        /* renamed from: b  reason: collision with root package name */
        final hy.q<T> f52663b;

        a(hy.o<? super T> oVar, hy.q<T> qVar) {
            this.f52662a = oVar;
            this.f52663b = qVar;
        }

        @Override // hy.c
        public void a(iy.b bVar) {
            if (ly.a.setOnce(this, bVar)) {
                this.f52662a.a(this);
            }
        }

        @Override // iy.b
        public void dispose() {
            ly.a.dispose(this);
        }

        @Override // iy.b
        public boolean isDisposed() {
            return ly.a.isDisposed(get());
        }

        @Override // hy.c, hy.h
        public void onComplete() {
            this.f52663b.a(new oy.l(this, this.f52662a));
        }

        @Override // hy.c
        public void onError(Throwable th2) {
            this.f52662a.onError(th2);
        }
    }

    public b(hy.q<T> qVar, hy.d dVar) {
        this.f52660a = qVar;
        this.f52661b = dVar;
    }

    @Override // hy.m
    protected void v(hy.o<? super T> oVar) {
        this.f52661b.b(new a(oVar, this.f52660a));
    }
}