package com.google.common.collect;

import com.google.common.collect.t;
import com.google.common.collect.u;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes3.dex */
public class s<K, V> extends u<K, V> implements y<K, V> {

    /* loaded from: classes3.dex */
    public static final class a<K, V> extends u.c<K, V> {
        public s<K, V> e() {
            return (s) super.a();
        }

        @Override // com.google.common.collect.u.c
        /* renamed from: f */
        public a<K, V> c(K k11, Iterable<? extends V> iterable) {
            super.c(k11, iterable);
            return this;
        }

        public a<K, V> g(K k11, V... vArr) {
            super.d(k11, vArr);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(t<K, r<V>> tVar, int i11) {
        super(tVar, i11);
    }

    public static <K, V> a<K, V> r() {
        return new a<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> s<K, V> s(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        r v11;
        if (collection.isEmpty()) {
            return u();
        }
        t.a aVar = new t.a(collection.size());
        int i11 = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            if (comparator == null) {
                v11 = r.o(value);
            } else {
                v11 = r.v(comparator, value);
            }
            if (!v11.isEmpty()) {
                aVar.d(key, v11);
                i11 += v11.size();
            }
        }
        return new s<>(aVar.a(), i11);
    }

    public static <K, V> s<K, V> u() {
        return n.f16097g;
    }

    @Override // com.google.common.collect.e0
    /* renamed from: t */
    public r<V> get(K k11) {
        r<V> rVar = (r) this.f16143e.get(k11);
        return rVar == null ? r.r() : rVar;
    }
}