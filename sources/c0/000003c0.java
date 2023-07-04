package androidx.camera.core;

import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    private static int f2456a = 3;

    public static void a(String str, String str2) {
        b(str, str2, null);
    }

    public static void b(String str, String str2, Throwable th2) {
        if (g(str)) {
            Log.d(l(str), str2, th2);
        }
    }

    public static void c(String str, String str2) {
        d(str, str2, null);
    }

    public static void d(String str, String str2, Throwable th2) {
        if (h(str)) {
            Log.e(l(str), str2, th2);
        }
    }

    public static void e(String str, String str2) {
        f(str, str2, null);
    }

    public static void f(String str, String str2, Throwable th2) {
        if (i(str)) {
            Log.i(l(str), str2, th2);
        }
    }

    public static boolean g(String str) {
        return f2456a <= 3 || Log.isLoggable(l(str), 3);
    }

    public static boolean h(String str) {
        return f2456a <= 6 || Log.isLoggable(l(str), 6);
    }

    public static boolean i(String str) {
        return f2456a <= 4 || Log.isLoggable(l(str), 4);
    }

    public static boolean j(String str) {
        return f2456a <= 5 || Log.isLoggable(l(str), 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(int i11) {
        f2456a = i11;
    }

    private static String l(String str) {
        return (23 >= str.length() || Build.VERSION.SDK_INT >= 24) ? str : str.substring(0, 23);
    }

    public static void m(String str, String str2) {
        n(str, str2, null);
    }

    public static void n(String str, String str2, Throwable th2) {
        if (j(str)) {
            Log.w(l(str), str2, th2);
        }
    }
}