package kd;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class b extends AbstractExecutorService {

    /* renamed from: h  reason: collision with root package name */
    private static final Class<?> f34560h = b.class;

    /* renamed from: a  reason: collision with root package name */
    private final String f34561a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f34562b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f34563c;

    /* renamed from: d  reason: collision with root package name */
    private final BlockingQueue<Runnable> f34564d;

    /* renamed from: e  reason: collision with root package name */
    private final RunnableC0643b f34565e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicInteger f34566f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicInteger f34567g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kd.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0643b implements Runnable {
        private RunnableC0643b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Runnable runnable = (Runnable) b.this.f34564d.poll();
                if (runnable == null) {
                    nd.a.w(b.f34560h, "%s: Worker has nothing to run", b.this.f34561a);
                } else {
                    runnable.run();
                }
                int decrementAndGet = b.this.f34566f.decrementAndGet();
                if (!b.this.f34564d.isEmpty()) {
                    b.this.f();
                } else {
                    nd.a.x(b.f34560h, "%s: worker finished; %d workers left", b.this.f34561a, Integer.valueOf(decrementAndGet));
                }
            } catch (Throwable th2) {
                int decrementAndGet2 = b.this.f34566f.decrementAndGet();
                if (!b.this.f34564d.isEmpty()) {
                    b.this.f();
                } else {
                    nd.a.x(b.f34560h, "%s: worker finished; %d workers left", b.this.f34561a, Integer.valueOf(decrementAndGet2));
                }
                throw th2;
            }
        }
    }

    public b(String str, int i11, Executor executor, BlockingQueue<Runnable> blockingQueue) {
        if (i11 > 0) {
            this.f34561a = str;
            this.f34562b = executor;
            this.f34563c = i11;
            this.f34564d = blockingQueue;
            this.f34565e = new RunnableC0643b();
            this.f34566f = new AtomicInteger(0);
            this.f34567g = new AtomicInteger(0);
            return;
        }
        throw new IllegalArgumentException("max concurrency must be > 0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        int i11 = this.f34566f.get();
        while (i11 < this.f34563c) {
            int i12 = i11 + 1;
            if (this.f34566f.compareAndSet(i11, i12)) {
                nd.a.y(f34560h, "%s: starting worker %d of %d", this.f34561a, Integer.valueOf(i12), Integer.valueOf(this.f34563c));
                this.f34562b.execute(this.f34565e);
                return;
            }
            nd.a.w(f34560h, "%s: race in startWorkerIfNeeded; retrying", this.f34561a);
            i11 = this.f34566f.get();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Objects.requireNonNull(runnable, "runnable parameter is null");
        if (this.f34564d.offer(runnable)) {
            int size = this.f34564d.size();
            int i11 = this.f34567g.get();
            if (size > i11 && this.f34567g.compareAndSet(i11, size)) {
                nd.a.x(f34560h, "%s: max pending work in queue = %d", this.f34561a, Integer.valueOf(size));
            }
            f();
            return;
        }
        throw new RejectedExecutionException(this.f34561a + " queue is full, size=" + this.f34564d.size());
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
}