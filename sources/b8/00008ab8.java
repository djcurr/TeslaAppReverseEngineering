package net.time4j.calendar;

import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import net.time4j.engine.w;
import net.time4j.engine.y;
import net.time4j.engine.z;
import net.time4j.x0;
import net.time4j.z0;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final net.time4j.engine.p<Integer> f40868a = l.f40901a;

    /* renamed from: net.time4j.calendar.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private static class C0802b<D extends net.time4j.engine.q<D>> implements y<D, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final d<?> f40869a;

        private net.time4j.engine.p<?> c(D d11, boolean z11) {
            f G = f.G(d11.getClass(), ((d) this.f40869a).model);
            int k11 = k(d11);
            z zVar = z.UTC;
            long longValue = ((Long) d11.l(zVar)).longValue();
            int h11 = d11.h(((d) this.f40869a).dayElement);
            if (z11) {
                if (((Integer) d11.e(((d) this.f40869a).dayElement)).intValue() < h11 + (((Long) d11.z(G, d11.e(G)).l(zVar)).longValue() - longValue)) {
                    return ((d) this.f40869a).dayElement;
                }
            } else if (k11 <= 1) {
                if (((Integer) d11.f(((d) this.f40869a).dayElement)).intValue() > h11 - (longValue - ((Long) d11.z(G, d11.f(G)).l(zVar)).longValue())) {
                    return ((d) this.f40869a).dayElement;
                }
            }
            return G;
        }

        private int f(D d11) {
            return l(d11, 1);
        }

        private int h(D d11) {
            return l(d11, -1);
        }

        private int k(D d11) {
            return l(d11, 0);
        }

        private int l(D d11, int i11) {
            int h11 = d11.h(((d) this.f40869a).dayElement);
            int value = b.c((((Long) d11.l(z.UTC)).longValue() - h11) + 1).getValue(((d) this.f40869a).model);
            int i12 = value <= 8 - ((d) this.f40869a).model.g() ? 2 - value : 9 - value;
            if (i11 == -1) {
                h11 = 1;
            } else if (i11 != 0) {
                if (i11 == 1) {
                    h11 = ((Integer) d11.e(((d) this.f40869a).dayElement)).intValue();
                } else {
                    throw new AssertionError("Unexpected: " + i11);
                }
            }
            return net.time4j.base.c.a(h11 - i12, 7) + 1;
        }

        private D n(D d11, int i11) {
            int k11 = k(d11);
            if (i11 == k11) {
                return d11;
            }
            z zVar = z.UTC;
            return (D) d11.y(zVar, ((Long) d11.l(zVar)).longValue() + ((i11 - k11) * 7));
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p<?> getChildAtCeiling(D d11) {
            return c(d11, true);
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public net.time4j.engine.p<?> getChildAtFloor(D d11) {
            return c(d11, false);
        }

        @Override // net.time4j.engine.y
        /* renamed from: g */
        public Integer getMaximum(D d11) {
            return Integer.valueOf(f(d11));
        }

        @Override // net.time4j.engine.y
        /* renamed from: i */
        public Integer getMinimum(D d11) {
            return Integer.valueOf(h(d11));
        }

        @Override // net.time4j.engine.y
        /* renamed from: j */
        public Integer getValue(D d11) {
            return Integer.valueOf(k(d11));
        }

        @Override // net.time4j.engine.y
        /* renamed from: m */
        public boolean isValid(D d11, Integer num) {
            int intValue;
            return num != null && (intValue = num.intValue()) >= h(d11) && intValue <= f(d11);
        }

        @Override // net.time4j.engine.y
        /* renamed from: o */
        public D withValue(D d11, Integer num, boolean z11) {
            if (num != null && (z11 || isValid(d11, num))) {
                return n(d11, num.intValue());
            }
            throw new IllegalArgumentException("Invalid value: " + num + " (context=" + d11 + ")");
        }

        private C0802b(d<?> dVar) {
            this.f40869a = dVar;
        }
    }

    /* loaded from: classes5.dex */
    private static class c<D extends net.time4j.engine.q<D>> implements y<D, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final d<?> f40870a;

        private int c(D d11) {
            int h11;
            int h12 = d11.h(((d) this.f40870a).dayElement);
            int g11 = g(d11, 0);
            if (g11 <= h12) {
                if (g(d11, 1) + h(d11, 0) <= h12) {
                    return 1;
                }
                h11 = (h12 - g11) / 7;
            } else {
                h11 = ((h12 + h(d11, -1)) - g(d11, -1)) / 7;
            }
            return h11 + 1;
        }

        private net.time4j.engine.p<?> d(Object obj) {
            return new f((Class) obj, ((d) this.f40870a).model);
        }

        private int g(D d11, int i11) {
            x0 m11 = m(d11, i11);
            z0 z0Var = ((d) this.f40870a).model;
            int value = m11.getValue(z0Var);
            return value <= 8 - z0Var.g() ? 2 - value : 9 - value;
        }

        private int h(D d11, int i11) {
            int h11 = d11.h(((d) this.f40870a).dayElement);
            if (i11 == -1) {
                net.time4j.engine.p pVar = ((d) this.f40870a).dayElement;
                z zVar = z.UTC;
                return b.d(pVar, d11.y(zVar, ((Long) d11.l(zVar)).longValue() - h11));
            } else if (i11 != 0) {
                if (i11 == 1) {
                    int d12 = b.d(((d) this.f40870a).dayElement, d11);
                    net.time4j.engine.p pVar2 = ((d) this.f40870a).dayElement;
                    z zVar2 = z.UTC;
                    return b.d(pVar2, d11.y(zVar2, ((((Long) d11.l(zVar2)).longValue() + d12) + 1) - h11));
                }
                throw new AssertionError("Unexpected: " + i11);
            } else {
                return b.d(((d) this.f40870a).dayElement, d11);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private int i(D d11) {
            int h11 = d11.h(((d) this.f40870a).dayElement);
            int g11 = g(d11, 0);
            if (g11 <= h11) {
                int g12 = g(d11, 1) + h(d11, 0);
                if (g12 <= h11) {
                    try {
                        int g13 = g(d11, 1);
                        z zVar = z.UTC;
                        g12 = g(d11.y(zVar, ((Long) d11.l(zVar)).longValue() + 7), 1) + h(d11, 1);
                        g11 = g13;
                    } catch (RuntimeException unused) {
                        g12 += 7;
                    }
                }
                return (g12 - g11) / 7;
            }
            return ((g11 + h(d11, -1)) - g(d11, -1)) / 7;
        }

        private x0 m(D d11, int i11) {
            int h11 = d11.h(((d) this.f40870a).dayElement);
            if (i11 == -1) {
                z zVar = z.UTC;
                long longValue = ((Long) d11.l(zVar)).longValue() - h11;
                return b.c((longValue - d11.y(zVar, longValue).h(((d) this.f40870a).dayElement)) + 1);
            } else if (i11 != 0) {
                if (i11 == 1) {
                    return b.c(((((Long) d11.l(z.UTC)).longValue() + b.d(((d) this.f40870a).dayElement, d11)) + 1) - h11);
                }
                throw new AssertionError("Unexpected: " + i11);
            } else {
                return b.c((((Long) d11.l(z.UTC)).longValue() - h11) + 1);
            }
        }

        private D o(D d11, int i11) {
            int c11 = c(d11);
            if (i11 == c11) {
                return d11;
            }
            z zVar = z.UTC;
            return (D) d11.y(zVar, ((Long) d11.l(zVar)).longValue() + ((i11 - c11) * 7));
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public net.time4j.engine.p<?> getChildAtCeiling(D d11) {
            return d(d11.getClass());
        }

        @Override // net.time4j.engine.y
        /* renamed from: f */
        public net.time4j.engine.p<?> getChildAtFloor(D d11) {
            return d(d11.getClass());
        }

        @Override // net.time4j.engine.y
        /* renamed from: j */
        public Integer getMaximum(D d11) {
            return Integer.valueOf(i(d11));
        }

        @Override // net.time4j.engine.y
        /* renamed from: k */
        public Integer getMinimum(D d11) {
            return 1;
        }

        @Override // net.time4j.engine.y
        /* renamed from: l */
        public Integer getValue(D d11) {
            return Integer.valueOf(c(d11));
        }

        @Override // net.time4j.engine.y
        /* renamed from: n */
        public boolean isValid(D d11, Integer num) {
            int intValue;
            return num != null && (intValue = num.intValue()) >= 1 && intValue <= i(d11);
        }

        @Override // net.time4j.engine.y
        /* renamed from: p */
        public D withValue(D d11, Integer num, boolean z11) {
            int intValue = num.intValue();
            if (!z11 && !isValid(d11, num)) {
                throw new IllegalArgumentException("Invalid value: " + intValue + " (context=" + d11 + ")");
            }
            return o(d11, intValue);
        }

        private c(d<?> dVar) {
            this.f40870a = dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class d<T extends net.time4j.engine.q<T>> extends net.time4j.calendar.service.f<T> {
        private static final long serialVersionUID = -7471192143785466686L;
        private final boolean bounded;
        private final net.time4j.engine.p<Integer> dayElement;
        private final z0 model;

        d(String str, Class<T> cls, int i11, int i12, char c11, z0 z0Var, net.time4j.engine.p<Integer> pVar, boolean z11) {
            super(str, cls, i11, i12, c11);
            Objects.requireNonNull(z0Var, "Missing week model.");
            this.model = z0Var;
            this.dayElement = pVar;
            this.bounded = z11;
        }

        static <T extends net.time4j.engine.q<T>> d<T> t(String str, Class<T> cls, int i11, int i12, char c11, z0 z0Var, net.time4j.engine.p<Integer> pVar, boolean z11) {
            return new d<>(str, cls, i11, i12, c11, z0Var, pVar, z11);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // net.time4j.engine.e
        public <D extends net.time4j.engine.q<D>> y<D, Integer> f(w<D> wVar) {
            if (o().equals(wVar.p())) {
                return this.bounded ? new C0802b(this) : new c(this);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // net.time4j.calendar.service.d, net.time4j.engine.e
        public boolean g(net.time4j.engine.e<?> eVar) {
            if (super.g(eVar)) {
                d dVar = (d) d.class.cast(eVar);
                return this.model.equals(dVar.model) && this.bounded == dVar.bounded;
            }
            return false;
        }

        @Override // net.time4j.engine.e, net.time4j.engine.p
        public boolean isLenient() {
            return true;
        }

        @Override // net.time4j.calendar.service.d
        protected Object readResolve() {
            return this;
        }
    }

    /* loaded from: classes5.dex */
    private static class e<T extends net.time4j.engine.q<T>> implements y<T, x0> {

        /* renamed from: a  reason: collision with root package name */
        private final f<?> f40871a;

        @Override // net.time4j.engine.y
        /* renamed from: c */
        public net.time4j.engine.p<?> getChildAtCeiling(T t11) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p<?> getChildAtFloor(T t11) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public x0 getMaximum(T t11) {
            long a11;
            w x11 = w.x(t11.getClass());
            if (t11 instanceof net.time4j.engine.l) {
                a11 = x11.o(((net.time4j.engine.l) net.time4j.engine.l.class.cast(t11)).i()).a();
            } else {
                a11 = x11.m().a();
            }
            long longValue = ((Long) t11.l(z.UTC)).longValue();
            if ((longValue + 7) - b.c(longValue).getValue(((f) this.f40871a).model) > a11) {
                return b.c(a11);
            }
            return this.f40871a.s();
        }

        @Override // net.time4j.engine.y
        /* renamed from: f */
        public x0 getMinimum(T t11) {
            long c11;
            w x11 = w.x(t11.getClass());
            if (t11 instanceof net.time4j.engine.l) {
                c11 = x11.o(((net.time4j.engine.l) net.time4j.engine.l.class.cast(t11)).i()).c();
            } else {
                c11 = x11.m().c();
            }
            long longValue = ((Long) t11.l(z.UTC)).longValue();
            if ((longValue + 1) - b.c(longValue).getValue(((f) this.f40871a).model) < c11) {
                return b.c(c11);
            }
            return this.f40871a.t();
        }

        @Override // net.time4j.engine.y
        /* renamed from: g */
        public x0 getValue(T t11) {
            return b.c(((Long) t11.l(z.UTC)).longValue());
        }

        @Override // net.time4j.engine.y
        /* renamed from: h */
        public boolean isValid(T t11, x0 x0Var) {
            if (x0Var == null) {
                return false;
            }
            try {
                withValue(t11, x0Var, false);
                return true;
            } catch (ArithmeticException | IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // net.time4j.engine.y
        /* renamed from: i */
        public T withValue(T t11, x0 x0Var, boolean z11) {
            z zVar = z.UTC;
            long longValue = ((Long) t11.l(zVar)).longValue();
            x0 c11 = b.c(longValue);
            if (x0Var == c11) {
                return t11;
            }
            return (T) t11.y(zVar, (longValue + x0Var.getValue(((f) this.f40871a).model)) - c11.getValue(((f) this.f40871a).model));
        }

        private e(f<?> fVar) {
            this.f40871a = fVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class f<T extends net.time4j.engine.q<T>> extends net.time4j.calendar.service.e<x0, T> {
        private static final long serialVersionUID = 5613494586572932860L;
        private final z0 model;

        f(Class<T> cls, z0 z0Var) {
            super("LOCAL_DAY_OF_WEEK", cls, x0.class, 'e');
            this.model = z0Var;
        }

        static <T extends net.time4j.engine.q<T>> f<T> G(Class<T> cls, z0 z0Var) {
            return new f<>(cls, z0Var);
        }

        @Override // net.time4j.calendar.service.e
        /* renamed from: D */
        public x0 s() {
            return this.model.f().roll(6);
        }

        @Override // net.time4j.calendar.service.e
        /* renamed from: E */
        public x0 t() {
            return this.model.f();
        }

        @Override // net.time4j.calendar.service.e
        /* renamed from: F */
        public int z(x0 x0Var) {
            return x0Var.getValue(this.model);
        }

        @Override // net.time4j.engine.e, java.util.Comparator
        /* renamed from: c */
        public int compare(net.time4j.engine.o oVar, net.time4j.engine.o oVar2) {
            int value = ((x0) oVar.l(this)).getValue(this.model);
            int value2 = ((x0) oVar2.l(this)).getValue(this.model);
            if (value < value2) {
                return -1;
            }
            return value == value2 ? 0 : 1;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // net.time4j.engine.e
        public <D extends net.time4j.engine.q<D>> y<D, x0> f(w<D> wVar) {
            if (o().equals(wVar.p())) {
                return new e(this);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // net.time4j.calendar.service.d, net.time4j.engine.e
        public boolean g(net.time4j.engine.e<?> eVar) {
            if (super.g(eVar)) {
                return this.model.equals(((f) f.class.cast(eVar)).model);
            }
            return false;
        }

        @Override // net.time4j.calendar.service.d
        protected Object readResolve() {
            return this;
        }

        @Override // net.time4j.calendar.service.e
        protected boolean x() {
            return true;
        }
    }

    /* loaded from: classes5.dex */
    static class g implements net.time4j.engine.r {

        /* renamed from: a  reason: collision with root package name */
        private final Class<? extends net.time4j.engine.q> f40872a;

        /* renamed from: b  reason: collision with root package name */
        private final net.time4j.engine.p<Integer> f40873b;

        /* renamed from: c  reason: collision with root package name */
        private final net.time4j.engine.p<Integer> f40874c;

        /* renamed from: d  reason: collision with root package name */
        private final z0 f40875d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public g(Class<? extends net.time4j.engine.q> cls, net.time4j.engine.p<Integer> pVar, net.time4j.engine.p<Integer> pVar2, z0 z0Var) {
            this.f40872a = cls;
            this.f40873b = pVar;
            this.f40874c = pVar2;
            this.f40875d = z0Var;
        }

        @Override // net.time4j.engine.r
        public net.time4j.engine.q<?> a(net.time4j.engine.q<?> qVar, Locale locale, net.time4j.engine.d dVar) {
            return qVar;
        }

        @Override // net.time4j.engine.r
        public Set<net.time4j.engine.p<?>> b(Locale locale, net.time4j.engine.d dVar) {
            z0 j11 = locale.getCountry().isEmpty() ? this.f40875d : z0.j(locale);
            HashSet hashSet = new HashSet();
            hashSet.add(f.G(this.f40872a, j11));
            z0 z0Var = j11;
            hashSet.add(d.t("WEEK_OF_MONTH", this.f40872a, 1, 5, 'W', z0Var, this.f40873b, false));
            hashSet.add(d.t("WEEK_OF_YEAR", this.f40872a, 1, 52, 'w', z0Var, this.f40874c, false));
            hashSet.add(d.t("BOUNDED_WEEK_OF_MONTH", this.f40872a, 1, 5, (char) 0, z0Var, this.f40873b, true));
            hashSet.add(d.t("BOUNDED_WEEK_OF_YEAR", this.f40872a, 1, 52, (char) 0, z0Var, this.f40874c, true));
            return Collections.unmodifiableSet(hashSet);
        }

        @Override // net.time4j.engine.r
        public boolean c(net.time4j.engine.p<?> pVar) {
            return false;
        }

        @Override // net.time4j.engine.r
        public boolean d(Class<?> cls) {
            return this.f40872a.equals(cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static x0 c(long j11) {
        return x0.valueOf(net.time4j.base.c.d(j11 + 5, 7) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <D extends net.time4j.engine.q<D>> int d(net.time4j.engine.p<?> pVar, D d11) {
        return ((Integer) Integer.class.cast(d11.e(pVar))).intValue();
    }
}