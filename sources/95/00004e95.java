package com.stripe.android.googlepaylauncher.injection;

import android.content.Context;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel;
import h00.a;
import java.util.Set;

/* loaded from: classes6.dex */
public interface GooglePayPaymentMethodLauncherViewModelFactoryComponent {

    /* loaded from: classes6.dex */
    public interface Builder {
        GooglePayPaymentMethodLauncherViewModelFactoryComponent build();

        Builder context(Context context);

        Builder enableLogging(boolean z11);

        Builder googlePayConfig(GooglePayPaymentMethodLauncher.Config config);

        Builder productUsage(Set<String> set);

        Builder publishableKeyProvider(a<String> aVar);

        Builder stripeAccountIdProvider(a<String> aVar);
    }

    void inject(GooglePayPaymentMethodLauncherViewModel.Factory factory);
}