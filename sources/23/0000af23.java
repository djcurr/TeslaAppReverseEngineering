package qy;

import hy.l;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class k extends hy.e<Long> {

    /* renamed from: b  reason: collision with root package name */
    final hy.l f48758b;

    /* renamed from: c  reason: collision with root package name */
    final long f48759c;

    /* renamed from: d  reason: collision with root package name */
    final long f48760d;

    /* renamed from: e  reason: collision with root package name */
    final long f48761e;

    /* renamed from: f  reason: collision with root package name */
    final long f48762f;

    /* renamed from: g  reason: collision with root package name */
    final TimeUnit f48763g;

    /* loaded from: classes5.dex */
    static final class a extends AtomicLong implements b80.c, Runnable {

        /* renamed from: a  reason: collision with root package name */
        final b80.b<? super Long> f48764a;

        /* renamed from: b  reason: collision with root package name */
        final long f48765b;

        /* renamed from: c  reason: collision with root package name */
        long f48766c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReference<iy.b> f48767d = new AtomicReference<>();

        a(b80.b<? super Long> bVar, long j11, long j12) {
            this.f48764a = bVar;
            this.f48766c = j11;
            this.f48765b = j12;
        }

        public void a(iy.b bVar) {
            ly.a.setOnce(this.f48767d, bVar);
        }

        @Override // b80.c
        public void cancel() {
            ly.a.dispose(this.f48767d);
        }

        @Override // b80.c
        public void request(long j11) {
            if (xy.e.validate(j11)) {
                yy.c.a(this, j11);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            iy.b bVar = this.f48767d.get();
            ly.a aVar = ly.a.DISPOSED;
            if (bVar != aVar) {
                long j11 = get();
                if (j11 != 0) {
                    long j12 = this.f48766c;
                    this.f48764a.b(Long.valueOf(j12));
                    if (j12 == this.f48765b) {
                        if (this.f48767d.get() != aVar) {
                            this.f48764a.onComplete();
                        }
                        ly.a.dispose(this.f48767d);
                        return;
                    }
                    this.f48766c = j12 + 1;
                    if (j11 != Long.MAX_VALUE) {
                        decrementAndGet();
                        return;
                    }
                    return;
                }
                b80.b<? super Long> bVar2 = this.f48764a;
                bVar2.onError(new MissingBackpressureException("Can't deliver value " + this.f48766c + " due to lack of requests"));
                ly.a.dispose(this.f48767d);
            }
        }
    }

    public k(long j11, long j12, long j13, long j14, TimeUnit timeUnit, hy.l lVar) {
        this.f48761e = j13;
        this.f48762f = j14;
        this.f48763g = timeUnit;
        this.f48758b = lVar;
        this.f48759c = j11;
        this.f48760d = j12;
    }

    @Override // hy.e
    public void z(b80.b<? super Long> bVar) {
        a aVar = new a(bVar, this.f48759c, this.f48760d);
        bVar.c(aVar);
        hy.l lVar = this.f48758b;
        if (lVar instanceof vy.p) {
            l.c c11 = lVar.c();
            aVar.a(c11);
            c11.g(aVar, this.f48761e, this.f48762f, this.f48763g);
            return;
        }
        aVar.a(lVar.f(aVar, this.f48761e, this.f48762f, this.f48763g));
    }
}