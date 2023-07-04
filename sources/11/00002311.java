package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class zziq implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zziy zziyVar = (zziy) obj;
        zziy zziyVar2 = (zziy) obj2;
        zzio zzioVar = new zzio(zziyVar);
        zzio zzioVar2 = new zzio(zziyVar2);
        while (zzioVar.hasNext() && zzioVar2.hasNext()) {
            int zza = zzip.zza(zzioVar.zza() & 255, zzioVar2.zza() & 255);
            if (zza != 0) {
                return zza;
            }
        }
        return zzip.zza(zziyVar.zzd(), zziyVar2.zzd());
    }
}