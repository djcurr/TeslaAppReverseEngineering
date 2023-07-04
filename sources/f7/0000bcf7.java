package wl;

import android.util.Log;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: c  reason: collision with root package name */
    static final f f56104c = new f("FirebaseCrashlytics");

    /* renamed from: a  reason: collision with root package name */
    private final String f56105a;

    /* renamed from: b  reason: collision with root package name */
    private int f56106b = 4;

    public f(String str) {
        this.f56105a = str;
    }

    private boolean a(int i11) {
        return this.f56106b <= i11 || Log.isLoggable(this.f56105a, i11);
    }

    public static f f() {
        return f56104c;
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th2) {
        if (a(3)) {
            Log.d(this.f56105a, str, th2);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th2) {
        if (a(6)) {
            Log.e(this.f56105a, str, th2);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th2) {
        if (a(4)) {
            Log.i(this.f56105a, str, th2);
        }
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th2) {
        if (a(2)) {
            Log.v(this.f56105a, str, th2);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th2) {
        if (a(5)) {
            Log.w(this.f56105a, str, th2);
        }
    }
}