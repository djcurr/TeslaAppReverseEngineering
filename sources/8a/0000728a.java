package h30;

import java.util.Map;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final Map<e30.f, Map<a<Object>, Object>> f28851a = k.a(1);

    /* loaded from: classes5.dex */
    public static final class a<T> {
    }

    public final <T> T a(e30.f descriptor, a<T> key) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        kotlin.jvm.internal.s.g(key, "key");
        Map<a<Object>, Object> map = this.f28851a.get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return (T) obj;
    }

    public final <T> T b(e30.f descriptor, a<T> key, h00.a<? extends T> defaultValue) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        kotlin.jvm.internal.s.g(key, "key");
        kotlin.jvm.internal.s.g(defaultValue, "defaultValue");
        T t11 = (T) a(descriptor, key);
        if (t11 != null) {
            return t11;
        }
        T invoke = defaultValue.invoke();
        c(descriptor, key, invoke);
        return invoke;
    }

    public final <T> void c(e30.f descriptor, a<T> key, T value) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        kotlin.jvm.internal.s.g(key, "key");
        kotlin.jvm.internal.s.g(value, "value");
        Map<e30.f, Map<a<Object>, Object>> map = this.f28851a;
        Map<a<Object>, Object> map2 = map.get(descriptor);
        if (map2 == null) {
            map2 = k.a(1);
            map.put(descriptor, map2);
        }
        map2.put(key, value);
    }
}