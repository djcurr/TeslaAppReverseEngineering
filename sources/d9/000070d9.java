package gv;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
public final /* synthetic */ class s {
    public static /* synthetic */ Map a(Map.Entry[] entryArr) {
        HashMap hashMap = new HashMap(entryArr.length);
        for (Map.Entry entry : entryArr) {
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (hashMap.put(key, value) != null) {
                throw new IllegalArgumentException("duplicate key: " + key);
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}