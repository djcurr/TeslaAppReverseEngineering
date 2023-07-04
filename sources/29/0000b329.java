package sy;

import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class u<T> extends hy.m<T> {

    /* renamed from: a  reason: collision with root package name */
    final hy.j<? extends T> f50856a;

    /* renamed from: b  reason: collision with root package name */
    final T f50857b;

    /* loaded from: classes5.dex */
    static final class a<T> implements hy.k<T>, iy.b {

        /* renamed from: a  reason: collision with root package name */
        final hy.o<? super T> f50858a;

        /* renamed from: b  reason: collision with root package name */
        final T f50859b;

        /* renamed from: c  reason: collision with root package name */
        iy.b f50860c;

        /* renamed from: d  reason: collision with root package name */
        T f50861d;

        /* renamed from: e  reason: collision with root package name */
        boolean f50862e;

        a(hy.o<? super T> oVar, T t11) {
            this.f50858a = oVar;
            this.f50859b = t11;
        }

        @Override // hy.k
        public void a(iy.b bVar) {
            if (ly.a.validate(this.f50860c, bVar)) {
                this.f50860c = bVar;
                this.f50858a.a(this);
            }
        }

        @Override // hy.k
        public void b(T t11) {
            if (this.f50862e) {
                return;
            }
            if (this.f50861d != null) {
                this.f50862e = true;
                this.f50860c.dispose();
                this.f50858a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.f50861d = t11;
        }

        @Override // iy.b
        public void dispose() {
            this.f50860c.dispose();
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f50860c.isDisposed();
        }

        @Override // hy.k
        public void onComplete() {
            if (this.f50862e) {
                return;
            }
            this.f50862e = true;
            T t11 = this.f50861d;
            this.f50861d = null;
            if (t11 == null) {
                t11 = this.f50859b;
            }
            if (t11 != null) {
                this.f50858a.onSuccess(t11);
            } else {
                this.f50858a.onError(new NoSuchElementException());
            }
        }

        @Override // hy.k
        public void onError(Throwable th2) {
            if (this.f50862e) {
                az.a.r(th2);
                return;
            }
            this.f50862e = true;
            this.f50858a.onError(th2);
        }
    }

    public u(hy.j<? extends T> jVar, T t11) {
        this.f50856a = jVar;
        this.f50857b = t11;
    }

    @Override // hy.m
    public void v(hy.o<? super T> oVar) {
        this.f50856a.c(new a(oVar, this.f50857b));
    }
}