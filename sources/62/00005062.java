package com.stripe.android.link.ui.verification;

import com.stripe.android.link.injection.SignedInViewModelSubcomponent;
import com.stripe.android.link.ui.verification.VerificationViewModel;
import javax.inject.Provider;
import sw.b;

/* loaded from: classes6.dex */
public final class VerificationViewModel_Factory_MembersInjector implements b<VerificationViewModel.Factory> {
    private final Provider<SignedInViewModelSubcomponent.Builder> subComponentBuilderProvider;

    public VerificationViewModel_Factory_MembersInjector(Provider<SignedInViewModelSubcomponent.Builder> provider) {
        this.subComponentBuilderProvider = provider;
    }

    public static b<VerificationViewModel.Factory> create(Provider<SignedInViewModelSubcomponent.Builder> provider) {
        return new VerificationViewModel_Factory_MembersInjector(provider);
    }

    public static void injectSubComponentBuilderProvider(VerificationViewModel.Factory factory, Provider<SignedInViewModelSubcomponent.Builder> provider) {
        factory.subComponentBuilderProvider = provider;
    }

    public void injectMembers(VerificationViewModel.Factory factory) {
        injectSubComponentBuilderProvider(factory, this.subComponentBuilderProvider);
    }
}