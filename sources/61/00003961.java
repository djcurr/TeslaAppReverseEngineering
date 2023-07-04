package com.google.firebase.perf.application;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.c;
import com.google.firebase.perf.util.h;
import com.google.firebase.perf.v1.TraceMetric;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kn.k;

/* loaded from: classes2.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: q  reason: collision with root package name */
    private static final fn.a f16896q = fn.a.e();

    /* renamed from: t  reason: collision with root package name */
    private static volatile a f16897t;

    /* renamed from: g  reason: collision with root package name */
    private final k f16904g;

    /* renamed from: i  reason: collision with root package name */
    private final com.google.firebase.perf.util.a f16906i;

    /* renamed from: j  reason: collision with root package name */
    private FrameMetricsAggregator f16907j;

    /* renamed from: k  reason: collision with root package name */
    private h f16908k;

    /* renamed from: l  reason: collision with root package name */
    private h f16909l;

    /* renamed from: p  reason: collision with root package name */
    private boolean f16913p;

    /* renamed from: a  reason: collision with root package name */
    private final WeakHashMap<Activity, Boolean> f16898a = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final WeakHashMap<Activity, Trace> f16899b = new WeakHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Long> f16900c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Set<WeakReference<b>> f16901d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private Set<InterfaceC0307a> f16902e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private final AtomicInteger f16903f = new AtomicInteger(0);

    /* renamed from: m  reason: collision with root package name */
    private com.google.firebase.perf.v1.b f16910m = com.google.firebase.perf.v1.b.BACKGROUND;

    /* renamed from: n  reason: collision with root package name */
    private boolean f16911n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f16912o = true;

    /* renamed from: h  reason: collision with root package name */
    private final com.google.firebase.perf.config.a f16905h = com.google.firebase.perf.config.a.f();

    /* renamed from: com.google.firebase.perf.application.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0307a {
        void a();
    }

    /* loaded from: classes2.dex */
    public interface b {
        void onUpdateAppState(com.google.firebase.perf.v1.b bVar);
    }

    a(k kVar, com.google.firebase.perf.util.a aVar) {
        this.f16913p = false;
        this.f16904g = kVar;
        this.f16906i = aVar;
        boolean d11 = d();
        this.f16913p = d11;
        if (d11) {
            this.f16907j = new FrameMetricsAggregator();
        }
    }

    public static a b() {
        if (f16897t == null) {
            synchronized (a.class) {
                if (f16897t == null) {
                    f16897t = new a(k.k(), new com.google.firebase.perf.util.a());
                }
            }
        }
        return f16897t;
    }

    public static String c(Activity activity) {
        return "_st_" + activity.getClass().getSimpleName();
    }

    private boolean d() {
        return true;
    }

    private boolean h(Activity activity) {
        return this.f16913p;
    }

    private void l() {
        synchronized (this.f16901d) {
            for (InterfaceC0307a interfaceC0307a : this.f16902e) {
                if (interfaceC0307a != null) {
                    interfaceC0307a.a();
                }
            }
        }
    }

    private void m(Activity activity) {
        Trace trace;
        int i11;
        int i12;
        SparseIntArray sparseIntArray;
        if (this.f16899b.containsKey(activity) && (trace = this.f16899b.get(activity)) != null) {
            this.f16899b.remove(activity);
            SparseIntArray[] d11 = this.f16907j.d();
            int i13 = 0;
            if (d11 == null || (sparseIntArray = d11[0]) == null) {
                i11 = 0;
                i12 = 0;
            } else {
                int i14 = 0;
                i11 = 0;
                i12 = 0;
                while (i13 < sparseIntArray.size()) {
                    int keyAt = sparseIntArray.keyAt(i13);
                    int valueAt = sparseIntArray.valueAt(i13);
                    i14 += valueAt;
                    if (keyAt > 700) {
                        i12 += valueAt;
                    }
                    if (keyAt > 16) {
                        i11 += valueAt;
                    }
                    i13++;
                }
                i13 = i14;
            }
            if (i13 > 0) {
                trace.putMetric(com.google.firebase.perf.util.b.FRAMES_TOTAL.toString(), i13);
            }
            if (i11 > 0) {
                trace.putMetric(com.google.firebase.perf.util.b.FRAMES_SLOW.toString(), i11);
            }
            if (i12 > 0) {
                trace.putMetric(com.google.firebase.perf.util.b.FRAMES_FROZEN.toString(), i12);
            }
            if (com.google.firebase.perf.util.k.b(activity.getApplicationContext())) {
                f16896q.a("sendScreenTrace name:" + c(activity) + " _fr_tot:" + i13 + " _fr_slo:" + i11 + " _fr_fzn:" + i12);
            }
            trace.stop();
        }
    }

    private void n(String str, h hVar, h hVar2) {
        if (this.f16905h.I()) {
            TraceMetric.b d11 = TraceMetric.newBuilder().k(str).i(hVar.d()).j(hVar.c(hVar2)).d(SessionManager.getInstance().perfSession().a());
            int andSet = this.f16903f.getAndSet(0);
            synchronized (this.f16900c) {
                d11.f(this.f16900c);
                if (andSet != 0) {
                    d11.h(com.google.firebase.perf.util.b.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                }
                this.f16900c.clear();
            }
            this.f16904g.C(d11.build(), com.google.firebase.perf.v1.b.FOREGROUND_BACKGROUND);
        }
    }

    private void p(com.google.firebase.perf.v1.b bVar) {
        this.f16910m = bVar;
        synchronized (this.f16901d) {
            Iterator<WeakReference<b>> it2 = this.f16901d.iterator();
            while (it2.hasNext()) {
                b bVar2 = it2.next().get();
                if (bVar2 != null) {
                    bVar2.onUpdateAppState(this.f16910m);
                } else {
                    it2.remove();
                }
            }
        }
    }

    public com.google.firebase.perf.v1.b a() {
        return this.f16910m;
    }

    public void e(String str, long j11) {
        synchronized (this.f16900c) {
            Long l11 = this.f16900c.get(str);
            if (l11 == null) {
                this.f16900c.put(str, Long.valueOf(j11));
            } else {
                this.f16900c.put(str, Long.valueOf(l11.longValue() + j11));
            }
        }
    }

    public void f(int i11) {
        this.f16903f.addAndGet(i11);
    }

    public boolean g() {
        return this.f16912o;
    }

    public synchronized void i(Context context) {
        if (this.f16911n) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.f16911n = true;
        }
    }

    public void j(InterfaceC0307a interfaceC0307a) {
        synchronized (this.f16901d) {
            this.f16902e.add(interfaceC0307a);
        }
    }

    public void k(WeakReference<b> weakReference) {
        synchronized (this.f16901d) {
            this.f16901d.add(weakReference);
        }
    }

    public void o(WeakReference<b> weakReference) {
        synchronized (this.f16901d) {
            this.f16901d.remove(weakReference);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        if (this.f16898a.isEmpty()) {
            this.f16908k = this.f16906i.a();
            this.f16898a.put(activity, Boolean.TRUE);
            if (this.f16912o) {
                p(com.google.firebase.perf.v1.b.FOREGROUND);
                l();
                this.f16912o = false;
            } else {
                n(c.BACKGROUND_TRACE_NAME.toString(), this.f16909l, this.f16908k);
                p(com.google.firebase.perf.v1.b.FOREGROUND);
            }
        } else {
            this.f16898a.put(activity, Boolean.TRUE);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (h(activity) && this.f16905h.I()) {
            this.f16907j.a(activity);
            Trace trace = new Trace(c(activity), this.f16904g, this.f16906i, this);
            trace.start();
            this.f16899b.put(activity, trace);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        if (h(activity)) {
            m(activity);
        }
        if (this.f16898a.containsKey(activity)) {
            this.f16898a.remove(activity);
            if (this.f16898a.isEmpty()) {
                this.f16909l = this.f16906i.a();
                n(c.FOREGROUND_TRACE_NAME.toString(), this.f16908k, this.f16909l);
                p(com.google.firebase.perf.v1.b.BACKGROUND);
            }
        }
    }
}