package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzax extends AbstractSet {
    final /* synthetic */ zzbc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzax(zzbc zzbcVar) {
        this.zza = zzbcVar;
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
            if (zzv != -1 && zzw.zza(zzbc.zzj(this.zza, zzv), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzbc zzbcVar = this.zza;
        Map zzl = zzbcVar.zzl();
        if (zzl != null) {
            return zzl.entrySet().iterator();
        }
        return new zzav(zzbcVar);
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
            zzbc zzbcVar = this.zza;
            if (zzbcVar.zzq()) {
                return false;
            }
            zzu = zzbcVar.zzu();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object zzk = zzbc.zzk(this.zza);
            zzz = this.zza.zzz();
            zzA = this.zza.zzA();
            zzB = this.zza.zzB();
            int zzb = zzbd.zzb(key, value, zzu, zzk, zzz, zzA, zzB);
            if (zzb == -1) {
                return false;
            }
            this.zza.zzp(zzb, zzu);
            zzbc.zzb(this.zza);
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