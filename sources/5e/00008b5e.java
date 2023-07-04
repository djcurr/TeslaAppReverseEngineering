package net.time4j.format.expert;

import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.Marker;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class n implements h<net.time4j.tz.k> {

    /* renamed from: i  reason: collision with root package name */
    private static final net.time4j.tz.p f41185i = net.time4j.tz.p.s(64800);

    /* renamed from: j  reason: collision with root package name */
    private static final ConcurrentMap<Locale, String> f41186j = new ConcurrentHashMap();

    /* renamed from: k  reason: collision with root package name */
    private static final ConcurrentMap<Locale, a> f41187k = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f41188a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f41189b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f41190c;

    /* renamed from: d  reason: collision with root package name */
    private final Locale f41191d;

    /* renamed from: e  reason: collision with root package name */
    private final String f41192e;

    /* renamed from: f  reason: collision with root package name */
    private final String f41193f;

    /* renamed from: g  reason: collision with root package name */
    private final char f41194g;

    /* renamed from: h  reason: collision with root package name */
    private final net.time4j.format.g f41195h;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f41196a;

        /* renamed from: b  reason: collision with root package name */
        private final String f41197b;

        /* renamed from: c  reason: collision with root package name */
        private final int f41198c;

        /* renamed from: d  reason: collision with root package name */
        private final int f41199d;

        a(String str, String str2, int i11, int i12) {
            this.f41196a = str;
            this.f41197b = str2;
            this.f41198c = i11;
            this.f41199d = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(boolean z11) {
        this(z11, true, false, Locale.ROOT, Marker.ANY_NON_NULL_MARKER, "-", '0', net.time4j.format.g.SMART);
    }

    private static boolean a(char c11, char c12) {
        return c11 == c12 || Character.toUpperCase(c11) == Character.toUpperCase(c12) || Character.toLowerCase(c11) == Character.toLowerCase(c12);
    }

    private static String b(Locale locale) {
        ConcurrentMap<Locale, String> concurrentMap = f41186j;
        String str = concurrentMap.get(locale);
        if (str == null) {
            String o11 = net.time4j.tz.p.f41597k.o(locale);
            String putIfAbsent = concurrentMap.putIfAbsent(locale, o11);
            return putIfAbsent != null ? putIfAbsent : o11;
        }
        return str;
    }

    private static net.time4j.tz.p c(net.time4j.engine.o oVar, net.time4j.engine.d dVar) {
        net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f40996d;
        if (dVar.c(cVar)) {
            net.time4j.tz.k kVar = (net.time4j.tz.k) dVar.a(cVar);
            if (kVar instanceof net.time4j.tz.p) {
                return (net.time4j.tz.p) kVar;
            }
        }
        throw new IllegalArgumentException("Cannot extract timezone offset from format attributes for: " + oVar);
    }

    private static a d(Locale locale) {
        a aVar = f41187k.get(locale);
        if (aVar == null) {
            String o11 = f41185i.o(locale);
            int length = o11.length();
            for (int i11 = 0; i11 < length; i11++) {
                if (o11.charAt(i11) == 177) {
                    int indexOf = o11.indexOf("hh", i11) + 2;
                    int indexOf2 = o11.indexOf("mm", indexOf);
                    a aVar2 = new a(o11, o11.substring(indexOf, indexOf2), i11, indexOf2 + 2);
                    a putIfAbsent = f41187k.putIfAbsent(locale, aVar2);
                    return putIfAbsent != null ? putIfAbsent : aVar2;
                }
            }
            return aVar;
        }
        return aVar;
    }

    private static int e(CharSequence charSequence, int i11, char c11) {
        int i12 = 0;
        for (int i13 = 0; i13 < 2; i13++) {
            int i14 = i11 + i13;
            if (i14 >= charSequence.length()) {
                if (i13 == 0) {
                    return -1000;
                }
                return ~i12;
            }
            int charAt = charSequence.charAt(i14) - c11;
            if (charAt < 0 || charAt > 9) {
                if (i13 == 0) {
                    return -1000;
                }
                return ~i12;
            }
            i12 = (i12 * 10) + charAt;
        }
        return i12;
    }

    private static int f(CharSequence charSequence, int i11, char c11) {
        int charAt;
        int i12 = 0;
        for (int i13 = 0; i13 < 2; i13++) {
            int i14 = i11 + i13;
            if (i14 >= charSequence.length() || (charAt = charSequence.charAt(i14) - c11) < 0 || charAt > 9) {
                return -1000;
            }
            i12 = (i12 * 10) + charAt;
        }
        return i12;
    }

    private static int g(CharSequence charSequence, int i11, int i12, Locale locale, boolean z11) {
        String[] strArr = {"GMT", b(locale), "UTC", "UT"};
        for (int i13 = 0; i13 < 4; i13++) {
            String str = strArr[i13];
            int length = str.length();
            if (i11 - i12 >= length) {
                String charSequence2 = charSequence.subSequence(i12, i12 + length).toString();
                if ((z11 && charSequence2.equalsIgnoreCase(str)) || (!z11 && charSequence2.equals(str))) {
                    return length;
                }
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f41188a == ((n) obj).f41188a;
    }

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<net.time4j.tz.k> getElement() {
        return b0.TIMEZONE_OFFSET;
    }

    public int hashCode() {
        return this.f41188a ? 1 : 0;
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.h
    public void parse(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11) {
        boolean booleanValue;
        boolean booleanValue2;
        char charValue;
        int i11;
        Locale locale;
        boolean z12;
        String str;
        String str2;
        net.time4j.tz.f fVar;
        int i12;
        net.time4j.format.g gVar;
        int i13;
        int i14;
        net.time4j.tz.p r11;
        int h11;
        int length = charSequence.length();
        int f11 = sVar.f();
        if (f11 >= length) {
            sVar.k(f11, "Missing localized time zone offset.");
            return;
        }
        Locale locale2 = z11 ? this.f41191d : (Locale) dVar.b(net.time4j.format.a.f40995c, Locale.ROOT);
        boolean q11 = net.time4j.format.b.q(locale2);
        if (z11) {
            booleanValue = this.f41190c;
        } else {
            booleanValue = ((Boolean) dVar.b(net.time4j.format.a.f41006n, Boolean.FALSE)).booleanValue();
        }
        if (z11) {
            booleanValue2 = this.f41189b;
        } else {
            booleanValue2 = ((Boolean) dVar.b(net.time4j.format.a.f41001i, Boolean.TRUE)).booleanValue();
        }
        if (z11) {
            charValue = this.f41194g;
        } else {
            charValue = ((Character) dVar.b(net.time4j.format.a.f41005m, '0')).charValue();
        }
        String str3 = z11 ? this.f41192e : (String) dVar.b(b.f41049g, Marker.ANY_NON_NULL_MARKER);
        String str4 = z11 ? this.f41193f : (String) dVar.b(b.f41050h, "-");
        a d11 = d(locale2);
        int length2 = d11.f41196a.length();
        int i15 = f11;
        net.time4j.tz.p pVar = null;
        int i16 = 0;
        while (i16 < length2) {
            int i17 = length2;
            char charAt = d11.f41196a.charAt(i16);
            if (d11.f41198c > i16 || d11.f41199d <= i16) {
                i11 = f11;
                locale = locale2;
                z12 = q11;
                str = str3;
                str2 = str4;
                if (booleanValue) {
                    continue;
                } else {
                    char charAt2 = i15 < length ? charSequence.charAt(i15) : (char) 0;
                    if ((booleanValue2 || charAt != charAt2) && !(booleanValue2 && a(charAt, charAt2))) {
                        int g11 = g(charSequence, length, i11, locale, booleanValue2);
                        if (g11 > 0) {
                            tVar.E(b0.TIMEZONE_OFFSET, net.time4j.tz.p.f41597k);
                            sVar.l(i11 + g11);
                            return;
                        }
                        sVar.k(i11, "Literal mismatched in localized time zone offset.");
                        return;
                    }
                    i15++;
                }
            } else {
                int h12 = m.h(charSequence, i15, str3, booleanValue2, q11);
                if (h12 == -1) {
                    h12 = m.h(charSequence, i15, str4, booleanValue2, q11);
                    if (h12 == -1) {
                        int g12 = booleanValue ? 0 : g(charSequence, length, f11, locale2, booleanValue2);
                        if (g12 > 0) {
                            tVar.E(b0.TIMEZONE_OFFSET, net.time4j.tz.p.f41597k);
                            sVar.l(f11 + g12);
                            return;
                        }
                        sVar.k(f11, "Missing sign in localized time zone offset.");
                        return;
                    }
                    fVar = net.time4j.tz.f.BEHIND_UTC;
                } else {
                    fVar = net.time4j.tz.f.AHEAD_OF_UTC;
                }
                net.time4j.tz.f fVar2 = fVar;
                int i18 = i15 + h12;
                int e11 = e(charSequence, i18, charValue);
                str = str3;
                if (e11 == -1000) {
                    sVar.k(i18, "Missing hour part in localized time zone offset.");
                    return;
                }
                if (e11 < 0) {
                    e11 = ~e11;
                    i12 = i18 + 1;
                } else {
                    i12 = i18 + 2;
                }
                if (i12 < length) {
                    str2 = str4;
                    if (z11) {
                        gVar = this.f41195h;
                        i11 = f11;
                        locale = locale2;
                    } else {
                        i11 = f11;
                        locale = locale2;
                        gVar = (net.time4j.format.g) dVar.b(net.time4j.format.a.f40998f, net.time4j.format.g.SMART);
                    }
                    int h13 = m.h(charSequence, i12, d11.f41197b, booleanValue2, q11);
                    if (h13 != -1) {
                        i12 += h13;
                    } else if (this.f41188a) {
                        tVar.E(b0.TIMEZONE_OFFSET, net.time4j.tz.p.q(fVar2, e11));
                        sVar.l(i12);
                        return;
                    } else if (gVar.isStrict()) {
                        sVar.k(i12, "Mismatch of localized time zone offset separator.");
                        return;
                    }
                    int f12 = f(charSequence, i12, charValue);
                    if (f12 != -1000) {
                        i15 = i12 + 2;
                        if (i15 >= length || (h11 = m.h(charSequence, i15, d11.f41197b, booleanValue2, q11)) == -1) {
                            z12 = q11;
                            i13 = -1000;
                            i14 = 0;
                        } else {
                            int i19 = i15 + h11;
                            i14 = f(charSequence, i19, charValue);
                            z12 = q11;
                            i13 = -1000;
                            i15 = i14 == -1000 ? i19 - h11 : i19 + 2;
                        }
                        if (i14 != 0 && i14 != i13) {
                            int i21 = (e11 * 3600) + (f12 * 60) + i14;
                            if (fVar2 == net.time4j.tz.f.BEHIND_UTC) {
                                i21 = -i21;
                            }
                            r11 = net.time4j.tz.p.s(i21);
                        } else {
                            r11 = net.time4j.tz.p.r(fVar2, e11, f12);
                        }
                        pVar = r11;
                        i16 = d11.f41199d - 1;
                    } else {
                        sVar.k(i12, "Minute part in localized time zone offset does not match expected pattern mm.");
                        return;
                    }
                } else if (this.f41188a) {
                    tVar.E(b0.TIMEZONE_OFFSET, net.time4j.tz.p.q(fVar2, e11));
                    sVar.l(i12);
                    return;
                } else {
                    sVar.k(i12, "Missing minute part in localized time zone offset.");
                    return;
                }
            }
            f11 = i11;
            locale2 = locale;
            i16++;
            length2 = i17;
            str3 = str;
            str4 = str2;
            q11 = z12;
        }
        net.time4j.tz.p pVar2 = pVar;
        if (pVar2 == null) {
            sVar.k(i15, "Unable to determine localized time zone offset.");
            return;
        }
        tVar.E(b0.TIMEZONE_OFFSET, pVar2);
        sVar.l(i15);
    }

    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) {
        net.time4j.tz.p B;
        char charValue;
        boolean booleanValue;
        int i11;
        net.time4j.tz.p pVar;
        char c11;
        int length;
        int length2 = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        net.time4j.tz.k o11 = oVar.c() ? oVar.o() : null;
        if (o11 == null) {
            B = c(oVar, dVar);
        } else if (o11 instanceof net.time4j.tz.p) {
            B = (net.time4j.tz.p) o11;
        } else if (oVar instanceof net.time4j.base.f) {
            B = net.time4j.tz.l.N(o11).B((net.time4j.base.f) oVar);
        } else {
            throw new IllegalArgumentException("Cannot extract timezone offset from: " + oVar);
        }
        Locale locale = z11 ? this.f41191d : (Locale) dVar.b(net.time4j.format.a.f40995c, Locale.ROOT);
        char c12 = '0';
        if (z11) {
            charValue = this.f41194g;
        } else {
            charValue = ((Character) dVar.b(net.time4j.format.a.f41005m, '0')).charValue();
        }
        String str = z11 ? this.f41192e : (String) dVar.b(b.f41049g, Marker.ANY_NON_NULL_MARKER);
        String str2 = z11 ? this.f41193f : (String) dVar.b(b.f41050h, "-");
        if (z11) {
            booleanValue = this.f41190c;
        } else {
            booleanValue = ((Boolean) dVar.b(net.time4j.format.a.f41006n, Boolean.FALSE)).booleanValue();
        }
        int k11 = B.k();
        int i12 = B.i();
        if (!booleanValue && k11 == 0 && i12 == 0) {
            String b11 = b(locale);
            appendable.append(b11);
            i11 = b11.length();
        } else {
            a d11 = d(locale);
            int length3 = d11.f41196a.length();
            int i13 = 0;
            int i14 = 0;
            while (i14 < length3) {
                char charAt = d11.f41196a.charAt(i14);
                if (d11.f41198c > i14 || d11.f41199d <= i14) {
                    pVar = B;
                    c11 = c12;
                    if (!booleanValue) {
                        appendable.append(charAt);
                        i13++;
                    }
                } else {
                    if (B.n() == net.time4j.tz.f.BEHIND_UTC) {
                        appendable.append(str2);
                        length = str2.length();
                    } else {
                        appendable.append(str);
                        length = str.length();
                    }
                    i13 += length;
                    int f11 = B.f();
                    int g11 = B.g();
                    int h11 = B.h();
                    if (f11 < 10 && !this.f41188a) {
                        appendable.append(charValue);
                        i13++;
                    }
                    String valueOf = String.valueOf(f11);
                    pVar = B;
                    for (int i15 = 0; i15 < valueOf.length(); i15++) {
                        appendable.append((char) ((valueOf.charAt(i15) - '0') + charValue));
                        i13++;
                    }
                    if (g11 != 0 || h11 != 0 || !this.f41188a) {
                        appendable.append(d11.f41197b);
                        i13 += d11.f41197b.length();
                        if (g11 < 10) {
                            appendable.append(charValue);
                            i13++;
                        }
                        String valueOf2 = String.valueOf(g11);
                        for (int i16 = 0; i16 < valueOf2.length(); i16++) {
                            appendable.append((char) ((valueOf2.charAt(i16) - '0') + charValue));
                            i13++;
                        }
                        if (h11 != 0) {
                            appendable.append(d11.f41197b);
                            i13 += d11.f41197b.length();
                            if (h11 < 10) {
                                appendable.append(charValue);
                                i13++;
                            }
                            String valueOf3 = String.valueOf(h11);
                            for (int i17 = 0; i17 < valueOf3.length(); i17++) {
                                appendable.append((char) ((valueOf3.charAt(i17) - '0') + charValue));
                                i13++;
                            }
                        }
                    }
                    c11 = '0';
                    i14 = d11.f41199d - 1;
                }
                i14++;
                c12 = c11;
                B = pVar;
            }
            i11 = i13;
        }
        if (length2 != -1 && i11 > 0 && set != null) {
            set.add(new g(b0.TIMEZONE_ID, length2, length2 + i11));
        }
        return i11;
    }

    @Override // net.time4j.format.expert.h
    public h<net.time4j.tz.k> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        return new n(this.f41188a, ((Boolean) dVar.b(net.time4j.format.a.f41001i, Boolean.TRUE)).booleanValue(), ((Boolean) dVar.b(net.time4j.format.a.f41006n, Boolean.FALSE)).booleanValue(), (Locale) dVar.b(net.time4j.format.a.f40995c, Locale.ROOT), (String) dVar.b(b.f41049g, Marker.ANY_NON_NULL_MARKER), (String) dVar.b(b.f41050h, "-"), ((Character) dVar.b(net.time4j.format.a.f41005m, '0')).charValue(), (net.time4j.format.g) dVar.b(net.time4j.format.a.f40998f, net.time4j.format.g.SMART));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(n.class.getName());
        sb2.append("[abbreviated=");
        sb2.append(this.f41188a);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h<net.time4j.tz.k> withElement(net.time4j.engine.p<net.time4j.tz.k> pVar) {
        return this;
    }

    private n(boolean z11, boolean z12, boolean z13, Locale locale, String str, String str2, char c11, net.time4j.format.g gVar) {
        this.f41188a = z11;
        this.f41189b = z12;
        this.f41190c = z13;
        this.f41191d = locale;
        this.f41192e = str;
        this.f41193f = str2;
        this.f41194g = c11;
        this.f41195h = gVar;
    }
}