package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class zzir extends AbstractList<String> implements zzgo, RandomAccess {
    private final zzgo zzaau;

    public zzir(zzgo zzgoVar) {
        this.zzaau = zzgoVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        return (String) this.zzaau.get(i11);
    }

    @Override // com.google.android.gms.internal.vision.zzgo
    public final Object getRaw(int i11) {
        return this.zzaau.getRaw(i11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new zzit(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i11) {
        return new zzis(this, i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzaau.size();
    }

    @Override // com.google.android.gms.internal.vision.zzgo
    public final void zzc(zzeo zzeoVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.vision.zzgo
    public final List<?> zzft() {
        return this.zzaau.zzft();
    }

    @Override // com.google.android.gms.internal.vision.zzgo
    public final zzgo zzfu() {
        return this;
    }
}