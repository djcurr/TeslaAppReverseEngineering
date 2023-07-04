package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zzig {
    public static int zza(int i11, int i12, String str) {
        String zza;
        if (i11 < 0 || i11 >= i12) {
            if (i11 < 0) {
                zza = zzil.zza("%s (%s) must not be negative", "index", Integer.valueOf(i11));
            } else if (i12 < 0) {
                throw new IllegalArgumentException("negative size: " + i12);
            } else {
                zza = zzil.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
            }
            throw new IndexOutOfBoundsException(zza);
        }
        return i11;
    }

    public static int zzb(int i11, int i12, String str) {
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException(zzl(i11, i12, "index"));
        }
        return i11;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static void zzd(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException();
        }
    }

    public static void zze(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void zzf(boolean z11, String str, char c11) {
        if (!z11) {
            throw new IllegalArgumentException(zzil.zza(str, Character.valueOf(c11)));
        }
    }

    public static void zzg(int i11, int i12, int i13) {
        String zzl;
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            if (i11 >= 0 && i11 <= i13) {
                zzl = (i12 < 0 || i12 > i13) ? zzl(i12, i13, "end index") : zzil.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11));
            } else {
                zzl = zzl(i11, i13, "start index");
            }
            throw new IndexOutOfBoundsException(zzl);
        }
    }

    public static void zzh(boolean z11) {
        if (!z11) {
            throw new IllegalStateException();
        }
    }

    public static void zzi(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void zzj(boolean z11, String str, int i11) {
        if (!z11) {
            throw new IllegalStateException(zzil.zza(str, Integer.valueOf(i11)));
        }
    }

    public static void zzk(boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z11) {
            throw new IllegalStateException(zzil.zza(str, obj, obj2, obj3));
        }
    }

    private static String zzl(int i11, int i12, String str) {
        if (i11 < 0) {
            return zzil.zza("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return zzil.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException("negative size: " + i12);
    }
}