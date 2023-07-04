package wz;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class d<K, V> implements Map<K, V>, i00.a {

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<Map.Entry<? extends K, ? extends V>, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d<K, V> f56475a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(d<K, ? extends V> dVar) {
            super(1);
            this.f56475a = dVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final CharSequence invoke(Map.Entry<? extends K, ? extends V> it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return this.f56475a.j(it2);
        }
    }

    static {
        new a(null);
    }

    private final String i(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String j(Map.Entry<? extends K, ? extends V> entry) {
        return i(entry.getKey()) + '=' + i(entry.getValue());
    }

    public final boolean b(Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        V v11 = get(key);
        if (kotlin.jvm.internal.s.c(value, v11)) {
            return v11 != null || containsKey(key);
        }
        return false;
    }

    public abstract Set c();

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> entrySet = entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = entrySet.iterator();
        while (it2.hasNext()) {
            if (kotlin.jvm.internal.s.c(((Map.Entry) it2.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Set<K> e();

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return c();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            Set<Map.Entry<K, V>> entrySet = map.entrySet();
            if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
                return true;
            }
            Iterator<T> it2 = entrySet.iterator();
            while (it2.hasNext()) {
                if (!b((Map.Entry) it2.next())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public abstract int f();

    public abstract Collection<V> h();

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return e();
    }

    @Override // java.util.Map
    public V put(K k11, V v11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return f();
    }

    public String toString() {
        String l02;
        l02 = e0.l0(entrySet(), ", ", "{", "}", 0, null, new b(this), 24, null);
        return l02;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return h();
    }
}