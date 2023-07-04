package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a  reason: collision with root package name */
    protected static final Class<?> f4276a;

    /* renamed from: b  reason: collision with root package name */
    protected static final Field f4277b;

    /* renamed from: c  reason: collision with root package name */
    protected static final Field f4278c;

    /* renamed from: d  reason: collision with root package name */
    protected static final Method f4279d;

    /* renamed from: e  reason: collision with root package name */
    protected static final Method f4280e;

    /* renamed from: f  reason: collision with root package name */
    protected static final Method f4281f;

    /* renamed from: g  reason: collision with root package name */
    private static final Handler f4282g = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f4283a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f4284b;

        a(d dVar, Object obj) {
            this.f4283a = dVar;
            this.f4284b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4283a.f4289a = this.f4284b;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Application f4285a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f4286b;

        b(Application application, d dVar) {
            this.f4285a = application;
            this.f4286b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4285a.unregisterActivityLifecycleCallbacks(this.f4286b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0070c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f4287a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f4288b;

        RunnableC0070c(Object obj, Object obj2) {
            this.f4287a = obj;
            this.f4288b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = c.f4279d;
                if (method != null) {
                    method.invoke(this.f4287a, this.f4288b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    c.f4280e.invoke(this.f4287a, this.f4288b, Boolean.FALSE);
                }
            } catch (RuntimeException e11) {
                if (e11.getClass() == RuntimeException.class && e11.getMessage() != null && e11.getMessage().startsWith("Unable to stop")) {
                    throw e11;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        Object f4289a;

        /* renamed from: b  reason: collision with root package name */
        private Activity f4290b;

        /* renamed from: c  reason: collision with root package name */
        private final int f4291c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f4292d = false;

        /* renamed from: e  reason: collision with root package name */
        private boolean f4293e = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f4294f = false;

        d(Activity activity) {
            this.f4290b = activity;
            this.f4291c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f4290b == activity) {
                this.f4290b = null;
                this.f4293e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f4293e || this.f4294f || this.f4292d || !c.h(this.f4289a, this.f4291c, activity)) {
                return;
            }
            this.f4294f = true;
            this.f4289a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f4290b == activity) {
                this.f4292d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a11 = a();
        f4276a = a11;
        f4277b = b();
        f4278c = f();
        f4279d = d(a11);
        f4280e = c(a11);
        f4281f = e(a11);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i11 = Build.VERSION.SDK_INT;
        return i11 == 26 || i11 == 27;
    }

    protected static boolean h(Object obj, int i11, Activity activity) {
        try {
            Object obj2 = f4278c.get(activity);
            if (obj2 == obj && activity.hashCode() == i11) {
                f4282g.postAtFrontOfQueue(new RunnableC0070c(f4277b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f4281f == null) {
            return false;
        } else {
            if (f4280e == null && f4279d == null) {
                return false;
            }
            try {
                Object obj2 = f4278c.get(activity);
                if (obj2 == null || (obj = f4277b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                d dVar = new d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f4282g;
                handler.post(new a(dVar, obj2));
                if (g()) {
                    Method method = f4281f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}