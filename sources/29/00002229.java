package com.google.android.gms.internal.measurement;

import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzaa {
    private String zza;
    private final long zzb;
    private final Map zzc;

    public zzaa(String str, long j11, Map map) {
        this.zza = str;
        this.zzb = j11;
        HashMap hashMap = new HashMap();
        this.zzc = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaa) {
            zzaa zzaaVar = (zzaa) obj;
            if (this.zzb == zzaaVar.zzb && this.zza.equals(zzaaVar.zza)) {
                return this.zzc.equals(zzaaVar.zzc);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        long j11 = this.zzb;
        return (((hashCode * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.zzc.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        long j11 = this.zzb;
        String obj = this.zzc.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 55 + obj.length());
        sb2.append("Event{name='");
        sb2.append(str);
        sb2.append("', timestamp=");
        sb2.append(j11);
        sb2.append(", params=");
        sb2.append(obj);
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }

    public final long zza() {
        return this.zzb;
    }

    /* renamed from: zzb */
    public final zzaa clone() {
        return new zzaa(this.zza, this.zzb, new HashMap(this.zzc));
    }

    public final Object zzc(String str) {
        if (this.zzc.containsKey(str)) {
            return this.zzc.get(str);
        }
        return null;
    }

    public final String zzd() {
        return this.zza;
    }

    public final Map zze() {
        return this.zzc;
    }

    public final void zzf(String str) {
        this.zza = str;
    }

    public final void zzg(String str, Object obj) {
        if (obj == null) {
            this.zzc.remove(str);
        } else {
            this.zzc.put(str, obj);
        }
    }
}