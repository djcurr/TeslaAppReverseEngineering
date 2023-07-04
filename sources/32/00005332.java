package com.stripe.android.networking;

import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes6.dex */
final class StripeApiRepository$confirmSetupIntent$2 extends u implements h00.a<b0> {
    final /* synthetic */ ConfirmSetupIntentParams $confirmSetupIntentParams;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$confirmSetupIntent$2(StripeApiRepository stripeApiRepository, ConfirmSetupIntentParams confirmSetupIntentParams) {
        super(0);
        this.this$0 = stripeApiRepository;
        this.$confirmSetupIntentParams = confirmSetupIntentParams;
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
        PaymentMethodCreateParams paymentMethodCreateParams$payments_core_release = this.$confirmSetupIntentParams.getPaymentMethodCreateParams$payments_core_release();
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(paymentAnalyticsRequestFactory.createSetupIntentConfirmation$payments_core_release(paymentMethodCreateParams$payments_core_release == null ? null : paymentMethodCreateParams$payments_core_release.getTypeCode()));
    }
}