package n5;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
final class b {

    /* renamed from: c  reason: collision with root package name */
    private static final b f40498c = new b();

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f40499a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f40500b;

    /* renamed from: n5.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class ExecutorC0795b implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private ThreadLocal<Integer> f40501a;

        private ExecutorC0795b() {
            this.f40501a = new ThreadLocal<>();
        }

        private int a() {
            Integer num = this.f40501a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f40501a.remove();
            } else {
                this.f40501a.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        private int b() {
            Integer num = this.f40501a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.f40501a.set(Integer.valueOf(intValue));
            return intValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (b() <= 15) {
                    runnable.run();
                } else {
                    b.a().execute(runnable);
                }
            } finally {
                a();
            }
        }
    }

    private b() {
        this.f40499a = !c() ? Executors.newCachedThreadPool() : n5.a.b();
        Executors.newSingleThreadScheduledExecutor();
        this.f40500b = new ExecutorC0795b();
    }

    public static ExecutorService a() {
        return f40498c.f40499a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor b() {
        return f40498c.f40500b;
    }

    private static boolean c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }
}