package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.collection.a;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzhv implements zzhe {
    private static final Map zza = new a();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzhv zza(Context context, String str) {
        zzhv zzhvVar;
        if (!zzgw.zza()) {
            synchronized (zzhv.class) {
                zzhvVar = (zzhv) zza.get(null);
                if (zzhvVar == null) {
                    StrictMode.allowThreadDiskReads();
                    throw null;
                }
            }
            return zzhvVar;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void zzc() {
        synchronized (zzhv.class) {
            Map map = zza;
            Iterator it2 = map.values().iterator();
            if (!it2.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = ((zzhv) it2.next()).zzb;
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final Object zzb(String str) {
        throw null;
    }
}