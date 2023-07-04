package com.google.android.gms.internal.measurement;

import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzmx {
    private static final zzmu zza;

    static {
        if (zzms.zzx() && zzms.zzy()) {
            int i11 = zzij.zza;
        }
        zza = new zzmv();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i11, int i12) {
        byte b11 = bArr[i11 - 1];
        int i13 = i12 - i11;
        if (i13 != 0) {
            if (i13 == 1) {
                byte b12 = bArr[i11];
                if (b11 <= -12 && b12 <= -65) {
                    return b11 ^ (b12 << 8);
                }
            } else if (i13 == 2) {
                byte b13 = bArr[i11];
                byte b14 = bArr[i11 + 1];
                if (b11 <= -12 && b13 <= -65 && b14 <= -65) {
                    return ((b13 << 8) ^ b11) ^ (b14 << Tnaf.POW_2_WIDTH);
                }
            } else {
                throw new AssertionError();
            }
        } else if (b11 <= -12) {
            return b11;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0100, code lost:
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzb(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzmx.zzb(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 0;
        int i12 = 0;
        while (i12 < length && charSequence.charAt(i12) < 128) {
            i12++;
        }
        int i13 = length;
        while (true) {
            if (i12 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i12);
            if (charAt < 2048) {
                i13 += (127 - charAt) >>> 31;
                i12++;
            } else {
                int length2 = charSequence.length();
                while (i12 < length2) {
                    char charAt2 = charSequence.charAt(i12);
                    if (charAt2 < 2048) {
                        i11 += (127 - charAt2) >>> 31;
                    } else {
                        i11 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i12) < 65536) {
                                throw new zzmw(i12, length2);
                            }
                            i12++;
                        }
                    }
                    i12++;
                }
                i13 += i11;
            }
        }
        if (i13 >= length) {
            return i13;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(i13 + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzd(byte[] bArr, int i11, int i12) {
        int length = bArr.length;
        if ((i11 | i12 | ((length - i11) - i12)) >= 0) {
            int i13 = i11 + i12;
            char[] cArr = new char[i12];
            int i14 = 0;
            while (i11 < i13) {
                byte b11 = bArr[i11];
                if (!zzmt.zzd(b11)) {
                    break;
                }
                i11++;
                cArr[i14] = (char) b11;
                i14++;
            }
            while (i11 < i13) {
                int i15 = i11 + 1;
                byte b12 = bArr[i11];
                if (zzmt.zzd(b12)) {
                    int i16 = i14 + 1;
                    cArr[i14] = (char) b12;
                    i11 = i15;
                    while (true) {
                        i14 = i16;
                        if (i11 < i13) {
                            byte b13 = bArr[i11];
                            if (!zzmt.zzd(b13)) {
                                break;
                            }
                            i11++;
                            i16 = i14 + 1;
                            cArr[i14] = (char) b13;
                        }
                    }
                } else if (b12 < -32) {
                    if (i15 < i13) {
                        zzmt.zzc(b12, bArr[i15], cArr, i14);
                        i11 = i15 + 1;
                        i14++;
                    } else {
                        throw zzkj.zzc();
                    }
                } else if (b12 < -16) {
                    if (i15 < i13 - 1) {
                        int i17 = i15 + 1;
                        zzmt.zzb(b12, bArr[i15], bArr[i17], cArr, i14);
                        i11 = i17 + 1;
                        i14++;
                    } else {
                        throw zzkj.zzc();
                    }
                } else if (i15 < i13 - 2) {
                    int i18 = i15 + 1;
                    int i19 = i18 + 1;
                    zzmt.zza(b12, bArr[i15], bArr[i18], bArr[i19], cArr, i14);
                    i14 += 2;
                    i11 = i19 + 1;
                } else {
                    throw zzkj.zzc();
                }
            }
            return new String(cArr, 0, i14);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zze(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzf(byte[] bArr, int i11, int i12) {
        return zza.zzb(bArr, i11, i12);
    }
}