package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzlb {
    public static final int zza(int i11, Object obj, Object obj2) {
        zzla zzlaVar = (zzla) obj;
        zzkz zzkzVar = (zzkz) obj2;
        if (zzlaVar.isEmpty()) {
            return 0;
        }
        Iterator it2 = zzlaVar.entrySet().iterator();
        if (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzla zzlaVar = (zzla) obj;
        zzla zzlaVar2 = (zzla) obj2;
        if (!zzlaVar2.isEmpty()) {
            if (!zzlaVar.zze()) {
                zzlaVar = zzlaVar.zzb();
            }
            zzlaVar.zzd(zzlaVar2);
        }
        return zzlaVar;
    }
}