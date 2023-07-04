package yy;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class b extends AtomicReference<Throwable> {
    public Throwable a() {
        return g.e(this);
    }

    public boolean b(Throwable th2) {
        return g.a(this, th2);
    }

    public boolean c(Throwable th2) {
        if (b(th2)) {
            return true;
        }
        az.a.r(th2);
        return false;
    }

    public void d() {
        Throwable a11 = a();
        if (a11 == null || a11 == g.f59922a) {
            return;
        }
        az.a.r(a11);
    }

    public void e(b80.b<?> bVar) {
        Throwable a11 = a();
        if (a11 == null) {
            bVar.onComplete();
        } else if (a11 != g.f59922a) {
            bVar.onError(a11);
        }
    }

    public void f(hy.k<?> kVar) {
        Throwable a11 = a();
        if (a11 == null) {
            kVar.onComplete();
        } else if (a11 != g.f59922a) {
            kVar.onError(a11);
        }
    }
}