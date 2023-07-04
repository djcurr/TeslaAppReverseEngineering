package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzad implements Iterator {
    final /* synthetic */ zzae zza;
    private int zzb = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzad(zzae zzaeVar) {
        this.zza = zzaeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zzc();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.zzb < this.zza.zzc()) {
            zzae zzaeVar = this.zza;
            int i11 = this.zzb;
            this.zzb = i11 + 1;
            return zzaeVar.zze(i11);
        }
        int i12 = this.zzb;
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Out of bounds index: ");
        sb2.append(i12);
        throw new NoSuchElementException(sb2.toString());
    }
}