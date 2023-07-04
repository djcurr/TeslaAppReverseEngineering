package com.google.android.gms.internal.mlkit_vision_text_common;

/* loaded from: classes3.dex */
public final class zzos {
    private static zzos zza;

    private zzos() {
    }

    public static synchronized zzos zza() {
        zzos zzosVar;
        synchronized (zzos.class) {
            if (zza == null) {
                zza = new zzos();
            }
            zzosVar = zza;
        }
        return zzosVar;
    }
}