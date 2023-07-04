package ty;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class l<T> extends hy.m<T> {

    /* renamed from: a  reason: collision with root package name */
    final hy.q<T> f52689a;

    /* renamed from: b  reason: collision with root package name */
    final hy.l f52690b;

    /* loaded from: classes5.dex */
    static final class a<T> extends AtomicReference<iy.b> implements hy.o<T>, iy.b, Runnable {

        /* renamed from: a  reason: collision with root package name */
        final hy.o<? super T> f52691a;

        /* renamed from: b  reason: collision with root package name */
        final hy.l f52692b;

        /* renamed from: c  reason: collision with root package name */
        T f52693c;

        /* renamed from: d  reason: collision with root package name */
        Throwable f52694d;

        a(hy.o<? super T> oVar, hy.l lVar) {
            this.f52691a = oVar;
            this.f52692b = lVar;
        }

        @Override // hy.o
        public void a(iy.b bVar) {
            if (ly.a.setOnce(this, bVar)) {
                this.f52691a.a(this);
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

        @Override // hy.o
        public void onError(Throwable th2) {
            this.f52694d = th2;
            ly.a.replace(this, this.f52692b.d(this));
        }

        @Override // hy.o
        public void onSuccess(T t11) {
            this.f52693c = t11;
            ly.a.replace(this, this.f52692b.d(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.f52694d;
            if (th2 != null) {
                this.f52691a.onError(th2);
            } else {
                this.f52691a.onSuccess((T) this.f52693c);
            }
        }
    }

    public l(hy.q<T> qVar, hy.l lVar) {
        this.f52689a = qVar;
        this.f52690b = lVar;
    }

    @Override // hy.m
    protected void v(hy.o<? super T> oVar) {
        this.f52689a.a(new a(oVar, this.f52690b));
    }
}