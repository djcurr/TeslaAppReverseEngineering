package com.stripe.android.paymentsheet.model;

import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ConfirmPaymentIntentParamsFactory extends ConfirmStripeIntentParamsFactory<ConfirmPaymentIntentParams> {
    private final ClientSecret clientSecret;

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PaymentMethod.Type.values().length];
            iArr[PaymentMethod.Type.Card.ordinal()] = 1;
            iArr[PaymentMethod.Type.USBankAccount.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PaymentSelection.CustomerRequestedSave.values().length];
            iArr2[PaymentSelection.CustomerRequestedSave.RequestReuse.ordinal()] = 1;
            iArr2[PaymentSelection.CustomerRequestedSave.RequestNoReuse.ordinal()] = 2;
            iArr2[PaymentSelection.CustomerRequestedSave.NoRequest.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmPaymentIntentParamsFactory(ClientSecret clientSecret) {
        super(null);
        s.g(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.paymentsheet.model.ConfirmStripeIntentParamsFactory
    public ConfirmPaymentIntentParams create(PaymentSelection.Saved paymentSelection) {
        PaymentMethodOptionsParams card;
        s.g(paymentSelection, "paymentSelection");
        ConfirmPaymentIntentParams.Companion companion = ConfirmPaymentIntentParams.Companion;
        String str = paymentSelection.getPaymentMethod().f20932id;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String value = this.clientSecret.getValue();
        PaymentMethod.Type type = paymentSelection.getPaymentMethod().type;
        int i11 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 != 1) {
            card = i11 != 2 ? null : new PaymentMethodOptionsParams.USBankAccount(ConfirmPaymentIntentParams.SetupFutureUsage.OffSession);
        } else {
            card = new PaymentMethodOptionsParams.Card(null, null, ConfirmPaymentIntentParams.SetupFutureUsage.Blank, 3, null);
        }
        MandateDataParams mandateDataParams = new MandateDataParams(MandateDataParams.Type.Online.Companion.getDEFAULT());
        PaymentMethod.Type type2 = paymentSelection.getPaymentMethod().type;
        if (!(type2 != null && type2.requiresMandate)) {
            mandateDataParams = null;
        }
        return ConfirmPaymentIntentParams.Companion.createWithPaymentMethodId$default(companion, str2, value, null, card, null, mandateDataParams, null, null, 212, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.paymentsheet.model.ConfirmStripeIntentParamsFactory
    public ConfirmPaymentIntentParams create(PaymentSelection.New paymentSelection) {
        PaymentMethodOptionsParams card;
        PaymentMethodOptionsParams uSBankAccount;
        s.g(paymentSelection, "paymentSelection");
        ConfirmPaymentIntentParams.Companion companion = ConfirmPaymentIntentParams.Companion;
        PaymentMethodCreateParams paymentMethodCreateParams = paymentSelection.getPaymentMethodCreateParams();
        String value = this.clientSecret.getValue();
        String typeCode = paymentSelection.getPaymentMethodCreateParams().getTypeCode();
        ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage = null;
        if (s.c(typeCode, PaymentMethod.Type.Card.code)) {
            int i11 = WhenMappings.$EnumSwitchMapping$1[paymentSelection.getCustomerRequestedSave().ordinal()];
            if (i11 == 1) {
                setupFutureUsage = ConfirmPaymentIntentParams.SetupFutureUsage.OffSession;
            } else if (i11 == 2) {
                setupFutureUsage = ConfirmPaymentIntentParams.SetupFutureUsage.Blank;
            } else if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            uSBankAccount = new PaymentMethodOptionsParams.Card(null, null, setupFutureUsage, 3, null);
        } else if (s.c(typeCode, PaymentMethod.Type.USBankAccount.code)) {
            int i12 = WhenMappings.$EnumSwitchMapping$1[paymentSelection.getCustomerRequestedSave().ordinal()];
            if (i12 == 1) {
                setupFutureUsage = ConfirmPaymentIntentParams.SetupFutureUsage.OffSession;
            } else if (i12 == 2) {
                setupFutureUsage = ConfirmPaymentIntentParams.SetupFutureUsage.Blank;
            } else if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            uSBankAccount = new PaymentMethodOptionsParams.USBankAccount(setupFutureUsage);
        } else {
            card = new PaymentMethodOptionsParams.Card(null, null, null, 3, null);
            return ConfirmPaymentIntentParams.Companion.createWithPaymentMethodCreateParams$default(companion, paymentMethodCreateParams, value, null, null, null, null, null, card, 124, null);
        }
        card = uSBankAccount;
        return ConfirmPaymentIntentParams.Companion.createWithPaymentMethodCreateParams$default(companion, paymentMethodCreateParams, value, null, null, null, null, null, card, 124, null);
    }
}