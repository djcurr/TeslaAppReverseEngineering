package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class zzar implements zzca {
    private transient Set zza;
    private transient Map zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzca) {
            return zzp().equals(((zzca) obj).zzp());
        }
        return false;
    }

    public final int hashCode() {
        return zzp().hashCode();
    }

    public final String toString() {
        return ((zzah) zzp()).zza.toString();
    }

    abstract Map zzk();

    abstract Set zzl();

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzca
    public boolean zzo(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzca
    public final Map zzp() {
        Map map = this.zzb;
        if (map == null) {
            Map zzk = zzk();
            this.zzb = zzk;
            return zzk;
        }
        return map;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzca
    public final Set zzq() {
        Set set = this.zza;
        if (set == null) {
            Set zzl = zzl();
            this.zza = zzl;
            return zzl;
        }
        return set;
    }
}