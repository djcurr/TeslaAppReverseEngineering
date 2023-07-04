package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.forms.FormViewModel;

/* loaded from: classes6.dex */
public interface PaymentSheetLauncherComponent {

    /* loaded from: classes6.dex */
    public interface Builder {
        Builder application(Application application);

        PaymentSheetLauncherComponent build();

        Builder injectorKey(@InjectorKey String str);
    }

    void inject(PaymentSheetViewModel.Factory factory);

    void inject(FormViewModel.Factory factory);
}