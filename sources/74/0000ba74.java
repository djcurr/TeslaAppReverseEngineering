package vy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f54728a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f54729b;

    /* renamed from: c  reason: collision with root package name */
    static final AtomicReference<ScheduledExecutorService> f54730c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    static final Map<ScheduledThreadPoolExecutor, Object> f54731d = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it2 = new ArrayList(n.f54731d.keySet()).iterator();
            while (it2.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it2.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    n.f54731d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    static final class b implements ky.h<String, String> {
        b() {
        }

        @Override // ky.h
        /* renamed from: a */
        public String apply(String str) {
            return System.getProperty(str);
        }
    }

    static {
        b bVar = new b();
        boolean b11 = b(true, "rx3.purge-enabled", true, true, bVar);
        f54728a = b11;
        f54729b = c(b11, "rx3.purge-period-seconds", 1, 1, bVar);
        d();
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        e(f54728a, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    static boolean b(boolean z11, String str, boolean z12, boolean z13, ky.h<String, String> hVar) {
        if (z11) {
            try {
                String apply = hVar.apply(str);
                return apply == null ? z12 : "true".equals(apply);
            } catch (Throwable th2) {
                jy.a.b(th2);
                return z12;
            }
        }
        return z13;
    }

    static int c(boolean z11, String str, int i11, int i12, ky.h<String, String> hVar) {
        if (z11) {
            try {
                String apply = hVar.apply(str);
                return apply == null ? i11 : Integer.parseInt(apply);
            } catch (Throwable th2) {
                jy.a.b(th2);
                return i11;
            }
        }
        return i12;
    }

    public static void d() {
        f(f54728a);
    }

    static void e(boolean z11, ScheduledExecutorService scheduledExecutorService) {
        if (z11 && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f54731d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    static void f(boolean z11) {
        if (!z11) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f54730c;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new j("RxSchedulerPurge"));
            if (atomicReference.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                a aVar = new a();
                int i11 = f54729b;
                newScheduledThreadPool.scheduleAtFixedRate(aVar, i11, i11, TimeUnit.SECONDS);
                return;
            }
            newScheduledThreadPool.shutdownNow();
        }
    }
}