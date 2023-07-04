package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzmv extends zzmu {
    @Override // com.google.android.gms.internal.measurement.zzmu
    final int zza(int i11, byte[] bArr, int i12, int i13) {
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
                    if (i14 < i13) {
                        if (b11 >= -62) {
                            i12 = i14 + 1;
                            if (bArr[i14] > -65) {
                            }
                        }
                        return -1;
                    }
                    return b11;
                }
                if (b11 < -16) {
                    if (i14 >= i13 - 1) {
                        return zzmx.zza(bArr, i14, i13);
                    }
                    int i15 = i14 + 1;
                    byte b12 = bArr[i14];
                    if (b12 <= -65 && ((b11 != -32 || b12 >= -96) && (b11 != -19 || b12 < -96))) {
                        i12 = i15 + 1;
                        if (bArr[i15] > -65) {
                        }
                    }
                } else if (i14 >= i13 - 2) {
                    return zzmx.zza(bArr, i14, i13);
                } else {
                    int i16 = i14 + 1;
                    byte b13 = bArr[i14];
                    if (b13 <= -65 && (((b11 << 28) + (b13 + 112)) >> 30) == 0) {
                        int i17 = i16 + 1;
                        if (bArr[i16] <= -65) {
                            i14 = i17 + 1;
                            if (bArr[i17] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i12 = i14;
        }
        return 0;
    }
}