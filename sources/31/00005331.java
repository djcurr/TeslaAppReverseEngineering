package com.stripe.android.networking;

import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SourceParams;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class StripeApiRepository$confirmPaymentIntentInternal$2 extends u implements h00.a<b0> {
    final /* synthetic */ ConfirmPaymentIntentParams $confirmPaymentIntentParams;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$confirmPaymentIntentInternal$2(ConfirmPaymentIntentParams confirmPaymentIntentParams, StripeApiRepository stripeApiRepository) {
        super(0);
        this.$confirmPaymentIntentParams = confirmPaymentIntentParams;
        this.this$0 = stripeApiRepository;
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
        PaymentMethodCreateParams paymentMethodCreateParams = this.$confirmPaymentIntentParams.getPaymentMethodCreateParams();
        String str = null;
        String typeCode = paymentMethodCreateParams == null ? null : paymentMethodCreateParams.getTypeCode();
        if (typeCode == null) {
            SourceParams sourceParams = this.$confirmPaymentIntentParams.getSourceParams();
            if (sourceParams != null) {
                str = sourceParams.getType();
            }
        } else {
            str = typeCode;
        }
        StripeApiRepository stripeApiRepository = this.this$0;
        paymentAnalyticsRequestFactory = stripeApiRepository.paymentAnalyticsRequestFactory;
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(paymentAnalyticsRequestFactory.createPaymentIntentConfirmation$payments_core_release(str));
    }
}