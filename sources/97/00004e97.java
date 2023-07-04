package com.stripe.android.googlepaylauncher.injection;

import androidx.lifecycle.l0;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel;

/* loaded from: classes6.dex */
public interface GooglePayPaymentMethodLauncherViewModelSubcomponent {

    /* loaded from: classes6.dex */
    public interface Builder {
        Builder args(GooglePayPaymentMethodLauncherContract.Args args);

        GooglePayPaymentMethodLauncherViewModelSubcomponent build();

        Builder savedStateHandle(l0 l0Var);
    }

    GooglePayPaymentMethodLauncherViewModel getViewModel();
}