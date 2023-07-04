package com.stripe.android.payments.bankaccount.di;

import android.app.Application;
import androidx.lifecycle.l0;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewEffect;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel;
import kotlinx.coroutines.flow.t;

/* loaded from: classes6.dex */
public interface CollectBankAccountComponent {

    /* loaded from: classes6.dex */
    public interface Builder {
        Builder application(Application application);

        CollectBankAccountComponent build();

        Builder configuration(CollectBankAccountContract.Args args);

        Builder savedStateHandle(l0 l0Var);

        Builder viewEffect(t<CollectBankAccountViewEffect> tVar);
    }

    CollectBankAccountViewModel getViewModel();

    void inject(CollectBankAccountViewModel.Factory factory);
}