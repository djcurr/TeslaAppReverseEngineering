package com.stripe.android.ui.core.elements;

import c1.e1;
import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.ui.core.PaymentsThemeKt;
import com.stripe.android.ui.core.R;
import java.util.Map;
import k2.e;
import kotlin.jvm.internal.s;
import o1.f;
import p0.u;
import wz.s0;
import x2.g;
import y0.h0;

/* loaded from: classes6.dex */
public final class AuBecsDebitMandateElementUIKt {
    public static final void AuBecsDebitMandateElementUI(AuBecsDebitMandateTextElement element, i iVar, int i11) {
        int i12;
        Map i13;
        s.g(element, "element");
        i h11 = iVar.h(1412712068);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(element) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (((i12 & 11) ^ 2) == 0 && h11.i()) {
            h11.G();
        } else {
            int i14 = R.string.au_becs_mandate;
            Object[] objArr = new Object[1];
            String merchantName = element.getMerchantName();
            if (merchantName == null) {
                merchantName = "";
            }
            objArr[0] = merchantName;
            String c11 = e.c(i14, objArr, h11, 64);
            i13 = s0.i();
            h0 h0Var = h0.f58131a;
            HtmlKt.m444HtmlFU0evQE(c11, i13, PaymentsThemeKt.getPaymentsColors(h0Var, h11, 8).m386getSubtitle0d7_KjU(), h0Var.c(h11, 8).d(), u.j(f.f42062f1, BitmapDescriptorFactory.HUE_RED, g.f(8), 1, null), null, h11, 24640, 32);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new AuBecsDebitMandateElementUIKt$AuBecsDebitMandateElementUI$1(element, i11));
    }
}