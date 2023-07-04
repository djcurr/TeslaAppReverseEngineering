package qy;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class p<T, R> extends hy.m<R> {

    /* renamed from: a  reason: collision with root package name */
    final b80.a<T> f48790a;

    /* renamed from: b  reason: collision with root package name */
    final R f48791b;

    /* renamed from: c  reason: collision with root package name */
    final ky.c<R, ? super T, R> f48792c;

    /* loaded from: classes5.dex */
    static final class a<T, R> implements hy.f<T>, iy.b {

        /* renamed from: a  reason: collision with root package name */
        final hy.o<? super R> f48793a;

        /* renamed from: b  reason: collision with root package name */
        final ky.c<R, ? super T, R> f48794b;

        /* renamed from: c  reason: collision with root package name */
        R f48795c;

        /* renamed from: d  reason: collision with root package name */
        b80.c f48796d;

        a(hy.o<? super R> oVar, ky.c<R, ? super T, R> cVar, R r11) {
            this.f48793a = oVar;
            this.f48795c = r11;
            this.f48794b = cVar;
        }

        @Override // b80.b
        public void b(T t11) {
            R r11 = this.f48795c;
            if (r11 != null) {
                try {
                    R a11 = this.f48794b.a(r11, t11);
                    Objects.requireNonNull(a11, "The reducer returned a null value");
                    this.f48795c = a11;
                } catch (Throwable th2) {
                    jy.a.b(th2);
                    this.f48796d.cancel();
                    onError(th2);
                }
            }
        }

        @Override // hy.f, b80.b
        public void c(b80.c cVar) {
            if (xy.e.validate(this.f48796d, cVar)) {
                this.f48796d = cVar;
                this.f48793a.a(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // iy.b
        public void dispose() {
            this.f48796d.cancel();
            this.f48796d = xy.e.CANCELLED;
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f48796d == xy.e.CANCELLED;
        }

        @Override // b80.b
        public void onComplete() {
            R r11 = this.f48795c;
            if (r11 != null) {
                this.f48795c = null;
                this.f48796d = xy.e.CANCELLED;
                this.f48793a.onSuccess(r11);
            }
        }

        @Override // b80.b
        public void onError(Throwable th2) {
            if (this.f48795c != null) {
                this.f48795c = null;
                this.f48796d = xy.e.CANCELLED;
                this.f48793a.onError(th2);
                return;
            }
            az.a.r(th2);
        }
    }

    public p(b80.a<T> aVar, R r11, ky.c<R, ? super T, R> cVar) {
        this.f48790a = aVar;
        this.f48791b = r11;
        this.f48792c = cVar;
    }

    @Override // hy.m
    protected void v(hy.o<? super R> oVar) {
        this.f48790a.a(new a(oVar, this.f48792c, this.f48791b));
    }
}