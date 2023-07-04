package io.sentry;

import java.io.File;
import java.util.Date;
import org.jetbrains.annotations.ApiStatus;

/* loaded from: classes5.dex */
public final class c2 {

    /* renamed from: a */
    private static final ThreadLocal<c0> f32207a = new ThreadLocal<>();

    /* renamed from: b */
    private static volatile c0 f32208b = b1.a();

    /* renamed from: c */
    private static volatile boolean f32209c = false;

    /* loaded from: classes5.dex */
    public interface a<T extends g3> {
        void a(T t11);
    }

    public static /* synthetic */ void a(File[] fileArr) {
        n(fileArr);
    }

    public static void b(c cVar, t tVar) {
        i().h(cVar, tVar);
    }

    public static io.sentry.protocol.o c(b3 b3Var, t tVar) {
        return i().o(b3Var, tVar);
    }

    public static io.sentry.protocol.o d(Throwable th2, t tVar) {
        return i().q(th2, tVar);
    }

    public static synchronized void e() {
        synchronized (c2.class) {
            c0 i11 = i();
            f32208b = b1.a();
            f32207a.remove();
            i11.close();
        }
    }

    public static void f(v1 v1Var) {
        i().i(v1Var);
    }

    public static void g() {
        i().n();
    }

    public static void h(long j11) {
        i().d(j11);
    }

    @ApiStatus.Internal
    public static c0 i() {
        if (f32209c) {
            return f32208b;
        }
        ThreadLocal<c0> threadLocal = f32207a;
        c0 c0Var = threadLocal.get();
        if (c0Var == null || (c0Var instanceof b1)) {
            c0 clone = f32208b.clone();
            threadLocal.set(clone);
            return clone;
        }
        return c0Var;
    }

    public static <T extends g3> void j(l1<T> l1Var, a<T> aVar, boolean z11) {
        T b11 = l1Var.b();
        aVar.a(b11);
        k(b11, z11);
    }

    private static synchronized void k(g3 g3Var, boolean z11) {
        synchronized (c2.class) {
            if (m()) {
                g3Var.getLogger().c(f3.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
            }
            if (l(g3Var)) {
                g3Var.getLogger().c(f3.INFO, "GlobalHubMode: '%s'", String.valueOf(z11));
                f32209c = z11;
                c0 i11 = i();
                f32208b = new y(g3Var);
                f32207a.set(f32208b);
                i11.close();
                for (m0 m0Var : g3Var.getIntegrations()) {
                    m0Var.a(z.a(), g3Var);
                }
            }
        }
    }

    private static boolean l(g3 g3Var) {
        if (g3Var.isEnableExternalConfiguration()) {
            g3Var.merge(s.f(nz.g.a(), g3Var.getLogger()));
        }
        String dsn = g3Var.getDsn();
        if (dsn != null) {
            if (dsn.isEmpty()) {
                e();
                return false;
            }
            new k(dsn);
            d0 logger = g3Var.getLogger();
            if (g3Var.isDebug() && (logger instanceof c1)) {
                g3Var.setLogger(new b4());
                logger = g3Var.getLogger();
            }
            f3 f3Var = f3.INFO;
            logger.c(f3Var, "Initializing SDK with DSN: '%s'", g3Var.getDsn());
            String outboxPath = g3Var.getOutboxPath();
            if (outboxPath != null) {
                new File(outboxPath).mkdirs();
            } else {
                logger.c(f3Var, "No outbox dir path is defined in options.", new Object[0]);
            }
            String cacheDirPath = g3Var.getCacheDirPath();
            if (cacheDirPath != null) {
                new File(cacheDirPath).mkdirs();
                g3Var.setEnvelopeDiskCache(lz.d.t(g3Var));
            }
            String profilingTracesDirPath = g3Var.getProfilingTracesDirPath();
            if (g3Var.isProfilingEnabled() && profilingTracesDirPath != null) {
                File file = new File(profilingTracesDirPath);
                file.mkdirs();
                final File[] listFiles = file.listFiles();
                g3Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.b2
                    @Override // java.lang.Runnable
                    public final void run() {
                        c2.a(listFiles);
                    }
                });
            }
            return true;
        }
        throw new IllegalArgumentException("DSN is required. Use empty string to disable SDK.");
    }

    public static boolean m() {
        return i().isEnabled();
    }

    public static /* synthetic */ void n(File[] fileArr) {
        if (fileArr == null) {
            return;
        }
        for (File file : fileArr) {
            rz.c.a(file);
        }
    }

    public static void o() {
        i().s();
    }

    @ApiStatus.Internal
    public static j0 p(e4 e4Var, e eVar, boolean z11, Date date, boolean z12, Long l11, boolean z13, f4 f4Var) {
        return i().k(e4Var, eVar, z11, date, z12, l11, z13, f4Var);
    }
}