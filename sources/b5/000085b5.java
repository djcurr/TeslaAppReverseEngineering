package m1;

import e1.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.r0;
import m1.t;

/* loaded from: classes.dex */
final class m<K, V> extends o<K, V, Map.Entry<K, V>> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t<K, V> map) {
        super(map);
        kotlin.jvm.internal.s.g(map, "map");
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) e((Map.Entry) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) f(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (r0.p(obj)) {
            return h((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.s.g(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it2 = elements.iterator();
        while (it2.hasNext()) {
            if (!contains((Map.Entry) it2.next())) {
                return false;
            }
        }
        return true;
    }

    public Void e(Map.Entry<K, V> element) {
        kotlin.jvm.internal.s.g(element, "element");
        u.b();
        throw new KotlinNothingValueException();
    }

    public Void f(Collection<? extends Map.Entry<K, V>> elements) {
        kotlin.jvm.internal.s.g(elements, "elements");
        u.b();
        throw new KotlinNothingValueException();
    }

    public boolean h(Map.Entry<K, V> element) {
        kotlin.jvm.internal.s.g(element, "element");
        return kotlin.jvm.internal.s.c(b().get(element.getKey()), element.getValue());
    }

    public boolean i(Map.Entry<K, V> element) {
        kotlin.jvm.internal.s.g(element, "element");
        return b().remove(element.getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new x(b(), ((e1.d) b().i().g().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (r0.p(obj)) {
            return i((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.s.g(elements, "elements");
        Iterator<? extends Object> it2 = elements.iterator();
        while (true) {
            boolean z11 = false;
            while (it2.hasNext()) {
                if (b().remove(((Map.Entry) it2.next()).getKey()) != null || z11) {
                    z11 = true;
                }
            }
            return z11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        int t11;
        int e11;
        int d11;
        Object obj;
        e1.f<K, V> g11;
        int h11;
        boolean z11;
        Object obj2;
        h a11;
        kotlin.jvm.internal.s.g(elements, "elements");
        t11 = wz.x.t(elements, 10);
        e11 = wz.r0.e(t11);
        d11 = m00.l.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        Iterator<T> it2 = elements.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            vz.p a12 = vz.v.a(entry.getKey(), entry.getValue());
            linkedHashMap.put(a12.c(), a12.d());
        }
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
            for (Map.Entry<K, V> entry2 : b11.entrySet()) {
                if ((linkedHashMap.containsKey(entry2.getKey()) && kotlin.jvm.internal.s.c(linkedHashMap.get(entry2.getKey()), entry2.getValue())) ? false : true) {
                    g12.remove(entry2.getKey());
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