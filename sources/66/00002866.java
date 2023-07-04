package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzai implements Iterator {
    Map.Entry zza;
    final /* synthetic */ Iterator zzb;
    final /* synthetic */ zzaj zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzai(zzaj zzajVar, Iterator it2) {
        this.zzc = zzajVar;
        this.zzb = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzab.zzd(this.zza != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.zza.getValue();
        this.zzb.remove();
        zzap.zzg(this.zzc.zza, collection.size());
        collection.clear();
        this.zza = null;
    }
}