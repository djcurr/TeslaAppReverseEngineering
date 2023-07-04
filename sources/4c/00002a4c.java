package com.google.android.gms.internal.mlkit_vision_text_common;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes3.dex */
final class zzcu implements zzcz {
    private final int zza;
    private final zzcy zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcu(int i11, zzcy zzcyVar) {
        this.zza = i11;
        this.zzb = zzcyVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzcz.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcz) {
            zzcz zzczVar = (zzcz) obj;
            return this.zza == zzczVar.zza() && this.zzb.equals(zzczVar.zzb());
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.zza ^ 14552422) + (this.zzb.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.zza + "intEncoding=" + this.zzb + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcz
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcz
    public final zzcy zzb() {
        return this.zzb;
    }
}