package o7;

import android.os.Build;
import com.adyen.checkout.core.exception.NoConstructorException;

/* loaded from: classes.dex */
public final class a {
    static {
        q7.a.a();
    }

    private a() {
        throw new NoConstructorException();
    }

    private static String a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i11 = 1; i11 < stackTrace.length; i11++) {
            String className = stackTrace[i11].getClassName();
            if (!className.equals(a.class.getName()) && className.indexOf("java.lang.Thread") != 0) {
                return className;
            }
        }
        return "?Unknown?";
    }

    private static String b() {
        return e(a());
    }

    public static String c() {
        return d("CO.");
    }

    public static String d(String str) {
        String str2 = str + b();
        return (Build.VERSION.SDK_INT > 23 || str2.length() <= 23) ? str2 : str2.substring(0, 23);
    }

    private static String e(String str) {
        String[] split = str.split("\\.");
        return split.length == 0 ? str : split[split.length - 1];
    }
}