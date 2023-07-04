package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zzkd {
    private final zzka zza;
    private final zzjy zzb;
    private final zzkb zzc;
    private final zzjz zzd;
    private final Boolean zze;
    private final Float zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzkd(zzjx zzjxVar, zzkc zzkcVar) {
        zzka zzkaVar;
        zzjy zzjyVar;
        zzkb zzkbVar;
        zzjz zzjzVar;
        Boolean bool;
        Float f11;
        zzkaVar = zzjxVar.zza;
        this.zza = zzkaVar;
        zzjyVar = zzjxVar.zzb;
        this.zzb = zzjyVar;
        zzkbVar = zzjxVar.zzc;
        this.zzc = zzkbVar;
        zzjzVar = zzjxVar.zzd;
        this.zzd = zzjzVar;
        bool = zzjxVar.zze;
        this.zze = bool;
        f11 = zzjxVar.zzf;
        this.zzf = f11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzkd) {
            zzkd zzkdVar = (zzkd) obj;
            return Objects.equal(this.zza, zzkdVar.zza) && Objects.equal(this.zzb, zzkdVar.zzb) && Objects.equal(this.zzc, zzkdVar.zzc) && Objects.equal(this.zzd, zzkdVar.zzd) && Objects.equal(this.zze, zzkdVar.zze) && Objects.equal(this.zzf, zzkdVar.zzf);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }

    @zzcu(zza = 2)
    public final zzjy zza() {
        return this.zzb;
    }

    @zzcu(zza = 4)
    public final zzjz zzb() {
        return this.zzd;
    }

    @zzcu(zza = 1)
    public final zzka zzc() {
        return this.zza;
    }

    @zzcu(zza = 3)
    public final zzkb zzd() {
        return this.zzc;
    }

    @zzcu(zza = 5)
    public final Boolean zze() {
        return this.zze;
    }

    @zzcu(zza = 6)
    public final Float zzf() {
        return this.zzf;
    }
}