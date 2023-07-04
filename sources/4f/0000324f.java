package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzaga extends LinkedHashMap {
    private static final zzaga zza;
    private boolean zzb;

    static {
        zzaga zzagaVar = new zzaga();
        zza = zzagaVar;
        zzagaVar.zzb = false;
    }

    private zzaga() {
        this.zzb = true;
    }

    private static int zze(Object obj) {
        if (obj instanceof byte[]) {
            return zzafh.zzb((byte[]) obj);
        }
        if (!(obj instanceof zzafa)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private final void zzf() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzf();
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
            i11 += zze(entry.getValue()) ^ zze(entry.getKey());
        }
        return i11;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        zzf();
        zzafh.zze(obj);
        zzafh.zze(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        zzf();
        for (Object obj : map.keySet()) {
            zzafh.zze(obj);
            zzafh.zze(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzf();
        return super.remove(obj);
    }

    public final zzaga zza() {
        return isEmpty() ? new zzaga() : new zzaga(this);
    }

    public final void zzb() {
        this.zzb = false;
    }

    public final void zzc(zzaga zzagaVar) {
        zzf();
        if (zzagaVar.isEmpty()) {
            return;
        }
        putAll(zzagaVar);
    }

    public final boolean zzd() {
        return this.zzb;
    }

    private zzaga(Map map) {
        super(map);
        this.zzb = true;
    }
}