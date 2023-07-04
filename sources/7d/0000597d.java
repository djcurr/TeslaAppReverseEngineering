package com.stripe.android.ui.core;

import h00.a;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class PaymentsThemeKt$LocalTypography$1 extends u implements a<PaymentsTypography> {
    public static final PaymentsThemeKt$LocalTypography$1 INSTANCE = new PaymentsThemeKt$LocalTypography$1();

    PaymentsThemeKt$LocalTypography$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PaymentsTypography invoke() {
        return PaymentsTheme.INSTANCE.getTypographyMutable();
    }
}