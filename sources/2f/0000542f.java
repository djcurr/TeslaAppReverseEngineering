package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.stripe.android.payments.DefaultReturnUrl;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class AuthenticationModule_Companion_ProvideDefaultReturnUrlFactory implements e<DefaultReturnUrl> {
    private final Provider<Context> contextProvider;

    public AuthenticationModule_Companion_ProvideDefaultReturnUrlFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static AuthenticationModule_Companion_ProvideDefaultReturnUrlFactory create(Provider<Context> provider) {
        return new AuthenticationModule_Companion_ProvideDefaultReturnUrlFactory(provider);
    }

    public static DefaultReturnUrl provideDefaultReturnUrl(Context context) {
        return (DefaultReturnUrl) h.e(AuthenticationModule.Companion.provideDefaultReturnUrl(context));
    }

    @Override // javax.inject.Provider
    public DefaultReturnUrl get() {
        return provideDefaultReturnUrl(this.contextProvider.get());
    }
}