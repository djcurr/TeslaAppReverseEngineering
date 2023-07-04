package hy;

import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    static boolean f29483a = Boolean.getBoolean("rx3.scheduler.use-nanotime");

    /* renamed from: b  reason: collision with root package name */
    static final long f29484b = a(Long.getLong("rx3.scheduler.drift-tolerance", 15).longValue(), System.getProperty("rx3.scheduler.drift-tolerance-unit", "minutes"));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a implements iy.b, Runnable {

        /* renamed from: a  reason: collision with root package name */
        final Runnable f29485a;

        /* renamed from: b  reason: collision with root package name */
        final c f29486b;

        /* renamed from: c  reason: collision with root package name */
        Thread f29487c;

        a(Runnable runnable, c cVar) {
            this.f29485a = runnable;
            this.f29486b = cVar;
        }

        @Override // iy.b
        public void dispose() {
            if (this.f29487c == Thread.currentThread()) {
                c cVar = this.f29486b;
                if (cVar instanceof vy.h) {
                    ((vy.h) cVar).k();
                    return;
                }
            }
            this.f29486b.dispose();
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f29486b.isDisposed();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29487c = Thread.currentThread();
            try {
                this.f29485a.run();
            } finally {
            }
        }
    }

    /* loaded from: classes5.dex */
    static final class b implements iy.b, Runnable {

        /* renamed from: a  reason: collision with root package name */
        final Runnable f29488a;

        /* renamed from: b  reason: collision with root package name */
        final c f29489b;

        /* renamed from: c  reason: collision with root package name */
        volatile boolean f29490c;

        b(Runnable runnable, c cVar) {
            this.f29488a = runnable;
            this.f29489b = cVar;
        }

        @Override // iy.b
        public void dispose() {
            this.f29490c = true;
            this.f29489b.dispose();
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f29490c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f29490c) {
                return;
            }
            try {
                this.f29488a.run();
            } catch (Throwable th2) {
                dispose();
                az.a.r(th2);
                throw th2;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class c implements iy.b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final Runnable f29491a;

            /* renamed from: b  reason: collision with root package name */
            final ly.d f29492b;

            /* renamed from: c  reason: collision with root package name */
            final long f29493c;

            /* renamed from: d  reason: collision with root package name */
            long f29494d;

            /* renamed from: e  reason: collision with root package name */
            long f29495e;

            /* renamed from: f  reason: collision with root package name */
            long f29496f;

            a(long j11, Runnable runnable, long j12, ly.d dVar, long j13) {
                this.f29491a = runnable;
                this.f29492b = dVar;
                this.f29493c = j13;
                this.f29495e = j12;
                this.f29496f = j11;
            }

            @Override // java.lang.Runnable
            public void run() {
                long j11;
                this.f29491a.run();
                if (this.f29492b.isDisposed()) {
                    return;
                }
                c cVar = c.this;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long a11 = cVar.a(timeUnit);
                long j12 = l.f29484b;
                long j13 = this.f29495e;
                if (a11 + j12 >= j13) {
                    long j14 = this.f29493c;
                    if (a11 < j13 + j14 + j12) {
                        long j15 = this.f29496f;
                        long j16 = this.f29494d + 1;
                        this.f29494d = j16;
                        j11 = j15 + (j16 * j14);
                        this.f29495e = a11;
                        this.f29492b.a(c.this.c(this, j11 - a11, timeUnit));
                    }
                }
                long j17 = this.f29493c;
                long j18 = a11 + j17;
                long j19 = this.f29494d + 1;
                this.f29494d = j19;
                this.f29496f = j18 - (j17 * j19);
                j11 = j18;
                this.f29495e = a11;
                this.f29492b.a(c.this.c(this, j11 - a11, timeUnit));
            }
        }

        public long a(TimeUnit timeUnit) {
            return l.b(timeUnit);
        }

        public iy.b b(Runnable runnable) {
            return c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract iy.b c(Runnable runnable, long j11, TimeUnit timeUnit);

        public iy.b g(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
            ly.d dVar = new ly.d();
            ly.d dVar2 = new ly.d(dVar);
            Runnable t11 = az.a.t(runnable);
            long nanos = timeUnit.toNanos(j12);
            long a11 = a(TimeUnit.NANOSECONDS);
            iy.b c11 = c(new a(a11 + timeUnit.toNanos(j11), t11, a11, dVar2, nanos), j11, timeUnit);
            if (c11 == ly.b.INSTANCE) {
                return c11;
            }
            dVar.a(c11);
            return dVar2;
        }
    }

    static long a(long j11, String str) {
        if ("seconds".equalsIgnoreCase(str)) {
            return TimeUnit.SECONDS.toNanos(j11);
        }
        if ("milliseconds".equalsIgnoreCase(str)) {
            return TimeUnit.MILLISECONDS.toNanos(j11);
        }
        return TimeUnit.MINUTES.toNanos(j11);
    }

    static long b(TimeUnit timeUnit) {
        if (!f29483a) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }
        return timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public abstract c c();

    public iy.b d(Runnable runnable) {
        return e(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public iy.b e(Runnable runnable, long j11, TimeUnit timeUnit) {
        c c11 = c();
        a aVar = new a(az.a.t(runnable), c11);
        c11.c(aVar, j11, timeUnit);
        return aVar;
    }

    public iy.b f(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        c c11 = c();
        b bVar = new b(az.a.t(runnable), c11);
        iy.b g11 = c11.g(bVar, j11, j12, timeUnit);
        return g11 == ly.b.INSTANCE ? g11 : bVar;
    }
}