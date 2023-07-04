package e10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t00.k;
import wz.r0;
import wz.s0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f24448a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<u10.c, u10.f> f24449b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map<u10.f, List<u10.f>> f24450c;

    /* renamed from: d  reason: collision with root package name */
    private static final Set<u10.c> f24451d;

    /* renamed from: e  reason: collision with root package name */
    private static final Set<u10.f> f24452e;

    static {
        u10.c d11;
        u10.c d12;
        u10.c c11;
        u10.c c12;
        u10.c d13;
        u10.c c13;
        u10.c c14;
        u10.c c15;
        Map<u10.c, u10.f> l11;
        int t11;
        int e11;
        int t12;
        Set<u10.f> S0;
        List U;
        u10.d dVar = k.a.f51341k;
        d11 = h.d(dVar, "name");
        d12 = h.d(dVar, "ordinal");
        c11 = h.c(k.a.C, "size");
        u10.c cVar = k.a.G;
        c12 = h.c(cVar, "size");
        d13 = h.d(k.a.f51332f, "length");
        c13 = h.c(cVar, "keys");
        c14 = h.c(cVar, "values");
        c15 = h.c(cVar, "entries");
        l11 = s0.l(vz.v.a(d11, u10.f.f("name")), vz.v.a(d12, u10.f.f("ordinal")), vz.v.a(c11, u10.f.f("size")), vz.v.a(c12, u10.f.f("size")), vz.v.a(d13, u10.f.f("length")), vz.v.a(c13, u10.f.f("keySet")), vz.v.a(c14, u10.f.f("values")), vz.v.a(c15, u10.f.f("entrySet")));
        f24449b = l11;
        Set<Map.Entry<u10.c, u10.f>> entrySet = l11.entrySet();
        t11 = wz.x.t(entrySet, 10);
        ArrayList<vz.p> arrayList = new ArrayList(t11);
        Iterator<T> it2 = entrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            arrayList.add(new vz.p(((u10.c) entry.getKey()).g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (vz.p pVar : arrayList) {
            u10.f fVar = (u10.f) pVar.d();
            Object obj = linkedHashMap.get(fVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(fVar, obj);
            }
            ((List) obj).add((u10.f) pVar.c());
        }
        e11 = r0.e(linkedHashMap.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e11);
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            U = wz.e0.U((Iterable) entry2.getValue());
            linkedHashMap2.put(key, U);
        }
        f24450c = linkedHashMap2;
        Set<u10.c> keySet = f24449b.keySet();
        f24451d = keySet;
        t12 = wz.x.t(keySet, 10);
        ArrayList arrayList2 = new ArrayList(t12);
        for (u10.c cVar2 : keySet) {
            arrayList2.add(cVar2.g());
        }
        S0 = wz.e0.S0(arrayList2);
        f24452e = S0;
    }

    private g() {
    }

    public final Map<u10.c, u10.f> a() {
        return f24449b;
    }

    public final List<u10.f> b(u10.f name1) {
        List<u10.f> i11;
        kotlin.jvm.internal.s.g(name1, "name1");
        List<u10.f> list = f24450c.get(name1);
        if (list == null) {
            i11 = wz.w.i();
            return i11;
        }
        return list;
    }

    public final Set<u10.c> c() {
        return f24451d;
    }

    public final Set<u10.f> d() {
        return f24452e;
    }
}