package g1;

import java.util.Map;

/* loaded from: classes.dex */
public class b<K, V> implements Map.Entry<K, V>, i00.a {

    /* renamed from: a  reason: collision with root package name */
    private final K f27309a;

    /* renamed from: b  reason: collision with root package name */
    private final V f27310b;

    public b(K k11, V v11) {
        this.f27309a = k11;
        this.f27310b = v11;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && kotlin.jvm.internal.s.c(entry.getKey(), getKey()) && kotlin.jvm.internal.s.c(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.f27309a;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.f27310b;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        int hashCode = key == null ? 0 : key.hashCode();
        V value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public V setValue(V v11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}