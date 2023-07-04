package com.google.android.libraries.places.internal;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzit implements Comparable, Serializable {
    final Comparable zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzit(Comparable comparable) {
        this.zza = comparable;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzit) {
            try {
                if (compareTo((zzit) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public int compareTo(zzit zzitVar) {
        zzir zzirVar;
        zzip zzipVar;
        zzirVar = zzir.zzb;
        if (zzitVar != zzirVar) {
            zzipVar = zzip.zzb;
            if (zzitVar == zzipVar) {
                return -1;
            }
            int zza = zzjk.zza(this.zza, zzitVar.zza);
            if (zza != 0) {
                return zza;
            }
            boolean z11 = this instanceof zziq;
            if (z11 == (zzitVar instanceof zziq)) {
                return 0;
            }
            if (!z11) {
                return -1;
            }
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzc(StringBuilder sb2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzd(StringBuilder sb2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zze(Comparable comparable);
}