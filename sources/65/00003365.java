package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzia {
    public static final Appendable zza(Appendable appendable, Iterator it2, zzib zzibVar, String str) {
        String str2;
        if (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            appendable.append(zzibVar.zza(entry.getKey()));
            appendable.append("=");
            appendable.append(zzibVar.zza(entry.getValue()));
            while (it2.hasNext()) {
                str2 = zzibVar.zza;
                appendable.append(str2);
                Map.Entry entry2 = (Map.Entry) it2.next();
                appendable.append(zzibVar.zza(entry2.getKey()));
                appendable.append("=");
                appendable.append(zzibVar.zza(entry2.getValue()));
            }
        }
        return appendable;
    }
}