package com.google.android.libraries.places.internal;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class zzadu extends zzadw {
    final /* synthetic */ zzaed zza;
    private int zzb = 0;
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzadu(zzaed zzaedVar) {
        this.zza = zzaedVar;
        this.zzc = zzaedVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzady
    public final byte zza() {
        int i11 = this.zzb;
        if (i11 < this.zzc) {
            this.zzb = i11 + 1;
            return this.zza.zzb(i11);
        }
        throw new NoSuchElementException();
    }
}