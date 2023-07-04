package com.google.android.gms.measurement.internal;

import java.util.Map;

/* loaded from: classes3.dex */
final class zzfj implements com.google.android.gms.internal.measurement.zzo {
    final /* synthetic */ String zza;
    final /* synthetic */ zzfk zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfj(zzfk zzfkVar, String str) {
        this.zzb = zzfkVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map;
        map = this.zzb.zze;
        Map map2 = (Map) map.get(this.zza);
        if (map2 == null || !map2.containsKey(str)) {
            return null;
        }
        return (String) map2.get(str);
    }
}