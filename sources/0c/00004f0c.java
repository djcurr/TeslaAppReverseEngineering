package com.stripe.android.link.confirmation;

import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethodCreateParams;
import java.util.Map;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ConfirmPaymentIntentParamsFactory extends ConfirmStripeIntentParamsFactory<ConfirmPaymentIntentParams> {
    private final PaymentIntent paymentIntent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmPaymentIntentParamsFactory(PaymentIntent paymentIntent) {
        super(null);
        s.g(paymentIntent, "paymentIntent");
        this.paymentIntent = paymentIntent;
    }

    @Override // com.stripe.android.link.confirmation.ConfirmStripeIntentParamsFactory
    public PaymentMethodCreateParams createPaymentMethodCreateParams(String consumerSessionClientSecret, ConsumerPaymentDetails.PaymentDetails selectedPaymentDetails, Map<String, ? extends Object> map) {
        s.g(consumerSessionClientSecret, "consumerSessionClientSecret");
        s.g(selectedPaymentDetails, "selectedPaymentDetails");
        return PaymentMethodCreateParams.Companion.createLink(selectedPaymentDetails.getId(), consumerSessionClientSecret, map);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.link.confirmation.ConfirmStripeIntentParamsFactory
    public ConfirmPaymentIntentParams createConfirmStripeIntentParams(PaymentMethodCreateParams paymentMethodCreateParams) {
        s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
        ConfirmPaymentIntentParams.Companion companion = ConfirmPaymentIntentParams.Companion;
        String clientSecret = this.paymentIntent.getClientSecret();
        s.e(clientSecret);
        return ConfirmPaymentIntentParams.Companion.createWithPaymentMethodCreateParams$default(companion, paymentMethodCreateParams, clientSecret, null, null, null, null, null, null, 252, null);
    }
}