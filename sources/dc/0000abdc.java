package py;

import hy.o;
import hy.q;

/* loaded from: classes5.dex */
public final class c<T> extends hy.b {

    /* renamed from: a  reason: collision with root package name */
    final q<T> f47008a;

    /* loaded from: classes5.dex */
    static final class a<T> implements o<T> {

        /* renamed from: a  reason: collision with root package name */
        final hy.c f47009a;

        a(hy.c cVar) {
            this.f47009a = cVar;
        }

        @Override // hy.o
        public void a(iy.b bVar) {
            this.f47009a.a(bVar);
        }

        @Override // hy.o
        public void onError(Throwable th2) {
            this.f47009a.onError(th2);
        }

        @Override // hy.o
        public void onSuccess(T t11) {
            this.f47009a.onComplete();
        }
    }

    public c(q<T> qVar) {
        this.f47008a = qVar;
    }

    @Override // hy.b
    protected void h(hy.c cVar) {
        this.f47008a.a(new a(cVar));
    }
}