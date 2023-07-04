package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
final class zzeg {
    private static final Class<?> zzrm = zzk("libcore.io.Memory");
    private static final boolean zzrn;

    static {
        zzrn = zzk("org.robolectric.Robolectric") != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzck() {
        return (zzrm == null || zzrn) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> zzcl() {
        return zzrm;
    }

    private static <T> Class<T> zzk(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}