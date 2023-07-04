package net.time4j.format;

import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import net.time4j.engine.d0;

/* loaded from: classes5.dex */
public final class a implements net.time4j.engine.d {

    /* renamed from: b  reason: collision with root package name */
    public static final net.time4j.engine.c<String> f40994b = q.a("CALENDAR_TYPE", String.class);

    /* renamed from: c  reason: collision with root package name */
    public static final net.time4j.engine.c<Locale> f40995c = q.a("LANGUAGE", Locale.class);

    /* renamed from: d  reason: collision with root package name */
    public static final net.time4j.engine.c<net.time4j.tz.k> f40996d = q.a("TIMEZONE_ID", net.time4j.tz.k.class);

    /* renamed from: e  reason: collision with root package name */
    public static final net.time4j.engine.c<net.time4j.tz.o> f40997e = q.a("TRANSITION_STRATEGY", net.time4j.tz.o.class);

    /* renamed from: f  reason: collision with root package name */
    public static final net.time4j.engine.c<g> f40998f = q.a("LENIENCY", g.class);

    /* renamed from: g  reason: collision with root package name */
    public static final net.time4j.engine.c<v> f40999g = q.a("TEXT_WIDTH", v.class);

    /* renamed from: h  reason: collision with root package name */
    public static final net.time4j.engine.c<m> f41000h = q.a("OUTPUT_CONTEXT", m.class);

    /* renamed from: i  reason: collision with root package name */
    public static final net.time4j.engine.c<Boolean> f41001i = q.a("PARSE_CASE_INSENSITIVE", Boolean.class);

    /* renamed from: j  reason: collision with root package name */
    public static final net.time4j.engine.c<Boolean> f41002j = q.a("PARSE_PARTIAL_COMPARE", Boolean.class);

    /* renamed from: k  reason: collision with root package name */
    public static final net.time4j.engine.c<Boolean> f41003k = q.a("PARSE_MULTIPLE_CONTEXT", Boolean.class);

    /* renamed from: l  reason: collision with root package name */
    public static final net.time4j.engine.c<j> f41004l = q.a("NUMBER_SYSTEM", j.class);

    /* renamed from: m  reason: collision with root package name */
    public static final net.time4j.engine.c<Character> f41005m = q.a("ZERO_DIGIT", Character.class);

    /* renamed from: n  reason: collision with root package name */
    public static final net.time4j.engine.c<Boolean> f41006n = q.a("NO_GMT_PREFIX", Boolean.class);

    /* renamed from: o  reason: collision with root package name */
    public static final net.time4j.engine.c<Character> f41007o = q.a("DECIMAL_SEPARATOR", Character.class);

    /* renamed from: p  reason: collision with root package name */
    public static final net.time4j.engine.c<Character> f41008p = q.a("PAD_CHAR", Character.class);

    /* renamed from: q  reason: collision with root package name */
    public static final net.time4j.engine.c<Integer> f41009q = q.a("PIVOT_YEAR", Integer.class);

    /* renamed from: r  reason: collision with root package name */
    public static final net.time4j.engine.c<Boolean> f41010r = q.a("TRAILING_CHARACTERS", Boolean.class);

    /* renamed from: s  reason: collision with root package name */
    public static final net.time4j.engine.c<Integer> f41011s = q.a("PROTECTED_CHARACTERS", Integer.class);

    /* renamed from: t  reason: collision with root package name */
    public static final net.time4j.engine.c<String> f41012t = q.a("CALENDAR_VARIANT", String.class);

    /* renamed from: u  reason: collision with root package name */
    public static final net.time4j.engine.c<d0> f41013u = q.a("START_OF_DAY", d0.class);

    /* renamed from: v  reason: collision with root package name */
    public static final net.time4j.engine.c<Boolean> f41014v = q.a("FOUR_DIGIT_YEAR", Boolean.class);

    /* renamed from: w  reason: collision with root package name */
    public static final net.time4j.engine.c<m30.f> f41015w = q.a("TIME_SCALE", m30.f.class);

    /* renamed from: x  reason: collision with root package name */
    public static final net.time4j.engine.c<String> f41016x = q.a("FORMAT_PATTERN", String.class);

    /* renamed from: y  reason: collision with root package name */
    private static final a f41017y = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f41018a;

    /* renamed from: net.time4j.format.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class C0804a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41019a;

        static {
            int[] iArr = new int[g.values().length];
            f41019a = iArr;
            try {
                iArr[g.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41019a[g.SMART.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41019a[g.LAX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* synthetic */ a(Map map, C0804a c0804a) {
        this(map);
    }

    public static <A> net.time4j.engine.c<A> e(String str, Class<A> cls) {
        return q.a(str, cls);
    }

    public static a f() {
        return f41017y;
    }

    @Override // net.time4j.engine.d
    public <A> A a(net.time4j.engine.c<A> cVar) {
        Object obj = this.f41018a.get(cVar.name());
        if (obj != null) {
            return cVar.type().cast(obj);
        }
        throw new NoSuchElementException(cVar.name());
    }

    @Override // net.time4j.engine.d
    public <A> A b(net.time4j.engine.c<A> cVar, A a11) {
        Object obj = this.f41018a.get(cVar.name());
        return obj == null ? a11 : cVar.type().cast(obj);
    }

    @Override // net.time4j.engine.d
    public boolean c(net.time4j.engine.c<?> cVar) {
        return this.f41018a.containsKey(cVar.name());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f41018a.equals(((a) obj).f41018a);
        }
        return false;
    }

    public int hashCode() {
        return this.f41018a.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.f41018a.size() * 32);
        sb2.append(a.class.getName());
        sb2.append('[');
        sb2.append(this.f41018a);
        sb2.append(']');
        return sb2.toString();
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, Object> f41020a = new HashMap();

        public b() {
        }

        private <A> void g(net.time4j.engine.c<A> cVar, A a11) {
            if (a11 != null) {
                this.f41020a.put(cVar.name(), a11);
                return;
            }
            throw new NullPointerException("Missing attribute value for key: " + cVar);
        }

        public a a() {
            return new a(this.f41020a, null);
        }

        public b b(net.time4j.engine.c<Character> cVar, char c11) {
            this.f41020a.put(cVar.name(), Character.valueOf(c11));
            return this;
        }

        public b c(net.time4j.engine.c<Integer> cVar, int i11) {
            if (cVar == a.f41009q && i11 < 100) {
                throw new IllegalArgumentException("Pivot year in far past not supported: " + i11);
            }
            this.f41020a.put(cVar.name(), Integer.valueOf(i11));
            return this;
        }

        public <A extends Enum<A>> b d(net.time4j.engine.c<A> cVar, A a11) {
            if (a11 != null) {
                this.f41020a.put(cVar.name(), a11);
                if (cVar == a.f40998f) {
                    int i11 = C0804a.f41019a[((g) g.class.cast(a11)).ordinal()];
                    if (i11 == 1) {
                        e(a.f41001i, false);
                        e(a.f41002j, false);
                        e(a.f41010r, false);
                        e(a.f41003k, false);
                    } else if (i11 == 2) {
                        e(a.f41001i, true);
                        e(a.f41002j, false);
                        e(a.f41010r, false);
                        e(a.f41003k, true);
                    } else if (i11 == 3) {
                        e(a.f41001i, true);
                        e(a.f41002j, true);
                        e(a.f41010r, true);
                        e(a.f41003k, true);
                    } else {
                        throw new UnsupportedOperationException(a11.name());
                    }
                } else if (cVar == a.f41004l) {
                    j jVar = (j) j.class.cast(a11);
                    if (jVar.isDecimal()) {
                        b(a.f41005m, jVar.getDigits().charAt(0));
                    }
                }
                return this;
            }
            throw new NullPointerException("Missing attribute value for key: " + cVar);
        }

        public b e(net.time4j.engine.c<Boolean> cVar, boolean z11) {
            this.f41020a.put(cVar.name(), Boolean.valueOf(z11));
            return this;
        }

        public b f(a aVar) {
            this.f41020a.putAll(aVar.f41018a);
            return this;
        }

        public b h(Locale locale) {
            g(a.f40995c, locale);
            return this;
        }

        public b i(net.time4j.tz.k kVar) {
            g(a.f40996d, kVar);
            return this;
        }

        public b(net.time4j.engine.w<?> wVar) {
            g(a.f40994b, net.time4j.format.b.a(wVar));
        }
    }

    private a() {
        this.f41018a = Collections.emptyMap();
    }

    private a(Map<String, Object> map) {
        this.f41018a = Collections.unmodifiableMap(new HashMap(map));
    }
}