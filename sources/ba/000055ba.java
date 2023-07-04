package com.stripe.android.paymentsheet;

import com.stripe.android.PaymentConfiguration;

/* loaded from: classes6.dex */
final class PaymentSheetViewModel$registerFromActivity$1 extends kotlin.jvm.internal.u implements h00.a<String> {
    final /* synthetic */ PaymentSheetViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetViewModel$registerFromActivity$1(PaymentSheetViewModel paymentSheetViewModel) {
        super(0);
        this.this$0 = paymentSheetViewModel;
    }

    @Override // h00.a
    public final String invoke() {
        sw.a aVar;
        aVar = this.this$0.lazyPaymentConfig;
        return ((PaymentConfiguration) aVar.get()).getPublishableKey();
    }
}