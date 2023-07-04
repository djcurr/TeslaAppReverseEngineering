package com.stripe.android.ui.core.elements;

import androidx.compose.ui.platform.l0;
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
import com.stripe.android.ui.core.PaymentsThemeKt;
import f2.j0;
import f2.u;
import f2.z;
import h00.l;
import h2.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;
import o1.f;
import p0.a;
import p0.b0;
import p0.c0;
import p0.d0;
import p0.e0;
import wz.w;
import wz.x;
import x2.d;
import x2.g;
import x2.q;
import y0.h0;

/* loaded from: classes6.dex */
public final class RowElementUIKt {
    public static final void RowElementUI(boolean z11, RowController controller, List<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, i iVar, int i11) {
        int t11;
        boolean z12;
        i iVar2;
        int k11;
        o0 o0Var;
        int i12;
        List<SectionSingleFieldElement> list;
        i iVar3;
        s.g(controller, "controller");
        s.g(hiddenIdentifiers, "hiddenIdentifiers");
        i h11 = iVar.h(540810301);
        List<SectionSingleFieldElement> fields = controller.getFields();
        ArrayList arrayList = new ArrayList();
        for (Object obj : fields) {
            if (true ^ hiddenIdentifiers.contains(((SectionSingleFieldElement) obj).getIdentifier())) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        h11.x(-3687241);
        Object y11 = h11.y();
        if (y11 == i.f8486a.a()) {
            y11 = s1.d(g.c(g.f(0)), null, 2, null);
            h11.p(y11);
        }
        h11.N();
        o0 o0Var2 = (o0) y11;
        t11 = x.t(fields, 10);
        ArrayList<IdentifierSpec> arrayList2 = new ArrayList(t11);
        for (SectionSingleFieldElement sectionSingleFieldElement : fields) {
            arrayList2.add(sectionSingleFieldElement.getIdentifier());
        }
        if (!arrayList2.isEmpty()) {
            for (IdentifierSpec identifierSpec2 : arrayList2) {
                if (!hiddenIdentifiers.contains(identifierSpec2)) {
                    z12 = true;
                    break;
                }
            }
        }
        z12 = false;
        if (z12) {
            f n11 = e0.n(f.f42062f1, BitmapDescriptorFactory.HUE_RED, 1, null);
            h11.x(-1989997165);
            z b11 = b0.b(a.f45228a.g(), o1.a.f42039a.i(), h11, 0);
            h11.x(1376089394);
            d dVar = (d) h11.A(l0.d());
            q qVar = (q) h11.A(l0.i());
            y1 y1Var = (y1) h11.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a11 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, vz.b0> b12 = u.b(n11);
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
            a2.c(a12, b11, c0551a.d());
            a2.c(a12, dVar, c0551a.b());
            a2.c(a12, qVar, c0551a.c());
            a2.c(a12, y1Var, c0551a.f());
            h11.c();
            b12.invoke(g1.a(g1.b(h11)), h11, 0);
            h11.x(2058660585);
            h11.x(-326682362);
            d0 d0Var = d0.f45271a;
            int i13 = 0;
            for (Object obj2 : fields) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    w.s();
                }
                SectionSingleFieldElement sectionSingleFieldElement2 = (SectionSingleFieldElement) obj2;
                f.a aVar = f.f42062f1;
                f a13 = c0.a.a(d0Var, aVar, 1.0f / size, false, 2, null);
                h11.x(-3686930);
                boolean O = h11.O(o0Var2);
                Object y12 = h11.y();
                if (O || y12 == i.f8486a.a()) {
                    y12 = new RowElementUIKt$RowElementUI$3$1$1$1(o0Var2);
                    h11.p(y12);
                }
                h11.N();
                SectionFieldElementUIKt.SectionFieldElementUI(z11, sectionSingleFieldElement2, j0.a(a13, (l) y12), hiddenIdentifiers, identifierSpec, h11, (i11 & 14) | 4096 | (57344 & (i11 << 3)), 0);
                k11 = w.k(fields);
                if (i13 != k11) {
                    f o11 = e0.o(aVar, ((g) o0Var2.getValue()).l());
                    h0 h0Var = h0.f58131a;
                    f z13 = e0.z(o11, g.f(PaymentsThemeKt.getPaymentsShapes(h0Var, h11, 8).getBorderStrokeWidth()));
                    long m383getComponentDivider0d7_KjU = PaymentsThemeKt.getPaymentsColors(h0Var, h11, 8).m383getComponentDivider0d7_KjU();
                    o0Var = o0Var2;
                    i12 = size;
                    list = fields;
                    iVar3 = h11;
                    y0.w.a(z13, m383getComponentDivider0d7_KjU, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, h11, 0, 12);
                } else {
                    o0Var = o0Var2;
                    i12 = size;
                    list = fields;
                    iVar3 = h11;
                }
                size = i12;
                fields = list;
                h11 = iVar3;
                o0Var2 = o0Var;
                i13 = i14;
            }
            iVar2 = h11;
            iVar2.N();
            iVar2.N();
            iVar2.q();
            iVar2.N();
            iVar2.N();
        } else {
            iVar2 = h11;
        }
        e1 l11 = iVar2.l();
        if (l11 == null) {
            return;
        }
        l11.a(new RowElementUIKt$RowElementUI$4(z11, controller, hiddenIdentifiers, identifierSpec, i11));
    }
}