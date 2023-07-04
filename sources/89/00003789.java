package com.google.common.collect;

import ch.qos.logback.core.util.FileSize;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static StringBuilder a(int i11) {
        h.b(i11, "size");
        return new StringBuilder((int) Math.min(i11 * 8, (long) FileSize.GB_COEFFICIENT));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(Collection<?> collection, Object obj) {
        com.google.common.base.u.o(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}