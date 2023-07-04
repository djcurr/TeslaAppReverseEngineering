package kx;

import hy.i;
import hy.k;
import io.reactivex.rxjava3.exceptions.CompositeException;
import retrofit2.s;

/* loaded from: classes5.dex */
final class c<T> extends i<s<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final retrofit2.b<T> f35908a;

    /* loaded from: classes5.dex */
    private static final class a implements iy.b {

        /* renamed from: a  reason: collision with root package name */
        private final retrofit2.b<?> f35909a;

        /* renamed from: b  reason: collision with root package name */
        private volatile boolean f35910b;

        a(retrofit2.b<?> bVar) {
            this.f35909a = bVar;
        }

        @Override // iy.b
        public void dispose() {
            this.f35910b = true;
            this.f35909a.cancel();
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f35910b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(retrofit2.b<T> bVar) {
        this.f35908a = bVar;
    }

    @Override // hy.i
    protected void L(k<? super s<T>> kVar) {
        boolean z11;
        retrofit2.b<T> mo117clone = this.f35908a.mo117clone();
        a aVar = new a(mo117clone);
        kVar.a(aVar);
        if (aVar.isDisposed()) {
            return;
        }
        try {
            s<T> execute = mo117clone.execute();
            if (!aVar.isDisposed()) {
                kVar.b(execute);
            }
            if (aVar.isDisposed()) {
                return;
            }
            try {
                kVar.onComplete();
            } catch (Throwable th2) {
                th = th2;
                z11 = true;
                jy.a.b(th);
                if (z11) {
                    az.a.r(th);
                } else if (aVar.isDisposed()) {
                } else {
                    try {
                        kVar.onError(th);
                    } catch (Throwable th3) {
                        jy.a.b(th3);
                        az.a.r(new CompositeException(th, th3));
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            z11 = false;
        }
    }
}