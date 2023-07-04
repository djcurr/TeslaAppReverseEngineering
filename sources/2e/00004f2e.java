package com.stripe.android.link.injection;

import android.content.Context;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkActivityViewModel;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.ui.cardedit.CardEditViewModel;
import com.stripe.android.link.ui.inline.InlineSignupViewModel;
import com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel;
import com.stripe.android.link.ui.signup.SignUpViewModel;
import com.stripe.android.link.ui.verification.VerificationViewModel;
import com.stripe.android.link.ui.wallet.WalletViewModel;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
import h00.a;
import java.util.Set;
import zz.g;

/* loaded from: classes6.dex */
public abstract class LinkPaymentLauncherComponent {

    /* loaded from: classes6.dex */
    public interface Builder {
        Builder analyticsRequestExecutor(AnalyticsRequestExecutor analyticsRequestExecutor);

        Builder analyticsRequestFactory(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory);

        LinkPaymentLauncherComponent build();

        Builder context(Context context);

        Builder customerEmail(String str);

        Builder enableLogging(boolean z11);

        Builder ioContext(@IOContext g gVar);

        Builder merchantName(String str);

        Builder productUsage(Set<String> set);

        Builder publishableKeyProvider(a<String> aVar);

        Builder resourceRepository(ResourceRepository resourceRepository);

        Builder starterArgs(LinkActivityContract.Args args);

        Builder stripeAccountIdProvider(a<String> aVar);

        Builder stripeRepository(StripeRepository stripeRepository);

        Builder uiContext(@UIContext g gVar);
    }

    public abstract LinkAccountManager getLinkAccountManager();

    public abstract void inject(LinkActivityViewModel.Factory factory);

    public abstract void inject(CardEditViewModel.Factory factory);

    public abstract void inject(InlineSignupViewModel.Factory factory);

    public abstract void inject(PaymentMethodViewModel.Factory factory);

    public abstract void inject(SignUpViewModel.Factory factory);

    public abstract void inject(VerificationViewModel.Factory factory);

    public abstract void inject(WalletViewModel.Factory factory);
}