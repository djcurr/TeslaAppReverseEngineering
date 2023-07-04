package com.stripe.android.ui.core.elements;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e;
import c1.e1;
import c1.g1;
import c1.i;
import c1.n1;
import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.ui.core.PaymentsThemeKt;
import f2.u;
import f2.z;
import h2.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;
import o1.f;
import p0.a;
import p0.h;
import p0.j;
import vz.b0;
import wz.w;
import x2.d;
import x2.g;
import x2.q;
import y0.h0;

/* loaded from: classes6.dex */
public final class AddressElementUIKt {
    public static final void AddressElementUI(boolean z11, AddressController controller, List<IdentifierSpec> list, IdentifierSpec identifierSpec, i iVar, int i11) {
        ArrayList arrayList;
        i iVar2;
        int k11;
        Object obj;
        i iVar3;
        s.g(controller, "controller");
        i h11 = iVar.h(-890764129);
        List<SectionFieldElement> m424AddressElementUI$lambda0 = m424AddressElementUI$lambda0(n1.a(controller.getFieldsFlowable(), null, null, h11, 56, 2));
        Object obj2 = null;
        if (m424AddressElementUI$lambda0 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : m424AddressElementUI$lambda0) {
                if ((list == null || list.contains(((SectionFieldElement) obj3).getIdentifier())) ? false : true) {
                    arrayList2.add(obj3);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            iVar2 = h11;
        } else {
            h11.x(-1113030915);
            f.a aVar = f.f42062f1;
            z a11 = h.a(a.f45228a.h(), o1.a.f42039a.h(), h11, 0);
            h11.x(1376089394);
            d dVar = (d) h11.A(l0.d());
            q qVar = (q) h11.A(l0.i());
            y1 y1Var = (y1) h11.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a12 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, b0> b11 = u.b(aVar);
            if (!(h11.k() instanceof e)) {
                c1.h.c();
            }
            h11.D();
            if (h11.f()) {
                h11.s(a12);
            } else {
                h11.o();
            }
            h11.E();
            i a13 = a2.a(h11);
            a2.c(a13, a11, c0551a.d());
            a2.c(a13, dVar, c0551a.b());
            a2.c(a13, qVar, c0551a.c());
            a2.c(a13, y1Var, c0551a.f());
            h11.c();
            b11.invoke(g1.a(g1.b(h11)), h11, 0);
            h11.x(2058660585);
            h11.x(276693625);
            j jVar = j.f45341a;
            int i12 = 0;
            for (Object obj4 : arrayList) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    w.s();
                }
                SectionFieldElementUIKt.SectionFieldElementUI(z11, (SectionFieldElement) obj4, null, list, identifierSpec, h11, (i11 & 14) | 4096 | (57344 & (i11 << 3)), 4);
                k11 = w.k(arrayList);
                if (i12 != k11) {
                    h0 h0Var = h0.f58131a;
                    long m383getComponentDivider0d7_KjU = PaymentsThemeKt.getPaymentsColors(h0Var, h11, 8).m383getComponentDivider0d7_KjU();
                    float f11 = g.f(PaymentsThemeKt.getPaymentsShapes(h0Var, h11, 8).getBorderStrokeWidth());
                    f j11 = p0.u.j(f.f42062f1, g.f(PaymentsThemeKt.getPaymentsShapes(h0Var, h11, 8).getBorderStrokeWidth()), BitmapDescriptorFactory.HUE_RED, 2, obj2);
                    obj = obj2;
                    iVar3 = h11;
                    y0.w.a(j11, m383getComponentDivider0d7_KjU, f11, BitmapDescriptorFactory.HUE_RED, h11, 0, 8);
                } else {
                    obj = obj2;
                    iVar3 = h11;
                }
                h11 = iVar3;
                obj2 = obj;
                i12 = i13;
            }
            iVar2 = h11;
            iVar2.N();
            iVar2.N();
            iVar2.q();
            iVar2.N();
            iVar2.N();
        }
        e1 l11 = iVar2.l();
        if (l11 == null) {
            return;
        }
        l11.a(new AddressElementUIKt$AddressElementUI$3(z11, controller, list, identifierSpec, i11));
    }

    /* renamed from: AddressElementUI$lambda-0  reason: not valid java name */
    private static final List<SectionFieldElement> m424AddressElementUI$lambda0(v1<? extends List<? extends SectionFieldElement>> v1Var) {
        return (List) v1Var.getValue();
    }
}