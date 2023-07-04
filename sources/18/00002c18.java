package com.google.android.gms.internal.vision;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class zzeq implements Comparator<zzeo> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzeo zzeoVar, zzeo zzeoVar2) {
        int zza;
        int zza2;
        zzeo zzeoVar3 = zzeoVar;
        zzeo zzeoVar4 = zzeoVar2;
        zzeu zzeuVar = (zzeu) zzeoVar3.iterator();
        zzeu zzeuVar2 = (zzeu) zzeoVar4.iterator();
        while (zzeuVar.hasNext() && zzeuVar2.hasNext()) {
            zza = zzeo.zza(zzeuVar.nextByte());
            zza2 = zzeo.zza(zzeuVar2.nextByte());
            int compare = Integer.compare(zza, zza2);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzeoVar3.size(), zzeoVar4.size());
    }
}