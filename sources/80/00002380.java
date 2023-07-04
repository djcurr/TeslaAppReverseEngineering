package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzmt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zza(byte b11, byte b12, byte b13, byte b14, char[] cArr, int i11) {
        if (!zze(b12) && (((b11 << 28) + (b12 + 112)) >> 30) == 0 && !zze(b13) && !zze(b14)) {
            int i12 = ((b11 & 7) << 18) | ((b12 & 63) << 12) | ((b13 & 63) << 6) | (b14 & 63);
            cArr[i11] = (char) ((i12 >>> 10) + 55232);
            cArr[i11 + 1] = (char) ((i12 & 1023) + 56320);
            return;
        }
        throw zzkj.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzb(byte b11, byte b12, byte b13, char[] cArr, int i11) {
        if (!zze(b12)) {
            if (b11 == -32) {
                if (b12 >= -96) {
                    b11 = -32;
                }
            }
            if (b11 == -19) {
                if (b12 < -96) {
                    b11 = -19;
                }
            }
            if (!zze(b13)) {
                cArr[i11] = (char) (((b11 & 15) << 12) | ((b12 & 63) << 6) | (b13 & 63));
                return;
            }
        }
        throw zzkj.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzc(byte b11, byte b12, char[] cArr, int i11) {
        if (b11 >= -62 && !zze(b12)) {
            cArr[i11] = (char) (((b11 & 31) << 6) | (b12 & 63));
            return;
        }
        throw zzkj.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zzd(byte b11) {
        return b11 >= 0;
    }

    private static boolean zze(byte b11) {
        return b11 > -65;
    }
}