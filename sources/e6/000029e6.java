package com.google.android.gms.internal.mlkit_vision_face;

/* loaded from: classes3.dex */
public final class zzoo {
    private static zzoo zza;

    private zzoo() {
    }

    public static synchronized zzoo zza() {
        zzoo zzooVar;
        synchronized (zzoo.class) {
            if (zza == null) {
                zza = new zzoo();
            }
            zzooVar = zza;
        }
        return zzooVar;
    }
}