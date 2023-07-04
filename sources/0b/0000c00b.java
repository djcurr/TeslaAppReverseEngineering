package xz;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends wz.h<E> {
    public final boolean c(E element) {
        s.g(element, "element");
        return e(element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return c((Map.Entry) obj);
        }
        return false;
    }

    public abstract boolean e(Map.Entry<? extends K, ? extends V> entry);

    public abstract /* bridge */ boolean f(Map.Entry<?, ?> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return f((Map.Entry) obj);
        }
        return false;
    }
}