package com.stripe.android.paymentsheet;

import android.app.Application;

/* loaded from: classes6.dex */
final class PaymentOptionsAddPaymentMethodFragment$viewModelFactory$1 extends kotlin.jvm.internal.u implements h00.a<Application> {
    final /* synthetic */ PaymentOptionsAddPaymentMethodFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsAddPaymentMethodFragment$viewModelFactory$1(PaymentOptionsAddPaymentMethodFragment paymentOptionsAddPaymentMethodFragment) {
        super(0);
        this.this$0 = paymentOptionsAddPaymentMethodFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final Application invoke() {
        Application application = this.this$0.requireActivity().getApplication();
        kotlin.jvm.internal.s.f(application, "requireActivity().application");
        return application;
    }
}