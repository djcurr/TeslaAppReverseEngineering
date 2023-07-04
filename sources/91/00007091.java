package gq;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    protected static HashMap<Class<?>, LinkedHashSet<Class<?>>> f28075a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    protected static HashMap<Class<?>, HashMap<String, String>> f28076b = new HashMap<>();

    static {
        a(Object.class, h.class);
        a(Object.class, g.class);
    }

    public static void a(Class<?> cls, Class<?> cls2) {
        synchronized (f28075a) {
            LinkedHashSet<Class<?>> linkedHashSet = f28075a.get(cls);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
                f28075a.put(cls, linkedHashSet);
            }
            linkedHashSet.add(cls2);
        }
    }
}