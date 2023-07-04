package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzco {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zza(Map map, Object obj) {
        Objects.requireNonNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzb(Map map, Object obj) {
        Objects.requireNonNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}