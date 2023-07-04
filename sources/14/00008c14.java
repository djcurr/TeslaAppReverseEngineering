package net.time4j;

import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.Marker;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class s0 {

    /* renamed from: j  reason: collision with root package name */
    private static final ConcurrentMap<Locale, s0> f41505j = new ConcurrentHashMap();

    /* renamed from: k  reason: collision with root package name */
    private static final x[] f41506k = {f.YEARS, f.MONTHS, f.WEEKS, f.DAYS, h.HOURS, h.MINUTES, h.SECONDS, h.MILLIS, h.MICROS, h.NANOS};

    /* renamed from: l  reason: collision with root package name */
    private static final net.time4j.format.x f41507l;

    /* renamed from: m  reason: collision with root package name */
    private static final net.time4j.format.x f41508m;

    /* renamed from: a  reason: collision with root package name */
    private final Map<x, Map<net.time4j.format.v, Map<net.time4j.format.n, String>>> f41509a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<x, Map<net.time4j.format.n, String>> f41510b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<x, Map<net.time4j.format.n, String>> f41511c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<x, Map<net.time4j.format.n, String>> f41512d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<x, Map<net.time4j.format.n, String>> f41513e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Integer, Map<net.time4j.format.v, String>> f41514f;

    /* renamed from: g  reason: collision with root package name */
    private final String f41515g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<x0, String> f41516h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<x0, String> f41517i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41518a;

        static {
            int[] iArr = new int[net.time4j.format.v.values().length];
            f41518a = iArr;
            try {
                iArr[net.time4j.format.v.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41518a[net.time4j.format.v.ABBREVIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41518a[net.time4j.format.v.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41518a[net.time4j.format.v.NARROW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes5.dex */
    private static class b implements net.time4j.format.x {
        private b() {
        }

        private static String F(String str, String str2, String str3, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            int i11 = a.f41518a[vVar.ordinal()];
            if (i11 != 1) {
                if (i11 == 2 || i11 == 3) {
                    return G(str2, nVar);
                }
                if (i11 == 4) {
                    return "{0}" + str3;
                }
                throw new UnsupportedOperationException(vVar.name());
            }
            return G(str, nVar);
        }

        private static String G(String str, net.time4j.format.n nVar) {
            String str2 = nVar == net.time4j.format.n.ONE ? "" : "s";
            return "{0} " + str + str2;
        }

        private static String H(String str, boolean z11, net.time4j.format.n nVar) {
            String str2 = nVar == net.time4j.format.n.ONE ? "" : "s";
            if (z11) {
                return "in {0} " + str + str2;
            }
            return "{0} " + str + str2 + " ago";
        }

        private static String I(String str, boolean z11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z11 ? Marker.ANY_NON_NULL_MARKER : "-");
            sb2.append("{0} ");
            sb2.append(str);
            return sb2.toString();
        }

        private static String J(String str) {
            return "{0} " + str;
        }

        @Override // net.time4j.format.x
        public String B(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            if (locale.getLanguage().equals("en")) {
                return F("microsecond", "µsec", "µs", vVar, nVar);
            }
            return J("µs");
        }

        @Override // net.time4j.format.x
        public String C(Locale locale, boolean z11, net.time4j.format.n nVar) {
            if (locale.getLanguage().equals("en")) {
                return H("minute", z11, nVar);
            }
            return I("min", z11);
        }

        @Override // net.time4j.format.x
        public String c(Locale locale) {
            return "now";
        }

        @Override // net.time4j.format.x
        public String d(Locale locale, boolean z11, net.time4j.format.n nVar) {
            if (locale.getLanguage().equals("en")) {
                return H("second", z11, nVar);
            }
            return I("s", z11);
        }

        @Override // net.time4j.format.x
        public String e(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            if (locale.getLanguage().equals("en")) {
                return F("minute", "min", "m", vVar, nVar);
            }
            return J("min");
        }

        @Override // net.time4j.format.x
        public String f(Locale locale, boolean z11, net.time4j.format.n nVar) {
            if (locale.getLanguage().equals("en")) {
                return H("month", z11, nVar);
            }
            return I("m", z11);
        }

        @Override // net.time4j.format.x
        public String g(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            if (locale.getLanguage().equals("en")) {
                return F("hour", "hr", "h", vVar, nVar);
            }
            return J("h");
        }

        @Override // net.time4j.format.x
        public String i(Locale locale, boolean z11, net.time4j.format.n nVar) {
            if (locale.getLanguage().equals("en")) {
                return H("week", z11, nVar);
            }
            return I("w", z11);
        }

        @Override // net.time4j.format.x
        public String k(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            if (locale.getLanguage().equals("en")) {
                return F("year", "yr", "y", vVar, nVar);
            }
            return J("y");
        }

        @Override // net.time4j.format.x
        public String l(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            if (locale.getLanguage().equals("en")) {
                return F("second", "sec", "s", vVar, nVar);
            }
            return J("s");
        }

        @Override // net.time4j.format.x
        public String m(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            if (locale.getLanguage().equals("en")) {
                return F("month", "mth", "m", vVar, nVar);
            }
            return J("m");
        }

        @Override // net.time4j.format.x
        public String n(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            if (locale.getLanguage().equals("en")) {
                return F("nanosecond", "nsec", "ns", vVar, nVar);
            }
            return J("ns");
        }

        @Override // net.time4j.format.x
        public String p(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            if (locale.getLanguage().equals("en")) {
                return F("millisecond", "msec", "ms", vVar, nVar);
            }
            return J("ms");
        }

        @Override // net.time4j.format.x
        public String r(Locale locale, boolean z11, net.time4j.format.n nVar) {
            if (locale.getLanguage().equals("en")) {
                return H("hour", z11, nVar);
            }
            return I("h", z11);
        }

        @Override // net.time4j.format.x
        public String s(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            if (locale.getLanguage().equals("en")) {
                return F("day", "day", "d", vVar, nVar);
            }
            return J("d");
        }

        @Override // net.time4j.format.x
        public String t(Locale locale, net.time4j.format.v vVar, int i11) {
            if (i11 >= 2) {
                StringBuilder sb2 = new StringBuilder(i11 * 5);
                for (int i12 = 0; i12 < i11; i12++) {
                    sb2.append(CoreConstants.CURLY_LEFT);
                    sb2.append(i12);
                    sb2.append(CoreConstants.CURLY_RIGHT);
                    if (i12 < i11 - 1) {
                        sb2.append(", ");
                    }
                }
                return sb2.toString();
            }
            throw new IllegalArgumentException("Size must be greater than 1.");
        }

        @Override // net.time4j.format.x
        public String u(Locale locale, boolean z11, net.time4j.format.n nVar) {
            if (locale.getLanguage().equals("en")) {
                return H("day", z11, nVar);
            }
            return I("d", z11);
        }

        @Override // net.time4j.format.x
        public String v(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            if (locale.getLanguage().equals("en")) {
                return F("week", "wk", "w", vVar, nVar);
            }
            return J("w");
        }

        @Override // net.time4j.format.x
        public String z(Locale locale, boolean z11, net.time4j.format.n nVar) {
            if (locale.getLanguage().equals("en")) {
                return H("year", z11, nVar);
            }
            return I("y", z11);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [net.time4j.format.x] */
    static {
        b bVar = new b(null);
        f41508m = bVar;
        Iterator it2 = net.time4j.base.d.c().g(net.time4j.format.x.class).iterator();
        b bVar2 = it2.hasNext() ? (net.time4j.format.x) it2.next() : null;
        if (bVar2 != null) {
            bVar = bVar2;
        }
        f41507l = bVar;
    }

    private s0(Locale locale) {
        String str;
        x0[] values;
        net.time4j.format.v[] values2;
        net.time4j.format.n[] values3;
        net.time4j.format.n[] values4;
        net.time4j.format.n[] values5;
        Class<x0> cls = x0.class;
        Class<net.time4j.format.v> cls2 = net.time4j.format.v.class;
        HashMap hashMap = new HashMap(10);
        HashMap hashMap2 = new HashMap(10);
        HashMap hashMap3 = new HashMap(10);
        HashMap hashMap4 = new HashMap(10);
        HashMap hashMap5 = new HashMap(10);
        HashMap hashMap6 = new HashMap(10);
        x[] xVarArr = f41506k;
        int length = xVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            x xVar = xVarArr[i11];
            EnumMap enumMap = new EnumMap(cls2);
            x[] xVarArr2 = xVarArr;
            net.time4j.format.v[] values6 = net.time4j.format.v.values();
            int i12 = length;
            int length2 = values6.length;
            Class<x0> cls3 = cls;
            int i13 = 0;
            while (i13 < length2) {
                int i14 = length2;
                net.time4j.format.v vVar = values6[i13];
                net.time4j.format.v[] vVarArr = values6;
                EnumMap enumMap2 = new EnumMap(net.time4j.format.n.class);
                net.time4j.format.n[] values7 = net.time4j.format.n.values();
                HashMap hashMap7 = hashMap6;
                int length3 = values7.length;
                Class<net.time4j.format.v> cls4 = cls2;
                int i15 = 0;
                while (i15 < length3) {
                    int i16 = length3;
                    net.time4j.format.n nVar = values7[i15];
                    enumMap2.put((EnumMap) nVar, (net.time4j.format.n) c(locale, xVar, vVar, nVar));
                    i15++;
                    length3 = i16;
                    values7 = values7;
                }
                enumMap.put((EnumMap) vVar, (net.time4j.format.v) Collections.unmodifiableMap(enumMap2));
                i13++;
                length2 = i14;
                values6 = vVarArr;
                hashMap6 = hashMap7;
                cls2 = cls4;
            }
            Class<net.time4j.format.v> cls5 = cls2;
            HashMap hashMap8 = hashMap6;
            hashMap.put(xVar, Collections.unmodifiableMap(enumMap));
            if (!Character.isDigit(xVar.getSymbol())) {
                EnumMap enumMap3 = new EnumMap(net.time4j.format.n.class);
                for (net.time4j.format.n nVar2 : net.time4j.format.n.values()) {
                    enumMap3.put((EnumMap) nVar2, (net.time4j.format.n) d(locale, xVar, false, false, nVar2));
                }
                hashMap2.put(xVar, Collections.unmodifiableMap(enumMap3));
                EnumMap enumMap4 = new EnumMap(net.time4j.format.n.class);
                for (net.time4j.format.n nVar3 : net.time4j.format.n.values()) {
                    enumMap4.put((EnumMap) nVar3, (net.time4j.format.n) d(locale, xVar, false, true, nVar3));
                }
                hashMap4.put(xVar, Collections.unmodifiableMap(enumMap4));
                EnumMap enumMap5 = new EnumMap(net.time4j.format.n.class);
                net.time4j.format.n[] values8 = net.time4j.format.n.values();
                int length4 = values8.length;
                int i17 = 0;
                while (i17 < length4) {
                    net.time4j.format.n nVar4 = values8[i17];
                    enumMap5.put((EnumMap) nVar4, (net.time4j.format.n) d(locale, xVar, true, false, nVar4));
                    i17++;
                    values8 = values8;
                }
                hashMap3.put(xVar, Collections.unmodifiableMap(enumMap5));
                EnumMap enumMap6 = new EnumMap(net.time4j.format.n.class);
                for (net.time4j.format.n nVar5 : net.time4j.format.n.values()) {
                    enumMap6.put((EnumMap) nVar5, (net.time4j.format.n) d(locale, xVar, true, true, nVar5));
                }
                hashMap5.put(xVar, Collections.unmodifiableMap(enumMap6));
            }
            i11++;
            xVarArr = xVarArr2;
            length = i12;
            cls = cls3;
            hashMap6 = hashMap8;
            cls2 = cls5;
        }
        Class<x0> cls6 = cls;
        Class<net.time4j.format.v> cls7 = cls2;
        HashMap hashMap9 = hashMap6;
        int i18 = 2;
        while (i18 <= 7) {
            Integer valueOf = Integer.valueOf(i18);
            Class<net.time4j.format.v> cls8 = cls7;
            EnumMap enumMap7 = new EnumMap(cls8);
            for (net.time4j.format.v vVar2 : net.time4j.format.v.values()) {
                enumMap7.put((EnumMap) vVar2, (net.time4j.format.v) e(locale, vVar2, valueOf.intValue()));
            }
            hashMap9.put(valueOf, Collections.unmodifiableMap(enumMap7));
            i18++;
            cls7 = cls8;
        }
        this.f41509a = Collections.unmodifiableMap(hashMap);
        this.f41510b = Collections.unmodifiableMap(hashMap2);
        this.f41511c = Collections.unmodifiableMap(hashMap3);
        this.f41512d = Collections.unmodifiableMap(hashMap4);
        this.f41513e = Collections.unmodifiableMap(hashMap5);
        this.f41514f = Collections.unmodifiableMap(hashMap9);
        EnumMap enumMap8 = new EnumMap(cls6);
        EnumMap enumMap9 = new EnumMap(cls6);
        x0[] values9 = x0.values();
        int length5 = values9.length;
        int i19 = 0;
        while (true) {
            str = "";
            if (i19 < length5) {
                x0 x0Var = values9[i19];
                enumMap8.put((EnumMap) x0Var, (x0) "");
                enumMap9.put((EnumMap) x0Var, (x0) "");
                i19++;
            } else {
                try {
                    break;
                } catch (MissingResourceException unused) {
                    f41508m.c(locale);
                }
            }
        }
        net.time4j.format.x xVar2 = f41507l;
        xVar2.c(locale);
        if (xVar2 instanceof net.time4j.format.r) {
            net.time4j.format.r rVar = (net.time4j.format.r) net.time4j.format.r.class.cast(xVar2);
            rVar.b(locale);
            str = rVar.o(locale);
            rVar.h(locale);
            for (x0 x0Var2 : x0.values()) {
                enumMap8.put((EnumMap) x0Var2, (x0) rVar.j(x0Var2, locale));
                enumMap9.put((EnumMap) x0Var2, (x0) rVar.A(x0Var2, locale));
            }
        }
        this.f41515g = str;
        this.f41516h = Collections.unmodifiableMap(enumMap8);
        this.f41517i = Collections.unmodifiableMap(enumMap9);
    }

    private static char a(x xVar) {
        char symbol = xVar.getSymbol();
        if (xVar == h.MINUTES) {
            return 'N';
        }
        return symbol;
    }

    private static String c(Locale locale, x xVar, net.time4j.format.v vVar, net.time4j.format.n nVar) {
        try {
            return f(f41507l, locale, a(xVar), vVar, nVar);
        } catch (MissingResourceException unused) {
            return f(f41508m, locale, a(xVar), vVar, nVar);
        }
    }

    private static String d(Locale locale, x xVar, boolean z11, boolean z12, net.time4j.format.n nVar) {
        try {
            return g(f41507l, locale, a(xVar), z11, z12, nVar);
        } catch (MissingResourceException unused) {
            return g(f41508m, locale, a(xVar), z11, z12, nVar);
        }
    }

    private static String e(Locale locale, net.time4j.format.v vVar, int i11) {
        try {
            return f41507l.t(locale, vVar, i11);
        } catch (MissingResourceException unused) {
            return f41508m.t(locale, vVar, i11);
        }
    }

    private static String f(net.time4j.format.x xVar, Locale locale, char c11, net.time4j.format.v vVar, net.time4j.format.n nVar) {
        if (c11 != '3') {
            if (c11 != '6') {
                if (c11 != '9') {
                    if (c11 != 'D') {
                        if (c11 != 'H') {
                            if (c11 != 'S') {
                                if (c11 != 'W') {
                                    if (c11 != 'Y') {
                                        if (c11 != 'M') {
                                            if (c11 == 'N') {
                                                return xVar.e(locale, vVar, nVar);
                                            }
                                            throw new UnsupportedOperationException("Unit-ID: " + c11);
                                        }
                                        return xVar.m(locale, vVar, nVar);
                                    }
                                    return xVar.k(locale, vVar, nVar);
                                }
                                return xVar.v(locale, vVar, nVar);
                            }
                            return xVar.l(locale, vVar, nVar);
                        }
                        return xVar.g(locale, vVar, nVar);
                    }
                    return xVar.s(locale, vVar, nVar);
                }
                return xVar.n(locale, vVar, nVar);
            }
            return xVar.B(locale, vVar, nVar);
        }
        return xVar.p(locale, vVar, nVar);
    }

    private static String g(net.time4j.format.x xVar, Locale locale, char c11, boolean z11, boolean z12, net.time4j.format.n nVar) {
        if (!z12 || !(xVar instanceof net.time4j.format.r)) {
            if (c11 != 'D') {
                if (c11 != 'H') {
                    if (c11 != 'S') {
                        if (c11 != 'W') {
                            if (c11 != 'Y') {
                                if (c11 != 'M') {
                                    if (c11 == 'N') {
                                        return xVar.C(locale, z11, nVar);
                                    }
                                    throw new UnsupportedOperationException("Unit-ID: " + c11);
                                }
                                return xVar.f(locale, z11, nVar);
                            }
                            return xVar.z(locale, z11, nVar);
                        }
                        return xVar.i(locale, z11, nVar);
                    }
                    return xVar.d(locale, z11, nVar);
                }
                return xVar.r(locale, z11, nVar);
            }
            return xVar.u(locale, z11, nVar);
        }
        net.time4j.format.r rVar = (net.time4j.format.r) net.time4j.format.r.class.cast(xVar);
        if (c11 != 'D') {
            if (c11 != 'H') {
                if (c11 != 'S') {
                    if (c11 != 'W') {
                        if (c11 != 'Y') {
                            if (c11 != 'M') {
                                if (c11 == 'N') {
                                    return rVar.E(locale, z11, nVar);
                                }
                                throw new UnsupportedOperationException("Unit-ID: " + c11);
                            }
                            return rVar.D(locale, z11, nVar);
                        }
                        return rVar.q(locale, z11, nVar);
                    }
                    return rVar.x(locale, z11, nVar);
                }
                return rVar.y(locale, z11, nVar);
            }
            return rVar.a(locale, z11, nVar);
        }
        return rVar.w(locale, z11, nVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s0 h(Locale locale) {
        Objects.requireNonNull(locale, "Missing language.");
        ConcurrentMap<Locale, s0> concurrentMap = f41505j;
        s0 s0Var = concurrentMap.get(locale);
        if (s0Var == null) {
            s0 s0Var2 = new s0(locale);
            s0 putIfAbsent = concurrentMap.putIfAbsent(locale, s0Var2);
            return putIfAbsent != null ? putIfAbsent : s0Var2;
        }
        return s0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f41515g;
    }
}