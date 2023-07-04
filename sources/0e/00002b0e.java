package com.google.android.gms.internal.mlkit_vision_text_common;

/* loaded from: classes3.dex */
public final class zzjz {
    private Long zza;
    private Long zzb;
    private Long zzc;
    private Long zzd;
    private Long zze;
    private Long zzf;

    public final zzjz zza(Long l11) {
        this.zzc = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjz zzb(Long l11) {
        this.zzd = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjz zzc(Long l11) {
        this.zza = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjz zzd(Long l11) {
        this.zze = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjz zze(Long l11) {
        this.zzb = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjz zzf(Long l11) {
        this.zzf = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzkb zzg() {
        return new zzkb(this, null);
    }
}