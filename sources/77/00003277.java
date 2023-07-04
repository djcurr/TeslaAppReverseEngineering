package com.google.android.libraries.places.internal;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class zzahn extends AbstractList implements RandomAccess, zzafo {
    private final zzafo zza;

    public zzahn(zzafo zzafoVar) {
        this.zza = zzafoVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        return ((zzafn) this.zza).get(i11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzahm(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        return new zzahl(this, i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.libraries.places.internal.zzafo
    public final zzafo zzd() {
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzafo
    public final Object zze(int i11) {
        return this.zza.zze(i11);
    }

    @Override // com.google.android.libraries.places.internal.zzafo
    public final List zzh() {
        return this.zza.zzh();
    }
}