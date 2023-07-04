package net.time4j.format.expert;

import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.time4j.format.a;
import org.slf4j.Marker;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class b implements net.time4j.engine.d {

    /* renamed from: g  reason: collision with root package name */
    static final net.time4j.engine.c<String> f41049g = net.time4j.format.a.e("PLUS_SIGN", String.class);

    /* renamed from: h  reason: collision with root package name */
    static final net.time4j.engine.c<String> f41050h = net.time4j.format.a.e("MINUS_SIGN", String.class);

    /* renamed from: i  reason: collision with root package name */
    private static final net.time4j.format.i f41051i;

    /* renamed from: j  reason: collision with root package name */
    private static final char f41052j;

    /* renamed from: k  reason: collision with root package name */
    private static final ConcurrentMap<String, a> f41053k;

    /* renamed from: l  reason: collision with root package name */
    private static final a f41054l;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f41055a;

    /* renamed from: b  reason: collision with root package name */
    private final net.time4j.format.a f41056b;

    /* renamed from: c  reason: collision with root package name */
    private final Locale f41057c;

    /* renamed from: d  reason: collision with root package name */
    private final int f41058d;

    /* renamed from: e  reason: collision with root package name */
    private final int f41059e;

    /* renamed from: f  reason: collision with root package name */
    private final net.time4j.engine.n<net.time4j.engine.o> f41060f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final net.time4j.format.j f41061a;

        /* renamed from: b  reason: collision with root package name */
        private final char f41062b;

        /* renamed from: c  reason: collision with root package name */
        private final char f41063c;

        /* renamed from: d  reason: collision with root package name */
        private final String f41064d;

        /* renamed from: e  reason: collision with root package name */
        private final String f41065e;

        a(net.time4j.format.j jVar, char c11, char c12, String str, String str2) {
            this.f41061a = jVar;
            this.f41062b = c11;
            this.f41063c = c12;
            this.f41064d = str;
            this.f41065e = str2;
        }
    }

    static {
        net.time4j.format.i iVar = null;
        int i11 = 0;
        for (net.time4j.format.i iVar2 : net.time4j.base.d.c().g(net.time4j.format.i.class)) {
            int length = iVar2.a().length;
            if (length > i11) {
                iVar = iVar2;
                i11 = length;
            }
        }
        if (iVar == null) {
            iVar = net.time4j.i18n.f.f41448d;
        }
        f41051i = iVar;
        char c11 = Boolean.getBoolean("net.time4j.format.iso.decimal.dot") ? CoreConstants.DOT : CoreConstants.COMMA_CHAR;
        f41052j = c11;
        f41053k = new ConcurrentHashMap();
        f41054l = new a(net.time4j.format.j.ARABIC, '0', c11, Marker.ANY_NON_NULL_MARKER, "-");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(net.time4j.format.a aVar, Locale locale) {
        this(aVar, locale, 0, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b d(net.time4j.engine.w<?> wVar, net.time4j.format.a aVar, Locale locale) {
        a.b bVar = new a.b(wVar);
        bVar.d(net.time4j.format.a.f40998f, net.time4j.format.g.SMART);
        bVar.d(net.time4j.format.a.f40999g, net.time4j.format.v.WIDE);
        bVar.d(net.time4j.format.a.f41000h, net.time4j.format.m.FORMAT);
        bVar.b(net.time4j.format.a.f41008p, ' ');
        bVar.f(aVar);
        return new b(bVar.a(), locale).n(locale);
    }

    private static boolean j(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b k(b bVar, b bVar2) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(bVar2.f41055a);
        hashMap.putAll(bVar.f41055a);
        return new b(new a.b().f(bVar2.f41056b).f(bVar.f41056b).a(), Locale.ROOT, 0, 0, null, hashMap).n(bVar.f41057c);
    }

    @Override // net.time4j.engine.d
    public <A> A a(net.time4j.engine.c<A> cVar) {
        if (this.f41055a.containsKey(cVar.name())) {
            return cVar.type().cast(this.f41055a.get(cVar.name()));
        }
        return (A) this.f41056b.a(cVar);
    }

    @Override // net.time4j.engine.d
    public <A> A b(net.time4j.engine.c<A> cVar, A a11) {
        if (this.f41055a.containsKey(cVar.name())) {
            return cVar.type().cast(this.f41055a.get(cVar.name()));
        }
        return (A) this.f41056b.b(cVar, a11);
    }

    @Override // net.time4j.engine.d
    public boolean c(net.time4j.engine.c<?> cVar) {
        if (this.f41055a.containsKey(cVar.name())) {
            return true;
        }
        return this.f41056b.c(cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public net.time4j.format.a e() {
        return this.f41056b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f41056b.equals(bVar.f41056b) && this.f41057c.equals(bVar.f41057c) && this.f41058d == bVar.f41058d && this.f41059e == bVar.f41059e && j(this.f41060f, bVar.f41060f) && this.f41055a.equals(bVar.f41055a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public net.time4j.engine.n<net.time4j.engine.o> f() {
        return this.f41060f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f41058d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Locale h() {
        return this.f41057c;
    }

    public int hashCode() {
        return (this.f41056b.hashCode() * 7) + (this.f41055a.hashCode() * 37);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.f41059e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b l(net.time4j.format.a aVar) {
        return new b(aVar, this.f41057c, this.f41058d, this.f41059e, this.f41060f, this.f41055a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <A> b m(net.time4j.engine.c<A> cVar, A a11) {
        HashMap hashMap = new HashMap(this.f41055a);
        if (a11 == null) {
            hashMap.remove(cVar.name());
        } else {
            hashMap.put(cVar.name(), a11);
        }
        return new b(this.f41056b, this.f41057c, this.f41058d, this.f41059e, this.f41060f, hashMap);
    }

    b n(Locale locale) {
        String str;
        String str2;
        a.b bVar = new a.b();
        bVar.f(this.f41056b);
        String alias = net.time4j.i18n.d.getAlias(locale);
        String country = locale.getCountry();
        if (alias.isEmpty() && country.isEmpty()) {
            locale = Locale.ROOT;
            bVar.d(net.time4j.format.a.f41004l, net.time4j.format.j.ARABIC);
            bVar.b(net.time4j.format.a.f41007o, f41052j);
            str = Marker.ANY_NON_NULL_MARKER;
            str2 = "-";
        } else {
            if (!country.isEmpty()) {
                alias = alias + "_" + country;
            }
            a aVar = f41053k.get(alias);
            if (aVar == null) {
                try {
                    net.time4j.format.i iVar = f41051i;
                    aVar = new a(iVar.d(locale), iVar.f(locale), iVar.b(locale), iVar.c(locale), iVar.e(locale));
                } catch (RuntimeException unused) {
                    aVar = f41054l;
                }
                a putIfAbsent = f41053k.putIfAbsent(alias, aVar);
                if (putIfAbsent != null) {
                    aVar = putIfAbsent;
                }
            }
            bVar.d(net.time4j.format.a.f41004l, aVar.f41061a);
            bVar.b(net.time4j.format.a.f41005m, aVar.f41062b);
            bVar.b(net.time4j.format.a.f41007o, aVar.f41063c);
            str = aVar.f41064d;
            str2 = aVar.f41065e;
        }
        Locale locale2 = locale;
        bVar.h(locale2);
        HashMap hashMap = new HashMap(this.f41055a);
        hashMap.put(f41049g.name(), str);
        hashMap.put(f41050h.name(), str2);
        return new b(bVar.a(), locale2, this.f41058d, this.f41059e, this.f41060f, hashMap);
    }

    public String toString() {
        return b.class.getName() + "[attributes=" + this.f41056b + ",locale=" + this.f41057c + ",level=" + this.f41058d + ",section=" + this.f41059e + ",print-condition=" + this.f41060f + ",other=" + this.f41055a + ']';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(net.time4j.format.a aVar, Locale locale, int i11, int i12, net.time4j.engine.n<net.time4j.engine.o> nVar) {
        Objects.requireNonNull(aVar, "Missing format attributes.");
        this.f41056b = aVar;
        this.f41057c = locale == null ? Locale.ROOT : locale;
        this.f41058d = i11;
        this.f41059e = i12;
        this.f41060f = nVar;
        this.f41055a = Collections.emptyMap();
    }

    private b(net.time4j.format.a aVar, Locale locale, int i11, int i12, net.time4j.engine.n<net.time4j.engine.o> nVar, Map<String, Object> map) {
        Objects.requireNonNull(aVar, "Missing format attributes.");
        this.f41056b = aVar;
        this.f41057c = locale == null ? Locale.ROOT : locale;
        this.f41058d = i11;
        this.f41059e = i12;
        this.f41060f = nVar;
        this.f41055a = Collections.unmodifiableMap(map);
    }
}