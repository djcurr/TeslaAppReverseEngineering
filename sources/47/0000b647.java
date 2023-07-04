package ty;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class g<T, R> extends hy.m<R> {

    /* renamed from: a  reason: collision with root package name */
    final hy.q<? extends T> f52677a;

    /* renamed from: b  reason: collision with root package name */
    final ky.h<? super T, ? extends hy.q<? extends R>> f52678b;

    /* loaded from: classes5.dex */
    static final class a<T, R> extends AtomicReference<iy.b> implements hy.o<T>, iy.b {

        /* renamed from: a  reason: collision with root package name */
        final hy.o<? super R> f52679a;

        /* renamed from: b  reason: collision with root package name */
        final ky.h<? super T, ? extends hy.q<? extends R>> f52680b;

        /* renamed from: ty.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C1173a<R> implements hy.o<R> {

            /* renamed from: a  reason: collision with root package name */
            final AtomicReference<iy.b> f52681a;

            /* renamed from: b  reason: collision with root package name */
            final hy.o<? super R> f52682b;

            C1173a(AtomicReference<iy.b> atomicReference, hy.o<? super R> oVar) {
                this.f52681a = atomicReference;
                this.f52682b = oVar;
            }

            @Override // hy.o
            public void a(iy.b bVar) {
                ly.a.replace(this.f52681a, bVar);
            }

            @Override // hy.o
            public void onError(Throwable th2) {
                this.f52682b.onError(th2);
            }

            @Override // hy.o
            public void onSuccess(R r11) {
                this.f52682b.onSuccess(r11);
            }
        }

        a(hy.o<? super R> oVar, ky.h<? super T, ? extends hy.q<? extends R>> hVar) {
            this.f52679a = oVar;
            this.f52680b = hVar;
        }

        @Override // hy.o
        public void a(iy.b bVar) {
            if (ly.a.setOnce(this, bVar)) {
                this.f52679a.a(this);
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
            this.f52679a.onError(th2);
        }

        @Override // hy.o
        public void onSuccess(T t11) {
            try {
                hy.q<? extends R> apply = this.f52680b.apply(t11);
                Objects.requireNonNull(apply, "The single returned by the mapper is null");
                hy.q<? extends R> qVar = apply;
                if (isDisposed()) {
                    return;
                }
                qVar.a(new C1173a(this, this.f52679a));
            } catch (Throwable th2) {
                jy.a.b(th2);
                this.f52679a.onError(th2);
            }
        }
    }

    public g(hy.q<? extends T> qVar, ky.h<? super T, ? extends hy.q<? extends R>> hVar) {
        this.f52678b = hVar;
        this.f52677a = qVar;
    }

    @Override // hy.m
    protected void v(hy.o<? super R> oVar) {
        this.f52677a.a(new a(oVar, this.f52678b));
    }
}