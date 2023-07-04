package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public class j extends k {

    /* renamed from: e  reason: collision with root package name */
    private final o f35021e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: a  reason: collision with root package name */
        private Map.Entry<K, j> f35022a;

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f35022a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            j value = this.f35022a.getValue();
            if (value == null) {
                return null;
            }
            return value.e();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof o) {
                return this.f35022a.getValue().d((o) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, j> entry) {
            this.f35022a = entry;
        }
    }

    /* loaded from: classes5.dex */
    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a  reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f35023a;

        public c(Iterator<Map.Entry<K, Object>> it2) {
            this.f35023a = it2;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f35023a.next();
            return next.getValue() instanceof j ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f35023a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f35023a.remove();
        }
    }

    public o e() {
        return c(this.f35021e);
    }

    public boolean equals(Object obj) {
        return e().equals(obj);
    }

    public int hashCode() {
        return e().hashCode();
    }

    public String toString() {
        return e().toString();
    }
}