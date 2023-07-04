package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Debug;
import android.os.SystemClock;
import io.sentry.f3;
import io.sentry.q1;
import java.io.File;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class q implements io.sentry.k0 {

    /* renamed from: a */
    private int f32122a;

    /* renamed from: g */
    private final Context f32128g;

    /* renamed from: h */
    private final SentryAndroidOptions f32129h;

    /* renamed from: i */
    private final a0 f32130i;

    /* renamed from: j */
    private final PackageInfo f32131j;

    /* renamed from: b */
    private File f32123b = null;

    /* renamed from: c */
    private File f32124c = null;

    /* renamed from: d */
    private Future<?> f32125d = null;

    /* renamed from: e */
    private volatile io.sentry.j0 f32126e = null;

    /* renamed from: f */
    private volatile q1 f32127f = null;

    /* renamed from: k */
    private long f32132k = 0;

    /* renamed from: l */
    private boolean f32133l = false;

    public q(Context context, SentryAndroidOptions sentryAndroidOptions, a0 a0Var) {
        this.f32128g = (Context) rz.j.a(context, "The application context is required");
        SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) rz.j.a(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f32129h = sentryAndroidOptions2;
        this.f32130i = (a0) rz.j.a(a0Var, "The BuildInfoProvider is required.");
        this.f32131j = b0.b(context, sentryAndroidOptions2.getLogger());
    }

    public static /* synthetic */ List c() {
        return g();
    }

    public static /* synthetic */ void d(q qVar, io.sentry.j0 j0Var) {
        qVar.h(j0Var);
    }

    private ActivityManager.MemoryInfo e() {
        try {
            ActivityManager activityManager = (ActivityManager) this.f32128g.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            this.f32129h.getLogger().c(f3.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th2) {
            this.f32129h.getLogger().b(f3.ERROR, "Error getting MemoryInfo.", th2);
            return null;
        }
    }

    private void f() {
        if (this.f32133l) {
            return;
        }
        this.f32133l = true;
        String profilingTracesDirPath = this.f32129h.getProfilingTracesDirPath();
        if (!this.f32129h.isProfilingEnabled()) {
            this.f32129h.getLogger().c(f3.INFO, "Profiling is disabled in options.", new Object[0]);
        } else if (profilingTracesDirPath == null) {
            this.f32129h.getLogger().c(f3.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
        } else {
            long profilingTracesIntervalMillis = this.f32129h.getProfilingTracesIntervalMillis();
            if (profilingTracesIntervalMillis <= 0) {
                this.f32129h.getLogger().c(f3.WARNING, "Disabling profiling because trace interval is set to %d milliseconds", Long.valueOf(profilingTracesIntervalMillis));
                return;
            }
            this.f32122a = (int) TimeUnit.MILLISECONDS.toMicros(profilingTracesIntervalMillis);
            this.f32124c = new File(profilingTracesDirPath);
        }
    }

    public static /* synthetic */ List g() {
        return kz.b.a().c();
    }

    public /* synthetic */ void h(io.sentry.j0 j0Var) {
        this.f32127f = b(j0Var);
    }

    @Override // io.sentry.k0
    public synchronized void a(final io.sentry.j0 j0Var) {
        if (this.f32130i.d() < 21) {
            return;
        }
        f();
        File file = this.f32124c;
        if (file != null && this.f32122a != 0 && file.exists()) {
            if (this.f32126e != null) {
                this.f32129h.getLogger().c(f3.WARNING, "Profiling is already active and was started by transaction %s", this.f32126e.h().h().toString());
                return;
            }
            File file2 = this.f32124c;
            File file3 = new File(file2, UUID.randomUUID() + ".trace");
            this.f32123b = file3;
            if (file3.exists()) {
                this.f32129h.getLogger().c(f3.DEBUG, "Trace file already exists: %s", this.f32123b.getPath());
                return;
            }
            this.f32126e = j0Var;
            this.f32125d = this.f32129h.getExecutorService().b(new Runnable() { // from class: io.sentry.android.core.o
                {
                    q.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    q.d(q.this, j0Var);
                }
            }, 30000L);
            this.f32132k = SystemClock.elapsedRealtimeNanos();
            Debug.startMethodTracingSampling(this.f32123b.getPath(), 3000000, this.f32122a);
        }
    }

    @Override // io.sentry.k0
    public synchronized q1 b(io.sentry.j0 j0Var) {
        if (this.f32130i.d() < 21) {
            return null;
        }
        io.sentry.j0 j0Var2 = this.f32126e;
        q1 q1Var = this.f32127f;
        if (j0Var2 == null) {
            if (q1Var != null) {
                if (q1Var.x().equals(j0Var.h().h().toString())) {
                    this.f32127f = null;
                    return q1Var;
                }
                this.f32129h.getLogger().c(f3.ERROR, "Profiling data with id %s exists but doesn't match the closing transaction %s", q1Var.x(), j0Var.h().h().toString());
                return null;
            }
            this.f32129h.getLogger().c(f3.INFO, "Transaction %s finished, but profiling never started for it. Skipping", j0Var.h().h().toString());
            return null;
        } else if (j0Var2 != j0Var) {
            this.f32129h.getLogger().c(f3.DEBUG, "Transaction %s finished, but profiling was started by transaction %s. Skipping", j0Var.h().h().toString(), j0Var2.h().h().toString());
            return null;
        } else {
            Debug.stopMethodTracing();
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - this.f32132k;
            this.f32126e = null;
            Future<?> future = this.f32125d;
            if (future != null) {
                future.cancel(true);
                this.f32125d = null;
            }
            if (this.f32123b == null) {
                this.f32129h.getLogger().c(f3.ERROR, "Trace file does not exists", new Object[0]);
                return null;
            }
            String str = "";
            String str2 = "";
            ActivityManager.MemoryInfo e11 = e();
            PackageInfo packageInfo = this.f32131j;
            if (packageInfo != null) {
                str = b0.e(packageInfo);
                str2 = b0.c(this.f32131j);
            }
            return new q1(this.f32123b, j0Var, Long.toString(elapsedRealtimeNanos), this.f32130i.d(), new Callable() { // from class: io.sentry.android.core.p
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return q.c();
                }
            }, this.f32130i.b(), this.f32130i.c(), this.f32130i.e(), this.f32130i.f(), e11 != null ? Long.toString(e11.totalMem) : "0", this.f32129h.getProguardUuid(), str, str2, this.f32129h.getEnvironment());
        }
    }
}