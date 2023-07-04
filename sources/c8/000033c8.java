package com.google.android.libraries.places.internal;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class zzlq implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzlx zza = zzlx.zza(obj);
        zzlx zza2 = zzlx.zza(obj2);
        if (zza == zza2) {
            int ordinal = zza.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            return ((Double) obj).compareTo((Double) obj2);
                        }
                        throw null;
                    }
                    return ((Long) obj).compareTo((Long) obj2);
                }
                return ((String) obj).compareTo((String) obj2);
            }
            return ((Boolean) obj).compareTo((Boolean) obj2);
        }
        return zza.compareTo(zza2);
    }
}