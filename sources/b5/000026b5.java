package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes3.dex */
public final class zzne {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private zzcc zze;
    private String zzf;
    private Boolean zzg;
    private Boolean zzh;
    private Boolean zzi;
    private Integer zzj;
    private Integer zzk;

    public final zzne zzb(String str) {
        this.zza = str;
        return this;
    }

    public final zzne zzc(String str) {
        this.zzb = str;
        return this;
    }

    public final zzne zzd(Integer num) {
        this.zzj = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzne zze(Boolean bool) {
        this.zzg = bool;
        return this;
    }

    public final zzne zzf(Boolean bool) {
        this.zzi = bool;
        return this;
    }

    public final zzne zzg(Boolean bool) {
        this.zzh = bool;
        return this;
    }

    public final zzne zzh(zzcc zzccVar) {
        this.zze = zzccVar;
        return this;
    }

    public final zzne zzi(String str) {
        this.zzf = str;
        return this;
    }

    public final zzne zzj(String str) {
        this.zzc = str;
        return this;
    }

    public final zzne zzk(Integer num) {
        this.zzk = num;
        return this;
    }

    public final zzne zzl(String str) {
        this.zzd = str;
        return this;
    }

    public final zzng zzm() {
        return new zzng(this, null);
    }
}