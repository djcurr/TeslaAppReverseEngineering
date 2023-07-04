package com.stripe.android.payments.core.injection;

import android.app.Application;
import androidx.lifecycle.l0;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel;

/* loaded from: classes6.dex */
public interface Stripe3ds2TransactionViewModelSubcomponent {

    /* loaded from: classes6.dex */
    public interface Builder {
        Builder application(Application application);

        Builder args(Stripe3ds2TransactionContract.Args args);

        Stripe3ds2TransactionViewModelSubcomponent build();

        Builder savedStateHandle(l0 l0Var);
    }

    Stripe3ds2TransactionViewModel getViewModel();
}