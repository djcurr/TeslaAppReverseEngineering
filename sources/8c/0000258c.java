package com.google.android.gms.internal.mlkit_vision_barcode;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.util.FileSize;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class zzce implements Map, Serializable {
    private transient zzcf zza;
    private transient zzcf zzb;
    private transient zzbx zzc;

    public static zzce zzc(Object obj, Object obj2) {
        zzbj.zzb("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return zzcw.zzg(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
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
        return zzcy.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzcf zzcfVar = this.zzb;
        if (zzcfVar == null) {
            zzcf zze = zze();
            this.zzb = zze;
            return zze;
        }
        return zzcfVar;
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
        zzbj.zza(size, "size");
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

    abstract zzbx zza();

    @Override // java.util.Map
    /* renamed from: zzb */
    public final zzbx values() {
        zzbx zzbxVar = this.zzc;
        if (zzbxVar == null) {
            zzbx zza = zza();
            this.zzc = zza;
            return zza;
        }
        return zzbxVar;
    }

    abstract zzcf zzd();

    abstract zzcf zze();

    @Override // java.util.Map
    /* renamed from: zzf */
    public final zzcf entrySet() {
        zzcf zzcfVar = this.zza;
        if (zzcfVar == null) {
            zzcf zzd = zzd();
            this.zza = zzd;
            return zzd;
        }
        return zzcfVar;
    }
}