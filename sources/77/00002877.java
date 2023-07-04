package com.google.android.gms.internal.mlkit_vision_face;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
abstract class zzaz implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzbd zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaz(zzbd zzbdVar, zzav zzavVar) {
        int i11;
        this.zze = zzbdVar;
        i11 = zzbdVar.zzf;
        this.zzb = i11;
        this.zzc = zzbdVar.zze();
        this.zzd = -1;
    }

    private final void zzb() {
        int i11;
        i11 = this.zze.zzf;
        if (i11 != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (hasNext()) {
            int i11 = this.zzc;
            this.zzd = i11;
            Object zza = zza(i11);
            this.zzc = this.zze.zzf(this.zzc);
            return zza;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzab.zzd(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        zzbd zzbdVar = this.zze;
        zzbdVar.remove(zzbd.zzg(zzbdVar, this.zzd));
        this.zzc--;
        this.zzd = -1;
    }

    abstract Object zza(int i11);
}