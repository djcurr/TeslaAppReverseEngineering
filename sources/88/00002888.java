package com.google.android.gms.internal.mlkit_vision_face;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.util.FileSize;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class zzbp implements Map, Serializable {
    private transient zzbq zza;
    private transient zzbq zzb;
    private transient zzbi zzc;

    public static zzbp zzc(Object obj, Object obj2) {
        zzau.zzb("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return zzch.zzg(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzcj.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzbq zzbqVar = this.zzb;
        if (zzbqVar == null) {
            zzbq zze = zze();
            this.zzb = zze;
            return zze;
        }
        return zzbqVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzau.zza(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, (long) FileSize.GB_COEFFICIENT));
        sb2.append(CoreConstants.CURLY_LEFT);
        boolean z11 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z11) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z11 = false;
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }

    abstract zzbi zza();

    @Override // java.util.Map
    /* renamed from: zzb */
    public final zzbi values() {
        zzbi zzbiVar = this.zzc;
        if (zzbiVar == null) {
            zzbi zza = zza();
            this.zzc = zza;
            return zza;
        }
        return zzbiVar;
    }

    abstract zzbq zzd();

    abstract zzbq zze();

    @Override // java.util.Map
    /* renamed from: zzf */
    public final zzbq entrySet() {
        zzbq zzbqVar = this.zza;
        if (zzbqVar == null) {
            zzbq zzd = zzd();
            this.zza = zzd;
            return zzd;
        }
        return zzbqVar;
    }
}