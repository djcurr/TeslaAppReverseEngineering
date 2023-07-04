package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
final class zzaeq {
    private static final zzaeo zza = new zzaep();
    private static final zzaeo zzb;

    static {
        zzaeo zzaeoVar;
        try {
            zzaeoVar = (zzaeo) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzaeoVar = null;
        }
        zzb = zzaeoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaeo zza() {
        zzaeo zzaeoVar = zzb;
        if (zzaeoVar != null) {
            return zzaeoVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaeo zzb() {
        return zza;
    }
}