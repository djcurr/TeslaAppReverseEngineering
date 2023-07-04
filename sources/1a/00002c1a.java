package com.google.android.gms.internal.vision;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzes extends zzex {
    private final int zzsb;
    private final int zzsc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzes(byte[] bArr, int i11, int i12) {
        super(bArr);
        zzeo.zzb(i11, i11 + i12, bArr.length);
        this.zzsb = i11;
        this.zzsc = i12;
    }

    @Override // com.google.android.gms.internal.vision.zzex, com.google.android.gms.internal.vision.zzeo
    public final int size() {
        return this.zzsc;
    }

    @Override // com.google.android.gms.internal.vision.zzex, com.google.android.gms.internal.vision.zzeo
    protected final void zza(byte[] bArr, int i11, int i12, int i13) {
        System.arraycopy(this.zzse, zzdn(), bArr, 0, i13);
    }

    @Override // com.google.android.gms.internal.vision.zzex, com.google.android.gms.internal.vision.zzeo
    public final byte zzai(int i11) {
        int size = size();
        if (((size - (i11 + 1)) | i11) < 0) {
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
            sb3.append(size);
            throw new ArrayIndexOutOfBoundsException(sb3.toString());
        }
        return this.zzse[this.zzsb + i11];
    }

    @Override // com.google.android.gms.internal.vision.zzex
    protected final int zzdn() {
        return this.zzsb;
    }
}