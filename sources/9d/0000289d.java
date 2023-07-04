package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzcj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(Set set) {
        Iterator it2 = set.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            i11 += next != null ? next.hashCode() : 0;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzb(Set set, Collection collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof zzcb) {
            collection = ((zzcb) collection).zza();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            Iterator it2 = set.iterator();
            boolean z11 = false;
            while (it2.hasNext()) {
                if (collection.contains(it2.next())) {
                    it2.remove();
                    z11 = true;
                }
            }
            return z11;
        }
        return zzc(set, collection.iterator());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzc(Set set, Iterator it2) {
        boolean z11 = false;
        while (it2.hasNext()) {
            z11 |= set.remove(it2.next());
        }
        return z11;
    }
}