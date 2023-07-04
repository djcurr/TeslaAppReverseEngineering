package ty;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class h<T> extends hy.m<T> {

    /* renamed from: a  reason: collision with root package name */
    final Callable<? extends T> f52683a;

    public h(Callable<? extends T> callable) {
        this.f52683a = callable;
    }

    @Override // hy.m
    protected void v(hy.o<? super T> oVar) {
        iy.b e11 = iy.b.e();
        oVar.a(e11);
        if (e11.isDisposed()) {
            return;
        }
        try {
            Object obj = (T) this.f52683a.call();
            Objects.requireNonNull(obj, "The callable returned a null value");
            if (e11.isDisposed()) {
                return;
            }
            oVar.onSuccess(obj);
        } catch (Throwable th2) {
            jy.a.b(th2);
            if (!e11.isDisposed()) {
                oVar.onError(th2);
            } else {
                az.a.r(th2);
            }
        }
    }
}