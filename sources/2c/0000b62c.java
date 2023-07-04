package tw;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;
import tw.a;

/* loaded from: classes6.dex */
public final class g<K, V> extends tw.a<K, V, V> {

    /* loaded from: classes6.dex */
    public static final class b<K, V> extends a.AbstractC1171a<K, V, V> {
        public g<K, V> b() {
            return new g<>(this.f52632a);
        }

        public b<K, V> c(K k11, Provider<V> provider) {
            super.a(k11, provider);
            return this;
        }

        private b(int i11) {
            super(i11);
        }
    }

    static {
        f.a(Collections.emptyMap());
    }

    public static <K, V> b<K, V> b(int i11) {
        return new b<>(i11);
    }

    @Override // javax.inject.Provider
    /* renamed from: c */
    public Map<K, V> get() {
        LinkedHashMap c11 = tw.b.c(a().size());
        for (Map.Entry<K, Provider<V>> entry : a().entrySet()) {
            c11.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(c11);
    }

    private g(Map<K, Provider<V>> map) {
        super(map);
    }
}