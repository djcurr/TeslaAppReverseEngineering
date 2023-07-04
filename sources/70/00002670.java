package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zzkq {
    private final zzko zza;
    private final Integer zzb;
    private final Integer zzc;
    private final Boolean zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzkq(zzkn zzknVar, zzkp zzkpVar) {
        zzko zzkoVar;
        Integer num;
        zzkoVar = zzknVar.zza;
        this.zza = zzkoVar;
        num = zzknVar.zzb;
        this.zzb = num;
        this.zzc = null;
        this.zzd = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzkq) {
            zzkq zzkqVar = (zzkq) obj;
            return Objects.equal(this.zza, zzkqVar.zza) && Objects.equal(this.zzb, zzkqVar.zzb) && Objects.equal(null, null) && Objects.equal(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, null, null);
    }

    @zzdj(zza = 1)
    public final zzko zza() {
        return this.zza;
    }

    @zzdj(zza = 2)
    public final Integer zzb() {
        return this.zzb;
    }
}