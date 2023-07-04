package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes3.dex */
public final class zzki {
    private Long zza;
    private Long zzb;
    private Long zzc;
    private Long zzd;
    private Long zze;
    private Long zzf;

    public final zzki zza(Long l11) {
        this.zzc = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzki zzb(Long l11) {
        this.zzd = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzki zzc(Long l11) {
        this.zza = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzki zzd(Long l11) {
        this.zze = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzki zze(Long l11) {
        this.zzb = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzki zzf(Long l11) {
        this.zzf = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzkk zzg() {
        return new zzkk(this, null);
    }
}