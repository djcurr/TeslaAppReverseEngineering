package com.google.common.collect;

import ch.qos.logback.core.CoreConstants;
import com.google.common.collect.s0;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* loaded from: classes3.dex */
    public class a<K, V> extends u0<Map.Entry<K, V>, V> {
        a(Iterator it2) {
            super(it2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.u0
        /* renamed from: b */
        public V a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static abstract class b implements com.google.common.base.l<Map.Entry<?, ?>, Object> {
        public static final b KEY = new a("KEY", 0);
        public static final b VALUE = new C0293b("VALUE", 1);
        private static final /* synthetic */ b[] $VALUES = $values();

        /* loaded from: classes3.dex */
        enum a extends b {
            a(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.google.common.collect.d0.b, com.google.common.base.l
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* renamed from: com.google.common.collect.d0$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        enum C0293b extends b {
            C0293b(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.google.common.collect.d0.b, com.google.common.base.l
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private static /* synthetic */ b[] $values() {
            return new b[]{KEY, VALUE};
        }

        private b(String str, int i11) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        @Override // com.google.common.base.l
        public abstract /* synthetic */ T apply(F f11);

        /* synthetic */ b(String str, int i11, c0 c0Var) {
            this(str, i11);
        }
    }

    /* loaded from: classes3.dex */
    static abstract class c<K, V> extends s0.a<Map.Entry<K, V>> {
        abstract Map<K, V> b();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return b().isEmpty();
        }

        @Override // com.google.common.collect.s0.a, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) com.google.common.base.u.o(collection));
            } catch (UnsupportedOperationException unused) {
                return s0.g(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.s0.a, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) com.google.common.base.u.o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet d11 = s0.d(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        d11.add(((Map.Entry) obj).getKey());
                    }
                }
                return b().keySet().retainAll(d11);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b().size();
        }
    }

    /* loaded from: classes3.dex */
    static class d<K, V> extends s0.a<K> {

        /* renamed from: a  reason: collision with root package name */
        final Map<K, V> f16050a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(Map<K, V> map) {
            this.f16050a = (Map) com.google.common.base.u.o(map);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Map<K, V> b() {
            return this.f16050a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return b().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return b().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class e<K, V> extends AbstractCollection<V> {

        /* renamed from: a  reason: collision with root package name */
        final Map<K, V> f16051a;

        e(Map<K, V> map) {
            this.f16051a = (Map) com.google.common.base.u.o(map);
        }

        final Map<K, V> b() {
            return this.f16051a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            b().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return b().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return b().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return d0.k(b().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : b().entrySet()) {
                    if (com.google.common.base.q.a(obj, entry.getValue())) {
                        b().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) com.google.common.base.u.o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet c11 = s0.c();
                for (Map.Entry<K, V> entry : b().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        c11.add(entry.getKey());
                    }
                }
                return b().keySet().removeAll(c11);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) com.google.common.base.u.o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet c11 = s0.c();
                for (Map.Entry<K, V> entry : b().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        c11.add(entry.getKey());
                    }
                }
                return b().keySet().retainAll(c11);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return b().size();
        }
    }

    /* loaded from: classes3.dex */
    static abstract class f<K, V> extends AbstractMap<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private transient Set<Map.Entry<K, V>> f16052a;

        /* renamed from: b  reason: collision with root package name */
        private transient Collection<V> f16053b;

        abstract Set<Map.Entry<K, V>> a();

        Collection<V> b() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f16052a;
            if (set == null) {
                Set<Map.Entry<K, V>> a11 = a();
                this.f16052a = a11;
                return a11;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f16053b;
            if (collection == null) {
                Collection<V> b11 = b();
                this.f16053b = b11;
                return b11;
            }
            return collection;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i11) {
        if (i11 < 3) {
            h.b(i11, "expectedSize");
            return i11 + 1;
        } else if (i11 < 1073741824) {
            return (int) ((i11 / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> Map.Entry<K, V> c(K k11, V v11) {
        return new q(k11, v11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K> com.google.common.base.l<Map.Entry<K, ?>, K> d() {
        return b.KEY;
    }

    public static <K, V> IdentityHashMap<K, V> e() {
        return new IdentityHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(Map<?, ?> map, Object obj) {
        com.google.common.base.u.o(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> V g(Map<?, V> map, Object obj) {
        com.google.common.base.u.o(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> V h(Map<?, V> map, Object obj) {
        com.google.common.base.u.o(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String i(Map<?, ?> map) {
        StringBuilder a11 = i.a(map.size());
        a11.append(CoreConstants.CURLY_LEFT);
        boolean z11 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z11) {
                a11.append(", ");
            }
            z11 = false;
            a11.append(entry.getKey());
            a11.append('=');
            a11.append(entry.getValue());
        }
        a11.append(CoreConstants.CURLY_RIGHT);
        return a11.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> com.google.common.base.l<Map.Entry<?, V>, V> j() {
        return b.VALUE;
    }

    static <K, V> Iterator<V> k(Iterator<Map.Entry<K, V>> it2) {
        return new a(it2);
    }
}