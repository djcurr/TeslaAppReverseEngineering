package com.google.android.gms.internal.clearcut;

/* loaded from: classes3.dex */
final class zzbe extends zzbi {
    private final int zzfm;
    private final int zzfn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbe(byte[] bArr, int i11, int i12) {
        super(bArr);
        zzbb.zzb(i11, i11 + i12, bArr.length);
        this.zzfm = i11;
        this.zzfn = i12;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbi, com.google.android.gms.internal.clearcut.zzbb
    public final int size() {
        return this.zzfn;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbi
    protected final int zzac() {
        return this.zzfm;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbi, com.google.android.gms.internal.clearcut.zzbb
    public final byte zzj(int i11) {
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
        return this.zzfp[this.zzfm + i11];
    }
}