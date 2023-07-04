package com.google.firebase.perf.metrics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.provider.FirebasePerfProvider;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.c;
import com.google.firebase.perf.util.h;
import com.google.firebase.perf.v1.TraceMetric;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kn.k;

/* loaded from: classes2.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks {

    /* renamed from: l */
    private static final long f16946l = TimeUnit.MINUTES.toMicros(1);

    /* renamed from: m */
    private static volatile AppStartTrace f16947m;

    /* renamed from: n */
    private static ExecutorService f16948n;

    /* renamed from: b */
    private final k f16950b;

    /* renamed from: c */
    private final com.google.firebase.perf.util.a f16951c;

    /* renamed from: d */
    private Context f16952d;

    /* renamed from: j */
    private jn.a f16958j;

    /* renamed from: a */
    private boolean f16949a = false;

    /* renamed from: e */
    private boolean f16953e = false;

    /* renamed from: f */
    private h f16954f = null;

    /* renamed from: g */
    private h f16955g = null;

    /* renamed from: h */
    private h f16956h = null;

    /* renamed from: i */
    private h f16957i = null;

    /* renamed from: k */
    private boolean f16959k = false;

    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: a */
        private final AppStartTrace f16960a;

        public a(AppStartTrace appStartTrace) {
            this.f16960a = appStartTrace;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f16960a.f16955g == null) {
                this.f16960a.f16959k = true;
            }
        }
    }

    AppStartTrace(k kVar, com.google.firebase.perf.util.a aVar, ExecutorService executorService) {
        this.f16950b = kVar;
        this.f16951c = aVar;
        f16948n = executorService;
    }

    public static /* synthetic */ void a(AppStartTrace appStartTrace) {
        appStartTrace.g();
    }

    public static AppStartTrace d() {
        return f16947m != null ? f16947m : e(k.k(), new com.google.firebase.perf.util.a());
    }

    static AppStartTrace e(k kVar, com.google.firebase.perf.util.a aVar) {
        if (f16947m == null) {
            synchronized (AppStartTrace.class) {
                if (f16947m == null) {
                    f16947m = new AppStartTrace(kVar, aVar, new ThreadPoolExecutor(0, 1, f16946l + 10, TimeUnit.SECONDS, new LinkedBlockingQueue(1)));
                }
            }
        }
        return f16947m;
    }

    public void g() {
        TraceMetric.b j11 = TraceMetric.newBuilder().k(c.APP_START_TRACE_NAME.toString()).i(f().d()).j(f().c(this.f16957i));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(TraceMetric.newBuilder().k(c.ON_CREATE_TRACE_NAME.toString()).i(f().d()).j(f().c(this.f16955g)).build());
        TraceMetric.b newBuilder = TraceMetric.newBuilder();
        newBuilder.k(c.ON_START_TRACE_NAME.toString()).i(this.f16955g.d()).j(this.f16955g.c(this.f16956h));
        arrayList.add(newBuilder.build());
        TraceMetric.b newBuilder2 = TraceMetric.newBuilder();
        newBuilder2.k(c.ON_RESUME_TRACE_NAME.toString()).i(this.f16956h.d()).j(this.f16956h.c(this.f16957i));
        arrayList.add(newBuilder2.build());
        j11.c(arrayList).d(this.f16958j.a());
        this.f16950b.C(j11.build(), com.google.firebase.perf.v1.b.FOREGROUND_BACKGROUND);
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    @VisibleForTesting
    h f() {
        return this.f16954f;
    }

    public synchronized void h(Context context) {
        if (this.f16949a) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.f16949a = true;
            this.f16952d = applicationContext;
        }
    }

    public synchronized void i() {
        if (this.f16949a) {
            ((Application) this.f16952d).unregisterActivityLifecycleCallbacks(this);
            this.f16949a = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.f16959k && this.f16955g == null) {
            new WeakReference(activity);
            this.f16955g = this.f16951c.a();
            if (FirebasePerfProvider.getAppStartTime().c(this.f16955g) > f16946l) {
                this.f16953e = true;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        if (!this.f16959k && this.f16957i == null && !this.f16953e) {
            new WeakReference(activity);
            this.f16957i = this.f16951c.a();
            this.f16954f = FirebasePerfProvider.getAppStartTime();
            this.f16958j = SessionManager.getInstance().perfSession();
            fn.a e11 = fn.a.e();
            e11.a("onResume(): " + activity.getClass().getName() + ": " + this.f16954f.c(this.f16957i) + " microseconds");
            f16948n.execute(new Runnable() { // from class: gn.a
                {
                    AppStartTrace.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AppStartTrace.a(AppStartTrace.this);
                }
            });
            if (this.f16949a) {
                i();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (!this.f16959k && this.f16956h == null && !this.f16953e) {
            this.f16956h = this.f16951c.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
    }
}