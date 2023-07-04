package ak;

import android.text.TextUtils;
import android.util.Log;
import ch.qos.logback.classic.net.SyslogAppender;
import java.net.UnknownHostException;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static int f507a = 0;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f508b = true;

    private static String a(String str, Throwable th2) {
        String e11 = e(th2);
        if (TextUtils.isEmpty(e11)) {
            return str;
        }
        String valueOf = String.valueOf(str);
        String replace = e11.replace("\n", "\n  ");
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 4 + String.valueOf(replace).length());
        sb2.append(valueOf);
        sb2.append("\n  ");
        sb2.append(replace);
        sb2.append('\n');
        return sb2.toString();
    }

    public static void b(String str, String str2) {
        if (f507a == 0) {
            Log.d(str, str2);
        }
    }

    public static void c(String str, String str2) {
        if (f507a <= 3) {
            Log.e(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        c(str, a(str2, th2));
    }

    public static String e(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        if (g(th2)) {
            return "UnknownHostException (no network)";
        }
        if (!f508b) {
            return th2.getMessage();
        }
        return Log.getStackTraceString(th2).trim().replace(SyslogAppender.DEFAULT_STACKTRACE_PATTERN, "    ");
    }

    public static void f(String str, String str2) {
        if (f507a <= 1) {
            Log.i(str, str2);
        }
    }

    private static boolean g(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    public static void h(String str, String str2) {
        if (f507a <= 2) {
            Log.w(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th2) {
        h(str, a(str2, th2));
    }
}