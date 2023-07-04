package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import com.facebook.react.modules.appstate.AppStateModule;
import io.sentry.f3;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
final class LifecycleWatcher implements DefaultLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicLong f32027a;

    /* renamed from: b  reason: collision with root package name */
    private final long f32028b;

    /* renamed from: c  reason: collision with root package name */
    private TimerTask f32029c;

    /* renamed from: d  reason: collision with root package name */
    private final Timer f32030d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f32031e;

    /* renamed from: f  reason: collision with root package name */
    private final io.sentry.c0 f32032f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f32033g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f32034h;

    /* renamed from: i  reason: collision with root package name */
    private final AtomicBoolean f32035i;

    /* renamed from: j  reason: collision with root package name */
    private final qz.o f32036j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            LifecycleWatcher.this.f("end");
            LifecycleWatcher.this.f32032f.n();
            LifecycleWatcher.this.f32035i.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleWatcher(io.sentry.c0 c0Var, long j11, boolean z11, boolean z12) {
        this(c0Var, j11, z11, z12, qz.m.b());
    }

    private void e(String str) {
        if (this.f32034h) {
            io.sentry.c cVar = new io.sentry.c();
            cVar.p("navigation");
            cVar.m("state", str);
            cVar.l("app.lifecycle");
            cVar.n(f3.INFO);
            this.f32032f.e(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(String str) {
        io.sentry.c cVar = new io.sentry.c();
        cVar.p("session");
        cVar.m("state", str);
        cVar.l("app.lifecycle");
        cVar.n(f3.INFO);
        this.f32032f.e(cVar);
    }

    private void h() {
        synchronized (this.f32031e) {
            TimerTask timerTask = this.f32029c;
            if (timerTask != null) {
                timerTask.cancel();
                this.f32029c = null;
            }
        }
    }

    private void i() {
        synchronized (this.f32031e) {
            h();
            if (this.f32030d != null) {
                a aVar = new a();
                this.f32029c = aVar;
                this.f32030d.schedule(aVar, this.f32028b);
            }
        }
    }

    private void j() {
        if (this.f32033g) {
            h();
            long a11 = this.f32036j.a();
            long j11 = this.f32027a.get();
            if (j11 == 0 || j11 + this.f32028b <= a11) {
                f("start");
                this.f32032f.s();
                this.f32035i.set(true);
            }
            this.f32027a.set(a11);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.m
    public void onStart(androidx.lifecycle.v vVar) {
        j();
        e("foreground");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.m
    public void onStop(androidx.lifecycle.v vVar) {
        if (this.f32033g) {
            this.f32027a.set(this.f32036j.a());
            i();
        }
        e(AppStateModule.APP_STATE_BACKGROUND);
    }

    LifecycleWatcher(io.sentry.c0 c0Var, long j11, boolean z11, boolean z12, qz.o oVar) {
        this.f32027a = new AtomicLong(0L);
        this.f32031e = new Object();
        this.f32035i = new AtomicBoolean();
        this.f32028b = j11;
        this.f32033g = z11;
        this.f32034h = z12;
        this.f32032f = c0Var;
        this.f32036j = oVar;
        if (z11) {
            this.f32030d = new Timer(true);
        } else {
            this.f32030d = null;
        }
    }
}