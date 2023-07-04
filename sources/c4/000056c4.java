package com.stripe.android.paymentsheet.model;

import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ConfirmSetupIntentParamsFactory extends ConfirmStripeIntentParamsFactory<ConfirmSetupIntentParams> {
    private final ClientSecret clientSecret;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmSetupIntentParamsFactory(ClientSecret clientSecret) {
        super(null);
        s.g(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.paymentsheet.model.ConfirmStripeIntentParamsFactory
    public ConfirmSetupIntentParams create(PaymentSelection.Saved paymentSelection) {
        s.g(paymentSelection, "paymentSelection");
        ConfirmSetupIntentParams.Companion companion = ConfirmSetupIntentParams.Companion;
        String str = paymentSelection.getPaymentMethod().f20932id;
        if (str == null) {
            str = "";
        }
        return ConfirmSetupIntentParams.Companion.create$default(companion, str, this.clientSecret.getValue(), paymentSelection.getPaymentMethod().type == null ? null : new MandateDataParams(MandateDataParams.Type.Online.Companion.getDEFAULT()), (String) null, 8, (Object) null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.paymentsheet.model.ConfirmStripeIntentParamsFactory
    public ConfirmSetupIntentParams create(PaymentSelection.New paymentSelection) {
        s.g(paymentSelection, "paymentSelection");
        return ConfirmSetupIntentParams.Companion.create$default(ConfirmSetupIntentParams.Companion, paymentSelection.getPaymentMethodCreateParams(), this.clientSecret.getValue(), (MandateDataParams) null, (String) null, 12, (Object) null);
    }
}