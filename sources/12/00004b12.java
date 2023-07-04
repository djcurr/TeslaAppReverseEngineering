package com.stripe.android;

import kotlin.jvm.internal.u;

/* loaded from: classes2.dex */
final class CustomerSession$Companion$initCustomerSession$1 extends u implements h00.a<String> {
    final /* synthetic */ PaymentConfiguration $config;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerSession$Companion$initCustomerSession$1(PaymentConfiguration paymentConfiguration) {
        super(0);
        this.$config = paymentConfiguration;
    }

    @Override // h00.a
    public final String invoke() {
        return this.$config.getPublishableKey();
    }
}