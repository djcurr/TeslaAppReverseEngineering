package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes3.dex */
final class zzad implements zzai {
    private final int zza;
    private final zzah zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzad(int i11, zzah zzahVar) {
        this.zza = i11;
        this.zzb = zzahVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzai.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzai) {
            zzai zzaiVar = (zzai) obj;
            return this.zza == zzaiVar.zza() && this.zzb.equals(zzaiVar.zzb());
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

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzai
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzai
    public final zzah zzb() {
        return this.zzb;
    }
}