package net.time4j;

import ch.qos.logback.core.CoreConstants;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.engine.f0;
import net.time4j.f;
import org.spongycastle.crypto.tls.CipherSuite;

@net.time4j.format.c("iso8601")
/* loaded from: classes5.dex */
public final class g0 extends net.time4j.engine.m<v, g0> implements net.time4j.base.a, net.time4j.engine.c0<net.time4j.f>, net.time4j.format.h {
    public static final k0<Integer, g0> A;
    public static final k0<Integer, g0> B;
    public static final e0 C;
    private static final Map<String, Object> E;
    private static final net.time4j.engine.k<g0> F;
    private static final net.time4j.engine.f0<v, g0> G;

    /* renamed from: d  reason: collision with root package name */
    static final g0 f41282d = new g0(-999999999, 1, 1);

    /* renamed from: e  reason: collision with root package name */
    static final g0 f41283e = new g0(999999999, 12, 31);

    /* renamed from: f  reason: collision with root package name */
    static final Integer f41284f = -999999999;

    /* renamed from: g  reason: collision with root package name */
    static final Integer f41285g = 999999999;

    /* renamed from: h  reason: collision with root package name */
    private static final Integer f41286h = 1;

    /* renamed from: i  reason: collision with root package name */
    private static final Integer f41287i = 12;

    /* renamed from: j  reason: collision with root package name */
    private static final Integer f41288j = 365;

    /* renamed from: k  reason: collision with root package name */
    private static final Integer f41289k = 366;

    /* renamed from: l  reason: collision with root package name */
    private static final int[] f41290l;

    /* renamed from: m  reason: collision with root package name */
    private static final int[] f41291m;

    /* renamed from: n  reason: collision with root package name */
    static final net.time4j.engine.p<g0> f41292n;

    /* renamed from: o  reason: collision with root package name */
    public static final net.time4j.e f41293o;

    /* renamed from: p  reason: collision with root package name */
    public static final net.time4j.c<Integer, g0> f41294p;

    /* renamed from: q  reason: collision with root package name */
    public static final net.time4j.c<Integer, g0> f41295q;
    private static final long serialVersionUID = -6698431452072325688L;

    /* renamed from: t  reason: collision with root package name */
    public static final d0<m0> f41296t;

    /* renamed from: w  reason: collision with root package name */
    public static final d0<c0> f41297w;

    /* renamed from: x  reason: collision with root package name */
    public static final k0<Integer, g0> f41298x;

    /* renamed from: y  reason: collision with root package name */
    public static final k0<Integer, g0> f41299y;

    /* renamed from: z  reason: collision with root package name */
    public static final d0<x0> f41300z;

    /* renamed from: a  reason: collision with root package name */
    private final transient int f41301a;

    /* renamed from: b  reason: collision with root package name */
    private final transient byte f41302b;

    /* renamed from: c  reason: collision with root package name */
    private final transient byte f41303c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41304a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f41305b;

        static {
            int[] iArr = new int[m0.values().length];
            f41305b = iArr;
            try {
                iArr[m0.Q1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41305b[m0.Q2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[net.time4j.f.values().length];
            f41304a = iArr2;
            try {
                iArr2[net.time4j.f.MILLENNIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41304a[net.time4j.f.CENTURIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41304a[net.time4j.f.DECADES.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41304a[net.time4j.f.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41304a[net.time4j.f.QUARTERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41304a[net.time4j.f.MONTHS.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41304a[net.time4j.f.WEEKS.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f41304a[net.time4j.f.DAYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes5.dex */
    private static class b implements net.time4j.engine.y<g0, g0> {
        private b() {
        }

        @Override // net.time4j.engine.y
        /* renamed from: c */
        public net.time4j.engine.p<?> getChildAtCeiling(g0 g0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p<?> getChildAtFloor(g0 g0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public g0 getMaximum(g0 g0Var) {
            return g0.f41283e;
        }

        @Override // net.time4j.engine.y
        /* renamed from: f */
        public g0 getMinimum(g0 g0Var) {
            return g0.f41282d;
        }

        @Override // net.time4j.engine.y
        /* renamed from: g */
        public g0 getValue(g0 g0Var) {
            return g0Var;
        }

        @Override // net.time4j.engine.y
        /* renamed from: h */
        public boolean isValid(g0 g0Var, g0 g0Var2) {
            return g0Var2 != null;
        }

        @Override // net.time4j.engine.y
        /* renamed from: i */
        public g0 withValue(g0 g0Var, g0 g0Var2, boolean z11) {
            if (g0Var2 != null) {
                return g0Var2;
            }
            throw new IllegalArgumentException("Missing date value.");
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private static class c<V extends Enum<V>> implements net.time4j.engine.y<g0, V> {

        /* renamed from: a  reason: collision with root package name */
        private final String f41306a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<V> f41307b;

        /* renamed from: c  reason: collision with root package name */
        private final V f41308c;

        /* renamed from: d  reason: collision with root package name */
        private final V f41309d;

        /* renamed from: e  reason: collision with root package name */
        private final int f41310e;

        c(String str, Class<V> cls, V v11, V v12, int i11) {
            this.f41306a = str;
            this.f41307b = cls;
            this.f41308c = v11;
            this.f41309d = v12;
            this.f41310e = i11;
        }

        private net.time4j.engine.p<?> c() {
            switch (this.f41310e) {
                case 101:
                    return g0.f41299y;
                case 102:
                    return null;
                case 103:
                    return g0.B;
                default:
                    throw new UnsupportedOperationException(this.f41306a);
            }
        }

        static <V extends Enum<V>> c<V> j(net.time4j.engine.p<V> pVar) {
            return new c<>(pVar.name(), pVar.getType(), pVar.getDefaultMinimum(), pVar.getDefaultMaximum(), ((q) pVar).s());
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p<?> getChildAtCeiling(g0 g0Var) {
            return c();
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public net.time4j.engine.p<?> getChildAtFloor(g0 g0Var) {
            return c();
        }

        @Override // net.time4j.engine.y
        /* renamed from: f */
        public V getMaximum(g0 g0Var) {
            if (this.f41310e == 102 && g0Var.f41301a == 999999999 && g0Var.f41302b == 12 && g0Var.f41303c >= 27) {
                return this.f41307b.cast(x0.FRIDAY);
            }
            return this.f41309d;
        }

        @Override // net.time4j.engine.y
        /* renamed from: g */
        public V getMinimum(g0 g0Var) {
            return this.f41308c;
        }

        @Override // net.time4j.engine.y
        /* renamed from: h */
        public V getValue(g0 g0Var) {
            Object valueOf;
            switch (this.f41310e) {
                case 101:
                    valueOf = c0.valueOf(g0Var.f41302b);
                    break;
                case 102:
                    valueOf = g0Var.C0();
                    break;
                case 103:
                    valueOf = m0.valueOf(((g0Var.f41302b - 1) / 3) + 1);
                    break;
                default:
                    throw new UnsupportedOperationException(this.f41306a);
            }
            return this.f41307b.cast(valueOf);
        }

        @Override // net.time4j.engine.y
        /* renamed from: i */
        public boolean isValid(g0 g0Var, V v11) {
            if (v11 == null) {
                return false;
            }
            if (this.f41310e == 102 && g0Var.f41301a == 999999999) {
                try {
                    withValue(g0Var, v11, false);
                    return true;
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            }
            return true;
        }

        @Override // net.time4j.engine.y
        /* renamed from: k */
        public g0 withValue(g0 g0Var, V v11, boolean z11) {
            if (v11 != null) {
                switch (this.f41310e) {
                    case 101:
                        return g0Var.d1(((c0) c0.class.cast(v11)).getValue());
                    case 102:
                        return g0Var.a1((x0) x0.class.cast(v11));
                    case 103:
                        return (g0) g0Var.G(((m0) m0.class.cast(v11)).getValue() - (((g0Var.f41302b - 1) / 3) + 1), net.time4j.f.QUARTERS);
                    default:
                        throw new UnsupportedOperationException(this.f41306a);
                }
            }
            throw new IllegalArgumentException("Missing element value.");
        }
    }

    /* loaded from: classes5.dex */
    private static class d implements net.time4j.engine.b0<g0> {

        /* renamed from: a  reason: collision with root package name */
        private final net.time4j.engine.p<?> f41311a;

        /* renamed from: b  reason: collision with root package name */
        private final String f41312b;

        /* renamed from: c  reason: collision with root package name */
        private final int f41313c;

        d(net.time4j.engine.p<Integer> pVar) {
            this(((t) pVar).s(), pVar);
        }

        private net.time4j.engine.p<?> c() {
            switch (this.f41313c) {
                case 14:
                    return g0.f41298x;
                case 15:
                    return g0.f41299y;
                case 16:
                case 17:
                case 18:
                case 19:
                    return null;
                default:
                    throw new UnsupportedOperationException(this.f41312b);
            }
        }

        private static int h(g0 g0Var) {
            int i11 = ((g0Var.f41302b - 1) / 3) + 1;
            return i11 == 1 ? net.time4j.base.b.e(g0Var.f41301a) ? 91 : 90 : i11 == 2 ? 91 : 92;
        }

        private int i(g0 g0Var) {
            int d11 = net.time4j.base.b.d(g0Var.f41301a, g0Var.f41302b);
            byte b11 = g0Var.f41303c;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if ((i12 * 7) + b11 > d11) {
                    return (((b11 + (i11 * 7)) - 1) / 7) + 1;
                }
                i11 = i12;
            }
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p<?> getChildAtCeiling(g0 g0Var) {
            return c();
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public net.time4j.engine.p<?> getChildAtFloor(g0 g0Var) {
            return c();
        }

        @Override // net.time4j.engine.b0
        /* renamed from: f */
        public int b(g0 g0Var) {
            switch (this.f41313c) {
                case 14:
                    return g0Var.f41301a;
                case 15:
                    return g0Var.f41302b;
                case 16:
                    return g0Var.f41303c;
                case 17:
                    return g0Var.D0();
                case 18:
                    return g0Var.B0();
                case 19:
                    return ((g0Var.f41303c - 1) / 7) + 1;
                default:
                    throw new UnsupportedOperationException(this.f41312b);
            }
        }

        @Override // net.time4j.engine.y
        /* renamed from: g */
        public Integer getMaximum(g0 g0Var) {
            switch (this.f41313c) {
                case 14:
                    return g0.f41285g;
                case 15:
                    return g0.f41287i;
                case 16:
                    return Integer.valueOf(net.time4j.base.b.d(g0Var.f41301a, g0Var.f41302b));
                case 17:
                    return net.time4j.base.b.e(g0Var.f41301a) ? g0.f41289k : g0.f41288j;
                case 18:
                    return Integer.valueOf(h(g0Var));
                case 19:
                    return Integer.valueOf(i(g0Var));
                default:
                    throw new UnsupportedOperationException(this.f41312b);
            }
        }

        @Override // net.time4j.engine.y
        /* renamed from: j */
        public Integer getMinimum(g0 g0Var) {
            switch (this.f41313c) {
                case 14:
                    return g0.f41284f;
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    return g0.f41286h;
                default:
                    throw new UnsupportedOperationException(this.f41312b);
            }
        }

        @Override // net.time4j.engine.y
        /* renamed from: k */
        public Integer getValue(g0 g0Var) {
            return Integer.valueOf(b(g0Var));
        }

        public boolean l(g0 g0Var, int i11) {
            switch (this.f41313c) {
                case 14:
                    return i11 >= -999999999 && i11 <= 999999999;
                case 15:
                    return i11 >= 1 && i11 <= 12;
                case 16:
                    return i11 >= 1 && i11 <= net.time4j.base.b.d(g0Var.f41301a, g0Var.f41302b);
                case 17:
                    if (i11 >= 1) {
                        return i11 <= (net.time4j.base.b.e(g0Var.f41301a) ? 366 : 365);
                    }
                    return false;
                case 18:
                    return i11 >= 1 && i11 <= h(g0Var);
                case 19:
                    return i11 >= 1 && i11 <= i(g0Var);
                default:
                    throw new UnsupportedOperationException(this.f41312b);
            }
        }

        @Override // net.time4j.engine.y
        /* renamed from: m */
        public boolean isValid(g0 g0Var, Integer num) {
            return num != null && l(g0Var, num.intValue());
        }

        @Override // net.time4j.engine.b0
        /* renamed from: n */
        public g0 a(g0 g0Var, int i11, boolean z11) {
            if (!z11) {
                switch (this.f41313c) {
                    case 14:
                        return g0Var.e1(i11);
                    case 15:
                        return g0Var.d1(i11);
                    case 16:
                        return g0Var.Z0(i11);
                    case 17:
                        return g0Var.b1(i11);
                    case 18:
                        if (i11 >= 1 && i11 <= h(g0Var)) {
                            return (g0) g0Var.G(i11 - g0Var.B0(), net.time4j.f.DAYS);
                        }
                        throw new IllegalArgumentException("Out of range: " + i11);
                    case 19:
                        if (!z11 && (i11 < 1 || i11 > i(g0Var))) {
                            throw new IllegalArgumentException("Out of range: " + i11);
                        }
                        return (g0) g0Var.G(i11 - (((g0Var.f41303c - 1) / 7) + 1), net.time4j.f.WEEKS);
                    default:
                        throw new UnsupportedOperationException(this.f41312b);
                }
            }
            return (g0) g0Var.G(net.time4j.base.c.l(i11, b(g0Var)), (v) g0.G.E(this.f41311a));
        }

        @Override // net.time4j.engine.y
        /* renamed from: o */
        public g0 withValue(g0 g0Var, Integer num, boolean z11) {
            if (num != null) {
                return a(g0Var, num.intValue(), z11);
            }
            throw new IllegalArgumentException("Missing element value.");
        }

        d(int i11, net.time4j.engine.p<?> pVar) {
            this.f41311a = pVar;
            this.f41312b = pVar.name();
            this.f41313c = i11;
        }
    }

    /* loaded from: classes5.dex */
    private static class e implements net.time4j.engine.t<g0> {

        /* renamed from: a  reason: collision with root package name */
        private static final int f41314a = net.time4j.base.b.i(net.time4j.base.b.l(net.time4j.engine.z.MODIFIED_JULIAN_DATE.transform(net.time4j.base.c.b(System.currentTimeMillis(), 86400000), net.time4j.engine.z.UNIX))) + 20;

        private e() {
        }

        private static void e(net.time4j.engine.q<?> qVar, String str) {
            net.time4j.engine.l0 l0Var = net.time4j.engine.l0.ERROR_MESSAGE;
            if (qVar.w(l0Var, str)) {
                qVar.z(l0Var, str);
            }
        }

        private static boolean j(net.time4j.engine.q<?> qVar, int i11, int i12, int i13) {
            if (i13 < 1 || (i13 > 28 && i13 > net.time4j.base.b.d(i11, i12))) {
                e(qVar, "DAY_OF_MONTH out of range: " + i13);
                return false;
            }
            return true;
        }

        private static boolean k(net.time4j.engine.q<?> qVar, boolean z11, m0 m0Var, int i11) {
            int i12 = a.f41305b[m0Var.ordinal()];
            int i13 = 91;
            if (i12 != 1) {
                if (i12 != 2) {
                    i13 = 92;
                }
            } else if (!z11) {
                i13 = 90;
            }
            if (i11 < 1 || i11 > i13) {
                e(qVar, "DAY_OF_QUARTER out of range: " + i11);
                return false;
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (r4 > (net.time4j.base.b.e(r3) ? 366 : 365)) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static boolean l(net.time4j.engine.q<?> r2, int r3, int r4) {
            /*
                r0 = 1
                if (r4 < r0) goto L13
                r1 = 365(0x16d, float:5.11E-43)
                if (r4 <= r1) goto L12
                boolean r3 = net.time4j.base.b.e(r3)
                if (r3 == 0) goto Lf
                r1 = 366(0x16e, float:5.13E-43)
            Lf:
                if (r4 <= r1) goto L12
                goto L13
            L12:
                return r0
            L13:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "DAY_OF_YEAR out of range: "
                r3.append(r0)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                e(r2, r3)
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.g0.e.l(net.time4j.engine.q, int, int):boolean");
        }

        private static boolean m(net.time4j.engine.q<?> qVar, int i11) {
            if (i11 < 1 || i11 > 12) {
                e(qVar, "MONTH_OF_YEAR out of range: " + i11);
                return false;
            }
            return true;
        }

        private static boolean n(net.time4j.engine.q<?> qVar, int i11) {
            if (i11 < -999999999 || i11 > 999999999) {
                e(qVar, "YEAR out of range: " + i11);
                return false;
            }
            return true;
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
        public g0 c(net.time4j.engine.q<?> qVar, net.time4j.engine.d dVar, boolean z11, boolean z12) {
            x0 x0Var;
            k0<Integer, g0> k0Var;
            int h11;
            net.time4j.engine.p<g0> pVar = g0.f41292n;
            if (qVar.q(pVar)) {
                return (g0) qVar.l(pVar);
            }
            int h12 = qVar.h(g0.f41294p);
            if (h12 != Integer.MIN_VALUE) {
                k0<Integer, g0> k0Var2 = g0.f41298x;
                int h13 = qVar.h(k0Var2);
                if (h13 == Integer.MIN_VALUE) {
                    d0<c0> d0Var = g0.f41297w;
                    if (qVar.q(d0Var)) {
                        h13 = ((c0) qVar.l(d0Var)).getValue();
                    }
                }
                if (h13 != Integer.MIN_VALUE && (h11 = qVar.h((k0Var = g0.f41299y))) != Integer.MIN_VALUE) {
                    if (z11) {
                        return (g0) ((g0) g0.N0(h12, 1, 1).A(k0Var2.k(Integer.valueOf(h13)))).A(k0Var.k(Integer.valueOf(h11)));
                    }
                    if (n(qVar, h12) && m(qVar, h13) && j(qVar, h12, h13, h11)) {
                        return g0.O0(h12, h13, h11, false);
                    }
                    return null;
                }
                k0<Integer, g0> k0Var3 = g0.A;
                int h14 = qVar.h(k0Var3);
                if (h14 != Integer.MIN_VALUE) {
                    if (z11) {
                        return (g0) g0.M0(h12, 1).A(k0Var3.k(Integer.valueOf(h14)));
                    }
                    if (n(qVar, h12) && l(qVar, h12, h14)) {
                        return g0.M0(h12, h14);
                    }
                    return null;
                }
                int h15 = qVar.h(g0.B);
                if (h15 != Integer.MIN_VALUE) {
                    d0<m0> d0Var2 = g0.f41296t;
                    if (qVar.q(d0Var2)) {
                        m0 m0Var = (m0) qVar.l(d0Var2);
                        boolean e11 = net.time4j.base.b.e(h12);
                        int i11 = (e11 ? 91 : 90) + h15;
                        if (m0Var == m0.Q1) {
                            i11 = h15;
                        } else if (m0Var == m0.Q3) {
                            i11 += 91;
                        } else if (m0Var == m0.Q4) {
                            i11 += CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384;
                        }
                        if (z11) {
                            return (g0) g0.M0(h12, 1).A(k0Var3.k(Integer.valueOf(i11)));
                        }
                        if (n(qVar, h12) && k(qVar, e11, m0Var, h15)) {
                            return g0.M0(h12, i11);
                        }
                        return null;
                    }
                }
            }
            int h16 = qVar.h(g0.f41295q);
            if (h16 != Integer.MIN_VALUE) {
                z0 z0Var = z0.f41616l;
                if (qVar.q(z0Var.n())) {
                    int intValue = ((Integer) qVar.l(z0Var.n())).intValue();
                    d0<x0> d0Var3 = g0.f41300z;
                    if (qVar.q(d0Var3)) {
                        x0Var = (x0) qVar.l(d0Var3);
                    } else {
                        if (qVar.q(z0Var.i())) {
                            x0Var = (x0) qVar.l(z0Var.i());
                        }
                        return null;
                    }
                    if (h16 >= -999999999 && h16 <= 999999999) {
                        g0 T0 = g0.T0(h16, intValue, x0Var, false);
                        if (T0 == null) {
                            e(qVar, g0.f1(intValue));
                        }
                        return T0;
                    }
                    e(qVar, g0.g1(h16));
                    return null;
                }
            }
            net.time4j.engine.z zVar = net.time4j.engine.z.MODIFIED_JULIAN_DATE;
            if (qVar.q(zVar)) {
                return (g0) g0.F.b(net.time4j.engine.z.UTC.transform(((Long) qVar.l(zVar)).longValue(), zVar));
            }
            if (qVar instanceof net.time4j.base.f) {
                return i0.P().c(qVar, dVar, z11, z12).T();
            }
            return null;
        }

        @Override // net.time4j.engine.t
        public int f() {
            return f41314a;
        }

        @Override // net.time4j.engine.t
        /* renamed from: h */
        public net.time4j.engine.o g(g0 g0Var, net.time4j.engine.d dVar) {
            return g0Var;
        }

        @Override // net.time4j.engine.t
        public String i(net.time4j.engine.x xVar, Locale locale) {
            return net.time4j.format.b.r(net.time4j.format.e.ofStyle(xVar.getStyleValue()), locale);
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private static class f implements net.time4j.engine.k<g0> {
        private f() {
        }

        @Override // net.time4j.engine.k
        public long a() {
            return 365241779741L;
        }

        @Override // net.time4j.engine.k
        public long c() {
            return -365243219892L;
        }

        @Override // net.time4j.engine.k
        /* renamed from: d */
        public long transform(g0 g0Var) {
            return net.time4j.engine.z.UTC.transform(net.time4j.base.b.k(g0Var), net.time4j.engine.z.MODIFIED_JULIAN_DATE);
        }

        @Override // net.time4j.engine.k
        /* renamed from: e */
        public g0 b(long j11) {
            if (j11 == -365243219892L) {
                return g0.f41282d;
            }
            if (j11 == 365241779741L) {
                return g0.f41283e;
            }
            long l11 = net.time4j.base.b.l(net.time4j.engine.z.MODIFIED_JULIAN_DATE.transform(j11, net.time4j.engine.z.UTC));
            return g0.N0(net.time4j.base.b.i(l11), net.time4j.base.b.h(l11), net.time4j.base.b.g(l11));
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    static {
        f41290l = r7;
        f41291m = r8;
        int[] iArr = {31, 59, 90, 120, 151, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, 212, 243, 273, 304, 334, 365};
        int[] iArr2 = {31, 60, 91, 121, 152, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, 213, 244, 274, 305, 335, 366};
        i iVar = i.f41415a;
        f41292n = iVar;
        f41293o = iVar;
        t p11 = t.p("YEAR", 14, -999999999, 999999999, 'u');
        f41294p = p11;
        a1 a1Var = a1.f40791c;
        f41295q = a1Var;
        q qVar = new q("QUARTER_OF_YEAR", m0.class, m0.Q1, m0.Q4, 103, 'Q');
        f41296t = qVar;
        q qVar2 = new q("MONTH_OF_YEAR", c0.class, c0.JANUARY, c0.DECEMBER, 101, 'M');
        f41297w = qVar2;
        t p12 = t.p("MONTH_AS_NUMBER", 15, 1, 12, 'M');
        f41298x = p12;
        t p13 = t.p("DAY_OF_MONTH", 16, 1, 31, 'd');
        f41299y = p13;
        q qVar3 = new q("DAY_OF_WEEK", x0.class, x0.MONDAY, x0.SUNDAY, 102, 'E');
        f41300z = qVar3;
        t p14 = t.p("DAY_OF_YEAR", 17, 1, 365, 'D');
        A = p14;
        t p15 = t.p("DAY_OF_QUARTER", 18, 1, 92, (char) 0);
        B = p15;
        y0 y0Var = y0.f41609b;
        C = y0Var;
        HashMap hashMap = new HashMap();
        v0(hashMap, iVar);
        v0(hashMap, p11);
        v0(hashMap, a1Var);
        v0(hashMap, qVar);
        v0(hashMap, qVar2);
        v0(hashMap, p12);
        v0(hashMap, p13);
        v0(hashMap, qVar3);
        v0(hashMap, p14);
        v0(hashMap, p15);
        v0(hashMap, y0Var);
        E = Collections.unmodifiableMap(hashMap);
        f fVar = new f(null);
        F = fVar;
        f0.b j11 = f0.b.j(v.class, g0.class, new e(null), fVar);
        b bVar = new b(null);
        net.time4j.f fVar2 = net.time4j.f.DAYS;
        f0.b e11 = j11.e(iVar, bVar, fVar2).e(p11, new d(p11), net.time4j.f.YEARS).e(a1Var, a1.t(g0.class), w0.f41605a).e(qVar, c.j(qVar), net.time4j.f.QUARTERS);
        c j12 = c.j(qVar2);
        net.time4j.f fVar3 = net.time4j.f.MONTHS;
        f0.b e12 = e11.e(qVar2, j12, fVar3).e(p12, new d(p12), fVar3).e(p13, new d(p13), fVar2).e(qVar3, c.j(qVar3), fVar2).e(p14, new d(p14), fVar2).e(p15, new d(p15), fVar2).e(y0Var, new d(19, y0Var), net.time4j.f.WEEKS);
        Y0(e12);
        W0(e12);
        G = e12.h();
    }

    private g0(int i11, int i12, int i13) {
        this.f41301a = i11;
        this.f41302b = (byte) i12;
        this.f41303c = (byte) i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int B0() {
        switch (this.f41302b) {
            case 1:
            case 4:
            case 7:
            case 10:
                return this.f41303c;
            case 2:
            case 8:
            case 11:
                return this.f41303c + 31;
            case 3:
                return (net.time4j.base.b.e(this.f41301a) ? (byte) 60 : (byte) 59) + this.f41303c;
            case 5:
                return this.f41303c + 30;
            case 6:
            case 12:
                return this.f41303c + 61;
            case 9:
                return this.f41303c + 62;
            default:
                throw new AssertionError("Unknown month: " + ((int) this.f41302b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object L0(String str) {
        return E.get(str);
    }

    public static g0 M0(int i11, int i12) {
        if (i12 < 1) {
            throw new IllegalArgumentException("Day of year out of range: " + i12);
        } else if (i12 <= 31) {
            return N0(i11, 1, i12);
        } else {
            int[] iArr = net.time4j.base.b.e(i11) ? f41291m : f41290l;
            for (int i13 = i12 > iArr[6] ? 7 : 1; i13 < 12; i13++) {
                if (i12 <= iArr[i13]) {
                    return O0(i11, i13 + 1, i12 - iArr[i13 - 1], false);
                }
            }
            throw new IllegalArgumentException("Day of year out of range: " + i12);
        }
    }

    public static g0 N0(int i11, int i12, int i13) {
        return O0(i11, i12, i13, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g0 O0(int i11, int i12, int i13, boolean z11) {
        if (z11) {
            net.time4j.base.b.a(i11, i12, i13);
        }
        return new g0(i11, i12, i13);
    }

    public static g0 R0(int i11, int i12, x0 x0Var) {
        return T0(i11, i12, x0Var, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g0 T0(int i11, int i12, x0 x0Var, boolean z11) {
        if (i12 < 1 || i12 > 53) {
            if (z11) {
                throw new IllegalArgumentException(f1(i12));
            }
            return null;
        } else if (z11 && (i11 < f41284f.intValue() || i11 > f41285g.intValue())) {
            throw new IllegalArgumentException(g1(i11));
        } else {
            int value = x0.valueOf(net.time4j.base.b.c(i11, 1, 1)).getValue();
            int value2 = (((value <= 4 ? 2 - value : 9 - value) + ((i12 - 1) * 7)) + x0Var.getValue()) - 1;
            if (value2 <= 0) {
                i11--;
                value2 += net.time4j.base.b.e(i11) ? 366 : 365;
            } else {
                int i13 = net.time4j.base.b.e(i11) ? 366 : 365;
                if (value2 > i13) {
                    value2 -= i13;
                    i11++;
                }
            }
            g0 M0 = M0(i11, value2);
            if (i12 != 53 || M0.H0() == 53) {
                return M0;
            }
            if (z11) {
                throw new IllegalArgumentException(f1(i12));
            }
            return null;
        }
    }

    public static g0 U0(int i11, c0 c0Var, int i12) {
        return O0(i11, c0Var.getValue(), i12, true);
    }

    public static g0 V0(long j11, net.time4j.engine.z zVar) {
        return F.b(net.time4j.engine.z.UTC.transform(j11, zVar));
    }

    private static void W0(f0.b<v, g0> bVar) {
        for (net.time4j.engine.r rVar : net.time4j.base.d.c().g(net.time4j.engine.r.class)) {
            if (rVar.d(g0.class)) {
                bVar.f(rVar);
            }
        }
        bVar.f(new v0());
    }

    private static void Y0(f0.b<v, g0> bVar) {
        net.time4j.f[] values;
        Set<? extends v> range = EnumSet.range(net.time4j.f.MILLENNIA, net.time4j.f.MONTHS);
        Set<? extends v> range2 = EnumSet.range(net.time4j.f.WEEKS, net.time4j.f.DAYS);
        for (net.time4j.f fVar : net.time4j.f.values()) {
            bVar.g(fVar, new f.j<>(fVar), fVar.getLength(), fVar.compareTo(net.time4j.f.WEEKS) < 0 ? range : range2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g0 Z0(int i11) {
        return this.f41303c == i11 ? this : N0(this.f41301a, this.f41302b, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g0 a1(x0 x0Var) {
        x0 C0 = C0();
        return C0 == x0Var ? this : F.b(net.time4j.base.c.f(E0(), x0Var.getValue() - C0.getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g0 b1(int i11) {
        return D0() == i11 ? this : M0(this.f41301a, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g0 d1(int i11) {
        if (this.f41302b == i11) {
            return this;
        }
        return N0(this.f41301a, i11, Math.min(net.time4j.base.b.d(this.f41301a, i11), (int) this.f41303c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g0 e1(int i11) {
        if (this.f41301a == i11) {
            return this;
        }
        return N0(i11, this.f41302b, Math.min(net.time4j.base.b.d(i11, this.f41302b), (int) this.f41303c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String f1(int i11) {
        return "WEEK_OF_YEAR (ISO) out of range: " + i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g1(int i11) {
        return "YEAR_OF_WEEKDATE (ISO) out of range: " + i11;
    }

    private static g0 m0(g0 g0Var, long j11) {
        long f11 = net.time4j.base.c.f(g0Var.f41303c, j11);
        if (f11 >= 1 && f11 <= 28) {
            return N0(g0Var.f41301a, g0Var.f41302b, (int) f11);
        }
        long f12 = net.time4j.base.c.f(g0Var.D0(), j11);
        if (f12 >= 1 && f12 <= 365) {
            return M0(g0Var.f41301a, (int) f12);
        }
        return F.b(net.time4j.base.c.f(g0Var.E0(), j11));
    }

    public static net.time4j.engine.f0<v, g0> r0() {
        return G;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g0 s0(net.time4j.f fVar, g0 g0Var, long j11, int i11) {
        switch (a.f41304a[fVar.ordinal()]) {
            case 1:
                return s0(net.time4j.f.MONTHS, g0Var, net.time4j.base.c.i(j11, 12000L), i11);
            case 2:
                return s0(net.time4j.f.MONTHS, g0Var, net.time4j.base.c.i(j11, 1200L), i11);
            case 3:
                return s0(net.time4j.f.MONTHS, g0Var, net.time4j.base.c.i(j11, 120L), i11);
            case 4:
                return s0(net.time4j.f.MONTHS, g0Var, net.time4j.base.c.i(j11, 12L), i11);
            case 5:
                return s0(net.time4j.f.MONTHS, g0Var, net.time4j.base.c.i(j11, 3L), i11);
            case 6:
                return z0(g0Var, net.time4j.base.c.f(g0Var.F0(), j11), g0Var.f41303c, i11);
            case 7:
                return s0(net.time4j.f.DAYS, g0Var, net.time4j.base.c.i(j11, 7L), i11);
            case 8:
                return m0(g0Var, j11);
            default:
                throw new UnsupportedOperationException(fVar.name());
        }
    }

    private static void v0(Map<String, Object> map, net.time4j.engine.p<?> pVar) {
        map.put(pVar.name(), pVar);
    }

    private static void w0(StringBuilder sb2, int i11) {
        sb2.append(CoreConstants.DASH_CHAR);
        if (i11 < 10) {
            sb2.append('0');
        }
        sb2.append(i11);
    }

    private Object writeReplace() {
        return new SPX(this, 1);
    }

    private static void x0(StringBuilder sb2, int i11) {
        int i12;
        if (i11 < 0) {
            sb2.append(CoreConstants.DASH_CHAR);
            i12 = net.time4j.base.c.j(i11);
        } else {
            i12 = i11;
        }
        if (i12 >= 10000) {
            if (i11 > 0) {
                sb2.append('+');
            }
        } else if (i12 < 1000) {
            sb2.append('0');
            if (i12 < 100) {
                sb2.append('0');
                if (i12 < 10) {
                    sb2.append('0');
                }
            }
        }
        sb2.append(i12);
    }

    public static g0 y0(net.time4j.base.a aVar) {
        if (aVar instanceof g0) {
            return (g0) aVar;
        }
        return N0(aVar.getYear(), aVar.getMonth(), aVar.n());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
        if (r11 == 2) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static net.time4j.g0 z0(net.time4j.g0 r7, long r8, int r10, int r11) {
        /*
            r0 = 2
            r1 = 5
            if (r11 != r1) goto Ld
            byte r1 = r7.f41303c
            int r2 = r7.K0()
            if (r1 != r2) goto Ld
            r11 = r0
        Ld:
            r1 = 12
            long r2 = net.time4j.base.c.b(r8, r1)
            r4 = 1970(0x7b2, double:9.733E-321)
            long r2 = net.time4j.base.c.f(r2, r4)
            int r2 = net.time4j.base.c.g(r2)
            int r1 = net.time4j.base.c.d(r8, r1)
            r3 = 1
            int r1 = r1 + r3
            int r4 = net.time4j.base.b.d(r2, r1)
            if (r10 <= r4) goto L77
            r5 = 1
            switch(r11) {
                case 0: goto L7b;
                case 1: goto L6e;
                case 2: goto L7b;
                case 3: goto L64;
                case 4: goto L45;
                case 5: goto L7b;
                case 6: goto L7b;
                default: goto L2e;
            }
        L2e:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Overflow policy not implemented: "
            r8.append(r9)
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L45:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r8 = 32
            r7.<init>(r8)
            java.lang.String r8 = "Day of month out of range: "
            r7.append(r8)
            x0(r7, r2)
            w0(r7, r1)
            w0(r7, r10)
            net.time4j.engine.ChronoException r8 = new net.time4j.engine.ChronoException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L64:
            long r8 = net.time4j.base.c.f(r8, r5)
            int r10 = r10 - r4
            net.time4j.g0 r7 = z0(r7, r8, r10, r11)
            return r7
        L6e:
            long r8 = net.time4j.base.c.f(r8, r5)
            net.time4j.g0 r7 = z0(r7, r8, r3, r11)
            return r7
        L77:
            if (r10 >= r4) goto L7c
            if (r11 != r0) goto L7c
        L7b:
            r10 = r4
        L7c:
            net.time4j.g0 r7 = N0(r2, r1, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.g0.z0(net.time4j.g0, long, int, int):net.time4j.g0");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.q
    /* renamed from: A0 */
    public g0 s() {
        return this;
    }

    public x0 C0() {
        return x0.valueOf(net.time4j.base.b.c(this.f41301a, this.f41302b, this.f41303c));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.i0, net.time4j.engine.q
    /* renamed from: D */
    public net.time4j.engine.f0<v, g0> r() {
        return G;
    }

    public int D0() {
        byte b11 = this.f41302b;
        if (b11 != 1) {
            if (b11 != 2) {
                return f41290l[b11 - 2] + this.f41303c + (net.time4j.base.b.e(this.f41301a) ? 1 : 0);
            }
            return this.f41303c + 31;
        }
        return this.f41303c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long E0() {
        return F.transform(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long F0() {
        return (((this.f41301a - 1970) * 12) + this.f41302b) - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int H0() {
        return ((Integer) l(z0.f41616l.n())).intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.m
    public int I(net.time4j.engine.g gVar) {
        if (gVar instanceof g0) {
            g0 g0Var = (g0) gVar;
            int i11 = this.f41301a - g0Var.f41301a;
            if (i11 == 0) {
                int i12 = this.f41302b - g0Var.f41302b;
                return i12 == 0 ? this.f41303c - g0Var.f41303c : i12;
            }
            return i11;
        }
        return super.I(gVar);
    }

    public int K0() {
        return net.time4j.base.b.d(this.f41301a, this.f41302b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0 c1(long j11) {
        return F.b(j11);
    }

    @Override // net.time4j.engine.m
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            return this.f41303c == g0Var.f41303c && this.f41302b == g0Var.f41302b && this.f41301a == g0Var.f41301a;
        }
        return false;
    }

    @Override // net.time4j.base.a
    public int getMonth() {
        return this.f41302b;
    }

    @Override // net.time4j.base.a
    public int getYear() {
        return this.f41301a;
    }

    @Override // net.time4j.engine.m
    public int hashCode() {
        int i11 = this.f41301a;
        return (((i11 << 11) + (this.f41302b << 6)) + this.f41303c) ^ (i11 & (-2048));
    }

    @Override // net.time4j.base.a
    public int n() {
        return this.f41303c;
    }

    public i0 o0(h0 h0Var) {
        return i0.Z(this, h0Var);
    }

    public i0 p0() {
        return o0(h0.f41325m);
    }

    public i0 q0(int i11, int i12, int i13) {
        return o0(h0.M0(i11, i12, i13));
    }

    @Override // net.time4j.base.a
    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        x0(sb2, this.f41301a);
        w0(sb2, this.f41302b);
        w0(sb2, this.f41303c);
        return sb2.toString();
    }
}