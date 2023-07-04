package ma;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a implements ExecutorService {

    /* renamed from: b  reason: collision with root package name */
    private static final long f38462b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c  reason: collision with root package name */
    private static volatile int f38463c;

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f38464a;

    /* renamed from: ma.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0738a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f38465a;

        /* renamed from: b  reason: collision with root package name */
        private int f38466b;

        /* renamed from: c  reason: collision with root package name */
        private int f38467c;

        /* renamed from: d  reason: collision with root package name */
        private c f38468d = c.f38477b;

        /* renamed from: e  reason: collision with root package name */
        private String f38469e;

        /* renamed from: f  reason: collision with root package name */
        private long f38470f;

        C0738a(boolean z11) {
            this.f38465a = z11;
        }

        public a a() {
            if (!TextUtils.isEmpty(this.f38469e)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f38466b, this.f38467c, this.f38470f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new b(this.f38469e, this.f38468d, this.f38465a));
                if (this.f38470f != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new a(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f38469e);
        }

        public C0738a b(String str) {
            this.f38469e = str;
            return this;
        }

        public C0738a c(int i11) {
            this.f38466b = i11;
            this.f38467c = i11;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final String f38471a;

        /* renamed from: b  reason: collision with root package name */
        final c f38472b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f38473c;

        /* renamed from: d  reason: collision with root package name */
        private int f38474d;

        /* renamed from: ma.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0739a extends Thread {
            C0739a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                if (b.this.f38473c) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th2) {
                    b.this.f38472b.a(th2);
                }
            }
        }

        b(String str, c cVar, boolean z11) {
            this.f38471a = str;
            this.f38472b = cVar;
            this.f38473c = z11;
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            C0739a c0739a;
            c0739a = new C0739a(runnable, "glide-" + this.f38471a + "-thread-" + this.f38474d);
            this.f38474d = this.f38474d + 1;
            return c0739a;
        }
    }

    /* loaded from: classes.dex */
    public interface c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f38476a;

        /* renamed from: b  reason: collision with root package name */
        public static final c f38477b;

        /* renamed from: ma.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0740a implements c {
            C0740a() {
            }

            @Override // ma.a.c
            public void a(Throwable th2) {
            }
        }

        /* loaded from: classes.dex */
        class b implements c {
            b() {
            }

            @Override // ma.a.c
            public void a(Throwable th2) {
                if (th2 == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
            }
        }

        /* renamed from: ma.a$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0741c implements c {
            C0741c() {
            }

            @Override // ma.a.c
            public void a(Throwable th2) {
                if (th2 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th2);
                }
            }
        }

        static {
            new C0740a();
            b bVar = new b();
            f38476a = bVar;
            new C0741c();
            f38477b = bVar;
        }

        void a(Throwable th2);
    }

    a(ExecutorService executorService) {
        this.f38464a = executorService;
    }

    public static int a() {
        if (f38463c == 0) {
            f38463c = Math.min(4, ma.b.a());
        }
        return f38463c;
    }

    public static C0738a b() {
        return new C0738a(true).c(a() >= 4 ? 2 : 1).b("animation");
    }

    public static a c() {
        return b().a();
    }

    public static C0738a d() {
        return new C0738a(true).c(1).b("disk-cache");
    }

    public static a e() {
        return d().a();
    }

    public static C0738a f() {
        return new C0738a(false).c(a()).b(Stripe3ds2AuthParams.FIELD_SOURCE);
    }

    public static a g() {
        return f().a();
    }

    public static a h() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f38462b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new b("source-unlimited", c.f38477b, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j11, TimeUnit timeUnit) {
        return this.f38464a.awaitTermination(j11, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f38464a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f38464a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f38464a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f38464a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f38464a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f38464a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f38464a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f38464a.submit(runnable);
    }

    public String toString() {
        return this.f38464a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j11, TimeUnit timeUnit) {
        return this.f38464a.invokeAll(collection, j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j11, TimeUnit timeUnit) {
        return (T) this.f38464a.invokeAny(collection, j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t11) {
        return this.f38464a.submit(runnable, t11);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f38464a.submit(callable);
    }
}