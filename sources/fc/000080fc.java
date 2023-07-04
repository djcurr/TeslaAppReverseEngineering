package kx;

import hy.i;
import hy.k;
import io.reactivex.rxjava3.exceptions.CompositeException;
import retrofit2.HttpException;
import retrofit2.s;

/* loaded from: classes5.dex */
final class a<T> extends i<T> {

    /* renamed from: a  reason: collision with root package name */
    private final i<s<T>> f35900a;

    /* renamed from: kx.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private static class C0685a<R> implements k<s<R>> {

        /* renamed from: a  reason: collision with root package name */
        private final k<? super R> f35901a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f35902b;

        C0685a(k<? super R> kVar) {
            this.f35901a = kVar;
        }

        @Override // hy.k
        public void a(iy.b bVar) {
            this.f35901a.a(bVar);
        }

        @Override // hy.k
        /* renamed from: c */
        public void b(s<R> sVar) {
            if (sVar.f()) {
                this.f35901a.b(sVar.a());
                return;
            }
            this.f35902b = true;
            HttpException httpException = new HttpException(sVar);
            try {
                this.f35901a.onError(httpException);
            } catch (Throwable th2) {
                jy.a.b(th2);
                az.a.r(new CompositeException(httpException, th2));
            }
        }

        @Override // hy.k
        public void onComplete() {
            if (this.f35902b) {
                return;
            }
            this.f35901a.onComplete();
        }

        @Override // hy.k
        public void onError(Throwable th2) {
            if (!this.f35902b) {
                this.f35901a.onError(th2);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th2);
            az.a.r(assertionError);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(i<s<T>> iVar) {
        this.f35900a = iVar;
    }

    @Override // hy.i
    protected void L(k<? super T> kVar) {
        this.f35900a.c(new C0685a(kVar));
    }
}