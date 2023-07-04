package sl;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.internal.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import sl.a;

/* loaded from: classes3.dex */
public class b implements sl.a {

    /* renamed from: c */
    private static volatile sl.a f50461c;
    @VisibleForTesting

    /* renamed from: a */
    final AppMeasurementSdk f50462a;
    @VisibleForTesting

    /* renamed from: b */
    final Map f50463b;

    /* loaded from: classes3.dex */
    class a implements a.InterfaceC1118a {
        a(b bVar, String str) {
        }
    }

    b(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f50462a = appMeasurementSdk;
        this.f50463b = new ConcurrentHashMap();
    }

    @KeepForSdk
    public static sl.a h(com.google.firebase.d dVar, Context context, pm.d dVar2) {
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(dVar2);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f50461c == null) {
            synchronized (b.class) {
                if (f50461c == null) {
                    Bundle bundle = new Bundle(1);
                    if (dVar.t()) {
                        dVar2.b(com.google.firebase.a.class, new Executor() { // from class: sl.d
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new pm.b() { // from class: sl.c
                            @Override // pm.b
                            public final void a(pm.a aVar) {
                                b.i(aVar);
                            }
                        });
                        bundle.putBoolean("dataCollectionDefaultEnabled", dVar.s());
                    }
                    f50461c = new b(zzee.zzg(context, null, null, null, bundle).zzd());
                }
            }
        }
        return f50461c;
    }

    public static /* synthetic */ void i(pm.a aVar) {
        boolean z11 = ((com.google.firebase.a) aVar.a()).f16435a;
        synchronized (b.class) {
            ((b) Preconditions.checkNotNull(f50461c)).f50462a.zza(z11);
        }
    }

    private final boolean j(String str) {
        return (str.isEmpty() || !this.f50463b.containsKey(str) || this.f50463b.get(str) == null) ? false : true;
    }

    @Override // sl.a
    @KeepForSdk
    public void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.i(str) && com.google.firebase.analytics.connector.internal.b.g(str2, bundle) && com.google.firebase.analytics.connector.internal.b.e(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.b.d(str, str2, bundle);
            this.f50462a.logEvent(str, str2, bundle);
        }
    }

    @Override // sl.a
    @KeepForSdk
    public void b(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.b.i(str) && com.google.firebase.analytics.connector.internal.b.j(str, str2)) {
            this.f50462a.setUserProperty(str, str2, obj);
        }
    }

    @Override // sl.a
    @KeepForSdk
    public Map<String, Object> c(boolean z11) {
        return this.f50462a.getUserProperties(null, null, z11);
    }

    @Override // sl.a
    @KeepForSdk
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.b.g(str2, bundle)) {
            this.f50462a.clearConditionalUserProperty(str, str2, bundle);
        }
    }

    @Override // sl.a
    @KeepForSdk
    public a.InterfaceC1118a d(String str, a.b bVar) {
        Object fVar;
        Preconditions.checkNotNull(bVar);
        if (com.google.firebase.analytics.connector.internal.b.i(str) && !j(str)) {
            AppMeasurementSdk appMeasurementSdk = this.f50462a;
            if (AppMeasurement.FIAM_ORIGIN.equals(str)) {
                fVar = new com.google.firebase.analytics.connector.internal.d(appMeasurementSdk, bVar);
            } else {
                fVar = (AppMeasurement.CRASH_ORIGIN.equals(str) || "clx".equals(str)) ? new f(appMeasurementSdk, bVar) : null;
            }
            if (fVar != null) {
                this.f50463b.put(str, fVar);
                return new a(this, str);
            }
            return null;
        }
        return null;
    }

    @Override // sl.a
    @KeepForSdk
    public int e(String str) {
        return this.f50462a.getMaxUserProperties(str);
    }

    @Override // sl.a
    @KeepForSdk
    public List<a.c> f(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f50462a.getConditionalUserProperties(str, str2)) {
            arrayList.add(com.google.firebase.analytics.connector.internal.b.b(bundle));
        }
        return arrayList;
    }

    @Override // sl.a
    @KeepForSdk
    public void g(a.c cVar) {
        if (com.google.firebase.analytics.connector.internal.b.f(cVar)) {
            this.f50462a.setConditionalUserProperty(com.google.firebase.analytics.connector.internal.b.a(cVar));
        }
    }
}