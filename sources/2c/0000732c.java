package hf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class h<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final y<V> f29168a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashMap<K, V> f29169b = new LinkedHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private int f29170c = 0;

    public h(y<V> yVar) {
        this.f29168a = yVar;
    }

    private int g(V v11) {
        if (v11 == null) {
            return 0;
        }
        return this.f29168a.a(v11);
    }

    public synchronized boolean a(K k11) {
        return this.f29169b.containsKey(k11);
    }

    public synchronized V b(K k11) {
        return this.f29169b.get(k11);
    }

    public synchronized int c() {
        return this.f29169b.size();
    }

    public synchronized K d() {
        return this.f29169b.isEmpty() ? null : this.f29169b.keySet().iterator().next();
    }

    public synchronized ArrayList<Map.Entry<K, V>> e(md.l<K> lVar) {
        ArrayList<Map.Entry<K, V>> arrayList;
        arrayList = new ArrayList<>(this.f29169b.entrySet().size());
        for (Map.Entry<K, V> entry : this.f29169b.entrySet()) {
            if (lVar == null || lVar.apply(entry.getKey())) {
                arrayList.add(entry);
            }
        }
        return arrayList;
    }

    public synchronized int f() {
        return this.f29170c;
    }

    public synchronized V h(K k11, V v11) {
        V remove;
        remove = this.f29169b.remove(k11);
        this.f29170c -= g(remove);
        this.f29169b.put(k11, v11);
        this.f29170c += g(v11);
        return remove;
    }

    public synchronized V i(K k11) {
        V remove;
        remove = this.f29169b.remove(k11);
        this.f29170c -= g(remove);
        return remove;
    }

    public synchronized ArrayList<V> j(md.l<K> lVar) {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>();
        Iterator<Map.Entry<K, V>> it2 = this.f29169b.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<K, V> next = it2.next();
            if (lVar == null || lVar.apply(next.getKey())) {
                arrayList.add(next.getValue());
                this.f29170c -= g(next.getValue());
                it2.remove();
            }
        }
        return arrayList;
    }
}