package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
final class zzahu extends zzaht {
    @Override // com.google.android.libraries.places.internal.zzaht
    final int zza(int i11, byte[] bArr, int i12, int i13) {
        int i14 = 0;
        while (i14 < i13 && bArr[i14] >= 0) {
            i14++;
        }
        if (i14 >= i13) {
            return 0;
        }
        while (i14 < i13) {
            int i15 = i14 + 1;
            byte b11 = bArr[i14];
            if (b11 < 0) {
                if (b11 < -32) {
                    if (i15 < i13) {
                        if (b11 >= -62) {
                            i14 = i15 + 1;
                            if (bArr[i15] > -65) {
                            }
                        }
                        return -1;
                    }
                    return b11;
                }
                if (b11 < -16) {
                    if (i15 >= i13 - 1) {
                        return zzahw.zza(bArr, i15, i13);
                    }
                    int i16 = i15 + 1;
                    byte b12 = bArr[i15];
                    if (b12 <= -65 && ((b11 != -32 || b12 >= -96) && (b11 != -19 || b12 < -96))) {
                        i14 = i16 + 1;
                        if (bArr[i16] > -65) {
                        }
                    }
                } else if (i15 >= i13 - 2) {
                    return zzahw.zza(bArr, i15, i13);
                } else {
                    int i17 = i15 + 1;
                    byte b13 = bArr[i15];
                    if (b13 <= -65 && (((b11 << 28) + (b13 + 112)) >> 30) == 0) {
                        int i18 = i17 + 1;
                        if (bArr[i17] <= -65) {
                            i15 = i18 + 1;
                            if (bArr[i18] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i14 = i15;
        }
        return 0;
    }
}