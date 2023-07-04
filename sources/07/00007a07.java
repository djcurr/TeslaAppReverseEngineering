package io.sentry;

import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class w {

    /* renamed from: g */
    private static final long f32686g = TimeUnit.HOURS.toMillis(5);

    /* renamed from: h */
    private static final long f32687h = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: i */
    private static w f32688i;

    /* renamed from: a */
    private final long f32689a;

    /* renamed from: b */
    private volatile String f32690b;

    /* renamed from: c */
    private volatile long f32691c;

    /* renamed from: d */
    private final AtomicBoolean f32692d;

    /* renamed from: e */
    private final Callable<InetAddress> f32693e;

    /* renamed from: f */
    private final ExecutorService f32694f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class b implements ThreadFactory {

        /* renamed from: a */
        private int f32695a;

        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryHostnameCache-");
            int i11 = this.f32695a;
            this.f32695a = i11 + 1;
            sb2.append(i11);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    private w() {
        this(f32686g);
    }

    public static /* synthetic */ Void a(w wVar) {
        return wVar.h();
    }

    public static /* synthetic */ InetAddress b() {
        return g();
    }

    public static w e() {
        if (f32688i == null) {
            f32688i = new w();
        }
        return f32688i;
    }

    private void f() {
        this.f32691c = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(1L);
    }

    public static /* synthetic */ InetAddress g() {
        return InetAddress.getLocalHost();
    }

    public /* synthetic */ Void h() {
        try {
            this.f32690b = this.f32693e.call().getCanonicalHostName();
            this.f32691c = System.currentTimeMillis() + this.f32689a;
            this.f32692d.set(false);
            return null;
        } catch (Throwable th2) {
            this.f32692d.set(false);
            throw th2;
        }
    }

    private void i() {
        try {
            this.f32694f.submit(new Callable() { // from class: io.sentry.u
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return w.a(w.this);
                }
            }).get(f32687h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            f();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            f();
        }
    }

    public void c() {
        this.f32694f.shutdown();
    }

    public String d() {
        if (this.f32691c < System.currentTimeMillis() && this.f32692d.compareAndSet(false, true)) {
            i();
        }
        return this.f32690b;
    }

    w(long j11) {
        this(j11, new Callable() { // from class: io.sentry.v
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return w.b();
            }
        });
    }

    w(long j11, Callable<InetAddress> callable) {
        this.f32692d = new AtomicBoolean(false);
        this.f32694f = Executors.newSingleThreadExecutor(new b());
        this.f32689a = j11;
        this.f32693e = (Callable) rz.j.a(callable, "getLocalhost is required");
        i();
    }
}