package qy;

import hy.l;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class j extends hy.e<Long> {

    /* renamed from: b  reason: collision with root package name */
    final hy.l f48751b;

    /* renamed from: c  reason: collision with root package name */
    final long f48752c;

    /* renamed from: d  reason: collision with root package name */
    final long f48753d;

    /* renamed from: e  reason: collision with root package name */
    final TimeUnit f48754e;

    /* loaded from: classes5.dex */
    static final class a extends AtomicLong implements b80.c, Runnable {

        /* renamed from: a  reason: collision with root package name */
        final b80.b<? super Long> f48755a;

        /* renamed from: b  reason: collision with root package name */
        long f48756b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReference<iy.b> f48757c = new AtomicReference<>();

        a(b80.b<? super Long> bVar) {
            this.f48755a = bVar;
        }

        public void a(iy.b bVar) {
            ly.a.setOnce(this.f48757c, bVar);
        }

        @Override // b80.c
        public void cancel() {
            ly.a.dispose(this.f48757c);
        }

        @Override // b80.c
        public void request(long j11) {
            if (xy.e.validate(j11)) {
                yy.c.a(this, j11);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f48757c.get() != ly.a.DISPOSED) {
                if (get() != 0) {
                    b80.b<? super Long> bVar = this.f48755a;
                    long j11 = this.f48756b;
                    this.f48756b = j11 + 1;
                    bVar.b(Long.valueOf(j11));
                    yy.c.c(this, 1L);
                    return;
                }
                b80.b<? super Long> bVar2 = this.f48755a;
                bVar2.onError(new MissingBackpressureException("Can't deliver value " + this.f48756b + " due to lack of requests"));
                ly.a.dispose(this.f48757c);
            }
        }
    }

    public j(long j11, long j12, TimeUnit timeUnit, hy.l lVar) {
        this.f48752c = j11;
        this.f48753d = j12;
        this.f48754e = timeUnit;
        this.f48751b = lVar;
    }

    @Override // hy.e
    public void z(b80.b<? super Long> bVar) {
        a aVar = new a(bVar);
        bVar.c(aVar);
        hy.l lVar = this.f48751b;
        if (lVar instanceof vy.p) {
            l.c c11 = lVar.c();
            aVar.a(c11);
            c11.g(aVar, this.f48752c, this.f48753d, this.f48754e);
            return;
        }
        aVar.a(lVar.f(aVar, this.f48752c, this.f48753d, this.f48754e));
    }
}