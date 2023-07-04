package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfy;

/* loaded from: classes3.dex */
final class zzfx implements zzhe {
    private static final zzfx zzwi = new zzfx();

    private zzfx() {
    }

    public static zzfx zzex() {
        return zzwi;
    }

    @Override // com.google.android.gms.internal.vision.zzhe
    public final boolean zzb(Class<?> cls) {
        return zzfy.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.vision.zzhe
    public final zzhd zzc(Class<?> cls) {
        if (!zzfy.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (zzhd) zzfy.zzd(cls.asSubclass(zzfy.class)).zza(zzfy.zzg.zzwz, (Object) null, (Object) null);
        } catch (Exception e11) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e11);
        }
    }
}