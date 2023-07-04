package com.google.android.libraries.places.internal;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
final class zzlw extends AbstractMap {
    private static final Comparator zza = new zzlt();
    private final Object[] zzb;
    private final int[] zzc;
    private final Set zzd = new zzlv(this, -1);
    private Integer zze = null;
    private String zzf = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlw(List list) {
        Iterator it2 = list.iterator();
        if (!it2.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            int[] iArr = new int[1];
            Iterator it3 = list.iterator();
            if (it3.hasNext()) {
                zzls.zza((zzls) it3.next());
                throw null;
            }
            iArr[0] = 0;
            if (size > 16 && size * 9 > 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            this.zzb = objArr;
            this.zzc = iArr;
            return;
        }
        zzls.zza((zzls) it2.next());
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.zze == null) {
            this.zze = Integer.valueOf(super.hashCode());
        }
        return this.zze.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.zzf == null) {
            this.zzf = super.toString();
        }
        return this.zzf;
    }
}