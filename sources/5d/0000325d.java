package com.google.android.libraries.places.internal;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzago {
    private static final zzago zza = new zzago();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzags zzb = new zzafy();

    private zzago() {
    }

    public static zzago zza() {
        return zza;
    }

    public final zzagr zzb(Class cls) {
        zzafh.zzf(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        zzagr zzagrVar = (zzagr) this.zzc.get(cls);
        if (zzagrVar == null) {
            zzagrVar = this.zzb.zza(cls);
            zzafh.zzf(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
            zzafh.zzf(zzagrVar, "schema");
            zzagr zzagrVar2 = (zzagr) this.zzc.putIfAbsent(cls, zzagrVar);
            if (zzagrVar2 != null) {
                return zzagrVar2;
            }
        }
        return zzagrVar;
    }
}