package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzku {
    private static final zzkq zza = new zzks();
    private static final zzkp zzb = new zzkt();

    public static zzkm zza(Set set) {
        zzkm zzkmVar = new zzkm(zza, null);
        zzkmVar.zza(zzb);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            zzkmVar.zzg((zzkd) it2.next());
        }
        return zzkmVar;
    }
}