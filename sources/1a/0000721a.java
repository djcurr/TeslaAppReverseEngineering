package h2;

import java.util.HashMap;
import java.util.Map;
import wz.p0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final k f28722a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f28723b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f28724c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f28725d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f28726e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f28727f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f28728g;

    /* renamed from: h  reason: collision with root package name */
    private k f28729h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<f2.a, Integer> f28730i;

    public l(k layoutNode) {
        kotlin.jvm.internal.s.g(layoutNode, "layoutNode");
        this.f28722a = layoutNode;
        this.f28723b = true;
        this.f28730i = new HashMap();
    }

    private static final void k(l lVar, f2.a aVar, int i11, o oVar) {
        int c11;
        float f11 = i11;
        long a11 = s1.g.a(f11, f11);
        while (true) {
            a11 = oVar.W1(a11);
            oVar = oVar.w1();
            kotlin.jvm.internal.s.e(oVar);
            if (kotlin.jvm.internal.s.c(oVar, lVar.f28722a.P())) {
                break;
            } else if (oVar.s1().contains(aVar)) {
                float Z = oVar.Z(aVar);
                a11 = s1.g.a(Z, Z);
            }
        }
        if (aVar instanceof f2.i) {
            c11 = j00.c.c(s1.f.m(a11));
        } else {
            c11 = j00.c.c(s1.f.l(a11));
        }
        Map<f2.a, Integer> map = lVar.f28730i;
        if (map.containsKey(aVar)) {
            c11 = f2.b.c(aVar, ((Number) p0.j(lVar.f28730i, aVar)).intValue(), c11);
        }
        map.put(aVar, Integer.valueOf(c11));
    }

    public final boolean a() {
        return this.f28723b;
    }

    public final Map<f2.a, Integer> b() {
        return this.f28730i;
    }

    public final boolean c() {
        return this.f28726e;
    }

    public final boolean d() {
        return this.f28724c || this.f28726e || this.f28727f || this.f28728g;
    }

    public final boolean e() {
        l();
        return this.f28729h != null;
    }

    public final boolean f() {
        return this.f28728g;
    }

    public final boolean g() {
        return this.f28727f;
    }

    public final boolean h() {
        return this.f28725d;
    }

    public final boolean i() {
        return this.f28724c;
    }

    public final void j() {
        this.f28730i.clear();
        d1.e<k> j02 = this.f28722a.j0();
        int l11 = j02.l();
        if (l11 > 0) {
            k[] k11 = j02.k();
            int i11 = 0;
            do {
                k kVar = k11[i11];
                if (kVar.e()) {
                    if (kVar.H().a()) {
                        kVar.v0();
                    }
                    for (Map.Entry<f2.a, Integer> entry : kVar.H().f28730i.entrySet()) {
                        k(this, entry.getKey(), entry.getValue().intValue(), kVar.P());
                    }
                    o w12 = kVar.P().w1();
                    kotlin.jvm.internal.s.e(w12);
                    while (!kotlin.jvm.internal.s.c(w12, this.f28722a.P())) {
                        for (f2.a aVar : w12.s1()) {
                            k(this, aVar, w12.Z(aVar), w12);
                        }
                        w12 = w12.w1();
                        kotlin.jvm.internal.s.e(w12);
                    }
                }
                i11++;
            } while (i11 < l11);
            this.f28730i.putAll(this.f28722a.P().o1().c());
            this.f28723b = false;
        }
        this.f28730i.putAll(this.f28722a.P().o1().c());
        this.f28723b = false;
    }

    public final void l() {
        l H;
        l H2;
        k kVar = null;
        if (d()) {
            kVar = this.f28722a;
        } else {
            k e02 = this.f28722a.e0();
            if (e02 == null) {
                return;
            }
            k kVar2 = e02.H().f28729h;
            if (kVar2 == null || !kVar2.H().d()) {
                k kVar3 = this.f28729h;
                if (kVar3 == null || kVar3.H().d()) {
                    return;
                }
                k e03 = kVar3.e0();
                if (e03 != null && (H2 = e03.H()) != null) {
                    H2.l();
                }
                k e04 = kVar3.e0();
                if (e04 != null && (H = e04.H()) != null) {
                    kVar = H.f28729h;
                }
            } else {
                kVar = kVar2;
            }
        }
        this.f28729h = kVar;
    }

    public final void m() {
        this.f28723b = true;
        this.f28724c = false;
        this.f28726e = false;
        this.f28725d = false;
        this.f28727f = false;
        this.f28728g = false;
        this.f28729h = null;
    }

    public final void n(boolean z11) {
        this.f28723b = z11;
    }

    public final void o(boolean z11) {
        this.f28726e = z11;
    }

    public final void p(boolean z11) {
        this.f28728g = z11;
    }

    public final void q(boolean z11) {
        this.f28727f = z11;
    }

    public final void r(boolean z11) {
        this.f28725d = z11;
    }

    public final void s(boolean z11) {
        this.f28724c = z11;
    }
}