package vy;

import hy.l;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class p extends hy.l {

    /* renamed from: c  reason: collision with root package name */
    private static final p f54738c = new p();

    /* loaded from: classes5.dex */
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final Runnable f54739a;

        /* renamed from: b  reason: collision with root package name */
        private final c f54740b;

        /* renamed from: c  reason: collision with root package name */
        private final long f54741c;

        a(Runnable runnable, c cVar, long j11) {
            this.f54739a = runnable;
            this.f54740b = cVar;
            this.f54741c = j11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f54740b.f54749d) {
                return;
            }
            long a11 = this.f54740b.a(TimeUnit.MILLISECONDS);
            long j11 = this.f54741c;
            if (j11 > a11) {
                try {
                    Thread.sleep(j11 - a11);
                } catch (InterruptedException e11) {
                    Thread.currentThread().interrupt();
                    az.a.r(e11);
                    return;
                }
            }
            if (this.f54740b.f54749d) {
                return;
            }
            this.f54739a.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: a  reason: collision with root package name */
        final Runnable f54742a;

        /* renamed from: b  reason: collision with root package name */
        final long f54743b;

        /* renamed from: c  reason: collision with root package name */
        final int f54744c;

        /* renamed from: d  reason: collision with root package name */
        volatile boolean f54745d;

        b(Runnable runnable, Long l11, int i11) {
            this.f54742a = runnable;
            this.f54743b = l11.longValue();
            this.f54744c = i11;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(b bVar) {
            int compare = Long.compare(this.f54743b, bVar.f54743b);
            return compare == 0 ? Integer.compare(this.f54744c, bVar.f54744c) : compare;
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends l.c {

        /* renamed from: a  reason: collision with root package name */
        final PriorityBlockingQueue<b> f54746a = new PriorityBlockingQueue<>();

        /* renamed from: b  reason: collision with root package name */
        private final AtomicInteger f54747b = new AtomicInteger();

        /* renamed from: c  reason: collision with root package name */
        final AtomicInteger f54748c = new AtomicInteger();

        /* renamed from: d  reason: collision with root package name */
        volatile boolean f54749d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final b f54750a;

            a(b bVar) {
                this.f54750a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f54750a.f54745d = true;
                c.this.f54746a.remove(this.f54750a);
            }
        }

        c() {
        }

        @Override // hy.l.c
        public iy.b b(Runnable runnable) {
            return h(runnable, a(TimeUnit.MILLISECONDS));
        }

        @Override // hy.l.c
        public iy.b c(Runnable runnable, long j11, TimeUnit timeUnit) {
            long a11 = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j11);
            return h(new a(runnable, this, a11), a11);
        }

        @Override // iy.b
        public void dispose() {
            this.f54749d = true;
        }

        iy.b h(Runnable runnable, long j11) {
            if (this.f54749d) {
                return ly.b.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j11), this.f54748c.incrementAndGet());
            this.f54746a.add(bVar);
            if (this.f54747b.getAndIncrement() == 0) {
                int i11 = 1;
                while (!this.f54749d) {
                    b poll = this.f54746a.poll();
                    if (poll == null) {
                        i11 = this.f54747b.addAndGet(-i11);
                        if (i11 == 0) {
                            return ly.b.INSTANCE;
                        }
                    } else if (!poll.f54745d) {
                        poll.f54742a.run();
                    }
                }
                this.f54746a.clear();
                return ly.b.INSTANCE;
            }
            return iy.b.f(new a(bVar));
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f54749d;
        }
    }

    p() {
    }

    public static p g() {
        return f54738c;
    }

    @Override // hy.l
    public l.c c() {
        return new c();
    }

    @Override // hy.l
    public iy.b d(Runnable runnable) {
        az.a.t(runnable).run();
        return ly.b.INSTANCE;
    }

    @Override // hy.l
    public iy.b e(Runnable runnable, long j11, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j11);
            az.a.t(runnable).run();
        } catch (InterruptedException e11) {
            Thread.currentThread().interrupt();
            az.a.r(e11);
        }
        return ly.b.INSTANCE;
    }
}