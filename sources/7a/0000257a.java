package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzbn extends AbstractSet {
    final /* synthetic */ zzbs zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbn(zzbs zzbsVar) {
        this.zza = zzbsVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int zzv;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzv = this.zza.zzv(entry.getKey());
            if (zzv != -1 && zzam.zza(zzbs.zzj(this.zza, zzv), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzbs zzbsVar = this.zza;
        Map zzl = zzbsVar.zzl();
        if (zzl != null) {
            return zzl.entrySet().iterator();
        }
        return new zzbl(zzbsVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int zzu;
        int[] zzz;
        Object[] zzA;
        Object[] zzB;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzbs zzbsVar = this.zza;
            if (zzbsVar.zzq()) {
                return false;
            }
            zzu = zzbsVar.zzu();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object zzk = zzbs.zzk(this.zza);
            zzz = this.zza.zzz();
            zzA = this.zza.zzA();
            zzB = this.zza.zzB();
            int zzb = zzbt.zzb(key, value, zzu, zzk, zzz, zzA, zzB);
            if (zzb == -1) {
                return false;
            }
            this.zza.zzp(zzb, zzu);
            zzbs.zzb(this.zza);
            this.zza.zzn();
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}