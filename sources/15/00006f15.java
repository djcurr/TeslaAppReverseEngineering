package g1;

import java.util.Map;
import java.util.Map.Entry;

/* loaded from: classes.dex */
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends wz.h<E> {
    public final boolean c(E element) {
        kotlin.jvm.internal.s.g(element, "element");
        if ((element instanceof Object ? element : null) instanceof Map.Entry) {
            return e(element);
        }
        return false;
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

    public final boolean f(E element) {
        kotlin.jvm.internal.s.g(element, "element");
        if ((element instanceof Object ? element : null) instanceof Map.Entry) {
            return h(element);
        }
        return false;
    }

    public abstract boolean h(Map.Entry<? extends K, ? extends V> entry);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return f((Map.Entry) obj);
        }
        return false;
    }
}