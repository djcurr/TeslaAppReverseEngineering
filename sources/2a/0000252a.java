package com.google.android.gms.internal.mlkit_common;

import com.google.mlkit.common.sdkinternal.l;

/* loaded from: classes3.dex */
final class zzmg extends zzms {
    private final zziy zza;
    private final String zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final l zze;
    private final zzje zzf;
    private final int zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzmg(zziy zziyVar, String str, boolean z11, boolean z12, l lVar, zzje zzjeVar, int i11, zzmf zzmfVar) {
        this.zza = zziyVar;
        this.zzb = str;
        this.zzc = z11;
        this.zzd = z12;
        this.zze = lVar;
        this.zzf = zzjeVar;
        this.zzg = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzms) {
            zzms zzmsVar = (zzms) obj;
            if (this.zza.equals(zzmsVar.zzc()) && this.zzb.equals(zzmsVar.zze()) && this.zzc == zzmsVar.zzg() && this.zzd == zzmsVar.zzf() && this.zze.equals(zzmsVar.zzb()) && this.zzf.equals(zzmsVar.zzd()) && this.zzg == zzmsVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ (true == this.zzd ? 1231 : 1237)) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003) ^ this.zzg;
    }

    public final String toString() {
        String obj = this.zza.toString();
        String str = this.zzb;
        boolean z11 = this.zzc;
        boolean z12 = this.zzd;
        String obj2 = this.zze.toString();
        String obj3 = this.zzf.toString();
        int i11 = this.zzg;
        return "RemoteModelLoggingOptions{errorCode=" + obj + ", tfliteSchemaVersion=" + str + ", shouldLogRoughDownloadTime=" + z11 + ", shouldLogExactDownloadTime=" + z12 + ", modelType=" + obj2 + ", downloadStatus=" + obj3 + ", failureStatusCode=" + i11 + "}";
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzms
    public final int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzms
    public final l zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzms
    public final zziy zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzms
    public final zzje zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzms
    public final String zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzms
    public final boolean zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzms
    public final boolean zzg() {
        return this.zzc;
    }
}