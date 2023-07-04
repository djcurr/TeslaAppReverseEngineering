package com.stripe.android.paymentsheet.injection;

import com.stripe.android.PaymentConfiguration;
import h00.a;
import javax.inject.Provider;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class PaymentSheetCommonModule$Companion$provideStripeAccountId$1 extends u implements a<String> {
    final /* synthetic */ Provider<PaymentConfiguration> $paymentConfiguration;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetCommonModule$Companion$provideStripeAccountId$1(Provider<PaymentConfiguration> provider) {
        super(0);
        this.$paymentConfiguration = provider;
    }

    @Override // h00.a
    public final String invoke() {
        return this.$paymentConfiguration.get().getStripeAccountId();
    }
}