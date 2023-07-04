package et;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.tesla.domain.model.widget.VehicleClosure;
import cu.b;
import h00.l;
import j$.time.Instant;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import lt.w2;
import mr.d;
import mt.j;
import mt.k;
import mt.l;
import mt.o;
import mt.u;
import mt.v;
import vz.p;
import zu.q;

/* loaded from: classes6.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: et.a$a */
    /* loaded from: classes6.dex */
    public static final class C0491a extends u implements l<VehicleClosure, Boolean> {

        /* renamed from: a */
        final /* synthetic */ cu.a f25247a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0491a(cu.a aVar) {
            super(1);
            this.f25247a = aVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(VehicleClosure it2) {
            s.g(it2, "it");
            return Boolean.valueOf(a.h(this.f25247a, it2));
        }
    }

    public static final boolean A(w2 w2Var, w2 w2Var2) {
        mt.u n11;
        s.g(w2Var, "<this>");
        mt.u n12 = w2Var.n();
        Instant instant = null;
        Instant F0 = n12 == null ? null : n12.F0();
        if (F0 == null) {
            return false;
        }
        if (w2Var2 != null && (n11 = w2Var2.n()) != null) {
            instant = n11.F0();
        }
        if (instant == null) {
            return false;
        }
        return F0.isAfter(instant);
    }

    public static final boolean B(cu.a aVar) {
        s.g(aVar, "<this>");
        return h(aVar, VehicleClosure.FRONT_TRUNK);
    }

    public static final boolean C(w2 w2Var) {
        s.g(w2Var, "<this>");
        v o11 = w2Var.o();
        if (o11 == null) {
            return false;
        }
        return s.c(o11.O(), Boolean.TRUE);
    }

    public static final boolean D(w2 w2Var) {
        k.g x11;
        s.g(w2Var, "<this>");
        k d11 = w2Var.d();
        kt.u uVar = null;
        if (d11 != null && (x11 = d11.x()) != null) {
            uVar = x11.b();
        }
        return R(uVar);
    }

    public static final boolean E(u.b bVar) {
        if (bVar == null) {
            return false;
        }
        return R(bVar.b()) || R(bVar.i());
    }

    public static final boolean F(w2 w2Var) {
        s.g(w2Var, "<this>");
        mt.l e11 = w2Var.e();
        if (e11 == null) {
            return false;
        }
        return s.c(e11.r(), Boolean.TRUE);
    }

    public static final boolean G(w2 w2Var) {
        s.g(w2Var, "<this>");
        mt.l e11 = w2Var.e();
        l.d v11 = e11 == null ? null : e11.v();
        return v11 != null && d.e(v11.c(), v11.b(), v11.d(), v11.f(), v11.g()) == 1;
    }

    public static final boolean H(w2 w2Var) {
        s.g(w2Var, "<this>");
        mt.l e11 = w2Var.e();
        l.e z11 = e11 == null ? null : e11.z();
        mt.l e12 = w2Var.e();
        Integer x11 = e12 == null ? null : e12.x();
        if (!R(z11 == null ? null : z11.c())) {
            if (!R(z11 != null ? z11.f() : null) || x11 == null || x11.intValue() != 0) {
                return false;
            }
        }
        return true;
    }

    public static final boolean I(w2 w2Var) {
        s.g(w2Var, "<this>");
        mt.l e11 = w2Var.e();
        l.e z11 = e11 == null ? null : e11.z();
        mt.l e12 = w2Var.e();
        Integer x11 = e12 == null ? null : e12.x();
        if (!R(z11 == null ? null : z11.e())) {
            if (!R(z11 == null ? null : z11.g())) {
                if (!R(z11 != null ? z11.f() : null) || x11 == null || x11.intValue() <= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean J(cu.a aVar) {
        s.g(aVar, "<this>");
        return h(aVar, VehicleClosure.REAR_TRUNK);
    }

    public static final boolean K(cu.a aVar) {
        s.g(aVar, "<this>");
        return !h(aVar, VehicleClosure.LOCKED);
    }

    public static final boolean L(w2 w2Var) {
        s.g(w2Var, "<this>");
        mt.l e11 = w2Var.e();
        if (e11 == null) {
            return true;
        }
        Boolean F = e11.F();
        Boolean J = e11.J();
        Boolean H = e11.H();
        Boolean L = e11.L();
        Boolean bool = Boolean.TRUE;
        return (s.c(F, bool) || s.c(J, bool) || s.c(H, bool) || s.c(L, bool)) ? false : true;
    }

    public static final boolean M(w2 w2Var) {
        s.g(w2Var, "<this>");
        mt.u n11 = w2Var.n();
        u.b m11 = n11 == null ? null : n11.m();
        return m11 != null && d.d(m11.d(), m11.e(), m11.f()) == 1;
    }

    public static final double N(double d11) {
        return d11 * 1.609344d;
    }

    private static final double O(double d11, double d12) {
        double d13 = d11 * 2.0d;
        double d14 = d12 * 3.141592653589793d;
        return (-100.0d) + d13 + (d12 * 3.0d) + (d12 * 0.2d * d12) + (0.1d * d11 * d12) + (Math.sqrt(Math.abs(d11)) * 0.2d) + ((((Math.sin((6.0d * d11) * 3.141592653589793d) * 20.0d) + (Math.sin(d13 * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(d14) * 20.0d) + (Math.sin((d12 / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d12 / 12.0d) * 3.141592653589793d) * 160.0d) + (320 * Math.sin(d14 / 30.0d))) * 2.0d) / 3.0d);
    }

    private static final double P(double d11, double d12) {
        double d13 = d11 * 0.1d;
        return d11 + 300.0d + (d12 * 2.0d) + (d13 * d11) + (d13 * d12) + (Math.sqrt(Math.abs(d11)) * 0.1d) + ((((Math.sin((6.0d * d11) * 3.141592653589793d) * 20.0d) + (Math.sin((d11 * 2.0d) * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(d11 * 3.141592653589793d) * 20.0d) + (Math.sin((d11 / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d11 / 12.0d) * 3.141592653589793d) * 150.0d) + (Math.sin((d11 / 30.0d) * 3.141592653589793d) * 300.0d)) * 2.0d) / 3.0d);
    }

    public static final Float Q(Float f11) {
        if ((f11 == null || s.a(f11, BitmapDescriptorFactory.HUE_RED)) ? false : true) {
            return f11;
        }
        return null;
    }

    public static final boolean R(kt.u uVar) {
        return s.c(uVar, new kt.u(null, 1, null));
    }

    public static final boolean S(w2 w2Var) {
        Integer Z;
        s.g(w2Var, "<this>");
        mt.u n11 = w2Var.n();
        if (((n11 == null || (Z = n11.Z()) == null) ? 0 : Z.intValue()) > 0) {
            return true;
        }
        mt.u n12 = w2Var.n();
        u.b m11 = n12 == null ? null : n12.m();
        if (!R(m11 == null ? null : m11.c())) {
            if (!R(m11 == null ? null : m11.g())) {
                if (!R(m11 == null ? null : m11.b())) {
                    if (!R(m11 == null ? null : m11.i())) {
                        if (!R(m11 != null ? m11.h() : null)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static final boolean a(cu.a aVar) {
        mt.l d11;
        Instant A;
        mt.l e11;
        s.g(aVar, "<this>");
        b c11 = aVar.c();
        if (c11 != null && (d11 = c11.d()) != null && (A = d11.A()) != null) {
            w2 g11 = aVar.g();
            Instant instant = null;
            if (g11 != null && (e11 = g11.e()) != null) {
                instant = e11.A();
            }
            if (instant == null) {
                instant = Instant.now();
            }
            if (A.isAfter(instant)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(w2 w2Var) {
        j.f Y;
        s.g(w2Var, "<this>");
        j c11 = w2Var.c();
        kt.u uVar = null;
        if (c11 != null && (Y = c11.Y()) != null) {
            uVar = Y.e();
        }
        return R(uVar);
    }

    public static final boolean c(w2 w2Var) {
        kt.b H;
        s.g(w2Var, "<this>");
        j c11 = w2Var.c();
        kt.u uVar = null;
        j.f Y = c11 == null ? null : c11.Y();
        if (Y != null && d.d(Y.d(), Y.h(), Y.f()) == 1) {
            j c12 = w2Var.c();
            if (c12 == null ? false : s.c(c12.F(), Boolean.TRUE)) {
                j c13 = w2Var.c();
                if (c13 != null && (H = c13.H()) != null) {
                    uVar = H.c();
                }
                return !R(uVar);
            }
            return false;
        }
        return false;
    }

    private static final p<Double, Double> d(double d11, double d12) {
        double d13 = d12 - 105.0d;
        double d14 = d11 - 35.0d;
        double O = O(d13, d14);
        double P = P(d13, d14);
        double d15 = (d11 / 180.0d) * 3.141592653589793d;
        double sin = Math.sin(d15);
        double d16 = 1;
        double d17 = d16 - ((sin * 0.006693421622965943d) * sin);
        double sqrt = Math.sqrt(d17);
        return vz.v.a(Double.valueOf((O * 180.0d) / ((((d16 - 0.006693421622965943d) * 6378245.0d) / (d17 * sqrt)) * 3.141592653589793d)), Double.valueOf((P * 180.0d) / (((6378245.0d / sqrt) * Math.cos(d15)) * 3.141592653589793d)));
    }

    private static final p<Double, Double> e(double d11, double d12) {
        p<Double, Double> d13 = d(d11, d12);
        return vz.v.a(Double.valueOf(d11 - d13.a().doubleValue()), Double.valueOf(d12 - d13.b().doubleValue()));
    }

    public static final Integer f(w2 w2Var) {
        s.g(w2Var, "<this>");
        v o11 = w2Var.o();
        if (o11 == null) {
            return null;
        }
        return o11.e();
    }

    public static final String g(w2 w2Var) {
        s.g(w2Var, "<this>");
        mt.u n11 = w2Var.n();
        u.b m11 = n11 == null ? null : n11.m();
        return m11 == null ? "unknown" : R(m11.c()) ? "model3" : R(m11.g()) ? "modely" : R(m11.d()) ? "models" : R(m11.e()) ? "models2" : R(m11.b()) ? "lychee" : R(m11.f()) ? "modelx" : R(m11.i()) ? "tamarind" : R(m11.h()) ? "semitruck" : "undetermined";
    }

    public static final boolean h(cu.a aVar, VehicleClosure closure) {
        mt.l e11;
        mt.l d11;
        s.g(aVar, "<this>");
        s.g(closure, "closure");
        if (a(aVar)) {
            b c11 = aVar.c();
            if (c11 != null && (d11 = c11.d()) != null && gt.a.a(d11, closure)) {
                return true;
            }
        } else {
            w2 g11 = aVar.g();
            if (g11 != null && (e11 = g11.e()) != null && gt.a.a(e11, closure)) {
                return true;
            }
        }
        return false;
    }

    public static final p<Double, Double> i(w2 w2Var) {
        s.g(w2Var, "<this>");
        o i11 = w2Var.i();
        if (i11 == null) {
            return null;
        }
        Float Q = Q(i11.m());
        Float Q2 = Q(i11.o());
        if (s.c(i11.s(), Boolean.TRUE)) {
            o.c w11 = i11.w();
            if (R(w11 == null ? null : w11.b())) {
                Q = Q(i11.q());
                if (Q == null) {
                    Q = Q(i11.c());
                }
                Q2 = Q(i11.u());
                if (Q2 == null) {
                    Q2 = Q(i11.e());
                }
            }
        }
        if (Q == null || Q2 == null) {
            return null;
        }
        return vz.v.a(Double.valueOf(Q.floatValue()), Double.valueOf(Q2.floatValue()));
    }

    public static final Integer j(w2 w2Var) {
        s.g(w2Var, "<this>");
        mt.u n11 = w2Var.n();
        if (n11 == null) {
            return null;
        }
        return n11.Z();
    }

    public static final String k(w2 w2Var) {
        s.g(w2Var, "<this>");
        v o11 = w2Var.o();
        if (o11 == null) {
            return null;
        }
        return o11.E0();
    }

    public static final String l(cu.a aVar) {
        s.g(aVar, "<this>");
        String o11 = o(aVar);
        if (o11 == null) {
            if (q.c()) {
                throw new IllegalArgumentException("This vehicle doesn't have a vin!");
            }
            return "";
        }
        return o11;
    }

    public static final int m(w2 w2Var) {
        s.g(w2Var, "<this>");
        mt.u n11 = w2Var.n();
        u.b m11 = n11 == null ? null : n11.m();
        if (m11 == null) {
            return Integer.MAX_VALUE;
        }
        if (R(m11.c())) {
            return 0;
        }
        if (R(m11.g())) {
            return 1;
        }
        if (R(m11.d())) {
            return 2;
        }
        if (R(m11.e())) {
            return 3;
        }
        if (R(m11.b())) {
            return 4;
        }
        if (R(m11.f())) {
            return 5;
        }
        if (R(m11.i())) {
            return 6;
        }
        return R(m11.h()) ? 7 : Integer.MAX_VALUE;
    }

    public static final p<Double, Double> n(w2 w2Var) {
        s.g(w2Var, "<this>");
        o i11 = w2Var.i();
        Float Q = Q(i11 == null ? null : i11.m());
        o i12 = w2Var.i();
        Float Q2 = Q(i12 == null ? null : i12.o());
        o i13 = w2Var.i();
        o.c w11 = i13 == null ? null : i13.w();
        o i14 = w2Var.i();
        boolean z11 = false;
        if (i14 == null ? false : s.c(i14.s(), Boolean.TRUE)) {
            if (R(w11 == null ? null : w11.b())) {
                o i15 = w2Var.i();
                Q = Q(i15 == null ? null : i15.q());
                if (Q == null) {
                    o i16 = w2Var.i();
                    Q = Q(i16 == null ? null : i16.c());
                }
                o i17 = w2Var.i();
                Q2 = Q(i17 == null ? null : i17.u());
                if (Q2 == null) {
                    o i18 = w2Var.i();
                    Q2 = Q(i18 == null ? null : i18.e());
                }
                z11 = true;
            }
        }
        if (Q == null || Q2 == null) {
            return null;
        }
        if (z11) {
            return e(Q.floatValue(), Q2.floatValue());
        }
        return vz.v.a(Double.valueOf(Q.floatValue()), Double.valueOf(Q2.floatValue()));
    }

    public static final String o(cu.a aVar) {
        mt.u n11;
        s.g(aVar, "<this>");
        w2 g11 = aVar.g();
        if (g11 == null || (n11 = g11.n()) == null) {
            return null;
        }
        return n11.O0();
    }

    public static final String p(w2 w2Var) {
        s.g(w2Var, "<this>");
        mt.u n11 = w2Var.n();
        if (n11 == null) {
            return null;
        }
        return n11.O0();
    }

    public static final boolean q(w2 w2Var) {
        Float Q;
        Float Q2;
        s.g(w2Var, "<this>");
        o i11 = w2Var.i();
        if (i11 == null) {
            return false;
        }
        if (s.c(i11.s(), Boolean.TRUE)) {
            o.c w11 = i11.w();
            if (R(w11 == null ? null : w11.b())) {
                Q = Q(i11.q());
                if (Q == null) {
                    Q = Q(i11.c());
                }
                Q2 = Q(i11.u());
                if (Q2 == null) {
                    Q2 = Q(i11.e());
                }
                return (Q2 == null || Q == null) ? false : true;
            }
        }
        Q = Q(i11.m());
        Q2 = Q(i11.o());
        if (Q2 == null) {
            return false;
        }
    }

    public static final boolean r(w2 w2Var) {
        s.g(w2Var, "<this>");
        mt.u n11 = w2Var.n();
        if (n11 == null) {
            return false;
        }
        return s.c(n11.d0(), Boolean.TRUE);
    }

    public static final boolean s(cu.a aVar) {
        s.g(aVar, "<this>");
        b c11 = aVar.c();
        return c11 != null && c11.f();
    }

    public static final boolean t(w2 w2Var) {
        s.g(w2Var, "<this>");
        mt.u n11 = w2Var.n();
        if (n11 == null) {
            return false;
        }
        return s.c(n11.i0(), Boolean.TRUE);
    }

    public static final boolean u(mt.u uVar) {
        s.g(uVar, "<this>");
        u.l A0 = uVar.A0();
        return R(A0 == null ? null : A0.d());
    }

    public static final boolean v(cu.a aVar) {
        s.g(aVar, "<this>");
        for (Boolean bool : u20.k.B(u20.k.l(VehicleClosure.DRIVER_FRONT_DOOR, VehicleClosure.DRIVER_REAR_DOOR, VehicleClosure.PASSENGER_FRONT_DOOR, VehicleClosure.PASSENGER_REAR_DOOR), new C0491a(aVar))) {
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean w(w2 w2Var) {
        s.g(w2Var, "<this>");
        k d11 = w2Var.d();
        if (d11 == null) {
            return false;
        }
        return s.c(d11.n(), Boolean.TRUE);
    }

    public static final boolean x(cu.a aVar) {
        j c11;
        s.g(aVar, "<this>");
        if (a(aVar)) {
            b c12 = aVar.c();
            if (c12 != null && c12.c()) {
                return true;
            }
        } else {
            w2 g11 = aVar.g();
            if (g11 != null && (c11 = g11.c()) != null) {
                return s.c(c11.F(), Boolean.TRUE);
            }
        }
        return false;
    }

    public static final boolean y(w2 w2Var) {
        s.g(w2Var, "<this>");
        k d11 = w2Var.d();
        k.c t11 = d11 == null ? null : d11.t();
        return t11 != null && d.d(t11.b(), t11.d(), t11.e()) == 1;
    }

    public static final boolean z(w2 w2Var) {
        s.g(w2Var, "<this>");
        k d11 = w2Var.d();
        if (!(d11 == null ? false : s.c(d11.C0(), Boolean.TRUE))) {
            k d12 = w2Var.d();
            if (!(d12 == null ? false : s.c(d12.G0(), Boolean.TRUE))) {
                return false;
            }
        }
        return true;
    }
}