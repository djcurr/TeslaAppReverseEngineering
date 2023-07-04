package com.stripe.android.financialconnections.di;

import android.app.Application;
import androidx.lifecycle.l0;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;

/* loaded from: classes2.dex */
public interface FinancialConnectionsSheetComponent {

    /* loaded from: classes2.dex */
    public interface Builder {
        Builder application(Application application);

        FinancialConnectionsSheetComponent build();

        Builder internalArgs(FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs);

        Builder savedStateHandle(l0 l0Var);
    }

    FinancialConnectionsSheetViewModel getViewModel();

    void inject(FinancialConnectionsSheetViewModel.Factory factory);
}