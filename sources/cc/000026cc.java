package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zzoa {
    private final zzcc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzoa(zzny zznyVar, zznz zznzVar) {
        zzcc zzccVar;
        zzccVar = zznyVar.zza;
        this.zza = zzccVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzoa) {
            return Objects.equal(this.zza, ((zzoa) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza);
    }

    @zzdj(zza = 1)
    public final zzcc zza() {
        return this.zza;
    }
}