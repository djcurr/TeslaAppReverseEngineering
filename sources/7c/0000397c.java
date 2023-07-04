package com.google.firebase.perf.config;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class v {

    /* renamed from: c */
    private static final fn.a f16940c = fn.a.e();

    /* renamed from: d */
    private static v f16941d;

    /* renamed from: a */
    private volatile SharedPreferences f16942a;

    /* renamed from: b */
    private final ExecutorService f16943b;

    public v(ExecutorService executorService) {
        this.f16943b = executorService;
    }

    public static /* synthetic */ void a(v vVar, Context context) {
        vVar.i(context);
    }

    private Context d() {
        try {
            com.google.firebase.d.k();
            return com.google.firebase.d.k().j();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static synchronized v f() {
        v vVar;
        synchronized (v.class) {
            if (f16941d == null) {
                f16941d = new v(Executors.newSingleThreadExecutor());
            }
            vVar = f16941d;
        }
        return vVar;
    }

    public /* synthetic */ void i(Context context) {
        if (this.f16942a != null || context == null) {
            return;
        }
        this.f16942a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
    }

    public void b(String str) {
        if (str == null) {
            f16940c.a("Key is null. Cannot clear nullable key");
        } else {
            this.f16942a.edit().remove(str).apply();
        }
    }

    public com.google.firebase.perf.util.e<Boolean> c(String str) {
        if (str == null) {
            f16940c.a("Key is null when getting boolean value on device cache.");
            return com.google.firebase.perf.util.e.a();
        }
        if (this.f16942a == null) {
            j(d());
            if (this.f16942a == null) {
                return com.google.firebase.perf.util.e.a();
            }
        }
        if (!this.f16942a.contains(str)) {
            return com.google.firebase.perf.util.e.a();
        }
        try {
            return com.google.firebase.perf.util.e.e(Boolean.valueOf(this.f16942a.getBoolean(str, false)));
        } catch (ClassCastException e11) {
            f16940c.b("Key %s from sharedPreferences has type other than long: %s", str, e11.getMessage());
            return com.google.firebase.perf.util.e.a();
        }
    }

    public com.google.firebase.perf.util.e<Float> e(String str) {
        if (str == null) {
            f16940c.a("Key is null when getting float value on device cache.");
            return com.google.firebase.perf.util.e.a();
        }
        if (this.f16942a == null) {
            j(d());
            if (this.f16942a == null) {
                return com.google.firebase.perf.util.e.a();
            }
        }
        if (!this.f16942a.contains(str)) {
            return com.google.firebase.perf.util.e.a();
        }
        try {
            return com.google.firebase.perf.util.e.e(Float.valueOf(this.f16942a.getFloat(str, BitmapDescriptorFactory.HUE_RED)));
        } catch (ClassCastException e11) {
            f16940c.b("Key %s from sharedPreferences has type other than float: %s", str, e11.getMessage());
            return com.google.firebase.perf.util.e.a();
        }
    }

    public com.google.firebase.perf.util.e<Long> g(String str) {
        if (str == null) {
            f16940c.a("Key is null when getting long value on device cache.");
            return com.google.firebase.perf.util.e.a();
        }
        if (this.f16942a == null) {
            j(d());
            if (this.f16942a == null) {
                return com.google.firebase.perf.util.e.a();
            }
        }
        if (!this.f16942a.contains(str)) {
            return com.google.firebase.perf.util.e.a();
        }
        try {
            return com.google.firebase.perf.util.e.e(Long.valueOf(this.f16942a.getLong(str, 0L)));
        } catch (ClassCastException e11) {
            f16940c.b("Key %s from sharedPreferences has type other than long: %s", str, e11.getMessage());
            return com.google.firebase.perf.util.e.a();
        }
    }

    public com.google.firebase.perf.util.e<String> h(String str) {
        if (str == null) {
            f16940c.a("Key is null when getting String value on device cache.");
            return com.google.firebase.perf.util.e.a();
        }
        if (this.f16942a == null) {
            j(d());
            if (this.f16942a == null) {
                return com.google.firebase.perf.util.e.a();
            }
        }
        if (!this.f16942a.contains(str)) {
            return com.google.firebase.perf.util.e.a();
        }
        try {
            return com.google.firebase.perf.util.e.e(this.f16942a.getString(str, ""));
        } catch (ClassCastException e11) {
            f16940c.b("Key %s from sharedPreferences has type other than String: %s", str, e11.getMessage());
            return com.google.firebase.perf.util.e.a();
        }
    }

    public synchronized void j(final Context context) {
        if (this.f16942a == null && context != null) {
            this.f16943b.execute(new Runnable() { // from class: com.google.firebase.perf.config.u
                {
                    v.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    v.a(v.this, context);
                }
            });
        }
    }

    public boolean k(String str, float f11) {
        if (str == null) {
            f16940c.a("Key is null when setting float value on device cache.");
            return false;
        }
        if (this.f16942a == null) {
            j(d());
            if (this.f16942a == null) {
                return false;
            }
        }
        this.f16942a.edit().putFloat(str, f11).apply();
        return true;
    }

    public boolean l(String str, long j11) {
        if (str == null) {
            f16940c.a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f16942a == null) {
            j(d());
            if (this.f16942a == null) {
                return false;
            }
        }
        this.f16942a.edit().putLong(str, j11).apply();
        return true;
    }

    public boolean m(String str, String str2) {
        if (str == null) {
            f16940c.a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f16942a == null) {
            j(d());
            if (this.f16942a == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f16942a.edit().remove(str).apply();
            return true;
        }
        this.f16942a.edit().putString(str, str2).apply();
        return true;
    }

    public boolean n(String str, boolean z11) {
        if (str == null) {
            f16940c.a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f16942a == null) {
            j(d());
            if (this.f16942a == null) {
                return false;
            }
        }
        this.f16942a.edit().putBoolean(str, z11).apply();
        return true;
    }
}