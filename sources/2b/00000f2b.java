package c1;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a */
    private static final Object f8642a = new Object();

    public static final l a(e<?> applier, m parent) {
        kotlin.jvm.internal.s.g(applier, "applier");
        kotlin.jvm.internal.s.g(parent, "parent");
        return new o(parent, applier, null, 4, null);
    }

    public static final /* synthetic */ void b(d1.b bVar, Object obj, Object obj2) {
        d(bVar, obj, obj2);
    }

    public static final /* synthetic */ Object c() {
        return f8642a;
    }

    public static final <K, V> void d(d1.b<K, d1.c<V>> bVar, K k11, V v11) {
        if (bVar.a(k11)) {
            d1.c<V> d11 = bVar.d(k11);
            if (d11 == null) {
                return;
            }
            d11.add(v11);
            return;
        }
        d1.c<V> cVar = new d1.c<>();
        cVar.add(v11);
        vz.b0 b0Var = vz.b0.f54756a;
        bVar.j(k11, cVar);
    }
}