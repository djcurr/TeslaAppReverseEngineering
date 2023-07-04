package ym;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.b;
import pm.c;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f59635a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f59636b;

    /* renamed from: c  reason: collision with root package name */
    private final c f59637c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f59638d;

    public a(Context context, String str, c cVar) {
        Context a11 = a(context);
        this.f59635a = a11;
        this.f59636b = a11.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f59637c = cVar;
        this.f59638d = c();
    }

    private static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : b.createDeviceProtectedStorageContext(context);
    }

    private boolean c() {
        if (this.f59636b.contains("firebase_data_collection_default_enabled")) {
            return this.f59636b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f59635a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f59635a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z11) {
        if (this.f59638d != z11) {
            this.f59638d = z11;
            this.f59637c.c(new pm.a<>(com.google.firebase.a.class, new com.google.firebase.a(z11)));
        }
    }

    public synchronized boolean b() {
        return this.f59638d;
    }

    public synchronized void e(Boolean bool) {
        if (bool == null) {
            this.f59636b.edit().remove("firebase_data_collection_default_enabled").apply();
            f(d());
        } else {
            boolean equals = Boolean.TRUE.equals(bool);
            this.f59636b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
            f(equals);
        }
    }
}