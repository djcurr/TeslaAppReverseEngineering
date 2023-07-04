package com.stripe.android.ui.core.elements;

import c1.e1;
import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.ui.core.PaymentsThemeKt;
import k2.e;
import kotlin.jvm.internal.s;
import l2.o;
import o1.f;
import p0.u;
import x2.g;
import y0.h0;
import y0.o1;

/* loaded from: classes6.dex */
public final class MandateTextUIKt {
    public static final void MandateTextUI(MandateTextElement element, i iVar, int i11) {
        int i12;
        s.g(element, "element");
        i h11 = iVar.h(-1800603079);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(element) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (((i12 & 11) ^ 2) == 0 && h11.i()) {
            h11.G();
        } else {
            int stringResId = element.getStringResId();
            Object[] objArr = new Object[1];
            String merchantName = element.getMerchantName();
            if (merchantName == null) {
                merchantName = "";
            }
            objArr[0] = merchantName;
            String c11 = e.c(stringResId, objArr, h11, 64);
            h0 h0Var = h0.f58131a;
            o1.b(c11, o.a(u.j(f.f42062f1, BitmapDescriptorFactory.HUE_RED, g.f(8), 1, null), true, MandateTextUIKt$MandateTextUI$1.INSTANCE), PaymentsThemeKt.getPaymentsColors(h0Var, h11, 8).m386getSubtitle0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, h0Var.c(h11, 8).d(), h11, 0, 0, 32760);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new MandateTextUIKt$MandateTextUI$2(element, i11));
    }
}