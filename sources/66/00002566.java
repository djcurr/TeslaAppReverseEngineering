package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
final class zzau extends zzck {
    final /* synthetic */ zzaw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzau(zzaw zzawVar) {
        this.zza = zzawVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzck, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.zza.zza.entrySet();
        Objects.requireNonNull(entrySet);
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzav(this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzck, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (contains(obj)) {
            Map.Entry entry = (Map.Entry) obj;
            entry.getClass();
            zzbe.zzm(this.zza.zzb, entry.getKey());
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzck
    final Map zza() {
        return this.zza;
    }
}