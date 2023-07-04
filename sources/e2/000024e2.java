package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zzjp {
    private final zzjl zza;
    private final zzjn zzb;
    private final zzjn zzc;
    private final Boolean zzd;

    public /* synthetic */ zzjp(zzjm zzjmVar, zzjo zzjoVar) {
        zzjl zzjlVar;
        zzjlVar = zzjmVar.zza;
        this.zza = zzjlVar;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zzjp) && Objects.equal(this.zza, ((zzjp) obj).zza) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null, null, null);
    }

    @zzbl(zza = 1)
    public final zzjl zza() {
        return this.zza;
    }
}