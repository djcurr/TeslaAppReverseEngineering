package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import androidx.lifecycle.l0;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;

/* loaded from: classes6.dex */
public interface PaymentOptionsViewModelSubcomponent {

    /* loaded from: classes6.dex */
    public interface Builder {
        Builder application(Application application);

        Builder args(PaymentOptionContract.Args args);

        PaymentOptionsViewModelSubcomponent build();

        Builder savedStateHandle(l0 l0Var);
    }

    PaymentOptionsViewModel getViewModel();
}