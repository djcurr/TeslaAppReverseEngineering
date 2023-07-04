package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes3.dex */
public final class zzjp {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private zzp zze;
    private String zzf;
    private Boolean zzg;
    private Boolean zzh;
    private Boolean zzi;
    private Integer zzj;
    private Integer zzk;

    public final zzjp zzb(String str) {
        this.zza = str;
        return this;
    }

    public final zzjp zzc(String str) {
        this.zzb = str;
        return this;
    }

    public final zzjp zzd(Integer num) {
        this.zzj = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzjp zze(Boolean bool) {
        this.zzg = bool;
        return this;
    }

    public final zzjp zzf(Boolean bool) {
        this.zzi = bool;
        return this;
    }

    public final zzjp zzg(Boolean bool) {
        this.zzh = bool;
        return this;
    }

    public final zzjp zzh(zzp zzpVar) {
        this.zze = zzpVar;
        return this;
    }

    public final zzjp zzi(String str) {
        this.zzf = str;
        return this;
    }

    public final zzjp zzj(String str) {
        this.zzc = str;
        return this;
    }

    public final zzjp zzk(Integer num) {
        this.zzk = num;
        return this;
    }

    public final zzjp zzl(String str) {
        this.zzd = str;
        return this;
    }

    public final zzjr zzm() {
        return new zzjr(this, null);
    }
}