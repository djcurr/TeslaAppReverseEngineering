package com.stripe.android.paymentsheet.ui;

import c1.e1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.ui.core.PaymentsThemeKt;
import p0.e0;
import t1.a0;
import y0.h0;

/* loaded from: classes6.dex */
public final class GooglePayDividerKt {
    public static final void GooglePayDividerLine(c1.i iVar, int i11) {
        long l11;
        c1.i h11 = iVar.h(-1133040299);
        if (i11 == 0 && h11.i()) {
            h11.G();
        } else {
            h0 h0Var = h0.f58131a;
            if (PaymentsThemeKt.m396shouldUseDarkDynamicColor8_81llA(h0Var.a(h11, 8).n())) {
                l11 = a0.l(a0.f51365b.a(), 0.2f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            } else {
                l11 = a0.l(a0.f51365b.g(), 0.2f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            }
            p0.c.a(e0.n(e0.o(m0.b.b(o1.f.f42062f1, l11, null, 2, null), x2.g.f(PaymentsThemeKt.getPaymentsShapes(h0Var, h11, 8).getBorderStrokeWidth())), BitmapDescriptorFactory.HUE_RED, 1, null), h11, 0);
        }
        e1 l12 = h11.l();
        if (l12 == null) {
            return;
        }
        l12.a(new GooglePayDividerKt$GooglePayDividerLine$1(i11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        if ((r31 & 1) != 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void GooglePayDividerUi(java.lang.String r28, c1.i r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.ui.GooglePayDividerKt.GooglePayDividerUi(java.lang.String, c1.i, int, int):void");
    }
}