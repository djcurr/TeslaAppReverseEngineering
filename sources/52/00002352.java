package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzla extends LinkedHashMap {
    private static final zzla zza;
    private boolean zzb;

    static {
        zzla zzlaVar = new zzla();
        zza = zzlaVar;
        zzlaVar.zzb = false;
    }

    private zzla() {
        this.zzb = true;
    }

    public static zzla zza() {
        return zza;
    }

    private static int zzf(Object obj) {
        if (obj instanceof byte[]) {
            return zzkh.zzb((byte[]) obj);
        }
        if (!(obj instanceof zzkb)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private final void zzg() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzg();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this == map) {
                return true;
            }
            if (size() != map.size()) {
                return false;
            }
            Iterator it2 = entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!map.containsKey(entry.getKey())) {
                    return false;
                }
                Object value = entry.getValue();
                Object obj2 = map.get(entry.getKey());
                if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                    equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                    continue;
                } else {
                    equals = value.equals(obj2);
                    continue;
                }
                if (!equals) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it2 = entrySet().iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            i11 += zzf(entry.getValue()) ^ zzf(entry.getKey());
        }
        return i11;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        zzg();
        zzkh.zze(obj);
        zzkh.zze(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        zzg();
        for (Object obj : map.keySet()) {
            zzkh.zze(obj);
            zzkh.zze(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzg();
        return super.remove(obj);
    }

    public final zzla zzb() {
        return isEmpty() ? new zzla() : new zzla(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zzla zzlaVar) {
        zzg();
        if (zzlaVar.isEmpty()) {
            return;
        }
        putAll(zzlaVar);
    }

    public final boolean zze() {
        return this.zzb;
    }

    private zzla(Map map) {
        super(map);
        this.zzb = true;
    }
}