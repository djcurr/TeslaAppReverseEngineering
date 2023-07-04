package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a<K, V> extends com.google.common.collect.b<K, V> {

        /* renamed from: g */
        transient com.google.common.base.a0<? extends List<V>> f16067g;

        a(Map<K, Collection<V>> map, com.google.common.base.a0<? extends List<V>> a0Var) {
            super(map);
            this.f16067g = (com.google.common.base.a0) com.google.common.base.u.o(a0Var);
        }

        @Override // com.google.common.collect.c
        /* renamed from: B */
        public List<V> r() {
            return this.f16067g.get();
        }

        @Override // com.google.common.collect.e
        Map<K, Collection<V>> d() {
            return t();
        }

        @Override // com.google.common.collect.e
        Set<K> f() {
            return u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        abstract e0<K, V> b();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            b().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return b().b(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return b().remove(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return b().size();
        }
    }

    public static boolean a(e0<?, ?> e0Var, Object obj) {
        if (obj == e0Var) {
            return true;
        }
        if (obj instanceof e0) {
            return e0Var.asMap().equals(((e0) obj).asMap());
        }
        return false;
    }

    public static <K, V> y<K, V> b(Map<K, Collection<V>> map, com.google.common.base.a0<? extends List<V>> a0Var) {
        return new a(map, a0Var);
    }
}