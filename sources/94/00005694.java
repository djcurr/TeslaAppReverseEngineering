package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import android.content.res.Resources;
import com.stripe.android.paymentsheet.forms.FormViewModel;

/* loaded from: classes6.dex */
public interface FormViewModelComponent {

    /* loaded from: classes6.dex */
    public interface Builder {
        FormViewModelComponent build();

        Builder context(Context context);

        Builder resources(Resources resources);
    }

    void inject(FormViewModel.Factory factory);
}