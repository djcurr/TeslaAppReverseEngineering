package com.stripe.android.link.confirmation;

import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SetupIntent;
import java.util.Map;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ConfirmSetupIntentParamsFactory extends ConfirmStripeIntentParamsFactory<ConfirmSetupIntentParams> {
    private final SetupIntent setupIntent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmSetupIntentParamsFactory(SetupIntent setupIntent) {
        super(null);
        s.g(setupIntent, "setupIntent");
        this.setupIntent = setupIntent;
    }

    @Override // com.stripe.android.link.confirmation.ConfirmStripeIntentParamsFactory
    public PaymentMethodCreateParams createPaymentMethodCreateParams(String consumerSessionClientSecret, ConsumerPaymentDetails.PaymentDetails selectedPaymentDetails, Map<String, ? extends Object> map) {
        s.g(consumerSessionClientSecret, "consumerSessionClientSecret");
        s.g(selectedPaymentDetails, "selectedPaymentDetails");
        return PaymentMethodCreateParams.Companion.createLink(selectedPaymentDetails.getId(), consumerSessionClientSecret, map);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.link.confirmation.ConfirmStripeIntentParamsFactory
    public ConfirmSetupIntentParams createConfirmStripeIntentParams(PaymentMethodCreateParams paymentMethodCreateParams) {
        s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
        ConfirmSetupIntentParams.Companion companion = ConfirmSetupIntentParams.Companion;
        String clientSecret = this.setupIntent.getClientSecret();
        s.e(clientSecret);
        return ConfirmSetupIntentParams.Companion.create$default(companion, paymentMethodCreateParams, clientSecret, (MandateDataParams) null, (String) null, 12, (Object) null);
    }
}