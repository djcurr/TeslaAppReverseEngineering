package net.time4j.i18n;

import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.format.j;

/* loaded from: classes5.dex */
public final class f implements net.time4j.format.i {

    /* renamed from: b  reason: collision with root package name */
    private static final Locale[] f41446b = new Locale[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Set<String> f41447c;

    /* renamed from: d  reason: collision with root package name */
    public static final f f41448d;

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, j> f41449e;

    static {
        j[] values;
        String[] split = e.h("i18n/numbers/symbol", Locale.ROOT).f("locales").split(" ");
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, split);
        f41447c = Collections.unmodifiableSet(hashSet);
        f41448d = new f();
        HashMap hashMap = new HashMap();
        for (j jVar : j.values()) {
            hashMap.put(jVar.getCode(), jVar);
        }
        f41449e = Collections.unmodifiableMap(hashMap);
    }

    private static e g(Locale locale) {
        if (f41447c.contains(d.getAlias(locale))) {
            return e.h("i18n/numbers/symbol", locale);
        }
        return null;
    }

    private static char h(Locale locale, String str, char c11) {
        e g11 = g(locale);
        return (g11 == null || !g11.b(str)) ? c11 : g11.f(str).charAt(0);
    }

    private static String i(Locale locale, String str, String str2) {
        e g11 = g(locale);
        return (g11 == null || !g11.b(str)) ? str2 : g11.f(str);
    }

    @Override // net.time4j.format.i
    public Locale[] a() {
        return f41446b;
    }

    @Override // net.time4j.format.i
    public char b(Locale locale) {
        return h(locale, "separator", net.time4j.format.i.f41250a.b(locale));
    }

    @Override // net.time4j.format.i
    public String c(Locale locale) {
        return i(locale, "plus", net.time4j.format.i.f41250a.c(locale));
    }

    @Override // net.time4j.format.i
    public j d(Locale locale) {
        String i11 = i(locale, "numsys", j.ARABIC.getCode());
        j jVar = f41449e.get(i11);
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException("Unrecognized number system: " + i11 + " (locale=" + locale + CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // net.time4j.format.i
    public String e(Locale locale) {
        return i(locale, "minus", net.time4j.format.i.f41250a.e(locale));
    }

    @Override // net.time4j.format.i
    public char f(Locale locale) {
        return h(locale, "zero", net.time4j.format.i.f41250a.f(locale));
    }

    public String toString() {
        return "SymbolProviderSPI";
    }
}