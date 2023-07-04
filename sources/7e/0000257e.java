package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzbr extends AbstractCollection {
    final /* synthetic */ zzbs zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbr(zzbs zzbsVar) {
        this.zza = zzbsVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzbs zzbsVar = this.zza;
        Map zzl = zzbsVar.zzl();
        if (zzl != null) {
            return zzl.values().iterator();
        }
        return new zzbm(zzbsVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}