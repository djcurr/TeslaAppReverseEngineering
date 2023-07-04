package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
final class zzix {
    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(byte b11, char[] cArr, int i11) {
        cArr[i11] = (char) b11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzd(byte b11) {
        return b11 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zze(byte b11) {
        return b11 < -32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzf(byte b11) {
        return b11 < -16;
    }

    private static boolean zzg(byte b11) {
        return b11 > -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(byte b11, byte b12, char[] cArr, int i11) {
        if (b11 >= -62 && !zzg(b12)) {
            cArr[i11] = (char) (((b11 & 31) << 6) | (b12 & 63));
            return;
        }
        throw zzgf.zzfp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(byte b11, byte b12, byte b13, char[] cArr, int i11) {
        if (!zzg(b12) && ((b11 != -32 || b12 >= -96) && ((b11 != -19 || b12 < -96) && !zzg(b13)))) {
            cArr[i11] = (char) (((b11 & 15) << 12) | ((b12 & 63) << 6) | (b13 & 63));
            return;
        }
        throw zzgf.zzfp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(byte b11, byte b12, byte b13, byte b14, char[] cArr, int i11) {
        if (!zzg(b12) && (((b11 << 28) + (b12 + 112)) >> 30) == 0 && !zzg(b13) && !zzg(b14)) {
            int i12 = ((b11 & 7) << 18) | ((b12 & 63) << 12) | ((b13 & 63) << 6) | (b14 & 63);
            cArr[i11] = (char) ((i12 >>> 10) + 55232);
            cArr[i11 + 1] = (char) ((i12 & 1023) + 56320);
            return;
        }
        throw zzgf.zzfp();
    }
}