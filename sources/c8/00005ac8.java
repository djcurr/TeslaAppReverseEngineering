package com.stripe.android.ui.core.elements;

import androidx.compose.ui.platform.d1;
import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e;
import c1.e1;
import c1.g1;
import c1.h;
import c1.i;
import c1.o0;
import c1.s1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.u;
import f2.z;
import h2.a;
import j1.c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.s;
import m00.l;
import o1.f;
import p0.a;
import p0.b0;
import p0.c0;
import p0.d0;
import p0.e0;
import r1.g;
import wz.n0;
import wz.x;
import x2.d;
import x2.q;

/* loaded from: classes6.dex */
public final class OTPElementUIKt {
    public static final void OTPElementUI(boolean z11, OTPElement element, f fVar, i iVar, int i11, int i12) {
        m00.i r11;
        int t11;
        s.g(element, "element");
        i h11 = iVar.h(-702586682);
        f.a aVar = (i12 & 4) != 0 ? f.f42062f1 : fVar;
        g gVar = (g) h11.A(l0.e());
        h11.x(-3687241);
        Object y11 = h11.y();
        i.a aVar2 = i.f8486a;
        if (y11 == aVar2.a()) {
            y11 = new r1.s();
            h11.p(y11);
        }
        h11.N();
        r1.s sVar = (r1.s) y11;
        n1 b11 = d1.f2888a.b(h11, 8);
        Object obj = null;
        f n11 = e0.n(aVar, BitmapDescriptorFactory.HUE_RED, 1, null);
        a.e f11 = a.f45228a.f();
        h11.x(-1989997165);
        z b12 = b0.b(f11, o1.a.f42039a.i(), h11, 6);
        h11.x(1376089394);
        d dVar = (d) h11.A(l0.d());
        q qVar = (q) h11.A(l0.i());
        y1 y1Var = (y1) h11.A(l0.m());
        a.C0551a c0551a = h2.a.Y0;
        h00.a<h2.a> a11 = c0551a.a();
        h00.q<g1<h2.a>, i, Integer, vz.b0> b13 = u.b(n11);
        if (!(h11.k() instanceof e)) {
            h.c();
        }
        h11.D();
        if (h11.f()) {
            h11.s(a11);
        } else {
            h11.o();
        }
        h11.E();
        i a12 = a2.a(h11);
        a2.c(a12, b12, c0551a.d());
        a2.c(a12, dVar, c0551a.b());
        a2.c(a12, qVar, c0551a.c());
        a2.c(a12, y1Var, c0551a.f());
        h11.c();
        b13.invoke(g1.a(g1.b(h11)), h11, 0);
        h11.x(2058660585);
        h11.x(-326682362);
        d0 d0Var = d0.f45271a;
        h11.x(-3687241);
        Object y12 = h11.y();
        int i13 = 2;
        if (y12 == aVar2.a()) {
            y12 = s1.d(-1, null, 2, null);
            h11.p(y12);
        }
        h11.N();
        o0 o0Var = (o0) y12;
        h11.x(-2061524251);
        r11 = l.r(0, element.getController().getOtpLength());
        t11 = x.t(r11, 10);
        ArrayList arrayList = new ArrayList(t11);
        Iterator<Integer> it2 = r11.iterator();
        while (it2.hasNext()) {
            ArrayList arrayList2 = arrayList;
            SectionUIKt.SectionCard(p0.u.j(c0.a.a(d0Var, f.f42062f1, 1.0f, false, 2, null), x2.g.f(i13), BitmapDescriptorFactory.HUE_RED, i13, obj), false, c.b(h11, -819893108, true, new OTPElementUIKt$OTPElementUI$1$1$1(element, ((n0) it2).a(), o0Var, sVar, z11, i11, gVar)), h11, 384, 2);
            arrayList2.add(vz.b0.f54756a);
            arrayList = arrayList2;
            i13 = i13;
            obj = null;
        }
        h11.N();
        c1.b0.d(vz.b0.f54756a, new OTPElementUIKt$OTPElementUI$1$2(sVar, b11, null), h11, 0);
        h11.N();
        h11.N();
        h11.q();
        h11.N();
        h11.N();
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new OTPElementUIKt$OTPElementUI$2(z11, element, aVar, i11, i12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OTPElementUI$lambda-5$lambda-2  reason: not valid java name */
    public static final int m448OTPElementUI$lambda5$lambda2(o0<Integer> o0Var) {
        return o0Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OTPElementUI$lambda-5$lambda-3  reason: not valid java name */
    public static final void m449OTPElementUI$lambda5$lambda3(o0<Integer> o0Var, int i11) {
        o0Var.setValue(Integer.valueOf(i11));
    }
}