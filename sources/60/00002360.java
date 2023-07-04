package com.google.android.gms.internal.measurement;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzlo {
    private static final zzlo zza = new zzlo();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzls zzb = new zzky();

    private zzlo() {
    }

    public static zzlo zza() {
        return zza;
    }

    public final zzlr zzb(Class cls) {
        zzkh.zzf(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        zzlr zzlrVar = (zzlr) this.zzc.get(cls);
        if (zzlrVar == null) {
            zzlrVar = this.zzb.zza(cls);
            zzkh.zzf(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
            zzkh.zzf(zzlrVar, "schema");
            zzlr zzlrVar2 = (zzlr) this.zzc.putIfAbsent(cls, zzlrVar);
            if (zzlrVar2 != null) {
                return zzlrVar2;
            }
        }
        return zzlrVar;
    }
}