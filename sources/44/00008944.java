package n2;

import kotlin.NoWhenBranchMatchedException;
import t1.a0;
import t1.a1;
import w2.f;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private static final long f40283a = x2.s.f(14);

    /* renamed from: b  reason: collision with root package name */
    private static final long f40284b = x2.s.f(0);

    /* renamed from: c  reason: collision with root package name */
    private static final long f40285c;

    /* renamed from: d  reason: collision with root package name */
    private static final long f40286d;

    /* renamed from: e  reason: collision with root package name */
    private static final long f40287e;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40288a;

        static {
            int[] iArr = new int[x2.q.values().length];
            iArr[x2.q.Ltr.ordinal()] = 1;
            iArr[x2.q.Rtl.ordinal()] = 2;
            f40288a = iArr;
        }
    }

    static {
        a0.a aVar = t1.a0.f51365b;
        f40285c = aVar.e();
        f40286d = x2.r.f56957b.a();
        f40287e = aVar.a();
    }

    public static final a0 a(a0 start, a0 stop, float f11) {
        kotlin.jvm.internal.s.g(start, "start");
        kotlin.jvm.internal.s.g(stop, "stop");
        return new a0(t.a(start.y(), stop.y(), f11), o.a(start.x(), stop.x(), f11));
    }

    public static final a0 b(a0 style, x2.q direction) {
        long m11;
        kotlin.jvm.internal.s.g(style, "style");
        kotlin.jvm.internal.s.g(direction, "direction");
        long f11 = style.f();
        a0.a aVar = t1.a0.f51365b;
        if (!(f11 != aVar.f())) {
            f11 = f40287e;
        }
        long j11 = f11;
        long i11 = x2.s.g(style.i()) ? f40283a : style.i();
        r2.l l11 = style.l();
        if (l11 == null) {
            l11 = r2.l.f49091b.d();
        }
        r2.l lVar = l11;
        r2.j j12 = style.j();
        r2.j c11 = r2.j.c(j12 == null ? r2.j.f49081b.b() : j12.i());
        r2.k k11 = style.k();
        r2.k e11 = r2.k.e(k11 == null ? r2.k.f49085b.a() : k11.m());
        r2.e g11 = style.g();
        if (g11 == null) {
            g11 = r2.e.f49078a.a();
        }
        r2.e eVar = g11;
        String h11 = style.h();
        if (h11 == null) {
            h11 = "";
        }
        String str = h11;
        if (x2.s.g(style.m())) {
            m11 = f40284b;
        } else {
            m11 = style.m();
        }
        long j13 = m11;
        w2.a e12 = style.e();
        w2.a b11 = w2.a.b(e12 == null ? w2.a.f55397b.a() : e12.h());
        w2.g t11 = style.t();
        if (t11 == null) {
            t11 = w2.g.f55420c.a();
        }
        w2.g gVar = t11;
        t2.f o11 = style.o();
        if (o11 == null) {
            o11 = t2.f.f51563c.a();
        }
        t2.f fVar = o11;
        long d11 = style.d();
        if (!(d11 != aVar.f())) {
            d11 = f40285c;
        }
        long j14 = d11;
        w2.e r11 = style.r();
        if (r11 == null) {
            r11 = w2.e.f55408b.c();
        }
        w2.e eVar2 = r11;
        a1 p11 = style.p();
        if (p11 == null) {
            p11 = a1.f51374d.a();
        }
        a1 a1Var = p11;
        w2.d q11 = style.q();
        w2.d g12 = w2.d.g(q11 == null ? w2.d.f55400b.f() : q11.m());
        w2.f f12 = w2.f.f(c(direction, style.s()));
        long n11 = x2.s.g(style.n()) ? f40286d : style.n();
        w2.i u11 = style.u();
        if (u11 == null) {
            u11 = w2.i.f55424c.a();
        }
        return new a0(j11, i11, lVar, c11, e11, eVar, str, j13, b11, gVar, fVar, j14, eVar2, a1Var, g12, f12, n11, u11, null);
    }

    public static final int c(x2.q layoutDirection, w2.f fVar) {
        kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
        f.a aVar = w2.f.f55413b;
        if (fVar == null ? false : w2.f.i(fVar.l(), aVar.a())) {
            int i11 = a.f40288a[layoutDirection.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return aVar.c();
                }
                throw new NoWhenBranchMatchedException();
            }
            return aVar.b();
        } else if (fVar == null) {
            int i12 = a.f40288a[layoutDirection.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    return aVar.e();
                }
                throw new NoWhenBranchMatchedException();
            }
            return aVar.d();
        } else {
            return fVar.l();
        }
    }
}