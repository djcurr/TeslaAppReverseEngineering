package b0;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class d implements Executor {

    /* renamed from: b  reason: collision with root package name */
    private static volatile Executor f7160b;

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f7161a = Executors.newSingleThreadExecutor(new a(this));

    /* loaded from: classes.dex */
    class a implements ThreadFactory {
        a(d dVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor a() {
        if (f7160b != null) {
            return f7160b;
        }
        synchronized (d.class) {
            if (f7160b == null) {
                f7160b = new d();
            }
        }
        return f7160b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f7161a.execute(runnable);
    }
}