package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class zzlu implements Iterator {
    final /* synthetic */ zzlv zza;
    private int zzb = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlu(zzlv zzlvVar) {
        this.zza = zzlvVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i11 = this.zzb;
        zzlv zzlvVar = this.zza;
        return i11 < zzlvVar.zza() - zzlvVar.zzb();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object[] objArr;
        int i11 = this.zzb;
        zzlv zzlvVar = this.zza;
        if (i11 < zzlvVar.zza() - zzlvVar.zzb()) {
            zzlv zzlvVar2 = this.zza;
            objArr = zzlvVar2.zzb.zzb;
            Object obj = objArr[zzlvVar2.zzb() + i11];
            this.zzb = i11 + 1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}