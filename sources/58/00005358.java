package com.stripe.android.networking;

import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class StripeApiRepository$retrieveStripeIntentWithOrderedPaymentMethods$2 extends u implements h00.a<b0> {
    final /* synthetic */ PaymentAnalyticsEvent $analyticsEvent;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$retrieveStripeIntentWithOrderedPaymentMethods$2(StripeApiRepository stripeApiRepository, PaymentAnalyticsEvent paymentAnalyticsEvent) {
        super(0);
        this.this$0 = stripeApiRepository;
        this.$analyticsEvent = paymentAnalyticsEvent;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
        StripeApiRepository stripeApiRepository = this.this$0;
        paymentAnalyticsRequestFactory = stripeApiRepository.paymentAnalyticsRequestFactory;
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(paymentAnalyticsRequestFactory, this.$analyticsEvent, null, null, null, null, 30, null));
    }
}