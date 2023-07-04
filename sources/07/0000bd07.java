package wn;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class a<K> extends HashMap<K, Object> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Object, K> f56133a = new HashMap();

    @Override // java.util.HashMap, java.util.AbstractMap
    /* renamed from: a */
    public a<K> clone() {
        a<K> aVar = new a<>();
        aVar.putAll((Map) super.clone());
        return aVar;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        super.clear();
        this.f56133a.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(K k11, Object obj) {
        this.f56133a.put(obj, k11);
        return super.put(k11, obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ?> map) {
        for (Map.Entry<? extends K, ?> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Object remove = super.remove(obj);
        if (remove instanceof Collection) {
            for (Object obj2 : (Collection) remove) {
                this.f56133a.remove(obj2);
            }
        } else {
            this.f56133a.remove(remove);
        }
        return remove;
    }
}