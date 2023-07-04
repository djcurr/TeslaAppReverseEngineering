package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x4.b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f5962d;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f5963e = new Object();

    /* renamed from: c  reason: collision with root package name */
    final Context f5966c;

    /* renamed from: b  reason: collision with root package name */
    final Set<Class<? extends x4.a<?>>> f5965b = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    final Map<Class<?>, Object> f5964a = new HashMap();

    a(Context context) {
        this.f5966c = context.getApplicationContext();
    }

    private <T> T c(Class<? extends x4.a<?>> cls, Set<Class<?>> set) {
        T t11;
        if (z4.a.d()) {
            try {
                z4.a.a(cls.getSimpleName());
            } finally {
                z4.a.b();
            }
        }
        if (!set.contains(cls)) {
            if (!this.f5964a.containsKey(cls)) {
                set.add(cls);
                x4.a<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends x4.a<?>>> a11 = newInstance.a();
                if (!a11.isEmpty()) {
                    for (Class<? extends x4.a<?>> cls2 : a11) {
                        if (!this.f5964a.containsKey(cls2)) {
                            c(cls2, set);
                        }
                    }
                }
                t11 = (T) newInstance.b(this.f5966c);
                set.remove(cls);
                this.f5964a.put(cls, t11);
            } else {
                t11 = (T) this.f5964a.get(cls);
            }
            return t11;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }

    public static a d(Context context) {
        if (f5962d == null) {
            synchronized (f5963e) {
                if (f5962d == null) {
                    f5962d = new a(context);
                }
            }
        }
        return f5962d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        try {
            try {
                z4.a.a("Startup");
                b(this.f5966c.getPackageManager().getProviderInfo(new ComponentName(this.f5966c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e11) {
                throw new StartupException(e11);
            }
        } finally {
            z4.a.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void b(Bundle bundle) {
        String string = this.f5966c.getString(b.f57026a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (x4.a.class.isAssignableFrom(cls)) {
                            this.f5965b.add(cls);
                        }
                    }
                }
                for (Class<? extends x4.a<?>> cls2 : this.f5965b) {
                    c(cls2, hashSet);
                }
            } catch (ClassNotFoundException e11) {
                throw new StartupException(e11);
            }
        }
    }

    public boolean e(Class<? extends x4.a<?>> cls) {
        return this.f5965b.contains(cls);
    }
}