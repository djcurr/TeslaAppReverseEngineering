package m1;

import i00.e;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class x<K, V> extends y<K, V> implements Iterator<Map.Entry<K, V>>, i00.a {

    /* loaded from: classes.dex */
    public static final class a implements Map.Entry<K, V>, e.a {

        /* renamed from: a  reason: collision with root package name */
        private final K f38254a;

        /* renamed from: b  reason: collision with root package name */
        private V f38255b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ x<K, V> f38256c;

        a(x<K, V> xVar) {
            this.f38256c = xVar;
            Map.Entry<K, V> e11 = xVar.e();
            kotlin.jvm.internal.s.e(e11);
            this.f38254a = e11.getKey();
            Map.Entry<K, V> e12 = xVar.e();
            kotlin.jvm.internal.s.e(e12);
            this.f38255b = e12.getValue();
        }

        public void a(V v11) {
            this.f38255b = v11;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f38254a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f38255b;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            x<K, V> xVar = this.f38256c;
            if (xVar.f().h() == ((y) xVar).f38259c) {
                V v12 = (V) getValue();
                xVar.f().put((K) getKey(), v11);
                a(v11);
                return v12;
            }
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(t<K, V> map, Iterator<? extends Map.Entry<? extends K, ? extends V>> iterator) {
        super(map, iterator);
        kotlin.jvm.internal.s.g(map, "map");
        kotlin.jvm.internal.s.g(iterator, "iterator");
    }

    @Override // java.util.Iterator
    /* renamed from: j */
    public Map.Entry<K, V> next() {
        c();
        if (e() != null) {
            return new a(this);
        }
        throw new IllegalStateException();
    }
}