package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes3.dex */
public final class zzne {
    private static zzne zza;

    private zzne() {
    }

    public static synchronized zzne zza() {
        zzne zzneVar;
        synchronized (zzne.class) {
            if (zza == null) {
                zza = new zzne();
            }
            zzneVar = zza;
        }
        return zzneVar;
    }

    public static void zzb() {
        zznd.zza();
    }
}