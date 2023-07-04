package qy;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class n<T> extends b<T, T> {

    /* loaded from: classes5.dex */
    static final class a<T> extends AtomicLong implements hy.f<T>, b80.c {

        /* renamed from: a  reason: collision with root package name */
        final b80.b<? super T> f48787a;

        /* renamed from: b  reason: collision with root package name */
        b80.c f48788b;

        /* renamed from: c  reason: collision with root package name */
        boolean f48789c;

        a(b80.b<? super T> bVar) {
            this.f48787a = bVar;
        }

        @Override // b80.b
        public void b(T t11) {
            if (this.f48789c) {
                return;
            }
            if (get() != 0) {
                this.f48787a.b(t11);
                yy.c.c(this, 1L);
                return;
            }
            this.f48788b.cancel();
            onError(new MissingBackpressureException("could not emit value due to lack of requests"));
        }

        @Override // hy.f, b80.b
        public void c(b80.c cVar) {
            if (xy.e.validate(this.f48788b, cVar)) {
                this.f48788b = cVar;
                this.f48787a.c(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // b80.c
        public void cancel() {
            this.f48788b.cancel();
        }

        @Override // b80.b
        public void onComplete() {
            if (this.f48789c) {
                return;
            }
            this.f48789c = true;
            this.f48787a.onComplete();
        }

        @Override // b80.b
        public void onError(Throwable th2) {
            if (this.f48789c) {
                az.a.r(th2);
                return;
            }
            this.f48789c = true;
            this.f48787a.onError(th2);
        }

        @Override // b80.c
        public void request(long j11) {
            if (xy.e.validate(j11)) {
                yy.c.a(this, j11);
            }
        }
    }

    public n(hy.e<T> eVar) {
        super(eVar);
    }

    @Override // hy.e
    protected void z(b80.b<? super T> bVar) {
        this.f48697b.y(new a(bVar));
    }
}