package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zzdy {
    private final zzlb zza;
    private final Boolean zzc;
    private final zzoa zze;
    private final zzcc zzf;
    private final zzcc zzg;
    private final Boolean zzb = null;
    private final zzkq zzd = null;

    public /* synthetic */ zzdy(zzdw zzdwVar, zzdx zzdxVar) {
        this.zza = zzdw.zzi(zzdwVar);
        this.zzc = zzdw.zzk(zzdwVar);
        this.zze = zzdw.zzj(zzdwVar);
        this.zzf = zzdw.zza(zzdwVar);
        this.zzg = zzdw.zzb(zzdwVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdy) {
            zzdy zzdyVar = (zzdy) obj;
            return Objects.equal(this.zza, zzdyVar.zza) && Objects.equal(null, null) && Objects.equal(this.zzc, zzdyVar.zzc) && Objects.equal(null, null) && Objects.equal(this.zze, zzdyVar.zze) && Objects.equal(this.zzf, zzdyVar.zzf) && Objects.equal(this.zzg, zzdyVar.zzg);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null, this.zzc, null, this.zze, this.zzf, this.zzg);
    }

    @zzdj(zza = 6)
    public final zzcc zza() {
        return this.zzf;
    }

    @zzdj(zza = 7)
    public final zzcc zzb() {
        return this.zzg;
    }

    @zzdj(zza = 1)
    public final zzlb zzc() {
        return this.zza;
    }

    @zzdj(zza = 5)
    public final zzoa zzd() {
        return this.zze;
    }

    @zzdj(zza = 3)
    public final Boolean zze() {
        return this.zzc;
    }
}