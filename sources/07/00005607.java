package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.PaymentConfiguration;
import javax.inject.Provider;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class DefaultFlowController$1$onCreate$1 extends u implements h00.a<String> {
    final /* synthetic */ DefaultFlowController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlowController$1$onCreate$1(DefaultFlowController defaultFlowController) {
        super(0);
        this.this$0 = defaultFlowController;
    }

    @Override // h00.a
    public final String invoke() {
        Provider provider;
        provider = this.this$0.lazyPaymentConfiguration;
        return ((PaymentConfiguration) provider.get()).getPublishableKey();
    }
}