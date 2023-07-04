package ty;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class a<T> extends hy.m<T> {

    /* renamed from: a  reason: collision with root package name */
    final hy.p<T> f52658a;

    /* renamed from: ty.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C1172a<T> extends AtomicReference<iy.b> implements hy.n<T>, iy.b {

        /* renamed from: a  reason: collision with root package name */
        final hy.o<? super T> f52659a;

        C1172a(hy.o<? super T> oVar) {
            this.f52659a = oVar;
        }

        public boolean a(Throwable th2) {
            iy.b andSet;
            if (th2 == null) {
                th2 = yy.g.b("onError called with a null Throwable.");
            }
            iy.b bVar = get();
            ly.a aVar = ly.a.DISPOSED;
            if (bVar == aVar || (andSet = getAndSet(aVar)) == aVar) {
                return false;
            }
            try {
                this.f52659a.onError(th2);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
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

        @Override // hy.n
        public void onError(Throwable th2) {
            if (a(th2)) {
                return;
            }
            az.a.r(th2);
        }

        @Override // hy.n
        public void onSuccess(T t11) {
            iy.b andSet;
            iy.b bVar = get();
            ly.a aVar = ly.a.DISPOSED;
            if (bVar == aVar || (andSet = getAndSet(aVar)) == aVar) {
                return;
            }
            try {
                if (t11 == null) {
                    this.f52659a.onError(yy.g.b("onSuccess called with a null value."));
                } else {
                    this.f52659a.onSuccess(t11);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th2) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th2;
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", C1172a.class.getSimpleName(), super.toString());
        }
    }

    public a(hy.p<T> pVar) {
        this.f52658a = pVar;
    }

    @Override // hy.m
    protected void v(hy.o<? super T> oVar) {
        C1172a c1172a = new C1172a(oVar);
        oVar.a(c1172a);
        try {
            this.f52658a.a(c1172a);
        } catch (Throwable th2) {
            jy.a.b(th2);
            c1172a.onError(th2);
        }
    }
}