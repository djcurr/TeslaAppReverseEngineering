package sy;

import hy.l;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class d<T> extends sy.a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final long f50753b;

    /* renamed from: c  reason: collision with root package name */
    final TimeUnit f50754c;

    /* renamed from: d  reason: collision with root package name */
    final hy.l f50755d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a<T> extends AtomicReference<iy.b> implements Runnable, iy.b {

        /* renamed from: a  reason: collision with root package name */
        final T f50756a;

        /* renamed from: b  reason: collision with root package name */
        final long f50757b;

        /* renamed from: c  reason: collision with root package name */
        final b<T> f50758c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicBoolean f50759d = new AtomicBoolean();

        a(T t11, long j11, b<T> bVar) {
            this.f50756a = t11;
            this.f50757b = j11;
            this.f50758c = bVar;
        }

        public void a(iy.b bVar) {
            ly.a.replace(this, bVar);
        }

        @Override // iy.b
        public void dispose() {
            ly.a.dispose(this);
        }

        @Override // iy.b
        public boolean isDisposed() {
            return get() == ly.a.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f50759d.compareAndSet(false, true)) {
                this.f50758c.c(this.f50757b, this.f50756a, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b<T> implements hy.k<T>, iy.b {

        /* renamed from: a  reason: collision with root package name */
        final hy.k<? super T> f50760a;

        /* renamed from: b  reason: collision with root package name */
        final long f50761b;

        /* renamed from: c  reason: collision with root package name */
        final TimeUnit f50762c;

        /* renamed from: d  reason: collision with root package name */
        final l.c f50763d;

        /* renamed from: e  reason: collision with root package name */
        iy.b f50764e;

        /* renamed from: f  reason: collision with root package name */
        iy.b f50765f;

        /* renamed from: g  reason: collision with root package name */
        volatile long f50766g;

        /* renamed from: h  reason: collision with root package name */
        boolean f50767h;

        b(hy.k<? super T> kVar, long j11, TimeUnit timeUnit, l.c cVar) {
            this.f50760a = kVar;
            this.f50761b = j11;
            this.f50762c = timeUnit;
            this.f50763d = cVar;
        }

        @Override // hy.k
        public void a(iy.b bVar) {
            if (ly.a.validate(this.f50764e, bVar)) {
                this.f50764e = bVar;
                this.f50760a.a(this);
            }
        }

        @Override // hy.k
        public void b(T t11) {
            if (this.f50767h) {
                return;
            }
            long j11 = this.f50766g + 1;
            this.f50766g = j11;
            iy.b bVar = this.f50765f;
            if (bVar != null) {
                bVar.dispose();
            }
            a aVar = new a(t11, j11, this);
            this.f50765f = aVar;
            aVar.a(this.f50763d.c(aVar, this.f50761b, this.f50762c));
        }

        void c(long j11, T t11, a<T> aVar) {
            if (j11 == this.f50766g) {
                this.f50760a.b(t11);
                aVar.dispose();
            }
        }

        @Override // iy.b
        public void dispose() {
            this.f50764e.dispose();
            this.f50763d.dispose();
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f50763d.isDisposed();
        }

        @Override // hy.k
        public void onComplete() {
            if (this.f50767h) {
                return;
            }
            this.f50767h = true;
            iy.b bVar = this.f50765f;
            if (bVar != null) {
                bVar.dispose();
            }
            a aVar = (a) bVar;
            if (aVar != null) {
                aVar.run();
            }
            this.f50760a.onComplete();
            this.f50763d.dispose();
        }

        @Override // hy.k
        public void onError(Throwable th2) {
            if (this.f50767h) {
                az.a.r(th2);
                return;
            }
            iy.b bVar = this.f50765f;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f50767h = true;
            this.f50760a.onError(th2);
            this.f50763d.dispose();
        }
    }

    public d(hy.j<T> jVar, long j11, TimeUnit timeUnit, hy.l lVar) {
        super(jVar);
        this.f50753b = j11;
        this.f50754c = timeUnit;
        this.f50755d = lVar;
    }

    @Override // hy.i
    public void L(hy.k<? super T> kVar) {
        this.f50705a.c(new b(new zy.a(kVar), this.f50753b, this.f50754c, this.f50755d.c()));
    }
}