package com.stripe.android.paymentsheet.ui;

import c1.e1;
import com.stripe.android.ui.core.PaymentsThemeKt;

/* loaded from: classes6.dex */
public final class PrimaryButtonKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void LabelUI(String str, c1.i iVar, int i11) {
        int i12;
        c1.i h11 = iVar.h(304028574);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((2 ^ (i12 & 11)) == 0 && h11.i()) {
            h11.G();
        } else {
            PaymentsThemeKt.PaymentsTheme(null, null, null, j1.c.b(h11, -819888845, true, new PrimaryButtonKt$LabelUI$1(str, i12)), h11, 3072, 7);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new PrimaryButtonKt$LabelUI$2(str, i11));
    }

    public static final /* synthetic */ void access$LabelUI(String str, c1.i iVar, int i11) {
        LabelUI(str, iVar, i11);
    }
}