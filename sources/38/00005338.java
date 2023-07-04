package com.stripe.android.networking;

import com.stripe.android.model.PaymentMethodCreateParams;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class StripeApiRepository$createPaymentMethod$2 extends u implements h00.a<b0> {
    final /* synthetic */ PaymentMethodCreateParams $paymentMethodCreateParams;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$createPaymentMethod$2(StripeApiRepository stripeApiRepository, PaymentMethodCreateParams paymentMethodCreateParams) {
        super(0);
        this.this$0 = stripeApiRepository;
        this.$paymentMethodCreateParams = paymentMethodCreateParams;
    }

    @Override // h00.a
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ b0 mo11invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
        StripeApiRepository stripeApiRepository = this.this$0;
        paymentAnalyticsRequestFactory = stripeApiRepository.paymentAnalyticsRequestFactory;
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(paymentAnalyticsRequestFactory.createPaymentMethodCreation$payments_core_release(this.$paymentMethodCreateParams.getType$payments_core_release(), this.$paymentMethodCreateParams.getAttribution$payments_core_release()));
    }
}