package vy;

import hy.l;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class d extends hy.l {

    /* renamed from: f  reason: collision with root package name */
    static final hy.l f54668f = bz.a.d();

    /* renamed from: c  reason: collision with root package name */
    final boolean f54669c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f54670d;

    /* renamed from: e  reason: collision with root package name */
    final Executor f54671e;

    /* loaded from: classes5.dex */
    final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final b f54672a;

        a(b bVar) {
            this.f54672a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = this.f54672a;
            bVar.f54675b.a(d.this.d(bVar));
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends AtomicReference<Runnable> implements Runnable, iy.b {

        /* renamed from: a  reason: collision with root package name */
        final ly.d f54674a;

        /* renamed from: b  reason: collision with root package name */
        final ly.d f54675b;

        b(Runnable runnable) {
            super(runnable);
            this.f54674a = new ly.d();
            this.f54675b = new ly.d();
        }

        @Override // iy.b
        public void dispose() {
            if (getAndSet(null) != null) {
                this.f54674a.dispose();
                this.f54675b.dispose();
            }
        }

        @Override // iy.b
        public boolean isDisposed() {
            return get() == null;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    runnable.run();
                    lazySet(null);
                    ly.d dVar = this.f54674a;
                    ly.a aVar = ly.a.DISPOSED;
                    dVar.lazySet(aVar);
                    this.f54675b.lazySet(aVar);
                } catch (Throwable th2) {
                    az.a.r(th2);
                    throw th2;
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends l.c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final boolean f54676a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f54677b;

        /* renamed from: c  reason: collision with root package name */
        final Executor f54678c;

        /* renamed from: e  reason: collision with root package name */
        volatile boolean f54680e;

        /* renamed from: f  reason: collision with root package name */
        final AtomicInteger f54681f = new AtomicInteger();

        /* renamed from: g  reason: collision with root package name */
        final iy.a f54682g = new iy.a();

        /* renamed from: d  reason: collision with root package name */
        final uy.a<Runnable> f54679d = new uy.a<>();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends AtomicBoolean implements Runnable, iy.b {

            /* renamed from: a  reason: collision with root package name */
            final Runnable f54683a;

            a(Runnable runnable) {
                this.f54683a = runnable;
            }

            @Override // iy.b
            public void dispose() {
                lazySet(true);
            }

            @Override // iy.b
            public boolean isDisposed() {
                return get();
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get()) {
                    return;
                }
                try {
                    this.f54683a.run();
                } finally {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends AtomicInteger implements Runnable, iy.b {

            /* renamed from: a  reason: collision with root package name */
            final Runnable f54684a;

            /* renamed from: b  reason: collision with root package name */
            final iy.c f54685b;

            /* renamed from: c  reason: collision with root package name */
            volatile Thread f54686c;

            b(Runnable runnable, iy.c cVar) {
                this.f54684a = runnable;
                this.f54685b = cVar;
            }

            void a() {
                iy.c cVar = this.f54685b;
                if (cVar != null) {
                    cVar.a(this);
                }
            }

            @Override // iy.b
            public void dispose() {
                while (true) {
                    int i11 = get();
                    if (i11 >= 2) {
                        return;
                    }
                    if (i11 == 0) {
                        if (compareAndSet(0, 4)) {
                            a();
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.f54686c;
                        if (thread != null) {
                            thread.interrupt();
                            this.f54686c = null;
                        }
                        set(4);
                        a();
                        return;
                    }
                }
            }

            @Override // iy.b
            public boolean isDisposed() {
                return get() >= 2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get() == 0) {
                    this.f54686c = Thread.currentThread();
                    if (compareAndSet(0, 1)) {
                        try {
                            this.f54684a.run();
                            this.f54686c = null;
                            if (compareAndSet(1, 2)) {
                                a();
                                return;
                            }
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                            return;
                        } catch (Throwable th2) {
                            try {
                                az.a.r(th2);
                                throw th2;
                            } catch (Throwable th3) {
                                this.f54686c = null;
                                if (!compareAndSet(1, 2)) {
                                    while (get() == 3) {
                                        Thread.yield();
                                    }
                                    Thread.interrupted();
                                } else {
                                    a();
                                }
                                throw th3;
                            }
                        }
                    }
                    this.f54686c = null;
                }
            }
        }

        /* renamed from: vy.d$c$c  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        final class RunnableC1236c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private final ly.d f54687a;

            /* renamed from: b  reason: collision with root package name */
            private final Runnable f54688b;

            RunnableC1236c(ly.d dVar, Runnable runnable) {
                this.f54687a = dVar;
                this.f54688b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f54687a.a(c.this.b(this.f54688b));
            }
        }

        public c(Executor executor, boolean z11, boolean z12) {
            this.f54678c = executor;
            this.f54676a = z11;
            this.f54677b = z12;
        }

        @Override // hy.l.c
        public iy.b b(Runnable runnable) {
            iy.b aVar;
            if (this.f54680e) {
                return ly.b.INSTANCE;
            }
            Runnable t11 = az.a.t(runnable);
            if (this.f54676a) {
                aVar = new b(t11, this.f54682g);
                this.f54682g.c(aVar);
            } else {
                aVar = new a(t11);
            }
            this.f54679d.offer(aVar);
            if (this.f54681f.getAndIncrement() == 0) {
                try {
                    this.f54678c.execute(this);
                } catch (RejectedExecutionException e11) {
                    this.f54680e = true;
                    this.f54679d.clear();
                    az.a.r(e11);
                    return ly.b.INSTANCE;
                }
            }
            return aVar;
        }

        @Override // hy.l.c
        public iy.b c(Runnable runnable, long j11, TimeUnit timeUnit) {
            if (j11 <= 0) {
                return b(runnable);
            }
            if (this.f54680e) {
                return ly.b.INSTANCE;
            }
            ly.d dVar = new ly.d();
            ly.d dVar2 = new ly.d(dVar);
            m mVar = new m(new RunnableC1236c(dVar2, az.a.t(runnable)), this.f54682g);
            this.f54682g.c(mVar);
            Executor executor = this.f54678c;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    mVar.a(((ScheduledExecutorService) executor).schedule((Callable) mVar, j11, timeUnit));
                } catch (RejectedExecutionException e11) {
                    this.f54680e = true;
                    az.a.r(e11);
                    return ly.b.INSTANCE;
                }
            } else {
                mVar.a(new vy.c(d.f54668f.e(mVar, j11, timeUnit)));
            }
            dVar.a(mVar);
            return dVar2;
        }

        @Override // iy.b
        public void dispose() {
            if (this.f54680e) {
                return;
            }
            this.f54680e = true;
            this.f54682g.dispose();
            if (this.f54681f.getAndIncrement() == 0) {
                this.f54679d.clear();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
            if (r3.f54680e == false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
            r0.clear();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
            r1 = r3.f54681f.addAndGet(-r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
            if (r1 != 0) goto L2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void h() {
            /*
                r3 = this;
                uy.a<java.lang.Runnable> r0 = r3.f54679d
                r1 = 1
            L3:
                boolean r2 = r3.f54680e
                if (r2 == 0) goto Lb
                r0.clear()
                return
            Lb:
                java.lang.Object r2 = r0.poll()
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                if (r2 != 0) goto L25
                boolean r2 = r3.f54680e
                if (r2 == 0) goto L1b
                r0.clear()
                return
            L1b:
                java.util.concurrent.atomic.AtomicInteger r2 = r3.f54681f
                int r1 = -r1
                int r1 = r2.addAndGet(r1)
                if (r1 != 0) goto L3
                return
            L25:
                r2.run()
                boolean r2 = r3.f54680e
                if (r2 == 0) goto Lb
                r0.clear()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vy.d.c.h():void");
        }

        void i() {
            uy.a<Runnable> aVar = this.f54679d;
            if (this.f54680e) {
                aVar.clear();
                return;
            }
            aVar.poll().run();
            if (this.f54680e) {
                aVar.clear();
            } else if (this.f54681f.decrementAndGet() != 0) {
                this.f54678c.execute(this);
            }
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f54680e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f54677b) {
                i();
            } else {
                h();
            }
        }
    }

    public d(Executor executor, boolean z11, boolean z12) {
        this.f54671e = executor;
        this.f54669c = z11;
        this.f54670d = z12;
    }

    @Override // hy.l
    public l.c c() {
        return new c(this.f54671e, this.f54669c, this.f54670d);
    }

    @Override // hy.l
    public iy.b d(Runnable runnable) {
        Runnable t11 = az.a.t(runnable);
        try {
            if (this.f54671e instanceof ExecutorService) {
                l lVar = new l(t11, this.f54669c);
                lVar.b(((ExecutorService) this.f54671e).submit(lVar));
                return lVar;
            } else if (this.f54669c) {
                c.b bVar = new c.b(t11, null);
                this.f54671e.execute(bVar);
                return bVar;
            } else {
                c.a aVar = new c.a(t11);
                this.f54671e.execute(aVar);
                return aVar;
            }
        } catch (RejectedExecutionException e11) {
            az.a.r(e11);
            return ly.b.INSTANCE;
        }
    }

    @Override // hy.l
    public iy.b e(Runnable runnable, long j11, TimeUnit timeUnit) {
        Runnable t11 = az.a.t(runnable);
        if (this.f54671e instanceof ScheduledExecutorService) {
            try {
                l lVar = new l(t11, this.f54669c);
                lVar.b(((ScheduledExecutorService) this.f54671e).schedule(lVar, j11, timeUnit));
                return lVar;
            } catch (RejectedExecutionException e11) {
                az.a.r(e11);
                return ly.b.INSTANCE;
            }
        }
        b bVar = new b(t11);
        bVar.f54674a.a(f54668f.e(new a(bVar), j11, timeUnit));
        return bVar;
    }

    @Override // hy.l
    public iy.b f(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        if (this.f54671e instanceof ScheduledExecutorService) {
            try {
                k kVar = new k(az.a.t(runnable), this.f54669c);
                kVar.b(((ScheduledExecutorService) this.f54671e).scheduleAtFixedRate(kVar, j11, j12, timeUnit));
                return kVar;
            } catch (RejectedExecutionException e11) {
                az.a.r(e11);
                return ly.b.INSTANCE;
            }
        }
        return super.f(runnable, j11, j12, timeUnit);
    }
}