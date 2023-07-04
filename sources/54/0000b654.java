package ty;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class n<T> extends hy.m<T> {

    /* renamed from: a  reason: collision with root package name */
    final hy.q<? extends T> f52700a;

    /* renamed from: b  reason: collision with root package name */
    final ky.h<? super Throwable, ? extends hy.q<? extends T>> f52701b;

    /* loaded from: classes5.dex */
    static final class a<T> extends AtomicReference<iy.b> implements hy.o<T>, iy.b {

        /* renamed from: a  reason: collision with root package name */
        final hy.o<? super T> f52702a;

        /* renamed from: b  reason: collision with root package name */
        final ky.h<? super Throwable, ? extends hy.q<? extends T>> f52703b;

        a(hy.o<? super T> oVar, ky.h<? super Throwable, ? extends hy.q<? extends T>> hVar) {
            this.f52702a = oVar;
            this.f52703b = hVar;
        }

        @Override // hy.o
        public void a(iy.b bVar) {
            if (ly.a.setOnce(this, bVar)) {
                this.f52702a.a(this);
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
            try {
                hy.q<? extends T> apply = this.f52703b.apply(th2);
                Objects.requireNonNull(apply, "The nextFunction returned a null SingleSource.");
                apply.a(new oy.l(this, this.f52702a));
            } catch (Throwable th3) {
                jy.a.b(th3);
                this.f52702a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // hy.o
        public void onSuccess(T t11) {
            this.f52702a.onSuccess(t11);
        }
    }

    public n(hy.q<? extends T> qVar, ky.h<? super Throwable, ? extends hy.q<? extends T>> hVar) {
        this.f52700a = qVar;
        this.f52701b = hVar;
    }

    @Override // hy.m
    protected void v(hy.o<? super T> oVar) {
        this.f52700a.a(new a(oVar, this.f52701b));
    }
}