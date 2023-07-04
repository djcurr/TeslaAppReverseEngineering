package qh;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
class i implements d {

    /* renamed from: a  reason: collision with root package name */
    private final a f48160a;

    /* renamed from: b  reason: collision with root package name */
    private final g f48161b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, k> f48162c;

    /* loaded from: classes3.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f48163a;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, String> f48164b = null;

        a(Context context) {
            this.f48163a = context;
        }

        private Map<String, String> a(Context context) {
            Bundle d11 = d(context);
            if (d11 == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d11.keySet()) {
                Object obj = d11.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        private Map<String, String> c() {
            if (this.f48164b == null) {
                this.f48164b = a(this.f48163a);
            }
            return this.f48164b;
        }

        private static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        c b(String str) {
            String str2 = c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (c) Class.forName(str2).asSubclass(c.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e11) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e11);
                return null;
            } catch (IllegalAccessException e12) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e12);
                return null;
            } catch (InstantiationException e13) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e13);
                return null;
            } catch (NoSuchMethodException e14) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e14);
                return null;
            } catch (InvocationTargetException e15) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e15);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Context context, g gVar) {
        this(new a(context), gVar);
    }

    @Override // qh.d
    public synchronized k get(String str) {
        if (this.f48162c.containsKey(str)) {
            return this.f48162c.get(str);
        }
        c b11 = this.f48160a.b(str);
        if (b11 == null) {
            return null;
        }
        k create = b11.create(this.f48161b.a(str));
        this.f48162c.put(str, create);
        return create;
    }

    i(a aVar, g gVar) {
        this.f48162c = new HashMap();
        this.f48160a = aVar;
        this.f48161b = gVar;
    }
}