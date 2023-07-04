package com.stripe.android.ui.core;

import c1.i;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentsThemeKt$PaymentsTheme$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ PaymentsColors $colors;
    final /* synthetic */ p<i, Integer, b0> $content;
    final /* synthetic */ PaymentsShapes $shapes;
    final /* synthetic */ PaymentsTypography $typography;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentsThemeKt$PaymentsTheme$2(PaymentsColors paymentsColors, PaymentsShapes paymentsShapes, PaymentsTypography paymentsTypography, p<? super i, ? super Integer, b0> pVar, int i11, int i12) {
        super(2);
        this.$colors = paymentsColors;
        this.$shapes = paymentsShapes;
        this.$typography = paymentsTypography;
        this.$content = pVar;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        PaymentsThemeKt.PaymentsTheme(this.$colors, this.$shapes, this.$typography, this.$content, iVar, this.$$changed | 1, this.$$default);
    }
}