package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import h00.a;
import java.util.Set;

/* loaded from: classes6.dex */
public interface PaymentLauncherViewModelFactoryComponent {

    /* loaded from: classes6.dex */
    public interface Builder {
        PaymentLauncherViewModelFactoryComponent build();

        Builder context(Context context);

        Builder enableLogging(boolean z11);

        Builder productUsage(Set<String> set);

        Builder publishableKeyProvider(a<String> aVar);

        Builder stripeAccountIdProvider(a<String> aVar);
    }

    void inject(PaymentLauncherViewModel.Factory factory);
}