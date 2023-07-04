package s3;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
class g {

    /* loaded from: classes.dex */
    private static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private String f50229a;

        /* renamed from: b  reason: collision with root package name */
        private int f50230b;

        /* renamed from: s3.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C1113a extends Thread {

            /* renamed from: a  reason: collision with root package name */
            private final int f50231a;

            C1113a(Runnable runnable, String str, int i11) {
                super(runnable, str);
                this.f50231a = i11;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f50231a);
                super.run();
            }
        }

        a(String str, int i11) {
            this.f50229a = str;
            this.f50230b = i11;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C1113a(runnable, this.f50229a, this.f50230b);
        }
    }

    /* loaded from: classes.dex */
    private static class b<T> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Callable<T> f50232a;

        /* renamed from: b  reason: collision with root package name */
        private v3.a<T> f50233b;

        /* renamed from: c  reason: collision with root package name */
        private Handler f50234c;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v3.a f50235a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f50236b;

            a(b bVar, v3.a aVar, Object obj) {
                this.f50235a = aVar;
                this.f50236b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f50235a.accept(this.f50236b);
            }
        }

        b(Handler handler, Callable<T> callable, v3.a<T> aVar) {
            this.f50232a = callable;
            this.f50233b = aVar;
            this.f50234c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t11;
            try {
                t11 = this.f50232a.call();
            } catch (Exception unused) {
                t11 = null;
            }
            this.f50234c.post(new a(this, this.f50233b, t11));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ThreadPoolExecutor a(String str, int i11, int i12) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i12, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i11));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void b(Executor executor, Callable<T> callable, v3.a<T> aVar) {
        executor.execute(new b(s3.b.a(), callable, aVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T c(ExecutorService executorService, Callable<T> callable, int i11) {
        try {
            return executorService.submit(callable).get(i11, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e11) {
            throw e11;
        } catch (ExecutionException e12) {
            throw new RuntimeException(e12);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}