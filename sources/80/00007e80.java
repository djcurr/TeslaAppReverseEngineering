package kotlin.properties;

import kotlin.jvm.internal.s;
import n00.m;

/* loaded from: classes5.dex */
public abstract class b<V> implements c<Object, V> {
    private V value;

    public b(V v11) {
        this.value = v11;
    }

    protected void afterChange(m<?> property, V v11, V v12) {
        s.g(property, "property");
    }

    protected boolean beforeChange(m<?> property, V v11, V v12) {
        s.g(property, "property");
        return true;
    }

    @Override // kotlin.properties.c
    public V getValue(Object obj, m<?> property) {
        s.g(property, "property");
        return this.value;
    }

    @Override // kotlin.properties.c
    public void setValue(Object obj, m<?> property, V v11) {
        s.g(property, "property");
        V v12 = this.value;
        if (beforeChange(property, v12, v11)) {
            this.value = v11;
            afterChange(property, v12, v11);
        }
    }
}