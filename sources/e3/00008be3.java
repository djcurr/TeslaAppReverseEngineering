package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import net.time4j.engine.ChronoException;
import net.time4j.engine.f0;
import okhttp3.internal.http2.Http2Connection;

@net.time4j.format.c("iso8601")
/* loaded from: classes5.dex */
public final class i0 extends net.time4j.engine.i0<x, i0> implements net.time4j.base.a, net.time4j.base.g, net.time4j.engine.c0<x>, net.time4j.format.h {

    /* renamed from: c  reason: collision with root package name */
    private static final i0 f41416c;

    /* renamed from: d  reason: collision with root package name */
    private static final i0 f41417d;

    /* renamed from: e  reason: collision with root package name */
    private static final Map<Object, net.time4j.engine.p<?>> f41418e;

    /* renamed from: f  reason: collision with root package name */
    private static final net.time4j.engine.f0<x, i0> f41419f;
    private static final long serialVersionUID = 7458380065762437714L;

    /* renamed from: a  reason: collision with root package name */
    private final transient g0 f41420a;

    /* renamed from: b  reason: collision with root package name */
    private final transient h0 f41421b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41422a;

        static {
            int[] iArr = new int[h.values().length];
            f41422a = iArr;
            try {
                iArr[h.HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41422a[h.MINUTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41422a[h.SECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41422a[h.MILLIS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41422a[h.MICROS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41422a[h.NANOS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes5.dex */
    private static class c extends d<BigDecimal> {
        c(net.time4j.engine.p<BigDecimal> pVar) {
            super(pVar, null);
        }

        @Override // net.time4j.i0.d, net.time4j.engine.y
        /* renamed from: m */
        public boolean isValid(i0 i0Var, BigDecimal bigDecimal) {
            if (bigDecimal == null) {
                return false;
            }
            return ((BigDecimal) ((d) this).f41425a.getDefaultMinimum()).compareTo(bigDecimal) <= 0 && bigDecimal.compareTo((BigDecimal) ((d) this).f41425a.getDefaultMaximum()) <= 0;
        }

        @Override // net.time4j.i0.d, net.time4j.engine.y
        /* renamed from: n */
        public i0 withValue(i0 i0Var, BigDecimal bigDecimal, boolean z11) {
            if (isValid(i0Var, bigDecimal)) {
                return i0.Z(i0Var.f41420a, (h0) i0Var.f41421b.z(((d) this).f41425a, bigDecimal));
            }
            throw new IllegalArgumentException("Out of range: " + bigDecimal);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class d<V> implements net.time4j.engine.y<i0, V> {

        /* renamed from: a  reason: collision with root package name */
        private final net.time4j.engine.p<V> f41425a;

        /* synthetic */ d(net.time4j.engine.p pVar, a aVar) {
            this(pVar);
        }

        static <V> d<V> j(net.time4j.engine.p<V> pVar) {
            return new d<>(pVar);
        }

        private long k(V v11) {
            return ((Number) Number.class.cast(v11)).longValue();
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p<?> getChildAtCeiling(i0 i0Var) {
            return (net.time4j.engine.p) i0.f41418e.get(this.f41425a);
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public net.time4j.engine.p<?> getChildAtFloor(i0 i0Var) {
            return (net.time4j.engine.p) i0.f41418e.get(this.f41425a);
        }

        @Override // net.time4j.engine.y
        /* renamed from: f */
        public V getMaximum(i0 i0Var) {
            if (this.f41425a.isDateElement()) {
                return (V) i0Var.f41420a.e(this.f41425a);
            }
            if (this.f41425a.isTimeElement()) {
                return this.f41425a.getDefaultMaximum();
            }
            throw new ChronoException("Missing rule for: " + this.f41425a.name());
        }

        @Override // net.time4j.engine.y
        /* renamed from: g */
        public V getMinimum(i0 i0Var) {
            if (this.f41425a.isDateElement()) {
                return (V) i0Var.f41420a.f(this.f41425a);
            }
            if (this.f41425a.isTimeElement()) {
                return this.f41425a.getDefaultMinimum();
            }
            throw new ChronoException("Missing rule for: " + this.f41425a.name());
        }

        @Override // net.time4j.engine.y
        /* renamed from: h */
        public V getValue(i0 i0Var) {
            if (this.f41425a.isDateElement()) {
                return (V) i0Var.f41420a.l(this.f41425a);
            }
            if (this.f41425a.isTimeElement()) {
                return (V) i0Var.f41421b.l(this.f41425a);
            }
            throw new ChronoException("Missing rule for: " + this.f41425a.name());
        }

        @Override // net.time4j.engine.y
        /* renamed from: i */
        public boolean isValid(i0 i0Var, V v11) {
            if (v11 == null) {
                return false;
            }
            if (this.f41425a.isDateElement()) {
                return i0Var.f41420a.w(this.f41425a, v11);
            }
            if (this.f41425a.isTimeElement()) {
                if (Number.class.isAssignableFrom(this.f41425a.getType())) {
                    long k11 = k(this.f41425a.getDefaultMinimum());
                    long k12 = k(this.f41425a.getDefaultMaximum());
                    long k13 = k(v11);
                    return k11 <= k13 && k12 >= k13;
                } else if (this.f41425a.equals(h0.f41327o) && h0.f41326n.equals(v11)) {
                    return false;
                } else {
                    return i0Var.f41421b.w(this.f41425a, v11);
                }
            }
            throw new ChronoException("Missing rule for: " + this.f41425a.name());
        }

        @Override // net.time4j.engine.y
        /* renamed from: l */
        public i0 withValue(i0 i0Var, V v11, boolean z11) {
            if (v11 != null) {
                if (v11.equals(getValue(i0Var))) {
                    return i0Var;
                }
                if (z11) {
                    return i0Var.G(net.time4j.base.c.m(k(v11), k(getValue(i0Var))), (x) i0.f41419f.E(this.f41425a));
                } else if (this.f41425a.isDateElement()) {
                    return i0.Z((g0) i0Var.f41420a.z(this.f41425a, v11), i0Var.f41421b);
                } else {
                    if (this.f41425a.isTimeElement()) {
                        if (Number.class.isAssignableFrom(this.f41425a.getType())) {
                            long k11 = k(this.f41425a.getDefaultMinimum());
                            long k12 = k(this.f41425a.getDefaultMaximum());
                            long k13 = k(v11);
                            if (k11 > k13 || k12 < k13) {
                                throw new IllegalArgumentException("Out of range: " + v11);
                            }
                        } else if (this.f41425a.equals(h0.f41327o) && v11.equals(h0.f41326n)) {
                            throw new IllegalArgumentException("Out of range: " + v11);
                        }
                        return i0.Z(i0Var.f41420a, (h0) i0Var.f41421b.z(this.f41425a, v11));
                    }
                    throw new ChronoException("Missing rule for: " + this.f41425a.name());
                }
            }
            throw new IllegalArgumentException("Missing element value.");
        }

        private d(net.time4j.engine.p<V> pVar) {
            this.f41425a = pVar;
        }
    }

    /* loaded from: classes5.dex */
    private static class e implements net.time4j.engine.t<i0> {
        private e() {
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.d0 a() {
            return net.time4j.engine.d0.f40947a;
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.w<?> b() {
            return null;
        }

        @Override // net.time4j.engine.t
        /* renamed from: d */
        public i0 c(net.time4j.engine.q<?> qVar, net.time4j.engine.d dVar, boolean z11, boolean z12) {
            g0 c11;
            h0 c12;
            net.time4j.tz.k kVar;
            if (qVar instanceof net.time4j.base.f) {
                net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f40996d;
                if (dVar.c(cVar)) {
                    kVar = (net.time4j.tz.k) dVar.a(cVar);
                } else if (z11) {
                    kVar = net.time4j.tz.p.f41597k;
                } else {
                    throw new IllegalArgumentException("Missing timezone attribute for type conversion.");
                }
                return b0.Y((net.time4j.base.f) net.time4j.base.f.class.cast(qVar)).v0(kVar);
            }
            boolean z13 = z12 && qVar.h(h0.C) == 60;
            if (z13) {
                qVar.x(h0.C, 59);
            }
            net.time4j.engine.p<?> pVar = g0.f41292n;
            if (qVar.q(pVar)) {
                c11 = (g0) qVar.l(pVar);
            } else {
                c11 = g0.r0().c(qVar, dVar, z11, false);
            }
            if (c11 == null) {
                return null;
            }
            net.time4j.engine.p<?> pVar2 = h0.f41327o;
            if (qVar.q(pVar2)) {
                c12 = (h0) qVar.l(pVar2);
            } else {
                c12 = h0.g0().c(qVar, dVar, z11, false);
                if (c12 == null && z11) {
                    c12 = h0.f41325m;
                }
            }
            if (c12 == null) {
                return null;
            }
            net.time4j.engine.p<?> pVar3 = y.f41606d;
            if (qVar.q(pVar3)) {
                c11 = (g0) c11.G(((Long) qVar.l(pVar3)).longValue(), f.DAYS);
            }
            if (z13) {
                net.time4j.engine.a0 a0Var = net.time4j.engine.a0.LEAP_SECOND;
                Boolean bool = Boolean.TRUE;
                if (qVar.w(a0Var, bool)) {
                    qVar.z(a0Var, bool);
                }
            }
            return i0.Z(c11, c12);
        }

        @Override // net.time4j.engine.t
        /* renamed from: e */
        public net.time4j.engine.o g(i0 i0Var, net.time4j.engine.d dVar) {
            return i0Var;
        }

        @Override // net.time4j.engine.t
        public int f() {
            return g0.r0().f();
        }

        @Override // net.time4j.engine.t
        public String i(net.time4j.engine.x xVar, Locale locale) {
            net.time4j.format.e ofStyle = net.time4j.format.e.ofStyle(xVar.getStyleValue());
            return net.time4j.format.b.u(ofStyle, ofStyle, locale);
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    static {
        i0 i0Var = new i0(g0.f41282d, h0.f41325m);
        f41416c = i0Var;
        g0 g0Var = g0.f41283e;
        net.time4j.engine.p<h0> pVar = h0.f41327o;
        i0 i0Var2 = new i0(g0Var, pVar.getDefaultMaximum());
        f41417d = i0Var2;
        HashMap hashMap = new HashMap();
        net.time4j.engine.p<g0> pVar2 = g0.f41292n;
        hashMap.put(pVar2, pVar);
        net.time4j.c<Integer, g0> cVar = g0.f41294p;
        k0<Integer, g0> k0Var = g0.f41298x;
        hashMap.put(cVar, k0Var);
        net.time4j.c<Integer, g0> cVar2 = g0.f41295q;
        hashMap.put(cVar2, z0.f41616l.n());
        d0<m0> d0Var = g0.f41296t;
        k0<Integer, g0> k0Var2 = g0.B;
        hashMap.put(d0Var, k0Var2);
        d0<c0> d0Var2 = g0.f41297w;
        k0<Integer, g0> k0Var3 = g0.f41299y;
        hashMap.put(d0Var2, k0Var3);
        hashMap.put(k0Var, k0Var3);
        hashMap.put(k0Var3, pVar);
        d0<x0> d0Var3 = g0.f41300z;
        hashMap.put(d0Var3, pVar);
        k0<Integer, g0> k0Var4 = g0.A;
        hashMap.put(k0Var4, pVar);
        hashMap.put(k0Var2, pVar);
        e0 e0Var = g0.C;
        hashMap.put(e0Var, pVar);
        c1<a0> c1Var = h0.f41330q;
        k0<Integer, h0> k0Var5 = h0.f41333x;
        hashMap.put(c1Var, k0Var5);
        net.time4j.c<Integer, h0> cVar3 = h0.f41331t;
        k0<Integer, h0> k0Var6 = h0.A;
        hashMap.put(cVar3, k0Var6);
        net.time4j.c<Integer, h0> cVar4 = h0.f41332w;
        hashMap.put(cVar4, k0Var6);
        hashMap.put(k0Var5, k0Var6);
        k0<Integer, h0> k0Var7 = h0.f41335y;
        hashMap.put(k0Var7, k0Var6);
        k0<Integer, h0> k0Var8 = h0.f41336z;
        hashMap.put(k0Var8, k0Var6);
        k0<Integer, h0> k0Var9 = h0.C;
        hashMap.put(k0Var6, k0Var9);
        k0<Integer, h0> k0Var10 = h0.B;
        hashMap.put(k0Var10, k0Var9);
        k0<Integer, h0> k0Var11 = h0.H;
        hashMap.put(k0Var9, k0Var11);
        k0<Integer, h0> k0Var12 = h0.E;
        hashMap.put(k0Var12, k0Var11);
        f41418e = Collections.unmodifiableMap(hashMap);
        f0.b k11 = f0.b.k(x.class, i0.class, new e(null), i0Var, i0Var2);
        d j11 = d.j(pVar2);
        f fVar = f.DAYS;
        f0.b e11 = k11.e(pVar2, j11, fVar);
        d j12 = d.j(cVar);
        f fVar2 = f.YEARS;
        f0.b e12 = e11.e(cVar, j12, fVar2).e(cVar2, d.j(cVar2), w0.f41605a).e(d0Var, d.j(d0Var), f.QUARTERS);
        d j13 = d.j(d0Var2);
        f fVar3 = f.MONTHS;
        f0.b d11 = e12.e(d0Var2, j13, fVar3).e(k0Var, d.j(k0Var), fVar3).e(k0Var3, d.j(k0Var3), fVar).e(d0Var3, d.j(d0Var3), fVar).e(k0Var4, d.j(k0Var4), fVar).e(k0Var2, d.j(k0Var2), fVar).e(e0Var, d.j(e0Var), f.WEEKS).d(pVar, d.j(pVar)).d(c1Var, d.j(c1Var));
        d j14 = d.j(cVar3);
        h hVar = h.HOURS;
        f0.b e13 = d11.e(cVar3, j14, hVar).e(cVar4, d.j(cVar4), hVar).e(k0Var5, d.j(k0Var5), hVar).e(k0Var7, d.j(k0Var7), hVar).e(k0Var8, d.j(k0Var8), hVar);
        d j15 = d.j(k0Var6);
        h hVar2 = h.MINUTES;
        f0.b e14 = e13.e(k0Var6, j15, hVar2).e(k0Var10, d.j(k0Var10), hVar2);
        d j16 = d.j(k0Var9);
        h hVar3 = h.SECONDS;
        f0.b e15 = e14.e(k0Var9, j16, hVar3).e(k0Var12, d.j(k0Var12), hVar3);
        k0<Integer, h0> k0Var13 = h0.F;
        d j17 = d.j(k0Var13);
        h hVar4 = h.MILLIS;
        f0.b e16 = e15.e(k0Var13, j17, hVar4);
        k0<Integer, h0> k0Var14 = h0.G;
        d j18 = d.j(k0Var14);
        h hVar5 = h.MICROS;
        f0.b e17 = e16.e(k0Var14, j18, hVar5);
        d j19 = d.j(k0Var11);
        h hVar6 = h.NANOS;
        f0.b e18 = e17.e(k0Var11, j19, hVar6);
        k0<Integer, h0> k0Var15 = h0.K;
        f0.b e19 = e18.e(k0Var15, d.j(k0Var15), hVar4);
        k0<Long, h0> k0Var16 = h0.L;
        f0.b e21 = e19.e(k0Var16, d.j(k0Var16), hVar5);
        k0<Long, h0> k0Var17 = h0.O;
        f0.b e22 = e21.e(k0Var17, d.j(k0Var17), hVar6);
        c1<BigDecimal> c1Var2 = h0.P;
        f0.b d12 = e22.d(c1Var2, new c(c1Var2));
        c1<BigDecimal> c1Var3 = h0.Q;
        f0.b d13 = d12.d(c1Var3, new c(c1Var3));
        c1<BigDecimal> c1Var4 = h0.R;
        f0.b d14 = d13.d(c1Var4, new c(c1Var4));
        net.time4j.engine.p<h> pVar3 = h0.T;
        f0.b d15 = d14.d(pVar3, d.j(pVar3));
        a0(d15);
        b0(d15);
        c0(d15);
        f41419f = d15.h();
        o.g(fVar2, fVar3, fVar, hVar, hVar2, hVar3, hVar6);
    }

    private i0(g0 g0Var, h0 h0Var) {
        if (h0Var.p() == 24) {
            this.f41420a = (g0) g0Var.G(1L, f.DAYS);
            this.f41421b = h0.f41325m;
            return;
        }
        Objects.requireNonNull(g0Var, "Missing date.");
        this.f41420a = g0Var;
        this.f41421b = h0Var;
    }

    public static net.time4j.engine.f0<x, i0> P() {
        return f41419f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i0 S(net.time4j.base.f fVar, net.time4j.tz.p pVar) {
        long g11 = fVar.g() + pVar.k();
        int a11 = fVar.a() + pVar.i();
        if (a11 < 0) {
            a11 += Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            g11--;
        } else if (a11 >= 1000000000) {
            a11 -= Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            g11++;
        }
        g0 V0 = g0.V0(net.time4j.base.c.b(g11, 86400), net.time4j.engine.z.UNIX);
        int d11 = net.time4j.base.c.d(g11, 86400);
        int i11 = d11 % 60;
        int i12 = d11 / 60;
        return Z(V0, h0.N0(i12 / 60, i12 % 60, i11, a11));
    }

    public static i0 Y(int i11, int i12, int i13, int i14, int i15, int i16) {
        return Z(g0.N0(i11, i12, i13), h0.M0(i14, i15, i16));
    }

    public static i0 Z(g0 g0Var, h0 h0Var) {
        return new i0(g0Var, h0Var);
    }

    private static void a0(f0.b<x, i0> bVar) {
        f[] values;
        Set<? extends x> range = EnumSet.range(f.MILLENNIA, f.MONTHS);
        Set<? extends x> range2 = EnumSet.range(f.WEEKS, f.DAYS);
        for (f fVar : f.values()) {
            bVar.g(fVar, new b(fVar), fVar.getLength(), fVar.compareTo(f.WEEKS) < 0 ? range : range2);
        }
    }

    private static void b0(f0.b<x, i0> bVar) {
        h[] values;
        for (h hVar : h.values()) {
            bVar.g(hVar, new b(hVar), hVar.getLength(), EnumSet.allOf(h.class));
        }
    }

    private static void c0(f0.b<x, i0> bVar) {
        for (net.time4j.engine.r rVar : g0.r0().r()) {
            bVar.f(rVar);
        }
        for (net.time4j.engine.r rVar2 : h0.g0().r()) {
            bVar.f(rVar2);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.i0, net.time4j.engine.q
    /* renamed from: D */
    public net.time4j.engine.f0<x, i0> r() {
        return f41419f;
    }

    public b0 N(net.time4j.tz.p pVar) {
        long i11 = net.time4j.base.c.i(this.f41420a.E0() + 730, 86400L) + (this.f41421b.p() * 3600) + (this.f41421b.m() * 60) + this.f41421b.j();
        int a11 = this.f41421b.a();
        long k11 = i11 - pVar.k();
        int i12 = a11 - pVar.i();
        if (i12 < 0) {
            i12 += Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            k11--;
        } else if (i12 >= 1000000000) {
            i12 -= Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            k11++;
        }
        return b0.k0(k11, i12, m30.f.POSIX);
    }

    public b0 O() {
        return N(net.time4j.tz.p.f41597k);
    }

    @Override // net.time4j.engine.i0, java.lang.Comparable
    /* renamed from: Q */
    public int compareTo(i0 i0Var) {
        if (this.f41420a.M(i0Var.f41420a)) {
            return 1;
        }
        if (this.f41420a.N(i0Var.f41420a)) {
            return -1;
        }
        return this.f41421b.compareTo(i0Var.f41421b);
    }

    public g0 T() {
        return this.f41420a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.q
    /* renamed from: U */
    public i0 s() {
        return this;
    }

    public h0 V() {
        return this.f41421b;
    }

    public b0 W(net.time4j.tz.l lVar) {
        if (lVar.J()) {
            return N(lVar.A(this.f41420a, this.f41421b));
        }
        net.time4j.tz.o E = lVar.E();
        long b11 = E.b(this.f41420a, this.f41421b, lVar);
        b0 k02 = b0.k0(b11, this.f41421b.a(), m30.f.POSIX);
        if (E == net.time4j.tz.l.f41538d) {
            b0.U(b11, this);
        }
        return k02;
    }

    public b0 X(net.time4j.tz.k kVar) {
        return W(net.time4j.tz.l.N(kVar));
    }

    @Override // net.time4j.base.g
    public int a() {
        return this.f41421b.a();
    }

    public g0 d0() {
        return this.f41420a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            return this.f41420a.equals(i0Var.f41420a) && this.f41421b.equals(i0Var.f41421b);
        }
        return false;
    }

    @Override // net.time4j.base.a
    public int getMonth() {
        return this.f41420a.getMonth();
    }

    @Override // net.time4j.base.a
    public int getYear() {
        return this.f41420a.getYear();
    }

    public int hashCode() {
        return (this.f41420a.hashCode() * 13) + (this.f41421b.hashCode() * 37);
    }

    @Override // net.time4j.base.g
    public int j() {
        return this.f41421b.j();
    }

    @Override // net.time4j.base.g
    public int m() {
        return this.f41421b.m();
    }

    @Override // net.time4j.base.a
    public int n() {
        return this.f41420a.n();
    }

    @Override // net.time4j.base.g
    public int p() {
        return this.f41421b.p();
    }

    @Override // net.time4j.base.a
    public String toString() {
        return this.f41420a.toString() + this.f41421b.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class b implements net.time4j.engine.k0<i0> {

        /* renamed from: a  reason: collision with root package name */
        private final f f41423a;

        /* renamed from: b  reason: collision with root package name */
        private final h f41424b;

        b(f fVar) {
            this.f41423a = fVar;
            this.f41424b = null;
        }

        @Override // net.time4j.engine.k0
        /* renamed from: c */
        public i0 b(i0 i0Var, long j11) {
            g0 g0Var;
            h0 h0Var;
            if (this.f41423a != null) {
                g0Var = (g0) i0Var.f41420a.G(j11, this.f41423a);
                h0Var = i0Var.f41421b;
            } else {
                k W0 = i0Var.f41421b.W0(j11, this.f41424b);
                h0 b11 = W0.b();
                g0Var = (g0) i0Var.f41420a.G(W0.a(), f.DAYS);
                h0Var = b11;
            }
            return i0.Z(g0Var, h0Var);
        }

        @Override // net.time4j.engine.k0
        /* renamed from: d */
        public long a(i0 i0Var, i0 i0Var2) {
            long f11;
            f fVar = this.f41423a;
            if (fVar != null) {
                long between = fVar.between(i0Var.f41420a, i0Var2.f41420a);
                int i11 = (between > 0L ? 1 : (between == 0L ? 0 : -1));
                if (i11 != 0) {
                    boolean z11 = true;
                    if (this.f41423a != f.DAYS && ((g0) i0Var.f41420a.G(between, this.f41423a)).I(i0Var2.f41420a) != 0) {
                        z11 = false;
                    }
                    if (z11) {
                        h0 h0Var = i0Var.f41421b;
                        h0 h0Var2 = i0Var2.f41421b;
                        return (i11 <= 0 || !h0Var.y0(h0Var2)) ? (i11 >= 0 || !h0Var.z0(h0Var2)) ? between : between + 1 : between - 1;
                    }
                    return between;
                }
                return between;
            } else if (!i0Var.f41420a.M(i0Var2.f41420a)) {
                long H = i0Var.f41420a.H(i0Var2.f41420a, f.DAYS);
                if (H == 0) {
                    return this.f41424b.between(i0Var.f41421b, i0Var2.f41421b);
                }
                if (this.f41424b.compareTo(h.SECONDS) <= 0) {
                    long i12 = net.time4j.base.c.i(H, 86400L);
                    h0 h0Var3 = i0Var2.f41421b;
                    k0<Integer, h0> k0Var = h0.E;
                    long f12 = net.time4j.base.c.f(i12, net.time4j.base.c.m(((Integer) h0Var3.l(k0Var)).longValue(), ((Integer) i0Var.f41421b.l(k0Var)).longValue()));
                    if (i0Var.f41421b.a() > i0Var2.f41421b.a()) {
                        f12--;
                    }
                    f11 = f12;
                } else {
                    long i13 = net.time4j.base.c.i(H, 86400000000000L);
                    h0 h0Var4 = i0Var2.f41421b;
                    k0<Long, h0> k0Var2 = h0.O;
                    f11 = net.time4j.base.c.f(i13, net.time4j.base.c.m(((Long) h0Var4.l(k0Var2)).longValue(), ((Long) i0Var.f41421b.l(k0Var2)).longValue()));
                }
                switch (a.f41422a[this.f41424b.ordinal()]) {
                    case 1:
                        return f11 / 3600;
                    case 2:
                        return f11 / 60;
                    case 3:
                    case 6:
                        return f11;
                    case 4:
                        return f11 / 1000000;
                    case 5:
                        return f11 / 1000;
                    default:
                        throw new UnsupportedOperationException(this.f41424b.name());
                }
            } else {
                return -a(i0Var2, i0Var);
            }
        }

        b(h hVar) {
            this.f41423a = null;
            this.f41424b = hVar;
        }
    }
}