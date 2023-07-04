package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public class j<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: j */
    private static final Object f16069j = new Object();

    /* renamed from: a */
    private transient Object f16070a;

    /* renamed from: b */
    transient int[] f16071b;

    /* renamed from: c */
    transient Object[] f16072c;

    /* renamed from: d */
    transient Object[] f16073d;

    /* renamed from: e */
    private transient int f16074e;

    /* renamed from: f */
    private transient int f16075f;

    /* renamed from: g */
    private transient Set<K> f16076g;

    /* renamed from: h */
    private transient Set<Map.Entry<K, V>> f16077h;

    /* renamed from: i */
    private transient Collection<V> f16078i;

    /* loaded from: classes3.dex */
    public class a extends j<K, V>.e<K> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(r2, null);
            j.this = r2;
        }

        @Override // com.google.common.collect.j.e
        K b(int i11) {
            return (K) j.this.J(i11);
        }
    }

    /* loaded from: classes3.dex */
    public class b extends j<K, V>.e<Map.Entry<K, V>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(r2, null);
            j.this = r2;
        }

        @Override // com.google.common.collect.j.e
        /* renamed from: d */
        public Map.Entry<K, V> b(int i11) {
            return new g(i11);
        }
    }

    /* loaded from: classes3.dex */
    public class c extends j<K, V>.e<V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(r2, null);
            j.this = r2;
        }

        @Override // com.google.common.collect.j.e
        V b(int i11) {
            return (V) j.this.Z(i11);
        }
    }

    /* loaded from: classes3.dex */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        d() {
            j.this = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> z11 = j.this.z();
            if (z11 != null) {
                return z11.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int G = j.this.G(entry.getKey());
                return G != -1 && com.google.common.base.q.a(j.this.Z(G), entry.getValue());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return j.this.B();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> z11 = j.this.z();
            if (z11 != null) {
                return z11.entrySet().remove(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (j.this.M()) {
                    return false;
                }
                int E = j.this.E();
                int f11 = k.f(entry.getKey(), entry.getValue(), E, j.this.Q(), j.this.O(), j.this.P(), j.this.R());
                if (f11 == -1) {
                    return false;
                }
                j.this.L(f11, E);
                j.f(j.this);
                j.this.F();
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return j.this.size();
        }
    }

    /* loaded from: classes3.dex */
    public class f extends AbstractSet<K> {
        f() {
            j.this = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return j.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return j.this.K();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> z11 = j.this.z();
            if (z11 != null) {
                return z11.keySet().remove(obj);
            }
            return j.this.N(obj) != j.f16069j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return j.this.size();
        }
    }

    /* loaded from: classes3.dex */
    public final class g extends com.google.common.collect.d<K, V> {

        /* renamed from: a */
        private final K f16088a;

        /* renamed from: b */
        private int f16089b;

        g(int i11) {
            j.this = r1;
            this.f16088a = (K) r1.J(i11);
            this.f16089b = i11;
        }

        private void a() {
            int i11 = this.f16089b;
            if (i11 == -1 || i11 >= j.this.size() || !com.google.common.base.q.a(this.f16088a, j.this.J(this.f16089b))) {
                this.f16089b = j.this.G(this.f16088a);
            }
        }

        @Override // com.google.common.collect.d, java.util.Map.Entry
        public K getKey() {
            return this.f16088a;
        }

        @Override // com.google.common.collect.d, java.util.Map.Entry
        public V getValue() {
            Map<K, V> z11 = j.this.z();
            if (z11 != null) {
                return (V) j0.a(z11.get(this.f16088a));
            }
            a();
            int i11 = this.f16089b;
            return i11 == -1 ? (V) j0.b() : (V) j.this.Z(i11);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            Map<K, V> z11 = j.this.z();
            if (z11 != null) {
                return (V) j0.a(z11.put(this.f16088a, v11));
            }
            a();
            int i11 = this.f16089b;
            if (i11 != -1) {
                V v12 = (V) j.this.Z(i11);
                j.this.Y(this.f16089b, v11);
                return v12;
            }
            j.this.put(this.f16088a, v11);
            return (V) j0.b();
        }
    }

    /* loaded from: classes3.dex */
    public class h extends AbstractCollection<V> {
        h() {
            j.this = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return j.this.a0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return j.this.size();
        }
    }

    j() {
        H(3);
    }

    private int A(int i11) {
        return O()[i11];
    }

    public int E() {
        return (1 << (this.f16074e & 31)) - 1;
    }

    public int G(Object obj) {
        if (M()) {
            return -1;
        }
        int c11 = o.c(obj);
        int E = E();
        int h11 = k.h(Q(), c11 & E);
        if (h11 == 0) {
            return -1;
        }
        int b11 = k.b(c11, E);
        do {
            int i11 = h11 - 1;
            int A = A(i11);
            if (k.b(A, E) == b11 && com.google.common.base.q.a(obj, J(i11))) {
                return i11;
            }
            h11 = k.c(A, E);
        } while (h11 != 0);
        return -1;
    }

    public K J(int i11) {
        return (K) P()[i11];
    }

    public Object N(Object obj) {
        if (M()) {
            return f16069j;
        }
        int E = E();
        int f11 = k.f(obj, null, E, Q(), O(), P(), null);
        if (f11 == -1) {
            return f16069j;
        }
        V Z = Z(f11);
        L(f11, E);
        this.f16075f--;
        F();
        return Z;
    }

    public int[] O() {
        int[] iArr = this.f16071b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public Object[] P() {
        Object[] objArr = this.f16072c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public Object Q() {
        Object obj = this.f16070a;
        Objects.requireNonNull(obj);
        return obj;
    }

    public Object[] R() {
        Object[] objArr = this.f16073d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void T(int i11) {
        int min;
        int length = O().length;
        if (i11 <= length || (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        S(min);
    }

    private int U(int i11, int i12, int i13, int i14) {
        Object a11 = k.a(i12);
        int i15 = i12 - 1;
        if (i14 != 0) {
            k.i(a11, i13 & i15, i14 + 1);
        }
        Object Q = Q();
        int[] O = O();
        for (int i16 = 0; i16 <= i11; i16++) {
            int h11 = k.h(Q, i16);
            while (h11 != 0) {
                int i17 = h11 - 1;
                int i18 = O[i17];
                int b11 = k.b(i18, i11) | i16;
                int i19 = b11 & i15;
                int h12 = k.h(a11, i19);
                k.i(a11, i19, h11);
                O[i17] = k.d(b11, h12, i15);
                h11 = k.c(i18, i11);
            }
        }
        this.f16070a = a11;
        W(i15);
        return i15;
    }

    private void V(int i11, int i12) {
        O()[i11] = i12;
    }

    private void W(int i11) {
        this.f16074e = k.d(this.f16074e, 32 - Integer.numberOfLeadingZeros(i11), 31);
    }

    private void X(int i11, K k11) {
        P()[i11] = k11;
    }

    public void Y(int i11, V v11) {
        R()[i11] = v11;
    }

    public V Z(int i11) {
        return (V) R()[i11];
    }

    static /* synthetic */ int f(j jVar) {
        int i11 = jVar.f16075f;
        jVar.f16075f = i11 - 1;
        return i11;
    }

    public static <K, V> j<K, V> t() {
        return new j<>();
    }

    public static <K, V> j<K, V> y(int i11) {
        return new j<>(i11);
    }

    Iterator<Map.Entry<K, V>> B() {
        Map<K, V> z11 = z();
        if (z11 != null) {
            return z11.entrySet().iterator();
        }
        return new b();
    }

    int C() {
        return isEmpty() ? -1 : 0;
    }

    int D(int i11) {
        int i12 = i11 + 1;
        if (i12 < this.f16075f) {
            return i12;
        }
        return -1;
    }

    void F() {
        this.f16074e += 32;
    }

    void H(int i11) {
        com.google.common.base.u.e(i11 >= 0, "Expected size must be >= 0");
        this.f16074e = fl.d.f(i11, 1, 1073741823);
    }

    void I(int i11, K k11, V v11, int i12, int i13) {
        V(i11, k.d(i12, 0, i13));
        X(i11, k11);
        Y(i11, v11);
    }

    Iterator<K> K() {
        Map<K, V> z11 = z();
        if (z11 != null) {
            return z11.keySet().iterator();
        }
        return new a();
    }

    void L(int i11, int i12) {
        Object Q = Q();
        int[] O = O();
        Object[] P = P();
        Object[] R = R();
        int size = size() - 1;
        if (i11 < size) {
            Object obj = P[size];
            P[i11] = obj;
            R[i11] = R[size];
            P[size] = null;
            R[size] = null;
            O[i11] = O[size];
            O[size] = 0;
            int c11 = o.c(obj) & i12;
            int h11 = k.h(Q, c11);
            int i13 = size + 1;
            if (h11 == i13) {
                k.i(Q, c11, i11 + 1);
                return;
            }
            while (true) {
                int i14 = h11 - 1;
                int i15 = O[i14];
                int c12 = k.c(i15, i12);
                if (c12 == i13) {
                    O[i14] = k.d(i15, i11 + 1, i12);
                    return;
                }
                h11 = c12;
            }
        } else {
            P[i11] = null;
            R[i11] = null;
            O[i11] = 0;
        }
    }

    boolean M() {
        return this.f16070a == null;
    }

    void S(int i11) {
        this.f16071b = Arrays.copyOf(O(), i11);
        this.f16072c = Arrays.copyOf(P(), i11);
        this.f16073d = Arrays.copyOf(R(), i11);
    }

    Iterator<V> a0() {
        Map<K, V> z11 = z();
        if (z11 != null) {
            return z11.values().iterator();
        }
        return new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (M()) {
            return;
        }
        F();
        Map<K, V> z11 = z();
        if (z11 != null) {
            this.f16074e = fl.d.f(size(), 3, 1073741823);
            z11.clear();
            this.f16070a = null;
            this.f16075f = 0;
            return;
        }
        Arrays.fill(P(), 0, this.f16075f, (Object) null);
        Arrays.fill(R(), 0, this.f16075f, (Object) null);
        k.g(Q());
        Arrays.fill(O(), 0, this.f16075f, 0);
        this.f16075f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> z11 = z();
        if (z11 != null) {
            return z11.containsKey(obj);
        }
        return G(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> z11 = z();
        if (z11 != null) {
            return z11.containsValue(obj);
        }
        for (int i11 = 0; i11 < this.f16075f; i11++) {
            if (com.google.common.base.q.a(obj, Z(i11))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f16077h;
        if (set == null) {
            Set<Map.Entry<K, V>> u11 = u();
            this.f16077h = u11;
            return u11;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> z11 = z();
        if (z11 != null) {
            return z11.get(obj);
        }
        int G = G(obj);
        if (G == -1) {
            return null;
        }
        p(G);
        return Z(G);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f16076g;
        if (set == null) {
            Set<K> w11 = w();
            this.f16076g = w11;
            return w11;
        }
        return set;
    }

    void p(int i11) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k11, V v11) {
        int U;
        int i11;
        if (M()) {
            r();
        }
        Map<K, V> z11 = z();
        if (z11 != null) {
            return z11.put(k11, v11);
        }
        int[] O = O();
        Object[] P = P();
        Object[] R = R();
        int i12 = this.f16075f;
        int i13 = i12 + 1;
        int c11 = o.c(k11);
        int E = E();
        int i14 = c11 & E;
        int h11 = k.h(Q(), i14);
        if (h11 != 0) {
            int b11 = k.b(c11, E);
            int i15 = 0;
            while (true) {
                int i16 = h11 - 1;
                int i17 = O[i16];
                if (k.b(i17, E) == b11 && com.google.common.base.q.a(k11, P[i16])) {
                    V v12 = (V) R[i16];
                    R[i16] = v11;
                    p(i16);
                    return v12;
                }
                int c12 = k.c(i17, E);
                i15++;
                if (c12 != 0) {
                    h11 = c12;
                } else if (i15 >= 9) {
                    return s().put(k11, v11);
                } else {
                    if (i13 > E) {
                        U = U(E, k.e(E), c11, i12);
                    } else {
                        O[i16] = k.d(i17, i13, E);
                    }
                }
            }
        } else if (i13 > E) {
            U = U(E, k.e(E), c11, i12);
            i11 = U;
        } else {
            k.i(Q(), i14, i13);
            i11 = E;
        }
        T(i13);
        I(i12, k11, v11, c11, i11);
        this.f16075f = i13;
        F();
        return null;
    }

    int q(int i11, int i12) {
        return i11 - 1;
    }

    int r() {
        com.google.common.base.u.v(M(), "Arrays already allocated");
        int i11 = this.f16074e;
        int j11 = k.j(i11);
        this.f16070a = k.a(j11);
        W(j11 - 1);
        this.f16071b = new int[i11];
        this.f16072c = new Object[i11];
        this.f16073d = new Object[i11];
        return i11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> z11 = z();
        if (z11 != null) {
            return z11.remove(obj);
        }
        V v11 = (V) N(obj);
        if (v11 == f16069j) {
            return null;
        }
        return v11;
    }

    Map<K, V> s() {
        Map<K, V> v11 = v(E() + 1);
        int C = C();
        while (C >= 0) {
            v11.put(J(C), Z(C));
            C = D(C);
        }
        this.f16070a = v11;
        this.f16071b = null;
        this.f16072c = null;
        this.f16073d = null;
        F();
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> z11 = z();
        return z11 != null ? z11.size() : this.f16075f;
    }

    Set<Map.Entry<K, V>> u() {
        return new d();
    }

    Map<K, V> v(int i11) {
        return new LinkedHashMap(i11, 1.0f);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f16078i;
        if (collection == null) {
            Collection<V> x11 = x();
            this.f16078i = x11;
            return x11;
        }
        return collection;
    }

    Set<K> w() {
        return new f();
    }

    Collection<V> x() {
        return new h();
    }

    Map<K, V> z() {
        Object obj = this.f16070a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    j(int i11) {
        H(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public abstract class e<T> implements Iterator<T> {

        /* renamed from: a */
        int f16083a;

        /* renamed from: b */
        int f16084b;

        /* renamed from: c */
        int f16085c;

        private e() {
            j.this = r2;
            this.f16083a = r2.f16074e;
            this.f16084b = r2.C();
            this.f16085c = -1;
        }

        private void a() {
            if (j.this.f16074e != this.f16083a) {
                throw new ConcurrentModificationException();
            }
        }

        abstract T b(int i11);

        void c() {
            this.f16083a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16084b >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (hasNext()) {
                int i11 = this.f16084b;
                this.f16085c = i11;
                T b11 = b(i11);
                this.f16084b = j.this.D(this.f16084b);
                return b11;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            com.google.common.collect.h.c(this.f16085c >= 0);
            c();
            j jVar = j.this;
            jVar.remove(jVar.J(this.f16085c));
            this.f16084b = j.this.q(this.f16084b, this.f16085c);
            this.f16085c = -1;
        }

        /* synthetic */ e(j jVar, a aVar) {
            this();
        }
    }
}