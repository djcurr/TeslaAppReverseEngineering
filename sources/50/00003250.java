package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzagb {
    public static final int zza(int i11, Object obj, Object obj2) {
        zzaga zzagaVar = (zzaga) obj;
        zzafz zzafzVar = (zzafz) obj2;
        if (zzagaVar.isEmpty()) {
            return 0;
        }
        Iterator it2 = zzagaVar.entrySet().iterator();
        if (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }
}