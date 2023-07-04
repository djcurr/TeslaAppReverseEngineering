package sy;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class v<T> extends sy.a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final hy.l f50863b;

    /* loaded from: classes5.dex */
    static final class a<T> extends AtomicReference<iy.b> implements hy.k<T>, iy.b {

        /* renamed from: a  reason: collision with root package name */
        final hy.k<? super T> f50864a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReference<iy.b> f50865b = new AtomicReference<>();

        a(hy.k<? super T> kVar) {
            this.f50864a = kVar;
        }

        @Override // hy.k
        public void a(iy.b bVar) {
            ly.a.setOnce(this.f50865b, bVar);
        }

        @Override // hy.k
        public void b(T t11) {
            this.f50864a.b(t11);
        }

        void c(iy.b bVar) {
            ly.a.setOnce(this, bVar);
        }

        @Override // iy.b
        public void dispose() {
            ly.a.dispose(this.f50865b);
            ly.a.dispose(this);
        }

        @Override // iy.b
        public boolean isDisposed() {
            return ly.a.isDisposed(get());
        }

        @Override // hy.k
        public void onComplete() {
            this.f50864a.onComplete();
        }

        @Override // hy.k
        public void onError(Throwable th2) {
            this.f50864a.onError(th2);
        }
    }

    /* loaded from: classes5.dex */
    final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final a<T> f50866a;

        b(a<T> aVar) {
            this.f50866a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.f50705a.c(this.f50866a);
        }
    }

    public v(hy.j<T> jVar, hy.l lVar) {
        super(jVar);
        this.f50863b = lVar;
    }

    @Override // hy.i
    public void L(hy.k<? super T> kVar) {
        a aVar = new a(kVar);
        kVar.a(aVar);
        aVar.c(this.f50863b.d(new b(aVar)));
    }
}