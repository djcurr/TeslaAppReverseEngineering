package com.stripe.android.paymentsheet.ui;

import com.stripe.android.ui.core.PaymentsTheme;
import com.stripe.android.ui.core.PaymentsThemeKt;
import com.stripe.android.ui.core.PrimaryButtonStyle;
import kotlin.jvm.internal.u;
import vz.b0;
import y0.o1;

/* loaded from: classes6.dex */
final class PrimaryButtonKt$LabelUI$1 extends u implements h00.p<c1.i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButtonKt$LabelUI$1(String str, int i11) {
        super(2);
        this.$label = str;
        this.$$dirty = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(c1.i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(c1.i iVar, int i11) {
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        int a11 = w2.d.f55400b.a();
        float f11 = 4;
        o1.b(this.$label, p0.u.k(o1.f.f42062f1, x2.g.f(f11), x2.g.f(f11), x2.g.f(f11), x2.g.f(5)), 0L, 0L, null, null, null, 0L, null, w2.d.g(a11), 0L, 0, false, 0, null, PaymentsThemeKt.getComposeTextStyle(PaymentsTheme.INSTANCE.getPrimaryButtonStyle(), iVar, PrimaryButtonStyle.$stable), iVar, this.$$dirty & 14, 0, 32252);
    }
}