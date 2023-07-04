package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzjo {
    private static final zzjm zza = new zzjn();
    private static final zzjm zzb;

    static {
        zzjm zzjmVar;
        try {
            zzjmVar = (zzjm) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzjmVar = null;
        }
        zzb = zzjmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzjm zza() {
        zzjm zzjmVar = zzb;
        if (zzjmVar != null) {
            return zzjmVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzjm zzb() {
        return zza;
    }
}