package g1;

import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class t<K, V> {

    /* renamed from: e */
    public static final a f27337e = new a(null);

    /* renamed from: f */
    private static final t f27338f = new t(0, 0, new Object[0]);

    /* renamed from: a */
    private int f27339a;

    /* renamed from: b */
    private int f27340b;

    /* renamed from: c */
    private final i1.e f27341c;

    /* renamed from: d */
    private Object[] f27342d;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t a() {
            return t.f27338f;
        }
    }

    /* loaded from: classes.dex */
    public static final class b<K, V> {

        /* renamed from: a */
        private t<K, V> f27343a;

        /* renamed from: b */
        private final int f27344b;

        public b(t<K, V> node, int i11) {
            kotlin.jvm.internal.s.g(node, "node");
            this.f27343a = node;
            this.f27344b = i11;
        }

        public final t<K, V> a() {
            return this.f27343a;
        }

        public final int b() {
            return this.f27344b;
        }

        public final void c(t<K, V> tVar) {
            kotlin.jvm.internal.s.g(tVar, "<set-?>");
            this.f27343a = tVar;
        }
    }

    public t(int i11, int i12, Object[] buffer, i1.e eVar) {
        kotlin.jvm.internal.s.g(buffer, "buffer");
        this.f27339a = i11;
        this.f27340b = i12;
        this.f27341c = eVar;
        this.f27342d = buffer;
    }

    private final t<K, V> A(int i11, f<K, V> fVar) {
        Object[] h11;
        Object[] h12;
        fVar.n(fVar.size() - 1);
        fVar.m(W(i11));
        if (this.f27342d.length == 2) {
            return null;
        }
        if (this.f27341c == fVar.j()) {
            h12 = x.h(this.f27342d, i11);
            this.f27342d = h12;
            return this;
        }
        h11 = x.h(this.f27342d, i11);
        return new t<>(0, 0, h11, fVar.j());
    }

    private final t<K, V> B(int i11, K k11, V v11, i1.e eVar) {
        Object[] g11;
        Object[] g12;
        int n11 = n(i11);
        if (this.f27341c == eVar) {
            g12 = x.g(this.f27342d, n11, k11, v11);
            this.f27342d = g12;
            this.f27339a = i11 | this.f27339a;
            return this;
        }
        g11 = x.g(this.f27342d, n11, k11, v11);
        return new t<>(i11 | this.f27339a, this.f27340b, g11, eVar);
    }

    private final t<K, V> C(int i11, int i12, int i13, K k11, V v11, int i14, i1.e eVar) {
        if (this.f27341c == eVar) {
            this.f27342d = d(i11, i12, i13, k11, v11, i14, eVar);
            this.f27339a ^= i12;
            this.f27340b |= i12;
            return this;
        }
        return new t<>(this.f27339a ^ i12, i12 | this.f27340b, d(i11, i12, i13, k11, v11, i14, eVar), eVar);
    }

    private final t<K, V> F(t<K, V> tVar, int i11, int i12, i1.b bVar, f<K, V> fVar) {
        if (r(i11)) {
            t<K, V> N = N(O(i11));
            if (tVar.r(i11)) {
                return N.E(tVar.N(tVar.O(i11)), i12 + 5, bVar, fVar);
            }
            if (tVar.q(i11)) {
                int n11 = tVar.n(i11);
                K t11 = tVar.t(n11);
                V W = tVar.W(n11);
                int size = fVar.size();
                t<K, V> D = N.D(t11 != null ? t11.hashCode() : 0, t11, W, i12 + 5, fVar);
                if (fVar.size() == size) {
                    bVar.c(bVar.a() + 1);
                    return D;
                }
                return D;
            }
            return N;
        } else if (tVar.r(i11)) {
            t<K, V> N2 = tVar.N(tVar.O(i11));
            if (q(i11)) {
                int n12 = n(i11);
                K t12 = t(n12);
                int i13 = i12 + 5;
                if (!N2.k(t12 == null ? 0 : t12.hashCode(), t12, i13)) {
                    return N2.D(t12 != null ? t12.hashCode() : 0, t12, W(n12), i13, fVar);
                }
                bVar.c(bVar.a() + 1);
            }
            return N2;
        } else {
            int n13 = n(i11);
            K t13 = t(n13);
            V W2 = W(n13);
            int n14 = tVar.n(i11);
            K t14 = tVar.t(n14);
            return u(t13 == null ? 0 : t13.hashCode(), t13, W2, t14 != null ? t14.hashCode() : 0, t14, tVar.W(n14), i12 + 5, fVar.j());
        }
    }

    private final t<K, V> I(int i11, int i12, f<K, V> fVar) {
        Object[] h11;
        Object[] h12;
        fVar.n(fVar.size() - 1);
        fVar.m(W(i11));
        if (this.f27342d.length == 2) {
            return null;
        }
        if (this.f27341c == fVar.j()) {
            h12 = x.h(this.f27342d, i11);
            this.f27342d = h12;
            this.f27339a ^= i12;
            return this;
        }
        h11 = x.h(this.f27342d, i11);
        return new t<>(i12 ^ this.f27339a, this.f27340b, h11, fVar.j());
    }

    private final t<K, V> J(int i11, int i12, i1.e eVar) {
        Object[] i13;
        Object[] i14;
        Object[] objArr = this.f27342d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f27341c == eVar) {
            i14 = x.i(objArr, i11);
            this.f27342d = i14;
            this.f27340b ^= i12;
            return this;
        }
        i13 = x.i(objArr, i11);
        return new t<>(this.f27339a, i12 ^ this.f27340b, i13, eVar);
    }

    private final t<K, V> K(t<K, V> tVar, t<K, V> tVar2, int i11, int i12, i1.e eVar) {
        if (tVar2 == null) {
            return J(i11, i12, eVar);
        }
        return (this.f27341c == eVar || tVar != tVar2) ? L(i11, tVar2, eVar) : this;
    }

    private final t<K, V> L(int i11, t<K, V> tVar, i1.e eVar) {
        Object[] objArr = this.f27342d;
        if (objArr.length == 1 && tVar.f27342d.length == 2 && tVar.f27340b == 0) {
            tVar.f27339a = this.f27340b;
            return tVar;
        } else if (this.f27341c == eVar) {
            objArr[i11] = tVar;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.s.f(copyOf, "copyOf(this, size)");
            copyOf[i11] = tVar;
            return new t<>(this.f27339a, this.f27340b, copyOf, eVar);
        }
    }

    private final t<K, V> M(int i11, V v11, f<K, V> fVar) {
        if (this.f27341c == fVar.j()) {
            this.f27342d[i11 + 1] = v11;
            return this;
        }
        fVar.k(fVar.h() + 1);
        Object[] objArr = this.f27342d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.s.f(copyOf, "copyOf(this, size)");
        copyOf[i11 + 1] = v11;
        return new t<>(this.f27339a, this.f27340b, copyOf, fVar.j());
    }

    private final t<K, V> R(int i11, int i12) {
        Object[] h11;
        Object[] objArr = this.f27342d;
        if (objArr.length == 2) {
            return null;
        }
        h11 = x.h(objArr, i11);
        return new t<>(i12 ^ this.f27339a, this.f27340b, h11);
    }

    private final t<K, V> S(int i11, int i12) {
        Object[] i13;
        Object[] objArr = this.f27342d;
        if (objArr.length == 1) {
            return null;
        }
        i13 = x.i(objArr, i11);
        return new t<>(this.f27339a, i12 ^ this.f27340b, i13);
    }

    private final t<K, V> T(t<K, V> tVar, t<K, V> tVar2, int i11, int i12) {
        if (tVar2 == null) {
            return S(i11, i12);
        }
        return tVar != tVar2 ? U(i11, i12, tVar2) : this;
    }

    private final t<K, V> U(int i11, int i12, t<K, V> tVar) {
        Object[] k11;
        Object[] objArr = tVar.f27342d;
        if (objArr.length == 2 && tVar.f27340b == 0) {
            if (this.f27342d.length == 1) {
                tVar.f27339a = this.f27340b;
                return tVar;
            }
            k11 = x.k(this.f27342d, i11, n(i12), objArr[0], objArr[1]);
            return new t<>(this.f27339a ^ i12, i12 ^ this.f27340b, k11);
        }
        Object[] objArr2 = this.f27342d;
        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
        kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
        copyOf[i11] = tVar;
        return new t<>(this.f27339a, this.f27340b, copyOf);
    }

    private final t<K, V> V(int i11, V v11) {
        Object[] objArr = this.f27342d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.s.f(copyOf, "copyOf(this, size)");
        copyOf[i11 + 1] = v11;
        return new t<>(this.f27339a, this.f27340b, copyOf);
    }

    private final V W(int i11) {
        return (V) this.f27342d[i11 + 1];
    }

    private final b<K, V> b() {
        return new b<>(this, 1);
    }

    private final b<K, V> c() {
        return new b<>(this, 0);
    }

    private final Object[] d(int i11, int i12, int i13, K k11, V v11, int i14, i1.e eVar) {
        Object[] j11;
        K t11 = t(i11);
        j11 = x.j(this.f27342d, i11, O(i12) + 1, u(t11 == null ? 0 : t11.hashCode(), t11, W(i11), i13, k11, v11, i14 + 5, eVar));
        return j11;
    }

    private final int e() {
        if (this.f27340b == 0) {
            return this.f27342d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f27339a);
        int length = this.f27342d.length;
        for (int i11 = bitCount * 2; i11 < length; i11++) {
            bitCount += N(i11).e();
        }
        return bitCount;
    }

    private final boolean f(K k11) {
        m00.i r11;
        m00.g q11;
        r11 = m00.l.r(0, this.f27342d.length);
        q11 = m00.l.q(r11, 2);
        int c11 = q11.c();
        int e11 = q11.e();
        int f11 = q11.f();
        if ((f11 > 0 && c11 <= e11) || (f11 < 0 && e11 <= c11)) {
            while (true) {
                int i11 = c11 + f11;
                if (kotlin.jvm.internal.s.c(k11, this.f27342d[c11])) {
                    return true;
                }
                if (c11 == e11) {
                    break;
                }
                c11 = i11;
            }
        }
        return false;
    }

    private final V g(K k11) {
        m00.i r11;
        m00.g q11;
        r11 = m00.l.r(0, this.f27342d.length);
        q11 = m00.l.q(r11, 2);
        int c11 = q11.c();
        int e11 = q11.e();
        int f11 = q11.f();
        if ((f11 <= 0 || c11 > e11) && (f11 >= 0 || e11 > c11)) {
            return null;
        }
        while (true) {
            int i11 = c11 + f11;
            if (kotlin.jvm.internal.s.c(k11, t(c11))) {
                return W(c11);
            }
            if (c11 == e11) {
                return null;
            }
            c11 = i11;
        }
    }

    private final b<K, V> h(K k11, V v11) {
        m00.i r11;
        m00.g q11;
        Object[] g11;
        r11 = m00.l.r(0, this.f27342d.length);
        q11 = m00.l.q(r11, 2);
        int c11 = q11.c();
        int e11 = q11.e();
        int f11 = q11.f();
        if ((f11 > 0 && c11 <= e11) || (f11 < 0 && e11 <= c11)) {
            while (true) {
                int i11 = c11 + f11;
                if (kotlin.jvm.internal.s.c(k11, t(c11))) {
                    if (v11 == W(c11)) {
                        return null;
                    }
                    Object[] objArr = this.f27342d;
                    Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                    kotlin.jvm.internal.s.f(copyOf, "copyOf(this, size)");
                    copyOf[c11 + 1] = v11;
                    return new t(0, 0, copyOf).c();
                } else if (c11 == e11) {
                    break;
                } else {
                    c11 = i11;
                }
            }
        }
        g11 = x.g(this.f27342d, 0, k11, v11);
        return new t(0, 0, g11).b();
    }

    private final t<K, V> i(K k11) {
        m00.i r11;
        m00.g q11;
        r11 = m00.l.r(0, this.f27342d.length);
        q11 = m00.l.q(r11, 2);
        int c11 = q11.c();
        int e11 = q11.e();
        int f11 = q11.f();
        if ((f11 > 0 && c11 <= e11) || (f11 < 0 && e11 <= c11)) {
            while (true) {
                int i11 = c11 + f11;
                if (kotlin.jvm.internal.s.c(k11, t(c11))) {
                    return j(c11);
                }
                if (c11 == e11) {
                    break;
                }
                c11 = i11;
            }
        }
        return this;
    }

    private final t<K, V> j(int i11) {
        Object[] h11;
        Object[] objArr = this.f27342d;
        if (objArr.length == 2) {
            return null;
        }
        h11 = x.h(objArr, i11);
        return new t<>(0, 0, h11);
    }

    private final boolean l(t<K, V> tVar) {
        if (this == tVar) {
            return true;
        }
        if (this.f27340b == tVar.f27340b && this.f27339a == tVar.f27339a) {
            int length = this.f27342d.length;
            int i11 = 0;
            while (i11 < length) {
                int i12 = i11 + 1;
                if (this.f27342d[i11] != tVar.f27342d[i11]) {
                    return false;
                }
                i11 = i12;
            }
            return true;
        }
        return false;
    }

    private final boolean r(int i11) {
        return (i11 & this.f27340b) != 0;
    }

    private final t<K, V> s(int i11, K k11, V v11) {
        Object[] g11;
        g11 = x.g(this.f27342d, n(i11), k11, v11);
        return new t<>(i11 | this.f27339a, this.f27340b, g11);
    }

    private final K t(int i11) {
        return (K) this.f27342d[i11];
    }

    private final t<K, V> u(int i11, K k11, V v11, int i12, K k12, V v12, int i13, i1.e eVar) {
        if (i13 > 30) {
            return new t<>(0, 0, new Object[]{k11, v11, k12, v12}, eVar);
        }
        int f11 = x.f(i11, i13);
        int f12 = x.f(i12, i13);
        if (f11 != f12) {
            return new t<>((1 << f11) | (1 << f12), 0, f11 < f12 ? new Object[]{k11, v11, k12, v12} : new Object[]{k12, v12, k11, v11}, eVar);
        }
        return new t<>(0, 1 << f11, new Object[]{u(i11, k11, v11, i12, k12, v12, i13 + 5, eVar)}, eVar);
    }

    private final t<K, V> v(int i11, int i12, int i13, K k11, V v11, int i14) {
        return new t<>(this.f27339a ^ i12, i12 | this.f27340b, d(i11, i12, i13, k11, v11, i14, null));
    }

    private final t<K, V> w(K k11, V v11, f<K, V> fVar) {
        m00.i r11;
        m00.g q11;
        Object[] g11;
        r11 = m00.l.r(0, this.f27342d.length);
        q11 = m00.l.q(r11, 2);
        int c11 = q11.c();
        int e11 = q11.e();
        int f11 = q11.f();
        if ((f11 > 0 && c11 <= e11) || (f11 < 0 && e11 <= c11)) {
            while (true) {
                int i11 = c11 + f11;
                if (kotlin.jvm.internal.s.c(k11, t(c11))) {
                    fVar.m(W(c11));
                    if (this.f27341c == fVar.j()) {
                        this.f27342d[c11 + 1] = v11;
                        return this;
                    }
                    fVar.k(fVar.h() + 1);
                    Object[] objArr = this.f27342d;
                    Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                    kotlin.jvm.internal.s.f(copyOf, "copyOf(this, size)");
                    copyOf[c11 + 1] = v11;
                    return new t<>(0, 0, copyOf, fVar.j());
                } else if (c11 == e11) {
                    break;
                } else {
                    c11 = i11;
                }
            }
        }
        fVar.n(fVar.size() + 1);
        g11 = x.g(this.f27342d, 0, k11, v11);
        return new t<>(0, 0, g11, fVar.j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final t<K, V> x(t<K, V> tVar, i1.b bVar, i1.e eVar) {
        m00.i r11;
        m00.g q11;
        i1.a.a(this.f27340b == 0);
        i1.a.a(this.f27339a == 0);
        i1.a.a(tVar.f27340b == 0);
        i1.a.a(tVar.f27339a == 0);
        Object[] objArr = this.f27342d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + tVar.f27342d.length);
        kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
        int length = this.f27342d.length;
        r11 = m00.l.r(0, tVar.f27342d.length);
        q11 = m00.l.q(r11, 2);
        int c11 = q11.c();
        int e11 = q11.e();
        int f11 = q11.f();
        if ((f11 > 0 && c11 <= e11) || (f11 < 0 && e11 <= c11)) {
            while (true) {
                int i11 = c11 + f11;
                if (!f(tVar.f27342d[c11])) {
                    Object[] objArr2 = tVar.f27342d;
                    copyOf[length] = objArr2[c11];
                    copyOf[length + 1] = objArr2[c11 + 1];
                    length += 2;
                } else {
                    bVar.c(bVar.a() + 1);
                }
                if (c11 == e11) {
                    break;
                }
                c11 = i11;
            }
        }
        if (length == this.f27342d.length) {
            return this;
        }
        if (length == tVar.f27342d.length) {
            return tVar;
        }
        if (length == copyOf.length) {
            return new t<>(0, 0, copyOf, eVar);
        }
        Object[] copyOf2 = Arrays.copyOf(copyOf, length);
        kotlin.jvm.internal.s.f(copyOf2, "copyOf(this, newSize)");
        return new t<>(0, 0, copyOf2, eVar);
    }

    private final t<K, V> y(K k11, f<K, V> fVar) {
        m00.i r11;
        m00.g q11;
        r11 = m00.l.r(0, this.f27342d.length);
        q11 = m00.l.q(r11, 2);
        int c11 = q11.c();
        int e11 = q11.e();
        int f11 = q11.f();
        if ((f11 > 0 && c11 <= e11) || (f11 < 0 && e11 <= c11)) {
            while (true) {
                int i11 = c11 + f11;
                if (kotlin.jvm.internal.s.c(k11, t(c11))) {
                    return A(c11, fVar);
                }
                if (c11 == e11) {
                    break;
                }
                c11 = i11;
            }
        }
        return this;
    }

    private final t<K, V> z(K k11, V v11, f<K, V> fVar) {
        m00.i r11;
        m00.g q11;
        r11 = m00.l.r(0, this.f27342d.length);
        q11 = m00.l.q(r11, 2);
        int c11 = q11.c();
        int e11 = q11.e();
        int f11 = q11.f();
        if ((f11 > 0 && c11 <= e11) || (f11 < 0 && e11 <= c11)) {
            while (true) {
                int i11 = c11 + f11;
                if (kotlin.jvm.internal.s.c(k11, t(c11)) && kotlin.jvm.internal.s.c(v11, W(c11))) {
                    return A(c11, fVar);
                }
                if (c11 == e11) {
                    break;
                }
                c11 = i11;
            }
        }
        return this;
    }

    public final t<K, V> D(int i11, K k11, V v11, int i12, f<K, V> mutator) {
        t<K, V> D;
        kotlin.jvm.internal.s.g(mutator, "mutator");
        int f11 = 1 << x.f(i11, i12);
        if (q(f11)) {
            int n11 = n(f11);
            if (kotlin.jvm.internal.s.c(k11, t(n11))) {
                mutator.m(W(n11));
                return W(n11) == v11 ? this : M(n11, v11, mutator);
            }
            mutator.n(mutator.size() + 1);
            return C(n11, f11, i11, k11, v11, i12, mutator.j());
        } else if (r(f11)) {
            int O = O(f11);
            t<K, V> N = N(O);
            if (i12 == 30) {
                D = N.w(k11, v11, mutator);
            } else {
                D = N.D(i11, k11, v11, i12 + 5, mutator);
            }
            return N == D ? this : L(O, D, mutator.j());
        } else {
            mutator.n(mutator.size() + 1);
            return B(f11, k11, v11, mutator.j());
        }
    }

    public final t<K, V> E(t<K, V> otherNode, int i11, i1.b intersectionCounter, f<K, V> mutator) {
        kotlin.jvm.internal.s.g(otherNode, "otherNode");
        kotlin.jvm.internal.s.g(intersectionCounter, "intersectionCounter");
        kotlin.jvm.internal.s.g(mutator, "mutator");
        if (this == otherNode) {
            intersectionCounter.b(e());
            return this;
        } else if (i11 > 30) {
            return x(otherNode, intersectionCounter, mutator.j());
        } else {
            int i12 = this.f27340b | otherNode.f27340b;
            int i13 = this.f27339a;
            int i14 = otherNode.f27339a;
            int i15 = i13 & i14;
            int i16 = (i13 ^ i14) & (~i12);
            while (i15 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i15);
                if (kotlin.jvm.internal.s.c(t(n(lowestOneBit)), otherNode.t(otherNode.n(lowestOneBit)))) {
                    i16 |= lowestOneBit;
                } else {
                    i12 |= lowestOneBit;
                }
                i15 ^= lowestOneBit;
            }
            int i17 = 0;
            if ((i12 & i16) == 0) {
                t<K, V> tVar = (kotlin.jvm.internal.s.c(this.f27341c, mutator.j()) && this.f27339a == i16 && this.f27340b == i12) ? this : new t<>(i16, i12, new Object[(Integer.bitCount(i16) * 2) + Integer.bitCount(i12)]);
                int i18 = i12;
                int i19 = 0;
                while (i18 != 0) {
                    int lowestOneBit2 = Integer.lowestOneBit(i18);
                    tVar.p()[(tVar.p().length - 1) - i19] = F(otherNode, lowestOneBit2, i11, intersectionCounter, mutator);
                    i19++;
                    i18 ^= lowestOneBit2;
                }
                while (i16 != 0) {
                    int lowestOneBit3 = Integer.lowestOneBit(i16);
                    int i21 = i17 * 2;
                    if (!otherNode.q(lowestOneBit3)) {
                        int n11 = n(lowestOneBit3);
                        tVar.p()[i21] = t(n11);
                        tVar.p()[i21 + 1] = W(n11);
                    } else {
                        int n12 = otherNode.n(lowestOneBit3);
                        tVar.p()[i21] = otherNode.t(n12);
                        tVar.p()[i21 + 1] = otherNode.W(n12);
                        if (q(lowestOneBit3)) {
                            intersectionCounter.c(intersectionCounter.a() + 1);
                        }
                    }
                    i17++;
                    i16 ^= lowestOneBit3;
                }
                return l(tVar) ? this : otherNode.l(tVar) ? otherNode : tVar;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final t<K, V> G(int i11, K k11, int i12, f<K, V> mutator) {
        t<K, V> G;
        kotlin.jvm.internal.s.g(mutator, "mutator");
        int f11 = 1 << x.f(i11, i12);
        if (q(f11)) {
            int n11 = n(f11);
            return kotlin.jvm.internal.s.c(k11, t(n11)) ? I(n11, f11, mutator) : this;
        } else if (r(f11)) {
            int O = O(f11);
            t<K, V> N = N(O);
            if (i12 == 30) {
                G = N.y(k11, mutator);
            } else {
                G = N.G(i11, k11, i12 + 5, mutator);
            }
            return K(N, G, O, f11, mutator.j());
        } else {
            return this;
        }
    }

    public final t<K, V> H(int i11, K k11, V v11, int i12, f<K, V> mutator) {
        t<K, V> H;
        kotlin.jvm.internal.s.g(mutator, "mutator");
        int f11 = 1 << x.f(i11, i12);
        if (q(f11)) {
            int n11 = n(f11);
            return (kotlin.jvm.internal.s.c(k11, t(n11)) && kotlin.jvm.internal.s.c(v11, W(n11))) ? I(n11, f11, mutator) : this;
        } else if (r(f11)) {
            int O = O(f11);
            t<K, V> N = N(O);
            if (i12 == 30) {
                H = N.z(k11, v11, mutator);
            } else {
                H = N.H(i11, k11, v11, i12 + 5, mutator);
            }
            return K(N, H, O, f11, mutator.j());
        } else {
            return this;
        }
    }

    public final t<K, V> N(int i11) {
        Object obj = this.f27342d[i11];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (t) obj;
    }

    public final int O(int i11) {
        return (this.f27342d.length - 1) - Integer.bitCount((i11 - 1) & this.f27340b);
    }

    public final b<K, V> P(int i11, K k11, V v11, int i12) {
        b<K, V> P;
        int f11 = 1 << x.f(i11, i12);
        if (q(f11)) {
            int n11 = n(f11);
            if (kotlin.jvm.internal.s.c(k11, t(n11))) {
                if (W(n11) == v11) {
                    return null;
                }
                return V(n11, v11).c();
            }
            return v(n11, f11, i11, k11, v11, i12).b();
        } else if (r(f11)) {
            int O = O(f11);
            t<K, V> N = N(O);
            if (i12 == 30) {
                P = N.h(k11, v11);
                if (P == null) {
                    return null;
                }
            } else {
                P = N.P(i11, k11, v11, i12 + 5);
                if (P == null) {
                    return null;
                }
            }
            P.c(U(O, f11, P.a()));
            return P;
        } else {
            return s(f11, k11, v11).b();
        }
    }

    public final t<K, V> Q(int i11, K k11, int i12) {
        t<K, V> Q;
        int f11 = 1 << x.f(i11, i12);
        if (q(f11)) {
            int n11 = n(f11);
            return kotlin.jvm.internal.s.c(k11, t(n11)) ? R(n11, f11) : this;
        } else if (r(f11)) {
            int O = O(f11);
            t<K, V> N = N(O);
            if (i12 == 30) {
                Q = N.i(k11);
            } else {
                Q = N.Q(i11, k11, i12 + 5);
            }
            return T(N, Q, O, f11);
        } else {
            return this;
        }
    }

    public final boolean k(int i11, K k11, int i12) {
        int f11 = 1 << x.f(i11, i12);
        if (q(f11)) {
            return kotlin.jvm.internal.s.c(k11, t(n(f11)));
        }
        if (r(f11)) {
            t<K, V> N = N(O(f11));
            if (i12 == 30) {
                return N.f(k11);
            }
            return N.k(i11, k11, i12 + 5);
        }
        return false;
    }

    public final int m() {
        return Integer.bitCount(this.f27339a);
    }

    public final int n(int i11) {
        return Integer.bitCount((i11 - 1) & this.f27339a) * 2;
    }

    public final V o(int i11, K k11, int i12) {
        int f11 = 1 << x.f(i11, i12);
        if (q(f11)) {
            int n11 = n(f11);
            if (kotlin.jvm.internal.s.c(k11, t(n11))) {
                return W(n11);
            }
            return null;
        } else if (r(f11)) {
            t<K, V> N = N(O(f11));
            if (i12 == 30) {
                return N.g(k11);
            }
            return N.o(i11, k11, i12 + 5);
        } else {
            return null;
        }
    }

    public final Object[] p() {
        return this.f27342d;
    }

    public final boolean q(int i11) {
        return (i11 & this.f27339a) != 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(int i11, int i12, Object[] buffer) {
        this(i11, i12, buffer, null);
        kotlin.jvm.internal.s.g(buffer, "buffer");
    }
}