package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zzee {
    private final zzks zza;
    private final Boolean zzc;
    private final zzmq zze;
    private final Boolean zzb = null;
    private final zzkh zzd = null;

    public /* synthetic */ zzee(zzec zzecVar, zzed zzedVar) {
        zzks zzksVar;
        Boolean bool;
        zzmq zzmqVar;
        zzksVar = zzecVar.zza;
        this.zza = zzksVar;
        this.zzb = null;
        bool = zzecVar.zzb;
        this.zzc = bool;
        this.zzd = null;
        zzmqVar = zzecVar.zzc;
        this.zze = zzmqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzee) {
            zzee zzeeVar = (zzee) obj;
            return Objects.equal(this.zza, zzeeVar.zza) && Objects.equal(null, null) && Objects.equal(this.zzc, zzeeVar.zzc) && Objects.equal(null, null) && Objects.equal(this.zze, zzeeVar.zze);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null, this.zzc, null, this.zze);
    }

    @zzcz(zza = 1)
    public final zzks zza() {
        return this.zza;
    }

    @zzcz(zza = 5)
    public final zzmq zzb() {
        return this.zze;
    }

    @zzcz(zza = 3)
    public final Boolean zzc() {
        return this.zzc;
    }
}