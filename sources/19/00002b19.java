package com.google.android.gms.internal.mlkit_vision_text_common;

/* loaded from: classes3.dex */
public final class zzkj {
    private Long zza;
    private zzks zzb;
    private Boolean zzc;
    private Boolean zzd;
    private Boolean zze;

    public final zzkj zza(Boolean bool) {
        this.zzd = bool;
        return this;
    }

    public final zzkj zzb(Boolean bool) {
        this.zze = bool;
        return this;
    }

    public final zzkj zzc(Long l11) {
        this.zza = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzkj zzd(zzks zzksVar) {
        this.zzb = zzksVar;
        return this;
    }

    public final zzkj zze(Boolean bool) {
        this.zzc = bool;
        return this;
    }

    public final zzkl zzf() {
        return new zzkl(this, null);
    }
}