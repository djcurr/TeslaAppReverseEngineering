package com.facebook.hermes.intl;

import android.os.Build;
import com.facebook.hermes.intl.c;
import com.facebook.hermes.intl.i;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.PaymentMethodOptionsParams;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@xf.a
/* loaded from: classes3.dex */
public class NumberFormat {

    /* renamed from: v  reason: collision with root package name */
    private static String[] f11155v = {"acre", "bit", "byte", "celsius", "centimeter", "day", "degree", "fahrenheit", "fluid-ounce", "foot", "gallon", "gigabit", "gigabyte", "gram", "hectare", "hour", "inch", "kilobit", "kilobyte", "kilogram", "kilometer", "liter", "megabit", "megabyte", "meter", "mile", "mile-scandinavian", "milliliter", "millimeter", "millisecond", "minute", "month", "ounce", "percent", "petabyte", "pound", "second", "stone", "terabit", "terabyte", "week", "yard", "year"};

    /* renamed from: a  reason: collision with root package name */
    private c.h f11156a;

    /* renamed from: f  reason: collision with root package name */
    private c.i f11161f;

    /* renamed from: m  reason: collision with root package name */
    private c.f f11168m;

    /* renamed from: o  reason: collision with root package name */
    private c f11170o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f11171p;

    /* renamed from: s  reason: collision with root package name */
    private c.b f11174s;

    /* renamed from: b  reason: collision with root package name */
    private String f11157b = null;

    /* renamed from: c  reason: collision with root package name */
    private c.EnumC0213c f11158c = c.EnumC0213c.SYMBOL;

    /* renamed from: d  reason: collision with root package name */
    private c.d f11159d = c.d.STANDARD;

    /* renamed from: e  reason: collision with root package name */
    private String f11160e = null;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11162g = true;

    /* renamed from: h  reason: collision with root package name */
    private int f11163h = -1;

    /* renamed from: i  reason: collision with root package name */
    private int f11164i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f11165j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f11166k = -1;

    /* renamed from: l  reason: collision with root package name */
    private int f11167l = -1;

    /* renamed from: n  reason: collision with root package name */
    private c.g f11169n = c.g.AUTO;

    /* renamed from: q  reason: collision with root package name */
    private String f11172q = null;

    /* renamed from: r  reason: collision with root package name */
    private c.e f11173r = null;

    /* renamed from: t  reason: collision with root package name */
    private ye.b<?> f11175t = null;

    /* renamed from: u  reason: collision with root package name */
    private ye.b<?> f11176u = null;

    @xf.a
    public NumberFormat(List<String> list, Map<String, Object> map) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f11170o = new p();
        } else {
            this.f11170o = new o();
        }
        a(list, map);
        this.f11170o.k(this.f11175t, this.f11171p ? "" : this.f11172q, this.f11156a, this.f11159d, this.f11173r, this.f11174s).d(this.f11157b, this.f11158c).g(this.f11162g).f(this.f11163h).e(this.f11168m, this.f11166k, this.f11167l).h(this.f11168m, this.f11164i, this.f11165j).j(this.f11169n).i(this.f11160e, this.f11161f);
    }

    private void a(List<String> list, Map<String, Object> map) {
        Object p11;
        Object p12;
        int n11;
        Object q11 = ye.d.q();
        i.a aVar = i.a.STRING;
        ye.d.c(q11, "localeMatcher", i.c(map, "localeMatcher", aVar, ye.a.f59450a, "best fit"));
        Object c11 = i.c(map, "numberingSystem", aVar, ye.d.d(), ye.d.d());
        if (!ye.d.n(c11) && !b(ye.d.h(c11))) {
            throw new JSRangeErrorException("Invalid numbering system !");
        }
        ye.d.c(q11, "nu", c11);
        HashMap<String, Object> a11 = h.a(list, q11, Collections.singletonList("nu"));
        ye.b<?> bVar = (ye.b) ye.d.g(a11).get("locale");
        this.f11175t = bVar;
        this.f11176u = bVar.d();
        Object a12 = ye.d.a(a11, "nu");
        if (!ye.d.j(a12)) {
            this.f11171p = false;
            this.f11172q = ye.d.h(a12);
        } else {
            this.f11171p = true;
            this.f11172q = this.f11170o.c(this.f11175t);
        }
        h(map);
        if (this.f11156a == c.h.CURRENCY) {
            if (Build.VERSION.SDK_INT >= 24) {
                n11 = p.n(this.f11157b);
            } else {
                n11 = o.n(this.f11157b);
            }
            double d11 = n11;
            p11 = ye.d.p(d11);
            p12 = ye.d.p(d11);
        } else {
            p11 = ye.d.p(0.0d);
            p12 = this.f11156a == c.h.PERCENT ? ye.d.p(0.0d) : ye.d.p(3.0d);
        }
        this.f11173r = (c.e) i.d(c.e.class, ye.d.h(i.c(map, "notation", aVar, new String[]{"standard", "scientific", "engineering", "compact"}, "standard")));
        g(map, p11, p12);
        Object c12 = i.c(map, "compactDisplay", aVar, new String[]{"short", "long"}, "short");
        if (this.f11173r == c.e.COMPACT) {
            this.f11174s = (c.b) i.d(c.b.class, ye.d.h(c12));
        }
        this.f11162g = ye.d.e(i.c(map, "useGrouping", i.a.BOOLEAN, ye.d.d(), ye.d.o(true)));
        this.f11169n = (c.g) i.d(c.g.class, ye.d.h(i.c(map, "signDisplay", aVar, new String[]{"auto", PermissionsResponse.PERMISSION_EXPIRES_NEVER, PermissionsResponse.SCOPE_ALWAYS, "exceptZero"}, "auto")));
    }

    private boolean b(String str) {
        return ye.c.o(str, 0, str.length() - 1);
    }

    private boolean c(String str) {
        return Arrays.binarySearch(f11155v, str) >= 0;
    }

    private boolean d(String str) {
        return f(str).matches("^[A-Z][A-Z][A-Z]$");
    }

    private boolean e(String str) {
        if (c(str)) {
            return true;
        }
        int indexOf = str.indexOf("-per-");
        return indexOf >= 0 && str.indexOf("-per-", indexOf + 1) < 0 && c(str.substring(0, indexOf)) && c(str.substring(indexOf + 5));
    }

    private String f(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt >= 'a' && charAt <= 'z') {
                sb2.append((char) (charAt - ' '));
            } else {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }

    private void g(Map<String, Object> map, Object obj, Object obj2) {
        Object b11 = i.b(map, "minimumIntegerDigits", ye.d.p(1.0d), ye.d.p(21.0d), ye.d.p(1.0d));
        Object a11 = ye.d.a(map, "minimumFractionDigits");
        Object a12 = ye.d.a(map, "maximumFractionDigits");
        Object a13 = ye.d.a(map, "minimumSignificantDigits");
        Object a14 = ye.d.a(map, "maximumSignificantDigits");
        this.f11163h = (int) Math.floor(ye.d.f(b11));
        if (ye.d.n(a13) && ye.d.n(a14)) {
            if (ye.d.n(a11) && ye.d.n(a12)) {
                c.e eVar = this.f11173r;
                if (eVar == c.e.COMPACT) {
                    this.f11168m = c.f.COMPACT_ROUNDING;
                    return;
                } else if (eVar == c.e.ENGINEERING) {
                    this.f11168m = c.f.FRACTION_DIGITS;
                    this.f11165j = 5;
                    return;
                } else {
                    this.f11168m = c.f.FRACTION_DIGITS;
                    this.f11164i = (int) Math.floor(ye.d.f(obj));
                    this.f11165j = (int) Math.floor(ye.d.f(obj2));
                    return;
                }
            }
            this.f11168m = c.f.FRACTION_DIGITS;
            Object a15 = i.a(a11, ye.d.p(0.0d), ye.d.p(20.0d), obj);
            Object a16 = i.a(a12, a15, ye.d.p(20.0d), ye.d.p(Math.max(ye.d.f(a15), ye.d.f(obj2))));
            this.f11164i = (int) Math.floor(ye.d.f(a15));
            this.f11165j = (int) Math.floor(ye.d.f(a16));
            return;
        }
        this.f11168m = c.f.SIGNIFICANT_DIGITS;
        Object a17 = i.a(a13, ye.d.p(1.0d), ye.d.p(21.0d), ye.d.p(1.0d));
        Object a18 = i.a(a14, a17, ye.d.p(21.0d), ye.d.p(21.0d));
        this.f11166k = (int) Math.floor(ye.d.f(a17));
        this.f11167l = (int) Math.floor(ye.d.f(a18));
    }

    private void h(Map<String, Object> map) {
        i.a aVar = i.a.STRING;
        this.f11156a = (c.h) i.d(c.h.class, ye.d.h(i.c(map, "style", aVar, new String[]{"decimal", "percent", "currency", "unit"}, "decimal")));
        Object c11 = i.c(map, "currency", aVar, ye.d.d(), ye.d.d());
        if (ye.d.n(c11)) {
            if (this.f11156a == c.h.CURRENCY) {
                throw new JSRangeErrorException("Expected currency style !");
            }
        } else if (!d(ye.d.h(c11))) {
            throw new JSRangeErrorException("Malformed currency code !");
        }
        Object c12 = i.c(map, "currencyDisplay", aVar, new String[]{"symbol", "narrowSymbol", PaymentMethodOptionsParams.Blik.PARAM_CODE, "name"}, "symbol");
        Object c13 = i.c(map, "currencySign", aVar, new String[]{PlaceTypes.ACCOUNTING, "standard"}, "standard");
        Object c14 = i.c(map, "unit", aVar, ye.d.d(), ye.d.d());
        if (ye.d.n(c14)) {
            if (this.f11156a == c.h.UNIT) {
                throw new JSRangeErrorException("Expected unit !");
            }
        } else if (!e(ye.d.h(c14))) {
            throw new JSRangeErrorException("Malformed unit identifier !");
        }
        Object c15 = i.c(map, "unitDisplay", aVar, new String[]{"long", "short", "narrow"}, "short");
        c.h hVar = this.f11156a;
        if (hVar == c.h.CURRENCY) {
            this.f11157b = f(ye.d.h(c11));
            this.f11158c = (c.EnumC0213c) i.d(c.EnumC0213c.class, ye.d.h(c12));
            this.f11159d = (c.d) i.d(c.d.class, ye.d.h(c13));
        } else if (hVar == c.h.UNIT) {
            this.f11160e = ye.d.h(c14);
            this.f11161f = (c.i) i.d(c.i.class, ye.d.h(c15));
        }
    }

    @xf.a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String h11 = ye.d.h(i.c(map, "localeMatcher", i.a.STRING, ye.a.f59450a, "best fit"));
        String[] strArr = new String[list.size()];
        if (Build.VERSION.SDK_INT >= 24 && h11.equals("best fit")) {
            return Arrays.asList(f.d((String[]) list.toArray(strArr)));
        }
        return Arrays.asList(f.h((String[]) list.toArray(strArr)));
    }

    @xf.a
    public String format(double d11) {
        return this.f11170o.b(d11);
    }

    @xf.a
    public List<Map<String, String>> formatToParts(double d11) {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator a11 = this.f11170o.a(d11);
        StringBuilder sb2 = new StringBuilder();
        for (char first = a11.first(); first != 65535; first = a11.next()) {
            sb2.append(first);
            if (a11.getIndex() + 1 == a11.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it2 = a11.getAttributes().keySet().iterator();
                String l11 = it2.hasNext() ? this.f11170o.l(it2.next(), d11) : "literal";
                String sb3 = sb2.toString();
                sb2.setLength(0);
                HashMap hashMap = new HashMap();
                hashMap.put("type", l11);
                hashMap.put("value", sb3);
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }

    @xf.a
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f11176u.g());
        linkedHashMap.put("numberingSystem", this.f11172q);
        linkedHashMap.put("style", this.f11156a.toString());
        c.h hVar = this.f11156a;
        if (hVar == c.h.CURRENCY) {
            linkedHashMap.put("currency", this.f11157b);
            linkedHashMap.put("currencyDisplay", this.f11158c.toString());
            linkedHashMap.put("currencySign", this.f11159d.toString());
        } else if (hVar == c.h.UNIT) {
            linkedHashMap.put("unit", this.f11160e);
            linkedHashMap.put("unitDisplay", this.f11161f.toString());
        }
        int i11 = this.f11163h;
        if (i11 != -1) {
            linkedHashMap.put("minimumIntegerDigits", Integer.valueOf(i11));
        }
        c.f fVar = this.f11168m;
        if (fVar == c.f.SIGNIFICANT_DIGITS) {
            int i12 = this.f11167l;
            if (i12 != -1) {
                linkedHashMap.put("minimumSignificantDigits", Integer.valueOf(i12));
            }
            int i13 = this.f11166k;
            if (i13 != -1) {
                linkedHashMap.put("maximumSignificantDigits", Integer.valueOf(i13));
            }
        } else if (fVar == c.f.FRACTION_DIGITS) {
            int i14 = this.f11164i;
            if (i14 != -1) {
                linkedHashMap.put("minimumFractionDigits", Integer.valueOf(i14));
            }
            int i15 = this.f11165j;
            if (i15 != -1) {
                linkedHashMap.put("maximumFractionDigits", Integer.valueOf(i15));
            }
        }
        linkedHashMap.put("useGrouping", Boolean.valueOf(this.f11162g));
        linkedHashMap.put("notation", this.f11173r.toString());
        if (this.f11173r == c.e.COMPACT) {
            linkedHashMap.put("compactDisplay", this.f11174s.toString());
        }
        linkedHashMap.put("signDisplay", this.f11169n.toString());
        return linkedHashMap;
    }
}