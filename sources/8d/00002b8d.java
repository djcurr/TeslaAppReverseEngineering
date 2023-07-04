package com.google.android.gms.internal.mlkit_vision_text_common;

/* loaded from: classes3.dex */
public final class zzor {
    private static zzoq zza;

    public static synchronized zzog zza(zznx zznxVar) {
        zzog zzogVar;
        synchronized (zzor.class) {
            if (zza == null) {
                zza = new zzoq(null);
            }
            zzogVar = (zzog) zza.get(zznxVar);
        }
        return zzogVar;
    }

    public static synchronized zzog zzb(String str) {
        zzog zza2;
        synchronized (zzor.class) {
            zza2 = zza(zznx.zzd(str).zzd());
        }
        return zza2;
    }
}