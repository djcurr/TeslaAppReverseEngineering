package com.google.android.gms.internal.vision;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class zziz extends zziy {
    @Override // com.google.android.gms.internal.vision.zziy
    final int zzb(int i11, byte[] bArr, int i12, int i13) {
        int zzh;
        int zzh2;
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
                        zzh2 = zziw.zzh(bArr, i14, i13);
                        return zzh2;
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
                    zzh = zziw.zzh(bArr, i14, i13);
                    return zzh;
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
    @Override // com.google.android.gms.internal.vision.zziy
    public final String zzi(byte[] bArr, int i11, int i12) {
        boolean zzd;
        boolean zzd2;
        boolean zze;
        boolean zzf;
        boolean zzd3;
        if ((i11 | i12 | ((bArr.length - i11) - i12)) >= 0) {
            int i13 = i11 + i12;
            char[] cArr = new char[i12];
            int i14 = 0;
            while (i11 < i13) {
                byte b11 = bArr[i11];
                zzd3 = zzix.zzd(b11);
                if (!zzd3) {
                    break;
                }
                i11++;
                zzix.zza(b11, cArr, i14);
                i14++;
            }
            int i15 = i14;
            while (i11 < i13) {
                int i16 = i11 + 1;
                byte b12 = bArr[i11];
                zzd = zzix.zzd(b12);
                if (zzd) {
                    int i17 = i15 + 1;
                    zzix.zza(b12, cArr, i15);
                    while (i16 < i13) {
                        byte b13 = bArr[i16];
                        zzd2 = zzix.zzd(b13);
                        if (!zzd2) {
                            break;
                        }
                        i16++;
                        zzix.zza(b13, cArr, i17);
                        i17++;
                    }
                    i11 = i16;
                    i15 = i17;
                } else {
                    zze = zzix.zze(b12);
                    if (!zze) {
                        zzf = zzix.zzf(b12);
                        if (zzf) {
                            if (i16 < i13 - 1) {
                                int i18 = i16 + 1;
                                zzix.zza(b12, bArr[i16], bArr[i18], cArr, i15);
                                i11 = i18 + 1;
                                i15++;
                            } else {
                                throw zzgf.zzfp();
                            }
                        } else if (i16 < i13 - 2) {
                            int i19 = i16 + 1;
                            byte b14 = bArr[i16];
                            int i21 = i19 + 1;
                            zzix.zza(b12, b14, bArr[i19], bArr[i21], cArr, i15);
                            i11 = i21 + 1;
                            i15 = i15 + 1 + 1;
                        } else {
                            throw zzgf.zzfp();
                        }
                    } else if (i16 < i13) {
                        zzix.zza(b12, bArr[i16], cArr, i15);
                        i11 = i16 + 1;
                        i15++;
                    } else {
                        throw zzgf.zzfp();
                    }
                }
            }
            return new String(cArr, 0, i15);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r10 + r0;
     */
    @Override // com.google.android.gms.internal.vision.zziy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zziz.zzb(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.vision.zziy
    public final void zzb(CharSequence charSequence, ByteBuffer byteBuffer) {
        zziy.zzc(charSequence, byteBuffer);
    }
}