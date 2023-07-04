package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class zzao extends zzaq implements Serializable {
    private transient Map zza;
    private transient int zzb;

    public zzao(Map map) {
        if (map.isEmpty()) {
            this.zza = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ int zzd(zzao zzaoVar) {
        int i11 = zzaoVar.zzb;
        zzaoVar.zzb = i11 + 1;
        return i11;
    }

    public static /* synthetic */ int zze(zzao zzaoVar) {
        int i11 = zzaoVar.zzb;
        zzaoVar.zzb = i11 - 1;
        return i11;
    }

    public static /* synthetic */ int zzf(zzao zzaoVar, int i11) {
        int i12 = zzaoVar.zzb + i11;
        zzaoVar.zzb = i12;
        return i12;
    }

    public static /* synthetic */ int zzg(zzao zzaoVar, int i11) {
        int i12 = zzaoVar.zzb - i11;
        zzaoVar.zzb = i12;
        return i12;
    }

    public static /* synthetic */ Map zzj(zzao zzaoVar) {
        return zzaoVar.zza;
    }

    public static /* synthetic */ void zzm(zzao zzaoVar, Object obj) {
        Object obj2;
        Map map = zzaoVar.zza;
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
            zzaoVar.zzb -= size;
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

    public final List zzi(Object obj, List list, zzal zzalVar) {
        if (list instanceof RandomAccess) {
            return new zzaj(this, obj, list, zzalVar);
        }
        return new zzan(this, obj, list, zzalVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzaq
    final Map zzk() {
        return new zzag(this, this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzaq
    final Set zzl() {
        return new zzai(this, this.zza);
    }

    public final void zzn() {
        for (Collection collection : this.zza.values()) {
            collection.clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzaq, com.google.android.gms.internal.mlkit_vision_text_common.zzce
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