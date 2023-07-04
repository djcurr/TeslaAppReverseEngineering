package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import java.util.Set;

/* loaded from: classes6.dex */
public interface PaymentOptionsViewModelFactoryComponent {

    /* loaded from: classes6.dex */
    public interface Builder {
        PaymentOptionsViewModelFactoryComponent build();

        Builder context(Context context);

        Builder productUsage(Set<String> set);
    }

    void inject(PaymentOptionsViewModel.Factory factory);
}