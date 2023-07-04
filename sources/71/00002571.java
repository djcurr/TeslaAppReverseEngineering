package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class zzbe extends zzbg implements Serializable {
    private transient Map zza;
    private transient int zzb;

    public zzbe(Map map) {
        if (map.isEmpty()) {
            this.zza = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ int zzd(zzbe zzbeVar) {
        int i11 = zzbeVar.zzb;
        zzbeVar.zzb = i11 + 1;
        return i11;
    }

    public static /* synthetic */ int zze(zzbe zzbeVar) {
        int i11 = zzbeVar.zzb;
        zzbeVar.zzb = i11 - 1;
        return i11;
    }

    public static /* synthetic */ int zzf(zzbe zzbeVar, int i11) {
        int i12 = zzbeVar.zzb + i11;
        zzbeVar.zzb = i12;
        return i12;
    }

    public static /* synthetic */ int zzg(zzbe zzbeVar, int i11) {
        int i12 = zzbeVar.zzb - i11;
        zzbeVar.zzb = i12;
        return i12;
    }

    public static /* synthetic */ Map zzj(zzbe zzbeVar) {
        return zzbeVar.zza;
    }

    public static /* synthetic */ void zzm(zzbe zzbeVar, Object obj) {
        Object obj2;
        Map map = zzbeVar.zza;
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
            zzbeVar.zzb -= size;
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

    public final List zzi(Object obj, List list, zzbb zzbbVar) {
        if (list instanceof RandomAccess) {
            return new zzaz(this, obj, list, zzbbVar);
        }
        return new zzbd(this, obj, list, zzbbVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbg
    final Map zzk() {
        return new zzaw(this, this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbg
    final Set zzl() {
        return new zzay(this, this.zza);
    }

    public final void zzn() {
        for (Collection collection : this.zza.values()) {
            collection.clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbg, com.google.android.gms.internal.mlkit_vision_barcode.zzcp
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