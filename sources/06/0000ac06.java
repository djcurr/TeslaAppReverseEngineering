package q00;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentMap<m0, WeakReference<a10.k>> f47087a = new ConcurrentHashMap();

    public static final a10.k a(Class<?> getOrCreateModule) {
        kotlin.jvm.internal.s.g(getOrCreateModule, "$this$getOrCreateModule");
        ClassLoader f11 = b10.b.f(getOrCreateModule);
        m0 m0Var = new m0(f11);
        ConcurrentMap<m0, WeakReference<a10.k>> concurrentMap = f47087a;
        WeakReference<a10.k> weakReference = concurrentMap.get(m0Var);
        if (weakReference != null) {
            a10.k it2 = weakReference.get();
            if (it2 != null) {
                kotlin.jvm.internal.s.f(it2, "it");
                return it2;
            }
            concurrentMap.remove(m0Var, weakReference);
        }
        a10.k a11 = a10.k.f124c.a(f11);
        while (true) {
            try {
                ConcurrentMap<m0, WeakReference<a10.k>> concurrentMap2 = f47087a;
                WeakReference<a10.k> putIfAbsent = concurrentMap2.putIfAbsent(m0Var, new WeakReference<>(a11));
                if (putIfAbsent == null) {
                    return a11;
                }
                a10.k kVar = putIfAbsent.get();
                if (kVar != null) {
                    return kVar;
                }
                concurrentMap2.remove(m0Var, putIfAbsent);
            } finally {
                m0Var.a(null);
            }
        }
    }
}