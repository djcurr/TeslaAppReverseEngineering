package net.time4j.format;

import ch.qos.logback.core.CoreConstants;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: l  reason: collision with root package name */
    private static final Set<String> f41021l;

    /* renamed from: m  reason: collision with root package name */
    private static final f f41022m;

    /* renamed from: n  reason: collision with root package name */
    private static final u f41023n;

    /* renamed from: o  reason: collision with root package name */
    private static final u f41024o;

    /* renamed from: p  reason: collision with root package name */
    private static final ConcurrentMap<String, b> f41025p;

    /* renamed from: a  reason: collision with root package name */
    private final String f41026a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<v, Map<m, s>> f41027b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<v, Map<m, s>> f41028c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<v, Map<m, s>> f41029d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<v, Map<m, s>> f41030e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<v, Map<m, s>> f41031f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<v, s> f41032g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, String> f41033h;

    /* renamed from: i  reason: collision with root package name */
    private final String f41034i;

    /* renamed from: j  reason: collision with root package name */
    private final Locale f41035j;

    /* renamed from: k  reason: collision with root package name */
    private final MissingResourceException f41036k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41037a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f41038b;

        static {
            int[] iArr = new int[e.values().length];
            f41038b = iArr;
            try {
                iArr[e.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41038b[e.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41038b[e.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41038b[e.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[v.values().length];
            f41037a = iArr2;
            try {
                iArr2[v.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41037a[v.ABBREVIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41037a[v.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41037a[v.NARROW.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: net.time4j.format.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private static class C0805b implements u {
        private C0805b() {
        }

        @Override // net.time4j.format.u
        public boolean b(Locale locale) {
            return true;
        }

        @Override // net.time4j.format.u
        public String[] c(String str, Locale locale, v vVar, m mVar) {
            if (vVar == v.NARROW) {
                return new String[]{"1", "2", "3", "4"};
            }
            return new String[]{"Q1", "Q2", "Q3", "Q4"};
        }

        @Override // net.time4j.format.u
        public String[] d(String str, Locale locale, v vVar, m mVar, boolean z11) {
            if (vVar == v.WIDE) {
                return new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13"};
            }
            return new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
        }

        @Override // net.time4j.format.u
        public String[] f(String str, Locale locale, v vVar) {
            if (vVar == v.NARROW) {
                return new String[]{"B", "A"};
            }
            return new String[]{BouncyCastleProvider.PROVIDER_NAME, "AD"};
        }

        @Override // net.time4j.format.u
        public String[] g(String str, Locale locale, v vVar, m mVar) {
            return new String[]{"1", "2", "3", "4", "5", "6", "7"};
        }

        @Override // net.time4j.format.u
        public String[] h(String str, Locale locale, v vVar, m mVar) {
            if (vVar == v.NARROW) {
                return new String[]{"A", "P"};
            }
            return new String[]{"AM", "PM"};
        }

        @Override // net.time4j.format.u
        public boolean j(String str) {
            return true;
        }

        public String toString() {
            return "FallbackProvider";
        }

        /* synthetic */ C0805b(a aVar) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private static class c implements f {

        /* renamed from: a  reason: collision with root package name */
        private final f f41039a;

        c(f fVar) {
            this.f41039a = fVar;
        }

        private static String b(DateFormat dateFormat) {
            if (dateFormat instanceof SimpleDateFormat) {
                return ((SimpleDateFormat) SimpleDateFormat.class.cast(dateFormat)).toPattern();
            }
            throw new IllegalStateException("Cannot retrieve format pattern: " + dateFormat);
        }

        private static int c(e eVar) {
            int i11 = a.f41038b[eVar.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return 3;
                        }
                        throw new UnsupportedOperationException("Unknown: " + eVar);
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }

        @Override // net.time4j.format.f
        public String a(e eVar, Locale locale) {
            String a11;
            f fVar = this.f41039a;
            if (fVar == null) {
                a11 = b(DateFormat.getTimeInstance(c(eVar), locale));
            } else if (fVar instanceof k30.c) {
                a11 = ((k30.c) k30.c.class.cast(fVar)).i(eVar, locale, true);
            } else {
                a11 = fVar.a(eVar, locale);
            }
            return k30.d.a(a11);
        }

        @Override // net.time4j.format.f
        public String e(e eVar, Locale locale) {
            f fVar = this.f41039a;
            if (fVar == null) {
                return b(DateFormat.getDateInstance(c(eVar), locale));
            }
            return fVar.e(eVar, locale);
        }

        @Override // net.time4j.format.f
        public String k(e eVar, e eVar2, Locale locale) {
            f fVar = this.f41039a;
            if (fVar == null) {
                return b(DateFormat.getDateTimeInstance(c(eVar), c(eVar2), locale));
            }
            return this.f41039a.k(eVar, eVar2, locale).replace("{1}", this.f41039a.e(eVar, locale)).replace("{0}", fVar.a(eVar2, locale));
        }
    }

    /* loaded from: classes5.dex */
    private static class d implements u {
        private d() {
        }

        private static String[] a(String[] strArr, int i11) {
            String[] strArr2 = new String[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                if (!strArr[i12].isEmpty()) {
                    strArr2[i12] = e(strArr[i12]);
                } else {
                    strArr2[i12] = String.valueOf(i12 + 1);
                }
            }
            return strArr2;
        }

        private static String e(String str) {
            char charAt = Normalizer.normalize(str, Normalizer.Form.NFD).charAt(0);
            if (charAt < 'A' || charAt > 'Z') {
                if (charAt < 'a' || charAt > 'z') {
                    if (charAt < 1040 || charAt > 1071) {
                        return (charAt < 1072 || charAt > 1103) ? str : String.valueOf((char) (charAt - ' '));
                    }
                    return String.valueOf(charAt);
                }
                return String.valueOf((char) (charAt - ' '));
            }
            return String.valueOf(charAt);
        }

        @Override // net.time4j.format.u
        public boolean b(Locale locale) {
            String language = locale.getLanguage();
            for (Locale locale2 : DateFormatSymbols.getAvailableLocales()) {
                if (locale2.getLanguage().equals(language)) {
                    return true;
                }
            }
            return false;
        }

        @Override // net.time4j.format.u
        public String[] c(String str, Locale locale, v vVar, m mVar) {
            return new String[]{"Q1", "Q2", "Q3", "Q4"};
        }

        @Override // net.time4j.format.u
        public String[] d(String str, Locale locale, v vVar, m mVar, boolean z11) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            int i11 = a.f41037a[vVar.ordinal()];
            if (i11 != 1) {
                if (i11 == 2 || i11 == 3) {
                    return dateFormatSymbols.getShortMonths();
                }
                if (i11 == 4) {
                    return a(dateFormatSymbols.getShortMonths(), 12);
                }
                throw new UnsupportedOperationException(vVar.name());
            }
            return dateFormatSymbols.getMonths();
        }

        @Override // net.time4j.format.u
        public String[] f(String str, Locale locale, v vVar) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            if (vVar == v.NARROW) {
                String[] eras = dateFormatSymbols.getEras();
                String[] strArr = new String[eras.length];
                int length = eras.length;
                for (int i11 = 0; i11 < length; i11++) {
                    if (!eras[i11].isEmpty()) {
                        strArr[i11] = e(eras[i11]);
                    } else if (i11 == 0 && eras.length == 2) {
                        strArr[i11] = "B";
                    } else if (i11 == 1 && eras.length == 2) {
                        strArr[i11] = "A";
                    } else {
                        strArr[i11] = String.valueOf(i11);
                    }
                }
                return strArr;
            }
            return dateFormatSymbols.getEras();
        }

        @Override // net.time4j.format.u
        public String[] g(String str, Locale locale, v vVar, m mVar) {
            String[] weekdays;
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            int i11 = a.f41037a[vVar.ordinal()];
            if (i11 == 1) {
                weekdays = dateFormatSymbols.getWeekdays();
            } else if (i11 == 2 || i11 == 3) {
                weekdays = dateFormatSymbols.getShortWeekdays();
            } else if (i11 == 4) {
                weekdays = a(g("", locale, v.SHORT, mVar), 7);
            } else {
                throw new UnsupportedOperationException("Unknown text width: " + vVar);
            }
            if (weekdays.length > 7) {
                String str2 = weekdays[1];
                String[] strArr = new String[7];
                System.arraycopy(weekdays, 2, strArr, 0, 6);
                strArr[6] = str2;
                return strArr;
            }
            return weekdays;
        }

        @Override // net.time4j.format.u
        public String[] h(String str, Locale locale, v vVar, m mVar) {
            if (vVar == v.NARROW) {
                return new String[]{"A", "P"};
            }
            return DateFormatSymbols.getInstance(locale).getAmPmStrings();
        }

        @Override // net.time4j.format.u
        public boolean j(String str) {
            return "iso8601".equals(str);
        }

        public String toString() {
            return "JDKTextProvider";
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    static {
        f cVar;
        HashSet hashSet = new HashSet();
        hashSet.add("ar");
        hashSet.add("dv");
        hashSet.add("fa");
        hashSet.add("ha");
        hashSet.add("he");
        hashSet.add("iw");
        hashSet.add("ji");
        hashSet.add("ps");
        hashSet.add("sd");
        hashSet.add("ug");
        hashSet.add("ur");
        hashSet.add("yi");
        f41021l = Collections.unmodifiableSet(hashSet);
        Iterator it2 = net.time4j.base.d.c().g(f.class).iterator();
        if (it2.hasNext()) {
            cVar = (f) it2.next();
        } else {
            cVar = new net.time4j.i18n.c();
        }
        f41022m = new c(cVar);
        f41023n = new d(null);
        f41024o = new C0805b(null);
        f41025p = new ConcurrentHashMap();
    }

    private b(String str, Locale locale, u uVar) {
        v[] values;
        v[] values2;
        Class<m> cls = m.class;
        this.f41026a = uVar.toString();
        int i11 = 0;
        Map<v, Map<m, s>> unmodifiableMap = Collections.unmodifiableMap(i(str, locale, uVar, false));
        this.f41027b = unmodifiableMap;
        Map<v, Map<m, s>> i12 = i(str, locale, uVar, true);
        if (i12 == null) {
            this.f41028c = unmodifiableMap;
        } else {
            this.f41028c = Collections.unmodifiableMap(i12);
        }
        EnumMap enumMap = new EnumMap(v.class);
        v[] values3 = v.values();
        int length = values3.length;
        int i13 = 0;
        while (i13 < length) {
            v vVar = values3[i13];
            EnumMap enumMap2 = new EnumMap(cls);
            m[] values4 = m.values();
            int length2 = values4.length;
            int i14 = i11;
            while (i14 < length2) {
                m mVar = values4[i14];
                enumMap2.put((EnumMap) mVar, (m) new s(uVar.c(str, locale, vVar, mVar)));
                i14++;
                values3 = values3;
                length = length;
            }
            enumMap.put((EnumMap) vVar, (v) enumMap2);
            i13++;
            i11 = 0;
        }
        this.f41029d = Collections.unmodifiableMap(enumMap);
        EnumMap enumMap3 = new EnumMap(v.class);
        v[] values5 = v.values();
        int length3 = values5.length;
        for (int i15 = 0; i15 < length3; i15++) {
            v vVar2 = values5[i15];
            EnumMap enumMap4 = new EnumMap(cls);
            m[] values6 = m.values();
            int length4 = values6.length;
            int i16 = 0;
            while (i16 < length4) {
                m mVar2 = values6[i16];
                enumMap4.put((EnumMap) mVar2, (m) new s(uVar.g(str, locale, vVar2, mVar2)));
                i16++;
                values5 = values5;
                length3 = length3;
            }
            enumMap3.put((EnumMap) vVar2, (v) enumMap4);
        }
        this.f41030e = Collections.unmodifiableMap(enumMap3);
        EnumMap enumMap5 = new EnumMap(v.class);
        for (v vVar3 : v.values()) {
            enumMap5.put((EnumMap) vVar3, (v) new s(uVar.f(str, locale, vVar3)));
        }
        this.f41032g = Collections.unmodifiableMap(enumMap5);
        EnumMap enumMap6 = new EnumMap(v.class);
        for (v vVar4 : v.values()) {
            EnumMap enumMap7 = new EnumMap(cls);
            m[] values7 = m.values();
            int length5 = values7.length;
            int i17 = 0;
            while (i17 < length5) {
                m mVar3 = values7[i17];
                enumMap7.put((EnumMap) mVar3, (m) new s(uVar.h(str, locale, vVar4, mVar3)));
                i17++;
                cls = cls;
            }
            enumMap6.put((EnumMap) vVar4, (v) enumMap7);
        }
        this.f41031f = Collections.unmodifiableMap(enumMap6);
        HashMap hashMap = new HashMap();
        MissingResourceException e11 = null;
        try {
            net.time4j.i18n.e h11 = net.time4j.i18n.e.h("calendar/names/" + str + "/" + str, locale);
            for (String str2 : h11.g()) {
                hashMap.put(str2, h11.f(str2));
            }
        } catch (MissingResourceException e12) {
            e11 = e12;
        }
        this.f41033h = Collections.unmodifiableMap(hashMap);
        this.f41034i = str;
        this.f41035j = locale;
        this.f41036k = e11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(net.time4j.engine.w<?> wVar) {
        net.time4j.format.c cVar = (net.time4j.format.c) wVar.p().getAnnotation(net.time4j.format.c.class);
        return cVar == null ? "iso8601" : cVar.value();
    }

    public static b c(String str, Locale locale) {
        Objects.requireNonNull(str, "Missing calendar type.");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(CoreConstants.COLON_CHAR);
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!country.isEmpty()) {
            sb2.append(CoreConstants.DASH_CHAR);
            sb2.append(country);
        }
        String sb3 = sb2.toString();
        b bVar = f41025p.get(sb3);
        if (bVar == null) {
            u uVar = null;
            if (locale.getLanguage().isEmpty() && str.equals("iso8601")) {
                uVar = f41024o;
            } else {
                Iterator it2 = net.time4j.base.d.c().g(u.class).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    u uVar2 = (u) it2.next();
                    if (uVar2.j(str) && uVar2.b(locale)) {
                        uVar = uVar2;
                        break;
                    }
                }
                if (uVar == null) {
                    u uVar3 = f41023n;
                    if (uVar3.j(str) && uVar3.b(locale)) {
                        uVar = uVar3;
                    }
                    if (uVar == null) {
                        uVar = f41024o;
                    }
                }
            }
            b bVar2 = new b(str, locale, uVar);
            b putIfAbsent = f41025p.putIfAbsent(sb3, bVar2);
            return putIfAbsent != null ? putIfAbsent : bVar2;
        }
        return bVar;
    }

    public static b d(Locale locale) {
        return c("iso8601", locale);
    }

    private String e(String str) {
        if (this.f41033h.containsKey("useShortKeys") && "true".equals(this.f41033h.get("useShortKeys"))) {
            if (str.equals("MONTH_OF_YEAR") || str.equals("DAY_OF_WEEK") || str.equals("QUARTER_OF_YEAR") || str.equals("ERA")) {
                return str.substring(0, 1);
            }
            return str.equals("EVANGELIST") ? "EV" : str.equals("SANSCULOTTIDES") ? "S" : str.equals("DAY_OF_DECADE") ? "D" : str;
        }
        return str;
    }

    private static String f(String str, int i11, String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            if (i11 > 0) {
                return null;
            }
            return str;
        } else if (strArr.length < i11) {
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder(str);
            boolean z11 = true;
            for (int i12 = 0; i12 < strArr.length - i11; i12++) {
                if (z11) {
                    sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
                    z11 = false;
                } else {
                    sb2.append('|');
                }
                sb2.append(strArr[i12]);
            }
            if (!z11) {
                sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
            return sb2.toString();
        }
    }

    private static Map<v, Map<m, s>> i(String str, Locale locale, u uVar, boolean z11) {
        int i11;
        m[] mVarArr;
        EnumMap enumMap;
        v vVar;
        EnumMap enumMap2 = new EnumMap(v.class);
        v[] values = v.values();
        int length = values.length;
        boolean z12 = false;
        int i12 = 0;
        while (i12 < length) {
            v vVar2 = values[i12];
            EnumMap enumMap3 = new EnumMap(m.class);
            m[] values2 = m.values();
            int length2 = values2.length;
            boolean z13 = z12;
            int i13 = 0;
            while (i13 < length2) {
                m mVar = values2[i13];
                int i14 = i13;
                String[] d11 = uVar.d(str, locale, vVar2, mVar, z11);
                if (!z11 || z13) {
                    i11 = length2;
                    mVarArr = values2;
                    enumMap = enumMap3;
                    vVar = vVar2;
                } else {
                    i11 = length2;
                    mVarArr = values2;
                    enumMap = enumMap3;
                    vVar = vVar2;
                    z13 = !Arrays.equals(uVar.d(str, locale, vVar2, mVar, false), d11);
                }
                enumMap.put((EnumMap) mVar, (m) new s(d11));
                i13 = i14 + 1;
                length2 = i11;
                values2 = mVarArr;
                enumMap3 = enumMap;
                vVar2 = vVar;
            }
            enumMap2.put((EnumMap) vVar2, (v) enumMap3);
            i12++;
            z12 = z13;
        }
        if (!z11 || z12) {
            return enumMap2;
        }
        return null;
    }

    private s j(v vVar, m mVar, boolean z11) {
        if (z11) {
            return this.f41028c.get(vVar).get(mVar);
        }
        return this.f41027b.get(vVar).get(mVar);
    }

    public static boolean q(Locale locale) {
        return f41021l.contains(locale.getLanguage());
    }

    public static String r(e eVar, Locale locale) {
        return f41022m.e(eVar, locale);
    }

    public static String s(e eVar, e eVar2, Locale locale) {
        return f41022m.k(eVar, eVar2, locale);
    }

    public static String t(e eVar, Locale locale) {
        return f41022m.a(eVar, locale);
    }

    public static String u(e eVar, e eVar2, Locale locale) {
        return k30.d.a(f41022m.k(eVar, eVar2, locale));
    }

    private static String v(String str, int i11, int i12) {
        return str + '_' + (i11 + i12);
    }

    public s b(v vVar) {
        return this.f41032g.get(vVar);
    }

    public s g(v vVar, m mVar) {
        return j(vVar, mVar, true);
    }

    public s h(v vVar, m mVar) {
        return this.f41031f.get(vVar).get(mVar);
    }

    public s k(v vVar, m mVar) {
        return this.f41029d.get(vVar).get(mVar);
    }

    public s l(v vVar, m mVar) {
        return j(vVar, mVar, false);
    }

    public Map<String, String> m() {
        return this.f41033h;
    }

    public <V extends Enum<V>> s n(String str, Class<V> cls, String... strArr) {
        if (this.f41036k == null) {
            V[] enumConstants = cls.getEnumConstants();
            int length = enumConstants.length;
            String[] strArr2 = new String[length];
            String e11 = e(str);
            int i11 = !net.time4j.engine.i.class.isAssignableFrom(cls) ? 1 : 0;
            for (int i12 = 0; i12 < length; i12++) {
                String str2 = null;
                int i13 = 0;
                while (true) {
                    String f11 = f(e11, i13, strArr);
                    if (f11 == null) {
                        break;
                    }
                    String v11 = v(f11, i12, i11);
                    if (this.f41033h.containsKey(v11)) {
                        str2 = v11;
                        break;
                    }
                    i13++;
                }
                if (str2 == null) {
                    if (this.f41033h.containsKey(str)) {
                        strArr2[i12] = this.f41033h.get(str);
                    } else {
                        strArr2[i12] = enumConstants[i12].name();
                    }
                } else {
                    strArr2[i12] = this.f41033h.get(str2);
                }
            }
            return new s(strArr2);
        }
        throw new MissingResourceException(this.f41036k.getMessage(), this.f41036k.getClassName(), this.f41036k.getKey());
    }

    public <V extends Enum<V>> s o(net.time4j.engine.p<V> pVar, String... strArr) {
        return n(pVar.name(), pVar.getType(), strArr);
    }

    public s p(v vVar, m mVar) {
        return this.f41030e.get(vVar).get(mVar);
    }

    public String toString() {
        return this.f41026a + "(" + this.f41034i + "/" + this.f41035j + ")";
    }
}