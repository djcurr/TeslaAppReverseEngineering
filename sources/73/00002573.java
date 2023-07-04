package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class zzbg implements zzcp {
    private transient Set zza;
    private transient Map zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcp) {
            return zzp().equals(((zzcp) obj).zzp());
        }
        return false;
    }

    public final int hashCode() {
        return zzp().hashCode();
    }

    public final String toString() {
        return ((zzaw) zzp()).zza.toString();
    }

    abstract Map zzk();

    abstract Set zzl();

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcp
    public boolean zzo(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcp
    public final Map zzp() {
        Map map = this.zzb;
        if (map == null) {
            Map zzk = zzk();
            this.zzb = zzk;
            return zzk;
        }
        return map;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcp
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