package com.stripe.android.ui.core;

import c1.i;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;
import y0.i0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentsThemeKt$PaymentsTheme$1 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ PaymentsColors $colors;
    final /* synthetic */ p<i, Integer, b0> $content;
    final /* synthetic */ PaymentsShapes $shapes;
    final /* synthetic */ PaymentsTypography $typography;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentsThemeKt$PaymentsTheme$1(PaymentsColors paymentsColors, PaymentsTypography paymentsTypography, int i11, PaymentsShapes paymentsShapes, p<? super i, ? super Integer, b0> pVar) {
        super(2);
        this.$colors = paymentsColors;
        this.$typography = paymentsTypography;
        this.$$dirty = i11;
        this.$shapes = paymentsShapes;
        this.$content = pVar;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
        } else {
            i0.a(this.$colors.getMaterialColors(), PaymentsThemeKt.toComposeTypography(this.$typography, iVar, (this.$$dirty >> 6) & 14), PaymentsThemeKt.toComposeShapes(this.$shapes, iVar, (this.$$dirty >> 3) & 14).getMaterial(), this.$content, iVar, this.$$dirty & 7168, 0);
        }
    }
}