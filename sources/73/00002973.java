package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zzkh {
    private final zzkf zza;
    private final Integer zzb;
    private final Integer zzc;
    private final Boolean zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzkh(zzke zzkeVar, zzkg zzkgVar) {
        zzkf zzkfVar;
        Integer num;
        zzkfVar = zzkeVar.zza;
        this.zza = zzkfVar;
        num = zzkeVar.zzb;
        this.zzb = num;
        this.zzc = null;
        this.zzd = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzkh) {
            zzkh zzkhVar = (zzkh) obj;
            return Objects.equal(this.zza, zzkhVar.zza) && Objects.equal(this.zzb, zzkhVar.zzb) && Objects.equal(null, null) && Objects.equal(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, null, null);
    }

    @zzcu(zza = 1)
    public final zzkf zza() {
        return this.zza;
    }

    @zzcu(zza = 2)
    public final Integer zzb() {
        return this.zzb;
    }
}