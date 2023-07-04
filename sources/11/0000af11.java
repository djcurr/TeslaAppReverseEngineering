package qy;

import hy.l;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class d<T> extends b<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final long f48714c;

    /* renamed from: d  reason: collision with root package name */
    final TimeUnit f48715d;

    /* renamed from: e  reason: collision with root package name */
    final hy.l f48716e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f48717f;

    /* loaded from: classes5.dex */
    static final class a<T> implements hy.f<T>, b80.c {

        /* renamed from: a  reason: collision with root package name */
        final b80.b<? super T> f48718a;

        /* renamed from: b  reason: collision with root package name */
        final long f48719b;

        /* renamed from: c  reason: collision with root package name */
        final TimeUnit f48720c;

        /* renamed from: d  reason: collision with root package name */
        final l.c f48721d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f48722e;

        /* renamed from: f  reason: collision with root package name */
        b80.c f48723f;

        /* renamed from: qy.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        final class RunnableC1056a implements Runnable {
            RunnableC1056a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f48718a.onComplete();
                } finally {
                    a.this.f48721d.dispose();
                }
            }
        }

        /* loaded from: classes5.dex */
        final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f48725a;

            b(Throwable th2) {
                this.f48725a = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f48718a.onError(this.f48725a);
                } finally {
                    a.this.f48721d.dispose();
                }
            }
        }

        /* loaded from: classes5.dex */
        final class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private final T f48727a;

            c(T t11) {
                this.f48727a = t11;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f48718a.b((T) this.f48727a);
            }
        }

        a(b80.b<? super T> bVar, long j11, TimeUnit timeUnit, l.c cVar, boolean z11) {
            this.f48718a = bVar;
            this.f48719b = j11;
            this.f48720c = timeUnit;
            this.f48721d = cVar;
            this.f48722e = z11;
        }

        @Override // b80.b
        public void b(T t11) {
            this.f48721d.c(new c(t11), this.f48719b, this.f48720c);
        }

        @Override // hy.f, b80.b
        public void c(b80.c cVar) {
            if (xy.e.validate(this.f48723f, cVar)) {
                this.f48723f = cVar;
                this.f48718a.c(this);
            }
        }

        @Override // b80.c
        public void cancel() {
            this.f48723f.cancel();
            this.f48721d.dispose();
        }

        @Override // b80.b
        public void onComplete() {
            this.f48721d.c(new RunnableC1056a(), this.f48719b, this.f48720c);
        }

        @Override // b80.b
        public void onError(Throwable th2) {
            this.f48721d.c(new b(th2), this.f48722e ? this.f48719b : 0L, this.f48720c);
        }

        @Override // b80.c
        public void request(long j11) {
            this.f48723f.request(j11);
        }
    }

    public d(hy.e<T> eVar, long j11, TimeUnit timeUnit, hy.l lVar, boolean z11) {
        super(eVar);
        this.f48714c = j11;
        this.f48715d = timeUnit;
        this.f48716e = lVar;
        this.f48717f = z11;
    }

    @Override // hy.e
    protected void z(b80.b<? super T> bVar) {
        this.f48697b.y(new a(this.f48717f ? bVar : new dz.b(bVar), this.f48714c, this.f48715d, this.f48716e.c(), this.f48717f));
    }
}