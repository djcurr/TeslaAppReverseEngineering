package com.google.android.gms.internal.vision;

import java.util.ListIterator;

/* loaded from: classes3.dex */
final class zzis implements ListIterator<String> {
    private ListIterator<String> zzaav;
    private final /* synthetic */ int zzaaw;
    private final /* synthetic */ zzir zzaax;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzis(zzir zzirVar, int i11) {
        zzgo zzgoVar;
        this.zzaax = zzirVar;
        this.zzaaw = i11;
        zzgoVar = zzirVar.zzaau;
        this.zzaav = zzgoVar.listIterator(i11);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zzaav.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzaav.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.zzaav.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzaav.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.zzaav.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzaav.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}