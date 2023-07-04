package ty;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class p<T> extends hy.m<T> {

    /* renamed from: a  reason: collision with root package name */
    final hy.q<T> f52709a;

    /* renamed from: b  reason: collision with root package name */
    final long f52710b;

    /* renamed from: c  reason: collision with root package name */
    final TimeUnit f52711c;

    /* renamed from: d  reason: collision with root package name */
    final hy.l f52712d;

    /* renamed from: e  reason: collision with root package name */
    final hy.q<? extends T> f52713e;

    /* loaded from: classes5.dex */
    static final class a<T> extends AtomicReference<iy.b> implements hy.o<T>, Runnable, iy.b {

        /* renamed from: a  reason: collision with root package name */
        final hy.o<? super T> f52714a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReference<iy.b> f52715b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        final C1174a<T> f52716c;

        /* renamed from: d  reason: collision with root package name */
        hy.q<? extends T> f52717d;

        /* renamed from: e  reason: collision with root package name */
        final long f52718e;

        /* renamed from: f  reason: collision with root package name */
        final TimeUnit f52719f;

        /* renamed from: ty.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C1174a<T> extends AtomicReference<iy.b> implements hy.o<T> {

            /* renamed from: a  reason: collision with root package name */
            final hy.o<? super T> f52720a;

            C1174a(hy.o<? super T> oVar) {
                this.f52720a = oVar;
            }

            @Override // hy.o
            public void a(iy.b bVar) {
                ly.a.setOnce(this, bVar);
            }

            @Override // hy.o
            public void onError(Throwable th2) {
                this.f52720a.onError(th2);
            }

            @Override // hy.o
            public void onSuccess(T t11) {
                this.f52720a.onSuccess(t11);
            }
        }

        a(hy.o<? super T> oVar, hy.q<? extends T> qVar, long j11, TimeUnit timeUnit) {
            this.f52714a = oVar;
            this.f52717d = qVar;
            this.f52718e = j11;
            this.f52719f = timeUnit;
            if (qVar != null) {
                this.f52716c = new C1174a<>(oVar);
            } else {
                this.f52716c = null;
            }
        }

        @Override // hy.o
        public void a(iy.b bVar) {
            ly.a.setOnce(this, bVar);
        }

        @Override // iy.b
        public void dispose() {
            ly.a.dispose(this);
            ly.a.dispose(this.f52715b);
            C1174a<T> c1174a = this.f52716c;
            if (c1174a != null) {
                ly.a.dispose(c1174a);
            }
        }

        @Override // iy.b
        public boolean isDisposed() {
            return ly.a.isDisposed(get());
        }

        @Override // hy.o
        public void onError(Throwable th2) {
            iy.b bVar = get();
            ly.a aVar = ly.a.DISPOSED;
            if (bVar != aVar && compareAndSet(bVar, aVar)) {
                ly.a.dispose(this.f52715b);
                this.f52714a.onError(th2);
                return;
            }
            az.a.r(th2);
        }

        @Override // hy.o
        public void onSuccess(T t11) {
            iy.b bVar = get();
            ly.a aVar = ly.a.DISPOSED;
            if (bVar == aVar || !compareAndSet(bVar, aVar)) {
                return;
            }
            ly.a.dispose(this.f52715b);
            this.f52714a.onSuccess(t11);
        }

        @Override // java.lang.Runnable
        public void run() {
            iy.b bVar = get();
            ly.a aVar = ly.a.DISPOSED;
            if (bVar == aVar || !compareAndSet(bVar, aVar)) {
                return;
            }
            if (bVar != null) {
                bVar.dispose();
            }
            hy.q<? extends T> qVar = this.f52717d;
            if (qVar == null) {
                this.f52714a.onError(new TimeoutException(yy.g.g(this.f52718e, this.f52719f)));
                return;
            }
            this.f52717d = null;
            qVar.a(this.f52716c);
        }
    }

    public p(hy.q<T> qVar, long j11, TimeUnit timeUnit, hy.l lVar, hy.q<? extends T> qVar2) {
        this.f52709a = qVar;
        this.f52710b = j11;
        this.f52711c = timeUnit;
        this.f52712d = lVar;
        this.f52713e = qVar2;
    }

    @Override // hy.m
    protected void v(hy.o<? super T> oVar) {
        a aVar = new a(oVar, this.f52713e, this.f52710b, this.f52711c);
        oVar.a(aVar);
        ly.a.replace(aVar.f52715b, this.f52712d.e(aVar, this.f52710b, this.f52711c));
        this.f52709a.a(aVar);
    }
}