package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
final class zzaeu implements zzage {
    private static final zzaeu zza = new zzaeu();

    private zzaeu() {
    }

    public static zzaeu zza() {
        return zza;
    }

    @Override // com.google.android.libraries.places.internal.zzage
    public final zzagd zzb(Class cls) {
        if (zzaey.class.isAssignableFrom(cls)) {
            try {
                return (zzagd) zzaey.zzx(cls.asSubclass(zzaey.class)).zzb(3, null, null);
            } catch (Exception e11) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e11);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.libraries.places.internal.zzage
    public final boolean zzc(Class cls) {
        return zzaey.class.isAssignableFrom(cls);
    }
}