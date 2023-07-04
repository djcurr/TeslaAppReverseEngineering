package com.stripe.android.paymentsheet.paymentdatacollection.ach.di;

import androidx.lifecycle.l0;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel;

/* loaded from: classes6.dex */
public interface USBankAccountFormViewModelSubcomponent {

    /* loaded from: classes6.dex */
    public interface Builder {
        USBankAccountFormViewModelSubcomponent build();

        Builder configuration(USBankAccountFormViewModel.Args args);

        Builder savedStateHandle(l0 l0Var);
    }

    USBankAccountFormViewModel getViewModel();
}