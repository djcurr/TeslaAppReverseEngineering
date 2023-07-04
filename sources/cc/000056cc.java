package com.stripe.android.paymentsheet.model;

import android.content.res.Resources;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.ui.PaymentMethodsUiExtensionKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class PaymentOptionFactory {
    private final Resources resources;

    public PaymentOptionFactory(Resources resources) {
        s.g(resources, "resources");
        this.resources = resources;
    }

    public final PaymentOption create(PaymentSelection selection) {
        PaymentOption paymentOption;
        s.g(selection, "selection");
        if (s.c(selection, PaymentSelection.GooglePay.INSTANCE)) {
            int i11 = R.drawable.stripe_google_pay_mark;
            String string = this.resources.getString(R.string.google_pay);
            s.f(string, "resources.getString(R.string.google_pay)");
            return new PaymentOption(i11, string);
        }
        if (selection instanceof PaymentSelection.Saved) {
            PaymentSelection.Saved saved = (PaymentSelection.Saved) selection;
            Integer savedPaymentMethodIcon = PaymentMethodsUiExtensionKt.getSavedPaymentMethodIcon(saved.getPaymentMethod());
            int intValue = savedPaymentMethodIcon == null ? 0 : savedPaymentMethodIcon.intValue();
            String label = PaymentMethodsUiExtensionKt.getLabel(saved.getPaymentMethod(), this.resources);
            if (label == null) {
                label = "";
            }
            paymentOption = new PaymentOption(intValue, label);
        } else if (selection instanceof PaymentSelection.New.Card) {
            PaymentSelection.New.Card card = (PaymentSelection.New.Card) selection;
            paymentOption = new PaymentOption(PaymentMethodsUiExtensionKt.getCardBrandIcon(card.getBrand()), PaymentMethodsUiExtensionKt.createCardLabel(this.resources, card.getLast4()));
        } else if (selection instanceof PaymentSelection.New.Link) {
            PaymentSelection.New.Link link = (PaymentSelection.New.Link) selection;
            paymentOption = new PaymentOption(link.getIconResource(), PaymentMethodsUiExtensionKt.createCardLabel(this.resources, link.getLabel()));
        } else if (selection instanceof PaymentSelection.New.GenericPaymentMethod) {
            PaymentSelection.New.GenericPaymentMethod genericPaymentMethod = (PaymentSelection.New.GenericPaymentMethod) selection;
            paymentOption = new PaymentOption(genericPaymentMethod.getIconResource(), genericPaymentMethod.getLabelResource());
        } else if (!(selection instanceof PaymentSelection.New.USBankAccount)) {
            throw new NoWhenBranchMatchedException();
        } else {
            PaymentSelection.New.USBankAccount uSBankAccount = (PaymentSelection.New.USBankAccount) selection;
            paymentOption = new PaymentOption(uSBankAccount.getIconResource(), uSBankAccount.getLabelResource());
        }
        return paymentOption;
    }
}