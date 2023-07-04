package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class zzmn extends AbstractList implements RandomAccess, zzko {
    private final zzko zza;

    public zzmn(zzko zzkoVar) {
        this.zza = zzkoVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        return ((zzkn) this.zza).get(i11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzmm(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        return new zzml(this, i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzko
    public final zzko zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzko
    public final Object zzf(int i11) {
        return this.zza.zzf(i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzko
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzko
    public final void zzi(zziy zziyVar) {
        throw new UnsupportedOperationException();
    }
}