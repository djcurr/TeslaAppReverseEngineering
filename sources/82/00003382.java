package com.google.android.libraries.places.internal;

import java.util.Set;

/* loaded from: classes3.dex */
public abstract class zzjc extends zziv implements Set {
    private transient zziy zza;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzjs.zza(this);
    }

    @Override // com.google.android.libraries.places.internal.zziv
    public zziy zzd() {
        zziy zziyVar = this.zza;
        if (zziyVar == null) {
            zziy zzh = zzh();
            this.zza = zzh;
            return zzh;
        }
        return zziyVar;
    }

    @Override // com.google.android.libraries.places.internal.zziv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzjv iterator();

    zziy zzh() {
        return zziy.zzi(toArray());
    }
}