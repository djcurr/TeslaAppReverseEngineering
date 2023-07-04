package g3;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f3.d;
import f3.e;
import g3.b;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static b.a f27523a = new b.a();

    /* renamed from: b  reason: collision with root package name */
    private static int f27524b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static int f27525c = 0;

    private static boolean a(int i11, f3.e eVar) {
        e.b bVar;
        e.b bVar2;
        e.b y11 = eVar.y();
        e.b T = eVar.T();
        f3.f fVar = eVar.J() != null ? (f3.f) eVar.J() : null;
        if (fVar != null) {
            fVar.y();
            e.b bVar3 = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.T();
            e.b bVar4 = e.b.FIXED;
        }
        e.b bVar5 = e.b.FIXED;
        boolean z11 = y11 == bVar5 || eVar.n0() || y11 == e.b.WRAP_CONTENT || (y11 == (bVar2 = e.b.MATCH_CONSTRAINT) && eVar.f25742u == 0 && eVar.f25705b0 == BitmapDescriptorFactory.HUE_RED && eVar.a0(0)) || (y11 == bVar2 && eVar.f25742u == 1 && eVar.d0(0, eVar.W()));
        boolean z12 = T == bVar5 || eVar.o0() || T == e.b.WRAP_CONTENT || (T == (bVar = e.b.MATCH_CONSTRAINT) && eVar.f25744v == 0 && eVar.f25705b0 == BitmapDescriptorFactory.HUE_RED && eVar.a0(1)) || (T == bVar && eVar.f25744v == 1 && eVar.d0(1, eVar.v()));
        if (eVar.f25705b0 <= BitmapDescriptorFactory.HUE_RED || !(z11 || z12)) {
            return z11 && z12;
        }
        return true;
    }

    private static void b(int i11, f3.e eVar, b.InterfaceC0524b interfaceC0524b, boolean z11) {
        f3.d dVar;
        f3.d dVar2;
        f3.d dVar3;
        f3.d dVar4;
        if (eVar.g0()) {
            return;
        }
        boolean z12 = true;
        f27524b++;
        if (!(eVar instanceof f3.f) && eVar.m0()) {
            int i12 = i11 + 1;
            if (a(i12, eVar)) {
                f3.f.R1(i12, eVar, interfaceC0524b, new b.a(), b.a.f27487k);
            }
        }
        f3.d m11 = eVar.m(d.b.LEFT);
        f3.d m12 = eVar.m(d.b.RIGHT);
        int d11 = m11.d();
        int d12 = m12.d();
        if (m11.c() != null && m11.m()) {
            Iterator<f3.d> it2 = m11.c().iterator();
            while (it2.hasNext()) {
                f3.d next = it2.next();
                f3.e eVar2 = next.f25694d;
                int i13 = i11 + 1;
                boolean a11 = a(i13, eVar2);
                if (eVar2.m0() && a11) {
                    f3.f.R1(i13, eVar2, interfaceC0524b, new b.a(), b.a.f27487k);
                }
                boolean z13 = ((next == eVar2.M && (dVar4 = eVar2.O.f25696f) != null && dVar4.m()) || (next == eVar2.O && (dVar3 = eVar2.M.f25696f) != null && dVar3.m())) ? z12 : false;
                e.b y11 = eVar2.y();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (y11 == bVar && !a11) {
                    if (eVar2.y() == bVar && eVar2.f25748y >= 0 && eVar2.f25747x >= 0 && ((eVar2.V() == 8 || (eVar2.f25742u == 0 && eVar2.t() == BitmapDescriptorFactory.HUE_RED)) && !eVar2.i0() && !eVar2.l0() && z13 && !eVar2.i0())) {
                        e(i13, eVar, interfaceC0524b, eVar2, z11);
                    }
                } else if (!eVar2.m0()) {
                    f3.d dVar5 = eVar2.M;
                    if (next == dVar5 && eVar2.O.f25696f == null) {
                        int e11 = dVar5.e() + d11;
                        eVar2.E0(e11, eVar2.W() + e11);
                        b(i13, eVar2, interfaceC0524b, z11);
                    } else {
                        f3.d dVar6 = eVar2.O;
                        if (next == dVar6 && dVar5.f25696f == null) {
                            int e12 = d11 - dVar6.e();
                            eVar2.E0(e12 - eVar2.W(), e12);
                            b(i13, eVar2, interfaceC0524b, z11);
                        } else if (z13 && !eVar2.i0()) {
                            d(i13, interfaceC0524b, eVar2, z11);
                        }
                    }
                }
                z12 = true;
            }
        }
        if (eVar instanceof f3.g) {
            return;
        }
        if (m12.c() != null && m12.m()) {
            Iterator<f3.d> it3 = m12.c().iterator();
            while (it3.hasNext()) {
                f3.d next2 = it3.next();
                f3.e eVar3 = next2.f25694d;
                int i14 = i11 + 1;
                boolean a12 = a(i14, eVar3);
                if (eVar3.m0() && a12) {
                    f3.f.R1(i14, eVar3, interfaceC0524b, new b.a(), b.a.f27487k);
                }
                boolean z14 = (next2 == eVar3.M && (dVar2 = eVar3.O.f25696f) != null && dVar2.m()) || (next2 == eVar3.O && (dVar = eVar3.M.f25696f) != null && dVar.m());
                e.b y12 = eVar3.y();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (y12 == bVar2 && !a12) {
                    if (eVar3.y() == bVar2 && eVar3.f25748y >= 0 && eVar3.f25747x >= 0 && (eVar3.V() == 8 || (eVar3.f25742u == 0 && eVar3.t() == BitmapDescriptorFactory.HUE_RED))) {
                        if (!eVar3.i0() && !eVar3.l0() && z14 && !eVar3.i0()) {
                            e(i14, eVar, interfaceC0524b, eVar3, z11);
                        }
                    }
                } else if (!eVar3.m0()) {
                    f3.d dVar7 = eVar3.M;
                    if (next2 == dVar7 && eVar3.O.f25696f == null) {
                        int e13 = dVar7.e() + d12;
                        eVar3.E0(e13, eVar3.W() + e13);
                        b(i14, eVar3, interfaceC0524b, z11);
                    } else {
                        f3.d dVar8 = eVar3.O;
                        if (next2 == dVar8 && dVar7.f25696f == null) {
                            int e14 = d12 - dVar8.e();
                            eVar3.E0(e14 - eVar3.W(), e14);
                            b(i14, eVar3, interfaceC0524b, z11);
                        } else if (z14 && !eVar3.i0()) {
                            d(i14, interfaceC0524b, eVar3, z11);
                        }
                    }
                }
            }
        }
        eVar.q0();
    }

    private static void c(int i11, f3.a aVar, b.InterfaceC0524b interfaceC0524b, int i12, boolean z11) {
        if (aVar.s1()) {
            if (i12 == 0) {
                b(i11 + 1, aVar, interfaceC0524b, z11);
            } else {
                i(i11 + 1, aVar, interfaceC0524b);
            }
        }
    }

    private static void d(int i11, b.InterfaceC0524b interfaceC0524b, f3.e eVar, boolean z11) {
        float w11 = eVar.w();
        int d11 = eVar.M.f25696f.d();
        int d12 = eVar.O.f25696f.d();
        int e11 = eVar.M.e() + d11;
        int e12 = d12 - eVar.O.e();
        if (d11 == d12) {
            w11 = 0.5f;
        } else {
            d11 = e11;
            d12 = e12;
        }
        int W = eVar.W();
        int i12 = (d12 - d11) - W;
        if (d11 > d12) {
            i12 = (d11 - d12) - W;
        }
        int i13 = ((int) (i12 > 0 ? (w11 * i12) + 0.5f : w11 * i12)) + d11;
        int i14 = i13 + W;
        if (d11 > d12) {
            i14 = i13 - W;
        }
        eVar.E0(i13, i14);
        b(i11 + 1, eVar, interfaceC0524b, z11);
    }

    private static void e(int i11, f3.e eVar, b.InterfaceC0524b interfaceC0524b, f3.e eVar2, boolean z11) {
        int W;
        float w11 = eVar2.w();
        int d11 = eVar2.M.f25696f.d() + eVar2.M.e();
        int d12 = eVar2.O.f25696f.d() - eVar2.O.e();
        if (d12 >= d11) {
            int W2 = eVar2.W();
            if (eVar2.V() != 8) {
                int i12 = eVar2.f25742u;
                if (i12 == 2) {
                    if (eVar instanceof f3.f) {
                        W = eVar.W();
                    } else {
                        W = eVar.J().W();
                    }
                    W2 = (int) (eVar2.w() * 0.5f * W);
                } else if (i12 == 0) {
                    W2 = d12 - d11;
                }
                W2 = Math.max(eVar2.f25747x, W2);
                int i13 = eVar2.f25748y;
                if (i13 > 0) {
                    W2 = Math.min(i13, W2);
                }
            }
            int i14 = d11 + ((int) ((w11 * ((d12 - d11) - W2)) + 0.5f));
            eVar2.E0(i14, W2 + i14);
            b(i11 + 1, eVar2, interfaceC0524b, z11);
        }
    }

    private static void f(int i11, b.InterfaceC0524b interfaceC0524b, f3.e eVar) {
        float R = eVar.R();
        int d11 = eVar.N.f25696f.d();
        int d12 = eVar.P.f25696f.d();
        int e11 = eVar.N.e() + d11;
        int e12 = d12 - eVar.P.e();
        if (d11 == d12) {
            R = 0.5f;
        } else {
            d11 = e11;
            d12 = e12;
        }
        int v11 = eVar.v();
        int i12 = (d12 - d11) - v11;
        if (d11 > d12) {
            i12 = (d11 - d12) - v11;
        }
        int i13 = (int) (i12 > 0 ? (R * i12) + 0.5f : R * i12);
        int i14 = d11 + i13;
        int i15 = i14 + v11;
        if (d11 > d12) {
            i14 = d11 - i13;
            i15 = i14 - v11;
        }
        eVar.H0(i14, i15);
        i(i11 + 1, eVar, interfaceC0524b);
    }

    private static void g(int i11, f3.e eVar, b.InterfaceC0524b interfaceC0524b, f3.e eVar2) {
        int v11;
        float R = eVar2.R();
        int d11 = eVar2.N.f25696f.d() + eVar2.N.e();
        int d12 = eVar2.P.f25696f.d() - eVar2.P.e();
        if (d12 >= d11) {
            int v12 = eVar2.v();
            if (eVar2.V() != 8) {
                int i12 = eVar2.f25744v;
                if (i12 == 2) {
                    if (eVar instanceof f3.f) {
                        v11 = eVar.v();
                    } else {
                        v11 = eVar.J().v();
                    }
                    v12 = (int) (R * 0.5f * v11);
                } else if (i12 == 0) {
                    v12 = d12 - d11;
                }
                v12 = Math.max(eVar2.A, v12);
                int i13 = eVar2.B;
                if (i13 > 0) {
                    v12 = Math.min(i13, v12);
                }
            }
            int i14 = d11 + ((int) ((R * ((d12 - d11) - v12)) + 0.5f));
            eVar2.H0(i14, v12 + i14);
            i(i11 + 1, eVar2, interfaceC0524b);
        }
    }

    public static void h(f3.f fVar, b.InterfaceC0524b interfaceC0524b) {
        e.b y11 = fVar.y();
        e.b T = fVar.T();
        f27524b = 0;
        f27525c = 0;
        fVar.u0();
        ArrayList<f3.e> q12 = fVar.q1();
        int size = q12.size();
        for (int i11 = 0; i11 < size; i11++) {
            q12.get(i11).u0();
        }
        boolean O1 = fVar.O1();
        if (y11 == e.b.FIXED) {
            fVar.E0(0, fVar.W());
        } else {
            fVar.F0(0);
        }
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            f3.e eVar = q12.get(i12);
            if (eVar instanceof f3.g) {
                f3.g gVar = (f3.g) eVar;
                if (gVar.r1() == 1) {
                    if (gVar.s1() != -1) {
                        gVar.v1(gVar.s1());
                    } else if (gVar.t1() != -1 && fVar.n0()) {
                        gVar.v1(fVar.W() - gVar.t1());
                    } else if (fVar.n0()) {
                        gVar.v1((int) ((gVar.u1() * fVar.W()) + 0.5f));
                    }
                    z11 = true;
                }
            } else if ((eVar instanceof f3.a) && ((f3.a) eVar).w1() == 0) {
                z12 = true;
            }
        }
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                f3.e eVar2 = q12.get(i13);
                if (eVar2 instanceof f3.g) {
                    f3.g gVar2 = (f3.g) eVar2;
                    if (gVar2.r1() == 1) {
                        b(0, gVar2, interfaceC0524b, O1);
                    }
                }
            }
        }
        b(0, fVar, interfaceC0524b, O1);
        if (z12) {
            for (int i14 = 0; i14 < size; i14++) {
                f3.e eVar3 = q12.get(i14);
                if (eVar3 instanceof f3.a) {
                    f3.a aVar = (f3.a) eVar3;
                    if (aVar.w1() == 0) {
                        c(0, aVar, interfaceC0524b, 0, O1);
                    }
                }
            }
        }
        if (T == e.b.FIXED) {
            fVar.H0(0, fVar.v());
        } else {
            fVar.G0(0);
        }
        boolean z13 = false;
        boolean z14 = false;
        for (int i15 = 0; i15 < size; i15++) {
            f3.e eVar4 = q12.get(i15);
            if (eVar4 instanceof f3.g) {
                f3.g gVar3 = (f3.g) eVar4;
                if (gVar3.r1() == 0) {
                    if (gVar3.s1() != -1) {
                        gVar3.v1(gVar3.s1());
                    } else if (gVar3.t1() != -1 && fVar.o0()) {
                        gVar3.v1(fVar.v() - gVar3.t1());
                    } else if (fVar.o0()) {
                        gVar3.v1((int) ((gVar3.u1() * fVar.v()) + 0.5f));
                    }
                    z13 = true;
                }
            } else if ((eVar4 instanceof f3.a) && ((f3.a) eVar4).w1() == 1) {
                z14 = true;
            }
        }
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                f3.e eVar5 = q12.get(i16);
                if (eVar5 instanceof f3.g) {
                    f3.g gVar4 = (f3.g) eVar5;
                    if (gVar4.r1() == 0) {
                        i(1, gVar4, interfaceC0524b);
                    }
                }
            }
        }
        i(0, fVar, interfaceC0524b);
        if (z14) {
            for (int i17 = 0; i17 < size; i17++) {
                f3.e eVar6 = q12.get(i17);
                if (eVar6 instanceof f3.a) {
                    f3.a aVar2 = (f3.a) eVar6;
                    if (aVar2.w1() == 1) {
                        c(0, aVar2, interfaceC0524b, 1, O1);
                    }
                }
            }
        }
        for (int i18 = 0; i18 < size; i18++) {
            f3.e eVar7 = q12.get(i18);
            if (eVar7.m0() && a(0, eVar7)) {
                f3.f.R1(0, eVar7, interfaceC0524b, f27523a, b.a.f27487k);
                if (eVar7 instanceof f3.g) {
                    if (((f3.g) eVar7).r1() == 0) {
                        i(0, eVar7, interfaceC0524b);
                    } else {
                        b(0, eVar7, interfaceC0524b, O1);
                    }
                } else {
                    b(0, eVar7, interfaceC0524b, O1);
                    i(0, eVar7, interfaceC0524b);
                }
            }
        }
    }

    private static void i(int i11, f3.e eVar, b.InterfaceC0524b interfaceC0524b) {
        f3.d dVar;
        f3.d dVar2;
        f3.d dVar3;
        f3.d dVar4;
        if (eVar.p0()) {
            return;
        }
        f27525c++;
        if (!(eVar instanceof f3.f) && eVar.m0()) {
            int i12 = i11 + 1;
            if (a(i12, eVar)) {
                f3.f.R1(i12, eVar, interfaceC0524b, new b.a(), b.a.f27487k);
            }
        }
        f3.d m11 = eVar.m(d.b.TOP);
        f3.d m12 = eVar.m(d.b.BOTTOM);
        int d11 = m11.d();
        int d12 = m12.d();
        if (m11.c() != null && m11.m()) {
            Iterator<f3.d> it2 = m11.c().iterator();
            while (it2.hasNext()) {
                f3.d next = it2.next();
                f3.e eVar2 = next.f25694d;
                int i13 = i11 + 1;
                boolean a11 = a(i13, eVar2);
                if (eVar2.m0() && a11) {
                    f3.f.R1(i13, eVar2, interfaceC0524b, new b.a(), b.a.f27487k);
                }
                boolean z11 = (next == eVar2.N && (dVar4 = eVar2.P.f25696f) != null && dVar4.m()) || (next == eVar2.P && (dVar3 = eVar2.N.f25696f) != null && dVar3.m());
                e.b T = eVar2.T();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (T == bVar && !a11) {
                    if (eVar2.T() == bVar && eVar2.B >= 0 && eVar2.A >= 0 && (eVar2.V() == 8 || (eVar2.f25744v == 0 && eVar2.t() == BitmapDescriptorFactory.HUE_RED))) {
                        if (!eVar2.k0() && !eVar2.l0() && z11 && !eVar2.k0()) {
                            g(i13, eVar, interfaceC0524b, eVar2);
                        }
                    }
                } else if (!eVar2.m0()) {
                    f3.d dVar5 = eVar2.N;
                    if (next == dVar5 && eVar2.P.f25696f == null) {
                        int e11 = dVar5.e() + d11;
                        eVar2.H0(e11, eVar2.v() + e11);
                        i(i13, eVar2, interfaceC0524b);
                    } else {
                        f3.d dVar6 = eVar2.P;
                        if (next == dVar6 && dVar5.f25696f == null) {
                            int e12 = d11 - dVar6.e();
                            eVar2.H0(e12 - eVar2.v(), e12);
                            i(i13, eVar2, interfaceC0524b);
                        } else if (z11 && !eVar2.k0()) {
                            f(i13, interfaceC0524b, eVar2);
                        }
                    }
                }
            }
        }
        if (eVar instanceof f3.g) {
            return;
        }
        if (m12.c() != null && m12.m()) {
            Iterator<f3.d> it3 = m12.c().iterator();
            while (it3.hasNext()) {
                f3.d next2 = it3.next();
                f3.e eVar3 = next2.f25694d;
                int i14 = i11 + 1;
                boolean a12 = a(i14, eVar3);
                if (eVar3.m0() && a12) {
                    f3.f.R1(i14, eVar3, interfaceC0524b, new b.a(), b.a.f27487k);
                }
                boolean z12 = (next2 == eVar3.N && (dVar2 = eVar3.P.f25696f) != null && dVar2.m()) || (next2 == eVar3.P && (dVar = eVar3.N.f25696f) != null && dVar.m());
                e.b T2 = eVar3.T();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (T2 == bVar2 && !a12) {
                    if (eVar3.T() == bVar2 && eVar3.B >= 0 && eVar3.A >= 0 && (eVar3.V() == 8 || (eVar3.f25744v == 0 && eVar3.t() == BitmapDescriptorFactory.HUE_RED))) {
                        if (!eVar3.k0() && !eVar3.l0() && z12 && !eVar3.k0()) {
                            g(i14, eVar, interfaceC0524b, eVar3);
                        }
                    }
                } else if (!eVar3.m0()) {
                    f3.d dVar7 = eVar3.N;
                    if (next2 == dVar7 && eVar3.P.f25696f == null) {
                        int e13 = dVar7.e() + d12;
                        eVar3.H0(e13, eVar3.v() + e13);
                        i(i14, eVar3, interfaceC0524b);
                    } else {
                        f3.d dVar8 = eVar3.P;
                        if (next2 == dVar8 && dVar7.f25696f == null) {
                            int e14 = d12 - dVar8.e();
                            eVar3.H0(e14 - eVar3.v(), e14);
                            i(i14, eVar3, interfaceC0524b);
                        } else if (z12 && !eVar3.k0()) {
                            f(i14, interfaceC0524b, eVar3);
                        }
                    }
                }
            }
        }
        f3.d m13 = eVar.m(d.b.BASELINE);
        if (m13.c() != null && m13.m()) {
            int d13 = m13.d();
            Iterator<f3.d> it4 = m13.c().iterator();
            while (it4.hasNext()) {
                f3.d next3 = it4.next();
                f3.e eVar4 = next3.f25694d;
                int i15 = i11 + 1;
                boolean a13 = a(i15, eVar4);
                if (eVar4.m0() && a13) {
                    f3.f.R1(i15, eVar4, interfaceC0524b, new b.a(), b.a.f27487k);
                }
                if (eVar4.T() != e.b.MATCH_CONSTRAINT || a13) {
                    if (!eVar4.m0() && next3 == eVar4.Q) {
                        eVar4.D0(next3.e() + d13);
                        i(i15, eVar4, interfaceC0524b);
                    }
                }
            }
        }
        eVar.r0();
    }
}