package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class zzif {
    public static zzib zza(zzib zzibVar) {
        if ((zzibVar instanceof zzid) || (zzibVar instanceof zzic)) {
            return zzibVar;
        }
        if (zzibVar instanceof Serializable) {
            return new zzic(zzibVar);
        }
        return new zzid(zzibVar);
    }

    public static zzib zzb(Object obj) {
        return new zzie(obj);
    }
}