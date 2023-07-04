package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzaz extends AbstractSet {
    final /* synthetic */ zzbc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaz(zzbc zzbcVar) {
        this.zza = zzbcVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzbc zzbcVar = this.zza;
        Map zzl = zzbcVar.zzl();
        if (zzl != null) {
            return zzl.keySet().iterator();
        }
        return new zzau(zzbcVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object zzx;
        Object obj2;
        Map zzl = this.zza.zzl();
        if (zzl == null) {
            zzx = this.zza.zzx(obj);
            obj2 = zzbc.zzd;
            return zzx != obj2;
        }
        return zzl.keySet().remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}