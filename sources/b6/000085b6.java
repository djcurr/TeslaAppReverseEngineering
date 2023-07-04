package m1;

import e1.f;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import m1.t;

/* loaded from: classes.dex */
final class n<K, V> extends o<K, V, K> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t<K, V> map) {
        super(map);
        kotlin.jvm.internal.s.g(map, "map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) e(obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) f(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return b().containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.s.g(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        for (Object obj : elements) {
            if (!b().containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    public Void e(K k11) {
        u.b();
        throw new KotlinNothingValueException();
    }

    public Void f(Collection<? extends K> elements) {
        kotlin.jvm.internal.s.g(elements, "elements");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    /* renamed from: h */
    public z<K, V> iterator() {
        return new z<>(b(), ((e1.d) b().i().g().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return b().remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        boolean z11;
        kotlin.jvm.internal.s.g(elements, "elements");
        while (true) {
            for (Object obj : elements) {
                z11 = b().remove(obj) != null || z11;
            }
            return z11;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        Set S0;
        Object obj;
        e1.f<K, V> g11;
        int h11;
        boolean z11;
        Object obj2;
        h a11;
        kotlin.jvm.internal.s.g(elements, "elements");
        S0 = wz.e0.S0(elements);
        t<K, V> b11 = b();
        boolean z12 = false;
        do {
            obj = u.f38235a;
            synchronized (obj) {
                t.a aVar = (t.a) l.x((t.a) b11.b(), h.f38186d.a());
                g11 = aVar.g();
                h11 = aVar.h();
                vz.b0 b0Var = vz.b0.f54756a;
            }
            kotlin.jvm.internal.s.e(g11);
            f.a<K, V> g12 = g11.g();
            z11 = true;
            for (Map.Entry<K, V> entry : b11.entrySet()) {
                if (!S0.contains(entry.getKey())) {
                    g12.remove(entry.getKey());
                    z12 = true;
                }
            }
            vz.b0 b0Var2 = vz.b0.f54756a;
            e1.f<K, V> build = g12.build();
            if (kotlin.jvm.internal.s.c(build, g11)) {
                break;
            }
            obj2 = u.f38235a;
            synchronized (obj2) {
                t.a aVar2 = (t.a) b11.b();
                l.A();
                synchronized (l.z()) {
                    a11 = h.f38186d.a();
                    t.a aVar3 = (t.a) l.T(aVar2, b11, a11);
                    if (aVar3.h() == h11) {
                        aVar3.i(build);
                        aVar3.j(aVar3.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
                l.F(a11, b11);
            }
        } while (!z11);
        return z12;
    }
}