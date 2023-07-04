package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zzcc {
    static zzcc zza;
    private final zzcd zzb;

    private zzcc(zzcd zzcdVar) {
        this.zzb = zzcdVar;
    }

    public static zzcc zza() {
        zzcc zzccVar = new zzcc(new zzcb());
        zza = zzccVar;
        return zzccVar;
    }
}