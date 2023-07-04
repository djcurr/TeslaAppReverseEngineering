package kx;

import hy.i;
import hy.k;
import io.reactivex.rxjava3.exceptions.CompositeException;
import retrofit2.s;

/* loaded from: classes5.dex */
final class b<T> extends i<s<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final retrofit2.b<T> f35903a;

    /* loaded from: classes5.dex */
    private static final class a<T> implements iy.b, retrofit2.d<T> {

        /* renamed from: a  reason: collision with root package name */
        private final retrofit2.b<?> f35904a;

        /* renamed from: b  reason: collision with root package name */
        private final k<? super s<T>> f35905b;

        /* renamed from: c  reason: collision with root package name */
        private volatile boolean f35906c;

        /* renamed from: d  reason: collision with root package name */
        boolean f35907d = false;

        a(retrofit2.b<?> bVar, k<? super s<T>> kVar) {
            this.f35904a = bVar;
            this.f35905b = kVar;
        }

        @Override // iy.b
        public void dispose() {
            this.f35906c = true;
            this.f35904a.cancel();
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f35906c;
        }

        @Override // retrofit2.d
        public void onFailure(retrofit2.b<T> bVar, Throwable th2) {
            if (bVar.isCanceled()) {
                return;
            }
            try {
                this.f35905b.onError(th2);
            } catch (Throwable th3) {
                jy.a.b(th3);
                az.a.r(new CompositeException(th2, th3));
            }
        }

        @Override // retrofit2.d
        public void onResponse(retrofit2.b<T> bVar, s<T> sVar) {
            if (this.f35906c) {
                return;
            }
            try {
                this.f35905b.b(sVar);
                if (this.f35906c) {
                    return;
                }
                this.f35907d = true;
                this.f35905b.onComplete();
            } catch (Throwable th2) {
                jy.a.b(th2);
                if (this.f35907d) {
                    az.a.r(th2);
                } else if (this.f35906c) {
                } else {
                    try {
                        this.f35905b.onError(th2);
                    } catch (Throwable th3) {
                        jy.a.b(th3);
                        az.a.r(new CompositeException(th2, th3));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(retrofit2.b<T> bVar) {
        this.f35903a = bVar;
    }

    @Override // hy.i
    protected void L(k<? super s<T>> kVar) {
        retrofit2.b<T> mo117clone = this.f35903a.mo117clone();
        a aVar = new a(mo117clone, kVar);
        kVar.a(aVar);
        if (aVar.isDisposed()) {
            return;
        }
        mo117clone.enqueue(aVar);
    }
}