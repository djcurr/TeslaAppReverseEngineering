package qy;

import hy.l;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class q<T> extends b<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final hy.l f48797c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f48798d;

    /* loaded from: classes5.dex */
    static final class a<T> extends AtomicReference<Thread> implements hy.f<T>, b80.c, Runnable {

        /* renamed from: a  reason: collision with root package name */
        final b80.b<? super T> f48799a;

        /* renamed from: b  reason: collision with root package name */
        final l.c f48800b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReference<b80.c> f48801c = new AtomicReference<>();

        /* renamed from: d  reason: collision with root package name */
        final AtomicLong f48802d = new AtomicLong();

        /* renamed from: e  reason: collision with root package name */
        final boolean f48803e;

        /* renamed from: f  reason: collision with root package name */
        b80.a<T> f48804f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: qy.q$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class RunnableC1057a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final b80.c f48805a;

            /* renamed from: b  reason: collision with root package name */
            final long f48806b;

            RunnableC1057a(b80.c cVar, long j11) {
                this.f48805a = cVar;
                this.f48806b = j11;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f48805a.request(this.f48806b);
            }
        }

        a(b80.b<? super T> bVar, l.c cVar, b80.a<T> aVar, boolean z11) {
            this.f48799a = bVar;
            this.f48800b = cVar;
            this.f48804f = aVar;
            this.f48803e = !z11;
        }

        void a(long j11, b80.c cVar) {
            if (!this.f48803e && Thread.currentThread() != get()) {
                this.f48800b.b(new RunnableC1057a(cVar, j11));
            } else {
                cVar.request(j11);
            }
        }

        @Override // b80.b
        public void b(T t11) {
            this.f48799a.b(t11);
        }

        @Override // hy.f, b80.b
        public void c(b80.c cVar) {
            if (xy.e.setOnce(this.f48801c, cVar)) {
                long andSet = this.f48802d.getAndSet(0L);
                if (andSet != 0) {
                    a(andSet, cVar);
                }
            }
        }

        @Override // b80.c
        public void cancel() {
            xy.e.cancel(this.f48801c);
            this.f48800b.dispose();
        }

        @Override // b80.b
        public void onComplete() {
            this.f48799a.onComplete();
            this.f48800b.dispose();
        }

        @Override // b80.b
        public void onError(Throwable th2) {
            this.f48799a.onError(th2);
            this.f48800b.dispose();
        }

        @Override // b80.c
        public void request(long j11) {
            if (xy.e.validate(j11)) {
                b80.c cVar = this.f48801c.get();
                if (cVar != null) {
                    a(j11, cVar);
                    return;
                }
                yy.c.a(this.f48802d, j11);
                b80.c cVar2 = this.f48801c.get();
                if (cVar2 != null) {
                    long andSet = this.f48802d.getAndSet(0L);
                    if (andSet != 0) {
                        a(andSet, cVar2);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            b80.a<T> aVar = this.f48804f;
            this.f48804f = null;
            aVar.a(this);
        }
    }

    public q(hy.e<T> eVar, hy.l lVar, boolean z11) {
        super(eVar);
        this.f48797c = lVar;
        this.f48798d = z11;
    }

    @Override // hy.e
    public void z(b80.b<? super T> bVar) {
        l.c c11 = this.f48797c.c();
        a aVar = new a(bVar, c11, this.f48697b, this.f48798d);
        bVar.c(aVar);
        c11.b(aVar);
    }
}