package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzjs {
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