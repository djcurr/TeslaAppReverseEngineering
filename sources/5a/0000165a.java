package com.facebook.hermes.intl;

import android.os.Build;
import com.facebook.hermes.intl.a;
import com.facebook.hermes.intl.i;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@xf.a
/* loaded from: classes3.dex */
public class Collator {

    /* renamed from: a  reason: collision with root package name */
    private a.d f11121a;

    /* renamed from: b  reason: collision with root package name */
    private a.c f11122b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11123c;

    /* renamed from: d  reason: collision with root package name */
    private String f11124d = "default";

    /* renamed from: e  reason: collision with root package name */
    private boolean f11125e;

    /* renamed from: f  reason: collision with root package name */
    private a.b f11126f;

    /* renamed from: g  reason: collision with root package name */
    private ye.b<?> f11127g;

    /* renamed from: h  reason: collision with root package name */
    private ye.b<?> f11128h;

    /* renamed from: i  reason: collision with root package name */
    private a f11129i;

    @xf.a
    public Collator(List<String> list, Map<String, Object> map) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f11129i = new l();
        } else {
            this.f11129i = new k();
        }
        a(list, map);
        this.f11129i.c(this.f11127g).f(this.f11125e).e(this.f11126f).g(this.f11122b).d(this.f11123c);
    }

    private void a(List<String> list, Map<String, Object> map) {
        i.a aVar = i.a.STRING;
        this.f11121a = (a.d) i.d(a.d.class, ye.d.h(i.c(map, PaymentSheetEvent.FIELD_APPEARANCE_USAGE, aVar, ye.a.f59453d, "sort")));
        Object q11 = ye.d.q();
        ye.d.c(q11, "localeMatcher", i.c(map, "localeMatcher", aVar, ye.a.f59450a, "best fit"));
        Object c11 = i.c(map, "numeric", i.a.BOOLEAN, ye.d.d(), ye.d.d());
        if (!ye.d.n(c11)) {
            c11 = ye.d.r(String.valueOf(ye.d.e(c11)));
        }
        ye.d.c(q11, "kn", c11);
        ye.d.c(q11, "kf", i.c(map, "caseFirst", aVar, ye.a.f59452c, ye.d.d()));
        HashMap<String, Object> a11 = h.a(list, q11, Arrays.asList("co", "kf", "kn"));
        ye.b<?> bVar = (ye.b) ye.d.g(a11).get("locale");
        this.f11127g = bVar;
        this.f11128h = bVar.d();
        Object a12 = ye.d.a(a11, "co");
        if (ye.d.j(a12)) {
            a12 = ye.d.r("default");
        }
        this.f11124d = ye.d.h(a12);
        Object a13 = ye.d.a(a11, "kn");
        if (ye.d.j(a13)) {
            this.f11125e = false;
        } else {
            this.f11125e = Boolean.parseBoolean(ye.d.h(a13));
        }
        Object a14 = ye.d.a(a11, "kf");
        if (ye.d.j(a14)) {
            a14 = ye.d.r("false");
        }
        this.f11126f = (a.b) i.d(a.b.class, ye.d.h(a14));
        if (this.f11121a == a.d.SEARCH) {
            ArrayList<String> b11 = this.f11127g.b("collation");
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<String> it2 = b11.iterator();
            while (it2.hasNext()) {
                arrayList.add(ye.g.e(it2.next()));
            }
            arrayList.add(ye.g.e("search"));
            this.f11127g.f("co", arrayList);
        }
        Object c12 = i.c(map, "sensitivity", i.a.STRING, ye.a.f59451b, ye.d.d());
        if (!ye.d.n(c12)) {
            this.f11122b = (a.c) i.d(a.c.class, ye.d.h(c12));
        } else if (this.f11121a == a.d.SORT) {
            this.f11122b = a.c.VARIANT;
        } else {
            this.f11122b = a.c.LOCALE;
        }
        this.f11123c = ye.d.e(i.c(map, "ignorePunctuation", i.a.BOOLEAN, ye.d.d(), Boolean.FALSE));
    }

    @xf.a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String h11 = ye.d.h(i.c(map, "localeMatcher", i.a.STRING, ye.a.f59450a, "best fit"));
        if (Build.VERSION.SDK_INT >= 24 && h11.equals("best fit")) {
            return Arrays.asList(f.d((String[]) list.toArray(new String[list.size()])));
        }
        return Arrays.asList(f.h((String[]) list.toArray(new String[list.size()])));
    }

    @xf.a
    public double compare(String str, String str2) {
        return this.f11129i.a(str, str2);
    }

    @xf.a
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f11128h.g().replace("-kn-true", "-kn"));
        linkedHashMap.put(PaymentSheetEvent.FIELD_APPEARANCE_USAGE, this.f11121a.toString());
        a.c cVar = this.f11122b;
        if (cVar == a.c.LOCALE) {
            linkedHashMap.put("sensitivity", this.f11129i.b().toString());
        } else {
            linkedHashMap.put("sensitivity", cVar.toString());
        }
        linkedHashMap.put("ignorePunctuation", Boolean.valueOf(this.f11123c));
        linkedHashMap.put("collation", this.f11124d);
        linkedHashMap.put("numeric", Boolean.valueOf(this.f11125e));
        linkedHashMap.put("caseFirst", this.f11126f.toString());
        return linkedHashMap;
    }
}