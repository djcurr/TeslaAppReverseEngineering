package com.stripe.android.paymentsheet.injection;

import androidx.lifecycle.l0;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;

/* loaded from: classes6.dex */
public interface PaymentSheetViewModelSubcomponent {

    /* loaded from: classes6.dex */
    public interface Builder {
        PaymentSheetViewModelSubcomponent build();

        Builder paymentSheetViewModelModule(PaymentSheetViewModelModule paymentSheetViewModelModule);

        Builder savedStateHandle(l0 l0Var);
    }

    PaymentSheetViewModel getViewModel();
}