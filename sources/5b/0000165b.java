package com.facebook.hermes.intl;

import android.os.Build;
import com.facebook.hermes.intl.b;
import com.facebook.hermes.intl.i;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

@xf.a
/* loaded from: classes3.dex */
public class DateTimeFormat {

    /* renamed from: a  reason: collision with root package name */
    b f11130a;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11133d;

    /* renamed from: e  reason: collision with root package name */
    private String f11134e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11135f;

    /* renamed from: g  reason: collision with root package name */
    private String f11136g;

    /* renamed from: h  reason: collision with root package name */
    private b.f f11137h;

    /* renamed from: i  reason: collision with root package name */
    private b.d f11138i;

    /* renamed from: j  reason: collision with root package name */
    private b.k f11139j;

    /* renamed from: k  reason: collision with root package name */
    private b.c f11140k;

    /* renamed from: l  reason: collision with root package name */
    private b.l f11141l;

    /* renamed from: m  reason: collision with root package name */
    private b.h f11142m;

    /* renamed from: n  reason: collision with root package name */
    private b.EnumC0212b f11143n;

    /* renamed from: o  reason: collision with root package name */
    private b.e f11144o;

    /* renamed from: p  reason: collision with root package name */
    private b.g f11145p;

    /* renamed from: q  reason: collision with root package name */
    private b.i f11146q;

    /* renamed from: r  reason: collision with root package name */
    private b.j f11147r;

    /* renamed from: b  reason: collision with root package name */
    private ye.b<?> f11131b = null;

    /* renamed from: c  reason: collision with root package name */
    private ye.b<?> f11132c = null;

    /* renamed from: s  reason: collision with root package name */
    private Object f11148s = null;

    @xf.a
    public DateTimeFormat(List<String> list, Map<String, Object> map) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f11130a = new n();
        } else {
            this.f11130a = new m();
        }
        c(list, map);
        this.f11130a.f(this.f11131b, this.f11133d ? "" : this.f11134e, this.f11135f ? "" : this.f11136g, this.f11138i, this.f11139j, this.f11140k, this.f11141l, this.f11142m, this.f11143n, this.f11144o, this.f11145p, this.f11146q, this.f11147r, this.f11137h, this.f11148s);
    }

    private Object a() {
        return this.f11130a.h(this.f11131b);
    }

    private Object b(Object obj, String str, String str2) {
        if (ye.d.l(obj)) {
            boolean z11 = true;
            if (str.equals("date") || str.equals("any")) {
                String[] strArr = {"weekday", "year", "month", "day"};
                for (int i11 = 0; i11 < 4; i11++) {
                    if (!ye.d.n(ye.d.a(obj, strArr[i11]))) {
                        z11 = false;
                    }
                }
            }
            if (str.equals("time") || str.equals("any")) {
                String[] strArr2 = {"hour", "minute", "second"};
                for (int i12 = 0; i12 < 3; i12++) {
                    if (!ye.d.n(ye.d.a(obj, strArr2[i12]))) {
                        z11 = false;
                    }
                }
            }
            if (z11 && (str2.equals("date") || str2.equals("all"))) {
                String[] strArr3 = {"year", "month", "day"};
                for (int i13 = 0; i13 < 3; i13++) {
                    ye.d.c(obj, strArr3[i13], "numeric");
                }
            }
            if (z11 && (str2.equals("time") || str2.equals("all"))) {
                String[] strArr4 = {"hour", "minute", "second"};
                for (int i14 = 0; i14 < 3; i14++) {
                    ye.d.c(obj, strArr4[i14], "numeric");
                }
            }
            return obj;
        }
        throw new JSRangeErrorException("Invalid options object !");
    }

    private void c(List<String> list, Map<String, Object> map) {
        Object e11;
        List asList = Arrays.asList("ca", "nu", "hc");
        Object b11 = b(map, "any", "date");
        Object q11 = ye.d.q();
        i.a aVar = i.a.STRING;
        ye.d.c(q11, "localeMatcher", i.c(b11, "localeMatcher", aVar, ye.a.f59450a, "best fit"));
        Object c11 = i.c(b11, "calendar", aVar, ye.d.d(), ye.d.d());
        if (!ye.d.n(c11) && !d(ye.d.h(c11))) {
            throw new JSRangeErrorException("Invalid calendar option !");
        }
        ye.d.c(q11, "ca", c11);
        Object c12 = i.c(b11, "numberingSystem", aVar, ye.d.d(), ye.d.d());
        if (!ye.d.n(c12) && !d(ye.d.h(c12))) {
            throw new JSRangeErrorException("Invalid numbering system !");
        }
        ye.d.c(q11, "nu", c12);
        Object c13 = i.c(b11, "hour12", i.a.BOOLEAN, ye.d.d(), ye.d.d());
        Object c14 = i.c(b11, "hourCycle", aVar, new String[]{"h11", "h12", "h23", "h24"}, ye.d.d());
        if (!ye.d.n(c13)) {
            c14 = ye.d.b();
        }
        ye.d.c(q11, "hc", c14);
        HashMap<String, Object> a11 = h.a(list, q11, asList);
        ye.b<?> bVar = (ye.b) ye.d.g(a11).get("locale");
        this.f11131b = bVar;
        this.f11132c = bVar.d();
        Object a12 = ye.d.a(a11, "ca");
        if (!ye.d.j(a12)) {
            this.f11133d = false;
            this.f11134e = ye.d.h(a12);
        } else {
            this.f11133d = true;
            this.f11134e = this.f11130a.d(this.f11131b);
        }
        Object a13 = ye.d.a(a11, "nu");
        if (!ye.d.j(a13)) {
            this.f11135f = false;
            this.f11136g = ye.d.h(a13);
        } else {
            this.f11135f = true;
            this.f11136g = this.f11130a.c(this.f11131b);
        }
        Object a14 = ye.d.a(a11, "hc");
        Object a15 = ye.d.a(b11, "timeZone");
        if (ye.d.n(a15)) {
            e11 = a();
        } else {
            e11 = e(a15.toString());
        }
        this.f11148s = e11;
        this.f11138i = (b.d) i.d(b.d.class, ye.d.h(i.c(b11, "formatMatcher", aVar, new String[]{"basic", "best fit"}, "best fit")));
        this.f11139j = (b.k) i.d(b.k.class, i.c(b11, "weekday", aVar, new String[]{"long", "short", "narrow"}, ye.d.d()));
        this.f11140k = (b.c) i.d(b.c.class, i.c(b11, "era", aVar, new String[]{"long", "short", "narrow"}, ye.d.d()));
        this.f11141l = (b.l) i.d(b.l.class, i.c(b11, "year", aVar, new String[]{"numeric", "2-digit"}, ye.d.d()));
        this.f11142m = (b.h) i.d(b.h.class, i.c(b11, "month", aVar, new String[]{"numeric", "2-digit", "long", "short", "narrow"}, ye.d.d()));
        this.f11143n = (b.EnumC0212b) i.d(b.EnumC0212b.class, i.c(b11, "day", aVar, new String[]{"numeric", "2-digit"}, ye.d.d()));
        Object c15 = i.c(b11, "hour", aVar, new String[]{"numeric", "2-digit"}, ye.d.d());
        this.f11144o = (b.e) i.d(b.e.class, c15);
        this.f11145p = (b.g) i.d(b.g.class, i.c(b11, "minute", aVar, new String[]{"numeric", "2-digit"}, ye.d.d()));
        this.f11146q = (b.i) i.d(b.i.class, i.c(b11, "second", aVar, new String[]{"numeric", "2-digit"}, ye.d.d()));
        this.f11147r = (b.j) i.d(b.j.class, i.c(b11, "timeZoneName", aVar, new String[]{"long", "short"}, ye.d.d()));
        if (ye.d.n(c15)) {
            this.f11137h = b.f.UNDEFINED;
            return;
        }
        b.f e12 = this.f11130a.e(this.f11131b);
        b.f fVar = ye.d.j(a14) ? e12 : (b.f) i.d(b.f.class, a14);
        if (!ye.d.n(c13)) {
            if (ye.d.e(c13)) {
                fVar = b.f.H11;
                if (e12 != fVar && e12 != b.f.H23) {
                    fVar = b.f.H12;
                }
            } else {
                fVar = (e12 == b.f.H11 || e12 == b.f.H23) ? b.f.H23 : b.f.H24;
            }
        }
        this.f11137h = fVar;
    }

    private boolean d(String str) {
        return ye.c.o(str, 0, str.length() - 1);
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

    public String e(String str) {
        String[] availableIDs;
        for (String str2 : TimeZone.getAvailableIDs()) {
            if (f(str2).equals(f(str))) {
                return str2;
            }
        }
        throw new JSRangeErrorException("Invalid timezone name!");
    }

    public String f(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt >= 'A' && charAt <= 'Z') {
                sb2.append((char) (charAt + ' '));
            } else {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }

    @xf.a
    public String format(double d11) {
        return this.f11130a.b(d11);
    }

    @xf.a
    public List<Map<String, String>> formatToParts(double d11) {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator a11 = this.f11130a.a(d11);
        StringBuilder sb2 = new StringBuilder();
        for (char first = a11.first(); first != 65535; first = a11.next()) {
            sb2.append(first);
            if (a11.getIndex() + 1 == a11.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it2 = a11.getAttributes().keySet().iterator();
                String g11 = it2.hasNext() ? this.f11130a.g(it2.next(), sb2.toString()) : "literal";
                String sb3 = sb2.toString();
                sb2.setLength(0);
                HashMap hashMap = new HashMap();
                hashMap.put("type", g11);
                hashMap.put("value", sb3);
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }

    @xf.a
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f11132c.g());
        linkedHashMap.put("numberingSystem", this.f11136g);
        linkedHashMap.put("calendar", this.f11134e);
        linkedHashMap.put("timeZone", this.f11148s);
        b.f fVar = this.f11137h;
        if (fVar != b.f.UNDEFINED) {
            linkedHashMap.put("hourCycle", fVar.toString());
            b.f fVar2 = this.f11137h;
            if (fVar2 != b.f.H11 && fVar2 != b.f.H12) {
                linkedHashMap.put("hour12", Boolean.FALSE);
            } else {
                linkedHashMap.put("hour12", Boolean.TRUE);
            }
        }
        b.k kVar = this.f11139j;
        if (kVar != b.k.UNDEFINED) {
            linkedHashMap.put("weekday", kVar.toString());
        }
        b.c cVar = this.f11140k;
        if (cVar != b.c.UNDEFINED) {
            linkedHashMap.put("era", cVar.toString());
        }
        b.l lVar = this.f11141l;
        if (lVar != b.l.UNDEFINED) {
            linkedHashMap.put("year", lVar.toString());
        }
        b.h hVar = this.f11142m;
        if (hVar != b.h.UNDEFINED) {
            linkedHashMap.put("month", hVar.toString());
        }
        b.EnumC0212b enumC0212b = this.f11143n;
        if (enumC0212b != b.EnumC0212b.UNDEFINED) {
            linkedHashMap.put("day", enumC0212b.toString());
        }
        b.e eVar = this.f11144o;
        if (eVar != b.e.UNDEFINED) {
            linkedHashMap.put("hour", eVar.toString());
        }
        b.g gVar = this.f11145p;
        if (gVar != b.g.UNDEFINED) {
            linkedHashMap.put("minute", gVar.toString());
        }
        b.i iVar = this.f11146q;
        if (iVar != b.i.UNDEFINED) {
            linkedHashMap.put("second", iVar.toString());
        }
        b.j jVar = this.f11147r;
        if (jVar != b.j.UNDEFINED) {
            linkedHashMap.put("timeZoneName", jVar.toString());
        }
        return linkedHashMap;
    }
}