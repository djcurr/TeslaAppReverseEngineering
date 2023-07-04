package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzju implements zzle {
    private static final zzju zza = new zzju();

    private zzju() {
    }

    public static zzju zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzle
    public final zzld zzb(Class cls) {
        if (!zzjz.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (zzld) zzjz.zzbu(cls.asSubclass(zzjz.class)).zzl(3, null, null);
        } catch (Exception e11) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzle
    public final boolean zzc(Class cls) {
        return zzjz.class.isAssignableFrom(cls);
    }
}