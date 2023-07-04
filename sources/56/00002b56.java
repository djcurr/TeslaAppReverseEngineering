package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zzmq {
    private final zzmo zza;
    private final Boolean zzb;
    private final String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzmq(zzmn zzmnVar, zzmp zzmpVar) {
        zzmo zzmoVar;
        zzmoVar = zzmnVar.zza;
        this.zza = zzmoVar;
        this.zzb = null;
        this.zzc = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zzmq) && Objects.equal(this.zza, ((zzmq) obj).zza) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null, null);
    }

    @zzcz(zza = 3)
    public final zzmo zza() {
        return this.zza;
    }
}