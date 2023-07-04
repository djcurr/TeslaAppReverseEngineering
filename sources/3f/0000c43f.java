package z4;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static long f60173a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f60174b;

    public static void a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            b.a(str);
        }
    }

    public static void b() {
        if (Build.VERSION.SDK_INT >= 18) {
            b.b();
        }
    }

    private static void c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean d() {
        try {
            if (f60174b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return e();
    }

    private static boolean e() {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f60174b == null) {
                    f60173a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    f60174b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                return ((Boolean) f60174b.invoke(null, Long.valueOf(f60173a))).booleanValue();
            } catch (Exception e11) {
                c("isTagEnabled", e11);
            }
        }
        return false;
    }
}