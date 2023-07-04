package androidx.camera.core;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
class i implements Executor {

    /* renamed from: c  reason: collision with root package name */
    private static final ThreadFactory f2237c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Object f2238a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private ThreadPoolExecutor f2239b = a();

    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f2240a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f2240a.getAndIncrement())));
            return thread;
        }
    }

    private static ThreadPoolExecutor a() {
        return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f2237c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        synchronized (this.f2238a) {
            if (!this.f2239b.isShutdown()) {
                this.f2239b.shutdown();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(androidx.camera.core.impl.q qVar) {
        ThreadPoolExecutor threadPoolExecutor;
        v3.h.f(qVar);
        synchronized (this.f2238a) {
            if (this.f2239b.isShutdown()) {
                this.f2239b = a();
            }
            threadPoolExecutor = this.f2239b;
        }
        int max = Math.max(1, qVar.b().size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        v3.h.f(runnable);
        synchronized (this.f2238a) {
            this.f2239b.execute(runnable);
        }
    }
}