package ch.qos.logback.classic.turbo;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
class LRUMessageCache extends LinkedHashMap<String, Integer> {
    private static final long serialVersionUID = 1;
    final int cacheSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LRUMessageCache(int i11) {
        super((int) (i11 * 1.3333334f), 0.75f, true);
        if (i11 < 1) {
            throw new IllegalArgumentException("Cache size cannot be smaller than 1");
        }
        this.cacheSize = i11;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized void clear() {
        super.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMessageCountAndThenIncrement(String str) {
        Integer valueOf;
        if (str == null) {
            return 0;
        }
        synchronized (this) {
            Integer num = (Integer) super.get(str);
            valueOf = num == null ? 0 : Integer.valueOf(num.intValue() + 1);
            super.put(str, valueOf);
        }
        return valueOf.intValue();
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(Map.Entry<String, Integer> entry) {
        return size() > this.cacheSize;
    }
}