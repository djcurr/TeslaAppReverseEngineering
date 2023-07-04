package com.google.gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pn.d;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private on.d f17186a = on.d.f42795g;

    /* renamed from: b  reason: collision with root package name */
    private r f17187b = r.DEFAULT;

    /* renamed from: c  reason: collision with root package name */
    private d f17188c = c.IDENTITY;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Type, g<?>> f17189d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final List<v> f17190e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final List<v> f17191f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private boolean f17192g = false;

    /* renamed from: h  reason: collision with root package name */
    private String f17193h = e.f17165n;

    /* renamed from: i  reason: collision with root package name */
    private int f17194i = 2;

    /* renamed from: j  reason: collision with root package name */
    private int f17195j = 2;

    /* renamed from: k  reason: collision with root package name */
    private boolean f17196k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f17197l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f17198m = true;

    /* renamed from: n  reason: collision with root package name */
    private boolean f17199n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f17200o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f17201p = false;

    /* renamed from: q  reason: collision with root package name */
    private boolean f17202q = true;

    /* renamed from: r  reason: collision with root package name */
    private t f17203r = e.f17167p;

    /* renamed from: s  reason: collision with root package name */
    private t f17204s = e.f17168q;

    private void a(String str, int i11, int i12, List<v> list) {
        v vVar;
        v vVar2;
        boolean z11 = sn.d.f50472a;
        v vVar3 = null;
        if (str != null && !str.trim().isEmpty()) {
            vVar = d.b.f46702b.b(str);
            if (z11) {
                vVar3 = sn.d.f50474c.b(str);
                vVar2 = sn.d.f50473b.b(str);
            }
            vVar2 = null;
        } else if (i11 == 2 || i12 == 2) {
            return;
        } else {
            v a11 = d.b.f46702b.a(i11, i12);
            if (z11) {
                vVar3 = sn.d.f50474c.a(i11, i12);
                v a12 = sn.d.f50473b.a(i11, i12);
                vVar = a11;
                vVar2 = a12;
            } else {
                vVar = a11;
                vVar2 = null;
            }
        }
        list.add(vVar);
        if (z11) {
            list.add(vVar3);
            list.add(vVar2);
        }
    }

    public e b() {
        List<v> arrayList = new ArrayList<>(this.f17190e.size() + this.f17191f.size() + 3);
        arrayList.addAll(this.f17190e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f17191f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f17193h, this.f17194i, this.f17195j, arrayList);
        return new e(this.f17186a, this.f17188c, this.f17189d, this.f17192g, this.f17196k, this.f17200o, this.f17198m, this.f17199n, this.f17201p, this.f17197l, this.f17202q, this.f17187b, this.f17193h, this.f17194i, this.f17195j, this.f17190e, this.f17191f, arrayList, this.f17203r, this.f17204s);
    }

    public f c(Type type, Object obj) {
        boolean z11 = obj instanceof q;
        on.a.a(z11 || (obj instanceof j) || (obj instanceof g) || (obj instanceof u));
        if (obj instanceof g) {
            this.f17189d.put(type, (g) obj);
        }
        if (z11 || (obj instanceof j)) {
            this.f17190e.add(pn.l.f(com.google.gson.reflect.a.get(type), obj));
        }
        if (obj instanceof u) {
            this.f17190e.add(pn.n.a(com.google.gson.reflect.a.get(type), (u) obj));
        }
        return this;
    }

    public f d(String str) {
        this.f17193h = str;
        return this;
    }

    public f e(c cVar) {
        this.f17188c = cVar;
        return this;
    }
}