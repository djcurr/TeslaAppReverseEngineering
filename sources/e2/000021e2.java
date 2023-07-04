package com.google.android.gms.internal.location;

/* loaded from: classes3.dex */
public final class zzbr {
    public static int zza(int i11, int i12, String str) {
        String zza;
        if (i11 < 0 || i11 >= i12) {
            if (i11 < 0) {
                zza = zzbs.zza("%s (%s) must not be negative", "index", Integer.valueOf(i11));
            } else if (i12 < 0) {
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("negative size: ");
                sb2.append(i12);
                throw new IllegalArgumentException(sb2.toString());
            } else {
                zza = zzbs.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
            }
            throw new IndexOutOfBoundsException(zza);
        }
        return i11;
    }

    public static int zzb(int i11, int i12, String str) {
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException(zzd(i11, i12, "index"));
        }
        return i11;
    }

    public static void zzc(int i11, int i12, int i13) {
        String zzd;
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            if (i11 >= 0 && i11 <= i13) {
                zzd = (i12 < 0 || i12 > i13) ? zzd(i12, i13, "end index") : zzbs.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11));
            } else {
                zzd = zzd(i11, i13, "start index");
            }
            throw new IndexOutOfBoundsException(zzd);
        }
    }

    private static String zzd(int i11, int i12, String str) {
        if (i11 < 0) {
            return zzbs.zza("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return zzbs.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i12);
        throw new IllegalArgumentException(sb2.toString());
    }
}