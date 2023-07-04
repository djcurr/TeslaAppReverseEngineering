package l5;

import androidx.work.q;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class p {

    /* renamed from: f  reason: collision with root package name */
    private static final String f36648f = q.f("WorkTimer");

    /* renamed from: a  reason: collision with root package name */
    private final ThreadFactory f36649a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f36650b;

    /* renamed from: c  reason: collision with root package name */
    final Map<String, c> f36651c;

    /* renamed from: d  reason: collision with root package name */
    final Map<String, b> f36652d;

    /* renamed from: e  reason: collision with root package name */
    final Object f36653e;

    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private int f36654a = 0;

        a(p pVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f36654a);
            this.f36654a = this.f36654a + 1;
            return newThread;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(String str);
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final p f36655a;

        /* renamed from: b  reason: collision with root package name */
        private final String f36656b;

        c(p pVar, String str) {
            this.f36655a = pVar;
            this.f36656b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f36655a.f36653e) {
                if (this.f36655a.f36651c.remove(this.f36656b) != null) {
                    b remove = this.f36655a.f36652d.remove(this.f36656b);
                    if (remove != null) {
                        remove.a(this.f36656b);
                    }
                } else {
                    q.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f36656b), new Throwable[0]);
                }
            }
        }
    }

    public p() {
        a aVar = new a(this);
        this.f36649a = aVar;
        this.f36651c = new HashMap();
        this.f36652d = new HashMap();
        this.f36653e = new Object();
        this.f36650b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a() {
        if (this.f36650b.isShutdown()) {
            return;
        }
        this.f36650b.shutdownNow();
    }

    public void b(String str, long j11, b bVar) {
        synchronized (this.f36653e) {
            q.c().a(f36648f, String.format("Starting timer for %s", str), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.f36651c.put(str, cVar);
            this.f36652d.put(str, bVar);
            this.f36650b.schedule(cVar, j11, TimeUnit.MILLISECONDS);
        }
    }

    public void c(String str) {
        synchronized (this.f36653e) {
            if (this.f36651c.remove(str) != null) {
                q.c().a(f36648f, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f36652d.remove(str);
            }
        }
    }
}