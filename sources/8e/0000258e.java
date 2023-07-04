package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzcg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Iterator it2) {
        Objects.requireNonNull(it2);
        while (it2.hasNext()) {
            it2.next();
            it2.remove();
        }
    }
}