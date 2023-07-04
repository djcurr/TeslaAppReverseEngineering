package sy;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* loaded from: classes5.dex */
public final class f<T> extends sy.a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final ky.f<? super T> f50774b;

    /* renamed from: c  reason: collision with root package name */
    final ky.f<? super Throwable> f50775c;

    /* renamed from: d  reason: collision with root package name */
    final ky.a f50776d;

    /* renamed from: e  reason: collision with root package name */
    final ky.a f50777e;

    /* loaded from: classes5.dex */
    static final class a<T> implements hy.k<T>, iy.b {

        /* renamed from: a  reason: collision with root package name */
        final hy.k<? super T> f50778a;

        /* renamed from: b  reason: collision with root package name */
        final ky.f<? super T> f50779b;

        /* renamed from: c  reason: collision with root package name */
        final ky.f<? super Throwable> f50780c;

        /* renamed from: d  reason: collision with root package name */
        final ky.a f50781d;

        /* renamed from: e  reason: collision with root package name */
        final ky.a f50782e;

        /* renamed from: f  reason: collision with root package name */
        iy.b f50783f;

        /* renamed from: g  reason: collision with root package name */
        boolean f50784g;

        a(hy.k<? super T> kVar, ky.f<? super T> fVar, ky.f<? super Throwable> fVar2, ky.a aVar, ky.a aVar2) {
            this.f50778a = kVar;
            this.f50779b = fVar;
            this.f50780c = fVar2;
            this.f50781d = aVar;
            this.f50782e = aVar2;
        }

        @Override // hy.k
        public void a(iy.b bVar) {
            if (ly.a.validate(this.f50783f, bVar)) {
                this.f50783f = bVar;
                this.f50778a.a(this);
            }
        }

        @Override // hy.k
        public void b(T t11) {
            if (this.f50784g) {
                return;
            }
            try {
                this.f50779b.accept(t11);
                this.f50778a.b(t11);
            } catch (Throwable th2) {
                jy.a.b(th2);
                this.f50783f.dispose();
                onError(th2);
            }
        }

        @Override // iy.b
        public void dispose() {
            this.f50783f.dispose();
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f50783f.isDisposed();
        }

        @Override // hy.k
        public void onComplete() {
            if (this.f50784g) {
                return;
            }
            try {
                this.f50781d.run();
                this.f50784g = true;
                this.f50778a.onComplete();
                try {
                    this.f50782e.run();
                } catch (Throwable th2) {
                    jy.a.b(th2);
                    az.a.r(th2);
                }
            } catch (Throwable th3) {
                jy.a.b(th3);
                onError(th3);
            }
        }

        @Override // hy.k
        public void onError(Throwable th2) {
            if (this.f50784g) {
                az.a.r(th2);
                return;
            }
            this.f50784g = true;
            try {
                this.f50780c.accept(th2);
            } catch (Throwable th3) {
                jy.a.b(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f50778a.onError(th2);
            try {
                this.f50782e.run();
            } catch (Throwable th4) {
                jy.a.b(th4);
                az.a.r(th4);
            }
        }
    }

    public f(hy.j<T> jVar, ky.f<? super T> fVar, ky.f<? super Throwable> fVar2, ky.a aVar, ky.a aVar2) {
        super(jVar);
        this.f50774b = fVar;
        this.f50775c = fVar2;
        this.f50776d = aVar;
        this.f50777e = aVar2;
    }

    @Override // hy.i
    public void L(hy.k<? super T> kVar) {
        this.f50705a.c(new a(kVar, this.f50774b, this.f50775c, this.f50776d, this.f50777e));
    }
}