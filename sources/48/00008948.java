package n2;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import t1.a1;
import t1.q0;
import wz.e0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final e f40289a;

    /* renamed from: b  reason: collision with root package name */
    private final int f40290b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f40291c;

    /* renamed from: d  reason: collision with root package name */
    private final float f40292d;

    /* renamed from: e  reason: collision with root package name */
    private final float f40293e;

    /* renamed from: f  reason: collision with root package name */
    private final int f40294f;

    /* renamed from: g  reason: collision with root package name */
    private final List<s1.h> f40295g;

    /* renamed from: h  reason: collision with root package name */
    private final List<i> f40296h;

    public d(e intrinsics, int i11, boolean z11, float f11) {
        boolean z12;
        int k11;
        kotlin.jvm.internal.s.g(intrinsics, "intrinsics");
        this.f40289a = intrinsics;
        this.f40290b = i11;
        ArrayList arrayList = new ArrayList();
        List<j> e11 = intrinsics.e();
        int size = e11.size();
        float f12 = 0.0f;
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            int i14 = i12 + 1;
            j jVar = e11.get(i12);
            h b11 = m.b(jVar.b(), this.f40290b - i13, z11, f11);
            float height = f12 + b11.getHeight();
            int j11 = i13 + b11.j();
            arrayList.add(new i(b11, jVar.c(), jVar.a(), i13, j11, f12, height));
            if (b11.l()) {
                i13 = j11;
            } else {
                i13 = j11;
                if (i13 == this.f40290b) {
                    k11 = wz.w.k(this.f40289a.e());
                    if (i12 != k11) {
                    }
                }
                i12 = i14;
                f12 = height;
            }
            z12 = true;
            f12 = height;
            break;
        }
        z12 = false;
        this.f40293e = f12;
        this.f40294f = i13;
        this.f40291c = z12;
        this.f40296h = arrayList;
        this.f40292d = f11;
        List<s1.h> arrayList2 = new ArrayList<>(arrayList.size());
        int size2 = arrayList.size();
        int i15 = 0;
        while (i15 < size2) {
            int i16 = i15 + 1;
            i iVar = (i) arrayList.get(i15);
            List<s1.h> v11 = iVar.e().v();
            ArrayList arrayList3 = new ArrayList(v11.size());
            int size3 = v11.size();
            int i17 = 0;
            while (i17 < size3) {
                int i18 = i17 + 1;
                s1.h hVar = v11.get(i17);
                arrayList3.add(hVar == null ? null : iVar.i(hVar));
                i17 = i18;
            }
            wz.b0.z(arrayList2, arrayList3);
            i15 = i16;
        }
        if (arrayList2.size() < i().f().size()) {
            int size4 = i().f().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            int i19 = 0;
            while (i19 < size4) {
                i19++;
                arrayList4.add(null);
            }
            arrayList2 = e0.y0(arrayList2, arrayList4);
        }
        this.f40295g = arrayList2;
    }

    private final void A(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < a().g().length()) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + i11 + ") is out of bounds [0, " + a().length() + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    private final void B(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 <= a().g().length()) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + i11 + ") is out of bounds [0, " + a().length() + ']').toString());
    }

    private final void C(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < this.f40294f) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        throw new IllegalArgumentException(("lineIndex(" + i11 + ") is out of bounds [0, " + i11 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    private final a a() {
        return this.f40289a.d();
    }

    public final w2.c b(int i11) {
        int a11;
        B(i11);
        if (i11 == a().length()) {
            a11 = wz.w.k(this.f40296h);
        } else {
            a11 = g.a(this.f40296h, i11);
        }
        i iVar = this.f40296h.get(a11);
        return iVar.e().s(iVar.p(i11));
    }

    public final s1.h c(int i11) {
        A(i11);
        i iVar = this.f40296h.get(g.a(this.f40296h, i11));
        return iVar.i(iVar.e().u(iVar.p(i11)));
    }

    public final s1.h d(int i11) {
        int a11;
        B(i11);
        if (i11 == a().length()) {
            a11 = wz.w.k(this.f40296h);
        } else {
            a11 = g.a(this.f40296h, i11);
        }
        i iVar = this.f40296h.get(a11);
        return iVar.i(iVar.e().d(iVar.p(i11)));
    }

    public final boolean e() {
        return this.f40291c;
    }

    public final float f() {
        return this.f40296h.isEmpty() ? BitmapDescriptorFactory.HUE_RED : this.f40296h.get(0).e().f();
    }

    public final float g() {
        return this.f40293e;
    }

    public final float h(int i11, boolean z11) {
        int a11;
        B(i11);
        if (i11 == a().length()) {
            a11 = wz.w.k(this.f40296h);
        } else {
            a11 = g.a(this.f40296h, i11);
        }
        i iVar = this.f40296h.get(a11);
        return iVar.e().o(iVar.p(i11), z11);
    }

    public final e i() {
        return this.f40289a;
    }

    public final float j() {
        if (this.f40296h.isEmpty()) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        i iVar = (i) wz.u.n0(this.f40296h);
        return iVar.n(iVar.e().q());
    }

    public final float k(int i11) {
        C(i11);
        i iVar = this.f40296h.get(g.b(this.f40296h, i11));
        return iVar.n(iVar.e().t(iVar.q(i11)));
    }

    public final int l() {
        return this.f40294f;
    }

    public final int m(int i11, boolean z11) {
        C(i11);
        i iVar = this.f40296h.get(g.b(this.f40296h, i11));
        return iVar.l(iVar.e().i(iVar.q(i11), z11));
    }

    public final int n(int i11) {
        int a11;
        B(i11);
        if (i11 == a().length()) {
            a11 = wz.w.k(this.f40296h);
        } else {
            a11 = g.a(this.f40296h, i11);
        }
        i iVar = this.f40296h.get(a11);
        return iVar.m(iVar.e().r(iVar.p(i11)));
    }

    public final int o(float f11) {
        int k11;
        if (f11 <= BitmapDescriptorFactory.HUE_RED) {
            k11 = 0;
        } else {
            k11 = f11 >= this.f40293e ? wz.w.k(this.f40296h) : g.c(this.f40296h, f11);
        }
        i iVar = this.f40296h.get(k11);
        if (iVar.d() == 0) {
            return Math.max(0, iVar.f() - 1);
        }
        return iVar.m(iVar.e().m(iVar.r(f11)));
    }

    public final float p(int i11) {
        C(i11);
        i iVar = this.f40296h.get(g.b(this.f40296h, i11));
        return iVar.e().p(iVar.q(i11));
    }

    public final float q(int i11) {
        C(i11);
        i iVar = this.f40296h.get(g.b(this.f40296h, i11));
        return iVar.e().k(iVar.q(i11));
    }

    public final int r(int i11) {
        C(i11);
        i iVar = this.f40296h.get(g.b(this.f40296h, i11));
        return iVar.l(iVar.e().h(iVar.q(i11)));
    }

    public final float s(int i11) {
        C(i11);
        i iVar = this.f40296h.get(g.b(this.f40296h, i11));
        return iVar.n(iVar.e().c(iVar.q(i11)));
    }

    public final int t(long j11) {
        int k11;
        if (s1.f.m(j11) <= BitmapDescriptorFactory.HUE_RED) {
            k11 = 0;
        } else {
            k11 = s1.f.m(j11) >= this.f40293e ? wz.w.k(this.f40296h) : g.c(this.f40296h, s1.f.m(j11));
        }
        i iVar = this.f40296h.get(k11);
        if (iVar.d() == 0) {
            return Math.max(0, iVar.f() - 1);
        }
        return iVar.l(iVar.e().g(iVar.o(j11)));
    }

    public final w2.c u(int i11) {
        int a11;
        B(i11);
        if (i11 == a().length()) {
            a11 = wz.w.k(this.f40296h);
        } else {
            a11 = g.a(this.f40296h, i11);
        }
        i iVar = this.f40296h.get(a11);
        return iVar.e().b(iVar.p(i11));
    }

    public final q0 v(int i11, int i12) {
        boolean z11 = true;
        if (!(i11 >= 0 && i11 <= i12) || i12 > a().g().length()) {
            z11 = false;
        }
        if (!z11) {
            throw new IllegalArgumentException(("Start(" + i11 + ") or End(" + i12 + ") is out of range [0.." + a().g().length() + "), or start > end!").toString());
        } else if (i11 == i12) {
            return t1.n.a();
        } else {
            int a11 = g.a(this.f40296h, i11);
            q0 a12 = t1.n.a();
            int size = this.f40296h.size();
            while (a11 < size) {
                int i13 = a11 + 1;
                i iVar = this.f40296h.get(a11);
                if (iVar.f() >= i12) {
                    break;
                }
                if (iVar.f() != iVar.b()) {
                    q0.a.a(a12, iVar.j(iVar.e().n(iVar.p(i11), iVar.p(i12))), 0L, 2, null);
                }
                a11 = i13;
            }
            return a12;
        }
    }

    public final List<s1.h> w() {
        return this.f40295g;
    }

    public final float x() {
        return this.f40292d;
    }

    public final long y(int i11) {
        int a11;
        B(i11);
        if (i11 == a().length()) {
            a11 = wz.w.k(this.f40296h);
        } else {
            a11 = g.a(this.f40296h, i11);
        }
        i iVar = this.f40296h.get(a11);
        return iVar.k(iVar.e().e(iVar.p(i11)));
    }

    public final void z(t1.u canvas, long j11, a1 a1Var, w2.e eVar) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
        canvas.m();
        List<i> list = this.f40296h;
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            i iVar = list.get(i11);
            iVar.e().w(canvas, j11, a1Var, eVar);
            canvas.b(BitmapDescriptorFactory.HUE_RED, iVar.e().getHeight());
            i11 = i12;
        }
        canvas.h();
    }
}