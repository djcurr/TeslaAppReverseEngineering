package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes3.dex */
public final class zzpc {
    private static zzpc zza;

    private zzpc() {
    }

    public static synchronized zzpc zza() {
        zzpc zzpcVar;
        synchronized (zzpc.class) {
            if (zza == null) {
                zza = new zzpc();
            }
            zzpcVar = zza;
        }
        return zzpcVar;
    }
}