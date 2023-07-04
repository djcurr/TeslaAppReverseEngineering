package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzdk implements zzdj {
    @Override // com.google.android.gms.internal.clearcut.zzdj
    public final int zzb(int i11, Object obj, Object obj2) {
        zzdi zzdiVar = (zzdi) obj;
        if (zzdiVar.isEmpty()) {
            return 0;
        }
        Iterator it2 = zzdiVar.entrySet().iterator();
        if (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdj
    public final Object zzb(Object obj, Object obj2) {
        zzdi zzdiVar = (zzdi) obj;
        zzdi zzdiVar2 = (zzdi) obj2;
        if (!zzdiVar2.isEmpty()) {
            if (!zzdiVar.isMutable()) {
                zzdiVar = zzdiVar.zzca();
            }
            zzdiVar.zza(zzdiVar2);
        }
        return zzdiVar;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdj
    public final Map<?, ?> zzg(Object obj) {
        return (zzdi) obj;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdj
    public final Map<?, ?> zzh(Object obj) {
        return (zzdi) obj;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdj
    public final boolean zzi(Object obj) {
        return !((zzdi) obj).isMutable();
    }

    @Override // com.google.android.gms.internal.clearcut.zzdj
    public final Object zzj(Object obj) {
        ((zzdi) obj).zzv();
        return obj;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdj
    public final Object zzk(Object obj) {
        return zzdi.zzbz().zzca();
    }

    @Override // com.google.android.gms.internal.clearcut.zzdj
    public final zzdh<?, ?> zzl(Object obj) {
        throw new NoSuchMethodError();
    }
}