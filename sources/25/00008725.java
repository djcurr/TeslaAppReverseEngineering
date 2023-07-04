package mr;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.p;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d {
    public static final <T> List<T> a(List<? extends T> list, ProtoAdapter<T> protoAdapter) {
        return f.a(list, protoAdapter);
    }

    public static final String b(String str) {
        return f.b(str);
    }

    public static final int c(Object obj, Object obj2) {
        return f.c(obj, obj2);
    }

    public static final int d(Object obj, Object obj2, Object obj3) {
        return f.d(obj, obj2, obj3);
    }

    public static final int e(Object obj, Object obj2, Object obj3, Object obj4, Object... objArr) {
        return f.e(obj, obj2, obj3, obj4, objArr);
    }

    public static final <E extends p> E f(Class<E> cls) {
        return (E) e.a(cls);
    }

    public static final <T> List<T> g(String str, List<? extends T> list) {
        return f.f(str, list);
    }

    public static final <K, V> Map<K, V> h(String str, Map<K, ? extends V> map) {
        return f.g(str, map);
    }

    public static final String i(String str) {
        return f.h(str);
    }

    public static final String j(List<String> list) {
        return f.i(list);
    }
}