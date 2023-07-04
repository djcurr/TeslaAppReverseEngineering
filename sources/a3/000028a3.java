package com.google.android.gms.internal.mlkit_vision_face;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes3.dex */
final class zzcp implements zzcu {
    private final int zza;
    private final zzct zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcp(int i11, zzct zzctVar) {
        this.zza = i11;
        this.zzb = zzctVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzcu.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcu) {
            zzcu zzcuVar = (zzcu) obj;
            return this.zza == zzcuVar.zza() && this.zzb.equals(zzcuVar.zzb());
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

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcu
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcu
    public final zzct zzb() {
        return this.zzb;
    }
}