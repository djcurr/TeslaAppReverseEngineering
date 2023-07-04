package vy;

import hy.l;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class f extends hy.l {

    /* renamed from: e  reason: collision with root package name */
    static final j f54696e;

    /* renamed from: f  reason: collision with root package name */
    static final j f54697f;

    /* renamed from: i  reason: collision with root package name */
    static final c f54700i;

    /* renamed from: j  reason: collision with root package name */
    static boolean f54701j;

    /* renamed from: k  reason: collision with root package name */
    static final a f54702k;

    /* renamed from: c  reason: collision with root package name */
    final ThreadFactory f54703c;

    /* renamed from: d  reason: collision with root package name */
    final AtomicReference<a> f54704d;

    /* renamed from: h  reason: collision with root package name */
    private static final TimeUnit f54699h = TimeUnit.SECONDS;

    /* renamed from: g  reason: collision with root package name */
    private static final long f54698g = Long.getLong("rx3.io-keep-alive-time", 60).longValue();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final long f54705a;

        /* renamed from: b  reason: collision with root package name */
        private final ConcurrentLinkedQueue<c> f54706b;

        /* renamed from: c  reason: collision with root package name */
        final iy.a f54707c;

        /* renamed from: d  reason: collision with root package name */
        private final ScheduledExecutorService f54708d;

        /* renamed from: e  reason: collision with root package name */
        private final Future<?> f54709e;

        /* renamed from: f  reason: collision with root package name */
        private final ThreadFactory f54710f;

        a(long j11, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFuture;
            long nanos = timeUnit != null ? timeUnit.toNanos(j11) : 0L;
            this.f54705a = nanos;
            this.f54706b = new ConcurrentLinkedQueue<>();
            this.f54707c = new iy.a();
            this.f54710f = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, f.f54697f);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f54708d = scheduledExecutorService;
            this.f54709e = scheduledFuture;
        }

        static void a(ConcurrentLinkedQueue<c> concurrentLinkedQueue, iy.a aVar) {
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            long c11 = c();
            Iterator<c> it2 = concurrentLinkedQueue.iterator();
            while (it2.hasNext()) {
                c next = it2.next();
                if (next.l() > c11) {
                    return;
                }
                if (concurrentLinkedQueue.remove(next)) {
                    aVar.b(next);
                }
            }
        }

        static long c() {
            return System.nanoTime();
        }

        c b() {
            if (this.f54707c.isDisposed()) {
                return f.f54700i;
            }
            while (!this.f54706b.isEmpty()) {
                c poll = this.f54706b.poll();
                if (poll != null) {
                    return poll;
                }
            }
            c cVar = new c(this.f54710f);
            this.f54707c.c(cVar);
            return cVar;
        }

        void d(c cVar) {
            cVar.m(c() + this.f54705a);
            this.f54706b.offer(cVar);
        }

        void e() {
            this.f54707c.dispose();
            Future<?> future = this.f54709e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f54708d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a(this.f54706b, this.f54707c);
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends l.c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final a f54712b;

        /* renamed from: c  reason: collision with root package name */
        private final c f54713c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicBoolean f54714d = new AtomicBoolean();

        /* renamed from: a  reason: collision with root package name */
        private final iy.a f54711a = new iy.a();

        b(a aVar) {
            this.f54712b = aVar;
            this.f54713c = aVar.b();
        }

        @Override // hy.l.c
        public iy.b c(Runnable runnable, long j11, TimeUnit timeUnit) {
            if (this.f54711a.isDisposed()) {
                return ly.b.INSTANCE;
            }
            return this.f54713c.h(runnable, j11, timeUnit, this.f54711a);
        }

        @Override // iy.b
        public void dispose() {
            if (this.f54714d.compareAndSet(false, true)) {
                this.f54711a.dispose();
                if (f.f54701j) {
                    this.f54713c.h(this, 0L, TimeUnit.NANOSECONDS, null);
                } else {
                    this.f54712b.d(this.f54713c);
                }
            }
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f54714d.get();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f54712b.d(this.f54713c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends h {

        /* renamed from: c  reason: collision with root package name */
        long f54715c;

        c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f54715c = 0L;
        }

        public long l() {
            return this.f54715c;
        }

        public void m(long j11) {
            this.f54715c = j11;
        }
    }

    static {
        c cVar = new c(new j("RxCachedThreadSchedulerShutdown"));
        f54700i = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        j jVar = new j("RxCachedThreadScheduler", max);
        f54696e = jVar;
        f54697f = new j("RxCachedWorkerPoolEvictor", max);
        f54701j = Boolean.getBoolean("rx3.io-scheduled-release");
        a aVar = new a(0L, null, jVar);
        f54702k = aVar;
        aVar.e();
    }

    public f() {
        this(f54696e);
    }

    @Override // hy.l
    public l.c c() {
        return new b(this.f54704d.get());
    }

    public void g() {
        a aVar = new a(f54698g, f54699h, this.f54703c);
        if (this.f54704d.compareAndSet(f54702k, aVar)) {
            return;
        }
        aVar.e();
    }

    public f(ThreadFactory threadFactory) {
        this.f54703c = threadFactory;
        this.f54704d = new AtomicReference<>(f54702k);
        g();
    }
}