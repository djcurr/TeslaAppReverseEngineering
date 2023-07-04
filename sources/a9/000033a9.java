package com.google.android.libraries.places.internal;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzko extends zzkr {
    private final Map zza;
    private final Map zzb;
    private final zzkq zzc;
    private final zzkp zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzko(zzkm zzkmVar, zzkn zzknVar) {
        HashMap hashMap = new HashMap();
        this.zza = hashMap;
        HashMap hashMap2 = new HashMap();
        this.zzb = hashMap2;
        hashMap.putAll(zzkm.zzf(zzkmVar));
        hashMap2.putAll(zzkm.zze(zzkmVar));
        this.zzc = zzkm.zzc(zzkmVar);
        this.zzd = zzkm.zzb(zzkmVar);
    }
}