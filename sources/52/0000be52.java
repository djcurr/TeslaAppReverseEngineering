package x1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import wz.e0;
import wz.n0;
import wz.v;
import wz.x;
import x1.f;

/* loaded from: classes.dex */
public final class g {
    public static final List<f> a(char c11, float[] args) {
        m00.g q11;
        ArrayList arrayList;
        int t11;
        m00.i r11;
        List<Float> i02;
        float[] L0;
        m00.g q12;
        int t12;
        m00.i r12;
        List<Float> i03;
        float[] L02;
        m00.g q13;
        int t13;
        m00.i r13;
        List<Float> i04;
        float[] L03;
        m00.g q14;
        int t14;
        m00.i r14;
        List<Float> i05;
        float[] L04;
        m00.g q15;
        int t15;
        m00.i r15;
        List<Float> i06;
        float[] L05;
        m00.g q16;
        int t16;
        m00.i r16;
        List<Float> i07;
        float[] L06;
        m00.g q17;
        int t17;
        m00.i r17;
        List<Float> i08;
        float[] L07;
        m00.g q18;
        int t18;
        m00.i r18;
        List<Float> i09;
        float[] L08;
        m00.g q19;
        int t19;
        m00.i r19;
        List<Float> i010;
        float[] L09;
        m00.g q21;
        int t21;
        m00.i r21;
        List<Float> i011;
        float[] L010;
        f mVar;
        m00.g q22;
        int t22;
        m00.i r22;
        List<Float> i012;
        float[] L011;
        m00.g q23;
        int t23;
        m00.i r23;
        List<Float> i013;
        float[] L012;
        m00.g q24;
        int t24;
        m00.i r24;
        List<Float> i014;
        float[] L013;
        m00.g q25;
        int t25;
        m00.i r25;
        List<Float> i015;
        float[] L014;
        m00.g q26;
        int t26;
        m00.i r26;
        List<Float> i016;
        float[] L015;
        m00.g q27;
        int t27;
        m00.i r27;
        List<Float> i017;
        float[] L016;
        m00.g q28;
        int t28;
        m00.i r28;
        List<Float> i018;
        float[] L017;
        m00.g q29;
        int t29;
        m00.i r29;
        List<Float> i019;
        float[] L018;
        List<f> d11;
        kotlin.jvm.internal.s.g(args, "args");
        if (c11 == 'z' || c11 == 'Z') {
            d11 = v.d(f.b.f56719c);
            return d11;
        }
        if (c11 == 'm') {
            q29 = m00.l.q(new m00.i(0, args.length - 2), 2);
            t29 = x.t(q29, 10);
            arrayList = new ArrayList(t29);
            Iterator<Integer> it2 = q29.iterator();
            while (it2.hasNext()) {
                int a11 = ((n0) it2).a();
                r29 = m00.l.r(a11, a11 + 2);
                i019 = wz.p.i0(args, r29);
                L018 = e0.L0(i019);
                f nVar = new f.n(L018[0], L018[1]);
                if ((nVar instanceof f.C1297f) && a11 > 0) {
                    nVar = new f.e(L018[0], L018[1]);
                } else if (a11 > 0) {
                    nVar = new f.m(L018[0], L018[1]);
                }
                arrayList.add(nVar);
            }
        } else if (c11 == 'M') {
            q28 = m00.l.q(new m00.i(0, args.length - 2), 2);
            t28 = x.t(q28, 10);
            arrayList = new ArrayList(t28);
            Iterator<Integer> it3 = q28.iterator();
            while (it3.hasNext()) {
                int a12 = ((n0) it3).a();
                r28 = m00.l.r(a12, a12 + 2);
                i018 = wz.p.i0(args, r28);
                L017 = e0.L0(i018);
                f c1297f = new f.C1297f(L017[0], L017[1]);
                if (a12 > 0) {
                    c1297f = new f.e(L017[0], L017[1]);
                } else if ((c1297f instanceof f.n) && a12 > 0) {
                    c1297f = new f.m(L017[0], L017[1]);
                }
                arrayList.add(c1297f);
            }
        } else if (c11 == 'l') {
            q27 = m00.l.q(new m00.i(0, args.length - 2), 2);
            t27 = x.t(q27, 10);
            arrayList = new ArrayList(t27);
            Iterator<Integer> it4 = q27.iterator();
            while (it4.hasNext()) {
                int a13 = ((n0) it4).a();
                r27 = m00.l.r(a13, a13 + 2);
                i017 = wz.p.i0(args, r27);
                L016 = e0.L0(i017);
                f mVar2 = new f.m(L016[0], L016[1]);
                if ((mVar2 instanceof f.C1297f) && a13 > 0) {
                    mVar2 = new f.e(L016[0], L016[1]);
                } else if ((mVar2 instanceof f.n) && a13 > 0) {
                    mVar2 = new f.m(L016[0], L016[1]);
                }
                arrayList.add(mVar2);
            }
        } else if (c11 == 'L') {
            q26 = m00.l.q(new m00.i(0, args.length - 2), 2);
            t26 = x.t(q26, 10);
            arrayList = new ArrayList(t26);
            Iterator<Integer> it5 = q26.iterator();
            while (it5.hasNext()) {
                int a14 = ((n0) it5).a();
                r26 = m00.l.r(a14, a14 + 2);
                i016 = wz.p.i0(args, r26);
                L015 = e0.L0(i016);
                f eVar = new f.e(L015[0], L015[1]);
                if ((eVar instanceof f.C1297f) && a14 > 0) {
                    eVar = new f.e(L015[0], L015[1]);
                } else if ((eVar instanceof f.n) && a14 > 0) {
                    eVar = new f.m(L015[0], L015[1]);
                }
                arrayList.add(eVar);
            }
        } else if (c11 == 'h') {
            q25 = m00.l.q(new m00.i(0, args.length - 1), 1);
            t25 = x.t(q25, 10);
            arrayList = new ArrayList(t25);
            Iterator<Integer> it6 = q25.iterator();
            while (it6.hasNext()) {
                int a15 = ((n0) it6).a();
                r25 = m00.l.r(a15, a15 + 1);
                i015 = wz.p.i0(args, r25);
                L014 = e0.L0(i015);
                f lVar = new f.l(L014[0]);
                if ((lVar instanceof f.C1297f) && a15 > 0) {
                    lVar = new f.e(L014[0], L014[1]);
                } else if ((lVar instanceof f.n) && a15 > 0) {
                    lVar = new f.m(L014[0], L014[1]);
                }
                arrayList.add(lVar);
            }
        } else if (c11 == 'H') {
            q24 = m00.l.q(new m00.i(0, args.length - 1), 1);
            t24 = x.t(q24, 10);
            arrayList = new ArrayList(t24);
            Iterator<Integer> it7 = q24.iterator();
            while (it7.hasNext()) {
                int a16 = ((n0) it7).a();
                r24 = m00.l.r(a16, a16 + 1);
                i014 = wz.p.i0(args, r24);
                L013 = e0.L0(i014);
                f dVar = new f.d(L013[0]);
                if ((dVar instanceof f.C1297f) && a16 > 0) {
                    dVar = new f.e(L013[0], L013[1]);
                } else if ((dVar instanceof f.n) && a16 > 0) {
                    dVar = new f.m(L013[0], L013[1]);
                }
                arrayList.add(dVar);
            }
        } else if (c11 == 'v') {
            q23 = m00.l.q(new m00.i(0, args.length - 1), 1);
            t23 = x.t(q23, 10);
            arrayList = new ArrayList(t23);
            Iterator<Integer> it8 = q23.iterator();
            while (it8.hasNext()) {
                int a17 = ((n0) it8).a();
                r23 = m00.l.r(a17, a17 + 1);
                i013 = wz.p.i0(args, r23);
                L012 = e0.L0(i013);
                f rVar = new f.r(L012[0]);
                if ((rVar instanceof f.C1297f) && a17 > 0) {
                    rVar = new f.e(L012[0], L012[1]);
                } else if ((rVar instanceof f.n) && a17 > 0) {
                    rVar = new f.m(L012[0], L012[1]);
                }
                arrayList.add(rVar);
            }
        } else if (c11 == 'V') {
            q22 = m00.l.q(new m00.i(0, args.length - 1), 1);
            t22 = x.t(q22, 10);
            arrayList = new ArrayList(t22);
            Iterator<Integer> it9 = q22.iterator();
            while (it9.hasNext()) {
                int a18 = ((n0) it9).a();
                r22 = m00.l.r(a18, a18 + 1);
                i012 = wz.p.i0(args, r22);
                L011 = e0.L0(i012);
                f sVar = new f.s(L011[0]);
                if ((sVar instanceof f.C1297f) && a18 > 0) {
                    sVar = new f.e(L011[0], L011[1]);
                } else if ((sVar instanceof f.n) && a18 > 0) {
                    sVar = new f.m(L011[0], L011[1]);
                }
                arrayList.add(sVar);
            }
        } else {
            char c12 = 5;
            if (c11 == 'c') {
                q21 = m00.l.q(new m00.i(0, args.length - 6), 6);
                t21 = x.t(q21, 10);
                arrayList = new ArrayList(t21);
                Iterator<Integer> it10 = q21.iterator();
                while (it10.hasNext()) {
                    int a19 = ((n0) it10).a();
                    r21 = m00.l.r(a19, a19 + 6);
                    i011 = wz.p.i0(args, r21);
                    L010 = e0.L0(i011);
                    f kVar = new f.k(L010[0], L010[1], L010[2], L010[3], L010[4], L010[c12]);
                    if (!(kVar instanceof f.C1297f) || a19 <= 0) {
                        mVar = (!(kVar instanceof f.n) || a19 <= 0) ? kVar : new f.m(L010[0], L010[1]);
                    } else {
                        mVar = new f.e(L010[0], L010[1]);
                    }
                    arrayList.add(mVar);
                    c12 = 5;
                }
            } else if (c11 == 'C') {
                q19 = m00.l.q(new m00.i(0, args.length - 6), 6);
                t19 = x.t(q19, 10);
                arrayList = new ArrayList(t19);
                Iterator<Integer> it11 = q19.iterator();
                while (it11.hasNext()) {
                    int a21 = ((n0) it11).a();
                    r19 = m00.l.r(a21, a21 + 6);
                    i010 = wz.p.i0(args, r19);
                    L09 = e0.L0(i010);
                    f cVar = new f.c(L09[0], L09[1], L09[2], L09[3], L09[4], L09[5]);
                    if ((cVar instanceof f.C1297f) && a21 > 0) {
                        cVar = new f.e(L09[0], L09[1]);
                    } else if ((cVar instanceof f.n) && a21 > 0) {
                        cVar = new f.m(L09[0], L09[1]);
                    }
                    arrayList.add(cVar);
                }
            } else if (c11 == 's') {
                q18 = m00.l.q(new m00.i(0, args.length - 4), 4);
                t18 = x.t(q18, 10);
                arrayList = new ArrayList(t18);
                Iterator<Integer> it12 = q18.iterator();
                while (it12.hasNext()) {
                    int a22 = ((n0) it12).a();
                    r18 = m00.l.r(a22, a22 + 4);
                    i09 = wz.p.i0(args, r18);
                    L08 = e0.L0(i09);
                    f pVar = new f.p(L08[0], L08[1], L08[2], L08[3]);
                    if ((pVar instanceof f.C1297f) && a22 > 0) {
                        pVar = new f.e(L08[0], L08[1]);
                    } else if ((pVar instanceof f.n) && a22 > 0) {
                        pVar = new f.m(L08[0], L08[1]);
                    }
                    arrayList.add(pVar);
                }
            } else if (c11 == 'S') {
                q17 = m00.l.q(new m00.i(0, args.length - 4), 4);
                t17 = x.t(q17, 10);
                arrayList = new ArrayList(t17);
                Iterator<Integer> it13 = q17.iterator();
                while (it13.hasNext()) {
                    int a23 = ((n0) it13).a();
                    r17 = m00.l.r(a23, a23 + 4);
                    i08 = wz.p.i0(args, r17);
                    L07 = e0.L0(i08);
                    f hVar = new f.h(L07[0], L07[1], L07[2], L07[3]);
                    if ((hVar instanceof f.C1297f) && a23 > 0) {
                        hVar = new f.e(L07[0], L07[1]);
                    } else if ((hVar instanceof f.n) && a23 > 0) {
                        hVar = new f.m(L07[0], L07[1]);
                    }
                    arrayList.add(hVar);
                }
            } else if (c11 == 'q') {
                q16 = m00.l.q(new m00.i(0, args.length - 4), 4);
                t16 = x.t(q16, 10);
                arrayList = new ArrayList(t16);
                Iterator<Integer> it14 = q16.iterator();
                while (it14.hasNext()) {
                    int a24 = ((n0) it14).a();
                    r16 = m00.l.r(a24, a24 + 4);
                    i07 = wz.p.i0(args, r16);
                    L06 = e0.L0(i07);
                    f oVar = new f.o(L06[0], L06[1], L06[2], L06[3]);
                    if ((oVar instanceof f.C1297f) && a24 > 0) {
                        oVar = new f.e(L06[0], L06[1]);
                    } else if ((oVar instanceof f.n) && a24 > 0) {
                        oVar = new f.m(L06[0], L06[1]);
                    }
                    arrayList.add(oVar);
                }
            } else if (c11 == 'Q') {
                q15 = m00.l.q(new m00.i(0, args.length - 4), 4);
                t15 = x.t(q15, 10);
                arrayList = new ArrayList(t15);
                Iterator<Integer> it15 = q15.iterator();
                while (it15.hasNext()) {
                    int a25 = ((n0) it15).a();
                    r15 = m00.l.r(a25, a25 + 4);
                    i06 = wz.p.i0(args, r15);
                    L05 = e0.L0(i06);
                    f gVar = new f.g(L05[0], L05[1], L05[2], L05[3]);
                    if ((gVar instanceof f.C1297f) && a25 > 0) {
                        gVar = new f.e(L05[0], L05[1]);
                    } else if ((gVar instanceof f.n) && a25 > 0) {
                        gVar = new f.m(L05[0], L05[1]);
                    }
                    arrayList.add(gVar);
                }
            } else if (c11 == 't') {
                q14 = m00.l.q(new m00.i(0, args.length - 2), 2);
                t14 = x.t(q14, 10);
                arrayList = new ArrayList(t14);
                Iterator<Integer> it16 = q14.iterator();
                while (it16.hasNext()) {
                    int a26 = ((n0) it16).a();
                    r14 = m00.l.r(a26, a26 + 2);
                    i05 = wz.p.i0(args, r14);
                    L04 = e0.L0(i05);
                    f qVar = new f.q(L04[0], L04[1]);
                    if ((qVar instanceof f.C1297f) && a26 > 0) {
                        qVar = new f.e(L04[0], L04[1]);
                    } else if ((qVar instanceof f.n) && a26 > 0) {
                        qVar = new f.m(L04[0], L04[1]);
                    }
                    arrayList.add(qVar);
                }
            } else if (c11 == 'T') {
                q13 = m00.l.q(new m00.i(0, args.length - 2), 2);
                t13 = x.t(q13, 10);
                arrayList = new ArrayList(t13);
                Iterator<Integer> it17 = q13.iterator();
                while (it17.hasNext()) {
                    int a27 = ((n0) it17).a();
                    r13 = m00.l.r(a27, a27 + 2);
                    i04 = wz.p.i0(args, r13);
                    L03 = e0.L0(i04);
                    f iVar = new f.i(L03[0], L03[1]);
                    if ((iVar instanceof f.C1297f) && a27 > 0) {
                        iVar = new f.e(L03[0], L03[1]);
                    } else if ((iVar instanceof f.n) && a27 > 0) {
                        iVar = new f.m(L03[0], L03[1]);
                    }
                    arrayList.add(iVar);
                }
            } else if (c11 == 'a') {
                q12 = m00.l.q(new m00.i(0, args.length - 7), 7);
                t12 = x.t(q12, 10);
                arrayList = new ArrayList(t12);
                Iterator<Integer> it18 = q12.iterator();
                while (it18.hasNext()) {
                    int a28 = ((n0) it18).a();
                    r12 = m00.l.r(a28, a28 + 7);
                    i03 = wz.p.i0(args, r12);
                    L02 = e0.L0(i03);
                    f jVar = new f.j(L02[0], L02[1], L02[2], Float.compare(L02[3], BitmapDescriptorFactory.HUE_RED) != 0, Float.compare(L02[4], BitmapDescriptorFactory.HUE_RED) != 0, L02[5], L02[6]);
                    if ((jVar instanceof f.C1297f) && a28 > 0) {
                        jVar = new f.e(L02[0], L02[1]);
                    } else if ((jVar instanceof f.n) && a28 > 0) {
                        jVar = new f.m(L02[0], L02[1]);
                    }
                    arrayList.add(jVar);
                }
            } else if (c11 == 'A') {
                q11 = m00.l.q(new m00.i(0, args.length - 7), 7);
                t11 = x.t(q11, 10);
                arrayList = new ArrayList(t11);
                Iterator<Integer> it19 = q11.iterator();
                while (it19.hasNext()) {
                    int a29 = ((n0) it19).a();
                    r11 = m00.l.r(a29, a29 + 7);
                    i02 = wz.p.i0(args, r11);
                    L0 = e0.L0(i02);
                    f aVar = new f.a(L0[0], L0[1], L0[2], Float.compare(L0[3], BitmapDescriptorFactory.HUE_RED) != 0, Float.compare(L0[4], BitmapDescriptorFactory.HUE_RED) != 0, L0[5], L0[6]);
                    if ((aVar instanceof f.C1297f) && a29 > 0) {
                        aVar = new f.e(L0[0], L0[1]);
                    } else if ((aVar instanceof f.n) && a29 > 0) {
                        aVar = new f.m(L0[0], L0[1]);
                    }
                    arrayList.add(aVar);
                }
            } else {
                throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Unknown command for: ", Character.valueOf(c11)));
            }
        }
        return arrayList;
    }
}