package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* loaded from: classes5.dex */
public class s {

    /* loaded from: classes5.dex */
    public static class a {
        private a() {
        }
    }

    private s() {
    }

    public static boolean a(Float f11, float f12) {
        return f11 != null && f11.floatValue() == f12;
    }

    public static boolean b(Float f11, Float f12) {
        if (f11 == null) {
            if (f12 == null) {
                return true;
            }
        } else if (f12 != null && f11.floatValue() == f12.floatValue()) {
            return true;
        }
        return false;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) n(new IllegalStateException(str + " must not be null")));
    }

    public static void e(Object obj) {
        if (obj == null) {
            q();
        }
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) n(new NullPointerException(str + " must not be null")));
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            t(str);
        }
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            s(str);
        }
    }

    public static int i(int i11, int i12) {
        if (i11 < i12) {
            return -1;
        }
        return i11 == i12 ? 0 : 1;
    }

    public static int j(long j11, long j12) {
        int i11 = (j11 > j12 ? 1 : (j11 == j12 ? 0 : -1));
        if (i11 < 0) {
            return -1;
        }
        return i11 == 0 ? 0 : 1;
    }

    private static String k(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static void l() {
        u();
    }

    public static void m(int i11, String str) {
        u();
    }

    private static <T extends Throwable> T n(T t11) {
        return (T) o(t11, s.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends Throwable> T o(T t11, String str) {
        StackTraceElement[] stackTrace = t11.getStackTrace();
        int length = stackTrace.length;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            if (str.equals(stackTrace[i12].getClassName())) {
                i11 = i12;
            }
        }
        t11.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i11 + 1, length));
        return t11;
    }

    public static String p(String str, Object obj) {
        return str + obj;
    }

    public static void q() {
        throw ((NullPointerException) n(new NullPointerException()));
    }

    public static void r() {
        throw ((KotlinNullPointerException) n(new KotlinNullPointerException()));
    }

    private static void s(String str) {
        throw ((IllegalArgumentException) n(new IllegalArgumentException(k(str))));
    }

    private static void t(String str) {
        throw ((NullPointerException) n(new NullPointerException(k(str))));
    }

    public static void u() {
        v("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void v(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void w(String str) {
        throw ((UninitializedPropertyAccessException) n(new UninitializedPropertyAccessException(str)));
    }

    public static void x(String str) {
        w("lateinit property " + str + " has not been initialized");
    }
}