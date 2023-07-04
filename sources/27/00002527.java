package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes3.dex */
final class zzmd extends zzmj {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzmd(String str, boolean z11, int i11, zzmc zzmcVar) {
        this.zza = str;
        this.zzb = z11;
        this.zzc = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzmj) {
            zzmj zzmjVar = (zzmj) obj;
            if (this.zza.equals(zzmjVar.zzb()) && this.zzb == zzmjVar.zzc() && this.zzc == zzmjVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        String str = this.zza;
        boolean z11 = this.zzb;
        int i11 = this.zzc;
        return "MLKitLoggingOptions{libraryName=" + str + ", enableFirelog=" + z11 + ", firelogEventType=" + i11 + "}";
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzmj
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzmj
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzmj
    public final boolean zzc() {
        return this.zzb;
    }
}