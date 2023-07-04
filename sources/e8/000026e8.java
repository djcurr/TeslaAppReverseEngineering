package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes3.dex */
public final class zzpb {
    private static zzpa zza;

    public static synchronized zzoq zza(zzoh zzohVar) {
        zzoq zzoqVar;
        synchronized (zzpb.class) {
            if (zza == null) {
                zza = new zzpa(null);
            }
            zzoqVar = (zzoq) zza.get(zzohVar);
        }
        return zzoqVar;
    }

    public static synchronized zzoq zzb(String str) {
        zzoq zza2;
        synchronized (zzpb.class) {
            zza2 = zza(zzoh.zzd(str).zzd());
        }
        return zza2;
    }
}