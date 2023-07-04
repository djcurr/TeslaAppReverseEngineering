package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzbb extends AbstractCollection {
    final /* synthetic */ zzbc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbb(zzbc zzbcVar) {
        this.zza = zzbcVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzbc zzbcVar = this.zza;
        Map zzl = zzbcVar.zzl();
        if (zzl != null) {
            return zzl.values().iterator();
        }
        return new zzaw(zzbcVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}