package b0;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class e implements Executor {

    /* renamed from: b  reason: collision with root package name */
    private static volatile Executor f7162b;

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f7163a = Executors.newFixedThreadPool(2, new a(this));

    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f7164a = new AtomicInteger(0);

        a(e eVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f7164a.getAndIncrement())));
            return thread;
        }
    }

    e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor a() {
        if (f7162b != null) {
            return f7162b;
        }
        synchronized (e.class) {
            if (f7162b == null) {
                f7162b = new e();
            }
        }
        return f7162b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f7163a.execute(runnable);
    }
}