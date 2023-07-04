package com.stripe.android.link.injection;

import com.stripe.android.link.ui.signup.SignUpViewModel;

/* loaded from: classes6.dex */
public interface SignUpViewModelSubcomponent {

    /* loaded from: classes6.dex */
    public interface Builder {
        SignUpViewModelSubcomponent build();

        Builder prefilledEmail(String str);
    }

    SignUpViewModel getSignUpViewModel();
}