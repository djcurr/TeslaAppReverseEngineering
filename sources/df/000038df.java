package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class v implements w {

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f16603g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h  reason: collision with root package name */
    private static final String f16604h = Pattern.quote("/");

    /* renamed from: a  reason: collision with root package name */
    private final x f16605a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f16606b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16607c;

    /* renamed from: d  reason: collision with root package name */
    private final tm.e f16608d;

    /* renamed from: e  reason: collision with root package name */
    private final r f16609e;

    /* renamed from: f  reason: collision with root package name */
    private String f16610f;

    public v(Context context, String str, tm.e eVar, r rVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str != null) {
            this.f16606b = context;
            this.f16607c = str;
            this.f16608d = eVar;
            this.f16609e = rVar;
            this.f16605a = new x();
            return;
        }
        throw new IllegalArgumentException("appIdentifier must not be null");
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String e11;
        e11 = e(UUID.randomUUID().toString());
        wl.f f11 = wl.f.f();
        f11.i("Created new Crashlytics installation ID: " + e11 + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e11).putString("firebase.installation.id", str).apply();
        return e11;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private String d() {
        try {
            return (String) h0.d(this.f16608d.getId());
        } catch (Exception e11) {
            wl.f.f().l("Failed to retrieve Firebase Installations ID.", e11);
            return null;
        }
    }

    private static String e(String str) {
        if (str == null) {
            return null;
        }
        return f16603g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(f16604h, "");
    }

    @Override // com.google.firebase.crashlytics.internal.common.w
    public synchronized String a() {
        String str = this.f16610f;
        if (str != null) {
            return str;
        }
        wl.f.f().i("Determining Crashlytics installation ID...");
        SharedPreferences r11 = g.r(this.f16606b);
        String string = r11.getString("firebase.installation.id", null);
        wl.f f11 = wl.f.f();
        f11.i("Cached Firebase Installation ID: " + string);
        if (this.f16609e.d()) {
            String d11 = d();
            wl.f f12 = wl.f.f();
            f12.i("Fetched Firebase Installation ID: " + d11);
            if (d11 == null) {
                d11 = string == null ? c() : string;
            }
            if (d11.equals(string)) {
                this.f16610f = l(r11);
            } else {
                this.f16610f = b(d11, r11);
            }
        } else if (k(string)) {
            this.f16610f = l(r11);
        } else {
            this.f16610f = b(c(), r11);
        }
        if (this.f16610f == null) {
            wl.f.f().k("Unable to determine Crashlytics Install Id, creating a new one.");
            this.f16610f = b(c(), r11);
        }
        wl.f f13 = wl.f.f();
        f13.i("Crashlytics installation ID: " + this.f16610f);
        return this.f16610f;
    }

    public String f() {
        return this.f16607c;
    }

    public String g() {
        return this.f16605a.a(this.f16606b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}