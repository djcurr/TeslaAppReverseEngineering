package com.stripe.android.payments.core.injection;

import androidx.lifecycle.l0;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;

/* loaded from: classes6.dex */
public interface PaymentLauncherViewModelSubcomponent {

    /* loaded from: classes6.dex */
    public interface Builder {
        PaymentLauncherViewModelSubcomponent build();

        Builder isPaymentIntent(boolean z11);

        Builder savedStateHandle(l0 l0Var);
    }

    PaymentLauncherViewModel getViewModel();
}