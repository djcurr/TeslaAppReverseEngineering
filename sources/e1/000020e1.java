package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class zzfh extends zzfg {
    @Override // com.google.android.gms.internal.clearcut.zzfg
    final int zzb(int i11, byte[] bArr, int i12, int i13) {
        int zzf;
        int zzf2;
        while (i12 < i13 && bArr[i12] >= 0) {
            i12++;
        }
        if (i12 >= i13) {
            return 0;
        }
        while (i12 < i13) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            if (b11 < 0) {
                if (b11 < -32) {
                    if (i14 >= i13) {
                        return b11;
                    }
                    if (b11 >= -62) {
                        i12 = i14 + 1;
                        if (bArr[i14] > -65) {
                        }
                    }
                    return -1;
                } else if (b11 >= -16) {
                    if (i14 >= i13 - 2) {
                        zzf2 = zzff.zzf(bArr, i14, i13);
                        return zzf2;
                    }
                    int i15 = i14 + 1;
                    byte b12 = bArr[i14];
                    if (b12 <= -65 && (((b11 << 28) + (b12 + 112)) >> 30) == 0) {
                        int i16 = i15 + 1;
                        if (bArr[i15] <= -65) {
                            i14 = i16 + 1;
                            if (bArr[i16] > -65) {
                            }
                        }
                    }
                    return -1;
                } else if (i14 >= i13 - 1) {
                    zzf = zzff.zzf(bArr, i14, i13);
                    return zzf;
                } else {
                    int i17 = i14 + 1;
                    byte b13 = bArr[i14];
                    if (b13 <= -65 && ((b11 != -32 || b13 >= -96) && (b11 != -19 || b13 < -96))) {
                        i12 = i17 + 1;
                        if (bArr[i17] > -65) {
                        }
                    }
                    return -1;
                }
            }
            i12 = i14;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r10 + r0;
     */
    @Override // com.google.android.gms.internal.clearcut.zzfg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzfh.zzb(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.clearcut.zzfg
    public final void zzb(CharSequence charSequence, ByteBuffer byteBuffer) {
        zzfg.zzc(charSequence, byteBuffer);
    }
}