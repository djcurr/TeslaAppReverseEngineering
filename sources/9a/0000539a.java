package com.stripe.android.payments.bankaccount;

import androidx.activity.result.d;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class StripeCollectBankAccountLauncher implements CollectBankAccountLauncher {
    private final d<CollectBankAccountContract.Args> hostActivityLauncher;

    public StripeCollectBankAccountLauncher(d<CollectBankAccountContract.Args> hostActivityLauncher) {
        s.g(hostActivityLauncher, "hostActivityLauncher");
        this.hostActivityLauncher = hostActivityLauncher;
    }

    @Override // com.stripe.android.payments.bankaccount.CollectBankAccountLauncher
    public void presentWithPaymentIntent(String publishableKey, String clientSecret, CollectBankAccountConfiguration configuration) {
        s.g(publishableKey, "publishableKey");
        s.g(clientSecret, "clientSecret");
        s.g(configuration, "configuration");
        this.hostActivityLauncher.b(new CollectBankAccountContract.Args.ForPaymentIntent(publishableKey, clientSecret, configuration, true));
    }

    @Override // com.stripe.android.payments.bankaccount.CollectBankAccountLauncher
    public void presentWithSetupIntent(String publishableKey, String clientSecret, CollectBankAccountConfiguration configuration) {
        s.g(publishableKey, "publishableKey");
        s.g(clientSecret, "clientSecret");
        s.g(configuration, "configuration");
        this.hostActivityLauncher.b(new CollectBankAccountContract.Args.ForSetupIntent(publishableKey, clientSecret, configuration, true));
    }
}