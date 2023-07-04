package com.google.android.gms.internal.mlkit_vision_face;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class zzap extends zzar implements Serializable {
    private transient Map zza;
    private transient int zzb;

    public zzap(Map map) {
        if (map.isEmpty()) {
            this.zza = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ int zzd(zzap zzapVar) {
        int i11 = zzapVar.zzb;
        zzapVar.zzb = i11 + 1;
        return i11;
    }

    public static /* synthetic */ int zze(zzap zzapVar) {
        int i11 = zzapVar.zzb;
        zzapVar.zzb = i11 - 1;
        return i11;
    }

    public static /* synthetic */ int zzf(zzap zzapVar, int i11) {
        int i12 = zzapVar.zzb + i11;
        zzapVar.zzb = i12;
        return i12;
    }

    public static /* synthetic */ int zzg(zzap zzapVar, int i11) {
        int i12 = zzapVar.zzb - i11;
        zzapVar.zzb = i12;
        return i12;
    }

    public static /* synthetic */ Map zzj(zzap zzapVar) {
        return zzapVar.zza;
    }

    public static /* synthetic */ void zzm(zzap zzapVar, Object obj) {
        Object obj2;
        Map map = zzapVar.zza;
        Objects.requireNonNull(map);
        try {
            obj2 = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzapVar.zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Object obj, Collection collection) {
        throw null;
    }

    public final Collection zzh(Object obj) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection == null) {
            collection = zza();
        }
        return zzb(obj, collection);
    }

    public final List zzi(Object obj, List list, zzam zzamVar) {
        if (list instanceof RandomAccess) {
            return new zzak(this, obj, list, zzamVar);
        }
        return new zzao(this, obj, list, zzamVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzar
    final Map zzk() {
        return new zzah(this, this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzar
    final Set zzl() {
        return new zzaj(this, this.zza);
    }

    public final void zzn() {
        for (Collection collection : this.zza.values()) {
            collection.clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzar, com.google.android.gms.internal.mlkit_vision_face.zzca
    public final boolean zzo(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection == null) {
            Collection zza = zza();
            if (zza.add(obj2)) {
                this.zzb++;
                this.zza.put(obj, zza);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(obj2)) {
            this.zzb++;
            return true;
        } else {
            return false;
        }
    }
}