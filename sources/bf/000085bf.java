package m1;

import e1.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import m1.b0;
import m1.h;

/* loaded from: classes.dex */
public final class t<K, V> implements Map<K, V>, b0, i00.e {

    /* renamed from: a  reason: collision with root package name */
    private c0 f38229a = new a(e1.a.a());

    /* renamed from: b  reason: collision with root package name */
    private final Set<Map.Entry<K, V>> f38230b = new m(this);

    /* renamed from: c  reason: collision with root package name */
    private final Set<K> f38231c = new n(this);

    /* renamed from: d  reason: collision with root package name */
    private final Collection<V> f38232d = new p(this);

    /* loaded from: classes.dex */
    public static final class a<K, V> extends c0 {

        /* renamed from: c  reason: collision with root package name */
        private e1.f<K, ? extends V> f38233c;

        /* renamed from: d  reason: collision with root package name */
        private int f38234d;

        public a(e1.f<K, ? extends V> map) {
            kotlin.jvm.internal.s.g(map, "map");
            this.f38233c = map;
        }

        @Override // m1.c0
        public void a(c0 value) {
            Object obj;
            kotlin.jvm.internal.s.g(value, "value");
            a aVar = (a) value;
            obj = u.f38235a;
            synchronized (obj) {
                i(aVar.g());
                j(aVar.h());
                vz.b0 b0Var = vz.b0.f54756a;
            }
        }

        @Override // m1.c0
        public c0 b() {
            return new a(this.f38233c);
        }

        public final e1.f<K, V> g() {
            return (e1.f<K, ? extends V>) this.f38233c;
        }

        public final int h() {
            return this.f38234d;
        }

        public final void i(e1.f<K, ? extends V> fVar) {
            kotlin.jvm.internal.s.g(fVar, "<set-?>");
            this.f38233c = fVar;
        }

        public final void j(int i11) {
            this.f38234d = i11;
        }
    }

    public Set<Map.Entry<K, V>> a() {
        return this.f38230b;
    }

    @Override // m1.b0
    public c0 b() {
        return this.f38229a;
    }

    @Override // m1.b0
    public c0 c(c0 c0Var, c0 c0Var2, c0 c0Var3) {
        return b0.a.a(this, c0Var, c0Var2, c0Var3);
    }

    @Override // java.util.Map
    public void clear() {
        Object obj;
        h a11;
        h.a aVar = h.f38186d;
        a aVar2 = (a) l.x((a) b(), aVar.a());
        aVar2.g();
        e1.f<K, V> a12 = e1.a.a();
        if (a12 != aVar2.g()) {
            obj = u.f38235a;
            synchronized (obj) {
                a aVar3 = (a) b();
                l.A();
                synchronized (l.z()) {
                    a11 = aVar.a();
                    a aVar4 = (a) l.T(aVar3, this, a11);
                    aVar4.i(a12);
                    aVar4.j(aVar4.h() + 1);
                }
                l.F(a11, this);
            }
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return i().g().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return i().g().containsValue(obj);
    }

    @Override // m1.b0
    public void e(c0 value) {
        kotlin.jvm.internal.s.g(value, "value");
        this.f38229a = (a) value;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return a();
    }

    public Set<K> f() {
        return this.f38231c;
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return i().g().get(obj);
    }

    public final int h() {
        return i().h();
    }

    public final a<K, V> i() {
        return (a) l.K((a) b(), this);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return i().g().isEmpty();
    }

    public int j() {
        return i().g().size();
    }

    public Collection<V> k() {
        return this.f38232d;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return f();
    }

    public final boolean m(V v11) {
        Object obj;
        Iterator<T> it2 = entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (kotlin.jvm.internal.s.c(((Map.Entry) obj).getValue(), v11)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @Override // java.util.Map
    public V put(K k11, V v11) {
        Object obj;
        h.a aVar;
        e1.f<K, V> g11;
        int h11;
        V put;
        Object obj2;
        h a11;
        boolean z11;
        do {
            obj = u.f38235a;
            synchronized (obj) {
                aVar = h.f38186d;
                a aVar2 = (a) l.x((a) b(), aVar.a());
                g11 = aVar2.g();
                h11 = aVar2.h();
                vz.b0 b0Var = vz.b0.f54756a;
            }
            kotlin.jvm.internal.s.e(g11);
            f.a<K, V> g12 = g11.g();
            put = g12.put(k11, v11);
            e1.f<K, V> build = g12.build();
            if (kotlin.jvm.internal.s.c(build, g11)) {
                break;
            }
            obj2 = u.f38235a;
            synchronized (obj2) {
                a aVar3 = (a) b();
                l.A();
                synchronized (l.z()) {
                    a11 = aVar.a();
                    a aVar4 = (a) l.T(aVar3, this, a11);
                    z11 = true;
                    if (aVar4.h() == h11) {
                        aVar4.i(build);
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
                l.F(a11, this);
            }
        } while (!z11);
        return put;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        Object obj;
        h.a aVar;
        e1.f<K, V> g11;
        int h11;
        Object obj2;
        h a11;
        boolean z11;
        kotlin.jvm.internal.s.g(from, "from");
        do {
            obj = u.f38235a;
            synchronized (obj) {
                aVar = h.f38186d;
                a aVar2 = (a) l.x((a) b(), aVar.a());
                g11 = aVar2.g();
                h11 = aVar2.h();
                vz.b0 b0Var = vz.b0.f54756a;
            }
            kotlin.jvm.internal.s.e(g11);
            f.a<K, V> g12 = g11.g();
            g12.putAll(from);
            e1.f<K, V> build = g12.build();
            if (kotlin.jvm.internal.s.c(build, g11)) {
                return;
            }
            obj2 = u.f38235a;
            synchronized (obj2) {
                a aVar3 = (a) b();
                l.A();
                synchronized (l.z()) {
                    a11 = aVar.a();
                    a aVar4 = (a) l.T(aVar3, this, a11);
                    z11 = true;
                    if (aVar4.h() == h11) {
                        aVar4.i(build);
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
                l.F(a11, this);
            }
        } while (!z11);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        Object obj2;
        h.a aVar;
        e1.f<K, V> g11;
        int h11;
        V remove;
        Object obj3;
        h a11;
        boolean z11;
        do {
            obj2 = u.f38235a;
            synchronized (obj2) {
                aVar = h.f38186d;
                a aVar2 = (a) l.x((a) b(), aVar.a());
                g11 = aVar2.g();
                h11 = aVar2.h();
                vz.b0 b0Var = vz.b0.f54756a;
            }
            kotlin.jvm.internal.s.e(g11);
            f.a<K, V> g12 = g11.g();
            remove = g12.remove(obj);
            e1.f<K, V> build = g12.build();
            if (kotlin.jvm.internal.s.c(build, g11)) {
                break;
            }
            obj3 = u.f38235a;
            synchronized (obj3) {
                a aVar3 = (a) b();
                l.A();
                synchronized (l.z()) {
                    a11 = aVar.a();
                    a aVar4 = (a) l.T(aVar3, this, a11);
                    z11 = true;
                    if (aVar4.h() == h11) {
                        aVar4.i(build);
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
                l.F(a11, this);
            }
        } while (!z11);
        return remove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return j();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return k();
    }
}