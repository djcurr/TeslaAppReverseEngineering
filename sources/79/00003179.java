package com.google.android.libraries.places.api.model;

/* loaded from: classes3.dex */
abstract class zzg extends zzbb {
    private final int zza;
    private final int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzg(int i11, int i12) {
        this.zza = i11;
        this.zzb = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbb) {
            zzbb zzbbVar = (zzbb) obj;
            if (this.zza == zzbbVar.zzb() && this.zzb == zzbbVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final String toString() {
        int i11 = this.zza;
        int i12 = this.zzb;
        return "SubstringMatch{offset=" + i11 + ", length=" + i12 + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.zzbb
    public final int zza() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.zzbb
    public final int zzb() {
        return this.zza;
    }
}