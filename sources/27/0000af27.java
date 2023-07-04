package qy;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class m<T> extends b<T, T> implements ky.f<T> {

    /* renamed from: c  reason: collision with root package name */
    final ky.f<? super T> f48782c;

    /* loaded from: classes5.dex */
    static final class a<T> extends AtomicLong implements hy.f<T>, b80.c {

        /* renamed from: a  reason: collision with root package name */
        final b80.b<? super T> f48783a;

        /* renamed from: b  reason: collision with root package name */
        final ky.f<? super T> f48784b;

        /* renamed from: c  reason: collision with root package name */
        b80.c f48785c;

        /* renamed from: d  reason: collision with root package name */
        boolean f48786d;

        a(b80.b<? super T> bVar, ky.f<? super T> fVar) {
            this.f48783a = bVar;
            this.f48784b = fVar;
        }

        @Override // b80.b
        public void b(T t11) {
            if (this.f48786d) {
                return;
            }
            if (get() != 0) {
                this.f48783a.b(t11);
                yy.c.c(this, 1L);
                return;
            }
            try {
                this.f48784b.accept(t11);
            } catch (Throwable th2) {
                jy.a.b(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // hy.f, b80.b
        public void c(b80.c cVar) {
            if (xy.e.validate(this.f48785c, cVar)) {
                this.f48785c = cVar;
                this.f48783a.c(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // b80.c
        public void cancel() {
            this.f48785c.cancel();
        }

        @Override // b80.b
        public void onComplete() {
            if (this.f48786d) {
                return;
            }
            this.f48786d = true;
            this.f48783a.onComplete();
        }

        @Override // b80.b
        public void onError(Throwable th2) {
            if (this.f48786d) {
                az.a.r(th2);
                return;
            }
            this.f48786d = true;
            this.f48783a.onError(th2);
        }

        @Override // b80.c
        public void request(long j11) {
            if (xy.e.validate(j11)) {
                yy.c.a(this, j11);
            }
        }
    }

    public m(hy.e<T> eVar) {
        super(eVar);
        this.f48782c = this;
    }

    @Override // ky.f
    public void accept(T t11) {
    }

    @Override // hy.e
    protected void z(b80.b<? super T> bVar) {
        this.f48697b.y(new a(bVar, this.f48782c));
    }
}