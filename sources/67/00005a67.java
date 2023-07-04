package com.stripe.android.ui.core.elements;

import a2.b;
import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e;
import c1.e1;
import c1.g1;
import c1.h;
import c1.i;
import c1.n1;
import c1.o0;
import c1.s1;
import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.ui.core.PaymentsThemeKt;
import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.elements.menu.MenuKt;
import f2.u;
import f2.z;
import h2.a;
import java.util.List;
import kotlin.jvm.internal.s;
import o0.l;
import o0.m;
import o1.a;
import o1.f;
import p0.c;
import p0.d0;
import p0.e0;
import p0.j;
import vz.b0;
import x2.d;
import x2.g;
import x2.q;
import y0.h0;
import y0.i1;
import y0.o1;

/* loaded from: classes6.dex */
public final class DropdownFieldUIKt {
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v30 */
    public static final void DropDown(DropdownFieldController controller, boolean z11, i iVar, int i11) {
        ?? r62;
        i iVar2;
        Integer num;
        int i12;
        o0 o0Var;
        Object obj;
        long j11;
        f.a aVar;
        i iVar3;
        o0 o0Var2;
        int i13;
        int i14;
        int i15;
        f.a aVar2;
        i iVar4;
        int m437DropDown$lambda1;
        s.g(controller, "controller");
        i h11 = iVar.h(-85734275);
        v1 a11 = n1.a(controller.getLabel(), null, null, h11, 56, 2);
        v1 a12 = n1.a(controller.getSelectedIndex(), 0, null, h11, 56, 2);
        List<String> displayItems = controller.getDisplayItems();
        h11.x(-3687241);
        Object y11 = h11.y();
        i.a aVar3 = i.f8486a;
        if (y11 == aVar3.a()) {
            y11 = s1.d(Boolean.FALSE, null, 2, null);
            h11.p(y11);
        }
        h11.N();
        o0 o0Var3 = (o0) y11;
        String selectedItemLabel = controller.getSelectedItemLabel(m437DropDown$lambda1(a12));
        h11.x(-3687241);
        Object y12 = h11.y();
        if (y12 == aVar3.a()) {
            y12 = l.a();
            h11.p(y12);
        }
        h11.N();
        m mVar = (m) y12;
        if (z11) {
            h11.x(-85733793);
            long m384getOnComponent0d7_KjU = PaymentsThemeKt.getPaymentsColors(h0.f58131a, h11, 8).m384getOnComponent0d7_KjU();
            h11.N();
            i12 = 8;
            j11 = m384getOnComponent0d7_KjU;
            num = 0;
            r62 = 0;
            iVar2 = h11;
            o0Var = o0Var3;
            obj = null;
        } else {
            h11.x(-85733731);
            r62 = 0;
            iVar2 = h11;
            num = 0;
            i12 = 8;
            o0Var = o0Var3;
            obj = null;
            long v11 = i1.f58144a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, h11, 0, 0, 64, 2097151).c(z11, false, mVar, iVar2, ((i11 >> 3) & 14) | 432).getValue().v();
            iVar2.N();
            j11 = v11;
        }
        b bVar = (b) iVar2.A(l0.h());
        f.a aVar4 = f.f42062f1;
        a.C0826a c0826a = a.f42039a;
        f B = e0.B(aVar4, c0826a.k(), r62, 2, obj);
        h0 h0Var = h0.f58131a;
        f b11 = m0.b.b(B, PaymentsThemeKt.getPaymentsColors(h0Var, iVar2, i12).m381getComponent0d7_KjU(), null, 2, null);
        iVar2.x(-1990474327);
        z i16 = c.i(c0826a.k(), r62, iVar2, r62);
        iVar2.x(1376089394);
        d dVar = (d) iVar2.A(l0.d());
        q qVar = (q) iVar2.A(l0.i());
        y1 y1Var = (y1) iVar2.A(l0.m());
        a.C0551a c0551a = h2.a.Y0;
        h00.a<h2.a> a13 = c0551a.a();
        h00.q<g1<h2.a>, i, Integer, b0> b12 = u.b(b11);
        if (!(iVar2.k() instanceof e)) {
            h.c();
        }
        iVar2.D();
        if (iVar2.f()) {
            iVar2.s(a13);
        } else {
            iVar2.o();
        }
        iVar2.E();
        i a14 = a2.a(iVar2);
        a2.c(a14, i16, c0551a.d());
        a2.c(a14, dVar, c0551a.b());
        a2.c(a14, qVar, c0551a.c());
        a2.c(a14, y1Var, c0551a.f());
        iVar2.c();
        b12.invoke(g1.a(g1.b(iVar2)), iVar2, num);
        iVar2.x(2058660585);
        iVar2.x(-1253629305);
        p0.d dVar2 = p0.d.f45270a;
        f a15 = r1.q.a(aVar4, new DropdownFieldUIKt$DropDown$1$1(bVar));
        String b13 = k2.e.b(R.string.change, iVar2, 0);
        iVar2.x(-3686930);
        boolean O = iVar2.O(o0Var);
        Object y13 = iVar2.y();
        if (O || y13 == aVar3.a()) {
            y13 = new DropdownFieldUIKt$DropDown$1$2$1(o0Var);
            iVar2.p(y13);
        }
        iVar2.N();
        o0 o0Var4 = o0Var;
        f e11 = m0.h.e(a15, z11, b13, null, (h00.a) y13, 4, null);
        iVar2.x(-1990474327);
        z i17 = c.i(c0826a.k(), false, iVar2, 0);
        iVar2.x(1376089394);
        d dVar3 = (d) iVar2.A(l0.d());
        q qVar2 = (q) iVar2.A(l0.i());
        y1 y1Var2 = (y1) iVar2.A(l0.m());
        h00.a<h2.a> a16 = c0551a.a();
        h00.q<g1<h2.a>, i, Integer, b0> b14 = u.b(e11);
        if (!(iVar2.k() instanceof e)) {
            h.c();
        }
        iVar2.D();
        if (iVar2.f()) {
            iVar2.s(a16);
        } else {
            iVar2.o();
        }
        iVar2.E();
        i a17 = a2.a(iVar2);
        a2.c(a17, i17, c0551a.d());
        a2.c(a17, dVar3, c0551a.b());
        a2.c(a17, qVar2, c0551a.c());
        a2.c(a17, y1Var2, c0551a.f());
        iVar2.c();
        b14.invoke(g1.a(g1.b(iVar2)), iVar2, num);
        iVar2.x(2058660585);
        iVar2.x(-1253629305);
        if (controller.getTinyMode()) {
            iVar2.x(48237776);
            a.c g11 = c0826a.g();
            iVar2.x(-1989997165);
            z b15 = p0.b0.b(p0.a.f45228a.g(), g11, iVar2, 48);
            iVar2.x(1376089394);
            d dVar4 = (d) iVar2.A(l0.d());
            q qVar3 = (q) iVar2.A(l0.i());
            y1 y1Var3 = (y1) iVar2.A(l0.m());
            h00.a<h2.a> a18 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, b0> b16 = u.b(aVar4);
            if (!(iVar2.k() instanceof e)) {
                h.c();
            }
            iVar2.D();
            if (iVar2.f()) {
                iVar2.s(a18);
            } else {
                iVar2.o();
            }
            iVar2.E();
            i a19 = a2.a(iVar2);
            a2.c(a19, b15, c0551a.d());
            a2.c(a19, dVar4, c0551a.b());
            a2.c(a19, qVar3, c0551a.c());
            a2.c(a19, y1Var3, c0551a.f());
            iVar2.c();
            b16.invoke(g1.a(g1.b(iVar2)), iVar2, num);
            iVar2.x(2058660585);
            iVar2.x(-326682362);
            d0 d0Var = d0.f45271a;
            aVar2 = aVar4;
            i iVar5 = iVar2;
            o1.b(selectedItemLabel, null, j11, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar5, 0, 0, 65530);
            y0.d0.b(a1.a.a(z0.a.f60037a), null, null, j11, iVar5, 48, 4);
            iVar5.N();
            iVar5.N();
            iVar5.q();
            iVar5.N();
            iVar5.N();
            iVar5.N();
            iVar4 = iVar5;
            o0Var2 = o0Var4;
            i15 = 1;
        } else {
            i iVar6 = iVar2;
            iVar6.x(48238224);
            f l11 = p0.u.l(aVar4, g.f(16), g.f(4), BitmapDescriptorFactory.HUE_RED, g.f(8), 4, null);
            iVar6.x(-1113030915);
            p0.a aVar5 = p0.a.f45228a;
            z a21 = p0.h.a(aVar5.h(), c0826a.h(), iVar6, 0);
            iVar6.x(1376089394);
            d dVar5 = (d) iVar6.A(l0.d());
            q qVar4 = (q) iVar6.A(l0.i());
            y1 y1Var4 = (y1) iVar6.A(l0.m());
            h00.a<h2.a> a22 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, b0> b17 = u.b(l11);
            if (!(iVar6.k() instanceof e)) {
                h.c();
            }
            iVar6.D();
            if (iVar6.f()) {
                iVar6.s(a22);
            } else {
                iVar6.o();
            }
            iVar6.E();
            i a23 = a2.a(iVar6);
            a2.c(a23, a21, c0551a.d());
            a2.c(a23, dVar5, c0551a.b());
            a2.c(a23, qVar4, c0551a.c());
            a2.c(a23, y1Var4, c0551a.f());
            iVar6.c();
            b17.invoke(g1.a(g1.b(iVar6)), iVar6, num);
            iVar6.x(2058660585);
            iVar6.x(276693625);
            j jVar = j.f45341a;
            Integer m436DropDown$lambda0 = m436DropDown$lambda0(a11);
            iVar6.x(-777146702);
            if (m436DropDown$lambda0 == null) {
                aVar = aVar4;
                iVar3 = iVar6;
                o0Var2 = o0Var4;
                i14 = -1989997165;
                i13 = 1;
            } else {
                aVar = aVar4;
                iVar3 = iVar6;
                o0Var2 = o0Var4;
                i13 = 1;
                i14 = -1989997165;
                FormLabelKt.FormLabel(k2.e.b(m436DropDown$lambda0.intValue(), iVar6, 0), null, z11, iVar3, (i11 << 3) & 896, 2);
                b0 b0Var = b0.f54756a;
            }
            iVar3.N();
            f n11 = e0.n(aVar, BitmapDescriptorFactory.HUE_RED, i13, null);
            a.c a24 = c0826a.a();
            iVar3.x(i14);
            z b18 = p0.b0.b(aVar5.g(), a24, iVar3, 48);
            iVar3.x(1376089394);
            d dVar6 = (d) iVar3.A(l0.d());
            q qVar5 = (q) iVar3.A(l0.i());
            y1 y1Var5 = (y1) iVar3.A(l0.m());
            h00.a<h2.a> a25 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, b0> b19 = u.b(n11);
            if (!(iVar3.k() instanceof e)) {
                h.c();
            }
            iVar3.D();
            if (iVar3.f()) {
                iVar3.s(a25);
            } else {
                iVar3.o();
            }
            iVar3.E();
            i a26 = a2.a(iVar3);
            a2.c(a26, b18, c0551a.d());
            a2.c(a26, dVar6, c0551a.b());
            a2.c(a26, qVar5, c0551a.c());
            a2.c(a26, y1Var5, c0551a.f());
            iVar3.c();
            b19.invoke(g1.a(g1.b(iVar3)), iVar3, num);
            iVar3.x(2058660585);
            iVar3.x(-326682362);
            d0 d0Var2 = d0.f45271a;
            i15 = i13;
            aVar2 = aVar;
            iVar4 = iVar3;
            o1.b(selectedItemLabel, e0.m(aVar, 0.9f), j11, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar4, 48, 0, 65528);
            y0.d0.b(a1.a.a(z0.a.f60037a), null, e0.o(aVar2, g.f(24)), j11, iVar4, 432, 0);
            iVar4.N();
            iVar4.N();
            iVar4.q();
            iVar4.N();
            iVar4.N();
            iVar4.N();
            iVar4.N();
            iVar4.q();
            iVar4.N();
            iVar4.N();
            iVar4.N();
        }
        iVar4.N();
        iVar4.N();
        iVar4.q();
        iVar4.N();
        iVar4.N();
        boolean m438DropDown$lambda3 = m438DropDown$lambda3(o0Var2);
        if (m437DropDown$lambda1(a12) >= i15) {
            m437DropDown$lambda1 = Math.min(Math.max(m437DropDown$lambda1(a12) - 2, 0), Math.max(m437DropDown$lambda1(a12) - i15, 0));
        } else {
            m437DropDown$lambda1 = m437DropDown$lambda1(a12);
        }
        int i18 = m437DropDown$lambda1;
        iVar4.x(-3686930);
        o0 o0Var5 = o0Var2;
        boolean O2 = iVar4.O(o0Var5);
        Object y14 = iVar4.y();
        if (O2 || y14 == aVar3.a()) {
            y14 = new DropdownFieldUIKt$DropDown$1$4$1(o0Var5);
            iVar4.p(y14);
        }
        iVar4.N();
        i iVar7 = iVar4;
        a.a(m438DropDown$lambda3, i18, (h00.a) y14, e0.u(e0.z(m0.b.b(aVar2, PaymentsThemeKt.getPaymentsColors(h0Var, iVar4, 8).m381getComponent0d7_KjU(), null, 2, null), MenuKt.getDropdownMenuItemDefaultMaxWidth()), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, g.f(MenuKt.getDropdownMenuItemDefaultMinHeight() * 8.9f), 7, null), 0L, null, new DropdownFieldUIKt$DropDown$1$5(displayItems, j11, a12, controller, o0Var5), iVar7, 0, 48);
        iVar7.N();
        iVar7.N();
        iVar7.q();
        iVar7.N();
        iVar7.N();
        e1 l12 = iVar7.l();
        if (l12 == null) {
            return;
        }
        l12.a(new DropdownFieldUIKt$DropDown$2(controller, z11, i11));
    }

    /* renamed from: DropDown$lambda-0  reason: not valid java name */
    private static final Integer m436DropDown$lambda0(v1<Integer> v1Var) {
        return v1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DropDown$lambda-1  reason: not valid java name */
    public static final int m437DropDown$lambda1(v1<Integer> v1Var) {
        return v1Var.getValue().intValue();
    }

    /* renamed from: DropDown$lambda-3  reason: not valid java name */
    private static final boolean m438DropDown$lambda3(o0<Boolean> o0Var) {
        return o0Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DropDown$lambda-4  reason: not valid java name */
    public static final void m439DropDown$lambda4(o0<Boolean> o0Var, boolean z11) {
        o0Var.setValue(Boolean.valueOf(z11));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* renamed from: DropdownMenuItem-cf5BqRc  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m440DropdownMenuItemcf5BqRc(java.lang.String r32, boolean r33, long r34, h00.a<vz.b0> r36, c1.i r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.DropdownFieldUIKt.m440DropdownMenuItemcf5BqRc(java.lang.String, boolean, long, h00.a, c1.i, int, int):void");
    }
}