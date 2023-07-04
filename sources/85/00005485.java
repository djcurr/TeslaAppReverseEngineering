package com.stripe.android.payments.paymentlauncher;

import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class PaymentLauncherFactory$create$1 extends u implements h00.a<String> {
    final /* synthetic */ String $publishableKey;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentLauncherFactory$create$1(String str) {
        super(0);
        this.$publishableKey = str;
    }

    @Override // h00.a
    public final String invoke() {
        return this.$publishableKey;
    }
}