package com.stripe.android.ui.core.elements;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e;
import c1.e1;
import c1.g1;
import c1.h;
import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import f2.u;
import f2.z;
import h2.a;
import java.util.List;
import kotlin.jvm.internal.s;
import l2.o;
import o1.a;
import o1.f;
import p0.a;
import p0.b0;
import p0.d0;
import p0.e0;
import wz.v;
import wz.w;
import x2.d;
import x2.q;

/* loaded from: classes6.dex */
public final class CardDetailsSectionElementUIKt {
    public static final void CardDetailsSectionElementUI(boolean z11, CardDetailsSectionController controller, List<IdentifierSpec> list, i iVar, int i11) {
        List d11;
        List d12;
        List<IdentifierSpec> list2;
        List<IdentifierSpec> i12;
        s.g(controller, "controller");
        i h11 = iVar.h(856612814);
        a.e e11 = a.f45228a.e();
        a.c g11 = o1.a.f42039a.g();
        f.a aVar = f.f42062f1;
        f n11 = e0.n(aVar, BitmapDescriptorFactory.HUE_RED, 1, null);
        h11.x(-1989997165);
        z b11 = b0.b(e11, g11, h11, 54);
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
        H6TextKt.H6Text(k2.e.b(R.string.stripe_paymentsheet_add_payment_method_card_information, h11, 0), o.a(aVar, true, CardDetailsSectionElementUIKt$CardDetailsSectionElementUI$1$1.INSTANCE), h11, 0, 0);
        h11.x(856613472);
        if (controller.isCardScanEnabled$payments_ui_core_release() && controller.isStripeCardScanAvailable$payments_ui_core_release().invoke()) {
            ScanCardButtonUIKt.ScanCardButtonUI(new CardDetailsSectionElementUIKt$CardDetailsSectionElementUI$1$2(controller), h11, 0);
        }
        h11.N();
        h11.N();
        h11.N();
        h11.q();
        h11.N();
        h11.N();
        IdentifierSpec.Companion companion = IdentifierSpec.Companion;
        IdentifierSpec Generic = companion.Generic("credit_details");
        d11 = v.d(controller.getCardDetailsElement$payments_ui_core_release());
        d12 = v.d(controller.getCardDetailsElement$payments_ui_core_release().sectionFieldErrorController());
        SectionElement sectionElement = new SectionElement(Generic, d11, new SectionController(null, d12));
        if (list == null) {
            i12 = w.i();
            list2 = i12;
        } else {
            list2 = list;
        }
        SectionElementUIKt.SectionElementUI(z11, sectionElement, list2, companion.Generic("card_details"), h11, (i11 & 14) | 576);
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new CardDetailsSectionElementUIKt$CardDetailsSectionElementUI$2(z11, controller, list, i11));
    }
}