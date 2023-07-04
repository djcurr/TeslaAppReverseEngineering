package com.google.android.gms.internal.mlkit_vision_text_common;

/* loaded from: classes3.dex */
final class zzbd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i11) {
        return (i11 < 32 ? 4 : 2) * (i11 + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(Object obj, Object obj2, int i11, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i12;
        int i13;
        int zza = zzbe.zza(obj);
        int i14 = zza & i11;
        int zzc = zzc(obj3, i14);
        if (zzc != 0) {
            int i15 = ~i11;
            int i16 = zza & i15;
            int i17 = -1;
            while (true) {
                i12 = zzc - 1;
                i13 = iArr[i12];
                if ((i13 & i15) != i16 || !zzw.zza(obj, objArr[i12]) || (objArr2 != null && !zzw.zza(obj2, objArr2[i12]))) {
                    int i18 = i13 & i11;
                    if (i18 == 0) {
                        break;
                    }
                    i17 = i12;
                    zzc = i18;
                }
            }
            int i19 = i13 & i11;
            if (i17 == -1) {
                zze(obj3, i14, i19);
            } else {
                iArr[i17] = (i19 & i11) | (iArr[i17] & i15);
            }
            return i12;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(Object obj, int i11) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i11] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i11];
        }
        return ((int[]) obj)[i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzd(int i11) {
        if (i11 >= 2 && i11 <= 1073741824 && Integer.highestOneBit(i11) == i11) {
            if (i11 <= 256) {
                return new byte[i11];
            }
            return i11 <= 65536 ? new short[i11] : new int[i11];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zze(Object obj, int i11, int i12) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i11] = (byte) i12;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i11] = (short) i12;
        } else {
            ((int[]) obj)[i11] = i12;
        }
    }
}