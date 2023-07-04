package kx;

import hy.i;
import hy.k;
import io.reactivex.rxjava3.exceptions.CompositeException;
import retrofit2.s;

/* loaded from: classes5.dex */
final class e<T> extends i<d<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final i<s<T>> f35911a;

    /* loaded from: classes5.dex */
    private static class a<R> implements k<s<R>> {

        /* renamed from: a  reason: collision with root package name */
        private final k<? super d<R>> f35912a;

        a(k<? super d<R>> kVar) {
            this.f35912a = kVar;
        }

        @Override // hy.k
        public void a(iy.b bVar) {
            this.f35912a.a(bVar);
        }

        @Override // hy.k
        /* renamed from: c */
        public void b(s<R> sVar) {
            this.f35912a.b(d.b(sVar));
        }

        @Override // hy.k
        public void onComplete() {
            this.f35912a.onComplete();
        }

        @Override // hy.k
        public void onError(Throwable th2) {
            try {
                this.f35912a.b(d.a(th2));
                this.f35912a.onComplete();
            } catch (Throwable th3) {
                try {
                    this.f35912a.onError(th3);
                } catch (Throwable th4) {
                    jy.a.b(th4);
                    az.a.r(new CompositeException(th3, th4));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(i<s<T>> iVar) {
        this.f35911a = iVar;
    }

    @Override // hy.i
    protected void L(k<? super d<T>> kVar) {
        this.f35911a.c(new a(kVar));
    }
}