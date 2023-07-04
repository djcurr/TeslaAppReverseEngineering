package e70;

import e50.m0;
import f70.r;
import f70.t;
import f70.x;
import f70.z;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import w60.j;
import w60.n;

/* loaded from: classes5.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static Map f24952a;

    /* loaded from: classes5.dex */
    private static class b extends g {
        private b() {
            super();
        }

        @Override // e70.c.g
        u50.b a(m0 m0Var, Object obj) {
            byte[] r11 = l.p(m0Var.j()).r();
            if (r70.i.a(r11, 0) == 1) {
                return x60.i.b(org.bouncycastle.util.a.w(r11, 4, r11.length));
            }
            if (r11.length == 64) {
                r11 = org.bouncycastle.util.a.w(r11, 4, r11.length);
            }
            return x60.d.b(r11);
        }
    }

    /* renamed from: e70.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private static class C0481c extends g {
        private C0481c() {
            super();
        }

        @Override // e70.c.g
        u50.b a(m0 m0Var, Object obj) {
            w60.b h11 = w60.b.h(m0Var.j());
            return new y60.c(h11.i(), h11.j(), h11.f(), e70.e.c(h11.e().e()));
        }
    }

    /* loaded from: classes5.dex */
    private static class d extends g {
        private d() {
            super();
        }

        @Override // e70.c.g
        u50.b a(m0 m0Var, Object obj) {
            return new z60.b(m0Var.i().q());
        }
    }

    /* loaded from: classes5.dex */
    private static class e extends g {
        private e() {
            super();
        }

        @Override // e70.c.g
        u50.b a(m0 m0Var, Object obj) {
            return new a70.b(e70.e.e(m0Var.e()), m0Var.i().r());
        }
    }

    /* loaded from: classes5.dex */
    private static class f extends g {
        private f() {
            super();
        }

        @Override // e70.c.g
        u50.b a(m0 m0Var, Object obj) {
            return new d70.c(m0Var.i().q(), e70.e.g(w60.h.e(m0Var.e().i())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static abstract class g {
        private g() {
        }

        abstract u50.b a(m0 m0Var, Object obj);
    }

    /* loaded from: classes5.dex */
    private static class h extends g {
        private h() {
            super();
        }

        @Override // e70.c.g
        u50.b a(m0 m0Var, Object obj) {
            z.b f11;
            w60.i f12 = w60.i.f(m0Var.e().i());
            if (f12 != null) {
                k e11 = f12.h().e();
                n e12 = n.e(m0Var.j());
                f11 = new z.b(new x(f12.e(), e70.e.b(e11))).g(e12.f()).h(e12.h());
            } else {
                byte[] r11 = l.p(m0Var.j()).r();
                f11 = new z.b(x.k(r70.i.a(r11, 0))).f(r11);
            }
            return f11.e();
        }
    }

    /* loaded from: classes5.dex */
    private static class i extends g {
        private i() {
            super();
        }

        @Override // e70.c.g
        u50.b a(m0 m0Var, Object obj) {
            t.b f11;
            j f12 = j.f(m0Var.e().i());
            if (f12 != null) {
                k e11 = f12.i().e();
                n e12 = n.e(m0Var.j());
                f11 = new t.b(new r(f12.e(), f12.h(), e70.e.b(e11))).g(e12.f()).h(e12.h());
            } else {
                byte[] r11 = l.p(m0Var.j()).r();
                f11 = new t.b(r.i(r70.i.a(r11, 0))).f(r11);
            }
            return f11.e();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f24952a = hashMap;
        hashMap.put(w60.e.f55694q, new e());
        f24952a.put(w60.e.f55695r, new e());
        f24952a.put(w60.e.f55682e, new f());
        f24952a.put(w60.e.f55683f, new d());
        f24952a.put(w60.e.f55684g, new h());
        f24952a.put(w60.e.f55689l, new i());
        f24952a.put(n40.a.f40491a, new h());
        f24952a.put(n40.a.f40492b, new i());
        f24952a.put(w40.n.G2, new b());
        f24952a.put(w60.e.f55681d, new C0481c());
    }

    public static u50.b a(m0 m0Var) {
        return b(m0Var, null);
    }

    public static u50.b b(m0 m0Var, Object obj) {
        e50.b e11 = m0Var.e();
        g gVar = (g) f24952a.get(e11.e());
        if (gVar != null) {
            return gVar.a(m0Var, obj);
        }
        throw new IOException("algorithm identifier in public key not recognised: " + e11.e());
    }
}