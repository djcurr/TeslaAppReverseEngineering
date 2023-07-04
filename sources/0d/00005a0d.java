package com.stripe.android.ui.core.elements;

import c1.e1;
import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.ui.core.PaymentsThemeKt;
import java.util.List;
import kotlin.jvm.internal.s;
import o1.f;
import p0.u;
import wz.w;
import x2.g;
import y0.h0;

/* loaded from: classes6.dex */
public final class CardDetailsElementUIKt {
    public static final void CardDetailsElementUI(boolean z11, CardDetailsController controller, List<IdentifierSpec> list, IdentifierSpec identifierSpec, i iVar, int i11) {
        int k11;
        s.g(controller, "controller");
        i h11 = iVar.h(-1194313932);
        int i12 = 0;
        for (Object obj : controller.getFields()) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                w.s();
            }
            SectionFieldElementUIKt.SectionFieldElementUI(z11, (SectionFieldElement) obj, null, list, identifierSpec, h11, (i11 & 14) | 4096 | (57344 & (i11 << 3)), 4);
            k11 = w.k(controller.getFields());
            if (i12 != k11) {
                h0 h0Var = h0.f58131a;
                y0.w.a(u.j(f.f42062f1, g.f(PaymentsThemeKt.getPaymentsShapes(h0Var, h11, 8).getBorderStrokeWidth()), BitmapDescriptorFactory.HUE_RED, 2, null), PaymentsThemeKt.getPaymentsColors(h0Var, h11, 8).m383getComponentDivider0d7_KjU(), g.f(PaymentsThemeKt.getPaymentsShapes(h0Var, h11, 8).getBorderStrokeWidth()), BitmapDescriptorFactory.HUE_RED, h11, 0, 8);
            }
            i12 = i13;
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new CardDetailsElementUIKt$CardDetailsElementUI$2(z11, controller, list, identifierSpec, i11));
    }
}