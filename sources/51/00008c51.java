package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class z0 implements Serializable {

    /* renamed from: k  reason: collision with root package name */
    private static final Map<Locale, z0> f41615k = new ConcurrentHashMap();

    /* renamed from: l  reason: collision with root package name */
    public static final z0 f41616l = new z0(x0.MONDAY, 4, x0.SATURDAY, x0.SUNDAY);

    /* renamed from: m  reason: collision with root package name */
    private static final net.time4j.format.y f41617m;
    private static final long serialVersionUID = 7794495882610436763L;

    /* renamed from: a  reason: collision with root package name */
    private final transient x0 f41618a;

    /* renamed from: b  reason: collision with root package name */
    private final transient int f41619b;

    /* renamed from: c  reason: collision with root package name */
    private final transient x0 f41620c;

    /* renamed from: d  reason: collision with root package name */
    private final transient x0 f41621d;

    /* renamed from: e  reason: collision with root package name */
    private final transient net.time4j.c<Integer, g0> f41622e;

    /* renamed from: f  reason: collision with root package name */
    private final transient net.time4j.c<Integer, g0> f41623f;

    /* renamed from: g  reason: collision with root package name */
    private final transient net.time4j.c<Integer, g0> f41624g;

    /* renamed from: h  reason: collision with root package name */
    private final transient net.time4j.c<Integer, g0> f41625h;

    /* renamed from: i  reason: collision with root package name */
    private final transient d0<x0> f41626i;

    /* renamed from: j  reason: collision with root package name */
    private final transient Set<net.time4j.engine.p<?>> f41627j;

    /* loaded from: classes5.dex */
    class a implements net.time4j.engine.n<net.time4j.base.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x0 f41628a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ x0 f41629b;

        a(z0 z0Var, x0 x0Var, x0 x0Var2) {
            this.f41628a = x0Var;
            this.f41629b = x0Var2;
        }

        @Override // net.time4j.engine.n
        /* renamed from: a */
        public boolean test(net.time4j.base.a aVar) {
            x0 valueOf = x0.valueOf(net.time4j.base.b.c(aVar.getYear(), aVar.getMonth(), aVar.n()));
            return valueOf == this.f41628a || valueOf == this.f41629b;
        }
    }

    /* loaded from: classes5.dex */
    private static class b<T extends net.time4j.engine.q<T>> implements net.time4j.engine.y<T, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final d f41630a;

        /* synthetic */ b(d dVar, a aVar) {
            this(dVar);
        }

        private net.time4j.engine.p<?> c(T t11, boolean z11) {
            g0 g0Var = (g0) t11.l(g0.f41292n);
            d0<x0> i11 = this.f41630a.t().i();
            int intValue = getValue(t11).intValue();
            if (z11) {
                if (intValue >= (this.f41630a.v() ? 52 : 4)) {
                    g0 g0Var2 = (g0) g0Var.z(i11, t11.e(i11));
                    if (this.f41630a.v()) {
                        if (g0Var2.D0() < g0Var.D0()) {
                            return g0.A;
                        }
                    } else if (g0Var2.n() < g0Var.n()) {
                        return g0.f41299y;
                    }
                }
            } else if (intValue <= 1) {
                g0 g0Var3 = (g0) g0Var.z(i11, t11.f(i11));
                if (this.f41630a.v()) {
                    if (g0Var3.D0() > g0Var.D0()) {
                        return g0.A;
                    }
                } else if (g0Var3.n() > g0Var.n()) {
                    return g0.f41299y;
                }
            }
            return i11;
        }

        private int f(g0 g0Var) {
            if (this.f41630a.v()) {
                return net.time4j.base.b.e(g0Var.getYear()) ? 366 : 365;
            }
            return net.time4j.base.b.d(g0Var.getYear(), g0Var.getMonth());
        }

        private int g(g0 g0Var) {
            return m(g0Var, 1);
        }

        private int i(g0 g0Var) {
            return m(g0Var, -1);
        }

        private int l(g0 g0Var) {
            return m(g0Var, 0);
        }

        private int m(g0 g0Var, int i11) {
            int n11;
            if (this.f41630a.v()) {
                n11 = g0Var.D0();
            } else {
                n11 = g0Var.n();
            }
            int value = z0.c((g0Var.E0() - n11) + 1).getValue(this.f41630a.t());
            int i12 = value <= 8 - this.f41630a.t().g() ? 2 - value : 9 - value;
            if (i11 == -1) {
                n11 = 1;
            } else if (i11 != 0) {
                if (i11 == 1) {
                    n11 = f(g0Var);
                } else {
                    throw new AssertionError("Unexpected: " + i11);
                }
            }
            return net.time4j.base.c.a(n11 - i12, 7) + 1;
        }

        private g0 o(g0 g0Var, int i11) {
            int l11 = l(g0Var);
            return i11 == l11 ? g0Var : g0Var.c1(g0Var.E0() + ((i11 - l11) * 7));
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p<?> getChildAtCeiling(T t11) {
            return c(t11, true);
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public net.time4j.engine.p<?> getChildAtFloor(T t11) {
            return c(t11, false);
        }

        @Override // net.time4j.engine.y
        /* renamed from: h */
        public Integer getMaximum(T t11) {
            return Integer.valueOf(g((g0) t11.l(g0.f41292n)));
        }

        @Override // net.time4j.engine.y
        /* renamed from: j */
        public Integer getMinimum(T t11) {
            return Integer.valueOf(i((g0) t11.l(g0.f41292n)));
        }

        @Override // net.time4j.engine.y
        /* renamed from: k */
        public Integer getValue(T t11) {
            return Integer.valueOf(l((g0) t11.l(g0.f41292n)));
        }

        @Override // net.time4j.engine.y
        /* renamed from: n */
        public boolean isValid(T t11, Integer num) {
            if (num == null) {
                return false;
            }
            int intValue = num.intValue();
            g0 g0Var = (g0) t11.l(g0.f41292n);
            return intValue >= i(g0Var) && intValue <= g(g0Var);
        }

        @Override // net.time4j.engine.y
        /* renamed from: p */
        public T withValue(T t11, Integer num, boolean z11) {
            net.time4j.engine.p<g0> pVar = g0.f41292n;
            g0 g0Var = (g0) t11.l(pVar);
            if (num != null && (z11 || isValid(t11, num))) {
                return (T) t11.z(pVar, o(g0Var, num.intValue()));
            }
            throw new IllegalArgumentException("Invalid value: " + num + " (context=" + t11 + ")");
        }

        private b(d dVar) {
            this.f41630a = dVar;
        }
    }

    /* loaded from: classes5.dex */
    private static class c<T extends net.time4j.engine.q<T>> implements net.time4j.engine.y<T, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final d f41631a;

        /* synthetic */ c(d dVar, a aVar) {
            this(dVar);
        }

        private int c(g0 g0Var) {
            int n11;
            if (this.f41631a.v()) {
                n11 = g0Var.D0();
            } else {
                n11 = g0Var.n();
            }
            int g11 = g(g0Var, 0);
            if (g11 <= n11) {
                int i11 = ((n11 - g11) / 7) + 1;
                if ((i11 >= 53 || (!this.f41631a.v() && i11 >= 5)) && g(g0Var, 1) + h(g0Var, 0) <= n11) {
                    return 1;
                }
                return i11;
            }
            return (((n11 + h(g0Var, -1)) - g(g0Var, -1)) / 7) + 1;
        }

        private net.time4j.engine.p<?> d() {
            return this.f41631a.t().i();
        }

        private int g(g0 g0Var, int i11) {
            x0 m11 = m(g0Var, i11);
            z0 t11 = this.f41631a.t();
            int value = m11.getValue(t11);
            return value <= 8 - t11.g() ? 2 - value : 9 - value;
        }

        private int h(g0 g0Var, int i11) {
            if (this.f41631a.v()) {
                return net.time4j.base.b.e(g0Var.getYear() + i11) ? 366 : 365;
            }
            int year = g0Var.getYear();
            int month = g0Var.getMonth() + i11;
            if (month == 0) {
                month = 12;
                year--;
            } else if (month == 13) {
                year++;
                month = 1;
            }
            return net.time4j.base.b.d(year, month);
        }

        private int i(g0 g0Var) {
            int n11;
            if (this.f41631a.v()) {
                n11 = g0Var.D0();
            } else {
                n11 = g0Var.n();
            }
            int g11 = g(g0Var, 0);
            if (g11 <= n11) {
                int g12 = g(g0Var, 1) + h(g0Var, 0);
                if (g12 <= n11) {
                    try {
                        int g13 = g(g0Var, 1);
                        g12 = g(g0Var, 2) + h(g0Var, 1);
                        g11 = g13;
                    } catch (RuntimeException unused) {
                        g12 += 7;
                    }
                }
                return (g12 - g11) / 7;
            }
            return ((g11 + h(g0Var, -1)) - g(g0Var, -1)) / 7;
        }

        private x0 m(g0 g0Var, int i11) {
            if (this.f41631a.v()) {
                return x0.valueOf(net.time4j.base.b.c(g0Var.getYear() + i11, 1, 1));
            }
            int year = g0Var.getYear();
            int month = g0Var.getMonth() + i11;
            if (month == 0) {
                month = 12;
                year--;
            } else if (month == 13) {
                year++;
                month = 1;
            } else if (month == 14) {
                month = 2;
                year++;
            }
            return x0.valueOf(net.time4j.base.b.c(year, month, 1));
        }

        private g0 o(g0 g0Var, int i11) {
            int c11 = c(g0Var);
            return i11 == c11 ? g0Var : g0Var.c1(g0Var.E0() + ((i11 - c11) * 7));
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public net.time4j.engine.p<?> getChildAtCeiling(T t11) {
            return d();
        }

        @Override // net.time4j.engine.y
        /* renamed from: f */
        public net.time4j.engine.p<?> getChildAtFloor(T t11) {
            return d();
        }

        @Override // net.time4j.engine.y
        /* renamed from: j */
        public Integer getMaximum(T t11) {
            return Integer.valueOf(i((g0) t11.l(g0.f41292n)));
        }

        @Override // net.time4j.engine.y
        /* renamed from: k */
        public Integer getMinimum(T t11) {
            return 1;
        }

        @Override // net.time4j.engine.y
        /* renamed from: l */
        public Integer getValue(T t11) {
            return Integer.valueOf(c((g0) t11.l(g0.f41292n)));
        }

        @Override // net.time4j.engine.y
        /* renamed from: n */
        public boolean isValid(T t11, Integer num) {
            if (num == null) {
                return false;
            }
            int intValue = num.intValue();
            if (!this.f41631a.v() || intValue < 1 || intValue > 52) {
                if (!this.f41631a.v() || intValue == 53) {
                    return intValue >= 1 && intValue <= i((g0) t11.l(g0.f41292n));
                }
                return false;
            }
            return true;
        }

        @Override // net.time4j.engine.y
        /* renamed from: p */
        public T withValue(T t11, Integer num, boolean z11) {
            net.time4j.engine.p<g0> pVar = g0.f41292n;
            g0 g0Var = (g0) t11.l(pVar);
            if (num != null && (z11 || isValid(t11, num))) {
                return (T) t11.z(pVar, o(g0Var, num.intValue()));
            }
            throw new IllegalArgumentException("Invalid value: " + num + " (context=" + t11 + ")");
        }

        private c(d dVar) {
            this.f41631a = dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class d extends net.time4j.a<Integer> {
        private static final long serialVersionUID = -5936254509996557266L;
        private final int category;

        d(String str, int i11) {
            super(str);
            this.category = i11;
        }

        private Object readResolve() {
            z0 t11 = t();
            int i11 = this.category;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            return t11.a();
                        }
                        throw new InvalidObjectException("Unknown category: " + this.category);
                    }
                    return t11.b();
                }
                return t11.m();
            }
            return t11.n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public z0 t() {
            return z0.this;
        }

        private boolean u() {
            return this.category >= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean v() {
            return this.category % 2 == 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // net.time4j.engine.e
        public <T extends net.time4j.engine.q<T>> net.time4j.engine.y<T, Integer> f(net.time4j.engine.w<T> wVar) {
            if (wVar.v(g0.f41292n)) {
                if (u()) {
                    return new b(this, null);
                }
                return new c(this, null);
            }
            return null;
        }

        @Override // net.time4j.engine.e
        protected boolean g(net.time4j.engine.e<?> eVar) {
            return t().equals(((d) eVar).t());
        }

        @Override // net.time4j.engine.e, net.time4j.engine.p
        public char getSymbol() {
            int i11 = this.category;
            if (i11 != 0) {
                if (i11 != 1) {
                    return super.getSymbol();
                }
                return 'W';
            }
            return 'w';
        }

        @Override // net.time4j.engine.p
        public Class<Integer> getType() {
            return Integer.class;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // net.time4j.engine.e
        public net.time4j.engine.p<?> i() {
            return g0.C;
        }

        @Override // net.time4j.engine.p
        public boolean isDateElement() {
            return true;
        }

        @Override // net.time4j.engine.e, net.time4j.engine.p
        public boolean isLenient() {
            return true;
        }

        @Override // net.time4j.engine.p
        public boolean isTimeElement() {
            return false;
        }

        @Override // net.time4j.engine.p
        /* renamed from: r */
        public Integer getDefaultMaximum() {
            return Integer.valueOf(v() ? 52 : 5);
        }

        @Override // net.time4j.engine.p
        /* renamed from: s */
        public Integer getDefaultMinimum() {
            return 1;
        }
    }

    /* loaded from: classes5.dex */
    private static class e<T extends net.time4j.engine.q<T>> implements net.time4j.engine.y<T, x0> {

        /* renamed from: a  reason: collision with root package name */
        final f f41632a;

        /* synthetic */ e(f fVar, a aVar) {
            this(fVar);
        }

        private net.time4j.engine.p<?> c(T t11) {
            net.time4j.engine.p<h0> pVar = h0.f41327o;
            if (t11.q(pVar)) {
                return pVar;
            }
            return null;
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p<?> getChildAtCeiling(T t11) {
            return c(t11);
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public net.time4j.engine.p<?> getChildAtFloor(T t11) {
            return c(t11);
        }

        @Override // net.time4j.engine.y
        /* renamed from: f */
        public x0 getMaximum(T t11) {
            g0 g0Var = (g0) t11.l(g0.f41292n);
            if ((g0Var.b() + 7) - g0Var.C0().getValue(this.f41632a.t()) > g0.r0().m().a()) {
                return x0.FRIDAY;
            }
            return this.f41632a.getDefaultMaximum();
        }

        @Override // net.time4j.engine.y
        /* renamed from: g */
        public x0 getMinimum(T t11) {
            g0 g0Var = (g0) t11.l(g0.f41292n);
            if ((g0Var.b() + 1) - g0Var.C0().getValue(this.f41632a.t()) < g0.r0().m().c()) {
                return x0.MONDAY;
            }
            return this.f41632a.getDefaultMinimum();
        }

        @Override // net.time4j.engine.y
        /* renamed from: h */
        public x0 getValue(T t11) {
            return ((g0) t11.l(g0.f41292n)).C0();
        }

        @Override // net.time4j.engine.y
        /* renamed from: i */
        public boolean isValid(T t11, x0 x0Var) {
            if (x0Var == null) {
                return false;
            }
            try {
                withValue(t11, x0Var, false);
                return true;
            } catch (RuntimeException unused) {
                return false;
            }
        }

        @Override // net.time4j.engine.y
        /* renamed from: j */
        public T withValue(T t11, x0 x0Var, boolean z11) {
            if (x0Var != null) {
                net.time4j.engine.p<g0> pVar = g0.f41292n;
                g0 g0Var = (g0) t11.l(pVar);
                long E0 = g0Var.E0();
                x0 c11 = z0.c(E0);
                if (x0Var == c11) {
                    return t11;
                }
                return (T) t11.z(pVar, g0Var.c1((E0 + x0Var.getValue(this.f41632a.t())) - c11.getValue(this.f41632a.t())));
            }
            throw new IllegalArgumentException("Missing weekday.");
        }

        private e(f fVar) {
            this.f41632a = fVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class f extends net.time4j.a<x0> implements d0<x0>, net.time4j.format.l<x0>, net.time4j.format.t<x0> {
        private static final long serialVersionUID = 1945670789283677398L;

        f() {
            super("LOCAL_DAY_OF_WEEK");
        }

        private net.time4j.format.s q(net.time4j.engine.d dVar, net.time4j.format.m mVar) {
            return net.time4j.format.b.d((Locale) dVar.b(net.time4j.format.a.f40995c, Locale.ROOT)).p((net.time4j.format.v) dVar.b(net.time4j.format.a.f40999g, net.time4j.format.v.WIDE), mVar);
        }

        private Object readResolve() {
            return z0.this.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public z0 t() {
            return z0.this;
        }

        @Override // net.time4j.engine.e, java.util.Comparator
        /* renamed from: c */
        public int compare(net.time4j.engine.o oVar, net.time4j.engine.o oVar2) {
            int value = ((x0) oVar.l(this)).getValue(z0.this);
            int value2 = ((x0) oVar2.l(this)).getValue(z0.this);
            if (value < value2) {
                return -1;
            }
            return value == value2 ? 0 : 1;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // net.time4j.engine.e
        public <T extends net.time4j.engine.q<T>> net.time4j.engine.y<T, x0> f(net.time4j.engine.w<T> wVar) {
            if (wVar.v(g0.f41292n)) {
                return new e(this, null);
            }
            return null;
        }

        @Override // net.time4j.engine.e
        protected boolean g(net.time4j.engine.e<?> eVar) {
            return t().equals(((f) eVar).t());
        }

        @Override // net.time4j.engine.e, net.time4j.engine.p
        public char getSymbol() {
            return 'e';
        }

        @Override // net.time4j.engine.p
        public Class<x0> getType() {
            return x0.class;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // net.time4j.engine.e
        public net.time4j.engine.p<?> i() {
            return g0.f41300z;
        }

        @Override // net.time4j.engine.p
        public boolean isDateElement() {
            return true;
        }

        @Override // net.time4j.engine.p
        public boolean isTimeElement() {
            return false;
        }

        @Override // net.time4j.format.l
        public boolean n(net.time4j.engine.q<?> qVar, int i11) {
            x0[] values;
            for (x0 x0Var : x0.values()) {
                if (x0Var.getValue(z0.this) == i11) {
                    qVar.z(this, x0Var);
                    return true;
                }
            }
            return false;
        }

        @Override // net.time4j.format.t
        public void print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar) {
            appendable.append(q(dVar, (net.time4j.format.m) dVar.b(net.time4j.format.a.f41000h, net.time4j.format.m.FORMAT)).g((Enum) oVar.l(this)));
        }

        @Override // net.time4j.engine.p
        /* renamed from: r */
        public x0 getDefaultMaximum() {
            return z0.this.f().roll(6);
        }

        @Override // net.time4j.engine.p
        /* renamed from: s */
        public x0 getDefaultMinimum() {
            return z0.this.f();
        }

        public int u(x0 x0Var) {
            return x0Var.getValue(z0.this);
        }

        @Override // net.time4j.format.t
        /* renamed from: v */
        public x0 parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
            int index = parsePosition.getIndex();
            net.time4j.engine.c<net.time4j.format.m> cVar = net.time4j.format.a.f41000h;
            net.time4j.format.m mVar = net.time4j.format.m.FORMAT;
            net.time4j.format.m mVar2 = (net.time4j.format.m) dVar.b(cVar, mVar);
            x0 x0Var = (x0) q(dVar, mVar2).d(charSequence, parsePosition, getType(), dVar);
            if (x0Var == null && ((Boolean) dVar.b(net.time4j.format.a.f41003k, Boolean.TRUE)).booleanValue()) {
                parsePosition.setErrorIndex(-1);
                parsePosition.setIndex(index);
                if (mVar2 == mVar) {
                    mVar = net.time4j.format.m.STANDALONE;
                }
                return (x0) q(dVar, mVar).d(charSequence, parsePosition, getType(), dVar);
            }
            return x0Var;
        }

        @Override // net.time4j.format.l
        /* renamed from: w */
        public int d(x0 x0Var, net.time4j.engine.o oVar, net.time4j.engine.d dVar) {
            return u(x0Var);
        }
    }

    static {
        Iterator it2 = net.time4j.base.d.c().g(net.time4j.format.y.class).iterator();
        f41617m = it2.hasNext() ? (net.time4j.format.y) it2.next() : null;
    }

    private z0(x0 x0Var, int i11, x0 x0Var2, x0 x0Var3) {
        Objects.requireNonNull(x0Var, "Missing first day of week.");
        if (i11 >= 1 && i11 <= 7) {
            Objects.requireNonNull(x0Var2, "Missing start of weekend.");
            Objects.requireNonNull(x0Var3, "Missing end of weekend.");
            this.f41618a = x0Var;
            this.f41619b = i11;
            this.f41620c = x0Var2;
            this.f41621d = x0Var3;
            d dVar = new d("WEEK_OF_YEAR", 0);
            this.f41622e = dVar;
            d dVar2 = new d("WEEK_OF_MONTH", 1);
            this.f41623f = dVar2;
            d dVar3 = new d("BOUNDED_WEEK_OF_YEAR", 2);
            this.f41624g = dVar3;
            d dVar4 = new d("BOUNDED_WEEK_OF_MONTH", 3);
            this.f41625h = dVar4;
            f fVar = new f();
            this.f41626i = fVar;
            new a(this, x0Var2, x0Var3);
            HashSet hashSet = new HashSet();
            hashSet.add(dVar);
            hashSet.add(dVar2);
            hashSet.add(fVar);
            hashSet.add(dVar3);
            hashSet.add(dVar4);
            this.f41627j = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw new IllegalArgumentException("Minimal days in first week out of range: " + i11);
    }

    static x0 c(long j11) {
        return x0.valueOf(net.time4j.base.c.d(j11 + 5, 7) + 1);
    }

    public static z0 j(Locale locale) {
        if (locale.getCountry().isEmpty()) {
            return f41616l;
        }
        Map<Locale, z0> map = f41615k;
        z0 z0Var = map.get(locale);
        if (z0Var != null) {
            return z0Var;
        }
        net.time4j.format.y yVar = f41617m;
        if (yVar == null) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(locale);
            int firstDayOfWeek = gregorianCalendar.getFirstDayOfWeek();
            return k(x0.valueOf(firstDayOfWeek == 1 ? 7 : firstDayOfWeek - 1), gregorianCalendar.getMinimalDaysInFirstWeek());
        }
        z0 z0Var2 = new z0(x0.valueOf(yVar.d(locale)), yVar.b(locale), x0.valueOf(yVar.c(locale)), x0.valueOf(yVar.a(locale)));
        if (map.size() > 150) {
            map.clear();
        }
        map.put(locale, z0Var2);
        return z0Var2;
    }

    public static z0 k(x0 x0Var, int i11) {
        return l(x0Var, i11, x0.SATURDAY, x0.SUNDAY);
    }

    public static z0 l(x0 x0Var, int i11, x0 x0Var2, x0 x0Var3) {
        if (x0Var == x0.MONDAY && i11 == 4 && x0Var2 == x0.SATURDAY && x0Var3 == x0.SUNDAY) {
            return f41616l;
        }
        return new z0(x0Var, i11, x0Var2, x0Var3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 3);
    }

    public net.time4j.c<Integer, g0> a() {
        return this.f41625h;
    }

    public net.time4j.c<Integer, g0> b() {
        return this.f41624g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<net.time4j.engine.p<?>> d() {
        return this.f41627j;
    }

    public x0 e() {
        return this.f41621d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z0) {
            z0 z0Var = (z0) obj;
            return this.f41618a == z0Var.f41618a && this.f41619b == z0Var.f41619b && this.f41620c == z0Var.f41620c && this.f41621d == z0Var.f41621d;
        }
        return false;
    }

    public x0 f() {
        return this.f41618a;
    }

    public int g() {
        return this.f41619b;
    }

    public x0 h() {
        return this.f41620c;
    }

    public int hashCode() {
        return (this.f41618a.name().hashCode() * 17) + (this.f41619b * 37);
    }

    public d0<x0> i() {
        return this.f41626i;
    }

    public net.time4j.c<Integer, g0> m() {
        return this.f41623f;
    }

    public net.time4j.c<Integer, g0> n() {
        return this.f41622e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(z0.class.getName());
        sb2.append("[firstDayOfWeek=");
        sb2.append(this.f41618a);
        sb2.append(",minimalDaysInFirstWeek=");
        sb2.append(this.f41619b);
        sb2.append(",startOfWeekend=");
        sb2.append(this.f41620c);
        sb2.append(",endOfWeekend=");
        sb2.append(this.f41621d);
        sb2.append(']');
        return sb2.toString();
    }
}