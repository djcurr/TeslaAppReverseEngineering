package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzko extends zzks {
    private String zza;
    private boolean zzb;
    private int zzc;
    private byte zzd;

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzks
    public final zzks zza(boolean z11) {
        this.zzb = true;
        this.zzd = (byte) (1 | this.zzd);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzks
    public final zzks zzb(int i11) {
        this.zzc = 1;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    public final zzks zzc(String str) {
        this.zza = "vision-common";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzks
    public final zzkt zzd() {
        String str;
        if (this.zzd == 3 && (str = this.zza) != null) {
            return new zzkq(str, this.zzb, this.zzc, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" libraryName");
        }
        if ((this.zzd & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.zzd & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}