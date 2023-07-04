package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzlm {
    private static final zzll zza;
    private static final zzll zzb;

    static {
        zzll zzllVar;
        try {
            zzllVar = (zzll) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzllVar = null;
        }
        zza = zzllVar;
        zzb = new zzll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzll zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzll zzb() {
        return zzb;
    }
}