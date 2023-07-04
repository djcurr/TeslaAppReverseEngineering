package io.sentry.android.core;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import io.sentry.f3;
import io.sentry.f4;
import io.sentry.g3;
import io.sentry.u1;
import io.sentry.v1;
import io.sentry.x3;
import java.io.Closeable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.jetbrains.annotations.VisibleForTesting;

/* loaded from: classes5.dex */
public final class j implements io.sentry.m0, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Application f32089a;

    /* renamed from: b */
    private io.sentry.c0 f32090b;

    /* renamed from: c */
    private SentryAndroidOptions f32091c;

    /* renamed from: e */
    private boolean f32093e;

    /* renamed from: h */
    private boolean f32096h;

    /* renamed from: i */
    private io.sentry.i0 f32097i;

    /* renamed from: k */
    private final c f32099k;

    /* renamed from: d */
    private boolean f32092d = false;

    /* renamed from: f */
    private boolean f32094f = false;

    /* renamed from: g */
    private boolean f32095g = false;

    /* renamed from: j */
    private final WeakHashMap<Activity, io.sentry.j0> f32098j = new WeakHashMap<>();

    public j(Application application, a0 a0Var, c cVar) {
        this.f32096h = false;
        Application application2 = (Application) rz.j.a(application, "Application is required");
        this.f32089a = application2;
        rz.j.a(a0Var, "BuildInfoProvider is required");
        this.f32099k = (c) rz.j.a(cVar, "ActivityFramesTracker is required");
        if (a0Var.d() >= 29) {
            this.f32093e = true;
        }
        this.f32096h = p0(application2);
    }

    public static /* synthetic */ void C(j jVar, io.sentry.j0 j0Var, u1 u1Var) {
        jVar.F0(j0Var, u1Var);
    }

    public /* synthetic */ void C0(u1 u1Var, io.sentry.j0 j0Var, io.sentry.j0 j0Var2) {
        if (j0Var2 == null) {
            u1Var.x(j0Var);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.f32091c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(f3.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", j0Var.getName());
        }
    }

    private void D(Activity activity, String str) {
        SentryAndroidOptions sentryAndroidOptions = this.f32091c;
        if (sentryAndroidOptions == null || this.f32090b == null || !sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()) {
            return;
        }
        io.sentry.c cVar = new io.sentry.c();
        cVar.p("navigation");
        cVar.m("state", str);
        cVar.m("screen", a0(activity));
        cVar.l("ui.lifecycle");
        cVar.n(f3.INFO);
        io.sentry.t tVar = new io.sentry.t();
        tVar.e("android:activity", activity);
        this.f32090b.h(cVar, tVar);
    }

    public static /* synthetic */ void D0(io.sentry.j0 j0Var, u1 u1Var, io.sentry.j0 j0Var2) {
        if (j0Var2 == j0Var) {
            u1Var.d();
        }
    }

    public /* synthetic */ void G0(Activity activity, io.sentry.j0 j0Var) {
        this.f32099k.c(activity, j0Var.b());
    }

    public /* synthetic */ void I0(Activity activity, io.sentry.j0 j0Var) {
        this.f32099k.c(activity, j0Var.b());
    }

    private void P0(Bundle bundle) {
        if (this.f32094f) {
            return;
        }
        y.c().h(bundle == null);
    }

    private void Q0(final Activity activity) {
        final io.sentry.j0 l11;
        if (!this.f32092d || u0(activity) || this.f32090b == null) {
            return;
        }
        R0();
        String a02 = a0(activity);
        Date b11 = this.f32096h ? y.c().b() : null;
        Boolean d11 = y.c().d();
        if (!this.f32094f && b11 != null && d11 != null) {
            l11 = this.f32090b.l(a02, "ui.load", b11, true, new f4() { // from class: io.sentry.android.core.h
                {
                    j.this = this;
                }

                @Override // io.sentry.f4
                public final void a(io.sentry.j0 j0Var) {
                    j.g(j.this, activity, j0Var);
                }
            });
            this.f32097i = l11.c(n0(d11.booleanValue()), e0(d11.booleanValue()), b11);
        } else {
            l11 = this.f32090b.l(a02, "ui.load", null, true, new f4() { // from class: io.sentry.android.core.i
                {
                    j.this = this;
                }

                @Override // io.sentry.f4
                public final void a(io.sentry.j0 j0Var) {
                    j.m(j.this, activity, j0Var);
                }
            });
        }
        this.f32090b.i(new v1() { // from class: io.sentry.android.core.f
            @Override // io.sentry.v1
            public final void a(u1 u1Var) {
                j.p(j.this, l11, u1Var);
            }
        });
        this.f32098j.put(activity, l11);
    }

    private void R(final io.sentry.j0 j0Var) {
        if (j0Var == null || j0Var.a()) {
            return;
        }
        x3 status = j0Var.getStatus();
        if (status == null) {
            status = x3.OK;
        }
        j0Var.e(status);
        io.sentry.c0 c0Var = this.f32090b;
        if (c0Var != null) {
            c0Var.i(new v1() { // from class: io.sentry.android.core.g
                @Override // io.sentry.v1
                public final void a(u1 u1Var) {
                    j.C(j.this, j0Var, u1Var);
                }
            });
        }
    }

    private void R0() {
        for (Map.Entry<Activity, io.sentry.j0> entry : this.f32098j.entrySet()) {
            R(entry.getValue());
        }
    }

    private void S0(Activity activity, boolean z11) {
        if (this.f32092d && z11) {
            R(this.f32098j.get(activity));
        }
    }

    private String a0(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private String e0(boolean z11) {
        return z11 ? "Cold Start" : "Warm Start";
    }

    public static /* synthetic */ void g(j jVar, Activity activity, io.sentry.j0 j0Var) {
        jVar.I0(activity, j0Var);
    }

    public static /* synthetic */ void j(j jVar, u1 u1Var, io.sentry.j0 j0Var, io.sentry.j0 j0Var2) {
        jVar.C0(u1Var, j0Var, j0Var2);
    }

    public static /* synthetic */ void l(io.sentry.j0 j0Var, u1 u1Var, io.sentry.j0 j0Var2) {
        D0(j0Var, u1Var, j0Var2);
    }

    public static /* synthetic */ void m(j jVar, Activity activity, io.sentry.j0 j0Var) {
        jVar.G0(activity, j0Var);
    }

    private String n0(boolean z11) {
        return z11 ? "app.start.cold" : "app.start.warm";
    }

    public static /* synthetic */ void p(j jVar, io.sentry.j0 j0Var, u1 u1Var) {
        jVar.J0(j0Var, u1Var);
    }

    private boolean p0(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            Object systemService = context.getSystemService("activity");
            if (!(systemService instanceof ActivityManager) || (runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses()) == null) {
                return false;
            }
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.importance == 100;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean t0(SentryAndroidOptions sentryAndroidOptions) {
        return sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
    }

    private boolean u0(Activity activity) {
        return this.f32098j.containsKey(activity);
    }

    @VisibleForTesting
    /* renamed from: J */
    public void J0(final u1 u1Var, final io.sentry.j0 j0Var) {
        u1Var.B(new u1.b() { // from class: io.sentry.android.core.e
            @Override // io.sentry.u1.b
            public final void a(io.sentry.j0 j0Var2) {
                j.j(j.this, u1Var, j0Var, j0Var2);
            }
        });
    }

    @VisibleForTesting
    /* renamed from: L */
    public void F0(final u1 u1Var, final io.sentry.j0 j0Var) {
        u1Var.B(new u1.b() { // from class: io.sentry.android.core.d
            @Override // io.sentry.u1.b
            public final void a(io.sentry.j0 j0Var2) {
                j.l(io.sentry.j0.this, u1Var, j0Var2);
            }
        });
    }

    @Override // io.sentry.m0
    public void a(io.sentry.c0 c0Var, g3 g3Var) {
        this.f32091c = (SentryAndroidOptions) rz.j.a(g3Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) g3Var : null, "SentryAndroidOptions is required");
        this.f32090b = (io.sentry.c0) rz.j.a(c0Var, "Hub is required");
        io.sentry.d0 logger = this.f32091c.getLogger();
        f3 f3Var = f3.DEBUG;
        logger.c(f3Var, "ActivityLifecycleIntegration enabled: %s", Boolean.valueOf(this.f32091c.isEnableActivityLifecycleBreadcrumbs()));
        this.f32092d = t0(this.f32091c);
        if (this.f32091c.isEnableActivityLifecycleBreadcrumbs() || this.f32092d) {
            this.f32089a.registerActivityLifecycleCallbacks(this);
            this.f32091c.getLogger().c(f3Var, "ActivityLifecycleIntegration installed.", new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f32089a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f32091c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(f3.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        this.f32099k.d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        P0(bundle);
        D(activity, "created");
        Q0(activity);
        this.f32094f = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityDestroyed(Activity activity) {
        D(activity, "destroyed");
        io.sentry.i0 i0Var = this.f32097i;
        if (i0Var != null && !i0Var.a()) {
            this.f32097i.e(x3.CANCELLED);
        }
        S0(activity, true);
        this.f32097i = null;
        if (this.f32092d) {
            this.f32098j.remove(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityPaused(Activity activity) {
        D(activity, "paused");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityPostResumed(Activity activity) {
        SentryAndroidOptions sentryAndroidOptions;
        if (this.f32093e && (sentryAndroidOptions = this.f32091c) != null) {
            S0(activity, sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        SentryAndroidOptions sentryAndroidOptions;
        io.sentry.i0 i0Var;
        if (!this.f32095g) {
            if (this.f32096h) {
                y.c().e();
            } else {
                SentryAndroidOptions sentryAndroidOptions2 = this.f32091c;
                if (sentryAndroidOptions2 != null) {
                    sentryAndroidOptions2.getLogger().c(f3.DEBUG, "App Start won't be reported because Process wasn't of foregroundImportance.", new Object[0]);
                }
            }
            if (this.f32092d && (i0Var = this.f32097i) != null) {
                i0Var.finish();
            }
            this.f32095g = true;
        }
        D(activity, "resumed");
        if (!this.f32093e && (sentryAndroidOptions = this.f32091c) != null) {
            S0(activity, sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        D(activity, "saveInstanceState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        this.f32099k.a(activity);
        D(activity, "started");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        D(activity, "stopped");
    }
}