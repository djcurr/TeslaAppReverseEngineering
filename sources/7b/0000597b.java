package com.stripe.android.ui.core;

import h00.a;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class PaymentsThemeKt$LocalColors$1 extends u implements a<PaymentsColors> {
    public static final PaymentsThemeKt$LocalColors$1 INSTANCE = new PaymentsThemeKt$LocalColors$1();

    PaymentsThemeKt$LocalColors$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PaymentsColors invoke() {
        return PaymentsTheme.INSTANCE.getColors(false);
    }
}