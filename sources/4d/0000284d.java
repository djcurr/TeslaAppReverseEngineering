package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes3.dex */
public final class zzlm {
    private static zzlm zza;

    private zzlm() {
    }

    public static synchronized zzlm zza() {
        zzlm zzlmVar;
        synchronized (zzlm.class) {
            if (zza == null) {
                zza = new zzlm();
            }
            zzlmVar = zza;
        }
        return zzlmVar;
    }

    public static final boolean zzb() {
        return zzll.zza("mlkit-dev-profiling");
    }
}