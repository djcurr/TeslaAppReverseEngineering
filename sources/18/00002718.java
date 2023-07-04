package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzaa {
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
}