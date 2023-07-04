package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes3.dex */
public final class zzli {
    private static zzlh zza;

    public static synchronized zzkz zza(zzkt zzktVar) {
        zzkz zzkzVar;
        synchronized (zzli.class) {
            if (zza == null) {
                zza = new zzlh(null);
            }
            zzkzVar = (zzkz) zza.get(zzktVar);
        }
        return zzkzVar;
    }

    public static synchronized zzkz zzb(String str) {
        zzkz zza2;
        synchronized (zzli.class) {
            zza2 = zza(zzkt.zzd("vision-common").zzd());
        }
        return zza2;
    }
}