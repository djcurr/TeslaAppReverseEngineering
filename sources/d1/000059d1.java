package com.stripe.android.ui.core.elements;

import c1.e1;
import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.ui.core.PaymentsThemeKt;
import com.stripe.android.ui.core.R;
import java.util.Map;
import k2.e;
import o1.f;
import p0.u;
import vz.v;
import wz.r0;
import x2.g;
import y0.h0;

/* loaded from: classes6.dex */
public final class AffirmElementUIKt {
    public static final void AffirmElementUI(i iVar, int i11) {
        Map f11;
        i h11 = iVar.h(1428309892);
        if (i11 == 0 && h11.i()) {
            h11.G();
        } else {
            String b11 = e.b(R.string.affirm_buy_now_pay_later, h11, 0);
            f11 = r0.f(v.a("affirm", new EmbeddableImage(R.drawable.stripe_ic_affirm_logo, R.string.stripe_paymentsheet_payment_method_affirm)));
            h0 h0Var = h0.f58131a;
            HtmlKt.m444HtmlFU0evQE(b11, f11, PaymentsThemeKt.getPaymentsColors(h0Var, h11, 8).m386getSubtitle0d7_KjU(), h0Var.c(h11, 8).j(), u.j(f.f42062f1, BitmapDescriptorFactory.HUE_RED, g.f(8), 1, null), null, h11, 24640, 32);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new AffirmElementUIKt$AffirmElementUI$1(i11));
    }
}