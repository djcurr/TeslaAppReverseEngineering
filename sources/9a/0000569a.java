package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.forms.FormViewModel;
import com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments;

/* loaded from: classes6.dex */
public interface FormViewModelSubcomponent {

    /* loaded from: classes6.dex */
    public interface Builder {
        FormViewModelSubcomponent build();

        Builder formFragmentArguments(FormFragmentArguments formFragmentArguments);

        Builder paymentMethodCode(String str);
    }

    FormViewModel getViewModel();
}