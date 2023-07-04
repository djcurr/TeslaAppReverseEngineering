package com.google.android.libraries.places.internal;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzjk extends zzjl {
    private static final zzjk zzc;
    final zzit zza;
    final zzit zzb;

    static {
        zzir zzirVar;
        zzip zzipVar;
        zzirVar = zzir.zzb;
        zzipVar = zzip.zzb;
        zzc = new zzjk(zzirVar, zzipVar);
    }

    private zzjk(zzit zzitVar, zzit zzitVar2) {
        zzip zzipVar;
        zzir zzirVar;
        this.zza = zzitVar;
        this.zzb = zzitVar2;
        if (zzitVar.compareTo(zzitVar2) <= 0) {
            zzipVar = zzip.zzb;
            if (zzitVar != zzipVar) {
                zzirVar = zzir.zzb;
                if (zzitVar2 != zzirVar) {
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Invalid range: ".concat(zzf(zzitVar, zzitVar2)));
    }

    public static int zza(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static zzjk zzb(Comparable comparable) {
        zzip zzipVar;
        zzis zzisVar = new zzis(comparable);
        zzipVar = zzip.zzb;
        return new zzjk(zzisVar, zzipVar);
    }

    public static zzjk zzc(Comparable comparable, Comparable comparable2) {
        return new zzjk(new zzis(comparable), new zziq(comparable2));
    }

    public static zzjk zzd(Comparable comparable, Comparable comparable2) {
        return new zzjk(new zzis(comparable), new zzis(comparable2));
    }

    private static String zzf(zzit zzitVar, zzit zzitVar2) {
        StringBuilder sb2 = new StringBuilder(16);
        zzitVar.zzc(sb2);
        sb2.append(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
        zzitVar2.zzd(sb2);
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzjk) {
            zzjk zzjkVar = (zzjk) obj;
            if (this.zza.equals(zzjkVar.zza) && this.zzb.equals(zzjkVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return zzf(this.zza, this.zzb);
    }

    public final boolean zze(Comparable comparable) {
        Objects.requireNonNull(comparable);
        return this.zza.zze(comparable) && !this.zzb.zze(comparable);
    }
}