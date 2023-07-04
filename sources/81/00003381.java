package com.google.android.libraries.places.internal;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.util.FileSize;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class zzjb implements Map, Serializable {
    private transient zzjc zza;
    private transient zzjc zzb;
    private transient zziv zzc;

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
        return zzjs.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzjc zzjcVar = this.zzb;
        if (zzjcVar == null) {
            zzjc zzd = zzd();
            this.zzb = zzd;
            return zzd;
        }
        return zzjcVar;
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
        if (size >= 0) {
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
        throw new IllegalArgumentException("size cannot be negative but was: " + size);
    }

    abstract zziv zza();

    @Override // java.util.Map
    /* renamed from: zzb */
    public final zziv values() {
        zziv zzivVar = this.zzc;
        if (zzivVar == null) {
            zziv zza = zza();
            this.zzc = zza;
            return zza;
        }
        return zzivVar;
    }

    abstract zzjc zzc();

    abstract zzjc zzd();

    @Override // java.util.Map
    /* renamed from: zze */
    public final zzjc entrySet() {
        zzjc zzjcVar = this.zza;
        if (zzjcVar == null) {
            zzjc zzc = zzc();
            this.zza = zzc;
            return zzc;
        }
        return zzjcVar;
    }
}