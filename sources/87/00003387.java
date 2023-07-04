package com.google.android.libraries.places.internal;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class zzjh {
    public static List zza(List list, zzce zzceVar) {
        if (list instanceof RandomAccess) {
            return new zzje(list, zzceVar, null);
        }
        return new zzjg(list, zzceVar, null);
    }
}