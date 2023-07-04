package o7;

import android.util.Log;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static int f42303a = 8;

    public static void a(String str, String str2) {
        e(3, str, str2, null);
    }

    public static void b(String str, String str2, Throwable th2) {
        e(3, str, str2, th2);
    }

    public static void c(String str, String str2) {
        e(6, str, str2, null);
    }

    public static void d(String str, String str2, Throwable th2) {
        e(6, str, str2, th2);
    }

    private static void e(int i11, String str, String str2, Throwable th2) {
        String substring;
        if (f42303a > i11) {
            return;
        }
        if (str2.length() > 2048) {
            int length = str2.length() / 2048;
            for (int i12 = 0; i12 <= length; i12++) {
                if (i12 != length) {
                    substring = str2.substring(i12 * 2048, (i12 + 1) * 2048);
                } else {
                    substring = str2.substring(i12 * 2048);
                }
                e(i11, str + "-" + i12, substring, th2);
            }
        } else if (i11 == -1) {
            if (th2 == null) {
                Log.wtf(str, str2);
            } else {
                Log.wtf(str, str2, th2);
            }
        } else if (i11 == 2) {
            if (th2 == null) {
                Log.v(str, str2);
            } else {
                Log.v(str, str2, th2);
            }
        } else if (i11 == 3) {
            if (th2 == null) {
                Log.d(str, str2);
            } else {
                Log.d(str, str2, th2);
            }
        } else if (i11 == 4) {
            if (th2 == null) {
                Log.i(str, str2);
            } else {
                Log.i(str, str2, th2);
            }
        } else if (i11 == 5) {
            if (th2 == null) {
                Log.w(str, str2);
            } else {
                Log.w(str, str2, th2);
            }
        } else if (i11 == 6) {
            if (th2 == null) {
                Log.e(str, str2);
            } else {
                Log.e(str, str2, th2);
            }
        }
    }

    public static void f(String str, String str2) {
        e(2, str, str2, null);
    }

    public static void g(String str, String str2) {
        e(5, str, str2, null);
    }
}