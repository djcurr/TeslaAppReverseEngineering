package com.stripe.android.paymentsheet.paymentdatacollection.ach.di;

import android.app.Application;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel;

/* loaded from: classes6.dex */
public interface USBankAccountFormComponent {

    /* loaded from: classes6.dex */
    public interface Builder {
        Builder application(Application application);

        USBankAccountFormComponent build();

        Builder injectorKey(@InjectorKey String str);
    }

    void inject(USBankAccountFormViewModel.Factory factory);
}