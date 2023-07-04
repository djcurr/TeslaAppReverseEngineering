package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzis extends zziv {
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzis(byte[] bArr, int i11, int i12) {
        super(bArr);
        zziy.zzj(0, i12, bArr.length);
        this.zzc = i12;
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zziy
    public final byte zza(int i11) {
        int i12 = this.zzc;
        if (((i12 - (i11 + 1)) | i11) < 0) {
            if (i11 < 0) {
                StringBuilder sb2 = new StringBuilder(22);
                sb2.append("Index < 0: ");
                sb2.append(i11);
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(40);
            sb3.append("Index > length: ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(i12);
            throw new ArrayIndexOutOfBoundsException(sb3.toString());
        }
        return this.zza[i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zziy
    public final byte zzb(int i11) {
        return this.zza[i11];
    }

    @Override // com.google.android.gms.internal.measurement.zziv
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zziy
    public final int zzd() {
        return this.zzc;
    }
}