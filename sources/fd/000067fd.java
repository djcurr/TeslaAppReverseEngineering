package ek;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f25190a;

    /* renamed from: b  reason: collision with root package name */
    private static Context f25191b;

    /* renamed from: c  reason: collision with root package name */
    private static C0489a f25192c;

    /* renamed from: ek.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0489a {

        /* renamed from: b  reason: collision with root package name */
        private static Method f25193b;

        /* renamed from: a  reason: collision with root package name */
        private final PackageManager f25194a;

        C0489a(PackageManager packageManager) {
            this.f25194a = packageManager;
        }

        Boolean a() {
            if (a.a()) {
                if (f25193b == null) {
                    try {
                        f25193b = PackageManager.class.getDeclaredMethod(NamedConstantsKt.IS_INSTANT_APP, new Class[0]);
                    } catch (NoSuchMethodException unused) {
                        return null;
                    }
                }
                try {
                    return (Boolean) f25193b.invoke(this.f25194a, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    return null;
                }
            }
            return null;
        }
    }

    static /* synthetic */ boolean a() {
        return b();
    }

    private static boolean b() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean c(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                if (f25190a != null && applicationContext.equals(f25191b)) {
                    return f25190a.booleanValue();
                }
                Boolean bool = null;
                f25190a = null;
                if (b()) {
                    if (f25192c == null || !applicationContext.equals(f25191b)) {
                        f25192c = new C0489a(applicationContext.getPackageManager());
                    }
                    bool = f25192c.a();
                }
                f25191b = applicationContext;
                if (bool != null) {
                    f25190a = bool;
                } else {
                    try {
                        applicationContext.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f25190a = Boolean.TRUE;
                    } catch (ClassNotFoundException unused) {
                        f25190a = Boolean.FALSE;
                    }
                }
                return f25190a.booleanValue();
            }
            throw new IllegalStateException("Application context is null!");
        }
        throw new IllegalArgumentException("Context must be non-null");
    }
}