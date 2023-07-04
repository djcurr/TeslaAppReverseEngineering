package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes3.dex */
public final class zzhl {
    private Long zza;
    private zzhm zzb;
    private zzhh zzc;
    private Integer zzd;
    private Integer zze;
    private Integer zzf;
    private Integer zzg;

    public final zzhl zzb(Long l11) {
        this.zza = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzhl zzc(Integer num) {
        this.zzd = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzhl zzd(zzhh zzhhVar) {
        this.zzc = zzhhVar;
        return this;
    }

    public final zzhl zze(Integer num) {
        this.zzf = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzhl zzf(zzhm zzhmVar) {
        this.zzb = zzhmVar;
        return this;
    }

    public final zzhl zzg(Integer num) {
        this.zze = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzhl zzh(Integer num) {
        this.zzg = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzho zzj() {
        return new zzho(this, null);
    }
}