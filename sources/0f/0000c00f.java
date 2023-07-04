package xz;

import i00.e;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import m00.l;
import wz.o;

/* loaded from: classes5.dex */
public final class d<K, V> implements Map<K, V>, Serializable, i00.e {

    /* renamed from: m */
    private static final a f57772m = new a(null);

    /* renamed from: a */
    private K[] f57773a;

    /* renamed from: b */
    private V[] f57774b;

    /* renamed from: c */
    private int[] f57775c;

    /* renamed from: d */
    private int[] f57776d;

    /* renamed from: e */
    private int f57777e;

    /* renamed from: f */
    private int f57778f;

    /* renamed from: g */
    private int f57779g;

    /* renamed from: h */
    private int f57780h;

    /* renamed from: i */
    private xz.f<K> f57781i;

    /* renamed from: j */
    private g<V> f57782j;

    /* renamed from: k */
    private xz.e<K, V> f57783k;

    /* renamed from: l */
    private boolean f57784l;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int c(int i11) {
            int d11;
            d11 = l.d(i11, 1);
            return Integer.highestOneBit(d11 * 3);
        }

        public final int d(int i11) {
            return Integer.numberOfLeadingZeros(i11) + 1;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b<K, V> extends C1311d<K, V> implements Iterator<Map.Entry<K, V>>, i00.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d<K, V> map) {
            super(map);
            s.g(map, "map");
        }

        @Override // java.util.Iterator
        /* renamed from: i */
        public c<K, V> next() {
            if (a() < ((d) c()).f57778f) {
                int a11 = a();
                f(a11 + 1);
                h(a11);
                c<K, V> cVar = new c<>(c(), b());
                e();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void j(StringBuilder sb2) {
            s.g(sb2, "sb");
            if (a() < ((d) c()).f57778f) {
                int a11 = a();
                f(a11 + 1);
                h(a11);
                Object obj = ((d) c()).f57773a[b()];
                if (s.c(obj, c())) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj);
                }
                sb2.append('=');
                Object[] objArr = ((d) c()).f57774b;
                s.e(objArr);
                Object obj2 = objArr[b()];
                if (s.c(obj2, c())) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj2);
                }
                e();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int k() {
            if (a() < ((d) c()).f57778f) {
                int a11 = a();
                f(a11 + 1);
                h(a11);
                Object obj = ((d) c()).f57773a[b()];
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object[] objArr = ((d) c()).f57774b;
                s.e(objArr);
                Object obj2 = objArr[b()];
                int hashCode2 = hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
                e();
                return hashCode2;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes5.dex */
    public static final class c<K, V> implements Map.Entry<K, V>, e.a {

        /* renamed from: a */
        private final d<K, V> f57785a;

        /* renamed from: b */
        private final int f57786b;

        public c(d<K, V> map, int i11) {
            s.g(map, "map");
            this.f57785a = map;
            this.f57786b = i11;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (s.c(entry.getKey(), getKey()) && s.c(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((d) this.f57785a).f57773a[this.f57786b];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((d) this.f57785a).f57774b;
            s.e(objArr);
            return (V) objArr[this.f57786b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            this.f57785a.m();
            Object[] j11 = this.f57785a.j();
            int i11 = this.f57786b;
            V v12 = (V) j11[i11];
            j11[i11] = v11;
            return v12;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* renamed from: xz.d$d */
    /* loaded from: classes5.dex */
    public static class C1311d<K, V> {

        /* renamed from: a */
        private final d<K, V> f57787a;

        /* renamed from: b */
        private int f57788b;

        /* renamed from: c */
        private int f57789c;

        public C1311d(d<K, V> map) {
            s.g(map, "map");
            this.f57787a = map;
            this.f57789c = -1;
            e();
        }

        public final int a() {
            return this.f57788b;
        }

        public final int b() {
            return this.f57789c;
        }

        public final d<K, V> c() {
            return this.f57787a;
        }

        public final void e() {
            while (this.f57788b < ((d) this.f57787a).f57778f) {
                int[] iArr = ((d) this.f57787a).f57775c;
                int i11 = this.f57788b;
                if (iArr[i11] >= 0) {
                    return;
                }
                this.f57788b = i11 + 1;
            }
        }

        public final void f(int i11) {
            this.f57788b = i11;
        }

        public final void h(int i11) {
            this.f57789c = i11;
        }

        public final boolean hasNext() {
            return this.f57788b < ((d) this.f57787a).f57778f;
        }

        public final void remove() {
            if (this.f57789c != -1) {
                this.f57787a.m();
                this.f57787a.M(this.f57789c);
                this.f57789c = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* loaded from: classes5.dex */
    public static final class e<K, V> extends C1311d<K, V> implements Iterator<K>, i00.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d<K, V> map) {
            super(map);
            s.g(map, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            if (a() < ((d) c()).f57778f) {
                int a11 = a();
                f(a11 + 1);
                h(a11);
                K k11 = (K) ((d) c()).f57773a[b()];
                e();
                return k11;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes5.dex */
    public static final class f<K, V> extends C1311d<K, V> implements Iterator<V>, i00.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d<K, V> map) {
            super(map);
            s.g(map, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            if (a() < ((d) c()).f57778f) {
                int a11 = a();
                f(a11 + 1);
                h(a11);
                Object[] objArr = ((d) c()).f57774b;
                s.e(objArr);
                V v11 = (V) objArr[b()];
                e();
                return v11;
            }
            throw new NoSuchElementException();
        }
    }

    private d(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i11, int i12) {
        this.f57773a = kArr;
        this.f57774b = vArr;
        this.f57775c = iArr;
        this.f57776d = iArr2;
        this.f57777e = i11;
        this.f57778f = i12;
        this.f57779g = f57772m.d(y());
    }

    private final int C(K k11) {
        return ((k11 != null ? k11.hashCode() : 0) * (-1640531527)) >>> this.f57779g;
    }

    private final boolean E(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z11 = false;
        if (collection.isEmpty()) {
            return false;
        }
        s(collection.size());
        for (Map.Entry<? extends K, ? extends V> entry : collection) {
            if (F(entry)) {
                z11 = true;
            }
        }
        return z11;
    }

    private final boolean F(Map.Entry<? extends K, ? extends V> entry) {
        int i11 = i(entry.getKey());
        V[] j11 = j();
        if (i11 >= 0) {
            j11[i11] = entry.getValue();
            return true;
        }
        int i12 = (-i11) - 1;
        if (s.c(entry.getValue(), j11[i12])) {
            return false;
        }
        j11[i12] = entry.getValue();
        return true;
    }

    private final boolean G(int i11) {
        int C = C(this.f57773a[i11]);
        int i12 = this.f57777e;
        while (true) {
            int[] iArr = this.f57776d;
            if (iArr[C] == 0) {
                iArr[C] = i11 + 1;
                this.f57775c[i11] = C;
                return true;
            }
            i12--;
            if (i12 < 0) {
                return false;
            }
            C = C == 0 ? y() - 1 : C - 1;
        }
    }

    private final void H(int i11) {
        if (this.f57778f > size()) {
            n();
        }
        int i12 = 0;
        if (i11 != y()) {
            this.f57776d = new int[i11];
            this.f57779g = f57772m.d(i11);
        } else {
            o.s(this.f57776d, 0, 0, y());
        }
        while (i12 < this.f57778f) {
            int i13 = i12 + 1;
            if (!G(i12)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i12 = i13;
        }
    }

    private final void K(int i11) {
        int i12;
        i12 = l.i(this.f57777e * 2, y() / 2);
        int i13 = i12;
        int i14 = 0;
        int i15 = i11;
        do {
            i11 = i11 == 0 ? y() - 1 : i11 - 1;
            i14++;
            if (i14 > this.f57777e) {
                this.f57776d[i15] = 0;
                return;
            }
            int[] iArr = this.f57776d;
            int i16 = iArr[i11];
            if (i16 == 0) {
                iArr[i15] = 0;
                return;
            }
            if (i16 < 0) {
                iArr[i15] = -1;
            } else {
                int i17 = i16 - 1;
                if (((C(this.f57773a[i17]) - i11) & (y() - 1)) >= i14) {
                    this.f57776d[i15] = i16;
                    this.f57775c[i17] = i15;
                }
                i13--;
            }
            i15 = i11;
            i14 = 0;
            i13--;
        } while (i13 >= 0);
        this.f57776d[i15] = -1;
    }

    public final void M(int i11) {
        xz.c.f(this.f57773a, i11);
        K(this.f57775c[i11]);
        this.f57775c[i11] = -1;
        this.f57780h = size() - 1;
    }

    public final V[] j() {
        V[] vArr = this.f57774b;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) xz.c.d(w());
        this.f57774b = vArr2;
        return vArr2;
    }

    private final void n() {
        int i11;
        V[] vArr = this.f57774b;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i11 = this.f57778f;
            if (i12 >= i11) {
                break;
            }
            if (this.f57775c[i12] >= 0) {
                K[] kArr = this.f57773a;
                kArr[i13] = kArr[i12];
                if (vArr != null) {
                    vArr[i13] = vArr[i12];
                }
                i13++;
            }
            i12++;
        }
        xz.c.g(this.f57773a, i13, i11);
        if (vArr != null) {
            xz.c.g(vArr, i13, this.f57778f);
        }
        this.f57778f = i13;
    }

    private final boolean q(Map<?, ?> map) {
        return size() == map.size() && o(map.entrySet());
    }

    private final void r(int i11) {
        if (i11 >= 0) {
            if (i11 > w()) {
                int w11 = (w() * 3) / 2;
                if (i11 <= w11) {
                    i11 = w11;
                }
                this.f57773a = (K[]) xz.c.e(this.f57773a, i11);
                V[] vArr = this.f57774b;
                this.f57774b = vArr != null ? (V[]) xz.c.e(vArr, i11) : null;
                int[] copyOf = Arrays.copyOf(this.f57775c, i11);
                s.f(copyOf, "copyOf(this, newSize)");
                this.f57775c = copyOf;
                int c11 = f57772m.c(i11);
                if (c11 > y()) {
                    H(c11);
                    return;
                }
                return;
            } else if ((this.f57778f + i11) - size() > w()) {
                H(y());
                return;
            } else {
                return;
            }
        }
        throw new OutOfMemoryError();
    }

    private final void s(int i11) {
        r(this.f57778f + i11);
    }

    private final int u(K k11) {
        int C = C(k11);
        int i11 = this.f57777e;
        while (true) {
            int i12 = this.f57776d[C];
            if (i12 == 0) {
                return -1;
            }
            if (i12 > 0) {
                int i13 = i12 - 1;
                if (s.c(this.f57773a[i13], k11)) {
                    return i13;
                }
            }
            i11--;
            if (i11 < 0) {
                return -1;
            }
            C = C == 0 ? y() - 1 : C - 1;
        }
    }

    private final int v(V v11) {
        int i11 = this.f57778f;
        while (true) {
            i11--;
            if (i11 < 0) {
                return -1;
            }
            if (this.f57775c[i11] >= 0) {
                V[] vArr = this.f57774b;
                s.e(vArr);
                if (s.c(vArr[i11], v11)) {
                    return i11;
                }
            }
        }
    }

    private final int w() {
        return this.f57773a.length;
    }

    private final int y() {
        return this.f57776d.length;
    }

    public int A() {
        return this.f57780h;
    }

    public Collection<V> B() {
        g<V> gVar = this.f57782j;
        if (gVar == null) {
            g<V> gVar2 = new g<>(this);
            this.f57782j = gVar2;
            return gVar2;
        }
        return gVar;
    }

    public final e<K, V> D() {
        return new e<>(this);
    }

    public final boolean I(Map.Entry<? extends K, ? extends V> entry) {
        s.g(entry, "entry");
        m();
        int u11 = u(entry.getKey());
        if (u11 < 0) {
            return false;
        }
        V[] vArr = this.f57774b;
        s.e(vArr);
        if (s.c(vArr[u11], entry.getValue())) {
            M(u11);
            return true;
        }
        return false;
    }

    public final int L(K k11) {
        m();
        int u11 = u(k11);
        if (u11 < 0) {
            return -1;
        }
        M(u11);
        return u11;
    }

    public final boolean N(V v11) {
        m();
        int v12 = v(v11);
        if (v12 < 0) {
            return false;
        }
        M(v12);
        return true;
    }

    public final f<K, V> O() {
        return new f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        m();
        int i11 = this.f57778f - 1;
        if (i11 >= 0) {
            int i12 = 0;
            while (true) {
                int[] iArr = this.f57775c;
                int i13 = iArr[i12];
                if (i13 >= 0) {
                    this.f57776d[i13] = 0;
                    iArr[i12] = -1;
                }
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        xz.c.g(this.f57773a, 0, this.f57778f);
        V[] vArr = this.f57774b;
        if (vArr != null) {
            xz.c.g(vArr, 0, this.f57778f);
        }
        this.f57780h = 0;
        this.f57778f = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return u(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return v(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return x();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && q((Map) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        int u11 = u(obj);
        if (u11 < 0) {
            return null;
        }
        V[] vArr = this.f57774b;
        s.e(vArr);
        return vArr[u11];
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> t11 = t();
        int i11 = 0;
        while (t11.hasNext()) {
            i11 += t11.k();
        }
        return i11;
    }

    public final int i(K k11) {
        int i11;
        m();
        while (true) {
            int C = C(k11);
            i11 = l.i(this.f57777e * 2, y() / 2);
            int i12 = 0;
            while (true) {
                int i13 = this.f57776d[C];
                if (i13 <= 0) {
                    if (this.f57778f >= w()) {
                        s(1);
                    } else {
                        int i14 = this.f57778f;
                        int i15 = i14 + 1;
                        this.f57778f = i15;
                        this.f57773a[i14] = k11;
                        this.f57775c[i14] = C;
                        this.f57776d[C] = i15;
                        this.f57780h = size() + 1;
                        if (i12 > this.f57777e) {
                            this.f57777e = i12;
                        }
                        return i14;
                    }
                } else if (s.c(this.f57773a[i13 - 1], k11)) {
                    return -i13;
                } else {
                    i12++;
                    if (i12 > i11) {
                        H(y() * 2);
                        break;
                    }
                    C = C == 0 ? y() - 1 : C - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final Map<K, V> k() {
        m();
        this.f57784l = true;
        return this;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return z();
    }

    public final void m() {
        if (this.f57784l) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean o(Collection<?> m11) {
        s.g(m11, "m");
        for (Object obj : m11) {
            if (obj != null) {
                try {
                    if (!p((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean p(Map.Entry<? extends K, ? extends V> entry) {
        s.g(entry, "entry");
        int u11 = u(entry.getKey());
        if (u11 < 0) {
            return false;
        }
        V[] vArr = this.f57774b;
        s.e(vArr);
        return s.c(vArr[u11], entry.getValue());
    }

    @Override // java.util.Map
    public V put(K k11, V v11) {
        m();
        int i11 = i(k11);
        V[] j11 = j();
        if (i11 < 0) {
            int i12 = (-i11) - 1;
            V v12 = j11[i12];
            j11[i12] = v11;
            return v12;
        }
        j11[i11] = v11;
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        s.g(from, "from");
        m();
        E(from.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object obj) {
        int L = L(obj);
        if (L < 0) {
            return null;
        }
        V[] vArr = this.f57774b;
        s.e(vArr);
        V v11 = vArr[L];
        xz.c.f(vArr, L);
        return v11;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return A();
    }

    public final b<K, V> t() {
        return new b<>(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b<K, V> t11 = t();
        int i11 = 0;
        while (t11.hasNext()) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            t11.j(sb2);
            i11++;
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        s.f(sb3, "sb.toString()");
        return sb3;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return B();
    }

    public Set<Map.Entry<K, V>> x() {
        xz.e<K, V> eVar = this.f57783k;
        if (eVar == null) {
            xz.e<K, V> eVar2 = new xz.e<>(this);
            this.f57783k = eVar2;
            return eVar2;
        }
        return eVar;
    }

    public Set<K> z() {
        xz.f<K> fVar = this.f57781i;
        if (fVar == null) {
            xz.f<K> fVar2 = new xz.f<>(this);
            this.f57781i = fVar2;
            return fVar2;
        }
        return fVar;
    }

    public d() {
        this(8);
    }

    public d(int i11) {
        this(xz.c.d(i11), null, new int[i11], new int[f57772m.c(i11)], 2, 0);
    }
}