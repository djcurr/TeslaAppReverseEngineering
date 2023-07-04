package com.google.android.gms.internal.mlkit_vision_face;

/* loaded from: classes3.dex */
public final class zzjt {
    private Long zza;
    private Long zzb;
    private Long zzc;
    private Long zzd;
    private Long zze;
    private Long zzf;

    public final zzjt zza(Long l11) {
        this.zzc = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjt zzb(Long l11) {
        this.zzd = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjt zzc(Long l11) {
        this.zza = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjt zzd(Long l11) {
        this.zze = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjt zze(Long l11) {
        this.zzb = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjt zzf(Long l11) {
        this.zzf = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjv zzg() {
        return new zzjv(this, null);
    }
}