package n5;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final a f40493b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final int f40494c;

    /* renamed from: d  reason: collision with root package name */
    static final int f40495d;

    /* renamed from: e  reason: collision with root package name */
    static final int f40496e;

    /* renamed from: a  reason: collision with root package name */
    private final Executor f40497a = new b();

    /* loaded from: classes.dex */
    private static class b implements Executor {
        private b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f40494c = availableProcessors;
        f40495d = availableProcessors + 1;
        f40496e = (availableProcessors * 2) + 1;
    }

    private a() {
    }

    public static void a(ThreadPoolExecutor threadPoolExecutor, boolean z11) {
        if (Build.VERSION.SDK_INT >= 9) {
            threadPoolExecutor.allowCoreThreadTimeOut(z11);
        }
    }

    public static ExecutorService b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f40495d, f40496e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    public static Executor c() {
        return f40493b.f40497a;
    }
}