package com.stripe.android.ui.core;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FieldValuesToParamsMapConverterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> Map<K, V> filterOutNullValues(Map<K, ? extends V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}