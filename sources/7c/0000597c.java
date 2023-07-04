package com.stripe.android.ui.core;

import h00.a;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class PaymentsThemeKt$LocalShapes$1 extends u implements a<PaymentsShapes> {
    public static final PaymentsThemeKt$LocalShapes$1 INSTANCE = new PaymentsThemeKt$LocalShapes$1();

    PaymentsThemeKt$LocalShapes$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PaymentsShapes invoke() {
        return PaymentsTheme.INSTANCE.getShapesMutable();
    }
}