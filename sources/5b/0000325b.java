package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
final class zzagm {
    private static final zzagl zza;
    private static final zzagl zzb;

    static {
        zzagl zzaglVar;
        try {
            zzaglVar = (zzagl) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzaglVar = null;
        }
        zza = zzaglVar;
        zzb = new zzagl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzagl zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzagl zzb() {
        return zzb;
    }
}