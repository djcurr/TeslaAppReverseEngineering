package t3;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static Method f51602a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f51603b;

    static {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 21) {
            if (i11 < 24) {
                try {
                    f51603b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
                    return;
                } catch (Exception e11) {
                    throw new IllegalStateException(e11);
                }
            }
            return;
        }
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            f51602a = cls.getMethod("getScript", String.class);
            f51603b = cls.getMethod("addLikelySubtags", String.class);
        } catch (Exception e12) {
            f51602a = null;
            f51603b = null;
            Log.w("ICUCompat", e12);
        }
    }

    private static String a(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f51603b;
            if (method != null) {
                return (String) method.invoke(null, locale2);
            }
        } catch (IllegalAccessException e11) {
            Log.w("ICUCompat", e11);
        } catch (InvocationTargetException e12) {
            Log.w("ICUCompat", e12);
        }
        return locale2;
    }

    private static String b(String str) {
        try {
            Method method = f51602a;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException e11) {
            Log.w("ICUCompat", e11);
        } catch (InvocationTargetException e12) {
            Log.w("ICUCompat", e12);
        }
        return null;
    }

    public static String c(Locale locale) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i11 >= 21) {
            try {
                return ((Locale) f51603b.invoke(null, locale)).getScript();
            } catch (IllegalAccessException e11) {
                Log.w("ICUCompat", e11);
                return locale.getScript();
            } catch (InvocationTargetException e12) {
                Log.w("ICUCompat", e12);
                return locale.getScript();
            }
        }
        String a11 = a(locale);
        if (a11 != null) {
            return b(a11);
        }
        return null;
    }
}