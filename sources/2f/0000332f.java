package com.google.android.libraries.places.internal;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzga extends LinkedHashMap {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzga(int i11, float f11, boolean z11) {
        super(16, 0.75f, true);
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 10;
    }
}