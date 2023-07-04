package net.time4j.engine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import net.time4j.engine.i0;
import net.time4j.engine.w;

/* loaded from: classes5.dex */
public final class f0<U, T extends i0<U, T>> extends w<T> implements g0<T> {

    /* renamed from: h  reason: collision with root package name */
    private final Map<U, k0<T>> f40952h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<U, Double> f40953i;

    /* renamed from: j  reason: collision with root package name */
    private final Map<U, Set<U>> f40954j;

    /* renamed from: k  reason: collision with root package name */
    private final Map<p<?>, U> f40955k;

    /* renamed from: l  reason: collision with root package name */
    private final T f40956l;

    /* renamed from: m  reason: collision with root package name */
    private final T f40957m;

    /* renamed from: n  reason: collision with root package name */
    private final k<T> f40958n;

    /* renamed from: o  reason: collision with root package name */
    private final p<T> f40959o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements Comparator<U> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f40960a;

        a(f0 f0Var, Map map) {
            this.f40960a = map;
        }

        @Override // java.util.Comparator
        public int compare(U u11, U u12) {
            return Double.compare(f0.F(this.f40960a, u11), f0.F(this.f40960a, u12));
        }
    }

    /* loaded from: classes5.dex */
    public static final class b<U, T extends i0<U, T>> extends w.a<T> {

        /* renamed from: f  reason: collision with root package name */
        private final Class<U> f40961f;

        /* renamed from: g  reason: collision with root package name */
        private final Map<U, k0<T>> f40962g;

        /* renamed from: h  reason: collision with root package name */
        private final Map<U, Double> f40963h;

        /* renamed from: i  reason: collision with root package name */
        private final Map<U, Set<U>> f40964i;

        /* renamed from: j  reason: collision with root package name */
        private final Map<p<?>, U> f40965j;

        /* renamed from: k  reason: collision with root package name */
        private final T f40966k;

        /* renamed from: l  reason: collision with root package name */
        private final T f40967l;

        /* renamed from: m  reason: collision with root package name */
        private final k<T> f40968m;

        /* renamed from: n  reason: collision with root package name */
        private g0<T> f40969n;

        private b(Class<U> cls, Class<T> cls2, t<T> tVar, T t11, T t12, k<T> kVar, g0<T> g0Var) {
            super(cls2, tVar);
            this.f40969n = null;
            Objects.requireNonNull(cls, "Missing unit type.");
            Objects.requireNonNull(t11, "Missing minimum of range.");
            Objects.requireNonNull(t12, "Missing maximum of range.");
            if (m.class.isAssignableFrom(cls2)) {
                Objects.requireNonNull(kVar, "Missing calendar system.");
            }
            this.f40961f = cls;
            this.f40962g = new HashMap();
            this.f40963h = new HashMap();
            this.f40964i = new HashMap();
            this.f40965j = new HashMap();
            this.f40966k = t11;
            this.f40967l = t12;
            this.f40968m = kVar;
            this.f40969n = g0Var;
        }

        private void i(U u11) {
            if (this.f40982b) {
                return;
            }
            for (U u12 : this.f40962g.keySet()) {
                if (u12.equals(u11)) {
                    throw new IllegalArgumentException("Unit duplicate found: " + u11.toString());
                }
            }
            if (u11 instanceof Enum) {
                String name = ((Enum) Enum.class.cast(u11)).name();
                for (U u13 : this.f40962g.keySet()) {
                    if ((u13 instanceof Enum) && ((Enum) Enum.class.cast(u13)).name().equals(name)) {
                        throw new IllegalArgumentException("Unit duplicate found: " + name);
                    }
                }
            }
        }

        public static <U, D extends m<U, D>> b<U, D> j(Class<U> cls, Class<D> cls2, t<D> tVar, k<D> kVar) {
            z[] values;
            b<U, D> bVar = new b<>(cls, cls2, tVar, kVar.b(kVar.c()), kVar.b(kVar.a()), kVar, null);
            for (z zVar : z.values()) {
                bVar.d(zVar, zVar.derive(kVar));
            }
            return bVar;
        }

        public static <U, T extends i0<U, T>> b<U, T> k(Class<U> cls, Class<T> cls2, t<T> tVar, T t11, T t12) {
            return new b<>(cls, cls2, tVar, t11, t12, null, null);
        }

        public <V> b<U, T> d(p<V> pVar, y<T, V> yVar) {
            super.a(pVar, yVar);
            return this;
        }

        public <V> b<U, T> e(p<V> pVar, y<T, V> yVar, U u11) {
            Objects.requireNonNull(u11, "Missing base unit.");
            super.a(pVar, yVar);
            this.f40965j.put(pVar, u11);
            return this;
        }

        public b<U, T> f(r rVar) {
            super.b(rVar);
            return this;
        }

        public b<U, T> g(U u11, k0<T> k0Var, double d11, Set<? extends U> set) {
            Objects.requireNonNull(u11, "Missing time unit.");
            Objects.requireNonNull(k0Var, "Missing unit rule.");
            i(u11);
            for (U u12 : set) {
                Objects.requireNonNull(u12, "Found convertible unit which is null.");
            }
            if (!Double.isNaN(d11)) {
                if (!Double.isInfinite(d11)) {
                    this.f40962g.put(u11, k0Var);
                    this.f40963h.put(u11, Double.valueOf(d11));
                    HashSet hashSet = new HashSet(set);
                    hashSet.remove(u11);
                    this.f40964i.put(u11, hashSet);
                    return this;
                }
                throw new IllegalArgumentException("Infinite: " + d11);
            }
            throw new IllegalArgumentException("Not a number: " + d11);
        }

        public f0<U, T> h() {
            if (!this.f40962g.isEmpty()) {
                f0<U, T> f0Var = new f0<>(this.f40981a, this.f40961f, this.f40983c, this.f40984d, this.f40962g, this.f40963h, this.f40964i, this.f40985e, this.f40965j, this.f40966k, this.f40967l, this.f40968m, this.f40969n, null);
                w.z(f0Var);
                return f0Var;
            }
            throw new IllegalStateException("No time unit was registered.");
        }

        public b<U, T> l(g0<T> g0Var) {
            Objects.requireNonNull(g0Var, "Missing time line.");
            this.f40969n = g0Var;
            return this;
        }
    }

    /* loaded from: classes5.dex */
    private static class c<U, T extends i0<U, T>> implements g0<T> {

        /* renamed from: a  reason: collision with root package name */
        private final U f40970a;

        c(U u11, T t11, T t12) {
            this.f40970a = u11;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(T t11, T t12) {
            return t11.compareTo(t12);
        }
    }

    /* loaded from: classes5.dex */
    private static class d<T extends i0<?, T>> extends e<T> implements y<T, T> {
        private static final long serialVersionUID = 4777240530511579802L;
        private final T max;
        private final T min;
        private final Class<T> type;

        /* synthetic */ d(Class cls, i0 i0Var, i0 i0Var2, a aVar) {
            this(cls, i0Var, i0Var2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // net.time4j.engine.e
        public <X extends q<X>> y<X, T> f(w<X> wVar) {
            if (wVar.p().equals(this.type)) {
                return this;
            }
            return null;
        }

        @Override // net.time4j.engine.p
        public Class<T> getType() {
            return this.type;
        }

        @Override // net.time4j.engine.p
        public boolean isDateElement() {
            return false;
        }

        @Override // net.time4j.engine.p
        public boolean isTimeElement() {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // net.time4j.engine.e
        public String j(w<?> wVar) {
            return null;
        }

        @Override // net.time4j.engine.e
        protected boolean m() {
            return true;
        }

        @Override // net.time4j.engine.y
        /* renamed from: o */
        public p<?> getChildAtCeiling(T t11) {
            throw new UnsupportedOperationException();
        }

        @Override // net.time4j.engine.y
        /* renamed from: p */
        public p<?> getChildAtFloor(T t11) {
            throw new UnsupportedOperationException();
        }

        @Override // net.time4j.engine.p
        /* renamed from: q */
        public T getDefaultMaximum() {
            return this.max;
        }

        @Override // net.time4j.engine.p
        /* renamed from: r */
        public T getDefaultMinimum() {
            return this.min;
        }

        @Override // net.time4j.engine.y
        /* renamed from: s */
        public T getMaximum(T t11) {
            return getDefaultMaximum();
        }

        @Override // net.time4j.engine.y
        /* renamed from: t */
        public T getMinimum(T t11) {
            return getDefaultMinimum();
        }

        @Override // net.time4j.engine.y
        /* renamed from: u */
        public T getValue(T t11) {
            return t11;
        }

        @Override // net.time4j.engine.y
        /* renamed from: v */
        public boolean isValid(T t11, T t12) {
            return t12 != null;
        }

        @Override // net.time4j.engine.y
        /* renamed from: w */
        public T withValue(T t11, T t12, boolean z11) {
            if (t12 != null) {
                return t12;
            }
            throw new IllegalArgumentException("Missing value.");
        }

        private d(Class<T> cls, T t11, T t12) {
            super(cls.getName() + "-AXIS");
            this.type = cls;
            this.min = t11;
            this.max = t12;
        }
    }

    /* synthetic */ f0(Class cls, Class cls2, t tVar, Map map, Map map2, Map map3, Map map4, List list, Map map5, i0 i0Var, i0 i0Var2, k kVar, g0 g0Var, a aVar) {
        this(cls, cls2, tVar, map, map2, map3, map4, list, map5, i0Var, i0Var2, kVar, g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <U> double F(Map<U, Double> map, U u11) {
        Double d11 = map.get(u11);
        if (d11 == null) {
            if (u11 instanceof v) {
                return ((v) v.class.cast(u11)).getLength();
            }
            return Double.NaN;
        }
        return d11.doubleValue();
    }

    @Override // java.util.Comparator
    /* renamed from: B */
    public int compare(T t11, T t12) {
        return t11.compareTo(t12);
    }

    @Override // net.time4j.engine.w, net.time4j.engine.t
    /* renamed from: C */
    public T c(q<?> qVar, net.time4j.engine.d dVar, boolean z11, boolean z12) {
        if (qVar.q(this.f40959o)) {
            return (T) qVar.l(this.f40959o);
        }
        return (T) super.c(qVar, dVar, z11, z12);
    }

    public p<T> D() {
        return this.f40959o;
    }

    public U E(p<?> pVar) {
        Objects.requireNonNull(pVar, "Missing element.");
        U u11 = this.f40955k.get(pVar);
        if (u11 == null && (pVar instanceof e)) {
            u11 = this.f40955k.get(((e) pVar).i());
        }
        if (u11 != null) {
            return u11;
        }
        throw new ChronoException("Base unit not found for: " + pVar.name());
    }

    public T G() {
        return this.f40957m;
    }

    public T H() {
        return this.f40956l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0<T> I(U u11) {
        k0<T> a11;
        Objects.requireNonNull(u11, "Missing chronological unit.");
        if (J(u11)) {
            return this.f40952h.get(u11);
        }
        if (!(u11 instanceof f) || (a11 = ((f) f.class.cast(u11)).a(this)) == null) {
            throw new RuleNotFoundException(this, u11);
        }
        return a11;
    }

    public boolean J(U u11) {
        return this.f40952h.containsKey(u11);
    }

    @Override // net.time4j.engine.w
    public k<T> m() {
        k<T> kVar = this.f40958n;
        return kVar == null ? super.m() : kVar;
    }

    @Override // net.time4j.engine.w
    public k<T> o(String str) {
        if (str.isEmpty()) {
            return m();
        }
        return super.o(str);
    }

    private f0(Class<T> cls, Class<U> cls2, t<T> tVar, Map<p<?>, y<T, ?>> map, Map<U, k0<T>> map2, Map<U, Double> map3, Map<U, Set<U>> map4, List<r> list, Map<p<?>, U> map5, T t11, T t12, k<T> kVar, g0<T> g0Var) {
        super(cls, tVar, map, list);
        this.f40952h = Collections.unmodifiableMap(map2);
        this.f40953i = Collections.unmodifiableMap(map3);
        this.f40954j = Collections.unmodifiableMap(map4);
        this.f40955k = Collections.unmodifiableMap(map5);
        this.f40956l = t11;
        this.f40957m = t12;
        this.f40958n = kVar;
        this.f40959o = new d(cls, t11, t12, null);
        if (g0Var == null) {
            ArrayList arrayList = new ArrayList(map2.keySet());
            Collections.sort(arrayList, new a(this, map3));
            new c(arrayList.get(0), t11, t12);
        }
    }
}