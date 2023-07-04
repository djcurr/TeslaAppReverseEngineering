package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zzdn {
    private final zzks zza;
    private final Boolean zzb;
    private final zzkh zzc = null;
    private final zzkd zzd;
    private final Integer zze;
    private final Integer zzf;

    public /* synthetic */ zzdn(zzdl zzdlVar, zzdm zzdmVar) {
        this.zza = zzdl.zzh(zzdlVar);
        this.zzb = zzdl.zzi(zzdlVar);
        this.zzd = zzdl.zzg(zzdlVar);
        this.zze = zzdl.zzj(zzdlVar);
        this.zzf = zzdl.zzk(zzdlVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdn) {
            zzdn zzdnVar = (zzdn) obj;
            return Objects.equal(this.zza, zzdnVar.zza) && Objects.equal(this.zzb, zzdnVar.zzb) && Objects.equal(null, null) && Objects.equal(this.zzd, zzdnVar.zzd) && Objects.equal(this.zze, zzdnVar.zze) && Objects.equal(this.zzf, zzdnVar.zzf);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, null, this.zzd, this.zze, this.zzf);
    }

    @zzcu(zza = 4)
    public final zzkd zza() {
        return this.zzd;
    }

    @zzcu(zza = 1)
    public final zzks zzb() {
        return this.zza;
    }

    @zzcu(zza = 2)
    public final Boolean zzc() {
        return this.zzb;
    }

    @zzcu(zza = 5)
    public final Integer zzd() {
        return this.zze;
    }

    @zzcu(zza = 6)
    public final Integer zze() {
        return this.zzf;
    }
}