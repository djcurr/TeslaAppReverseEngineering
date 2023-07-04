package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.OutputStream;

/* loaded from: classes3.dex */
final class zzdg extends OutputStream {
    private long zza = 0;

    @Override // java.io.OutputStream
    public final void write(int i11) {
        this.zza++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.zza += bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zza() {
        return this.zza;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i11, int i12) {
        int length;
        int i13;
        if (i11 >= 0 && i11 <= (length = bArr.length) && i12 >= 0 && (i13 = i11 + i12) <= length && i13 >= 0) {
            this.zza += i12;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}