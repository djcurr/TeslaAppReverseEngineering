package g30;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import e30.k;
import java.util.Map;

/* loaded from: classes5.dex */
public final class v0<K, V> extends m0<K, V, Map.Entry<? extends K, ? extends V>> {

    /* renamed from: c  reason: collision with root package name */
    private final e30.f f27654c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a<K, V> implements Map.Entry<K, V>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        private final K f27655a;

        /* renamed from: b  reason: collision with root package name */
        private final V f27656b;

        public a(K k11, V v11) {
            this.f27655a = k11;
            this.f27656b = v11;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return kotlin.jvm.internal.s.c(getKey(), aVar.getKey()) && kotlin.jvm.internal.s.c(getValue(), aVar.getValue());
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f27655a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f27656b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return ((getKey() == null ? 0 : getKey().hashCode()) * 31) + (getValue() != null ? getValue().hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + getKey() + ", value=" + getValue() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<e30.a, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c30.b<K> f27657a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c30.b<V> f27658b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c30.b<K> bVar, c30.b<V> bVar2) {
            super(1);
            this.f27657a = bVar;
            this.f27658b = bVar2;
        }

        public final void a(e30.a buildSerialDescriptor) {
            kotlin.jvm.internal.s.g(buildSerialDescriptor, "$this$buildSerialDescriptor");
            e30.a.b(buildSerialDescriptor, Action.KEY_ATTRIBUTE, this.f27657a.getDescriptor(), null, false, 12, null);
            e30.a.b(buildSerialDescriptor, "value", this.f27658b.getDescriptor(), null, false, 12, null);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(e30.a aVar) {
            a(aVar);
            return vz.b0.f54756a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(c30.b<K> keySerializer, c30.b<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        kotlin.jvm.internal.s.g(keySerializer, "keySerializer");
        kotlin.jvm.internal.s.g(valueSerializer, "valueSerializer");
        this.f27654c = e30.i.c("kotlin.collections.Map.Entry", k.c.f24592a, new e30.f[0], new b(keySerializer, valueSerializer));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.m0
    /* renamed from: d */
    public K a(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.s.g(entry, "<this>");
        return entry.getKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.m0
    /* renamed from: e */
    public V b(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.s.g(entry, "<this>");
        return entry.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.m0
    /* renamed from: f */
    public Map.Entry<K, V> c(K k11, V v11) {
        return new a(k11, v11);
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return this.f27654c;
    }
}