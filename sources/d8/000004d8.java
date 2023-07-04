package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.platform.t;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class u {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<h2.k, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3111a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean mo12invoke(h2.k it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            l2.x j11 = l2.q.j(it2);
            l2.k j22 = j11 == null ? null : j11.j2();
            boolean z11 = false;
            if ((j22 != null && j22.m()) && j22.e(l2.j.f36419a.o())) {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    public static final /* synthetic */ boolean a(l2.a aVar, Object obj) {
        return j(aVar, obj);
    }

    public static final /* synthetic */ boolean b(l2.p pVar) {
        return k(pVar);
    }

    public static final /* synthetic */ boolean c(l2.p pVar) {
        return l(pVar);
    }

    public static final /* synthetic */ h2.k d(h2.k kVar, h00.l lVar) {
        return n(kVar, lVar);
    }

    public static final /* synthetic */ boolean e(l2.p pVar) {
        return q(pVar);
    }

    public static final /* synthetic */ boolean f(l2.p pVar) {
        return r(pVar);
    }

    public static final /* synthetic */ boolean g(l2.p pVar) {
        return s(pVar);
    }

    public static final /* synthetic */ boolean h(l2.p pVar) {
        return t(pVar);
    }

    public static final /* synthetic */ boolean i(l2.p pVar, t.g gVar) {
        return u(pVar, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(l2.a<?> aVar, Object obj) {
        if (aVar == obj) {
            return true;
        }
        if (obj instanceof l2.a) {
            l2.a aVar2 = (l2.a) obj;
            if (kotlin.jvm.internal.s.c(aVar.b(), aVar2.b())) {
                if (aVar.a() != null || aVar2.a() == null) {
                    return aVar.a() == null || aVar2.a() != null;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(l2.p pVar) {
        return l2.l.a(pVar.h(), l2.s.f36459a.d()) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(l2.p pVar) {
        l2.k j22;
        if (!t(pVar) || kotlin.jvm.internal.s.c(l2.l.a(pVar.t(), l2.s.f36459a.g()), Boolean.TRUE)) {
            h2.k n11 = n(pVar.k(), a.f3111a);
            if (n11 != null) {
                l2.x j11 = l2.q.j(n11);
                if (!((j11 == null || (j22 = j11.j2()) == null) ? false : kotlin.jvm.internal.s.c(l2.l.a(j22, l2.s.f36459a.g()), Boolean.TRUE))) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static final k1 m(List<k1> list, int i11) {
        kotlin.jvm.internal.s.g(list, "<this>");
        int size = list.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            if (list.get(i12).d() == i11) {
                return list.get(i12);
            }
            i12 = i13;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h2.k n(h2.k kVar, h00.l<? super h2.k, Boolean> lVar) {
        for (h2.k e02 = kVar.e0(); e02 != null; e02 = e02.e0()) {
            if (lVar.mo12invoke(e02).booleanValue()) {
                return e02;
            }
        }
        return null;
    }

    public static final Map<Integer, l1> o(l2.r rVar) {
        kotlin.jvm.internal.s.g(rVar, "<this>");
        l2.p a11 = rVar.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (a11.k().e()) {
            Region region = new Region();
            region.set(t1.v0.a(a11.f()));
            p(region, a11, linkedHashMap, a11);
            return linkedHashMap;
        }
        return linkedHashMap;
    }

    private static final void p(Region region, l2.p pVar, Map<Integer, l1> map, l2.p pVar2) {
        f2.t j11;
        s1.h hVar;
        if (!region.isEmpty() || pVar2.i() == pVar.i()) {
            if (pVar2.k().e() || pVar2.u()) {
                Rect a11 = t1.v0.a(pVar2.s());
                Region region2 = new Region();
                region2.set(a11);
                int i11 = pVar2.i() == pVar.i() ? -1 : pVar2.i();
                if (region2.op(region, region2, Region.Op.INTERSECT)) {
                    Integer valueOf = Integer.valueOf(i11);
                    Rect bounds = region2.getBounds();
                    kotlin.jvm.internal.s.f(bounds, "region.bounds");
                    map.put(valueOf, new l1(pVar2, bounds));
                    List<l2.p> p11 = pVar2.p();
                    int size = p11.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i12 = size - 1;
                            p(region, pVar, map, p11.get(size));
                            if (i12 < 0) {
                                break;
                            }
                            size = i12;
                        }
                    }
                    region.op(a11, region, Region.Op.REVERSE_DIFFERENCE);
                } else if (pVar2.u()) {
                    l2.p n11 = pVar2.n();
                    if ((n11 == null || (j11 = n11.j()) == null || !j11.e()) ? false : true) {
                        hVar = n11.f();
                    } else {
                        hVar = new s1.h(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 10.0f, 10.0f);
                    }
                    map.put(Integer.valueOf(i11), new l1(pVar2, t1.v0.a(hVar)));
                } else if (i11 == -1) {
                    Integer valueOf2 = Integer.valueOf(i11);
                    Rect bounds2 = region2.getBounds();
                    kotlin.jvm.internal.s.f(bounds2, "region.bounds");
                    map.put(valueOf2, new l1(pVar2, bounds2));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(l2.p pVar) {
        return pVar.h().e(l2.s.f36459a.p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(l2.p pVar) {
        return pVar.h().e(l2.s.f36459a.q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(l2.p pVar) {
        return pVar.j().getLayoutDirection() == x2.q.Rtl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(l2.p pVar) {
        return pVar.t().e(l2.j.f36419a.o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u(l2.p pVar, t.g gVar) {
        Iterator<Map.Entry<? extends l2.u<?>, ? extends Object>> it2 = gVar.b().iterator();
        while (it2.hasNext()) {
            if (!pVar.h().e(it2.next().getKey())) {
                return true;
            }
        }
        return false;
    }
}