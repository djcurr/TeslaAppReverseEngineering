package ul;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class g<T> {

    /* renamed from: a */
    private final T f53564a;

    /* renamed from: b */
    private final c<T> f53565b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b implements c<Context> {

        /* renamed from: a */
        private final Class<? extends Service> f53566a;

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f53566a), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", this.f53566a + " has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // ul.g.c
        /* renamed from: c */
        public List<String> a(Context context) {
            Bundle b11 = b(context);
            if (b11 == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b11.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b11.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private b(Class<? extends Service> cls) {
            this.f53566a = cls;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface c<T> {
        List<String> a(T t11);
    }

    g(T t11, c<T> cVar) {
        this.f53564a = t11;
        this.f53565b = cVar;
    }

    public static /* synthetic */ i a(String str) {
        return d(str);
    }

    public static g<Context> c(Context context, Class<? extends Service> cls) {
        return new g<>(context, new b(cls));
    }

    public static i d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (i.class.isAssignableFrom(cls)) {
                return (i) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e11) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e11);
        } catch (InstantiationException e12) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e12);
        } catch (NoSuchMethodException e13) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e13);
        } catch (InvocationTargetException e14) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e14);
        }
    }

    public List<sm.b<i>> b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f53565b.a(this.f53564a)) {
            arrayList.add(new sm.b() { // from class: ul.f
                @Override // sm.b
                public final Object get() {
                    return g.a(str);
                }
            });
        }
        return arrayList;
    }
}