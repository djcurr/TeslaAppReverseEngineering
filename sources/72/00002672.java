package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes3.dex */
public final class zzks {
    private Long zza;
    private zzlb zzb;
    private Boolean zzc;
    private Boolean zzd;
    private Boolean zze;

    public final zzks zza(Boolean bool) {
        this.zzd = bool;
        return this;
    }

    public final zzks zzb(Boolean bool) {
        this.zze = bool;
        return this;
    }

    public final zzks zzc(Long l11) {
        this.zza = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzks zzd(zzlb zzlbVar) {
        this.zzb = zzlbVar;
        return this;
    }

    public final zzks zze(Boolean bool) {
        this.zzc = bool;
        return this;
    }

    public final zzku zzf() {
        return new zzku(this, null);
    }
}