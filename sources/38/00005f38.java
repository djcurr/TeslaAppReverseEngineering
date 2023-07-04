package com.tesla.TeslaV4;

import android.content.Context;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.v;
import ch.qos.logback.core.CoreConstants;
import com.tesla.logging.g;
import hy.i;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vp.b;
import zu.c;
import zu.x;
import zu.y;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/TeslaV4/AppStateLifecycleObserver;", "Lzu/c;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "app_prodGlobalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class AppStateLifecycleObserver implements c, DefaultLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    private final Context f21370a;

    /* renamed from: b  reason: collision with root package name */
    private final String f21371b;

    /* renamed from: c  reason: collision with root package name */
    private final g f21372c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f21373d;

    /* renamed from: e  reason: collision with root package name */
    private final b<Boolean> f21374e;

    public AppStateLifecycleObserver(Context context) {
        s.g(context, "context");
        this.f21370a = context;
        this.f21371b = "AppStateLifecycleObserver";
        this.f21372c = g.f21878b.a("AppStateLifecycleObserver");
        this.f21374e = b.S();
    }

    public void a(boolean z11) {
        this.f21373d = z11;
    }

    @Override // zu.c
    public boolean e() {
        return this.f21373d;
    }

    @Override // zu.c
    public i<Boolean> h() {
        i<Boolean> k11 = this.f21374e.k();
        s.f(k11, "backgroundedRelay.distinctUntilChanged()");
        return k11;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.m
    public void onCreate(v owner) {
        s.g(owner, "owner");
        super.onCreate(owner);
        this.f21372c.i("onCreate");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.m
    public void onDestroy(v owner) {
        s.g(owner, "owner");
        super.onDestroy(owner);
        this.f21372c.i("onDestroy");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.m
    public void onPause(v owner) {
        s.g(owner, "owner");
        super.onPause(owner);
        this.f21372c.i("onPause");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.m
    public void onResume(v owner) {
        s.g(owner, "owner");
        super.onResume(owner);
        this.f21372c.i("onResume");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.m
    public void onStart(v owner) {
        s.g(owner, "owner");
        super.onStart(owner);
        this.f21372c.i("onStart");
        a(false);
        this.f21374e.accept(Boolean.FALSE);
        x.f60797a.c(y.f60801a.b(this.f21370a));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.m
    public void onStop(v owner) {
        s.g(owner, "owner");
        super.onStop(owner);
        this.f21372c.i("onStop");
        a(true);
        this.f21374e.accept(Boolean.TRUE);
    }
}