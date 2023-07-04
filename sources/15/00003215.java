package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
final class zzadx extends zzaea {
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzadx(byte[] bArr, int i11, int i12) {
        super(bArr);
        zzaed.zzj(0, i12, bArr.length);
        this.zzc = i12;
    }

    @Override // com.google.android.libraries.places.internal.zzaea, com.google.android.libraries.places.internal.zzaed
    public final byte zza(int i11) {
        int i12 = this.zzc;
        if (((i12 - (i11 + 1)) | i11) < 0) {
            if (i11 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i11);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i11 + ", " + i12);
        }
        return this.zza[i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzaea, com.google.android.libraries.places.internal.zzaed
    public final byte zzb(int i11) {
        return this.zza[i11];
    }

    @Override // com.google.android.libraries.places.internal.zzaea
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.libraries.places.internal.zzaea, com.google.android.libraries.places.internal.zzaed
    public final int zzd() {
        return this.zzc;
    }
}