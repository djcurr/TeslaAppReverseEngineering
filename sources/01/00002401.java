package com.google.android.gms.internal.mlkit_common;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes3.dex */
final class zzbg implements zzbl {
    private final int zza;
    private final zzbk zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbg(int i11, zzbk zzbkVar) {
        this.zza = i11;
        this.zzb = zzbkVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzbl.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbl) {
            zzbl zzblVar = (zzbl) obj;
            return this.zza == zzblVar.zza() && this.zzb.equals(zzblVar.zzb());
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

    @Override // com.google.android.gms.internal.mlkit_common.zzbl
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbl
    public final zzbk zzb() {
        return this.zzb;
    }
}