package com.stripe.android.link.ui.inline;

import com.stripe.android.link.ui.inline.InlineSignupViewModel;
import javax.inject.Provider;
import sw.b;

/* loaded from: classes6.dex */
public final class InlineSignupViewModel_Factory_MembersInjector implements b<InlineSignupViewModel.Factory> {
    private final Provider<InlineSignupViewModel> viewModelProvider;

    public InlineSignupViewModel_Factory_MembersInjector(Provider<InlineSignupViewModel> provider) {
        this.viewModelProvider = provider;
    }

    public static b<InlineSignupViewModel.Factory> create(Provider<InlineSignupViewModel> provider) {
        return new InlineSignupViewModel_Factory_MembersInjector(provider);
    }

    public static void injectViewModel(InlineSignupViewModel.Factory factory, InlineSignupViewModel inlineSignupViewModel) {
        factory.viewModel = inlineSignupViewModel;
    }

    public void injectMembers(InlineSignupViewModel.Factory factory) {
        injectViewModel(factory, this.viewModelProvider.get());
    }
}