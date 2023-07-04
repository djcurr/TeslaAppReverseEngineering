package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzhb implements zzha {
    @Override // com.google.android.gms.internal.vision.zzha
    public final Object zzb(Object obj, Object obj2) {
        zzgz zzgzVar = (zzgz) obj;
        zzgz zzgzVar2 = (zzgz) obj2;
        if (!zzgzVar2.isEmpty()) {
            if (!zzgzVar.isMutable()) {
                zzgzVar = zzgzVar.zzfz();
            }
            zzgzVar.zza(zzgzVar2);
        }
        return zzgzVar;
    }

    @Override // com.google.android.gms.internal.vision.zzha
    public final Map<?, ?> zzj(Object obj) {
        return (zzgz) obj;
    }

    @Override // com.google.android.gms.internal.vision.zzha
    public final Map<?, ?> zzk(Object obj) {
        return (zzgz) obj;
    }

    @Override // com.google.android.gms.internal.vision.zzha
    public final boolean zzl(Object obj) {
        return !((zzgz) obj).isMutable();
    }

    @Override // com.google.android.gms.internal.vision.zzha
    public final Object zzm(Object obj) {
        ((zzgz) obj).zzci();
        return obj;
    }

    @Override // com.google.android.gms.internal.vision.zzha
    public final Object zzn(Object obj) {
        return zzgz.zzfy().zzfz();
    }

    @Override // com.google.android.gms.internal.vision.zzha
    public final zzgy<?, ?> zzo(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.vision.zzha
    public final int zzb(int i11, Object obj, Object obj2) {
        zzgz zzgzVar = (zzgz) obj;
        if (zzgzVar.isEmpty()) {
            return 0;
        }
        Iterator it2 = zzgzVar.entrySet().iterator();
        if (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
        return 0;
    }
}