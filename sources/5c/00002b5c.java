package com.google.android.gms.internal.mlkit_vision_text_common;

/* loaded from: classes3.dex */
public final class zzmw {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private zzbm zze;
    private String zzf;
    private Boolean zzg;
    private Boolean zzh;
    private Boolean zzi;
    private Integer zzj;
    private Integer zzk;

    public final zzmw zzb(String str) {
        this.zza = str;
        return this;
    }

    public final zzmw zzc(String str) {
        this.zzb = str;
        return this;
    }

    public final zzmw zzd(Integer num) {
        this.zzj = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzmw zze(Boolean bool) {
        this.zzg = bool;
        return this;
    }

    public final zzmw zzf(Boolean bool) {
        this.zzi = bool;
        return this;
    }

    public final zzmw zzg(Boolean bool) {
        this.zzh = bool;
        return this;
    }

    public final zzmw zzh(zzbm zzbmVar) {
        this.zze = zzbmVar;
        return this;
    }

    public final zzmw zzi(String str) {
        this.zzf = str;
        return this;
    }

    public final zzmw zzj(String str) {
        this.zzc = str;
        return this;
    }

    public final zzmw zzk(Integer num) {
        this.zzk = num;
        return this;
    }

    public final zzmw zzl(String str) {
        this.zzd = str;
        return this;
    }

    public final zzmy zzm() {
        return new zzmy(this, null);
    }
}