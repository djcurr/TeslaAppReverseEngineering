package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f16584a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.d f16585b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f16586c;

    /* renamed from: d  reason: collision with root package name */
    TaskCompletionSource<Void> f16587d;

    /* renamed from: e  reason: collision with root package name */
    boolean f16588e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f16589f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f16590g;

    /* renamed from: h  reason: collision with root package name */
    private final TaskCompletionSource<Void> f16591h;

    public r(com.google.firebase.d dVar) {
        Object obj = new Object();
        this.f16586c = obj;
        this.f16587d = new TaskCompletionSource<>();
        this.f16588e = false;
        this.f16589f = false;
        this.f16591h = new TaskCompletionSource<>();
        Context j11 = dVar.j();
        this.f16585b = dVar;
        this.f16584a = g.r(j11);
        Boolean b11 = b();
        this.f16590g = b11 == null ? a(j11) : b11;
        synchronized (obj) {
            if (d()) {
                this.f16587d.trySetResult(null);
                this.f16588e = true;
            }
        }
    }

    private Boolean a(Context context) {
        Boolean f11 = f(context);
        if (f11 == null) {
            this.f16589f = false;
            return null;
        }
        this.f16589f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(f11));
    }

    private Boolean b() {
        if (this.f16584a.contains("firebase_crashlytics_collection_enabled")) {
            this.f16589f = false;
            return Boolean.valueOf(this.f16584a.getBoolean("firebase_crashlytics_collection_enabled", true));
        }
        return null;
    }

    private void e(boolean z11) {
        String str;
        String str2 = z11 ? "ENABLED" : "DISABLED";
        if (this.f16590g == null) {
            str = "global Firebase setting";
        } else {
            str = this.f16589f ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        wl.f.f().b(String.format("Crashlytics automatic data collection %s by %s.", str2, str));
    }

    private static Boolean f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e11) {
            wl.f.f().e("Could not read data collection permission from manifest", e11);
            return null;
        }
    }

    private static void h(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bool != null) {
            edit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            edit.remove("firebase_crashlytics_collection_enabled");
        }
        edit.apply();
    }

    public void c(boolean z11) {
        if (z11) {
            this.f16591h.trySetResult(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    public synchronized boolean d() {
        boolean s11;
        Boolean bool = this.f16590g;
        if (bool != null) {
            s11 = bool.booleanValue();
        } else {
            s11 = this.f16585b.s();
        }
        e(s11);
        return s11;
    }

    public synchronized void g(Boolean bool) {
        if (bool != null) {
            try {
                this.f16589f = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f16590g = bool != null ? bool : a(this.f16585b.j());
        h(this.f16584a, bool);
        synchronized (this.f16586c) {
            if (d()) {
                if (!this.f16588e) {
                    this.f16587d.trySetResult(null);
                    this.f16588e = true;
                }
            } else if (this.f16588e) {
                this.f16587d = new TaskCompletionSource<>();
                this.f16588e = false;
            }
        }
    }

    public Task<Void> i() {
        Task<Void> task;
        synchronized (this.f16586c) {
            task = this.f16587d.getTask();
        }
        return task;
    }

    public Task<Void> j(Executor executor) {
        return h0.j(executor, this.f16591h.getTask(), i());
    }
}