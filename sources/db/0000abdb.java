package py;

import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class b extends hy.b {

    /* renamed from: a  reason: collision with root package name */
    final Callable<?> f47007a;

    public b(Callable<?> callable) {
        this.f47007a = callable;
    }

    @Override // hy.b
    protected void h(hy.c cVar) {
        iy.b e11 = iy.b.e();
        cVar.a(e11);
        try {
            this.f47007a.call();
            if (e11.isDisposed()) {
                return;
            }
            cVar.onComplete();
        } catch (Throwable th2) {
            jy.a.b(th2);
            if (!e11.isDisposed()) {
                cVar.onError(th2);
            } else {
                az.a.r(th2);
            }
        }
    }
}