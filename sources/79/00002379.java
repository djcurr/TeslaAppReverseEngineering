package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzmm implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzmn zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmm(zzmn zzmnVar) {
        zzko zzkoVar;
        this.zzb = zzmnVar;
        zzkoVar = zzmnVar.zza;
        this.zza = zzkoVar.iterator();
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