package com.google.android.libraries.places.internal;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzahm implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzahn zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzahm(zzahn zzahnVar) {
        zzafo zzafoVar;
        this.zzb = zzahnVar;
        zzafoVar = zzahnVar.zza;
        this.zza = zzafoVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}