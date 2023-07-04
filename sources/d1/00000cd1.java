package bn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final bn.a f7889a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile bn.a f7890b;

    /* renamed from: bn.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static class C0153b implements bn.a {
        private C0153b() {
        }

        @Override // bn.a
        public ExecutorService a(ThreadFactory threadFactory, c cVar) {
            return b(1, threadFactory, cVar);
        }

        public ExecutorService b(int i11, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i11, i11, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0153b c0153b = new C0153b();
        f7889a = c0153b;
        f7890b = c0153b;
    }

    public static bn.a a() {
        return f7890b;
    }
}