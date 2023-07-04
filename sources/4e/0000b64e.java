package ty;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class k<T, R> extends hy.m<R> {

    /* renamed from: a  reason: collision with root package name */
    final hy.q<? extends T> f52685a;

    /* renamed from: b  reason: collision with root package name */
    final ky.h<? super T, ? extends R> f52686b;

    /* loaded from: classes5.dex */
    static final class a<T, R> implements hy.o<T> {

        /* renamed from: a  reason: collision with root package name */
        final hy.o<? super R> f52687a;

        /* renamed from: b  reason: collision with root package name */
        final ky.h<? super T, ? extends R> f52688b;

        a(hy.o<? super R> oVar, ky.h<? super T, ? extends R> hVar) {
            this.f52687a = oVar;
            this.f52688b = hVar;
        }

        @Override // hy.o
        public void a(iy.b bVar) {
            this.f52687a.a(bVar);
        }

        @Override // hy.o
        public void onError(Throwable th2) {
            this.f52687a.onError(th2);
        }

        @Override // hy.o
        public void onSuccess(T t11) {
            try {
                R apply = this.f52688b.apply(t11);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                this.f52687a.onSuccess(apply);
            } catch (Throwable th2) {
                jy.a.b(th2);
                onError(th2);
            }
        }
    }

    public k(hy.q<? extends T> qVar, ky.h<? super T, ? extends R> hVar) {
        this.f52685a = qVar;
        this.f52686b = hVar;
    }

    @Override // hy.m
    protected void v(hy.o<? super R> oVar) {
        this.f52685a.a(new a(oVar, this.f52686b));
    }
}