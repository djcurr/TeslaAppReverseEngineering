package com.stripe.android.link.injection;

import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.ui.cardedit.CardEditViewModel;
import com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel;
import com.stripe.android.link.ui.verification.VerificationViewModel;
import com.stripe.android.link.ui.wallet.WalletViewModel;

/* loaded from: classes6.dex */
public interface SignedInViewModelSubcomponent {

    /* loaded from: classes6.dex */
    public interface Builder {
        SignedInViewModelSubcomponent build();

        Builder linkAccount(LinkAccount linkAccount);
    }

    CardEditViewModel getCardEditViewModel();

    PaymentMethodViewModel getPaymentMethodViewModel();

    VerificationViewModel getVerificationViewModel();

    WalletViewModel getWalletViewModel();
}