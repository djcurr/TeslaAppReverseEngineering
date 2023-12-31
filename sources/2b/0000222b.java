package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class zzac implements Iterator {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ Iterator zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzac(zzae zzaeVar, Iterator it2, Iterator it3) {
        this.zza = it2;
        this.zzb = it3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zza.hasNext()) {
            return true;
        }
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.zza.hasNext()) {
            return new zzat(((Integer) this.zza.next()).toString());
        }
        if (this.zzb.hasNext()) {
            return new zzat((String) this.zzb.next());
        }
        throw new NoSuchElementException();
    }
}