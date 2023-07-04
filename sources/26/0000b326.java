package sy;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class s<T, R> extends sy.a<T, R> {

    /* renamed from: b  reason: collision with root package name */
    final ky.c<R, ? super T, R> f50848b;

    /* renamed from: c  reason: collision with root package name */
    final ky.j<R> f50849c;

    /* loaded from: classes5.dex */
    static final class a<T, R> implements hy.k<T>, iy.b {

        /* renamed from: a  reason: collision with root package name */
        final hy.k<? super R> f50850a;

        /* renamed from: b  reason: collision with root package name */
        final ky.c<R, ? super T, R> f50851b;

        /* renamed from: c  reason: collision with root package name */
        R f50852c;

        /* renamed from: d  reason: collision with root package name */
        iy.b f50853d;

        /* renamed from: e  reason: collision with root package name */
        boolean f50854e;

        a(hy.k<? super R> kVar, ky.c<R, ? super T, R> cVar, R r11) {
            this.f50850a = kVar;
            this.f50851b = cVar;
            this.f50852c = r11;
        }

        @Override // hy.k
        public void a(iy.b bVar) {
            if (ly.a.validate(this.f50853d, bVar)) {
                this.f50853d = bVar;
                this.f50850a.a(this);
                this.f50850a.b((R) this.f50852c);
            }
        }

        @Override // hy.k
        public void b(T t11) {
            if (this.f50854e) {
                return;
            }
            try {
                R a11 = this.f50851b.a(this.f50852c, t11);
                Objects.requireNonNull(a11, "The accumulator returned a null value");
                this.f50852c = a11;
                this.f50850a.b(a11);
            } catch (Throwable th2) {
                jy.a.b(th2);
                this.f50853d.dispose();
                onError(th2);
            }
        }

        @Override // iy.b
        public void dispose() {
            this.f50853d.dispose();
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f50853d.isDisposed();
        }

        @Override // hy.k
        public void onComplete() {
            if (this.f50854e) {
                return;
            }
            this.f50854e = true;
            this.f50850a.onComplete();
        }

        @Override // hy.k
        public void onError(Throwable th2) {
            if (this.f50854e) {
                az.a.r(th2);
                return;
            }
            this.f50854e = true;
            this.f50850a.onError(th2);
        }
    }

    public s(hy.j<T> jVar, ky.j<R> jVar2, ky.c<R, ? super T, R> cVar) {
        super(jVar);
        this.f50848b = cVar;
        this.f50849c = jVar2;
    }

    @Override // hy.i
    public void L(hy.k<? super R> kVar) {
        try {
            R r11 = this.f50849c.get();
            Objects.requireNonNull(r11, "The seed supplied is null");
            this.f50705a.c(new a(kVar, this.f50848b, r11));
        } catch (Throwable th2) {
            jy.a.b(th2);
            ly.b.error(th2, kVar);
        }
    }
}