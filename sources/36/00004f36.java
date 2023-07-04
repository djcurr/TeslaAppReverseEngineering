package com.stripe.android.link.injection;

import android.content.Context;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkActivityViewModel;
import com.stripe.android.link.ui.cardedit.CardEditViewModel;
import com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel;
import com.stripe.android.link.ui.signup.SignUpViewModel;
import com.stripe.android.link.ui.verification.VerificationViewModel;
import com.stripe.android.link.ui.wallet.WalletViewModel;
import h00.a;
import java.util.Set;

/* loaded from: classes6.dex */
public interface LinkViewModelFactoryComponent {

    /* loaded from: classes6.dex */
    public interface Builder {
        LinkViewModelFactoryComponent build();

        Builder context(Context context);

        Builder enableLogging(boolean z11);

        Builder productUsage(Set<String> set);

        Builder publishableKeyProvider(a<String> aVar);

        Builder starterArgs(LinkActivityContract.Args args);

        Builder stripeAccountIdProvider(a<String> aVar);
    }

    void inject(LinkActivityViewModel.Factory factory);

    void inject(CardEditViewModel.Factory factory);

    void inject(PaymentMethodViewModel.Factory factory);

    void inject(SignUpViewModel.Factory factory);

    void inject(VerificationViewModel.Factory factory);

    void inject(WalletViewModel.Factory factory);
}