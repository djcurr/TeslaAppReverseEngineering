package androidx.core.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class e {

    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Method f4295a;

        /* renamed from: b  reason: collision with root package name */
        private static boolean f4296b;

        /* renamed from: c  reason: collision with root package name */
        private static Method f4297c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f4298d;

        public static IBinder a(Bundle bundle, String str) {
            if (!f4296b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", String.class);
                    f4295a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e11) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e11);
                }
                f4296b = true;
            }
            Method method2 = f4295a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e12) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e12);
                    f4295a = null;
                }
            }
            return null;
        }

        public static void b(Bundle bundle, String str, IBinder iBinder) {
            if (!f4298d) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    f4297c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e11) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e11);
                }
                f4298d = true;
            }
            Method method2 = f4297c;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, str, iBinder);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e12) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e12);
                    f4297c = null;
                }
            }
        }
    }

    public static IBinder a(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return a.a(bundle, str);
    }

    public static void b(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            a.b(bundle, str, iBinder);
        }
    }
}